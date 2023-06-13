package p000;

import android.content.Context;
import co.bird.android.persistence.releaseassignment.ReleaseAssignmentDatabase;
/* renamed from: Pk */
/* loaded from: classes4.dex */
public final class C6456Pk implements InterfaceC48812sj1<ReleaseAssignmentDatabase> {

    /* renamed from: a */
    public final C22711hj f28972a;

    /* renamed from: b */
    public final Y94<Context> f28973b;

    public C6456Pk(C22711hj c22711hj, Y94<Context> y94) {
        this.f28972a = c22711hj;
        this.f28973b = y94;
    }

    /* renamed from: a */
    public static C6456Pk m89882a(C22711hj c22711hj, Y94<Context> y94) {
        return new C6456Pk(c22711hj, y94);
    }

    /* renamed from: c */
    public static ReleaseAssignmentDatabase m89880c(C22711hj c22711hj, Context context) {
        return (ReleaseAssignmentDatabase) C51679xZ3.m5002e(c22711hj.m36039J0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ReleaseAssignmentDatabase get() {
        return m89880c(this.f28972a, this.f28973b.get());
    }
}
