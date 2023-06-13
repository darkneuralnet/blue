package co.bird.android.feature.vehiclepricing;

import co.bird.android.feature.vehiclepricing.VehiclePricingActivity;
/* renamed from: co.bird.android.feature.vehiclepricing.c */
/* loaded from: classes3.dex */
public final class C15894c implements InterfaceC48812sj1<Boolean> {

    /* renamed from: a */
    public final VehiclePricingActivity.C15883b f65886a;

    public C15894c(VehiclePricingActivity.C15883b c15883b) {
        this.f65886a = c15883b;
    }

    /* renamed from: a */
    public static C15894c m56317a(VehiclePricingActivity.C15883b c15883b) {
        return new C15894c(c15883b);
    }

    /* renamed from: b */
    public static boolean m56316b(VehiclePricingActivity.C15883b c15883b) {
        return c15883b.m56338b();
    }

    @Override // p000.Y94
    /* renamed from: c */
    public Boolean get() {
        return Boolean.valueOf(m56316b(this.f65886a));
    }
}
