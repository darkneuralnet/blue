package p000;
/* renamed from: m73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44903m73 implements InterfaceC48812sj1<InterfaceC48837sl6> {

    /* renamed from: a */
    public final P43 f97376a;

    /* renamed from: b */
    public final Y94<MN4> f97377b;

    public C44903m73(P43 p43, Y94<MN4> y94) {
        this.f97376a = p43;
        this.f97377b = y94;
    }

    /* renamed from: a */
    public static C44903m73 m26313a(P43 p43, Y94<MN4> y94) {
        return new C44903m73(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC48837sl6 m26311c(P43 p43, MN4 mn4) {
        return (InterfaceC48837sl6) C51679xZ3.m5002e(p43.m91015B1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC48837sl6 get() {
        return m26311c(this.f97376a, this.f97377b.get());
    }
}
