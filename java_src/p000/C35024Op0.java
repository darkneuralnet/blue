package p000;

import java.util.Arrays;
import kotlin.UByte;
import kotlin.UShort;
/* renamed from: Op0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35024Op0 {
    private C35024Op0() {
    }

    /* renamed from: a */
    public static Object m91333a(int i) {
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

    /* renamed from: b */
    public static int m91332b(int i, int i2) {
        return i & (~i2);
    }

    /* renamed from: c */
    public static int m91331c(int i, int i2) {
        return i & i2;
    }

    /* renamed from: d */
    public static int m91330d(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* renamed from: e */
    public static int m91329e(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* renamed from: f */
    public static int m91328f(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int m7051c = C50922wH1.m7051c(obj);
        int i4 = m7051c & i;
        int m91326h = m91326h(obj3, i4);
        if (m91326h == 0) {
            return -1;
        }
        int m91332b = m91332b(m7051c, i);
        int i5 = -1;
        while (true) {
            i2 = m91326h - 1;
            i3 = iArr[i2];
            if (m91332b(i3, i) != m91332b || !C37025Xd3.m76748a(obj, objArr[i2]) || (objArr2 != null && !C37025Xd3.m76748a(obj2, objArr2[i2]))) {
                int m91331c = m91331c(i3, i);
                if (m91331c == 0) {
                    return -1;
                }
                i5 = i2;
                m91326h = m91331c;
            }
        }
        int m91331c2 = m91331c(i3, i);
        if (i5 == -1) {
            m91325i(obj3, i4, m91331c2);
        } else {
            iArr[i5] = m91330d(iArr[i5], m91331c2, i);
        }
        return i2;
    }

    /* renamed from: g */
    public static void m91327g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* renamed from: h */
    public static int m91326h(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & UByte.MAX_VALUE;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & UShort.MAX_VALUE;
        }
        return ((int[]) obj)[i];
    }

    /* renamed from: i */
    public static void m91325i(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* renamed from: j */
    public static int m91324j(int i) {
        return Math.max(4, C50922wH1.m7053a(i + 1, 1.0d));
    }
}
