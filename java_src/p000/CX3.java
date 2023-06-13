package p000;
/* renamed from: CX3 */
/* loaded from: classes8.dex */
public class CX3 extends WB1 implements LX3 {
    private static final long serialVersionUID = -3494792200821764533L;

    /* renamed from: g */
    public C34108Kr2 f4194g;

    /* renamed from: h */
    public C34108Kr2[] f4195h;

    public CX3(C34108Kr2 c34108Kr2, C34108Kr2[] c34108Kr2Arr, C38409bC1 c38409bC1) {
        super(c38409bC1);
        this.f4194g = null;
        c34108Kr2 = c34108Kr2 == null ? m78758c0().m64847h() : c34108Kr2;
        c34108Kr2Arr = c34108Kr2Arr == null ? new C34108Kr2[0] : c34108Kr2Arr;
        if (!WB1.m78750o0(c34108Kr2Arr)) {
            if (c34108Kr2.mo77226r0() && WB1.m78753l0(c34108Kr2Arr)) {
                throw new IllegalArgumentException("shell is empty but holes are not");
            }
            this.f4194g = c34108Kr2;
            this.f4195h = c34108Kr2Arr;
            return;
        }
        throw new IllegalArgumentException("holes must not contain null elements");
    }

    @Override // p000.WB1
    /* renamed from: F */
    public int mo77244F() {
        return 2;
    }

    @Override // p000.WB1
    /* renamed from: K0 */
    public CX3 mo77227n() {
        C34108Kr2 c34108Kr2 = (C34108Kr2) this.f4194g.m78752m();
        C34108Kr2[] c34108Kr2Arr = new C34108Kr2[this.f4195h.length];
        int i = 0;
        while (true) {
            C34108Kr2[] c34108Kr2Arr2 = this.f4195h;
            if (i < c34108Kr2Arr2.length) {
                c34108Kr2Arr[i] = (C34108Kr2) c34108Kr2Arr2[i].m78752m();
                i++;
            } else {
                return new CX3(c34108Kr2, c34108Kr2Arr, this.f40528c);
            }
        }
    }

    /* renamed from: L0 */
    public C34108Kr2 m112157L0() {
        return this.f4194g;
    }

    @Override // p000.WB1
    /* renamed from: M */
    public double mo77242M() {
        double m103442a = C3228Hm.m103442a(this.f4194g.m113440M0()) + 0.0d;
        int i = 0;
        while (true) {
            C34108Kr2[] c34108Kr2Arr = this.f4195h;
            if (i < c34108Kr2Arr.length) {
                m103442a -= C3228Hm.m103442a(c34108Kr2Arr[i].m113440M0());
                i++;
            } else {
                return m103442a;
            }
        }
    }

    /* renamed from: M0 */
    public C34108Kr2 m112156M0(int i) {
        return this.f4195h[i];
    }

    @Override // p000.WB1
    /* renamed from: N */
    public WB1 mo77241N() {
        if (mo77226r0()) {
            return m78758c0().m64844k();
        }
        int length = this.f4195h.length + 1;
        C34108Kr2[] c34108Kr2Arr = new C34108Kr2[length];
        c34108Kr2Arr[0] = this.f4194g;
        int i = 0;
        while (true) {
            C34108Kr2[] c34108Kr2Arr2 = this.f4195h;
            if (i >= c34108Kr2Arr2.length) {
                break;
            }
            int i2 = i + 1;
            c34108Kr2Arr[i2] = c34108Kr2Arr2[i];
            i = i2;
        }
        if (length <= 1) {
            return m78758c0().m64846i(c34108Kr2Arr[0].m113440M0());
        }
        return m78758c0().m64843l(c34108Kr2Arr);
    }

    /* renamed from: O0 */
    public int m112155O0() {
        return this.f4195h.length;
    }

    @Override // p000.WB1
    /* renamed from: P */
    public int mo77240P() {
        return 1;
    }

    @Override // p000.WB1
    /* renamed from: W */
    public C52053yB0 mo77239W() {
        return this.f4194g.mo77239W();
    }

    @Override // p000.WB1
    /* renamed from: Y */
    public C52053yB0[] mo77238Y() {
        if (mo77226r0()) {
            return new C52053yB0[0];
        }
        C52053yB0[] c52053yB0Arr = new C52053yB0[mo77231g0()];
        int i = -1;
        for (C52053yB0 c52053yB0 : this.f4194g.mo77238Y()) {
            i++;
            c52053yB0Arr[i] = c52053yB0;
        }
        int i2 = 0;
        while (true) {
            C34108Kr2[] c34108Kr2Arr = this.f4195h;
            if (i2 < c34108Kr2Arr.length) {
                for (C52053yB0 c52053yB02 : c34108Kr2Arr[i2].mo77238Y()) {
                    i++;
                    c52053yB0Arr[i] = c52053yB02;
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
        this.f4194g.mo77237d(cb0);
        int i = 0;
        while (true) {
            C34108Kr2[] c34108Kr2Arr = this.f4195h;
            if (i < c34108Kr2Arr.length) {
                c34108Kr2Arr[i].mo77237d(cb0);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // p000.WB1
    /* renamed from: e */
    public void mo77235e(GB0 gb0) {
        this.f4194g.mo77235e(gb0);
        if (!gb0.isDone()) {
            int i = 0;
            while (true) {
                C34108Kr2[] c34108Kr2Arr = this.f4195h;
                if (i >= c34108Kr2Arr.length) {
                    break;
                }
                c34108Kr2Arr[i].mo77235e(gb0);
                if (gb0.isDone()) {
                    break;
                }
                i++;
            }
        }
        if (gb0.mo16953e()) {
            m78765H();
        }
    }

    @Override // p000.WB1
    /* renamed from: e0 */
    public double mo77234e0() {
        double mo77234e0 = this.f4194g.mo77234e0() + 0.0d;
        int i = 0;
        while (true) {
            C34108Kr2[] c34108Kr2Arr = this.f4195h;
            if (i < c34108Kr2Arr.length) {
                mo77234e0 += c34108Kr2Arr[i].mo77234e0();
                i++;
            } else {
                return mo77234e0;
            }
        }
    }

    @Override // p000.WB1
    /* renamed from: f */
    public void mo77233f(ZB1 zb1) {
        zb1.mo73636a(this);
        this.f4194g.mo77233f(zb1);
        int i = 0;
        while (true) {
            C34108Kr2[] c34108Kr2Arr = this.f4195h;
            if (i < c34108Kr2Arr.length) {
                c34108Kr2Arr[i].mo77233f(zb1);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // p000.WB1
    /* renamed from: g0 */
    public int mo77231g0() {
        int mo77231g0 = this.f4194g.mo77231g0();
        int i = 0;
        while (true) {
            C34108Kr2[] c34108Kr2Arr = this.f4195h;
            if (i < c34108Kr2Arr.length) {
                mo77231g0 += c34108Kr2Arr[i].mo77231g0();
                i++;
            } else {
                return mo77231g0;
            }
        }
    }

    @Override // p000.WB1
    /* renamed from: j */
    public int mo77230j(Object obj) {
        CX3 cx3 = (CX3) obj;
        int mo77230j = this.f4194g.mo77230j(cx3.f4194g);
        if (mo77230j != 0) {
            return mo77230j;
        }
        int m112155O0 = m112155O0();
        int m112155O02 = cx3.m112155O0();
        int i = 0;
        while (i < m112155O0 && i < m112155O02) {
            int mo77230j2 = m112156M0(i).mo77230j(cx3.m112156M0(i));
            if (mo77230j2 != 0) {
                return mo77230j2;
            }
            i++;
        }
        if (i < m112155O0) {
            return 1;
        }
        if (i >= m112155O02) {
            return 0;
        }
        return -1;
    }

    @Override // p000.WB1
    /* renamed from: k */
    public C48772sf1 mo77229k() {
        return this.f4194g.m78759Z();
    }

    @Override // p000.WB1
    /* renamed from: k0 */
    public int mo77228k0() {
        return 5;
    }

    @Override // p000.WB1
    /* renamed from: r0 */
    public boolean mo77226r0() {
        return this.f4194g.mo77226r0();
    }

    @Override // p000.WB1
    /* renamed from: w */
    public boolean mo77225w(WB1 wb1, double d) {
        if (!mo78745s0(wb1)) {
            return false;
        }
        CX3 cx3 = (CX3) wb1;
        if (!this.f4194g.mo77225w(cx3.f4194g, d) || this.f4195h.length != cx3.f4195h.length) {
            return false;
        }
        int i = 0;
        while (true) {
            C34108Kr2[] c34108Kr2Arr = this.f4195h;
            if (i < c34108Kr2Arr.length) {
                if (!c34108Kr2Arr[i].mo77225w(cx3.f4195h[i], d)) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    @Override // p000.WB1
    /* renamed from: x0 */
    public boolean mo78742x0() {
        C34108Kr2 c34108Kr2;
        boolean z;
        boolean z2;
        if (m112155O0() != 0 || (c34108Kr2 = this.f4194g) == null || c34108Kr2.mo77231g0() != 5) {
            return false;
        }
        EB0 m113440M0 = this.f4194g.m113440M0();
        C48772sf1 m78759Z = m78759Z();
        for (int i = 0; i < 5; i++) {
            double mo1708n2 = m113440M0.mo1708n2(i);
            if (mo1708n2 != m78759Z.m13869p() && mo1708n2 != m78759Z.m13871n()) {
                return false;
            }
            double mo1716N0 = m113440M0.mo1716N0(i);
            if (mo1716N0 != m78759Z.m13868q() && mo1716N0 != m78759Z.m13870o()) {
                return false;
            }
        }
        double mo1708n22 = m113440M0.mo1708n2(0);
        double mo1716N02 = m113440M0.mo1716N0(0);
        int i2 = 1;
        while (i2 <= 4) {
            double mo1708n23 = m113440M0.mo1708n2(i2);
            double mo1716N03 = m113440M0.mo1716N0(i2);
            if (mo1708n23 != mo1708n22) {
                z = true;
            } else {
                z = false;
            }
            if (mo1716N03 != mo1716N02) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2) {
                return false;
            }
            i2++;
            mo1708n22 = mo1708n23;
            mo1716N02 = mo1716N03;
        }
        return true;
    }
}
