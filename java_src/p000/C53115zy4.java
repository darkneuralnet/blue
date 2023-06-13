package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: zy4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C53115zy4 {

    /* renamed from: a */
    public final Y94<C36207Tq4> f122539a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f122540b;

    public C53115zy4(Y94<C36207Tq4> y94, Y94<InterfaceC1880Ea> y942) {
        this.f122539a = y94;
        this.f122540b = y942;
    }

    /* renamed from: a */
    public static C53115zy4 m53a(Y94<C36207Tq4> y94, Y94<InterfaceC1880Ea> y942) {
        return new C53115zy4(y94, y942);
    }

    /* renamed from: c */
    public static C51336wy4 m51c(C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea, QA2 qa2, ScopeProvider scopeProvider, C47195pz2<C32058Bx4> c47195pz2, InterfaceC40099e13 interfaceC40099e13) {
        return new C51336wy4(c36207Tq4, interfaceC1880Ea, qa2, scopeProvider, c47195pz2, interfaceC40099e13);
    }

    /* renamed from: b */
    public C51336wy4 m52b(QA2 qa2, ScopeProvider scopeProvider, C47195pz2<C32058Bx4> c47195pz2, InterfaceC40099e13 interfaceC40099e13) {
        return m51c(this.f122539a.get(), this.f122540b.get(), qa2, scopeProvider, c47195pz2, interfaceC40099e13);
    }
}
