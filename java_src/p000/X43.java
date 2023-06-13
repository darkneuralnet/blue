package p000;
/* renamed from: X43 */
/* loaded from: classes4.dex */
public final class X43 implements InterfaceC48812sj1<InterfaceC10736ab> {

    /* renamed from: a */
    public final P43 f42617a;

    /* renamed from: b */
    public final Y94<MN4> f42618b;

    public X43(P43 p43, Y94<MN4> y94) {
        this.f42617a = p43;
        this.f42618b = y94;
    }

    /* renamed from: a */
    public static X43 m77433a(P43 p43, Y94<MN4> y94) {
        return new X43(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC10736ab m77431c(P43 p43, MN4 mn4) {
        return (InterfaceC10736ab) C51679xZ3.m5002e(p43.m90935i(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC10736ab get() {
        return m77431c(this.f42617a, this.f42618b.get());
    }
}
