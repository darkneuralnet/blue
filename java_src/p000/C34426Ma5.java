package p000;

import android.content.Context;
/* renamed from: Ma5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34426Ma5 implements InterfaceC48812sj1<C34192La5> {

    /* renamed from: a */
    public final Y94<InterfaceC6097Oh> f23258a;

    /* renamed from: b */
    public final Y94<InterfaceC36532Va5> f23259b;

    /* renamed from: c */
    public final Y94<C22454gl> f23260c;

    /* renamed from: d */
    public final Y94<InterfaceC1880Ea> f23261d;

    /* renamed from: e */
    public final Y94<Context> f23262e;

    /* renamed from: f */
    public final Y94<C36207Tq4> f23263f;

    public C34426Ma5(Y94<InterfaceC6097Oh> y94, Y94<InterfaceC36532Va5> y942, Y94<C22454gl> y943, Y94<InterfaceC1880Ea> y944, Y94<Context> y945, Y94<C36207Tq4> y946) {
        this.f23258a = y94;
        this.f23259b = y942;
        this.f23260c = y943;
        this.f23261d = y944;
        this.f23262e = y945;
        this.f23263f = y946;
    }

    /* renamed from: a */
    public static C34426Ma5 m95157a(Y94<InterfaceC6097Oh> y94, Y94<InterfaceC36532Va5> y942, Y94<C22454gl> y943, Y94<InterfaceC1880Ea> y944, Y94<Context> y945, Y94<C36207Tq4> y946) {
        return new C34426Ma5(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static C34192La5 m95155c(InterfaceC6097Oh interfaceC6097Oh, InterfaceC36532Va5 interfaceC36532Va5, C22454gl c22454gl, InterfaceC1880Ea interfaceC1880Ea, Context context, C36207Tq4 c36207Tq4) {
        return new C34192La5(interfaceC6097Oh, interfaceC36532Va5, c22454gl, interfaceC1880Ea, context, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C34192La5 get() {
        return m95155c(this.f23258a.get(), this.f23259b.get(), this.f23260c.get(), this.f23261d.get(), this.f23262e.get(), this.f23263f.get());
    }
}
