package p000;

import co.bird.android.persistence.complaintresolution.impl.ComplaintResolutionDatabase;
/* renamed from: Oj */
/* loaded from: classes4.dex */
public final class C6100Oj implements InterfaceC48812sj1<AbstractC35033Oq0> {

    /* renamed from: a */
    public final C22711hj f27102a;

    /* renamed from: b */
    public final Y94<ComplaintResolutionDatabase> f27103b;

    public C6100Oj(C22711hj c22711hj, Y94<ComplaintResolutionDatabase> y94) {
        this.f27102a = c22711hj;
        this.f27103b = y94;
    }

    /* renamed from: a */
    public static C6100Oj m91633a(C22711hj c22711hj, Y94<ComplaintResolutionDatabase> y94) {
        return new C6100Oj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC35033Oq0 m91631c(C22711hj c22711hj, ComplaintResolutionDatabase complaintResolutionDatabase) {
        return (AbstractC35033Oq0) C51679xZ3.m5002e(c22711hj.m36044H(complaintResolutionDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC35033Oq0 get() {
        return m91631c(this.f27102a, this.f27103b.get());
    }
}
