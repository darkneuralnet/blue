package p000;

import co.bird.android.feature.ridepass.p019v4.list.RidePassV4Activity;
import dagger.MembersInjector;
/* renamed from: zW4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52839zW4 implements MembersInjector<RidePassV4Activity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f121455a;

    /* renamed from: b */
    public final Y94<C22454gl> f121456b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f121457c;

    /* renamed from: d */
    public final Y94<C51662xX4> f121458d;

    /* renamed from: b */
    public static void m1273b(RidePassV4Activity ridePassV4Activity, C51662xX4 c51662xX4) {
        ridePassV4Activity.f64864j = c51662xX4;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(RidePassV4Activity ridePassV4Activity) {
        C4650Ky.m98043b(ridePassV4Activity, this.f121455a.get());
        C4650Ky.m98042c(ridePassV4Activity, this.f121456b.get());
        C4650Ky.m98041d(ridePassV4Activity, this.f121457c.get());
        m1273b(ridePassV4Activity, this.f121458d.get());
    }
}
