package p000;
/* renamed from: p73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46682p73 implements InterfaceC48812sj1<InterfaceC52534yz6> {

    /* renamed from: a */
    public final P43 f103146a;

    /* renamed from: b */
    public final Y94<MN4> f103147b;

    public C46682p73(P43 p43, Y94<MN4> y94) {
        this.f103146a = p43;
        this.f103147b = y94;
    }

    /* renamed from: a */
    public static C46682p73 m19941a(P43 p43, Y94<MN4> y94) {
        return new C46682p73(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC52534yz6 m19939c(P43 p43, MN4 mn4) {
        return (InterfaceC52534yz6) C51679xZ3.m5002e(p43.m91006E1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC52534yz6 get() {
        return m19939c(this.f103146a, this.f103147b.get());
    }
}
