package p000;

import java.util.Arrays;
/* renamed from: Bm */
/* loaded from: classes.dex */
public class C0727Bm extends AbstractC42603iF0 {

    /* renamed from: a */
    public final double[] f2837a;

    /* renamed from: b */
    public C0728a[] f2838b;

    /* renamed from: c */
    public boolean f2839c = true;

    /* renamed from: Bm$a */
    /* loaded from: classes.dex */
    public static class C0728a {

        /* renamed from: s */
        public static double[] f2840s = new double[91];

        /* renamed from: a */
        public double[] f2841a;

        /* renamed from: b */
        public double f2842b;

        /* renamed from: c */
        public double f2843c;

        /* renamed from: d */
        public double f2844d;

        /* renamed from: e */
        public double f2845e;

        /* renamed from: f */
        public double f2846f;

        /* renamed from: g */
        public double f2847g;

        /* renamed from: h */
        public double f2848h;

        /* renamed from: i */
        public double f2849i;

        /* renamed from: j */
        public double f2850j;

        /* renamed from: k */
        public double f2851k;

        /* renamed from: l */
        public double f2852l;

        /* renamed from: m */
        public double f2853m;

        /* renamed from: n */
        public double f2854n;

        /* renamed from: o */
        public double f2855o;

        /* renamed from: p */
        public double f2856p;

        /* renamed from: q */
        public boolean f2857q;

        /* renamed from: r */
        public boolean f2858r;

        public C0728a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            int i2;
            double d7;
            double d8;
            this.f2858r = false;
            this.f2857q = i == 1;
            this.f2843c = d;
            this.f2844d = d2;
            this.f2849i = 1.0d / (d2 - d);
            if (3 == i) {
                this.f2858r = true;
            }
            double d9 = d5 - d3;
            double d10 = d6 - d4;
            if (!this.f2858r && Math.abs(d9) >= 0.001d && Math.abs(d10) >= 0.001d) {
                this.f2841a = new double[101];
                boolean z = this.f2857q;
                if (z) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                this.f2850j = d9 * i2;
                this.f2851k = d10 * (z ? 1 : -1);
                if (z) {
                    d7 = d5;
                } else {
                    d7 = d3;
                }
                this.f2852l = d7;
                if (z) {
                    d8 = d4;
                } else {
                    d8 = d6;
                }
                this.f2853m = d8;
                m113523a(d3, d4, d5, d6);
                this.f2854n = this.f2842b * this.f2849i;
                return;
            }
            this.f2858r = true;
            this.f2845e = d3;
            this.f2846f = d5;
            this.f2847g = d4;
            this.f2848h = d6;
            double hypot = Math.hypot(d10, d9);
            this.f2842b = hypot;
            this.f2854n = hypot * this.f2849i;
            double d11 = this.f2844d;
            double d12 = this.f2843c;
            this.f2852l = d9 / (d11 - d12);
            this.f2853m = d10 / (d11 - d12);
        }

        /* renamed from: a */
        public final void m113523a(double d, double d2, double d3, double d4) {
            double[] dArr;
            double[] dArr2;
            double d5;
            double d6 = d3 - d;
            double d7 = d2 - d4;
            int i = 0;
            double d8 = 0.0d;
            double d9 = 0.0d;
            double d10 = 0.0d;
            while (true) {
                if (i >= f2840s.length) {
                    break;
                }
                double d11 = d8;
                double radians = Math.toRadians((i * 90.0d) / (dArr.length - 1));
                double sin = Math.sin(radians) * d6;
                double cos = Math.cos(radians) * d7;
                if (i > 0) {
                    d5 = Math.hypot(sin - d9, cos - d10) + d11;
                    f2840s[i] = d5;
                } else {
                    d5 = d11;
                }
                i++;
                d10 = cos;
                d8 = d5;
                d9 = sin;
            }
            double d12 = d8;
            this.f2842b = d12;
            int i2 = 0;
            while (true) {
                double[] dArr3 = f2840s;
                if (i2 >= dArr3.length) {
                    break;
                }
                dArr3[i2] = dArr3[i2] / d12;
                i2++;
            }
            int i3 = 0;
            while (true) {
                if (i3 < this.f2841a.length) {
                    double length = i3 / (dArr2.length - 1);
                    int binarySearch = Arrays.binarySearch(f2840s, length);
                    if (binarySearch >= 0) {
                        this.f2841a[i3] = binarySearch / (f2840s.length - 1);
                    } else if (binarySearch == -1) {
                        this.f2841a[i3] = 0.0d;
                    } else {
                        int i4 = -binarySearch;
                        int i5 = i4 - 2;
                        double[] dArr4 = f2840s;
                        double d13 = dArr4[i5];
                        this.f2841a[i3] = (i5 + ((length - d13) / (dArr4[i4 - 1] - d13))) / (dArr4.length - 1);
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public double m113522b() {
            double d = this.f2850j * this.f2856p;
            double hypot = this.f2854n / Math.hypot(d, (-this.f2851k) * this.f2855o);
            if (this.f2857q) {
                d = -d;
            }
            return d * hypot;
        }

        /* renamed from: c */
        public double m113521c() {
            double d = this.f2850j * this.f2856p;
            double d2 = (-this.f2851k) * this.f2855o;
            double hypot = this.f2854n / Math.hypot(d, d2);
            if (this.f2857q) {
                return (-d2) * hypot;
            }
            return d2 * hypot;
        }

        /* renamed from: d */
        public double m113520d(double d) {
            return this.f2852l;
        }

        /* renamed from: e */
        public double m113519e(double d) {
            return this.f2853m;
        }

        /* renamed from: f */
        public double m113518f(double d) {
            double d2 = (d - this.f2843c) * this.f2849i;
            double d3 = this.f2845e;
            return d3 + (d2 * (this.f2846f - d3));
        }

        /* renamed from: g */
        public double m113517g(double d) {
            double d2 = (d - this.f2843c) * this.f2849i;
            double d3 = this.f2847g;
            return d3 + (d2 * (this.f2848h - d3));
        }

        /* renamed from: h */
        public double m113516h() {
            return this.f2852l + (this.f2850j * this.f2855o);
        }

        /* renamed from: i */
        public double m113515i() {
            return this.f2853m + (this.f2851k * this.f2856p);
        }

        /* renamed from: j */
        public double m113514j(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f2841a;
            double length = d * (dArr.length - 1);
            int i = (int) length;
            double d2 = length - i;
            double d3 = dArr[i];
            return d3 + (d2 * (dArr[i + 1] - d3));
        }

        /* renamed from: k */
        public void m113513k(double d) {
            double d2;
            if (this.f2857q) {
                d2 = this.f2844d - d;
            } else {
                d2 = d - this.f2843c;
            }
            double m113514j = m113514j(d2 * this.f2849i) * 1.5707963267948966d;
            this.f2855o = Math.sin(m113514j);
            this.f2856p = Math.cos(m113514j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r5 == 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0727Bm(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f2837a = dArr;
        this.f2838b = new C0728a[dArr.length - 1];
        int i = 1;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            C0728a[] c0728aArr = this.f2838b;
            if (i3 < c0728aArr.length) {
                int i4 = iArr[i3];
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                            }
                        }
                        i = 2;
                        i2 = i;
                    }
                    i = 1;
                    i2 = i;
                } else {
                    i2 = 3;
                }
                double d = dArr[i3];
                int i5 = i3 + 1;
                double d2 = dArr[i5];
                double[] dArr3 = dArr2[i3];
                double d3 = dArr3[0];
                double d4 = dArr3[1];
                double[] dArr4 = dArr2[i5];
                c0728aArr[i3] = new C0728a(i2, d, d2, d3, d4, dArr4[0], dArr4[1]);
                i3 = i5;
            } else {
                return;
            }
        }
    }

    @Override // p000.AbstractC42603iF0
    /* renamed from: c */
    public double mo34283c(double d, int i) {
        double m113517g;
        double m113519e;
        double m113515i;
        double m113521c;
        double m113517g2;
        double m113519e2;
        int i2 = 0;
        if (this.f2839c) {
            C0728a[] c0728aArr = this.f2838b;
            C0728a c0728a = c0728aArr[0];
            double d2 = c0728a.f2843c;
            if (d < d2) {
                double d3 = d - d2;
                if (c0728a.f2858r) {
                    if (i == 0) {
                        m113517g2 = c0728a.m113518f(d2);
                        m113519e2 = this.f2838b[0].m113520d(d2);
                    } else {
                        m113517g2 = c0728a.m113517g(d2);
                        m113519e2 = this.f2838b[0].m113519e(d2);
                    }
                    return m113517g2 + (d3 * m113519e2);
                }
                c0728a.m113513k(d2);
                if (i == 0) {
                    m113515i = this.f2838b[0].m113516h();
                    m113521c = this.f2838b[0].m113522b();
                } else {
                    m113515i = this.f2838b[0].m113515i();
                    m113521c = this.f2838b[0].m113521c();
                }
                return m113515i + (d3 * m113521c);
            } else if (d > c0728aArr[c0728aArr.length - 1].f2844d) {
                double d4 = c0728aArr[c0728aArr.length - 1].f2844d;
                double d5 = d - d4;
                int length = c0728aArr.length - 1;
                if (i == 0) {
                    m113517g = c0728aArr[length].m113518f(d4);
                    m113519e = this.f2838b[length].m113520d(d4);
                } else {
                    m113517g = c0728aArr[length].m113517g(d4);
                    m113519e = this.f2838b[length].m113519e(d4);
                }
                return m113517g + (d5 * m113519e);
            }
        } else {
            C0728a[] c0728aArr2 = this.f2838b;
            double d6 = c0728aArr2[0].f2843c;
            if (d < d6) {
                d = d6;
            } else if (d > c0728aArr2[c0728aArr2.length - 1].f2844d) {
                d = c0728aArr2[c0728aArr2.length - 1].f2844d;
            }
        }
        while (true) {
            C0728a[] c0728aArr3 = this.f2838b;
            if (i2 < c0728aArr3.length) {
                C0728a c0728a2 = c0728aArr3[i2];
                if (d <= c0728a2.f2844d) {
                    if (c0728a2.f2858r) {
                        if (i == 0) {
                            return c0728a2.m113518f(d);
                        }
                        return c0728a2.m113517g(d);
                    }
                    c0728a2.m113513k(d);
                    if (i == 0) {
                        return this.f2838b[i2].m113516h();
                    }
                    return this.f2838b[i2].m113515i();
                }
                i2++;
            } else {
                return Double.NaN;
            }
        }
    }

    @Override // p000.AbstractC42603iF0
    /* renamed from: d */
    public void mo34282d(double d, double[] dArr) {
        if (this.f2839c) {
            C0728a[] c0728aArr = this.f2838b;
            C0728a c0728a = c0728aArr[0];
            double d2 = c0728a.f2843c;
            if (d < d2) {
                double d3 = d - d2;
                if (c0728a.f2858r) {
                    dArr[0] = c0728a.m113518f(d2) + (this.f2838b[0].m113520d(d2) * d3);
                    dArr[1] = this.f2838b[0].m113517g(d2) + (d3 * this.f2838b[0].m113519e(d2));
                    return;
                }
                c0728a.m113513k(d2);
                dArr[0] = this.f2838b[0].m113516h() + (this.f2838b[0].m113522b() * d3);
                dArr[1] = this.f2838b[0].m113515i() + (d3 * this.f2838b[0].m113521c());
                return;
            } else if (d > c0728aArr[c0728aArr.length - 1].f2844d) {
                double d4 = c0728aArr[c0728aArr.length - 1].f2844d;
                double d5 = d - d4;
                int length = c0728aArr.length - 1;
                C0728a c0728a2 = c0728aArr[length];
                if (c0728a2.f2858r) {
                    dArr[0] = c0728a2.m113518f(d4) + (this.f2838b[length].m113520d(d4) * d5);
                    dArr[1] = this.f2838b[length].m113517g(d4) + (d5 * this.f2838b[length].m113519e(d4));
                    return;
                }
                c0728a2.m113513k(d);
                dArr[0] = this.f2838b[length].m113516h() + (this.f2838b[length].m113522b() * d5);
                dArr[1] = this.f2838b[length].m113515i() + (d5 * this.f2838b[length].m113521c());
                return;
            }
        } else {
            C0728a[] c0728aArr2 = this.f2838b;
            double d6 = c0728aArr2[0].f2843c;
            if (d < d6) {
                d = d6;
            }
            if (d > c0728aArr2[c0728aArr2.length - 1].f2844d) {
                d = c0728aArr2[c0728aArr2.length - 1].f2844d;
            }
        }
        int i = 0;
        while (true) {
            C0728a[] c0728aArr3 = this.f2838b;
            if (i < c0728aArr3.length) {
                C0728a c0728a3 = c0728aArr3[i];
                if (d <= c0728a3.f2844d) {
                    if (c0728a3.f2858r) {
                        dArr[0] = c0728a3.m113518f(d);
                        dArr[1] = this.f2838b[i].m113517g(d);
                        return;
                    }
                    c0728a3.m113513k(d);
                    dArr[0] = this.f2838b[i].m113516h();
                    dArr[1] = this.f2838b[i].m113515i();
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // p000.AbstractC42603iF0
    /* renamed from: e */
    public void mo34281e(double d, float[] fArr) {
        if (this.f2839c) {
            C0728a[] c0728aArr = this.f2838b;
            C0728a c0728a = c0728aArr[0];
            double d2 = c0728a.f2843c;
            if (d < d2) {
                double d3 = d - d2;
                if (c0728a.f2858r) {
                    fArr[0] = (float) (c0728a.m113518f(d2) + (this.f2838b[0].m113520d(d2) * d3));
                    fArr[1] = (float) (this.f2838b[0].m113517g(d2) + (d3 * this.f2838b[0].m113519e(d2)));
                    return;
                }
                c0728a.m113513k(d2);
                fArr[0] = (float) (this.f2838b[0].m113516h() + (this.f2838b[0].m113522b() * d3));
                fArr[1] = (float) (this.f2838b[0].m113515i() + (d3 * this.f2838b[0].m113521c()));
                return;
            } else if (d > c0728aArr[c0728aArr.length - 1].f2844d) {
                double d4 = c0728aArr[c0728aArr.length - 1].f2844d;
                double d5 = d - d4;
                int length = c0728aArr.length - 1;
                C0728a c0728a2 = c0728aArr[length];
                if (c0728a2.f2858r) {
                    fArr[0] = (float) (c0728a2.m113518f(d4) + (this.f2838b[length].m113520d(d4) * d5));
                    fArr[1] = (float) (this.f2838b[length].m113517g(d4) + (d5 * this.f2838b[length].m113519e(d4)));
                    return;
                }
                c0728a2.m113513k(d);
                fArr[0] = (float) this.f2838b[length].m113516h();
                fArr[1] = (float) this.f2838b[length].m113515i();
                return;
            }
        } else {
            C0728a[] c0728aArr2 = this.f2838b;
            double d6 = c0728aArr2[0].f2843c;
            if (d < d6) {
                d = d6;
            } else if (d > c0728aArr2[c0728aArr2.length - 1].f2844d) {
                d = c0728aArr2[c0728aArr2.length - 1].f2844d;
            }
        }
        int i = 0;
        while (true) {
            C0728a[] c0728aArr3 = this.f2838b;
            if (i < c0728aArr3.length) {
                C0728a c0728a3 = c0728aArr3[i];
                if (d <= c0728a3.f2844d) {
                    if (c0728a3.f2858r) {
                        fArr[0] = (float) c0728a3.m113518f(d);
                        fArr[1] = (float) this.f2838b[i].m113517g(d);
                        return;
                    }
                    c0728a3.m113513k(d);
                    fArr[0] = (float) this.f2838b[i].m113516h();
                    fArr[1] = (float) this.f2838b[i].m113515i();
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // p000.AbstractC42603iF0
    /* renamed from: f */
    public double mo34280f(double d, int i) {
        C0728a[] c0728aArr = this.f2838b;
        int i2 = 0;
        double d2 = c0728aArr[0].f2843c;
        if (d < d2) {
            d = d2;
        }
        if (d > c0728aArr[c0728aArr.length - 1].f2844d) {
            d = c0728aArr[c0728aArr.length - 1].f2844d;
        }
        while (true) {
            C0728a[] c0728aArr2 = this.f2838b;
            if (i2 < c0728aArr2.length) {
                C0728a c0728a = c0728aArr2[i2];
                if (d <= c0728a.f2844d) {
                    if (c0728a.f2858r) {
                        if (i == 0) {
                            return c0728a.m113520d(d);
                        }
                        return c0728a.m113519e(d);
                    }
                    c0728a.m113513k(d);
                    if (i == 0) {
                        return this.f2838b[i2].m113522b();
                    }
                    return this.f2838b[i2].m113521c();
                }
                i2++;
            } else {
                return Double.NaN;
            }
        }
    }

    @Override // p000.AbstractC42603iF0
    /* renamed from: g */
    public void mo34279g(double d, double[] dArr) {
        C0728a[] c0728aArr = this.f2838b;
        double d2 = c0728aArr[0].f2843c;
        if (d < d2) {
            d = d2;
        } else if (d > c0728aArr[c0728aArr.length - 1].f2844d) {
            d = c0728aArr[c0728aArr.length - 1].f2844d;
        }
        int i = 0;
        while (true) {
            C0728a[] c0728aArr2 = this.f2838b;
            if (i < c0728aArr2.length) {
                C0728a c0728a = c0728aArr2[i];
                if (d <= c0728a.f2844d) {
                    if (c0728a.f2858r) {
                        dArr[0] = c0728a.m113520d(d);
                        dArr[1] = this.f2838b[i].m113519e(d);
                        return;
                    }
                    c0728a.m113513k(d);
                    dArr[0] = this.f2838b[i].m113522b();
                    dArr[1] = this.f2838b[i].m113521c();
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // p000.AbstractC42603iF0
    /* renamed from: h */
    public double[] mo34278h() {
        return this.f2837a;
    }
}
