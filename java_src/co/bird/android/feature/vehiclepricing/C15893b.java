package co.bird.android.feature.vehiclepricing;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.vehiclepricing.VehiclePricingActivity;
/* renamed from: co.bird.android.feature.vehiclepricing.b */
/* loaded from: classes3.dex */
public final class C15893b implements InterfaceC48812sj1<BaseActivity> {

    /* renamed from: a */
    public final VehiclePricingActivity.C15883b f65885a;

    public C15893b(VehiclePricingActivity.C15883b c15883b) {
        this.f65885a = c15883b;
    }

    /* renamed from: a */
    public static BaseActivity m56320a(VehiclePricingActivity.C15883b c15883b) {
        return (BaseActivity) C51679xZ3.m5002e(c15883b.m56339a());
    }

    /* renamed from: b */
    public static C15893b m56319b(VehiclePricingActivity.C15883b c15883b) {
        return new C15893b(c15883b);
    }

    @Override // p000.Y94
    /* renamed from: c */
    public BaseActivity get() {
        return m56320a(this.f65885a);
    }
}
