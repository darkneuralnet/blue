.class public final Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManager;
.super Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager<",
        "Lco/bird/android/model/persistence/ZoneMarker;",
        "Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0014J\u000c\u0010\t\u001a\u00020\u0008*\u00020\u0002H\u0014J\u000c\u0010\u000b\u001a\u00020\n*\u00020\u0002H\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000cH\u0014R\u001a\u0010\u0010\u001a\u00020\u000f8\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001e"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManager;",
        "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;",
        "Lco/bird/android/model/persistence/ZoneMarker;",
        "Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;",
        "marker",
        "newMarker",
        "existingClusterItem",
        "updateMarker",
        "",
        "id",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "latLng",
        "LfM2;",
        "",
        "filterClickable",
        "Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;",
        "renderer",
        "Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;",
        "getRenderer",
        "()Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "LcD1;",
        "map",
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "reactiveMapEvent",
        "Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererFactory;",
        "rendererFactory",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererFactory;)V",
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
.field private final renderer:Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererFactory;)V
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

    invoke-interface {p4, p1, p2}, Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRendererFactory;->create(LGl0;LcD1;)Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManager;->renderer:Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->init()V

    return-void
.end method


# virtual methods
.method public filterClickable(LfM2;)Z
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManager;->getRenderer()Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;

    move-result-object v0

    invoke-virtual {v0, p1}, LEW0;->getClusterItem(LfM2;)LEl0;

    move-result-object p1

    check-cast p1, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/ZoneMarker;->getSelectability()Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    sget-object v0, Lco/bird/android/model/constant/OperatorMapZoneSelectability;->SELECTABLE_ANNOTATION:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public bridge synthetic getRenderer()Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManager;->getRenderer()Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;

    move-result-object v0

    return-object v0
.end method

.method public getRenderer()Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManager;->renderer:Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;

    return-object v0
.end method

.method public id(Lco/bird/android/model/persistence/ZoneMarker;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneId()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic id(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/ZoneMarker;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManager;->id(Lco/bird/android/model/persistence/ZoneMarker;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public latLng(Lco/bird/android/model/persistence/ZoneMarker;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/ZoneMarker;->getCenterPoint()Lco/bird/android/model/Point;

    move-result-object p1

    invoke-static {p1}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->toLatLng(Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic latLng(Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/ZoneMarker;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManager;->latLng(Lco/bird/android/model/persistence/ZoneMarker;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newMarker(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/ZoneMarker;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManager;->newMarker(Lco/bird/android/model/persistence/ZoneMarker;)Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;

    move-result-object p1

    return-object p1
.end method

.method public newMarker(Lco/bird/android/model/persistence/ZoneMarker;)Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;
    .locals 4

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p1, v3, v1, v2}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;-><init>(Lco/bird/android/model/persistence/ZoneMarker;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic updateMarker(Ljava/lang/Object;Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/ZoneMarker;

    check-cast p2, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManager;->updateMarker(Lco/bird/android/model/persistence/ZoneMarker;Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;)Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;

    move-result-object p1

    return-object p1
.end method

.method public updateMarker(Lco/bird/android/model/persistence/ZoneMarker;Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;)Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "existingClusterItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;

    invoke-virtual {p2}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getSelected()Z

    move-result p2

    invoke-direct {v0, p1, p2}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;-><init>(Lco/bird/android/model/persistence/ZoneMarker;Z)V

    return-object v0
.end method
