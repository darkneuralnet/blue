package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: Fc4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32805Fc4 implements InterfaceC48812sj1<C32103Cc4> {

    /* renamed from: a */
    public final Y94<InterfaceC34209Lc4> f9762a;

    /* renamed from: b */
    public final Y94<ScopeProvider> f9763b;

    /* renamed from: c */
    public final Y94<InterfaceC39241cc4> f9764c;

    /* renamed from: d */
    public final Y94<InterfaceC33039Gc4> f9765d;

    /* renamed from: e */
    public final Y94<InterfaceC37857aG6> f9766e;

    /* renamed from: f */
    public final Y94<InterfaceC40099e13> f9767f;

    /* renamed from: g */
    public final Y94<C36207Tq4> f9768g;

    /* renamed from: h */
    public final Y94<InterfaceC31626Ab4> f9769h;

    public C32805Fc4(Y94<InterfaceC34209Lc4> y94, Y94<ScopeProvider> y942, Y94<InterfaceC39241cc4> y943, Y94<InterfaceC33039Gc4> y944, Y94<InterfaceC37857aG6> y945, Y94<InterfaceC40099e13> y946, Y94<C36207Tq4> y947, Y94<InterfaceC31626Ab4> y948) {
        this.f9762a = y94;
        this.f9763b = y942;
        this.f9764c = y943;
        this.f9765d = y944;
        this.f9766e = y945;
        this.f9767f = y946;
        this.f9768g = y947;
        this.f9769h = y948;
    }

    /* renamed from: a */
    public static C32805Fc4 m106906a(Y94<InterfaceC34209Lc4> y94, Y94<ScopeProvider> y942, Y94<InterfaceC39241cc4> y943, Y94<InterfaceC33039Gc4> y944, Y94<InterfaceC37857aG6> y945, Y94<InterfaceC40099e13> y946, Y94<C36207Tq4> y947, Y94<InterfaceC31626Ab4> y948) {
        return new C32805Fc4(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    /* renamed from: c */
    public static C32103Cc4 m106904c(InterfaceC34209Lc4 interfaceC34209Lc4, ScopeProvider scopeProvider, InterfaceC39241cc4 interfaceC39241cc4, InterfaceC33039Gc4 interfaceC33039Gc4, InterfaceC37857aG6 interfaceC37857aG6, InterfaceC40099e13 interfaceC40099e13, C36207Tq4 c36207Tq4, InterfaceC31626Ab4 interfaceC31626Ab4) {
        return new C32103Cc4(interfaceC34209Lc4, scopeProvider, interfaceC39241cc4, interfaceC33039Gc4, interfaceC37857aG6, interfaceC40099e13, c36207Tq4, interfaceC31626Ab4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C32103Cc4 get() {
        return m106904c(this.f9762a.get(), this.f9763b.get(), this.f9764c.get(), this.f9765d.get(), this.f9766e.get(), this.f9767f.get(), this.f9768g.get(), this.f9769h.get());
    }
}
