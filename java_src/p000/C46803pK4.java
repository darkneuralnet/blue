package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: pK4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46803pK4 {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f103521a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f103522b;

    /* renamed from: c */
    public final Y94<MK4> f103523c;

    /* renamed from: d */
    public final Y94<InterfaceC46893pU4> f103524d;

    /* renamed from: e */
    public final Y94<InterfaceC40099e13> f103525e;

    public C46803pK4(Y94<InterfaceC1880Ea> y94, Y94<C36207Tq4> y942, Y94<MK4> y943, Y94<InterfaceC46893pU4> y944, Y94<InterfaceC40099e13> y945) {
        this.f103521a = y94;
        this.f103522b = y942;
        this.f103523c = y943;
        this.f103524d = y944;
        this.f103525e = y945;
    }

    /* renamed from: a */
    public static C46803pK4 m19468a(Y94<InterfaceC1880Ea> y94, Y94<C36207Tq4> y942, Y94<MK4> y943, Y94<InterfaceC46893pU4> y944, Y94<InterfaceC40099e13> y945) {
        return new C46803pK4(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C42652iK4 m19466c(InterfaceC1880Ea interfaceC1880Ea, C36207Tq4 c36207Tq4, MK4 mk4, InterfaceC46893pU4 interfaceC46893pU4, InterfaceC40099e13 interfaceC40099e13, InterfaceC48572sJ4 interfaceC48572sJ4, InterfaceC47396qK4 interfaceC47396qK4, ScopeProvider scopeProvider) {
        return new C42652iK4(interfaceC1880Ea, c36207Tq4, mk4, interfaceC46893pU4, interfaceC40099e13, interfaceC48572sJ4, interfaceC47396qK4, scopeProvider);
    }

    /* renamed from: b */
    public C42652iK4 m19467b(InterfaceC48572sJ4 interfaceC48572sJ4, InterfaceC47396qK4 interfaceC47396qK4, ScopeProvider scopeProvider) {
        return m19466c(this.f103521a.get(), this.f103522b.get(), this.f103523c.get(), this.f103524d.get(), this.f103525e.get(), interfaceC48572sJ4, interfaceC47396qK4, scopeProvider);
    }
}
