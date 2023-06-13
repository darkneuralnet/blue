package p000;
/* renamed from: nJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45606nJ2 implements InterfaceC48812sj1<InterfaceC41018fa5> {

    /* renamed from: a */
    public final VH2 f99740a;

    /* renamed from: b */
    public final Y94<InterfaceC40425ea5> f99741b;

    public C45606nJ2(VH2 vh2, Y94<InterfaceC40425ea5> y94) {
        this.f99740a = vh2;
        this.f99741b = y94;
    }

    /* renamed from: a */
    public static C45606nJ2 m23984a(VH2 vh2, Y94<InterfaceC40425ea5> y94) {
        return new C45606nJ2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC41018fa5 m23982c(VH2 vh2, InterfaceC40425ea5 interfaceC40425ea5) {
        return (InterfaceC41018fa5) C51679xZ3.m5002e(vh2.m80034t0(interfaceC40425ea5));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC41018fa5 get() {
        return m23982c(this.f99740a, this.f99741b.get());
    }
}
