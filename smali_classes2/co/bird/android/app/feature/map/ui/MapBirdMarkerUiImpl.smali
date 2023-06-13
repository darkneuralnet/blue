.class public Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;
.super Lco/bird/android/app/feature/map/ui/MapUiImpl;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/ui/MapBirdMarkerUi;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0083\u0001\u0012\u0006\u0010\'\u001a\u00020&\u0012\u0008\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0008\u00107\u001a\u0004\u0018\u000106\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010:\u001a\u00020\u000c\u0012\u0006\u0010;\u001a\u00020\u000c\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010A\u001a\u00020@\u00a2\u0006\u0004\u0008B\u0010CJ\u0018\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001a\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\n0\tH\u0016J\u000e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\tH\u0016J\u0016\u0010\u0011\u001a\u00020\u00072\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0008\u0010\u001a\u001a\u00020\u0007H\u0016R:\u0010\u001d\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c \u001c*\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c\u0018\u00010\n0\n0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\"\u0010\u001f\u001a\u0010\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010\u000b0\u000b0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006D"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;",
        "Lco/bird/android/app/feature/map/ui/MapUiImpl;",
        "Lco/bird/android/app/feature/map/ui/MapBirdMarkerUi;",
        "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
        "location",
        "",
        "zoomLevel",
        "",
        "zoomTo",
        "Lio/reactivex/Observable;",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        "",
        "birdMarkerClicks",
        "birdMarkerInfoItemClicks",
        "",
        "birdMarkers",
        "setBirdMarkers",
        "birdMarker",
        "select",
        "deselect",
        "Lco/bird/android/model/Route;",
        "route",
        "drawRouteAndZoom",
        "removeBirdMarker",
        "zoomToMaxLevel",
        "clearBirdMarkers",
        "Lio/reactivex/subjects/d;",
        "kotlin.jvm.PlatformType",
        "birdMarkerClusterItemClicks",
        "Lio/reactivex/subjects/d;",
        "birdMapMarkerInfoItemClicks",
        "Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;",
        "birdMarkerClusterManager",
        "Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;",
        "Lco/bird/android/app/feature/map/modelmanager/BirdMarkerModelManager;",
        "birdMarkerModelManager",
        "Lco/bird/android/app/feature/map/modelmanager/BirdMarkerModelManager;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "Lcom/google/android/gms/maps/model/CameraPosition;",
        "initialCameraPosition",
        "Li66;",
        "traceProvider",
        "LTq4;",
        "reactiveConfig",
        "LOh;",
        "appBuildConfig",
        "LcD1;",
        "map",
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "reactiveMapEvent",
        "Lcom/google/android/gms/maps/MapView;",
        "mapView",
        "Landroid/view/View;",
        "myLocationButton",
        "Lco/bird/android/model/constant/MapMode;",
        "mode",
        "drawUserLocation",
        "userDirectionalArrow",
        "LBK2;",
        "markerOverridesManager",
        "Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory;",
        "birdMarkerClusterManagerFactory",
        "Ldr4;",
        "locationManager",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;Li66;LTq4;LOh;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;Lco/bird/android/model/constant/MapMode;ZZLBK2;Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory;Ldr4;)V",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final birdMapMarkerInfoItemClicks:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;"
        }
    .end annotation
.end field

.field private final birdMarkerClusterItemClicks:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field private final birdMarkerClusterManager:Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;

.field private final birdMarkerModelManager:Lco/bird/android/app/feature/map/modelmanager/BirdMarkerModelManager;


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;Li66;LTq4;LOh;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;Lco/bird/android/model/constant/MapMode;ZZLBK2;Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory;Ldr4;)V
    .locals 16

    move-object/from16 v14, p0

    move-object/from16 v15, p3

    const-string v0, "activity"

    move-object/from16 v13, p1

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "traceProvider"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appBuildConfig"

    move-object/from16 v5, p5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    move-object/from16 v12, p6

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveMapEvent"

    move-object/from16 v11, p7

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapView"

    move-object/from16 v8, p8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    move-object/from16 v10, p10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markerOverridesManager"

    move-object/from16 v9, p13

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdMarkerClusterManagerFactory"

    move-object/from16 v7, p14

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationManager"

    move-object/from16 v6, p15

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v9, p9

    move/from16 v11, p11

    move/from16 v12, p12

    move-object/from16 v13, p15

    invoke-direct/range {v0 .. v13}, Lco/bird/android/app/feature/map/ui/MapUiImpl;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;Li66;LTq4;LOh;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;Lco/bird/android/model/constant/MapMode;ZZLdr4;)V

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<Pair<BirdMapMarker, Boolean>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v14, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;->birdMarkerClusterItemClicks:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v0

    const-string v1, "create<BirdMapMarker>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v14, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;->birdMapMarkerInfoItemClicks:Lio/reactivex/subjects/d;

    move-object/from16 v1, p14

    move-object/from16 v2, p1

    move-object/from16 v3, p13

    move-object/from16 v4, p7

    move-object/from16 v5, p6

    move-object/from16 v6, p10

    invoke-interface/range {v1 .. v6}, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory;->create(Lco/bird/android/core/mvp/BaseActivity;LBK2;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LcD1;Lco/bird/android/model/constant/MapMode;)Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;

    move-result-object v1

    iput-object v1, v14, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;->birdMarkerClusterManager:Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;

    new-instance v2, Lco/bird/android/app/feature/map/modelmanager/BirdMarkerModelManager;

    new-instance v3, Lco/bird/android/app/feature/map/ui/renderer/BirdMarkerRenderer;

    invoke-direct {v3, v1}, Lco/bird/android/app/feature/map/ui/renderer/BirdMarkerRenderer;-><init>(Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;)V

    invoke-direct {v2, v3, v15}, Lco/bird/android/app/feature/map/modelmanager/BirdMarkerModelManager;-><init>(Lco/bird/android/app/feature/map/ui/renderer/BirdMarkerRenderer;Li66;)V

    iput-object v2, v14, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;->birdMarkerModelManager:Lco/bird/android/app/feature/map/modelmanager/BirdMarkerModelManager;

    new-instance v2, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl$1;

    invoke-direct {v2, v14}, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl$1;-><init>(Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;)V

    invoke-virtual {v1, v2}, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;->setOnClusterItemClickListener(Lkotlin/jvm/functions/Function2;)V

    new-instance v2, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl$2;

    invoke-direct {v2, v0}, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl$2;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->setOnMarkerInfoItemClick(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$getBirdMarkerClusterItemClicks$p(Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;->birdMarkerClusterItemClicks:Lio/reactivex/subjects/d;

    return-object p0
.end method

.method private final zoomTo(Lco/bird/android/model/persistence/nestedstructures/Geolocation;F)V
    .locals 5

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->getLongitude()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getMap()LcD1;

    move-result-object p1

    invoke-static {v0, p2}, Lrc0;->e(Lcom/google/android/gms/maps/model/LatLng;F)Lqc0;

    move-result-object p2

    invoke-virtual {p1, p2}, LcD1;->f(Lqc0;)V

    return-void
.end method


# virtual methods
.method public birdMarkerClicks()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;->birdMarkerClusterItemClicks:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "birdMarkerClusterItemClicks.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public birdMarkerInfoItemClicks()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;->birdMapMarkerInfoItemClicks:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "birdMapMarkerInfoItemClicks.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public clearBirdMarkers()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;->birdMarkerModelManager:Lco/bird/android/app/feature/map/modelmanager/BirdMarkerModelManager;

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->clearItems()V

    return-void
.end method

.method public deselect(Lco/bird/android/model/persistence/BirdMapMarker;)V
    .locals 1

    const-string v0, "birdMarker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;->birdMarkerClusterManager:Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->deselect(Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;->birdMarkerClusterManager:Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->closeInfoWindow(Ljava/lang/Object;)V

    return-void
.end method

.method public drawRouteAndZoom(Lco/bird/android/model/Route;Lco/bird/android/model/persistence/BirdMapMarker;)V
    .locals 1

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdMarker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/BirdMapMarker;->getLocation()Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object p2

    invoke-static {p2}, LUB1;->b(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->drawRouteAndZoom(Lco/bird/android/model/Route;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public removeBirdMarker(Lco/bird/android/model/persistence/BirdMapMarker;)V
    .locals 1

    const-string v0, "birdMarker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;->birdMarkerModelManager:Lco/bird/android/app/feature/map/modelmanager/BirdMarkerModelManager;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->removeItem(Ljava/lang/Object;)V

    return-void
.end method

.method public select(Lco/bird/android/model/persistence/BirdMapMarker;)V
    .locals 1

    const-string v0, "birdMarker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;->birdMarkerClusterManager:Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->select(Ljava/lang/Object;)V

    return-void
.end method

.method public setBirdMarkers(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;)V"
        }
    .end annotation

    const-string v0, "birdMarkers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;->birdMarkerModelManager:Lco/bird/android/app/feature/map/modelmanager/BirdMarkerModelManager;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/map/modelmanager/AbstractModelManager;->setItems(Ljava/util/List;)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;->birdMarkerClusterManager:Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->animateMarkers()V

    return-void
.end method

.method public zoomToMaxLevel(Lco/bird/android/model/persistence/BirdMapMarker;)V
    .locals 1

    const-string v0, "birdMarker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdMapMarker;->getLocation()Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getMap()LcD1;

    move-result-object v0

    invoke-virtual {v0}, LcD1;->j()F

    move-result v0

    invoke-direct {p0, p1, v0}, Lco/bird/android/app/feature/map/ui/MapBirdMarkerUiImpl;->zoomTo(Lco/bird/android/model/persistence/nestedstructures/Geolocation;F)V

    return-void
.end method
