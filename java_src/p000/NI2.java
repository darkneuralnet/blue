package p000;
/* renamed from: NI2 */
/* loaded from: classes4.dex */
public final class NI2 implements InterfaceC48812sj1<InterfaceC44573la2> {

    /* renamed from: a */
    public final VH2 f24411a;

    /* renamed from: b */
    public final Y94<InterfaceC42201ha2> f24412b;

    /* renamed from: c */
    public final Y94<InterfaceC45298mn4> f24413c;

    public NI2(VH2 vh2, Y94<InterfaceC42201ha2> y94, Y94<InterfaceC45298mn4> y942) {
        this.f24411a = vh2;
        this.f24412b = y94;
        this.f24413c = y942;
    }

    /* renamed from: a */
    public static NI2 m94079a(VH2 vh2, Y94<InterfaceC42201ha2> y94, Y94<InterfaceC45298mn4> y942) {
        return new NI2(vh2, y94, y942);
    }

    /* renamed from: c */
    public static InterfaceC44573la2 m94077c(VH2 vh2, InterfaceC42201ha2 interfaceC42201ha2, InterfaceC45298mn4 interfaceC45298mn4) {
        return (InterfaceC44573la2) C51679xZ3.m5002e(vh2.m80084S(interfaceC42201ha2, interfaceC45298mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC44573la2 get() {
        return m94077c(this.f24411a, this.f24412b.get(), this.f24413c.get());
    }
}
