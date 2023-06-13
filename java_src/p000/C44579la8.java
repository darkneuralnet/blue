package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.internal.zzq;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;
/* renamed from: la8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44579la8 extends AbstractC51140we8 {

    /* renamed from: c */
    public String f96363c;

    /* renamed from: d */
    public String f96364d;

    /* renamed from: e */
    public int f96365e;

    /* renamed from: f */
    public String f96366f;

    /* renamed from: g */
    public String f96367g;

    /* renamed from: h */
    public long f96368h;

    /* renamed from: i */
    public final long f96369i;

    /* renamed from: j */
    public List f96370j;

    /* renamed from: k */
    public String f96371k;

    /* renamed from: l */
    public int f96372l;

    /* renamed from: m */
    public String f96373m;

    /* renamed from: n */
    public String f96374n;

    /* renamed from: o */
    public String f96375o;

    /* renamed from: p */
    public long f96376p;

    /* renamed from: q */
    public String f96377q;

    public C44579la8(C35248Pn8 c35248Pn8, long j) {
        super(c35248Pn8);
        this.f96376p = 0L;
        this.f96377q = null;
        this.f96369i = j;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(1:3)(6:65|66|(1:68)(2:83|(1:85))|69|70|(20:72|(1:74)(1:81)|76|77|5|(1:64)(1:9)|10|11|13|(1:15)|16|17|(1:19)(1:53)|20|(3:22|(1:24)(1:26)|25)|(3:28|(1:30)(1:33)|31)|34|(3:36|(1:38)(3:45|(3:48|(1:50)|46)|51)|(2:40|41)(2:43|44))|52|(0)(0)))|4|5|(1:7)|64|10|11|13|(0)|16|17|(0)(0)|20|(0)|(0)|34|(0)|52|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01db, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01dc, code lost:
        r11.f100966a.mo22258a().m106893o().m42706c("Fetching Google App Id failed with exception. appId", p000.C32809Fc8.m106885w(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0194 A[Catch: IllegalStateException -> 0x01db, TryCatch #3 {IllegalStateException -> 0x01db, blocks: (B:46:0x0172, B:50:0x018c, B:52:0x0194, B:56:0x01b2, B:55:0x01ae, B:58:0x01bc, B:60:0x01d2, B:62:0x01d7, B:61:0x01d5), top: B:90:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bc A[Catch: IllegalStateException -> 0x01db, TryCatch #3 {IllegalStateException -> 0x01db, blocks: (B:46:0x0172, B:50:0x018c, B:52:0x0194, B:56:0x01b2, B:55:0x01ae, B:58:0x01bc, B:60:0x01d2, B:62:0x01d7, B:61:0x01d5), top: B:90:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024c  */
    @Override // p000.AbstractC51140we8
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6548i() {
        String str;
        String str2;
        PackageInfo packageInfo;
        boolean z;
        int m89753u;
        List<String> m37505v;
        String m30953c;
        String str3;
        String packageName = this.f100966a.mo22255z().getPackageName();
        PackageManager packageManager = this.f100966a.mo22255z().getPackageManager();
        int i = Integer.MIN_VALUE;
        String str4 = "";
        String str5 = "Unknown";
        String str6 = "unknown";
        if (packageManager == null) {
            this.f100966a.mo22258a().m106893o().m42707b("PackageManager is null, app identity information might be inaccurate. appId", C32809Fc8.m106885w(packageName));
        } else {
            try {
                str6 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                this.f100966a.mo22258a().m106893o().m42707b("Error retrieving app installer package name. appId", C32809Fc8.m106885w(packageName));
            }
            if (str6 == null) {
                str6 = "manual_install";
            } else if ("com.android.vending".equals(str6)) {
                str6 = "";
            }
            try {
                packageInfo = packageManager.getPackageInfo(this.f100966a.mo22255z().getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str = "Unknown";
            }
            if (packageInfo != null) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                if (TextUtils.isEmpty(applicationLabel)) {
                    str2 = "Unknown";
                } else {
                    str2 = applicationLabel.toString();
                }
                try {
                    str5 = packageInfo.versionName;
                    i = packageInfo.versionCode;
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = str5;
                    str5 = str2;
                    this.f100966a.mo22258a().m106893o().m42706c("Error retrieving package info. appId, appName", C32809Fc8.m106885w(packageName), str5);
                    str2 = str5;
                    str5 = str;
                    this.f96363c = packageName;
                    this.f96366f = str6;
                    this.f96364d = str5;
                    this.f96365e = i;
                    this.f96367g = str2;
                    this.f96368h = 0L;
                    if (TextUtils.isEmpty(this.f100966a.m89775O())) {
                    }
                    z = false;
                    m89753u = this.f100966a.m89753u();
                    switch (m89753u) {
                    }
                    this.f96373m = "";
                    this.f96374n = "";
                    this.f100966a.mo22259C();
                    if (z) {
                    }
                    m30953c = C43195jE8.m30953c(this.f100966a.mo22255z(), "google_app_id", this.f100966a.m89772R());
                    if (!TextUtils.isEmpty(m30953c)) {
                    }
                    this.f96373m = str4;
                    if (!TextUtils.isEmpty(m30953c)) {
                    }
                    if (m89753u == 0) {
                    }
                    this.f96370j = null;
                    this.f100966a.mo22259C();
                    m37505v = this.f100966a.m89751w().m37505v("analytics.safelisted_events");
                    if (m37505v != null) {
                    }
                    this.f96370j = m37505v;
                    if (packageManager == null) {
                    }
                }
                this.f96363c = packageName;
                this.f96366f = str6;
                this.f96364d = str5;
                this.f96365e = i;
                this.f96367g = str2;
                this.f96368h = 0L;
                if (TextUtils.isEmpty(this.f100966a.m89775O()) && "am".equals(this.f100966a.m89774P())) {
                    z = true;
                } else {
                    z = false;
                }
                m89753u = this.f100966a.m89753u();
                switch (m89753u) {
                    case 0:
                        this.f100966a.mo22258a().m106889s().m42708a("App measurement collection enabled");
                        break;
                    case 1:
                        this.f100966a.mo22258a().m106890r().m42708a("App measurement deactivated via the manifest");
                        break;
                    case 2:
                        this.f100966a.mo22258a().m106889s().m42708a("App measurement deactivated via the init parameters");
                        break;
                    case 3:
                        this.f100966a.mo22258a().m106890r().m42708a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        break;
                    case 4:
                        this.f100966a.mo22258a().m106890r().m42708a("App measurement disabled via the manifest");
                        break;
                    case 5:
                        this.f100966a.mo22258a().m106889s().m42708a("App measurement disabled via the init parameters");
                        break;
                    case 6:
                        this.f100966a.mo22258a().m106887u().m42708a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        break;
                    case 7:
                        this.f100966a.mo22258a().m106890r().m42708a("App measurement disabled via the global data collection setting");
                        break;
                    default:
                        this.f100966a.mo22258a().m106890r().m42708a("App measurement disabled due to denied storage consent");
                        break;
                }
                this.f96373m = "";
                this.f96374n = "";
                this.f100966a.mo22259C();
                if (z) {
                    this.f96374n = this.f100966a.m89775O();
                }
                m30953c = C43195jE8.m30953c(this.f100966a.mo22255z(), "google_app_id", this.f100966a.m89772R());
                if (!TextUtils.isEmpty(m30953c)) {
                    str4 = m30953c;
                }
                this.f96373m = str4;
                if (!TextUtils.isEmpty(m30953c)) {
                    Context mo22255z = this.f100966a.mo22255z();
                    String m89772R = this.f100966a.m89772R();
                    Preconditions.checkNotNull(mo22255z);
                    Resources resources = mo22255z.getResources();
                    if (TextUtils.isEmpty(m89772R)) {
                        m89772R = C38742bl8.m64036a(mo22255z);
                    }
                    this.f96374n = C38742bl8.m64035b("admob_app_id", resources, m89772R);
                }
                if (m89753u == 0) {
                    C40448ec8 m106889s = this.f100966a.mo22258a().m106889s();
                    String str7 = this.f96363c;
                    if (TextUtils.isEmpty(this.f96373m)) {
                        str3 = this.f96374n;
                    } else {
                        str3 = this.f96373m;
                    }
                    m106889s.m42706c("App measurement enabled for app package, google app id", str7, str3);
                }
                this.f96370j = null;
                this.f100966a.mo22259C();
                m37505v = this.f100966a.m89751w().m37505v("analytics.safelisted_events");
                if (m37505v != null) {
                    if (m37505v.isEmpty()) {
                        this.f100966a.mo22258a().m106887u().m42708a("Safelisted event list is empty. Ignoring");
                    } else {
                        for (String str8 : m37505v) {
                            if (!this.f100966a.m89776N().m92087R("safelisted event", str8)) {
                            }
                        }
                    }
                    if (packageManager == null) {
                        this.f96372l = InstantApps.isInstantApp(this.f100966a.mo22255z()) ? 1 : 0;
                        return;
                    } else {
                        this.f96372l = 0;
                        return;
                    }
                }
                this.f96370j = m37505v;
                if (packageManager == null) {
                }
            }
        }
        str2 = "Unknown";
        this.f96363c = packageName;
        this.f96366f = str6;
        this.f96364d = str5;
        this.f96365e = i;
        this.f96367g = str2;
        this.f96368h = 0L;
        if (TextUtils.isEmpty(this.f100966a.m89775O())) {
        }
        z = false;
        m89753u = this.f100966a.m89753u();
        switch (m89753u) {
        }
        this.f96373m = "";
        this.f96374n = "";
        this.f100966a.mo22259C();
        if (z) {
        }
        m30953c = C43195jE8.m30953c(this.f100966a.mo22255z(), "google_app_id", this.f100966a.m89772R());
        if (!TextUtils.isEmpty(m30953c)) {
        }
        this.f96373m = str4;
        if (!TextUtils.isEmpty(m30953c)) {
        }
        if (m89753u == 0) {
        }
        this.f96370j = null;
        this.f100966a.mo22259C();
        m37505v = this.f100966a.m89751w().m37505v("analytics.safelisted_events");
        if (m37505v != null) {
        }
        this.f96370j = m37505v;
        if (packageManager == null) {
        }
    }

    @Override // p000.AbstractC51140we8
    /* renamed from: k */
    public final boolean mo6546k() {
        return true;
    }

    /* renamed from: l */
    public final int m27130l() {
        m6551f();
        return this.f96372l;
    }

    /* renamed from: m */
    public final int m27129m() {
        m6551f();
        return this.f96365e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c9  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzq m27128n(String str) {
        String str2;
        Class<?> loadClass;
        Object invoke;
        long m564a;
        String str3;
        long min;
        Boolean m37510q;
        Boolean valueOf;
        String str4;
        Boolean m37510q2;
        boolean booleanValue;
        long j;
        int i;
        int i2;
        long j2;
        ApplicationInfo applicationInfo;
        mo19953e();
        String m27126p = m27126p();
        String m27125q = m27125q();
        m6551f();
        String str5 = this.f96364d;
        m6551f();
        long j3 = this.f96365e;
        m6551f();
        Preconditions.checkNotNull(this.f96366f);
        String str6 = this.f96366f;
        this.f100966a.m89751w().m37513n();
        m6551f();
        mo19953e();
        long j4 = this.f96368h;
        if (j4 == 0) {
            OW8 m89776N = this.f100966a.m89776N();
            Context mo22255z = this.f100966a.mo22255z();
            String packageName = this.f100966a.mo22255z().getPackageName();
            m89776N.mo19953e();
            Preconditions.checkNotNull(mo22255z);
            Preconditions.checkNotEmpty(packageName);
            PackageManager packageManager = mo22255z.getPackageManager();
            MessageDigest m92056q = OW8.m92056q();
            long j5 = -1;
            if (m92056q == null) {
                m89776N.f100966a.mo22258a().m106893o().m42708a("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (!m89776N.m92082W(mo22255z, packageName)) {
                            Signature[] signatureArr = Wrappers.packageManager(mo22255z).getPackageInfo(m89776N.f100966a.mo22255z().getPackageName(), 64).signatures;
                            if (signatureArr != null && signatureArr.length > 0) {
                                long m92051s0 = OW8.m92051s0(m92056q.digest(signatureArr[0].toByteArray()));
                                j5 = m92051s0;
                                m89776N = m92051s0;
                            } else {
                                m89776N.f100966a.mo22258a().m106888t().m42708a("Could not get signatures");
                                m89776N = m89776N;
                            }
                        } else {
                            j5 = 0;
                            m89776N = m89776N;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        m89776N.f100966a.mo22258a().m106893o().m42707b("Package name not found", e);
                    }
                }
                j4 = 0;
                this.f96368h = j4;
            }
            j4 = j5;
            this.f96368h = j4;
        }
        long j6 = j4;
        boolean m89762l = this.f100966a.m89762l();
        boolean z = !this.f100966a.m89784F().f16078q;
        mo19953e();
        if (this.f100966a.m89762l()) {
            Fm9.m106589b();
            if (this.f100966a.m89751w().m37502y(null, C37795a98.f49968e0)) {
                this.f100966a.mo22258a().m106889s().m42708a("Disabled IID for tests.");
            } else {
                try {
                    loadClass = this.f100966a.mo22255z().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                }
                if (loadClass != null) {
                    try {
                        invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.f100966a.mo22255z());
                    } catch (Exception unused2) {
                        this.f100966a.mo22258a().m106886v().m42708a("Failed to obtain Firebase Analytics instance");
                    }
                    if (invoke != null) {
                        try {
                            str2 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                        } catch (Exception unused3) {
                            this.f100966a.mo22258a().m106887u().m42708a("Failed to retrieve Firebase Instance Id");
                        }
                        C35248Pn8 c35248Pn8 = this.f100966a;
                        m564a = c35248Pn8.m89784F().f16066e.m564a();
                        if (m564a == 0) {
                            str3 = m27126p;
                            min = c35248Pn8.f29070G;
                        } else {
                            str3 = m27126p;
                            min = Math.min(c35248Pn8.f29070G, m564a);
                        }
                        m6551f();
                        int i3 = this.f96372l;
                        boolean m37503x = this.f100966a.m89751w().m37503x();
                        C33556Ih8 m89784F = this.f100966a.m89784F();
                        m89784F.mo19953e();
                        boolean z2 = m89784F.m101802l().getBoolean("deferred_analytics_collection", false);
                        m6551f();
                        String str7 = this.f96374n;
                        if (this.f100966a.m89751w().m37510q("google_analytics_default_allow_ad_personalization_signals") == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(!m37510q.booleanValue());
                        }
                        long j7 = this.f96369i;
                        List list = this.f96370j;
                        String m76358h = this.f100966a.m89784F().m101800n().m76358h();
                        if (this.f96371k == null) {
                            this.f96371k = this.f100966a.m89776N().m92062n();
                        }
                        String str8 = this.f96371k;
                        C49423tk9.m11813b();
                        if (this.f100966a.m89751w().m37502y(null, C37795a98.f49990p0)) {
                            mo19953e();
                            if (this.f96376p != 0) {
                                long currentTimeMillis = this.f100966a.mo22260A().currentTimeMillis() - this.f96376p;
                                if (this.f96375o != null && currentTimeMillis > CoreConstants.MILLIS_IN_ONE_DAY && this.f96377q == null) {
                                    m27123s();
                                }
                            }
                            if (this.f96375o == null) {
                                m27123s();
                            }
                            str4 = this.f96375o;
                        } else {
                            str4 = null;
                        }
                        C41723gl7 m89751w = this.f100966a.m89751w();
                        C35248Pn8 c35248Pn82 = m89751w.f100966a;
                        m37510q2 = m89751w.m37510q("google_analytics_sgtm_upload_enabled");
                        if (m37510q2 == null) {
                            booleanValue = false;
                        } else {
                            booleanValue = m37510q2.booleanValue();
                        }
                        Yg9.m74465b();
                        if (this.f100966a.m89751w().m37502y(null, C37795a98.f49934F0)) {
                            OW8 m89776N2 = this.f100966a.m89776N();
                            String m27126p2 = m27126p();
                            if (m89776N2.f100966a.mo22255z().getPackageManager() == null) {
                                j2 = 0;
                            } else {
                                try {
                                    i = 0;
                                    try {
                                        applicationInfo = Wrappers.packageManager(m89776N2.f100966a.mo22255z()).getApplicationInfo(m27126p2, 0);
                                    } catch (PackageManager.NameNotFoundException unused4) {
                                        m89776N2.f100966a.mo22259C();
                                        m89776N2.f100966a.mo22258a().m106890r().m42707b("PackageManager failed to find running app: app_id", m27126p2);
                                        i2 = i;
                                        j2 = i2;
                                        j = j2;
                                        return new zzq(str3, m27125q, str5, j3, str6, 77000L, j6, str, m89762l, z, str2, 0L, min, i3, m37503x, z2, str7, valueOf, j7, list, (String) null, m76358h, str8, str4, booleanValue, j);
                                    }
                                } catch (PackageManager.NameNotFoundException unused5) {
                                    i = 0;
                                }
                                if (applicationInfo != null) {
                                    i2 = applicationInfo.targetSdkVersion;
                                    j2 = i2;
                                }
                                i2 = i;
                                j2 = i2;
                            }
                            j = j2;
                        } else {
                            j = 0;
                        }
                        return new zzq(str3, m27125q, str5, j3, str6, 77000L, j6, str, m89762l, z, str2, 0L, min, i3, m37503x, z2, str7, valueOf, j7, list, (String) null, m76358h, str8, str4, booleanValue, j);
                    }
                    str2 = null;
                    C35248Pn8 c35248Pn83 = this.f100966a;
                    m564a = c35248Pn83.m89784F().f16066e.m564a();
                    if (m564a == 0) {
                    }
                    m6551f();
                    int i32 = this.f96372l;
                    boolean m37503x2 = this.f100966a.m89751w().m37503x();
                    C33556Ih8 m89784F2 = this.f100966a.m89784F();
                    m89784F2.mo19953e();
                    boolean z22 = m89784F2.m101802l().getBoolean("deferred_analytics_collection", false);
                    m6551f();
                    String str72 = this.f96374n;
                    if (this.f100966a.m89751w().m37510q("google_analytics_default_allow_ad_personalization_signals") == null) {
                    }
                    long j72 = this.f96369i;
                    List list2 = this.f96370j;
                    String m76358h2 = this.f100966a.m89784F().m101800n().m76358h();
                    if (this.f96371k == null) {
                    }
                    String str82 = this.f96371k;
                    C49423tk9.m11813b();
                    if (this.f100966a.m89751w().m37502y(null, C37795a98.f49990p0)) {
                    }
                    C41723gl7 m89751w2 = this.f100966a.m89751w();
                    C35248Pn8 c35248Pn822 = m89751w2.f100966a;
                    m37510q2 = m89751w2.m37510q("google_analytics_sgtm_upload_enabled");
                    if (m37510q2 == null) {
                    }
                    Yg9.m74465b();
                    if (this.f100966a.m89751w().m37502y(null, C37795a98.f49934F0)) {
                    }
                    return new zzq(str3, m27125q, str5, j3, str6, 77000L, j6, str, m89762l, z, str2, 0L, min, i32, m37503x2, z22, str72, valueOf, j72, list2, (String) null, m76358h2, str82, str4, booleanValue, j);
                }
            }
        }
        str2 = null;
        C35248Pn8 c35248Pn832 = this.f100966a;
        m564a = c35248Pn832.m89784F().f16066e.m564a();
        if (m564a == 0) {
        }
        m6551f();
        int i322 = this.f96372l;
        boolean m37503x22 = this.f100966a.m89751w().m37503x();
        C33556Ih8 m89784F22 = this.f100966a.m89784F();
        m89784F22.mo19953e();
        boolean z222 = m89784F22.m101802l().getBoolean("deferred_analytics_collection", false);
        m6551f();
        String str722 = this.f96374n;
        if (this.f100966a.m89751w().m37510q("google_analytics_default_allow_ad_personalization_signals") == null) {
        }
        long j722 = this.f96369i;
        List list22 = this.f96370j;
        String m76358h22 = this.f100966a.m89784F().m101800n().m76358h();
        if (this.f96371k == null) {
        }
        String str822 = this.f96371k;
        C49423tk9.m11813b();
        if (this.f100966a.m89751w().m37502y(null, C37795a98.f49990p0)) {
        }
        C41723gl7 m89751w22 = this.f100966a.m89751w();
        C35248Pn8 c35248Pn8222 = m89751w22.f100966a;
        m37510q2 = m89751w22.m37510q("google_analytics_sgtm_upload_enabled");
        if (m37510q2 == null) {
        }
        Yg9.m74465b();
        if (this.f100966a.m89751w().m37502y(null, C37795a98.f49934F0)) {
        }
        return new zzq(str3, m27125q, str5, j3, str6, 77000L, j6, str, m89762l, z, str2, 0L, min, i322, m37503x22, z222, str722, valueOf, j722, list22, (String) null, m76358h22, str822, str4, booleanValue, j);
    }

    /* renamed from: o */
    public final String m27127o() {
        m6551f();
        return this.f96374n;
    }

    /* renamed from: p */
    public final String m27126p() {
        m6551f();
        Preconditions.checkNotNull(this.f96363c);
        return this.f96363c;
    }

    /* renamed from: q */
    public final String m27125q() {
        mo19953e();
        m6551f();
        Preconditions.checkNotNull(this.f96373m);
        return this.f96373m;
    }

    /* renamed from: r */
    public final List m27124r() {
        return this.f96370j;
    }

    /* renamed from: s */
    public final void m27123s() {
        String format;
        String str;
        mo19953e();
        if (!this.f100966a.m89784F().m101800n().m76357i(EnumC39344cm7.ANALYTICS_STORAGE)) {
            this.f100966a.mo22258a().m106894n().m42708a("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            this.f100966a.m89776N().m92054r().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        C40448ec8 m106894n = this.f100966a.mo22258a().m106894n();
        Object[] objArr = new Object[1];
        if (format == null) {
            str = "null";
        } else {
            str = "not null";
        }
        objArr[0] = str;
        m106894n.m42708a(String.format("Resetting session stitching token to %s", objArr));
        this.f96375o = format;
        this.f96376p = this.f100966a.mo22260A().currentTimeMillis();
    }

    /* renamed from: t */
    public final boolean m27122t(String str) {
        String str2 = this.f96377q;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.f96377q = str;
        return z;
    }
}
