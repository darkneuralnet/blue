package p000;

import android.content.Context;
import java.util.concurrent.Executor;
/* renamed from: zf6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52927zf6 implements InterfaceC48220rj1<C52334yf6> {

    /* renamed from: a */
    public final Y94<Context> f122014a;

    /* renamed from: b */
    public final Y94<InterfaceC8824Vv> f122015b;

    /* renamed from: c */
    public final Y94<InterfaceC35412Qg1> f122016c;

    /* renamed from: d */
    public final Y94<FG6> f122017d;

    /* renamed from: e */
    public final Y94<Executor> f122018e;

    /* renamed from: f */
    public final Y94<BX5> f122019f;

    /* renamed from: g */
    public final Y94<InterfaceC38734bl0> f122020g;

    /* renamed from: h */
    public final Y94<InterfaceC38734bl0> f122021h;

    /* renamed from: i */
    public final Y94<InterfaceC33107Gk0> f122022i;

    public C52927zf6(Y94<Context> y94, Y94<InterfaceC8824Vv> y942, Y94<InterfaceC35412Qg1> y943, Y94<FG6> y944, Y94<Executor> y945, Y94<BX5> y946, Y94<InterfaceC38734bl0> y947, Y94<InterfaceC38734bl0> y948, Y94<InterfaceC33107Gk0> y949) {
        this.f122014a = y94;
        this.f122015b = y942;
        this.f122016c = y943;
        this.f122017d = y944;
        this.f122018e = y945;
        this.f122019f = y946;
        this.f122020g = y947;
        this.f122021h = y948;
        this.f122022i = y949;
    }

    /* renamed from: a */
    public static C52927zf6 m609a(Y94<Context> y94, Y94<InterfaceC8824Vv> y942, Y94<InterfaceC35412Qg1> y943, Y94<FG6> y944, Y94<Executor> y945, Y94<BX5> y946, Y94<InterfaceC38734bl0> y947, Y94<InterfaceC38734bl0> y948, Y94<InterfaceC33107Gk0> y949) {
        return new C52927zf6(y94, y942, y943, y944, y945, y946, y947, y948, y949);
    }

    /* renamed from: c */
    public static C52334yf6 m607c(Context context, InterfaceC8824Vv interfaceC8824Vv, InterfaceC35412Qg1 interfaceC35412Qg1, FG6 fg6, Executor executor, BX5 bx5, InterfaceC38734bl0 interfaceC38734bl0, InterfaceC38734bl0 interfaceC38734bl02, InterfaceC33107Gk0 interfaceC33107Gk0) {
        return new C52334yf6(context, interfaceC8824Vv, interfaceC35412Qg1, fg6, executor, bx5, interfaceC38734bl0, interfaceC38734bl02, interfaceC33107Gk0);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C52334yf6 get() {
        return m607c(this.f122014a.get(), this.f122015b.get(), this.f122016c.get(), this.f122017d.get(), this.f122018e.get(), this.f122019f.get(), this.f122020g.get(), this.f122021h.get(), this.f122022i.get());
    }
}
