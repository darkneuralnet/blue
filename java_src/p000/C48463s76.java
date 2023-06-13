package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: s76  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48463s76 {

    /* renamed from: a */
    public final Y94<InterfaceC44647lh6> f108313a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f108314b;

    public C48463s76(Y94<InterfaceC44647lh6> y94, Y94<InterfaceC1880Ea> y942) {
        this.f108313a = y94;
        this.f108314b = y942;
    }

    /* renamed from: a */
    public static C48463s76 m14757a(Y94<InterfaceC44647lh6> y94, Y94<InterfaceC1880Ea> y942) {
        return new C48463s76(y94, y942);
    }

    /* renamed from: c */
    public static C46092o76 m14755c(InterfaceC44647lh6 interfaceC44647lh6, InterfaceC1880Ea interfaceC1880Ea, ScopeProvider scopeProvider, C49649u76 c49649u76, InterfaceC40099e13 interfaceC40099e13) {
        return new C46092o76(interfaceC44647lh6, interfaceC1880Ea, scopeProvider, c49649u76, interfaceC40099e13);
    }

    /* renamed from: b */
    public C46092o76 m14756b(ScopeProvider scopeProvider, C49649u76 c49649u76, InterfaceC40099e13 interfaceC40099e13) {
        return m14755c(this.f108313a.get(), this.f108314b.get(), scopeProvider, c49649u76, interfaceC40099e13);
    }
}
