package p000;
/* renamed from: Ab5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C31627Ab5 {

    /* renamed from: a */
    public C48772sf1 f837a;

    /* renamed from: b */
    public C48772sf1 f838b;

    public C31627Ab5(C48772sf1 c48772sf1) {
        this.f837a = c48772sf1;
        this.f838b = c48772sf1.m13882c();
    }

    /* renamed from: g */
    public static C48772sf1 m115485g(WB1 wb1, WB1 wb12, C48772sf1 c48772sf1) {
        C31627Ab5 c31627Ab5 = new C31627Ab5(c48772sf1);
        c31627Ab5.m115491a(wb1);
        c31627Ab5.m115491a(wb12);
        return c31627Ab5.m115486f();
    }

    /* renamed from: h */
    public static boolean m115484h(C48772sf1 c48772sf1, C52053yB0 c52053yB0, C52053yB0 c52053yB02) {
        return c48772sf1.m13890F(c52053yB0, c52053yB02);
    }

    /* renamed from: a */
    public void m115491a(WB1 wb1) {
        if (wb1 != null && !wb1.mo77226r0()) {
            if (wb1 instanceof CX3) {
                m115489c((CX3) wb1);
            } else if (wb1 instanceof XB1) {
                m115490b((XB1) wb1);
            }
        }
    }

    /* renamed from: b */
    public final void m115490b(XB1 xb1) {
        for (int i = 0; i < xb1.mo77232f0(); i++) {
            m115491a(xb1.mo77236d0(i));
        }
    }

    /* renamed from: c */
    public final void m115489c(CX3 cx3) {
        m115488d(cx3.m112157L0());
        for (int i = 0; i < cx3.m112155O0(); i++) {
            m115488d(cx3.m112156M0(i));
        }
    }

    /* renamed from: d */
    public final void m115488d(C34108Kr2 c34108Kr2) {
        if (c34108Kr2.mo77226r0()) {
            return;
        }
        EB0 m113440M0 = c34108Kr2.m113440M0();
        for (int i = 1; i < m113440M0.size(); i++) {
            m115487e(m113440M0.mo1707u(i - 1), m113440M0.mo1707u(i));
        }
    }

    /* renamed from: e */
    public final void m115487e(C52053yB0 c52053yB0, C52053yB0 c52053yB02) {
        if (m115484h(this.f837a, c52053yB0, c52053yB02)) {
            this.f838b.m13874k(c52053yB0);
            this.f838b.m13874k(c52053yB02);
        }
    }

    /* renamed from: f */
    public C48772sf1 m115486f() {
        return this.f838b;
    }
}
