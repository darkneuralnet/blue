package p000;

import android.content.Context;
import co.bird.android.persistence.operatorfilter.impl.OperatorFilterDatabase;
/* renamed from: Fk */
/* loaded from: classes4.dex */
public final class C2418Fk implements InterfaceC48812sj1<OperatorFilterDatabase> {

    /* renamed from: a */
    public final C22711hj f10048a;

    /* renamed from: b */
    public final Y94<Context> f10049b;

    public C2418Fk(C22711hj c22711hj, Y94<Context> y94) {
        this.f10048a = c22711hj;
        this.f10049b = y94;
    }

    /* renamed from: a */
    public static C2418Fk m106635a(C22711hj c22711hj, Y94<Context> y94) {
        return new C2418Fk(c22711hj, y94);
    }

    /* renamed from: c */
    public static OperatorFilterDatabase m106633c(C22711hj c22711hj, Context context) {
        return (OperatorFilterDatabase) C51679xZ3.m5002e(c22711hj.m35958y0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public OperatorFilterDatabase get() {
        return m106633c(this.f10048a, this.f10049b.get());
    }
}
