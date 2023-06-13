.class public final Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterItem;
.super Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterItem;",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        "birdMarker",
        "state",
        "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;",
        "(Lco/bird/android/model/persistence/BirdMapMarker;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V",
        "getZIndex",
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
.method public constructor <init>(Lco/bird/android/model/persistence/BirdMapMarker;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V
    .locals 2

    const-string v0, "birdMarker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdMapMarker;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdMapMarker;->getLocation()Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v1

    invoke-static {v1}, LUB1;->b(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-direct {p0, v0, p1, p2, v1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;-><init>(Ljava/lang/String;Ljava/lang/Object;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/persistence/BirdMapMarker;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->AVAILABLE:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    :cond_0
    invoke-direct {p0, p1, p2}, Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterItem;-><init>(Lco/bird/android/model/persistence/BirdMapMarker;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V

    return-void
.end method


# virtual methods
.method public getZIndex()F
    .locals 2

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/FleetMarker;->getProminence()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x42480000    # 50.0f

    sub-float/2addr v1, v0

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x64

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    int-to-float v0, v0

    add-float/2addr v1, v0

    return v1
.end method
