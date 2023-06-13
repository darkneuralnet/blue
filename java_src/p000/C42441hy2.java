package p000;

import android.content.Context;
/* renamed from: hy2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42441hy2 implements InterfaceC48812sj1<C40069dy2> {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f86237a;

    /* renamed from: b */
    public final Y94<Context> f86238b;

    /* renamed from: c */
    public final Y94<InterfaceC40099e13> f86239c;

    /* renamed from: d */
    public final Y94<C22454gl> f86240d;

    public C42441hy2(Y94<InterfaceC1880Ea> y94, Y94<Context> y942, Y94<InterfaceC40099e13> y943, Y94<C22454gl> y944) {
        this.f86237a = y94;
        this.f86238b = y942;
        this.f86239c = y943;
        this.f86240d = y944;
    }

    /* renamed from: a */
    public static C42441hy2 m35438a(Y94<InterfaceC1880Ea> y94, Y94<Context> y942, Y94<InterfaceC40099e13> y943, Y94<C22454gl> y944) {
        return new C42441hy2(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C40069dy2 m35436c(InterfaceC1880Ea interfaceC1880Ea, Context context, InterfaceC40099e13 interfaceC40099e13, C22454gl c22454gl) {
        return new C40069dy2(interfaceC1880Ea, context, interfaceC40099e13, c22454gl);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C40069dy2 get() {
        return m35436c(this.f86237a.get(), this.f86238b.get(), this.f86239c.get(), this.f86240d.get());
    }
}
