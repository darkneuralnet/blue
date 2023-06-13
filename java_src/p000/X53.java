package p000;
/* renamed from: X53 */
/* loaded from: classes4.dex */
public final class X53 implements InterfaceC48812sj1<InterfaceC43415jd0> {

    /* renamed from: a */
    public final P43 f42631a;

    /* renamed from: b */
    public final Y94<MN4> f42632b;

    public X53(P43 p43, Y94<MN4> y94) {
        this.f42631a = p43;
        this.f42632b = y94;
    }

    /* renamed from: a */
    public static X53 m77421a(P43 p43, Y94<MN4> y94) {
        return new X53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC43415jd0 m77419c(P43 p43, MN4 mn4) {
        return (InterfaceC43415jd0) C51679xZ3.m5002e(p43.m90928k0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC43415jd0 get() {
        return m77419c(this.f42631a, this.f42632b.get());
    }
}
