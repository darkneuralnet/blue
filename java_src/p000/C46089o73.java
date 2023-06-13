package p000;
/* renamed from: o73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46089o73 implements InterfaceC48812sj1<InterfaceC35813Ry6> {

    /* renamed from: a */
    public final P43 f101403a;

    /* renamed from: b */
    public final Y94<MN4> f101404b;

    public C46089o73(P43 p43, Y94<MN4> y94) {
        this.f101403a = p43;
        this.f101404b = y94;
    }

    /* renamed from: a */
    public static C46089o73 m21759a(P43 p43, Y94<MN4> y94) {
        return new C46089o73(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC35813Ry6 m21757c(P43 p43, MN4 mn4) {
        return (InterfaceC35813Ry6) C51679xZ3.m5002e(p43.m91009D1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC35813Ry6 get() {
        return m21757c(this.f101403a, this.f101404b.get());
    }
}
