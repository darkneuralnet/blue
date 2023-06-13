package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: Cg0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C32135Cg0 implements InterfaceC48812sj1<C31901Bg0> {

    /* renamed from: a */
    public final Y94<InterfaceC32369Dg0> f4472a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f4473b;

    /* renamed from: c */
    public final Y94<ScopeProvider> f4474c;

    /* renamed from: d */
    public final Y94<InterfaceC40099e13> f4475d;

    /* renamed from: e */
    public final Y94<AM3> f4476e;

    public C32135Cg0(Y94<InterfaceC32369Dg0> y94, Y94<C36207Tq4> y942, Y94<ScopeProvider> y943, Y94<InterfaceC40099e13> y944, Y94<AM3> y945) {
        this.f4472a = y94;
        this.f4473b = y942;
        this.f4474c = y943;
        this.f4475d = y944;
        this.f4476e = y945;
    }

    /* renamed from: a */
    public static C32135Cg0 m111908a(Y94<InterfaceC32369Dg0> y94, Y94<C36207Tq4> y942, Y94<ScopeProvider> y943, Y94<InterfaceC40099e13> y944, Y94<AM3> y945) {
        return new C32135Cg0(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C31901Bg0 m111906c(InterfaceC32369Dg0 interfaceC32369Dg0, C36207Tq4 c36207Tq4, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13, AM3 am3) {
        return new C31901Bg0(interfaceC32369Dg0, c36207Tq4, scopeProvider, interfaceC40099e13, am3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C31901Bg0 get() {
        return m111906c(this.f4472a.get(), this.f4473b.get(), this.f4474c.get(), this.f4475d.get(), this.f4476e.get());
    }
}
