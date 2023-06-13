package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: ue4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49951ue4 {

    /* renamed from: a */
    public final Y94<C36207Tq4> f112701a;

    /* renamed from: b */
    public final Y94<InterfaceC10636aM> f112702b;

    /* renamed from: c */
    public final Y94<InterfaceC1880Ea> f112703c;

    /* renamed from: d */
    public final Y94<InterfaceC31951Bl5> f112704d;

    /* renamed from: e */
    public final Y94<InterfaceC46893pU4> f112705e;

    public C49951ue4(Y94<C36207Tq4> y94, Y94<InterfaceC10636aM> y942, Y94<InterfaceC1880Ea> y943, Y94<InterfaceC31951Bl5> y944, Y94<InterfaceC46893pU4> y945) {
        this.f112701a = y94;
        this.f112702b = y942;
        this.f112703c = y943;
        this.f112704d = y944;
        this.f112705e = y945;
    }

    /* renamed from: a */
    public static C49951ue4 m9926a(Y94<C36207Tq4> y94, Y94<InterfaceC10636aM> y942, Y94<InterfaceC1880Ea> y943, Y94<InterfaceC31951Bl5> y944, Y94<InterfaceC46893pU4> y945) {
        return new C49951ue4(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C48173re4 m9924c(C36207Tq4 c36207Tq4, InterfaceC10636aM interfaceC10636aM, InterfaceC1880Ea interfaceC1880Ea, InterfaceC31951Bl5 interfaceC31951Bl5, InterfaceC46893pU4 interfaceC46893pU4, InterfaceC48572sJ4 interfaceC48572sJ4, InterfaceC42243he4 interfaceC42243he4, ScopeProvider scopeProvider) {
        return new C48173re4(c36207Tq4, interfaceC10636aM, interfaceC1880Ea, interfaceC31951Bl5, interfaceC46893pU4, interfaceC48572sJ4, interfaceC42243he4, scopeProvider);
    }

    /* renamed from: b */
    public C48173re4 m9925b(InterfaceC48572sJ4 interfaceC48572sJ4, InterfaceC42243he4 interfaceC42243he4, ScopeProvider scopeProvider) {
        return m9924c(this.f112701a.get(), this.f112702b.get(), this.f112703c.get(), this.f112704d.get(), this.f112705e.get(), interfaceC48572sJ4, interfaceC42243he4, scopeProvider);
    }
}
