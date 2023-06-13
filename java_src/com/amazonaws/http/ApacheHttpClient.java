package com.amazonaws.http;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.http.HttpResponse;
import com.google.firebase.perf.network.FirebasePerfHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
/* loaded from: classes2.dex */
public class ApacheHttpClient implements HttpClient {
    private final org.apache.http.client.HttpClient httpClient;
    private HttpParams params = null;

    public ApacheHttpClient(ClientConfiguration clientConfiguration) {
        AbstractHttpClient createHttpClient = new HttpClientFactory().createHttpClient(clientConfiguration);
        this.httpClient = createHttpClient;
        createHttpClient.setHttpRequestRetryHandler(new DefaultHttpRequestRetryHandler(0, false));
        ((SSLSocketFactory) createHttpClient.getConnectionManager().getSchemeRegistry().getScheme("https").getSocketFactory()).setHostnameVerifier(SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    private HttpUriRequest createHttpRequest(HttpRequest httpRequest) {
        HttpPost httpHead;
        String method = httpRequest.getMethod();
        if ("POST".equals(method)) {
            httpHead = new HttpPost(httpRequest.getUri());
            if (httpRequest.getContent() != null) {
                httpHead.setEntity(new InputStreamEntity(httpRequest.getContent(), httpRequest.getContentLength()));
            }
        } else if ("GET".equals(method)) {
            httpHead = new HttpGet(httpRequest.getUri());
        } else if ("PUT".equals(method)) {
            httpHead = new HttpPut(httpRequest.getUri());
            if (httpRequest.getContent() != null) {
                httpHead.setEntity(new InputStreamEntity(httpRequest.getContent(), httpRequest.getContentLength()));
            }
        } else if ("DELETE".equals(method)) {
            httpHead = new HttpDelete(httpRequest.getUri());
        } else if ("HEAD".equals(method)) {
            httpHead = new HttpHead(httpRequest.getUri());
        } else {
            throw new UnsupportedOperationException("Unsupported method: " + method);
        }
        if (httpRequest.getHeaders() != null && !httpRequest.getHeaders().isEmpty()) {
            for (Map.Entry<String, String> entry : httpRequest.getHeaders().entrySet()) {
                String key = entry.getKey();
                if (!key.equals("Content-Length") && !key.equals(HttpHeader.HOST)) {
                    httpHead.addHeader(entry.getKey(), entry.getValue());
                }
            }
        }
        if (this.params == null) {
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            this.params = basicHttpParams;
            basicHttpParams.setParameter("http.protocol.handle-redirects", Boolean.FALSE);
        }
        httpHead.setParams(this.params);
        return httpHead;
    }

    @Override // com.amazonaws.http.HttpClient
    public HttpResponse execute(HttpRequest httpRequest) throws IOException {
        InputStream inputStream;
        Header[] allHeaders;
        org.apache.http.HttpResponse execute = FirebasePerfHttpClient.execute(this.httpClient, createHttpRequest(httpRequest));
        String reasonPhrase = execute.getStatusLine().getReasonPhrase();
        int statusCode = execute.getStatusLine().getStatusCode();
        if (execute.getEntity() != null) {
            inputStream = execute.getEntity().getContent();
        } else {
            inputStream = null;
        }
        HttpResponse.Builder content = HttpResponse.builder().statusCode(statusCode).statusText(reasonPhrase).content(inputStream);
        for (Header header : execute.getAllHeaders()) {
            content.header(header.getName(), header.getValue());
        }
        return content.build();
    }

    @Override // com.amazonaws.http.HttpClient
    public void shutdown() {
        this.httpClient.getConnectionManager().shutdown();
    }
}
