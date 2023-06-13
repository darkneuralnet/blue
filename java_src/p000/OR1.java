package p000;

import co.bird.android.feature.servicecenter.idtools.landing.IdToolsLandingActivity;
import dagger.MembersInjector;
/* renamed from: OR1 */
/* loaded from: classes3.dex */
public final class OR1 implements MembersInjector<IdToolsLandingActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f26566a;

    /* renamed from: b */
    public final Y94<C22454gl> f26567b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f26568c;

    /* renamed from: d */
    public final Y94<C40942fS1> f26569d;

    /* renamed from: e */
    public final Y94<RR1> f26570e;

    /* renamed from: a */
    public static void m92310a(IdToolsLandingActivity idToolsLandingActivity, RR1 rr1) {
        idToolsLandingActivity.f65368k = rr1;
    }

    /* renamed from: c */
    public static void m92308c(IdToolsLandingActivity idToolsLandingActivity, C40942fS1 c40942fS1) {
        idToolsLandingActivity.f65367j = c40942fS1;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(IdToolsLandingActivity idToolsLandingActivity) {
        C4650Ky.m98043b(idToolsLandingActivity, this.f26566a.get());
        C4650Ky.m98042c(idToolsLandingActivity, this.f26567b.get());
        C4650Ky.m98041d(idToolsLandingActivity, this.f26568c.get());
        m92308c(idToolsLandingActivity, this.f26569d.get());
        m92310a(idToolsLandingActivity, this.f26570e.get());
    }
}
