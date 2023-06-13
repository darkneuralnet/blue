package p000;
/* renamed from: En1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32667En1 implements InterfaceC48812sj1<X94<C36486Uv4>> {

    /* renamed from: a */
    public final C31731An1 f8130a;

    public C32667En1(C31731An1 c31731An1) {
        this.f8130a = c31731An1;
    }

    /* renamed from: a */
    public static C32667En1 m108364a(C31731An1 c31731An1) {
        return new C32667En1(c31731An1);
    }

    /* renamed from: c */
    public static X94<C36486Uv4> m108362c(C31731An1 c31731An1) {
        return (X94) C51679xZ3.m5004c(c31731An1.m115268d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p000.Y94
    /* renamed from: b */
    public X94<C36486Uv4> get() {
        return m108362c(this.f8130a);
    }
}
