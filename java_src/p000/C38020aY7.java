package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
/* renamed from: aY7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38020aY7 extends C46677p68 {

    /* renamed from: b */
    public final Map f50634b;

    /* renamed from: c */
    public final Map f50635c;

    /* renamed from: d */
    public long f50636d;

    public C38020aY7(C35248Pn8 c35248Pn8) {
        super(c35248Pn8);
        this.f50635c = new C28385so();
        this.f50634b = new C28385so();
    }

    /* renamed from: f */
    public static /* synthetic */ void m71233f(C38020aY7 c38020aY7, String str, long j) {
        c38020aY7.mo19953e();
        Preconditions.checkNotEmpty(str);
        if (c38020aY7.f50635c.isEmpty()) {
            c38020aY7.f50636d = j;
        }
        Integer num = (Integer) c38020aY7.f50635c.get(str);
        if (num != null) {
            c38020aY7.f50635c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c38020aY7.f50635c.size() >= 100) {
            c38020aY7.f100966a.mo22258a().m106888t().m42708a("Too many ads visible");
        } else {
            c38020aY7.f50635c.put(str, 1);
            c38020aY7.f50634b.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m71232g(C38020aY7 c38020aY7, String str, long j) {
        c38020aY7.mo19953e();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) c38020aY7.f50635c.get(str);
        if (num != null) {
            C50902wE8 m24007p = c38020aY7.f100966a.m89779K().m24007p(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                c38020aY7.f50635c.remove(str);
                Long l = (Long) c38020aY7.f50634b.get(str);
                if (l == null) {
                    c38020aY7.f100966a.mo22258a().m106893o().m42708a("First ad unit exposure time was never set");
                } else {
                    c38020aY7.f50634b.remove(str);
                    c38020aY7.m71226m(str, j - l.longValue(), m24007p);
                }
                if (c38020aY7.f50635c.isEmpty()) {
                    long j2 = c38020aY7.f50636d;
                    if (j2 == 0) {
                        c38020aY7.f100966a.mo22258a().m106893o().m42708a("First ad exposure time was never set");
                        return;
                    }
                    c38020aY7.m71227l(j - j2, m24007p);
                    c38020aY7.f50636d = 0L;
                    return;
                }
                return;
            }
            c38020aY7.f50635c.put(str, Integer.valueOf(intValue));
            return;
        }
        c38020aY7.f100966a.mo22258a().m106893o().m42707b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: i */
    public final void m71230i(String str, long j) {
        if (str != null && str.length() != 0) {
            this.f100966a.mo22257c().m43695w(new RunnableC33996Ke7(this, str, j));
        } else {
            this.f100966a.mo22258a().m106893o().m42708a("Ad unit id must be a non-empty string");
        }
    }

    /* renamed from: j */
    public final void m71229j(String str, long j) {
        if (str != null && str.length() != 0) {
            this.f100966a.mo22257c().m43695w(new RunnableC40804fC7(this, str, j));
        } else {
            this.f100966a.mo22258a().m106893o().m42708a("Ad unit id must be a non-empty string");
        }
    }

    /* renamed from: k */
    public final void m71228k(long j) {
        C50902wE8 m24007p = this.f100966a.m89779K().m24007p(false);
        for (String str : this.f50634b.keySet()) {
            m71226m(str, j - ((Long) this.f50634b.get(str)).longValue(), m24007p);
        }
        if (!this.f50634b.isEmpty()) {
            m71227l(j - this.f50636d, m24007p);
        }
        m71225n(j);
    }

    /* renamed from: l */
    public final void m71227l(long j, C50902wE8 c50902wE8) {
        if (c50902wE8 == null) {
            this.f100966a.mo22258a().m106889s().m42708a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.f100966a.mo22258a().m106889s().m42707b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            OW8.m92046v(c50902wE8, bundle, true);
            this.f100966a.m89781I().m87157r("am", "_xa", bundle);
        }
    }

    /* renamed from: m */
    public final void m71226m(String str, long j, C50902wE8 c50902wE8) {
        if (c50902wE8 == null) {
            this.f100966a.mo22258a().m106889s().m42708a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.f100966a.mo22258a().m106889s().m42707b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            OW8.m92046v(c50902wE8, bundle, true);
            this.f100966a.m89781I().m87157r("am", "_xu", bundle);
        }
    }

    /* renamed from: n */
    public final void m71225n(long j) {
        for (String str : this.f50634b.keySet()) {
            this.f50634b.put(str, Long.valueOf(j));
        }
        if (!this.f50634b.isEmpty()) {
            this.f50636d = j;
        }
    }
}
