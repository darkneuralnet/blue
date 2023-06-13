package co.bird.android.app.feature.map.p008ui;

import android.view.View;
import co.bird.android.app.feature.map.modelmanager.Filter;
import co.bird.android.app.feature.map.modelmanager.ParkingNestModelManager;
import co.bird.android.app.feature.map.p008ui.renderer.ParkingNestRenderItem;
import co.bird.android.app.feature.map.p008ui.renderer.ParkingNestRenderer;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.constant.MapMode;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0095\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u001b\u0018\u00002\u00020\u00012\u00020\u0002B\u0085\u0001\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00101\u001a\u000200\u0012\b\b\u0002\u00102\u001a\u00020\u000e\u0012\b\b\u0002\u00103\u001a\u00020\u000e\u0012\b\b\u0002\u00104\u001a\u00020\u000e\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0016\u0010\u0013\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u0016J\u0016\u0010\u0014\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u0016R\"\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00040\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u00069"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/MapParkingUiImpl;", "Lco/bird/android/app/feature/map/ui/MapUiImpl;", "Lco/bird/android/app/feature/map/ui/MapParkingUi;", "Lio/reactivex/Observable;", "LfM2;", "parkingMarkerClicks", "", "Lco/bird/android/model/ParkingNest;", "nests", "", "addParkingNests", "marker", "resetParkingMarker", "selectParkingMarker", "", "show", "showParkingMarkers", "Lco/bird/android/app/feature/map/modelmanager/Filter;", "filter", "addParkingFilter", "removeParkingFilter", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/d;", "Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager;", "parkingNestModelManager", "Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager;", "co/bird/android/app/feature/map/ui/MapParkingUiImpl$hideParkingFilter$1", "hideParkingFilter", "Lco/bird/android/app/feature/map/ui/MapParkingUiImpl$hideParkingFilter$1;", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/google/android/gms/maps/model/CameraPosition;", "initialCameraPosition", "Li66;", "traceProvider", "LTq4;", "reactiveConfig", "LOh;", "appBuildConfig", "LcD1;", "map", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEvent", "Lcom/google/android/gms/maps/MapView;", "mapView", "Landroid/view/View;", "myLocationButton", "Lco/bird/android/model/constant/MapMode;", "mode", "drawUserLocation", "userDirectionalArrow", "drawParkingNestOutline", "Ldr4;", "locationManager", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;Li66;LTq4;LOh;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;Lco/bird/android/model/constant/MapMode;ZZZLdr4;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.MapParkingUiImpl */
/* loaded from: classes2.dex */
public final class MapParkingUiImpl extends MapUiImpl implements MapParkingUi {
    private final MapParkingUiImpl$hideParkingFilter$1 hideParkingFilter;
    private final C24558d<C40889fM2> parkingMarkerClicks;
    private final ParkingNestModelManager parkingNestModelManager;

    public /* synthetic */ MapParkingUiImpl(BaseActivity baseActivity, CameraPosition cameraPosition, InterfaceC42524i66 interfaceC42524i66, C36207Tq4 c36207Tq4, InterfaceC6097Oh interfaceC6097Oh, C39011cD1 c39011cD1, ReactiveMapEvent reactiveMapEvent, MapView mapView, View view, MapMode mapMode, boolean z, boolean z2, boolean z3, InterfaceC40001dr4 interfaceC40001dr4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseActivity, cameraPosition, interfaceC42524i66, c36207Tq4, interfaceC6097Oh, c39011cD1, reactiveMapEvent, mapView, (i & 256) != 0 ? null : view, (i & 512) != 0 ? MapMode.RIDER : mapMode, (i & 1024) != 0 ? true : z, (i & 2048) != 0 ? false : z2, (i & 4096) != 0 ? false : z3, interfaceC40001dr4);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public void addParkingFilter(Filter<ParkingNest> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.parkingNestModelManager.addFilter(filter);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public void addParkingNests(List<ParkingNest> nests) {
        Intrinsics.checkNotNullParameter(nests, "nests");
        this.parkingNestModelManager.addItems(nests);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public Observable<C40889fM2> parkingMarkerClicks() {
        Observable<C40889fM2> hide = this.parkingMarkerClicks.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "parkingMarkerClicks.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public void removeParkingFilter(Filter<ParkingNest> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.parkingNestModelManager.removeFilter(filter);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public void resetParkingMarker(C40889fM2 marker) {
        ParkingNest parkingNest;
        int i;
        Integer availableParkingCapacity;
        ParkingNestRenderItem parkingNestRenderItem;
        Intrinsics.checkNotNullParameter(marker, "marker");
        Object m41531c = marker.m41531c();
        ParkingNest parkingNest2 = null;
        if (m41531c instanceof ParkingNest) {
            parkingNest = (ParkingNest) m41531c;
        } else {
            parkingNest = null;
        }
        if (parkingNest == null) {
            Object m41531c2 = marker.m41531c();
            if (m41531c2 instanceof ParkingNestRenderItem) {
                parkingNestRenderItem = (ParkingNestRenderItem) m41531c2;
            } else {
                parkingNestRenderItem = null;
            }
            if (parkingNestRenderItem != null) {
                parkingNest2 = parkingNestRenderItem.getParkingNest();
            }
        } else {
            parkingNest2 = parkingNest;
        }
        boolean z = false;
        if (parkingNest2 != null && (availableParkingCapacity = parkingNest2.getAvailableParkingCapacity()) != null && availableParkingCapacity.intValue() == 0) {
            z = true;
        }
        if (true ^ z) {
            i = C48193rg4.marker_parking;
        } else {
            i = C48193rg4.marker_parking_unavailable;
        }
        marker.m41523k(C40788fB0.icon$default(getActivity(), i, null, null, 6, null));
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public void selectParkingMarker(C40889fM2 marker) {
        ParkingNest parkingNest;
        int i;
        Integer availableParkingCapacity;
        ParkingNestRenderItem parkingNestRenderItem;
        Intrinsics.checkNotNullParameter(marker, "marker");
        Object m41531c = marker.m41531c();
        ParkingNest parkingNest2 = null;
        if (m41531c instanceof ParkingNest) {
            parkingNest = (ParkingNest) m41531c;
        } else {
            parkingNest = null;
        }
        if (parkingNest == null) {
            Object m41531c2 = marker.m41531c();
            if (m41531c2 instanceof ParkingNestRenderItem) {
                parkingNestRenderItem = (ParkingNestRenderItem) m41531c2;
            } else {
                parkingNestRenderItem = null;
            }
            if (parkingNestRenderItem != null) {
                parkingNest2 = parkingNestRenderItem.getParkingNest();
            }
        } else {
            parkingNest2 = parkingNest;
        }
        boolean z = false;
        if (parkingNest2 != null && (availableParkingCapacity = parkingNest2.getAvailableParkingCapacity()) != null && availableParkingCapacity.intValue() == 0) {
            z = true;
        }
        if (true ^ z) {
            i = C48193rg4.marker_parking_selected;
        } else {
            i = C48193rg4.marker_parking_unavailable_selected;
        }
        marker.m41523k(C40788fB0.icon$default(getActivity(), i, null, null, 6, null));
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public void showParkingMarkers(boolean z) {
        if (z) {
            this.parkingNestModelManager.removeFilter(this.hideParkingFilter);
        } else {
            this.parkingNestModelManager.addFilter(this.hideParkingFilter);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v12, types: [co.bird.android.app.feature.map.ui.MapParkingUiImpl$hideParkingFilter$1] */
    public MapParkingUiImpl(BaseActivity activity, CameraPosition cameraPosition, InterfaceC42524i66 traceProvider, C36207Tq4 reactiveConfig, InterfaceC6097Oh appBuildConfig, C39011cD1 map, ReactiveMapEvent reactiveMapEvent, MapView mapView, View view, MapMode mode, boolean z, boolean z2, boolean z3, InterfaceC40001dr4 locationManager) {
        super(activity, cameraPosition, traceProvider, reactiveConfig, appBuildConfig, map, reactiveMapEvent, mapView, view, mode, z, z2, locationManager);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(traceProvider, "traceProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(reactiveMapEvent, "reactiveMapEvent");
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        C24558d<C40889fM2> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Marker>()");
        this.parkingMarkerClicks = m31902e;
        this.parkingNestModelManager = new ParkingNestModelManager(new ParkingNestRenderer(activity, map, z3), getMapModelManagerViewportChangesObservable());
        this.hideParkingFilter = new Filter<ParkingNest>() { // from class: co.bird.android.app.feature.map.ui.MapParkingUiImpl$hideParkingFilter$1

            /* renamed from: id */
            private final String f61629id = "hide-all";
            private Function1<? super String, Unit> setDirty;

            @Override // co.bird.android.app.feature.map.modelmanager.Filter
            public List<ParkingNest> apply(List<? extends ParkingNest> models) {
                List<ParkingNest> emptyList;
                Intrinsics.checkNotNullParameter(models, "models");
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return emptyList;
            }

            @Override // co.bird.android.app.feature.map.modelmanager.Filter
            public String getId() {
                return this.f61629id;
            }

            @Override // co.bird.android.app.feature.map.modelmanager.Filter
            public Function1<String, Unit> getSetDirty() {
                return this.setDirty;
            }

            @Override // co.bird.android.app.feature.map.modelmanager.Filter
            public void setSetDirty(Function1<? super String, Unit> function1) {
                this.setDirty = function1;
            }
        };
    }
}
