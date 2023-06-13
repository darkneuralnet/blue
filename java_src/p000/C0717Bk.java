package p000;

import co.bird.android.persistence.notificationcenter.impl.NotificationCenterDatabase;
/* renamed from: Bk */
/* loaded from: classes4.dex */
public final class C0717Bk implements InterfaceC48812sj1<AbstractC31868Bc3> {

    /* renamed from: a */
    public final C22711hj f2792a;

    /* renamed from: b */
    public final Y94<NotificationCenterDatabase> f2793b;

    public C0717Bk(C22711hj c22711hj, Y94<NotificationCenterDatabase> y94) {
        this.f2792a = c22711hj;
        this.f2793b = y94;
    }

    /* renamed from: a */
    public static C0717Bk m113569a(C22711hj c22711hj, Y94<NotificationCenterDatabase> y94) {
        return new C0717Bk(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC31868Bc3 m113567c(C22711hj c22711hj, NotificationCenterDatabase notificationCenterDatabase) {
        return (AbstractC31868Bc3) C51679xZ3.m5002e(c22711hj.m35966u0(notificationCenterDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC31868Bc3 get() {
        return m113567c(this.f2792a, this.f2793b.get());
    }
}
