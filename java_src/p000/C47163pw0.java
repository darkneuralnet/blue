package p000;
/* renamed from: pw0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47163pw0 implements InterfaceC48812sj1<C46570ow0> {

    /* renamed from: a */
    public final Y94<InterfaceC33215Gw0> f104347a;

    public C47163pw0(Y94<InterfaceC33215Gw0> y94) {
        this.f104347a = y94;
    }

    /* renamed from: a */
    public static C47163pw0 m18422a(Y94<InterfaceC33215Gw0> y94) {
        return new C47163pw0(y94);
    }

    /* renamed from: c */
    public static C46570ow0 m18420c(InterfaceC33215Gw0 interfaceC33215Gw0) {
        return new C46570ow0(interfaceC33215Gw0);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C46570ow0 get() {
        return m18420c(this.f104347a.get());
    }
}
