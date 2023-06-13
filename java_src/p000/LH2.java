package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: LH2 */
/* loaded from: classes3.dex */
public final class LH2 implements InterfaceC48812sj1<IH2> {

    /* renamed from: a */
    public final Y94<ScopeProvider> f21036a;

    /* renamed from: b */
    public final Y94<MH2> f21037b;

    /* renamed from: c */
    public final Y94<C47960rH2> f21038c;

    /* renamed from: d */
    public final Y94<YR4> f21039d;

    /* renamed from: e */
    public final Y94<InterfaceC36821Wg6> f21040e;

    /* renamed from: f */
    public final Y94<InterfaceC46893pU4> f21041f;

    /* renamed from: g */
    public final Y94<InterfaceC46164oF3> f21042g;

    public LH2(Y94<ScopeProvider> y94, Y94<MH2> y942, Y94<C47960rH2> y943, Y94<YR4> y944, Y94<InterfaceC36821Wg6> y945, Y94<InterfaceC46893pU4> y946, Y94<InterfaceC46164oF3> y947) {
        this.f21036a = y94;
        this.f21037b = y942;
        this.f21038c = y943;
        this.f21039d = y944;
        this.f21040e = y945;
        this.f21041f = y946;
        this.f21042g = y947;
    }

    /* renamed from: a */
    public static LH2 m97398a(Y94<ScopeProvider> y94, Y94<MH2> y942, Y94<C47960rH2> y943, Y94<YR4> y944, Y94<InterfaceC36821Wg6> y945, Y94<InterfaceC46893pU4> y946, Y94<InterfaceC46164oF3> y947) {
        return new LH2(y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static IH2 m97396c(ScopeProvider scopeProvider, MH2 mh2, C47960rH2 c47960rH2, YR4 yr4, InterfaceC36821Wg6 interfaceC36821Wg6, InterfaceC46893pU4 interfaceC46893pU4, InterfaceC46164oF3 interfaceC46164oF3) {
        return new IH2(scopeProvider, mh2, c47960rH2, yr4, interfaceC36821Wg6, interfaceC46893pU4, interfaceC46164oF3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public IH2 get() {
        return m97396c(this.f21036a.get(), this.f21037b.get(), this.f21038c.get(), this.f21039d.get(), this.f21040e.get(), this.f21041f.get(), this.f21042g.get());
    }
}
