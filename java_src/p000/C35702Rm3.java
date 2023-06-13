package p000;

import android.view.View;
import co.bird.android.app.feature.map.cluster.birdmarker.BirdMarkerClusterManagerFactory;
import co.bird.android.app.feature.map.cluster.bountymarker.BountyMarkerClusterManagerFactory;
import co.bird.android.app.feature.map.cluster.nestmarker.NestMarkerClusterManagerFactory;
import co.bird.android.app.feature.map.cluster.warehousemarker.WarehouseMarkerClusterManagerFactory;
import co.bird.android.app.feature.map.cluster.zonemarker.ZoneMarkerClusterManagerFactory;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.core.mvp.BaseActivity;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
/* renamed from: Rm3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C35702Rm3 {

    /* renamed from: a */
    public final Y94<InterfaceC42524i66> f32585a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f32586b;

    /* renamed from: c */
    public final Y94<InterfaceC6097Oh> f32587c;

    /* renamed from: d */
    public final Y94<BirdMarkerClusterManagerFactory> f32588d;

    /* renamed from: e */
    public final Y94<BountyMarkerClusterManagerFactory> f32589e;

    /* renamed from: f */
    public final Y94<NestMarkerClusterManagerFactory> f32590f;

    /* renamed from: g */
    public final Y94<WarehouseMarkerClusterManagerFactory> f32591g;

    /* renamed from: h */
    public final Y94<ZoneMarkerClusterManagerFactory> f32592h;

    /* renamed from: i */
    public final Y94<InterfaceC40001dr4> f32593i;

    public C35702Rm3(Y94<InterfaceC42524i66> y94, Y94<C36207Tq4> y942, Y94<InterfaceC6097Oh> y943, Y94<BirdMarkerClusterManagerFactory> y944, Y94<BountyMarkerClusterManagerFactory> y945, Y94<NestMarkerClusterManagerFactory> y946, Y94<WarehouseMarkerClusterManagerFactory> y947, Y94<ZoneMarkerClusterManagerFactory> y948, Y94<InterfaceC40001dr4> y949) {
        this.f32585a = y94;
        this.f32586b = y942;
        this.f32587c = y943;
        this.f32588d = y944;
        this.f32589e = y945;
        this.f32590f = y946;
        this.f32591g = y947;
        this.f32592h = y948;
        this.f32593i = y949;
    }

    /* renamed from: a */
    public static C35702Rm3 m86323a(Y94<InterfaceC42524i66> y94, Y94<C36207Tq4> y942, Y94<InterfaceC6097Oh> y943, Y94<BirdMarkerClusterManagerFactory> y944, Y94<BountyMarkerClusterManagerFactory> y945, Y94<NestMarkerClusterManagerFactory> y946, Y94<WarehouseMarkerClusterManagerFactory> y947, Y94<ZoneMarkerClusterManagerFactory> y948, Y94<InterfaceC40001dr4> y949) {
        return new C35702Rm3(y94, y942, y943, y944, y945, y946, y947, y948, y949);
    }

    /* renamed from: c */
    public static C35000Om3 m86321c(InterfaceC42524i66 interfaceC42524i66, C36207Tq4 c36207Tq4, InterfaceC6097Oh interfaceC6097Oh, BirdMarkerClusterManagerFactory birdMarkerClusterManagerFactory, BountyMarkerClusterManagerFactory bountyMarkerClusterManagerFactory, NestMarkerClusterManagerFactory nestMarkerClusterManagerFactory, WarehouseMarkerClusterManagerFactory warehouseMarkerClusterManagerFactory, ZoneMarkerClusterManagerFactory zoneMarkerClusterManagerFactory, BaseActivity baseActivity, CameraPosition cameraPosition, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, MapView mapView, View view, boolean z, BK2 bk2, boolean z2, InterfaceC40001dr4 interfaceC40001dr4) {
        return new C35000Om3(interfaceC42524i66, c36207Tq4, interfaceC6097Oh, birdMarkerClusterManagerFactory, bountyMarkerClusterManagerFactory, nestMarkerClusterManagerFactory, warehouseMarkerClusterManagerFactory, zoneMarkerClusterManagerFactory, baseActivity, cameraPosition, c39011cD1, reactiveMapEvent, mapView, view, z, bk2, z2, interfaceC40001dr4);
    }

    /* renamed from: b */
    public C35000Om3 m86322b(BaseActivity baseActivity, CameraPosition cameraPosition, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, MapView mapView, View view, boolean z, BK2 bk2, boolean z2) {
        return m86321c(this.f32585a.get(), this.f32586b.get(), this.f32587c.get(), this.f32588d.get(), this.f32589e.get(), this.f32590f.get(), this.f32591g.get(), this.f32592h.get(), baseActivity, cameraPosition, c39011cD1, reactiveMapEvent, mapView, view, z, bk2, z2, this.f32593i.get());
    }
}
