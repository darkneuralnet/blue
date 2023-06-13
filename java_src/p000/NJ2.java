package p000;
/* renamed from: NJ2 */
/* loaded from: classes4.dex */
public final class NJ2 implements InterfaceC48812sj1<InterfaceC37857aG6> {

    /* renamed from: a */
    public final VH2 f24431a;

    /* renamed from: b */
    public final Y94<InterfaceC41405gD6> f24432b;

    public NJ2(VH2 vh2, Y94<InterfaceC41405gD6> y94) {
        this.f24431a = vh2;
        this.f24432b = y94;
    }

    /* renamed from: a */
    public static NJ2 m94062a(VH2 vh2, Y94<InterfaceC41405gD6> y94) {
        return new NJ2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC37857aG6 m94060c(VH2 vh2, InterfaceC41405gD6 interfaceC41405gD6) {
        return (InterfaceC37857aG6) C51679xZ3.m5002e(vh2.m80081T0(interfaceC41405gD6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC37857aG6 get() {
        return m94060c(this.f24431a, this.f24432b.get());
    }
}
