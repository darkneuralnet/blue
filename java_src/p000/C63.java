package p000;
/* renamed from: C63 */
/* loaded from: classes4.dex */
public final class C63 implements InterfaceC48812sj1<InterfaceC32967Fu4> {

    /* renamed from: a */
    public final P43 f3389a;

    /* renamed from: b */
    public final Y94<MN4> f3390b;

    public C63(P43 p43, Y94<MN4> y94) {
        this.f3389a = p43;
        this.f3390b = y94;
    }

    /* renamed from: a */
    public static C63 m112892a(P43 p43, Y94<MN4> y94) {
        return new C63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC32967Fu4 m112890c(P43 p43, MN4 mn4) {
        return (InterfaceC32967Fu4) C51679xZ3.m5002e(p43.m90978Q0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC32967Fu4 get() {
        return m112890c(this.f3389a, this.f3390b.get());
    }
}
