package p000;

import android.content.Context;
/* renamed from: A21 */
/* loaded from: classes4.dex */
public final class A21 implements InterfaceC48812sj1<C52558z21> {

    /* renamed from: a */
    public final Y94<C22454gl> f43a;

    /* renamed from: b */
    public final Y94<Context> f44b;

    /* renamed from: c */
    public final Y94<C44258l21> f45c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f46d;

    /* renamed from: e */
    public final Y94<InterfaceC35660Rh6> f47e;

    public A21(Y94<C22454gl> y94, Y94<Context> y942, Y94<C44258l21> y943, Y94<C36207Tq4> y944, Y94<InterfaceC35660Rh6> y945) {
        this.f43a = y94;
        this.f44b = y942;
        this.f45c = y943;
        this.f46d = y944;
        this.f47e = y945;
    }

    /* renamed from: a */
    public static A21 m116179a(Y94<C22454gl> y94, Y94<Context> y942, Y94<C44258l21> y943, Y94<C36207Tq4> y944, Y94<InterfaceC35660Rh6> y945) {
        return new A21(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C52558z21 m116177c(C22454gl c22454gl, Context context, C44258l21 c44258l21, C36207Tq4 c36207Tq4, InterfaceC35660Rh6 interfaceC35660Rh6) {
        return new C52558z21(c22454gl, context, c44258l21, c36207Tq4, interfaceC35660Rh6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C52558z21 get() {
        return m116177c(this.f43a.get(), this.f44b.get(), this.f45c.get(), this.f46d.get(), this.f47e.get());
    }
}
