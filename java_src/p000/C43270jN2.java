package p000;

import android.util.Log;
/* renamed from: jN2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C43270jN2 {

    /* renamed from: b */
    public static final String f92609b = "jN2";

    /* renamed from: c */
    public static final float[] f92610c = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: a */
    public float[] f92611a;

    public C43270jN2() {
        this.f92611a = new float[16];
        m30749d(f92610c);
    }

    /* renamed from: b */
    public static boolean m30751b(C43270jN2 c43270jN2, C43270jN2 c43270jN22) {
        DZ3.m110173d(c43270jN2, "Parameter \"matrix\" was null.");
        DZ3.m110173d(c43270jN22, "Parameter \"dest\" was null.");
        float[] fArr = c43270jN2.f92611a;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float[] fArr2 = c43270jN22.f92611a;
        float f17 = ((((((f6 * f11) * f16) - ((f6 * f12) * f15)) - ((f10 * f7) * f16)) + ((f10 * f8) * f15)) + ((f14 * f7) * f12)) - ((f14 * f8) * f11);
        fArr2[0] = f17;
        float f18 = -f5;
        float f19 = f5 * f12;
        float f20 = f9 * f7;
        float f21 = f9 * f8;
        float f22 = f13 * f7;
        float f23 = f13 * f8;
        float f24 = ((((((f18 * f11) * f16) + (f19 * f15)) + (f20 * f16)) - (f21 * f15)) - (f22 * f12)) + (f23 * f11);
        fArr2[4] = f24;
        float f25 = ((f5 * f10) * f16) - (f19 * f14);
        float f26 = f9 * f6;
        float f27 = (f25 - (f26 * f16)) + (f21 * f14);
        float f28 = f13 * f6;
        float f29 = (f27 + (f28 * f12)) - (f23 * f10);
        fArr2[8] = f29;
        float f30 = ((((((f18 * f10) * f15) + ((f5 * f11) * f14)) + (f26 * f15)) - (f20 * f14)) - (f28 * f11)) + (f22 * f10);
        fArr2[12] = f30;
        float f31 = -f2;
        float f32 = f10 * f3;
        float f33 = f10 * f4;
        float f34 = f14 * f3;
        float f35 = f14 * f4;
        fArr2[1] = ((((((f31 * f11) * f16) + ((f2 * f12) * f15)) + (f32 * f16)) - (f33 * f15)) - (f34 * f12)) + (f35 * f11);
        float f36 = f * f11;
        float f37 = f * f12;
        float f38 = f9 * f3;
        float f39 = f9 * f4;
        float f40 = f13 * f3;
        float f41 = f13 * f4;
        fArr2[5] = (((((f36 * f16) - (f37 * f15)) - (f38 * f16)) + (f39 * f15)) + (f40 * f12)) - (f41 * f11);
        float f42 = -f;
        float f43 = f9 * f2;
        float f44 = f13 * f2;
        fArr2[9] = ((((((f42 * f10) * f16) + (f37 * f14)) + (f43 * f16)) - (f39 * f14)) - (f44 * f12)) + (f41 * f10);
        fArr2[13] = ((((((f * f10) * f15) - (f36 * f14)) - (f43 * f15)) + (f38 * f14)) + (f44 * f11)) - (f40 * f10);
        float f45 = f2 * f8;
        float f46 = f6 * f3;
        float f47 = f6 * f4;
        fArr2[2] = ((((((f2 * f7) * f16) - (f45 * f15)) - (f46 * f16)) + (f47 * f15)) + (f34 * f8)) - (f35 * f7);
        float f48 = f * f8;
        float f49 = f5 * f3;
        float f50 = f5 * f4;
        fArr2[6] = ((((((f42 * f7) * f16) + (f48 * f15)) + (f49 * f16)) - (f50 * f15)) - (f40 * f8)) + (f41 * f7);
        float f51 = f * f6;
        float f52 = f5 * f2;
        fArr2[10] = (((((f51 * f16) - (f48 * f14)) - (f16 * f52)) + (f50 * f14)) + (f44 * f8)) - (f41 * f6);
        float f53 = f42 * f6;
        float f54 = f * f7;
        fArr2[14] = (((((f53 * f15) + (f54 * f14)) + (f15 * f52)) - (f14 * f49)) - (f44 * f7)) + (f40 * f6);
        fArr2[3] = ((((((f31 * f7) * f12) + (f45 * f11)) + (f46 * f12)) - (f47 * f11)) - (f32 * f8)) + (f33 * f7);
        fArr2[7] = (((((f54 * f12) - (f48 * f11)) - (f49 * f12)) + (f50 * f11)) + (f38 * f8)) - (f39 * f7);
        fArr2[11] = (((((f53 * f12) + (f48 * f10)) + (f12 * f52)) - (f50 * f10)) - (f8 * f43)) + (f39 * f6);
        fArr2[15] = (((((f51 * f11) - (f54 * f10)) - (f52 * f11)) + (f49 * f10)) + (f43 * f7)) - (f38 * f6);
        float f55 = (f * f17) + (f2 * f24) + (f3 * f29) + (f4 * f30);
        if (f55 == 0.0f) {
            return false;
        }
        float f56 = 1.0f / f55;
        for (int i = 0; i < 16; i++) {
            float[] fArr3 = c43270jN22.f92611a;
            fArr3[i] = fArr3[i] * f56;
        }
        return true;
    }

    /* renamed from: a */
    public void m30752a(C36549Vc4 c36549Vc4) {
        float[] fArr = this.f92611a;
        float f = fArr[0];
        float f2 = fArr[5];
        float f3 = fArr[10];
        float f4 = f + f2 + f3;
        if (f4 > 0.0f) {
            float sqrt = ((float) Math.sqrt(f4 + 1.0d)) * 2.0f;
            c36549Vc4.f39343d = 0.25f * sqrt;
            float[] fArr2 = this.f92611a;
            c36549Vc4.f39340a = (fArr2[6] - fArr2[9]) / sqrt;
            c36549Vc4.f39341b = (fArr2[8] - fArr2[2]) / sqrt;
            c36549Vc4.f39342c = (fArr2[1] - fArr2[4]) / sqrt;
        } else if (f > f2 && f > f3) {
            float sqrt2 = ((float) Math.sqrt(((f + 1.0f) - f2) - f3)) * 2.0f;
            float[] fArr3 = this.f92611a;
            c36549Vc4.f39343d = (fArr3[6] - fArr3[9]) / sqrt2;
            c36549Vc4.f39340a = 0.25f * sqrt2;
            c36549Vc4.f39341b = (fArr3[4] + fArr3[1]) / sqrt2;
            c36549Vc4.f39342c = (fArr3[8] + fArr3[2]) / sqrt2;
        } else if (f2 > f3) {
            float sqrt3 = ((float) Math.sqrt(((f2 + 1.0f) - f) - f3)) * 2.0f;
            float[] fArr4 = this.f92611a;
            c36549Vc4.f39343d = (fArr4[8] - fArr4[2]) / sqrt3;
            c36549Vc4.f39340a = (fArr4[4] + fArr4[1]) / sqrt3;
            c36549Vc4.f39341b = 0.25f * sqrt3;
            c36549Vc4.f39342c = (fArr4[9] + fArr4[6]) / sqrt3;
        } else {
            float sqrt4 = ((float) Math.sqrt(((f3 + 1.0f) - f) - f2)) * 2.0f;
            float[] fArr5 = this.f92611a;
            c36549Vc4.f39343d = (fArr5[1] - fArr5[4]) / sqrt4;
            c36549Vc4.f39340a = (fArr5[8] + fArr5[2]) / sqrt4;
            c36549Vc4.f39341b = (fArr5[9] + fArr5[6]) / sqrt4;
            c36549Vc4.f39342c = sqrt4 * 0.25f;
        }
        c36549Vc4.m79655f();
    }

    /* renamed from: c */
    public void m30750c(float f) {
        DZ3.m110173d(Float.valueOf(f), "Parameter \"scale\" was null.");
        m30749d(f92610c);
        float[] fArr = this.f92611a;
        fArr[0] = f;
        fArr[5] = f;
        fArr[10] = f;
    }

    /* renamed from: d */
    public void m30749d(float[] fArr) {
        if (fArr != null && fArr.length == 16) {
            for (int i = 0; i < fArr.length; i++) {
                this.f92611a[i] = fArr[i];
            }
            return;
        }
        Log.w(f92609b, "Cannot set Matrix, invalid data.");
    }

    /* renamed from: e */
    public void m30748e(C35444Qj6 c35444Qj6) {
        float[] fArr = this.f92611a;
        fArr[12] = c35444Qj6.f30802a;
        fArr[13] = c35444Qj6.f30803b;
        fArr[14] = c35444Qj6.f30804c;
    }

    public C43270jN2(float[] fArr) {
        this.f92611a = new float[16];
        m30749d(fArr);
    }
}
