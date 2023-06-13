package p000;
/* renamed from: Bn1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31965Bn1 implements InterfaceC48812sj1<C32036Bv0> {

    /* renamed from: a */
    public final C31731An1 f2887a;

    public C31965Bn1(C31731An1 c31731An1) {
        this.f2887a = c31731An1;
    }

    /* renamed from: a */
    public static C31965Bn1 m113492a(C31731An1 c31731An1) {
        return new C31965Bn1(c31731An1);
    }

    /* renamed from: c */
    public static C32036Bv0 m113490c(C31731An1 c31731An1) {
        return (C32036Bv0) C51679xZ3.m5004c(c31731An1.m115271a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C32036Bv0 get() {
        return m113490c(this.f2887a);
    }
}
