package p000;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.Stripe3ds2AuthParams;
/* renamed from: Io9 */
/* loaded from: classes6.dex */
public final class Io9 {

    /* renamed from: a */
    public final C35248Pn8 f16248a;

    public Io9(C35248Pn8 c35248Pn8) {
        this.f16248a = c35248Pn8;
    }

    /* renamed from: a */
    public final void m101679a(String str, Bundle bundle) {
        String uri;
        this.f16248a.mo22257c().mo19953e();
        if (!this.f16248a.m89762l()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (!TextUtils.isEmpty(uri)) {
                this.f16248a.m89784F().f16083v.m13819b(uri);
                this.f16248a.m89784F().f16084w.m563b(this.f16248a.mo22260A().currentTimeMillis());
            }
        }
    }

    /* renamed from: b */
    public final void m101678b() {
        String str;
        this.f16248a.mo22257c().mo19953e();
        if (!m101676d()) {
            return;
        }
        if (m101675e()) {
            this.f16248a.m89784F().f16083v.m13819b(null);
            Bundle bundle = new Bundle();
            bundle.putString(Stripe3ds2AuthParams.FIELD_SOURCE, "(not set)");
            bundle.putString("medium", "(not set)");
            bundle.putString("_cis", "intent");
            bundle.putLong("_cc", 1L);
            this.f16248a.m89781I().m87157r("auto", "_cmpx", bundle);
        } else {
            String m13820a = this.f16248a.m89784F().f16083v.m13820a();
            if (TextUtils.isEmpty(m13820a)) {
                this.f16248a.mo22258a().m106891q().m42708a("Cache still valid but referrer not found");
            } else {
                long m564a = this.f16248a.m89784F().f16084w.m564a() / CoreConstants.MILLIS_IN_ONE_HOUR;
                Uri parse = Uri.parse(m13820a);
                Bundle bundle2 = new Bundle();
                Pair pair = new Pair(parse.getPath(), bundle2);
                for (String str2 : parse.getQueryParameterNames()) {
                    bundle2.putString(str2, parse.getQueryParameter(str2));
                }
                ((Bundle) pair.second).putLong("_cc", (m564a - 1) * CoreConstants.MILLIS_IN_ONE_HOUR);
                Object obj = pair.first;
                if (obj == null) {
                    str = Stripe3ds2AuthParams.FIELD_APP;
                } else {
                    str = (String) obj;
                }
                this.f16248a.m89781I().m87157r(str, "_cmp", (Bundle) pair.second);
            }
            this.f16248a.m89784F().f16083v.m13819b(null);
        }
        this.f16248a.m89784F().f16084w.m563b(0L);
    }

    /* renamed from: c */
    public final void m101677c() {
        if (m101676d() && m101675e()) {
            this.f16248a.m89784F().f16083v.m13819b(null);
        }
    }

    /* renamed from: d */
    public final boolean m101676d() {
        return this.f16248a.m89784F().f16084w.m564a() > 0;
    }

    /* renamed from: e */
    public final boolean m101675e() {
        if (!m101676d() || this.f16248a.mo22260A().currentTimeMillis() - this.f16248a.m89784F().f16084w.m564a() <= this.f16248a.m89751w().m37512o(null, C37795a98.f49953U)) {
            return false;
        }
        return true;
    }
}
