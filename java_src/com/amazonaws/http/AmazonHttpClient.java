package com.amazonaws.http;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.Response;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.Signer;
import com.amazonaws.handlers.CredentialsRequestHandler;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.TimingInfo;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
/* loaded from: classes2.dex */
public class AmazonHttpClient {
    private static final String HEADER_SDK_RETRY_INFO = "aws-sdk-retry";
    private static final String HEADER_SDK_TRANSACTION_ID = "aws-sdk-invocation-id";
    private static final String HEADER_USER_AGENT = "User-Agent";
    private static final int HTTP_STATUS_MULTIPLE_CHOICES = 300;
    private static final int HTTP_STATUS_OK = 200;
    private static final int HTTP_STATUS_REQ_TOO_LONG = 413;
    private static final int HTTP_STATUS_SERVICE_UNAVAILABLE = 503;
    private static final int HTTP_STATUS_TEMP_REDIRECT = 307;
    private static final int TIME_MILLISEC = 1000;
    final ClientConfiguration config;
    final HttpClient httpClient;
    private final HttpRequestFactory requestFactory;
    private final RequestMetricCollector requestMetricCollector;
    private static final Log REQUEST_LOG = LogFactory.getLog("com.amazonaws.request");
    static final Log log = LogFactory.getLog(AmazonHttpClient.class);

    public AmazonHttpClient(ClientConfiguration clientConfiguration) {
        this(clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    public static String createUserAgentString(String str, String str2) {
        if (str.contains(str2)) {
            return str;
        }
        return str.trim() + " " + str2.trim();
    }

    private String getServerDateFromException(String str) {
        int indexOf;
        int indexOf2 = str.indexOf("(");
        if (str.contains(" + 15")) {
            indexOf = str.indexOf(" + 15");
        } else {
            indexOf = str.indexOf(" - 15");
        }
        return str.substring(indexOf2 + 1, indexOf);
    }

    private <T extends Throwable> T handleUnexpectedFailure(T t, AWSRequestMetrics aWSRequestMetrics) {
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.Exception;
        aWSRequestMetrics.incrementCounter(field);
        aWSRequestMetrics.addProperty(field, t);
        return t;
    }

    private boolean isRequestSuccessful(HttpResponse httpResponse) {
        int statusCode = httpResponse.getStatusCode();
        return statusCode >= 200 && statusCode < HTTP_STATUS_MULTIPLE_CHOICES;
    }

    private static boolean isTemporaryRedirect(HttpResponse httpResponse) {
        int statusCode = httpResponse.getStatusCode();
        String str = httpResponse.getHeaders().get(HttpHeader.LOCATION);
        if (statusCode == 307 && str != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }

    private long pauseBeforeNextRetry(AmazonWebServiceRequest amazonWebServiceRequest, AmazonClientException amazonClientException, int i, RetryPolicy retryPolicy) {
        int i2 = (i - 1) - 1;
        long delayBeforeNextRetry = retryPolicy.getBackoffStrategy().delayBeforeNextRetry(amazonWebServiceRequest, amazonClientException, i2);
        Log log2 = log;
        if (log2.isDebugEnabled()) {
            log2.debug("Retriable error detected, will retry in " + delayBeforeNextRetry + "ms, attempt number: " + i2);
        }
        try {
            Thread.sleep(delayBeforeNextRetry);
            return delayBeforeNextRetry;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AmazonClientException(e.getMessage(), e);
        }
    }

    private boolean shouldRetry(AmazonWebServiceRequest amazonWebServiceRequest, InputStream inputStream, AmazonClientException amazonClientException, int i, RetryPolicy retryPolicy) {
        int i2 = i - 1;
        int maxErrorRetry = this.config.getMaxErrorRetry();
        if (maxErrorRetry < 0 || !retryPolicy.isMaxErrorRetryInClientConfigHonored()) {
            maxErrorRetry = retryPolicy.getMaxErrorRetry();
        }
        if (i2 >= maxErrorRetry) {
            return false;
        }
        if (inputStream != null && !inputStream.markSupported()) {
            Log log2 = log;
            if (log2.isDebugEnabled()) {
                log2.debug("Content not repeatable");
            }
            return false;
        }
        return retryPolicy.getRetryCondition().shouldRetry(amazonWebServiceRequest, amazonClientException, i2);
    }

    public void afterError(Request<?> request, Response<?> response, List<RequestHandler2> list, AmazonClientException amazonClientException) {
        for (RequestHandler2 requestHandler2 : list) {
            requestHandler2.afterError(request, response, amazonClientException);
        }
    }

    public <T> void afterResponse(Request<?> request, List<RequestHandler2> list, Response<T> response, TimingInfo timingInfo) {
        for (RequestHandler2 requestHandler2 : list) {
            requestHandler2.afterResponse(request, response);
        }
    }

    public <T> Response<T> execute(Request<?> request, HttpResponseHandler<AmazonWebServiceResponse<T>> httpResponseHandler, HttpResponseHandler<AmazonServiceException> httpResponseHandler2, ExecutionContext executionContext) {
        Response<T> response;
        if (executionContext != null) {
            List<RequestHandler2> requestHandler2s = requestHandler2s(request, executionContext);
            AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
            try {
                response = executeHelper(request, httpResponseHandler, httpResponseHandler2, executionContext);
                try {
                    afterResponse(request, requestHandler2s, response, awsRequestMetrics.getTimingInfo().endTiming());
                    return response;
                } catch (AmazonClientException e) {
                    e = e;
                    afterError(request, response, requestHandler2s, e);
                    throw e;
                }
            } catch (AmazonClientException e2) {
                e = e2;
                response = null;
            }
        } else {
            throw new AmazonClientException("Internal SDK Error: No execution context parameter specified.");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:17|(7:247|248|249|250|252|253|(1:257))(1:19)|(9:20|21|(2:23|24)(1:241)|(5:27|28|29|30|31)|79|(1:81)|82|(4:83|84|85|86)|(6:88|89|(10:181|182|183|184|185|186|187|189|(3:192|193|(1:195))|191)(8:91|92|93|(6:161|162|163|164|165|166)(10:95|96|97|98|99|100|101|102|103|(4:105|(1:107)|108|109)(2:121|123))|(3:112|113|(1:115))|119|120|62)|176|177|(5:50|(3:53|54|(1:56))|60|61|62)(2:63|64)))|41|42|43|44|45|(1:47)|48) */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0435, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0442, code lost:
        r6.getRawContent().close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03af A[Catch: all -> 0x0435, TRY_ENTER, TryCatch #9 {all -> 0x0435, blocks: (B:208:0x03a5, B:211:0x03af, B:212:0x03c5, B:214:0x0408, B:225:0x0434, B:174:0x0356, B:175:0x035b), top: B:241:0x03a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0408 A[Catch: all -> 0x0435, TRY_LEAVE, TryCatch #9 {all -> 0x0435, blocks: (B:208:0x03a5, B:211:0x03af, B:212:0x03c5, B:214:0x0408, B:225:0x0434, B:174:0x0356, B:175:0x035b), top: B:241:0x03a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x043a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0442 A[Catch: IOException -> 0x044a, TRY_LEAVE, TryCatch #33 {IOException -> 0x044a, blocks: (B:230:0x043c, B:232:0x0442), top: B:256:0x043c }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0434 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6, types: [long] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Response<T> executeHelper(Request<?> request, HttpResponseHandler<AmazonWebServiceResponse<T>> httpResponseHandler, HttpResponseHandler<AmazonServiceException> httpResponseHandler2, ExecutionContext executionContext) {
        Throwable th;
        HttpResponse httpResponse;
        boolean z;
        Signer signer;
        long pauseBeforeNextRetry;
        HttpResponse httpResponse2;
        int i;
        LinkedHashMap linkedHashMap;
        Log log2;
        AmazonClientException amazonClientException;
        HttpRequest createHttpRequest;
        HttpRequest httpRequest;
        AWSRequestMetrics.Field field;
        HttpResponse execute;
        HttpResponse httpResponse3;
        HttpResponse httpResponse4;
        HttpResponse httpResponse5;
        boolean needsConnectionLeftOpen;
        AmazonClientException amazonClientException2;
        HttpResponse httpResponse6;
        AmazonServiceException handleErrorResponse;
        ExecutionContext executionContext2 = executionContext;
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.addProperty(AWSRequestMetrics.Field.ServiceName, request.getServiceName());
        awsRequestMetrics.addProperty(AWSRequestMetrics.Field.ServiceEndpoint, request.getEndpoint());
        setUserAgent(request);
        request.addHeader(HEADER_SDK_TRANSACTION_ID, UUID.randomUUID().toString());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(request.getParameters());
        HashMap hashMap = new HashMap(request.getHeaders());
        InputStream content = request.getContent();
        if (content != null && content.markSupported()) {
            content.mark(-1);
        }
        AWSCredentials credentials = executionContext.getCredentials();
        int i2 = 0;
        long j = 0;
        AmazonClientException amazonClientException3 = null;
        Signer signer2 = null;
        HttpResponse httpResponse7 = null;
        URI uri = null;
        HttpRequest httpRequest2 = null;
        boolean z2 = false;
        while (true) {
            HttpResponse httpResponse8 = httpResponse7;
            int i3 = i2 + 1;
            boolean z3 = z2;
            long j2 = j;
            ?? r1 = i3;
            awsRequestMetrics.setCounter(AWSRequestMetrics.Field.RequestCount, (long) r1);
            if (i3 > 1) {
                request.setParameters(linkedHashMap2);
                request.setHeaders(hashMap);
                request.setContent(content);
            }
            if (uri != null && request.getEndpoint() == null && request.getResourcePath() == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(uri.getScheme());
                sb.append("://");
                r1 = uri.getAuthority();
                sb.append((String) r1);
                request.setEndpoint(URI.create(sb.toString()));
                request.setResourcePath(uri.getPath());
            }
            try {
                if (i3 > 1) {
                    try {
                        try {
                            try {
                                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RetryPauseTime;
                                awsRequestMetrics.startEvent(field2);
                                try {
                                    pauseBeforeNextRetry = pauseBeforeNextRetry(request.getOriginalRequest(), amazonClientException3, i3, this.config.getRetryPolicy());
                                    try {
                                        awsRequestMetrics.endEvent(field2);
                                        InputStream content2 = request.getContent();
                                        if (content2 != null && content2.markSupported()) {
                                            content2.reset();
                                        }
                                    } catch (IOException e) {
                                        e = e;
                                        j2 = pauseBeforeNextRetry;
                                        executionContext2 = "Cannot close the response content.";
                                        signer = signer2;
                                        i = i3;
                                        linkedHashMap = linkedHashMap2;
                                        log2 = log;
                                        if (log2.isDebugEnabled()) {
                                        }
                                        AWSRequestMetrics.Field field3 = AWSRequestMetrics.Field.Exception;
                                        awsRequestMetrics.incrementCounter(field3);
                                        awsRequestMetrics.addProperty(field3, e);
                                        awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, (Object) null);
                                        amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                                        if (!shouldRetry(request.getOriginalRequest(), httpRequest2.getContent(), amazonClientException, i, this.config.getRetryPolicy())) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                    awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RetryPauseTime);
                                    throw th2;
                                    break;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                executionContext2 = "Cannot close the response content.";
                                httpResponse2 = httpResponse8;
                                z = z3;
                                httpResponse = httpResponse2;
                                if (!z) {
                                    try {
                                        if (httpResponse.getRawContent() != null) {
                                        }
                                    } catch (IOException e2) {
                                        log.warn(executionContext2, e2);
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e3) {
                            e = e3;
                        }
                    } catch (Error e4) {
                        e = e4;
                        throw ((Error) handleUnexpectedFailure(e, awsRequestMetrics));
                    } catch (RuntimeException e5) {
                        e = e5;
                        throw ((RuntimeException) handleUnexpectedFailure(e, awsRequestMetrics));
                    }
                } else {
                    pauseBeforeNextRetry = j2;
                }
                try {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i3 - 1);
                        sb2.append("/");
                        sb2.append(pauseBeforeNextRetry);
                        request.addHeader(HEADER_SDK_RETRY_INFO, sb2.toString());
                        signer = signer2 == null ? executionContext2.getSignerByURI(request.getEndpoint()) : signer2;
                        if (signer != null && credentials != null) {
                            try {
                                AWSRequestMetrics.Field field4 = AWSRequestMetrics.Field.RequestSigningTime;
                                awsRequestMetrics.startEvent(field4);
                                try {
                                    signer.sign(request, credentials);
                                    awsRequestMetrics.endEvent(field4);
                                } catch (Throwable th4) {
                                    awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestSigningTime);
                                    throw th4;
                                    break;
                                }
                            } catch (IOException e6) {
                                e = e6;
                                j2 = pauseBeforeNextRetry;
                                executionContext2 = "Cannot close the response content.";
                            }
                        }
                        Log log3 = REQUEST_LOG;
                        if (log3.isDebugEnabled()) {
                            log3.debug("Sending Request: " + request.toString());
                        }
                        createHttpRequest = this.requestFactory.createHttpRequest(request, this.config, executionContext2);
                        try {
                            field = AWSRequestMetrics.Field.HttpRequestTime;
                            awsRequestMetrics.startEvent(field);
                            try {
                                execute = this.httpClient.execute(createHttpRequest);
                            } catch (Throwable th5) {
                                j2 = pauseBeforeNextRetry;
                                executionContext2 = "Cannot close the response content.";
                                httpRequest = createHttpRequest;
                                i = i3;
                                linkedHashMap = linkedHashMap2;
                                try {
                                    awsRequestMetrics.endEvent(AWSRequestMetrics.Field.HttpRequestTime);
                                    throw th5;
                                    break;
                                } catch (IOException e7) {
                                    e = e7;
                                    httpRequest2 = httpRequest;
                                    log2 = log;
                                    if (log2.isDebugEnabled()) {
                                    }
                                    AWSRequestMetrics.Field field32 = AWSRequestMetrics.Field.Exception;
                                    awsRequestMetrics.incrementCounter(field32);
                                    awsRequestMetrics.addProperty(field32, e);
                                    awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, (Object) null);
                                    amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                                    if (!shouldRetry(request.getOriginalRequest(), httpRequest2.getContent(), amazonClientException, i, this.config.getRetryPolicy())) {
                                    }
                                } catch (Error e8) {
                                    e = e8;
                                    throw ((Error) handleUnexpectedFailure(e, awsRequestMetrics));
                                } catch (RuntimeException e9) {
                                    e = e9;
                                    throw ((RuntimeException) handleUnexpectedFailure(e, awsRequestMetrics));
                                }
                            }
                        } catch (IOException e10) {
                            e = e10;
                            j2 = pauseBeforeNextRetry;
                            executionContext2 = "Cannot close the response content.";
                            httpRequest = createHttpRequest;
                            i = i3;
                            linkedHashMap = linkedHashMap2;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        j2 = pauseBeforeNextRetry;
                        executionContext2 = "Cannot close the response content.";
                        i = i3;
                        linkedHashMap = linkedHashMap2;
                        signer = signer2;
                    }
                    try {
                        try {
                            awsRequestMetrics.endEvent(field);
                        } catch (IOException e12) {
                            e = e12;
                            j2 = pauseBeforeNextRetry;
                        }
                        if (isRequestSuccessful(execute)) {
                            try {
                                try {
                                    j2 = pauseBeforeNextRetry;
                                    awsRequestMetrics.addProperty(AWSRequestMetrics.Field.StatusCode, Integer.valueOf(execute.getStatusCode()));
                                    needsConnectionLeftOpen = httpResponseHandler.needsConnectionLeftOpen();
                                } catch (IOException e13) {
                                    e = e13;
                                    j2 = pauseBeforeNextRetry;
                                }
                            } catch (Error e14) {
                                e = e14;
                                throw ((Error) handleUnexpectedFailure(e, awsRequestMetrics));
                            } catch (RuntimeException e15) {
                                e = e15;
                                throw ((RuntimeException) handleUnexpectedFailure(e, awsRequestMetrics));
                            } catch (Throwable th6) {
                                th = th6;
                                executionContext2 = "Cannot close the response content.";
                                httpResponse2 = execute;
                                z = z3;
                                httpResponse = httpResponse2;
                                if (!z) {
                                }
                                throw th;
                            }
                            try {
                                Response<T> response = new Response<>(handleResponse(request, httpResponseHandler, execute, executionContext2), execute);
                                if (!needsConnectionLeftOpen) {
                                    try {
                                        if (execute.getRawContent() != null) {
                                            execute.getRawContent().close();
                                        }
                                    } catch (IOException e16) {
                                        log.warn("Cannot close the response content.", e16);
                                    }
                                }
                                return response;
                            } catch (IOException e17) {
                                e = e17;
                                z3 = needsConnectionLeftOpen;
                            } catch (Error e18) {
                                e = e18;
                                throw ((Error) handleUnexpectedFailure(e, awsRequestMetrics));
                            } catch (RuntimeException e19) {
                                e = e19;
                                throw ((RuntimeException) handleUnexpectedFailure(e, awsRequestMetrics));
                            } catch (Throwable th7) {
                                th = th7;
                                executionContext2 = "Cannot close the response content.";
                                httpResponse = execute;
                                z = needsConnectionLeftOpen;
                                if (!z) {
                                }
                                throw th;
                            }
                        } else {
                            j2 = pauseBeforeNextRetry;
                            try {
                                if (isTemporaryRedirect(execute)) {
                                    try {
                                        String str = execute.getHeaders().get(HttpHeader.LOCATION);
                                        Log log4 = log;
                                        StringBuilder sb3 = new StringBuilder();
                                        try {
                                            sb3.append("Redirecting to: ");
                                            sb3.append(str);
                                            log4.debug(sb3.toString());
                                            uri = URI.create(str);
                                            request.setEndpoint(null);
                                            request.setResourcePath(null);
                                            awsRequestMetrics.addProperty(AWSRequestMetrics.Field.StatusCode, Integer.valueOf(execute.getStatusCode()));
                                            awsRequestMetrics.addProperty(AWSRequestMetrics.Field.RedirectLocation, str);
                                            awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, (Object) null);
                                            httpRequest = createHttpRequest;
                                            i = i3;
                                            z2 = z3;
                                            executionContext2 = "Cannot close the response content.";
                                            amazonClientException2 = null;
                                            linkedHashMap = linkedHashMap2;
                                            httpResponse6 = execute;
                                        } catch (IOException e20) {
                                            e = e20;
                                            httpResponse8 = execute;
                                            httpRequest2 = createHttpRequest;
                                            i = i3;
                                            executionContext2 = "Cannot close the response content.";
                                        } catch (Error e21) {
                                            e = e21;
                                            throw ((Error) handleUnexpectedFailure(e, awsRequestMetrics));
                                        } catch (RuntimeException e22) {
                                            e = e22;
                                            throw ((RuntimeException) handleUnexpectedFailure(e, awsRequestMetrics));
                                        } catch (Throwable th8) {
                                            th = th8;
                                            httpResponse = execute;
                                            z = z3;
                                            executionContext2 = "Cannot close the response content.";
                                            if (!z) {
                                            }
                                            throw th;
                                        }
                                    } catch (IOException e23) {
                                        e = e23;
                                    }
                                } else {
                                    try {
                                        boolean needsConnectionLeftOpen2 = httpResponseHandler2.needsConnectionLeftOpen();
                                        try {
                                            handleErrorResponse = handleErrorResponse(request, httpResponseHandler2, execute);
                                            awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, handleErrorResponse.getRequestId());
                                            awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSErrorCode, handleErrorResponse.getErrorCode());
                                            awsRequestMetrics.addProperty(AWSRequestMetrics.Field.StatusCode, Integer.valueOf(handleErrorResponse.getStatusCode()));
                                            executionContext2 = "Cannot close the response content.";
                                            linkedHashMap = linkedHashMap2;
                                            httpResponse6 = execute;
                                            httpRequest = createHttpRequest;
                                            i = i3;
                                        } catch (IOException e24) {
                                            e = e24;
                                            httpRequest = createHttpRequest;
                                            i = i3;
                                            executionContext2 = "Cannot close the response content.";
                                            linkedHashMap = linkedHashMap2;
                                            httpResponse6 = execute;
                                        } catch (Error e25) {
                                            e = e25;
                                            httpResponse6 = execute;
                                        } catch (RuntimeException e26) {
                                            e = e26;
                                            httpResponse6 = execute;
                                        } catch (Throwable th9) {
                                            th = th9;
                                            httpResponse6 = execute;
                                            executionContext2 = "Cannot close the response content.";
                                        }
                                        try {
                                            if (shouldRetry(request.getOriginalRequest(), createHttpRequest.getContent(), handleErrorResponse, i3, this.config.getRetryPolicy())) {
                                                if (RetryUtils.isClockSkewError(handleErrorResponse)) {
                                                    SDKGlobalConfiguration.setGlobalTimeOffset(parseClockSkewOffset(httpResponse6, handleErrorResponse));
                                                }
                                                resetRequestAfterError(request, handleErrorResponse);
                                                amazonClientException2 = handleErrorResponse;
                                                z2 = needsConnectionLeftOpen2;
                                            } else {
                                                throw handleErrorResponse;
                                                break;
                                            }
                                        } catch (IOException e27) {
                                            e = e27;
                                            httpResponse8 = httpResponse6;
                                            z3 = needsConnectionLeftOpen2;
                                            httpRequest2 = httpRequest;
                                            log2 = log;
                                            if (log2.isDebugEnabled()) {
                                            }
                                            AWSRequestMetrics.Field field322 = AWSRequestMetrics.Field.Exception;
                                            awsRequestMetrics.incrementCounter(field322);
                                            awsRequestMetrics.addProperty(field322, e);
                                            awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, (Object) null);
                                            amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                                            if (!shouldRetry(request.getOriginalRequest(), httpRequest2.getContent(), amazonClientException, i, this.config.getRetryPolicy())) {
                                            }
                                        } catch (Error e28) {
                                            e = e28;
                                            throw ((Error) handleUnexpectedFailure(e, awsRequestMetrics));
                                        } catch (RuntimeException e29) {
                                            e = e29;
                                            throw ((RuntimeException) handleUnexpectedFailure(e, awsRequestMetrics));
                                        } catch (Throwable th10) {
                                            th = th10;
                                            th = th;
                                            httpResponse = httpResponse6;
                                            z = needsConnectionLeftOpen2;
                                            if (!z) {
                                            }
                                            throw th;
                                        }
                                    } catch (IOException e30) {
                                        e = e30;
                                        httpRequest = createHttpRequest;
                                        i = i3;
                                        executionContext2 = "Cannot close the response content.";
                                        linkedHashMap = linkedHashMap2;
                                        httpResponse8 = execute;
                                        httpRequest2 = httpRequest;
                                        log2 = log;
                                        if (log2.isDebugEnabled()) {
                                        }
                                        AWSRequestMetrics.Field field3222 = AWSRequestMetrics.Field.Exception;
                                        awsRequestMetrics.incrementCounter(field3222);
                                        awsRequestMetrics.addProperty(field3222, e);
                                        awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, (Object) null);
                                        amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                                        if (!shouldRetry(request.getOriginalRequest(), httpRequest2.getContent(), amazonClientException, i, this.config.getRetryPolicy())) {
                                        }
                                    } catch (Error e31) {
                                        e = e31;
                                        httpResponse5 = execute;
                                        throw ((Error) handleUnexpectedFailure(e, awsRequestMetrics));
                                    } catch (RuntimeException e32) {
                                        e = e32;
                                        httpResponse4 = execute;
                                        throw ((RuntimeException) handleUnexpectedFailure(e, awsRequestMetrics));
                                    } catch (Throwable th11) {
                                        th = th11;
                                        httpResponse3 = execute;
                                        executionContext2 = "Cannot close the response content.";
                                        th = th;
                                        httpResponse2 = httpResponse3;
                                        z = z3;
                                        httpResponse = httpResponse2;
                                        if (!z) {
                                        }
                                        throw th;
                                    }
                                }
                                if (!z2 && httpResponse6 != null) {
                                    try {
                                        if (httpResponse6.getRawContent() != null) {
                                            httpResponse6.getRawContent().close();
                                        }
                                    } catch (IOException e33) {
                                        log.warn(executionContext2, e33);
                                    }
                                }
                                amazonClientException3 = amazonClientException2;
                                httpResponse7 = httpResponse6;
                                signer2 = signer;
                                j = j2;
                                httpRequest2 = httpRequest;
                            } catch (IOException e34) {
                                e = e34;
                                executionContext2 = "Cannot close the response content.";
                                httpRequest = createHttpRequest;
                                i = i3;
                                linkedHashMap = linkedHashMap2;
                                httpResponse8 = execute;
                                httpRequest2 = httpRequest;
                                log2 = log;
                                if (log2.isDebugEnabled()) {
                                }
                                AWSRequestMetrics.Field field32222 = AWSRequestMetrics.Field.Exception;
                                awsRequestMetrics.incrementCounter(field32222);
                                awsRequestMetrics.addProperty(field32222, e);
                                awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, (Object) null);
                                amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                                if (!shouldRetry(request.getOriginalRequest(), httpRequest2.getContent(), amazonClientException, i, this.config.getRetryPolicy())) {
                                }
                            }
                            executionContext2 = executionContext;
                            linkedHashMap2 = linkedHashMap;
                            i2 = i;
                        }
                        e = e23;
                        executionContext2 = "Cannot close the response content.";
                        httpResponse8 = execute;
                        httpRequest2 = createHttpRequest;
                        if (!shouldRetry(request.getOriginalRequest(), httpRequest2.getContent(), amazonClientException, i, this.config.getRetryPolicy())) {
                            resetRequestAfterError(request, e);
                            if (!z3 && httpResponse8 != null) {
                                try {
                                    if (httpResponse8.getRawContent() != null) {
                                        httpResponse8.getRawContent().close();
                                    }
                                } catch (IOException e35) {
                                    log.warn(executionContext2, e35);
                                }
                            }
                            signer2 = signer;
                            httpResponse7 = httpResponse8;
                            z2 = z3;
                            j = j2;
                            amazonClientException3 = amazonClientException;
                            executionContext2 = executionContext;
                            linkedHashMap2 = linkedHashMap;
                            i2 = i;
                        } else {
                            throw amazonClientException;
                        }
                    } catch (Error e36) {
                        e = e36;
                        httpResponse5 = execute;
                    } catch (RuntimeException e37) {
                        e = e37;
                        httpResponse4 = execute;
                    } catch (Throwable th12) {
                        th = th12;
                        executionContext2 = "Cannot close the response content.";
                        httpResponse3 = execute;
                    }
                } catch (Throwable th13) {
                    Throwable th14 = th13;
                    executionContext2 = "Cannot close the response content.";
                    th = th14;
                    httpResponse2 = httpResponse8;
                    z = z3;
                    httpResponse = httpResponse2;
                    if (!z) {
                    }
                    throw th;
                }
                i = i3;
                linkedHashMap = linkedHashMap2;
                log2 = log;
                if (log2.isDebugEnabled()) {
                    log2.debug("Unable to execute HTTP request: " + e.getMessage(), e);
                }
                AWSRequestMetrics.Field field322222 = AWSRequestMetrics.Field.Exception;
                awsRequestMetrics.incrementCounter(field322222);
                awsRequestMetrics.addProperty(field322222, e);
                awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, (Object) null);
                amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
            } catch (Throwable th15) {
                th = th15;
                z = r1;
                httpResponse = i3;
            }
        }
    }

    public void finalize() throws Throwable {
        shutdown();
        super.finalize();
    }

    public RequestMetricCollector getRequestMetricCollector() {
        return this.requestMetricCollector;
    }

    @Deprecated
    public ResponseMetadata getResponseMetadataForRequest(AmazonWebServiceRequest amazonWebServiceRequest) {
        return null;
    }

    public AmazonServiceException handleErrorResponse(Request<?> request, HttpResponseHandler<AmazonServiceException> httpResponseHandler, HttpResponse httpResponse) throws IOException {
        AmazonServiceException amazonServiceException;
        int statusCode = httpResponse.getStatusCode();
        try {
            amazonServiceException = httpResponseHandler.handle(httpResponse);
            Log log2 = REQUEST_LOG;
            log2.debug("Received error response: " + amazonServiceException.toString());
        } catch (Exception e) {
            if (statusCode == HTTP_STATUS_REQ_TOO_LONG) {
                amazonServiceException = new AmazonServiceException("Request entity too large");
                amazonServiceException.setServiceName(request.getServiceName());
                amazonServiceException.setStatusCode(HTTP_STATUS_REQ_TOO_LONG);
                amazonServiceException.setErrorType(AmazonServiceException.ErrorType.Client);
                amazonServiceException.setErrorCode("Request entity too large");
            } else if (statusCode == HTTP_STATUS_SERVICE_UNAVAILABLE && "Service Unavailable".equalsIgnoreCase(httpResponse.getStatusText())) {
                amazonServiceException = new AmazonServiceException("Service unavailable");
                amazonServiceException.setServiceName(request.getServiceName());
                amazonServiceException.setStatusCode(HTTP_STATUS_SERVICE_UNAVAILABLE);
                amazonServiceException.setErrorType(AmazonServiceException.ErrorType.Service);
                amazonServiceException.setErrorCode("Service unavailable");
            } else if (e instanceof IOException) {
                throw ((IOException) e);
            } else {
                throw new AmazonClientException("Unable to unmarshall error response (" + e.getMessage() + "). Response Code: " + statusCode + ", Response Text: " + httpResponse.getStatusText() + ", Response Headers: " + httpResponse.getHeaders(), e);
            }
        }
        amazonServiceException.setStatusCode(statusCode);
        amazonServiceException.setServiceName(request.getServiceName());
        amazonServiceException.fillInStackTrace();
        return amazonServiceException;
    }

    public <T> T handleResponse(Request<?> request, HttpResponseHandler<AmazonWebServiceResponse<T>> httpResponseHandler, HttpResponse httpResponse, ExecutionContext executionContext) throws IOException {
        try {
            AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
            AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ResponseProcessingTime;
            awsRequestMetrics.startEvent(field);
            try {
                AmazonWebServiceResponse<T> handle = httpResponseHandler.handle(httpResponse);
                awsRequestMetrics.endEvent(field);
                if (handle != null) {
                    Log log2 = REQUEST_LOG;
                    if (log2.isDebugEnabled()) {
                        log2.debug("Received successful response: " + httpResponse.getStatusCode() + ", AWS Request ID: " + handle.getRequestId());
                    }
                    awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, handle.getRequestId());
                    return handle.getResult();
                }
                throw new RuntimeException("Unable to unmarshall response metadata. Response Code: " + httpResponse.getStatusCode() + ", Response Text: " + httpResponse.getStatusText());
            } catch (Throwable th) {
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ResponseProcessingTime);
                throw th;
            }
        } catch (CRC32MismatchException e) {
            throw e;
        } catch (IOException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new AmazonClientException("Unable to unmarshall response (" + e3.getMessage() + "). Response Code: " + httpResponse.getStatusCode() + ", Response Text: " + httpResponse.getStatusText(), e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    public int parseClockSkewOffset(HttpResponse httpResponse, AmazonServiceException amazonServiceException) {
        Date parseRFC822Date;
        Date date = new Date();
        String str = httpResponse.getHeaders().get("Date");
        try {
            if (str != 0) {
                try {
                    if (!str.isEmpty()) {
                        parseRFC822Date = DateUtils.parseRFC822Date(str);
                        str = (int) ((date.getTime() - parseRFC822Date.getTime()) / 1000);
                        return str;
                    }
                } catch (RuntimeException e) {
                    e = e;
                    str = 0;
                    log.warn("Unable to parse clock skew offset from response: " + str, e);
                    return 0;
                }
            }
            parseRFC822Date = DateUtils.parseCompressedISO8601Date(getServerDateFromException(amazonServiceException.getMessage()));
            str = (int) ((date.getTime() - parseRFC822Date.getTime()) / 1000);
            return str;
        } catch (RuntimeException e2) {
            e = e2;
        }
    }

    public List<RequestHandler2> requestHandler2s(Request<?> request, ExecutionContext executionContext) {
        List<RequestHandler2> requestHandler2s = executionContext.getRequestHandler2s();
        if (requestHandler2s == null) {
            return Collections.emptyList();
        }
        for (RequestHandler2 requestHandler2 : requestHandler2s) {
            if (requestHandler2 instanceof CredentialsRequestHandler) {
                ((CredentialsRequestHandler) requestHandler2).setCredentials(executionContext.getCredentials());
            }
            requestHandler2.beforeRequest(request);
        }
        return requestHandler2s;
    }

    public void resetRequestAfterError(Request<?> request, Exception exc) {
        if (request.getContent() == null) {
            return;
        }
        if (request.getContent().markSupported()) {
            try {
                request.getContent().reset();
                return;
            } catch (IOException unused) {
                throw new AmazonClientException("Encountered an exception and couldn't reset the stream to retry", exc);
            }
        }
        throw new AmazonClientException("Encountered an exception and stream is not resettable", exc);
    }

    public void setUserAgent(Request<?> request) {
        String str;
        RequestClientOptions requestClientOptions;
        String clientMarker;
        String str2 = ClientConfiguration.DEFAULT_USER_AGENT;
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && (requestClientOptions = originalRequest.getRequestClientOptions()) != null && (clientMarker = requestClientOptions.getClientMarker(RequestClientOptions.Marker.USER_AGENT)) != null) {
            str = createUserAgentString(str2, clientMarker);
        } else {
            str = str2;
        }
        if (!str2.equals(this.config.getUserAgent())) {
            str = createUserAgentString(str, this.config.getUserAgent());
        }
        request.addHeader("User-Agent", str);
    }

    public void shutdown() {
        this.httpClient.shutdown();
    }

    @Deprecated
    public AmazonHttpClient(ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        this(clientConfiguration, new UrlHttpClient(clientConfiguration), requestMetricCollector);
    }

    public AmazonHttpClient(ClientConfiguration clientConfiguration, HttpClient httpClient) {
        this.requestFactory = new HttpRequestFactory();
        this.config = clientConfiguration;
        this.httpClient = httpClient;
        this.requestMetricCollector = null;
    }

    @Deprecated
    public AmazonHttpClient(ClientConfiguration clientConfiguration, HttpClient httpClient, RequestMetricCollector requestMetricCollector) {
        this.requestFactory = new HttpRequestFactory();
        this.config = clientConfiguration;
        this.httpClient = httpClient;
        this.requestMetricCollector = requestMetricCollector;
    }
}
