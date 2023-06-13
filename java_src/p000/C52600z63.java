package p000;
/* renamed from: z63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52600z63 implements InterfaceC48812sj1<InterfaceC49004t24> {

    /* renamed from: a */
    public final P43 f120792a;

    /* renamed from: b */
    public final Y94<MN4> f120793b;

    public C52600z63(P43 p43, Y94<MN4> y94) {
        this.f120792a = p43;
        this.f120793b = y94;
    }

    /* renamed from: a */
    public static C52600z63 m1800a(P43 p43, Y94<MN4> y94) {
        return new C52600z63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC49004t24 m1798c(P43 p43, MN4 mn4) {
        return (InterfaceC49004t24) C51679xZ3.m5002e(p43.m90984N0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC49004t24 get() {
        return m1798c(this.f120792a, this.f120793b.get());
    }
}
