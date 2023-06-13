package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: Io0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33611Io0 implements InterfaceC48812sj1<C31739Ao0> {

    /* renamed from: a */
    public final Y94<InterfaceC36185To0> f16208a;

    /* renamed from: b */
    public final Y94<InterfaceC46473om3> f16209b;

    /* renamed from: c */
    public final Y94<InterfaceC48164rd5> f16210c;

    /* renamed from: d */
    public final Y94<ScopeProvider> f16211d;

    /* renamed from: e */
    public final Y94<InterfaceC44721lp0> f16212e;

    public C33611Io0(Y94<InterfaceC36185To0> y94, Y94<InterfaceC46473om3> y942, Y94<InterfaceC48164rd5> y943, Y94<ScopeProvider> y944, Y94<InterfaceC44721lp0> y945) {
        this.f16208a = y94;
        this.f16209b = y942;
        this.f16210c = y943;
        this.f16211d = y944;
        this.f16212e = y945;
    }

    /* renamed from: a */
    public static C33611Io0 m101706a(Y94<InterfaceC36185To0> y94, Y94<InterfaceC46473om3> y942, Y94<InterfaceC48164rd5> y943, Y94<ScopeProvider> y944, Y94<InterfaceC44721lp0> y945) {
        return new C33611Io0(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C31739Ao0 m101704c(InterfaceC36185To0 interfaceC36185To0, InterfaceC46473om3 interfaceC46473om3, InterfaceC48164rd5 interfaceC48164rd5, ScopeProvider scopeProvider, InterfaceC44721lp0 interfaceC44721lp0) {
        return new C31739Ao0(interfaceC36185To0, interfaceC46473om3, interfaceC48164rd5, scopeProvider, interfaceC44721lp0);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C31739Ao0 get() {
        return m101704c(this.f16208a.get(), this.f16209b.get(), this.f16210c.get(), this.f16211d.get(), this.f16212e.get());
    }
}
