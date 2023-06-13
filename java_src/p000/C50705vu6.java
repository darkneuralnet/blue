package p000;
/* renamed from: vu6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50705vu6 {

    /* renamed from: k */
    public static final C50705vu6 f114884k = m7777k(S80.f33233c, (float) ((S80.m85918h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    public final float f114885a;

    /* renamed from: b */
    public final float f114886b;

    /* renamed from: c */
    public final float f114887c;

    /* renamed from: d */
    public final float f114888d;

    /* renamed from: e */
    public final float f114889e;

    /* renamed from: f */
    public final float f114890f;

    /* renamed from: g */
    public final float[] f114891g;

    /* renamed from: h */
    public final float f114892h;

    /* renamed from: i */
    public final float f114893i;

    /* renamed from: j */
    public final float f114894j;

    public C50705vu6(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f114890f = f;
        this.f114885a = f2;
        this.f114886b = f3;
        this.f114887c = f4;
        this.f114888d = f5;
        this.f114889e = f6;
        this.f114891g = fArr;
        this.f114892h = f7;
        this.f114893i = f8;
        this.f114894j = f9;
    }

    /* renamed from: k */
    public static C50705vu6 m7777k(float[] fArr, float f, float f2, float f3, boolean z) {
        float m85922d;
        float exp;
        float[][] fArr2 = S80.f33231a;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = (fArr3[0] * f4) + (fArr3[1] * f5) + (fArr3[2] * f6);
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[0] * f4) + (fArr4[1] * f5) + (fArr4[2] * f6);
        float[] fArr5 = fArr2[2];
        float f9 = (f4 * fArr5[0]) + (f5 * fArr5[1]) + (f6 * fArr5[2]);
        float f10 = (f3 / 10.0f) + 0.8f;
        if (f10 >= 0.9d) {
            m85922d = S80.m85922d(0.59f, 0.69f, (f10 - 0.9f) * 10.0f);
        } else {
            m85922d = S80.m85922d(0.525f, 0.59f, (f10 - 0.8f) * 10.0f);
        }
        float f11 = m85922d;
        if (z) {
            exp = 1.0f;
        } else {
            exp = (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f10;
        }
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp};
        float f12 = 1.0f / ((5.0f * f) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float cbrt = (f13 * f) + (0.1f * f14 * f14 * ((float) Math.cbrt(f * 5.0d)));
        float m85918h = S80.m85918h(f2) / fArr[1];
        double d2 = m85918h;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f9) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f8) / 100.0d, 0.42d), pow2};
        float f15 = fArr7[0];
        float f16 = fArr7[1];
        return new C50705vu6(m85918h, ((((f15 * 400.0f) / (f15 + 27.13f)) * 2.0f) + ((f16 * 400.0f) / (f16 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, f11, f10, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* renamed from: a */
    public float m7787a() {
        return this.f114885a;
    }

    /* renamed from: b */
    public float m7786b() {
        return this.f114888d;
    }

    /* renamed from: c */
    public float m7785c() {
        return this.f114892h;
    }

    /* renamed from: d */
    public float m7784d() {
        return this.f114893i;
    }

    /* renamed from: e */
    public float m7783e() {
        return this.f114890f;
    }

    /* renamed from: f */
    public float m7782f() {
        return this.f114886b;
    }

    /* renamed from: g */
    public float m7781g() {
        return this.f114889e;
    }

    /* renamed from: h */
    public float m7780h() {
        return this.f114887c;
    }

    /* renamed from: i */
    public float[] m7779i() {
        return this.f114891g;
    }

    /* renamed from: j */
    public float m7778j() {
        return this.f114894j;
    }
}
