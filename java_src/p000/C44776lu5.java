package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: lu5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44776lu5 implements InterfaceC48812sj1<C44183ku5> {

    /* renamed from: a */
    public final Y94<C43038iy6> f96880a;

    /* renamed from: b */
    public final Y94<InterfaceC45369mu5> f96881b;

    /* renamed from: c */
    public final Y94<ScopeProvider> f96882c;

    /* renamed from: d */
    public final Y94<InterfaceC40099e13> f96883d;

    /* renamed from: e */
    public final Y94<DQ3> f96884e;

    public C44776lu5(Y94<C43038iy6> y94, Y94<InterfaceC45369mu5> y942, Y94<ScopeProvider> y943, Y94<InterfaceC40099e13> y944, Y94<DQ3> y945) {
        this.f96880a = y94;
        this.f96881b = y942;
        this.f96882c = y943;
        this.f96883d = y944;
        this.f96884e = y945;
    }

    /* renamed from: a */
    public static C44776lu5 m26695a(Y94<C43038iy6> y94, Y94<InterfaceC45369mu5> y942, Y94<ScopeProvider> y943, Y94<InterfaceC40099e13> y944, Y94<DQ3> y945) {
        return new C44776lu5(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C44183ku5 m26693c(C43038iy6 c43038iy6, InterfaceC45369mu5 interfaceC45369mu5, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13, DQ3 dq3) {
        return new C44183ku5(c43038iy6, interfaceC45369mu5, scopeProvider, interfaceC40099e13, dq3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C44183ku5 get() {
        return m26693c(this.f96880a.get(), this.f96881b.get(), this.f96882c.get(), this.f96883d.get(), this.f96884e.get());
    }
}
