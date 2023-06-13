package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: N65 */
/* loaded from: classes2.dex */
public final class N65 {

    /* renamed from: a */
    public final Y94<YR4> f24156a;

    /* renamed from: b */
    public final Y94<C52602z65> f24157b;

    public N65(Y94<YR4> y94, Y94<C52602z65> y942) {
        this.f24156a = y94;
        this.f24157b = y942;
    }

    /* renamed from: a */
    public static N65 m94368a(Y94<YR4> y94, Y94<C52602z65> y942) {
        return new N65(y94, y942);
    }

    /* renamed from: c */
    public static K65 m94366c(YR4 yr4, Y94<C52602z65> y94, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC40099e13 interfaceC40099e13) {
        return new K65(yr4, y94, lifecycleScopeProvider, interfaceC40099e13);
    }

    /* renamed from: b */
    public K65 m94367b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC40099e13 interfaceC40099e13) {
        return m94366c(this.f24156a.get(), this.f24157b, lifecycleScopeProvider, interfaceC40099e13);
    }
}
