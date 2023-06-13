package p000;
/* renamed from: Z43 */
/* loaded from: classes4.dex */
public final class Z43 implements InterfaceC48812sj1<InterfaceC27326pg> {

    /* renamed from: a */
    public final P43 f47817a;

    /* renamed from: b */
    public final Y94<MN4> f47818b;

    public Z43(P43 p43, Y94<MN4> y94) {
        this.f47817a = p43;
        this.f47818b = y94;
    }

    /* renamed from: a */
    public static Z43 m73771a(P43 p43, Y94<MN4> y94) {
        return new Z43(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC27326pg m73769c(P43 p43, MN4 mn4) {
        return (InterfaceC27326pg) C51679xZ3.m5002e(p43.m90929k(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC27326pg get() {
        return m73769c(this.f47817a, this.f47818b.get());
    }
}
