package p000;

import co.bird.android.feature.ridepass.p018v2.list.RidePassV2Activity;
import dagger.MembersInjector;
/* renamed from: OV4 */
/* loaded from: classes3.dex */
public final class OV4 implements MembersInjector<RidePassV2Activity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f26709a;

    /* renamed from: b */
    public final Y94<C22454gl> f26710b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f26711c;

    /* renamed from: d */
    public final Y94<C49282tW4> f26712d;

    /* renamed from: e */
    public final Y94<PV4> f26713e;

    /* renamed from: a */
    public static void m92129a(RidePassV2Activity ridePassV2Activity, PV4 pv4) {
        ridePassV2Activity.f64821k = pv4;
    }

    /* renamed from: c */
    public static void m92127c(RidePassV2Activity ridePassV2Activity, C49282tW4 c49282tW4) {
        ridePassV2Activity.f64820j = c49282tW4;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(RidePassV2Activity ridePassV2Activity) {
        C4650Ky.m98043b(ridePassV2Activity, this.f26709a.get());
        C4650Ky.m98042c(ridePassV2Activity, this.f26710b.get());
        C4650Ky.m98041d(ridePassV2Activity, this.f26711c.get());
        m92127c(ridePassV2Activity, this.f26712d.get());
        m92129a(ridePassV2Activity, this.f26713e.get());
    }
}
