package p000;
/* renamed from: o43  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46059o43 implements InterfaceC48812sj1<C45466n43> {

    /* renamed from: a */
    public final Y94<InterfaceC36152Tk3> f101308a;

    /* renamed from: b */
    public final Y94<AbstractC40129e43> f101309b;

    public C46059o43(Y94<InterfaceC36152Tk3> y94, Y94<AbstractC40129e43> y942) {
        this.f101308a = y94;
        this.f101309b = y942;
    }

    /* renamed from: a */
    public static C46059o43 m21850a(Y94<InterfaceC36152Tk3> y94, Y94<AbstractC40129e43> y942) {
        return new C46059o43(y94, y942);
    }

    /* renamed from: c */
    public static C45466n43 m21848c(InterfaceC36152Tk3 interfaceC36152Tk3, AbstractC40129e43 abstractC40129e43) {
        return new C45466n43(interfaceC36152Tk3, abstractC40129e43);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C45466n43 get() {
        return m21848c(this.f101308a.get(), this.f101309b.get());
    }
}
