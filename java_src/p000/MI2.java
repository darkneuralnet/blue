package p000;
/* renamed from: MI2 */
/* loaded from: classes4.dex */
public final class MI2 implements InterfaceC48812sj1<I82> {

    /* renamed from: a */
    public final VH2 f22956a;

    /* renamed from: b */
    public final Y94<InterfaceC35813Ry6> f22957b;

    /* renamed from: c */
    public final Y94<U72> f22958c;

    public MI2(VH2 vh2, Y94<InterfaceC35813Ry6> y94, Y94<U72> y942) {
        this.f22956a = vh2;
        this.f22957b = y94;
        this.f22958c = y942;
    }

    /* renamed from: a */
    public static MI2 m95450a(VH2 vh2, Y94<InterfaceC35813Ry6> y94, Y94<U72> y942) {
        return new MI2(vh2, y94, y942);
    }

    /* renamed from: c */
    public static I82 m95448c(VH2 vh2, InterfaceC35813Ry6 interfaceC35813Ry6, U72 u72) {
        return (I82) C51679xZ3.m5002e(vh2.m80086R(interfaceC35813Ry6, u72));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public I82 get() {
        return m95448c(this.f22956a, this.f22957b.get(), this.f22958c.get());
    }
}
