package p000;
/* renamed from: vI6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50343vI6 implements InterfaceC48812sj1<C49751uI6> {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f113815a;

    public C50343vI6(Y94<InterfaceC1880Ea> y94) {
        this.f113815a = y94;
    }

    /* renamed from: a */
    public static C50343vI6 m8919a(Y94<InterfaceC1880Ea> y94) {
        return new C50343vI6(y94);
    }

    /* renamed from: c */
    public static C49751uI6 m8917c(InterfaceC1880Ea interfaceC1880Ea) {
        return new C49751uI6(interfaceC1880Ea);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C49751uI6 get() {
        return m8917c(this.f113815a.get());
    }
}
