package p000;
/* renamed from: dl3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39941dl3 implements InterfaceC48812sj1<C39330cl3> {

    /* renamed from: a */
    public final Y94<InterfaceC36152Tk3> f77171a;

    /* renamed from: b */
    public final Y94<AbstractC51235wo3> f77172b;

    /* renamed from: c */
    public final Y94<AbstractC31814Aw3> f77173c;

    public C39941dl3(Y94<InterfaceC36152Tk3> y94, Y94<AbstractC51235wo3> y942, Y94<AbstractC31814Aw3> y943) {
        this.f77171a = y94;
        this.f77172b = y942;
        this.f77173c = y943;
    }

    /* renamed from: a */
    public static C39941dl3 m43774a(Y94<InterfaceC36152Tk3> y94, Y94<AbstractC51235wo3> y942, Y94<AbstractC31814Aw3> y943) {
        return new C39941dl3(y94, y942, y943);
    }

    /* renamed from: c */
    public static C39330cl3 m43772c(InterfaceC36152Tk3 interfaceC36152Tk3, AbstractC51235wo3 abstractC51235wo3, AbstractC31814Aw3 abstractC31814Aw3) {
        return new C39330cl3(interfaceC36152Tk3, abstractC51235wo3, abstractC31814Aw3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C39330cl3 get() {
        return m43772c(this.f77171a.get(), this.f77172b.get(), this.f77173c.get());
    }
}
