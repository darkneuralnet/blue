package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: ws2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51274ws2 implements InterfaceC48812sj1<C50681vs2> {

    /* renamed from: a */
    public final Y94<InterfaceC37857aG6> f116690a;

    /* renamed from: b */
    public final Y94<InterfaceC31626Ab4> f116691b;

    /* renamed from: c */
    public final Y94<InterfaceC48923su2> f116692c;

    /* renamed from: d */
    public final Y94<InterfaceC40099e13> f116693d;

    /* renamed from: e */
    public final Y94<ScopeProvider> f116694e;

    /* renamed from: f */
    public final Y94<C36207Tq4> f116695f;

    /* renamed from: g */
    public final Y94<InterfaceC51867xs2> f116696g;

    /* renamed from: h */
    public final Y94<InterfaceC43567js2> f116697h;

    public C51274ws2(Y94<InterfaceC37857aG6> y94, Y94<InterfaceC31626Ab4> y942, Y94<InterfaceC48923su2> y943, Y94<InterfaceC40099e13> y944, Y94<ScopeProvider> y945, Y94<C36207Tq4> y946, Y94<InterfaceC51867xs2> y947, Y94<InterfaceC43567js2> y948) {
        this.f116690a = y94;
        this.f116691b = y942;
        this.f116692c = y943;
        this.f116693d = y944;
        this.f116694e = y945;
        this.f116695f = y946;
        this.f116696g = y947;
        this.f116697h = y948;
    }

    /* renamed from: a */
    public static C51274ws2 m6200a(Y94<InterfaceC37857aG6> y94, Y94<InterfaceC31626Ab4> y942, Y94<InterfaceC48923su2> y943, Y94<InterfaceC40099e13> y944, Y94<ScopeProvider> y945, Y94<C36207Tq4> y946, Y94<InterfaceC51867xs2> y947, Y94<InterfaceC43567js2> y948) {
        return new C51274ws2(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    /* renamed from: c */
    public static C50681vs2 m6198c(InterfaceC37857aG6 interfaceC37857aG6, InterfaceC31626Ab4 interfaceC31626Ab4, InterfaceC48923su2 interfaceC48923su2, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider, C36207Tq4 c36207Tq4, InterfaceC51867xs2 interfaceC51867xs2, InterfaceC43567js2 interfaceC43567js2) {
        return new C50681vs2(interfaceC37857aG6, interfaceC31626Ab4, interfaceC48923su2, interfaceC40099e13, scopeProvider, c36207Tq4, interfaceC51867xs2, interfaceC43567js2);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C50681vs2 get() {
        return m6198c(this.f116690a.get(), this.f116691b.get(), this.f116692c.get(), this.f116693d.get(), this.f116694e.get(), this.f116695f.get(), this.f116696g.get(), this.f116697h.get());
    }
}
