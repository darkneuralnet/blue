package p000;

import co.bird.android.feature.birdplus.p011v1.list.BirdPlusLandingActivity;
import dagger.MembersInjector;
/* renamed from: yQ */
/* loaded from: classes3.dex */
public final class C30591yQ implements MembersInjector<BirdPlusLandingActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f119500a;

    /* renamed from: b */
    public final Y94<C22454gl> f119501b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f119502c;

    /* renamed from: d */
    public final Y94<C2265FQ> f119503d;

    /* renamed from: b */
    public static void m3514b(BirdPlusLandingActivity birdPlusLandingActivity, C2265FQ c2265fq) {
        birdPlusLandingActivity.f63365j = c2265fq;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(BirdPlusLandingActivity birdPlusLandingActivity) {
        C4650Ky.m98043b(birdPlusLandingActivity, this.f119500a.get());
        C4650Ky.m98042c(birdPlusLandingActivity, this.f119501b.get());
        C4650Ky.m98041d(birdPlusLandingActivity, this.f119502c.get());
        m3514b(birdPlusLandingActivity, this.f119503d.get());
    }
}
