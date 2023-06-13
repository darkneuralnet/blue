package p000;
/* renamed from: Du4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32499Du4 implements InterfaceC48812sj1<C32265Cu4> {

    /* renamed from: a */
    public final Y94<InterfaceC32967Fu4> f6559a;

    /* renamed from: b */
    public final Y94<AbstractC51529xI6> f6560b;

    /* renamed from: c */
    public final Y94<C22454gl> f6561c;

    public C32499Du4(Y94<InterfaceC32967Fu4> y94, Y94<AbstractC51529xI6> y942, Y94<C22454gl> y943) {
        this.f6559a = y94;
        this.f6560b = y942;
        this.f6561c = y943;
    }

    /* renamed from: a */
    public static C32499Du4 m109715a(Y94<InterfaceC32967Fu4> y94, Y94<AbstractC51529xI6> y942, Y94<C22454gl> y943) {
        return new C32499Du4(y94, y942, y943);
    }

    /* renamed from: c */
    public static C32265Cu4 m109713c(InterfaceC32967Fu4 interfaceC32967Fu4, AbstractC51529xI6 abstractC51529xI6, C22454gl c22454gl) {
        return new C32265Cu4(interfaceC32967Fu4, abstractC51529xI6, c22454gl);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C32265Cu4 get() {
        return m109713c(this.f6559a.get(), this.f6560b.get(), this.f6561c.get());
    }
}
