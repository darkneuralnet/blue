package p000;
/* renamed from: g11  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41283g11 implements InterfaceC48812sj1<C40690f11> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f81328a;

    public C41283g11(Y94<InterfaceC40099e13> y94) {
        this.f81328a = y94;
    }

    /* renamed from: a */
    public static C41283g11 m40325a(Y94<InterfaceC40099e13> y94) {
        return new C41283g11(y94);
    }

    /* renamed from: c */
    public static C40690f11 m40323c(InterfaceC40099e13 interfaceC40099e13) {
        return new C40690f11(interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C40690f11 get() {
        return m40323c(this.f81328a.get());
    }
}
