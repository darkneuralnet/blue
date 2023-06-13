package p000;
/* renamed from: JX */
/* loaded from: classes2.dex */
public final class C4132JX implements InterfaceC48812sj1<C2320FX> {

    /* renamed from: a */
    public final Y94<AbstractC39873de5> f17719a;

    /* renamed from: b */
    public final Y94<C10730aX> f17720b;

    public C4132JX(Y94<AbstractC39873de5> y94, Y94<C10730aX> y942) {
        this.f17719a = y94;
        this.f17720b = y942;
    }

    /* renamed from: a */
    public static C4132JX m100310a(Y94<AbstractC39873de5> y94, Y94<C10730aX> y942) {
        return new C4132JX(y94, y942);
    }

    /* renamed from: c */
    public static C2320FX m100308c(AbstractC39873de5 abstractC39873de5, C10730aX c10730aX) {
        return new C2320FX(abstractC39873de5, c10730aX);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C2320FX get() {
        return m100308c(this.f17719a.get(), this.f17720b.get());
    }
}
