package p000;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
/* renamed from: MA */
/* loaded from: classes.dex */
public abstract class AbstractC5214MA {
    static {
        HttpsURLConnection.setDefaultSSLSocketFactory(C38699bh5.f57906a);
    }

    /* renamed from: a */
    public HttpURLConnection m95648a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        if (httpURLConnection instanceof HttpsURLConnection) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(C38699bh5.f57906a);
            return httpURLConnection;
        }
        return mo92369b(httpURLConnection);
    }

    /* renamed from: b */
    public abstract HttpURLConnection mo92369b(HttpURLConnection httpURLConnection);
}
