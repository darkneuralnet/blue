package p000;
/* renamed from: Hn1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33369Hn1 implements InterfaceC48812sj1<X94<U96>> {

    /* renamed from: a */
    public final C31731An1 f13882a;

    public C33369Hn1(C31731An1 c31731An1) {
        this.f13882a = c31731An1;
    }

    /* renamed from: a */
    public static C33369Hn1 m103433a(C31731An1 c31731An1) {
        return new C33369Hn1(c31731An1);
    }

    /* renamed from: c */
    public static X94<U96> m103431c(C31731An1 c31731An1) {
        return (X94) C51679xZ3.m5004c(c31731An1.m115265g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p000.Y94
    /* renamed from: b */
    public X94<U96> get() {
        return m103431c(this.f13882a);
    }
}
