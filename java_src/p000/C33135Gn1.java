package p000;

import com.google.firebase.perf.session.SessionManager;
/* renamed from: Gn1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33135Gn1 implements InterfaceC48812sj1<SessionManager> {

    /* renamed from: a */
    public final C31731An1 f12416a;

    public C33135Gn1(C31731An1 c31731An1) {
        this.f12416a = c31731An1;
    }

    /* renamed from: a */
    public static C33135Gn1 m104760a(C31731An1 c31731An1) {
        return new C33135Gn1(c31731An1);
    }

    /* renamed from: c */
    public static SessionManager m104758c(C31731An1 c31731An1) {
        return (SessionManager) C51679xZ3.m5004c(c31731An1.m115266f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p000.Y94
    /* renamed from: b */
    public SessionManager get() {
        return m104758c(this.f12416a);
    }
}
