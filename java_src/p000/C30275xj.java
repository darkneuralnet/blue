package p000;

import android.content.Context;
import co.bird.android.persistence.area.impl.AreaDatabase;
/* renamed from: xj */
/* loaded from: classes4.dex */
public final class C30275xj implements InterfaceC48812sj1<AreaDatabase> {

    /* renamed from: a */
    public final C22711hj f118009a;

    /* renamed from: b */
    public final Y94<Context> f118010b;

    public C30275xj(C22711hj c22711hj, Y94<Context> y94) {
        this.f118009a = c22711hj;
        this.f118010b = y94;
    }

    /* renamed from: a */
    public static C30275xj m4800a(C22711hj c22711hj, Y94<Context> y94) {
        return new C30275xj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AreaDatabase m4798c(C22711hj c22711hj, Context context) {
        return (AreaDatabase) C51679xZ3.m5002e(c22711hj.m35977p(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AreaDatabase get() {
        return m4798c(this.f118009a, this.f118010b.get());
    }
}
