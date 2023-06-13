package p000;
/* renamed from: k63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43707k63 implements InterfaceC48812sj1<InterfaceC50801w43> {

    /* renamed from: a */
    public final P43 f93908a;

    /* renamed from: b */
    public final Y94<MN4> f93909b;

    public C43707k63(P43 p43, Y94<MN4> y94) {
        this.f93908a = p43;
        this.f93909b = y94;
    }

    /* renamed from: a */
    public static C43707k63 m29293a(P43 p43, Y94<MN4> y94) {
        return new C43707k63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC50801w43 m29291c(P43 p43, MN4 mn4) {
        return (InterfaceC50801w43) C51679xZ3.m5002e(p43.m90889x0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC50801w43 get() {
        return m29291c(this.f93908a, this.f93909b.get());
    }
}
