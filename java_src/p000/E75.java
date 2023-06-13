package p000;

import android.content.Context;
import com.uber.autodispose.ScopeProvider;
/* renamed from: E75 */
/* loaded from: classes3.dex */
public final class E75 implements InterfaceC48812sj1<C75> {

    /* renamed from: a */
    public final Y94<C22454gl> f6982a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f6983b;

    /* renamed from: c */
    public final Y94<Context> f6984c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f6985d;

    /* renamed from: e */
    public final Y94<ScopeProvider> f6986e;

    /* renamed from: f */
    public final Y94<F75> f6987f;

    /* renamed from: g */
    public final Y94<HN4> f6988g;

    /* renamed from: h */
    public final Y94<InterfaceC40099e13> f6989h;

    /* renamed from: i */
    public final Y94<InterfaceC35583Qz1> f6990i;

    /* renamed from: j */
    public final Y94<YR4> f6991j;

    /* renamed from: k */
    public final Y94<InterfaceC32874Fk1> f6992k;

    public E75(Y94<C22454gl> y94, Y94<InterfaceC1880Ea> y942, Y94<Context> y943, Y94<C36207Tq4> y944, Y94<ScopeProvider> y945, Y94<F75> y946, Y94<HN4> y947, Y94<InterfaceC40099e13> y948, Y94<InterfaceC35583Qz1> y949, Y94<YR4> y9410, Y94<InterfaceC32874Fk1> y9411) {
        this.f6982a = y94;
        this.f6983b = y942;
        this.f6984c = y943;
        this.f6985d = y944;
        this.f6986e = y945;
        this.f6987f = y946;
        this.f6988g = y947;
        this.f6989h = y948;
        this.f6990i = y949;
        this.f6991j = y9410;
        this.f6992k = y9411;
    }

    /* renamed from: a */
    public static E75 m109366a(Y94<C22454gl> y94, Y94<InterfaceC1880Ea> y942, Y94<Context> y943, Y94<C36207Tq4> y944, Y94<ScopeProvider> y945, Y94<F75> y946, Y94<HN4> y947, Y94<InterfaceC40099e13> y948, Y94<InterfaceC35583Qz1> y949, Y94<YR4> y9410, Y94<InterfaceC32874Fk1> y9411) {
        return new E75(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411);
    }

    /* renamed from: c */
    public static C75 m109364c(C22454gl c22454gl, InterfaceC1880Ea interfaceC1880Ea, Context context, C36207Tq4 c36207Tq4, ScopeProvider scopeProvider, F75 f75, HN4 hn4, InterfaceC40099e13 interfaceC40099e13, InterfaceC35583Qz1 interfaceC35583Qz1, YR4 yr4, InterfaceC32874Fk1 interfaceC32874Fk1) {
        return new C75(c22454gl, interfaceC1880Ea, context, c36207Tq4, scopeProvider, f75, hn4, interfaceC40099e13, interfaceC35583Qz1, yr4, interfaceC32874Fk1);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C75 get() {
        return m109364c(this.f6982a.get(), this.f6983b.get(), this.f6984c.get(), this.f6985d.get(), this.f6986e.get(), this.f6987f.get(), this.f6988g.get(), this.f6989h.get(), this.f6990i.get(), this.f6991j.get(), this.f6992k.get());
    }
}
