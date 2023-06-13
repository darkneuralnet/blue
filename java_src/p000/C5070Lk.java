package p000;

import android.content.Context;
import co.bird.android.persistence.operatortaskv2.impl.OperatorTaskV2Database;
/* renamed from: Lk */
/* loaded from: classes4.dex */
public final class C5070Lk implements InterfaceC48812sj1<OperatorTaskV2Database> {

    /* renamed from: a */
    public final C22711hj f21988a;

    /* renamed from: b */
    public final Y94<Context> f21989b;

    public C5070Lk(C22711hj c22711hj, Y94<Context> y94) {
        this.f21988a = c22711hj;
        this.f21989b = y94;
    }

    /* renamed from: a */
    public static C5070Lk m96399a(C22711hj c22711hj, Y94<Context> y94) {
        return new C5070Lk(c22711hj, y94);
    }

    /* renamed from: c */
    public static OperatorTaskV2Database m96397c(C22711hj c22711hj, Context context) {
        return (OperatorTaskV2Database) C51679xZ3.m5002e(c22711hj.m36049E0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public OperatorTaskV2Database get() {
        return m96397c(this.f21988a, this.f21989b.get());
    }
}
