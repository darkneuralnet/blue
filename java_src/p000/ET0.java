package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: ET0 */
/* loaded from: classes2.dex */
public final class ET0 {

    /* renamed from: a */
    public final Y94<JT0> f7517a;

    /* renamed from: b */
    public final Y94<C22454gl> f7518b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f7519c;

    public ET0(Y94<JT0> y94, Y94<C22454gl> y942, Y94<InterfaceC1880Ea> y943) {
        this.f7517a = y94;
        this.f7518b = y942;
        this.f7519c = y943;
    }

    /* renamed from: a */
    public static ET0 m108947a(Y94<JT0> y94, Y94<C22454gl> y942, Y94<InterfaceC1880Ea> y943) {
        return new ET0(y94, y942, y943);
    }

    /* renamed from: c */
    public static BT0 m108945c(JT0 jt0, C22454gl c22454gl, InterfaceC1880Ea interfaceC1880Ea, FT0 ft0, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider) {
        return new BT0(jt0, c22454gl, interfaceC1880Ea, ft0, interfaceC40099e13, scopeProvider);
    }

    /* renamed from: b */
    public BT0 m108946b(FT0 ft0, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider) {
        return m108945c(this.f7517a.get(), this.f7518b.get(), this.f7519c.get(), ft0, interfaceC40099e13, scopeProvider);
    }
}
