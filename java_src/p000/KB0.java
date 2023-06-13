package p000;
/* renamed from: KB0 */
/* loaded from: classes8.dex */
public class KB0 extends C52053yB0 {
    private static final long serialVersionUID = -8763329985881823442L;

    /* renamed from: e */
    public double f19237e;

    public KB0() {
        this.f19237e = 0.0d;
    }

    @Override // p000.C52053yB0
    /* renamed from: h */
    public double mo3885h() {
        return this.f19237e;
    }

    @Override // p000.C52053yB0
    /* renamed from: j */
    public double mo3884j(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return mo3885h();
                    }
                    throw new IllegalArgumentException("Invalid ordinate index: " + i);
                }
                return mo3881m();
            }
            return this.f118923c;
        }
        return this.f118922b;
    }

    @Override // p000.C52053yB0
    /* renamed from: o */
    public void mo3879o(C52053yB0 c52053yB0) {
        this.f118922b = c52053yB0.f118922b;
        this.f118923c = c52053yB0.f118923c;
        this.f118924d = c52053yB0.mo3881m();
        this.f19237e = c52053yB0.mo3885h();
    }

    @Override // p000.C52053yB0
    /* renamed from: p */
    public void mo3878p(int i, double d) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.f19237e = d;
                        return;
                    }
                    throw new IllegalArgumentException("Invalid ordinate index: " + i);
                }
                this.f118924d = d;
                return;
            }
            this.f118923c = d;
            return;
        }
        this.f118922b = d;
    }

    @Override // p000.C52053yB0
    /* renamed from: r */
    public KB0 mo3888e() {
        return new KB0(this);
    }

    @Override // p000.C52053yB0
    public String toString() {
        return "(" + this.f118922b + ", " + this.f118923c + ", " + mo3881m() + " m=" + mo3885h() + ")";
    }

    public KB0(KB0 kb0) {
        super(kb0);
        this.f19237e = kb0.f19237e;
    }
}
