package p000;
/* renamed from: Bj1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31929Bj1 {
    private C31929Bj1() {
    }

    /* renamed from: a */
    public static void m113644a(float f, float[] fArr) {
        if (f <= 0.5f) {
            fArr[0] = 1.0f - (f * 2.0f);
            fArr[1] = 0.0f;
            return;
        }
        fArr[0] = 0.0f;
        fArr[1] = (f * 2.0f) - 1.0f;
    }
}
