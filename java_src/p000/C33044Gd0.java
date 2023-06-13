package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: Gd0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33044Gd0 {

    /* renamed from: a */
    public final Y94<InterfaceC10636aM> f12174a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f12175b;

    /* renamed from: c */
    public final Y94<InterfaceC30556yL> f12176c;

    /* renamed from: d */
    public final Y94<C22454gl> f12177d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f12178e;

    /* renamed from: f */
    public final Y94<InterfaceC40001dr4> f12179f;

    public C33044Gd0(Y94<InterfaceC10636aM> y94, Y94<InterfaceC1880Ea> y942, Y94<InterfaceC30556yL> y943, Y94<C22454gl> y944, Y94<C36207Tq4> y945, Y94<InterfaceC40001dr4> y946) {
        this.f12174a = y94;
        this.f12175b = y942;
        this.f12176c = y943;
        this.f12177d = y944;
        this.f12178e = y945;
        this.f12179f = y946;
    }

    /* renamed from: a */
    public static C33044Gd0 m104950a(Y94<InterfaceC10636aM> y94, Y94<InterfaceC1880Ea> y942, Y94<InterfaceC30556yL> y943, Y94<C22454gl> y944, Y94<C36207Tq4> y945, Y94<InterfaceC40001dr4> y946) {
        return new C33044Gd0(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static C31874Bd0 m104948c(InterfaceC10636aM interfaceC10636aM, InterfaceC1880Ea interfaceC1880Ea, InterfaceC30556yL interfaceC30556yL, C22454gl c22454gl, C36207Tq4 c36207Tq4, InterfaceC40001dr4 interfaceC40001dr4, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC37022Xd0 interfaceC37022Xd0, InterfaceC40099e13 interfaceC40099e13) {
        return new C31874Bd0(interfaceC10636aM, interfaceC1880Ea, interfaceC30556yL, c22454gl, c36207Tq4, interfaceC40001dr4, lifecycleScopeProvider, interfaceC37022Xd0, interfaceC40099e13);
    }

    /* renamed from: b */
    public C31874Bd0 m104949b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC37022Xd0 interfaceC37022Xd0, InterfaceC40099e13 interfaceC40099e13) {
        return m104948c(this.f12174a.get(), this.f12175b.get(), this.f12176c.get(), this.f12177d.get(), this.f12178e.get(), this.f12179f.get(), lifecycleScopeProvider, interfaceC37022Xd0, interfaceC40099e13);
    }
}
