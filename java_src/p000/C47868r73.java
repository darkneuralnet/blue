package p000;
/* renamed from: r73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47868r73 implements InterfaceC48812sj1<InterfaceC45008mI6> {

    /* renamed from: a */
    public final P43 f106485a;

    /* renamed from: b */
    public final Y94<MN4> f106486b;

    public C47868r73(P43 p43, Y94<MN4> y94) {
        this.f106485a = p43;
        this.f106486b = y94;
    }

    /* renamed from: a */
    public static C47868r73 m16465a(P43 p43, Y94<MN4> y94) {
        return new C47868r73(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC45008mI6 m16463c(P43 p43, MN4 mn4) {
        return (InterfaceC45008mI6) C51679xZ3.m5002e(p43.m91000G1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC45008mI6 get() {
        return m16463c(this.f106485a, this.f106486b.get());
    }
}
