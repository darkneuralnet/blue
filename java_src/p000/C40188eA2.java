package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: eA2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40188eA2 {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f78042a;

    /* renamed from: b */
    public final Y94<InterfaceC40001dr4> f78043b;

    /* renamed from: c */
    public final Y94<InterfaceC32292Cx4> f78044c;

    public C40188eA2(Y94<InterfaceC1880Ea> y94, Y94<InterfaceC40001dr4> y942, Y94<InterfaceC32292Cx4> y943) {
        this.f78042a = y94;
        this.f78043b = y942;
        this.f78044c = y943;
    }

    /* renamed from: a */
    public static C40188eA2 m43163a(Y94<InterfaceC1880Ea> y94, Y94<InterfaceC40001dr4> y942, Y94<InterfaceC32292Cx4> y943) {
        return new C40188eA2(y94, y942, y943);
    }

    /* renamed from: c */
    public static C38392bA2 m43161c(InterfaceC1880Ea interfaceC1880Ea, InterfaceC40001dr4 interfaceC40001dr4, InterfaceC32292Cx4 interfaceC32292Cx4, QA2 qa2, ScopeProvider scopeProvider, C40781fA2 c40781fA2, InterfaceC40099e13 interfaceC40099e13) {
        return new C38392bA2(interfaceC1880Ea, interfaceC40001dr4, interfaceC32292Cx4, qa2, scopeProvider, c40781fA2, interfaceC40099e13);
    }

    /* renamed from: b */
    public C38392bA2 m43162b(QA2 qa2, ScopeProvider scopeProvider, C40781fA2 c40781fA2, InterfaceC40099e13 interfaceC40099e13) {
        return m43161c(this.f78042a.get(), this.f78043b.get(), this.f78044c.get(), qa2, scopeProvider, c40781fA2, interfaceC40099e13);
    }
}
