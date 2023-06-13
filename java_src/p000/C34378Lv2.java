package p000;

import co.bird.android.feature.localssurvey.LocalsSurveyActivity;
import dagger.MembersInjector;
/* renamed from: Lv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34378Lv2 implements MembersInjector<LocalsSurveyActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f22265a;

    /* renamed from: b */
    public final Y94<C22454gl> f22266b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f22267c;

    /* renamed from: d */
    public final Y94<C35782Rv2> f22268d;

    /* renamed from: b */
    public static void m96157b(LocalsSurveyActivity localsSurveyActivity, C35782Rv2 c35782Rv2) {
        localsSurveyActivity.f64137j = c35782Rv2;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(LocalsSurveyActivity localsSurveyActivity) {
        C4650Ky.m98043b(localsSurveyActivity, this.f22265a.get());
        C4650Ky.m98042c(localsSurveyActivity, this.f22266b.get());
        C4650Ky.m98041d(localsSurveyActivity, this.f22267c.get());
        m96157b(localsSurveyActivity, this.f22268d.get());
    }
}
