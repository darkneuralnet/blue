package p000;

import co.bird.android.feature.birdplus.p011v1.purchased.BirdPlusPurchasedActivity;
import dagger.MembersInjector;
/* renamed from: WQ */
/* loaded from: classes3.dex */
public final class C9017WQ implements MembersInjector<BirdPlusPurchasedActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f40982a;

    /* renamed from: b */
    public final Y94<C22454gl> f40983b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f40984c;

    /* renamed from: d */
    public final Y94<C19750dR> f40985d;

    /* renamed from: b */
    public static void m78484b(BirdPlusPurchasedActivity birdPlusPurchasedActivity, C19750dR c19750dR) {
        birdPlusPurchasedActivity.f63369j = c19750dR;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(BirdPlusPurchasedActivity birdPlusPurchasedActivity) {
        C4650Ky.m98043b(birdPlusPurchasedActivity, this.f40982a.get());
        C4650Ky.m98042c(birdPlusPurchasedActivity, this.f40983b.get());
        C4650Ky.m98041d(birdPlusPurchasedActivity, this.f40984c.get());
        m78484b(birdPlusPurchasedActivity, this.f40985d.get());
    }
}
