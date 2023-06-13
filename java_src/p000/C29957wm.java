package p000;

import android.content.Context;
import android.os.Handler;
/* renamed from: wm */
/* loaded from: classes4.dex */
public final class C29957wm implements InterfaceC48812sj1<C29621vm> {

    /* renamed from: a */
    public final Y94<InterfaceC12495bn> f116463a;

    /* renamed from: b */
    public final Y94<InterfaceC40001dr4> f116464b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f116465c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f116466d;

    /* renamed from: e */
    public final Y94<Context> f116467e;

    /* renamed from: f */
    public final Y94<Handler> f116468f;

    /* renamed from: g */
    public final Y94<InterfaceC37014Xc1> f116469g;

    public C29957wm(Y94<InterfaceC12495bn> y94, Y94<InterfaceC40001dr4> y942, Y94<InterfaceC1880Ea> y943, Y94<C36207Tq4> y944, Y94<Context> y945, Y94<Handler> y946, Y94<InterfaceC37014Xc1> y947) {
        this.f116463a = y94;
        this.f116464b = y942;
        this.f116465c = y943;
        this.f116466d = y944;
        this.f116467e = y945;
        this.f116468f = y946;
        this.f116469g = y947;
    }

    /* renamed from: a */
    public static C29957wm m6394a(Y94<InterfaceC12495bn> y94, Y94<InterfaceC40001dr4> y942, Y94<InterfaceC1880Ea> y943, Y94<C36207Tq4> y944, Y94<Context> y945, Y94<Handler> y946, Y94<InterfaceC37014Xc1> y947) {
        return new C29957wm(y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static C29621vm m6392c(InterfaceC12495bn interfaceC12495bn, InterfaceC40001dr4 interfaceC40001dr4, InterfaceC1880Ea interfaceC1880Ea, C36207Tq4 c36207Tq4, Context context, Handler handler, InterfaceC37014Xc1 interfaceC37014Xc1) {
        return new C29621vm(interfaceC12495bn, interfaceC40001dr4, interfaceC1880Ea, c36207Tq4, context, handler, interfaceC37014Xc1);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C29621vm get() {
        return m6392c(this.f116463a.get(), this.f116464b.get(), this.f116465c.get(), this.f116466d.get(), this.f116467e.get(), this.f116468f.get(), this.f116469g.get());
    }
}
