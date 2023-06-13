package p000;
/* renamed from: RI2 */
/* loaded from: classes4.dex */
public final class RI2 implements InterfaceC48812sj1<InterfaceC32292Cx4> {

    /* renamed from: a */
    public final VH2 f31819a;

    /* renamed from: b */
    public final Y94<C35568Qx4> f31820b;

    public RI2(VH2 vh2, Y94<C35568Qx4> y94) {
        this.f31819a = vh2;
        this.f31820b = y94;
    }

    /* renamed from: a */
    public static RI2 m86976a(VH2 vh2, Y94<C35568Qx4> y94) {
        return new RI2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC32292Cx4 m86974c(VH2 vh2, C35568Qx4 c35568Qx4) {
        return (InterfaceC32292Cx4) C51679xZ3.m5002e(vh2.m80077W(c35568Qx4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC32292Cx4 get() {
        return m86974c(this.f31819a, this.f31820b.get());
    }
}
