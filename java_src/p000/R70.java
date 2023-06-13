package p000;

import kotlin.UByte;
/* renamed from: R70 */
/* loaded from: classes6.dex */
public class R70 {

    /* renamed from: a */
    public static final char[] f31557a = "0123456789ABCDEF".toCharArray();

    /* renamed from: b */
    public static final char[] f31558b = "0123456789abcdef".toCharArray();

    private R70() {
    }

    /* renamed from: a */
    public static float m87310a(byte[] bArr, int i) {
        return bArr[i] + ((bArr[i + 1] & UByte.MAX_VALUE) / 256.0f);
    }

    /* renamed from: b */
    public static byte[] m87309b(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i < 0 || i2 < 0 || (i3 = i2 - i) < 0 || bArr.length < i + i3) {
            return null;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return bArr2;
    }

    /* renamed from: c */
    public static int m87308c(byte[] bArr, int i) {
        return ((bArr[i + 1] & UByte.MAX_VALUE) << 0) | ((bArr[i + 0] & UByte.MAX_VALUE) << 8);
    }

    /* renamed from: d */
    public static long m87307d(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 0) | ((bArr[i + 0] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }

    /* renamed from: e */
    public static String m87306e(byte[] bArr, boolean z) {
        char[] cArr;
        if (bArr == null) {
            return null;
        }
        if (z) {
            cArr = f31557a;
        } else {
            cArr = f31558b;
        }
        char[] cArr2 = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            byte b = bArr[i];
            cArr2[i2] = cArr[(b & 240) >> 4];
            cArr2[i2 + 1] = cArr[b & 15];
        }
        return new String(cArr2);
    }
}
