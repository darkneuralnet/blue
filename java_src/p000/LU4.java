package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: LU4 */
/* loaded from: classes3.dex */
public final class LU4 {

    /* renamed from: a */
    public final Y94<WU4> f21526a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f21527b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f21528c;

    public LU4(Y94<WU4> y94, Y94<InterfaceC1880Ea> y942, Y94<C36207Tq4> y943) {
        this.f21526a = y94;
        this.f21527b = y942;
        this.f21528c = y943;
    }

    /* renamed from: a */
    public static LU4 m96887a(Y94<WU4> y94, Y94<InterfaceC1880Ea> y942, Y94<C36207Tq4> y943) {
        return new LU4(y94, y942, y943);
    }

    /* renamed from: c */
    public static IU4 m96885c(WU4 wu4, InterfaceC1880Ea interfaceC1880Ea, C36207Tq4 c36207Tq4, MU4 mu4, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider) {
        return new IU4(wu4, interfaceC1880Ea, c36207Tq4, mu4, interfaceC40099e13, scopeProvider);
    }

    /* renamed from: b */
    public IU4 m96886b(MU4 mu4, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider) {
        return m96885c(this.f21526a.get(), this.f21527b.get(), this.f21528c.get(), mu4, interfaceC40099e13, scopeProvider);
    }
}
