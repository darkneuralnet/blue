package p000;

import kotlin.KotlinVersion;
import kotlin.UByte;
/* renamed from: Os2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35053Os2 {
    private C35053Os2() {
    }

    /* renamed from: a */
    public static void m91272a(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 8);
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    /* renamed from: b */
    public static void m91271b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            bArr[i2 + i4] = (byte) (i >>> (i4 * 8));
        }
    }

    /* renamed from: c */
    public static byte[] m91270c(int i) {
        return new byte[]{(byte) i, (byte) (i >>> 8), (byte) (i >>> 16), (byte) (i >>> 24)};
    }

    /* renamed from: d */
    public static int m91269d(byte[] bArr) {
        return ((bArr[3] & UByte.MAX_VALUE) << 24) | (bArr[0] & UByte.MAX_VALUE) | ((bArr[1] & UByte.MAX_VALUE) << 8) | ((bArr[2] & UByte.MAX_VALUE) << 16);
    }

    /* renamed from: e */
    public static int m91268e(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] & UByte.MAX_VALUE) | ((bArr[i2] & UByte.MAX_VALUE) << 8);
        return ((bArr[i3 + 1] & UByte.MAX_VALUE) << 24) | i4 | ((bArr[i3] & UByte.MAX_VALUE) << 16);
    }

    /* renamed from: f */
    public static int m91267f(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            i3 |= (bArr[i + i4] & KotlinVersion.MAX_COMPONENT_VALUE) << (i4 * 8);
        }
        return i3;
    }
}
