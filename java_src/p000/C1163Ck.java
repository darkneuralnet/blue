package p000;

import co.bird.android.persistence.notificationcenter.impl.NotificationCenterDatabase;
/* renamed from: Ck */
/* loaded from: classes4.dex */
public final class C1163Ck implements InterfaceC48812sj1<AbstractC35144Pc3> {

    /* renamed from: a */
    public final C22711hj f4584a;

    /* renamed from: b */
    public final Y94<NotificationCenterDatabase> f4585b;

    public C1163Ck(C22711hj c22711hj, Y94<NotificationCenterDatabase> y94) {
        this.f4584a = c22711hj;
        this.f4585b = y94;
    }

    /* renamed from: a */
    public static C1163Ck m111766a(C22711hj c22711hj, Y94<NotificationCenterDatabase> y94) {
        return new C1163Ck(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC35144Pc3 m111764c(C22711hj c22711hj, NotificationCenterDatabase notificationCenterDatabase) {
        return (AbstractC35144Pc3) C51679xZ3.m5002e(c22711hj.m35964v0(notificationCenterDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC35144Pc3 get() {
        return m111764c(this.f4584a, this.f4585b.get());
    }
}
