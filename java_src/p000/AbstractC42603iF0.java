package p000;
/* renamed from: iF0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC42603iF0 {

    /* renamed from: iF0$a */
    /* loaded from: classes.dex */
    public static class C23177a extends AbstractC42603iF0 {

        /* renamed from: a */
        public double f87036a;

        /* renamed from: b */
        public double[] f87037b;

        public C23177a(double d, double[] dArr) {
            this.f87036a = d;
            this.f87037b = dArr;
        }

        @Override // p000.AbstractC42603iF0
        /* renamed from: c */
        public double mo34283c(double d, int i) {
            return this.f87037b[i];
        }

        @Override // p000.AbstractC42603iF0
        /* renamed from: d */
        public void mo34282d(double d, double[] dArr) {
            double[] dArr2 = this.f87037b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // p000.AbstractC42603iF0
        /* renamed from: e */
        public void mo34281e(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f87037b;
                if (i < dArr.length) {
                    fArr[i] = (float) dArr[i];
                    i++;
                } else {
                    return;
                }
            }
        }

        @Override // p000.AbstractC42603iF0
        /* renamed from: f */
        public double mo34280f(double d, int i) {
            return 0.0d;
        }

        @Override // p000.AbstractC42603iF0
        /* renamed from: g */
        public void mo34279g(double d, double[] dArr) {
            for (int i = 0; i < this.f87037b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // p000.AbstractC42603iF0
        /* renamed from: h */
        public double[] mo34278h() {
            return new double[]{this.f87036a};
        }
    }

    /* renamed from: a */
    public static AbstractC42603iF0 m34285a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i != 0) {
            if (i != 2) {
                return new C32704Er2(dArr, dArr2);
            }
            return new C23177a(dArr[0], dArr2[0]);
        }
        return new HV2(dArr, dArr2);
    }

    /* renamed from: b */
    public static AbstractC42603iF0 m34284b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C0727Bm(iArr, dArr, dArr2);
    }

    /* renamed from: c */
    public abstract double mo34283c(double d, int i);

    /* renamed from: d */
    public abstract void mo34282d(double d, double[] dArr);

    /* renamed from: e */
    public abstract void mo34281e(double d, float[] fArr);

    /* renamed from: f */
    public abstract double mo34280f(double d, int i);

    /* renamed from: g */
    public abstract void mo34279g(double d, double[] dArr);

    /* renamed from: h */
    public abstract double[] mo34278h();
}
