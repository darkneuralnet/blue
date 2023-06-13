package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: JW2 */
/* loaded from: classes2.dex */
public final class JW2 {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f17710a;

    public JW2(Y94<InterfaceC40099e13> y94) {
        this.f17710a = y94;
    }

    /* renamed from: a */
    public static JW2 m100316a(Y94<InterfaceC40099e13> y94) {
        return new JW2(y94);
    }

    /* renamed from: c */
    public static GW2 m100314c(InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider, KW2 kw2) {
        return new GW2(interfaceC40099e13, scopeProvider, kw2);
    }

    /* renamed from: b */
    public GW2 m100315b(ScopeProvider scopeProvider, KW2 kw2) {
        return m100314c(this.f17710a.get(), scopeProvider, kw2);
    }
}
