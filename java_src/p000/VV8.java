package p000;

import kotlin.KotlinVersion;
import kotlin.UByte;
/* renamed from: VV8 */
/* loaded from: classes6.dex */
public final class VV8 extends LV8 {

    /* renamed from: b */
    public static final LW8 f39174b = new VV8();

    /* renamed from: e */
    public static long m79835e(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    /* renamed from: f */
    public static void m79834f(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long m20899b = C46340oY8.m20899b(bArr, i);
        long m20899b2 = C46340oY8.m20899b(bArr, i + 8);
        long m20899b3 = C46340oY8.m20899b(bArr, i + 16);
        long m20899b4 = C46340oY8.m20899b(bArr, i + 24);
        long j3 = j + m20899b;
        long rotateRight = Long.rotateRight(j2 + j3 + m20899b4, 21);
        long j4 = m20899b2 + j3 + m20899b3;
        long rotateRight2 = Long.rotateRight(j4, 44);
        jArr[0] = j4 + m20899b4;
        jArr[1] = rotateRight + rotateRight2 + j3;
    }

    @Override // p000.TU8
    /* renamed from: c */
    public final AW8 mo79836c(byte[] bArr, int i, int i2) {
        long j;
        long m20899b;
        long rotateRight;
        int i3;
        C52142yK8.m3657h(0, i2, bArr.length);
        int i4 = 37;
        long j2 = -7286425919675154353L;
        if (i2 <= 32) {
            if (i2 <= 16) {
                if (i2 >= 8) {
                    long j3 = (i2 + i2) - 7286425919675154353L;
                    long m20899b2 = C46340oY8.m20899b(bArr, 0) - 7286425919675154353L;
                    long m20899b3 = C46340oY8.m20899b(bArr, i2 - 8);
                    j2 = m79835e((Long.rotateRight(m20899b3, 37) * j3) + m20899b2, (Long.rotateRight(m20899b2, 25) + m20899b3) * j3, j3);
                } else if (i2 >= 4) {
                    j2 = m79835e(i2 + ((C46340oY8.m20900a(bArr, 0) & 4294967295L) << 3), C46340oY8.m20900a(bArr, i2 - 4) & 4294967295L, (i2 + i2) - 7286425919675154353L);
                } else if (i2 > 0) {
                    long j4 = (((bArr[0] & UByte.MAX_VALUE) + ((bArr[i2 >> 1] & UByte.MAX_VALUE) << 8)) * (-7286425919675154353L)) ^ ((i2 + ((bArr[i2 - 1] & KotlinVersion.MAX_COMPONENT_VALUE) << 2)) * (-4348849565147123417L));
                    j2 = (-7286425919675154353L) * (j4 ^ (j4 >>> 47));
                }
            } else {
                long j5 = (i2 + i2) - 7286425919675154353L;
                long m20899b4 = C46340oY8.m20899b(bArr, 0) * (-5435081209227447693L);
                long m20899b5 = C46340oY8.m20899b(bArr, 8);
                long m20899b6 = C46340oY8.m20899b(bArr, i2 - 8) * j5;
                j2 = m79835e(Long.rotateRight(m20899b4 + m20899b5, 43) + Long.rotateRight(m20899b6, 30) + (C46340oY8.m20899b(bArr, i2 - 16) * (-7286425919675154353L)), m20899b4 + Long.rotateRight(m20899b5 - 7286425919675154353L, 18) + m20899b6, j5);
            }
        } else if (i2 <= 64) {
            long j6 = (i2 + i2) - 7286425919675154353L;
            long m20899b7 = C46340oY8.m20899b(bArr, 0) * (-7286425919675154353L);
            long m20899b8 = C46340oY8.m20899b(bArr, 8);
            long m20899b9 = C46340oY8.m20899b(bArr, i2 - 8) * j6;
            long rotateRight2 = Long.rotateRight(m20899b7 + m20899b8, 43) + Long.rotateRight(m20899b9, 30) + (C46340oY8.m20899b(bArr, i2 - 16) * (-7286425919675154353L));
            long rotateRight3 = Long.rotateRight(m20899b8 - 7286425919675154353L, 18);
            long m20899b10 = C46340oY8.m20899b(bArr, 16) * j6;
            long m20899b11 = C46340oY8.m20899b(bArr, 24);
            long m20899b12 = (C46340oY8.m20899b(bArr, i2 - 32) + rotateRight2) * j6;
            j2 = m79835e(Long.rotateRight(m20899b10 + m20899b11, 43) + Long.rotateRight(m20899b12, 30) + ((m79835e(rotateRight2, rotateRight3 + m20899b7 + m20899b9, j6) + C46340oY8.m20899b(bArr, i2 - 24)) * j6), m20899b10 + Long.rotateRight(m20899b11 + m20899b7, 18) + m20899b12, j6);
        } else {
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            long m20899b13 = C46340oY8.m20899b(bArr, 0) + 95310865018149119L;
            int i5 = i2 - 1;
            int i6 = (i5 >> 6) * 64;
            int i7 = i5 & 63;
            int i8 = (i6 + i7) - 63;
            long j7 = 2480279821605975764L;
            long j8 = 1390051526045402406L;
            int i9 = 0;
            while (true) {
                long rotateRight4 = Long.rotateRight(m20899b13 + j7 + jArr[0] + C46340oY8.m20899b(bArr, i9 + 8), i4);
                long rotateRight5 = Long.rotateRight(j7 + jArr[1] + C46340oY8.m20899b(bArr, i9 + 48), 42);
                j = (rotateRight4 * (-5435081209227447693L)) ^ jArr2[1];
                m20899b = (rotateRight5 * (-5435081209227447693L)) + jArr[0] + C46340oY8.m20899b(bArr, i9 + 40);
                rotateRight = Long.rotateRight(j8 + jArr2[0], 33) * (-5435081209227447693L);
                i3 = i7;
                m79834f(bArr, i9, jArr[1] * (-5435081209227447693L), j + jArr2[0], jArr);
                m79834f(bArr, i9 + 32, rotateRight + jArr2[1], m20899b + C46340oY8.m20899b(bArr, i9 + 16), jArr2);
                int i10 = i9 + 64;
                if (i10 == i6) {
                    break;
                }
                i9 = i10;
                i7 = i3;
                m20899b13 = rotateRight;
                j8 = j;
                j7 = m20899b;
                i4 = 37;
            }
            long j9 = j & 255;
            long j10 = (-5435081209227447693L) + j9 + j9;
            long j11 = jArr2[0] + i3;
            long j12 = jArr[0] + j11;
            jArr[0] = j12;
            jArr2[0] = j11 + j12;
            long rotateRight6 = Long.rotateRight(rotateRight + m20899b + j12 + C46340oY8.m20899b(bArr, i8 + 8), 37);
            long rotateRight7 = Long.rotateRight(m20899b + jArr[1] + C46340oY8.m20899b(bArr, i8 + 48), 42);
            long j13 = (rotateRight6 * j10) ^ (jArr2[1] * 9);
            long m20899b14 = (rotateRight7 * j10) + (jArr[0] * 9) + C46340oY8.m20899b(bArr, i8 + 40);
            long rotateRight8 = Long.rotateRight(j + jArr2[0], 33) * j10;
            m79834f(bArr, i8, jArr[1] * j10, j13 + jArr2[0], jArr);
            m79834f(bArr, i8 + 32, rotateRight8 + jArr2[1], m20899b14 + C46340oY8.m20899b(bArr, i8 + 16), jArr2);
            j2 = m79835e(m79835e(jArr[0], jArr2[0], j10) + ((m20899b14 ^ (m20899b14 >>> 47)) * (-4348849565147123417L)) + j13, m79835e(jArr[1], jArr2[1], j10) + rotateRight8, j10);
        }
        return AW8.m115678h(j2);
    }

    public final String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
