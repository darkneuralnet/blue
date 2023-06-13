package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: AG3 */
/* loaded from: classes2.dex */
public final class AG3 {

    /* renamed from: a */
    public final Y94<YR4> f337a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f338b;

    public AG3(Y94<YR4> y94, Y94<InterfaceC1880Ea> y942) {
        this.f337a = y94;
        this.f338b = y942;
    }

    /* renamed from: a */
    public static AG3 m115943a(Y94<YR4> y94, Y94<InterfaceC1880Ea> y942) {
        return new AG3(y94, y942);
    }

    /* renamed from: c */
    public static C51508xG3 m115941c(YR4 yr4, InterfaceC1880Ea interfaceC1880Ea, BG3 bg3, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13) {
        return new C51508xG3(yr4, interfaceC1880Ea, bg3, scopeProvider, interfaceC40099e13);
    }

    /* renamed from: b */
    public C51508xG3 m115942b(BG3 bg3, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13) {
        return m115941c(this.f337a.get(), this.f338b.get(), bg3, scopeProvider, interfaceC40099e13);
    }
}
