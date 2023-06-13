package p000;
/* renamed from: Em3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32660Em3 implements InterfaceC48812sj1<C32426Dm3> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f8111a;

    /* renamed from: b */
    public final Y94<InterfaceC44647lh6> f8112b;

    /* renamed from: c */
    public final Y94<C22454gl> f8113c;

    public C32660Em3(Y94<InterfaceC40099e13> y94, Y94<InterfaceC44647lh6> y942, Y94<C22454gl> y943) {
        this.f8111a = y94;
        this.f8112b = y942;
        this.f8113c = y943;
    }

    /* renamed from: a */
    public static C32660Em3 m108389a(Y94<InterfaceC40099e13> y94, Y94<InterfaceC44647lh6> y942, Y94<C22454gl> y943) {
        return new C32660Em3(y94, y942, y943);
    }

    /* renamed from: c */
    public static C32426Dm3 m108387c(InterfaceC40099e13 interfaceC40099e13, InterfaceC44647lh6 interfaceC44647lh6, C22454gl c22454gl) {
        return new C32426Dm3(interfaceC40099e13, interfaceC44647lh6, c22454gl);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C32426Dm3 get() {
        return m108387c(this.f8111a.get(), this.f8112b.get(), this.f8113c.get());
    }
}
