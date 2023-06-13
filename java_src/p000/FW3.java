package p000;
/* renamed from: FW3 */
/* loaded from: classes8.dex */
public class FW3 extends WB1 {
    private static final long serialVersionUID = 4902022702746614570L;

    /* renamed from: g */
    public EB0 f9538g;

    public FW3(EB0 eb0, C38409bC1 c38409bC1) {
        super(c38409bC1);
        m107065P0(eb0);
    }

    @Override // p000.WB1
    /* renamed from: F */
    public int mo77244F() {
        return 0;
    }

    @Override // p000.WB1
    /* renamed from: K0 */
    public FW3 mo77227n() {
        return new FW3(this.f9538g.copy(), this.f40528c);
    }

    /* renamed from: L0 */
    public EB0 m107068L0() {
        return this.f9538g;
    }

    /* renamed from: M0 */
    public double m107067M0() {
        if (mo77239W() != null) {
            return mo77239W().f118922b;
        }
        throw new IllegalStateException("getX called on empty Point");
    }

    @Override // p000.WB1
    /* renamed from: N */
    public WB1 mo77241N() {
        return m78758c0().m64852c();
    }

    /* renamed from: O0 */
    public double m107066O0() {
        if (mo77239W() != null) {
            return mo77239W().f118923c;
        }
        throw new IllegalStateException("getY called on empty Point");
    }

    @Override // p000.WB1
    /* renamed from: P */
    public int mo77240P() {
        return -1;
    }

    /* renamed from: P0 */
    public final void m107065P0(EB0 eb0) {
        boolean z = false;
        if (eb0 == null) {
            eb0 = m78758c0().m64829z().mo107445c(new C52053yB0[0]);
        }
        if (eb0.size() <= 1) {
            z = true;
        }
        C4596Ko.m98282c(z);
        this.f9538g = eb0;
    }

    @Override // p000.WB1
    /* renamed from: W */
    public C52053yB0 mo77239W() {
        if (this.f9538g.size() != 0) {
            return this.f9538g.mo1707u(0);
        }
        return null;
    }

    @Override // p000.WB1
    /* renamed from: Y */
    public C52053yB0[] mo77238Y() {
        return mo77226r0() ? new C52053yB0[0] : new C52053yB0[]{mo77239W()};
    }

    @Override // p000.WB1
    public Object clone() {
        return m78752m();
    }

    @Override // p000.WB1
    /* renamed from: d */
    public void mo77237d(CB0 cb0) {
        if (mo77226r0()) {
            return;
        }
        cb0.mo16956a(mo77239W());
    }

    @Override // p000.WB1
    /* renamed from: e */
    public void mo77235e(GB0 gb0) {
        if (mo77226r0()) {
            return;
        }
        gb0.mo16954d(this.f9538g, 0);
        if (gb0.mo16953e()) {
            m78765H();
        }
    }

    @Override // p000.WB1
    /* renamed from: f */
    public void mo77233f(ZB1 zb1) {
        zb1.mo73636a(this);
    }

    @Override // p000.WB1
    /* renamed from: g0 */
    public int mo77231g0() {
        return !mo77226r0();
    }

    @Override // p000.WB1
    /* renamed from: j */
    public int mo77230j(Object obj) {
        return mo77239W().compareTo(((FW3) obj).mo77239W());
    }

    @Override // p000.WB1
    /* renamed from: k */
    public C48772sf1 mo77229k() {
        if (mo77226r0()) {
            return new C48772sf1();
        }
        C48772sf1 c48772sf1 = new C48772sf1();
        c48772sf1.m13875j(this.f9538g.mo1708n2(0), this.f9538g.mo1716N0(0));
        return c48772sf1;
    }

    @Override // p000.WB1
    /* renamed from: k0 */
    public int mo77228k0() {
        return 0;
    }

    @Override // p000.WB1
    /* renamed from: r0 */
    public boolean mo77226r0() {
        return this.f9538g.size() == 0;
    }

    @Override // p000.WB1
    /* renamed from: w */
    public boolean mo77225w(WB1 wb1, double d) {
        if (!mo78745s0(wb1)) {
            return false;
        }
        if (mo77226r0() && wb1.mo77226r0()) {
            return true;
        }
        if (mo77226r0() != wb1.mo77226r0()) {
            return false;
        }
        return m78746r(((FW3) wb1).mo77239W(), mo77239W(), d);
    }
}
