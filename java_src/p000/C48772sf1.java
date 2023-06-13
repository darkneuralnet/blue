package p000;

import java.io.Serializable;
/* renamed from: sf1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C48772sf1 implements Comparable, Serializable {
    private static final long serialVersionUID = 5873921885273102420L;

    /* renamed from: b */
    public double f109076b;

    /* renamed from: c */
    public double f109077c;

    /* renamed from: d */
    public double f109078d;

    /* renamed from: e */
    public double f109079e;

    public C48772sf1() {
        m13866s();
    }

    /* renamed from: H */
    public static boolean m13889H(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03) {
        double d = c52053yB03.f118922b;
        double d2 = c52053yB0.f118922b;
        double d3 = c52053yB02.f118922b;
        if (d >= (d2 < d3 ? d2 : d3)) {
            if (d2 <= d3) {
                d2 = d3;
            }
            if (d <= d2) {
                double d4 = c52053yB03.f118923c;
                double d5 = c52053yB0.f118923c;
                double d6 = c52053yB02.f118923c;
                if (d4 >= (d5 < d6 ? d5 : d6)) {
                    if (d5 <= d6) {
                        d5 = d6;
                    }
                    return d4 <= d5;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: J */
    public static boolean m13888J(C52053yB0 c52053yB0, C52053yB0 c52053yB02, C52053yB0 c52053yB03, C52053yB0 c52053yB04) {
        double min = Math.min(c52053yB03.f118922b, c52053yB04.f118922b);
        double max = Math.max(c52053yB03.f118922b, c52053yB04.f118922b);
        double min2 = Math.min(c52053yB0.f118922b, c52053yB02.f118922b);
        double max2 = Math.max(c52053yB0.f118922b, c52053yB02.f118922b);
        if (min2 > max || max2 < min) {
            return false;
        }
        double min3 = Math.min(c52053yB03.f118923c, c52053yB04.f118923c);
        double max3 = Math.max(c52053yB03.f118923c, c52053yB04.f118923c);
        double min4 = Math.min(c52053yB0.f118923c, c52053yB02.f118923c);
        double max4 = Math.max(c52053yB0.f118923c, c52053yB02.f118923c);
        if (min4 > max3 || max4 < min3) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public boolean m13891E(C52053yB0 c52053yB0) {
        return m13862w(c52053yB0.f118922b, c52053yB0.f118923c);
    }

    /* renamed from: F */
    public boolean m13890F(C52053yB0 c52053yB0, C52053yB0 c52053yB02) {
        double d;
        double d2;
        if (m13886L()) {
            return false;
        }
        double d3 = c52053yB0.f118922b;
        double d4 = c52053yB02.f118922b;
        if (d3 < d4) {
            d = d3;
        } else {
            d = d4;
        }
        if (d > this.f109077c) {
            return false;
        }
        if (d3 <= d4) {
            d3 = d4;
        }
        if (d3 < this.f109076b) {
            return false;
        }
        double d5 = c52053yB0.f118923c;
        double d6 = c52053yB02.f118923c;
        if (d5 < d6) {
            d2 = d5;
        } else {
            d2 = d6;
        }
        if (d2 > this.f109079e) {
            return false;
        }
        if (d5 <= d6) {
            d5 = d6;
        }
        if (d5 < this.f109078d) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public boolean m13887K(C48772sf1 c48772sf1) {
        if (m13886L() || c48772sf1.m13886L() || c48772sf1.f109076b > this.f109077c || c48772sf1.f109077c < this.f109076b || c48772sf1.f109078d > this.f109079e || c48772sf1.f109079e < this.f109078d) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    public boolean m13886L() {
        return this.f109077c < this.f109076b;
    }

    /* renamed from: M */
    public void m13885M() {
        this.f109076b = 0.0d;
        this.f109077c = -1.0d;
        this.f109078d = 0.0d;
        this.f109079e = -1.0d;
    }

    /* renamed from: a */
    public boolean m13884a(C52053yB0 c52053yB0) {
        return m13880e(c52053yB0);
    }

    /* renamed from: b */
    public boolean m13883b(C48772sf1 c48772sf1) {
        return m13879f(c48772sf1);
    }

    /* renamed from: c */
    public C48772sf1 m13882c() {
        return new C48772sf1(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        C48772sf1 c48772sf1 = (C48772sf1) obj;
        if (m13886L()) {
            if (c48772sf1.m13886L()) {
                return 0;
            }
            return -1;
        } else if (c48772sf1.m13886L()) {
            return 1;
        } else {
            double d = this.f109076b;
            double d2 = c48772sf1.f109076b;
            if (d < d2) {
                return -1;
            }
            if (d > d2) {
                return 1;
            }
            double d3 = this.f109078d;
            double d4 = c48772sf1.f109078d;
            if (d3 < d4) {
                return -1;
            }
            if (d3 > d4) {
                return 1;
            }
            double d5 = this.f109077c;
            double d6 = c48772sf1.f109077c;
            if (d5 < d6) {
                return -1;
            }
            if (d5 > d6) {
                return 1;
            }
            double d7 = this.f109079e;
            double d8 = c48772sf1.f109079e;
            if (d7 < d8) {
                return -1;
            }
            if (d7 <= d8) {
                return 0;
            }
            return 1;
        }
    }

    /* renamed from: d */
    public boolean m13881d(double d, double d2) {
        if (m13886L() || d < this.f109076b || d > this.f109077c || d2 < this.f109078d || d2 > this.f109079e) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean m13880e(C52053yB0 c52053yB0) {
        return m13881d(c52053yB0.f118922b, c52053yB0.f118923c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C48772sf1)) {
            return false;
        }
        C48772sf1 c48772sf1 = (C48772sf1) obj;
        if (m13886L()) {
            return c48772sf1.m13886L();
        }
        if (this.f109077c != c48772sf1.m13871n() || this.f109079e != c48772sf1.m13870o() || this.f109076b != c48772sf1.m13869p() || this.f109078d != c48772sf1.m13868q()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m13879f(C48772sf1 c48772sf1) {
        if (m13886L() || c48772sf1.m13886L() || c48772sf1.m13869p() < this.f109076b || c48772sf1.m13871n() > this.f109077c || c48772sf1.m13868q() < this.f109078d || c48772sf1.m13870o() > this.f109079e) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean m13878g(C48772sf1 c48772sf1) {
        if (m13886L() || c48772sf1.m13886L() || c48772sf1.f109076b > this.f109077c || c48772sf1.f109077c < this.f109076b || c48772sf1.f109078d > this.f109079e || c48772sf1.f109079e < this.f109078d) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public void m13877h(double d) {
        m13876i(d, d);
    }

    public int hashCode() {
        return ((((((629 + C52053yB0.m3880n(this.f109076b)) * 37) + C52053yB0.m3880n(this.f109077c)) * 37) + C52053yB0.m3880n(this.f109078d)) * 37) + C52053yB0.m3880n(this.f109079e);
    }

    /* renamed from: i */
    public void m13876i(double d, double d2) {
        if (m13886L()) {
            return;
        }
        double d3 = this.f109076b - d;
        this.f109076b = d3;
        double d4 = this.f109077c + d;
        this.f109077c = d4;
        double d5 = this.f109078d - d2;
        this.f109078d = d5;
        double d6 = this.f109079e + d2;
        this.f109079e = d6;
        if (d3 > d4 || d5 > d6) {
            m13885M();
        }
    }

    /* renamed from: j */
    public void m13875j(double d, double d2) {
        if (m13886L()) {
            this.f109076b = d;
            this.f109077c = d;
            this.f109078d = d2;
            this.f109079e = d2;
            return;
        }
        if (d < this.f109076b) {
            this.f109076b = d;
        }
        if (d > this.f109077c) {
            this.f109077c = d;
        }
        if (d2 < this.f109078d) {
            this.f109078d = d2;
        }
        if (d2 > this.f109079e) {
            this.f109079e = d2;
        }
    }

    /* renamed from: k */
    public void m13874k(C52053yB0 c52053yB0) {
        m13875j(c52053yB0.f118922b, c52053yB0.f118923c);
    }

    /* renamed from: l */
    public void m13873l(C48772sf1 c48772sf1) {
        if (c48772sf1.m13886L()) {
            return;
        }
        if (m13886L()) {
            this.f109076b = c48772sf1.m13869p();
            this.f109077c = c48772sf1.m13871n();
            this.f109078d = c48772sf1.m13868q();
            this.f109079e = c48772sf1.m13870o();
            return;
        }
        double d = c48772sf1.f109076b;
        if (d < this.f109076b) {
            this.f109076b = d;
        }
        double d2 = c48772sf1.f109077c;
        if (d2 > this.f109077c) {
            this.f109077c = d2;
        }
        double d3 = c48772sf1.f109078d;
        if (d3 < this.f109078d) {
            this.f109078d = d3;
        }
        double d4 = c48772sf1.f109079e;
        if (d4 > this.f109079e) {
            this.f109079e = d4;
        }
    }

    /* renamed from: m */
    public double m13872m() {
        if (m13886L()) {
            return 0.0d;
        }
        return this.f109079e - this.f109078d;
    }

    /* renamed from: n */
    public double m13871n() {
        return this.f109077c;
    }

    /* renamed from: o */
    public double m13870o() {
        return this.f109079e;
    }

    /* renamed from: p */
    public double m13869p() {
        return this.f109076b;
    }

    /* renamed from: q */
    public double m13868q() {
        return this.f109078d;
    }

    /* renamed from: r */
    public double m13867r() {
        if (m13886L()) {
            return 0.0d;
        }
        return this.f109077c - this.f109076b;
    }

    /* renamed from: s */
    public void m13866s() {
        m13885M();
    }

    /* renamed from: t */
    public void m13865t(double d, double d2, double d3, double d4) {
        if (d < d2) {
            this.f109076b = d;
            this.f109077c = d2;
        } else {
            this.f109076b = d2;
            this.f109077c = d;
        }
        if (d3 < d4) {
            this.f109078d = d3;
            this.f109079e = d4;
            return;
        }
        this.f109078d = d4;
        this.f109079e = d3;
    }

    public String toString() {
        return "Env[" + this.f109076b + " : " + this.f109077c + ", " + this.f109078d + " : " + this.f109079e + "]";
    }

    /* renamed from: u */
    public void m13864u(C48772sf1 c48772sf1) {
        this.f109076b = c48772sf1.f109076b;
        this.f109077c = c48772sf1.f109077c;
        this.f109078d = c48772sf1.f109078d;
        this.f109079e = c48772sf1.f109079e;
    }

    /* renamed from: v */
    public C48772sf1 m13863v(C48772sf1 c48772sf1) {
        double d;
        double d2;
        double d3;
        double d4;
        if (!m13886L() && !c48772sf1.m13886L() && m13887K(c48772sf1)) {
            double d5 = this.f109076b;
            double d6 = c48772sf1.f109076b;
            if (d5 > d6) {
                d = d5;
            } else {
                d = d6;
            }
            double d7 = this.f109078d;
            double d8 = c48772sf1.f109078d;
            if (d7 > d8) {
                d2 = d7;
            } else {
                d2 = d8;
            }
            double d9 = this.f109077c;
            double d10 = c48772sf1.f109077c;
            if (d9 < d10) {
                d3 = d9;
            } else {
                d3 = d10;
            }
            double d11 = this.f109079e;
            double d12 = c48772sf1.f109079e;
            if (d11 < d12) {
                d4 = d11;
            } else {
                d4 = d12;
            }
            return new C48772sf1(d, d3, d2, d4);
        }
        return new C48772sf1();
    }

    /* renamed from: w */
    public boolean m13862w(double d, double d2) {
        if (m13886L() || d > this.f109077c || d < this.f109076b || d2 > this.f109079e || d2 < this.f109078d) {
            return false;
        }
        return true;
    }

    public C48772sf1(double d, double d2, double d3, double d4) {
        m13865t(d, d2, d3, d4);
    }

    public C48772sf1(C52053yB0 c52053yB0, C52053yB0 c52053yB02) {
        m13865t(c52053yB0.f118922b, c52053yB02.f118922b, c52053yB0.f118923c, c52053yB02.f118923c);
    }

    public C48772sf1(C52053yB0 c52053yB0) {
        double d = c52053yB0.f118922b;
        double d2 = c52053yB0.f118923c;
        m13865t(d, d, d2, d2);
    }

    public C48772sf1(C48772sf1 c48772sf1) {
        m13864u(c48772sf1);
    }
}
