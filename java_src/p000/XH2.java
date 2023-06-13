package p000;
/* renamed from: XH2 */
/* loaded from: classes4.dex */
public final class XH2 implements InterfaceC48812sj1<InterfaceC29169uL> {

    /* renamed from: a */
    public final VH2 f42956a;

    /* renamed from: b */
    public final Y94<C29862wL> f42957b;

    public XH2(VH2 vh2, Y94<C29862wL> y94) {
        this.f42956a = vh2;
        this.f42957b = y94;
    }

    /* renamed from: a */
    public static InterfaceC29169uL m77160a(VH2 vh2, C29862wL c29862wL) {
        return (InterfaceC29169uL) C51679xZ3.m5002e(vh2.m80071b(c29862wL));
    }

    /* renamed from: b */
    public static XH2 m77159b(VH2 vh2, Y94<C29862wL> y94) {
        return new XH2(vh2, y94);
    }

    @Override // p000.Y94
    /* renamed from: c */
    public InterfaceC29169uL get() {
        return m77160a(this.f42956a, this.f42957b.get());
    }
}
