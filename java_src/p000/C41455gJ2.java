package p000;
/* renamed from: gJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41455gJ2 implements InterfaceC48812sj1<InterfaceC49597u24> {

    /* renamed from: a */
    public final VH2 f81961a;

    /* renamed from: b */
    public final Y94<InterfaceC49004t24> f81962b;

    public C41455gJ2(VH2 vh2, Y94<InterfaceC49004t24> y94) {
        this.f81961a = vh2;
        this.f81962b = y94;
    }

    /* renamed from: a */
    public static C41455gJ2 m39647a(VH2 vh2, Y94<InterfaceC49004t24> y94) {
        return new C41455gJ2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC49597u24 m39645c(VH2 vh2, InterfaceC49004t24 interfaceC49004t24) {
        return (InterfaceC49597u24) C51679xZ3.m5002e(vh2.m80050l0(interfaceC49004t24));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC49597u24 get() {
        return m39645c(this.f81961a, this.f81962b.get());
    }
}
