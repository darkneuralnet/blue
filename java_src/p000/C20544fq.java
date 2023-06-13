package p000;
/* renamed from: fq */
/* loaded from: classes2.dex */
public final class C20544fq implements InterfaceC48812sj1<InterfaceC22767hq> {

    /* renamed from: a */
    public final C19865dq f80775a;

    /* renamed from: b */
    public final Y94<C22454gl> f80776b;

    /* renamed from: c */
    public final Y94<InterfaceC35660Rh6> f80777c;

    /* renamed from: d */
    public final Y94<InterfaceC5093Lp> f80778d;

    public C20544fq(C19865dq c19865dq, Y94<C22454gl> y94, Y94<InterfaceC35660Rh6> y942, Y94<InterfaceC5093Lp> y943) {
        this.f80775a = c19865dq;
        this.f80776b = y94;
        this.f80777c = y942;
        this.f80778d = y943;
    }

    /* renamed from: a */
    public static C20544fq m40781a(C19865dq c19865dq, Y94<C22454gl> y94, Y94<InterfaceC35660Rh6> y942, Y94<InterfaceC5093Lp> y943) {
        return new C20544fq(c19865dq, y94, y942, y943);
    }

    /* renamed from: c */
    public static InterfaceC22767hq m40779c(C19865dq c19865dq, C22454gl c22454gl, InterfaceC35660Rh6 interfaceC35660Rh6, InterfaceC5093Lp interfaceC5093Lp) {
        return (InterfaceC22767hq) C51679xZ3.m5002e(c19865dq.m43672b(c22454gl, interfaceC35660Rh6, interfaceC5093Lp));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC22767hq get() {
        return m40779c(this.f80775a, this.f80776b.get(), this.f80777c.get(), this.f80778d.get());
    }
}
