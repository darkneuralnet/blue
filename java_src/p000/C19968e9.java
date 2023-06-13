package p000;
/* renamed from: e9 */
/* loaded from: classes8.dex */
public class C19968e9 implements Cloneable, GB0 {

    /* renamed from: b */
    public double f78013b;

    /* renamed from: c */
    public double f78014c;

    /* renamed from: d */
    public double f78015d;

    /* renamed from: e */
    public double f78016e;

    /* renamed from: f */
    public double f78017f;

    /* renamed from: g */
    public double f78018g;

    public C19968e9() {
        m43177h();
    }

    /* renamed from: f */
    public static C19968e9 m43179f(double d, double d2, double d3) {
        return m43178g(Math.sin(d), Math.cos(d), d2, d3);
    }

    /* renamed from: g */
    public static C19968e9 m43178g(double d, double d2, double d3, double d4) {
        C19968e9 c19968e9 = new C19968e9();
        c19968e9.m43176j(d, d2, d3, d4);
        return c19968e9;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Exception unused) {
            C4596Ko.m98280e();
            return null;
        }
    }

    @Override // p000.GB0
    /* renamed from: d */
    public void mo16954d(EB0 eb0, int i) {
        m43175k(eb0, i);
    }

    @Override // p000.GB0
    /* renamed from: e */
    public boolean mo16953e() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C19968e9)) {
            return false;
        }
        C19968e9 c19968e9 = (C19968e9) obj;
        if (this.f78013b != c19968e9.f78013b || this.f78014c != c19968e9.f78014c || this.f78015d != c19968e9.f78015d || this.f78016e != c19968e9.f78016e || this.f78017f != c19968e9.f78017f || this.f78018g != c19968e9.f78018g) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public C19968e9 m43177h() {
        this.f78013b = 1.0d;
        this.f78014c = 0.0d;
        this.f78015d = 0.0d;
        this.f78016e = 0.0d;
        this.f78017f = 1.0d;
        this.f78018g = 0.0d;
        return this;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f78013b);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f78014c);
        int i = ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.f78015d);
        int i2 = (i * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.f78016e);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
        long doubleToLongBits5 = Double.doubleToLongBits(this.f78017f);
        int i4 = (i3 * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)));
        long doubleToLongBits6 = Double.doubleToLongBits(this.f78018g);
        return (i4 * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6));
    }

    @Override // p000.GB0
    public boolean isDone() {
        return false;
    }

    /* renamed from: j */
    public C19968e9 m43176j(double d, double d2, double d3, double d4) {
        this.f78013b = d2;
        this.f78014c = -d;
        this.f78015d = (d3 - (d3 * d2)) + (d4 * d);
        this.f78016e = d;
        this.f78017f = d2;
        this.f78018g = (d4 - (d3 * d)) - (d4 * d2);
        return this;
    }

    /* renamed from: k */
    public void m43175k(EB0 eb0, int i) {
        eb0.mo1705y1(i, 0, (this.f78013b * eb0.mo1713a3(i, 0)) + (this.f78014c * eb0.mo1713a3(i, 1)) + this.f78015d);
        eb0.mo1705y1(i, 1, (this.f78016e * eb0.mo1713a3(i, 0)) + (this.f78017f * eb0.mo1713a3(i, 1)) + this.f78018g);
    }

    public String toString() {
        return "AffineTransformation[[" + this.f78013b + ", " + this.f78014c + ", " + this.f78015d + "], [" + this.f78016e + ", " + this.f78017f + ", " + this.f78018g + "]]";
    }
}
