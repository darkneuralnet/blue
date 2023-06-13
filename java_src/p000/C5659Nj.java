package p000;

import android.content.Context;
import co.bird.android.persistence.complaintresolution.impl.ComplaintResolutionDatabase;
/* renamed from: Nj */
/* loaded from: classes4.dex */
public final class C5659Nj implements InterfaceC48812sj1<ComplaintResolutionDatabase> {

    /* renamed from: a */
    public final C22711hj f25022a;

    /* renamed from: b */
    public final Y94<Context> f25023b;

    public C5659Nj(C22711hj c22711hj, Y94<Context> y94) {
        this.f25022a = c22711hj;
        this.f25023b = y94;
    }

    /* renamed from: a */
    public static C5659Nj m93547a(C22711hj c22711hj, Y94<Context> y94) {
        return new C5659Nj(c22711hj, y94);
    }

    /* renamed from: c */
    public static ComplaintResolutionDatabase m93545c(C22711hj c22711hj, Context context) {
        return (ComplaintResolutionDatabase) C51679xZ3.m5002e(c22711hj.m36046G(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ComplaintResolutionDatabase get() {
        return m93545c(this.f25022a, this.f25023b.get());
    }
}
