package p000;

import co.bird.android.persistence.notificationcenter.impl.NotificationCenterDatabase;
/* renamed from: Mj */
/* loaded from: classes4.dex */
public final class C5347Mj implements InterfaceC48812sj1<AbstractC48272ro3> {

    /* renamed from: a */
    public final C22711hj f23431a;

    /* renamed from: b */
    public final Y94<NotificationCenterDatabase> f23432b;

    public C5347Mj(C22711hj c22711hj, Y94<NotificationCenterDatabase> y94) {
        this.f23431a = c22711hj;
        this.f23432b = y94;
    }

    /* renamed from: a */
    public static C5347Mj m95001a(C22711hj c22711hj, Y94<NotificationCenterDatabase> y94) {
        return new C5347Mj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC48272ro3 m94999c(C22711hj c22711hj, NotificationCenterDatabase notificationCenterDatabase) {
        return (AbstractC48272ro3) C51679xZ3.m5002e(c22711hj.m36050E(notificationCenterDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC48272ro3 get() {
        return m94999c(this.f23431a, this.f23432b.get());
    }
}
