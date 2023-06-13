package p000;
/* renamed from: x63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51414x63 implements InterfaceC48812sj1<WY3> {

    /* renamed from: a */
    public final P43 f117101a;

    /* renamed from: b */
    public final Y94<MN4> f117102b;

    public C51414x63(P43 p43, Y94<MN4> y94) {
        this.f117101a = p43;
        this.f117102b = y94;
    }

    /* renamed from: a */
    public static C51414x63 m5844a(P43 p43, Y94<MN4> y94) {
        return new C51414x63(p43, y94);
    }

    /* renamed from: c */
    public static WY3 m5842c(P43 p43, MN4 mn4) {
        return (WY3) C51679xZ3.m5002e(p43.m90988L0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public WY3 get() {
        return m5842c(this.f117101a, this.f117102b.get());
    }
}
