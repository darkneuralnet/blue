package co.bird.android.feature.rider.birdpay.input;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.rider.birdpay.input.C15365d;
/* renamed from: co.bird.android.feature.rider.birdpay.input.c */
/* loaded from: classes3.dex */
public final class C15364c implements InterfaceC48812sj1<C15365d.C15383a> {

    /* renamed from: a */
    public final Y94<BaseActivity> f64934a;

    public C15364c(Y94<BaseActivity> y94) {
        this.f64934a = y94;
    }

    /* renamed from: a */
    public static C15364c m57306a(Y94<BaseActivity> y94) {
        return new C15364c(y94);
    }

    /* renamed from: c */
    public static C15365d.C15383a m57304c(BaseActivity baseActivity) {
        return (C15365d.C15383a) C51679xZ3.m5002e(AbstractC15362b.m57311a(baseActivity));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C15365d.C15383a get() {
        return m57304c(this.f64934a.get());
    }
}
