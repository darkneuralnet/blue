package p000;
/* renamed from: e53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40139e53 implements InterfaceC48812sj1<InterfaceC8797Vo> {

    /* renamed from: a */
    public final P43 f77936a;

    /* renamed from: b */
    public final Y94<MN4> f77937b;

    public C40139e53(P43 p43, Y94<MN4> y94) {
        this.f77936a = p43;
        this.f77937b = y94;
    }

    /* renamed from: a */
    public static C40139e53 m43291a(P43 p43, Y94<MN4> y94) {
        return new C40139e53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC8797Vo m43289c(P43 p43, MN4 mn4) {
        return (InterfaceC8797Vo) C51679xZ3.m5002e(p43.m90914p(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC8797Vo get() {
        return m43289c(this.f77936a, this.f77937b.get());
    }
}
