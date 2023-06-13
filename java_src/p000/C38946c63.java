package p000;
/* renamed from: c63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38946c63 implements InterfaceC48812sj1<InterfaceC42201ha2> {

    /* renamed from: a */
    public final P43 f60125a;

    /* renamed from: b */
    public final Y94<MN4> f60126b;

    public C38946c63(P43 p43, Y94<MN4> y94) {
        this.f60125a = p43;
        this.f60126b = y94;
    }

    /* renamed from: a */
    public static C38946c63 m61932a(P43 p43, Y94<MN4> y94) {
        return new C38946c63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC42201ha2 m61930c(P43 p43, MN4 mn4) {
        return (InterfaceC42201ha2) C51679xZ3.m5002e(p43.m90913p0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC42201ha2 get() {
        return m61930c(this.f60125a, this.f60126b.get());
    }
}
