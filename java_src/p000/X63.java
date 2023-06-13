package p000;
/* renamed from: X63 */
/* loaded from: classes4.dex */
public final class X63 implements InterfaceC48812sj1<InterfaceC49283tW5> {

    /* renamed from: a */
    public final P43 f42646a;

    /* renamed from: b */
    public final Y94<MN4> f42647b;

    public X63(P43 p43, Y94<MN4> y94) {
        this.f42646a = p43;
        this.f42647b = y94;
    }

    /* renamed from: a */
    public static X63 m77397a(P43 p43, Y94<MN4> y94) {
        return new X63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC49283tW5 m77395c(P43 p43, MN4 mn4) {
        return (InterfaceC49283tW5) C51679xZ3.m5002e(p43.m90924l1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC49283tW5 get() {
        return m77395c(this.f42646a, this.f42647b.get());
    }
}
