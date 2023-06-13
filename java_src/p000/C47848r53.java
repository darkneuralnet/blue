package p000;
/* renamed from: r53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47848r53 implements InterfaceC48812sj1<InterfaceC22677hY> {

    /* renamed from: a */
    public final P43 f106448a;

    /* renamed from: b */
    public final Y94<MN4> f106449b;

    public C47848r53(P43 p43, Y94<MN4> y94) {
        this.f106448a = p43;
        this.f106449b = y94;
    }

    /* renamed from: a */
    public static C47848r53 m16503a(P43 p43, Y94<MN4> y94) {
        return new C47848r53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC22677hY m16501c(P43 p43, MN4 mn4) {
        return (InterfaceC22677hY) C51679xZ3.m5002e(p43.m91014C(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC22677hY get() {
        return m16501c(this.f106448a, this.f106449b.get());
    }
}
