package p000;

import co.bird.android.persistence.complaintresolution.impl.ComplaintResolutionDatabase;
/* renamed from: Pj */
/* loaded from: classes4.dex */
public final class C6454Pj implements InterfaceC48812sj1<AbstractC34565Mq0> {

    /* renamed from: a */
    public final C22711hj f28948a;

    /* renamed from: b */
    public final Y94<ComplaintResolutionDatabase> f28949b;

    public C6454Pj(C22711hj c22711hj, Y94<ComplaintResolutionDatabase> y94) {
        this.f28948a = c22711hj;
        this.f28949b = y94;
    }

    /* renamed from: a */
    public static C6454Pj m89895a(C22711hj c22711hj, Y94<ComplaintResolutionDatabase> y94) {
        return new C6454Pj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC34565Mq0 m89893c(C22711hj c22711hj, ComplaintResolutionDatabase complaintResolutionDatabase) {
        return (AbstractC34565Mq0) C51679xZ3.m5002e(c22711hj.m36042I(complaintResolutionDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC34565Mq0 get() {
        return m89893c(this.f28948a, this.f28949b.get());
    }
}
