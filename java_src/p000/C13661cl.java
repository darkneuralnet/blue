package p000;

import android.content.Context;
import co.bird.android.persistence.zone.impl.ZoneDatabase;
/* renamed from: cl */
/* loaded from: classes4.dex */
public final class C13661cl implements InterfaceC48812sj1<ZoneDatabase> {

    /* renamed from: a */
    public final C22711hj f61173a;

    /* renamed from: b */
    public final Y94<Context> f61174b;

    public C13661cl(C22711hj c22711hj, Y94<Context> y94) {
        this.f61173a = c22711hj;
        this.f61174b = y94;
    }

    /* renamed from: a */
    public static C13661cl m60942a(C22711hj c22711hj, Y94<Context> y94) {
        return new C13661cl(c22711hj, y94);
    }

    /* renamed from: c */
    public static ZoneDatabase m60940c(C22711hj c22711hj, Context context) {
        return (ZoneDatabase) C51679xZ3.m5002e(c22711hj.m36011X0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ZoneDatabase get() {
        return m60940c(this.f61173a, this.f61174b.get());
    }
}
