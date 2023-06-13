package p000;
/* renamed from: c73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38956c73 implements InterfaceC48812sj1<InterfaceC41951h86> {

    /* renamed from: a */
    public final P43 f60135a;

    /* renamed from: b */
    public final Y94<MN4> f60136b;

    public C38956c73(P43 p43, Y94<MN4> y94) {
        this.f60135a = p43;
        this.f60136b = y94;
    }

    /* renamed from: a */
    public static C38956c73 m61919a(P43 p43, Y94<MN4> y94) {
        return new C38956c73(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC41951h86 m61917c(P43 p43, MN4 mn4) {
        return (InterfaceC41951h86) C51679xZ3.m5002e(p43.m90909q1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC41951h86 get() {
        return m61917c(this.f60135a, this.f60136b.get());
    }
}
