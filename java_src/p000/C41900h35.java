package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: h35  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41900h35 implements InterfaceC48812sj1<C41307g35> {

    /* renamed from: a */
    public final Y94<InterfaceC32874Fk1> f84665a;

    /* renamed from: b */
    public final Y94<GI3> f84666b;

    /* renamed from: c */
    public final Y94<C22454gl> f84667c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f84668d;

    /* renamed from: e */
    public final Y94<ScopeProvider> f84669e;

    /* renamed from: f */
    public final Y94<InterfaceC40099e13> f84670f;

    /* renamed from: g */
    public final Y94<InterfaceC42493i35> f84671g;

    public C41900h35(Y94<InterfaceC32874Fk1> y94, Y94<GI3> y942, Y94<C22454gl> y943, Y94<C36207Tq4> y944, Y94<ScopeProvider> y945, Y94<InterfaceC40099e13> y946, Y94<InterfaceC42493i35> y947) {
        this.f84665a = y94;
        this.f84666b = y942;
        this.f84667c = y943;
        this.f84668d = y944;
        this.f84669e = y945;
        this.f84670f = y946;
        this.f84671g = y947;
    }

    /* renamed from: a */
    public static C41900h35 m36876a(Y94<InterfaceC32874Fk1> y94, Y94<GI3> y942, Y94<C22454gl> y943, Y94<C36207Tq4> y944, Y94<ScopeProvider> y945, Y94<InterfaceC40099e13> y946, Y94<InterfaceC42493i35> y947) {
        return new C41900h35(y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static C41307g35 m36874c(InterfaceC32874Fk1 interfaceC32874Fk1, GI3 gi3, C22454gl c22454gl, C36207Tq4 c36207Tq4, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13, InterfaceC42493i35 interfaceC42493i35) {
        return new C41307g35(interfaceC32874Fk1, gi3, c22454gl, c36207Tq4, scopeProvider, interfaceC40099e13, interfaceC42493i35);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C41307g35 get() {
        return m36874c(this.f84665a.get(), this.f84666b.get(), this.f84667c.get(), this.f84668d.get(), this.f84669e.get(), this.f84670f.get(), this.f84671g.get());
    }
}
