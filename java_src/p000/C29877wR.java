package p000;

import co.bird.android.feature.birdratinghistory.BirdRatingHistoryActivity;
import dagger.MembersInjector;
/* renamed from: wR */
/* loaded from: classes3.dex */
public final class C29877wR implements MembersInjector<BirdRatingHistoryActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f115947a;

    /* renamed from: b */
    public final Y94<C22454gl> f115948b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f115949c;

    /* renamed from: d */
    public final Y94<C4078JR> f115950d;

    /* renamed from: e */
    public final Y94<C30169xR> f115951e;

    /* renamed from: a */
    public static void m6842a(BirdRatingHistoryActivity birdRatingHistoryActivity, C30169xR c30169xR) {
        birdRatingHistoryActivity.f63375k = c30169xR;
    }

    /* renamed from: c */
    public static void m6840c(BirdRatingHistoryActivity birdRatingHistoryActivity, C4078JR c4078jr) {
        birdRatingHistoryActivity.f63374j = c4078jr;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(BirdRatingHistoryActivity birdRatingHistoryActivity) {
        C4650Ky.m98043b(birdRatingHistoryActivity, this.f115947a.get());
        C4650Ky.m98042c(birdRatingHistoryActivity, this.f115948b.get());
        C4650Ky.m98041d(birdRatingHistoryActivity, this.f115949c.get());
        m6840c(birdRatingHistoryActivity, this.f115950d.get());
        m6842a(birdRatingHistoryActivity, this.f115951e.get());
    }
}
