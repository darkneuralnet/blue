package p000;

import java.util.concurrent.Executor;
/* renamed from: YC6 */
/* loaded from: classes5.dex */
public final class YC6 implements InterfaceC48220rj1<XC6> {

    /* renamed from: a */
    public final Y94<Executor> f44833a;

    /* renamed from: b */
    public final Y94<InterfaceC35412Qg1> f44834b;

    /* renamed from: c */
    public final Y94<FG6> f44835c;

    /* renamed from: d */
    public final Y94<BX5> f44836d;

    public YC6(Y94<Executor> y94, Y94<InterfaceC35412Qg1> y942, Y94<FG6> y943, Y94<BX5> y944) {
        this.f44833a = y94;
        this.f44834b = y942;
        this.f44835c = y943;
        this.f44836d = y944;
    }

    /* renamed from: a */
    public static YC6 m75420a(Y94<Executor> y94, Y94<InterfaceC35412Qg1> y942, Y94<FG6> y943, Y94<BX5> y944) {
        return new YC6(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static XC6 m75418c(Executor executor, InterfaceC35412Qg1 interfaceC35412Qg1, FG6 fg6, BX5 bx5) {
        return new XC6(executor, interfaceC35412Qg1, fg6, bx5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public XC6 get() {
        return m75418c(this.f44833a.get(), this.f44834b.get(), this.f44835c.get(), this.f44836d.get());
    }
}
