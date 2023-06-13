package p000;
/* renamed from: Vc4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36549Vc4 {

    /* renamed from: a */
    public float f39340a;

    /* renamed from: b */
    public float f39341b;

    /* renamed from: c */
    public float f39342c;

    /* renamed from: d */
    public float f39343d;

    public C36549Vc4() {
        this.f39340a = 0.0f;
        this.f39341b = 0.0f;
        this.f39342c = 0.0f;
        this.f39343d = 1.0f;
    }

    /* renamed from: a */
    public static C36549Vc4 m79660a(C35444Qj6 c35444Qj6, float f) {
        DZ3.m110173d(c35444Qj6, "Parameter \"axis\" was null.");
        C36549Vc4 c36549Vc4 = new C36549Vc4();
        double radians = Math.toRadians(f) / 2.0d;
        double sin = Math.sin(radians);
        c36549Vc4.f39340a = (float) (c35444Qj6.f30802a * sin);
        c36549Vc4.f39341b = (float) (c35444Qj6.f30803b * sin);
        c36549Vc4.f39342c = (float) (c35444Qj6.f30804c * sin);
        c36549Vc4.f39343d = (float) Math.cos(radians);
        c36549Vc4.m79655f();
        return c36549Vc4;
    }

    /* renamed from: b */
    public static float m79659b(C36549Vc4 c36549Vc4, C36549Vc4 c36549Vc42) {
        DZ3.m110173d(c36549Vc4, "Parameter \"lhs\" was null.");
        DZ3.m110173d(c36549Vc42, "Parameter \"rhs\" was null.");
        return (c36549Vc4.f39340a * c36549Vc42.f39340a) + (c36549Vc4.f39341b * c36549Vc42.f39341b) + (c36549Vc4.f39342c * c36549Vc42.f39342c) + (c36549Vc4.f39343d * c36549Vc42.f39343d);
    }

    /* renamed from: c */
    public static boolean m79658c(C36549Vc4 c36549Vc4, C36549Vc4 c36549Vc42) {
        DZ3.m110173d(c36549Vc4, "Parameter \"lhs\" was null.");
        DZ3.m110173d(c36549Vc42, "Parameter \"rhs\" was null.");
        return XM2.m77083a(m79659b(c36549Vc4, c36549Vc42), 1.0f);
    }

    /* renamed from: d */
    public static C36549Vc4 m79657d(C35444Qj6 c35444Qj6, C35444Qj6 c35444Qj62) {
        DZ3.m110173d(c35444Qj6, "Parameter \"forwardInWorld\" was null.");
        DZ3.m110173d(c35444Qj62, "Parameter \"desiredUpInWorld\" was null.");
        C36549Vc4 m79653h = m79653h(C35444Qj6.m88136f(), c35444Qj6);
        return m79656e(m79653h(m79654g(m79653h, C35444Qj6.m88119w()), C35444Qj6.m88139c(C35444Qj6.m88139c(c35444Qj6, c35444Qj62), c35444Qj6)), m79653h);
    }

    /* renamed from: e */
    public static C36549Vc4 m79656e(C36549Vc4 c36549Vc4, C36549Vc4 c36549Vc42) {
        DZ3.m110173d(c36549Vc4, "Parameter \"lhs\" was null.");
        DZ3.m110173d(c36549Vc42, "Parameter \"rhs\" was null.");
        float f = c36549Vc4.f39340a;
        float f2 = c36549Vc4.f39341b;
        float f3 = c36549Vc4.f39342c;
        float f4 = c36549Vc4.f39343d;
        float f5 = c36549Vc42.f39340a;
        float f6 = c36549Vc42.f39341b;
        float f7 = c36549Vc42.f39342c;
        float f8 = c36549Vc42.f39343d;
        return new C36549Vc4((((f4 * f5) + (f * f8)) + (f2 * f7)) - (f3 * f6), ((f4 * f6) - (f * f7)) + (f2 * f8) + (f3 * f5), (((f4 * f7) + (f * f6)) - (f2 * f5)) + (f3 * f8), (((f4 * f8) - (f * f5)) - (f2 * f6)) - (f3 * f7));
    }

    /* renamed from: g */
    public static C35444Qj6 m79654g(C36549Vc4 c36549Vc4, C35444Qj6 c35444Qj6) {
        DZ3.m110173d(c36549Vc4, "Parameter \"q\" was null.");
        DZ3.m110173d(c35444Qj6, "Parameter \"src\" was null.");
        C35444Qj6 c35444Qj62 = new C35444Qj6();
        float f = c36549Vc4.f39343d;
        float f2 = f * f;
        float f3 = c36549Vc4.f39340a;
        float f4 = f3 * f3;
        float f5 = c36549Vc4.f39341b;
        float f6 = f5 * f5;
        float f7 = c36549Vc4.f39342c;
        float f8 = f7 * f7;
        float f9 = f7 * f;
        float f10 = f3 * f5;
        float f11 = f3 * f7;
        float f12 = f5 * f;
        float f13 = f5 * f7;
        float f14 = f3 * f;
        float f15 = f10 + f9 + f9 + f10;
        float f16 = (((-f9) + f10) - f9) + f10;
        float f17 = f13 + f13;
        float f18 = f17 + f14 + f14;
        float f19 = (f17 - f14) - f14;
        float f20 = ((f8 - f6) - f4) + f2;
        float f21 = c35444Qj6.f30802a;
        float f22 = c35444Qj6.f30803b;
        float f23 = c35444Qj6.f30804c;
        c35444Qj62.f30802a = ((((f2 + f4) - f8) - f6) * f21) + (f16 * f22) + ((f12 + f11 + f11 + f12) * f23);
        c35444Qj62.f30803b = (f15 * f21) + ((((f6 - f8) + f2) - f4) * f22) + (f19 * f23);
        c35444Qj62.f30804c = ((((f11 - f12) + f11) - f12) * f21) + (f18 * f22) + (f20 * f23);
        return c35444Qj62;
    }

    /* renamed from: h */
    public static C36549Vc4 m79653h(C35444Qj6 c35444Qj6, C35444Qj6 c35444Qj62) {
        DZ3.m110173d(c35444Qj6, "Parameter \"start\" was null.");
        DZ3.m110173d(c35444Qj62, "Parameter \"end\" was null.");
        C35444Qj6 m88132j = c35444Qj6.m88132j();
        C35444Qj6 m88132j2 = c35444Qj62.m88132j();
        float m88138d = C35444Qj6.m88138d(m88132j, m88132j2);
        if (m88138d < -0.999f) {
            C35444Qj6 m88139c = C35444Qj6.m88139c(C35444Qj6.m88140b(), m88132j);
            if (m88139c.m88135g() < 0.01f) {
                m88139c = C35444Qj6.m88139c(C35444Qj6.m88130l(), m88132j);
            }
            return m79660a(m88139c.m88132j(), 180.0f);
        }
        C35444Qj6 m88139c2 = C35444Qj6.m88139c(m88132j, m88132j2);
        float sqrt = (float) Math.sqrt((m88138d + 1.0d) * 2.0d);
        float f = 1.0f / sqrt;
        return new C36549Vc4(m88139c2.f30802a * f, m88139c2.f30803b * f, m88139c2.f30804c * f, sqrt * 0.5f);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C36549Vc4)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m79658c(this, (C36549Vc4) obj);
    }

    /* renamed from: f */
    public boolean m79655f() {
        float m79659b = m79659b(this, this);
        if (XM2.m77083a(m79659b, 0.0f)) {
            m79651j();
            return false;
        } else if (m79659b != 1.0f) {
            float sqrt = (float) (1.0d / Math.sqrt(m79659b));
            this.f39340a *= sqrt;
            this.f39341b *= sqrt;
            this.f39342c *= sqrt;
            this.f39343d *= sqrt;
            return true;
        } else {
            return true;
        }
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f39343d) + 31) * 31) + Float.floatToIntBits(this.f39340a)) * 31) + Float.floatToIntBits(this.f39341b)) * 31) + Float.floatToIntBits(this.f39342c);
    }

    /* renamed from: i */
    public void m79652i(float f, float f2, float f3, float f4) {
        this.f39340a = f;
        this.f39341b = f2;
        this.f39342c = f3;
        this.f39343d = f4;
        m79655f();
    }

    /* renamed from: j */
    public void m79651j() {
        this.f39340a = 0.0f;
        this.f39341b = 0.0f;
        this.f39342c = 0.0f;
        this.f39343d = 1.0f;
    }

    public String toString() {
        return "[x=" + this.f39340a + ", y=" + this.f39341b + ", z=" + this.f39342c + ", w=" + this.f39343d + "]";
    }

    public C36549Vc4(float f, float f2, float f3, float f4) {
        m79652i(f, f2, f3, f4);
    }
}
