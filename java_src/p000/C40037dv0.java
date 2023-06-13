package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: dv0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40037dv0 {

    /* renamed from: a */
    public final Y94<InterfaceC47153pv0> f77408a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f77409b;

    /* renamed from: c */
    public final Y94<C51174wi2> f77410c;

    /* renamed from: d */
    public final Y94<InterfaceC6097Oh> f77411d;

    public C40037dv0(Y94<InterfaceC47153pv0> y94, Y94<C36207Tq4> y942, Y94<C51174wi2> y943, Y94<InterfaceC6097Oh> y944) {
        this.f77408a = y94;
        this.f77409b = y942;
        this.f77410c = y943;
        this.f77411d = y944;
    }

    /* renamed from: a */
    public static C40037dv0 m43510a(Y94<InterfaceC47153pv0> y94, Y94<C36207Tq4> y942, Y94<C51174wi2> y943, Y94<InterfaceC6097Oh> y944) {
        return new C40037dv0(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C38241av0 m43508c(InterfaceC47153pv0 interfaceC47153pv0, C36207Tq4 c36207Tq4, C51174wi2 c51174wi2, InterfaceC6097Oh interfaceC6097Oh, ScopeProvider scopeProvider, InterfaceC40630ev0 interfaceC40630ev0) {
        return new C38241av0(interfaceC47153pv0, c36207Tq4, c51174wi2, interfaceC6097Oh, scopeProvider, interfaceC40630ev0);
    }

    /* renamed from: b */
    public C38241av0 m43509b(ScopeProvider scopeProvider, InterfaceC40630ev0 interfaceC40630ev0) {
        return m43508c(this.f77408a.get(), this.f77409b.get(), this.f77410c.get(), this.f77411d.get(), scopeProvider, interfaceC40630ev0);
    }
}
