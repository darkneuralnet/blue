package p000;

import co.bird.android.manager.analytics.workers.AnalyticsSubmitWorker;
import dagger.MembersInjector;
/* renamed from: Za */
/* loaded from: classes4.dex */
public final class C10296Za implements MembersInjector<AnalyticsSubmitWorker> {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f48787a;

    /* renamed from: a */
    public static void m72917a(AnalyticsSubmitWorker analyticsSubmitWorker, InterfaceC1880Ea interfaceC1880Ea) {
        analyticsSubmitWorker.f66230h = interfaceC1880Ea;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(AnalyticsSubmitWorker analyticsSubmitWorker) {
        m72917a(analyticsSubmitWorker, this.f48787a.get());
    }
}
