package p000;

import android.content.Context;
import co.bird.android.manager.hardcount.persistence.HardCountDatabase;
/* renamed from: lk */
/* loaded from: classes4.dex */
public final class C25770lk implements InterfaceC48812sj1<HardCountDatabase> {

    /* renamed from: a */
    public final C22711hj f96646a;

    /* renamed from: b */
    public final Y94<Context> f96647b;

    public C25770lk(C22711hj c22711hj, Y94<Context> y94) {
        this.f96646a = c22711hj;
        this.f96647b = y94;
    }

    /* renamed from: a */
    public static C25770lk m26900a(C22711hj c22711hj, Y94<Context> y94) {
        return new C25770lk(c22711hj, y94);
    }

    /* renamed from: c */
    public static HardCountDatabase m26898c(C22711hj c22711hj, Context context) {
        return (HardCountDatabase) C51679xZ3.m5002e(c22711hj.m35998e0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public HardCountDatabase get() {
        return m26898c(this.f96646a, this.f96647b.get());
    }
}
