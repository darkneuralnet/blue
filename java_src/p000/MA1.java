package p000;
/* renamed from: MA1 */
/* loaded from: classes8.dex */
public abstract class MA1 {
    /* renamed from: a */
    public static byte m95644a(byte[] bArr, byte[] bArr2) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return (byte) ((((i >>> 1) | (i & 1)) - 1) >> 31);
    }

    /* renamed from: b */
    public static void m95643b(long[] jArr, byte[] bArr) {
        DD3.m110674j(jArr, 0, 2, bArr, 0);
    }

    /* renamed from: c */
    public static void m95642c(byte[] bArr, long[] jArr) {
        DD3.m110681c(bArr, 0, jArr, 0, 2);
    }

    /* renamed from: d */
    public static long[] m95641d(byte[] bArr) {
        long[] jArr = new long[2];
        DD3.m110681c(bArr, 0, jArr, 0, 2);
        return jArr;
    }

    /* renamed from: e */
    public static void m95640e(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < 16; i++) {
            bArr2[i] = bArr[i];
        }
    }

    /* renamed from: f */
    public static void m95639f(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    /* renamed from: g */
    public static void m95638g(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = j >> 63;
        jArr2[0] = ((j ^ ((-2233785415175766016L) & j3)) << 1) | (j2 >>> 63);
        jArr2[1] = (j2 << 1) | (-j3);
    }

    /* renamed from: h */
    public static long m95637h(long j, long j2) {
        long j3 = j & 1229782938247303441L;
        long j4 = j & 2459565876494606882L;
        long j5 = j & 4919131752989213764L;
        long j6 = j & (-8608480567731124088L);
        long j7 = j2 & 1229782938247303441L;
        long j8 = j2 & 2459565876494606882L;
        long j9 = j2 & 4919131752989213764L;
        long j10 = j2 & (-8608480567731124088L);
        return (((((j3 * j7) ^ (j4 * j10)) ^ (j5 * j9)) ^ (j6 * j8)) & 1229782938247303441L) | (((((j3 * j8) ^ (j4 * j7)) ^ (j5 * j10)) ^ (j6 * j9)) & 2459565876494606882L) | (((((j3 * j9) ^ (j4 * j8)) ^ (j5 * j7)) ^ (j6 * j10)) & 4919131752989213764L) | (((((j3 * j10) ^ (j4 * j9)) ^ (j5 * j8)) ^ (j6 * j7)) & (-8608480567731124088L));
    }

    /* renamed from: i */
    public static void m95636i(byte[] bArr, byte[] bArr2) {
        long[] m95641d = m95641d(bArr);
        m95635j(m95641d, m95641d(bArr2));
        m95643b(m95641d, bArr);
    }

    /* renamed from: j */
    public static void m95635j(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr2[0];
        long j4 = jArr2[1];
        long m105649a = GC2.m105649a(j);
        long m105649a2 = GC2.m105649a(j2);
        long m105649a3 = GC2.m105649a(j3);
        long m105649a4 = GC2.m105649a(j4);
        long m105649a5 = GC2.m105649a(m95637h(m105649a, m105649a3));
        long m95637h = m95637h(j, j3) << 1;
        long m105649a6 = GC2.m105649a(m95637h(m105649a2, m105649a4));
        long m95637h2 = m95637h(j2, j4) << 1;
        long m95637h3 = ((m95637h(j ^ j2, j3 ^ j4) << 1) ^ ((m105649a6 ^ m95637h) ^ m95637h2)) ^ ((m95637h2 << 62) ^ (m95637h2 << 57));
        long j5 = m95637h3 >>> 7;
        long j6 = (m95637h3 << 57) ^ ((m95637h3 << 63) ^ (m95637h3 << 62));
        jArr[0] = m105649a5 ^ (j5 ^ ((m95637h3 ^ (m95637h3 >>> 1)) ^ (m95637h3 >>> 2)));
        jArr[1] = j6 ^ ((GC2.m105649a(m95637h(m105649a ^ m105649a2, m105649a3 ^ m105649a4)) ^ ((m95637h ^ m105649a5) ^ m105649a6)) ^ (((m95637h2 ^ (m95637h2 >>> 1)) ^ (m95637h2 >>> 2)) ^ (m95637h2 >>> 7)));
    }

    /* renamed from: k */
    public static void m95634k(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = j2 << 57;
        jArr2[0] = (j3 >>> 7) ^ ((((j >>> 7) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2));
        jArr2[1] = (j << 57) | (j2 >>> 7);
    }

    /* renamed from: l */
    public static long[] m95633l() {
        return new long[]{Long.MIN_VALUE};
    }

    /* renamed from: m */
    public static void m95632m(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        C43113j62.m31121a(jArr[0], jArr3, 0);
        C43113j62.m31121a(jArr[1], jArr3, 2);
        long j = jArr3[0];
        long j2 = jArr3[1];
        long j3 = jArr3[2];
        long j4 = jArr3[3];
        long j5 = j3 ^ ((j4 << 57) ^ ((j4 << 63) ^ (j4 << 62)));
        long j6 = j ^ ((((j5 >>> 1) ^ j5) ^ (j5 >>> 2)) ^ (j5 >>> 7));
        jArr2[0] = j6;
        jArr2[1] = (j2 ^ ((((j4 >>> 1) ^ j4) ^ (j4 >>> 2)) ^ (j4 >>> 7))) ^ ((j5 << 57) ^ ((j5 << 63) ^ (j5 << 62)));
    }

    /* renamed from: n */
    public static void m95631n(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        while (true) {
            i3--;
            if (i3 < 0) {
                return;
            }
            int i4 = i + i3;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i2 + i3]);
        }
    }

    /* renamed from: o */
    public static void m95630o(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int i4 = 0;
        do {
            bArr3[i3 + i4] = (byte) (bArr[i + i4] ^ bArr2[i2 + i4]);
            int i5 = i4 + 1;
            bArr3[i3 + i5] = (byte) (bArr[i + i5] ^ bArr2[i2 + i5]);
            int i6 = i5 + 1;
            bArr3[i3 + i6] = (byte) (bArr[i + i6] ^ bArr2[i2 + i6]);
            int i7 = i6 + 1;
            bArr3[i3 + i7] = (byte) (bArr[i + i7] ^ bArr2[i2 + i7]);
            i4 = i7 + 1;
        } while (i4 < 16);
    }

    /* renamed from: p */
    public static void m95629p(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            int i2 = i + 1;
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i4 = i3 + 1;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
            i = i4 + 1;
        } while (i < 16);
    }

    /* renamed from: q */
    public static void m95628q(byte[] bArr, byte[] bArr2, int i) {
        int i2 = 0;
        do {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i + i3]);
            int i4 = i3 + 1;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i + i4]);
            int i5 = i4 + 1;
            bArr[i5] = (byte) (bArr[i5] ^ bArr2[i + i5]);
            i2 = i5 + 1;
        } while (i2 < 16);
    }

    /* renamed from: r */
    public static void m95627r(byte[] bArr, byte[] bArr2, int i, int i2) {
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
        }
    }

    /* renamed from: s */
    public static void m95626s(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }
}
