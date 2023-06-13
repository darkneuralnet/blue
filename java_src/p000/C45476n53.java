package p000;
/* renamed from: n53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45476n53 implements InterfaceC48812sj1<InterfaceC40359eT2> {

    /* renamed from: a */
    public final P43 f99340a;

    /* renamed from: b */
    public final Y94<MN4> f99341b;

    public C45476n53(P43 p43, Y94<MN4> y94) {
        this.f99340a = p43;
        this.f99341b = y94;
    }

    /* renamed from: a */
    public static C45476n53 m24482a(P43 p43, Y94<MN4> y94) {
        return new C45476n53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC40359eT2 m24480c(P43 p43, MN4 mn4) {
        return (InterfaceC40359eT2) C51679xZ3.m5002e(p43.m90887y(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC40359eT2 get() {
        return m24480c(this.f99340a, this.f99341b.get());
    }
}
