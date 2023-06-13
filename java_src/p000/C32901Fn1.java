package p000;

import com.google.firebase.perf.config.RemoteConfigManager;
/* renamed from: Fn1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32901Fn1 implements InterfaceC48812sj1<RemoteConfigManager> {

    /* renamed from: a */
    public final C31731An1 f10212a;

    public C32901Fn1(C31731An1 c31731An1) {
        this.f10212a = c31731An1;
    }

    /* renamed from: a */
    public static C32901Fn1 m106473a(C31731An1 c31731An1) {
        return new C32901Fn1(c31731An1);
    }

    /* renamed from: c */
    public static RemoteConfigManager m106471c(C31731An1 c31731An1) {
        return (RemoteConfigManager) C51679xZ3.m5004c(c31731An1.m115267e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p000.Y94
    /* renamed from: b */
    public RemoteConfigManager get() {
        return m106471c(this.f10212a);
    }
}
