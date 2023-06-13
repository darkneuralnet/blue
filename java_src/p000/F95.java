package p000;

import android.content.Context;
/* renamed from: F95 */
/* loaded from: classes4.dex */
public final class F95 implements InterfaceC48812sj1<E95> {

    /* renamed from: a */
    public final Y94<InterfaceC48624sP2> f8917a;

    /* renamed from: b */
    public final Y94<B95> f8918b;

    /* renamed from: c */
    public final Y94<Context> f8919c;

    /* renamed from: d */
    public final Y94<GI3> f8920d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f8921e;

    /* renamed from: f */
    public final Y94<InterfaceC1880Ea> f8922f;

    public F95(Y94<InterfaceC48624sP2> y94, Y94<B95> y942, Y94<Context> y943, Y94<GI3> y944, Y94<C36207Tq4> y945, Y94<InterfaceC1880Ea> y946) {
        this.f8917a = y94;
        this.f8918b = y942;
        this.f8919c = y943;
        this.f8920d = y944;
        this.f8921e = y945;
        this.f8922f = y946;
    }

    /* renamed from: a */
    public static F95 m107551a(Y94<InterfaceC48624sP2> y94, Y94<B95> y942, Y94<Context> y943, Y94<GI3> y944, Y94<C36207Tq4> y945, Y94<InterfaceC1880Ea> y946) {
        return new F95(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static E95 m107549c(InterfaceC48624sP2 interfaceC48624sP2, B95 b95, Context context, GI3 gi3, C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea) {
        return new E95(interfaceC48624sP2, b95, context, gi3, c36207Tq4, interfaceC1880Ea);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public E95 get() {
        return m107549c(this.f8917a.get(), this.f8918b.get(), this.f8919c.get(), this.f8920d.get(), this.f8921e.get(), this.f8922f.get());
    }
}
