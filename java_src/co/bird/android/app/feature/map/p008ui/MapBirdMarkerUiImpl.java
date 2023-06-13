package co.bird.android.app.feature.map.p008ui;

import android.view.View;
import co.bird.android.app.feature.map.cluster.birdmarker.BirdMarkerClusterManager;
import co.bird.android.app.feature.map.cluster.birdmarker.BirdMarkerClusterManagerFactory;
import co.bird.android.app.feature.map.modelmanager.BirdMarkerModelManager;
import co.bird.android.app.feature.map.p008ui.renderer.BirdMarkerRenderer;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Route;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.persistence.BirdMapMarker;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0083\u0001\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010:\u001a\u00020\f\u0012\u0006\u0010;\u001a\u00020\f\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001a\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\tH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\tH\u0016J\u0016\u0010\u0011\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016R:\u0010\u001d\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f \u001c*\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n0\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u000b0\u000b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006D"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;", "Lco/bird/android/app/feature/map/ui/MapUiImpl;", "Lco/bird/android/app/feature/map/ui/MapBirdMarkerUi;", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "location", "", "zoomLevel", "", "zoomTo", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/BirdMapMarker;", "", "birdMarkerClicks", "birdMarkerInfoItemClicks", "", "birdMarkers", "setBirdMarkers", "birdMarker", "select", "deselect", "Lco/bird/android/model/Route;", "route", "drawRouteAndZoom", "removeBirdMarker", "zoomToMaxLevel", "clearBirdMarkers", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "birdMarkerClusterItemClicks", "Lio/reactivex/subjects/d;", "birdMapMarkerInfoItemClicks", "Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;", "birdMarkerClusterManager", "Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;", "Lco/bird/android/app/feature/map/modelmanager/BirdMarkerModelManager;", "birdMarkerModelManager", "Lco/bird/android/app/feature/map/modelmanager/BirdMarkerModelManager;", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/google/android/gms/maps/model/CameraPosition;", "initialCameraPosition", "Li66;", "traceProvider", "LTq4;", "reactiveConfig", "LOh;", "appBuildConfig", "LcD1;", "map", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEvent", "Lcom/google/android/gms/maps/MapView;", "mapView", "Landroid/view/View;", "myLocationButton", "Lco/bird/android/model/constant/MapMode;", "mode", "drawUserLocation", "userDirectionalArrow", "LBK2;", "markerOverridesManager", "Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory;", "birdMarkerClusterManagerFactory", "Ldr4;", "locationManager", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;Li66;LTq4;LOh;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;Lco/bird/android/model/constant/MapMode;ZZLBK2;Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory;Ldr4;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.MapBirdMarkerUiImpl */
/* loaded from: classes2.dex */
public class MapBirdMarkerUiImpl extends MapUiImpl implements MapBirdMarkerUi {
    private final C24558d<BirdMapMarker> birdMapMarkerInfoItemClicks;
    private final C24558d<Pair<BirdMapMarker, Boolean>> birdMarkerClusterItemClicks;
    private final BirdMarkerClusterManager birdMarkerClusterManager;
    private final BirdMarkerModelManager birdMarkerModelManager;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "birdMarker", "Lco/bird/android/model/persistence/BirdMapMarker;", "selected", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapBirdMarkerUiImpl$1 */
    /* loaded from: classes2.dex */
    public static final class C138631 extends Lambda implements Function2<BirdMapMarker, Boolean, Unit> {
        public C138631() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(BirdMapMarker birdMapMarker, Boolean bool) {
            invoke(birdMapMarker, bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BirdMapMarker birdMarker, boolean z) {
            Intrinsics.checkNotNullParameter(birdMarker, "birdMarker");
            MapBirdMarkerUiImpl.this.birdMarkerClusterItemClicks.onNext(TuplesKt.m28425to(birdMarker, Boolean.valueOf(z)));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapBirdMarkerUiImpl$2 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C138642 extends FunctionReferenceImpl implements Function1<BirdMapMarker, Unit> {
        public C138642(Object obj) {
            super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdMapMarker birdMapMarker) {
            invoke2(birdMapMarker);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(BirdMapMarker p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24558d) this.receiver).onNext(p0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapBirdMarkerUiImpl(BaseActivity activity, CameraPosition cameraPosition, InterfaceC42524i66 traceProvider, C36207Tq4 reactiveConfig, InterfaceC6097Oh appBuildConfig, C39011cD1 map, ReactiveMapEvent reactiveMapEvent, MapView mapView, View view, MapMode mode, boolean z, boolean z2, BK2 markerOverridesManager, BirdMarkerClusterManagerFactory birdMarkerClusterManagerFactory, InterfaceC40001dr4 locationManager) {
        super(activity, cameraPosition, traceProvider, reactiveConfig, appBuildConfig, map, reactiveMapEvent, mapView, view, mode, z, z2, locationManager);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(traceProvider, "traceProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(reactiveMapEvent, "reactiveMapEvent");
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(markerOverridesManager, "markerOverridesManager");
        Intrinsics.checkNotNullParameter(birdMarkerClusterManagerFactory, "birdMarkerClusterManagerFactory");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        C24558d<Pair<BirdMapMarker, Boolean>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<BirdMapMarker, Boolean>>()");
        this.birdMarkerClusterItemClicks = m31902e;
        C24558d<BirdMapMarker> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<BirdMapMarker>()");
        this.birdMapMarkerInfoItemClicks = m31902e2;
        BirdMarkerClusterManager create = birdMarkerClusterManagerFactory.create(activity, markerOverridesManager, reactiveMapEvent, map, mode);
        this.birdMarkerClusterManager = create;
        this.birdMarkerModelManager = new BirdMarkerModelManager(new BirdMarkerRenderer(create), traceProvider);
        create.setOnClusterItemClickListener(new C138631());
        create.setOnMarkerInfoItemClick(new C138642(m31902e2));
    }

    private final void zoomTo(Geolocation geolocation, float f) {
        getMap().m61682f(C48149rc0.m15705e(new LatLng(geolocation.getLatitude(), geolocation.getLongitude()), f));
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdMarkerUi
    public Observable<Pair<BirdMapMarker, Boolean>> birdMarkerClicks() {
        Observable<Pair<BirdMapMarker, Boolean>> hide = this.birdMarkerClusterItemClicks.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "birdMarkerClusterItemClicks.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdMarkerUi
    public Observable<BirdMapMarker> birdMarkerInfoItemClicks() {
        Observable<BirdMapMarker> hide = this.birdMapMarkerInfoItemClicks.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "birdMapMarkerInfoItemClicks.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdMarkerUi
    public void clearBirdMarkers() {
        this.birdMarkerModelManager.clearItems();
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdMarkerUi
    public void deselect(BirdMapMarker birdMarker) {
        Intrinsics.checkNotNullParameter(birdMarker, "birdMarker");
        this.birdMarkerClusterManager.deselect(birdMarker);
        this.birdMarkerClusterManager.closeInfoWindow(birdMarker);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdMarkerUi
    public void drawRouteAndZoom(Route route, BirdMapMarker birdMarker) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(birdMarker, "birdMarker");
        drawRouteAndZoom(route, UB1.m81890b(birdMarker.getLocation()));
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdMarkerUi
    public void removeBirdMarker(BirdMapMarker birdMarker) {
        Intrinsics.checkNotNullParameter(birdMarker, "birdMarker");
        this.birdMarkerModelManager.removeItem(birdMarker);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdMarkerUi
    public void select(BirdMapMarker birdMarker) {
        Intrinsics.checkNotNullParameter(birdMarker, "birdMarker");
        this.birdMarkerClusterManager.select(birdMarker);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdMarkerUi
    public void setBirdMarkers(List<BirdMapMarker> birdMarkers) {
        Intrinsics.checkNotNullParameter(birdMarkers, "birdMarkers");
        this.birdMarkerModelManager.setItems(birdMarkers);
        this.birdMarkerClusterManager.animateMarkers();
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdMarkerUi
    public void zoomToMaxLevel(BirdMapMarker birdMarker) {
        Intrinsics.checkNotNullParameter(birdMarker, "birdMarker");
        zoomTo(birdMarker.getLocation(), getMap().m61678j());
    }
}
