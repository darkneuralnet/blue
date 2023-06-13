package p000;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
/* renamed from: i46  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC42504i46 {

    /* renamed from: k */
    public static float f86692k = 6.2831855f;

    /* renamed from: a */
    public AbstractC42603iF0 f86693a;

    /* renamed from: e */
    public int f86697e;

    /* renamed from: f */
    public String f86698f;

    /* renamed from: i */
    public long f86701i;

    /* renamed from: b */
    public int f86694b = 0;

    /* renamed from: c */
    public int[] f86695c = new int[10];

    /* renamed from: d */
    public float[][] f86696d = (float[][]) Array.newInstance(Float.TYPE, 10, 3);

    /* renamed from: g */
    public float[] f86699g = new float[3];

    /* renamed from: h */
    public boolean f86700h = false;

    /* renamed from: j */
    public float f86702j = Float.NaN;

    /* renamed from: i46$a */
    /* loaded from: classes.dex */
    public static class C23122a {
        /* renamed from: a */
        public static void m34495a(int[] iArr, float[][] fArr, int i, int i2) {
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
                    int m34494b = m34494b(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = m34494b - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = m34494b + 1;
                }
            }
        }

        /* renamed from: b */
        public static int m34494b(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m34493c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m34493c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        public static void m34493c(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    /* renamed from: a */
    public float m34500a(float f) {
        float abs;
        switch (this.f86694b) {
            case 1:
                return Math.signum(f * f86692k);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * f86692k);
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f * f86692k);
        }
        return 1.0f - abs;
    }

    /* renamed from: b */
    public void mo34499b(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.f86695c;
        int i3 = this.f86697e;
        iArr[i3] = i;
        float[] fArr = this.f86696d[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.f86694b = Math.max(this.f86694b, i2);
        this.f86697e++;
    }

    /* renamed from: c */
    public void m34498c(long j) {
        this.f86701i = j;
    }

    /* renamed from: d */
    public void m34497d(String str) {
        this.f86698f = str;
    }

    /* renamed from: e */
    public void mo34496e(int i) {
        int i2 = this.f86697e;
        if (i2 == 0) {
            System.err.println("Error no points added to " + this.f86698f);
            return;
        }
        C23122a.m34495a(this.f86695c, this.f86696d, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f86695c;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i4, 3);
        int i5 = 0;
        for (int i6 = 0; i6 < this.f86697e; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.f86695c;
                if (iArr2[i6] == iArr2[i6 - 1]) {
                }
            }
            dArr[i5] = this.f86695c[i6] * 0.01d;
            double[] dArr3 = dArr2[i5];
            float[] fArr = this.f86696d[i6];
            dArr3[0] = fArr[0];
            dArr3[1] = fArr[1];
            dArr3[2] = fArr[2];
            i5++;
        }
        this.f86693a = AbstractC42603iF0.m34285a(i, dArr, dArr2);
    }

    public String toString() {
        String str = this.f86698f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f86697e; i++) {
            str = str + "[" + this.f86695c[i] + " , " + decimalFormat.format(this.f86696d[i]) + "] ";
        }
        return str;
    }
}
