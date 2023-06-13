package p000;
/* renamed from: HB0 */
/* loaded from: classes8.dex */
public class HB0 {
    /* renamed from: a */
    public static void m104192a(EB0 eb0, int i, EB0 eb02, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            m104191b(eb0, i + i4, eb02, i2 + i4);
        }
    }

    /* renamed from: b */
    public static void m104191b(EB0 eb0, int i, EB0 eb02, int i2) {
        int min = Math.min(eb0.mo1717F(), eb02.mo1717F());
        for (int i3 = 0; i3 < min; i3++) {
            eb02.mo1705y1(i2, i3, eb0.mo1713a3(i, i3));
        }
    }
}
