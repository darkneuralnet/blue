package p000;

import android.content.Context;
import co.bird.android.persistence.birdplus.BirdPlusViewDatabase;
/* renamed from: Cj */
/* loaded from: classes4.dex */
public final class C1139Cj implements InterfaceC48812sj1<BirdPlusViewDatabase> {

    /* renamed from: a */
    public final C22711hj f4532a;

    /* renamed from: b */
    public final Y94<Context> f4533b;

    public C1139Cj(C22711hj c22711hj, Y94<Context> y94) {
        this.f4532a = c22711hj;
        this.f4533b = y94;
    }

    /* renamed from: a */
    public static C1139Cj m111814a(C22711hj c22711hj, Y94<Context> y94) {
        return new C1139Cj(c22711hj, y94);
    }

    /* renamed from: c */
    public static BirdPlusViewDatabase m111812c(C22711hj c22711hj, Context context) {
        return (BirdPlusViewDatabase) C51679xZ3.m5002e(c22711hj.m35967u(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public BirdPlusViewDatabase get() {
        return m111812c(this.f4532a, this.f4533b.get());
    }
}
