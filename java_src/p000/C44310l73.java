package p000;
/* renamed from: l73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44310l73 implements InterfaceC48812sj1<InterfaceC36587Vg6> {

    /* renamed from: a */
    public final P43 f95578a;

    /* renamed from: b */
    public final Y94<MN4> f95579b;

    public C44310l73(P43 p43, Y94<MN4> y94) {
        this.f95578a = p43;
        this.f95579b = y94;
    }

    /* renamed from: a */
    public static C44310l73 m27822a(P43 p43, Y94<MN4> y94) {
        return new C44310l73(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC36587Vg6 m27820c(P43 p43, MN4 mn4) {
        return (InterfaceC36587Vg6) C51679xZ3.m5002e(p43.m91018A1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC36587Vg6 get() {
        return m27820c(this.f95578a, this.f95579b.get());
    }
}
