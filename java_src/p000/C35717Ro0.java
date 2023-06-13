package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: Ro0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C35717Ro0 implements InterfaceC48812sj1<C35483Qo0> {

    /* renamed from: a */
    public final Y94<InterfaceC50047uo0> f32620a;

    /* renamed from: b */
    public final Y94<ScopeProvider> f32621b;

    /* renamed from: c */
    public final Y94<InterfaceC44721lp0> f32622c;

    /* renamed from: d */
    public final Y94<InterfaceC33845Jo0> f32623d;

    public C35717Ro0(Y94<InterfaceC50047uo0> y94, Y94<ScopeProvider> y942, Y94<InterfaceC44721lp0> y943, Y94<InterfaceC33845Jo0> y944) {
        this.f32620a = y94;
        this.f32621b = y942;
        this.f32622c = y943;
        this.f32623d = y944;
    }

    /* renamed from: a */
    public static C35717Ro0 m86285a(Y94<InterfaceC50047uo0> y94, Y94<ScopeProvider> y942, Y94<InterfaceC44721lp0> y943, Y94<InterfaceC33845Jo0> y944) {
        return new C35717Ro0(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C35483Qo0 m86283c(InterfaceC50047uo0 interfaceC50047uo0, ScopeProvider scopeProvider, InterfaceC44721lp0 interfaceC44721lp0, InterfaceC33845Jo0 interfaceC33845Jo0) {
        return new C35483Qo0(interfaceC50047uo0, scopeProvider, interfaceC44721lp0, interfaceC33845Jo0);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C35483Qo0 get() {
        return m86283c(this.f32620a.get(), this.f32621b.get(), this.f32622c.get(), this.f32623d.get());
    }
}
