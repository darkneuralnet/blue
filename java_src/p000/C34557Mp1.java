package p000;
/* renamed from: Mp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34557Mp1 implements InterfaceC48812sj1<C34323Lp1> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f23650a;

    public C34557Mp1(Y94<InterfaceC40099e13> y94) {
        this.f23650a = y94;
    }

    /* renamed from: a */
    public static C34557Mp1 m94709a(Y94<InterfaceC40099e13> y94) {
        return new C34557Mp1(y94);
    }

    /* renamed from: c */
    public static C34323Lp1 m94707c(InterfaceC40099e13 interfaceC40099e13) {
        return new C34323Lp1(interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C34323Lp1 get() {
        return m94707c(this.f23650a.get());
    }
}
