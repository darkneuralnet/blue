package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: Kr5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34111Kr5 {

    /* renamed from: a */
    public final Y94<C36207Tq4> f20282a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f20283b;

    /* renamed from: c */
    public final Y94<InterfaceC46893pU4> f20284c;

    public C34111Kr5(Y94<C36207Tq4> y94, Y94<InterfaceC1880Ea> y942, Y94<InterfaceC46893pU4> y943) {
        this.f20282a = y94;
        this.f20283b = y942;
        this.f20284c = y943;
    }

    /* renamed from: a */
    public static C34111Kr5 m98230a(Y94<C36207Tq4> y94, Y94<InterfaceC1880Ea> y942, Y94<InterfaceC46893pU4> y943) {
        return new C34111Kr5(y94, y942, y943);
    }

    /* renamed from: c */
    public static C33409Hr5 m98228c(C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea, InterfaceC46893pU4 interfaceC46893pU4, InterfaceC34345Lr5 interfaceC34345Lr5, ScopeProvider scopeProvider) {
        return new C33409Hr5(c36207Tq4, interfaceC1880Ea, interfaceC46893pU4, interfaceC34345Lr5, scopeProvider);
    }

    /* renamed from: b */
    public C33409Hr5 m98229b(InterfaceC34345Lr5 interfaceC34345Lr5, ScopeProvider scopeProvider) {
        return m98228c(this.f20282a.get(), this.f20283b.get(), this.f20284c.get(), interfaceC34345Lr5, scopeProvider);
    }
}
