package p000;

import android.content.SharedPreferences;
import android.util.Pair;
import ch.qos.logback.core.spi.ComponentTracker;
import com.google.android.gms.common.internal.Preconditions;
import com.stripe.android.core.networking.AnalyticsFields;
import p000.C25919m8;
/* renamed from: Ih8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33556Ih8 extends AbstractC32017Bs8 {

    /* renamed from: y */
    public static final Pair f16063y = new Pair("", 0L);

    /* renamed from: c */
    public SharedPreferences f16064c;

    /* renamed from: d */
    public C40498eh8 f16065d;

    /* renamed from: e */
    public final C52939zg8 f16066e;

    /* renamed from: f */
    public final C52939zg8 f16067f;

    /* renamed from: g */
    public final C48799sh8 f16068g;

    /* renamed from: h */
    public String f16069h;

    /* renamed from: i */
    public boolean f16070i;

    /* renamed from: j */
    public long f16071j;

    /* renamed from: k */
    public final C52939zg8 f16072k;

    /* renamed from: l */
    public final C36580Vf8 f16073l;

    /* renamed from: m */
    public final C48799sh8 f16074m;

    /* renamed from: n */
    public final C36580Vf8 f16075n;

    /* renamed from: o */
    public final C52939zg8 f16076o;

    /* renamed from: p */
    public final C52939zg8 f16077p;

    /* renamed from: q */
    public boolean f16078q;

    /* renamed from: r */
    public final C36580Vf8 f16079r;

    /* renamed from: s */
    public final C36580Vf8 f16080s;

    /* renamed from: t */
    public final C52939zg8 f16081t;

    /* renamed from: u */
    public final C48799sh8 f16082u;

    /* renamed from: v */
    public final C48799sh8 f16083v;

    /* renamed from: w */
    public final C52939zg8 f16084w;

    /* renamed from: x */
    public final C43453jg8 f16085x;

    public C33556Ih8(C35248Pn8 c35248Pn8) {
        super(c35248Pn8);
        this.f16072k = new C52939zg8(this, "session_timeout", ComponentTracker.DEFAULT_TIMEOUT);
        this.f16073l = new C36580Vf8(this, "start_new_session", true);
        this.f16076o = new C52939zg8(this, "last_pause_time", 0L);
        this.f16077p = new C52939zg8(this, AnalyticsFields.SESSION_ID, 0L);
        this.f16074m = new C48799sh8(this, "non_personalized_ads", null);
        this.f16075n = new C36580Vf8(this, "allow_remote_dynamite", false);
        this.f16066e = new C52939zg8(this, "first_open_time", 0L);
        this.f16067f = new C52939zg8(this, "app_install_time", 0L);
        this.f16068g = new C48799sh8(this, "app_instance_id", null);
        this.f16079r = new C36580Vf8(this, "app_backgrounded", false);
        this.f16080s = new C36580Vf8(this, "deep_link_retrieval_complete", false);
        this.f16081t = new C52939zg8(this, "deep_link_retrieval_attempts", 0L);
        this.f16082u = new C48799sh8(this, "firebase_feature_rollouts", null);
        this.f16083v = new C48799sh8(this, "deferred_attribution_cache", null);
        this.f16084w = new C52939zg8(this, "deferred_attribution_cache_timestamp", 0L);
        this.f16085x = new C43453jg8(this, "default_event_parameters", null);
    }

    @Override // p000.AbstractC32017Bs8
    /* renamed from: f */
    public final void mo92073f() {
        SharedPreferences sharedPreferences = this.f100966a.mo22255z().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f16064c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f16078q = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f16064c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f100966a.m89751w();
        this.f16065d = new C40498eh8(this, "health_monitor", Math.max(0L, ((Long) C37795a98.f49967e.m97658a(null)).longValue()), null);
    }

    @Override // p000.AbstractC32017Bs8
    /* renamed from: g */
    public final boolean mo43707g() {
        return true;
    }

    /* renamed from: l */
    public final SharedPreferences m101802l() {
        mo19953e();
        m113419h();
        Preconditions.checkNotNull(this.f16064c);
        return this.f16064c;
    }

    /* renamed from: m */
    public final Pair m101801m(String str) {
        mo19953e();
        long elapsedRealtime = this.f100966a.mo22260A().elapsedRealtime();
        String str2 = this.f16069h;
        if (str2 != null && elapsedRealtime < this.f16071j) {
            return new Pair(str2, Boolean.valueOf(this.f16070i));
        }
        this.f16071j = elapsedRealtime + this.f100966a.m89751w().m37512o(str, C37795a98.f49963c);
        C25919m8.m26306b(true);
        try {
            C25919m8.C25920a m26307a = C25919m8.m26307a(this.f100966a.mo22255z());
            this.f16069h = "";
            String m26300a = m26307a.m26300a();
            if (m26300a != null) {
                this.f16069h = m26300a;
            }
            this.f16070i = m26307a.m26299b();
        } catch (Exception e) {
            this.f100966a.mo22258a().m106894n().m42707b("Unable to get advertising id", e);
            this.f16069h = "";
        }
        C25919m8.m26306b(false);
        return new Pair(this.f16069h, Boolean.valueOf(this.f16070i));
    }

    /* renamed from: n */
    public final C37110Xm7 m101800n() {
        mo19953e();
        return C37110Xm7.m76364b(m101802l().getString("consent_settings", "G1"));
    }

    /* renamed from: o */
    public final Boolean m101799o() {
        mo19953e();
        if (m101802l().contains("measurement_enabled")) {
            return Boolean.valueOf(m101802l().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* renamed from: p */
    public final void m101798p(Boolean bool) {
        mo19953e();
        SharedPreferences.Editor edit = m101802l().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* renamed from: q */
    public final void m101797q(boolean z) {
        mo19953e();
        this.f100966a.mo22258a().m106889s().m42707b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = m101802l().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* renamed from: r */
    public final boolean m101796r() {
        SharedPreferences sharedPreferences = this.f16064c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* renamed from: s */
    public final boolean m101795s(long j) {
        if (j - this.f16072k.m564a() > this.f16076o.m564a()) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean m101794t(int i) {
        return C37110Xm7.m76356j(i, m101802l().getInt("consent_source", 100));
    }
}
