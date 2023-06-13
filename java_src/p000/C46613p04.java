package p000;

import co.bird.android.feature.payment.preload.p013v2.landing.PreloadV2ActivityVersionB;
import dagger.MembersInjector;
/* renamed from: p04  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46613p04 implements MembersInjector<PreloadV2ActivityVersionB> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f102924a;

    /* renamed from: b */
    public final Y94<C22454gl> f102925b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f102926c;

    /* renamed from: d */
    public final Y94<P04> f102927d;

    /* renamed from: b */
    public static void m20168b(PreloadV2ActivityVersionB preloadV2ActivityVersionB, P04 p04) {
        preloadV2ActivityVersionB.f64426j = p04;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(PreloadV2ActivityVersionB preloadV2ActivityVersionB) {
        C4650Ky.m98043b(preloadV2ActivityVersionB, this.f102924a.get());
        C4650Ky.m98042c(preloadV2ActivityVersionB, this.f102925b.get());
        C4650Ky.m98041d(preloadV2ActivityVersionB, this.f102926c.get());
        m20168b(preloadV2ActivityVersionB, this.f102927d.get());
    }
}
