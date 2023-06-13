package p000;

import android.os.Handler;
/* renamed from: vk */
/* loaded from: classes4.dex */
public final class C29617vk implements InterfaceC48812sj1<Handler> {

    /* renamed from: a */
    public final C22711hj f114556a;

    public C29617vk(C22711hj c22711hj) {
        this.f114556a = c22711hj;
    }

    /* renamed from: a */
    public static C29617vk m8216a(C22711hj c22711hj) {
        return new C29617vk(c22711hj);
    }

    /* renamed from: c */
    public static Handler m8214c(C22711hj c22711hj) {
        return (Handler) C51679xZ3.m5002e(c22711hj.m35978o0());
    }

    @Override // p000.Y94
    /* renamed from: b */
    public Handler get() {
        return m8214c(this.f114556a);
    }
}
