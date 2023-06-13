package p000;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/* renamed from: ln4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44705ln4 {

    /* renamed from: a */
    public final C32036Bv0 f96688a;

    /* renamed from: b */
    public final double f96689b;

    /* renamed from: c */
    public final double f96690c;

    /* renamed from: d */
    public C25775a f96691d;

    /* renamed from: e */
    public C25775a f96692e;

    /* renamed from: f */
    public boolean f96693f;

    /* renamed from: ln4$a */
    /* loaded from: classes6.dex */
    public static class C25775a {

        /* renamed from: k */
        public static final C10776ad f96694k = C10776ad.m71007e();

        /* renamed from: l */
        public static final long f96695l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a */
        public final C38141al0 f96696a;

        /* renamed from: b */
        public final boolean f96697b;

        /* renamed from: c */
        public Timer f96698c;

        /* renamed from: d */
        public C44112kn4 f96699d;

        /* renamed from: e */
        public long f96700e;

        /* renamed from: f */
        public double f96701f;

        /* renamed from: g */
        public C44112kn4 f96702g;

        /* renamed from: h */
        public C44112kn4 f96703h;

        /* renamed from: i */
        public long f96704i;

        /* renamed from: j */
        public long f96705j;

        public C25775a(C44112kn4 c44112kn4, long j, C38141al0 c38141al0, C32036Bv0 c32036Bv0, String str, boolean z) {
            this.f96696a = c38141al0;
            this.f96700e = j;
            this.f96699d = c44112kn4;
            this.f96701f = j;
            this.f96698c = c38141al0.m70796a();
            m26815g(c32036Bv0, str, z);
            this.f96697b = z;
        }

        /* renamed from: c */
        public static long m26819c(C32036Bv0 c32036Bv0, String str) {
            if (str == "Trace") {
                return c32036Bv0.m113369E();
            }
            return c32036Bv0.m113341q();
        }

        /* renamed from: d */
        public static long m26818d(C32036Bv0 c32036Bv0, String str) {
            if (str == "Trace") {
                return c32036Bv0.m113338t();
            }
            return c32036Bv0.m113338t();
        }

        /* renamed from: e */
        public static long m26817e(C32036Bv0 c32036Bv0, String str) {
            if (str == "Trace") {
                return c32036Bv0.m113368F();
            }
            return c32036Bv0.m113340r();
        }

        /* renamed from: f */
        public static long m26816f(C32036Bv0 c32036Bv0, String str) {
            if (str == "Trace") {
                return c32036Bv0.m113338t();
            }
            return c32036Bv0.m113338t();
        }

        /* renamed from: a */
        public synchronized void m26821a(boolean z) {
            C44112kn4 c44112kn4;
            long j;
            if (z) {
                c44112kn4 = this.f96702g;
            } else {
                c44112kn4 = this.f96703h;
            }
            this.f96699d = c44112kn4;
            if (z) {
                j = this.f96704i;
            } else {
                j = this.f96705j;
            }
            this.f96700e = j;
        }

        /* renamed from: b */
        public synchronized boolean m26820b(C43891kQ3 c43891kQ3) {
            Timer m70796a = this.f96696a.m70796a();
            double m47035d = (this.f96698c.m47035d(m70796a) * this.f96699d.m28441a()) / f96695l;
            if (m47035d > 0.0d) {
                this.f96701f = Math.min(this.f96701f + m47035d, this.f96700e);
                this.f96698c = m70796a;
            }
            double d = this.f96701f;
            if (d >= 1.0d) {
                this.f96701f = d - 1.0d;
                return true;
            }
            if (this.f96697b) {
                f96694k.m71002j("Exceeded log rate limit, dropping the log.");
            }
            return false;
        }

        /* renamed from: g */
        public final void m26815g(C32036Bv0 c32036Bv0, String str, boolean z) {
            long m26816f = m26816f(c32036Bv0, str);
            long m26817e = m26817e(c32036Bv0, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C44112kn4 c44112kn4 = new C44112kn4(m26817e, m26816f, timeUnit);
            this.f96702g = c44112kn4;
            this.f96704i = m26817e;
            if (z) {
                f96694k.m71010b("Foreground %s logging rate:%f, burst capacity:%d", str, c44112kn4, Long.valueOf(m26817e));
            }
            long m26818d = m26818d(c32036Bv0, str);
            long m26819c = m26819c(c32036Bv0, str);
            C44112kn4 c44112kn42 = new C44112kn4(m26819c, m26818d, timeUnit);
            this.f96703h = c44112kn42;
            this.f96705j = m26819c;
            if (z) {
                f96694k.m71010b("Background %s logging rate:%f, capacity:%d", str, c44112kn42, Long.valueOf(m26819c));
            }
        }
    }

    public C44705ln4(Context context, C44112kn4 c44112kn4, long j) {
        this(c44112kn4, j, new C38141al0(), m26830b(), m26830b(), C32036Bv0.m113351g());
        this.f96693f = C35435Qi6.m88157b(context);
    }

    @VisibleForTesting
    /* renamed from: b */
    public static double m26830b() {
        return new Random().nextDouble();
    }

    /* renamed from: a */
    public void m26831a(boolean z) {
        this.f96691d.m26821a(z);
        this.f96692e.m26821a(z);
    }

    /* renamed from: c */
    public final boolean m26829c(List<C45670nQ3> list) {
        if (list.size() <= 0 || list.get(0).m23801Z() <= 0 || list.get(0).m23802Y(0) != EnumC34147Kv5.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m26828d() {
        if (this.f96690c < this.f96688a.m113352f()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m26827e() {
        if (this.f96689b < this.f96688a.m113339s()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m26826f() {
        if (this.f96689b < this.f96688a.m113367G()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m26825g(C43891kQ3 c43891kQ3) {
        if (!m26822j(c43891kQ3)) {
            return false;
        }
        if (c43891kQ3.mo27314j()) {
            return !this.f96692e.m26820b(c43891kQ3);
        }
        if (!c43891kQ3.mo27313k()) {
            return true;
        }
        return !this.f96691d.m26820b(c43891kQ3);
    }

    /* renamed from: h */
    public boolean m26824h(C43891kQ3 c43891kQ3) {
        if (c43891kQ3.mo27313k() && !m26826f() && !m26829c(c43891kQ3.mo27312l().m40025t0())) {
            return false;
        }
        if (m26823i(c43891kQ3) && !m26828d() && !m26829c(c43891kQ3.mo27312l().m40025t0())) {
            return false;
        }
        if (c43891kQ3.mo27314j() && !m26827e() && !m26829c(c43891kQ3.mo27317e().m97716p0())) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public boolean m26823i(C43891kQ3 c43891kQ3) {
        if (c43891kQ3.mo27313k() && c43891kQ3.mo27312l().m40026s0().startsWith("_st_") && c43891kQ3.mo27312l().m40036h0("Hosting_activity")) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m26822j(C43891kQ3 c43891kQ3) {
        if ((c43891kQ3.mo27313k() && ((c43891kQ3.mo27312l().m40026s0().equals(EnumC36275Ty0.FOREGROUND_TRACE_NAME.toString()) || c43891kQ3.mo27312l().m40026s0().equals(EnumC36275Ty0.BACKGROUND_TRACE_NAME.toString())) && c43891kQ3.mo27312l().m40033l0() > 0)) || c43891kQ3.mo27315h()) {
            return false;
        }
        return true;
    }

    public C44705ln4(C44112kn4 c44112kn4, long j, C38141al0 c38141al0, double d, double d2, C32036Bv0 c32036Bv0) {
        this.f96691d = null;
        this.f96692e = null;
        boolean z = false;
        this.f96693f = false;
        C35435Qi6.m88158a(0.0d <= d && d < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d2 && d2 < 1.0d) {
            z = true;
        }
        C35435Qi6.m88158a(z, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.f96689b = d;
        this.f96690c = d2;
        this.f96688a = c32036Bv0;
        this.f96691d = new C25775a(c44112kn4, j, c38141al0, c32036Bv0, "Trace", this.f96693f);
        this.f96692e = new C25775a(c44112kn4, j, c38141al0, c32036Bv0, "Network", this.f96693f);
    }
}
