package p000;
/* renamed from: t73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49053t73 implements InterfaceC48812sj1<InterfaceC39640dF1> {

    /* renamed from: a */
    public final P43 f109889a;

    /* renamed from: b */
    public final Y94<MN4> f109890b;

    public C49053t73(P43 p43, Y94<MN4> y94) {
        this.f109889a = p43;
        this.f109890b = y94;
    }

    /* renamed from: a */
    public static C49053t73 m13036a(P43 p43, Y94<MN4> y94) {
        return new C49053t73(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC39640dF1 m13034c(P43 p43, MN4 mn4) {
        return (InterfaceC39640dF1) C51679xZ3.m5002e(p43.m90994I1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC39640dF1 get() {
        return m13034c(this.f109889a, this.f109890b.get());
    }
}
