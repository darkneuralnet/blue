package com.google.p034ar.core;

import com.google.p034ar.core.annotations.UsedByNative;
import java.util.Locale;
@UsedByNative("session_jni_wrapper.cc")
/* renamed from: com.google.ar.core.Quaternion */
/* loaded from: classes6.dex */
class Quaternion {

    /* renamed from: a */
    public static final Quaternion f73725a = new Quaternion();
    @UsedByNative("session_jni_wrapper.cc")

    /* renamed from: x */
    private float f73727x = 0.0f;
    @UsedByNative("session_jni_wrapper.cc")

    /* renamed from: y */
    private float f73728y = 0.0f;
    @UsedByNative("session_jni_wrapper.cc")

    /* renamed from: z */
    private float f73729z = 0.0f;
    @UsedByNative("session_jni_wrapper.cc")

    /* renamed from: w */
    private float f73726w = 1.0f;

    public Quaternion() {
        m48436j(0.0f, 0.0f, 0.0f, 1.0f);
    }

    /* renamed from: g */
    public static Quaternion m48439g(Quaternion quaternion, Quaternion quaternion2, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        Quaternion quaternion3 = new Quaternion();
        float f7 = (quaternion.f73727x * quaternion2.f73727x) + (quaternion.f73728y * quaternion2.f73728y) + (quaternion.f73729z * quaternion2.f73729z) + (quaternion.f73726w * quaternion2.f73726w);
        if (f7 < 0.0f) {
            Quaternion quaternion4 = new Quaternion(quaternion2);
            f7 = -f7;
            quaternion4.f73727x = -quaternion4.f73727x;
            quaternion4.f73728y = -quaternion4.f73728y;
            quaternion4.f73729z = -quaternion4.f73729z;
            quaternion4.f73726w = -quaternion4.f73726w;
            quaternion2 = quaternion4;
        }
        float acos = (float) Math.acos(f7);
        float sqrt = (float) Math.sqrt(1.0f - (f7 * f7));
        if (Math.abs(sqrt) > 0.001d) {
            float f8 = 1.0f / sqrt;
            f = ((float) Math.sin(f * acos)) * f8;
            f2 = ((float) Math.sin((1.0f - f) * acos)) * f8;
        } else {
            f2 = 1.0f - f;
        }
        quaternion3.f73727x = (quaternion.f73727x * f2) + (quaternion2.f73727x * f);
        quaternion3.f73728y = (quaternion.f73728y * f2) + (quaternion2.f73728y * f);
        quaternion3.f73729z = (quaternion.f73729z * f2) + (quaternion2.f73729z * f);
        quaternion3.f73726w = (f2 * quaternion.f73726w) + (f * quaternion2.f73726w);
        float sqrt2 = (float) (1.0d / Math.sqrt((((f3 * f3) + (f4 * f4)) + (f5 * f5)) + (f6 * f6)));
        quaternion3.f73727x *= sqrt2;
        quaternion3.f73728y *= sqrt2;
        quaternion3.f73729z *= sqrt2;
        quaternion3.f73726w *= sqrt2;
        return quaternion3;
    }

    /* renamed from: i */
    public static void m48437i(Quaternion quaternion, float[] fArr, int i, float[] fArr2, int i2) {
        float f = fArr[i];
        float f2 = fArr[i + 1];
        float f3 = fArr[i + 2];
        float f4 = quaternion.f73727x;
        float f5 = quaternion.f73728y;
        float f6 = quaternion.f73729z;
        float f7 = quaternion.f73726w;
        float f8 = f5 * f3;
        float f9 = f6 * f2;
        float f10 = f7 * f2;
        float f11 = f6 * f;
        float f12 = f4 * f3;
        float f13 = f7 * f3;
        float f14 = f4 * f2;
        float f15 = f5 * f;
        float f16 = -f4;
        float f17 = f2 * f5;
        float f18 = f3 * f6;
        float f19 = ((f7 * f) + f8) - f9;
        float f20 = -f6;
        float f21 = -f5;
        float f22 = (f13 + f14) - f15;
        float f23 = (f10 + f11) - f12;
        float f24 = ((f * f16) - f17) - f18;
        fArr2[i2] = (((f19 * f7) + (f24 * f16)) + (f23 * f20)) - (f22 * f21);
        fArr2[i2 + 1] = (((f23 * f7) + (f24 * f21)) + (f22 * f16)) - (f19 * f20);
        fArr2[i2 + 2] = (((f22 * f7) + (f24 * f20)) + (f19 * f21)) - (f23 * f16);
    }

    /* renamed from: a */
    public final float m48445a() {
        return this.f73726w;
    }

    /* renamed from: b */
    public final float m48444b() {
        return this.f73727x;
    }

    /* renamed from: c */
    public final float m48443c() {
        return this.f73728y;
    }

    /* renamed from: d */
    public final float m48442d() {
        return this.f73729z;
    }

    /* renamed from: e */
    public final Quaternion m48441e(Quaternion quaternion) {
        Quaternion quaternion2 = new Quaternion();
        float f = this.f73727x;
        float f2 = quaternion.f73726w;
        float f3 = this.f73728y;
        float f4 = quaternion.f73729z;
        float f5 = this.f73729z;
        float f6 = quaternion.f73728y;
        float f7 = this.f73726w;
        quaternion2.f73727x = (((f * f2) + (f3 * f4)) - (f5 * f6)) + (quaternion.f73727x * f7);
        float f8 = this.f73727x;
        float f9 = -f8;
        float f10 = quaternion.f73727x;
        quaternion2.f73728y = (f9 * f4) + (f3 * f2) + (f5 * f10) + (f6 * f7);
        float f11 = quaternion.f73728y;
        float f12 = this.f73728y;
        quaternion2.f73729z = ((f8 * f11) - (f12 * f10)) + (f5 * f2) + (f4 * f7);
        quaternion2.f73726w = (((f9 * f10) - (f12 * f11)) - (this.f73729z * quaternion.f73729z)) + (f7 * f2);
        return quaternion2;
    }

    /* renamed from: f */
    public final Quaternion m48440f() {
        return new Quaternion(-this.f73727x, -this.f73728y, -this.f73729z, this.f73726w);
    }

    /* renamed from: h */
    public final void m48438h(float[] fArr, int i) {
        fArr[i] = this.f73727x;
        fArr[i + 1] = this.f73728y;
        fArr[i + 2] = this.f73729z;
        fArr[i + 3] = this.f73726w;
    }

    /* renamed from: j */
    public final void m48436j(float f, float f2, float f3, float f4) {
        this.f73727x = f;
        this.f73728y = f2;
        this.f73729z = f3;
        this.f73726w = f4;
    }

    /* renamed from: k */
    public final void m48435k(float[] fArr, int i) {
        float f = this.f73727x;
        float f2 = this.f73728y;
        float f3 = this.f73729z;
        float f4 = this.f73726w;
        float f5 = (f * f) + (f2 * f2) + (f3 * f3) + (f4 * f4);
        float f6 = 0.0f;
        if (f5 > 0.0f) {
            f6 = 2.0f / f5;
        }
        float f7 = f * f6;
        float f8 = f2 * f6;
        float f9 = f6 * f3;
        float f10 = f4 * f7;
        float f11 = f4 * f8;
        float f12 = f4 * f9;
        float f13 = f7 * f;
        float f14 = f * f8;
        float f15 = f * f9;
        float f16 = f8 * f2;
        float f17 = f2 * f9;
        float f18 = f3 * f9;
        fArr[i] = 1.0f - (f16 + f18);
        fArr[i + 4] = f14 - f12;
        fArr[i + 8] = f15 + f11;
        fArr[i + 1] = f14 + f12;
        fArr[i + 5] = 1.0f - (f18 + f13);
        fArr[i + 9] = f17 - f10;
        fArr[i + 2] = f15 - f11;
        fArr[i + 6] = f17 + f10;
        fArr[i + 10] = 1.0f - (f13 + f16);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "[%.3f, %.3f, %.3f, %.3f]", Float.valueOf(this.f73727x), Float.valueOf(this.f73728y), Float.valueOf(this.f73729z), Float.valueOf(this.f73726w));
    }

    @UsedByNative("session_jni_wrapper.cc")
    public Quaternion(float f, float f2, float f3, float f4) {
        m48436j(f, f2, f3, f4);
    }

    public Quaternion(Quaternion quaternion) {
        m48436j(quaternion.f73727x, quaternion.f73728y, quaternion.f73729z, quaternion.f73726w);
    }
}
