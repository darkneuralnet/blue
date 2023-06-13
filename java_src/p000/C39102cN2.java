package p000;
/* renamed from: cN2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39102cN2 {
    private C39102cN2() {
    }

    /* renamed from: a */
    public static float m61516a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    /* renamed from: b */
    public static float m61515b(float f, float f2, float f3, float f4, float f5, float f6) {
        return m61512e(m61516a(f, f2, f3, f4), m61516a(f, f2, f5, f4), m61516a(f, f2, f5, f6), m61516a(f, f2, f3, f6));
    }

    /* renamed from: c */
    public static boolean m61514c(float f, float f2, float f3) {
        return f + f3 >= f2;
    }

    /* renamed from: d */
    public static float m61513d(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: e */
    public static float m61512e(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
