package p000;
/* renamed from: jS3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43316jS3 {

    /* renamed from: a */
    public final float f92726a;

    /* renamed from: b */
    public final float f92727b;

    /* renamed from: c */
    public final float f92728c;

    /* renamed from: d */
    public final float f92729d;

    /* renamed from: e */
    public final float f92730e;

    /* renamed from: f */
    public final float f92731f;

    /* renamed from: g */
    public final float f92732g;

    /* renamed from: h */
    public final float f92733h;

    /* renamed from: i */
    public final float f92734i;

    public C43316jS3(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f92726a = f;
        this.f92727b = f4;
        this.f92728c = f7;
        this.f92729d = f2;
        this.f92730e = f5;
        this.f92731f = f8;
        this.f92732g = f3;
        this.f92733h = f6;
        this.f92734i = f9;
    }

    /* renamed from: b */
    public static C43316jS3 m30608b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return m30606d(f9, f10, f11, f12, f13, f14, f15, f16).m30605e(m30607c(f, f2, f3, f4, f5, f6, f7, f8));
    }

    /* renamed from: c */
    public static C43316jS3 m30607c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m30606d(f, f2, f3, f4, f5, f6, f7, f8).m30609a();
    }

    /* renamed from: d */
    public static C43316jS3 m30606d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new C43316jS3(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new C43316jS3((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    /* renamed from: a */
    public C43316jS3 m30609a() {
        float f = this.f92730e;
        float f2 = this.f92734i;
        float f3 = this.f92731f;
        float f4 = this.f92733h;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.f92732g;
        float f7 = this.f92729d;
        float f8 = (f3 * f6) - (f7 * f2);
        float f9 = (f7 * f4) - (f * f6);
        float f10 = this.f92728c;
        float f11 = this.f92727b;
        float f12 = (f10 * f4) - (f11 * f2);
        float f13 = this.f92726a;
        return new C43316jS3(f5, f8, f9, f12, (f2 * f13) - (f10 * f6), (f6 * f11) - (f4 * f13), (f11 * f3) - (f10 * f), (f10 * f7) - (f3 * f13), (f13 * f) - (f11 * f7));
    }

    /* renamed from: e */
    public C43316jS3 m30605e(C43316jS3 c43316jS3) {
        float f = this.f92726a;
        float f2 = c43316jS3.f92726a;
        float f3 = this.f92729d;
        float f4 = c43316jS3.f92727b;
        float f5 = this.f92732g;
        float f6 = c43316jS3.f92728c;
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = c43316jS3.f92729d;
        float f9 = c43316jS3.f92730e;
        float f10 = c43316jS3.f92731f;
        float f11 = (f * f8) + (f3 * f9) + (f5 * f10);
        float f12 = c43316jS3.f92732g;
        float f13 = c43316jS3.f92733h;
        float f14 = c43316jS3.f92734i;
        float f15 = (f * f12) + (f3 * f13) + (f5 * f14);
        float f16 = this.f92727b;
        float f17 = this.f92730e;
        float f18 = this.f92733h;
        float f19 = (f18 * f14) + (f16 * f12) + (f17 * f13);
        float f20 = this.f92728c;
        float f21 = this.f92731f;
        float f22 = (f2 * f20) + (f4 * f21);
        float f23 = this.f92734i;
        return new C43316jS3(f7, f11, f15, (f16 * f2) + (f17 * f4) + (f18 * f6), (f16 * f8) + (f17 * f9) + (f18 * f10), f19, (f6 * f23) + f22, (f8 * f20) + (f9 * f21) + (f10 * f23), (f20 * f12) + (f21 * f13) + (f23 * f14));
    }

    /* renamed from: f */
    public void m30604f(float[] fArr) {
        int length = fArr.length;
        float f = this.f92726a;
        float f2 = this.f92727b;
        float f3 = this.f92728c;
        float f4 = this.f92729d;
        float f5 = this.f92730e;
        float f6 = this.f92731f;
        float f7 = this.f92732g;
        float f8 = this.f92733h;
        float f9 = this.f92734i;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr[i];
            int i2 = i + 1;
            float f11 = fArr[i2];
            float f12 = (f3 * f10) + (f6 * f11) + f9;
            fArr[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr[i2] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }
}
