package p000;
/* renamed from: qp0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C47686qp0 {

    /* renamed from: a */
    public C52053yB0 f105861a;

    /* renamed from: b */
    public C27695a f105862b = new C27695a();

    /* renamed from: qp0$a */
    /* loaded from: classes8.dex */
    public static class C27695a implements CB0 {

        /* renamed from: a */
        public C47093pp0 f105863a = new C47093pp0();

        /* renamed from: b */
        public C47093pp0 f105864b = new C47093pp0();

        @Override // p000.CB0
        /* renamed from: a */
        public void mo16956a(C52053yB0 c52053yB0) {
            this.f105863a.m18659a(c52053yB0.f118922b);
            this.f105864b.m18659a(c52053yB0.f118923c);
        }

        /* renamed from: b */
        public C52053yB0 m16955b() {
            return new C52053yB0(this.f105863a.m18657c(), this.f105864b.m18657c());
        }
    }

    /* renamed from: qp0$b */
    /* loaded from: classes8.dex */
    public static class C27696b implements GB0 {

        /* renamed from: b */
        public C52053yB0 f105865b;

        public C27696b(C52053yB0 c52053yB0) {
            this.f105865b = c52053yB0;
        }

        @Override // p000.GB0
        /* renamed from: d */
        public void mo16954d(EB0 eb0, int i) {
            eb0.mo1705y1(i, 0, eb0.mo1713a3(i, 0) + this.f105865b.f118922b);
            eb0.mo1705y1(i, 1, eb0.mo1713a3(i, 1) + this.f105865b.f118923c);
        }

        @Override // p000.GB0
        /* renamed from: e */
        public boolean mo16953e() {
            return true;
        }

        @Override // p000.GB0
        public boolean isDone() {
            return false;
        }
    }

    /* renamed from: a */
    public void m16959a(WB1 wb1) {
        wb1.mo77237d(this.f105862b);
        this.f105861a = this.f105862b.m16955b();
    }

    /* renamed from: b */
    public void m16958b(WB1 wb1) {
        wb1.mo77235e(new C27696b(this.f105861a));
        wb1.m78765H();
    }

    /* renamed from: c */
    public WB1 m16957c(WB1 wb1) {
        C52053yB0 c52053yB0 = this.f105861a;
        if (c52053yB0.f118922b == 0.0d && c52053yB0.f118923c == 0.0d) {
            return wb1;
        }
        C52053yB0 c52053yB02 = new C52053yB0(c52053yB0);
        c52053yB02.f118922b = -c52053yB02.f118922b;
        c52053yB02.f118923c = -c52053yB02.f118923c;
        wb1.mo77235e(new C27696b(c52053yB02));
        wb1.m78765H();
        return wb1;
    }
}
