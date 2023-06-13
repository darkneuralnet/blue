package p000;

import android.opengl.Matrix;
/* renamed from: mN2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45049mN2 {

    /* renamed from: a */
    public static final float[] f97895a = new float[16];

    private C45049mN2() {
    }

    /* renamed from: a */
    public static void m25782a(float[] fArr, float f, float f2) {
        Matrix.translateM(fArr, 0, -f, -f2, 0.0f);
    }

    /* renamed from: b */
    public static void m25781b(float[] fArr, float f, float f2) {
        Matrix.translateM(fArr, 0, f, f2, 0.0f);
    }

    /* renamed from: c */
    public static void m25780c(float[] fArr, float f, float f2, float f3) {
        m25781b(fArr, f2, f3);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        m25782a(fArr, f2, f3);
    }
}
