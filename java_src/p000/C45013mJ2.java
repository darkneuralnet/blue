package p000;
/* renamed from: mJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45013mJ2 implements InterfaceC48812sj1<InterfaceC46893pU4> {

    /* renamed from: a */
    public final VH2 f97808a;

    /* renamed from: b */
    public final Y94<InterfaceC35660Rh6> f97809b;

    public C45013mJ2(VH2 vh2, Y94<InterfaceC35660Rh6> y94) {
        this.f97808a = vh2;
        this.f97809b = y94;
    }

    /* renamed from: a */
    public static C45013mJ2 m25833a(VH2 vh2, Y94<InterfaceC35660Rh6> y94) {
        return new C45013mJ2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC46893pU4 m25831c(VH2 vh2, InterfaceC35660Rh6 interfaceC35660Rh6) {
        return (InterfaceC46893pU4) C51679xZ3.m5002e(vh2.m80036s0(interfaceC35660Rh6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC46893pU4 get() {
        return m25831c(this.f97808a, this.f97809b.get());
    }
}
