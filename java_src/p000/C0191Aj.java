package p000;

import android.content.Context;
import co.bird.android.persistence.bird.impl.BirdDatabase;
/* renamed from: Aj */
/* loaded from: classes4.dex */
public final class C0191Aj implements InterfaceC48812sj1<BirdDatabase> {

    /* renamed from: a */
    public final C22711hj f979a;

    /* renamed from: b */
    public final Y94<Context> f980b;

    public C0191Aj(C22711hj c22711hj, Y94<Context> y94) {
        this.f979a = c22711hj;
        this.f980b = y94;
    }

    /* renamed from: a */
    public static C0191Aj m115362a(C22711hj c22711hj, Y94<Context> y94) {
        return new C0191Aj(c22711hj, y94);
    }

    /* renamed from: c */
    public static BirdDatabase m115360c(C22711hj c22711hj, Context context) {
        return (BirdDatabase) C51679xZ3.m5002e(c22711hj.m35971s(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public BirdDatabase get() {
        return m115360c(this.f979a, this.f980b.get());
    }
}
