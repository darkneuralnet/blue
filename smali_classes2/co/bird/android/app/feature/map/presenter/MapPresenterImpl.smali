.class public final Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/presenter/MapPresenter;
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$Companion;,
        Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 t2\u00020\u00012\u00020\u0002:\u0001tB\u008d\u0001\u0008\u0007\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010K\u001a\u00020J\u0012\u000c\u0008\u0001\u0010\u001f\u001a\u0006\u0012\u0002\u0008\u00030M\u0012\u0008\u0008\u0001\u0010P\u001a\u00020O\u0012\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u001a\u0012\u0008\u0008\u0003\u0010S\u001a\u00020\u001c\u00a2\u0006\u0004\u0008r\u0010sJ\u0008\u0010\u0004\u001a\u00020\u0003H\u0002J\u0008\u0010\u0005\u001a\u00020\u0003H\u0002J\u0008\u0010\u0006\u001a\u00020\u0003H\u0002J\u001c\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00080\u0007H\u0002J&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\n2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0016\u0010\u0015\u001a\u00020\u00112\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u000eH\u0002J\u0008\u0010\u0016\u001a\u00020\u0003H\u0002J\u000e\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u0017H\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0017J\u0008\u0010!\u001a\u00020\u0003H\u0016J&\u0010\"\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\n2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007J\u0008\u0010#\u001a\u00020\u0003H\u0007J\u001a\u0010(\u001a\u00020\u00032\u0008\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\'\u001a\u00020&H\u0016J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)H\u0016R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR\u0018\u0010\u001f\u001a\u0006\u0012\u0002\u0008\u00030M8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010RR\u0014\u0010S\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0016\u0010V\u001a\u00020U8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008V\u0010WR\u001c\u0010Y\u001a\n X*\u0004\u0018\u00010$0$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Y\u0010ZR\"\u0010\\\u001a\u0010\u0012\u000c\u0012\n X*\u0004\u0018\u00010)0)0[8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\\\u0010]R\u001d\u0010c\u001a\u0004\u0018\u00010^8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008_\u0010`\u001a\u0004\u0008a\u0010bR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008e\u0010fR!\u0010m\u001a\u00020g8FX\u0087\u0084\u0002\u00a2\u0006\u0012\n\u0004\u0008h\u0010`\u0012\u0004\u0008k\u0010l\u001a\u0004\u0008i\u0010jR\u0014\u0010q\u001a\u00020n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008o\u0010p\u00a8\u0006u"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;",
        "Lco/bird/android/app/feature/map/presenter/MapPresenter;",
        "Landroid/hardware/SensorEventListener;",
        "",
        "startRiderAreaUpdateStream",
        "startOperatorAreaUpdateStream",
        "startLegacyAreaUpdateStream",
        "Lio/reactivex/Observable;",
        "Lkotlin/Pair;",
        "Landroid/location/Location;",
        "",
        "legacyAreaRefreshObservable",
        "location",
        "radius",
        "",
        "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
        "viewport",
        "Lio/reactivex/c;",
        "loadOperatorAreas",
        "loadLegacyRiderAreas",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "loadGeocacheRiderZones",
        "listenForGpsUpdates",
        "Lco/bird/android/model/wire/WireBird;",
        "Lco/bird/android/model/filter/KeyBasedAreasFilter;",
        "getAreaFilterForParkingCalculationIfEnabled",
        "Lco/bird/android/model/constant/MapMode;",
        "mapMode",
        "",
        "shouldShowAreas",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "onResume",
        "onPause",
        "loadBlacklist",
        "listenForAreaUpdates",
        "Landroid/hardware/Sensor;",
        "sensor",
        "",
        "accuracy",
        "onAccuracyChanged",
        "Landroid/hardware/SensorEvent;",
        "event",
        "onSensorChanged",
        "Ldr4;",
        "locationManager",
        "Ldr4;",
        "LTq4;",
        "reactiveConfig",
        "LTq4;",
        "Lbn;",
        "areaManager",
        "Lbn;",
        "LGl1;",
        "filterAreasManager",
        "LGl1;",
        "Landroid/hardware/SensorManager;",
        "sensorManager",
        "Landroid/hardware/SensorManager;",
        "LpU4;",
        "rideMapStateManager",
        "LpU4;",
        "Lgl;",
        "preference",
        "Lgl;",
        "LhW0;",
        "deepLinkManager",
        "LhW0;",
        "LaM;",
        "birdManager",
        "LaM;",
        "Lq95;",
        "riderMapDataManager",
        "Lq95;",
        "LYR4;",
        "rideManager",
        "LYR4;",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "Lco/bird/android/app/feature/map/ui/MapUi;",
        "ui",
        "Lco/bird/android/app/feature/map/ui/MapUi;",
        "Lco/bird/android/model/constant/MapMode;",
        "moveLocation",
        "Z",
        "",
        "lastZoomLevel",
        "F",
        "kotlin.jvm.PlatformType",
        "sensorOrientation",
        "Landroid/hardware/Sensor;",
        "Lma4;",
        "sensorEventRelay",
        "Lma4;",
        "Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;",
        "zoneColorConfig$delegate",
        "Lkotlin/Lazy;",
        "getZoneColorConfig",
        "()Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;",
        "zoneColorConfig",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "isFirstAreaRequestSinceResume",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "Lco/bird/android/model/persistence/Area;",
        "invertedOperationalAreaPlaceholder$delegate",
        "getInvertedOperationalAreaPlaceholder",
        "()Lco/bird/android/model/persistence/Area;",
        "getInvertedOperationalAreaPlaceholder$annotations",
        "()V",
        "invertedOperationalAreaPlaceholder",
        "Lg46$b;",
        "getAreaLogger",
        "()Lg46$b;",
        "areaLogger",
        "<init>",
        "(Ldr4;LTq4;Lbn;LGl1;Landroid/hardware/SensorManager;LpU4;Lgl;LhW0;LaM;Lq95;LYR4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/model/constant/MapMode;Z)V",
        "Companion",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPresenter.kt\nco/bird/android/app/feature/map/presenter/MapPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,623:1\n199#2:624\n199#2:625\n161#2:626\n180#2:627\n180#2:628\n180#2:629\n180#2:630\n180#2:631\n180#2:632\n237#2:633\n237#2:634\n237#2:635\n180#2:638\n180#2:644\n180#2:645\n161#2:646\n1855#3,2:636\n288#3,2:639\n1#4:641\n61#5,2:642\n*S KotlinDebug\n*F\n+ 1 MapPresenter.kt\nco/bird/android/app/feature/map/presenter/MapPresenterImpl\n*L\n179#1:624\n189#1:625\n202#1:626\n212#1:627\n220#1:628\n230#1:629\n240#1:630\n259#1:631\n275#1:632\n363#1:633\n414#1:634\n437#1:635\n509#1:638\n572#1:644\n587#1:645\n594#1:646\n498#1:636,2\n518#1:639,2\n528#1:642,2\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$Companion;

.field public static final DEFAULT_AREA_REFRESH_REQUEST_RADIUS:D = 5000.0

.field public static final LOCATION_THROTTLE_AREA_UPDATE_REQUESTS_SECONDS:J = 0x2L

.field public static final LOCATION_THROTTLE_IN_AREA_UPDATE_SECONDS:J = 0x5L

.field public static final SMALLEST_DISPLACEMENT_TO_RELOAD_AREAS:F = 500.0f


# instance fields
.field private final areaManager:Lbn;

.field private final birdManager:LaM;

.field private final deepLinkManager:LhW0;

.field private final filterAreasManager:LGl1;

.field private final invertedOperationalAreaPlaceholder$delegate:Lkotlin/Lazy;

.field private final isFirstAreaRequestSinceResume:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private lastZoomLevel:F

.field private final locationManager:Ldr4;

.field private final mapMode:Lco/bird/android/model/constant/MapMode;

.field private final moveLocation:Z

.field private final preference:Lgl;

.field private final reactiveConfig:LTq4;

.field private final rideManager:LYR4;

.field private final rideMapStateManager:LpU4;

.field private final riderMapDataManager:Lq95;

.field private final scopeProvider:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "*>;"
        }
    .end annotation
.end field

.field private final sensorEventRelay:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Landroid/hardware/SensorEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final sensorManager:Landroid/hardware/SensorManager;

.field private final sensorOrientation:Landroid/hardware/Sensor;

.field private final ui:Lco/bird/android/app/feature/map/ui/MapUi;

.field private final zoneColorConfig$delegate:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->Companion:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$Companion;

    return-void
.end method

.method public constructor <init>(Ldr4;LTq4;Lbn;LGl1;Landroid/hardware/SensorManager;LpU4;Lgl;LhW0;LaM;Lq95;LYR4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/model/constant/MapMode;Z)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldr4;",
            "LTq4;",
            "Lbn;",
            "LGl1;",
            "Landroid/hardware/SensorManager;",
            "LpU4;",
            "Lgl;",
            "LhW0;",
            "LaM;",
            "Lq95;",
            "LYR4;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "*>;",
            "Lco/bird/android/app/feature/map/ui/MapUi;",
            "Lco/bird/android/model/constant/MapMode;",
            "Z)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    const-string v15, "locationManager"

    invoke-static {v1, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "reactiveConfig"

    invoke-static {v2, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "areaManager"

    invoke-static {v3, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "filterAreasManager"

    invoke-static {v4, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "sensorManager"

    invoke-static {v5, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "rideMapStateManager"

    invoke-static {v6, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "preference"

    invoke-static {v7, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "deepLinkManager"

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "birdManager"

    invoke-static {v9, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "riderMapDataManager"

    invoke-static {v10, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "rideManager"

    invoke-static {v11, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "scopeProvider"

    invoke-static {v12, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "ui"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "mapMode"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->locationManager:Ldr4;

    iput-object v2, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->reactiveConfig:LTq4;

    iput-object v3, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->areaManager:Lbn;

    iput-object v4, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->filterAreasManager:LGl1;

    iput-object v5, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->sensorManager:Landroid/hardware/SensorManager;

    iput-object v6, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->rideMapStateManager:LpU4;

    iput-object v7, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->preference:Lgl;

    iput-object v8, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->deepLinkManager:LhW0;

    iput-object v9, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->birdManager:LaM;

    iput-object v10, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->riderMapDataManager:Lq95;

    iput-object v11, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->rideManager:LYR4;

    iput-object v12, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->scopeProvider:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    iput-object v13, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/MapUi;

    iput-object v14, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->mapMode:Lco/bird/android/model/constant/MapMode;

    move/from16 v1, p15

    iput-boolean v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->moveLocation:Z

    const/high16 v1, 0x41880000    # 17.0f

    iput v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->lastZoomLevel:F

    const/4 v1, 0x3

    invoke-virtual {v5, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->sensorOrientation:Landroid/hardware/Sensor;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v1

    const-string v2, "create<SensorEvent>()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->sensorEventRelay:Lma4;

    new-instance v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$zoneColorConfig$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$zoneColorConfig$2;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->zoneColorConfig$delegate:Lkotlin/Lazy;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->isFirstAreaRequestSinceResume:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$invertedOperationalAreaPlaceholder$2;

    invoke-direct {v1, v0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$invertedOperationalAreaPlaceholder$2;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->invertedOperationalAreaPlaceholder$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(Ldr4;LTq4;Lbn;LGl1;Landroid/hardware/SensorManager;LpU4;Lgl;LhW0;LaM;Lq95;LYR4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/model/constant/MapMode;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p16

    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    move/from16 v16, v0

    goto :goto_0

    :cond_0
    move/from16 v16, p15

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    invoke-direct/range {v1 .. v16}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;-><init>(Ldr4;LTq4;Lbn;LGl1;Landroid/hardware/SensorManager;LpU4;Lgl;LhW0;LaM;Lq95;LYR4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/model/constant/MapMode;Z)V

    return-void
.end method

.method public static synthetic A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->startLegacyAreaUpdateStream$lambda$36(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->listenForAreaUpdates$lambda$48(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$15(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic D(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->startOperatorAreaUpdateStream$lambda$27(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->startRiderAreaUpdateStream$lambda$23(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic H(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic I()V
    .locals 0

    invoke-static {}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->startLegacyAreaUpdateStream$lambda$35()V

    return-void
.end method

.method public static synthetic J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Float;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$18(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Float;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$20(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L()V
    .locals 0

    invoke-static {}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->startOperatorAreaUpdateStream$lambda$31()V

    return-void
.end method

.method public static synthetic M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->startRiderAreaUpdateStream$lambda$26(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic O(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$13(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic P(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->legacyAreaRefreshObservable$lambda$38(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic R(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->listenForAreaUpdates$lambda$51(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic S(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->startLegacyAreaUpdateStream$lambda$33(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic U(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$17(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic V(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->listenForAreaUpdates$lambda$47(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->listenForAreaUpdates$lambda$44(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getAreaFilterForParkingCalculationIfEnabled(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/filter/KeyBasedAreasFilter;
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->getAreaFilterForParkingCalculationIfEnabled(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/filter/KeyBasedAreasFilter;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAreaManager$p(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)Lbn;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->areaManager:Lbn;

    return-object p0
.end method

.method public static final synthetic access$getLocationManager$p(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)Ldr4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->locationManager:Ldr4;

    return-object p0
.end method

.method public static final synthetic access$getMapMode$p(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)Lco/bird/android/model/constant/MapMode;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->mapMode:Lco/bird/android/model/constant/MapMode;

    return-object p0
.end method

.method public static final synthetic access$getPreference$p(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)Lgl;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->preference:Lgl;

    return-object p0
.end method

.method public static final synthetic access$getReactiveConfig$p(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)LTq4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->reactiveConfig:LTq4;

    return-object p0
.end method

.method public static final synthetic access$getRideMapStateManager$p(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)LpU4;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->rideMapStateManager:LpU4;

    return-object p0
.end method

.method public static final synthetic access$getSensorManager$p(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)Landroid/hardware/SensorManager;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->sensorManager:Landroid/hardware/SensorManager;

    return-object p0
.end method

.method public static final synthetic access$getUi$p(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)Lco/bird/android/app/feature/map/ui/MapUi;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/MapUi;

    return-object p0
.end method

.method public static final synthetic access$getZoneColorConfig(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;
    .locals 0

    invoke-direct {p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->getZoneColorConfig()Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$legacyAreaRefreshObservable(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)Lio/reactivex/Observable;
    .locals 0

    invoke-direct {p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->legacyAreaRefreshObservable()Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$loadGeocacheRiderZones(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;Ljava/util/List;)Lio/reactivex/c;
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->loadGeocacheRiderZones(Ljava/util/List;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$loadLegacyRiderAreas(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;Landroid/location/Location;D)Lio/reactivex/c;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->loadLegacyRiderAreas(Landroid/location/Location;D)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$14(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$8(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$22(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->listenForGpsUpdates$lambda$40(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->startOperatorAreaUpdateStream$lambda$30(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$11(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method private final getAreaFilterForParkingCalculationIfEnabled(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/filter/KeyBasedAreasFilter;
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->reactiveConfig:LTq4;

    invoke-static {v0, p1}, LUq4;->c(LTq4;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getParkingConfig()Lco/bird/android/model/wire/configs/ParkingConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ParkingConfig;->getUseAreaKeys()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getAreaKey()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-static {p1}, LuC6;->a(Lco/bird/android/model/wire/WireBird;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->birdManager:LaM;

    invoke-interface {v0}, LaM;->b1()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1, v3}, Lco/bird/android/model/wire/WireBird;->isProbablySame(Lco/bird/android/model/wire/WireBird;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    check-cast v2, Lco/bird/android/model/wire/WireBird;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getAreaKey()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    new-instance v1, Lco/bird/android/model/filter/KeyBasedAreasFilter;

    const/4 p1, 0x1

    invoke-direct {v1, p1, v0}, Lco/bird/android/model/filter/KeyBasedAreasFilter;-><init>(ZLjava/lang/String;)V

    :cond_4
    return-object v1
.end method

.method private final getAreaLogger()Lg46$b;
    .locals 2

    const-string v0, "Area Loading"

    invoke-static {v0}, Lg46;->k(Ljava/lang/String;)Lg46$b;

    move-result-object v0

    const-string v1, "tag(\"Area Loading\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic getInvertedOperationalAreaPlaceholder$annotations()V
    .locals 0

    return-void
.end method

.method private final getZoneColorConfig()Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->zoneColorConfig$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;

    return-object v0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->listenForAreaUpdates$lambda$49(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$12(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->startLegacyAreaUpdateStream$lambda$34(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$19(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private final legacyAreaRefreshObservable()Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Landroid/location/Location;",
            "Ljava/lang/Double;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->locationManager:Ldr4;

    const/high16 v1, 0x43fa0000    # 500.0f

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Ldr4;->g(FZ)Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->locationManager:Ldr4;

    invoke-interface {v1}, Ldr4;->p()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    const-wide/16 v1, 0x2

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lio/reactivex/Observable;->throttleLatest(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$legacyAreaRefreshObservable$1;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$legacyAreaRefreshObservable$1;

    new-instance v2, LmL2;

    invoke-direct {v2, v1}, LmL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->areaManager:Lbn;

    invoke-interface {v1}, Lbn;->I()Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$legacyAreaRefreshObservable$2;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$legacyAreaRefreshObservable$2;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v3, LnL2;

    invoke-direct {v3, v2}, LnL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-static {v0, v1}, Lio/reactivex/Observable;->merge(Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "private fun legacyAreaRe\u2026ride */\n      }\n    )\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final legacyAreaRefreshObservable$lambda$37(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method

.method private static final legacyAreaRefreshObservable$lambda$38(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method

.method private static final listenForAreaUpdates$lambda$44(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final listenForAreaUpdates$lambda$47(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final listenForAreaUpdates$lambda$48(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final listenForAreaUpdates$lambda$49(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final listenForAreaUpdates$lambda$50(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final listenForAreaUpdates$lambda$51(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final listenForAreaUpdates$lambda$52(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final listenForGpsUpdates()V
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->locationManager:Ldr4;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ldr4;->s(Z)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "locationManager.configLo\u2026Schedulers.computation())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->scopeProvider:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    sget-object v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForGpsUpdates$1;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForGpsUpdates$1;

    new-instance v2, LzL2;

    invoke-direct {v2, v1}, LzL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForGpsUpdates$2;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForGpsUpdates$2;

    new-instance v3, LAL2;

    invoke-direct {v3, v1}, LAL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method private static final listenForGpsUpdates$lambda$40(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final listenForGpsUpdates$lambda$41(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final loadGeocacheRiderZones(Ljava/util/List;)Lio/reactivex/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/maps/model/LatLngBounds;->s()Lcom/google/android/gms/maps/model/LatLngBounds$a;

    move-result-object v0

    const-string v1, "builder()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->b(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$a;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->riderMapDataManager:Lq95;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->a()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v0

    const-string v1, "latLngBoundsBuilder.build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lq95;->b(Lcom/google/android/gms/maps/model/LatLngBounds;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method private final loadLegacyRiderAreas(Landroid/location/Location;D)Lio/reactivex/c;
    .locals 6

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->mapMode:Lco/bird/android/model/constant/MapMode;

    invoke-direct {p0, v0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->shouldShowAreas(Lco/bird/android/model/constant/MapMode;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    const-string p2, "complete()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->rideMapStateManager:LpU4;

    invoke-interface {v0}, LpU4;->l()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/RideMapState;->RIDING:Lco/bird/android/model/RideMapState;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->isFirstAreaRequestSinceResume:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p2, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->isFirstAreaRequestSinceResume:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const-wide p2, 0x407f400000000000L    # 500.0

    :cond_1
    move-wide v2, p2

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->areaManager:Lbn;

    iget-object v4, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->mapMode:Lco/bird/android/model/constant/MapMode;

    const/4 v5, 0x1

    move-object v1, p1

    invoke-interface/range {v0 .. v5}, Lbn;->Z(Landroid/location/Location;DLco/bird/android/model/constant/MapMode;Z)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method private final loadOperatorAreas(Landroid/location/Location;DLjava/util/List;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Location;",
            "D",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->mapMode:Lco/bird/android/model/constant/MapMode;

    invoke-direct {p0, v0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->shouldShowAreas(Lco/bird/android/model/constant/MapMode;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    const-string p2, "complete()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->areaManager:Lbn;

    invoke-interface {v0, p1, p2, p3, p4}, Lbn;->m(Landroid/location/Location;DLjava/util/List;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->startRiderAreaUpdateStream$lambda$24(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->startOperatorAreaUpdateStream$lambda$28(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->listenForGpsUpdates$lambda$41(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private static final onResume$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$10(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireLocation;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/wire/WireLocation;

    return-object p0
.end method

.method private static final onResume$lambda$11(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method private static final onResume$lambda$12(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$13(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$14(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final onResume$lambda$15(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$16(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method private static final onResume$lambda$17(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$18(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Float;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    return-object p0
.end method

.method private static final onResume$lambda$19(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final onResume$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$20(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Float;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    return-object p0
.end method

.method private static final onResume$lambda$21(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$22(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$6(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final onResume$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final onResume$lambda$8(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onResume$lambda$9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->listenForAreaUpdates$lambda$50(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$16(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->startOperatorAreaUpdateStream$lambda$32(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->listenForAreaUpdates$lambda$52(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final shouldShowAreas(Lco/bird/android/model/constant/MapMode;)Z
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    if-eq p1, v0, :cond_1

    sget-object v0, Lco/bird/android/model/constant/MapMode;->OPERATOR:Lco/bird/android/model/constant/MapMode;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private final startLegacyAreaUpdateStream()V
    .locals 4

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "startLegacyAreaUpdateStream"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->legacyAreaRefreshObservable()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startLegacyAreaUpdateStream$1;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startLegacyAreaUpdateStream$1;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v2, LLK2;

    invoke-direct {v2, v1}, LLK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startLegacyAreaUpdateStream$2;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startLegacyAreaUpdateStream$2;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v2, LWK2;

    invoke-direct {v2, v1}, LWK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->switchMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "private fun startLegacyA\u2026scribe({}, Timber::e)\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->scopeProvider:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/CompletableSubscribeProxy;

    new-instance v1, LhL2;

    invoke-direct {v1}, LhL2;-><init>()V

    sget-object v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startLegacyAreaUpdateStream$4;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startLegacyAreaUpdateStream$4;

    new-instance v3, LsL2;

    invoke-direct {v3, v2}, LsL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v1, v3}, Lcom/uber/autodispose/CompletableSubscribeProxy;->e(Lio/reactivex/functions/a;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method private static final startLegacyAreaUpdateStream$lambda$33(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Triple;

    return-object p0
.end method

.method private static final startLegacyAreaUpdateStream$lambda$34(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method private static final startLegacyAreaUpdateStream$lambda$35()V
    .locals 0

    return-void
.end method

.method private static final startLegacyAreaUpdateStream$lambda$36(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final startOperatorAreaUpdateStream()V
    .locals 4

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "startOperatorAreaUpdateStream called"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->reactiveConfig:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$1;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$1;

    new-instance v2, LtL2;

    invoke-direct {v2, v1}, LtL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$2;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$2;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v2, LuL2;

    invoke-direct {v2, v1}, LuL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$3;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$3;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v2, LvL2;

    invoke-direct {v2, v1}, LvL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$4;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$4;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v2, LwL2;

    invoke-direct {v2, v1}, LwL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->switchMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "private fun startOperato\u2026scribe({}, Timber::e)\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->scopeProvider:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/CompletableSubscribeProxy;

    new-instance v1, LxL2;

    invoke-direct {v1}, LxL2;-><init>()V

    sget-object v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$6;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startOperatorAreaUpdateStream$6;

    new-instance v3, LyL2;

    invoke-direct {v3, v2}, LyL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v1, v3}, Lcom/uber/autodispose/CompletableSubscribeProxy;->e(Lio/reactivex/functions/a;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method private static final startOperatorAreaUpdateStream$lambda$27(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method

.method private static final startOperatorAreaUpdateStream$lambda$28(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method private static final startOperatorAreaUpdateStream$lambda$29(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Triple;

    return-object p0
.end method

.method private static final startOperatorAreaUpdateStream$lambda$30(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method private static final startOperatorAreaUpdateStream$lambda$31()V
    .locals 0

    return-void
.end method

.method private static final startOperatorAreaUpdateStream$lambda$32(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final startRiderAreaUpdateStream()V
    .locals 4

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "startRiderAreaUpdateStream"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->reactiveConfig:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startRiderAreaUpdateStream$1;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startRiderAreaUpdateStream$1;

    new-instance v2, LoL2;

    invoke-direct {v2, v1}, LoL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startRiderAreaUpdateStream$2;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startRiderAreaUpdateStream$2;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v2, LpL2;

    invoke-direct {v2, v1}, LpL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->switchMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "private fun startRiderAr\u2026scribe({}, Timber::e)\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->scopeProvider:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/CompletableSubscribeProxy;

    new-instance v1, LqL2;

    invoke-direct {v1}, LqL2;-><init>()V

    sget-object v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startRiderAreaUpdateStream$4;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$startRiderAreaUpdateStream$4;

    new-instance v3, LrL2;

    invoke-direct {v3, v2}, LrL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v1, v3}, Lcom/uber/autodispose/CompletableSubscribeProxy;->e(Lio/reactivex/functions/a;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method private static final startRiderAreaUpdateStream$lambda$23(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method private static final startRiderAreaUpdateStream$lambda$24(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method private static final startRiderAreaUpdateStream$lambda$25()V
    .locals 0

    return-void
.end method

.method private static final startRiderAreaUpdateStream$lambda$26(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->startOperatorAreaUpdateStream$lambda$29(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Triple;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireLocation;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$10(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireLocation;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->legacyAreaRefreshObservable$lambda$37(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$6(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic y(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->onResume$lambda$21(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic z()V
    .locals 0

    invoke-static {}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->startRiderAreaUpdateStream$lambda$25()V

    return-void
.end method


# virtual methods
.method public final getInvertedOperationalAreaPlaceholder()Lco/bird/android/model/persistence/Area;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->invertedOperationalAreaPlaceholder$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/Area;

    return-object v0
.end method

.method public final listenForAreaUpdates()V
    .locals 6

    sget-object v0, Lio/reactivex/rxkotlin/e;->a:Lio/reactivex/rxkotlin/e;

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->areaManager:Lbn;

    invoke-interface {v0}, Lbn;->r()LZ84;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$1;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$1;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v2, LBL2;

    invoke-direct {v2, v1}, LBL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "@VisibleForTesting\n  fun\u2026e triggers\")\n      })\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->filterAreasManager:LGl1;

    invoke-interface {v2}, LGl1;->c()LZ84;

    move-result-object v2

    invoke-virtual {v2}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v2

    const-string v3, "filterAreasManager.areaK\u2026er.distinctUntilChanged()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->rideManager:LYR4;

    invoke-interface {v3}, LYR4;->t0()Lio/reactivex/Observable;

    move-result-object v3

    iget-object v4, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->rideManager:LYR4;

    invoke-interface {v4}, LYR4;->o0()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/RideStates;

    invoke-virtual {v4}, Lco/bird/android/model/RideStates;->getActiveRideCount()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v3

    invoke-virtual {v3}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v3

    const-string v4, "rideManager.activeRideCo\u2026  .distinctUntilChanged()"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->rideMapStateManager:LpU4;

    invoke-interface {v4}, LpU4;->i()LZ84;

    move-result-object v4

    new-instance v5, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$$inlined$combineLatest$1;

    invoke-direct {v5, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$$inlined$combineLatest$1;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    invoke-static {v0, v2, v3, v4, v5}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/i;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "Observable.combineLatest\u2026nction(t1, t2, t3, t4) })"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->scopeProvider:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v3, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$3;

    invoke-direct {v3, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$3;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v4, LCL2;

    invoke-direct {v4, v3}, LCL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/MapUi;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/MapAreasUi;->setAreasCompleteChanges()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v3, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$4;

    invoke-direct {v3, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$4;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v4, LDL2;

    invoke-direct {v4, v3}, LDL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v3, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$5;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$5;

    new-instance v4, LEL2;

    invoke-direct {v4, v3}, LEL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v4}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->scopeProvider:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    invoke-interface {v0}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/MapUi;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/MapUi;->viewportChanged()Lio/reactivex/k;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$6;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$6;

    new-instance v3, LFL2;

    invoke-direct {v3, v1}, LFL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/k;->I(Lio/reactivex/functions/g;)Lio/reactivex/k;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/k;->J0()Lio/reactivex/k;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/k;->s0(Lio/reactivex/E;)Lio/reactivex/k;

    move-result-object v0

    const-string v1, "ui.viewportChanged()\n   \u2026dSchedulers.mainThread())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->scopeProvider:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/k;->f(Lio/reactivex/l;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/FlowableSubscribeProxy;

    new-instance v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$7;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$7;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v2, LGL2;

    invoke-direct {v2, v1}, LGL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$8;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$listenForAreaUpdates$8;

    new-instance v3, LMK2;

    invoke-direct {v3, v1}, LMK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2, v3}, Lcom/uber/autodispose/FlowableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final loadBlacklist(Landroid/location/Location;DLjava/util/List;)Lio/reactivex/c;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Location;",
            "D",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewport"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->mapMode:Lco/bird/android/model/constant/MapMode;

    invoke-direct {p0, v0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->shouldShowAreas(Lco/bird/android/model/constant/MapMode;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->mapMode:Lco/bird/android/model/constant/MapMode;

    sget-object v1, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    move v9, v2

    goto :goto_0

    :cond_0
    move v9, v3

    :goto_0
    const/4 v1, 0x2

    new-array v1, v1, [Lco/bird/android/model/constant/MapMode;

    sget-object v4, Lco/bird/android/model/constant/MapMode;->OPERATOR:Lco/bird/android/model/constant/MapMode;

    aput-object v4, v1, v3

    sget-object v4, Lco/bird/android/model/constant/MapMode;->SERVICE_CENTER:Lco/bird/android/model/constant/MapMode;

    aput-object v4, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lco/bird/android/model/BirdPaymentKt;->isOneOf(Ljava/lang/Object;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->areaManager:Lbn;

    invoke-interface {v0, p1, p2, p3, p4}, Lbn;->m(Landroid/location/Location;DLjava/util/List;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_1

    :cond_1
    iget-object p4, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->rideMapStateManager:LpU4;

    invoke-interface {p4}, LpU4;->l()LZ84;

    move-result-object p4

    invoke-virtual {p4}, LZ84;->a()Ljava/lang/Object;

    move-result-object p4

    sget-object v0, Lco/bird/android/model/RideMapState;->RIDING:Lco/bird/android/model/RideMapState;

    if-ne p4, v0, :cond_2

    iget-object p4, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->isFirstAreaRequestSinceResume:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p4

    if-eqz p4, :cond_2

    iget-object p2, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->isFirstAreaRequestSinceResume:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const-wide p2, 0x407f400000000000L    # 500.0

    :cond_2
    move-wide v6, p2

    iget-object v4, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->areaManager:Lbn;

    iget-object v8, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->mapMode:Lco/bird/android/model/constant/MapMode;

    move-object v5, p1

    invoke-interface/range {v4 .. v9}, Lbn;->Z(Landroid/location/Location;DLco/bird/android/model/constant/MapMode;Z)Lio/reactivex/c;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    const-string p2, "{\n      Completable.complete()\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p1
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onPause()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->sensorManager:Landroid/hardware/SensorManager;

    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->deepLinkManager:LhW0;

    invoke-interface {v0}, LhW0;->c()V

    return-void
.end method

.method public onResume(Lcom/uber/autodispose/ScopeProvider;)V
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "scopeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->reactiveConfig:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRiderMapConfig()Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->getEnableUserLocationV2()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->sensorManager:Landroid/hardware/SensorManager;

    iget-object v2, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->sensorOrientation:Landroid/hardware/Sensor;

    invoke-virtual {v0, p0, v2, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->listenForAreaUpdates()V

    invoke-direct {p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->listenForGpsUpdates()V

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->isFirstAreaRequestSinceResume:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->mapMode:Lco/bird/android/model/constant/MapMode;

    sget-object v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    invoke-direct {p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->startLegacyAreaUpdateStream()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->startRiderAreaUpdateStream()V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->startOperatorAreaUpdateStream()V

    :goto_0
    iget-boolean v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->moveLocation:Z

    iget-object v2, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->mapMode:Lco/bird/android/model/constant/MapMode;

    iget-object v3, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->reactiveConfig:LTq4;

    invoke-virtual {v3}, LTq4;->f8()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/Config;->getPricingUiConfig()Lco/bird/android/model/wire/configs/PricingUiConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/PricingUiConfig;->getEnabled()Z

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "moveLocation = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", mapMode = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", priceConfig = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->deepLinkManager:LhW0;

    invoke-interface {v0}, LhW0;->a()LoW0;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LoW0;->b()Z

    move-result v0

    if-ne v0, v1, :cond_3

    move v0, v1

    goto :goto_1

    :cond_3
    move v0, v2

    :goto_1
    iget-boolean v3, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->moveLocation:Z

    const/4 v4, 0x0

    const-string v5, "this.`as`(AutoDispose.autoDisposable(provider))"

    if-eqz v3, :cond_5

    iget-object v3, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->mapMode:Lco/bird/android/model/constant/MapMode;

    sget-object v6, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    if-ne v3, v6, :cond_4

    iget-object v3, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->reactiveConfig:LTq4;

    invoke-virtual {v3}, LTq4;->f8()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/Config;->getPricingUiConfig()Lco/bird/android/model/wire/configs/PricingUiConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/PricingUiConfig;->getEnabled()Z

    move-result v3

    if-nez v3, :cond_5

    if-nez v0, :cond_5

    :cond_4
    iget-object v3, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->locationManager:Ldr4;

    invoke-interface {v3}, Ldr4;->p()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "calling move to now with "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v6, v2, [Ljava/lang/Object;

    invoke-static {v3, v6}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/MapUi;

    iget-object v6, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->locationManager:Ldr4;

    invoke-interface {v6}, Ldr4;->p()LZ84;

    move-result-object v6

    invoke-virtual {v6}, LZ84;->a()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/location/Location;

    invoke-interface {v3, v6}, Lco/bird/android/app/feature/map/ui/MapUi;->moveTo(Landroid/location/Location;)V

    iget-object v3, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->locationManager:Ldr4;

    invoke-static {v3, v2, v1, v4}, Ldr4$a;->requestLocationOnce$default(Ldr4;ZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v1

    const-string v2, "locationManager.requestL\u2026dSchedulers.mainThread())"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$1;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$1;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v3, LNK2;

    invoke-direct {v3, v2}, LNK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$2;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$2;

    new-instance v4, LZK2;

    invoke-direct {v4, v2}, LZK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v1, v3, v4}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    goto :goto_2

    :cond_5
    iget-object v3, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->locationManager:Ldr4;

    invoke-static {v3, v2, v1, v4}, Ldr4$a;->requestLocationOnce$default(Ldr4;ZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    sget-object v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$3;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$3;

    new-instance v3, LdL2;

    invoke-direct {v3, v2}, LdL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v1

    const-string v2, "locationManager.requestL\u2026scribeOn(Schedulers.io())"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/uber/autodispose/SingleSubscribeProxy;

    invoke-interface {v1}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    :goto_2
    if-eqz v0, :cond_6

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->mapMode:Lco/bird/android/model/constant/MapMode;

    sget-object v1, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    if-eq v0, v1, :cond_6

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->deepLinkManager:LhW0;

    invoke-interface {v0}, LhW0;->c()V

    :cond_6
    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->locationManager:Ldr4;

    invoke-interface {v0}, Ldr4;->p()LZ84;

    move-result-object v0

    sget-object v1, Lio/reactivex/b;->f:Lio/reactivex/b;

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->toFlowable(Lio/reactivex/b;)Lio/reactivex/k;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/k;->s0(Lio/reactivex/E;)Lio/reactivex/k;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$4;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$4;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v2, LeL2;

    invoke-direct {v2, v1}, LeL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/k;->K(Lio/reactivex/functions/g;)Lio/reactivex/k;

    move-result-object v0

    const-string v1, "@SuppressLint(\"MissingPe\u2026updateLocationRotate)\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/k;->f(Lio/reactivex/l;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/FlowableSubscribeProxy;

    sget-object v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$5;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$5;

    new-instance v3, LfL2;

    invoke-direct {v3, v2}, LfL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$6;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$6;

    new-instance v4, LgL2;

    invoke-direct {v4, v2}, LgL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3, v4}, Lcom/uber/autodispose/FlowableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/MapUi;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/MapUi;->mapClicksLocation()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$7;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$7;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v3, LiL2;

    invoke-direct {v3, v2}, LiL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$8;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$8;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v3, LjL2;

    invoke-direct {v3, v2}, LjL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v0

    check-cast v6, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v9, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$9;

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/MapUi;

    invoke-direct {v9, v0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$9;-><init>(Ljava/lang/Object;)V

    sget-object v7, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$10;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$10;

    const/4 v8, 0x0

    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Lld5;->subscribeBy$default(Lcom/uber/autodispose/ObservableSubscribeProxy;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->reactiveConfig:LTq4;

    invoke-virtual {v0}, LTq4;->b4()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v2, "reactiveConfig.enableLoc\u2026dSchedulers.mainThread())"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$11;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$11;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v3, LkL2;

    invoke-direct {v3, v2}, LkL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/MapUi;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/MapUi;->mapLongClicks()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v2, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->reactiveConfig:LTq4;

    invoke-virtual {v2}, LTq4;->b4()Lio/reactivex/Observable;

    move-result-object v2

    invoke-static {v0, v2}, Lio/reactivex/rxkotlin/f;->a(Lio/reactivex/Observable;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$12;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$12;

    new-instance v3, LlL2;

    invoke-direct {v3, v2}, LlL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$13;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$13;

    new-instance v3, LOK2;

    invoke-direct {v3, v2}, LOK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$14;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$14;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v3, LPK2;

    invoke-direct {v3, v2}, LPK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$15;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$15;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v3, LQK2;

    invoke-direct {v3, v2}, LQK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$16;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$16;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v3, LRK2;

    invoke-direct {v3, v2}, LRK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/MapUi;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/MapUi;->myLocationLongClicks()Lio/reactivex/Observable;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v2, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->reactiveConfig:LTq4;

    invoke-virtual {v2}, LTq4;->b4()Lio/reactivex/Observable;

    move-result-object v2

    invoke-static {v0, v2}, Lio/reactivex/rxkotlin/f;->a(Lio/reactivex/Observable;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    if-eqz v0, :cond_7

    sget-object v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$17;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$17;

    new-instance v3, LSK2;

    invoke-direct {v3, v2}, LSK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    if-eqz v0, :cond_7

    new-instance v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$18;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$18;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v3, LTK2;

    invoke-direct {v3, v2}, LTK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    :cond_7
    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/MapUi;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/MapAreasUi;->hideInfoWindow()V

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/MapUi;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/MapUi;->myLocationClicks()Lio/reactivex/Observable;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$19;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$19;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v3, LUK2;

    invoke-direct {v3, v2}, LUK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->switchMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    if-eqz v0, :cond_8

    new-instance v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$20;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$20;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v3, LVK2;

    invoke-direct {v3, v2}, LVK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    :cond_8
    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->sensorEventRelay:Lma4;

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$21;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$21;

    new-instance v3, LXK2;

    invoke-direct {v3, v2}, LXK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$22;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$22;

    new-instance v3, LYK2;

    invoke-direct {v3, v2}, LYK2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$23;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$23;-><init>(Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;)V

    new-instance v3, LaL2;

    invoke-direct {v3, v2}, LaL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v2, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$24;->INSTANCE:Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$24;

    new-instance v3, LbL2;

    invoke-direct {v3, v2}, LbL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$25;

    iget-object v1, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->ui:Lco/bird/android/app/feature/map/ui/MapUi;

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl$onResume$25;-><init>(Ljava/lang/Object;)V

    new-instance v1, LcL2;

    invoke-direct {v1, v0}, LcL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;->sensorEventRelay:Lma4;

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    return-void
.end method
