package p000;

import co.bird.android.feature.rideendsummary.ridereport.RideReportActivity;
import dagger.MembersInjector;
/* renamed from: q35  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47237q35 implements MembersInjector<RideReportActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f104606a;

    /* renamed from: b */
    public final Y94<C22454gl> f104607b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f104608c;

    /* renamed from: d */
    public final Y94<F35> f104609d;

    /* renamed from: b */
    public static void m18245b(RideReportActivity rideReportActivity, F35 f35) {
        rideReportActivity.f64780j = f35;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(RideReportActivity rideReportActivity) {
        C4650Ky.m98043b(rideReportActivity, this.f104606a.get());
        C4650Ky.m98042c(rideReportActivity, this.f104607b.get());
        C4650Ky.m98041d(rideReportActivity, this.f104608c.get());
        m18245b(rideReportActivity, this.f104609d.get());
    }
}
