package p000;

import android.content.Context;
/* renamed from: hk */
/* loaded from: classes4.dex */
public final class C22713hk implements InterfaceC48812sj1<UI4> {

    /* renamed from: a */
    public final C22711hj f85807a;

    /* renamed from: b */
    public final Y94<Context> f85808b;

    public C22713hk(C22711hj c22711hj, Y94<Context> y94) {
        this.f85807a = c22711hj;
        this.f85808b = y94;
    }

    /* renamed from: a */
    public static C22713hk m35940a(C22711hj c22711hj, Y94<Context> y94) {
        return new C22713hk(c22711hj, y94);
    }

    /* renamed from: c */
    public static UI4 m35938c(C22711hj c22711hj, Context context) {
        return (UI4) C51679xZ3.m5002e(c22711hj.m36006a0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public UI4 get() {
        return m35938c(this.f85807a, this.f85808b.get());
    }
}
