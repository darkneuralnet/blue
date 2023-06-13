package p000;
/* renamed from: PI */
/* loaded from: classes4.dex */
public final class C6312PI implements InterfaceC48812sj1<C5939OI> {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f28207a;

    /* renamed from: b */
    public final Y94<InterfaceC48923su2> f28208b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f28209c;

    /* renamed from: d */
    public final Y94<InterfaceC48164rd5> f28210d;

    public C6312PI(Y94<InterfaceC1880Ea> y94, Y94<InterfaceC48923su2> y942, Y94<C36207Tq4> y943, Y94<InterfaceC48164rd5> y944) {
        this.f28207a = y94;
        this.f28208b = y942;
        this.f28209c = y943;
        this.f28210d = y944;
    }

    /* renamed from: a */
    public static C6312PI m90506a(Y94<InterfaceC1880Ea> y94, Y94<InterfaceC48923su2> y942, Y94<C36207Tq4> y943, Y94<InterfaceC48164rd5> y944) {
        return new C6312PI(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C5939OI m90504c(InterfaceC1880Ea interfaceC1880Ea, InterfaceC48923su2 interfaceC48923su2, C36207Tq4 c36207Tq4, InterfaceC48164rd5 interfaceC48164rd5) {
        return new C5939OI(interfaceC1880Ea, interfaceC48923su2, c36207Tq4, interfaceC48164rd5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C5939OI get() {
        return m90504c(this.f28207a.get(), this.f28208b.get(), this.f28209c.get(), this.f28210d.get());
    }
}
