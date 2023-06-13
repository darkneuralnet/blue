package p000;

import android.content.Context;
import co.bird.android.persistence.bountyflightsheet.impl.BountyDatabase;
/* renamed from: Gj */
/* loaded from: classes4.dex */
public final class C2922Gj implements InterfaceC48812sj1<BountyDatabase> {

    /* renamed from: a */
    public final C22711hj f12310a;

    /* renamed from: b */
    public final Y94<Context> f12311b;

    public C2922Gj(C22711hj c22711hj, Y94<Context> y94) {
        this.f12310a = c22711hj;
        this.f12311b = y94;
    }

    /* renamed from: a */
    public static C2922Gj m104840a(C22711hj c22711hj, Y94<Context> y94) {
        return new C2922Gj(c22711hj, y94);
    }

    /* renamed from: c */
    public static BountyDatabase m104838c(C22711hj c22711hj, Context context) {
        return (BountyDatabase) C51679xZ3.m5002e(c22711hj.m35959y(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public BountyDatabase get() {
        return m104838c(this.f12310a, this.f12311b.get());
    }
}
