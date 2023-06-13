package p000;

import co.bird.android.feature.transferorder.sku.vehicles.SkuOrderVehiclesActivity;
import dagger.MembersInjector;
/* renamed from: EC5 */
/* loaded from: classes3.dex */
public final class EC5 implements MembersInjector<SkuOrderVehiclesActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f7100a;

    /* renamed from: b */
    public final Y94<C22454gl> f7101b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f7102c;

    /* renamed from: d */
    public final Y94<MC5> f7103d;

    /* renamed from: e */
    public final Y94<GC5> f7104e;

    /* renamed from: a */
    public static void m109306a(SkuOrderVehiclesActivity skuOrderVehiclesActivity, GC5 gc5) {
        skuOrderVehiclesActivity.f65836k = gc5;
    }

    /* renamed from: c */
    public static void m109304c(SkuOrderVehiclesActivity skuOrderVehiclesActivity, MC5 mc5) {
        skuOrderVehiclesActivity.f65835j = mc5;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(SkuOrderVehiclesActivity skuOrderVehiclesActivity) {
        C4650Ky.m98043b(skuOrderVehiclesActivity, this.f7100a.get());
        C4650Ky.m98042c(skuOrderVehiclesActivity, this.f7101b.get());
        C4650Ky.m98041d(skuOrderVehiclesActivity, this.f7102c.get());
        m109304c(skuOrderVehiclesActivity, this.f7103d.get());
        m109306a(skuOrderVehiclesActivity, this.f7104e.get());
    }
}
