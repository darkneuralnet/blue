package p000;
/* renamed from: PR */
/* loaded from: classes4.dex */
public final class C6354PR implements InterfaceC48812sj1<C5996OR> {

    /* renamed from: a */
    public final Y94<InterfaceC36152Tk3> f28463a;

    /* renamed from: b */
    public final Y94<AbstractC1025CR> f28464b;

    public C6354PR(Y94<InterfaceC36152Tk3> y94, Y94<AbstractC1025CR> y942) {
        this.f28463a = y94;
        this.f28464b = y942;
    }

    /* renamed from: a */
    public static C6354PR m90303a(Y94<InterfaceC36152Tk3> y94, Y94<AbstractC1025CR> y942) {
        return new C6354PR(y94, y942);
    }

    /* renamed from: c */
    public static C5996OR m90301c(InterfaceC36152Tk3 interfaceC36152Tk3, AbstractC1025CR abstractC1025CR) {
        return new C5996OR(interfaceC36152Tk3, abstractC1025CR);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C5996OR get() {
        return m90301c(this.f28463a.get(), this.f28464b.get());
    }
}
