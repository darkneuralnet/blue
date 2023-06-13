package p000;
/* renamed from: UI6 */
/* loaded from: classes4.dex */
public final class UI6 implements InterfaceC48812sj1<TI6> {

    /* renamed from: a */
    public final Y94<InterfaceC46545ot5> f37219a;

    /* renamed from: b */
    public final Y94<WI6> f37220b;

    public UI6(Y94<InterfaceC46545ot5> y94, Y94<WI6> y942) {
        this.f37219a = y94;
        this.f37220b = y942;
    }

    /* renamed from: a */
    public static UI6 m81644a(Y94<InterfaceC46545ot5> y94, Y94<WI6> y942) {
        return new UI6(y94, y942);
    }

    /* renamed from: c */
    public static TI6 m81642c(InterfaceC46545ot5 interfaceC46545ot5, WI6 wi6) {
        return new TI6(interfaceC46545ot5, wi6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public TI6 get() {
        return m81642c(this.f37219a.get(), this.f37220b.get());
    }
}
