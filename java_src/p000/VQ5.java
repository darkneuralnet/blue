package p000;
/* renamed from: VQ5 */
/* loaded from: classes.dex */
public class VQ5 implements TQ5 {

    /* renamed from: a */
    public float f39080a;

    /* renamed from: b */
    public float f39081b;

    /* renamed from: c */
    public float f39082c;

    /* renamed from: d */
    public float f39083d;

    /* renamed from: e */
    public float f39084e;

    /* renamed from: f */
    public float f39085f;

    /* renamed from: g */
    public float f39086g;

    /* renamed from: h */
    public float f39087h;

    /* renamed from: i */
    public float f39088i;

    /* renamed from: j */
    public int f39089j;

    /* renamed from: k */
    public String f39090k;

    /* renamed from: m */
    public float f39092m;

    /* renamed from: n */
    public float f39093n;

    /* renamed from: l */
    public boolean f39091l = false;

    /* renamed from: o */
    public boolean f39094o = false;

    @Override // p000.TQ5
    /* renamed from: a */
    public float mo29024a() {
        return this.f39091l ? -m79878e(this.f39093n) : m79878e(this.f39093n);
    }

    @Override // p000.TQ5
    /* renamed from: b */
    public boolean mo29023b() {
        return mo29024a() < 1.0E-5f && Math.abs(this.f39088i - this.f39093n) < 1.0E-5f;
    }

    /* renamed from: c */
    public final float m79880c(float f) {
        this.f39094o = false;
        float f2 = this.f39083d;
        if (f <= f2) {
            float f3 = this.f39080a;
            return (f3 * f) + ((((this.f39081b - f3) * f) * f) / (f2 * 2.0f));
        }
        int i = this.f39089j;
        if (i == 1) {
            return this.f39086g;
        }
        float f4 = f - f2;
        float f5 = this.f39084e;
        if (f4 < f5) {
            float f6 = this.f39086g;
            float f7 = this.f39081b;
            return f6 + (f7 * f4) + ((((this.f39082c - f7) * f4) * f4) / (f5 * 2.0f));
        } else if (i == 2) {
            return this.f39087h;
        } else {
            float f8 = f4 - f5;
            float f9 = this.f39085f;
            if (f8 <= f9) {
                float f10 = this.f39087h;
                float f11 = this.f39082c;
                return (f10 + (f11 * f8)) - (((f11 * f8) * f8) / (f9 * 2.0f));
            }
            this.f39094o = true;
            return this.f39088i;
        }
    }

    /* renamed from: d */
    public void m79879d(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z = false;
        this.f39094o = false;
        this.f39092m = f;
        if (f > f2) {
            z = true;
        }
        this.f39091l = z;
        if (z) {
            m79877f(-f3, f - f2, f5, f6, f4);
        } else {
            m79877f(f3, f2 - f, f5, f6, f4);
        }
    }

    /* renamed from: e */
    public float m79878e(float f) {
        float f2 = this.f39083d;
        if (f <= f2) {
            float f3 = this.f39080a;
            return f3 + (((this.f39081b - f3) * f) / f2);
        }
        int i = this.f39089j;
        if (i == 1) {
            return 0.0f;
        }
        float f4 = f - f2;
        float f5 = this.f39084e;
        if (f4 < f5) {
            float f6 = this.f39081b;
            return f6 + (((this.f39082c - f6) * f4) / f5);
        } else if (i == 2) {
            return this.f39087h;
        } else {
            float f7 = f4 - f5;
            float f8 = this.f39085f;
            if (f7 < f8) {
                float f9 = this.f39082c;
                return f9 - ((f7 * f9) / f8);
            }
            return this.f39088i;
        }
    }

    /* renamed from: f */
    public final void m79877f(float f, float f2, float f3, float f4, float f5) {
        this.f39094o = false;
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f39080a = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float sqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (sqrt < f4) {
                this.f39090k = "backward accelerate, decelerate";
                this.f39089j = 2;
                this.f39080a = f;
                this.f39081b = sqrt;
                this.f39082c = 0.0f;
                float f8 = (sqrt - f) / f3;
                this.f39083d = f8;
                this.f39084e = sqrt / f3;
                this.f39086g = ((f + sqrt) * f8) / 2.0f;
                this.f39087h = f2;
                this.f39088i = f2;
                return;
            }
            this.f39090k = "backward accelerate cruse decelerate";
            this.f39089j = 3;
            this.f39080a = f;
            this.f39081b = f4;
            this.f39082c = f4;
            float f9 = (f4 - f) / f3;
            this.f39083d = f9;
            float f10 = f4 / f3;
            this.f39085f = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f39084e = ((f2 - f11) - f12) / f4;
            this.f39086g = f11;
            this.f39087h = f2 - f12;
            this.f39088i = f2;
        } else if (f7 >= f2) {
            this.f39090k = "hard stop";
            this.f39089j = 1;
            this.f39080a = f;
            this.f39081b = 0.0f;
            this.f39086g = f2;
            this.f39083d = (2.0f * f2) / f;
        } else {
            float f13 = f2 - f7;
            float f14 = f13 / f;
            if (f14 + f6 < f5) {
                this.f39090k = "cruse decelerate";
                this.f39089j = 2;
                this.f39080a = f;
                this.f39081b = f;
                this.f39082c = 0.0f;
                this.f39086g = f13;
                this.f39087h = f2;
                this.f39083d = f14;
                this.f39084e = f6;
                return;
            }
            float sqrt2 = (float) Math.sqrt((f3 * f2) + ((f * f) / 2.0f));
            float f15 = (sqrt2 - f) / f3;
            this.f39083d = f15;
            float f16 = sqrt2 / f3;
            this.f39084e = f16;
            if (sqrt2 < f4) {
                this.f39090k = "accelerate decelerate";
                this.f39089j = 2;
                this.f39080a = f;
                this.f39081b = sqrt2;
                this.f39082c = 0.0f;
                this.f39083d = f15;
                this.f39084e = f16;
                this.f39086g = ((f + sqrt2) * f15) / 2.0f;
                this.f39087h = f2;
                return;
            }
            this.f39090k = "accelerate cruse decelerate";
            this.f39089j = 3;
            this.f39080a = f;
            this.f39081b = f4;
            this.f39082c = f4;
            float f17 = (f4 - f) / f3;
            this.f39083d = f17;
            float f18 = f4 / f3;
            this.f39085f = f18;
            float f19 = ((f + f4) * f17) / 2.0f;
            float f20 = (f18 * f4) / 2.0f;
            this.f39084e = ((f2 - f19) - f20) / f4;
            this.f39086g = f19;
            this.f39087h = f2 - f20;
            this.f39088i = f2;
        }
    }

    @Override // p000.TQ5
    public float getInterpolation(float f) {
        float m79880c = m79880c(f);
        this.f39093n = f;
        if (this.f39091l) {
            return this.f39092m - m79880c;
        }
        return this.f39092m + m79880c;
    }
}
