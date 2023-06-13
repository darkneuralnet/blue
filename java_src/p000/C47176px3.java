package p000;

import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.app.feature.map.p008ui.MapWarehouseMarkerUi;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: px3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47176px3 {

    /* renamed from: a */
    public final Y94<InterfaceC47769qx3> f104387a;

    /* renamed from: b */
    public final Y94<InterfaceC46473om3> f104388b;

    /* renamed from: c */
    public final Y94<DQ3> f104389c;

    /* renamed from: d */
    public final Y94<InterfaceC37451Yy6> f104390d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f104391e;

    /* renamed from: f */
    public final Y94<InterfaceC40099e13> f104392f;

    /* renamed from: g */
    public final Y94<LifecycleScopeProvider<EnumC7097RE>> f104393g;

    public C47176px3(Y94<InterfaceC47769qx3> y94, Y94<InterfaceC46473om3> y942, Y94<DQ3> y943, Y94<InterfaceC37451Yy6> y944, Y94<C36207Tq4> y945, Y94<InterfaceC40099e13> y946, Y94<LifecycleScopeProvider<EnumC7097RE>> y947) {
        this.f104387a = y94;
        this.f104388b = y942;
        this.f104389c = y943;
        this.f104390d = y944;
        this.f104391e = y945;
        this.f104392f = y946;
        this.f104393g = y947;
    }

    /* renamed from: a */
    public static C47176px3 m18398a(Y94<InterfaceC47769qx3> y94, Y94<InterfaceC46473om3> y942, Y94<DQ3> y943, Y94<InterfaceC37451Yy6> y944, Y94<C36207Tq4> y945, Y94<InterfaceC40099e13> y946, Y94<LifecycleScopeProvider<EnumC7097RE>> y947) {
        return new C47176px3(y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static C45397mx3 m18396c(MapUi mapUi, MapWarehouseMarkerUi mapWarehouseMarkerUi, InterfaceC47769qx3 interfaceC47769qx3, InterfaceC46473om3 interfaceC46473om3, DQ3 dq3, InterfaceC37451Yy6 interfaceC37451Yy6, C36207Tq4 c36207Tq4, InterfaceC40099e13 interfaceC40099e13, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider) {
        return new C45397mx3(mapUi, mapWarehouseMarkerUi, interfaceC47769qx3, interfaceC46473om3, dq3, interfaceC37451Yy6, c36207Tq4, interfaceC40099e13, lifecycleScopeProvider);
    }

    /* renamed from: b */
    public C45397mx3 m18397b(MapUi mapUi, MapWarehouseMarkerUi mapWarehouseMarkerUi) {
        return m18396c(mapUi, mapWarehouseMarkerUi, this.f104387a.get(), this.f104388b.get(), this.f104389c.get(), this.f104390d.get(), this.f104391e.get(), this.f104392f.get(), this.f104393g.get());
    }
}
