package p000;

import android.content.Context;
import co.bird.android.persistence.operatorallocation.OperatorAllocationDatabase;
/* renamed from: Dk */
/* loaded from: classes4.dex */
public final class C1588Dk implements InterfaceC48812sj1<OperatorAllocationDatabase> {

    /* renamed from: a */
    public final C22711hj f6245a;

    /* renamed from: b */
    public final Y94<Context> f6246b;

    public C1588Dk(C22711hj c22711hj, Y94<Context> y94) {
        this.f6245a = c22711hj;
        this.f6246b = y94;
    }

    /* renamed from: a */
    public static C1588Dk m109992a(C22711hj c22711hj, Y94<Context> y94) {
        return new C1588Dk(c22711hj, y94);
    }

    /* renamed from: c */
    public static OperatorAllocationDatabase m109990c(C22711hj c22711hj, Context context) {
        return (OperatorAllocationDatabase) C51679xZ3.m5002e(c22711hj.m35962w0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public OperatorAllocationDatabase get() {
        return m109990c(this.f6245a, this.f6246b.get());
    }
}
