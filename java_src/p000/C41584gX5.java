package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: gX5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41584gX5 implements InterfaceC48812sj1<C40991fX5> {

    /* renamed from: a */
    public final Y94<InterfaceC37857aG6> f82384a;

    /* renamed from: b */
    public final Y94<InterfaceC31626Ab4> f82385b;

    /* renamed from: c */
    public final Y94<InterfaceC48923su2> f82386c;

    /* renamed from: d */
    public final Y94<InterfaceC40099e13> f82387d;

    /* renamed from: e */
    public final Y94<ScopeProvider> f82388e;

    /* renamed from: f */
    public final Y94<C36207Tq4> f82389f;

    /* renamed from: g */
    public final Y94<InterfaceC42770iX5> f82390g;

    /* renamed from: h */
    public final Y94<LW5> f82391h;

    public C41584gX5(Y94<InterfaceC37857aG6> y94, Y94<InterfaceC31626Ab4> y942, Y94<InterfaceC48923su2> y943, Y94<InterfaceC40099e13> y944, Y94<ScopeProvider> y945, Y94<C36207Tq4> y946, Y94<InterfaceC42770iX5> y947, Y94<LW5> y948) {
        this.f82384a = y94;
        this.f82385b = y942;
        this.f82386c = y943;
        this.f82387d = y944;
        this.f82388e = y945;
        this.f82389f = y946;
        this.f82390g = y947;
        this.f82391h = y948;
    }

    /* renamed from: a */
    public static C41584gX5 m39186a(Y94<InterfaceC37857aG6> y94, Y94<InterfaceC31626Ab4> y942, Y94<InterfaceC48923su2> y943, Y94<InterfaceC40099e13> y944, Y94<ScopeProvider> y945, Y94<C36207Tq4> y946, Y94<InterfaceC42770iX5> y947, Y94<LW5> y948) {
        return new C41584gX5(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    /* renamed from: c */
    public static C40991fX5 m39184c(InterfaceC37857aG6 interfaceC37857aG6, InterfaceC31626Ab4 interfaceC31626Ab4, InterfaceC48923su2 interfaceC48923su2, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider, C36207Tq4 c36207Tq4, InterfaceC42770iX5 interfaceC42770iX5, LW5 lw5) {
        return new C40991fX5(interfaceC37857aG6, interfaceC31626Ab4, interfaceC48923su2, interfaceC40099e13, scopeProvider, c36207Tq4, interfaceC42770iX5, lw5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C40991fX5 get() {
        return m39184c(this.f82384a.get(), this.f82385b.get(), this.f82386c.get(), this.f82387d.get(), this.f82388e.get(), this.f82389f.get(), this.f82390g.get(), this.f82391h.get());
    }
}
