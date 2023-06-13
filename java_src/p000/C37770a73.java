package p000;
/* renamed from: a73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37770a73 implements InterfaceC48812sj1<InterfaceC48717sZ5> {

    /* renamed from: a */
    public final P43 f49846a;

    /* renamed from: b */
    public final Y94<MN4> f49847b;

    public C37770a73(P43 p43, Y94<MN4> y94) {
        this.f49846a = p43;
        this.f49847b = y94;
    }

    /* renamed from: a */
    public static C37770a73 m71879a(P43 p43, Y94<MN4> y94) {
        return new C37770a73(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC48717sZ5 m71877c(P43 p43, MN4 mn4) {
        return (InterfaceC48717sZ5) C51679xZ3.m5002e(p43.m90915o1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC48717sZ5 get() {
        return m71877c(this.f49846a, this.f49847b.get());
    }
}
