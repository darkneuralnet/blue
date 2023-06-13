package p000;

import co.bird.android.feature.notificationcenter.details.NotificationDetailsActivity;
import dagger.MembersInjector;
/* renamed from: Ec3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32570Ec3 implements MembersInjector<NotificationDetailsActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f7856a;

    /* renamed from: b */
    public final Y94<C22454gl> f7857b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f7858c;

    /* renamed from: d */
    public final Y94<C33974Kc3> f7859d;

    /* renamed from: b */
    public static void m108641b(NotificationDetailsActivity notificationDetailsActivity, C33974Kc3 c33974Kc3) {
        notificationDetailsActivity.f64270j = c33974Kc3;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(NotificationDetailsActivity notificationDetailsActivity) {
        C4650Ky.m98043b(notificationDetailsActivity, this.f7856a.get());
        C4650Ky.m98042c(notificationDetailsActivity, this.f7857b.get());
        C4650Ky.m98041d(notificationDetailsActivity, this.f7858c.get());
        m108641b(notificationDetailsActivity, this.f7859d.get());
    }
}
