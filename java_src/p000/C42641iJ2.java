package p000;
/* renamed from: iJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42641iJ2 implements InterfaceC48812sj1<InterfaceC31626Ab4> {

    /* renamed from: a */
    public final VH2 f87104a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f87105b;

    public C42641iJ2(VH2 vh2, Y94<InterfaceC1880Ea> y94) {
        this.f87104a = vh2;
        this.f87105b = y94;
    }

    /* renamed from: a */
    public static C42641iJ2 m34234a(VH2 vh2, Y94<InterfaceC1880Ea> y94) {
        return new C42641iJ2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC31626Ab4 m34232c(VH2 vh2, InterfaceC1880Ea interfaceC1880Ea) {
        return (InterfaceC31626Ab4) C51679xZ3.m5002e(vh2.m80046n0(interfaceC1880Ea));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC31626Ab4 get() {
        return m34232c(this.f87104a, this.f87105b.get());
    }
}
