package p000;
/* renamed from: r84  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47879r84 implements InterfaceC48812sj1<C46693p84> {

    /* renamed from: a */
    public final Y94<InterfaceC50842w84> f106521a;

    public C47879r84(Y94<InterfaceC50842w84> y94) {
        this.f106521a = y94;
    }

    /* renamed from: a */
    public static C47879r84 m16442a(Y94<InterfaceC50842w84> y94) {
        return new C47879r84(y94);
    }

    /* renamed from: c */
    public static C46693p84 m16440c(InterfaceC50842w84 interfaceC50842w84) {
        return new C46693p84(interfaceC50842w84);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C46693p84 get() {
        return m16440c(this.f106521a.get());
    }
}
