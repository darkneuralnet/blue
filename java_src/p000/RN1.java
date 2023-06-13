package p000;
/* renamed from: RN1 */
/* loaded from: classes8.dex */
public final class RN1 {

    /* renamed from: a */
    public int f31971a;

    /* renamed from: b */
    public int[] f31972b;

    /* renamed from: c */
    public int[] f31973c;

    /* renamed from: a */
    public static void m86806a(RN1 rn1, C3535IT c3535it) {
        int length = rn1.f31973c.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            rn1.f31973c[i2] = i;
            C45119mV0.m25509n(rn1.f31971a, rn1.f31972b, i, c3535it);
            i += 1080;
        }
    }

    /* renamed from: b */
    public static void m86805b(RN1 rn1, int i, int i2) {
        rn1.f31971a = i;
        rn1.f31972b = new int[i2 * 1080];
        rn1.f31973c = new int[i2];
    }
}
