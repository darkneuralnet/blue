package p000;

import java.io.Serializable;
/* renamed from: yB0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C52053yB0 implements Comparable<C52053yB0>, Cloneable, Serializable {
    private static final long serialVersionUID = 6683108902428366910L;

    /* renamed from: b */
    public double f118922b;

    /* renamed from: c */
    public double f118923c;

    /* renamed from: d */
    public double f118924d;

    public C52053yB0(double d, double d2, double d3) {
        this.f118922b = d;
        this.f118923c = d2;
        this.f118924d = d3;
    }

    /* renamed from: n */
    public static int m3880n(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public Object clone() {
        try {
            return (C52053yB0) super.clone();
        } catch (CloneNotSupportedException unused) {
            C4596Ko.m98279f("this shouldn't happen because this class is Cloneable");
            return null;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(C52053yB0 c52053yB0) {
        double d = this.f118922b;
        double d2 = c52053yB0.f118922b;
        if (d < d2) {
            return -1;
        }
        if (d > d2) {
            return 1;
        }
        double d3 = this.f118923c;
        double d4 = c52053yB0.f118923c;
        if (d3 < d4) {
            return -1;
        }
        if (d3 > d4) {
            return 1;
        }
        return 0;
    }

    /* renamed from: e */
    public C52053yB0 mo3888e() {
        return new C52053yB0(this);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C52053yB0)) {
            return false;
        }
        return m3886g((C52053yB0) obj);
    }

    /* renamed from: f */
    public double m3887f(C52053yB0 c52053yB0) {
        double d = this.f118922b - c52053yB0.f118922b;
        double d2 = this.f118923c - c52053yB0.f118923c;
        return Math.sqrt((d * d) + (d2 * d2));
    }

    /* renamed from: g */
    public boolean m3886g(C52053yB0 c52053yB0) {
        if (this.f118922b != c52053yB0.f118922b || this.f118923c != c52053yB0.f118923c) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public double mo3885h() {
        return Double.NaN;
    }

    public int hashCode() {
        return ((629 + m3880n(this.f118922b)) * 37) + m3880n(this.f118923c);
    }

    /* renamed from: j */
    public double mo3884j(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return mo3881m();
                }
                throw new IllegalArgumentException("Invalid ordinate index: " + i);
            }
            return this.f118923c;
        }
        return this.f118922b;
    }

    /* renamed from: k */
    public double m3883k() {
        return this.f118922b;
    }

    /* renamed from: l */
    public double m3882l() {
        return this.f118923c;
    }

    /* renamed from: m */
    public double mo3881m() {
        return this.f118924d;
    }

    /* renamed from: o */
    public void mo3879o(C52053yB0 c52053yB0) {
        this.f118922b = c52053yB0.f118922b;
        this.f118923c = c52053yB0.f118923c;
        this.f118924d = c52053yB0.mo3881m();
    }

    /* renamed from: p */
    public void mo3878p(int i, double d) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    mo3877q(d);
                    return;
                }
                throw new IllegalArgumentException("Invalid ordinate index: " + i);
            }
            this.f118923c = d;
            return;
        }
        this.f118922b = d;
    }

    /* renamed from: q */
    public void mo3877q(double d) {
        this.f118924d = d;
    }

    public String toString() {
        return "(" + this.f118922b + ", " + this.f118923c + ", " + mo3881m() + ")";
    }

    public C52053yB0() {
        this(0.0d, 0.0d);
    }

    public C52053yB0(C52053yB0 c52053yB0) {
        this(c52053yB0.f118922b, c52053yB0.f118923c, c52053yB0.mo3881m());
    }

    public C52053yB0(double d, double d2) {
        this(d, d2, Double.NaN);
    }
}
