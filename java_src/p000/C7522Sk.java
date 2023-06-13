package p000;

import android.content.Context;
/* renamed from: Sk */
/* loaded from: classes4.dex */
public final class C7522Sk implements InterfaceC48812sj1<AbstractC39873de5> {

    /* renamed from: a */
    public final C22711hj f34180a;

    /* renamed from: b */
    public final Y94<Context> f34181b;

    public C7522Sk(C22711hj c22711hj, Y94<Context> y94) {
        this.f34180a = c22711hj;
        this.f34181b = y94;
    }

    /* renamed from: a */
    public static C7522Sk m84935a(C22711hj c22711hj, Y94<Context> y94) {
        return new C7522Sk(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC39873de5 m84933c(C22711hj c22711hj, Context context) {
        return (AbstractC39873de5) C51679xZ3.m5002e(c22711hj.m36031N0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC39873de5 get() {
        return m84933c(this.f34180a, this.f34181b.get());
    }
}
