package p000;
/* renamed from: GJ2 */
/* loaded from: classes4.dex */
public final class GJ2 implements InterfaceC48812sj1<InterfaceC38127aj6> {

    /* renamed from: a */
    public final VH2 f11613a;

    /* renamed from: b */
    public final Y94<AbstractC39873de5> f11614b;

    public GJ2(VH2 vh2, Y94<AbstractC39873de5> y94) {
        this.f11613a = vh2;
        this.f11614b = y94;
    }

    /* renamed from: a */
    public static GJ2 m105409a(VH2 vh2, Y94<AbstractC39873de5> y94) {
        return new GJ2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC38127aj6 m105407c(VH2 vh2, AbstractC39873de5 abstractC39873de5) {
        return (InterfaceC38127aj6) C51679xZ3.m5002e(vh2.m80095M0(abstractC39873de5));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC38127aj6 get() {
        return m105407c(this.f11613a, this.f11614b.get());
    }
}
