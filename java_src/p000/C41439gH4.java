package p000;

import co.bird.android.model.constant.MapMode;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: gH4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41439gH4 {

    /* renamed from: a */
    public final Y94<InterfaceC10636aM> f81922a;

    /* renamed from: b */
    public final Y94<InterfaceC43160jB0> f81923b;

    /* renamed from: c */
    public final Y94<C22454gl> f81924c;

    /* renamed from: d */
    public final Y94<InterfaceC40001dr4> f81925d;

    public C41439gH4(Y94<InterfaceC10636aM> y94, Y94<InterfaceC43160jB0> y942, Y94<C22454gl> y943, Y94<InterfaceC40001dr4> y944) {
        this.f81922a = y94;
        this.f81923b = y942;
        this.f81924c = y943;
        this.f81925d = y944;
    }

    /* renamed from: a */
    public static C41439gH4 m39694a(Y94<InterfaceC10636aM> y94, Y94<InterfaceC43160jB0> y942, Y94<C22454gl> y943, Y94<InterfaceC40001dr4> y944) {
        return new C41439gH4(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C39661dH4 m39692c(InterfaceC10636aM interfaceC10636aM, InterfaceC43160jB0 interfaceC43160jB0, C22454gl c22454gl, InterfaceC40001dr4 interfaceC40001dr4, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, C42032hH4 c42032hH4, OG4 og4, InterfaceC40099e13 interfaceC40099e13, MapMode mapMode) {
        return new C39661dH4(interfaceC10636aM, interfaceC43160jB0, c22454gl, interfaceC40001dr4, lifecycleScopeProvider, c42032hH4, og4, interfaceC40099e13, mapMode);
    }

    /* renamed from: b */
    public C39661dH4 m39693b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, C42032hH4 c42032hH4, OG4 og4, InterfaceC40099e13 interfaceC40099e13, MapMode mapMode) {
        return m39692c(this.f81922a.get(), this.f81923b.get(), this.f81924c.get(), this.f81925d.get(), lifecycleScopeProvider, c42032hH4, og4, interfaceC40099e13, mapMode);
    }
}
