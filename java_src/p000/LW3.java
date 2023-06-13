package p000;
/* renamed from: LW3 */
/* loaded from: classes8.dex */
public class LW3 {
    /* renamed from: a */
    public static boolean m96718a(C52053yB0 c52053yB0, C52053yB0[] c52053yB0Arr) {
        return m96716c(c52053yB0, c52053yB0Arr) != 2;
    }

    /* renamed from: b */
    public static boolean m96717b(C52053yB0 c52053yB0, EB0 eb0) {
        C31861Bb5 c31861Bb5 = new C31861Bb5();
        C52053yB0 c52053yB02 = new C52053yB0();
        C52053yB0 c52053yB03 = new C52053yB0();
        int size = eb0.size();
        for (int i = 1; i < size; i++) {
            eb0.mo1715T(i - 1, c52053yB02);
            eb0.mo1715T(i, c52053yB03);
            c31861Bb5.mo13588c(c52053yB0, c52053yB02, c52053yB03);
            if (c31861Bb5.m13582i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static int m96716c(C52053yB0 c52053yB0, C52053yB0[] c52053yB0Arr) {
        return C50633vn4.m8032d(c52053yB0, c52053yB0Arr);
    }
}
