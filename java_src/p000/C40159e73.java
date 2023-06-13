package p000;
/* renamed from: e73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40159e73 implements InterfaceC48812sj1<InterfaceC32555Ea6> {

    /* renamed from: a */
    public final P43 f77965a;

    /* renamed from: b */
    public final Y94<MN4> f77966b;

    public C40159e73(P43 p43, Y94<MN4> y94) {
        this.f77965a = p43;
        this.f77966b = y94;
    }

    /* renamed from: a */
    public static C40159e73 m43271a(P43 p43, Y94<MN4> y94) {
        return new C40159e73(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC32555Ea6 m43269c(P43 p43, MN4 mn4) {
        return (InterfaceC32555Ea6) C51679xZ3.m5002e(p43.m90903s1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC32555Ea6 get() {
        return m43269c(this.f77965a, this.f77966b.get());
    }
}
