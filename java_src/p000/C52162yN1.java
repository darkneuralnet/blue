package p000;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C11925l;
import com.braintreepayments.api.exceptions.AuthenticationException;
import com.braintreepayments.api.exceptions.AuthorizationException;
import com.braintreepayments.api.exceptions.DownForMaintenanceException;
import com.braintreepayments.api.exceptions.RateLimitException;
import com.braintreepayments.api.exceptions.ServerException;
import com.braintreepayments.api.exceptions.UnexpectedException;
import com.braintreepayments.api.exceptions.UnprocessableEntityException;
import com.braintreepayments.api.exceptions.UpgradeRequiredException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocketFactory;
import p000.C52162yN1;
import zendesk.core.Constants;
/* renamed from: yN1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52162yN1<T extends C52162yN1> {

    /* renamed from: d */
    public SSLSocketFactory f119452d;

    /* renamed from: e */
    public int f119453e;

    /* renamed from: f */
    public int f119454f;

    /* renamed from: g */
    public String f119455g;

    /* renamed from: b */
    public final ExecutorService f119450b = Executors.newCachedThreadPool();

    /* renamed from: a */
    public final Handler f119449a = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public String f119451c = "braintree/core/3.17.2";

    /* renamed from: yN1$a */
    /* loaded from: classes2.dex */
    public class RunnableC30583a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f119456b;

        /* renamed from: c */
        public final /* synthetic */ HN1 f119457c;

        public RunnableC30583a(String str, HN1 hn1) {
            this.f119456b = str;
            this.f119457c = hn1;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    httpURLConnection = C52162yN1.this.mo3551b(this.f119456b);
                    httpURLConnection.setRequestMethod("GET");
                    C52162yN1 c52162yN1 = C52162yN1.this;
                    c52162yN1.m3546g(this.f119457c, c52162yN1.mo3550c(httpURLConnection));
                } catch (Exception e) {
                    C52162yN1.this.m3547f(this.f119457c, e);
                    if (httpURLConnection == null) {
                        return;
                    }
                }
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    /* renamed from: yN1$b */
    /* loaded from: classes2.dex */
    public class RunnableC30584b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ HN1 f119459b;

        /* renamed from: c */
        public final /* synthetic */ String f119460c;

        /* renamed from: d */
        public final /* synthetic */ String f119461d;

        public RunnableC30584b(HN1 hn1, String str, String str2) {
            this.f119459b = hn1;
            this.f119460c = str;
            this.f119461d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C52162yN1 c52162yN1 = C52162yN1.this;
                c52162yN1.m3546g(this.f119459b, c52162yN1.mo3549d(this.f119460c, this.f119461d));
            } catch (Exception e) {
                C52162yN1.this.m3547f(this.f119459b, e);
            }
        }
    }

    /* renamed from: yN1$c */
    /* loaded from: classes2.dex */
    public class RunnableC30585c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ HN1 f119463b;

        /* renamed from: c */
        public final /* synthetic */ String f119464c;

        public RunnableC30585c(HN1 hn1, String str) {
            this.f119463b = hn1;
            this.f119464c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f119463b.success(this.f119464c);
        }
    }

    /* renamed from: yN1$d */
    /* loaded from: classes2.dex */
    public class RunnableC30586d implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ HN1 f119466b;

        /* renamed from: c */
        public final /* synthetic */ Exception f119467c;

        public RunnableC30586d(HN1 hn1, Exception exc) {
            this.f119466b = hn1;
            this.f119467c = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f119466b.mo10871a(this.f119467c);
        }
    }

    public C52162yN1() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f119453e = (int) timeUnit.toMillis(30L);
        this.f119454f = (int) timeUnit.toMillis(30L);
        try {
            this.f119452d = new C45151mY5();
        } catch (SSLException unused) {
            this.f119452d = null;
        }
    }

    /* renamed from: a */
    public void mo3552a(String str, HN1 hn1) {
        if (str == null) {
            m3547f(hn1, new IllegalArgumentException("Path cannot be null"));
            return;
        }
        if (!str.startsWith("http")) {
            str = this.f119455g + str;
        }
        this.f119450b.submit(new RunnableC30583a(str, hn1));
    }

    /* renamed from: b */
    public HttpURLConnection mo3551b(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        if (httpURLConnection instanceof HttpsURLConnection) {
            SSLSocketFactory sSLSocketFactory = this.f119452d;
            if (sSLSocketFactory != null) {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
            } else {
                throw new SSLException("SSLSocketFactory was not set or failed to initialize");
            }
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f119451c);
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().getLanguage());
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        httpURLConnection.setConnectTimeout(this.f119453e);
        httpURLConnection.setReadTimeout(this.f119454f);
        return httpURLConnection;
    }

    /* renamed from: c */
    public String mo3550c(HttpURLConnection httpURLConnection) throws Exception {
        int responseCode = httpURLConnection.getResponseCode();
        boolean equals = "gzip".equals(httpURLConnection.getContentEncoding());
        if (responseCode != 400) {
            if (responseCode != 401) {
                if (responseCode != 403) {
                    if (responseCode != 422) {
                        if (responseCode != 426) {
                            if (responseCode != 429) {
                                if (responseCode != 500) {
                                    if (responseCode != 503) {
                                        switch (responseCode) {
                                            case C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION /* 200 */:
                                            case 201:
                                            case 202:
                                                return m3545h(httpURLConnection.getInputStream(), equals);
                                            default:
                                                throw new UnexpectedException(m3545h(httpURLConnection.getErrorStream(), equals));
                                        }
                                    }
                                    throw new DownForMaintenanceException(m3545h(httpURLConnection.getErrorStream(), equals));
                                }
                                throw new ServerException(m3545h(httpURLConnection.getErrorStream(), equals));
                            }
                            throw new RateLimitException("You are being rate-limited. Please try again in a few minutes.");
                        }
                        throw new UpgradeRequiredException(m3545h(httpURLConnection.getErrorStream(), equals));
                    }
                } else {
                    throw new AuthorizationException(m3545h(httpURLConnection.getErrorStream(), equals));
                }
            } else {
                throw new AuthenticationException(m3545h(httpURLConnection.getErrorStream(), equals));
            }
        }
        throw new UnprocessableEntityException(m3545h(httpURLConnection.getErrorStream(), equals));
    }

    /* renamed from: d */
    public String mo3549d(String str, String str2) throws Exception {
        HttpURLConnection mo3551b;
        HttpURLConnection httpURLConnection = null;
        try {
            if (str.startsWith("http")) {
                mo3551b = mo3551b(str);
            } else {
                mo3551b = mo3551b(this.f119455g + str);
            }
            httpURLConnection = mo3551b;
            httpURLConnection.setRequestProperty("Content-Type", Constants.APPLICATION_JSON);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            m3540m(httpURLConnection.getOutputStream(), str2);
            String mo3550c = mo3550c(httpURLConnection);
            httpURLConnection.disconnect();
            return mo3550c;
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public void mo3548e(String str, String str2, HN1 hn1) {
        if (str == null) {
            m3547f(hn1, new IllegalArgumentException("Path cannot be null"));
        } else {
            this.f119450b.submit(new RunnableC30584b(hn1, str, str2));
        }
    }

    /* renamed from: f */
    public void m3547f(HN1 hn1, Exception exc) {
        if (hn1 == null) {
            return;
        }
        this.f119449a.post(new RunnableC30586d(hn1, exc));
    }

    /* renamed from: g */
    public void m3546g(HN1 hn1, String str) {
        if (hn1 == null) {
            return;
        }
        this.f119449a.post(new RunnableC30585c(hn1, str));
    }

    /* renamed from: h */
    public final String m3545h(InputStream inputStream, boolean z) throws IOException {
        if (inputStream == null) {
            return null;
        }
        if (z) {
            try {
                inputStream = new GZIPInputStream(inputStream);
            } finally {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        return new String(byteArrayOutputStream.toByteArray(), com.amazonaws.services.p026s3.internal.Constants.DEFAULT_ENCODING);
    }

    /* renamed from: i */
    public T m3544i(String str) {
        if (str == null) {
            str = "";
        }
        this.f119455g = str;
        return this;
    }

    /* renamed from: j */
    public T m3543j(int i) {
        this.f119453e = i;
        return this;
    }

    /* renamed from: k */
    public T m3542k(SSLSocketFactory sSLSocketFactory) {
        this.f119452d = sSLSocketFactory;
        return this;
    }

    /* renamed from: l */
    public T m3541l(String str) {
        this.f119451c = str;
        return this;
    }

    /* renamed from: m */
    public void m3540m(OutputStream outputStream, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, com.amazonaws.services.p026s3.internal.Constants.DEFAULT_ENCODING);
        outputStreamWriter.write(str, 0, str.length());
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }
}
