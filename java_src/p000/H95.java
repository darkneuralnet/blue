package p000;

import android.location.Location;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterItemState;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterManager;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterManagerFactory;
import co.bird.android.app.feature.map.modelmanager.Filter;
import co.bird.android.app.feature.map.modelmanager.ParkingNestModelManager;
import co.bird.android.app.feature.map.p008ui.MapBirdUiImpl;
import co.bird.android.app.feature.map.p008ui.MapUiKt;
import co.bird.android.app.feature.map.p008ui.ReactiveMapEvent;
import co.bird.android.app.feature.map.p008ui.renderer.ParkingNestRenderItem;
import co.bird.android.app.feature.map.p008ui.renderer.ParkingNestRenderer;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.rider.bottomsheets.RideStatusBottomSheet;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000Ñ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001<\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B£\u0001\b\u0007\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010G\u001a\u00020F\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010K\u001a\u00020J\u0012\b\b\u0001\u0010M\u001a\u00020L\u0012\n\b\u0001\u0010O\u001a\u0004\u0018\u00010N\u0012\b\b\u0001\u0010Q\u001a\u00020P\u0012\b\b\u0001\u0010S\u001a\u00020R\u0012\b\b\u0001\u0010U\u001a\u00020T\u0012\n\b\u0001\u0010W\u001a\u0004\u0018\u00010V\u0012\b\b\u0001\u0010X\u001a\u00020\u0013\u0012\b\b\u0001\u0010Y\u001a\u00020\u0013\u0012\b\b\u0001\u0010[\u001a\u00020Z\u0012\b\b\u0001\u0010\\\u001a\u00020\u0013\u0012\b\b\u0001\u0010/\u001a\u00020\u0013\u0012\u0006\u0010^\u001a\u00020]¢\u0006\u0004\b_\u0010`J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0016J\u001e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0016J<\u0010\u0019\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u001a\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u0016\u0010!\u001a\u00020\t2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001fH\u0016J\u0016\u0010\"\u001a\u00020\t2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001fH\u0016J\b\u0010#\u001a\u00020\tH\u0016J\u001a\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0004H\u0016J\u0010\u0010(\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0004H\u0016J\u0010\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0013H\u0016J\u0016\u0010+\u001a\u00020\t2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001fH\u0016J\u0016\u0010,\u001a\u00020\t2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001fH\u0016R\u0014\u0010/\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u0010\u0005\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00040\u0004048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006a"}, m28432d2 = {"LH95;", "Lco/bird/android/app/feature/map/ui/MapBirdUiImpl;", "LG95;", "Lio/reactivex/Observable;", "LfM2;", "parkingMarkerClicks", "", "Lco/bird/android/model/ParkingNest;", "nests", "", "addParkingNests", "Lco/bird/android/model/wire/WireBird;", "allBirds", "ei", "Landroid/location/Location;", "location", "birds", "Xg", "focusedBird", "", "rideStarted", "", "", "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;", "markerStates", "C4", "bird", "Ea", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "wg", "Lco/bird/android/app/feature/map/modelmanager/Filter;", "filter", "w1", "z0", "showInfoWindow", "mapMarkerState", "x3", "marker", "resetParkingMarker", "selectParkingMarker", "show", "showParkingMarkers", "addParkingFilter", "removeParkingFilter", "b", "Z", "drawParkingNestOutline", "Lco/bird/android/feature/rider/bottomsheets/RideStatusBottomSheet;", "c", "Lco/bird/android/feature/rider/bottomsheets/RideStatusBottomSheet;", "rideStatusBottomSheet", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager;", "e", "Lco/bird/android/app/feature/map/modelmanager/ParkingNestModelManager;", "parkingNestModelManager", "H95$a", "f", "LH95$a;", "hideParkingFilter", "", "am", "()I", "bottomSheetHeight", "Li66;", "traceProvider", "LTq4;", "reactiveConfig", "LOh;", "appBuildConfig", "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManagerFactory;", "clusterManagerFactory", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/google/android/gms/maps/model/CameraPosition;", "initialCameraPosition", "LcD1;", "map", "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;", "reactiveMapEvent", "Lcom/google/android/gms/maps/MapView;", "mapView", "Landroid/view/View;", "myLocationButton", "drawUserLocation", "userDirectionalArrow", "LBK2;", "markerOverridesManager", "hourly", "Ldr4;", "locationManager", "<init>", "(Li66;LTq4;LOh;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterManagerFactory;Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;ZZLBK2;ZZLdr4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRiderMapUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderMapUi.kt\nco/bird/android/app/feature/ride/ui/RiderMapUiImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n766#2:245\n857#2,2:246\n1855#2,2:248\n1855#2,2:250\n1855#2,2:252\n1855#2,2:254\n*S KotlinDebug\n*F\n+ 1 RiderMapUi.kt\nco/bird/android/app/feature/ride/ui/RiderMapUiImpl\n*L\n143#1:245\n143#1:246,2\n156#1:248,2\n174#1:250,2\n178#1:252,2\n186#1:254,2\n*E\n"})
/* renamed from: H95 */
/* loaded from: classes2.dex */
public final class H95 extends MapBirdUiImpl implements G95 {

    /* renamed from: b */
    public final boolean f12970b;

    /* renamed from: c */
    public final RideStatusBottomSheet f12971c;

    /* renamed from: d */
    public final C24558d<C40889fM2> f12972d;

    /* renamed from: e */
    public final ParkingNestModelManager f12973e;

    /* renamed from: f */
    public final C3053a f12974f;

    @Metadata(m28433d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR?\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m28432d2 = {"H95$a", "Lco/bird/android/app/feature/map/modelmanager/Filter;", "Lco/bird/android/model/ParkingNest;", "", "models", "apply", "", C17296a.f69688o, "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "b", "Lkotlin/jvm/functions/Function1;", "getSetDirty", "()Lkotlin/jvm/functions/Function1;", "setSetDirty", "(Lkotlin/jvm/functions/Function1;)V", "setDirty", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: H95$a */
    /* loaded from: classes2.dex */
    public static final class C3053a implements Filter<ParkingNest> {

        /* renamed from: a */
        public final String f12975a = "hide-all";

        /* renamed from: b */
        public Function1<? super String, Unit> f12976b;

        @Override // co.bird.android.app.feature.map.modelmanager.Filter
        public List<ParkingNest> apply(List<? extends ParkingNest> models) {
            List<ParkingNest> emptyList;
            Intrinsics.checkNotNullParameter(models, "models");
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }

        @Override // co.bird.android.app.feature.map.modelmanager.Filter
        public String getId() {
            return this.f12975a;
        }

        @Override // co.bird.android.app.feature.map.modelmanager.Filter
        public Function1<String, Unit> getSetDirty() {
            return this.f12976b;
        }

        @Override // co.bird.android.app.feature.map.modelmanager.Filter
        public void setSetDirty(Function1<? super String, Unit> function1) {
            this.f12976b = function1;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: H95$b */
    /* loaded from: classes2.dex */
    public static final class C3054b extends Lambda implements Function1<Exception, String> {

        /* renamed from: g */
        public final /* synthetic */ Location f12977g;

        /* renamed from: h */
        public final /* synthetic */ H95 f12978h;

        /* renamed from: i */
        public final /* synthetic */ List<WireBird> f12979i;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Ljava/lang/CharSequence;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRiderMapUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderMapUi.kt\nco/bird/android/app/feature/ride/ui/RiderMapUiImpl$zoomToBoundsContainingLocationAndBirds$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,244:1\n1#2:245\n*E\n"})
        /* renamed from: H95$b$a */
        /* loaded from: classes2.dex */
        public static final class C3055a extends Lambda implements Function1<WireBird, CharSequence> {

            /* renamed from: g */
            public static final C3055a f12980g = new C3055a();

            public C3055a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final CharSequence invoke(WireBird it) {
                boolean isBlank;
                Intrinsics.checkNotNullParameter(it, "it");
                String code = it.getCode();
                isBlank = StringsKt__StringsJVMKt.isBlank(code);
                if (!(!isBlank)) {
                    code = null;
                }
                if (code == null) {
                    return it.getId();
                }
                return code;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3054b(Location location, H95 h95, List<WireBird> list) {
            super(1);
            this.f12977g = location;
            this.f12978h = h95;
            this.f12979i = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Exception it) {
            String joinToString$default;
            Intrinsics.checkNotNullParameter(it, "it");
            Location location = this.f12977g;
            int m104258am = this.f12978h.m104258am();
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(this.f12979i, null, null, null, 0, null, C3055a.f12980g, 31, null);
            return "Error while attempting to zoomToBoundsContainingLocationAndBirds location=" + location + ", padding=" + m104258am + ", birds=" + joinToString$default;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H95(InterfaceC42524i66 traceProvider, C36207Tq4 reactiveConfig, InterfaceC6097Oh appBuildConfig, BirdClusterManagerFactory clusterManagerFactory, BaseActivity activity, CameraPosition cameraPosition, C39011cD1 map, ReactiveMapEvent reactiveMapEvent, MapView mapView, View view, boolean z, boolean z2, BK2 markerOverridesManager, boolean z3, boolean z4, InterfaceC40001dr4 locationManager) {
        super(activity, cameraPosition, traceProvider, reactiveConfig, appBuildConfig, map, reactiveMapEvent, mapView, view, MapMode.RIDER, z, z2, markerOverridesManager, z3, clusterManagerFactory, locationManager);
        Intrinsics.checkNotNullParameter(traceProvider, "traceProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(clusterManagerFactory, "clusterManagerFactory");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(reactiveMapEvent, "reactiveMapEvent");
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(markerOverridesManager, "markerOverridesManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.f12970b = z4;
        this.f12971c = (RideStatusBottomSheet) C40788fB0.m41758x(activity, C36585Vg4.rideStatusBottomSheet);
        C24558d<C40889fM2> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Marker>()");
        this.f12972d = m31902e;
        this.f12973e = new ParkingNestModelManager(new ParkingNestRenderer(activity, map, z4), getMapModelManagerViewportChangesObservable());
        this.f12974f = new C3053a();
    }

    @Override // p000.G95
    /* renamed from: C4 */
    public void mo104261C4(List<WireBird> birds, WireBird wireBird, boolean z, Map<String, ? extends BirdClusterItemState> markerStates) {
        Intrinsics.checkNotNullParameter(birds, "birds");
        Intrinsics.checkNotNullParameter(markerStates, "markerStates");
        if (birds.isEmpty()) {
            return;
        }
        getClusterManager().clear();
        List<WireBird> list = birds;
        for (WireBird wireBird2 : list) {
            BirdClusterManager clusterManager = getClusterManager();
            boolean z2 = false;
            if (wireBird != null && wireBird.isSame(wireBird2)) {
                z2 = true;
            }
            clusterManager.add(wireBird2, z2);
        }
        if (z) {
            for (WireBird wireBird3 : list) {
                getClusterManager().setInRide(wireBird3, markerStates.get(wireBird3.getId()));
            }
        } else if (wireBird != null) {
            getClusterManager().select(wireBird);
        }
        for (WireBird wireBird4 : list) {
            getClusterManager().closeInfoWindow(wireBird4);
        }
    }

    @Override // p000.G95
    /* renamed from: Ea */
    public void mo104260Ea(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        getClusterManager().reset(bird);
        getClusterManager().closeInfoWindow(bird);
    }

    @Override // p000.G95
    /* renamed from: Xg */
    public void mo104259Xg(Location location, List<WireBird> birds) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(birds, "birds");
        LatLng m60885d = C39339cm2.m60885d(location);
        if (!birds.isEmpty()) {
            LatLngBounds.C17620a c17620a = new LatLngBounds.C17620a();
            for (WireBird wireBird : birds) {
                c17620a.m50666b(GoogleMap_Kt.toLatLng(wireBird.getLocation()));
            }
            C39011cD1 map = getMap();
            LatLngBounds m50667a = c17620a.m50667a();
            Intrinsics.checkNotNullExpressionValue(m50667a, "builder.build()");
            MapUiKt.safeAnimateCamera(map, m50667a, m104258am(), new C3054b(location, this, birds));
            return;
        }
        getMap().m61682f(C48149rc0.m15705e(m60885d, 17.0f));
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public void addParkingFilter(Filter<ParkingNest> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f12973e.addFilter(filter);
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public void addParkingNests(List<ParkingNest> nests) {
        Intrinsics.checkNotNullParameter(nests, "nests");
        this.f12973e.addItems(nests);
    }

    /* renamed from: am */
    public final int m104258am() {
        RideStatusBottomSheet rideStatusBottomSheet = this.f12971c;
        if (rideStatusBottomSheet != null) {
            return rideStatusBottomSheet.m59053y();
        }
        return 0;
    }

    @Override // p000.G95
    /* renamed from: ei */
    public List<WireBird> mo104257ei(List<WireBird> allBirds) {
        Intrinsics.checkNotNullParameter(allBirds, "allBirds");
        ArrayList arrayList = new ArrayList();
        for (Object obj : allBirds) {
            if (getMap().m61677k().m81934b().f71509f.m50669u(GoogleMap_Kt.toLatLng(((WireBird) obj).getLocation()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public Observable<C40889fM2> parkingMarkerClicks() {
        Observable<C40889fM2> hide = this.f12972d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "parkingMarkerClicks.hide()");
        return hide;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public void removeParkingFilter(Filter<ParkingNest> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f12973e.removeFilter(filter);
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

    @Override // p000.G95
    public void showInfoWindow() {
        getClusterManager().showInfoWindow();
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapParkingUi
    public void showParkingMarkers(boolean z) {
        if (z) {
            this.f12973e.removeFilter(this.f12974f);
        } else {
            this.f12973e.addFilter(this.f12974f);
        }
    }

    @Override // p000.G95
    /* renamed from: w1 */
    public void mo104256w1(Filter<WireBird> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        getBirdModelManager().addBirdFilter(filter);
    }

    @Override // p000.G95
    /* renamed from: wg */
    public void mo104255wg(WireBird bird, LatLng latLng) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        getClusterManager().move(bird, latLng);
    }

    @Override // p000.G95
    /* renamed from: x3 */
    public void mo104254x3(BirdClusterItemState mapMarkerState, WireBird wireBird) {
        Intrinsics.checkNotNullParameter(mapMarkerState, "mapMarkerState");
        getClusterManager().setMapMarkerState(mapMarkerState, wireBird);
    }

    @Override // p000.G95
    /* renamed from: z0 */
    public void mo104253z0(Filter<WireBird> filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        getBirdModelManager().removeBirdFilter(filter);
    }
}
