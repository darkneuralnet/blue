package co.bird.android.feature.vehiclepricing;

import co.bird.android.feature.vehiclepricing.VehiclePricingActivity;
import co.bird.android.model.VehiclePricingDetails;
/* renamed from: co.bird.android.feature.vehiclepricing.e */
/* loaded from: classes3.dex */
public final class C15896e implements InterfaceC48812sj1<VehiclePricingDetails> {

    /* renamed from: a */
    public final VehiclePricingActivity.C15883b f65888a;

    public C15896e(VehiclePricingActivity.C15883b c15883b) {
        this.f65888a = c15883b;
    }

    /* renamed from: a */
    public static C15896e m56311a(VehiclePricingActivity.C15883b c15883b) {
        return new C15896e(c15883b);
    }

    /* renamed from: c */
    public static VehiclePricingDetails m56309c(VehiclePricingActivity.C15883b c15883b) {
        return c15883b.m56336d();
    }

    @Override // p000.Y94
    /* renamed from: b */
    public VehiclePricingDetails get() {
        return m56309c(this.f65888a);
    }
}
