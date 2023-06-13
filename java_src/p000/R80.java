package p000;
/* renamed from: R80 */
/* loaded from: classes.dex */
public class R80 {

    /* renamed from: a */
    public final float f31585a;

    /* renamed from: b */
    public final float f31586b;

    /* renamed from: c */
    public final float f31587c;

    /* renamed from: d */
    public final float f31588d;

    /* renamed from: e */
    public final float f31589e;

    /* renamed from: f */
    public final float f31590f;

    /* renamed from: g */
    public final float f31591g;

    /* renamed from: h */
    public final float f31592h;

    /* renamed from: i */
    public final float f31593i;

    public R80(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f31585a = f;
        this.f31586b = f2;
        this.f31587c = f3;
        this.f31588d = f4;
        this.f31589e = f5;
        this.f31590f = f6;
        this.f31591g = f7;
        this.f31592h = f8;
        this.f31593i = f9;
    }

    /* renamed from: b */
    public static R80 m87265b(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        R80 r80 = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int m87251p = m87262e(f8, f2, f).m87251p();
            float m85924b = S80.m85924b(m87251p);
            float abs = Math.abs(f3 - m85924b);
            if (abs < 0.2f) {
                R80 m87264c = m87264c(m87251p);
                float m87266a = m87264c.m87266a(m87262e(m87264c.m87256k(), m87264c.m87258i(), f));
                if (m87266a <= 1.0f) {
                    r80 = m87264c;
                    f5 = abs;
                    f7 = m87266a;
                }
            }
            if (f5 == 0.0f && f7 == 0.0f) {
                break;
            } else if (m85924b < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return r80;
    }

    /* renamed from: c */
    public static R80 m87264c(int i) {
        return m87263d(i, C50705vu6.f114884k);
    }

    /* renamed from: d */
    public static R80 m87263d(int i, C50705vu6 c50705vu6) {
        float f;
        float pow;
        float[] m85920f = S80.m85920f(i);
        float[][] fArr = S80.f33231a;
        float f2 = m85920f[0];
        float[] fArr2 = fArr[0];
        float f3 = m85920f[1];
        float f4 = m85920f[2];
        float f5 = (fArr2[0] * f2) + (fArr2[1] * f3) + (fArr2[2] * f4);
        float[] fArr3 = fArr[1];
        float f6 = (fArr3[0] * f2) + (fArr3[1] * f3) + (fArr3[2] * f4);
        float[] fArr4 = fArr[2];
        float f7 = (f2 * fArr4[0]) + (f3 * fArr4[1]) + (f4 * fArr4[2]);
        float f8 = c50705vu6.m7779i()[0] * f5;
        float f9 = c50705vu6.m7779i()[1] * f6;
        float f10 = c50705vu6.m7779i()[2] * f7;
        float pow2 = (float) Math.pow((c50705vu6.m7785c() * Math.abs(f8)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((c50705vu6.m7785c() * Math.abs(f9)) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((c50705vu6.m7785c() * Math.abs(f10)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f8) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f9) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f10) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f11 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d)) / 11.0f;
        float f12 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f13 = signum2 * 20.0f;
        float f14 = (((signum * 20.0f) + f13) + (21.0f * signum3)) / 20.0f;
        float f15 = (((signum * 40.0f) + f13) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f12, f11)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f16 = atan2;
        float f17 = (3.1415927f * f16) / 180.0f;
        float pow5 = ((float) Math.pow((f15 * c50705vu6.m7782f()) / c50705vu6.m7787a(), c50705vu6.m7786b() * c50705vu6.m7778j())) * 100.0f;
        float m7784d = c50705vu6.m7784d() * (4.0f / c50705vu6.m7786b()) * ((float) Math.sqrt(pow5 / 100.0f)) * (c50705vu6.m7787a() + 4.0f);
        if (f16 < 20.14d) {
            f = 360.0f + f16;
        } else {
            f = f16;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, c50705vu6.m7783e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c50705vu6.m7781g()) * c50705vu6.m7780h()) * ((float) Math.sqrt((f11 * f11) + (f12 * f12)))) / (f14 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float m7784d2 = pow6 * c50705vu6.m7784d();
        float sqrt = ((float) Math.sqrt((pow * c50705vu6.m7786b()) / (c50705vu6.m7787a() + 4.0f))) * 50.0f;
        float f18 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * m7784d2) + 1.0f)) * 43.85965f;
        double d2 = f17;
        return new R80(f16, pow6, pow5, m7784d, m7784d2, sqrt, f18, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    /* renamed from: e */
    public static R80 m87262e(float f, float f2, float f3) {
        return m87261f(f, f2, f3, C50705vu6.f114884k);
    }

    /* renamed from: f */
    public static R80 m87261f(float f, float f2, float f3, C50705vu6 c50705vu6) {
        double d;
        float m7786b = (4.0f / c50705vu6.m7786b()) * ((float) Math.sqrt(f / 100.0d)) * (c50705vu6.m7787a() + 4.0f) * c50705vu6.m7784d();
        float m7784d = f2 * c50705vu6.m7784d();
        float sqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * c50705vu6.m7786b()) / (c50705vu6.m7787a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((m7784d * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new R80(f3, f2, f, m7786b, m7784d, sqrt, f4, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    /* renamed from: m */
    public static int m87254m(float f, float f2, float f3) {
        return m87253n(f, f2, f3, C50705vu6.f114884k);
    }

    /* renamed from: n */
    public static int m87253n(float f, float f2, float f3, C50705vu6 c50705vu6) {
        float min;
        if (f2 >= 1.0d && Math.round(f3) > 0.0d && Math.round(f3) < 100.0d) {
            if (f < 0.0f) {
                min = 0.0f;
            } else {
                min = Math.min(360.0f, f);
            }
            R80 r80 = null;
            boolean z = true;
            float f4 = 0.0f;
            float f5 = f2;
            while (Math.abs(f4 - f2) >= 0.4f) {
                R80 m87265b = m87265b(min, f5, f3);
                if (z) {
                    if (m87265b != null) {
                        return m87265b.m87252o(c50705vu6);
                    }
                    f5 = ((f2 - f4) / 2.0f) + f4;
                    z = false;
                } else {
                    if (m87265b == null) {
                        f2 = f5;
                    } else {
                        f4 = f5;
                        r80 = m87265b;
                    }
                    f5 = ((f2 - f4) / 2.0f) + f4;
                }
            }
            if (r80 == null) {
                return S80.m85925a(f3);
            }
            return r80.m87252o(c50705vu6);
        }
        return S80.m85925a(f3);
    }

    /* renamed from: a */
    public float m87266a(R80 r80) {
        float m87255l = m87255l() - r80.m87255l();
        float m87260g = m87260g() - r80.m87260g();
        float m87259h = m87259h() - r80.m87259h();
        return (float) (Math.pow(Math.sqrt((m87255l * m87255l) + (m87260g * m87260g) + (m87259h * m87259h)), 0.63d) * 1.41d);
    }

    /* renamed from: g */
    public float m87260g() {
        return this.f31592h;
    }

    /* renamed from: h */
    public float m87259h() {
        return this.f31593i;
    }

    /* renamed from: i */
    public float m87258i() {
        return this.f31586b;
    }

    /* renamed from: j */
    public float m87257j() {
        return this.f31585a;
    }

    /* renamed from: k */
    public float m87256k() {
        return this.f31587c;
    }

    /* renamed from: l */
    public float m87255l() {
        return this.f31591g;
    }

    /* renamed from: o */
    public int m87252o(C50705vu6 c50705vu6) {
        float f;
        float f2;
        if (m87258i() != 0.0d && m87256k() != 0.0d) {
            f = m87258i() / ((float) Math.sqrt(m87256k() / 100.0d));
        } else {
            f = 0.0f;
        }
        float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, c50705vu6.m7783e()), 0.73d), 1.1111111111111112d);
        double m87257j = (m87257j() * 3.1415927f) / 180.0f;
        float m7787a = c50705vu6.m7787a() * ((float) Math.pow(m87256k() / 100.0d, (1.0d / c50705vu6.m7786b()) / c50705vu6.m7778j()));
        float cos = ((float) (Math.cos(2.0d + m87257j) + 3.8d)) * 0.25f * 3846.1538f * c50705vu6.m7781g() * c50705vu6.m7780h();
        float m7782f = m7787a / c50705vu6.m7782f();
        float sin = (float) Math.sin(m87257j);
        float cos2 = (float) Math.cos(m87257j);
        float f3 = (((0.305f + m7782f) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f4 = cos2 * f3;
        float f5 = f3 * sin;
        float f6 = m7782f * 460.0f;
        float f7 = (((451.0f * f4) + f6) + (288.0f * f5)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float signum = Math.signum(f7) * (100.0f / c50705vu6.m7785c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f7) * 27.13d) / (400.0d - Math.abs(f7))), 2.380952380952381d));
        float signum2 = Math.signum(f8) * (100.0f / c50705vu6.m7785c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
        float signum3 = Math.signum(((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f) * (100.0f / c50705vu6.m7785c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f2) * 27.13d) / (400.0d - Math.abs(f2))), 2.380952380952381d));
        float f9 = signum / c50705vu6.m7779i()[0];
        float f10 = signum2 / c50705vu6.m7779i()[1];
        float f11 = signum3 / c50705vu6.m7779i()[2];
        float[][] fArr = S80.f33232b;
        float[] fArr2 = fArr[0];
        float f12 = (fArr2[0] * f9) + (fArr2[1] * f10) + (fArr2[2] * f11);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return C33827Jm0.m99858c(f12, (fArr3[0] * f9) + (fArr3[1] * f10) + (fArr3[2] * f11), (f9 * fArr4[0]) + (f10 * fArr4[1]) + (f11 * fArr4[2]));
    }

    /* renamed from: p */
    public int m87251p() {
        return m87252o(C50705vu6.f114884k);
    }
}
