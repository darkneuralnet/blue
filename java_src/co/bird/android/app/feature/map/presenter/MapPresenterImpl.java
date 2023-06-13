package co.bird.android.app.feature.map.presenter;

import android.annotation.SuppressLint;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import co.bird.android.app.feature.map.p008ui.MapUi;
import co.bird.android.app.feature.map.presenter.MapPresenterImpl;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdPaymentKt;
import co.bird.android.model.RideMapState;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.filter.KeyBasedAreasFilter;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.ZoneColorOverrideConfig;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C41318g46;
import p000.InterfaceC40001dr4;
@Metadata(m28433d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 t2\u00020\u00012\u00020\u0002:\u0001tB\u008d\u0001\b\u0007\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010K\u001a\u00020J\u0012\f\b\u0001\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030M\u0012\b\b\u0001\u0010P\u001a\u00020O\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0003\u0010S\u001a\u00020\u001c¢\u0006\u0004\br\u0010sJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u001c\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u0007H\u0002J&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0016\u0010\u0015\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0002J\u000e\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u0017H\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0017J\b\u0010!\u001a\u00020\u0003H\u0016J&\u0010\"\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007J\b\u0010#\u001a\u00020\u0003H\u0007J\u001a\u0010(\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)H\u0016R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010RR\u0014\u0010S\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001c\u0010Y\u001a\n X*\u0004\u0018\u00010$0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\"\u0010\\\u001a\u0010\u0012\f\u0012\n X*\u0004\u0018\u00010)0)0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001d\u0010c\u001a\u0004\u0018\u00010^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR!\u0010m\u001a\u00020g8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bh\u0010`\u0012\u0004\bk\u0010l\u001a\u0004\bi\u0010jR\u0014\u0010q\u001a\u00020n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006u"}, m28432d2 = {"Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;", "Lco/bird/android/app/feature/map/presenter/MapPresenter;", "Landroid/hardware/SensorEventListener;", "", "startRiderAreaUpdateStream", "startOperatorAreaUpdateStream", "startLegacyAreaUpdateStream", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Landroid/location/Location;", "", "legacyAreaRefreshObservable", "location", "radius", "", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "viewport", "Lio/reactivex/c;", "loadOperatorAreas", "loadLegacyRiderAreas", "Lcom/google/android/gms/maps/model/LatLng;", "loadGeocacheRiderZones", "listenForGpsUpdates", "Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/filter/KeyBasedAreasFilter;", "getAreaFilterForParkingCalculationIfEnabled", "Lco/bird/android/model/constant/MapMode;", "mapMode", "", "shouldShowAreas", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "onResume", "onPause", "loadBlacklist", "listenForAreaUpdates", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "Landroid/hardware/SensorEvent;", "event", "onSensorChanged", "Ldr4;", "locationManager", "Ldr4;", "LTq4;", "reactiveConfig", "LTq4;", "Lbn;", "areaManager", "Lbn;", "LGl1;", "filterAreasManager", "LGl1;", "Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/SensorManager;", "LpU4;", "rideMapStateManager", "LpU4;", "Lgl;", "preference", "Lgl;", "LhW0;", "deepLinkManager", "LhW0;", "LaM;", "birdManager", "LaM;", "Lq95;", "riderMapDataManager", "Lq95;", "LYR4;", "rideManager", "LYR4;", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "Lco/bird/android/app/feature/map/ui/MapUi;", "ui", "Lco/bird/android/app/feature/map/ui/MapUi;", "Lco/bird/android/model/constant/MapMode;", "moveLocation", "Z", "", "lastZoomLevel", "F", "kotlin.jvm.PlatformType", "sensorOrientation", "Landroid/hardware/Sensor;", "Lma4;", "sensorEventRelay", "Lma4;", "Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;", "zoneColorConfig$delegate", "Lkotlin/Lazy;", "getZoneColorConfig", "()Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;", "zoneColorConfig", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isFirstAreaRequestSinceResume", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lco/bird/android/model/persistence/Area;", "invertedOperationalAreaPlaceholder$delegate", "getInvertedOperationalAreaPlaceholder", "()Lco/bird/android/model/persistence/Area;", "getInvertedOperationalAreaPlaceholder$annotations", "()V", "invertedOperationalAreaPlaceholder", "Lg46$b;", "getAreaLogger", "()Lg46$b;", "areaLogger", "<init>", "(Ldr4;LTq4;Lbn;LGl1;Landroid/hardware/SensorManager;LpU4;Lgl;LhW0;LaM;Lq95;LYR4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/model/constant/MapMode;Z)V", "Companion", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPresenter.kt\nco/bird/android/app/feature/map/presenter/MapPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,623:1\n199#2:624\n199#2:625\n161#2:626\n180#2:627\n180#2:628\n180#2:629\n180#2:630\n180#2:631\n180#2:632\n237#2:633\n237#2:634\n237#2:635\n180#2:638\n180#2:644\n180#2:645\n161#2:646\n1855#3,2:636\n288#3,2:639\n1#4:641\n61#5,2:642\n*S KotlinDebug\n*F\n+ 1 MapPresenter.kt\nco/bird/android/app/feature/map/presenter/MapPresenterImpl\n*L\n179#1:624\n189#1:625\n202#1:626\n212#1:627\n220#1:628\n230#1:629\n240#1:630\n259#1:631\n275#1:632\n363#1:633\n414#1:634\n437#1:635\n509#1:638\n572#1:644\n587#1:645\n594#1:646\n498#1:636,2\n518#1:639,2\n528#1:642,2\n*E\n"})
/* loaded from: classes2.dex */
public final class MapPresenterImpl implements MapPresenter, SensorEventListener {
    public static final Companion Companion = new Companion(null);
    public static final double DEFAULT_AREA_REFRESH_REQUEST_RADIUS = 5000.0d;
    public static final long LOCATION_THROTTLE_AREA_UPDATE_REQUESTS_SECONDS = 2;
    public static final long LOCATION_THROTTLE_IN_AREA_UPDATE_SECONDS = 5;
    public static final float SMALLEST_DISPLACEMENT_TO_RELOAD_AREAS = 500.0f;
    private final InterfaceC12495bn areaManager;
    private final InterfaceC10636aM birdManager;
    private final InterfaceC42163hW0 deepLinkManager;
    private final InterfaceC33117Gl1 filterAreasManager;
    private final Lazy invertedOperationalAreaPlaceholder$delegate;
    private final AtomicBoolean isFirstAreaRequestSinceResume;
    private float lastZoomLevel;
    private final InterfaceC40001dr4 locationManager;
    private final MapMode mapMode;
    private final boolean moveLocation;
    private final C22454gl preference;
    private final C36207Tq4 reactiveConfig;
    private final YR4 rideManager;
    private final InterfaceC46893pU4 rideMapStateManager;
    private final InterfaceC47297q95 riderMapDataManager;
    private final LifecycleScopeProvider<?> scopeProvider;
    private final C45168ma4<SensorEvent> sensorEventRelay;
    private final SensorManager sensorManager;
    private final Sensor sensorOrientation;

    /* renamed from: ui */
    private final MapUi f61617ui;
    private final Lazy zoneColorConfig$delegate;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$Companion;", "", "()V", "DEFAULT_AREA_REFRESH_REQUEST_RADIUS", "", "LOCATION_THROTTLE_AREA_UPDATE_REQUESTS_SECONDS", "", "LOCATION_THROTTLE_IN_AREA_UPDATE_SECONDS", "SMALLEST_DISPLACEMENT_TO_RELOAD_AREAS", "", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapMode.values().length];
            try {
                iArr[MapMode.OPERATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapMode.RIDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MapPresenterImpl(InterfaceC40001dr4 locationManager, C36207Tq4 reactiveConfig, InterfaceC12495bn areaManager, InterfaceC33117Gl1 filterAreasManager, SensorManager sensorManager, InterfaceC46893pU4 rideMapStateManager, C22454gl preference, InterfaceC42163hW0 deepLinkManager, InterfaceC10636aM birdManager, InterfaceC47297q95 riderMapDataManager, YR4 rideManager, LifecycleScopeProvider<?> scopeProvider, MapUi ui, MapMode mapMode, boolean z) {
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(filterAreasManager, "filterAreasManager");
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        Intrinsics.checkNotNullParameter(rideMapStateManager, "rideMapStateManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(deepLinkManager, "deepLinkManager");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(riderMapDataManager, "riderMapDataManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(mapMode, "mapMode");
        this.locationManager = locationManager;
        this.reactiveConfig = reactiveConfig;
        this.areaManager = areaManager;
        this.filterAreasManager = filterAreasManager;
        this.sensorManager = sensorManager;
        this.rideMapStateManager = rideMapStateManager;
        this.preference = preference;
        this.deepLinkManager = deepLinkManager;
        this.birdManager = birdManager;
        this.riderMapDataManager = riderMapDataManager;
        this.rideManager = rideManager;
        this.scopeProvider = scopeProvider;
        this.f61617ui = ui;
        this.mapMode = mapMode;
        this.moveLocation = z;
        this.lastZoomLevel = 17.0f;
        this.sensorOrientation = sensorManager.getDefaultSensor(3);
        C45168ma4<SensorEvent> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<SensorEvent>()");
        this.sensorEventRelay = m25409g;
        lazy = LazyKt__LazyJVMKt.lazy(new MapPresenterImpl$zoneColorConfig$2(this));
        this.zoneColorConfig$delegate = lazy;
        this.isFirstAreaRequestSinceResume = new AtomicBoolean(true);
        lazy2 = LazyKt__LazyJVMKt.lazy(new MapPresenterImpl$invertedOperationalAreaPlaceholder$2(this));
        this.invertedOperationalAreaPlaceholder$delegate = lazy2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KeyBasedAreasFilter getAreaFilterForParkingCalculationIfEnabled(WireBird wireBird) {
        Object obj;
        if (!Intrinsics.areEqual(C36441Uq4.m80769c(this.reactiveConfig, wireBird).getParkingConfig().getUseAreaKeys(), Boolean.TRUE)) {
            return null;
        }
        String areaKey = wireBird.getAreaKey();
        if (areaKey == null && (areaKey = C49697uC6.m10641a(wireBird)) == null) {
            Iterator<T> it = this.birdManager.mo71580b1().m73665a().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (wireBird.isProbablySame((WireBird) obj)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            WireBird wireBird2 = (WireBird) obj;
            if (wireBird2 != null) {
                areaKey = wireBird2.getAreaKey();
            } else {
                areaKey = null;
            }
        }
        if (areaKey == null) {
            return null;
        }
        return new KeyBasedAreasFilter(true, areaKey);
    }

    private final C41318g46.AbstractC20723b getAreaLogger() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("Area Loading");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"Area Loading\")");
        return m40153k;
    }

    public static /* synthetic */ void getInvertedOperationalAreaPlaceholder$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ZoneColorOverrideConfig getZoneColorConfig() {
        return (ZoneColorOverrideConfig) this.zoneColorConfig$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<Pair<Location, Double>> legacyAreaRefreshObservable() {
        Observable<Location> throttleLatest = this.locationManager.mo43625g(500.0f, true).startWith((Observable<Location>) this.locationManager.mo43616p().m73665a()).throttleLatest(2L, TimeUnit.SECONDS);
        final MapPresenterImpl$legacyAreaRefreshObservable$1 mapPresenterImpl$legacyAreaRefreshObservable$1 = MapPresenterImpl$legacyAreaRefreshObservable$1.INSTANCE;
        InterfaceC23434B map = throttleLatest.map(new InterfaceC23492o() { // from class: mL2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair legacyAreaRefreshObservable$lambda$37;
                legacyAreaRefreshObservable$lambda$37 = MapPresenterImpl.legacyAreaRefreshObservable$lambda$37(Function1.this, obj);
                return legacyAreaRefreshObservable$lambda$37;
            }
        });
        Observable<C5691Nn> mo64014I = this.areaManager.mo64014I();
        final MapPresenterImpl$legacyAreaRefreshObservable$2 mapPresenterImpl$legacyAreaRefreshObservable$2 = new MapPresenterImpl$legacyAreaRefreshObservable$2(this);
        Observable<Pair<Location, Double>> merge = Observable.merge(map, mo64014I.map(new InterfaceC23492o() { // from class: nL2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair legacyAreaRefreshObservable$lambda$38;
                legacyAreaRefreshObservable$lambda$38 = MapPresenterImpl.legacyAreaRefreshObservable$lambda$38(Function1.this, obj);
                return legacyAreaRefreshObservable$lambda$38;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(merge, "private fun legacyAreaRe…ride */\n      }\n    )\n  }");
        return merge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair legacyAreaRefreshObservable$lambda$37(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair legacyAreaRefreshObservable$lambda$38(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listenForAreaUpdates$lambda$44(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listenForAreaUpdates$lambda$47(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listenForAreaUpdates$lambda$48(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listenForAreaUpdates$lambda$49(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listenForAreaUpdates$lambda$50(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listenForAreaUpdates$lambda$51(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listenForAreaUpdates$lambda$52(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void listenForGpsUpdates() {
        Observable<Location> subscribeOn = this.locationManager.mo43613s(true).subscribeOn(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "locationManager.configLo…Schedulers.computation())");
        Object m33094as = subscribeOn.m33094as(AutoDispose.m45239a(this.scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final MapPresenterImpl$listenForGpsUpdates$1 mapPresenterImpl$listenForGpsUpdates$1 = MapPresenterImpl$listenForGpsUpdates$1.INSTANCE;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: zL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.listenForGpsUpdates$lambda$40(Function1.this, obj);
            }
        };
        final MapPresenterImpl$listenForGpsUpdates$2 mapPresenterImpl$listenForGpsUpdates$2 = MapPresenterImpl$listenForGpsUpdates$2.INSTANCE;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: AL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.listenForGpsUpdates$lambda$41(Function1.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listenForGpsUpdates$lambda$40(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listenForGpsUpdates$lambda$41(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC23461c loadGeocacheRiderZones(List<LatLng> list) {
        LatLngBounds.C17620a m50670s = LatLngBounds.m50670s();
        Intrinsics.checkNotNullExpressionValue(m50670s, "builder()");
        for (LatLng latLng : list) {
            m50670s.m50666b(latLng);
        }
        InterfaceC47297q95 interfaceC47297q95 = this.riderMapDataManager;
        LatLngBounds m50667a = m50670s.m50667a();
        Intrinsics.checkNotNullExpressionValue(m50667a, "latLngBoundsBuilder.build()");
        return interfaceC47297q95.mo18056b(m50667a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC23461c loadLegacyRiderAreas(Location location, double d) {
        if (!shouldShowAreas(this.mapMode)) {
            AbstractC23461c m33039p = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
            return m33039p;
        }
        if (this.rideMapStateManager.mo15897l().m73665a() == RideMapState.RIDING && this.isFirstAreaRequestSinceResume.get()) {
            this.isFirstAreaRequestSinceResume.set(false);
            d = 500.0d;
        }
        return this.areaManager.mo64005Z(location, d, this.mapMode, true);
    }

    private final AbstractC23461c loadOperatorAreas(Location location, double d, List<Geolocation> list) {
        if (!shouldShowAreas(this.mapMode)) {
            AbstractC23461c m33039p = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
            return m33039p;
        }
        return this.areaManager.mo63996m(location, d, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WireLocation onResume$lambda$10(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireLocation) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23434B onResume$lambda$11(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$12(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$13(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onResume$lambda$14(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$15(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23447K onResume$lambda$16(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$17(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float onResume$lambda$18(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Float) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onResume$lambda$19(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float onResume$lambda$20(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Float) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$21(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$22(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onResume$lambda$6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onResume$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onResume$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    private final boolean shouldShowAreas(MapMode mapMode) {
        return mapMode == MapMode.RIDER || mapMode == MapMode.OPERATOR;
    }

    private final void startLegacyAreaUpdateStream() {
        C41318g46.m40163a("startLegacyAreaUpdateStream", new Object[0]);
        Observable<Pair<Location, Double>> observeOn = legacyAreaRefreshObservable().observeOn(C23454a.m33087a());
        final MapPresenterImpl$startLegacyAreaUpdateStream$1 mapPresenterImpl$startLegacyAreaUpdateStream$1 = new MapPresenterImpl$startLegacyAreaUpdateStream$1(this);
        Observable observeOn2 = observeOn.map(new InterfaceC23492o() { // from class: LK2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Triple startLegacyAreaUpdateStream$lambda$33;
                startLegacyAreaUpdateStream$lambda$33 = MapPresenterImpl.startLegacyAreaUpdateStream$lambda$33(Function1.this, obj);
                return startLegacyAreaUpdateStream$lambda$33;
            }
        }).observeOn(C24542a.m31932c());
        final MapPresenterImpl$startLegacyAreaUpdateStream$2 mapPresenterImpl$startLegacyAreaUpdateStream$2 = new MapPresenterImpl$startLegacyAreaUpdateStream$2(this);
        AbstractC23461c switchMapCompletable = observeOn2.switchMapCompletable(new InterfaceC23492o() { // from class: WK2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h startLegacyAreaUpdateStream$lambda$34;
                startLegacyAreaUpdateStream$lambda$34 = MapPresenterImpl.startLegacyAreaUpdateStream$lambda$34(Function1.this, obj);
                return startLegacyAreaUpdateStream$lambda$34;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "private fun startLegacyA…scribe({}, Timber::e)\n  }");
        Object m33041n = switchMapCompletable.m33041n(AutoDispose.m45239a(this.scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: hL2
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                MapPresenterImpl.startLegacyAreaUpdateStream$lambda$35();
            }
        };
        final MapPresenterImpl$startLegacyAreaUpdateStream$4 mapPresenterImpl$startLegacyAreaUpdateStream$4 = MapPresenterImpl$startLegacyAreaUpdateStream$4.INSTANCE;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: sL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.startLegacyAreaUpdateStream$lambda$36(Function1.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Triple startLegacyAreaUpdateStream$lambda$33(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23496h startLegacyAreaUpdateStream$lambda$34(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLegacyAreaUpdateStream$lambda$35() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLegacyAreaUpdateStream$lambda$36(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void startOperatorAreaUpdateStream() {
        C41318g46.m40163a("startOperatorAreaUpdateStream called", new Object[0]);
        Z84<Config> m82623f8 = this.reactiveConfig.m82623f8();
        final MapPresenterImpl$startOperatorAreaUpdateStream$1 mapPresenterImpl$startOperatorAreaUpdateStream$1 = MapPresenterImpl$startOperatorAreaUpdateStream$1.INSTANCE;
        Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: tL2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair startOperatorAreaUpdateStream$lambda$27;
                startOperatorAreaUpdateStream$lambda$27 = MapPresenterImpl.startOperatorAreaUpdateStream$lambda$27(Function1.this, obj);
                return startOperatorAreaUpdateStream$lambda$27;
            }
        }).distinctUntilChanged();
        final MapPresenterImpl$startOperatorAreaUpdateStream$2 mapPresenterImpl$startOperatorAreaUpdateStream$2 = new MapPresenterImpl$startOperatorAreaUpdateStream$2(this);
        Observable observeOn = distinctUntilChanged.switchMap(new InterfaceC23492o() { // from class: uL2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B startOperatorAreaUpdateStream$lambda$28;
                startOperatorAreaUpdateStream$lambda$28 = MapPresenterImpl.startOperatorAreaUpdateStream$lambda$28(Function1.this, obj);
                return startOperatorAreaUpdateStream$lambda$28;
            }
        }).observeOn(C23454a.m33087a());
        final MapPresenterImpl$startOperatorAreaUpdateStream$3 mapPresenterImpl$startOperatorAreaUpdateStream$3 = new MapPresenterImpl$startOperatorAreaUpdateStream$3(this);
        Observable observeOn2 = observeOn.map(new InterfaceC23492o() { // from class: vL2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Triple startOperatorAreaUpdateStream$lambda$29;
                startOperatorAreaUpdateStream$lambda$29 = MapPresenterImpl.startOperatorAreaUpdateStream$lambda$29(Function1.this, obj);
                return startOperatorAreaUpdateStream$lambda$29;
            }
        }).observeOn(C24542a.m31932c());
        final MapPresenterImpl$startOperatorAreaUpdateStream$4 mapPresenterImpl$startOperatorAreaUpdateStream$4 = new MapPresenterImpl$startOperatorAreaUpdateStream$4(this);
        AbstractC23461c switchMapCompletable = observeOn2.switchMapCompletable(new InterfaceC23492o() { // from class: wL2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h startOperatorAreaUpdateStream$lambda$30;
                startOperatorAreaUpdateStream$lambda$30 = MapPresenterImpl.startOperatorAreaUpdateStream$lambda$30(Function1.this, obj);
                return startOperatorAreaUpdateStream$lambda$30;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "private fun startOperato…scribe({}, Timber::e)\n  }");
        Object m33041n = switchMapCompletable.m33041n(AutoDispose.m45239a(this.scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: xL2
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                MapPresenterImpl.startOperatorAreaUpdateStream$lambda$31();
            }
        };
        final MapPresenterImpl$startOperatorAreaUpdateStream$6 mapPresenterImpl$startOperatorAreaUpdateStream$6 = MapPresenterImpl$startOperatorAreaUpdateStream$6.INSTANCE;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: yL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.startOperatorAreaUpdateStream$lambda$32(Function1.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair startOperatorAreaUpdateStream$lambda$27(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23434B startOperatorAreaUpdateStream$lambda$28(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Triple startOperatorAreaUpdateStream$lambda$29(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23496h startOperatorAreaUpdateStream$lambda$30(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startOperatorAreaUpdateStream$lambda$31() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startOperatorAreaUpdateStream$lambda$32(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void startRiderAreaUpdateStream() {
        C41318g46.m40163a("startRiderAreaUpdateStream", new Object[0]);
        Z84<Config> m82623f8 = this.reactiveConfig.m82623f8();
        final MapPresenterImpl$startRiderAreaUpdateStream$1 mapPresenterImpl$startRiderAreaUpdateStream$1 = MapPresenterImpl$startRiderAreaUpdateStream$1.INSTANCE;
        Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: oL2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean startRiderAreaUpdateStream$lambda$23;
                startRiderAreaUpdateStream$lambda$23 = MapPresenterImpl.startRiderAreaUpdateStream$lambda$23(Function1.this, obj);
                return startRiderAreaUpdateStream$lambda$23;
            }
        }).distinctUntilChanged();
        final MapPresenterImpl$startRiderAreaUpdateStream$2 mapPresenterImpl$startRiderAreaUpdateStream$2 = new MapPresenterImpl$startRiderAreaUpdateStream$2(this);
        AbstractC23461c switchMapCompletable = distinctUntilChanged.switchMapCompletable(new InterfaceC23492o() { // from class: pL2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h startRiderAreaUpdateStream$lambda$24;
                startRiderAreaUpdateStream$lambda$24 = MapPresenterImpl.startRiderAreaUpdateStream$lambda$24(Function1.this, obj);
                return startRiderAreaUpdateStream$lambda$24;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "private fun startRiderAr…scribe({}, Timber::e)\n  }");
        Object m33041n = switchMapCompletable.m33041n(AutoDispose.m45239a(this.scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: qL2
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                MapPresenterImpl.startRiderAreaUpdateStream$lambda$25();
            }
        };
        final MapPresenterImpl$startRiderAreaUpdateStream$4 mapPresenterImpl$startRiderAreaUpdateStream$4 = MapPresenterImpl$startRiderAreaUpdateStream$4.INSTANCE;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: rL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.startRiderAreaUpdateStream$lambda$26(Function1.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean startRiderAreaUpdateStream$lambda$23(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23496h startRiderAreaUpdateStream$lambda$24(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRiderAreaUpdateStream$lambda$25() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRiderAreaUpdateStream$lambda$26(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final Area getInvertedOperationalAreaPlaceholder() {
        return (Area) this.invertedOperationalAreaPlaceholder$delegate.getValue();
    }

    public final void listenForAreaUpdates() {
        C24523e c24523e = C24523e.f91168a;
        Z84<List<Area>> mo63995r = this.areaManager.mo63995r();
        final MapPresenterImpl$listenForAreaUpdates$1 mapPresenterImpl$listenForAreaUpdates$1 = new MapPresenterImpl$listenForAreaUpdates$1(this);
        Observable<List<Area>> filter = mo63995r.filter(new InterfaceC23494q() { // from class: BL2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean listenForAreaUpdates$lambda$44;
                listenForAreaUpdates$lambda$44 = MapPresenterImpl.listenForAreaUpdates$lambda$44(Function1.this, obj);
                return listenForAreaUpdates$lambda$44;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "@VisibleForTesting\n  fun…e triggers\")\n      })\n  }");
        Observable<KeyBasedAreasFilter> distinctUntilChanged = this.filterAreasManager.mo103476c().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "filterAreasManager.areaK…er.distinctUntilChanged()");
        Observable<Integer> distinctUntilChanged2 = this.rideManager.mo75028t0().startWith((Observable<Integer>) Integer.valueOf(this.rideManager.mo75032o0().m73665a().getActiveRideCount())).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged2, "rideManager.activeRideCo…  .distinctUntilChanged()");
        Observable combineLatest = Observable.combineLatest(filter, distinctUntilChanged, distinctUntilChanged2, this.rideMapStateManager.mo15900i(), new InterfaceC23486i<T1, T2, T3, T4, R>() { // from class: co.bird.android.app.feature.map.presenter.MapPresenterImpl$listenForAreaUpdates$$inlined$combineLatest$1
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
                r5 = r2.this$0.getAreaFilterForParkingCalculationIfEnabled(r5);
             */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, R] */
            @Override // io.reactivex.functions.InterfaceC23486i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                MapMode mapMode;
                List mutableList;
                KeyBasedAreasFilter areaFilterForParkingCalculationIfEnabled;
                C36207Tq4 c36207Tq4;
                List list;
                List emptyList;
                Optional optional = (Optional) t4;
                Integer num = (Integer) t3;
                KeyBasedAreasFilter filter2 = (KeyBasedAreasFilter) t2;
                ?? r3 = (R) ((List) t1);
                mapMode = MapPresenterImpl.this.mapMode;
                if (MapPresenterImpl.WhenMappings.$EnumSwitchMapping$0[mapMode.ordinal()] == 2) {
                    if (num.intValue() == 0 && !optional.m59037c()) {
                        c36207Tq4 = MapPresenterImpl.this.reactiveConfig;
                        if (!c36207Tq4.m82623f8().m73665a().getRiderMapConfig().getRiderShowAreasBeforeSelectingVehicle()) {
                            C41318g46.m40163a("not showing areas due to active ride count = 0 && no focused bird present", new Object[0]);
                            emptyList = CollectionsKt__CollectionsKt.emptyList();
                            return (R) emptyList;
                        }
                    }
                    WireBird wireBird = (WireBird) optional.m59035e();
                    if (wireBird != null && areaFilterForParkingCalculationIfEnabled != null) {
                        filter2 = areaFilterForParkingCalculationIfEnabled;
                    }
                    int size = r3.size();
                    C41318g46.m40163a("filtering " + size + " areas in rider map mode", new Object[0]);
                    Intrinsics.checkNotNullExpressionValue(filter2, "filter");
                    mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) C23356io.m33481a(r3, filter2));
                    mutableList.add(0, MapPresenterImpl.this.getInvertedOperationalAreaPlaceholder());
                    list = CollectionsKt___CollectionsKt.toList(mutableList);
                    return (R) list;
                }
                return r3;
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        Observable observeOn = combineLatest.distinctUntilChanged().subscribeOn(C24542a.m31934a()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "@VisibleForTesting\n  fun…e triggers\")\n      })\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final MapPresenterImpl$listenForAreaUpdates$3 mapPresenterImpl$listenForAreaUpdates$3 = new MapPresenterImpl$listenForAreaUpdates$3(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: CL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.listenForAreaUpdates$lambda$47(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = this.f61617ui.setAreasCompleteChanges().observeOn(C23454a.m33087a());
        final MapPresenterImpl$listenForAreaUpdates$4 mapPresenterImpl$listenForAreaUpdates$4 = new MapPresenterImpl$listenForAreaUpdates$4(this);
        Observable<Unit> doOnNext = observeOn2.doOnNext(new InterfaceC23484g() { // from class: DL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.listenForAreaUpdates$lambda$48(Function1.this, obj);
            }
        });
        final MapPresenterImpl$listenForAreaUpdates$5 mapPresenterImpl$listenForAreaUpdates$5 = MapPresenterImpl$listenForAreaUpdates$5.INSTANCE;
        Observable<Unit> retry = doOnNext.doOnError(new InterfaceC23484g() { // from class: EL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.listenForAreaUpdates$lambda$49(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "@VisibleForTesting\n  fun…e triggers\")\n      })\n  }");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(this.scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe();
        AbstractC24490k<Pair<List<LatLng>, Float>> viewportChanged = this.f61617ui.viewportChanged();
        final MapPresenterImpl$listenForAreaUpdates$6 mapPresenterImpl$listenForAreaUpdates$6 = MapPresenterImpl$listenForAreaUpdates$6.INSTANCE;
        AbstractC24490k<Pair<List<LatLng>, Float>> m32111s0 = viewportChanged.m32195I(new InterfaceC23484g() { // from class: FL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.listenForAreaUpdates$lambda$50(Function1.this, obj);
            }
        }).m32192J0().m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s0, "ui.viewportChanged()\n   …dSchedulers.mainThread())");
        Object m32150f = m32111s0.m32150f(AutoDispose.m45239a(this.scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final MapPresenterImpl$listenForAreaUpdates$7 mapPresenterImpl$listenForAreaUpdates$7 = new MapPresenterImpl$listenForAreaUpdates$7(this);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: GL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.listenForAreaUpdates$lambda$51(Function1.this, obj);
            }
        };
        final MapPresenterImpl$listenForAreaUpdates$8 mapPresenterImpl$listenForAreaUpdates$8 = MapPresenterImpl$listenForAreaUpdates$8.INSTANCE;
        ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: MK2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.listenForAreaUpdates$lambda$52(Function1.this, obj);
            }
        });
    }

    public final AbstractC23461c loadBlacklist(Location location, double d, List<Geolocation> viewport) {
        boolean z;
        List listOf;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        if (shouldShowAreas(this.mapMode)) {
            MapMode mapMode = this.mapMode;
            if (mapMode == MapMode.RIDER) {
                z = true;
            } else {
                z = false;
            }
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new MapMode[]{MapMode.OPERATOR, MapMode.SERVICE_CENTER});
            if (BirdPaymentKt.isOneOf(mapMode, listOf)) {
                return this.areaManager.mo63996m(location, d, viewport);
            }
            if (this.rideMapStateManager.mo15897l().m73665a() == RideMapState.RIDING && this.isFirstAreaRequestSinceResume.get()) {
                this.isFirstAreaRequestSinceResume.set(false);
                d = 500.0d;
            }
            return this.areaManager.mo64005Z(location, d, this.mapMode, z);
        }
        AbstractC23461c m33039p = AbstractC23461c.m33039p();
        Intrinsics.checkNotNullExpressionValue(m33039p, "{\n      Completable.complete()\n    }");
        return m33039p;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // co.bird.android.app.feature.map.presenter.MapPresenter
    public void onPause() {
        this.sensorManager.unregisterListener(this);
        this.deepLinkManager.mo30416c();
    }

    @Override // co.bird.android.app.feature.map.presenter.MapPresenter
    @SuppressLint({"MissingPermission"})
    public void onResume(ScopeProvider scopeProvider) {
        boolean z;
        Observable observeOn;
        Observable m31950a;
        Observable observeOn2;
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        if (this.reactiveConfig.m82623f8().m73665a().getRiderMapConfig().getEnableUserLocationV2()) {
            this.sensorManager.registerListener(this, this.sensorOrientation, 1);
        }
        listenForAreaUpdates();
        listenForGpsUpdates();
        this.isFirstAreaRequestSinceResume.set(true);
        int i = WhenMappings.$EnumSwitchMapping$0[this.mapMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                startLegacyAreaUpdateStream();
            } else {
                startRiderAreaUpdateStream();
            }
        } else {
            startOperatorAreaUpdateStream();
        }
        C41318g46.m40163a("moveLocation = " + this.moveLocation + ", mapMode = " + this.mapMode + ", priceConfig = " + this.reactiveConfig.m82623f8().m73665a().getPricingUiConfig().getEnabled(), new Object[0]);
        EnumC46314oW0 mo30418a = this.deepLinkManager.mo30418a();
        if (mo30418a != null && mo30418a.m20951b()) {
            z = true;
        } else {
            z = false;
        }
        if (this.moveLocation && (this.mapMode != MapMode.RIDER || (!this.reactiveConfig.m82623f8().m73665a().getPricingUiConfig().getEnabled() && !z))) {
            C41318g46.m40163a("calling move to now with " + this.locationManager.mo43616p().m73665a(), new Object[0]);
            this.f61617ui.moveTo(this.locationManager.mo43616p().m73665a());
            AbstractC23442F m33152N = InterfaceC40001dr4.C19874a.requestLocationOnce$default(this.locationManager, false, 1, null).m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "locationManager.requestL…dSchedulers.mainThread())");
            Object m33135e = m33152N.m33135e(AutoDispose.m45239a(scopeProvider));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final MapPresenterImpl$onResume$1 mapPresenterImpl$onResume$1 = new MapPresenterImpl$onResume$1(this);
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: NK2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    MapPresenterImpl.onResume$lambda$0(Function1.this, obj);
                }
            };
            final MapPresenterImpl$onResume$2 mapPresenterImpl$onResume$2 = MapPresenterImpl$onResume$2.INSTANCE;
            ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: ZK2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    MapPresenterImpl.onResume$lambda$1(Function1.this, obj);
                }
            });
        } else {
            AbstractC23442F requestLocationOnce$default = InterfaceC40001dr4.C19874a.requestLocationOnce$default(this.locationManager, false, 1, null);
            final MapPresenterImpl$onResume$3 mapPresenterImpl$onResume$3 = MapPresenterImpl$onResume$3.INSTANCE;
            AbstractC23442F m33142Y = requestLocationOnce$default.m33101w(new InterfaceC23484g() { // from class: dL2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    MapPresenterImpl.onResume$lambda$2(Function1.this, obj);
                }
            }).m33142Y(C24542a.m31932c());
            Intrinsics.checkNotNullExpressionValue(m33142Y, "locationManager.requestL…scribeOn(Schedulers.io())");
            Object m33135e2 = m33142Y.m33135e(AutoDispose.m45239a(scopeProvider));
            Intrinsics.checkExpressionValueIsNotNull(m33135e2, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((SingleSubscribeProxy) m33135e2).subscribe();
        }
        if (z && this.mapMode != MapMode.RIDER) {
            this.deepLinkManager.mo30416c();
        }
        AbstractC24490k<Location> m32111s0 = this.locationManager.mo43616p().toFlowable(EnumC23460b.LATEST).m32111s0(C23454a.m33087a());
        final MapPresenterImpl$onResume$4 mapPresenterImpl$onResume$4 = new MapPresenterImpl$onResume$4(this);
        AbstractC24490k<Location> m32191K = m32111s0.m32191K(new InterfaceC23484g() { // from class: eL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.onResume$lambda$3(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32191K, "@SuppressLint(\"MissingPe…updateLocationRotate)\n  }");
        Object m32150f = m32191K.m32150f(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final MapPresenterImpl$onResume$5 mapPresenterImpl$onResume$5 = MapPresenterImpl$onResume$5.INSTANCE;
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: fL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.onResume$lambda$4(Function1.this, obj);
            }
        };
        final MapPresenterImpl$onResume$6 mapPresenterImpl$onResume$6 = MapPresenterImpl$onResume$6.INSTANCE;
        ((FlowableSubscribeProxy) m32150f).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: gL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.onResume$lambda$5(Function1.this, obj);
            }
        });
        Observable<LatLng> mapClicksLocation = this.f61617ui.mapClicksLocation();
        final MapPresenterImpl$onResume$7 mapPresenterImpl$onResume$7 = new MapPresenterImpl$onResume$7(this);
        Observable<LatLng> filter = mapClicksLocation.filter(new InterfaceC23494q() { // from class: iL2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean onResume$lambda$6;
                onResume$lambda$6 = MapPresenterImpl.onResume$lambda$6(Function1.this, obj);
                return onResume$lambda$6;
            }
        });
        final MapPresenterImpl$onResume$8 mapPresenterImpl$onResume$8 = new MapPresenterImpl$onResume$8(this);
        Observable<LatLng> filter2 = filter.filter(new InterfaceC23494q() { // from class: jL2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean onResume$lambda$7;
                onResume$lambda$7 = MapPresenterImpl.onResume$lambda$7(Function1.this, obj);
                return onResume$lambda$7;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter2, "@SuppressLint(\"MissingPe…updateLocationRotate)\n  }");
        Object m33094as = filter2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        C44606ld5.subscribeBy$default((ObservableSubscribeProxy) m33094as, MapPresenterImpl$onResume$10.INSTANCE, null, new MapPresenterImpl$onResume$9(this.f61617ui), 2, null);
        Observable<Boolean> observeOn3 = this.reactiveConfig.m82671b4().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "reactiveConfig.enableLoc…dSchedulers.mainThread())");
        Object m33094as2 = observeOn3.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final MapPresenterImpl$onResume$11 mapPresenterImpl$onResume$11 = new MapPresenterImpl$onResume$11(this);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: kL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.onResume$lambda$8(Function1.this, obj);
            }
        });
        Observable m31950a2 = C24527f.m31950a(this.f61617ui.mapLongClicks(), this.reactiveConfig.m82671b4());
        final MapPresenterImpl$onResume$12 mapPresenterImpl$onResume$12 = MapPresenterImpl$onResume$12.INSTANCE;
        Observable filter3 = m31950a2.filter(new InterfaceC23494q() { // from class: lL2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean onResume$lambda$9;
                onResume$lambda$9 = MapPresenterImpl.onResume$lambda$9(Function1.this, obj);
                return onResume$lambda$9;
            }
        });
        final MapPresenterImpl$onResume$13 mapPresenterImpl$onResume$13 = MapPresenterImpl$onResume$13.INSTANCE;
        Observable map = filter3.map(new InterfaceC23492o() { // from class: OK2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireLocation onResume$lambda$10;
                onResume$lambda$10 = MapPresenterImpl.onResume$lambda$10(Function1.this, obj);
                return onResume$lambda$10;
            }
        });
        final MapPresenterImpl$onResume$14 mapPresenterImpl$onResume$14 = new MapPresenterImpl$onResume$14(this);
        Observable switchMap = map.switchMap(new InterfaceC23492o() { // from class: PK2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B onResume$lambda$11;
                onResume$lambda$11 = MapPresenterImpl.onResume$lambda$11(Function1.this, obj);
                return onResume$lambda$11;
            }
        });
        final MapPresenterImpl$onResume$15 mapPresenterImpl$onResume$15 = new MapPresenterImpl$onResume$15(this);
        Observable doOnNext = switchMap.doOnNext(new InterfaceC23484g() { // from class: QK2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.onResume$lambda$12(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "@SuppressLint(\"MissingPe…updateLocationRotate)\n  }");
        Object m33094as3 = doOnNext.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final MapPresenterImpl$onResume$16 mapPresenterImpl$onResume$16 = new MapPresenterImpl$onResume$16(this);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: RK2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.onResume$lambda$13(Function1.this, obj);
            }
        });
        Observable<Unit> myLocationLongClicks = this.f61617ui.myLocationLongClicks();
        if (myLocationLongClicks != null && (m31950a = C24527f.m31950a(myLocationLongClicks, this.reactiveConfig.m82671b4())) != null) {
            final MapPresenterImpl$onResume$17 mapPresenterImpl$onResume$17 = MapPresenterImpl$onResume$17.INSTANCE;
            Observable filter4 = m31950a.filter(new InterfaceC23494q() { // from class: SK2
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean onResume$lambda$14;
                    onResume$lambda$14 = MapPresenterImpl.onResume$lambda$14(Function1.this, obj);
                    return onResume$lambda$14;
                }
            });
            if (filter4 != null && (observeOn2 = filter4.observeOn(C23454a.m33087a())) != null) {
                Object m33094as4 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
                Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
                ObservableSubscribeProxy observableSubscribeProxy = (ObservableSubscribeProxy) m33094as4;
                if (observableSubscribeProxy != null) {
                    final MapPresenterImpl$onResume$18 mapPresenterImpl$onResume$18 = new MapPresenterImpl$onResume$18(this);
                    observableSubscribeProxy.subscribe(new InterfaceC23484g() { // from class: TK2
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            MapPresenterImpl.onResume$lambda$15(Function1.this, obj);
                        }
                    });
                }
            }
        }
        this.f61617ui.hideInfoWindow();
        Observable<Unit> myLocationClicks = this.f61617ui.myLocationClicks();
        if (myLocationClicks != null) {
            final MapPresenterImpl$onResume$19 mapPresenterImpl$onResume$19 = new MapPresenterImpl$onResume$19(this);
            Observable<R> switchMapSingle = myLocationClicks.switchMapSingle(new InterfaceC23492o() { // from class: UK2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K onResume$lambda$16;
                    onResume$lambda$16 = MapPresenterImpl.onResume$lambda$16(Function1.this, obj);
                    return onResume$lambda$16;
                }
            });
            if (switchMapSingle != 0 && (observeOn = switchMapSingle.observeOn(C23454a.m33087a())) != null) {
                Object m33094as5 = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
                Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
                ObservableSubscribeProxy observableSubscribeProxy2 = (ObservableSubscribeProxy) m33094as5;
                if (observableSubscribeProxy2 != null) {
                    final MapPresenterImpl$onResume$20 mapPresenterImpl$onResume$20 = new MapPresenterImpl$onResume$20(this);
                    observableSubscribeProxy2.subscribe(new InterfaceC23484g() { // from class: VK2
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            MapPresenterImpl.onResume$lambda$17(Function1.this, obj);
                        }
                    });
                }
            }
        }
        Observable<SensorEvent> observeOn4 = this.sensorEventRelay.observeOn(C24542a.m31934a());
        final MapPresenterImpl$onResume$21 mapPresenterImpl$onResume$21 = MapPresenterImpl$onResume$21.INSTANCE;
        Observable<R> map2 = observeOn4.map(new InterfaceC23492o() { // from class: XK2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Float onResume$lambda$18;
                onResume$lambda$18 = MapPresenterImpl.onResume$lambda$18(Function1.this, obj);
                return onResume$lambda$18;
            }
        });
        final MapPresenterImpl$onResume$22 mapPresenterImpl$onResume$22 = MapPresenterImpl$onResume$22.INSTANCE;
        Observable filter5 = map2.filter(new InterfaceC23494q() { // from class: YK2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean onResume$lambda$19;
                onResume$lambda$19 = MapPresenterImpl.onResume$lambda$19(Function1.this, obj);
                return onResume$lambda$19;
            }
        });
        final MapPresenterImpl$onResume$23 mapPresenterImpl$onResume$23 = new MapPresenterImpl$onResume$23(this);
        Observable observeOn5 = filter5.map(new InterfaceC23492o() { // from class: aL2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Float onResume$lambda$20;
                onResume$lambda$20 = MapPresenterImpl.onResume$lambda$20(Function1.this, obj);
                return onResume$lambda$20;
            }
        }).observeOn(C23454a.m33087a());
        final MapPresenterImpl$onResume$24 mapPresenterImpl$onResume$24 = MapPresenterImpl$onResume$24.INSTANCE;
        Observable retry = observeOn5.doOnError(new InterfaceC23484g() { // from class: bL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.onResume$lambda$21(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "@SuppressLint(\"MissingPe…updateLocationRotate)\n  }");
        Object m33094as6 = retry.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final MapPresenterImpl$onResume$25 mapPresenterImpl$onResume$25 = new MapPresenterImpl$onResume$25(this.f61617ui);
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: cL2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl.onResume$lambda$22(Function1.this, obj);
            }
        });
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.sensorEventRelay.accept(event);
    }

    public /* synthetic */ MapPresenterImpl(InterfaceC40001dr4 interfaceC40001dr4, C36207Tq4 c36207Tq4, InterfaceC12495bn interfaceC12495bn, InterfaceC33117Gl1 interfaceC33117Gl1, SensorManager sensorManager, InterfaceC46893pU4 interfaceC46893pU4, C22454gl c22454gl, InterfaceC42163hW0 interfaceC42163hW0, InterfaceC10636aM interfaceC10636aM, InterfaceC47297q95 interfaceC47297q95, YR4 yr4, LifecycleScopeProvider lifecycleScopeProvider, MapUi mapUi, MapMode mapMode, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC40001dr4, c36207Tq4, interfaceC12495bn, interfaceC33117Gl1, sensorManager, interfaceC46893pU4, c22454gl, interfaceC42163hW0, interfaceC10636aM, interfaceC47297q95, yr4, lifecycleScopeProvider, mapUi, mapMode, (i & 16384) != 0 ? true : z);
    }
}
