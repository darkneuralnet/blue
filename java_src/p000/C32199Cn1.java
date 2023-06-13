package p000;
/* renamed from: Cn1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32199Cn1 implements InterfaceC48812sj1<C31722Am1> {

    /* renamed from: a */
    public final C31731An1 f4661a;

    public C32199Cn1(C31731An1 c31731An1) {
        this.f4661a = c31731An1;
    }

    /* renamed from: a */
    public static C32199Cn1 m111694a(C31731An1 c31731An1) {
        return new C32199Cn1(c31731An1);
    }

    /* renamed from: c */
    public static C31722Am1 m111692c(C31731An1 c31731An1) {
        return (C31722Am1) C51679xZ3.m5004c(c31731An1.m115270b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C31722Am1 get() {
        return m111692c(this.f4661a);
    }
}
