package p000;

import android.content.Context;
import co.bird.android.persistence.notificationcenter.impl.NotificationCenterDatabase;
/* renamed from: Ak */
/* loaded from: classes4.dex */
public final class C0198Ak implements InterfaceC48812sj1<NotificationCenterDatabase> {

    /* renamed from: a */
    public final C22711hj f999a;

    /* renamed from: b */
    public final Y94<Context> f1000b;

    public C0198Ak(C22711hj c22711hj, Y94<Context> y94) {
        this.f999a = c22711hj;
        this.f1000b = y94;
    }

    /* renamed from: a */
    public static C0198Ak m115335a(C22711hj c22711hj, Y94<Context> y94) {
        return new C0198Ak(c22711hj, y94);
    }

    /* renamed from: c */
    public static NotificationCenterDatabase m115333c(C22711hj c22711hj, Context context) {
        return (NotificationCenterDatabase) C51679xZ3.m5002e(c22711hj.m35968t0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public NotificationCenterDatabase get() {
        return m115333c(this.f999a, this.f1000b.get());
    }
}
