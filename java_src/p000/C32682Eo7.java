package p000;

import kotlin.UByte;
/* renamed from: Eo7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32682Eo7 {
    /* renamed from: a */
    public static int m108340a(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* renamed from: b */
    public static int m108339b(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int m6275b = C51249wp7.m6275b(obj);
        int i4 = m6275b & i;
        int m108338c = m108338c(obj3, i4);
        if (m108338c != 0) {
            int i5 = ~i;
            int i6 = m6275b & i5;
            int i7 = -1;
            while (true) {
                i2 = m108338c - 1;
                i3 = iArr[i2];
                if ((i3 & i5) != i6 || !QX7.m88418a(obj, objArr[i2]) || (objArr2 != null && !QX7.m88418a(obj2, objArr2[i2]))) {
                    int i8 = i3 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i7 = i2;
                    m108338c = i8;
                }
            }
            int i9 = i3 & i;
            if (i7 == -1) {
                m108336e(obj3, i4, i9);
            } else {
                iArr[i7] = (i9 & i) | (iArr[i7] & i5);
            }
            return i2;
        }
        return -1;
    }

    /* renamed from: c */
    public static int m108338c(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & UByte.MAX_VALUE;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    /* renamed from: d */
    public static Object m108337d(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public static void m108336e(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}