package p000;

import android.content.Context;
/* renamed from: UI2 */
/* loaded from: classes4.dex */
public final class UI2 implements InterfaceC48812sj1<InterfaceC40099e13> {

    /* renamed from: a */
    public final VH2 f37193a;

    /* renamed from: b */
    public final Y94<C22454gl> f37194b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f37195c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f37196d;

    /* renamed from: e */
    public final Y94<InterfaceC6097Oh> f37197e;

    /* renamed from: f */
    public final Y94<Context> f37198f;

    public UI2(VH2 vh2, Y94<C22454gl> y94, Y94<InterfaceC1880Ea> y942, Y94<C36207Tq4> y943, Y94<InterfaceC6097Oh> y944, Y94<Context> y945) {
        this.f37193a = vh2;
        this.f37194b = y94;
        this.f37195c = y942;
        this.f37196d = y943;
        this.f37197e = y944;
        this.f37198f = y945;
    }

    /* renamed from: a */
    public static UI2 m81666a(VH2 vh2, Y94<C22454gl> y94, Y94<InterfaceC1880Ea> y942, Y94<C36207Tq4> y943, Y94<InterfaceC6097Oh> y944, Y94<Context> y945) {
        return new UI2(vh2, y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static InterfaceC40099e13 m81664c(VH2 vh2, C22454gl c22454gl, InterfaceC1880Ea interfaceC1880Ea, C36207Tq4 c36207Tq4, InterfaceC6097Oh interfaceC6097Oh, Context context) {
        return (InterfaceC40099e13) C51679xZ3.m5002e(vh2.m80074Z(c22454gl, interfaceC1880Ea, c36207Tq4, interfaceC6097Oh, context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC40099e13 get() {
        return m81664c(this.f37193a, this.f37194b.get(), this.f37195c.get(), this.f37196d.get(), this.f37197e.get(), this.f37198f.get());
    }
}
