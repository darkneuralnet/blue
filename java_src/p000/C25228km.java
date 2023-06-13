package p000;

import co.bird.android.runtime.logging.ApplicationVisibilityTracker;
/* renamed from: km */
/* loaded from: classes4.dex */
public final class C25228km implements InterfaceC48812sj1<ApplicationVisibilityTracker> {

    /* renamed from: a */
    public final Y94<C22454gl> f94886a;

    public C25228km(Y94<C22454gl> y94) {
        this.f94886a = y94;
    }

    /* renamed from: a */
    public static C25228km m28483a(Y94<C22454gl> y94) {
        return new C25228km(y94);
    }

    /* renamed from: c */
    public static ApplicationVisibilityTracker m28481c(C22454gl c22454gl) {
        return new ApplicationVisibilityTracker(c22454gl);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ApplicationVisibilityTracker get() {
        return m28481c(this.f94886a.get());
    }
}
