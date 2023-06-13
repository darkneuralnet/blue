package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: WF6 */
/* loaded from: classes3.dex */
public final class WF6 implements InterfaceC48812sj1<VF6> {

    /* renamed from: a */
    public final Y94<XF6> f40668a;

    /* renamed from: b */
    public final Y94<ScopeProvider> f40669b;

    /* renamed from: c */
    public final Y94<JF6> f40670c;

    public WF6(Y94<XF6> y94, Y94<ScopeProvider> y942, Y94<JF6> y943) {
        this.f40668a = y94;
        this.f40669b = y942;
        this.f40670c = y943;
    }

    /* renamed from: a */
    public static WF6 m78655a(Y94<XF6> y94, Y94<ScopeProvider> y942, Y94<JF6> y943) {
        return new WF6(y94, y942, y943);
    }

    /* renamed from: c */
    public static VF6 m78653c(XF6 xf6, ScopeProvider scopeProvider, JF6 jf6) {
        return new VF6(xf6, scopeProvider, jf6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public VF6 get() {
        return m78653c(this.f40668a.get(), this.f40669b.get(), this.f40670c.get());
    }
}
