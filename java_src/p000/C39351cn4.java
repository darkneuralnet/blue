package p000;

import java.lang.reflect.Array;
import kotlin.UByte;
/* renamed from: cn4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C39351cn4 {
    /* renamed from: a */
    public static byte[] m60879a(short[] sArr) {
        byte[] bArr = new byte[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            bArr[i] = (byte) sArr[i];
        }
        return bArr;
    }

    /* renamed from: b */
    public static short[] m60878b(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            sArr[i] = (short) (bArr[i] & UByte.MAX_VALUE);
        }
        return sArr;
    }

    /* renamed from: c */
    public static byte[][] m60877c(short[][] sArr) {
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, sArr.length, sArr[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                bArr[i][i2] = (byte) sArr[i][i2];
            }
        }
        return bArr;
    }

    /* renamed from: d */
    public static short[][] m60876d(byte[][] bArr) {
        short[][] sArr = (short[][]) Array.newInstance(Short.TYPE, bArr.length, bArr[0].length);
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                sArr[i][i2] = (short) (bArr[i][i2] & UByte.MAX_VALUE);
            }
        }
        return sArr;
    }

    /* renamed from: e */
    public static byte[][][] m60875e(short[][][] sArr) {
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        byte[][][] bArr = (byte[][][]) Array.newInstance(Byte.TYPE, length, sArr2.length, sArr2[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                for (int i3 = 0; i3 < sArr[0][0].length; i3++) {
                    bArr[i][i2][i3] = (byte) sArr[i][i2][i3];
                }
            }
        }
        return bArr;
    }

    /* renamed from: f */
    public static short[][][] m60874f(byte[][][] bArr) {
        int length = bArr.length;
        byte[][] bArr2 = bArr[0];
        short[][][] sArr = (short[][][]) Array.newInstance(Short.TYPE, length, bArr2.length, bArr2[0].length);
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                for (int i3 = 0; i3 < bArr[0][0].length; i3++) {
                    sArr[i][i2][i3] = (short) (bArr[i][i2][i3] & UByte.MAX_VALUE);
                }
            }
        }
        return sArr;
    }

    /* renamed from: g */
    public static int[] m60873g(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            iArr[i] = bArr[i] & UByte.MAX_VALUE;
        }
        return iArr;
    }

    /* renamed from: h */
    public static byte[] m60872h(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = (byte) iArr[i];
        }
        return bArr;
    }

    /* renamed from: i */
    public static boolean m60871i(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= sArr[length] == sArr2[length];
        }
        return z;
    }

    /* renamed from: j */
    public static boolean m60870j(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= m60871i(sArr[length], sArr2[length]);
        }
        return z;
    }

    /* renamed from: k */
    public static boolean m60869k(short[][][] sArr, short[][][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= m60870j(sArr[length], sArr2[length]);
        }
        return z;
    }
}
