package p000;

import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.app.feature.map.p008ui.MapZoneMarkerUi;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: ey3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40663ey3 {

    /* renamed from: a */
    public final Y94<InterfaceC32282Cw3> f79209a;

    /* renamed from: b */
    public final Y94<InterfaceC41256fy3> f79210b;

    /* renamed from: c */
    public final Y94<QI6> f79211c;

    /* renamed from: d */
    public final Y94<InterfaceC46545ot5> f79212d;

    /* renamed from: e */
    public final Y94<C49751uI6> f79213e;

    /* renamed from: f */
    public final Y94<C36207Tq4> f79214f;

    /* renamed from: g */
    public final Y94<LifecycleScopeProvider<EnumC7097RE>> f79215g;

    public C40663ey3(Y94<InterfaceC32282Cw3> y94, Y94<InterfaceC41256fy3> y942, Y94<QI6> y943, Y94<InterfaceC46545ot5> y944, Y94<C49751uI6> y945, Y94<C36207Tq4> y946, Y94<LifecycleScopeProvider<EnumC7097RE>> y947) {
        this.f79209a = y94;
        this.f79210b = y942;
        this.f79211c = y943;
        this.f79212d = y944;
        this.f79213e = y945;
        this.f79214f = y946;
        this.f79215g = y947;
    }

    /* renamed from: a */
    public static C40663ey3 m42336a(Y94<InterfaceC32282Cw3> y94, Y94<InterfaceC41256fy3> y942, Y94<QI6> y943, Y94<InterfaceC46545ot5> y944, Y94<C49751uI6> y945, Y94<C36207Tq4> y946, Y94<LifecycleScopeProvider<EnumC7097RE>> y947) {
        return new C40663ey3(y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static C37673Zx3 m42334c(MapUi mapUi, MapZoneMarkerUi mapZoneMarkerUi, InterfaceC32282Cw3 interfaceC32282Cw3, InterfaceC41256fy3 interfaceC41256fy3, QI6 qi6, InterfaceC46545ot5 interfaceC46545ot5, C49751uI6 c49751uI6, C36207Tq4 c36207Tq4, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider) {
        return new C37673Zx3(mapUi, mapZoneMarkerUi, interfaceC32282Cw3, interfaceC41256fy3, qi6, interfaceC46545ot5, c49751uI6, c36207Tq4, lifecycleScopeProvider);
    }

    /* renamed from: b */
    public C37673Zx3 m42335b(MapUi mapUi, MapZoneMarkerUi mapZoneMarkerUi) {
        return m42334c(mapUi, mapZoneMarkerUi, this.f79209a.get(), this.f79210b.get(), this.f79211c.get(), this.f79212d.get(), this.f79213e.get(), this.f79214f.get(), this.f79215g.get());
    }
}
