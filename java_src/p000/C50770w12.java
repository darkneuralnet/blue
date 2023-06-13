package p000;
/* renamed from: w12  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C50770w12 implements NW3 {

    /* renamed from: a */
    public WB1 f115152a;

    /* renamed from: b */
    public volatile C29737a f115153b = null;

    /* renamed from: w12$a */
    /* loaded from: classes8.dex */
    public static class C29737a {

        /* renamed from: a */
        public final boolean f115154a;

        /* renamed from: b */
        public final C51573xN5 f115155b = new C51573xN5();

        public C29737a(WB1 wb1) {
            if (wb1.mo77226r0()) {
                this.f115154a = true;
                return;
            }
            this.f115154a = false;
            m7569b(wb1);
        }

        /* renamed from: a */
        public final void m7570a(C52053yB0[] c52053yB0Arr) {
            for (int i = 1; i < c52053yB0Arr.length; i++) {
                C31768Ar2 c31768Ar2 = new C31768Ar2(c52053yB0Arr[i - 1], c52053yB0Arr[i]);
                this.f115155b.m5323e(Math.min(c31768Ar2.f1204b.f118923c, c31768Ar2.f1205c.f118923c), Math.max(c31768Ar2.f1204b.f118923c, c31768Ar2.f1205c.f118923c), c31768Ar2);
            }
        }

        /* renamed from: b */
        public final void m7569b(WB1 wb1) {
            for (C32002Br2 c32002Br2 : C32470Dr2.m109852b(wb1)) {
                m7570a(c32002Br2.mo77238Y());
            }
        }

        /* renamed from: c */
        public void m7568c(double d, double d2, InterfaceC42261hg2 interfaceC42261hg2) {
            if (this.f115154a) {
                return;
            }
            this.f115155b.m5322f(d, d2, interfaceC42261hg2);
        }
    }

    /* renamed from: w12$b */
    /* loaded from: classes8.dex */
    public static class C29738b implements InterfaceC42261hg2 {

        /* renamed from: a */
        public final C50633vn4 f115156a;

        public C29738b(C50633vn4 c50633vn4) {
            this.f115156a = c50633vn4;
        }

        @Override // p000.InterfaceC42261hg2
        /* renamed from: a */
        public void mo7567a(Object obj) {
            C31768Ar2 c31768Ar2 = (C31768Ar2) obj;
            this.f115156a.m8035a(c31768Ar2.m115109b(0), c31768Ar2.m115109b(1));
        }
    }

    public C50770w12(WB1 wb1) {
        if (!(wb1 instanceof LX3) && !(wb1 instanceof C34108Kr2)) {
            throw new IllegalArgumentException("Argument must be Polygonal or LinearRing");
        }
        this.f115152a = wb1;
    }

    @Override // p000.NW3
    /* renamed from: a */
    public int mo5981a(C52053yB0 c52053yB0) {
        if (this.f115153b == null) {
            m7571b();
        }
        C50633vn4 c50633vn4 = new C50633vn4(c52053yB0);
        C29738b c29738b = new C29738b(c50633vn4);
        C29737a c29737a = this.f115153b;
        double d = c52053yB0.f118923c;
        c29737a.m7568c(d, d, c29738b);
        return c50633vn4.m8034b();
    }

    /* renamed from: b */
    public final synchronized void m7571b() {
        if (this.f115153b == null) {
            this.f115153b = new C29737a(this.f115152a);
            this.f115152a = null;
        }
    }
}
