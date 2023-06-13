package p000;

import android.content.Context;
import co.bird.android.persistence.operatororderview.OperatorOrderViewDatabase;
/* renamed from: Ik */
/* loaded from: classes4.dex */
public final class C3747Ik implements InterfaceC48812sj1<OperatorOrderViewDatabase> {

    /* renamed from: a */
    public final C22711hj f16126a;

    /* renamed from: b */
    public final Y94<Context> f16127b;

    public C3747Ik(C22711hj c22711hj, Y94<Context> y94) {
        this.f16126a = c22711hj;
        this.f16127b = y94;
    }

    /* renamed from: a */
    public static C3747Ik m101745a(C22711hj c22711hj, Y94<Context> y94) {
        return new C3747Ik(c22711hj, y94);
    }

    /* renamed from: c */
    public static OperatorOrderViewDatabase m101743c(C22711hj c22711hj, Context context) {
        return (OperatorOrderViewDatabase) C51679xZ3.m5002e(c22711hj.m36055B0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public OperatorOrderViewDatabase get() {
        return m101743c(this.f16126a, this.f16127b.get());
    }
}
