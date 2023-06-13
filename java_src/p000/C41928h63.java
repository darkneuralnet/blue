package p000;
/* renamed from: h63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41928h63 implements InterfaceC48812sj1<InterfaceC51919xx4> {

    /* renamed from: a */
    public final P43 f84705a;

    /* renamed from: b */
    public final Y94<MN4> f84706b;

    public C41928h63(P43 p43, Y94<MN4> y94) {
        this.f84705a = p43;
        this.f84706b = y94;
    }

    /* renamed from: a */
    public static C41928h63 m36850a(P43 p43, Y94<MN4> y94) {
        return new C41928h63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC51919xx4 m36848c(P43 p43, MN4 mn4) {
        return (InterfaceC51919xx4) C51679xZ3.m5002e(p43.m90898u0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC51919xx4 get() {
        return m36848c(this.f84705a, this.f84706b.get());
    }
}
