package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: DC2 */
/* loaded from: classes2.dex */
public final class DC2 {

    /* renamed from: a */
    public final Y94<InterfaceC44637lg6> f5379a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f5380b;

    /* renamed from: c */
    public final Y94<InterfaceC34949Og6> f5381c;

    public DC2(Y94<InterfaceC44637lg6> y94, Y94<InterfaceC1880Ea> y942, Y94<InterfaceC34949Og6> y943) {
        this.f5379a = y94;
        this.f5380b = y942;
        this.f5381c = y943;
    }

    /* renamed from: a */
    public static DC2 m110693a(Y94<InterfaceC44637lg6> y94, Y94<InterfaceC1880Ea> y942, Y94<InterfaceC34949Og6> y943) {
        return new DC2(y94, y942, y943);
    }

    /* renamed from: c */
    public static AC2 m110691c(InterfaceC44637lg6 interfaceC44637lg6, InterfaceC1880Ea interfaceC1880Ea, InterfaceC34949Og6 interfaceC34949Og6, QA2 qa2, ScopeProvider scopeProvider, InterfaceC35651Rg6 interfaceC35651Rg6, InterfaceC40099e13 interfaceC40099e13) {
        return new AC2(interfaceC44637lg6, interfaceC1880Ea, interfaceC34949Og6, qa2, scopeProvider, interfaceC35651Rg6, interfaceC40099e13);
    }

    /* renamed from: b */
    public AC2 m110692b(QA2 qa2, ScopeProvider scopeProvider, InterfaceC35651Rg6 interfaceC35651Rg6, InterfaceC40099e13 interfaceC40099e13) {
        return m110691c(this.f5379a.get(), this.f5380b.get(), this.f5381c.get(), qa2, scopeProvider, interfaceC35651Rg6, interfaceC40099e13);
    }
}
