package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: DF6 */
/* loaded from: classes3.dex */
public final class DF6 implements InterfaceC48812sj1<CF6> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f5449a;

    /* renamed from: b */
    public final Y94<ScopeProvider> f5450b;

    /* renamed from: c */
    public final Y94<EF6> f5451c;

    /* renamed from: d */
    public final Y94<InterfaceC46167oF6> f5452d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f5453e;

    public DF6(Y94<InterfaceC40099e13> y94, Y94<ScopeProvider> y942, Y94<EF6> y943, Y94<InterfaceC46167oF6> y944, Y94<C36207Tq4> y945) {
        this.f5449a = y94;
        this.f5450b = y942;
        this.f5451c = y943;
        this.f5452d = y944;
        this.f5453e = y945;
    }

    /* renamed from: a */
    public static DF6 m110639a(Y94<InterfaceC40099e13> y94, Y94<ScopeProvider> y942, Y94<EF6> y943, Y94<InterfaceC46167oF6> y944, Y94<C36207Tq4> y945) {
        return new DF6(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static CF6 m110637c(InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider, EF6 ef6, InterfaceC46167oF6 interfaceC46167oF6, C36207Tq4 c36207Tq4) {
        return new CF6(interfaceC40099e13, scopeProvider, ef6, interfaceC46167oF6, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public CF6 get() {
        return m110637c(this.f5449a.get(), this.f5450b.get(), this.f5451c.get(), this.f5452d.get(), this.f5453e.get());
    }
}
