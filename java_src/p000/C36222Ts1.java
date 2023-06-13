package p000;
/* renamed from: Ts1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36222Ts1 implements InterfaceC48812sj1<C35988Ss1> {

    /* renamed from: a */
    public final Y94<InterfaceC36152Tk3> f36375a;

    /* renamed from: b */
    public final Y94<AbstractC32010Bs1> f36376b;

    public C36222Ts1(Y94<InterfaceC36152Tk3> y94, Y94<AbstractC32010Bs1> y942) {
        this.f36375a = y94;
        this.f36376b = y942;
    }

    /* renamed from: a */
    public static C36222Ts1 m82332a(Y94<InterfaceC36152Tk3> y94, Y94<AbstractC32010Bs1> y942) {
        return new C36222Ts1(y94, y942);
    }

    /* renamed from: c */
    public static C35988Ss1 m82330c(InterfaceC36152Tk3 interfaceC36152Tk3, AbstractC32010Bs1 abstractC32010Bs1) {
        return new C35988Ss1(interfaceC36152Tk3, abstractC32010Bs1);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C35988Ss1 get() {
        return m82330c(this.f36375a.get(), this.f36376b.get());
    }
}
