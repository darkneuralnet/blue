package p000;
/* renamed from: k73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43717k73 implements InterfaceC48812sj1<InterfaceC36119Tg6> {

    /* renamed from: a */
    public final P43 f93958a;

    /* renamed from: b */
    public final Y94<MN4> f93959b;

    public C43717k73(P43 p43, Y94<MN4> y94) {
        this.f93958a = p43;
        this.f93959b = y94;
    }

    /* renamed from: a */
    public static C43717k73 m29267a(P43 p43, Y94<MN4> y94) {
        return new C43717k73(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC36119Tg6 m29265c(P43 p43, MN4 mn4) {
        return (InterfaceC36119Tg6) C51679xZ3.m5002e(p43.m90882z1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC36119Tg6 get() {
        return m29265c(this.f93958a, this.f93959b.get());
    }
}
