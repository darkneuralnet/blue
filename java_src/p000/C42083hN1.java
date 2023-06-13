package p000;
/* renamed from: hN1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42083hN1 {

    /* renamed from: a */
    public C52053yB0 f85123a;

    /* renamed from: b */
    public double f85124b;

    /* renamed from: c */
    public double f85125c;

    /* renamed from: d */
    public double f85126d;

    /* renamed from: e */
    public boolean f85127e = false;

    public C42083hN1(C52053yB0 c52053yB0, double d) {
        this.f85123a = c52053yB0;
        this.f85124b = d;
        if (d > 0.0d) {
            if (d != 1.0d) {
                this.f85125c = m36498g(c52053yB0.m3883k());
                this.f85126d = m36498g(c52053yB0.m3882l());
                return;
            }
            this.f85125c = c52053yB0.m3883k();
            this.f85126d = c52053yB0.m3882l();
            return;
        }
        throw new IllegalArgumentException("Scale factor must be non-zero");
    }

    /* renamed from: a */
    public C52053yB0 m36504a() {
        return this.f85123a;
    }

    /* renamed from: b */
    public boolean m36503b(C52053yB0 c52053yB0) {
        double m36499f = m36499f(c52053yB0.f118922b);
        double m36499f2 = m36499f(c52053yB0.f118923c);
        double d = this.f85125c;
        if (m36499f >= d + 0.5d || m36499f < d - 0.5d) {
            return false;
        }
        double d2 = this.f85126d;
        if (m36499f2 >= d2 + 0.5d || m36499f2 < d2 - 0.5d) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m36502c(C52053yB0 c52053yB0, C52053yB0 c52053yB02) {
        if (this.f85124b == 1.0d) {
            return m36501d(c52053yB0.f118922b, c52053yB0.f118923c, c52053yB02.f118922b, c52053yB02.f118923c);
        }
        return m36501d(m36499f(c52053yB0.f118922b), m36499f(c52053yB0.f118923c), m36499f(c52053yB02.f118922b), m36499f(c52053yB02.f118923c));
    }

    /* renamed from: d */
    public final boolean m36501d(double d, double d2, double d3, double d4) {
        double d5;
        double d6;
        double d7;
        double d8;
        int i;
        int m77367a;
        if (d > d3) {
            d7 = d;
            d8 = d2;
            d5 = d3;
            d6 = d4;
        } else {
            d5 = d;
            d6 = d2;
            d7 = d3;
            d8 = d4;
        }
        double d9 = this.f85125c + 0.5d;
        if (Math.min(d5, d7) >= d9) {
            return false;
        }
        double d10 = this.f85125c - 0.5d;
        if (Math.max(d5, d7) < d10) {
            return false;
        }
        double d11 = this.f85126d + 0.5d;
        if (Math.min(d6, d8) >= d11) {
            return false;
        }
        double d12 = this.f85126d - 0.5d;
        if (Math.max(d6, d8) < d12) {
            return false;
        }
        if (d5 == d7 || d6 == d8) {
            return true;
        }
        double d13 = d7;
        double d14 = d8;
        double d15 = d6;
        int m77367a2 = X70.m77367a(d5, d6, d7, d8, d10, d11);
        if (m77367a2 == 0) {
            if (d15 < d14) {
                return false;
            }
            return true;
        }
        int m77367a3 = X70.m77367a(d5, d15, d13, d14, d9, d11);
        if (m77367a3 == 0) {
            if (i > 0) {
                return false;
            }
            return true;
        } else if (m77367a2 != m77367a3 || (m77367a = X70.m77367a(d5, d15, d13, d14, d10, d12)) == 0 || m77367a != m77367a2) {
            return true;
        } else {
            int m77367a4 = X70.m77367a(d5, d15, d13, d14, d9, d12);
            if (m77367a4 == 0) {
                if (d15 < d14) {
                    return false;
                }
                return true;
            } else if (m77367a == m77367a4 && m77367a4 == m77367a3) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* renamed from: e */
    public boolean m36500e() {
        return this.f85127e;
    }

    /* renamed from: f */
    public final double m36499f(double d) {
        return d * this.f85124b;
    }

    /* renamed from: g */
    public final double m36498g(double d) {
        return Math.round(d * this.f85124b);
    }

    /* renamed from: h */
    public void m36497h() {
        this.f85127e = true;
    }

    public String toString() {
        return "HP(" + C44204kw6.m28123u(this.f85123a) + ")";
    }
}
