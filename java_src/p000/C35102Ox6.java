package p000;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
/* renamed from: Ox6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C35102Ox6 implements A62 {

    /* renamed from: Ox6$a */
    /* loaded from: classes5.dex */
    public class C6211a implements InterfaceC23492o<Long, Boolean> {

        /* renamed from: b */
        public final /* synthetic */ String f27605b;

        /* renamed from: c */
        public final /* synthetic */ int f27606c;

        /* renamed from: d */
        public final /* synthetic */ int f27607d;

        /* renamed from: e */
        public final /* synthetic */ int f27608e;

        /* renamed from: f */
        public final /* synthetic */ InterfaceC41667gg1 f27609f;

        public C6211a(String str, int i, int i2, int i3, InterfaceC41667gg1 interfaceC41667gg1) {
            this.f27605b = str;
            this.f27606c = i;
            this.f27607d = i2;
            this.f27608e = i3;
            this.f27609f = interfaceC41667gg1;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public Boolean apply(Long l) {
            return C35102Ox6.this.m91150f(this.f27605b, this.f27606c, this.f27607d, this.f27608e, this.f27609f);
        }
    }

    @Override // p000.A62
    /* renamed from: a */
    public Observable<Boolean> mo91155a(int i, int i2, String str, int i3, int i4, int i5, InterfaceC41667gg1 interfaceC41667gg1) {
        BZ3.m113864a(i, "initialIntervalInMs is not a positive number");
        BZ3.m113863b(i2, "intervalInMs is not a positive number");
        m91153c(str, i3, i4, i5, interfaceC41667gg1);
        return Observable.interval(i, i2, TimeUnit.MILLISECONDS, C24542a.m31932c()).map(new C6211a(m91154b(str), i3, i4, i5, interfaceC41667gg1)).distinctUntilChanged();
    }

    /* renamed from: b */
    public String m91154b(String str) {
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            return "https://".concat(str);
        }
        return str;
    }

    /* renamed from: c */
    public final void m91153c(String str, int i, int i2, int i3, InterfaceC41667gg1 interfaceC41667gg1) {
        BZ3.m113861d(str, "host is null or empty");
        BZ3.m113863b(i, "port is not a positive number");
        BZ3.m113863b(i2, "timeoutInMs is not a positive number");
        BZ3.m113862c(interfaceC41667gg1, "errorHandler is null");
        BZ3.m113862c(Integer.valueOf(i3), "httpResponse is null");
        BZ3.m113863b(i3, "httpResponse is not a positive number");
    }

    /* renamed from: d */
    public HttpURLConnection m91152d(String str, int i, int i2) throws IOException {
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(url.getProtocol(), url.getHost(), i, url.getFile()).openConnection()));
        httpURLConnection.setConnectTimeout(i2);
        httpURLConnection.setReadTimeout(i2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        return httpURLConnection;
    }

    /* renamed from: e */
    public HttpsURLConnection m91151e(String str, int i, int i2) throws IOException {
        URL url = new URL(str);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(url.getProtocol(), url.getHost(), i, url.getFile()).openConnection()));
        httpsURLConnection.setConnectTimeout(i2);
        httpsURLConnection.setReadTimeout(i2);
        httpsURLConnection.setInstanceFollowRedirects(false);
        httpsURLConnection.setUseCaches(false);
        return httpsURLConnection;
    }

    /* renamed from: f */
    public Boolean m91150f(String str, int i, int i2, int i3, InterfaceC41667gg1 interfaceC41667gg1) {
        HttpURLConnection m91152d;
        boolean z;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                if (str.startsWith("https://")) {
                    m91152d = m91151e(str, i, i2);
                } else {
                    m91152d = m91152d(str, i, i2);
                }
                httpURLConnection = m91152d;
                if (httpURLConnection.getResponseCode() == i3) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                httpURLConnection.disconnect();
                return valueOf;
            } catch (IOException e) {
                interfaceC41667gg1.mo37914a(e, "Could not establish connection with WalledGardenStrategy");
                Boolean bool = Boolean.FALSE;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return bool;
            }
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }
}
