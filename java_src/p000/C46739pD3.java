package p000;

import java.lang.reflect.Array;
/* renamed from: pD3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46739pD3 {

    /* renamed from: a */
    public static final float[][] f103274a = (float[][]) Array.newInstance(Float.TYPE, C47332qD3.f104922b.length, 8);

    static {
        int i;
        int i2 = 0;
        while (true) {
            int[] iArr = C47332qD3.f104922b;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                int i4 = i3 & 1;
                int i5 = 0;
                while (i5 < 8) {
                    float f = 0.0f;
                    while (true) {
                        i = i3 & 1;
                        if (i == i4) {
                            f += 1.0f;
                            i3 >>= 1;
                        }
                    }
                    f103274a[i2][(8 - i5) - 1] = f / 17.0f;
                    i5++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private C46739pD3() {
    }

    /* renamed from: a */
    public static int m19820a(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | i3;
            }
        }
        return (int) j;
    }

    /* renamed from: b */
    public static int m19819b(int[] iArr) {
        int m44340d = C39713dN2.m44340d(iArr);
        float[] fArr = new float[8];
        if (m44340d > 1) {
            for (int i = 0; i < 8; i++) {
                fArr[i] = iArr[i] / m44340d;
            }
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f103274a;
            if (i3 < fArr2.length) {
                float[] fArr3 = fArr2[i3];
                float f2 = 0.0f;
                for (int i4 = 0; i4 < 8; i4++) {
                    float f3 = fArr3[i4] - fArr[i4];
                    f2 += f3 * f3;
                    if (f2 >= f) {
                        break;
                    }
                }
                if (f2 < f) {
                    i2 = C47332qD3.f104922b[i3];
                    f = f2;
                }
                i3++;
            } else {
                return i2;
            }
        }
    }

    /* renamed from: c */
    public static int m19818c(int[] iArr) {
        int m19820a = m19820a(iArr);
        if (C47332qD3.m17897a(m19820a) == -1) {
            return -1;
        }
        return m19820a;
    }

    /* renamed from: d */
    public static int m19817d(int[] iArr) {
        int m19818c = m19818c(m19816e(iArr));
        if (m19818c != -1) {
            return m19818c;
        }
        return m19819b(iArr);
    }

    /* renamed from: e */
    public static int[] m19816e(int[] iArr) {
        float m44340d = C39713dN2.m44340d(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            float f = (m44340d / 34.0f) + ((i3 * m44340d) / 17.0f);
            int i4 = iArr[i2];
            if (i + i4 <= f) {
                i += i4;
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
