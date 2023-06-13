package p000;

import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
/* renamed from: mj */
/* loaded from: classes4.dex */
public final class C26174mj implements InterfaceC48812sj1<NotificationManagerCompat> {

    /* renamed from: a */
    public final C22711hj f98609a;

    /* renamed from: b */
    public final Y94<Context> f98610b;

    public C26174mj(C22711hj c22711hj, Y94<Context> y94) {
        this.f98609a = c22711hj;
        this.f98610b = y94;
    }

    /* renamed from: a */
    public static C26174mj m25147a(C22711hj c22711hj, Y94<Context> y94) {
        return new C26174mj(c22711hj, y94);
    }

    /* renamed from: c */
    public static NotificationManagerCompat m25145c(C22711hj c22711hj, Context context) {
        return (NotificationManagerCompat) C51679xZ3.m5002e(c22711hj.m35999e(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public NotificationManagerCompat get() {
        return m25145c(this.f98609a, this.f98610b.get());
    }
}
