package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: O84 */
/* loaded from: classes3.dex */
public final class O84 implements InterfaceC48812sj1<I84> {

    /* renamed from: a */
    public final Y94<V74> f25951a;

    /* renamed from: b */
    public final Y94<C48471s84> f25952b;

    /* renamed from: c */
    public final Y94<P84> f25953c;

    /* renamed from: d */
    public final Y94<ScopeProvider> f25954d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f25955e;

    public O84(Y94<V74> y94, Y94<C48471s84> y942, Y94<P84> y943, Y94<ScopeProvider> y944, Y94<C36207Tq4> y945) {
        this.f25951a = y94;
        this.f25952b = y942;
        this.f25953c = y943;
        this.f25954d = y944;
        this.f25955e = y945;
    }

    /* renamed from: a */
    public static O84 m92847a(Y94<V74> y94, Y94<C48471s84> y942, Y94<P84> y943, Y94<ScopeProvider> y944, Y94<C36207Tq4> y945) {
        return new O84(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static I84 m92845c(V74 v74, C48471s84 c48471s84, P84 p84, ScopeProvider scopeProvider, C36207Tq4 c36207Tq4) {
        return new I84(v74, c48471s84, p84, scopeProvider, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public I84 get() {
        return m92845c(this.f25951a.get(), this.f25952b.get(), this.f25953c.get(), this.f25954d.get(), this.f25955e.get());
    }
}
