.class public interface abstract Lco/bird/android/app/feature/map/ui/MapParkingUi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/ui/MapUi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/ui/MapParkingUi$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\t\u001a\u00020\u00082\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000c\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH&J\u0016\u0010\u0012\u001a\u00020\u00082\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0010H&J\u0016\u0010\u0013\u001a\u00020\u00082\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0010H&\u00a8\u0006\u0014"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/MapParkingUi;",
        "Lco/bird/android/app/feature/map/ui/MapUi;",
        "Lio/reactivex/Observable;",
        "LfM2;",
        "parkingMarkerClicks",
        "",
        "Lco/bird/android/model/ParkingNest;",
        "nests",
        "",
        "addParkingNests",
        "marker",
        "resetParkingMarker",
        "selectParkingMarker",
        "",
        "show",
        "showParkingMarkers",
        "Lco/bird/android/app/feature/map/modelmanager/Filter;",
        "filter",
        "addParkingFilter",
        "removeParkingFilter",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract addParkingFilter(Lco/bird/android/app/feature/map/modelmanager/Filter;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/modelmanager/Filter<",
            "Lco/bird/android/model/ParkingNest;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract addParkingNests(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/ParkingNest;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract parkingMarkerClicks()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LfM2;",
            ">;"
        }
    .end annotation
.end method

.method public abstract removeParkingFilter(Lco/bird/android/app/feature/map/modelmanager/Filter;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/modelmanager/Filter<",
            "Lco/bird/android/model/ParkingNest;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract resetParkingMarker(LfM2;)V
.end method

.method public abstract selectParkingMarker(LfM2;)V
.end method

.method public abstract showParkingMarkers(Z)V
.end method
