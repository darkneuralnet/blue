package co.bird.android.feature.frequentFlyer;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.frequentFlyer.FrequentFlyerActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.frequentFlyer.c */
/* loaded from: classes3.dex */
public final class C14852c implements InterfaceC48812sj1<ScopeProvider> {

    /* renamed from: a */
    public final Y94<BaseActivity> f64033a;

    public C14852c(Y94<BaseActivity> y94) {
        this.f64033a = y94;
    }

    /* renamed from: a */
    public static C14852c m58135a(Y94<BaseActivity> y94) {
        return new C14852c(y94);
    }

    /* renamed from: c */
    public static ScopeProvider m58133c(BaseActivity baseActivity) {
        return (ScopeProvider) C51679xZ3.m5002e(FrequentFlyerActivity.AbstractC14843b.m58150c(baseActivity));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ScopeProvider get() {
        return m58133c(this.f64033a.get());
    }
}
