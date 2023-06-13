package p000;
/* renamed from: L53 */
/* loaded from: classes4.dex */
public final class L53 implements InterfaceC48812sj1<C45444n21> {

    /* renamed from: a */
    public final P43 f20738a;

    /* renamed from: b */
    public final Y94<InterfaceC46037o21> f20739b;

    public L53(P43 p43, Y94<InterfaceC46037o21> y94) {
        this.f20738a = p43;
        this.f20739b = y94;
    }

    /* renamed from: a */
    public static L53 m97792a(P43 p43, Y94<InterfaceC46037o21> y94) {
        return new L53(p43, y94);
    }

    /* renamed from: c */
    public static C45444n21 m97790c(P43 p43, InterfaceC46037o21 interfaceC46037o21) {
        return (C45444n21) C51679xZ3.m5002e(p43.m90967W(interfaceC46037o21));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C45444n21 get() {
        return m97790c(this.f20738a, this.f20739b.get());
    }
}
