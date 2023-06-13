package p000;
/* renamed from: b73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38363b73 implements InterfaceC48812sj1<GZ5> {

    /* renamed from: a */
    public final P43 f56942a;

    /* renamed from: b */
    public final Y94<MN4> f56943b;

    public C38363b73(P43 p43, Y94<MN4> y94) {
        this.f56942a = p43;
        this.f56943b = y94;
    }

    /* renamed from: a */
    public static C38363b73 m64951a(P43 p43, Y94<MN4> y94) {
        return new C38363b73(p43, y94);
    }

    /* renamed from: c */
    public static GZ5 m64949c(P43 p43, MN4 mn4) {
        return (GZ5) C51679xZ3.m5002e(p43.m90912p1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public GZ5 get() {
        return m64949c(this.f56942a, this.f56943b.get());
    }
}
