package p000;

import co.bird.android.feature.transferorder.scrap.overview.ScrapOrderOverviewActivity;
import dagger.MembersInjector;
/* renamed from: ho5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42344ho5 implements MembersInjector<ScrapOrderOverviewActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f85902a;

    /* renamed from: b */
    public final Y94<C22454gl> f85903b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f85904c;

    /* renamed from: d */
    public final Y94<C32069By6> f85905d;

    /* renamed from: e */
    public final Y94<C31744Ao5> f85906e;

    /* renamed from: b */
    public static void m35845b(ScrapOrderOverviewActivity scrapOrderOverviewActivity, C31744Ao5 c31744Ao5) {
        scrapOrderOverviewActivity.f65785p = c31744Ao5;
    }

    /* renamed from: c */
    public static void m35844c(ScrapOrderOverviewActivity scrapOrderOverviewActivity, C32069By6 c32069By6) {
        scrapOrderOverviewActivity.f65784o = c32069By6;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ScrapOrderOverviewActivity scrapOrderOverviewActivity) {
        C4650Ky.m98043b(scrapOrderOverviewActivity, this.f85902a.get());
        C4650Ky.m98042c(scrapOrderOverviewActivity, this.f85903b.get());
        C4650Ky.m98041d(scrapOrderOverviewActivity, this.f85904c.get());
        m35844c(scrapOrderOverviewActivity, this.f85905d.get());
        m35845b(scrapOrderOverviewActivity, this.f85906e.get());
    }
}
