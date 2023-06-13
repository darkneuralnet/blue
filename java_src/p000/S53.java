package p000;
/* renamed from: S53 */
/* loaded from: classes4.dex */
public final class S53 implements InterfaceC48812sj1<InterfaceC51461xB1> {

    /* renamed from: a */
    public final P43 f33153a;

    /* renamed from: b */
    public final Y94<MN4> f33154b;

    public S53(P43 p43, Y94<MN4> y94) {
        this.f33153a = p43;
        this.f33154b = y94;
    }

    /* renamed from: a */
    public static S53 m86023a(P43 p43, Y94<MN4> y94) {
        return new S53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC51461xB1 m86021c(P43 p43, MN4 mn4) {
        return (InterfaceC51461xB1) C51679xZ3.m5002e(p43.m90946e0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC51461xB1 get() {
        return m86021c(this.f33153a, this.f33154b.get());
    }
}
