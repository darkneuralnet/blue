package p000;
/* renamed from: cI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39057cI2 implements InterfaceC48812sj1<InterfaceC36187To2> {

    /* renamed from: a */
    public final VH2 f60363a;

    /* renamed from: b */
    public final Y94<InterfaceC48624sP2> f60364b;

    public C39057cI2(VH2 vh2, Y94<InterfaceC48624sP2> y94) {
        this.f60363a = vh2;
        this.f60364b = y94;
    }

    /* renamed from: a */
    public static C39057cI2 m61622a(VH2 vh2, Y94<InterfaceC48624sP2> y94) {
        return new C39057cI2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC36187To2 m61620c(VH2 vh2, InterfaceC48624sP2 interfaceC48624sP2) {
        return (InterfaceC36187To2) C51679xZ3.m5002e(vh2.m80061g(interfaceC48624sP2));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC36187To2 get() {
        return m61620c(this.f60363a, this.f60364b.get());
    }
}
