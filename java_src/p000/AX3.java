package p000;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import kotlin.UByte;
/* renamed from: AX3 */
/* loaded from: classes6.dex */
public class AX3 {
    private AX3() {
    }

    /* renamed from: a */
    public static byte[] m115668a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            int i = 0;
            long m115666c = m115666c(bArr, 0, 0) & 67108863;
            int i2 = 3;
            long m115666c2 = m115666c(bArr, 3, 2) & 67108611;
            long m115666c3 = m115666c(bArr, 6, 4) & 67092735;
            long m115666c4 = m115666c(bArr, 9, 6) & 66076671;
            long m115666c5 = m115666c(bArr, 12, 8) & 1048575;
            long j = m115666c2 * 5;
            long j2 = m115666c3 * 5;
            long j3 = m115666c4 * 5;
            long j4 = m115666c5 * 5;
            byte[] bArr3 = new byte[17];
            long j5 = 0;
            int i3 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            while (i3 < bArr2.length) {
                m115667b(bArr3, bArr2, i3);
                long m115666c6 = j9 + m115666c(bArr3, i, i);
                long m115666c7 = j5 + m115666c(bArr3, i2, 2);
                long m115666c8 = j6 + m115666c(bArr3, 6, 4);
                long m115666c9 = j7 + m115666c(bArr3, 9, 6);
                long m115666c10 = j8 + (m115666c(bArr3, 12, 8) | (bArr3[16] << 24));
                long j10 = (m115666c6 * m115666c) + (m115666c7 * j4) + (m115666c8 * j3) + (m115666c9 * j2) + (m115666c10 * j);
                long j11 = (m115666c6 * m115666c2) + (m115666c7 * m115666c) + (m115666c8 * j4) + (m115666c9 * j3) + (m115666c10 * j2) + (j10 >> 26);
                long j12 = (m115666c6 * m115666c3) + (m115666c7 * m115666c2) + (m115666c8 * m115666c) + (m115666c9 * j4) + (m115666c10 * j3) + (j11 >> 26);
                long j13 = (m115666c6 * m115666c4) + (m115666c7 * m115666c3) + (m115666c8 * m115666c2) + (m115666c9 * m115666c) + (m115666c10 * j4) + (j12 >> 26);
                long j14 = (m115666c6 * m115666c5) + (m115666c7 * m115666c4) + (m115666c8 * m115666c3) + (m115666c9 * m115666c2) + (m115666c10 * m115666c) + (j13 >> 26);
                long j15 = (j10 & 67108863) + ((j14 >> 26) * 5);
                j5 = (j11 & 67108863) + (j15 >> 26);
                i3 += 16;
                j6 = j12 & 67108863;
                j7 = j13 & 67108863;
                j8 = j14 & 67108863;
                i2 = 3;
                j9 = j15 & 67108863;
                i = 0;
            }
            long j16 = j6 + (j5 >> 26);
            long j17 = j16 & 67108863;
            long j18 = j7 + (j16 >> 26);
            long j19 = j18 & 67108863;
            long j20 = j8 + (j18 >> 26);
            long j21 = j20 & 67108863;
            long j22 = j9 + ((j20 >> 26) * 5);
            long j23 = j22 & 67108863;
            long j24 = (j5 & 67108863) + (j22 >> 26);
            long j25 = j23 + 5;
            long j26 = j25 & 67108863;
            long j27 = (j25 >> 26) + j24;
            long j28 = j17 + (j27 >> 26);
            long j29 = j19 + (j28 >> 26);
            long j30 = (j21 + (j29 >> 26)) - 67108864;
            long j31 = j30 >> 63;
            long j32 = j23 & j31;
            long j33 = j24 & j31;
            long j34 = j17 & j31;
            long j35 = j19 & j31;
            long j36 = j21 & j31;
            long j37 = ~j31;
            long j38 = (j27 & 67108863 & j37) | j33;
            long j39 = (j28 & 67108863 & j37) | j34;
            long j40 = (j29 & 67108863 & j37) | j35;
            long m115665d = ((j32 | (j26 & j37) | (j38 << 26)) & 4294967295L) + m115665d(bArr, 16);
            long j41 = m115665d & 4294967295L;
            long m115665d2 = (((j38 >> 6) | (j39 << 20)) & 4294967295L) + m115665d(bArr, 20) + (m115665d >> 32);
            long m115665d3 = (((j39 >> 12) | (j40 << 14)) & 4294967295L) + m115665d(bArr, 24) + (m115665d2 >> 32);
            byte[] bArr4 = new byte[16];
            m115664e(bArr4, j41, 0);
            m115664e(bArr4, m115665d2 & 4294967295L, 4);
            m115664e(bArr4, m115665d3 & 4294967295L, 8);
            m115664e(bArr4, ((((j40 >> 18) | (((j30 & j37) | j36) << 8)) & 4294967295L) + m115665d(bArr, 28) + (m115665d3 >> 32)) & 4294967295L, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    /* renamed from: b */
    public static void m115667b(byte[] bArr, byte[] bArr2, int i) {
        int min = Math.min(16, bArr2.length - i);
        System.arraycopy(bArr2, i, bArr, 0, min);
        bArr[min] = 1;
        if (min != 16) {
            Arrays.fill(bArr, min + 1, bArr.length, (byte) 0);
        }
    }

    /* renamed from: c */
    public static long m115666c(byte[] bArr, int i, int i2) {
        return (m115665d(bArr, i) >> i2) & 67108863;
    }

    /* renamed from: d */
    public static long m115665d(byte[] bArr, int i) {
        return (((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16)) & 4294967295L;
    }

    /* renamed from: e */
    public static void m115664e(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    /* renamed from: f */
    public static void m115663f(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (T70.m84296b(m115668a(bArr, bArr2), bArr3)) {
            return;
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
