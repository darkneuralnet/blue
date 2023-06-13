.class public final Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManager;
.super Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager<",
        "Lco/bird/android/model/persistence/WarehouseMarker;",
        "Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0014J\u000c\u0010\t\u001a\u00020\u0008*\u00020\u0002H\u0014J\u000c\u0010\u000b\u001a\u00020\n*\u00020\u0002H\u0014R\u001a\u0010\r\u001a\u00020\u000c8\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001b"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManager;",
        "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;",
        "Lco/bird/android/model/persistence/WarehouseMarker;",
        "Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;",
        "marker",
        "newMarker",
        "existingClusterItem",
        "updateMarker",
        "",
        "id",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "latLng",
        "Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;",
        "renderer",
        "Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;",
        "getRenderer",
        "()Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "LcD1;",
        "map",
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "reactiveMapEvent",
        "Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRendererFactory;",
        "rendererFactory",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRendererFactory;)V",
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
.field private final renderer:Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRendererFactory;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveMapEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rendererFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;-><init>(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->getClusterManager()LGl0;

    move-result-object p1

    invoke-interface {p4, p1, p2}, Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRendererFactory;->create(LGl0;LcD1;)Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManager;->renderer:Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->init()V

    return-void
.end method


# virtual methods
.method public bridge synthetic getRenderer()Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManager;->getRenderer()Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;

    move-result-object v0

    return-object v0
.end method

.method public getRenderer()Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManager;->renderer:Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;

    return-object v0
.end method

.method public id(Lco/bird/android/model/persistence/WarehouseMarker;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/WarehouseMarker;->getId()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic id(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/WarehouseMarker;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManager;->id(Lco/bird/android/model/persistence/WarehouseMarker;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public latLng(Lco/bird/android/model/persistence/WarehouseMarker;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/WarehouseMarker;->getLocation()Lco/bird/android/model/Point;

    move-result-object p1

    invoke-static {p1}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->toLatLng(Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic latLng(Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/WarehouseMarker;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManager;->latLng(Lco/bird/android/model/persistence/WarehouseMarker;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newMarker(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/WarehouseMarker;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManager;->newMarker(Lco/bird/android/model/persistence/WarehouseMarker;)Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;

    move-result-object p1

    return-object p1
.end method

.method public newMarker(Lco/bird/android/model/persistence/WarehouseMarker;)Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;
    .locals 4

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p1, v3, v1, v2}, Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;-><init>(Lco/bird/android/model/persistence/WarehouseMarker;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic updateMarker(Ljava/lang/Object;Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/WarehouseMarker;

    check-cast p2, Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManager;->updateMarker(Lco/bird/android/model/persistence/WarehouseMarker;Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;)Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;

    move-result-object p1

    return-object p1
.end method

.method public updateMarker(Lco/bird/android/model/persistence/WarehouseMarker;Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;)Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "existingClusterItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;->getSelected()Z

    move-result p2

    invoke-direct {v0, p1, p2}, Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;-><init>(Lco/bird/android/model/persistence/WarehouseMarker;Z)V

    return-object v0
.end method
