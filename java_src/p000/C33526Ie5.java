package p000;
/* renamed from: Ie5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33526Ie5 implements InterfaceC48812sj1<C32824Fe5> {

    /* renamed from: a */
    public final Y94<InterfaceC5225MD> f15981a;

    /* renamed from: b */
    public final Y94<InterfaceC10732aY> f15982b;

    /* renamed from: c */
    public final Y94<InterfaceC22675hX> f15983c;

    public C33526Ie5(Y94<InterfaceC5225MD> y94, Y94<InterfaceC10732aY> y942, Y94<InterfaceC22675hX> y943) {
        this.f15981a = y94;
        this.f15982b = y942;
        this.f15983c = y943;
    }

    /* renamed from: a */
    public static C33526Ie5 m101846a(Y94<InterfaceC5225MD> y94, Y94<InterfaceC10732aY> y942, Y94<InterfaceC22675hX> y943) {
        return new C33526Ie5(y94, y942, y943);
    }

    /* renamed from: c */
    public static C32824Fe5 m101844c(InterfaceC5225MD interfaceC5225MD, InterfaceC10732aY interfaceC10732aY, InterfaceC22675hX interfaceC22675hX) {
        return new C32824Fe5(interfaceC5225MD, interfaceC10732aY, interfaceC22675hX);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C32824Fe5 get() {
        return m101844c(this.f15981a.get(), this.f15982b.get(), this.f15983c.get());
    }
}
