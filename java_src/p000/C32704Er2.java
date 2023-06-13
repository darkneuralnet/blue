package p000;
/* renamed from: Er2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C32704Er2 extends AbstractC42603iF0 {

    /* renamed from: a */
    public double[] f8194a;

    /* renamed from: b */
    public double[][] f8195b;

    /* renamed from: c */
    public double f8196c;

    /* renamed from: d */
    public boolean f8197d = true;

    /* renamed from: e */
    public double[] f8198e;

    public C32704Er2(double[] dArr, double[][] dArr2) {
        this.f8196c = Double.NaN;
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f8198e = new double[length2];
        this.f8194a = dArr;
        this.f8195b = dArr2;
        if (length2 > 2) {
            int i = 0;
            double d = 0.0d;
            while (true) {
                double d2 = d;
                if (i < dArr.length) {
                    double d3 = dArr2[i][0];
                    if (i > 0) {
                        Math.hypot(d3 - d, d3 - d2);
                    }
                    i++;
                    d = d3;
                } else {
                    this.f8196c = 0.0d;
                    return;
                }
            }
        }
    }

    @Override // p000.AbstractC42603iF0
    /* renamed from: c */
    public double mo34283c(double d, int i) {
        double d2;
        double d3;
        double mo34280f;
        double[] dArr = this.f8194a;
        int length = dArr.length;
        int i2 = 0;
        if (this.f8197d) {
            double d4 = dArr[0];
            if (d <= d4) {
                d2 = this.f8195b[0][i];
                d3 = d - d4;
                mo34280f = mo34280f(d4, i);
            } else {
                int i3 = length - 1;
                double d5 = dArr[i3];
                if (d >= d5) {
                    d2 = this.f8195b[i3][i];
                    d3 = d - d5;
                    mo34280f = mo34280f(d5, i);
                }
            }
            return d2 + (d3 * mo34280f);
        } else if (d <= dArr[0]) {
            return this.f8195b[0][i];
        } else {
            int i4 = length - 1;
            if (d >= dArr[i4]) {
                return this.f8195b[i4][i];
            }
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.f8194a;
            double d6 = dArr2[i2];
            if (d == d6) {
                return this.f8195b[i2][i];
            }
            int i5 = i2 + 1;
            double d7 = dArr2[i5];
            if (d < d7) {
                double d8 = (d - d6) / (d7 - d6);
                double[][] dArr3 = this.f8195b;
                return (dArr3[i2][i] * (1.0d - d8)) + (dArr3[i5][i] * d8);
            }
            i2 = i5;
        }
        return 0.0d;
    }

    @Override // p000.AbstractC42603iF0
    /* renamed from: d */
    public void mo34282d(double d, double[] dArr) {
        double[] dArr2 = this.f8194a;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f8195b[0].length;
        if (this.f8197d) {
            double d2 = dArr2[0];
            if (d <= d2) {
                mo34279g(d2, this.f8198e);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = this.f8195b[0][i2] + ((d - this.f8194a[0]) * this.f8198e[i2]);
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr2[i3];
            if (d >= d3) {
                mo34279g(d3, this.f8198e);
                while (i < length2) {
                    dArr[i] = this.f8195b[i3][i] + ((d - this.f8194a[i3]) * this.f8198e[i]);
                    i++;
                }
                return;
            }
        } else if (d <= dArr2[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                dArr[i4] = this.f8195b[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr2[i5]) {
                while (i < length2) {
                    dArr[i] = this.f8195b[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f8194a[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.f8195b[i6][i7];
                }
            }
            double[] dArr3 = this.f8194a;
            int i8 = i6 + 1;
            double d4 = dArr3[i8];
            if (d < d4) {
                double d5 = dArr3[i6];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    double[][] dArr4 = this.f8195b;
                    dArr[i] = (dArr4[i6][i] * (1.0d - d6)) + (dArr4[i8][i] * d6);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // p000.AbstractC42603iF0
    /* renamed from: e */
    public void mo34281e(double d, float[] fArr) {
        double[] dArr = this.f8194a;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f8195b[0].length;
        if (this.f8197d) {
            double d2 = dArr[0];
            if (d <= d2) {
                mo34279g(d2, this.f8198e);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (this.f8195b[0][i2] + ((d - this.f8194a[0]) * this.f8198e[i2]));
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr[i3];
            if (d >= d3) {
                mo34279g(d3, this.f8198e);
                while (i < length2) {
                    fArr[i] = (float) (this.f8195b[i3][i] + ((d - this.f8194a[i3]) * this.f8198e[i]));
                    i++;
                }
                return;
            }
        } else if (d <= dArr[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                fArr[i4] = (float) this.f8195b[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr[i5]) {
                while (i < length2) {
                    fArr[i] = (float) this.f8195b[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f8194a[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.f8195b[i6][i7];
                }
            }
            double[] dArr2 = this.f8194a;
            int i8 = i6 + 1;
            double d4 = dArr2[i8];
            if (d < d4) {
                double d5 = dArr2[i6];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    double[][] dArr3 = this.f8195b;
                    fArr[i] = (float) ((dArr3[i6][i] * (1.0d - d6)) + (dArr3[i8][i] * d6));
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r8 >= r3) goto L3;
     */
    @Override // p000.AbstractC42603iF0
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public double mo34280f(double d, int i) {
        double[] dArr = this.f8194a;
        int length = dArr.length;
        int i2 = 0;
        double d2 = dArr[0];
        if (d >= d2) {
            d2 = dArr[length - 1];
        }
        d = d2;
        while (i2 < length - 1) {
            double[] dArr2 = this.f8194a;
            int i3 = i2 + 1;
            double d3 = dArr2[i3];
            if (d <= d3) {
                double d4 = d3 - dArr2[i2];
                double[][] dArr3 = this.f8195b;
                return (dArr3[i3][i] - dArr3[i2][i]) / d4;
            }
            i2 = i3;
        }
        return 0.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r13 >= r4) goto L3;
     */
    @Override // p000.AbstractC42603iF0
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo34279g(double d, double[] dArr) {
        double[] dArr2 = this.f8194a;
        int length = dArr2.length;
        int length2 = this.f8195b[0].length;
        double d2 = dArr2[0];
        if (d > d2) {
            d2 = dArr2[length - 1];
        }
        d = d2;
        int i = 0;
        while (i < length - 1) {
            double[] dArr3 = this.f8194a;
            int i2 = i + 1;
            double d3 = dArr3[i2];
            if (d <= d3) {
                double d4 = d3 - dArr3[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    double[][] dArr4 = this.f8195b;
                    dArr[i3] = (dArr4[i2][i3] - dArr4[i][i3]) / d4;
                }
                return;
            }
            i = i2;
        }
    }

    @Override // p000.AbstractC42603iF0
    /* renamed from: h */
    public double[] mo34278h() {
        return this.f8194a;
    }
}
