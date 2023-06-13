.class public interface abstract LG95;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/ui/MapBirdUi;
.implements Lco/bird/android/app/feature/map/ui/MapParkingUi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG95$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008f\u0018\u00002\u00020\u00012\u00020\u0002J\u001c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0008\u001a\u00020\u00072\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H&J@\u0010\u0013\u001a\u00020\n2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH&J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004H&J\u001c\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00042\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&J\u0016\u0010\u001b\u001a\u00020\n2\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0019H&J\u0016\u0010\u001c\u001a\u00020\n2\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0019H&J\u0008\u0010\u001d\u001a\u00020\nH&J\u001c\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H&\u00a8\u0006 "
    }
    d2 = {
        "LG95;",
        "Lco/bird/android/app/feature/map/ui/MapBirdUi;",
        "Lco/bird/android/app/feature/map/ui/MapParkingUi;",
        "",
        "Lco/bird/android/model/wire/WireBird;",
        "allBirds",
        "ei",
        "Landroid/location/Location;",
        "location",
        "birds",
        "",
        "Xg",
        "focusedBird",
        "",
        "rideStarted",
        "",
        "",
        "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;",
        "markerStates",
        "C4",
        "bird",
        "Ea",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "latLng",
        "wg",
        "Lco/bird/android/app/feature/map/modelmanager/Filter;",
        "filter",
        "w1",
        "z0",
        "showInfoWindow",
        "mapMarkerState",
        "x3",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract C4(Ljava/util/List;Lco/bird/android/model/wire/WireBird;ZLjava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;",
            "Lco/bird/android/model/wire/WireBird;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract Ea(Lco/bird/android/model/wire/WireBird;)V
.end method

.method public abstract Xg(Landroid/location/Location;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Location;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract ei(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation
.end method

.method public abstract showInfoWindow()V
.end method

.method public abstract w1(Lco/bird/android/app/feature/map/modelmanager/Filter;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/modelmanager/Filter<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract wg(Lco/bird/android/model/wire/WireBird;Lcom/google/android/gms/maps/model/LatLng;)V
.end method

.method public abstract x3(Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;Lco/bird/android/model/wire/WireBird;)V
.end method

.method public abstract z0(Lco/bird/android/app/feature/map/modelmanager/Filter;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/modelmanager/Filter<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)V"
        }
    .end annotation
.end method
