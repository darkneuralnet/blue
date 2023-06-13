package p000;
/* renamed from: h73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41938h73 implements InterfaceC48812sj1<InterfaceC39884df6> {

    /* renamed from: a */
    public final P43 f84714a;

    /* renamed from: b */
    public final Y94<MN4> f84715b;

    public C41938h73(P43 p43, Y94<MN4> y94) {
        this.f84714a = p43;
        this.f84715b = y94;
    }

    /* renamed from: a */
    public static C41938h73 m36840a(P43 p43, Y94<MN4> y94) {
        return new C41938h73(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC39884df6 m36838c(P43 p43, MN4 mn4) {
        return (InterfaceC39884df6) C51679xZ3.m5002e(p43.m90891w1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC39884df6 get() {
        return m36838c(this.f84714a, this.f84715b.get());
    }
}
