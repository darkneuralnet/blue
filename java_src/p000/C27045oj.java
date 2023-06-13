package p000;

import android.content.Context;
import co.bird.android.manager.analytics.persistence.AnalyticsDatabase;
/* renamed from: oj */
/* loaded from: classes4.dex */
public final class C27045oj implements InterfaceC48812sj1<AnalyticsDatabase> {

    /* renamed from: a */
    public final C22711hj f102401a;

    /* renamed from: b */
    public final Y94<Context> f102402b;

    public C27045oj(C22711hj c22711hj, Y94<Context> y94) {
        this.f102401a = c22711hj;
        this.f102402b = y94;
    }

    /* renamed from: a */
    public static C27045oj m20566a(C22711hj c22711hj, Y94<Context> y94) {
        return new C27045oj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AnalyticsDatabase m20564c(C22711hj c22711hj, Context context) {
        return (AnalyticsDatabase) C51679xZ3.m5002e(c22711hj.m35995g(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AnalyticsDatabase get() {
        return m20564c(this.f102401a, this.f102402b.get());
    }
}
