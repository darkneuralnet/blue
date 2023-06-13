package p000;
/* renamed from: R33 */
/* loaded from: classes4.dex */
public final class R33 implements InterfaceC48812sj1<Q33> {

    /* renamed from: a */
    public final Y94<InterfaceC36152Tk3> f31454a;

    /* renamed from: b */
    public final Y94<J33> f31455b;

    public R33(Y94<InterfaceC36152Tk3> y94, Y94<J33> y942) {
        this.f31454a = y94;
        this.f31455b = y942;
    }

    /* renamed from: a */
    public static R33 m87367a(Y94<InterfaceC36152Tk3> y94, Y94<J33> y942) {
        return new R33(y94, y942);
    }

    /* renamed from: c */
    public static Q33 m87365c(InterfaceC36152Tk3 interfaceC36152Tk3, J33 j33) {
        return new Q33(interfaceC36152Tk3, j33);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public Q33 get() {
        return m87365c(this.f31454a.get(), this.f31455b.get());
    }
}
