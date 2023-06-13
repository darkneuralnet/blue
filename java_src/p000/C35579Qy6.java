package p000;
/* renamed from: Qy6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35579Qy6 implements InterfaceC48812sj1<C35345Py6> {

    /* renamed from: a */
    public final Y94<InterfaceC36152Tk3> f31337a;

    /* renamed from: b */
    public final Y94<AbstractC34175Ky6> f31338b;

    public C35579Qy6(Y94<InterfaceC36152Tk3> y94, Y94<AbstractC34175Ky6> y942) {
        this.f31337a = y94;
        this.f31338b = y942;
    }

    /* renamed from: a */
    public static C35579Qy6 m87487a(Y94<InterfaceC36152Tk3> y94, Y94<AbstractC34175Ky6> y942) {
        return new C35579Qy6(y94, y942);
    }

    /* renamed from: c */
    public static C35345Py6 m87485c(InterfaceC36152Tk3 interfaceC36152Tk3, AbstractC34175Ky6 abstractC34175Ky6) {
        return new C35345Py6(interfaceC36152Tk3, abstractC34175Ky6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C35345Py6 get() {
        return m87485c(this.f31337a.get(), this.f31338b.get());
    }
}
