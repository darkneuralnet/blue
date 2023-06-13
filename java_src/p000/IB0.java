package p000;
/* renamed from: IB0 */
/* loaded from: classes8.dex */
public class IB0 extends C52053yB0 {
    private static final long serialVersionUID = 3532307803472313082L;

    public IB0() {
    }

    @Override // p000.C52053yB0
    /* renamed from: j */
    public double mo3884j(int i) {
        if (i != 0) {
            if (i != 1) {
                return Double.NaN;
            }
            return this.f118923c;
        }
        return this.f118922b;
    }

    @Override // p000.C52053yB0
    /* renamed from: m */
    public double mo3881m() {
        return Double.NaN;
    }

    @Override // p000.C52053yB0
    /* renamed from: o */
    public void mo3879o(C52053yB0 c52053yB0) {
        this.f118922b = c52053yB0.f118922b;
        this.f118923c = c52053yB0.f118923c;
        this.f118924d = c52053yB0.mo3881m();
    }

    @Override // p000.C52053yB0
    /* renamed from: p */
    public void mo3878p(int i, double d) {
        if (i != 0) {
            if (i == 1) {
                this.f118923c = d;
                return;
            }
            throw new IllegalArgumentException("Invalid ordinate index: " + i);
        }
        this.f118922b = d;
    }

    @Override // p000.C52053yB0
    /* renamed from: q */
    public void mo3877q(double d) {
        throw new IllegalArgumentException("CoordinateXY dimension 2 does not support z-ordinate");
    }

    @Override // p000.C52053yB0
    /* renamed from: r */
    public IB0 mo3888e() {
        return new IB0(this);
    }

    @Override // p000.C52053yB0
    public String toString() {
        return "(" + this.f118922b + ", " + this.f118923c + ")";
    }

    public IB0(IB0 ib0) {
        super(ib0.f118922b, ib0.f118923c);
    }
}
