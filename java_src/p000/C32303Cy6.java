package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: Cy6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32303Cy6 implements InterfaceC48812sj1<C43038iy6> {

    /* renamed from: a */
    public final Y94<InterfaceC44647lh6> f4976a;

    /* renamed from: b */
    public final Y94<InterfaceC36047Sy6> f4977b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f4978c;

    /* renamed from: d */
    public final Y94<ScopeProvider> f4979d;

    /* renamed from: e */
    public final Y94<InterfaceC40099e13> f4980e;

    public C32303Cy6(Y94<InterfaceC44647lh6> y94, Y94<InterfaceC36047Sy6> y942, Y94<C36207Tq4> y943, Y94<ScopeProvider> y944, Y94<InterfaceC40099e13> y945) {
        this.f4976a = y94;
        this.f4977b = y942;
        this.f4978c = y943;
        this.f4979d = y944;
        this.f4980e = y945;
    }

    /* renamed from: a */
    public static C32303Cy6 m111187a(Y94<InterfaceC44647lh6> y94, Y94<InterfaceC36047Sy6> y942, Y94<C36207Tq4> y943, Y94<ScopeProvider> y944, Y94<InterfaceC40099e13> y945) {
        return new C32303Cy6(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C43038iy6 m111185c(InterfaceC44647lh6 interfaceC44647lh6, InterfaceC36047Sy6 interfaceC36047Sy6, C36207Tq4 c36207Tq4, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13) {
        return new C43038iy6(interfaceC44647lh6, interfaceC36047Sy6, c36207Tq4, scopeProvider, interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C43038iy6 get() {
        return m111185c(this.f4976a.get(), this.f4977b.get(), this.f4978c.get(), this.f4979d.get(), this.f4980e.get());
    }
}
