package p000;

import android.text.TextUtils;
import android.util.Log;
import com.amazonaws.http.HttpHeader;
import com.bumptech.glide.load.HttpException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import p000.IS0;
/* renamed from: PN1 */
/* loaded from: classes5.dex */
public class PN1 implements IS0<InputStream> {

    /* renamed from: h */
    public static final InterfaceC6334b f28362h = new C6333a();

    /* renamed from: b */
    public final OC1 f28363b;

    /* renamed from: c */
    public final int f28364c;

    /* renamed from: d */
    public final InterfaceC6334b f28365d;

    /* renamed from: e */
    public HttpURLConnection f28366e;

    /* renamed from: f */
    public InputStream f28367f;

    /* renamed from: g */
    public volatile boolean f28368g;

    /* renamed from: PN1$a */
    /* loaded from: classes5.dex */
    public static class C6333a implements InterfaceC6334b {
        @Override // p000.PN1.InterfaceC6334b
        /* renamed from: a */
        public HttpURLConnection mo90359a(URL url) throws IOException {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    /* renamed from: PN1$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC6334b {
        /* renamed from: a */
        HttpURLConnection mo90359a(URL url) throws IOException;
    }

    public PN1(OC1 oc1, int i) {
        this(oc1, i, f28362h);
    }

    /* renamed from: d */
    public static int m90364d(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e);
                return -1;
            }
            return -1;
        }
    }

    /* renamed from: g */
    public static boolean m90362g(int i) {
        return i / 100 == 2;
    }

    /* renamed from: h */
    public static boolean m90361h(int i) {
        return i / 100 == 3;
    }

    @Override // p000.IS0
    /* renamed from: a */
    public Class<InputStream> mo6834a() {
        return InputStream.class;
    }

    @Override // p000.IS0
    /* renamed from: b */
    public ZS0 mo19947b() {
        return ZS0.REMOTE;
    }

    /* renamed from: c */
    public final HttpURLConnection m90365c(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection mo90359a = this.f28365d.mo90359a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                mo90359a.addRequestProperty(entry.getKey(), entry.getValue());
            }
            mo90359a.setConnectTimeout(this.f28364c);
            mo90359a.setReadTimeout(this.f28364c);
            mo90359a.setUseCaches(false);
            mo90359a.setDoInput(true);
            mo90359a.setInstanceFollowRedirects(false);
            return mo90359a;
        } catch (IOException e) {
            throw new HttpException("URL.openConnection threw", 0, e);
        }
    }

    @Override // p000.IS0
    public void cancel() {
        this.f28368g = true;
    }

    @Override // p000.IS0
    public void cleanup() {
        InputStream inputStream = this.f28367f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f28366e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f28366e = null;
    }

    @Override // p000.IS0
    /* renamed from: e */
    public void mo19946e(P24 p24, IS0.InterfaceC3534a<? super InputStream> interfaceC3534a) {
        StringBuilder sb;
        long m11168b = C49546tx2.m11168b();
        try {
            try {
                interfaceC3534a.mo77098c(m90360i(this.f28363b.m92628h(), 0, null, this.f28363b.m92631e()));
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                interfaceC3534a.mo77097d(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb = new StringBuilder();
                } else {
                    return;
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C49546tx2.m11169a(m11168b));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C49546tx2.m11169a(m11168b));
            }
            throw th;
        }
    }

    /* renamed from: f */
    public final InputStream m90363f(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f28367f = C50858wA0.m7341b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f28367f = httpURLConnection.getInputStream();
            }
            return this.f28367f;
        } catch (IOException e) {
            throw new HttpException("Failed to obtain InputStream", m90364d(httpURLConnection), e);
        }
    }

    /* renamed from: i */
    public final InputStream m90360i(URL url, int i, URL url2, Map<String, String> map) throws HttpException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection m90365c = m90365c(url, map);
            this.f28366e = m90365c;
            try {
                m90365c.connect();
                this.f28367f = this.f28366e.getInputStream();
                if (this.f28368g) {
                    return null;
                }
                int m90364d = m90364d(this.f28366e);
                if (m90362g(m90364d)) {
                    return m90363f(this.f28366e);
                }
                if (m90361h(m90364d)) {
                    String headerField = this.f28366e.getHeaderField(HttpHeader.LOCATION);
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            cleanup();
                            return m90360i(url3, i + 1, url, map);
                        } catch (MalformedURLException e) {
                            throw new HttpException("Bad redirect url: " + headerField, m90364d, e);
                        }
                    }
                    throw new HttpException("Received empty or null redirect url", m90364d);
                } else if (m90364d == -1) {
                    throw new HttpException(m90364d);
                } else {
                    try {
                        throw new HttpException(this.f28366e.getResponseMessage(), m90364d);
                    } catch (IOException e2) {
                        throw new HttpException("Failed to get a response message", m90364d, e2);
                    }
                }
            } catch (IOException e3) {
                throw new HttpException("Failed to connect or obtain data", m90364d(this.f28366e), e3);
            }
        }
        throw new HttpException("Too many (> 5) redirects!", -1);
    }

    public PN1(OC1 oc1, int i, InterfaceC6334b interfaceC6334b) {
        this.f28363b = oc1;
        this.f28364c = i;
        this.f28365d = interfaceC6334b;
    }
}
