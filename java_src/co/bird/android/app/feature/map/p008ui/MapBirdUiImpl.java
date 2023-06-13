package co.bird.android.app.feature.map.p008ui;

import android.location.Location;
import android.view.View;
import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterManager;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterManagerFactory;
import co.bird.android.app.feature.map.modelmanager.BirdModelManager;
import co.bird.android.app.feature.map.p008ui.renderer.BirdRenderer;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Route;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.wire.WireBird;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u008b\u0001\u0012\u0006\u0010-\u001a\u00020,\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010;\u001a\u00020:\u0012\b\u0010=\u001a\u0004\u0018\u00010<\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010@\u001a\u00020\u0012\u0012\u0006\u0010A\u001a\u00020\u0012\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010D\u001a\u00020\u0012\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\"\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u001a\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00180\u0017H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0016R\u001a\u0010\u001c\u001a\u00020\u001b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R:\u0010*\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012 )*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00180\u00180(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\u00030\u00030(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+¨\u0006K"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/MapBirdUiImpl;", "Lco/bird/android/app/feature/map/ui/MapUiImpl;", "Lco/bird/android/app/feature/map/ui/MapBirdUi;", "Lco/bird/android/model/wire/WireBird;", "bird", "", "addBird", "", "birds", "setBirds", "select", "deselect", "Lco/bird/android/model/Route;", "route", "drawRouteAndZoom", "removeBird", "Landroid/location/Location;", "userLocation", "", "useLargeZoomPadding", "zoomTo", "", "zoomLevel", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "birdItemClicks", "birdInfoItemClicks", "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManager;", "clusterManager", "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManager;", "getClusterManager", "()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManager;", "Lco/bird/android/app/feature/map/modelmanager/BirdModelManager;", "birdModelManager", "Lco/bird/android/app/feature/map/modelmanager/BirdModelManager;", "getBirdModelManager", "()Lco/bird/android/app/feature/map/modelmanager/BirdModelManager;", "", "largeZoomPaddingPx", "I", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "clusterItemClicks", "Lio/reactivex/subjects/d;", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/google/android/gms/maps/model/CameraPosition;", "initialCameraPosition", "Li66;", "traceProvider", "LTq4;", "reactiveConfig", "LOh;", "appBuildConfig", "LcD1;", "map", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEvent", "Lcom/google/android/gms/maps/MapView;", "mapView", "Landroid/view/View;", "myLocationButton", "Lco/bird/android/model/constant/MapMode;", "mode", "drawUserLocation", "userDirectionalArrow", "LBK2;", "markerOverridesManager", "hourly", "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManagerFactory;", "clusterManagerFactory", "Ldr4;", "locationManager", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;Li66;LTq4;LOh;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;Lco/bird/android/model/constant/MapMode;ZZLBK2;ZLco/bird/android/app/feature/map/cluster/bird/BirdClusterManagerFactory;Ldr4;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.MapBirdUiImpl */
/* loaded from: classes2.dex */
public class MapBirdUiImpl extends MapUiImpl implements MapBirdUi {
    private final C24558d<WireBird> birdInfoItemClicks;
    private final BirdModelManager birdModelManager;
    private final C24558d<Pair<WireBird, Boolean>> clusterItemClicks;
    private final BirdClusterManager clusterManager;
    private final int largeZoomPaddingPx;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "bird", "Lco/bird/android/model/wire/WireBird;", "selected", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapBirdUiImpl$1 */
    /* loaded from: classes2.dex */
    public static final class C138651 extends Lambda implements Function2<WireBird, Boolean, Unit> {
        public C138651() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird, Boolean bool) {
            invoke(wireBird, bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(WireBird bird, boolean z) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            MapBirdUiImpl.this.clusterItemClicks.onNext(TuplesKt.m28425to(bird, Boolean.valueOf(z)));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.MapBirdUiImpl$2 */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C138662 extends FunctionReferenceImpl implements Function1<WireBird, Unit> {
        public C138662(Object obj) {
            super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            invoke2(wireBird);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(WireBird p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24558d) this.receiver).onNext(p0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapBirdUiImpl(BaseActivity activity, CameraPosition cameraPosition, InterfaceC42524i66 traceProvider, C36207Tq4 reactiveConfig, InterfaceC6097Oh appBuildConfig, C39011cD1 map, ReactiveMapEvent reactiveMapEvent, MapView mapView, View view, MapMode mode, boolean z, boolean z2, BK2 markerOverridesManager, boolean z3, BirdClusterManagerFactory clusterManagerFactory, InterfaceC40001dr4 locationManager) {
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
        Intrinsics.checkNotNullParameter(clusterManagerFactory, "clusterManagerFactory");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        BirdClusterManager create = clusterManagerFactory.create(activity, markerOverridesManager, map, reactiveMapEvent, mode, z3);
        this.clusterManager = create;
        this.birdModelManager = new BirdModelManager(new BirdRenderer(create), traceProvider);
        this.largeZoomPaddingPx = activity.getResources().getDimensionPixelSize(C37044Xf4.map_zoom_padding_large);
        C24558d<Pair<WireBird, Boolean>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<WireBird, Boolean>>()");
        this.clusterItemClicks = m31902e;
        C24558d<WireBird> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<WireBird>()");
        this.birdInfoItemClicks = m31902e2;
        create.setOnClusterItemClickListener(new C138651());
        create.setOnMarkerInfoItemClick(new C138662(m31902e2));
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdUi
    public void addBird(WireBird bird) {
        List listOf;
        Intrinsics.checkNotNullParameter(bird, "bird");
        BirdModelManager birdModelManager = this.birdModelManager;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(bird);
        birdModelManager.addItems(listOf);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdUi
    public Observable<WireBird> birdInfoItemClicks() {
        Observable<WireBird> hide = this.birdInfoItemClicks.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "birdInfoItemClicks.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdUi
    public Observable<Pair<WireBird, Boolean>> birdItemClicks() {
        Observable<Pair<WireBird, Boolean>> hide = this.clusterItemClicks.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "clusterItemClicks.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdUi
    public void deselect(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.clusterManager.deselect(bird);
        this.clusterManager.closeInfoWindow(bird);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdUi
    public void drawRouteAndZoom(Route route, WireBird bird) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(bird, "bird");
        drawRouteAndZoom(route, GoogleMap_Kt.toLatLng(bird.getLocation()));
    }

    public final BirdModelManager getBirdModelManager() {
        return this.birdModelManager;
    }

    public final BirdClusterManager getClusterManager() {
        return this.clusterManager;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdUi
    public void removeBird(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.birdModelManager.removeItem(bird);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdUi
    public void select(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.clusterManager.select(bird);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdUi
    public void setBirds(List<WireBird> birds) {
        Intrinsics.checkNotNullParameter(birds, "birds");
        this.birdModelManager.setItems(birds);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdUi
    public void zoomTo(WireBird bird, Location location, boolean z) {
        int zoomPaddingPx;
        Intrinsics.checkNotNullParameter(bird, "bird");
        if (location != null) {
            LatLngBounds.C17620a c17620a = new LatLngBounds.C17620a();
            c17620a.m50666b(GoogleMap_Kt.toLatLng(bird.getLocation()));
            c17620a.m50666b(C39339cm2.m60885d(location));
            LatLngBounds m50667a = c17620a.m50667a();
            Intrinsics.checkNotNullExpressionValue(m50667a, "Builder().apply {\n      …tLng())\n        }.build()");
            if (z) {
                zoomPaddingPx = this.largeZoomPaddingPx;
            } else {
                zoomPaddingPx = getZoomPaddingPx();
            }
            MapUiKt.safeAnimateCamera$default(getMap(), m50667a, zoomPaddingPx, null, 4, null);
            return;
        }
        getMap().m61682f(C48149rc0.m15705e(new LatLng(bird.getLocation().getLatitude(), bird.getLocation().getLongitude()), 17.0f));
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapBirdUi
    public void zoomTo(WireBird bird, float f) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        getMap().m61682f(C48149rc0.m15705e(new LatLng(bird.getLocation().getLatitude(), bird.getLocation().getLongitude()), f));
    }
}
