package p000;
/* renamed from: iJ6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42645iJ6 implements InterfaceC48812sj1<C41459gJ6> {

    /* renamed from: a */
    public final Y94<InterfaceC36152Tk3> f87115a;

    /* renamed from: b */
    public final Y94<CI6> f87116b;

    /* renamed from: c */
    public final Y94<MI6> f87117c;

    public C42645iJ6(Y94<InterfaceC36152Tk3> y94, Y94<CI6> y942, Y94<MI6> y943) {
        this.f87115a = y94;
        this.f87116b = y942;
        this.f87117c = y943;
    }

    /* renamed from: a */
    public static C42645iJ6 m34227a(Y94<InterfaceC36152Tk3> y94, Y94<CI6> y942, Y94<MI6> y943) {
        return new C42645iJ6(y94, y942, y943);
    }

    /* renamed from: c */
    public static C41459gJ6 m34225c(InterfaceC36152Tk3 interfaceC36152Tk3, CI6 ci6, MI6 mi6) {
        return new C41459gJ6(interfaceC36152Tk3, ci6, mi6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C41459gJ6 get() {
        return m34225c(this.f87115a.get(), this.f87116b.get(), this.f87117c.get());
    }
}
