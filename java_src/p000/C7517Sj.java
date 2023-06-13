package p000;

import android.content.Context;
/* renamed from: Sj */
/* loaded from: classes4.dex */
public final class C7517Sj implements InterfaceC48812sj1<String> {

    /* renamed from: a */
    public final C22711hj f34141a;

    /* renamed from: b */
    public final Y94<Context> f34142b;

    public C7517Sj(C22711hj c22711hj, Y94<Context> y94) {
        this.f34141a = c22711hj;
        this.f34142b = y94;
    }

    /* renamed from: a */
    public static C7517Sj m84999a(C22711hj c22711hj, Y94<Context> y94) {
        return new C7517Sj(c22711hj, y94);
    }

    /* renamed from: c */
    public static String m84997c(C22711hj c22711hj, Context context) {
        return (String) C51679xZ3.m5002e(c22711hj.m36036L(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public String get() {
        return m84997c(this.f34141a, this.f34142b.get());
    }
}
