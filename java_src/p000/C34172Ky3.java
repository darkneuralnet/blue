package p000;

import java.util.Arrays;
/* renamed from: Ky3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C34172Ky3 {

    /* renamed from: c */
    public double[] f20469c;

    /* renamed from: d */
    public String f20470d;

    /* renamed from: e */
    public HV2 f20471e;

    /* renamed from: f */
    public int f20472f;

    /* renamed from: a */
    public float[] f20467a = new float[0];

    /* renamed from: b */
    public double[] f20468b = new double[0];

    /* renamed from: g */
    public double f20473g = 6.283185307179586d;

    /* renamed from: h */
    public boolean f20474h = false;

    /* renamed from: a */
    public void m98033a(double d, float f) {
        int length = this.f20467a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f20468b, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f20468b = Arrays.copyOf(this.f20468b, length);
        this.f20467a = Arrays.copyOf(this.f20467a, length);
        this.f20469c = new double[length];
        double[] dArr = this.f20468b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f20468b[binarySearch] = d;
        this.f20467a[binarySearch] = f;
        this.f20474h = false;
    }

    /* renamed from: b */
    public double m98032b(double d) {
        if (d <= 0.0d) {
            d = 1.0E-5d;
        } else if (d >= 1.0d) {
            d = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.f20468b, d);
        if (binarySearch > 0 || binarySearch == 0) {
            return 0.0d;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.f20467a;
        float f = fArr[i];
        int i2 = i - 1;
        float f2 = fArr[i2];
        double d2 = f - f2;
        double[] dArr = this.f20468b;
        double d3 = dArr[i];
        double d4 = dArr[i2];
        double d5 = d2 / (d3 - d4);
        return (f2 - (d5 * d4)) + (d * d5);
    }

    /* renamed from: c */
    public double m98031c(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f20468b, d);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.f20467a;
        float f = fArr[i];
        int i2 = i - 1;
        float f2 = fArr[i2];
        double d2 = f - f2;
        double[] dArr = this.f20468b;
        double d3 = dArr[i];
        double d4 = dArr[i2];
        double d5 = d2 / (d3 - d4);
        return this.f20469c[i2] + ((f2 - (d5 * d4)) * (d - d4)) + ((d5 * ((d * d) - (d4 * d4))) / 2.0d);
    }

    /* renamed from: d */
    public double m98030d(double d, double d2, double d3) {
        double m98031c = d2 + m98031c(d);
        double m98032b = m98032b(d) + d3;
        switch (this.f20472f) {
            case 1:
                return 0.0d;
            case 2:
                return m98032b * 4.0d * Math.signum((((m98031c * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return m98032b * 2.0d;
            case 4:
                return (-m98032b) * 2.0d;
            case 5:
                double d4 = this.f20473g;
                return (-d4) * m98032b * Math.sin(d4 * m98031c);
            case 6:
                return m98032b * 4.0d * ((((m98031c * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.f20471e.mo34280f(m98031c % 1.0d, 0);
            default:
                double d5 = this.f20473g;
                return m98032b * d5 * Math.cos(d5 * m98031c);
        }
    }

    /* renamed from: e */
    public double m98029e(double d, double d2) {
        double abs;
        double m98031c = m98031c(d) + d2;
        switch (this.f20472f) {
            case 1:
                return Math.signum(0.5d - (m98031c % 1.0d));
            case 2:
                abs = Math.abs((((m98031c * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((m98031c * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((m98031c * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f20473g * (d2 + m98031c));
            case 6:
                double abs2 = 1.0d - Math.abs(((m98031c * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.f20471e.mo34283c(m98031c % 1.0d, 0);
            default:
                return Math.sin(this.f20473g * m98031c);
        }
        return 1.0d - abs;
    }

    /* renamed from: f */
    public void m98028f() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        int i;
        double d = 0.0d;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f20467a.length) {
                break;
            }
            d += fArr[i2];
            i2++;
        }
        double d2 = 0.0d;
        int i3 = 1;
        while (true) {
            if (i3 >= this.f20467a.length) {
                break;
            }
            double[] dArr = this.f20468b;
            d2 += (dArr[i3] - dArr[i3 - 1]) * ((fArr2[i] + fArr2[i3]) / 2.0f);
            i3++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr4 = this.f20467a;
            if (i4 >= fArr4.length) {
                break;
            }
            fArr4[i4] = (float) (fArr4[i4] * (d / d2));
            i4++;
        }
        this.f20469c[0] = 0.0d;
        int i5 = 1;
        while (true) {
            if (i5 < this.f20467a.length) {
                int i6 = i5 - 1;
                double[] dArr2 = this.f20468b;
                double d3 = dArr2[i5] - dArr2[i6];
                double[] dArr3 = this.f20469c;
                dArr3[i5] = dArr3[i6] + (d3 * ((fArr3[i6] + fArr3[i5]) / 2.0f));
                i5++;
            } else {
                this.f20474h = true;
                return;
            }
        }
    }

    /* renamed from: g */
    public void m98027g(int i, String str) {
        this.f20472f = i;
        this.f20470d = str;
        if (str != null) {
            this.f20471e = HV2.m103810i(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f20468b) + " period=" + Arrays.toString(this.f20467a);
    }
}
