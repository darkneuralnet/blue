package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: b50  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38340b50 implements InterfaceC48812sj1<C37747a50> {

    /* renamed from: a */
    public final Y94<C43038iy6> f56904a;

    /* renamed from: b */
    public final Y94<InterfaceC45369mu5> f56905b;

    /* renamed from: c */
    public final Y94<ScopeProvider> f56906c;

    /* renamed from: d */
    public final Y94<DQ3> f56907d;

    /* renamed from: e */
    public final Y94<InterfaceC40099e13> f56908e;

    public C38340b50(Y94<C43038iy6> y94, Y94<InterfaceC45369mu5> y942, Y94<ScopeProvider> y943, Y94<DQ3> y944, Y94<InterfaceC40099e13> y945) {
        this.f56904a = y94;
        this.f56905b = y942;
        this.f56906c = y943;
        this.f56907d = y944;
        this.f56908e = y945;
    }

    /* renamed from: a */
    public static C38340b50 m64992a(Y94<C43038iy6> y94, Y94<InterfaceC45369mu5> y942, Y94<ScopeProvider> y943, Y94<DQ3> y944, Y94<InterfaceC40099e13> y945) {
        return new C38340b50(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C37747a50 m64990c(C43038iy6 c43038iy6, InterfaceC45369mu5 interfaceC45369mu5, ScopeProvider scopeProvider, DQ3 dq3, InterfaceC40099e13 interfaceC40099e13) {
        return new C37747a50(c43038iy6, interfaceC45369mu5, scopeProvider, dq3, interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C37747a50 get() {
        return m64990c(this.f56904a.get(), this.f56905b.get(), this.f56906c.get(), this.f56907d.get(), this.f56908e.get());
    }
}
