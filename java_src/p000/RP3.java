package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: RP3 */
/* loaded from: classes2.dex */
public final class RP3 {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f32000a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f32001b;

    /* renamed from: c */
    public final Y94<AM3> f32002c;

    /* renamed from: d */
    public final Y94<VM3> f32003d;

    /* renamed from: e */
    public final Y94<YR4> f32004e;

    public RP3(Y94<InterfaceC1880Ea> y94, Y94<C36207Tq4> y942, Y94<AM3> y943, Y94<VM3> y944, Y94<YR4> y945) {
        this.f32000a = y94;
        this.f32001b = y942;
        this.f32002c = y943;
        this.f32003d = y944;
        this.f32004e = y945;
    }

    /* renamed from: a */
    public static RP3 m86775a(Y94<InterfaceC1880Ea> y94, Y94<C36207Tq4> y942, Y94<AM3> y943, Y94<VM3> y944, Y94<YR4> y945) {
        return new RP3(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static OP3 m86773c(InterfaceC1880Ea interfaceC1880Ea, C36207Tq4 c36207Tq4, AM3 am3, VM3 vm3, YR4 yr4, SP3 sp3, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13) {
        return new OP3(interfaceC1880Ea, c36207Tq4, am3, vm3, yr4, sp3, scopeProvider, interfaceC40099e13);
    }

    /* renamed from: b */
    public OP3 m86774b(SP3 sp3, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13) {
        return m86773c(this.f32000a.get(), this.f32001b.get(), this.f32002c.get(), this.f32003d.get(), this.f32004e.get(), sp3, scopeProvider, interfaceC40099e13);
    }
}
