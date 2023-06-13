package p000;
/* renamed from: O65 */
/* loaded from: classes2.dex */
public final class O65 implements InterfaceC48812sj1<C52602z65> {

    /* renamed from: a */
    public final Y94<C22454gl> f25900a;

    /* renamed from: b */
    public final Y94<YR4> f25901b;

    /* renamed from: c */
    public final Y94<InterfaceC50823w65> f25902c;

    /* renamed from: d */
    public final Y94<InterfaceC46674p65> f25903d;

    public O65(Y94<C22454gl> y94, Y94<YR4> y942, Y94<InterfaceC50823w65> y943, Y94<InterfaceC46674p65> y944) {
        this.f25900a = y94;
        this.f25901b = y942;
        this.f25902c = y943;
        this.f25903d = y944;
    }

    /* renamed from: a */
    public static O65 m92904a(Y94<C22454gl> y94, Y94<YR4> y942, Y94<InterfaceC50823w65> y943, Y94<InterfaceC46674p65> y944) {
        return new O65(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C52602z65 m92902c(C22454gl c22454gl, YR4 yr4, InterfaceC50823w65 interfaceC50823w65, InterfaceC46674p65 interfaceC46674p65) {
        return new C52602z65(c22454gl, yr4, interfaceC50823w65, interfaceC46674p65);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C52602z65 get() {
        return m92902c(this.f25900a.get(), this.f25901b.get(), this.f25902c.get(), this.f25903d.get());
    }
}
