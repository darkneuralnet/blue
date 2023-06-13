package p000;
/* renamed from: w63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50821w63 implements InterfaceC48812sj1<ML3> {

    /* renamed from: a */
    public final P43 f115376a;

    /* renamed from: b */
    public final Y94<MN4> f115377b;

    public C50821w63(P43 p43, Y94<MN4> y94) {
        this.f115376a = p43;
        this.f115377b = y94;
    }

    /* renamed from: a */
    public static C50821w63 m7408a(P43 p43, Y94<MN4> y94) {
        return new C50821w63(p43, y94);
    }

    /* renamed from: c */
    public static ML3 m7406c(P43 p43, MN4 mn4) {
        return (ML3) C51679xZ3.m5002e(p43.m90992J0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ML3 get() {
        return m7406c(this.f115376a, this.f115377b.get());
    }
}
