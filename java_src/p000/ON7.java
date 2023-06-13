package p000;

import kotlin.UByte;
/* renamed from: ON7 */
/* loaded from: classes5.dex */
public final class ON7 {
    /* renamed from: a */
    public static int m92361a(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* renamed from: b */
    public static int m92360b(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int m44309a = C39727dO7.m44309a(obj);
        int i4 = m44309a & i;
        int m92359c = m92359c(obj3, i4);
        if (m92359c != 0) {
            int i5 = ~i;
            int i6 = m44309a & i5;
            int i7 = -1;
            while (true) {
                i2 = m92359c - 1;
                i3 = iArr[i2];
                if ((i3 & i5) != i6 || !C31998Bq7.m113442a(obj, objArr[i2]) || (objArr2 != null && !C31998Bq7.m113442a(obj2, objArr2[i2]))) {
                    int i8 = i3 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i7 = i2;
                    m92359c = i8;
                }
            }
            int i9 = i3 & i;
            if (i7 == -1) {
                m92357e(obj3, i4, i9);
            } else {
                iArr[i7] = (i9 & i) | (iArr[i7] & i5);
            }
            return i2;
        }
        return -1;
    }

    /* renamed from: c */
    public static int m92359c(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & UByte.MAX_VALUE;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    /* renamed from: d */
    public static Object m92358d(int i) {
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
    public static void m92357e(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
