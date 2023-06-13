package p000;
/* renamed from: n73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45496n73 implements InterfaceC48812sj1<InterfaceC32537Dy6> {

    /* renamed from: a */
    public final P43 f99473a;

    /* renamed from: b */
    public final Y94<MN4> f99474b;

    public C45496n73(P43 p43, Y94<MN4> y94) {
        this.f99473a = p43;
        this.f99474b = y94;
    }

    /* renamed from: a */
    public static C45496n73 m24312a(P43 p43, Y94<MN4> y94) {
        return new C45496n73(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC32537Dy6 m24310c(P43 p43, MN4 mn4) {
        return (InterfaceC32537Dy6) C51679xZ3.m5002e(p43.m91012C1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC32537Dy6 get() {
        return m24310c(this.f99473a, this.f99474b.get());
    }
}
