package p000;
/* renamed from: zg */
/* loaded from: classes4.dex */
public final class C31467zg implements InterfaceC48812sj1<C29933wg> {

    /* renamed from: a */
    public final Y94<InterfaceC35660Rh6> f122023a;

    /* renamed from: b */
    public final Y94<InterfaceC6098Oi> f122024b;

    /* renamed from: c */
    public final Y94<InterfaceC24980jg> f122025c;

    public C31467zg(Y94<InterfaceC35660Rh6> y94, Y94<InterfaceC6098Oi> y942, Y94<InterfaceC24980jg> y943) {
        this.f122023a = y94;
        this.f122024b = y942;
        this.f122025c = y943;
    }

    /* renamed from: a */
    public static C31467zg m606a(Y94<InterfaceC35660Rh6> y94, Y94<InterfaceC6098Oi> y942, Y94<InterfaceC24980jg> y943) {
        return new C31467zg(y94, y942, y943);
    }

    /* renamed from: c */
    public static C29933wg m604c(InterfaceC35660Rh6 interfaceC35660Rh6, InterfaceC6098Oi interfaceC6098Oi, InterfaceC24980jg interfaceC24980jg) {
        return new C29933wg(interfaceC35660Rh6, interfaceC6098Oi, interfaceC24980jg);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C29933wg get() {
        return m604c(this.f122023a.get(), this.f122024b.get(), this.f122025c.get());
    }
}
