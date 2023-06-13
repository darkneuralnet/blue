package p000;

import co.bird.android.feature.birdplus.p011v1.details.BirdPlusDetailsActivity;
import co.bird.android.feature.birdplus.p011v1.details.C14537a;
import dagger.MembersInjector;
/* renamed from: FP */
/* loaded from: classes3.dex */
public final class C2235FP implements MembersInjector<BirdPlusDetailsActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f9286a;

    /* renamed from: b */
    public final Y94<C22454gl> f9287b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f9288c;

    /* renamed from: d */
    public final Y94<C14537a> f9289d;

    /* renamed from: b */
    public static void m107257b(BirdPlusDetailsActivity birdPlusDetailsActivity, C14537a c14537a) {
        birdPlusDetailsActivity.f63282j = c14537a;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(BirdPlusDetailsActivity birdPlusDetailsActivity) {
        C4650Ky.m98043b(birdPlusDetailsActivity, this.f9286a.get());
        C4650Ky.m98042c(birdPlusDetailsActivity, this.f9287b.get());
        C4650Ky.m98041d(birdPlusDetailsActivity, this.f9288c.get());
        m107257b(birdPlusDetailsActivity, this.f9289d.get());
    }
}
