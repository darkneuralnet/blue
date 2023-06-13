.class public final Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;
.super Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem<",
        "Lco/bird/android/model/persistence/BountyMapMarker;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0016J\u0008\u0010\u0015\u001a\u00020\u0016H\u0016J\u0008\u0010\u0017\u001a\u00020\u000cH\u0016J\u0008\u0010\u0018\u001a\u00020\u000cH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u000cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0019"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;",
        "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;",
        "Lco/bird/android/model/persistence/BountyMapMarker;",
        "marker",
        "(Lco/bird/android/model/persistence/BountyMapMarker;)V",
        "id",
        "",
        "getId",
        "()Ljava/lang/String;",
        "getMarker",
        "()Lco/bird/android/model/persistence/BountyMapMarker;",
        "selected",
        "",
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
.field private final id:Ljava/lang/String;

.field private final marker:Lco/bird/android/model/persistence/BountyMapMarker;

.field private selected:Z


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/BountyMapMarker;)V
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->marker:Lco/bird/android/model/persistence/BountyMapMarker;

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/BountyMapMarker;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BountyMapMarker;->getId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->id:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getMarker()Lco/bird/android/model/persistence/BountyMapMarker;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->marker:Lco/bird/android/model/persistence/BountyMapMarker;

    return-object v0
.end method

.method public bridge synthetic getMarker()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/BountyMapMarker;

    move-result-object v0

    return-object v0
.end method

.method public getPosition()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->getMarker()Lco/bird/android/model/persistence/BountyMapMarker;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BountyMapMarker;->getLocation()Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v0

    invoke-static {v0}, LUB1;->b(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    return-object v0
.end method

.method public getSelected()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->selected:Z

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
    .locals 1

    const/high16 v0, 0x42500000    # 52.0f

    return v0
.end method

.method public isSelected()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setSelected(Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterItem;->selected:Z

    return-void
.end method

.method public shouldCluster()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
