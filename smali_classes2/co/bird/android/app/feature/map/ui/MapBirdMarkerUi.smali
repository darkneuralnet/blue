.class public interface abstract Lco/bird/android/app/feature/map/ui/MapBirdMarkerUi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/ui/MapUi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/ui/MapBirdMarkerUi$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003H&J\u000e\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0008\u0010\u0008\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0018\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0016\u0010\u0011\u001a\u00020\t2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0013H&J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H&\u00a8\u0006\u0015"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/MapBirdMarkerUi;",
        "Lco/bird/android/app/feature/map/ui/MapUi;",
        "birdMarkerClicks",
        "Lio/reactivex/Observable;",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        "",
        "birdMarkerInfoItemClicks",
        "clearBirdMarkers",
        "",
        "deselect",
        "birdMarker",
        "drawRouteAndZoom",
        "route",
        "Lco/bird/android/model/Route;",
        "removeBirdMarker",
        "select",
        "setBirdMarkers",
        "birdMarkers",
        "",
        "zoomToMaxLevel",
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
.method public abstract birdMarkerClicks()Lio/reactivex/Observable;
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
.end method

.method public abstract birdMarkerInfoItemClicks()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;"
        }
    .end annotation
.end method

.method public abstract clearBirdMarkers()V
.end method

.method public abstract deselect(Lco/bird/android/model/persistence/BirdMapMarker;)V
.end method

.method public abstract drawRouteAndZoom(Lco/bird/android/model/Route;Lco/bird/android/model/persistence/BirdMapMarker;)V
.end method

.method public abstract removeBirdMarker(Lco/bird/android/model/persistence/BirdMapMarker;)V
.end method

.method public abstract select(Lco/bird/android/model/persistence/BirdMapMarker;)V
.end method

.method public abstract setBirdMarkers(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/BirdMapMarker;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract zoomToMaxLevel(Lco/bird/android/model/persistence/BirdMapMarker;)V
.end method
