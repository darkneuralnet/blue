package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: Tz2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36286Tz2 {

    /* renamed from: a */
    public final Y94<C36207Tq4> f36580a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f36581b;

    public C36286Tz2(Y94<C36207Tq4> y94, Y94<InterfaceC1880Ea> y942) {
        this.f36580a = y94;
        this.f36581b = y942;
    }

    /* renamed from: a */
    public static C36286Tz2 m82204a(Y94<C36207Tq4> y94, Y94<InterfaceC1880Ea> y942) {
        return new C36286Tz2(y94, y942);
    }

    /* renamed from: c */
    public static C35584Qz2 m82202c(C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea, QA2 qa2, ScopeProvider scopeProvider, C47195pz2<C38884c01> c47195pz2, InterfaceC40099e13 interfaceC40099e13) {
        return new C35584Qz2(c36207Tq4, interfaceC1880Ea, qa2, scopeProvider, c47195pz2, interfaceC40099e13);
    }

    /* renamed from: b */
    public C35584Qz2 m82203b(QA2 qa2, ScopeProvider scopeProvider, C47195pz2<C38884c01> c47195pz2, InterfaceC40099e13 interfaceC40099e13) {
        return m82202c(this.f36580a.get(), this.f36581b.get(), qa2, scopeProvider, c47195pz2, interfaceC40099e13);
    }
}
