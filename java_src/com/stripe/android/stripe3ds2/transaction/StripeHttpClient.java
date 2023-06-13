package com.stripe.android.stripe3ds2.transaction;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p053io.CloseableKt;
import kotlin.p053io.TextStreamsKt;
import kotlin.text.Charsets;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002!\"B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\u0015\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\fH\u0001¢\u0006\u0002\b\u001cJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient;", "Lcom/stripe/android/stripe3ds2/transaction/HttpClient;", "url", "", "connectionFactory", "Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$ConnectionFactory;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$ConnectionFactory;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "createConnection", "Ljava/net/HttpURLConnection;", "createGetConnection", "createPostConnection", "requestBody", "contentType", "doGetRequest", "Ljava/io/InputStream;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doPostRequest", "Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doPostRequestInternal", "getResponseBody", "inputStream", "handlePostResponse", "conn", "handlePostResponse$3ds2sdk_release", "isSuccessfulResponse", "", "responseCode", "", "ConnectionFactory", "DefaultConnectionFactory", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeHttpClient implements HttpClient {
    private final ConnectionFactory connectionFactory;
    private final ErrorReporter errorReporter;
    private final String url;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$ConnectionFactory;", "", "create", "Ljava/net/HttpURLConnection;", "url", "", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface ConnectionFactory {
        HttpURLConnection create(String str);
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$DefaultConnectionFactory;", "Lcom/stripe/android/stripe3ds2/transaction/StripeHttpClient$ConnectionFactory;", "()V", "create", "Ljava/net/HttpURLConnection;", "url", "", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultConnectionFactory implements ConnectionFactory {
        @Override // com.stripe.android.stripe3ds2.transaction.StripeHttpClient.ConnectionFactory
        public HttpURLConnection create(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(url).openConnection());
            Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            return (HttpURLConnection) uRLConnection;
        }
    }

    public StripeHttpClient(String url, ConnectionFactory connectionFactory, ErrorReporter errorReporter, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.url = url;
        this.connectionFactory = connectionFactory;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    private final HttpURLConnection createConnection() {
        return this.connectionFactory.create(this.url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpURLConnection createGetConnection() {
        HttpURLConnection createConnection = createConnection();
        createConnection.setDoInput(true);
        return createConnection;
    }

    private final HttpURLConnection createPostConnection(String str, String str2) {
        HttpURLConnection createConnection = createConnection();
        createConnection.setRequestMethod("POST");
        createConnection.setDoOutput(true);
        createConnection.setRequestProperty("Content-Type", str2);
        createConnection.setRequestProperty("Content-Length", String.valueOf(str.length()));
        return createConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpResponse doPostRequestInternal(String str, String str2) {
        HttpURLConnection createPostConnection = createPostConnection(str, str2);
        OutputStream os = createPostConnection.getOutputStream();
        try {
            Intrinsics.checkNotNullExpressionValue(os, "os");
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(os, UTF_8);
            outputStreamWriter.write(str);
            outputStreamWriter.flush();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(outputStreamWriter, null);
            CloseableKt.closeFinally(os, null);
            createPostConnection.connect();
            return handlePostResponse$3ds2sdk_release(createPostConnection);
        } finally {
        }
    }

    private final String getResponseBody(InputStream inputStream) {
        Object m116783constructorimpl;
        BufferedReader bufferedReader;
        String str = null;
        try {
            Result.Companion companion = Result.Companion;
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, 8192);
            }
            String readText = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, null);
            m116783constructorimpl = Result.m116783constructorimpl(readText);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (!Result.m116789isFailureimpl(m116783constructorimpl)) {
            str = m116783constructorimpl;
        }
        String str2 = str;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    private final boolean isSuccessfulResponse(int i) {
        return 200 <= i && i < 300;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.HttpClient
    public Object doGetRequest(Continuation<? super InputStream> continuation) {
        return X30.m77504g(this.workContext, new StripeHttpClient$doGetRequest$2(this, null), continuation);
    }

    @Override // com.stripe.android.stripe3ds2.transaction.HttpClient
    public Object doPostRequest(String str, String str2, Continuation<? super HttpResponse> continuation) {
        return X30.m77504g(this.workContext, new StripeHttpClient$doPostRequest$2(this, str, str2, null), continuation);
    }

    public final HttpResponse handlePostResponse$3ds2sdk_release(HttpURLConnection conn) {
        Intrinsics.checkNotNullParameter(conn, "conn");
        int responseCode = conn.getResponseCode();
        if (isSuccessfulResponse(responseCode)) {
            InputStream inputStream = conn.getInputStream();
            Intrinsics.checkNotNullExpressionValue(inputStream, "conn.inputStream");
            return new HttpResponse(getResponseBody(inputStream), conn.getContentType());
        }
        throw new SDKRuntimeException("Unsuccessful response code from " + this.url + ": " + responseCode, null, 2, null);
    }

    public /* synthetic */ StripeHttpClient(String str, ConnectionFactory connectionFactory, ErrorReporter errorReporter, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new DefaultConnectionFactory() : connectionFactory, errorReporter, coroutineContext);
    }
}
