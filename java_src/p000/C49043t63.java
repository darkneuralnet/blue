package p000;
/* renamed from: t63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49043t63 implements InterfaceC48812sj1<InterfaceC42606iF3> {

    /* renamed from: a */
    public final P43 f109863a;

    /* renamed from: b */
    public final Y94<MN4> f109864b;

    public C49043t63(P43 p43, Y94<MN4> y94) {
        this.f109863a = p43;
        this.f109864b = y94;
    }

    /* renamed from: a */
    public static C49043t63 m13072a(P43 p43, Y94<MN4> y94) {
        return new C49043t63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC42606iF3 m13070c(P43 p43, MN4 mn4) {
        return (InterfaceC42606iF3) C51679xZ3.m5002e(p43.m91001G0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC42606iF3 get() {
        return m13070c(this.f109863a, this.f109864b.get());
    }
}
