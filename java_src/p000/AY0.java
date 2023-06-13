package p000;

import java.util.concurrent.Executor;
/* renamed from: AY0 */
/* loaded from: classes5.dex */
public final class AY0 implements InterfaceC48220rj1<C52853zY0> {

    /* renamed from: a */
    public final Y94<Executor> f747a;

    /* renamed from: b */
    public final Y94<InterfaceC8824Vv> f748b;

    /* renamed from: c */
    public final Y94<FG6> f749c;

    /* renamed from: d */
    public final Y94<InterfaceC35412Qg1> f750d;

    /* renamed from: e */
    public final Y94<BX5> f751e;

    public AY0(Y94<Executor> y94, Y94<InterfaceC8824Vv> y942, Y94<FG6> y943, Y94<InterfaceC35412Qg1> y944, Y94<BX5> y945) {
        this.f747a = y94;
        this.f748b = y942;
        this.f749c = y943;
        this.f750d = y944;
        this.f751e = y945;
    }

    /* renamed from: a */
    public static AY0 m115591a(Y94<Executor> y94, Y94<InterfaceC8824Vv> y942, Y94<FG6> y943, Y94<InterfaceC35412Qg1> y944, Y94<BX5> y945) {
        return new AY0(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C52853zY0 m115589c(Executor executor, InterfaceC8824Vv interfaceC8824Vv, FG6 fg6, InterfaceC35412Qg1 interfaceC35412Qg1, BX5 bx5) {
        return new C52853zY0(executor, interfaceC8824Vv, fg6, interfaceC35412Qg1, bx5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C52853zY0 get() {
        return m115589c(this.f747a.get(), this.f748b.get(), this.f749c.get(), this.f750d.get(), this.f751e.get());
    }
}
