package p000;

import co.bird.android.app.feature.map.p008ui.MapBirdUi;
import com.uber.autodispose.ScopeProvider;
/* renamed from: MO */
/* loaded from: classes2.dex */
public final class C5288MO {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f23087a;

    /* renamed from: b */
    public final Y94<InterfaceC23227iO> f23088b;

    /* renamed from: c */
    public final Y94<InterfaceC40001dr4> f23089c;

    /* renamed from: d */
    public final Y94<InterfaceC49950ue3> f23090d;

    /* renamed from: e */
    public final Y94<InterfaceC40099e13> f23091e;

    public C5288MO(Y94<InterfaceC1880Ea> y94, Y94<InterfaceC23227iO> y942, Y94<InterfaceC40001dr4> y943, Y94<InterfaceC49950ue3> y944, Y94<InterfaceC40099e13> y945) {
        this.f23087a = y94;
        this.f23088b = y942;
        this.f23089c = y943;
        this.f23090d = y944;
        this.f23091e = y945;
    }

    /* renamed from: a */
    public static C5288MO m95322a(Y94<InterfaceC1880Ea> y94, Y94<InterfaceC23227iO> y942, Y94<InterfaceC40001dr4> y943, Y94<InterfaceC49950ue3> y944, Y94<InterfaceC40099e13> y945) {
        return new C5288MO(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C4060JO m95320c(InterfaceC1880Ea interfaceC1880Ea, InterfaceC23227iO interfaceC23227iO, InterfaceC40001dr4 interfaceC40001dr4, InterfaceC49950ue3 interfaceC49950ue3, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider, MapBirdUi mapBirdUi, C36207Tq4 c36207Tq4, InterfaceC37617Zr1 interfaceC37617Zr1) {
        return new C4060JO(interfaceC1880Ea, interfaceC23227iO, interfaceC40001dr4, interfaceC49950ue3, interfaceC40099e13, scopeProvider, mapBirdUi, c36207Tq4, interfaceC37617Zr1);
    }

    /* renamed from: b */
    public C4060JO m95321b(ScopeProvider scopeProvider, MapBirdUi mapBirdUi, C36207Tq4 c36207Tq4, InterfaceC37617Zr1 interfaceC37617Zr1) {
        return m95320c(this.f23087a.get(), this.f23088b.get(), this.f23089c.get(), this.f23090d.get(), this.f23091e.get(), scopeProvider, mapBirdUi, c36207Tq4, interfaceC37617Zr1);
    }
}
