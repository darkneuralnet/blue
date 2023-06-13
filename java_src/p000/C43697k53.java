package p000;
/* renamed from: k53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43697k53 implements InterfaceC48812sj1<InterfaceC8601VK> {

    /* renamed from: a */
    public final P43 f93885a;

    /* renamed from: b */
    public final Y94<MN4> f93886b;

    public C43697k53(P43 p43, Y94<MN4> y94) {
        this.f93885a = p43;
        this.f93886b = y94;
    }

    /* renamed from: a */
    public static C43697k53 m29331a(P43 p43, Y94<MN4> y94) {
        return new C43697k53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC8601VK m29329c(P43 p43, MN4 mn4) {
        return (InterfaceC8601VK) C51679xZ3.m5002e(p43.m90896v(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC8601VK get() {
        return m29329c(this.f93885a, this.f93886b.get());
    }
}
