package p000;
/* renamed from: Jw0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33917Jw0 implements InterfaceC48812sj1<C33683Iw0> {

    /* renamed from: a */
    public final Y94<InterfaceC32555Ea6> f18782a;

    /* renamed from: b */
    public final Y94<AbstractC35780Rv0> f18783b;

    public C33917Jw0(Y94<InterfaceC32555Ea6> y94, Y94<AbstractC35780Rv0> y942) {
        this.f18782a = y94;
        this.f18783b = y942;
    }

    /* renamed from: a */
    public static C33917Jw0 m99557a(Y94<InterfaceC32555Ea6> y94, Y94<AbstractC35780Rv0> y942) {
        return new C33917Jw0(y94, y942);
    }

    /* renamed from: c */
    public static C33683Iw0 m99555c(InterfaceC32555Ea6 interfaceC32555Ea6, AbstractC35780Rv0 abstractC35780Rv0) {
        return new C33683Iw0(interfaceC32555Ea6, abstractC35780Rv0);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C33683Iw0 get() {
        return m99555c(this.f18782a.get(), this.f18783b.get());
    }
}
