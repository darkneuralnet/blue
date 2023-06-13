package p000;

import android.content.Context;
import co.bird.android.persistence.fleetstatus.impl.FleetStatusDatabase;
/* renamed from: dk */
/* loaded from: classes4.dex */
public final class C19849dk implements InterfaceC48812sj1<FleetStatusDatabase> {

    /* renamed from: a */
    public final C22711hj f77143a;

    /* renamed from: b */
    public final Y94<Context> f77144b;

    public C19849dk(C22711hj c22711hj, Y94<Context> y94) {
        this.f77143a = c22711hj;
        this.f77144b = y94;
    }

    /* renamed from: a */
    public static C19849dk m43828a(C22711hj c22711hj, Y94<Context> y94) {
        return new C19849dk(c22711hj, y94);
    }

    /* renamed from: c */
    public static FleetStatusDatabase m43826c(C22711hj c22711hj, Context context) {
        return (FleetStatusDatabase) C51679xZ3.m5002e(c22711hj.m36014W(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public FleetStatusDatabase get() {
        return m43826c(this.f77143a, this.f77144b.get());
    }
}
