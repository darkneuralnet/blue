package co.bird.android.feature.frequentFlyer;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.frequentFlyer.FrequentFlyerActivity;
import co.bird.android.model.wire.WireFrequentFlyerView;
/* renamed from: co.bird.android.feature.frequentFlyer.b */
/* loaded from: classes3.dex */
public final class C14851b implements InterfaceC48812sj1<WireFrequentFlyerView> {

    /* renamed from: a */
    public final Y94<BaseActivity> f64032a;

    public C14851b(Y94<BaseActivity> y94) {
        this.f64032a = y94;
    }

    /* renamed from: a */
    public static C14851b m58138a(Y94<BaseActivity> y94) {
        return new C14851b(y94);
    }

    /* renamed from: b */
    public static WireFrequentFlyerView m58137b(BaseActivity baseActivity) {
        return (WireFrequentFlyerView) C51679xZ3.m5002e(FrequentFlyerActivity.AbstractC14843b.m58152a(baseActivity));
    }

    @Override // p000.Y94
    /* renamed from: c */
    public WireFrequentFlyerView get() {
        return m58137b(this.f64032a.get());
    }
}
