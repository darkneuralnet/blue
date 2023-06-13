.class public final Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;
.super Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem<",
        "Lco/bird/android/model/persistence/ZoneMarker;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0008H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0008H\u0016J\u0008\u0010\u0015\u001a\u00020\u0016H\u0016J\u0008\u0010\u0017\u001a\u00020\u0005H\u0016J\u0008\u0010\u0018\u001a\u00020\u0005H\u0016R\u0014\u0010\u0007\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0019"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;",
        "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;",
        "Lco/bird/android/model/persistence/ZoneMarker;",
        "marker",
        "selected",
        "",
        "(Lco/bird/android/model/persistence/ZoneMarker;Z)V",
        "id",
        "",
        "getId",
        "()Ljava/lang/String;",
        "getMarker",
        "()Lco/bird/android/model/persistence/ZoneMarker;",
        "getSelected",
        "()Z",
        "setSelected",
        "(Z)V",
        "getPosition",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "getSnippet",
        "getTitle",
        "getZIndex",
        "",
        "isSelected",
        "shouldCluster",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final marker:Lco/bird/android/model/persistence/ZoneMarker;

.field private selected:Z


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/ZoneMarker;Z)V
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->marker:Lco/bird/android/model/persistence/ZoneMarker;

    iput-boolean p2, p0, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->selected:Z

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/persistence/ZoneMarker;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;-><init>(Lco/bird/android/model/persistence/ZoneMarker;Z)V

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMarker()Lco/bird/android/model/persistence/ZoneMarker;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->marker:Lco/bird/android/model/persistence/ZoneMarker;

    return-object v0
.end method

.method public bridge synthetic getMarker()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object v0

    return-object v0
.end method

.method public getPosition()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/ZoneMarker;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/ZoneMarker;->getCenterPoint()Lco/bird/android/model/Point;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->toLatLng(Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    return-object v0
.end method

.method public getSelected()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->selected:Z

    return v0
.end method

.method public getSnippet()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getZIndex()F
    .locals 2

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getSelected()Z

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x424c0000    # 51.0f

    add-float/2addr v0, v1

    return v0
.end method

.method public isSelected()Z
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->getSelected()Z

    move-result v0

    return v0
.end method

.method public setSelected(Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;->selected:Z

    return-void
.end method

.method public shouldCluster()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
