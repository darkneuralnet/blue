package p000;
/* renamed from: Q53 */
/* loaded from: classes4.dex */
public final class Q53 implements InterfaceC48812sj1<InterfaceC49475tq1> {

    /* renamed from: a */
    public final P43 f29817a;

    /* renamed from: b */
    public final Y94<MN4> f29818b;

    public Q53(P43 p43, Y94<MN4> y94) {
        this.f29817a = p43;
        this.f29818b = y94;
    }

    /* renamed from: a */
    public static Q53 m88939a(P43 p43, Y94<MN4> y94) {
        return new Q53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC49475tq1 m88937c(P43 p43, MN4 mn4) {
        return (InterfaceC49475tq1) C51679xZ3.m5002e(p43.m90952c0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC49475tq1 get() {
        return m88937c(this.f29817a, this.f29818b.get());
    }
}
