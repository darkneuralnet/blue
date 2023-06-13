package p000;
/* renamed from: i43  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42501i43 implements InterfaceC48812sj1<C41908h43> {

    /* renamed from: a */
    public final Y94<InterfaceC43094j43> f86689a;

    public C42501i43(Y94<InterfaceC43094j43> y94) {
        this.f86689a = y94;
    }

    /* renamed from: a */
    public static C42501i43 m34503a(Y94<InterfaceC43094j43> y94) {
        return new C42501i43(y94);
    }

    /* renamed from: c */
    public static C41908h43 m34501c(InterfaceC43094j43 interfaceC43094j43) {
        return new C41908h43(interfaceC43094j43);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C41908h43 get() {
        return m34501c(this.f86689a.get());
    }
}
