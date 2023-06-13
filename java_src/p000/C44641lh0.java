package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
/* renamed from: lh0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44641lh0 {

    /* renamed from: a */
    public static final int[] f96554a = m26999e(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    private C44641lh0() {
    }

    /* renamed from: a */
    public static void m27003a(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int m27002b = m27002b(i5 ^ iArr[i4], 16);
        iArr[i4] = m27002b;
        int i6 = iArr[i3] + m27002b;
        iArr[i3] = i6;
        int m27002b2 = m27002b(iArr[i2] ^ i6, 12);
        iArr[i2] = m27002b2;
        int i7 = iArr[i] + m27002b2;
        iArr[i] = i7;
        int m27002b3 = m27002b(iArr[i4] ^ i7, 8);
        iArr[i4] = m27002b3;
        int i8 = iArr[i3] + m27002b3;
        iArr[i3] = i8;
        iArr[i2] = m27002b(iArr[i2] ^ i8, 7);
    }

    /* renamed from: b */
    public static int m27002b(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    /* renamed from: c */
    public static void m27001c(int[] iArr, int[] iArr2) {
        int[] iArr3 = f96554a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* renamed from: d */
    public static void m27000d(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            m27003a(iArr, 0, 4, 8, 12);
            m27003a(iArr, 1, 5, 9, 13);
            m27003a(iArr, 2, 6, 10, 14);
            m27003a(iArr, 3, 7, 11, 15);
            m27003a(iArr, 0, 5, 10, 15);
            m27003a(iArr, 1, 6, 11, 12);
            m27003a(iArr, 2, 7, 8, 13);
            m27003a(iArr, 3, 4, 9, 14);
        }
    }

    /* renamed from: e */
    public static int[] m26999e(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
