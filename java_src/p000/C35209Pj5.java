package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: Pj5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35209Pj5 implements InterfaceC48812sj1<C34039Kj5> {

    /* renamed from: a */
    public final Y94<InterfaceC46473om3> f28962a;

    /* renamed from: b */
    public final Y94<InterfaceC7381SM> f28963b;

    /* renamed from: c */
    public final Y94<NQ5> f28964c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f28965d;

    /* renamed from: e */
    public final Y94<ScopeProvider> f28966e;

    /* renamed from: f */
    public final Y94<InterfaceC35443Qj5> f28967f;

    /* renamed from: g */
    public final Y94<InterfaceC40099e13> f28968g;

    public C35209Pj5(Y94<InterfaceC46473om3> y94, Y94<InterfaceC7381SM> y942, Y94<NQ5> y943, Y94<C36207Tq4> y944, Y94<ScopeProvider> y945, Y94<InterfaceC35443Qj5> y946, Y94<InterfaceC40099e13> y947) {
        this.f28962a = y94;
        this.f28963b = y942;
        this.f28964c = y943;
        this.f28965d = y944;
        this.f28966e = y945;
        this.f28967f = y946;
        this.f28968g = y947;
    }

    /* renamed from: a */
    public static C35209Pj5 m89889a(Y94<InterfaceC46473om3> y94, Y94<InterfaceC7381SM> y942, Y94<NQ5> y943, Y94<C36207Tq4> y944, Y94<ScopeProvider> y945, Y94<InterfaceC35443Qj5> y946, Y94<InterfaceC40099e13> y947) {
        return new C35209Pj5(y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static C34039Kj5 m89887c(InterfaceC46473om3 interfaceC46473om3, InterfaceC7381SM interfaceC7381SM, NQ5 nq5, C36207Tq4 c36207Tq4, ScopeProvider scopeProvider, InterfaceC35443Qj5 interfaceC35443Qj5, InterfaceC40099e13 interfaceC40099e13) {
        return new C34039Kj5(interfaceC46473om3, interfaceC7381SM, nq5, c36207Tq4, scopeProvider, interfaceC35443Qj5, interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C34039Kj5 get() {
        return m89887c(this.f28962a.get(), this.f28963b.get(), this.f28964c.get(), this.f28965d.get(), this.f28966e.get(), this.f28967f.get(), this.f28968g.get());
    }
}
