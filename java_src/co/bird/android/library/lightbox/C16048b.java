package co.bird.android.library.lightbox;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.library.lightbox.LightboxActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.library.lightbox.b */
/* loaded from: classes3.dex */
public final class C16048b implements InterfaceC48812sj1<ScopeProvider> {

    /* renamed from: a */
    public final Y94<BaseActivity> f66113a;

    public C16048b(Y94<BaseActivity> y94) {
        this.f66113a = y94;
    }

    /* renamed from: a */
    public static C16048b m56020a(Y94<BaseActivity> y94) {
        return new C16048b(y94);
    }

    /* renamed from: c */
    public static ScopeProvider m56018c(BaseActivity baseActivity) {
        return (ScopeProvider) C51679xZ3.m5002e(LightboxActivity.AbstractC16042c.m56035b(baseActivity));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ScopeProvider get() {
        return m56018c(this.f66113a.get());
    }
}
