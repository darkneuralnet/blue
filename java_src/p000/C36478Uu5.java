package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: Uu5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36478Uu5 implements InterfaceC48812sj1<C35542Qu5> {

    /* renamed from: a */
    public final Y94<InterfaceC10636aM> f38247a;

    /* renamed from: b */
    public final Y94<InterfaceC33193Gt5> f38248b;

    /* renamed from: c */
    public final Y94<InterfaceC44647lh6> f38249c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f38250d;

    /* renamed from: e */
    public final Y94<ScopeProvider> f38251e;

    /* renamed from: f */
    public final Y94<InterfaceC38839bv5> f38252f;

    /* renamed from: g */
    public final Y94<InterfaceC40099e13> f38253g;

    /* renamed from: h */
    public final Y94<InterfaceC50112uu5> f38254h;

    /* renamed from: i */
    public final Y94<InterfaceC36712Vu5> f38255i;

    public C36478Uu5(Y94<InterfaceC10636aM> y94, Y94<InterfaceC33193Gt5> y942, Y94<InterfaceC44647lh6> y943, Y94<C36207Tq4> y944, Y94<ScopeProvider> y945, Y94<InterfaceC38839bv5> y946, Y94<InterfaceC40099e13> y947, Y94<InterfaceC50112uu5> y948, Y94<InterfaceC36712Vu5> y949) {
        this.f38247a = y94;
        this.f38248b = y942;
        this.f38249c = y943;
        this.f38250d = y944;
        this.f38251e = y945;
        this.f38252f = y946;
        this.f38253g = y947;
        this.f38254h = y948;
        this.f38255i = y949;
    }

    /* renamed from: a */
    public static C36478Uu5 m80638a(Y94<InterfaceC10636aM> y94, Y94<InterfaceC33193Gt5> y942, Y94<InterfaceC44647lh6> y943, Y94<C36207Tq4> y944, Y94<ScopeProvider> y945, Y94<InterfaceC38839bv5> y946, Y94<InterfaceC40099e13> y947, Y94<InterfaceC50112uu5> y948, Y94<InterfaceC36712Vu5> y949) {
        return new C36478Uu5(y94, y942, y943, y944, y945, y946, y947, y948, y949);
    }

    /* renamed from: c */
    public static C35542Qu5 m80636c(InterfaceC10636aM interfaceC10636aM, InterfaceC33193Gt5 interfaceC33193Gt5, InterfaceC44647lh6 interfaceC44647lh6, C36207Tq4 c36207Tq4, ScopeProvider scopeProvider, InterfaceC38839bv5 interfaceC38839bv5, InterfaceC40099e13 interfaceC40099e13, InterfaceC50112uu5 interfaceC50112uu5, InterfaceC36712Vu5 interfaceC36712Vu5) {
        return new C35542Qu5(interfaceC10636aM, interfaceC33193Gt5, interfaceC44647lh6, c36207Tq4, scopeProvider, interfaceC38839bv5, interfaceC40099e13, interfaceC50112uu5, interfaceC36712Vu5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C35542Qu5 get() {
        return m80636c(this.f38247a.get(), this.f38248b.get(), this.f38249c.get(), this.f38250d.get(), this.f38251e.get(), this.f38252f.get(), this.f38253g.get(), this.f38254h.get(), this.f38255i.get());
    }
}
