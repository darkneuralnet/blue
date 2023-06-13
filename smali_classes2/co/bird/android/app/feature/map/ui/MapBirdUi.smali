.class public interface abstract Lco/bird/android/app/feature/map/ui/MapBirdUi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/ui/MapUi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/ui/MapBirdUi$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007H&J\u001a\u0010\u0008\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t0\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0011\u001a\u00020\u00032\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0013H&J&\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\nH&J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H&\u00a8\u0006\u001a"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/MapBirdUi;",
        "Lco/bird/android/app/feature/map/ui/MapUi;",
        "addBird",
        "",
        "bird",
        "Lco/bird/android/model/wire/WireBird;",
        "birdInfoItemClicks",
        "Lio/reactivex/Observable;",
        "birdItemClicks",
        "Lkotlin/Pair;",
        "",
        "deselect",
        "drawRouteAndZoom",
        "route",
        "Lco/bird/android/model/Route;",
        "removeBird",
        "select",
        "setBirds",
        "birds",
        "",
        "zoomTo",
        "userLocation",
        "Landroid/location/Location;",
        "useLargeZoomPadding",
        "zoomLevel",
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


# virtual methods
.method public abstract addBird(Lco/bird/android/model/wire/WireBird;)V
.end method

.method public abstract birdInfoItemClicks()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation
.end method

.method public abstract birdItemClicks()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireBird;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract deselect(Lco/bird/android/model/wire/WireBird;)V
.end method

.method public abstract drawRouteAndZoom(Lco/bird/android/model/Route;Lco/bird/android/model/wire/WireBird;)V
.end method

.method public abstract removeBird(Lco/bird/android/model/wire/WireBird;)V
.end method

.method public abstract select(Lco/bird/android/model/wire/WireBird;)V
.end method

.method public abstract setBirds(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract zoomTo(Lco/bird/android/model/wire/WireBird;F)V
.end method

.method public abstract zoomTo(Lco/bird/android/model/wire/WireBird;Landroid/location/Location;Z)V
.end method
