package p000;

import java.util.Arrays;
import java.util.TreeSet;
/* renamed from: XB1 */
/* loaded from: classes8.dex */
public class XB1 extends WB1 {
    private static final long serialVersionUID = -5694727726395021467L;

    /* renamed from: g */
    public WB1[] f42769g;

    public XB1(WB1[] wb1Arr, C38409bC1 c38409bC1) {
        super(c38409bC1);
        wb1Arr = wb1Arr == null ? new WB1[0] : wb1Arr;
        if (!WB1.m78750o0(wb1Arr)) {
            this.f42769g = wb1Arr;
            return;
        }
        throw new IllegalArgumentException("geometries must not contain null elements");
    }

    @Override // p000.WB1
    /* renamed from: F */
    public int mo77244F() {
        int i = -1;
        int i2 = 0;
        while (true) {
            WB1[] wb1Arr = this.f42769g;
            if (i2 < wb1Arr.length) {
                i = Math.max(i, wb1Arr[i2].mo77244F());
                i2++;
            } else {
                return i;
            }
        }
    }

    @Override // p000.WB1
    /* renamed from: K0 */
    public XB1 mo77227n() {
        int length = this.f42769g.length;
        WB1[] wb1Arr = new WB1[length];
        for (int i = 0; i < length; i++) {
            wb1Arr[i] = this.f42769g[i].m78752m();
        }
        return new XB1(wb1Arr, this.f40528c);
    }

    @Override // p000.WB1
    /* renamed from: M */
    public double mo77242M() {
        double d = 0.0d;
        int i = 0;
        while (true) {
            WB1[] wb1Arr = this.f42769g;
            if (i < wb1Arr.length) {
                d += wb1Arr[i].mo77242M();
                i++;
            } else {
                return d;
            }
        }
    }

    @Override // p000.WB1
    /* renamed from: N */
    public WB1 mo77241N() {
        WB1.m78757g(this);
        C4596Ko.m98280e();
        return null;
    }

    @Override // p000.WB1
    /* renamed from: P */
    public int mo77240P() {
        int i = -1;
        int i2 = 0;
        while (true) {
            WB1[] wb1Arr = this.f42769g;
            if (i2 < wb1Arr.length) {
                i = Math.max(i, wb1Arr[i2].mo77240P());
                i2++;
            } else {
                return i;
            }
        }
    }

    @Override // p000.WB1
    /* renamed from: W */
    public C52053yB0 mo77239W() {
        if (mo77226r0()) {
            return null;
        }
        return this.f42769g[0].mo77239W();
    }

    @Override // p000.WB1
    /* renamed from: Y */
    public C52053yB0[] mo77238Y() {
        C52053yB0[] c52053yB0Arr = new C52053yB0[mo77231g0()];
        int i = -1;
        int i2 = 0;
        while (true) {
            WB1[] wb1Arr = this.f42769g;
            if (i2 < wb1Arr.length) {
                for (C52053yB0 c52053yB0 : wb1Arr[i2].mo77238Y()) {
                    i++;
                    c52053yB0Arr[i] = c52053yB0;
                }
                i2++;
            } else {
                return c52053yB0Arr;
            }
        }
    }

    @Override // p000.WB1
    public Object clone() {
        return m78752m();
    }

    @Override // p000.WB1
    /* renamed from: d */
    public void mo77237d(CB0 cb0) {
        int i = 0;
        while (true) {
            WB1[] wb1Arr = this.f42769g;
            if (i < wb1Arr.length) {
                wb1Arr[i].mo77237d(cb0);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // p000.WB1
    /* renamed from: d0 */
    public WB1 mo77236d0(int i) {
        return this.f42769g[i];
    }

    @Override // p000.WB1
    /* renamed from: e */
    public void mo77235e(GB0 gb0) {
        if (this.f42769g.length == 0) {
            return;
        }
        int i = 0;
        while (true) {
            WB1[] wb1Arr = this.f42769g;
            if (i >= wb1Arr.length) {
                break;
            }
            wb1Arr[i].mo77235e(gb0);
            if (gb0.isDone()) {
                break;
            }
            i++;
        }
        if (gb0.mo16953e()) {
            m78765H();
        }
    }

    @Override // p000.WB1
    /* renamed from: e0 */
    public double mo77234e0() {
        double d = 0.0d;
        int i = 0;
        while (true) {
            WB1[] wb1Arr = this.f42769g;
            if (i < wb1Arr.length) {
                d += wb1Arr[i].mo77234e0();
                i++;
            } else {
                return d;
            }
        }
    }

    @Override // p000.WB1
    /* renamed from: f */
    public void mo77233f(ZB1 zb1) {
        zb1.mo73636a(this);
        int i = 0;
        while (true) {
            WB1[] wb1Arr = this.f42769g;
            if (i < wb1Arr.length) {
                wb1Arr[i].mo77233f(zb1);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // p000.WB1
    /* renamed from: f0 */
    public int mo77232f0() {
        return this.f42769g.length;
    }

    @Override // p000.WB1
    /* renamed from: g0 */
    public int mo77231g0() {
        int i = 0;
        int i2 = 0;
        while (true) {
            WB1[] wb1Arr = this.f42769g;
            if (i < wb1Arr.length) {
                i2 += wb1Arr[i].mo77231g0();
                i++;
            } else {
                return i2;
            }
        }
    }

    @Override // p000.WB1
    /* renamed from: j */
    public int mo77230j(Object obj) {
        return m78756h(new TreeSet(Arrays.asList(this.f42769g)), new TreeSet(Arrays.asList(((XB1) obj).f42769g)));
    }

    @Override // p000.WB1
    /* renamed from: k */
    public C48772sf1 mo77229k() {
        C48772sf1 c48772sf1 = new C48772sf1();
        int i = 0;
        while (true) {
            WB1[] wb1Arr = this.f42769g;
            if (i < wb1Arr.length) {
                c48772sf1.m13873l(wb1Arr[i].m78759Z());
                i++;
            } else {
                return c48772sf1;
            }
        }
    }

    @Override // p000.WB1
    /* renamed from: k0 */
    public int mo77228k0() {
        return 7;
    }

    @Override // p000.WB1
    /* renamed from: r0 */
    public boolean mo77226r0() {
        int i = 0;
        while (true) {
            WB1[] wb1Arr = this.f42769g;
            if (i < wb1Arr.length) {
                if (!wb1Arr[i].mo77226r0()) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    @Override // p000.WB1
    /* renamed from: w */
    public boolean mo77225w(WB1 wb1, double d) {
        if (!mo78745s0(wb1)) {
            return false;
        }
        XB1 xb1 = (XB1) wb1;
        if (this.f42769g.length != xb1.f42769g.length) {
            return false;
        }
        int i = 0;
        while (true) {
            WB1[] wb1Arr = this.f42769g;
            if (i < wb1Arr.length) {
                if (!wb1Arr[i].mo77225w(xb1.f42769g[i], d)) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }
}
