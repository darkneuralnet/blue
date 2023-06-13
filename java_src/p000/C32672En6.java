package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: En6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C32672En6 {

    /* renamed from: a */
    public final Y94<YR4> f8134a;

    /* renamed from: b */
    public final Y94<InterfaceC40099e13> f8135b;

    public C32672En6(Y94<YR4> y94, Y94<InterfaceC40099e13> y942) {
        this.f8134a = y94;
        this.f8135b = y942;
    }

    /* renamed from: a */
    public static C32672En6 m108358a(Y94<YR4> y94, Y94<InterfaceC40099e13> y942) {
        return new C32672En6(y94, y942);
    }

    /* renamed from: c */
    public static C53007zn6 m108356c(YR4 yr4, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider, InterfaceC32906Fn6 interfaceC32906Fn6) {
        return new C53007zn6(yr4, interfaceC40099e13, scopeProvider, interfaceC32906Fn6);
    }

    /* renamed from: b */
    public C53007zn6 m108357b(ScopeProvider scopeProvider, InterfaceC32906Fn6 interfaceC32906Fn6) {
        return m108356c(this.f8134a.get(), this.f8135b.get(), scopeProvider, interfaceC32906Fn6);
    }
}
