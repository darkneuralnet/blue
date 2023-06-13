package p000;
/* renamed from: v43  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50208v43 implements InterfaceC48812sj1<C49616u43> {

    /* renamed from: a */
    public final Y94<InterfaceC36152Tk3> f113499a;

    /* renamed from: b */
    public final Y94<InterfaceC47838r43> f113500b;

    /* renamed from: c */
    public final Y94<InterfaceC50801w43> f113501c;

    public C50208v43(Y94<InterfaceC36152Tk3> y94, Y94<InterfaceC47838r43> y942, Y94<InterfaceC50801w43> y943) {
        this.f113499a = y94;
        this.f113500b = y942;
        this.f113501c = y943;
    }

    /* renamed from: a */
    public static C50208v43 m9217a(Y94<InterfaceC36152Tk3> y94, Y94<InterfaceC47838r43> y942, Y94<InterfaceC50801w43> y943) {
        return new C50208v43(y94, y942, y943);
    }

    /* renamed from: c */
    public static C49616u43 m9215c(InterfaceC36152Tk3 interfaceC36152Tk3, InterfaceC47838r43 interfaceC47838r43, InterfaceC50801w43 interfaceC50801w43) {
        return new C49616u43(interfaceC36152Tk3, interfaceC47838r43, interfaceC50801w43);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C49616u43 get() {
        return m9215c(this.f113499a.get(), this.f113500b.get(), this.f113501c.get());
    }
}
