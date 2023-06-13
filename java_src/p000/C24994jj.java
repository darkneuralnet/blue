package p000;
/* renamed from: jj */
/* loaded from: classes4.dex */
public final class C24994jj implements InterfaceC48812sj1<P10> {

    /* renamed from: a */
    public final C22711hj f93236a;

    /* renamed from: b */
    public final Y94<InterfaceC6097Oh> f93237b;

    /* renamed from: c */
    public final Y94<C22454gl> f93238c;

    public C24994jj(C22711hj c22711hj, Y94<InterfaceC6097Oh> y94, Y94<C22454gl> y942) {
        this.f93236a = c22711hj;
        this.f93237b = y94;
        this.f93238c = y942;
    }

    /* renamed from: a */
    public static P10 m30045a(C22711hj c22711hj, InterfaceC6097Oh interfaceC6097Oh, C22454gl c22454gl) {
        return (P10) C51679xZ3.m5002e(c22711hj.m36005b(interfaceC6097Oh, c22454gl));
    }

    /* renamed from: b */
    public static C24994jj m30044b(C22711hj c22711hj, Y94<InterfaceC6097Oh> y94, Y94<C22454gl> y942) {
        return new C24994jj(c22711hj, y94, y942);
    }

    @Override // p000.Y94
    /* renamed from: c */
    public P10 get() {
        return m30045a(this.f93236a, this.f93237b.get(), this.f93238c.get());
    }
}
