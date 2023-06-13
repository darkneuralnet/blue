package p000;

import java.lang.reflect.Array;
/* renamed from: FD1 */
/* loaded from: classes8.dex */
public final class FD1 {
    private FD1() {
    }

    /* renamed from: a */
    public static OA1 m107435a(PA1 pa1, TX3 tx3) {
        int m90614d = pa1.m90614d();
        int i = 1 << m90614d;
        int m83437g = tx3.m83437g();
        int i2 = 0;
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance(cls, m83437g, i);
        int[][] iArr2 = (int[][]) Array.newInstance(cls, m83437g, i);
        for (int i3 = 0; i3 < i; i3++) {
            iArr2[0][i3] = pa1.m90612f(tx3.m83439e(i3));
        }
        for (int i4 = 1; i4 < m83437g; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                iArr2[i4][i5] = pa1.m90610h(iArr2[i4 - 1][i5], i5);
            }
        }
        int i6 = 0;
        while (i6 < m83437g) {
            int i7 = i2;
            while (i7 < i) {
                for (int i8 = i2; i8 <= i6; i8++) {
                    int[] iArr3 = iArr[i6];
                    iArr3[i7] = pa1.m90617a(iArr3[i7], pa1.m90610h(iArr2[i8][i7], tx3.m83438f((m83437g + i8) - i6)));
                }
                i7++;
                i2 = 0;
            }
            i6++;
            i2 = 0;
        }
        int[][] iArr4 = (int[][]) Array.newInstance(Integer.TYPE, m83437g * m90614d, (i + 31) >>> 5);
        for (int i9 = 0; i9 < i; i9++) {
            int i10 = i9 >>> 5;
            int i11 = 1 << (i9 & 31);
            for (int i12 = 0; i12 < m83437g; i12++) {
                int i13 = iArr[i12][i9];
                for (int i14 = 0; i14 < m90614d; i14++) {
                    if (((i13 >>> i14) & 1) != 0) {
                        int[] iArr5 = iArr4[(((i12 + 1) * m90614d) - i14) - 1];
                        iArr5[i10] = iArr5[i10] ^ i11;
                    }
                }
            }
        }
        return new OA1(i, iArr4);
    }
}
