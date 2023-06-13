package p000;

import java.lang.reflect.Array;
/* renamed from: la1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44572la1 {

    /* renamed from: a */
    public C48772sf1 f96337a;

    /* renamed from: b */
    public int f96338b;

    /* renamed from: c */
    public int f96339c;

    /* renamed from: d */
    public double f96340d;

    /* renamed from: e */
    public double f96341e;

    /* renamed from: f */
    public C25724c[][] f96342f;

    /* renamed from: g */
    public boolean f96343g = false;

    /* renamed from: h */
    public boolean f96344h = false;

    /* renamed from: i */
    public double f96345i = Double.NaN;

    /* renamed from: la1$a */
    /* loaded from: classes8.dex */
    public class C25722a implements GB0 {

        /* renamed from: b */
        public boolean f96346b = true;

        public C25722a() {
        }

        @Override // p000.GB0
        /* renamed from: d */
        public void mo16954d(EB0 eb0, int i) {
            if (!eb0.m109310k2()) {
                this.f96346b = false;
                return;
            }
            C44572la1.this.m27144a(eb0.mo1713a3(i, 0), eb0.mo1713a3(i, 1), eb0.mo1713a3(i, 2));
        }

        @Override // p000.GB0
        /* renamed from: e */
        public boolean mo16953e() {
            return false;
        }

        @Override // p000.GB0
        public boolean isDone() {
            return !this.f96346b;
        }
    }

    /* renamed from: la1$b */
    /* loaded from: classes8.dex */
    public class C25723b implements GB0 {

        /* renamed from: b */
        public boolean f96348b = false;

        public C25723b() {
        }

        @Override // p000.GB0
        /* renamed from: d */
        public void mo16954d(EB0 eb0, int i) {
            if (!eb0.m109310k2()) {
                this.f96348b = true;
            } else if (Double.isNaN(eb0.mo1714W0(i))) {
                eb0.mo1705y1(i, 2, C44572la1.this.m27140e(eb0.mo1713a3(i, 0), eb0.mo1713a3(i, 1)));
            }
        }

        @Override // p000.GB0
        /* renamed from: e */
        public boolean mo16953e() {
            return false;
        }

        @Override // p000.GB0
        public boolean isDone() {
            return this.f96348b;
        }
    }

    /* renamed from: la1$c */
    /* loaded from: classes8.dex */
    public static class C25724c {

        /* renamed from: a */
        public int f96350a = 0;

        /* renamed from: b */
        public double f96351b = 0.0d;

        /* renamed from: c */
        public double f96352c;

        /* renamed from: a */
        public void m27137a(double d) {
            this.f96350a++;
            this.f96351b += d;
        }

        /* renamed from: b */
        public void m27136b() {
            this.f96352c = Double.NaN;
            int i = this.f96350a;
            if (i > 0) {
                this.f96352c = this.f96351b / i;
            }
        }

        /* renamed from: c */
        public double m27135c() {
            return this.f96352c;
        }
    }

    public C44572la1(C48772sf1 c48772sf1, int i, int i2) {
        this.f96337a = c48772sf1;
        this.f96338b = i;
        this.f96339c = i2;
        this.f96340d = c48772sf1.m13867r() / i;
        double m13872m = c48772sf1.m13872m() / i2;
        this.f96341e = m13872m;
        if (this.f96340d <= 0.0d) {
            this.f96338b = 1;
        }
        if (m13872m <= 0.0d) {
            this.f96339c = 1;
        }
        this.f96342f = (C25724c[][]) Array.newInstance(C25724c.class, i, i2);
    }

    /* renamed from: c */
    public static C44572la1 m27142c(WB1 wb1, WB1 wb12) {
        C48772sf1 m13882c = wb1.m78759Z().m13882c();
        if (wb12 != null) {
            m13882c.m13873l(wb12.m78759Z());
        }
        C44572la1 c44572la1 = new C44572la1(m13882c, 3, 3);
        c44572la1.m27143b(wb1);
        if (wb12 != null) {
            c44572la1.m27143b(wb12);
        }
        return c44572la1;
    }

    /* renamed from: a */
    public void m27144a(double d, double d2, double d3) {
        if (Double.isNaN(d3)) {
            return;
        }
        this.f96344h = true;
        m27141d(d, d2, true).m27137a(d3);
    }

    /* renamed from: b */
    public void m27143b(WB1 wb1) {
        wb1.mo77235e(new C25722a());
    }

    /* renamed from: d */
    public final C25724c m27141d(double d, double d2, boolean z) {
        int i;
        int i2 = 0;
        if (this.f96338b > 1) {
            i = C37916aN2.m71519a((int) ((d - this.f96337a.m13869p()) / this.f96340d), 0, this.f96338b - 1);
        } else {
            i = 0;
        }
        if (this.f96339c > 1) {
            i2 = C37916aN2.m71519a((int) ((d2 - this.f96337a.m13868q()) / this.f96341e), 0, this.f96339c - 1);
        }
        C25724c c25724c = this.f96342f[i][i2];
        if (z && c25724c == null) {
            C25724c c25724c2 = new C25724c();
            this.f96342f[i][i2] = c25724c2;
            return c25724c2;
        }
        return c25724c;
    }

    /* renamed from: e */
    public double m27140e(double d, double d2) {
        if (!this.f96343g) {
            m27139f();
        }
        C25724c m27141d = m27141d(d, d2, false);
        if (m27141d == null) {
            return this.f96345i;
        }
        return m27141d.m27135c();
    }

    /* renamed from: f */
    public final void m27139f() {
        this.f96343g = true;
        double d = 0.0d;
        int i = 0;
        for (int i2 = 0; i2 < this.f96342f.length; i2++) {
            int i3 = 0;
            while (true) {
                C25724c[][] c25724cArr = this.f96342f;
                if (i3 < c25724cArr[0].length) {
                    C25724c c25724c = c25724cArr[i2][i3];
                    if (c25724c != null) {
                        c25724c.m27136b();
                        i++;
                        d += c25724c.m27135c();
                    }
                    i3++;
                }
            }
        }
        this.f96345i = Double.NaN;
        if (i > 0) {
            this.f96345i = d / i;
        }
    }

    /* renamed from: g */
    public void m27138g(WB1 wb1) {
        if (!this.f96344h) {
            return;
        }
        if (!this.f96343g) {
            m27139f();
        }
        wb1.mo77235e(new C25723b());
    }
}
