package p000;

import co.bird.android.feature.repair.p016v3.overview.nonrepair.NonRepairSurveyActivity;
import dagger.MembersInjector;
/* renamed from: t93  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49073t93 implements MembersInjector<NonRepairSurveyActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f109950a;

    /* renamed from: b */
    public final Y94<C22454gl> f109951b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f109952c;

    /* renamed from: d */
    public final Y94<D93> f109953d;

    /* renamed from: b */
    public static void m12992b(NonRepairSurveyActivity nonRepairSurveyActivity, D93 d93) {
        nonRepairSurveyActivity.f64673j = d93;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(NonRepairSurveyActivity nonRepairSurveyActivity) {
        C4650Ky.m98043b(nonRepairSurveyActivity, this.f109950a.get());
        C4650Ky.m98042c(nonRepairSurveyActivity, this.f109951b.get());
        C4650Ky.m98041d(nonRepairSurveyActivity, this.f109952c.get());
        m12992b(nonRepairSurveyActivity, this.f109953d.get());
    }
}
