package p000;
/* renamed from: JB0 */
/* loaded from: classes8.dex */
public class JB0 extends C52053yB0 {
    private static final long serialVersionUID = 2842127537691165613L;

    /* renamed from: e */
    public double f16980e;

    public JB0() {
        this.f16980e = 0.0d;
    }

    @Override // p000.C52053yB0
    /* renamed from: h */
    public double mo3885h() {
        return this.f16980e;
    }

    @Override // p000.C52053yB0
    /* renamed from: j */
    public double mo3884j(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return this.f16980e;
                }
                throw new IllegalArgumentException("Invalid ordinate index: " + i);
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
        this.f16980e = c52053yB0.mo3885h();
    }

    @Override // p000.C52053yB0
    /* renamed from: p */
    public void mo3878p(int i, double d) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.f16980e = d;
                    return;
                }
                throw new IllegalArgumentException("Invalid ordinate index: " + i);
            }
            this.f118923c = d;
            return;
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
    public JB0 mo3888e() {
        return new JB0(this);
    }

    @Override // p000.C52053yB0
    public String toString() {
        return "(" + this.f118922b + ", " + this.f118923c + " m=" + mo3885h() + ")";
    }

    public JB0(JB0 jb0) {
        super(jb0.f118922b, jb0.f118923c);
        this.f16980e = jb0.f16980e;
    }
}
