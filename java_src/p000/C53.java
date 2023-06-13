package p000;
/* renamed from: C53 */
/* loaded from: classes4.dex */
public final class C53 implements InterfaceC48812sj1<InterfaceC37130Xp0> {

    /* renamed from: a */
    public final P43 f3379a;

    /* renamed from: b */
    public final Y94<MN4> f3380b;

    public C53(P43 p43, Y94<MN4> y94) {
        this.f3379a = p43;
        this.f3380b = y94;
    }

    /* renamed from: a */
    public static C53 m112899a(P43 p43, Y94<MN4> y94) {
        return new C53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC37130Xp0 m112897c(P43 p43, MN4 mn4) {
        return (InterfaceC37130Xp0) C51679xZ3.m5002e(p43.m90985N(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC37130Xp0 get() {
        return m112897c(this.f3379a, this.f3380b.get());
    }
}
