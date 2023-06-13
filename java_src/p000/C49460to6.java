package p000;
/* renamed from: to6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C49460to6 {

    /* renamed from: a */
    public float f111049a;

    /* renamed from: b */
    public float f111050b;

    /* renamed from: c */
    public float f111051c;

    /* renamed from: d */
    public float f111052d;

    /* renamed from: e */
    public float f111053e;

    /* renamed from: f */
    public float f111054f;

    /* renamed from: a */
    public void m11756a(float f, float f2, int i, int i2, float[] fArr) {
        float f3;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f4 + this.f111051c;
        float f8 = f5 + this.f111052d;
        float f9 = f7 + (this.f111049a * (f - 0.5f) * 2.0f);
        float f10 = f8 + (this.f111050b * f6);
        float radians = (float) Math.toRadians(this.f111053e);
        double radians2 = (float) Math.toRadians(this.f111054f);
        double d = i2 * f6;
        fArr[0] = f9 + (((float) ((((-i) * f3) * Math.sin(radians2)) - (Math.cos(radians2) * d))) * radians);
        fArr[1] = f10 + (radians * ((float) (((i * f3) * Math.cos(radians2)) - (d * Math.sin(radians2)))));
    }

    /* renamed from: b */
    public void m11755b() {
        this.f111053e = 0.0f;
        this.f111052d = 0.0f;
        this.f111051c = 0.0f;
        this.f111050b = 0.0f;
        this.f111049a = 0.0f;
    }

    /* renamed from: c */
    public void m11754c(AbstractC41708gk2 abstractC41708gk2, float f) {
        if (abstractC41708gk2 != null) {
            this.f111053e = abstractC41708gk2.m37770b(f);
        }
    }

    /* renamed from: d */
    public void m11753d(XN5 xn5, float f) {
        if (xn5 != null) {
            this.f111053e = xn5.m77077b(f);
            this.f111054f = xn5.m77078a(f);
        }
    }

    /* renamed from: e */
    public void m11752e(AbstractC41708gk2 abstractC41708gk2, AbstractC41708gk2 abstractC41708gk22, float f) {
        if (abstractC41708gk2 != null) {
            this.f111049a = abstractC41708gk2.m37770b(f);
        }
        if (abstractC41708gk22 != null) {
            this.f111050b = abstractC41708gk22.m37770b(f);
        }
    }

    /* renamed from: f */
    public void m11751f(XN5 xn5, XN5 xn52, float f) {
        if (xn5 != null) {
            this.f111049a = xn5.m77077b(f);
        }
        if (xn52 != null) {
            this.f111050b = xn52.m77077b(f);
        }
    }

    /* renamed from: g */
    public void m11750g(AbstractC41708gk2 abstractC41708gk2, AbstractC41708gk2 abstractC41708gk22, float f) {
        if (abstractC41708gk2 != null) {
            this.f111051c = abstractC41708gk2.m37770b(f);
        }
        if (abstractC41708gk22 != null) {
            this.f111052d = abstractC41708gk22.m37770b(f);
        }
    }

    /* renamed from: h */
    public void m11749h(XN5 xn5, XN5 xn52, float f) {
        if (xn5 != null) {
            this.f111051c = xn5.m77077b(f);
        }
        if (xn52 != null) {
            this.f111052d = xn52.m77077b(f);
        }
    }
}
