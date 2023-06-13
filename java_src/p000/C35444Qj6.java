package p000;
/* renamed from: Qj6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35444Qj6 {

    /* renamed from: a */
    public float f30802a;

    /* renamed from: b */
    public float f30803b;

    /* renamed from: c */
    public float f30804c;

    public C35444Qj6() {
        this.f30802a = 0.0f;
        this.f30803b = 0.0f;
        this.f30804c = 0.0f;
    }

    /* renamed from: a */
    public static C35444Qj6 m88141a(C35444Qj6 c35444Qj6, C35444Qj6 c35444Qj62) {
        DZ3.m110173d(c35444Qj6, "Parameter \"lhs\" was null.");
        DZ3.m110173d(c35444Qj62, "Parameter \"rhs\" was null.");
        return new C35444Qj6(c35444Qj6.f30802a + c35444Qj62.f30802a, c35444Qj6.f30803b + c35444Qj62.f30803b, c35444Qj6.f30804c + c35444Qj62.f30804c);
    }

    /* renamed from: b */
    public static C35444Qj6 m88140b() {
        C35444Qj6 c35444Qj6 = new C35444Qj6();
        c35444Qj6.m88126p();
        return c35444Qj6;
    }

    /* renamed from: c */
    public static C35444Qj6 m88139c(C35444Qj6 c35444Qj6, C35444Qj6 c35444Qj62) {
        DZ3.m110173d(c35444Qj6, "Parameter \"lhs\" was null.");
        DZ3.m110173d(c35444Qj62, "Parameter \"rhs\" was null.");
        float f = c35444Qj6.f30802a;
        float f2 = c35444Qj6.f30803b;
        float f3 = c35444Qj6.f30804c;
        float f4 = c35444Qj62.f30802a;
        float f5 = c35444Qj62.f30803b;
        float f6 = c35444Qj62.f30804c;
        return new C35444Qj6((f2 * f6) - (f3 * f5), (f3 * f4) - (f6 * f), (f * f5) - (f2 * f4));
    }

    /* renamed from: d */
    public static float m88138d(C35444Qj6 c35444Qj6, C35444Qj6 c35444Qj62) {
        DZ3.m110173d(c35444Qj6, "Parameter \"lhs\" was null.");
        DZ3.m110173d(c35444Qj62, "Parameter \"rhs\" was null.");
        return (c35444Qj6.f30802a * c35444Qj62.f30802a) + (c35444Qj6.f30803b * c35444Qj62.f30803b) + (c35444Qj6.f30804c * c35444Qj62.f30804c);
    }

    /* renamed from: e */
    public static boolean m88137e(C35444Qj6 c35444Qj6, C35444Qj6 c35444Qj62) {
        DZ3.m110173d(c35444Qj6, "Parameter \"lhs\" was null.");
        DZ3.m110173d(c35444Qj62, "Parameter \"rhs\" was null.");
        return XM2.m77083a(c35444Qj6.f30804c, c35444Qj62.f30804c) & XM2.m77083a(c35444Qj6.f30802a, c35444Qj62.f30802a) & true & XM2.m77083a(c35444Qj6.f30803b, c35444Qj62.f30803b);
    }

    /* renamed from: f */
    public static C35444Qj6 m88136f() {
        C35444Qj6 c35444Qj6 = new C35444Qj6();
        c35444Qj6.m88125q();
        return c35444Qj6;
    }

    /* renamed from: h */
    public static C35444Qj6 m88134h(C35444Qj6 c35444Qj6, C35444Qj6 c35444Qj62) {
        DZ3.m110173d(c35444Qj6, "Parameter \"lhs\" was null.");
        DZ3.m110173d(c35444Qj62, "Parameter \"rhs\" was null.");
        return new C35444Qj6(Math.max(c35444Qj6.f30802a, c35444Qj62.f30802a), Math.max(c35444Qj6.f30803b, c35444Qj62.f30803b), Math.max(c35444Qj6.f30804c, c35444Qj62.f30804c));
    }

    /* renamed from: i */
    public static C35444Qj6 m88133i(C35444Qj6 c35444Qj6, C35444Qj6 c35444Qj62) {
        DZ3.m110173d(c35444Qj6, "Parameter \"lhs\" was null.");
        DZ3.m110173d(c35444Qj62, "Parameter \"rhs\" was null.");
        return new C35444Qj6(Math.min(c35444Qj6.f30802a, c35444Qj62.f30802a), Math.min(c35444Qj6.f30803b, c35444Qj62.f30803b), Math.min(c35444Qj6.f30804c, c35444Qj62.f30804c));
    }

    /* renamed from: k */
    public static C35444Qj6 m88131k() {
        C35444Qj6 c35444Qj6 = new C35444Qj6();
        c35444Qj6.m88124r();
        return c35444Qj6;
    }

    /* renamed from: l */
    public static C35444Qj6 m88130l() {
        C35444Qj6 c35444Qj6 = new C35444Qj6();
        c35444Qj6.m88123s();
        return c35444Qj6;
    }

    /* renamed from: v */
    public static C35444Qj6 m88120v(C35444Qj6 c35444Qj6, C35444Qj6 c35444Qj62) {
        DZ3.m110173d(c35444Qj6, "Parameter \"lhs\" was null.");
        DZ3.m110173d(c35444Qj62, "Parameter \"rhs\" was null.");
        return new C35444Qj6(c35444Qj6.f30802a - c35444Qj62.f30802a, c35444Qj6.f30803b - c35444Qj62.f30803b, c35444Qj6.f30804c - c35444Qj62.f30804c);
    }

    /* renamed from: w */
    public static C35444Qj6 m88119w() {
        C35444Qj6 c35444Qj6 = new C35444Qj6();
        c35444Qj6.m88122t();
        return c35444Qj6;
    }

    /* renamed from: x */
    public static C35444Qj6 m88118x() {
        return new C35444Qj6();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C35444Qj6)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m88137e(this, (C35444Qj6) obj);
    }

    /* renamed from: g */
    public float m88135g() {
        float f = this.f30802a;
        float f2 = this.f30803b;
        float f3 = (f * f) + (f2 * f2);
        float f4 = this.f30804c;
        return f3 + (f4 * f4);
    }

    public int hashCode() {
        return ((((Float.floatToIntBits(this.f30802a) + 31) * 31) + Float.floatToIntBits(this.f30803b)) * 31) + Float.floatToIntBits(this.f30804c);
    }

    /* renamed from: j */
    public C35444Qj6 m88132j() {
        C35444Qj6 c35444Qj6 = new C35444Qj6(this);
        float m88138d = m88138d(this, this);
        if (XM2.m77083a(m88138d, 0.0f)) {
            c35444Qj6.m88121u();
        } else if (m88138d != 1.0f) {
            c35444Qj6.m88127o(m88129m((float) (1.0d / Math.sqrt(m88138d))));
        }
        return c35444Qj6;
    }

    /* renamed from: m */
    public C35444Qj6 m88129m(float f) {
        return new C35444Qj6(this.f30802a * f, this.f30803b * f, this.f30804c * f);
    }

    /* renamed from: n */
    public void m88128n(float f, float f2, float f3) {
        this.f30802a = f;
        this.f30803b = f2;
        this.f30804c = f3;
    }

    /* renamed from: o */
    public void m88127o(C35444Qj6 c35444Qj6) {
        DZ3.m110173d(c35444Qj6, "Parameter \"v\" was null.");
        this.f30802a = c35444Qj6.f30802a;
        this.f30803b = c35444Qj6.f30803b;
        this.f30804c = c35444Qj6.f30804c;
    }

    /* renamed from: p */
    public void m88126p() {
        m88128n(0.0f, 0.0f, 1.0f);
    }

    /* renamed from: q */
    public void m88125q() {
        m88128n(0.0f, 0.0f, -1.0f);
    }

    /* renamed from: r */
    public void m88124r() {
        m88128n(1.0f, 1.0f, 1.0f);
    }

    /* renamed from: s */
    public void m88123s() {
        m88128n(1.0f, 0.0f, 0.0f);
    }

    /* renamed from: t */
    public void m88122t() {
        m88128n(0.0f, 1.0f, 0.0f);
    }

    public String toString() {
        return "[x=" + this.f30802a + ", y=" + this.f30803b + ", z=" + this.f30804c + "]";
    }

    /* renamed from: u */
    public void m88121u() {
        m88128n(0.0f, 0.0f, 0.0f);
    }

    public C35444Qj6(float f, float f2, float f3) {
        this.f30802a = f;
        this.f30803b = f2;
        this.f30804c = f3;
    }

    public C35444Qj6(C35444Qj6 c35444Qj6) {
        DZ3.m110173d(c35444Qj6, "Parameter \"v\" was null.");
        m88127o(c35444Qj6);
    }
}
