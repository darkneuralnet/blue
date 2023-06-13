package p000;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: nG8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45585nG8 extends AbstractC51140we8 {

    /* renamed from: c */
    public volatile C50902wE8 f99706c;

    /* renamed from: d */
    public volatile C50902wE8 f99707d;
    @VisibleForTesting

    /* renamed from: e */
    public C50902wE8 f99708e;

    /* renamed from: f */
    public final Map f99709f;

    /* renamed from: g */
    public Activity f99710g;

    /* renamed from: h */
    public volatile boolean f99711h;

    /* renamed from: i */
    public volatile C50902wE8 f99712i;

    /* renamed from: j */
    public C50902wE8 f99713j;

    /* renamed from: k */
    public boolean f99714k;

    /* renamed from: l */
    public final Object f99715l;

    public C45585nG8(C35248Pn8 c35248Pn8) {
        super(c35248Pn8);
        this.f99715l = new Object();
        this.f99709f = new ConcurrentHashMap();
    }

    /* renamed from: t */
    public static /* bridge */ /* synthetic */ void m24003t(C45585nG8 c45585nG8, Bundle bundle, C50902wE8 c50902wE8, C50902wE8 c50902wE82, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        c45585nG8.m24011l(c50902wE8, c50902wE82, j, true, c45585nG8.f100966a.m89776N().m92041x0(null, "screen_view", bundle, null, false));
    }

    /* renamed from: B */
    public final void m24016B(Activity activity, Bundle bundle) {
        C50902wE8 c50902wE8;
        if (!this.f100966a.m89751w().m37527D() || bundle == null || (c50902wE8 = (C50902wE8) this.f99709f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c50902wE8.f115671c);
        bundle2.putString("name", c50902wE8.f115669a);
        bundle2.putString("referrer_name", c50902wE8.f115670b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r1 <= 100) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (r1 <= 100) goto L36;
     */
    @Deprecated
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m24015D(Activity activity, String str, String str2) {
        String str3;
        if (!this.f100966a.m89751w().m37527D()) {
            this.f100966a.mo22258a().m106887u().m42708a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C50902wE8 c50902wE8 = this.f99706c;
        if (c50902wE8 == null) {
            this.f100966a.mo22258a().m106887u().m42708a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f99709f.get(activity) == null) {
            this.f100966a.mo22258a().m106887u().m42708a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = m24006q(activity.getClass(), "Activity");
            }
            boolean m104143a = HE8.m104143a(c50902wE8.f115670b, str2);
            boolean m104143a2 = HE8.m104143a(c50902wE8.f115669a, str);
            if (m104143a && m104143a2) {
                this.f100966a.mo22258a().m106887u().m42708a("setCurrentScreen cannot be called with the same class and name");
                return;
            }
            if (str != null) {
                if (str.length() > 0) {
                    int length = str.length();
                    this.f100966a.m89751w();
                }
                this.f100966a.mo22258a().m106887u().m42707b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
                return;
            }
            if (str2 != null) {
                if (str2.length() > 0) {
                    int length2 = str2.length();
                    this.f100966a.m89751w();
                }
                this.f100966a.mo22258a().m106887u().m42707b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
                return;
            }
            C40448ec8 m106889s = this.f100966a.mo22258a().m106889s();
            if (str == null) {
                str3 = "null";
            } else {
                str3 = str;
            }
            m106889s.m42706c("Setting current screen to name, class", str3, str2);
            C50902wE8 c50902wE82 = new C50902wE8(str, str2, this.f100966a.m89776N().m92049t0());
            this.f99709f.put(activity, c50902wE82);
            m24012G(activity, c50902wE82, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r2 > 100) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r4 > 100) goto L25;
     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m24014E(Bundle bundle, long j) {
        String str;
        String str2;
        String str3;
        C50902wE8 c50902wE8;
        String str4;
        synchronized (this.f99715l) {
            if (!this.f99714k) {
                this.f100966a.mo22258a().m106887u().m42708a("Cannot log screen view event when the app is in the background.");
                return;
            }
            String string = bundle.getString("screen_name");
            if (string != null) {
                if (string.length() > 0) {
                    int length = string.length();
                    this.f100966a.m89751w();
                }
                this.f100966a.mo22258a().m106887u().m42707b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                return;
            }
            String string2 = bundle.getString("screen_class");
            if (string2 != null) {
                if (string2.length() > 0) {
                    int length2 = string2.length();
                    this.f100966a.m89751w();
                }
                this.f100966a.mo22258a().m106887u().m42707b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                return;
            }
            if (string2 == null) {
                Activity activity = this.f99710g;
                if (activity != null) {
                    str4 = m24006q(activity.getClass(), "Activity");
                } else {
                    str4 = "Activity";
                }
                str = str4;
            } else {
                str = string2;
            }
            C50902wE8 c50902wE82 = this.f99706c;
            if (this.f99711h && c50902wE82 != null) {
                this.f99711h = false;
                boolean m104143a = HE8.m104143a(c50902wE82.f115670b, str);
                boolean m104143a2 = HE8.m104143a(c50902wE82.f115669a, string);
                if (m104143a && m104143a2) {
                    this.f100966a.mo22258a().m106887u().m42708a("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            C40448ec8 m106889s = this.f100966a.mo22258a().m106889s();
            if (string == null) {
                str2 = "null";
            } else {
                str2 = string;
            }
            if (str == null) {
                str3 = "null";
            } else {
                str3 = str;
            }
            m106889s.m42706c("Logging screen view with name, class", str2, str3);
            if (this.f99706c == null) {
                c50902wE8 = this.f99707d;
            } else {
                c50902wE8 = this.f99706c;
            }
            C50902wE8 c50902wE83 = new C50902wE8(string, str, this.f100966a.m89776N().m92049t0(), true, j);
            this.f99706c = c50902wE83;
            this.f99707d = c50902wE8;
            this.f99712i = c50902wE83;
            this.f100966a.mo22257c().m43695w(new TE8(this, bundle, c50902wE83, c50902wE8, this.f100966a.mo22260A().elapsedRealtime()));
        }
    }

    /* renamed from: F */
    public final C50902wE8 m24013F(Activity activity) {
        Preconditions.checkNotNull(activity);
        C50902wE8 c50902wE8 = (C50902wE8) this.f99709f.get(activity);
        if (c50902wE8 == null) {
            C50902wE8 c50902wE82 = new C50902wE8(null, m24006q(activity.getClass(), "Activity"), this.f100966a.m89776N().m92049t0());
            this.f99709f.put(activity, c50902wE82);
            c50902wE8 = c50902wE82;
        }
        if (this.f99712i != null) {
            return this.f99712i;
        }
        return c50902wE8;
    }

    /* renamed from: G */
    public final void m24012G(Activity activity, C50902wE8 c50902wE8, boolean z) {
        C50902wE8 c50902wE82;
        C50902wE8 c50902wE83;
        String str;
        if (this.f99706c == null) {
            c50902wE82 = this.f99707d;
        } else {
            c50902wE82 = this.f99706c;
        }
        C50902wE8 c50902wE84 = c50902wE82;
        if (c50902wE8.f115670b == null) {
            if (activity != null) {
                str = m24006q(activity.getClass(), "Activity");
            } else {
                str = null;
            }
            c50902wE83 = new C50902wE8(c50902wE8.f115669a, str, c50902wE8.f115671c, c50902wE8.f115673e, c50902wE8.f115674f);
        } else {
            c50902wE83 = c50902wE8;
        }
        this.f99707d = this.f99706c;
        this.f99706c = c50902wE83;
        this.f100966a.mo22257c().m43695w(new RunnableC40832fF8(this, c50902wE83, c50902wE84, this.f100966a.mo22260A().elapsedRealtime(), z));
    }

    @Override // p000.AbstractC51140we8
    /* renamed from: k */
    public final boolean mo6546k() {
        return false;
    }

    /* renamed from: l */
    public final void m24011l(C50902wE8 c50902wE8, C50902wE8 c50902wE82, long j, boolean z, Bundle bundle) {
        boolean z2;
        Bundle bundle2;
        String str;
        long j2;
        long j3;
        mo19953e();
        boolean z3 = false;
        if (c50902wE82 != null && c50902wE82.f115671c == c50902wE8.f115671c && HE8.m104143a(c50902wE82.f115670b, c50902wE8.f115670b) && HE8.m104143a(c50902wE82.f115669a, c50902wE8.f115669a)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z && this.f99708e != null) {
            z3 = true;
        }
        if (z2) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            OW8.m92046v(c50902wE8, bundle3, true);
            if (c50902wE82 != null) {
                String str2 = c50902wE82.f115669a;
                if (str2 != null) {
                    bundle3.putString("_pn", str2);
                }
                String str3 = c50902wE82.f115670b;
                if (str3 != null) {
                    bundle3.putString("_pc", str3);
                }
                bundle3.putLong("_pi", c50902wE82.f115671c);
            }
            if (z3) {
                C52196yQ8 c52196yQ8 = this.f100966a.m89777M().f60677e;
                long j4 = j - c52196yQ8.f119541b;
                c52196yQ8.f119541b = j;
                if (j4 > 0) {
                    this.f100966a.m89776N().m92050t(bundle3, j4);
                }
            }
            if (!this.f100966a.m89751w().m37527D()) {
                bundle3.putLong("_mst", 1L);
            }
            if (true != c50902wE8.f115673e) {
                str = "auto";
            } else {
                str = Stripe3ds2AuthParams.FIELD_APP;
            }
            String str4 = str;
            long currentTimeMillis = this.f100966a.mo22260A().currentTimeMillis();
            if (c50902wE8.f115673e) {
                j2 = currentTimeMillis;
                long j5 = c50902wE8.f115674f;
                if (j5 != 0) {
                    j3 = j5;
                    this.f100966a.m89781I().m87156s(str4, "_vs", j3, bundle3);
                }
            } else {
                j2 = currentTimeMillis;
            }
            j3 = j2;
            this.f100966a.m89781I().m87156s(str4, "_vs", j3, bundle3);
        }
        if (z3) {
            m24010m(this.f99708e, true, j);
        }
        this.f99708e = c50902wE8;
        if (c50902wE8.f115673e) {
            this.f99713j = c50902wE8;
        }
        this.f100966a.m89778L().m88551r(c50902wE8);
    }

    /* renamed from: m */
    public final void m24010m(C50902wE8 c50902wE8, boolean z, long j) {
        boolean z2;
        this.f100966a.m89752v().m71228k(this.f100966a.mo22260A().elapsedRealtime());
        if (c50902wE8 != null && c50902wE8.f115672d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f100966a.m89777M().f60677e.m3504d(z2, z, j) && c50902wE8 != null) {
            c50902wE8.f115672d = false;
        }
    }

    /* renamed from: o */
    public final C50902wE8 m24008o() {
        return this.f99706c;
    }

    /* renamed from: p */
    public final C50902wE8 m24007p(boolean z) {
        m6551f();
        mo19953e();
        if (!z) {
            return this.f99708e;
        }
        C50902wE8 c50902wE8 = this.f99708e;
        if (c50902wE8 != null) {
            return c50902wE8;
        }
        return this.f99713j;
    }

    @VisibleForTesting
    /* renamed from: q */
    public final String m24006q(Class cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        int length2 = str2.length();
        this.f100966a.m89751w();
        if (length2 > 100) {
            this.f100966a.m89751w();
            return str2.substring(0, 100);
        }
        return str2;
    }

    /* renamed from: v */
    public final void m24001v(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f100966a.m89751w().m37527D() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f99709f.put(activity, new C50902wE8(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    /* renamed from: w */
    public final void m24000w(Activity activity) {
        synchronized (this.f99715l) {
            if (activity == this.f99710g) {
                this.f99710g = null;
            }
        }
        if (!this.f100966a.m89751w().m37527D()) {
            return;
        }
        this.f99709f.remove(activity);
    }

    /* renamed from: x */
    public final void m23999x(Activity activity) {
        synchronized (this.f99715l) {
            this.f99714k = false;
            this.f99711h = true;
        }
        long elapsedRealtime = this.f100966a.mo22260A().elapsedRealtime();
        if (!this.f100966a.m89751w().m37527D()) {
            this.f99706c = null;
            this.f100966a.mo22257c().m43695w(new DF8(this, elapsedRealtime));
            return;
        }
        C50902wE8 m24013F = m24013F(activity);
        this.f99707d = this.f99706c;
        this.f99706c = null;
        this.f100966a.mo22257c().m43695w(new PF8(this, m24013F, elapsedRealtime));
    }

    /* renamed from: y */
    public final void m23998y(Activity activity) {
        synchronized (this.f99715l) {
            this.f99714k = true;
            if (activity != this.f99710g) {
                synchronized (this.f99715l) {
                    this.f99710g = activity;
                    this.f99711h = false;
                }
                if (this.f100966a.m89751w().m37527D()) {
                    this.f99712i = null;
                    this.f100966a.mo22257c().m43695w(new RunnableC38452bG8(this));
                }
            }
        }
        if (!this.f100966a.m89751w().m37527D()) {
            this.f99706c = this.f99712i;
            this.f100966a.mo22257c().m43695w(new RunnableC47948rF8(this));
            return;
        }
        m24012G(activity, m24013F(activity), false);
        C38020aY7 m89752v = this.f100966a.m89752v();
        m89752v.f100966a.mo22257c().m43695w(new SP7(m89752v, m89752v.f100966a.mo22260A().elapsedRealtime()));
    }
}
