package p000;
/* renamed from: VB1 */
/* loaded from: classes8.dex */
public class VB1 {

    /* renamed from: a */
    public C38409bC1 f38715a;

    /* renamed from: b */
    public C40414eZ3 f38716b;

    /* renamed from: c */
    public C8572a f38717c;

    /* renamed from: d */
    public int f38718d;

    /* renamed from: e */
    public double f38719e;

    /* renamed from: VB1$a */
    /* loaded from: classes8.dex */
    public static class C8572a {

        /* renamed from: a */
        public C52053yB0 f38720a;

        /* renamed from: b */
        public C52053yB0 f38721b;

        /* renamed from: c */
        public double f38722c;

        /* renamed from: d */
        public double f38723d;

        /* renamed from: a */
        public C52053yB0 m80249a() {
            if (this.f38721b == null) {
                C52053yB0 c52053yB0 = this.f38720a;
                this.f38721b = new C52053yB0(c52053yB0.f118922b + (this.f38722c / 2.0d), c52053yB0.f118923c + (this.f38723d / 2.0d));
            }
            return this.f38721b;
        }

        /* renamed from: b */
        public C48772sf1 m80248b() {
            C52053yB0 c52053yB0 = this.f38720a;
            if (c52053yB0 != null) {
                double d = c52053yB0.f118922b;
                double d2 = c52053yB0.f118923c;
                return new C48772sf1(d, this.f38722c + d, d2, d2 + this.f38723d);
            }
            C52053yB0 c52053yB02 = this.f38721b;
            if (c52053yB02 != null) {
                double d3 = c52053yB02.f118922b;
                double d4 = this.f38722c;
                double d5 = c52053yB02.f118923c;
                double d6 = this.f38723d;
                return new C48772sf1(d3 - (d4 / 2.0d), d3 + (d4 / 2.0d), d5 - (d6 / 2.0d), d5 + (d6 / 2.0d));
            }
            return new C48772sf1(0.0d, this.f38722c, 0.0d, this.f38723d);
        }

        /* renamed from: c */
        public void m80247c(C52053yB0 c52053yB0) {
            this.f38721b = c52053yB0;
        }

        /* renamed from: d */
        public void m80246d(double d) {
            this.f38723d = d;
        }

        /* renamed from: e */
        public void m80245e(double d) {
            this.f38722c = d;
        }
    }

    public VB1() {
        this(new C38409bC1());
    }

    /* renamed from: a */
    public C52053yB0 m80256a(double d, double d2) {
        C52053yB0 c52053yB0 = new C52053yB0(d, d2);
        this.f38716b.m42760f(c52053yB0);
        return c52053yB0;
    }

    /* renamed from: b */
    public CX3 m80255b() {
        C48772sf1 m80248b = this.f38717c.m80248b();
        double m13867r = m80248b.m13867r() / 2.0d;
        double m13872m = m80248b.m13872m() / 2.0d;
        double m13869p = m80248b.m13869p() + m13867r;
        double m13868q = m80248b.m13868q() + m13872m;
        C52053yB0[] c52053yB0Arr = new C52053yB0[this.f38718d + 1];
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.f38718d;
            if (i < i3) {
                double d = i * (6.283185307179586d / i3);
                c52053yB0Arr[i2] = m80256a((Math.cos(d) * m13867r) + m13869p, (Math.sin(d) * m13872m) + m13868q);
                i++;
                i2++;
            } else {
                c52053yB0Arr[i2] = new C52053yB0(c52053yB0Arr[0]);
                return (CX3) m80254c(this.f38715a.m64831x(this.f38715a.m64845j(c52053yB0Arr)));
            }
        }
    }

    /* renamed from: c */
    public WB1 m80254c(WB1 wb1) {
        double d = this.f38719e;
        if (d != 0.0d) {
            wb1.mo77235e(C19968e9.m43179f(d, this.f38717c.m80249a().f118922b, this.f38717c.m80249a().f118923c));
        }
        return wb1;
    }

    /* renamed from: d */
    public void m80253d(C52053yB0 c52053yB0) {
        this.f38717c.m80247c(c52053yB0);
    }

    /* renamed from: e */
    public void m80252e(double d) {
        this.f38717c.m80246d(d);
    }

    /* renamed from: f */
    public void m80251f(int i) {
        this.f38718d = i;
    }

    /* renamed from: g */
    public void m80250g(double d) {
        this.f38717c.m80245e(d);
    }

    public VB1(C38409bC1 c38409bC1) {
        this.f38716b = null;
        this.f38717c = new C8572a();
        this.f38718d = 100;
        this.f38719e = 0.0d;
        this.f38715a = c38409bC1;
        this.f38716b = c38409bC1.m64860B();
    }
}
