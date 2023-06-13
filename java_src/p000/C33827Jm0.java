package p000;

import android.graphics.Color;
import kotlin.KotlinVersion;
/* renamed from: Jm0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33827Jm0 {

    /* renamed from: a */
    public static final ThreadLocal<double[]> f18143a = new ThreadLocal<>();

    private C33827Jm0() {
    }

    /* renamed from: a */
    public static void m99860a(int i, int i2, int i3, float[] fArr) {
        float f;
        float abs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float max = Math.max(f2, Math.max(f3, f4));
        float min = Math.min(f2, Math.min(f3, f4));
        float f5 = max - min;
        float f6 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f2) {
                f = ((f3 - f4) / f5) % 6.0f;
            } else if (max == f3) {
                f = ((f4 - f2) / f5) + 2.0f;
            } else {
                f = 4.0f + ((f2 - f3) / f5);
            }
            abs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = m99848m(f7, 0.0f, 360.0f);
        fArr[1] = m99848m(abs, 0.0f, 1.0f);
        fArr[2] = m99848m(f6, 0.0f, 1.0f);
    }

    /* renamed from: b */
    public static void m99859b(int i, int i2, int i3, double[] dArr) {
        double pow;
        double pow2;
        double pow3;
        if (dArr.length == 3) {
            double d = i / 255.0d;
            if (d < 0.04045d) {
                pow = d / 12.92d;
            } else {
                pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
            }
            double d2 = i2 / 255.0d;
            if (d2 < 0.04045d) {
                pow2 = d2 / 12.92d;
            } else {
                pow2 = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            }
            double d3 = i3 / 255.0d;
            if (d3 < 0.04045d) {
                pow3 = d3 / 12.92d;
            } else {
                pow3 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    /* renamed from: c */
    public static int m99858c(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d8 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d9 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        if (d7 > 0.0031308d) {
            d4 = (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d4 = d7 * 12.92d;
        }
        if (d8 > 0.0031308d) {
            d5 = (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d5 = d8 * 12.92d;
        }
        if (d9 > 0.0031308d) {
            d6 = (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d6 = d9 * 12.92d;
        }
        return Color.rgb(m99847n((int) Math.round(d4 * 255.0d), 0, KotlinVersion.MAX_COMPONENT_VALUE), m99847n((int) Math.round(d5 * 255.0d), 0, KotlinVersion.MAX_COMPONENT_VALUE), m99847n((int) Math.round(d6 * 255.0d), 0, KotlinVersion.MAX_COMPONENT_VALUE));
    }

    /* renamed from: d */
    public static int m99857d(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    /* renamed from: e */
    public static double m99856e(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = m99850k(i, i2);
            }
            double m99855f = m99855f(i) + 0.05d;
            double m99855f2 = m99855f(i2) + 0.05d;
            return Math.max(m99855f, m99855f2) / Math.min(m99855f, m99855f2);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    /* renamed from: f */
    public static double m99855f(int i) {
        double[] m99846o = m99846o();
        m99852i(i, m99846o);
        return m99846o[1] / 100.0d;
    }

    /* renamed from: g */
    public static int m99854g(int i, int i2, float f) {
        int alpha = Color.alpha(i2);
        int i3 = KotlinVersion.MAX_COMPONENT_VALUE;
        if (alpha == 255) {
            double d = f;
            if (m99856e(m99845p(i, KotlinVersion.MAX_COMPONENT_VALUE), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (m99856e(m99845p(i, i6), i2) < d) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    /* renamed from: h */
    public static void m99853h(int i, float[] fArr) {
        m99860a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    /* renamed from: i */
    public static void m99852i(int i, double[] dArr) {
        m99859b(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* renamed from: j */
    public static int m99851j(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: k */
    public static int m99850k(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int m99851j = m99851j(alpha2, alpha);
        return Color.argb(m99851j, m99849l(Color.red(i), alpha2, Color.red(i2), alpha, m99851j), m99849l(Color.green(i), alpha2, Color.green(i2), alpha, m99851j), m99849l(Color.blue(i), alpha2, Color.blue(i2), alpha, m99851j));
    }

    /* renamed from: l */
    public static int m99849l(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * KotlinVersion.MAX_COMPONENT_VALUE) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: m */
    public static float m99848m(float f, float f2, float f3) {
        return f < f2 ? f2 : Math.min(f, f3);
    }

    /* renamed from: n */
    public static int m99847n(int i, int i2, int i3) {
        return i < i2 ? i2 : Math.min(i, i3);
    }

    /* renamed from: o */
    public static double[] m99846o() {
        ThreadLocal<double[]> threadLocal = f18143a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            threadLocal.set(dArr2);
            return dArr2;
        }
        return dArr;
    }

    /* renamed from: p */
    public static int m99845p(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}
