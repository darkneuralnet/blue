package p000;
/* renamed from: cv3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39448cv3 implements InterfaceC48812sj1<C38837bv3> {

    /* renamed from: a */
    public final Y94<InterfaceC36152Tk3> f75851a;

    /* renamed from: b */
    public final Y94<AbstractC51315ww3> f75852b;

    public C39448cv3(Y94<InterfaceC36152Tk3> y94, Y94<AbstractC51315ww3> y942) {
        this.f75851a = y94;
        this.f75852b = y942;
    }

    /* renamed from: a */
    public static C39448cv3 m44818a(Y94<InterfaceC36152Tk3> y94, Y94<AbstractC51315ww3> y942) {
        return new C39448cv3(y94, y942);
    }

    /* renamed from: c */
    public static C38837bv3 m44816c(InterfaceC36152Tk3 interfaceC36152Tk3, AbstractC51315ww3 abstractC51315ww3) {
        return new C38837bv3(interfaceC36152Tk3, abstractC51315ww3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C38837bv3 get() {
        return m44816c(this.f75851a.get(), this.f75852b.get());
    }
}
