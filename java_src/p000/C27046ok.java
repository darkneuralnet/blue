package p000;

import co.bird.android.persistence.hibernation.impl.HibernationDatabase;
/* renamed from: ok */
/* loaded from: classes4.dex */
public final class C27046ok implements InterfaceC48812sj1<SL1> {

    /* renamed from: a */
    public final C22711hj f102415a;

    /* renamed from: b */
    public final Y94<HibernationDatabase> f102416b;

    public C27046ok(C22711hj c22711hj, Y94<HibernationDatabase> y94) {
        this.f102415a = c22711hj;
        this.f102416b = y94;
    }

    /* renamed from: a */
    public static C27046ok m20559a(C22711hj c22711hj, Y94<HibernationDatabase> y94) {
        return new C27046ok(c22711hj, y94);
    }

    /* renamed from: c */
    public static SL1 m20557c(C22711hj c22711hj, HibernationDatabase hibernationDatabase) {
        return (SL1) C51679xZ3.m5002e(c22711hj.m35992h0(hibernationDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public SL1 get() {
        return m20557c(this.f102415a, this.f102416b.get());
    }
}
