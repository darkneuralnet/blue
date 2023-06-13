package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.AsyncTask;
import android.util.Base64;
import com.facebook.GraphRequest;
import com.facebook.internal.BoltsMeasurementEventListener;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C10334Zi;
import p000.C32172Ck1;
/* renamed from: com.facebook.a */
/* loaded from: classes5.dex */
public final class C17216a {

    /* renamed from: a */
    public static final String f69425a = "com.facebook.a";

    /* renamed from: c */
    public static Executor f69427c;

    /* renamed from: d */
    public static volatile String f69428d;

    /* renamed from: e */
    public static volatile String f69429e;

    /* renamed from: f */
    public static volatile String f69430f;

    /* renamed from: g */
    public static volatile Boolean f69431g;

    /* renamed from: l */
    public static C41245fx2<File> f69436l;

    /* renamed from: m */
    public static Context f69437m;

    /* renamed from: b */
    public static final HashSet<EnumC36034Sx2> f69426b = new HashSet<>(Arrays.asList(EnumC36034Sx2.DEVELOPER_ERRORS));

    /* renamed from: h */
    public static volatile String f69432h = "facebook.com";

    /* renamed from: i */
    public static AtomicLong f69433i = new AtomicLong(65536);

    /* renamed from: j */
    public static volatile boolean f69434j = false;

    /* renamed from: k */
    public static boolean f69435k = false;

    /* renamed from: n */
    public static int f69438n = 64206;

    /* renamed from: o */
    public static final Object f69439o = new Object();

    /* renamed from: p */
    public static String f69440p = C53066zt5.m164a();

    /* renamed from: q */
    public static boolean f69441q = false;

    /* renamed from: r */
    public static boolean f69442r = false;

    /* renamed from: s */
    public static final AtomicBoolean f69443s = new AtomicBoolean(false);

    /* renamed from: t */
    public static Boolean f69444t = Boolean.FALSE;

    /* renamed from: u */
    public static InterfaceC17225i f69445u = new C17217a();

    /* renamed from: com.facebook.a$a */
    /* loaded from: classes5.dex */
    public static class C17217a implements InterfaceC17225i {
        @Override // com.facebook.C17216a.InterfaceC17225i
        /* renamed from: a */
        public GraphRequest mo52717a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC17205b interfaceC17205b) {
            return GraphRequest.m52823x(accessToken, str, jSONObject, interfaceC17205b);
        }
    }

    /* renamed from: com.facebook.a$b */
    /* loaded from: classes5.dex */
    public static class CallableC17218b implements Callable<File> {
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public File call() throws Exception {
            return C17216a.f69437m.getCacheDir();
        }
    }

    /* renamed from: com.facebook.a$c */
    /* loaded from: classes5.dex */
    public static class C17219c implements C32172Ck1.InterfaceC1164a {
        @Override // p000.C32172Ck1.InterfaceC1164a
        /* renamed from: a */
        public void mo16504a(boolean z) {
            if (z) {
                C47847r52.m16505a();
            }
        }
    }

    /* renamed from: com.facebook.a$d */
    /* loaded from: classes5.dex */
    public static class C17220d implements C32172Ck1.InterfaceC1164a {
        @Override // p000.C32172Ck1.InterfaceC1164a
        /* renamed from: a */
        public void mo16504a(boolean z) {
            if (z) {
                C10820aj.m70829a();
            }
        }
    }

    /* renamed from: com.facebook.a$e */
    /* loaded from: classes5.dex */
    public static class C17221e implements C32172Ck1.InterfaceC1164a {
        @Override // p000.C32172Ck1.InterfaceC1164a
        /* renamed from: a */
        public void mo16504a(boolean z) {
            if (z) {
                C17216a.f69441q = true;
            }
        }
    }

    /* renamed from: com.facebook.a$f */
    /* loaded from: classes5.dex */
    public static class C17222f implements C32172Ck1.InterfaceC1164a {
        @Override // p000.C32172Ck1.InterfaceC1164a
        /* renamed from: a */
        public void mo16504a(boolean z) {
            if (z) {
                C17216a.f69442r = true;
            }
        }
    }

    /* renamed from: com.facebook.a$g */
    /* loaded from: classes5.dex */
    public static class CallableC17223g implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ Context f69446b;

        public CallableC17223g(InterfaceC17226j interfaceC17226j, Context context) {
            this.f69446b = context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C2597G1.m106004h().m106003i();
            A74.m116084d().m116083e();
            if (AccessToken.m52909o() && Profile.m52762c() == null) {
                Profile.m52763b();
            }
            C9459Xi.m76552f(C17216a.f69437m, C17216a.f69428d);
            C17227b.m52703m();
            C9459Xi.m76550h(this.f69446b.getApplicationContext()).m76556b();
            return null;
        }
    }

    /* renamed from: com.facebook.a$h */
    /* loaded from: classes5.dex */
    public static class RunnableC17224h implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Context f69447b;

        /* renamed from: c */
        public final /* synthetic */ String f69448c;

        public RunnableC17224h(Context context, String str) {
            this.f69447b = context;
            this.f69448c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                C17216a.m52752B(this.f69447b, this.f69448c);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: com.facebook.a$i */
    /* loaded from: classes5.dex */
    public interface InterfaceC17225i {
        /* renamed from: a */
        GraphRequest mo52717a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC17205b interfaceC17205b);
    }

    /* renamed from: com.facebook.a$j */
    /* loaded from: classes5.dex */
    public interface InterfaceC17226j {
        /* renamed from: a */
        void m52716a();
    }

    /* renamed from: A */
    public static void m52753A(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (f69428d == null) {
                    Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                            f69428d = str.substring(2);
                        } else {
                            f69428d = str;
                        }
                    } else if (obj instanceof Number) {
                        throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                    }
                }
                if (f69429e == null) {
                    f69429e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                }
                if (f69430f == null) {
                    f69430f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                }
                if (f69438n == 64206) {
                    f69438n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                }
                if (f69431g == null) {
                    f69431g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: B */
    public static void m52752B(Context context, String str) {
        if (TD0.m84203d(C17216a.class)) {
            return;
        }
        try {
            try {
                if (context != null && str != null) {
                    C29645vp m7991m = C29645vp.m7991m(context);
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                    String str2 = str + "ping";
                    long j = sharedPreferences.getLong(str2, 0L);
                    try {
                        GraphRequest mo52717a = f69445u.mo52717a(null, String.format("%s/activities", str), C10334Zi.m72664a(C10334Zi.EnumC10335a.MOBILE_INSTALL_EVENT, m7991m, C9459Xi.m76555c(context), m52727s(context), context), null);
                        if (j == 0 && mo52717a.m52837j().m78704b() == null) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putLong(str2, System.currentTimeMillis());
                            edit.apply();
                            return;
                        }
                        return;
                    } catch (JSONException e) {
                        throw new FacebookException("An error occurred while publishing install.", e);
                    }
                }
                throw new IllegalArgumentException("Both context and applicationId must be non-null");
            } catch (Exception e2) {
                C52364yi6.m2854X("Facebook-publish", e2);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C17216a.class);
        }
    }

    /* renamed from: C */
    public static void m52751C(Context context, String str) {
        if (TD0.m84203d(C17216a.class)) {
            return;
        }
        try {
            m52731o().execute(new RunnableC17224h(context.getApplicationContext(), str));
            if (C32172Ck1.m111754g(C32172Ck1.EnumC1165b.OnDeviceEventProcessing) && C34478Mg3.m95051b()) {
                C34478Mg3.m95049d(str, "com.facebook.sdk.attributionTracking");
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C17216a.class);
        }
    }

    @Deprecated
    /* renamed from: D */
    public static synchronized void m52750D(Context context) {
        synchronized (C17216a.class) {
            m52749E(context, null);
        }
    }

    @Deprecated
    /* renamed from: E */
    public static synchronized void m52749E(Context context, InterfaceC17226j interfaceC17226j) {
        synchronized (C17216a.class) {
            AtomicBoolean atomicBoolean = f69443s;
            if (atomicBoolean.get()) {
                if (interfaceC17226j != null) {
                    interfaceC17226j.m52716a();
                }
                return;
            }
            C48817sj6.m13765m(context, "applicationContext");
            C48817sj6.m13771g(context, false);
            C48817sj6.m13769i(context, false);
            f69437m = context.getApplicationContext();
            C9459Xi.m76555c(context);
            m52753A(f69437m);
            if (!C52364yi6.m2860R(f69428d)) {
                atomicBoolean.set(true);
                if (m52737i()) {
                    m52743c();
                }
                if ((f69437m instanceof Application) && C17227b.m52709g()) {
                    C20715g4.m40168x((Application) f69437m, f69428d);
                }
                C34746Nk1.m93521k();
                C50483vY2.m8490C();
                BoltsMeasurementEventListener.m52690e(f69437m);
                f69436l = new C41245fx2<>(new CallableC17218b());
                C32172Ck1.m111760a(C32172Ck1.EnumC1165b.Instrument, new C17219c());
                C32172Ck1.m111760a(C32172Ck1.EnumC1165b.AppEvents, new C17220d());
                C32172Ck1.m111760a(C32172Ck1.EnumC1165b.ChromeCustomTabsPrefetching, new C17221e());
                C32172Ck1.m111760a(C32172Ck1.EnumC1165b.IgnoreAppSwitchToLoggedOut, new C17222f());
                m52731o().execute(new FutureTask(new CallableC17223g(interfaceC17226j, context)));
                return;
            }
            throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
    }

    /* renamed from: F */
    public static void m52748F(boolean z) {
        C17227b.m52699q(z);
    }

    /* renamed from: G */
    public static void m52747G(boolean z) {
        C17227b.m52698r(z);
        if (z) {
            m52743c();
        }
    }

    /* renamed from: H */
    public static void m52746H(boolean z) {
        f69434j = z;
    }

    /* renamed from: c */
    public static void m52743c() {
        f69444t = Boolean.TRUE;
    }

    /* renamed from: d */
    public static boolean m52742d() {
        return C17227b.m52711e();
    }

    /* renamed from: e */
    public static Context m52741e() {
        C48817sj6.m13763o();
        return f69437m;
    }

    /* renamed from: f */
    public static String m52740f() {
        C48817sj6.m13763o();
        return f69428d;
    }

    /* renamed from: g */
    public static String m52739g() {
        C48817sj6.m13763o();
        return f69429e;
    }

    /* renamed from: h */
    public static String m52738h(Context context) {
        PackageManager packageManager;
        if (TD0.m84203d(C17216a.class)) {
            return null;
        }
        try {
            C48817sj6.m13763o();
            if (context == null || (packageManager = context.getPackageManager()) == null) {
                return null;
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 64);
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr != null && signatureArr.length != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(packageInfo.signatures[0].toByteArray());
                    return Base64.encodeToString(messageDigest.digest(), 9);
                }
            } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            }
            return null;
        } catch (Throwable th) {
            TD0.m84205b(th, C17216a.class);
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m52737i() {
        return C17227b.m52710f();
    }

    /* renamed from: j */
    public static boolean m52736j() {
        return C17227b.m52709g();
    }

    /* renamed from: k */
    public static File m52735k() {
        C48817sj6.m13763o();
        return f69436l.m40418c();
    }

    /* renamed from: l */
    public static int m52734l() {
        C48817sj6.m13763o();
        return f69438n;
    }

    /* renamed from: m */
    public static String m52733m() {
        C48817sj6.m13763o();
        return f69430f;
    }

    /* renamed from: n */
    public static boolean m52732n() {
        return C17227b.m52708h();
    }

    /* renamed from: o */
    public static Executor m52731o() {
        synchronized (f69439o) {
            if (f69427c == null) {
                f69427c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return f69427c;
    }

    /* renamed from: p */
    public static String m52730p() {
        return f69432h;
    }

    /* renamed from: q */
    public static String m52729q() {
        C52364yi6.m2853Y(f69425a, String.format("getGraphApiVersion: %s", f69440p));
        return f69440p;
    }

    /* renamed from: r */
    public static String m52728r() {
        String str;
        AccessToken m52920c = AccessToken.m52920c();
        if (m52920c != null) {
            str = m52920c.m52915i();
        } else {
            str = null;
        }
        if (str == null) {
            return f69432h;
        }
        if (str.equals("gaming")) {
            return f69432h.replace("facebook.com", "fb.gg");
        }
        return f69432h;
    }

    /* renamed from: s */
    public static boolean m52727s(Context context) {
        C48817sj6.m13763o();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* renamed from: t */
    public static long m52726t() {
        C48817sj6.m13763o();
        return f69433i.get();
    }

    /* renamed from: u */
    public static String m52725u() {
        return "11.1.0";
    }

    /* renamed from: v */
    public static boolean m52724v() {
        return f69434j;
    }

    /* renamed from: w */
    public static synchronized boolean m52723w() {
        boolean booleanValue;
        synchronized (C17216a.class) {
            booleanValue = f69444t.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: x */
    public static boolean m52722x() {
        return f69443s.get();
    }

    /* renamed from: y */
    public static boolean m52721y() {
        return f69435k;
    }

    /* renamed from: z */
    public static boolean m52720z(EnumC36034Sx2 enumC36034Sx2) {
        boolean z;
        HashSet<EnumC36034Sx2> hashSet = f69426b;
        synchronized (hashSet) {
            if (m52724v() && hashSet.contains(enumC36034Sx2)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
