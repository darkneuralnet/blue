package p000;
/* renamed from: s63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48450s63 implements InterfaceC48812sj1<InterfaceC36863Wl3> {

    /* renamed from: a */
    public final P43 f108263a;

    /* renamed from: b */
    public final Y94<MN4> f108264b;

    public C48450s63(P43 p43, Y94<MN4> y94) {
        this.f108263a = p43;
        this.f108264b = y94;
    }

    /* renamed from: a */
    public static C48450s63 m14776a(P43 p43, Y94<MN4> y94) {
        return new C48450s63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC36863Wl3 m14774c(P43 p43, MN4 mn4) {
        return (InterfaceC36863Wl3) C51679xZ3.m5002e(p43.m91004F0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC36863Wl3 get() {
        return m14774c(this.f108263a, this.f108264b.get());
    }
}
