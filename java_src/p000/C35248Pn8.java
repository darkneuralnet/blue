package p000;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcl;
import com.stripe.android.networking.FraudDetectionData;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Pn8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35248Pn8 implements InterfaceC35527Qs8 {

    /* renamed from: H */
    public static volatile C35248Pn8 f29063H;

    /* renamed from: A */
    public volatile Boolean f29064A;
    @VisibleForTesting

    /* renamed from: B */
    public Boolean f29065B;
    @VisibleForTesting

    /* renamed from: C */
    public Boolean f29066C;

    /* renamed from: D */
    public volatile boolean f29067D;

    /* renamed from: E */
    public int f29068E;
    @VisibleForTesting

    /* renamed from: G */
    public final long f29070G;

    /* renamed from: a */
    public final Context f29071a;

    /* renamed from: b */
    public final String f29072b;

    /* renamed from: c */
    public final String f29073c;

    /* renamed from: d */
    public final String f29074d;

    /* renamed from: e */
    public final boolean f29075e;

    /* renamed from: f */
    public final C32844Fg7 f29076f;

    /* renamed from: g */
    public final C41723gl7 f29077g;

    /* renamed from: h */
    public final C33556Ih8 f29078h;

    /* renamed from: i */
    public final C32809Fc8 f29079i;

    /* renamed from: j */
    public final C39965dn8 f29080j;

    /* renamed from: k */
    public final C39144cR8 f29081k;

    /* renamed from: l */
    public final OW8 f29082l;

    /* renamed from: m */
    public final C47554qb8 f29083m;

    /* renamed from: n */
    public final Clock f29084n;

    /* renamed from: o */
    public final C45585nG8 f29085o;

    /* renamed from: p */
    public final RC8 f29086p;

    /* renamed from: q */
    public final C38020aY7 f29087q;

    /* renamed from: r */
    public final ND8 f29088r;

    /* renamed from: s */
    public final String f29089s;

    /* renamed from: t */
    public C34897Oa8 f29090t;

    /* renamed from: u */
    public QM8 f29091u;

    /* renamed from: v */
    public C33897Jt7 f29092v;

    /* renamed from: w */
    public C44579la8 f29093w;

    /* renamed from: y */
    public Boolean f29095y;

    /* renamed from: z */
    public long f29096z;

    /* renamed from: x */
    public boolean f29094x = false;

    /* renamed from: F */
    public final AtomicInteger f29069F = new AtomicInteger(0);

    public C35248Pn8(C33214Gv8 c33214Gv8) {
        long currentTimeMillis;
        Bundle bundle;
        boolean z = false;
        Preconditions.checkNotNull(c33214Gv8);
        Context context = c33214Gv8.f12629a;
        C32844Fg7 c32844Fg7 = new C32844Fg7(context);
        this.f29076f = c32844Fg7;
        C41360g88.f81679a = c32844Fg7;
        this.f29071a = context;
        this.f29072b = c33214Gv8.f12630b;
        this.f29073c = c33214Gv8.f12631c;
        this.f29074d = c33214Gv8.f12632d;
        this.f29075e = c33214Gv8.f12636h;
        this.f29064A = c33214Gv8.f12633e;
        this.f29089s = c33214Gv8.f12638j;
        this.f29067D = true;
        zzcl zzclVar = c33214Gv8.f12635g;
        if (zzclVar != null && (bundle = zzclVar.f70572h) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f29065B = (Boolean) obj;
            }
            Object obj2 = zzclVar.f70572h.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f29066C = (Boolean) obj2;
            }
        }
        AbstractC44354lB8.m27683d(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.f29084n = defaultClock;
        Long l = c33214Gv8.f12637i;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = defaultClock.currentTimeMillis();
        }
        this.f29070G = currentTimeMillis;
        this.f29077g = new C41723gl7(this);
        C33556Ih8 c33556Ih8 = new C33556Ih8(this);
        c33556Ih8.m113418i();
        this.f29078h = c33556Ih8;
        C32809Fc8 c32809Fc8 = new C32809Fc8(this);
        c32809Fc8.m113418i();
        this.f29079i = c32809Fc8;
        OW8 ow8 = new OW8(this);
        ow8.m113418i();
        this.f29082l = ow8;
        this.f29083m = new C47554qb8(new C48939sv8(c33214Gv8, this));
        this.f29087q = new C38020aY7(this);
        C45585nG8 c45585nG8 = new C45585nG8(this);
        c45585nG8.m6550g();
        this.f29085o = c45585nG8;
        RC8 rc8 = new RC8(this);
        rc8.m6550g();
        this.f29086p = rc8;
        C39144cR8 c39144cR8 = new C39144cR8(this);
        c39144cR8.m6550g();
        this.f29081k = c39144cR8;
        ND8 nd8 = new ND8(this);
        nd8.m113418i();
        this.f29088r = nd8;
        C39965dn8 c39965dn8 = new C39965dn8(this);
        c39965dn8.m113418i();
        this.f29080j = c39965dn8;
        zzcl zzclVar2 = c33214Gv8.f12635g;
        z = (zzclVar2 == null || zzclVar2.f70567c == 0) ? true : z;
        if (context.getApplicationContext() instanceof Application) {
            RC8 m89781I = m89781I();
            if (m89781I.f100966a.f29071a.getApplicationContext() instanceof Application) {
                Application application = (Application) m89781I.f100966a.f29071a.getApplicationContext();
                if (m89781I.f31673c == null) {
                    m89781I.f31673c = new GC8(m89781I);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(m89781I.f31673c);
                    application.registerActivityLifecycleCallbacks(m89781I.f31673c);
                    m89781I.f100966a.mo22258a().m106889s().m42708a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo22258a().m106888t().m42708a("Application context is not an Application");
        }
        c39965dn8.m43695w(new RunnableC31972Bn8(this, c33214Gv8));
    }

    /* renamed from: H */
    public static C35248Pn8 m89782H(Context context, zzcl zzclVar, Long l) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.f70570f == null || zzclVar.f70571g == null)) {
            zzclVar = new zzcl(zzclVar.f70566b, zzclVar.f70567c, zzclVar.f70568d, zzclVar.f70569e, null, null, zzclVar.f70572h, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f29063H == null) {
            synchronized (C35248Pn8.class) {
                if (f29063H == null) {
                    f29063H = new C35248Pn8(new C33214Gv8(context, zzclVar, l));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.f70572h) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(f29063H);
            f29063H.f29064A = Boolean.valueOf(zzclVar.f70572h.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(f29063H);
        return f29063H;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m89771b(C35248Pn8 c35248Pn8, C33214Gv8 c33214Gv8) {
        c35248Pn8.mo22257c().mo19953e();
        c35248Pn8.f29077g.m37507t();
        C33897Jt7 c33897Jt7 = new C33897Jt7(c35248Pn8);
        c33897Jt7.m113418i();
        c35248Pn8.f29092v = c33897Jt7;
        C44579la8 c44579la8 = new C44579la8(c35248Pn8, c33214Gv8.f12634f);
        c44579la8.m6550g();
        c35248Pn8.f29093w = c44579la8;
        C34897Oa8 c34897Oa8 = new C34897Oa8(c35248Pn8);
        c34897Oa8.m6550g();
        c35248Pn8.f29090t = c34897Oa8;
        QM8 qm8 = new QM8(c35248Pn8);
        qm8.m6550g();
        c35248Pn8.f29091u = qm8;
        c35248Pn8.f29082l.m113417j();
        c35248Pn8.f29078h.m113417j();
        c35248Pn8.f29093w.m6549h();
        C40448ec8 m106890r = c35248Pn8.mo22258a().m106890r();
        c35248Pn8.f29077g.m37513n();
        m106890r.m42707b("App measurement initialized, version", 77000L);
        c35248Pn8.mo22258a().m106890r().m42708a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String m27126p = c44579la8.m27126p();
        if (TextUtils.isEmpty(c35248Pn8.f29072b)) {
            if (c35248Pn8.m89776N().m92084U(m27126p)) {
                c35248Pn8.mo22258a().m106890r().m42708a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                c35248Pn8.mo22258a().m106890r().m42708a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(m27126p)));
            }
        }
        c35248Pn8.mo22258a().m106894n().m42708a("Debug-level message logging enabled");
        if (c35248Pn8.f29068E != c35248Pn8.f29069F.get()) {
            c35248Pn8.mo22258a().m106893o().m42706c("Not all components initialized", Integer.valueOf(c35248Pn8.f29068E), Integer.valueOf(c35248Pn8.f29069F.get()));
        }
        c35248Pn8.f29094x = true;
    }

    /* renamed from: q */
    public static final void m89757q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: r */
    public static final void m89756r(C45945ns8 c45945ns8) {
        if (c45945ns8 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: s */
    public static final void m89755s(AbstractC51140we8 abstractC51140we8) {
        if (abstractC51140we8 != null) {
            if (abstractC51140we8.m6547j()) {
                return;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC51140we8.getClass())));
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: t */
    public static final void m89754t(AbstractC32017Bs8 abstractC32017Bs8) {
        if (abstractC32017Bs8 != null) {
            if (abstractC32017Bs8.m113416k()) {
                return;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC32017Bs8.getClass())));
        }
        throw new IllegalStateException("Component not created");
    }

    @Override // p000.InterfaceC35527Qs8
    /* renamed from: A */
    public final Clock mo22260A() {
        return this.f29084n;
    }

    /* renamed from: B */
    public final C34897Oa8 m89787B() {
        m89755s(this.f29090t);
        return this.f29090t;
    }

    @Override // p000.InterfaceC35527Qs8
    /* renamed from: C */
    public final C32844Fg7 mo22259C() {
        return this.f29076f;
    }

    /* renamed from: D */
    public final C47554qb8 m89786D() {
        return this.f29083m;
    }

    /* renamed from: E */
    public final C32809Fc8 m89785E() {
        C32809Fc8 c32809Fc8 = this.f29079i;
        if (c32809Fc8 == null || !c32809Fc8.m113416k()) {
            return null;
        }
        return c32809Fc8;
    }

    /* renamed from: F */
    public final C33556Ih8 m89784F() {
        m89756r(this.f29078h);
        return this.f29078h;
    }

    /* renamed from: G */
    public final C39965dn8 m89783G() {
        return this.f29080j;
    }

    /* renamed from: I */
    public final RC8 m89781I() {
        m89755s(this.f29086p);
        return this.f29086p;
    }

    /* renamed from: J */
    public final ND8 m89780J() {
        m89754t(this.f29088r);
        return this.f29088r;
    }

    /* renamed from: K */
    public final C45585nG8 m89779K() {
        m89755s(this.f29085o);
        return this.f29085o;
    }

    /* renamed from: L */
    public final QM8 m89778L() {
        m89755s(this.f29091u);
        return this.f29091u;
    }

    /* renamed from: M */
    public final C39144cR8 m89777M() {
        m89755s(this.f29081k);
        return this.f29081k;
    }

    /* renamed from: N */
    public final OW8 m89776N() {
        m89756r(this.f29082l);
        return this.f29082l;
    }

    /* renamed from: O */
    public final String m89775O() {
        return this.f29072b;
    }

    /* renamed from: P */
    public final String m89774P() {
        return this.f29073c;
    }

    /* renamed from: Q */
    public final String m89773Q() {
        return this.f29074d;
    }

    /* renamed from: R */
    public final String m89772R() {
        return this.f29089s;
    }

    @Override // p000.InterfaceC35527Qs8
    /* renamed from: a */
    public final C32809Fc8 mo22258a() {
        m89754t(this.f29079i);
        return this.f29079i;
    }

    @Override // p000.InterfaceC35527Qs8
    /* renamed from: c */
    public final C39965dn8 mo22257c() {
        m89754t(this.f29080j);
        return this.f29080j;
    }

    /* renamed from: d */
    public final void m89770d() {
        this.f29069F.incrementAndGet();
    }

    /* renamed from: e */
    public final /* synthetic */ void m89769e(String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i != 200 && i != 204) {
            if (i == 304) {
                i = 304;
            }
            mo22258a().m106888t().m42706c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
        }
        if (th == null) {
            m89784F().f16080s.m79589a(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", "");
                    String optString2 = jSONObject.optString("gclid", "");
                    double optDouble = jSONObject.optDouble(FraudDetectionData.KEY_TIMESTAMP, 0.0d);
                    if (TextUtils.isEmpty(optString)) {
                        mo22258a().m106894n().m42708a("Deferred Deep Link is empty.");
                        return;
                    }
                    OW8 m89776N = m89776N();
                    C35248Pn8 c35248Pn8 = m89776N.f100966a;
                    if (!TextUtils.isEmpty(optString) && (queryIntentActivities = m89776N.f100966a.f29071a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f29086p.m87157r("auto", "_cmp", bundle);
                        OW8 m89776N2 = m89776N();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = m89776N2.f100966a.f29071a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong(FraudDetectionData.KEY_TIMESTAMP, Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    m89776N2.f100966a.f29071a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e) {
                                m89776N2.f100966a.mo22258a().m106893o().m42707b("Failed to persist Deferred Deep Link. exception", e);
                                return;
                            }
                        }
                        return;
                    }
                    mo22258a().m106888t().m42706c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                } catch (JSONException e2) {
                    mo22258a().m106893o().m42707b("Failed to parse the Deferred Deep Link response. exception", e2);
                    return;
                }
            }
            mo22258a().m106894n().m42708a("Deferred Deep Link response empty.");
            return;
        }
        mo22258a().m106888t().m42706c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    /* renamed from: f */
    public final void m89768f() {
        this.f29068E++;
    }

    /* renamed from: g */
    public final void m89767g() {
        mo22257c().mo19953e();
        m89754t(m89780J());
        String m27126p = m89749y().m27126p();
        Pair m101801m = m89784F().m101801m(m27126p);
        if (this.f29077g.m37503x() && !((Boolean) m101801m.second).booleanValue() && !TextUtils.isEmpty((CharSequence) m101801m.first)) {
            ND8 m89780J = m89780J();
            m89780J.m113419h();
            ConnectivityManager connectivityManager = (ConnectivityManager) m89780J.f100966a.f29071a.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                try {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException unused) {
                }
            }
            if (networkInfo != null && networkInfo.isConnected()) {
                OW8 m89776N = m89776N();
                m89749y().f100966a.f29077g.m37513n();
                URL m92058p = m89776N.m92058p(77000L, m27126p, (String) m101801m.first, m89784F().f16081t.m564a() - 1);
                if (m92058p != null) {
                    ND8 m89780J2 = m89780J();
                    C47081pn8 c47081pn8 = new C47081pn8(this);
                    m89780J2.mo19953e();
                    m89780J2.m113419h();
                    Preconditions.checkNotNull(m92058p);
                    Preconditions.checkNotNull(c47081pn8);
                    m89780J2.f100966a.mo22257c().m43696v(new BD8(m89780J2, m27126p, m92058p, null, null, c47081pn8));
                    return;
                }
                return;
            }
            mo22258a().m106888t().m42708a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        mo22258a().m106894n().m42708a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }

    /* renamed from: h */
    public final void m89766h(boolean z) {
        this.f29064A = Boolean.valueOf(z);
    }

    /* renamed from: i */
    public final void m89765i(boolean z) {
        mo22257c().mo19953e();
        this.f29067D = z;
    }

    /* renamed from: j */
    public final void m89764j(zzcl zzclVar) {
        C37110Xm7 c37110Xm7;
        mo22257c().mo19953e();
        C37110Xm7 m101800n = m89784F().m101800n();
        C33556Ih8 m89784F = m89784F();
        C35248Pn8 c35248Pn8 = m89784F.f100966a;
        m89784F.mo19953e();
        int i = 100;
        int i2 = m89784F.m101802l().getInt("consent_source", 100);
        C41723gl7 c41723gl7 = this.f29077g;
        C35248Pn8 c35248Pn82 = c41723gl7.f100966a;
        Boolean m37510q = c41723gl7.m37510q("google_analytics_default_allow_ad_storage");
        C41723gl7 c41723gl72 = this.f29077g;
        C35248Pn8 c35248Pn83 = c41723gl72.f100966a;
        Boolean m37510q2 = c41723gl72.m37510q("google_analytics_default_allow_analytics_storage");
        if ((m37510q != null || m37510q2 != null) && m89784F().m101794t(-10)) {
            c37110Xm7 = new C37110Xm7(m37510q, m37510q2);
            i = -10;
        } else {
            if (!TextUtils.isEmpty(m89749y().m27125q()) && (i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                m89781I().m87189G(C37110Xm7.f43902b, -10, this.f29070G);
            } else if (TextUtils.isEmpty(m89749y().m27125q()) && zzclVar != null && zzclVar.f70572h != null && m89784F().m101794t(30)) {
                c37110Xm7 = C37110Xm7.m76365a(zzclVar.f70572h);
                if (!c37110Xm7.equals(C37110Xm7.f43902b)) {
                    i = 30;
                }
            }
            c37110Xm7 = null;
        }
        if (c37110Xm7 != null) {
            m89781I().m87189G(c37110Xm7, i, this.f29070G);
            m101800n = c37110Xm7;
        }
        m89781I().m87186J(m101800n);
        if (m89784F().f16066e.m564a() == 0) {
            mo22258a().m106889s().m42707b("Persisting first open", Long.valueOf(this.f29070G));
            m89784F().f16066e.m563b(this.f29070G);
        }
        m89781I().f31684n.m101677c();
        if (!m89759o()) {
            if (m89762l()) {
                if (!m89776N().m92085T("android.permission.INTERNET")) {
                    mo22258a().m106893o().m42708a("App is missing INTERNET permission");
                }
                if (!m89776N().m92085T("android.permission.ACCESS_NETWORK_STATE")) {
                    mo22258a().m106893o().m42708a("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!Wrappers.packageManager(this.f29071a).isCallerInstantApp() && !this.f29077g.m37524G()) {
                    if (!OW8.m92078a0(this.f29071a)) {
                        mo22258a().m106893o().m42708a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!OW8.m92077b0(this.f29071a, false)) {
                        mo22258a().m106893o().m42708a("AppMeasurementService not registered/enabled");
                    }
                }
                mo22258a().m106893o().m42708a("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(m89749y().m27125q()) || !TextUtils.isEmpty(m89749y().m27127o())) {
                OW8 m89776N = m89776N();
                String m27125q = m89749y().m27125q();
                C33556Ih8 m89784F2 = m89784F();
                m89784F2.mo19953e();
                String string = m89784F2.m101802l().getString("gmp_app_id", null);
                String m27127o = m89749y().m27127o();
                C33556Ih8 m89784F3 = m89784F();
                m89784F3.mo19953e();
                if (m89776N.m92075d0(m27125q, string, m27127o, m89784F3.m101802l().getString("admob_app_id", null))) {
                    mo22258a().m106890r().m42708a("Rechecking which service to use due to a GMP App Id change");
                    C33556Ih8 m89784F4 = m89784F();
                    m89784F4.mo19953e();
                    Boolean m101799o = m89784F4.m101799o();
                    SharedPreferences.Editor edit = m89784F4.m101802l().edit();
                    edit.clear();
                    edit.apply();
                    if (m101799o != null) {
                        m89784F4.m101798p(m101799o);
                    }
                    m89787B().m92000n();
                    this.f29091u.m88564Q();
                    this.f29091u.m88565P();
                    m89784F().f16066e.m563b(this.f29070G);
                    m89784F().f16068g.m13819b(null);
                }
                C33556Ih8 m89784F5 = m89784F();
                String m27125q2 = m89749y().m27125q();
                m89784F5.mo19953e();
                SharedPreferences.Editor edit2 = m89784F5.m101802l().edit();
                edit2.putString("gmp_app_id", m27125q2);
                edit2.apply();
                C33556Ih8 m89784F6 = m89784F();
                String m27127o2 = m89749y().m27127o();
                m89784F6.mo19953e();
                SharedPreferences.Editor edit3 = m89784F6.m101802l().edit();
                edit3.putString("admob_app_id", m27127o2);
                edit3.apply();
            }
            if (!m89784F().m101800n().m76357i(EnumC39344cm7.ANALYTICS_STORAGE)) {
                m89784F().f16068g.m13819b(null);
            }
            m89781I().m87193B(m89784F().f16068g.m13820a());
            C42821ic9.m33738b();
            if (this.f29077g.m37502y(null, C37795a98.f49972g0)) {
                try {
                    m89776N().f100966a.f29071a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(m89784F().f16082u.m13820a())) {
                        mo22258a().m106888t().m42708a("Remote config removed with active feature rollouts");
                        m89784F().f16082u.m13819b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(m89749y().m27125q()) || !TextUtils.isEmpty(m89749y().m27127o())) {
                boolean m89762l = m89762l();
                if (!m89784F().m101796r() && !this.f29077g.m37526E()) {
                    m89784F().m101797q(!m89762l);
                }
                if (m89762l) {
                    m89781I().m87164f0();
                }
                m89777M().f60676d.m100493a();
                m89778L().m88562S(new AtomicReference());
                m89778L().m88550s(m89784F().f16085x.m30112a());
            }
        }
        m89784F().f16075n.m79589a(true);
    }

    /* renamed from: k */
    public final boolean m89763k() {
        return this.f29064A != null && this.f29064A.booleanValue();
    }

    /* renamed from: l */
    public final boolean m89762l() {
        return m89753u() == 0;
    }

    /* renamed from: m */
    public final boolean m89761m() {
        mo22257c().mo19953e();
        return this.f29067D;
    }

    /* renamed from: n */
    public final boolean m89760n() {
        return TextUtils.isEmpty(this.f29072b);
    }

    /* renamed from: o */
    public final boolean m89759o() {
        boolean z;
        if (this.f29094x) {
            mo22257c().mo19953e();
            Boolean bool = this.f29095y;
            if (bool == null || this.f29096z == 0 || (!bool.booleanValue() && Math.abs(this.f29084n.elapsedRealtime() - this.f29096z) > 1000)) {
                this.f29096z = this.f29084n.elapsedRealtime();
                boolean z2 = true;
                if (m89776N().m92085T("android.permission.INTERNET") && m89776N().m92085T("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.f29071a).isCallerInstantApp() || this.f29077g.m37524G() || (OW8.m92078a0(this.f29071a) && OW8.m92077b0(this.f29071a, false)))) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                this.f29095y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!m89776N().m92092M(m89749y().m27125q(), m89749y().m27127o()) && TextUtils.isEmpty(m89749y().m27127o())) {
                        z2 = false;
                    }
                    this.f29095y = Boolean.valueOf(z2);
                }
            }
            return this.f29095y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    /* renamed from: p */
    public final boolean m89758p() {
        return this.f29075e;
    }

    /* renamed from: u */
    public final int m89753u() {
        mo22257c().mo19953e();
        if (this.f29077g.m37526E()) {
            return 1;
        }
        Boolean bool = this.f29066C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        mo22257c().mo19953e();
        if (!this.f29067D) {
            return 8;
        }
        Boolean m101799o = m89784F().m101799o();
        if (m101799o != null) {
            if (m101799o.booleanValue()) {
                return 0;
            }
            return 3;
        }
        C41723gl7 c41723gl7 = this.f29077g;
        C32844Fg7 c32844Fg7 = c41723gl7.f100966a.f29076f;
        Boolean m37510q = c41723gl7.m37510q("firebase_analytics_collection_enabled");
        if (m37510q != null) {
            if (m37510q.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bool2 = this.f29065B;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                return 0;
            }
            return 5;
        } else if (this.f29064A == null || this.f29064A.booleanValue()) {
            return 0;
        } else {
            return 7;
        }
    }

    /* renamed from: v */
    public final C38020aY7 m89752v() {
        C38020aY7 c38020aY7 = this.f29087q;
        if (c38020aY7 != null) {
            return c38020aY7;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: w */
    public final C41723gl7 m89751w() {
        return this.f29077g;
    }

    /* renamed from: x */
    public final C33897Jt7 m89750x() {
        m89754t(this.f29092v);
        return this.f29092v;
    }

    /* renamed from: y */
    public final C44579la8 m89749y() {
        m89755s(this.f29093w);
        return this.f29093w;
    }

    @Override // p000.InterfaceC35527Qs8
    /* renamed from: z */
    public final Context mo22255z() {
        return this.f29071a;
    }
}
