package p000;

import kotlin.UByte;
/* renamed from: aG7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37858aG7 {
    /* renamed from: a */
    public static int m71716a(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* renamed from: b */
    public static int m71715b(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int m86996a = RG7.m86996a(obj);
        int i4 = m86996a & i;
        int m71714c = m71714c(obj3, i4);
        if (m71714c != 0) {
            int i5 = ~i;
            int i6 = m86996a & i5;
            int i7 = -1;
            while (true) {
                i2 = m71714c - 1;
                i3 = iArr[i2];
                if ((i3 & i5) != i6 || !C42418hv9.m35483a(obj, objArr[i2]) || (objArr2 != null && !C42418hv9.m35483a(obj2, objArr2[i2]))) {
                    int i8 = i3 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i7 = i2;
                    m71714c = i8;
                }
            }
            int i9 = i3 & i;
            if (i7 == -1) {
                m71712e(obj3, i4, i9);
            } else {
                iArr[i7] = (i9 & i) | (iArr[i7] & i5);
            }
            return i2;
        }
        return -1;
    }

    /* renamed from: c */
    public static int m71714c(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & UByte.MAX_VALUE;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    /* renamed from: d */
    public static Object m71713d(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i);
    }

    /* renamed from: e */
    public static void m71712e(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
