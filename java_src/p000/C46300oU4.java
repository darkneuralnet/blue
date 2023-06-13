package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: oU4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46300oU4 {

    /* renamed from: a */
    public final Y94<C22454gl> f102061a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f102062b;

    public C46300oU4(Y94<C22454gl> y94, Y94<C36207Tq4> y942) {
        this.f102061a = y94;
        this.f102062b = y942;
    }

    /* renamed from: a */
    public static C46300oU4 m20990a(Y94<C22454gl> y94, Y94<C36207Tq4> y942) {
        return new C46300oU4(y94, y942);
    }

    /* renamed from: c */
    public static C44521lU4 m20988c(C22454gl c22454gl, C36207Tq4 c36207Tq4, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, P75 p75, InterfaceC40099e13 interfaceC40099e13) {
        return new C44521lU4(c22454gl, c36207Tq4, lifecycleScopeProvider, p75, interfaceC40099e13);
    }

    /* renamed from: b */
    public C44521lU4 m20989b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, P75 p75, InterfaceC40099e13 interfaceC40099e13) {
        return m20988c(this.f102061a.get(), this.f102062b.get(), lifecycleScopeProvider, p75, interfaceC40099e13);
    }
}
