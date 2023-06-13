package p000;

import android.content.Context;
import co.bird.android.persistence.brainswap.impl.BrainSwapDatabase;
/* renamed from: Kj */
/* loaded from: classes4.dex */
public final class C4556Kj implements InterfaceC48812sj1<BrainSwapDatabase> {

    /* renamed from: a */
    public final C22711hj f20093a;

    /* renamed from: b */
    public final Y94<Context> f20094b;

    public C4556Kj(C22711hj c22711hj, Y94<Context> y94) {
        this.f20093a = c22711hj;
        this.f20094b = y94;
    }

    /* renamed from: a */
    public static C4556Kj m98461a(C22711hj c22711hj, Y94<Context> y94) {
        return new C4556Kj(c22711hj, y94);
    }

    /* renamed from: c */
    public static BrainSwapDatabase m98459c(C22711hj c22711hj, Context context) {
        return (BrainSwapDatabase) C51679xZ3.m5002e(c22711hj.m36054C(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public BrainSwapDatabase get() {
        return m98459c(this.f20093a, this.f20094b.get());
    }
}
