package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UByte;
/* renamed from: ON8 */
/* loaded from: classes5.dex */
public final class ON8 {
    /* renamed from: a */
    public static int m92356a(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    /* renamed from: b */
    public static long m92355b(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    /* renamed from: c */
    public static long m92354c(byte[] bArr) {
        int length = bArr.length;
        if (length < 0 || length > bArr.length) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("Out of bound index with offput: 0 and length: ");
            sb.append(length);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i = 37;
        if (length <= 32) {
            if (length > 16) {
                long j = (length << 1) - 7286425919675154353L;
                long m92352e = m92352e(bArr, 0) * (-5435081209227447693L);
                long m92352e2 = m92352e(bArr, 8);
                int i2 = length + 0;
                long m92352e3 = m92352e(bArr, i2 - 8) * j;
                return m92355b(Long.rotateRight(m92352e + m92352e2, 43) + Long.rotateRight(m92352e3, 30) + (m92352e(bArr, i2 - 16) * (-7286425919675154353L)), m92352e + Long.rotateRight(m92352e2 - 7286425919675154353L, 18) + m92352e3, j);
            } else if (length >= 8) {
                long j2 = (length << 1) - 7286425919675154353L;
                long m92352e4 = m92352e(bArr, 0) - 7286425919675154353L;
                long m92352e5 = m92352e(bArr, (length + 0) - 8);
                return m92355b((Long.rotateRight(m92352e5, 37) * j2) + m92352e4, (Long.rotateRight(m92352e4, 25) + m92352e5) * j2, j2);
            } else if (length >= 4) {
                return m92355b(length + ((m92356a(bArr, 0) & 4294967295L) << 3), m92356a(bArr, (length + 0) - 4) & 4294967295L, (length << 1) - 7286425919675154353L);
            } else if (length > 0) {
                byte b = bArr[0];
                byte b2 = bArr[(length >> 1) + 0];
                byte b3 = bArr[(length - 1) + 0];
                long j3 = (((b & UByte.MAX_VALUE) + ((b2 & UByte.MAX_VALUE) << 8)) * (-7286425919675154353L)) ^ ((length + ((b3 & UByte.MAX_VALUE) << 2)) * (-4348849565147123417L));
                return (j3 ^ (j3 >>> 47)) * (-7286425919675154353L);
            } else {
                return -7286425919675154353L;
            }
        } else if (length <= 64) {
            long j4 = (length << 1) - 7286425919675154353L;
            long m92352e6 = m92352e(bArr, 0) * (-7286425919675154353L);
            long m92352e7 = m92352e(bArr, 8);
            int i3 = length + 0;
            long m92352e8 = m92352e(bArr, i3 - 8) * j4;
            long rotateRight = Long.rotateRight(m92352e6 + m92352e7, 43) + Long.rotateRight(m92352e8, 30) + (m92352e(bArr, i3 - 16) * (-7286425919675154353L));
            long m92355b = m92355b(rotateRight, Long.rotateRight((-7286425919675154353L) + m92352e7, 18) + m92352e6 + m92352e8, j4);
            long m92352e9 = m92352e(bArr, 16) * j4;
            long m92352e10 = m92352e(bArr, 24);
            long m92352e11 = (rotateRight + m92352e(bArr, i3 - 32)) * j4;
            return m92355b(Long.rotateRight(m92352e9 + m92352e10, 43) + Long.rotateRight(m92352e11, 30) + ((m92355b + m92352e(bArr, i3 - 24)) * j4), m92352e9 + Long.rotateRight(m92352e10 + m92352e6, 18) + m92352e11, j4);
        } else {
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            long m92352e12 = m92352e(bArr, 0) + 95310865018149119L;
            int i4 = length - 1;
            int i5 = ((i4 / 64) << 6) + 0;
            int i6 = i4 & 63;
            int i7 = (i5 + i6) - 63;
            long j5 = 2480279821605975764L;
            long j6 = 1390051526045402406L;
            int i8 = 0;
            while (true) {
                long rotateRight2 = (Long.rotateRight(((m92352e12 + j5) + jArr[0]) + m92352e(bArr, i8 + 8), i) * (-5435081209227447693L)) ^ jArr2[1];
                long rotateRight3 = (Long.rotateRight(j5 + jArr[1] + m92352e(bArr, i8 + 48), 42) * (-5435081209227447693L)) + jArr[0] + m92352e(bArr, i8 + 40);
                long rotateRight4 = Long.rotateRight(j6 + jArr2[0], 33) * (-5435081209227447693L);
                int i9 = i6;
                int i10 = i5;
                m92353d(bArr, i8, jArr[1] * (-5435081209227447693L), rotateRight2 + jArr2[0], jArr);
                m92353d(bArr, i8 + 32, rotateRight4 + jArr2[1], rotateRight3 + m92352e(bArr, i8 + 16), jArr2);
                int i11 = i8 + 64;
                if (i11 == i10) {
                    long j7 = ((rotateRight2 & 255) << 1) - 5435081209227447693L;
                    long j8 = jArr2[0] + i9;
                    jArr2[0] = j8;
                    long j9 = jArr[0] + j8;
                    jArr[0] = j9;
                    jArr2[0] = jArr2[0] + j9;
                    long rotateRight5 = (Long.rotateRight(((rotateRight4 + rotateRight3) + jArr[0]) + m92352e(bArr, i7 + 8), 37) * j7) ^ (jArr2[1] * 9);
                    long rotateRight6 = (Long.rotateRight(rotateRight3 + jArr[1] + m92352e(bArr, i7 + 48), 42) * j7) + (jArr[0] * 9) + m92352e(bArr, i7 + 40);
                    long rotateRight7 = Long.rotateRight(rotateRight2 + jArr2[0], 33) * j7;
                    m92353d(bArr, i7, jArr[1] * j7, rotateRight5 + jArr2[0], jArr);
                    m92353d(bArr, i7 + 32, rotateRight7 + jArr2[1], m92352e(bArr, i7 + 16) + rotateRight6, jArr2);
                    return m92355b(m92355b(jArr[0], jArr2[0], j7) + (((rotateRight6 >>> 47) ^ rotateRight6) * (-4348849565147123417L)) + rotateRight5, m92355b(jArr[1], jArr2[1], j7) + rotateRight7, j7);
                }
                i8 = i11;
                i5 = i10;
                i6 = i9;
                m92352e12 = rotateRight4;
                j6 = rotateRight2;
                j5 = rotateRight3;
                i = 37;
            }
        }
    }

    /* renamed from: d */
    public static void m92353d(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long m92352e = m92352e(bArr, i);
        long m92352e2 = m92352e(bArr, i + 8);
        long m92352e3 = m92352e(bArr, i + 16);
        long m92352e4 = m92352e(bArr, i + 24);
        long j3 = j + m92352e;
        long j4 = m92352e2 + j3 + m92352e3;
        jArr[0] = j4 + m92352e4;
        jArr[1] = Long.rotateRight(j2 + j3 + m92352e4, 21) + Long.rotateRight(j4, 44) + j3;
    }

    /* renamed from: e */
    public static long m92352e(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }
}
