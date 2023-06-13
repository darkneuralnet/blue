package p000;

import android.content.Context;
/* renamed from: Tj */
/* loaded from: classes4.dex */
public final class C7915Tj implements InterfaceC48812sj1<String> {

    /* renamed from: a */
    public final C22711hj f35980a;

    /* renamed from: b */
    public final Y94<Context> f35981b;

    public C7915Tj(C22711hj c22711hj, Y94<Context> y94) {
        this.f35980a = c22711hj;
        this.f35981b = y94;
    }

    /* renamed from: a */
    public static C7915Tj m83077a(C22711hj c22711hj, Y94<Context> y94) {
        return new C7915Tj(c22711hj, y94);
    }

    /* renamed from: c */
    public static String m83075c(C22711hj c22711hj, Context context) {
        return (String) C51679xZ3.m5002e(c22711hj.m36034M(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public String get() {
        return m83075c(this.f35980a, this.f35981b.get());
    }
}
