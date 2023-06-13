package p000;
/* renamed from: wH1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50922wH1 {
    private C50922wH1() {
    }

    /* renamed from: a */
    public static int m7053a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (d * highestOneBit))) {
            int i2 = highestOneBit << 1;
            if (i2 <= 0) {
                return 1073741824;
            }
            return i2;
        }
        return highestOneBit;
    }

    /* renamed from: b */
    public static int m7052b(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    /* renamed from: c */
    public static int m7051c(Object obj) {
        return m7052b(obj == null ? 0 : obj.hashCode());
    }
}
