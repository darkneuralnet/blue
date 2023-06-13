package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: IB4 */
/* loaded from: classes3.dex */
public final class IB4 implements InterfaceC48812sj1<HB4> {

    /* renamed from: a */
    public final Y94<C43038iy6> f14636a;

    /* renamed from: b */
    public final Y94<JB4> f14637b;

    /* renamed from: c */
    public final Y94<ScopeProvider> f14638c;

    /* renamed from: d */
    public final Y94<InterfaceC40099e13> f14639d;

    /* renamed from: e */
    public final Y94<DQ3> f14640e;

    public IB4(Y94<C43038iy6> y94, Y94<JB4> y942, Y94<ScopeProvider> y943, Y94<InterfaceC40099e13> y944, Y94<DQ3> y945) {
        this.f14636a = y94;
        this.f14637b = y942;
        this.f14638c = y943;
        this.f14639d = y944;
        this.f14640e = y945;
    }

    /* renamed from: a */
    public static IB4 m102820a(Y94<C43038iy6> y94, Y94<JB4> y942, Y94<ScopeProvider> y943, Y94<InterfaceC40099e13> y944, Y94<DQ3> y945) {
        return new IB4(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static HB4 m102818c(C43038iy6 c43038iy6, JB4 jb4, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13, DQ3 dq3) {
        return new HB4(c43038iy6, jb4, scopeProvider, interfaceC40099e13, dq3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public HB4 get() {
        return m102818c(this.f14636a.get(), this.f14637b.get(), this.f14638c.get(), this.f14639d.get(), this.f14640e.get());
    }
}
