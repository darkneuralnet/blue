package p000;

import com.android.volley.AuthFailureError;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
/* renamed from: SN1 */
/* loaded from: classes.dex */
public class SN1 extends AbstractC4752LA {

    /* renamed from: a */
    public final SSLSocketFactory f33558a;

    /* renamed from: SN1$a */
    /* loaded from: classes.dex */
    public static class C7407a extends FilterInputStream {

        /* renamed from: b */
        public final HttpURLConnection f33559b;

        public C7407a(HttpURLConnection httpURLConnection) {
            super(SN1.m85610j(httpURLConnection));
            this.f33559b = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.f33559b.disconnect();
        }
    }

    /* renamed from: SN1$b */
    /* loaded from: classes.dex */
    public interface InterfaceC7408b {
    }

    public SN1() {
        this(null);
    }

    /* renamed from: e */
    public static List<AH1> m85615e(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new AH1(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public static boolean m85611i(int i, int i2) {
        return (i == 4 || (100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
    }

    /* renamed from: j */
    public static InputStream m85610j(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    @Override // p000.AbstractC4752LA
    /* renamed from: a */
    public GN1 mo85619a(AbstractC45006mI4<?> abstractC45006mI4, Map<String, String> map) throws IOException, AuthFailureError {
        String url = abstractC45006mI4.getUrl();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(abstractC45006mI4.getHeaders());
        HttpURLConnection m85609k = m85609k(new URL(url), abstractC45006mI4);
        try {
            for (String str : hashMap.keySet()) {
                m85609k.setRequestProperty(str, (String) hashMap.get(str));
            }
            m85608l(m85609k, abstractC45006mI4);
            int responseCode = m85609k.getResponseCode();
            if (responseCode != -1) {
                if (!m85611i(abstractC45006mI4.getMethod(), responseCode)) {
                    GN1 gn1 = new GN1(responseCode, m85615e(m85609k.getHeaderFields()));
                    m85609k.disconnect();
                    return gn1;
                }
                return new GN1(responseCode, m85615e(m85609k.getHeaderFields()), m85609k.getContentLength(), m85613g(abstractC45006mI4, m85609k));
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th) {
            if (0 == 0) {
                m85609k.disconnect();
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final void m85617c(HttpURLConnection httpURLConnection, AbstractC45006mI4<?> abstractC45006mI4, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", abstractC45006mI4.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(m85612h(abstractC45006mI4, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    /* renamed from: d */
    public final void m85616d(HttpURLConnection httpURLConnection, AbstractC45006mI4<?> abstractC45006mI4) throws IOException, AuthFailureError {
        byte[] body = abstractC45006mI4.getBody();
        if (body != null) {
            m85617c(httpURLConnection, abstractC45006mI4, body);
        }
    }

    /* renamed from: f */
    public HttpURLConnection m85614f(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    /* renamed from: g */
    public InputStream m85613g(AbstractC45006mI4<?> abstractC45006mI4, HttpURLConnection httpURLConnection) {
        return new C7407a(httpURLConnection);
    }

    /* renamed from: h */
    public OutputStream m85612h(AbstractC45006mI4<?> abstractC45006mI4, HttpURLConnection httpURLConnection, int i) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    /* renamed from: k */
    public final HttpURLConnection m85609k(URL url, AbstractC45006mI4<?> abstractC45006mI4) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection m85614f = m85614f(url);
        int timeoutMs = abstractC45006mI4.getTimeoutMs();
        m85614f.setConnectTimeout(timeoutMs);
        m85614f.setReadTimeout(timeoutMs);
        m85614f.setUseCaches(false);
        m85614f.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f33558a) != null) {
            ((HttpsURLConnection) m85614f).setSSLSocketFactory(sSLSocketFactory);
        }
        return m85614f;
    }

    /* renamed from: l */
    public void m85608l(HttpURLConnection httpURLConnection, AbstractC45006mI4<?> abstractC45006mI4) throws IOException, AuthFailureError {
        switch (abstractC45006mI4.getMethod()) {
            case -1:
                byte[] postBody = abstractC45006mI4.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod("POST");
                    m85617c(httpURLConnection, abstractC45006mI4, postBody);
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m85616d(httpURLConnection, abstractC45006mI4);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                m85616d(httpURLConnection, abstractC45006mI4);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                m85616d(httpURLConnection, abstractC45006mI4);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    public SN1(InterfaceC7408b interfaceC7408b) {
        this(interfaceC7408b, null);
    }

    public SN1(InterfaceC7408b interfaceC7408b, SSLSocketFactory sSLSocketFactory) {
        this.f33558a = sSLSocketFactory;
    }
}
