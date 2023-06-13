package p000;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
/* renamed from: XN5 */
/* loaded from: classes.dex */
public abstract class XN5 {

    /* renamed from: a */
    public AbstractC42603iF0 f43093a;

    /* renamed from: b */
    public int[] f43094b = new int[10];

    /* renamed from: c */
    public float[] f43095c = new float[10];

    /* renamed from: d */
    public int f43096d;

    /* renamed from: e */
    public String f43097e;

    /* renamed from: XN5$a */
    /* loaded from: classes.dex */
    public static class C9407a {
        private C9407a() {
        }

        /* renamed from: a */
        public static void m77073a(int[] iArr, float[] fArr, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int m77072b = m77072b(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = m77072b - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = m77072b + 1;
                }
            }
        }

        /* renamed from: b */
        public static int m77072b(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m77071c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m77071c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        public static void m77071c(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    /* renamed from: a */
    public float m77078a(float f) {
        return (float) this.f43093a.mo34283c(f, 0);
    }

    /* renamed from: b */
    public float m77077b(float f) {
        return (float) this.f43093a.mo34280f(f, 0);
    }

    /* renamed from: c */
    public void mo77076c(int i, float f) {
        int[] iArr = this.f43094b;
        if (iArr.length < this.f43096d + 1) {
            this.f43094b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f43095c;
            this.f43095c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f43094b;
        int i2 = this.f43096d;
        iArr2[i2] = i;
        this.f43095c[i2] = f;
        this.f43096d = i2 + 1;
    }

    /* renamed from: d */
    public void m77075d(String str) {
        this.f43097e = str;
    }

    /* renamed from: e */
    public void mo77074e(int i) {
        int i2 = this.f43096d;
        if (i2 == 0) {
            return;
        }
        C9407a.m77073a(this.f43094b, this.f43095c, 0, i2 - 1);
        int i3 = 1;
        for (int i4 = 1; i4 < this.f43096d; i4++) {
            int[] iArr = this.f43094b;
            if (iArr[i4 - 1] != iArr[i4]) {
                i3++;
            }
        }
        double[] dArr = new double[i3];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i3, 1);
        int i5 = 0;
        for (int i6 = 0; i6 < this.f43096d; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.f43094b;
                if (iArr2[i6] == iArr2[i6 - 1]) {
                }
            }
            dArr[i5] = this.f43094b[i6] * 0.01d;
            dArr2[i5][0] = this.f43095c[i6];
            i5++;
        }
        this.f43093a = AbstractC42603iF0.m34285a(i, dArr, dArr2);
    }

    public String toString() {
        String str = this.f43097e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f43096d; i++) {
            str = str + "[" + this.f43094b[i] + " , " + decimalFormat.format(this.f43095c[i]) + "] ";
        }
        return str;
    }
}
