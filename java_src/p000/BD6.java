package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: BD6 */
/* loaded from: classes3.dex */
public final class BD6 implements InterfaceC48812sj1<C52077yD6> {

    /* renamed from: a */
    public final Y94<InterfaceC10636aM> f2101a;

    /* renamed from: b */
    public final Y94<InterfaceC44647lh6> f2102b;

    /* renamed from: c */
    public final Y94<InterfaceC37857aG6> f2103c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f2104d;

    /* renamed from: e */
    public final Y94<CD6> f2105e;

    /* renamed from: f */
    public final Y94<ScopeProvider> f2106f;

    /* renamed from: g */
    public final Y94<InterfaceC40099e13> f2107g;

    /* renamed from: h */
    public final Y94<InterfaceC43777kD6> f2108h;

    public BD6(Y94<InterfaceC10636aM> y94, Y94<InterfaceC44647lh6> y942, Y94<InterfaceC37857aG6> y943, Y94<C36207Tq4> y944, Y94<CD6> y945, Y94<ScopeProvider> y946, Y94<InterfaceC40099e13> y947, Y94<InterfaceC43777kD6> y948) {
        this.f2101a = y94;
        this.f2102b = y942;
        this.f2103c = y943;
        this.f2104d = y944;
        this.f2105e = y945;
        this.f2106f = y946;
        this.f2107g = y947;
        this.f2108h = y948;
    }

    /* renamed from: a */
    public static BD6 m114205a(Y94<InterfaceC10636aM> y94, Y94<InterfaceC44647lh6> y942, Y94<InterfaceC37857aG6> y943, Y94<C36207Tq4> y944, Y94<CD6> y945, Y94<ScopeProvider> y946, Y94<InterfaceC40099e13> y947, Y94<InterfaceC43777kD6> y948) {
        return new BD6(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    /* renamed from: c */
    public static C52077yD6 m114203c(InterfaceC10636aM interfaceC10636aM, InterfaceC44647lh6 interfaceC44647lh6, InterfaceC37857aG6 interfaceC37857aG6, C36207Tq4 c36207Tq4, CD6 cd6, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13, InterfaceC43777kD6 interfaceC43777kD6) {
        return new C52077yD6(interfaceC10636aM, interfaceC44647lh6, interfaceC37857aG6, c36207Tq4, cd6, scopeProvider, interfaceC40099e13, interfaceC43777kD6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C52077yD6 get() {
        return m114203c(this.f2101a.get(), this.f2102b.get(), this.f2103c.get(), this.f2104d.get(), this.f2105e.get(), this.f2106f.get(), this.f2107g.get(), this.f2108h.get());
    }
}
