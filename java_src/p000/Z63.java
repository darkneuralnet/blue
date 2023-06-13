package p000;
/* renamed from: Z63 */
/* loaded from: classes4.dex */
public final class Z63 implements InterfaceC48812sj1<InterfaceC43381jZ5> {

    /* renamed from: a */
    public final P43 f47844a;

    /* renamed from: b */
    public final Y94<MN4> f47845b;

    public Z63(P43 p43, Y94<MN4> y94) {
        this.f47844a = p43;
        this.f47845b = y94;
    }

    /* renamed from: a */
    public static Z63 m73726a(P43 p43, Y94<MN4> y94) {
        return new Z63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC43381jZ5 m73724c(P43 p43, MN4 mn4) {
        return (InterfaceC43381jZ5) C51679xZ3.m5002e(p43.m90918n1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC43381jZ5 get() {
        return m73724c(this.f47844a, this.f47845b.get());
    }
}
