.class public final Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItem;
.super Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
        "Lco/bird/android/model/wire/WireBird;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016J\u0008\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItem;",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "state",
        "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;",
        "(Lco/bird/android/model/wire/WireBird;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V",
        "getZIndex",
        "",
        "shouldCluster",
        "",
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


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V
    .locals 6

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireLocation;->getLatitude()D

    move-result-wide v2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireLocation;->getLongitude()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-direct {p0, v0, p1, p2, v1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;-><init>(Ljava/lang/String;Ljava/lang/Object;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->AVAILABLE:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    :cond_0
    invoke-direct {p0, p1, p2}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItem;-><init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V

    return-void
.end method


# virtual methods
.method public getZIndex()F
    .locals 4

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getBrandName()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    move-object v0, v1

    :cond_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_2

    const-string v1, "Bird"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v3

    :goto_1
    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getPrivateBird()Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object v1

    if-eqz v1, :cond_3

    move v2, v3

    :cond_3
    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->isScanlessRideEligible()Z

    move-result v1

    if-eqz v2, :cond_4

    const/high16 v0, 0x42c60000    # 99.0f

    goto :goto_2

    :cond_4
    if-eqz v1, :cond_5

    const/high16 v0, 0x425c0000    # 55.0f

    goto :goto_2

    :cond_5
    if-eqz v0, :cond_6

    const/high16 v0, 0x42480000    # 50.0f

    goto :goto_2

    :cond_6
    const/high16 v0, 0x42440000    # 49.0f

    :goto_2
    return v0
.end method

.method public shouldCluster()Z
    .locals 2

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getPrivateBird()Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getState()Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->AVAILABLE:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
