package co.bird.android.feature.vehiclepricing;

import co.bird.android.feature.vehiclepricing.VehiclePricingActivity;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: co.bird.android.feature.vehiclepricing.d */
/* loaded from: classes3.dex */
public final class C15895d implements InterfaceC48812sj1<LifecycleScopeProvider<EnumC7097RE>> {

    /* renamed from: a */
    public final VehiclePricingActivity.C15883b f65887a;

    public C15895d(VehiclePricingActivity.C15883b c15883b) {
        this.f65887a = c15883b;
    }

    /* renamed from: a */
    public static C15895d m56314a(VehiclePricingActivity.C15883b c15883b) {
        return new C15895d(c15883b);
    }

    /* renamed from: c */
    public static LifecycleScopeProvider<EnumC7097RE> m56312c(VehiclePricingActivity.C15883b c15883b) {
        return (LifecycleScopeProvider) C51679xZ3.m5002e(c15883b.m56337c());
    }

    @Override // p000.Y94
    /* renamed from: b */
    public LifecycleScopeProvider<EnumC7097RE> get() {
        return m56312c(this.f65887a);
    }
}
