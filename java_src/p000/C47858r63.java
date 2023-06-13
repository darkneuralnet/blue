package p000;
/* renamed from: r63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47858r63 implements InterfaceC48812sj1<InterfaceC36152Tk3> {

    /* renamed from: a */
    public final P43 f106473a;

    /* renamed from: b */
    public final Y94<MN4> f106474b;

    public C47858r63(P43 p43, Y94<MN4> y94) {
        this.f106473a = p43;
        this.f106474b = y94;
    }

    /* renamed from: a */
    public static C47858r63 m16483a(P43 p43, Y94<MN4> y94) {
        return new C47858r63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC36152Tk3 m16481c(P43 p43, MN4 mn4) {
        return (InterfaceC36152Tk3) C51679xZ3.m5002e(p43.m91007E0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC36152Tk3 get() {
        return m16481c(this.f106473a, this.f106474b.get());
    }
}
