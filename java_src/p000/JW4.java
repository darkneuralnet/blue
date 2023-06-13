package p000;

import co.bird.android.feature.ridepass.p019v4.details.RidePassV4DetailsActivity;
import dagger.MembersInjector;
/* renamed from: JW4 */
/* loaded from: classes3.dex */
public final class JW4 implements MembersInjector<RidePassV4DetailsActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f17712a;

    /* renamed from: b */
    public final Y94<C22454gl> f17713b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f17714c;

    /* renamed from: d */
    public final Y94<C38601bX4> f17715d;

    /* renamed from: b */
    public static void m100311b(RidePassV4DetailsActivity ridePassV4DetailsActivity, C38601bX4 c38601bX4) {
        ridePassV4DetailsActivity.f64851j = c38601bX4;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(RidePassV4DetailsActivity ridePassV4DetailsActivity) {
        C4650Ky.m98043b(ridePassV4DetailsActivity, this.f17712a.get());
        C4650Ky.m98042c(ridePassV4DetailsActivity, this.f17713b.get());
        C4650Ky.m98041d(ridePassV4DetailsActivity, this.f17714c.get());
        m100311b(ridePassV4DetailsActivity, this.f17715d.get());
    }
}
