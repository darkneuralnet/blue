package p000;
/* renamed from: d63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39557d63 implements InterfaceC48812sj1<InterfaceC34207Lc2> {

    /* renamed from: a */
    public final P43 f76121a;

    /* renamed from: b */
    public final Y94<MN4> f76122b;

    public C39557d63(P43 p43, Y94<MN4> y94) {
        this.f76121a = p43;
        this.f76122b = y94;
    }

    /* renamed from: a */
    public static C39557d63 m44608a(P43 p43, Y94<MN4> y94) {
        return new C39557d63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC34207Lc2 m44606c(P43 p43, MN4 mn4) {
        return (InterfaceC34207Lc2) C51679xZ3.m5002e(p43.m90910q0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC34207Lc2 get() {
        return m44606c(this.f76121a, this.f76122b.get());
    }
}
