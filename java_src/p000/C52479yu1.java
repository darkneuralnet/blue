package p000;

import co.bird.android.feature.flocktogether.FlockTogetherActivity;
import dagger.MembersInjector;
/* renamed from: yu1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52479yu1 implements MembersInjector<FlockTogetherActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f120380a;

    /* renamed from: b */
    public final Y94<C22454gl> f120381b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f120382c;

    /* renamed from: d */
    public final Y94<C31794Au1> f120383d;

    /* renamed from: b */
    public static void m2308b(FlockTogetherActivity flockTogetherActivity, C31794Au1 c31794Au1) {
        flockTogetherActivity.f64011j = c31794Au1;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(FlockTogetherActivity flockTogetherActivity) {
        C4650Ky.m98043b(flockTogetherActivity, this.f120380a.get());
        C4650Ky.m98042c(flockTogetherActivity, this.f120381b.get());
        C4650Ky.m98041d(flockTogetherActivity, this.f120382c.get());
        m2308b(flockTogetherActivity, this.f120383d.get());
    }
}
