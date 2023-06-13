package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.C18387e;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import zendesk.core.Constants;
/* renamed from: com.google.firebase.remoteconfig.internal.e */
/* loaded from: classes6.dex */
public class C18387e {

    /* renamed from: q */
    public static final int[] f74476q = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: r */
    public static final Pattern f74477r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    public final Set<InterfaceC32738Ev0> f74478a;

    /* renamed from: c */
    public int f74480c;

    /* renamed from: g */
    public final ScheduledExecutorService f74484g;

    /* renamed from: h */
    public final C18381c f74485h;

    /* renamed from: i */
    public final C31722Am1 f74486i;

    /* renamed from: j */
    public final InterfaceC35934Sm1 f74487j;

    /* renamed from: k */
    public C34601Mu0 f74488k;

    /* renamed from: l */
    public final Context f74489l;

    /* renamed from: m */
    public final String f74490m;

    /* renamed from: p */
    public final C18384d f74493p;

    /* renamed from: f */
    public final int f74483f = 8;

    /* renamed from: b */
    public boolean f74479b = false;

    /* renamed from: n */
    public final Random f74491n = new Random();

    /* renamed from: o */
    public final Clock f74492o = DefaultClock.getInstance();

    /* renamed from: d */
    public boolean f74481d = false;

    /* renamed from: e */
    public boolean f74482e = false;

    /* renamed from: com.google.firebase.remoteconfig.internal.e$a */
    /* loaded from: classes6.dex */
    public class RunnableC18388a implements Runnable {
        public RunnableC18388a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C18387e.this.m46920d();
        }
    }

    /* renamed from: com.google.firebase.remoteconfig.internal.e$b */
    /* loaded from: classes6.dex */
    public class C18389b implements InterfaceC32738Ev0 {
        public C18389b() {
        }

        @Override // p000.InterfaceC32738Ev0
        /* renamed from: a */
        public void mo46897a(AbstractC32504Dv0 abstractC32504Dv0) {
        }

        @Override // p000.InterfaceC32738Ev0
        /* renamed from: b */
        public void mo46896b(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            C18387e.this.m46915i();
            C18387e.this.m46904t(firebaseRemoteConfigException);
        }
    }

    public C18387e(C31722Am1 c31722Am1, InterfaceC35934Sm1 interfaceC35934Sm1, C18381c c18381c, C34601Mu0 c34601Mu0, Context context, String str, Set<InterfaceC32738Ev0> set, C18384d c18384d, ScheduledExecutorService scheduledExecutorService) {
        this.f74478a = set;
        this.f74484g = scheduledExecutorService;
        this.f74480c = Math.max(8 - c18384d.m46940h().m46927b(), 1);
        this.f74486i = c31722Am1;
        this.f74485h = c18381c;
        this.f74487j = interfaceC35934Sm1;
        this.f74488k = c34601Mu0;
        this.f74489l = context;
        this.f74490m = str;
        this.f74493p = c18384d;
    }

    /* renamed from: j */
    public static String m46914j(String str) {
        Matcher matcher = f74477r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: q */
    public static /* synthetic */ Task m46907q(HttpURLConnection httpURLConnection, AbstractC37749a52 abstractC37749a52) throws Exception {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", abstractC37749a52.mo71914b());
        return Tasks.forResult(null);
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: A */
    public synchronized C18376a m46926A(HttpURLConnection httpURLConnection) {
        return new C18376a(httpURLConnection, this.f74485h, this.f74488k, this.f74478a, new C18389b(), this.f74484g);
    }

    /* renamed from: B */
    public void m46925B() {
        m46906r(0L);
    }

    /* renamed from: C */
    public final void m46924C(Date date) {
        int m46927b = this.f74493p.m46940h().m46927b() + 1;
        this.f74493p.m46934n(m46927b, new Date(date.getTime() + m46911m(m46927b)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @SuppressLint({"VisibleForTests", "DefaultLocale"})
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m46920d() {
        Integer num;
        ?? r8;
        ?? r7;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        HttpURLConnection m46917g;
        ?? r72;
        if (!m46919e()) {
            return;
        }
        if (new Date(this.f74492o.currentTimeMillis()).before(this.f74493p.m46940h().m46928a())) {
            m46902v();
            return;
        }
        m46900x(true);
        HttpURLConnection httpURLConnection = null;
        r2 = null;
        Integer num2 = null;
        httpURLConnection = null;
        try {
            m46917g = m46917g();
        } catch (IOException e) {
            e = e;
            num = null;
        } catch (Throwable th) {
            th = th;
            num = null;
        }
        try {
            num2 = Integer.valueOf(m46917g.getResponseCode());
            if (num2.intValue() == 200) {
                m46903u();
                this.f74493p.m46938j();
                m46926A(m46917g).m47002i();
            }
            m46918f(m46917g);
            m46900x(false);
            if (m46908p(num2.intValue())) {
                r72 = true;
            } else {
                r72 = false;
            }
            if (r72 != false) {
                m46924C(new Date(this.f74492o.currentTimeMillis()));
            }
        } catch (IOException e2) {
            e = e2;
            num = num2;
            httpURLConnection = m46917g;
            try {
                Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                m46918f(httpURLConnection);
                m46900x(false);
                if (num != null && !m46908p(num.intValue())) {
                    r7 = false;
                } else {
                    r7 = true;
                }
                if (r7 != false) {
                    m46924C(new Date(this.f74492o.currentTimeMillis()));
                }
                if (r7 == false && num.intValue() != 200) {
                    String format = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                    if (num.intValue() == 403) {
                        format = m46905s(httpURLConnection.getErrorStream());
                    }
                    firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(num.intValue(), format, FirebaseRemoteConfigException.EnumC18375a.CONFIG_UPDATE_STREAM_ERROR);
                    m46904t(firebaseRemoteConfigServerException);
                    return;
                }
                m46902v();
            } catch (Throwable th2) {
                th = th2;
                m46918f(httpURLConnection);
                m46900x(false);
                if (num == null && !m46908p(num.intValue())) {
                    r8 = false;
                } else {
                    r8 = true;
                }
                if (r8 != false) {
                    m46924C(new Date(this.f74492o.currentTimeMillis()));
                }
                if (r8 != false && num.intValue() != 200) {
                    String format2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                    if (num.intValue() == 403) {
                        format2 = m46905s(httpURLConnection.getErrorStream());
                    }
                    m46904t(new FirebaseRemoteConfigServerException(num.intValue(), format2, FirebaseRemoteConfigException.EnumC18375a.CONFIG_UPDATE_STREAM_ERROR));
                } else {
                    m46902v();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            num = num2;
            httpURLConnection = m46917g;
            m46918f(httpURLConnection);
            m46900x(false);
            if (num == null) {
            }
            r8 = true;
            if (r8 != false) {
            }
            if (r8 != false) {
            }
            m46902v();
            throw th;
        }
        if (r72 == false && num2.intValue() != 200) {
            String format3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num2);
            if (num2.intValue() == 403) {
                format3 = m46905s(m46917g.getErrorStream());
            }
            firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(num2.intValue(), format3, FirebaseRemoteConfigException.EnumC18375a.CONFIG_UPDATE_STREAM_ERROR);
            m46904t(firebaseRemoteConfigServerException);
            return;
        }
        m46902v();
    }

    /* renamed from: e */
    public final synchronized boolean m46919e() {
        boolean z;
        if (!this.f74478a.isEmpty() && !this.f74479b && !this.f74481d) {
            if (!this.f74482e) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* renamed from: f */
    public void m46918f(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: g */
    public HttpURLConnection m46917g() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) m46909o().openConnection();
        m46901w(httpURLConnection);
        m46898z(httpURLConnection);
        return httpURLConnection;
    }

    /* renamed from: h */
    public final JSONObject m46916h() {
        HashMap hashMap = new HashMap();
        hashMap.put("project", m46914j(this.f74486i.m115290m().m18705c()));
        hashMap.put("namespace", this.f74490m);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.f74485h.m46963r()));
        hashMap.put("appId", this.f74486i.m115290m().m18705c());
        hashMap.put("sdkVersion", "21.4.0");
        return new JSONObject(hashMap);
    }

    /* renamed from: i */
    public final synchronized void m46915i() {
        this.f74481d = true;
    }

    /* renamed from: k */
    public final String m46913k() {
        try {
            Context context = this.f74489l;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f74489l.getPackageName());
                return null;
            }
            return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.f74489l.getPackageName());
            return null;
        }
    }

    /* renamed from: l */
    public final void m46912l(final HttpURLConnection httpURLConnection) {
        this.f74487j.mo47278a(false).onSuccessTask(this.f74484g, new SuccessContinuation() { // from class: Av0
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m46907q;
                m46907q = C18387e.m46907q(httpURLConnection, (AbstractC37749a52) obj);
                return m46907q;
            }
        });
    }

    /* renamed from: m */
    public final long m46911m(int i) {
        int[] iArr = f74476q;
        int length = iArr.length;
        if (i >= length) {
            i = length;
        }
        long millis = TimeUnit.MINUTES.toMillis(iArr[i - 1]);
        return (millis / 2) + this.f74491n.nextInt((int) millis);
    }

    /* renamed from: n */
    public final String m46910n(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", m46914j(this.f74486i.m115290m().m18705c()), str);
    }

    /* renamed from: o */
    public final URL m46909o() {
        try {
            return new URL(m46910n(this.f74490m));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    /* renamed from: p */
    public final boolean m46908p(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* renamed from: r */
    public final synchronized void m46906r(long j) {
        if (!m46919e()) {
            return;
        }
        int i = this.f74480c;
        if (i > 0) {
            this.f74480c = i - 1;
            this.f74484g.schedule(new RunnableC18388a(), j, TimeUnit.MILLISECONDS);
        } else if (!this.f74482e) {
            m46904t(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.EnumC18375a.CONFIG_UPDATE_STREAM_ERROR));
        }
    }

    /* renamed from: s */
    public final String m46905s(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    /* renamed from: t */
    public final synchronized void m46904t(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        for (InterfaceC32738Ev0 interfaceC32738Ev0 : this.f74478a) {
            interfaceC32738Ev0.mo46896b(firebaseRemoteConfigException);
        }
    }

    /* renamed from: u */
    public final synchronized void m46903u() {
        this.f74480c = 8;
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: v */
    public synchronized void m46902v() {
        m46906r(Math.max(0L, this.f74493p.m46940h().m46928a().getTime() - new Date(this.f74492o.currentTimeMillis()).getTime()));
    }

    /* renamed from: w */
    public final void m46901w(HttpURLConnection httpURLConnection) {
        m46912l(httpURLConnection);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f74486i.m115290m().m18706b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f74489l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", m46913k());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", Constants.APPLICATION_JSON);
        httpURLConnection.setRequestProperty("Accept", Constants.APPLICATION_JSON);
    }

    /* renamed from: x */
    public final synchronized void m46900x(boolean z) {
        this.f74479b = z;
    }

    /* renamed from: y */
    public void m46899y(boolean z) {
        this.f74482e = z;
    }

    /* renamed from: z */
    public final void m46898z(HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        byte[] bytes = m46916h().toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
}
