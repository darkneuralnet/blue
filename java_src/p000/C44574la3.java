package p000;

import co.bird.android.feature.notificationcenter.NotificationCenterActivity;
import dagger.MembersInjector;
/* renamed from: la3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44574la3 implements MembersInjector<NotificationCenterActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f96353a;

    /* renamed from: b */
    public final Y94<C22454gl> f96354b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f96355c;

    /* renamed from: d */
    public final Y94<C31616Aa3> f96356d;

    /* renamed from: a */
    public static void m27134a(NotificationCenterActivity notificationCenterActivity, C31616Aa3 c31616Aa3) {
        notificationCenterActivity.f64264j = c31616Aa3;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(NotificationCenterActivity notificationCenterActivity) {
        C4650Ky.m98043b(notificationCenterActivity, this.f96353a.get());
        C4650Ky.m98042c(notificationCenterActivity, this.f96354b.get());
        C4650Ky.m98041d(notificationCenterActivity, this.f96355c.get());
        m27134a(notificationCenterActivity, this.f96356d.get());
    }
}
