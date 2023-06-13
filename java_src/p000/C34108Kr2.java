package p000;
/* renamed from: Kr2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C34108Kr2 extends C32002Br2 {
    private static final long serialVersionUID = -4261142084085851829L;

    public C34108Kr2(EB0 eb0, C38409bC1 c38409bC1) {
        super(eb0, c38409bC1);
        m98231V0();
    }

    @Override // p000.C32002Br2, p000.WB1
    /* renamed from: P */
    public int mo77240P() {
        return -1;
    }

    @Override // p000.C32002Br2
    /* renamed from: T0 */
    public boolean mo98233T0() {
        if (mo77226r0()) {
            return true;
        }
        return super.mo98233T0();
    }

    @Override // p000.C32002Br2, p000.WB1
    /* renamed from: U0 */
    public C34108Kr2 mo77227n() {
        return new C34108Kr2(this.f2966g.copy(), this.f40528c);
    }

    /* renamed from: V0 */
    public final void m98231V0() {
        if (!mo77226r0() && !super.mo98233T0()) {
            throw new IllegalArgumentException("Points of LinearRing do not form a closed linestring");
        }
        if (m113440M0().size() >= 1 && m113440M0().size() < 3) {
            throw new IllegalArgumentException("Invalid number of points in LinearRing (found " + m113440M0().size() + " - must be 0 or >= 3)");
        }
    }

    @Override // p000.C32002Br2, p000.WB1
    /* renamed from: k0 */
    public int mo77228k0() {
        return 3;
    }
}
