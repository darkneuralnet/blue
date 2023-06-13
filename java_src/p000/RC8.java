package p000;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzlj;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: RC8 */
/* loaded from: classes6.dex */
public final class RC8 extends AbstractC51140we8 {
    @VisibleForTesting

    /* renamed from: c */
    public GC8 f31673c;

    /* renamed from: d */
    public InterfaceC36013Su8 f31674d;

    /* renamed from: e */
    public final Set f31675e;

    /* renamed from: f */
    public boolean f31676f;

    /* renamed from: g */
    public final AtomicReference f31677g;

    /* renamed from: h */
    public final Object f31678h;

    /* renamed from: i */
    public C37110Xm7 f31679i;

    /* renamed from: j */
    public int f31680j;

    /* renamed from: k */
    public final AtomicLong f31681k;

    /* renamed from: l */
    public long f31682l;

    /* renamed from: m */
    public int f31683m;

    /* renamed from: n */
    public final Io9 f31684n;
    @VisibleForTesting

    /* renamed from: o */
    public boolean f31685o;

    /* renamed from: p */
    public final DW8 f31686p;

    public RC8(C35248Pn8 c35248Pn8) {
        super(c35248Pn8);
        this.f31675e = new CopyOnWriteArraySet();
        this.f31678h = new Object();
        this.f31685o = true;
        this.f31686p = new C33484Hz8(this);
        this.f31677g = new AtomicReference();
        this.f31679i = new C37110Xm7(null, null);
        this.f31680j = 100;
        this.f31682l = -1L;
        this.f31683m = 100;
        this.f31681k = new AtomicLong(0L);
        this.f31684n = new Io9(c35248Pn8);
    }

    /* renamed from: b0 */
    public static /* bridge */ /* synthetic */ void m87168b0(RC8 rc8, C37110Xm7 c37110Xm7, C37110Xm7 c37110Xm72) {
        boolean z;
        EnumC39344cm7[] enumC39344cm7Arr = {EnumC39344cm7.ANALYTICS_STORAGE, EnumC39344cm7.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i < 2) {
                EnumC39344cm7 enumC39344cm7 = enumC39344cm7Arr[i];
                if (!c37110Xm72.m76357i(enumC39344cm7) && c37110Xm7.m76357i(enumC39344cm7)) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        boolean m76354l = c37110Xm7.m76354l(c37110Xm72, EnumC39344cm7.ANALYTICS_STORAGE, EnumC39344cm7.AD_STORAGE);
        if (!z && !m76354l) {
            return;
        }
        rc8.f100966a.m89749y().m27123s();
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m87167c0(RC8 rc8, C37110Xm7 c37110Xm7, int i, long j, boolean z, boolean z2) {
        rc8.mo19953e();
        rc8.m6551f();
        if (j <= rc8.f31682l && C37110Xm7.m76356j(rc8.f31683m, i)) {
            rc8.f100966a.mo22258a().m106890r().m42707b("Dropped out-of-date consent setting, proposed settings", c37110Xm7);
            return;
        }
        C33556Ih8 m89784F = rc8.f100966a.m89784F();
        C35248Pn8 c35248Pn8 = m89784F.f100966a;
        m89784F.mo19953e();
        if (m89784F.m101794t(i)) {
            SharedPreferences.Editor edit = m89784F.m101802l().edit();
            edit.putString("consent_settings", c37110Xm7.m76358h());
            edit.putInt("consent_source", i);
            edit.apply();
            rc8.f31682l = j;
            rc8.f31683m = i;
            rc8.f100966a.m89778L().m88552q(z);
            if (z2) {
                rc8.f100966a.m89778L().m88562S(new AtomicReference());
                return;
            }
            return;
        }
        rc8.f100966a.mo22258a().m106890r().m42707b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
    }

    /* renamed from: B */
    public final void m87193B(String str) {
        this.f31677g.set(str);
    }

    /* renamed from: D */
    public final void m87192D(Bundle bundle) {
        m87191E(bundle, this.f100966a.mo22260A().currentTimeMillis());
    }

    /* renamed from: E */
    public final void m87191E(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID))) {
            this.f100966a.mo22258a().m106888t().m42708a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID);
        Preconditions.checkNotNull(bundle2);
        C35302Pt8.m89461a(bundle2, PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, String.class, null);
        C35302Pt8.m89461a(bundle2, AnalyticsRequestV2.HEADER_ORIGIN, String.class, null);
        C35302Pt8.m89461a(bundle2, "name", String.class, null);
        C35302Pt8.m89461a(bundle2, "value", Object.class, null);
        C35302Pt8.m89461a(bundle2, "trigger_event_name", String.class, null);
        C35302Pt8.m89461a(bundle2, "trigger_timeout", Long.class, 0L);
        C35302Pt8.m89461a(bundle2, "timed_out_event_name", String.class, null);
        C35302Pt8.m89461a(bundle2, "timed_out_event_params", Bundle.class, null);
        C35302Pt8.m89461a(bundle2, "triggered_event_name", String.class, null);
        C35302Pt8.m89461a(bundle2, "triggered_event_params", Bundle.class, null);
        C35302Pt8.m89461a(bundle2, "time_to_live", Long.class, 0L);
        C35302Pt8.m89461a(bundle2, "expired_event_name", String.class, null);
        C35302Pt8.m89461a(bundle2, "expired_event_params", Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString(AnalyticsRequestV2.HEADER_ORIGIN));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f100966a.m89776N().m92057p0(string) == 0) {
            if (this.f100966a.m89776N().m92065l0(string, obj) == 0) {
                Object m92064m = this.f100966a.m89776N().m92064m(string, obj);
                if (m92064m == null) {
                    this.f100966a.mo22258a().m106893o().m42706c("Unable to normalize conditional user property value", this.f100966a.m89786D().m17330f(string), obj);
                    return;
                }
                C35302Pt8.m89460b(bundle2, m92064m);
                long j2 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                    this.f100966a.m89751w();
                    if (j2 > 15552000000L || j2 < 1) {
                        this.f100966a.mo22258a().m106893o().m42706c("Invalid conditional user property timeout", this.f100966a.m89786D().m17330f(string), Long.valueOf(j2));
                        return;
                    }
                }
                long j3 = bundle2.getLong("time_to_live");
                this.f100966a.m89751w();
                if (j3 <= 15552000000L && j3 >= 1) {
                    this.f100966a.mo22257c().m43695w(new RunnableC46598oy8(this, bundle2));
                    return;
                } else {
                    this.f100966a.mo22258a().m106893o().m42706c("Invalid conditional user property time to live", this.f100966a.m89786D().m17330f(string), Long.valueOf(j3));
                    return;
                }
            }
            this.f100966a.mo22258a().m106893o().m42706c("Invalid conditional user property value", this.f100966a.m89786D().m17330f(string), obj);
            return;
        }
        this.f100966a.mo22258a().m106893o().m42707b("Invalid conditional user property name", this.f100966a.m89786D().m17330f(string));
    }

    /* renamed from: F */
    public final void m87190F(Bundle bundle, int i, long j) {
        m6551f();
        String m76359g = C37110Xm7.m76359g(bundle);
        if (m76359g != null) {
            this.f100966a.mo22258a().m106887u().m42707b("Ignoring invalid consent setting", m76359g);
            this.f100966a.mo22258a().m106887u().m42708a("Valid consent values are 'granted', 'denied'");
        }
        m87189G(C37110Xm7.m76365a(bundle), i, j);
    }

    /* renamed from: G */
    public final void m87189G(C37110Xm7 c37110Xm7, int i, long j) {
        C37110Xm7 c37110Xm72;
        boolean z;
        boolean z2;
        boolean z3;
        C37110Xm7 c37110Xm73 = c37110Xm7;
        m6551f();
        if (i != -10 && c37110Xm7.m76361e() == null && c37110Xm7.m76360f() == null) {
            this.f100966a.mo22258a().m106887u().m42708a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f31678h) {
            c37110Xm72 = this.f31679i;
            z = false;
            if (C37110Xm7.m76356j(i, this.f31680j)) {
                z2 = c37110Xm73.m76355k(this.f31679i);
                EnumC39344cm7 enumC39344cm7 = EnumC39344cm7.ANALYTICS_STORAGE;
                if (c37110Xm73.m76357i(enumC39344cm7) && !this.f31679i.m76357i(enumC39344cm7)) {
                    z = true;
                }
                c37110Xm73 = c37110Xm73.m76362d(this.f31679i);
                this.f31679i = c37110Xm73;
                this.f31680j = i;
                z3 = z;
                z = true;
            } else {
                z2 = false;
                z3 = false;
            }
        }
        if (!z) {
            this.f100966a.mo22258a().m106890r().m42707b("Ignoring lower-priority consent settings, proposed settings", c37110Xm73);
            return;
        }
        long andIncrement = this.f31681k.getAndIncrement();
        if (z2) {
            this.f31677g.set(null);
            this.f100966a.mo22257c().m43694x(new LB8(this, c37110Xm73, j, i, andIncrement, z3, c37110Xm72));
            return;
        }
        XB8 xb8 = new XB8(this, c37110Xm73, i, andIncrement, z3, c37110Xm72);
        if (i != 30 && i != -10) {
            this.f100966a.mo22257c().m43695w(xb8);
        } else {
            this.f100966a.mo22257c().m43694x(xb8);
        }
    }

    /* renamed from: H */
    public final void m87188H(InterfaceC36013Su8 interfaceC36013Su8) {
        InterfaceC36013Su8 interfaceC36013Su82;
        boolean z;
        mo19953e();
        m6551f();
        if (interfaceC36013Su8 != null && interfaceC36013Su8 != (interfaceC36013Su82 = this.f31674d)) {
            if (interfaceC36013Su82 == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "EventInterceptor already set.");
        }
        this.f31674d = interfaceC36013Su8;
    }

    /* renamed from: I */
    public final void m87187I(Boolean bool) {
        m6551f();
        this.f100966a.mo22257c().m43695w(new RunnableC52654zB8(this, bool));
    }

    /* renamed from: J */
    public final void m87186J(C37110Xm7 c37110Xm7) {
        boolean z;
        Boolean bool;
        mo19953e();
        if ((c37110Xm7.m76357i(EnumC39344cm7.ANALYTICS_STORAGE) && c37110Xm7.m76357i(EnumC39344cm7.AD_STORAGE)) || this.f100966a.m89778L().m88545x()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.f100966a.m89761m()) {
            this.f100966a.m89765i(z);
            C33556Ih8 m89784F = this.f100966a.m89784F();
            C35248Pn8 c35248Pn8 = m89784F.f100966a;
            m89784F.mo19953e();
            if (m89784F.m101802l().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(m89784F.m101802l().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z || bool == null || bool.booleanValue()) {
                m87181O(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: K */
    public final void m87185K(String str, String str2, Object obj, boolean z) {
        m87184L("auto", "_ldl", obj, true, this.f100966a.mo22260A().currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m87184L(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int i2;
        String str3;
        int i3 = 0;
        if (z) {
            i2 = this.f100966a.m89776N().m92057p0(str2);
        } else {
            OW8 m89776N = this.f100966a.m89776N();
            if (m89776N.m92086S("user property", str2)) {
                if (!m89776N.m92089P("user property", C32971Fu8.f10510a, null, str2)) {
                    i2 = 15;
                } else {
                    m89776N.f100966a.m89751w();
                    if (m89776N.m92091N("user property", 24, str2)) {
                        i = 0;
                        if (i != 0) {
                            OW8 m89776N2 = this.f100966a.m89776N();
                            this.f100966a.m89751w();
                            String m92060o = m89776N2.m92060o(str2, 24, true);
                            if (str2 != null) {
                                i3 = str2.length();
                            }
                            this.f100966a.m89776N().m92102B(this.f31686p, null, i, "_ev", m92060o, i3);
                            return;
                        }
                        if (str == null) {
                            str3 = Stripe3ds2AuthParams.FIELD_APP;
                        } else {
                            str3 = str;
                        }
                        if (obj != null) {
                            int m92065l0 = this.f100966a.m89776N().m92065l0(str2, obj);
                            if (m92065l0 != 0) {
                                OW8 m89776N3 = this.f100966a.m89776N();
                                this.f100966a.m89751w();
                                String m92060o2 = m89776N3.m92060o(str2, 24, true);
                                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                                    i3 = obj.toString().length();
                                }
                                this.f100966a.m89776N().m92102B(this.f31686p, null, m92065l0, "_ev", m92060o2, i3);
                                return;
                            }
                            Object m92064m = this.f100966a.m89776N().m92064m(str2, obj);
                            if (m92064m != null) {
                                m87150y(str3, str2, j, m92064m);
                                return;
                            }
                            return;
                        }
                        m87150y(str3, str2, j, null);
                        return;
                    }
                }
            }
            i = 6;
            if (i != 0) {
            }
        }
        i = i2;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m87183M(String str, String str2, Object obj, long j) {
        String str3;
        Object obj2;
        Long l;
        long j2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo19953e();
        m6551f();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    String lowerCase = str4.toLowerCase(Locale.ENGLISH);
                    String str5 = "false";
                    if (true != "false".equals(lowerCase)) {
                        j2 = 0;
                    } else {
                        j2 = 1;
                    }
                    Long valueOf = Long.valueOf(j2);
                    C48799sh8 c48799sh8 = this.f100966a.m89784F().f16074m;
                    if (valueOf.longValue() == 1) {
                        str5 = "true";
                    }
                    c48799sh8.m13819b(str5);
                    l = valueOf;
                    obj2 = l;
                    str3 = "_npa";
                    if (!this.f100966a.m89762l()) {
                        this.f100966a.mo22258a().m106889s().m42708a("User property not set since app measurement is disabled");
                        return;
                    } else if (!this.f100966a.m89759o()) {
                        return;
                    } else {
                        this.f100966a.m89778L().m88547v(new zzlj(str3, j, obj2, str));
                        return;
                    }
                }
            }
            if (obj == null) {
                this.f100966a.m89784F().f16074m.m13819b("unset");
                l = obj;
                obj2 = l;
                str3 = "_npa";
                if (!this.f100966a.m89762l()) {
                }
            }
        }
        str3 = str2;
        obj2 = obj;
        if (!this.f100966a.m89762l()) {
        }
    }

    /* renamed from: N */
    public final void m87182N(InterfaceC41231fv8 interfaceC41231fv8) {
        m6551f();
        Preconditions.checkNotNull(interfaceC41231fv8);
        if (!this.f31675e.remove(interfaceC41231fv8)) {
            this.f100966a.mo22258a().m106888t().m42708a("OnEventListener had not been registered");
        }
    }

    /* renamed from: O */
    public final void m87181O(Boolean bool, boolean z) {
        mo19953e();
        m6551f();
        this.f100966a.mo22258a().m106894n().m42707b("Setting app measurement enabled (FE)", bool);
        this.f100966a.m89784F().m101798p(bool);
        if (z) {
            C33556Ih8 m89784F = this.f100966a.m89784F();
            C35248Pn8 c35248Pn8 = m89784F.f100966a;
            m89784F.mo19953e();
            SharedPreferences.Editor edit = m89784F.m101802l().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (!this.f100966a.m89761m() && (bool == null || bool.booleanValue())) {
            return;
        }
        m87180P();
    }

    /* renamed from: P */
    public final void m87180P() {
        long j;
        mo19953e();
        String m13820a = this.f100966a.m89784F().f16074m.m13820a();
        if (m13820a != null) {
            if ("unset".equals(m13820a)) {
                m87183M(Stripe3ds2AuthParams.FIELD_APP, "_npa", null, this.f100966a.mo22260A().currentTimeMillis());
            } else {
                if (true != "true".equals(m13820a)) {
                    j = 0;
                } else {
                    j = 1;
                }
                m87183M(Stripe3ds2AuthParams.FIELD_APP, "_npa", Long.valueOf(j), this.f100966a.mo22260A().currentTimeMillis());
            }
        }
        if (this.f100966a.m89762l() && this.f31685o) {
            this.f100966a.mo22258a().m106894n().m42708a("Recording app launch after enabling measurement for the first time (FE)");
            m87164f0();
            C49363te9.m11964b();
            if (this.f100966a.m89751w().m37502y(null, C37795a98.f49974h0)) {
                this.f100966a.m89777M().f60676d.m100493a();
            }
            this.f100966a.mo22257c().m43695w(new RunnableC36733Vw8(this));
            return;
        }
        this.f100966a.mo22258a().m106894n().m42708a("Updating Scion state (FE)");
        this.f100966a.m89778L().m88549t();
    }

    /* renamed from: Q */
    public final int m87179Q(String str) {
        Preconditions.checkNotEmpty(str);
        this.f100966a.m89751w();
        return 25;
    }

    /* renamed from: R */
    public final Boolean m87178R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f100966a.mo22257c().m43703o(atomicReference, 15000L, "boolean test flag value", new RunnableC37219Xy8(this, atomicReference));
    }

    /* renamed from: S */
    public final Double m87177S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f100966a.mo22257c().m43703o(atomicReference, 15000L, "double test flag value", new RunnableC45540nB8(this, atomicReference));
    }

    /* renamed from: T */
    public final Integer m87176T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f100966a.mo22257c().m43703o(atomicReference, 15000L, "int test flag value", new RunnableC38407bB8(this, atomicReference));
    }

    /* renamed from: U */
    public final Long m87175U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f100966a.mo22257c().m43703o(atomicReference, 15000L, "long test flag value", new PA8(this, atomicReference));
    }

    /* renamed from: V */
    public final String m87174V() {
        return (String) this.f31677g.get();
    }

    /* renamed from: W */
    public final String m87173W() {
        C50902wE8 m24008o = this.f100966a.m89779K().m24008o();
        if (m24008o != null) {
            return m24008o.f115670b;
        }
        return null;
    }

    /* renamed from: X */
    public final String m87172X() {
        C50902wE8 m24008o = this.f100966a.m89779K().m24008o();
        if (m24008o != null) {
            return m24008o.f115669a;
        }
        return null;
    }

    /* renamed from: Y */
    public final String m87171Y() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f100966a.mo22257c().m43703o(atomicReference, 15000L, "String test flag value", new RunnableC36292Tz8(this, atomicReference));
    }

    /* renamed from: Z */
    public final ArrayList m87170Z(String str, String str2) {
        if (this.f100966a.mo22257c().m43709B()) {
            this.f100966a.mo22258a().m106893o().m42708a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f100966a.mo22259C();
        if (C32844Fg7.m106751a()) {
            this.f100966a.mo22258a().m106893o().m42708a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f100966a.mo22257c().m43703o(atomicReference, 5000L, "get conditional user properties", new RunnableC34411Ly8(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.f100966a.mo22258a().m106893o().m42707b("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return OW8.m92052s(list);
    }

    /* renamed from: a0 */
    public final Map m87169a0(String str, String str2, boolean z) {
        if (this.f100966a.mo22257c().m43709B()) {
            this.f100966a.mo22258a().m106893o().m42708a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f100966a.mo22259C();
        if (C32844Fg7.m106751a()) {
            this.f100966a.mo22258a().m106893o().m42708a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f100966a.mo22257c().m43703o(atomicReference, 5000L, "get user properties", new RunnableC43643jz8(this, atomicReference, null, str, str2, z));
        List<zzlj> list = (List) atomicReference.get();
        if (list == null) {
            this.f100966a.mo22258a().m106893o().m42707b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        C28385so c28385so = new C28385so(list.size());
        for (zzlj zzljVar : list) {
            Object m50581s = zzljVar.m50581s();
            if (m50581s != null) {
                c28385so.put(zzljVar.f71534c, m50581s);
            }
        }
        return c28385so;
    }

    /* renamed from: f0 */
    public final void m87164f0() {
        mo19953e();
        m6551f();
        if (this.f100966a.m89759o()) {
            if (this.f100966a.m89751w().m37502y(null, C37795a98.f49962b0)) {
                C41723gl7 m89751w = this.f100966a.m89751w();
                m89751w.f100966a.mo22259C();
                Boolean m37510q = m89751w.m37510q("google_analytics_deferred_deep_link_enabled");
                if (m37510q != null && m37510q.booleanValue()) {
                    this.f100966a.mo22258a().m106894n().m42708a("Deferred Deep Link feature enabled.");
                    this.f100966a.mo22257c().m43695w(new Runnable() { // from class: Hw8
                        @Override // java.lang.Runnable
                        public final void run() {
                            RC8 rc8 = RC8.this;
                            rc8.mo19953e();
                            if (!rc8.f100966a.m89784F().f16080s.m79588b()) {
                                long m564a = rc8.f100966a.m89784F().f16081t.m564a();
                                rc8.f100966a.m89784F().f16081t.m563b(1 + m564a);
                                rc8.f100966a.m89751w();
                                if (m564a >= 5) {
                                    rc8.f100966a.mo22258a().m106888t().m42708a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                    rc8.f100966a.m89784F().f16080s.m79589a(true);
                                    return;
                                }
                                rc8.f100966a.m89767g();
                                return;
                            }
                            rc8.f100966a.mo22258a().m106894n().m42708a("Deferred Deep Link already retrieved. Not fetching again.");
                        }
                    });
                }
            }
            this.f100966a.m89778L().m88566O();
            this.f31685o = false;
            C33556Ih8 m89784F = this.f100966a.m89784F();
            m89784F.mo19953e();
            String string = m89784F.m101802l().getString("previous_os_version", null);
            m89784F.f100966a.m89750x().m113419h();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = m89784F.m101802l().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f100966a.m89750x().m113419h();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    m87157r("auto", "_ou", bundle);
                }
            }
        }
    }

    @Override // p000.AbstractC51140we8
    /* renamed from: k */
    public final boolean mo6546k() {
        return false;
    }

    /* renamed from: l */
    public final void m87163l(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.f100966a.mo22260A().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f100966a.mo22257c().m43695w(new RunnableC31837Ay8(this, bundle2));
    }

    /* renamed from: m */
    public final void m87162m() {
        if ((this.f100966a.mo22255z().getApplicationContext() instanceof Application) && this.f31673c != null) {
            ((Application) this.f100966a.mo22255z().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f31673c);
        }
    }

    /* renamed from: n */
    public final /* synthetic */ void m87161n(Bundle bundle) {
        if (bundle == null) {
            this.f100966a.m89784F().f16085x.m30111b(new Bundle());
            return;
        }
        Bundle m30112a = this.f100966a.m89784F().f16085x.m30112a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f100966a.m89776N().m92083V(obj)) {
                    this.f100966a.m89776N().m92102B(this.f31686p, null, 27, null, null, 0);
                }
                this.f100966a.mo22258a().m106887u().m42706c("Invalid default event parameter type. Name, value", str, obj);
            } else if (OW8.m92080Y(str)) {
                this.f100966a.mo22258a().m106887u().m42707b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                m30112a.remove(str);
            } else {
                OW8 m89776N = this.f100966a.m89776N();
                this.f100966a.m89751w();
                if (m89776N.m92088Q("param", str, 100, obj)) {
                    this.f100966a.m89776N().m92101D(m30112a, str, obj);
                }
            }
        }
        this.f100966a.m89776N();
        int m37517j = this.f100966a.m89751w().m37517j();
        if (m30112a.size() > m37517j) {
            int i = 0;
            for (String str2 : new TreeSet(m30112a.keySet())) {
                i++;
                if (i > m37517j) {
                    m30112a.remove(str2);
                }
            }
            this.f100966a.m89776N().m92102B(this.f31686p, null, 26, null, null, 0);
            this.f100966a.mo22258a().m106887u().m42708a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f100966a.m89784F().f16085x.m30111b(m30112a);
        this.f100966a.m89778L().m88550s(m30112a);
    }

    /* renamed from: o */
    public final void m87160o(String str, String str2, Bundle bundle) {
        m87159p(str, str2, bundle, true, true, this.f100966a.mo22260A().currentTimeMillis());
    }

    /* renamed from: p */
    public final void m87159p(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Bundle bundle2;
        String str3;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (str2 != "screen_view" && (str2 == null || !str2.equals("screen_view"))) {
            boolean z3 = true;
            if (z2 && this.f31674d != null && !OW8.m92080Y(str2)) {
                z3 = false;
            }
            boolean z4 = z3;
            if (str == null) {
                str3 = Stripe3ds2AuthParams.FIELD_APP;
            } else {
                str3 = str;
            }
            m87151x(str3, str2, j, bundle2, z2, z4, z, null);
            return;
        }
        this.f100966a.m89779K().m24014E(bundle2, j);
    }

    /* renamed from: q */
    public final void m87158q(String str, String str2, Bundle bundle, String str3) {
        C35248Pn8.m89757q();
        m87151x("auto", str2, this.f100966a.mo22260A().currentTimeMillis(), bundle, false, true, true, str3);
    }

    /* renamed from: r */
    public final void m87157r(String str, String str2, Bundle bundle) {
        mo19953e();
        m87156s(str, str2, this.f100966a.mo22260A().currentTimeMillis(), bundle);
    }

    /* renamed from: s */
    public final void m87156s(String str, String str2, long j, Bundle bundle) {
        boolean z;
        mo19953e();
        if (this.f31674d != null && !OW8.m92080Y(str2)) {
            z = false;
        } else {
            z = true;
        }
        m87155t(str, str2, j, bundle, true, z, true, null);
    }

    /* renamed from: t */
    public final void m87155t(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        String str4;
        ArrayList arrayList;
        long j2;
        Bundle[] bundleArr;
        Class<?> cls;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        mo19953e();
        m6551f();
        if (this.f100966a.m89762l()) {
            List m27124r = this.f100966a.m89749y().m27124r();
            if (m27124r != null && !m27124r.contains(str2)) {
                this.f100966a.mo22258a().m106894n().m42706c("Dropping non-safelisted event. event name, origin", str2, str);
                return;
            }
            if (!this.f31676f) {
                this.f31676f = true;
                try {
                    if (!this.f100966a.m89758p()) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f100966a.mo22255z().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, this.f100966a.mo22255z());
                    } catch (Exception e) {
                        this.f100966a.mo22258a().m106888t().m42707b("Failed to invoke Tag Manager's initialize() method", e);
                    }
                } catch (ClassNotFoundException unused) {
                    this.f100966a.mo22258a().m106890r().m42708a("Tag Manager is not found and thus will not be used");
                }
            }
            if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
                this.f100966a.mo22259C();
                m87183M("auto", "_lgclid", bundle.getString("gclid"), this.f100966a.mo22260A().currentTimeMillis());
            }
            this.f100966a.mo22259C();
            if (z && OW8.m92076c0(str2)) {
                this.f100966a.m89776N().m92044w(bundle, this.f100966a.m89784F().f16085x.m30112a());
            }
            if (!z3) {
                this.f100966a.mo22259C();
                if (!"_iap".equals(str2)) {
                    OW8 m89776N = this.f100966a.m89776N();
                    int i = 2;
                    if (m89776N.m92086S("event", str2)) {
                        if (m89776N.m92089P("event", C40628eu8.f79110a, C40628eu8.f79111b, str2)) {
                            m89776N.f100966a.m89751w();
                            if (m89776N.m92091N("event", 40, str2)) {
                                i = 0;
                            }
                        } else {
                            i = 13;
                        }
                    }
                    if (i != 0) {
                        this.f100966a.mo22258a().m106892p().m42707b("Invalid public event name. Event will not be logged (FE)", this.f100966a.m89786D().m17332d(str2));
                        OW8 m89776N2 = this.f100966a.m89776N();
                        this.f100966a.m89751w();
                        this.f100966a.m89776N().m92102B(this.f31686p, null, i, "_ev", m89776N2.m92060o(str2, 40, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                }
            }
            this.f100966a.mo22259C();
            C50902wE8 m24007p = this.f100966a.m89779K().m24007p(false);
            if (m24007p != null && !bundle.containsKey("_sc")) {
                m24007p.f115672d = true;
            }
            OW8.m92046v(m24007p, bundle, z && !z3);
            boolean equals = "am".equals(str);
            boolean m92080Y = OW8.m92080Y(str2);
            if (!z || this.f31674d == null || m92080Y) {
                z4 = equals;
            } else if (!equals) {
                this.f100966a.mo22258a().m106894n().m42706c("Passing event to registered event handler (FE)", this.f100966a.m89786D().m17332d(str2), this.f100966a.m89786D().m17334b(bundle));
                Preconditions.checkNotNull(this.f31674d);
                this.f31674d.mo24271a(str, str2, bundle, j);
                return;
            } else {
                z4 = true;
            }
            if (this.f100966a.m89759o()) {
                int m92063m0 = this.f100966a.m89776N().m92063m0(str2);
                if (m92063m0 != 0) {
                    this.f100966a.mo22258a().m106892p().m42707b("Invalid event name. Event will not be logged (FE)", this.f100966a.m89786D().m17332d(str2));
                    OW8 m89776N3 = this.f100966a.m89776N();
                    this.f100966a.m89751w();
                    this.f100966a.m89776N().m92102B(this.f31686p, str3, m92063m0, "_ev", m89776N3.m92060o(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
                String str5 = "_o";
                Bundle m92041x0 = this.f100966a.m89776N().m92041x0(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z3);
                Preconditions.checkNotNull(m92041x0);
                this.f100966a.mo22259C();
                if (this.f100966a.m89779K().m24007p(false) != null && "_ae".equals(str2)) {
                    C52196yQ8 c52196yQ8 = this.f100966a.m89777M().f60677e;
                    long elapsedRealtime = c52196yQ8.f119543d.f100966a.mo22260A().elapsedRealtime();
                    long j3 = elapsedRealtime - c52196yQ8.f119541b;
                    c52196yQ8.f119541b = elapsedRealtime;
                    if (j3 > 0) {
                        this.f100966a.m89776N().m92050t(m92041x0, j3);
                    }
                }
                C42821ic9.m33738b();
                if (this.f100966a.m89751w().m37502y(null, C37795a98.f49972g0)) {
                    if (!"auto".equals(str) && "_ssr".equals(str2)) {
                        OW8 m89776N4 = this.f100966a.m89776N();
                        String string = m92041x0.getString("_ffr");
                        if (Strings.isEmptyOrWhitespace(string)) {
                            string = null;
                        } else if (string != null) {
                            string = string.trim();
                        }
                        if (!C48693sW8.m14112a(string, m89776N4.f100966a.m89784F().f16082u.m13820a())) {
                            m89776N4.f100966a.m89784F().f16082u.m13819b(string);
                        } else {
                            m89776N4.f100966a.mo22258a().m106894n().m42708a("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str2)) {
                        String m13820a = this.f100966a.m89776N().f100966a.m89784F().f16082u.m13820a();
                        if (!TextUtils.isEmpty(m13820a)) {
                            m92041x0.putString("_ffr", m13820a);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(m92041x0);
                if (this.f100966a.m89784F().f16076o.m564a() > 0 && this.f100966a.m89784F().m101795s(j) && this.f100966a.m89784F().f16079r.m79588b()) {
                    this.f100966a.mo22258a().m106889s().m42708a("Current session is expired, remove the session number, ID, and engagement time");
                    arrayList = arrayList2;
                    j2 = 0;
                    str4 = "_ae";
                    m87183M("auto", "_sid", null, this.f100966a.mo22260A().currentTimeMillis());
                    m87183M("auto", "_sno", null, this.f100966a.mo22260A().currentTimeMillis());
                    m87183M("auto", "_se", null, this.f100966a.mo22260A().currentTimeMillis());
                    this.f100966a.m89784F().f16077p.m563b(0L);
                } else {
                    str4 = "_ae";
                    arrayList = arrayList2;
                    j2 = 0;
                }
                if (m92041x0.getLong("extend_session", j2) == 1) {
                    this.f100966a.mo22258a().m106889s().m42708a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    this.f100966a.m89777M().f60676d.m100492b(j, true);
                }
                ArrayList arrayList3 = new ArrayList(m92041x0.keySet());
                Collections.sort(arrayList3);
                int size = arrayList3.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str6 = (String) arrayList3.get(i2);
                    if (str6 != null) {
                        this.f100966a.m89776N();
                        Object obj = m92041x0.get(str6);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList4 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            m92041x0.putParcelableArray(str6, bundleArr);
                        }
                    }
                }
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    ArrayList arrayList5 = arrayList;
                    Bundle bundle2 = (Bundle) arrayList5.get(i3);
                    String str7 = i3 != 0 ? "_ep" : str2;
                    bundle2.putString(str5, str);
                    if (z2) {
                        bundle2 = this.f100966a.m89776N().m92043w0(bundle2);
                    }
                    Bundle bundle3 = bundle2;
                    String str8 = str5;
                    this.f100966a.m89778L().m88557l(new zzaw(str7, new zzau(bundle3), str, j), str3);
                    if (!z4) {
                        for (InterfaceC41231fv8 interfaceC41231fv8 : this.f31675e) {
                            interfaceC41231fv8.mo12047a(str, str2, new Bundle(bundle3), j);
                        }
                    }
                    i3++;
                    arrayList = arrayList5;
                    str5 = str8;
                }
                this.f100966a.mo22259C();
                if (this.f100966a.m89779K().m24007p(false) == null || !str4.equals(str2)) {
                    return;
                }
                this.f100966a.m89777M().f60677e.m3504d(true, true, this.f100966a.mo22260A().elapsedRealtime());
                return;
            }
            return;
        }
        this.f100966a.mo22258a().m106894n().m42708a("Event not sent since app measurement is disabled");
    }

    /* renamed from: u */
    public final void m87154u(InterfaceC41231fv8 interfaceC41231fv8) {
        m6551f();
        Preconditions.checkNotNull(interfaceC41231fv8);
        if (!this.f31675e.add(interfaceC41231fv8)) {
            this.f100966a.mo22258a().m106888t().m42708a("OnEventListener already registered");
        }
    }

    /* renamed from: v */
    public final void m87153v(long j) {
        this.f31677g.set(null);
        this.f100966a.mo22257c().m43695w(new RunnableC39483cy8(this, j));
    }

    /* renamed from: w */
    public final void m87152w(long j, boolean z) {
        mo19953e();
        m6551f();
        this.f100966a.mo22258a().m106894n().m42708a("Resetting analytics data (FE)");
        C39144cR8 m89777M = this.f100966a.m89777M();
        m89777M.mo19953e();
        m89777M.f60677e.m3507a();
        C49423tk9.m11813b();
        if (this.f100966a.m89751w().m37502y(null, C37795a98.f49990p0)) {
            this.f100966a.m89749y().m27123s();
        }
        boolean m89762l = this.f100966a.m89762l();
        C33556Ih8 m89784F = this.f100966a.m89784F();
        m89784F.f16066e.m563b(j);
        if (!TextUtils.isEmpty(m89784F.f100966a.m89784F().f16082u.m13820a())) {
            m89784F.f16082u.m13819b(null);
        }
        C49363te9.m11964b();
        C41723gl7 m89751w = m89784F.f100966a.m89751w();
        L88 l88 = C37795a98.f49974h0;
        if (m89751w.m37502y(null, l88)) {
            m89784F.f16076o.m563b(0L);
        }
        m89784F.f16077p.m563b(0L);
        if (!m89784F.f100966a.m89751w().m37526E()) {
            m89784F.m101797q(!m89762l);
        }
        m89784F.f16083v.m13819b(null);
        m89784F.f16084w.m563b(0L);
        m89784F.f16085x.m30111b(null);
        if (z) {
            this.f100966a.m89778L().m88555n();
        }
        C49363te9.m11964b();
        if (this.f100966a.m89751w().m37502y(null, l88)) {
            this.f100966a.m89777M().f60676d.m100493a();
        }
        this.f31685o = !m89762l;
    }

    /* renamed from: x */
    public final void m87151x(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.f100966a.mo22257c().m43695w(new RunnableC49552tx8(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    /* renamed from: y */
    public final void m87150y(String str, String str2, long j, Object obj) {
        this.f100966a.mo22257c().m43695w(new RunnableC32998Fx8(this, str, str2, obj, j));
    }
}
