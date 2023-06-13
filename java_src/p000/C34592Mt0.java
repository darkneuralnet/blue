package p000;
/* renamed from: Mt0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C34592Mt0 {
    /* renamed from: a */
    public static /* synthetic */ String m94636a(long j, int i) {
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i2 == 0) {
            return "0";
        }
        if (i2 > 0) {
            return Long.toString(j, i);
        }
        i = (i < 2 || i > 36) ? 10 : 10;
        int i3 = 64;
        char[] cArr = new char[64];
        int i4 = i - 1;
        if ((i & i4) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i3--;
                cArr[i3] = Character.forDigit(((int) j) & i4, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            long m76753a = (i & 1) == 0 ? (j >>> 1) / (i >>> 1) : C37019Xc6.m76753a(j, i);
            long j2 = i;
            cArr[63] = Character.forDigit((int) (j - (m76753a * j2)), i);
            i3 = 63;
            while (m76753a > 0) {
                i3--;
                cArr[i3] = Character.forDigit((int) (m76753a % j2), i);
                m76753a /= j2;
            }
        }
        return new String(cArr, i3, 64 - i3);
    }
}
