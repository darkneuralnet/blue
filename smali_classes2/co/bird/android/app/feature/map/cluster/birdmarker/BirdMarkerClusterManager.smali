.class public final Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;
.super Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager<",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001BS\u0008\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020\'\u0012\u0008\u0008\u0001\u0010*\u001a\u00020)\u0012\u0008\u0008\u0001\u0010,\u001a\u00020+\u0012\u0008\u0008\u0001\u0010.\u001a\u00020-\u0012\u0008\u0008\u0001\u00100\u001a\u00020/\u0012\u0008\u0008\u0001\u00102\u001a\u000201\u00a2\u0006\u0004\u00083\u00104J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0008*\u00020\u0002H\u0016J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\r2\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00080\u0012H\u0016J\"\u0010\u0018\u001a\u00020\u000b2\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b0\u0016H\u0016R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR \u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\u00a8\u00065"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;",
        "Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        "marker",
        "",
        "markerId",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "markerPosition",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
        "markerClusterItem",
        "bird",
        "",
        "reset",
        "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;",
        "state",
        "setInRide",
        "mapMarkerState",
        "setMapMarkerState",
        "LDl0;",
        "cluster",
        "",
        "onClusterClick",
        "Lkotlin/Function2;",
        "listener",
        "setOnClusterItemClickListener",
        "Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;",
        "renderer",
        "Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;",
        "getRenderer",
        "()Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;",
        "Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;",
        "markerOverrides",
        "Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;",
        "getMarkerOverrides",
        "()Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;",
        "LTq4;",
        "reactiveConfig",
        "Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;",
        "fleetMarkerProvider",
        "Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRendererFactory;",
        "rendererFactory",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "LBK2;",
        "markerOverridesManager",
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "reactiveMapEvent",
        "LcD1;",
        "map",
        "Lco/bird/android/model/constant/MapMode;",
        "mode",
        "<init>",
        "(LTq4;Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRendererFactory;Lco/bird/android/core/mvp/BaseActivity;LBK2;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LcD1;Lco/bird/android/model/constant/MapMode;)V",
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
        "SMAP\nBirdMarkerClusterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"
    }
.end annotation


# instance fields
.field private final markerOverrides:Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;"
        }
    .end annotation
.end field

.field private final renderer:Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;


# direct methods
.method public constructor <init>(LTq4;Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRendererFactory;Lco/bird/android/core/mvp/BaseActivity;LBK2;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LcD1;Lco/bird/android/model/constant/MapMode;)V
    .locals 7

    const-string v0, "reactiveConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fleetMarkerProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rendererFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markerOverridesManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveMapEvent"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p4

    move-object v3, p5

    move-object v4, p6

    move-object v5, p7

    move-object v6, p8

    invoke-direct/range {v0 .. v6}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;-><init>(LTq4;Lco/bird/android/core/mvp/BaseActivity;LBK2;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LcD1;Lco/bird/android/model/constant/MapMode;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getClusterManager()LGl0;

    move-result-object p1

    invoke-interface {p3, p7, p1, p2}, Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRendererFactory;->create(LcD1;LGl0;Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;)Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;->renderer:Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;

    new-instance p1, Lco/bird/android/app/feature/map/cluster/birdmarker/UnreadyMarkerOverrideBirdMarkers;

    invoke-direct {p1, p5}, Lco/bird/android/app/feature/map/cluster/birdmarker/UnreadyMarkerOverrideBirdMarkers;-><init>(LBK2;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;->markerOverrides:Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;

    invoke-virtual {p4}, Lco/bird/android/core/mvp/BaseActivity;->Q()LJy;

    move-result-object p1

    sget-object p2, LJy;->c:LJy;

    if-ne p1, p2, :cond_0

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->init()V

    :cond_0
    return-void
.end method

.method public static synthetic e(Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;Lkotlin/jvm/functions/Function2;Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;->setOnClusterItemClickListener$lambda$1(Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;Lkotlin/jvm/functions/Function2;Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Z

    move-result p0

    return p0
.end method

.method private static final setOnClusterItemClickListener$lambda$1(Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;Lkotlin/jvm/functions/Function2;Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Z
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getClusterManager()LGl0;

    move-result-object v0

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, v0, p2}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->get(LGl0;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->isSelected()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->setClickedMarker(Ljava/lang/Object;)V

    :cond_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public getMarkerOverrides()Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;->markerOverrides:Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;

    return-object v0
.end method

.method public bridge synthetic getRenderer()LEW0;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;->getRenderer()Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;

    move-result-object v0

    return-object v0
.end method

.method public getRenderer()Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;->renderer:Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;

    return-object v0
.end method

.method public markerClusterItem(Lco/bird/android/model/persistence/BirdMapMarker;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ")",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterItem;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p1, v1, v2, v1}, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterItem;-><init>(Lco/bird/android/model/persistence/BirdMapMarker;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic markerClusterItem(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;->markerClusterItem(Lco/bird/android/model/persistence/BirdMapMarker;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    move-result-object p1

    return-object p1
.end method

.method public markerId(Lco/bird/android/model/persistence/BirdMapMarker;)Ljava/lang/String;
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdMapMarker;->getId()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic markerId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;->markerId(Lco/bird/android/model/persistence/BirdMapMarker;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public markerPosition(Lco/bird/android/model/persistence/BirdMapMarker;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdMapMarker;->getLocation()Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object p1

    invoke-static {p1}, LUB1;->b(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic markerPosition(Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;->markerPosition(Lco/bird/android/model/persistence/BirdMapMarker;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    return-object p1
.end method

.method public onClusterClick(LDl0;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDl0<",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;>;)Z"
        }
    .end annotation

    const-string v0, "cluster"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/maps/model/LatLngBounds;->s()Lcom/google/android/gms/maps/model/LatLngBounds$a;

    move-result-object v0

    const-string v1, "builder()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LDl0;->b()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    invoke-virtual {v1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->b(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$a;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->a()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object p1

    const-string v0, "builder.build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getMap()LcD1;

    move-result-object v0

    const/16 v1, 0x64

    invoke-static {p1, v1}, Lrc0;->c(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lqc0;

    move-result-object p1

    invoke-virtual {v0, p1}, LcD1;->f(Lqc0;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Error in onClusterClick while attempting to animate map"

    invoke-static {p1, v1, v0}, Lg46;->f(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public reset(Lco/bird/android/model/persistence/BirdMapMarker;)V
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "reset called in BirdMarkerClusterManager but not yet implemented. This is not a true error as this manager should only be used in the operator map currently but we will emit in logs in case it gets called in the future before being implemented."

    invoke-static {v0, p1}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic reset(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;->reset(Lco/bird/android/model/persistence/BirdMapMarker;)V

    return-void
.end method

.method public setInRide(Lco/bird/android/model/persistence/BirdMapMarker;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V
    .locals 0

    const-string p2, "bird"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "setInRide called in BirdMarkerClusterManager but not yet implemented. This is not a true error as this manager should only be used in the operator map currently but we will emit in logs in case it gets called in the future before being implemented."

    invoke-static {p2, p1}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic setInRide(Ljava/lang/Object;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;->setInRide(Lco/bird/android/model/persistence/BirdMapMarker;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V

    return-void
.end method

.method public setMapMarkerState(Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;Lco/bird/android/model/persistence/BirdMapMarker;)V
    .locals 0

    const-string p2, "mapMarkerState"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "setMapMarkerState called in BirdMarkerClusterManager but not yet implemented. This is not a true error as this manager should only be used in the operator map currently but we will emit in logs in case it gets called in the future before being implemented."

    invoke-static {p2, p1}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic setMapMarkerState(Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;->setMapMarkerState(Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;Lco/bird/android/model/persistence/BirdMapMarker;)V

    return-void
.end method

.method public setOnClusterItemClickListener(Lkotlin/jvm/functions/Function2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getClusterManager()LGl0;

    move-result-object v0

    new-instance v1, LMM;

    invoke-direct {v1, p0, p1}, LMM;-><init>(Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManager;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v0, v1}, LGl0;->s(LGl0$d;)V

    return-void
.end method
