package p000;
/* renamed from: i63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42521i63 implements InterfaceC48812sj1<XW2> {

    /* renamed from: a */
    public final P43 f86755a;

    /* renamed from: b */
    public final Y94<MN4> f86756b;

    public C42521i63(P43 p43, Y94<MN4> y94) {
        this.f86755a = p43;
        this.f86756b = y94;
    }

    /* renamed from: a */
    public static C42521i63 m34446a(P43 p43, Y94<MN4> y94) {
        return new C42521i63(p43, y94);
    }

    /* renamed from: c */
    public static XW2 m34444c(P43 p43, MN4 mn4) {
        return (XW2) C51679xZ3.m5002e(p43.m90895v0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public XW2 get() {
        return m34444c(this.f86755a, this.f86756b.get());
    }
}
