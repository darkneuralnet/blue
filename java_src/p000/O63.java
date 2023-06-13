package p000;
/* renamed from: O63 */
/* loaded from: classes4.dex */
public final class O63 implements InterfaceC48812sj1<InterfaceC44666lj5> {

    /* renamed from: a */
    public final P43 f25892a;

    /* renamed from: b */
    public final Y94<MN4> f25893b;

    public O63(P43 p43, Y94<MN4> y94) {
        this.f25892a = p43;
        this.f25893b = y94;
    }

    /* renamed from: a */
    public static O63 m92913a(P43 p43, Y94<MN4> y94) {
        return new O63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC44666lj5 m92911c(P43 p43, MN4 mn4) {
        return (InterfaceC44666lj5) C51679xZ3.m5002e(p43.m90951c1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC44666lj5 get() {
        return m92911c(this.f25892a, this.f25893b.get());
    }
}
