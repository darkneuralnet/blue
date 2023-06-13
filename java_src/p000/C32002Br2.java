package p000;
/* renamed from: Br2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C32002Br2 extends WB1 {
    private static final long serialVersionUID = 3110669828065365560L;

    /* renamed from: g */
    public EB0 f2966g;

    public C32002Br2(EB0 eb0, C38409bC1 c38409bC1) {
        super(c38409bC1);
        m113436S0(eb0);
    }

    @Override // p000.WB1
    /* renamed from: F */
    public int mo77244F() {
        return 1;
    }

    @Override // p000.WB1
    /* renamed from: K0 */
    public C32002Br2 mo77227n() {
        return new C32002Br2(this.f2966g.copy(), this.f40528c);
    }

    /* renamed from: L0 */
    public C52053yB0 m113441L0(int i) {
        return this.f2966g.mo1707u(i);
    }

    /* renamed from: M0 */
    public EB0 m113440M0() {
        return this.f2966g;
    }

    @Override // p000.WB1
    /* renamed from: N */
    public WB1 mo77241N() {
        return new C50166v00(this).m9400e();
    }

    /* renamed from: O0 */
    public FW3 m113439O0() {
        if (mo77226r0()) {
            return null;
        }
        return m113438P0(mo77231g0() - 1);
    }

    @Override // p000.WB1
    /* renamed from: P */
    public int mo77240P() {
        return mo98233T0() ? -1 : 0;
    }

    /* renamed from: P0 */
    public FW3 m113438P0(int i) {
        return m78758c0().m64835t(this.f2966g.mo1707u(i));
    }

    /* renamed from: R0 */
    public FW3 m113437R0() {
        if (mo77226r0()) {
            return null;
        }
        return m113438P0(0);
    }

    /* renamed from: S0 */
    public final void m113436S0(EB0 eb0) {
        if (eb0 == null) {
            eb0 = m78758c0().m64829z().mo107445c(new C52053yB0[0]);
        }
        if (eb0.size() > 0 && eb0.size() < 2) {
            throw new IllegalArgumentException("Invalid number of points in LineString (found " + eb0.size() + " - must be 0 or >= 2)");
        }
        this.f2966g = eb0;
    }

    /* renamed from: T0 */
    public boolean mo98233T0() {
        if (mo77226r0()) {
            return false;
        }
        return m113441L0(0).m3886g(m113441L0(mo77231g0() - 1));
    }

    @Override // p000.WB1
    /* renamed from: W */
    public C52053yB0 mo77239W() {
        if (mo77226r0()) {
            return null;
        }
        return this.f2966g.mo1707u(0);
    }

    @Override // p000.WB1
    /* renamed from: Y */
    public C52053yB0[] mo77238Y() {
        return this.f2966g.mo1712b2();
    }

    @Override // p000.WB1
    public Object clone() {
        return m78752m();
    }

    @Override // p000.WB1
    /* renamed from: d */
    public void mo77237d(CB0 cb0) {
        for (int i = 0; i < this.f2966g.size(); i++) {
            cb0.mo16956a(this.f2966g.mo1707u(i));
        }
    }

    @Override // p000.WB1
    /* renamed from: e */
    public void mo77235e(GB0 gb0) {
        if (this.f2966g.size() == 0) {
            return;
        }
        for (int i = 0; i < this.f2966g.size(); i++) {
            gb0.mo16954d(this.f2966g, i);
            if (gb0.isDone()) {
                break;
            }
        }
        if (gb0.mo16953e()) {
            m78765H();
        }
    }

    @Override // p000.WB1
    /* renamed from: e0 */
    public double mo77234e0() {
        return C42954iq2.m31763a(this.f2966g);
    }

    @Override // p000.WB1
    /* renamed from: f */
    public void mo77233f(ZB1 zb1) {
        zb1.mo73636a(this);
    }

    @Override // p000.WB1
    /* renamed from: g0 */
    public int mo77231g0() {
        return this.f2966g.size();
    }

    @Override // p000.WB1
    /* renamed from: j */
    public int mo77230j(Object obj) {
        C32002Br2 c32002Br2 = (C32002Br2) obj;
        int i = 0;
        int i2 = 0;
        while (i < this.f2966g.size() && i2 < c32002Br2.f2966g.size()) {
            int compareTo = this.f2966g.mo1707u(i).compareTo(c32002Br2.f2966g.mo1707u(i2));
            if (compareTo != 0) {
                return compareTo;
            }
            i++;
            i2++;
        }
        if (i < this.f2966g.size()) {
            return 1;
        }
        if (i2 >= c32002Br2.f2966g.size()) {
            return 0;
        }
        return -1;
    }

    @Override // p000.WB1
    /* renamed from: k */
    public C48772sf1 mo77229k() {
        if (mo77226r0()) {
            return new C48772sf1();
        }
        return this.f2966g.mo1709m0(new C48772sf1());
    }

    @Override // p000.WB1
    /* renamed from: k0 */
    public int mo77228k0() {
        return 2;
    }

    @Override // p000.WB1
    /* renamed from: r0 */
    public boolean mo77226r0() {
        return this.f2966g.size() == 0;
    }

    @Override // p000.WB1
    /* renamed from: s0 */
    public boolean mo78745s0(WB1 wb1) {
        return wb1 instanceof C32002Br2;
    }

    @Override // p000.WB1
    /* renamed from: w */
    public boolean mo77225w(WB1 wb1, double d) {
        if (!mo78745s0(wb1)) {
            return false;
        }
        C32002Br2 c32002Br2 = (C32002Br2) wb1;
        if (this.f2966g.size() != c32002Br2.f2966g.size()) {
            return false;
        }
        for (int i = 0; i < this.f2966g.size(); i++) {
            if (!m78746r(this.f2966g.mo1707u(i), c32002Br2.f2966g.mo1707u(i), d)) {
                return false;
            }
        }
        return true;
    }
}
