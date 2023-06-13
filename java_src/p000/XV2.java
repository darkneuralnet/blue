package p000;

import android.view.View;
import androidx.constraintlayout.widget.C11512a;
import androidx.constraintlayout.widget.C11515b;
import java.util.Arrays;
import java.util.LinkedHashMap;
/* renamed from: XV2 */
/* loaded from: classes.dex */
public class XV2 implements Comparable<XV2> {

    /* renamed from: u */
    public static String[] f43313u = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: b */
    public C41363g91 f43314b;

    /* renamed from: d */
    public float f43316d;

    /* renamed from: e */
    public float f43317e;

    /* renamed from: f */
    public float f43318f;

    /* renamed from: g */
    public float f43319g;

    /* renamed from: h */
    public float f43320h;

    /* renamed from: i */
    public float f43321i;

    /* renamed from: l */
    public int f43324l;

    /* renamed from: m */
    public int f43325m;

    /* renamed from: n */
    public float f43326n;

    /* renamed from: o */
    public OV2 f43327o;

    /* renamed from: p */
    public LinkedHashMap<String, C11512a> f43328p;

    /* renamed from: q */
    public int f43329q;

    /* renamed from: r */
    public int f43330r;

    /* renamed from: s */
    public double[] f43331s;

    /* renamed from: t */
    public double[] f43332t;

    /* renamed from: c */
    public int f43315c = 0;

    /* renamed from: j */
    public float f43322j = Float.NaN;

    /* renamed from: k */
    public float f43323k = Float.NaN;

    public XV2() {
        int i = AbstractC37078Xj2.f43729f;
        this.f43324l = i;
        this.f43325m = i;
        this.f43326n = Float.NaN;
        this.f43327o = null;
        this.f43328p = new LinkedHashMap<>();
        this.f43329q = 0;
        this.f43331s = new double[18];
        this.f43332t = new double[18];
    }

    /* renamed from: a */
    public void m76939a(C11515b.C11516a c11516a) {
        this.f43314b = C41363g91.m39970c(c11516a.f54085d.f54176d);
        C11515b.C11519c c11519c = c11516a.f54085d;
        this.f43324l = c11519c.f54177e;
        this.f43325m = c11519c.f54174b;
        this.f43322j = c11519c.f54181i;
        this.f43315c = c11519c.f54178f;
        this.f43330r = c11519c.f54175c;
        this.f43323k = c11516a.f54084c.f54191e;
        this.f43326n = c11516a.f54086e.f54106D;
        for (String str : c11516a.f54088g.keySet()) {
            C11512a c11512a = c11516a.f54088g.get(str);
            if (c11512a != null && c11512a.m67855g()) {
                this.f43328p.put(str, c11512a);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(XV2 xv2) {
        return Float.compare(this.f43317e, xv2.f43317e);
    }

    /* renamed from: c */
    public final boolean m76937c(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            if (Math.abs(f - f2) > 1.0E-6f) {
                return true;
            }
            return false;
        } else if (Float.isNaN(f) != Float.isNaN(f2)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public void m76936d(XV2 xv2, boolean[] zArr, String[] strArr, boolean z) {
        boolean m76937c = m76937c(this.f43318f, xv2.f43318f);
        boolean m76937c2 = m76937c(this.f43319g, xv2.f43319g);
        zArr[0] = zArr[0] | m76937c(this.f43317e, xv2.f43317e);
        boolean z2 = m76937c | m76937c2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | m76937c(this.f43320h, xv2.f43320h);
        zArr[4] = m76937c(this.f43321i, xv2.f43321i) | zArr[4];
    }

    /* renamed from: e */
    public void m76935e(double[] dArr, int[] iArr) {
        float[] fArr = {this.f43317e, this.f43318f, this.f43319g, this.f43320h, this.f43321i, this.f43322j};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[i2];
                i++;
            }
        }
    }

    /* renamed from: f */
    public void m76934f(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f43318f;
        float f2 = this.f43319g;
        float f3 = this.f43320h;
        float f4 = this.f43321i;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            f4 = f5;
                        }
                    } else {
                        f3 = f5;
                    }
                } else {
                    f2 = f5;
                }
            } else {
                f = f5;
            }
        }
        OV2 ov2 = this.f43327o;
        if (ov2 != null) {
            float[] fArr2 = new float[2];
            ov2.m92148i(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = f6;
            double d3 = f;
            double d4 = f2;
            f = (float) ((d2 + (Math.sin(d4) * d3)) - (f3 / 2.0f));
            f2 = (float) ((f7 - (d3 * Math.cos(d4))) - (f4 / 2.0f));
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* renamed from: g */
    public void m76933g(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        float f2 = this.f43318f;
        float f3 = this.f43319g;
        float f4 = this.f43320h;
        float f5 = this.f43321i;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            f5 = f10;
                            f9 = f11;
                        }
                    } else {
                        f4 = f10;
                        f7 = f11;
                    }
                } else {
                    f3 = f10;
                    f8 = f11;
                }
            } else {
                f2 = f10;
                f6 = f11;
            }
        }
        float f12 = 2.0f;
        float f13 = (f7 / 2.0f) + f6;
        float f14 = (f9 / 2.0f) + f8;
        OV2 ov2 = this.f43327o;
        if (ov2 != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            ov2.m92148i(d, fArr3, fArr4);
            float f15 = fArr3[0];
            float f16 = fArr3[1];
            float f17 = fArr4[0];
            float f18 = fArr4[1];
            double d2 = f2;
            double d3 = f3;
            f = f4;
            double d4 = f6;
            double d5 = f8;
            float sin = (float) (f17 + (Math.sin(d3) * d4) + (Math.cos(d3) * d5));
            f14 = (float) ((f18 - (d4 * Math.cos(d3))) + (Math.sin(d3) * d5));
            f13 = sin;
            f2 = (float) ((f15 + (Math.sin(d3) * d2)) - (f4 / 2.0f));
            f3 = (float) ((f16 - (d2 * Math.cos(d3))) - (f5 / 2.0f));
            f12 = 2.0f;
        } else {
            f = f4;
        }
        fArr[0] = f2 + (f / f12) + 0.0f;
        fArr[1] = f3 + (f5 / f12) + 0.0f;
        fArr2[0] = f13;
        fArr2[1] = f14;
    }

    /* renamed from: h */
    public int m76932h(String str, double[] dArr, int i) {
        C11512a c11512a = this.f43328p.get(str);
        int i2 = 0;
        if (c11512a == null) {
            return 0;
        }
        if (c11512a.m67854h() == 1) {
            dArr[i] = c11512a.m67857e();
            return 1;
        }
        int m67854h = c11512a.m67854h();
        float[] fArr = new float[m67854h];
        c11512a.m67856f(fArr);
        while (i2 < m67854h) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return m67854h;
    }

    /* renamed from: i */
    public int m76931i(String str) {
        C11512a c11512a = this.f43328p.get(str);
        if (c11512a == null) {
            return 0;
        }
        return c11512a.m67854h();
    }

    /* renamed from: j */
    public void m76930j(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f43318f;
        float f2 = this.f43319g;
        float f3 = this.f43320h;
        float f4 = this.f43321i;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            f4 = f5;
                        }
                    } else {
                        f3 = f5;
                    }
                } else {
                    f2 = f5;
                }
            } else {
                f = f5;
            }
        }
        OV2 ov2 = this.f43327o;
        if (ov2 != null) {
            float m92147j = ov2.m92147j();
            double d = f;
            double d2 = f2;
            f2 = (float) ((this.f43327o.m92146k() - (d * Math.cos(d2))) - (f4 / 2.0f));
            f = (float) ((m92147j + (Math.sin(d2) * d)) - (f3 / 2.0f));
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i4 = i + 1;
        fArr[i] = f + 0.0f;
        int i5 = i4 + 1;
        fArr[i4] = f2 + 0.0f;
        int i6 = i5 + 1;
        fArr[i5] = f6 + 0.0f;
        int i7 = i6 + 1;
        fArr[i6] = f2 + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = f6 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f7 + 0.0f;
        fArr[i9] = f + 0.0f;
        fArr[i9 + 1] = f7 + 0.0f;
    }

    /* renamed from: k */
    public boolean m76929k(String str) {
        return this.f43328p.containsKey(str);
    }

    /* renamed from: l */
    public void m76928l(C32641Ek2 c32641Ek2, XV2 xv2, XV2 xv22) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = c32641Ek2.f43730a / 100.0f;
        this.f43316d = f7;
        this.f43315c = c32641Ek2.f8000j;
        if (Float.isNaN(c32641Ek2.f8001k)) {
            f = f7;
        } else {
            f = c32641Ek2.f8001k;
        }
        if (Float.isNaN(c32641Ek2.f8002l)) {
            f2 = f7;
        } else {
            f2 = c32641Ek2.f8002l;
        }
        float f8 = xv22.f43320h;
        float f9 = xv2.f43320h;
        float f10 = xv22.f43321i;
        float f11 = xv2.f43321i;
        this.f43317e = this.f43316d;
        float f12 = xv2.f43318f;
        float f13 = xv2.f43319g;
        float f14 = (xv22.f43318f + (f8 / 2.0f)) - ((f9 / 2.0f) + f12);
        float f15 = (xv22.f43319g + (f10 / 2.0f)) - (f13 + (f11 / 2.0f));
        float f16 = ((f8 - f9) * f) / 2.0f;
        this.f43318f = (int) ((f12 + (f14 * f7)) - f16);
        float f17 = ((f10 - f11) * f2) / 2.0f;
        this.f43319g = (int) ((f13 + (f15 * f7)) - f17);
        this.f43320h = (int) (f9 + f3);
        this.f43321i = (int) (f11 + f4);
        if (Float.isNaN(c32641Ek2.f8003m)) {
            f5 = f7;
        } else {
            f5 = c32641Ek2.f8003m;
        }
        float f18 = 0.0f;
        if (Float.isNaN(c32641Ek2.f8006p)) {
            f6 = 0.0f;
        } else {
            f6 = c32641Ek2.f8006p;
        }
        if (!Float.isNaN(c32641Ek2.f8004n)) {
            f7 = c32641Ek2.f8004n;
        }
        if (!Float.isNaN(c32641Ek2.f8005o)) {
            f18 = c32641Ek2.f8005o;
        }
        this.f43329q = 0;
        this.f43318f = (int) (((xv2.f43318f + (f5 * f14)) + (f18 * f15)) - f16);
        this.f43319g = (int) (((xv2.f43319g + (f14 * f6)) + (f15 * f7)) - f17);
        this.f43314b = C41363g91.m39970c(c32641Ek2.f7998h);
        this.f43324l = c32641Ek2.f7999i;
    }

    /* renamed from: m */
    public void m76927m(C32641Ek2 c32641Ek2, XV2 xv2, XV2 xv22) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = c32641Ek2.f43730a / 100.0f;
        this.f43316d = f6;
        this.f43315c = c32641Ek2.f8000j;
        if (Float.isNaN(c32641Ek2.f8001k)) {
            f = f6;
        } else {
            f = c32641Ek2.f8001k;
        }
        if (Float.isNaN(c32641Ek2.f8002l)) {
            f2 = f6;
        } else {
            f2 = c32641Ek2.f8002l;
        }
        float f7 = xv22.f43320h - xv2.f43320h;
        float f8 = xv22.f43321i - xv2.f43321i;
        this.f43317e = this.f43316d;
        if (!Float.isNaN(c32641Ek2.f8003m)) {
            f6 = c32641Ek2.f8003m;
        }
        float f9 = xv2.f43318f;
        float f10 = xv2.f43320h;
        float f11 = xv2.f43319g;
        float f12 = xv2.f43321i;
        float f13 = (xv22.f43318f + (xv22.f43320h / 2.0f)) - ((f10 / 2.0f) + f9);
        float f14 = (xv22.f43319g + (xv22.f43321i / 2.0f)) - ((f12 / 2.0f) + f11);
        float f15 = f13 * f6;
        float f16 = (f7 * f) / 2.0f;
        this.f43318f = (int) ((f9 + f15) - f16);
        float f17 = f6 * f14;
        float f18 = (f8 * f2) / 2.0f;
        this.f43319g = (int) ((f11 + f17) - f18);
        this.f43320h = (int) (f10 + f3);
        this.f43321i = (int) (f12 + f4);
        if (Float.isNaN(c32641Ek2.f8004n)) {
            f5 = 0.0f;
        } else {
            f5 = c32641Ek2.f8004n;
        }
        this.f43329q = 1;
        float f19 = (int) ((xv2.f43318f + f15) - f16);
        float f20 = (int) ((xv2.f43319g + f17) - f18);
        this.f43318f = f19 + ((-f14) * f5);
        this.f43319g = f20 + (f13 * f5);
        this.f43325m = this.f43325m;
        this.f43314b = C41363g91.m39970c(c32641Ek2.f7998h);
        this.f43324l = c32641Ek2.f7999i;
    }

    /* renamed from: n */
    public void m76926n(int i, int i2, C32641Ek2 c32641Ek2, XV2 xv2, XV2 xv22) {
        float f;
        float f2;
        float f3;
        float min;
        float f4;
        float f5;
        float f6 = c32641Ek2.f43730a / 100.0f;
        this.f43316d = f6;
        this.f43315c = c32641Ek2.f8000j;
        this.f43329q = c32641Ek2.f8007q;
        if (Float.isNaN(c32641Ek2.f8001k)) {
            f = f6;
        } else {
            f = c32641Ek2.f8001k;
        }
        if (Float.isNaN(c32641Ek2.f8002l)) {
            f2 = f6;
        } else {
            f2 = c32641Ek2.f8002l;
        }
        float f7 = xv22.f43320h;
        float f8 = xv2.f43320h;
        float f9 = xv22.f43321i;
        float f10 = xv2.f43321i;
        this.f43317e = this.f43316d;
        this.f43320h = (int) (f8 + ((f7 - f8) * f));
        this.f43321i = (int) (f10 + ((f9 - f10) * f2));
        int i3 = c32641Ek2.f8007q;
        if (i3 != 1) {
            if (i3 != 2) {
                if (Float.isNaN(c32641Ek2.f8003m)) {
                    f5 = f6;
                } else {
                    f5 = c32641Ek2.f8003m;
                }
                float f11 = xv22.f43318f;
                float f12 = xv2.f43318f;
                this.f43318f = (f5 * (f11 - f12)) + f12;
                if (!Float.isNaN(c32641Ek2.f8004n)) {
                    f6 = c32641Ek2.f8004n;
                }
                float f13 = xv22.f43319g;
                float f14 = xv2.f43319g;
                this.f43319g = (f6 * (f13 - f14)) + f14;
            } else {
                if (Float.isNaN(c32641Ek2.f8003m)) {
                    float f15 = xv22.f43318f;
                    float f16 = xv2.f43318f;
                    min = ((f15 - f16) * f6) + f16;
                } else {
                    min = Math.min(f2, f) * c32641Ek2.f8003m;
                }
                this.f43318f = min;
                if (Float.isNaN(c32641Ek2.f8004n)) {
                    float f17 = xv22.f43319g;
                    float f18 = xv2.f43319g;
                    f4 = (f6 * (f17 - f18)) + f18;
                } else {
                    f4 = c32641Ek2.f8004n;
                }
                this.f43319g = f4;
            }
        } else {
            if (Float.isNaN(c32641Ek2.f8003m)) {
                f3 = f6;
            } else {
                f3 = c32641Ek2.f8003m;
            }
            float f19 = xv22.f43318f;
            float f20 = xv2.f43318f;
            this.f43318f = (f3 * (f19 - f20)) + f20;
            if (!Float.isNaN(c32641Ek2.f8004n)) {
                f6 = c32641Ek2.f8004n;
            }
            float f21 = xv22.f43319g;
            float f22 = xv2.f43319g;
            this.f43319g = (f6 * (f21 - f22)) + f22;
        }
        this.f43325m = xv2.f43325m;
        this.f43314b = C41363g91.m39970c(c32641Ek2.f7998h);
        this.f43324l = c32641Ek2.f7999i;
    }

    /* renamed from: o */
    public void m76925o(int i, int i2, C32641Ek2 c32641Ek2, XV2 xv2, XV2 xv22) {
        float f;
        float f2;
        float f3 = c32641Ek2.f43730a / 100.0f;
        this.f43316d = f3;
        this.f43315c = c32641Ek2.f8000j;
        if (Float.isNaN(c32641Ek2.f8001k)) {
            f = f3;
        } else {
            f = c32641Ek2.f8001k;
        }
        if (Float.isNaN(c32641Ek2.f8002l)) {
            f2 = f3;
        } else {
            f2 = c32641Ek2.f8002l;
        }
        float f4 = xv22.f43320h;
        float f5 = xv2.f43320h;
        float f6 = xv22.f43321i;
        float f7 = xv2.f43321i;
        this.f43317e = this.f43316d;
        float f8 = xv2.f43318f;
        float f9 = xv2.f43319g;
        float f10 = xv22.f43318f + (f4 / 2.0f);
        float f11 = xv22.f43319g + (f6 / 2.0f);
        float f12 = (f4 - f5) * f;
        this.f43318f = (int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f3)) - (f12 / 2.0f));
        float f13 = (f6 - f7) * f2;
        this.f43319g = (int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f3)) - (f13 / 2.0f));
        this.f43320h = (int) (f5 + f12);
        this.f43321i = (int) (f7 + f13);
        this.f43329q = 2;
        if (!Float.isNaN(c32641Ek2.f8003m)) {
            this.f43318f = (int) (c32641Ek2.f8003m * ((int) (i - this.f43320h)));
        }
        if (!Float.isNaN(c32641Ek2.f8004n)) {
            this.f43319g = (int) (c32641Ek2.f8004n * ((int) (i2 - this.f43321i)));
        }
        this.f43325m = this.f43325m;
        this.f43314b = C41363g91.m39970c(c32641Ek2.f7998h);
        this.f43324l = c32641Ek2.f7999i;
    }

    /* renamed from: p */
    public void m76924p(float f, float f2, float f3, float f4) {
        this.f43318f = f;
        this.f43319g = f2;
        this.f43320h = f3;
        this.f43321i = f4;
    }

    /* renamed from: q */
    public void m76923q(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            f6 = f7;
                        }
                    } else {
                        f4 = f7;
                    }
                } else {
                    f5 = f7;
                }
            } else {
                f3 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    /* renamed from: r */
    public void m76922r(float f, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f2;
        boolean z2;
        boolean z3;
        float f3;
        float f4 = this.f43318f;
        float f5 = this.f43319g;
        float f6 = this.f43320h;
        float f7 = this.f43321i;
        if (iArr.length != 0 && this.f43331s.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.f43331s = new double[i];
            this.f43332t = new double[i];
        }
        Arrays.fill(this.f43331s, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            double[] dArr4 = this.f43331s;
            int i3 = iArr[i2];
            dArr4[i3] = dArr[i2];
            this.f43332t[i3] = dArr2[i2];
        }
        float f8 = Float.NaN;
        int i4 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr5 = this.f43331s;
            if (i4 >= dArr5.length) {
                break;
            }
            double d = 0.0d;
            if (Double.isNaN(dArr5[i4]) && (dArr3 == null || dArr3[i4] == 0.0d)) {
                f3 = f8;
            } else {
                if (dArr3 != null) {
                    d = dArr3[i4];
                }
                if (!Double.isNaN(this.f43331s[i4])) {
                    d = this.f43331s[i4] + d;
                }
                f3 = f8;
                float f13 = (float) d;
                float f14 = (float) this.f43332t[i4];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                if (i4 == 5) {
                                    f8 = f13;
                                }
                            } else {
                                f8 = f3;
                                f12 = f14;
                                f7 = f13;
                            }
                        } else {
                            f8 = f3;
                            f11 = f14;
                            f6 = f13;
                        }
                    } else {
                        f8 = f3;
                        f10 = f14;
                        f5 = f13;
                    }
                } else {
                    f8 = f3;
                    f9 = f14;
                    f4 = f13;
                }
                i4++;
            }
            f8 = f3;
            i4++;
        }
        float f15 = f8;
        OV2 ov2 = this.f43327o;
        if (ov2 != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            ov2.m92148i(f, fArr, fArr2);
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr2[0];
            float f19 = fArr2[1];
            double d2 = f4;
            double d3 = f5;
            float sin = (float) ((f16 + (Math.sin(d3) * d2)) - (f6 / 2.0f));
            f2 = f7;
            float cos = (float) ((f17 - (Math.cos(d3) * d2)) - (f7 / 2.0f));
            double d4 = f9;
            double d5 = f10;
            float sin2 = (float) (f18 + (Math.sin(d3) * d4) + (Math.cos(d3) * d2 * d5));
            float cos2 = (float) ((f19 - (d4 * Math.cos(d3))) + (d2 * Math.sin(d3) * d5));
            if (dArr2.length >= 2) {
                z2 = false;
                dArr2[0] = sin2;
                z3 = true;
                dArr2[1] = cos2;
            } else {
                z2 = false;
                z3 = true;
            }
            if (!Float.isNaN(f15)) {
                view.setRotation((float) (f15 + Math.toDegrees(Math.atan2(cos2, sin2))));
            }
            f4 = sin;
            f5 = cos;
        } else {
            f2 = f7;
            z2 = false;
            z3 = true;
            if (!Float.isNaN(f15)) {
                view.setRotation((float) (0.0f + f15 + Math.toDegrees(Math.atan2(f10 + (f12 / 2.0f), f9 + (f11 / 2.0f)))));
            }
        }
        if (view instanceof InterfaceC47144pu1) {
            ((InterfaceC47144pu1) view).mo18445a(f4, f5, f6 + f4, f5 + f2);
            return;
        }
        float f20 = f4 + 0.5f;
        int i5 = (int) f20;
        float f21 = f5 + 0.5f;
        int i6 = (int) f21;
        int i7 = (int) (f20 + f6);
        int i8 = (int) (f21 + f2);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (i9 != view.getMeasuredWidth() || i10 != view.getMeasuredHeight()) {
            z2 = z3;
        }
        if (z2 || z) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view.layout(i5, i6, i7, i8);
    }

    /* renamed from: s */
    public void m76921s(OV2 ov2, XV2 xv2) {
        double d = ((this.f43318f + (this.f43320h / 2.0f)) - xv2.f43318f) - (xv2.f43320h / 2.0f);
        double d2 = ((this.f43319g + (this.f43321i / 2.0f)) - xv2.f43319g) - (xv2.f43321i / 2.0f);
        this.f43327o = ov2;
        this.f43318f = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f43326n)) {
            this.f43319g = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f43319g = (float) Math.toRadians(this.f43326n);
        }
    }

    public XV2(int i, int i2, C32641Ek2 c32641Ek2, XV2 xv2, XV2 xv22) {
        int i3 = AbstractC37078Xj2.f43729f;
        this.f43324l = i3;
        this.f43325m = i3;
        this.f43326n = Float.NaN;
        this.f43327o = null;
        this.f43328p = new LinkedHashMap<>();
        this.f43329q = 0;
        this.f43331s = new double[18];
        this.f43332t = new double[18];
        if (xv2.f43325m != AbstractC37078Xj2.f43729f) {
            m76926n(i, i2, c32641Ek2, xv2, xv22);
            return;
        }
        int i4 = c32641Ek2.f8007q;
        if (i4 == 1) {
            m76927m(c32641Ek2, xv2, xv22);
        } else if (i4 != 2) {
            m76928l(c32641Ek2, xv2, xv22);
        } else {
            m76925o(i, i2, c32641Ek2, xv2, xv22);
        }
    }
}
