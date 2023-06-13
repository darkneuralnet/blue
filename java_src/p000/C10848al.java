package p000;

import co.bird.android.persistence.releaseassignment.ReleaseAssignmentDatabase;
/* renamed from: al */
/* loaded from: classes4.dex */
public final class C10848al implements InterfaceC48812sj1<AbstractC51529xI6> {

    /* renamed from: a */
    public final C22711hj f51118a;

    /* renamed from: b */
    public final Y94<ReleaseAssignmentDatabase> f51119b;

    public C10848al(C22711hj c22711hj, Y94<ReleaseAssignmentDatabase> y94) {
        this.f51118a = c22711hj;
        this.f51119b = y94;
    }

    /* renamed from: a */
    public static C10848al m70799a(C22711hj c22711hj, Y94<ReleaseAssignmentDatabase> y94) {
        return new C10848al(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC51529xI6 m70797c(C22711hj c22711hj, ReleaseAssignmentDatabase releaseAssignmentDatabase) {
        return (AbstractC51529xI6) C51679xZ3.m5002e(c22711hj.m36015V0(releaseAssignmentDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC51529xI6 get() {
        return m70797c(this.f51118a, this.f51119b.get());
    }
}
