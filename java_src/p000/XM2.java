package p000;
/* renamed from: XM2 */
/* loaded from: classes6.dex */
public class XM2 {
    /* renamed from: a */
    public static boolean m77083a(float f, float f2) {
        float abs = Math.abs(f - f2);
        if (abs <= 1.0E-10f || abs <= Math.max(Math.abs(f), Math.abs(f2)) * 1.1920929E-7f) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static float m77082b(float f, float f2, float f3) {
        return Math.min(f3, Math.max(f2, f));
    }
}
