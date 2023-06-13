package p000;

import kotlin.UByte;
/* renamed from: DD3 */
/* loaded from: classes8.dex */
public abstract class DD3 {
    /* renamed from: a */
    public static int m110683a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] & UByte.MAX_VALUE) | (bArr[i] << 24) | ((bArr[i2] & UByte.MAX_VALUE) << 16) | ((bArr[i3] & UByte.MAX_VALUE) << 8);
    }

    /* renamed from: b */
    public static long m110682b(byte[] bArr, int i) {
        int m110683a = m110683a(bArr, i);
        return (m110683a(bArr, i + 4) & 4294967295L) | ((m110683a & 4294967295L) << 32);
    }

    /* renamed from: c */
    public static void m110681c(byte[] bArr, int i, long[] jArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            jArr[i2 + i4] = m110682b(bArr, i);
            i += 8;
        }
    }

    /* renamed from: d */
    public static void m110680d(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    /* renamed from: e */
    public static void m110679e(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    /* renamed from: f */
    public static int m110678f(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i2] & UByte.MAX_VALUE) << 8) | ((bArr[i3] & UByte.MAX_VALUE) << 16);
    }

    /* renamed from: g */
    public static long m110677g(byte[] bArr, int i) {
        return ((m110678f(bArr, i + 4) & 4294967295L) << 32) | (m110678f(bArr, i) & 4294967295L);
    }

    /* renamed from: h */
    public static short m110676h(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & UByte.MAX_VALUE) << 8) | (bArr[i] & UByte.MAX_VALUE));
    }

    /* renamed from: i */
    public static void m110675i(long j, byte[] bArr, int i) {
        m110680d((int) (j >>> 32), bArr, i);
        m110680d((int) (j & 4294967295L), bArr, i + 4);
    }

    /* renamed from: j */
    public static void m110674j(long[] jArr, int i, int i2, byte[] bArr, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            m110675i(jArr[i + i4], bArr, i3);
            i3 += 8;
        }
    }

    /* renamed from: k */
    public static void m110673k(long j, byte[] bArr, int i) {
        m110679e((int) (4294967295L & j), bArr, i);
        m110679e((int) (j >>> 32), bArr, i + 4);
    }

    /* renamed from: l */
    public static void m110672l(long[] jArr, int i, int i2, byte[] bArr, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            m110673k(jArr[i + i4], bArr, i3);
            i3 += 8;
        }
    }

    /* renamed from: m */
    public static void m110671m(short s, byte[] bArr, int i) {
        bArr[i] = (byte) (s >>> 8);
        bArr[i + 1] = (byte) s;
    }

    /* renamed from: n */
    public static void m110670n(short s, byte[] bArr, int i) {
        bArr[i] = (byte) s;
        bArr[i + 1] = (byte) (s >>> 8);
    }
}
