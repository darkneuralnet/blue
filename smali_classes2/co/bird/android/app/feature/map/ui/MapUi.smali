.class public interface abstract Lco/bird/android/app/feature/map/ui/MapUi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/ui/MapAreasUi;
.implements Lco/bird/android/app/feature/map/ui/MapZonesUi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/ui/MapUi$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H&J#\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0016\u0010\u000b\u001a\u00020\u00052\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH&J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H&J\u0008\u0010\u0011\u001a\u00020\u0005H&J\u0008\u0010\u0012\u001a\u00020\u0005H&J\u0008\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\tH&J\u0008\u0010\u0018\u001a\u00020\u0017H&J\u000e\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0019H&J\u0010\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019H&J\u000e\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0019H&J\u000e\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u0019H&J\u000e\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u0019H&J \u0010\"\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001d0\r\u0012\u0004\u0012\u00020\t0!0 H&J\u0016\u0010%\u001a\u00020\u00052\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020#0\rH&J(\u0010*\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00132\u0006\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0013H&J\u0008\u0010+\u001a\u00020\u0005H&J\u000e\u0010-\u001a\u0008\u0012\u0004\u0012\u00020,0\u0019H&J\u0010\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0019H&J\u0016\u0010/\u001a\u0008\u0012\u0004\u0012\u00020,0\u00192\u0006\u0010\u0008\u001a\u00020,H&J\u0008\u00100\u001a\u00020\u0005H&J\u0008\u00101\u001a\u00020\u0005H&J\u000e\u00103\u001a\u0008\u0012\u0004\u0012\u0002020\rH&J\u000e\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\rH&J\u0008\u00106\u001a\u000205H&J\u0010\u00109\u001a\u0002082\u0006\u00107\u001a\u00020\u001dH&R\u0014\u0010<\u001a\u00020\u001d8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008:\u0010;R\u001a\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00198&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010>R \u0010D\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0A0@8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010CR,\u0010F\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001d0\r\u0012\u0004\u0012\u00020\t0!0@8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008E\u0010C\u00a8\u0006G"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/MapUi;",
        "Lco/bird/android/app/feature/map/ui/MapAreasUi;",
        "Lco/bird/android/app/feature/map/ui/MapZonesUi;",
        "Lcom/google/android/gms/maps/model/CameraPosition;",
        "cameraPosition",
        "",
        "moveTo",
        "Landroid/location/Location;",
        "location",
        "",
        "zoomLevel",
        "zoomTo",
        "(Landroid/location/Location;Ljava/lang/Float;)V",
        "",
        "Lco/bird/android/model/Point;",
        "points",
        "updateMyLocation",
        "clearBirds",
        "removeRoute",
        "",
        "nearbyRadius",
        "direction",
        "updateLocationRotate",
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "reactiveMapEvent",
        "Lio/reactivex/Observable;",
        "cameraPositionUpdates",
        "myLocationClicks",
        "mapClicks",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "mapClicksLocation",
        "centerLocationChanged",
        "Lio/reactivex/k;",
        "Lkotlin/Pair;",
        "viewportChanged",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "sites",
        "setMerchantSites",
        "startLatitude",
        "startLongitude",
        "endLatitude",
        "endLongitude",
        "setDestination",
        "clearDestination",
        "Lco/bird/android/model/wire/WireLocation;",
        "mapLongClicks",
        "myLocationLongClicks",
        "showTeleportMarker",
        "removeTeleportMarker",
        "onDestroy",
        "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
        "viewport",
        "latLngViewport",
        "Lcom/google/android/gms/maps/model/LatLngBounds;",
        "latLngBounds",
        "latlng",
        "",
        "viewportContains",
        "getCenterLocation",
        "()Lcom/google/android/gms/maps/model/LatLng;",
        "centerLocation",
        "getDestinationFlagClicks",
        "()Lio/reactivex/Observable;",
        "destinationFlagClicks",
        "LZ84;",
        "Lco/bird/android/buava/Optional;",
        "getZoomLevelObservable",
        "()LZ84;",
        "zoomLevelObservable",
        "getViewportChangesObservable",
        "viewportChangesObservable",
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
.method public abstract cameraPositionUpdates()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/google/android/gms/maps/model/CameraPosition;",
            ">;"
        }
    .end annotation
.end method

.method public abstract centerLocationChanged()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end method

.method public abstract clearBirds()V
.end method

.method public abstract clearDestination()V
.end method

.method public abstract getCenterLocation()Lcom/google/android/gms/maps/model/LatLng;
.end method

.method public abstract getDestinationFlagClicks()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getViewportChangesObservable()LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract getZoomLevelObservable()LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract latLngBounds()Lcom/google/android/gms/maps/model/LatLngBounds;
.end method

.method public abstract latLngViewport()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end method

.method public abstract mapClicks()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end method

.method public abstract mapClicksLocation()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end method

.method public abstract mapLongClicks()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireLocation;",
            ">;"
        }
    .end annotation
.end method

.method public abstract moveTo(Landroid/location/Location;)V
.end method

.method public abstract moveTo(Lcom/google/android/gms/maps/model/CameraPosition;)V
.end method

.method public abstract myLocationClicks()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end method

.method public abstract myLocationLongClicks()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end method

.method public abstract nearbyRadius()D
.end method

.method public abstract onDestroy()V
.end method

.method public abstract reactiveMapEvent()Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;
.end method

.method public abstract removeRoute()V
.end method

.method public abstract removeTeleportMarker()V
.end method

.method public abstract setDestination(DDDD)V
.end method

.method public abstract setMerchantSites(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract showTeleportMarker(Lco/bird/android/model/wire/WireLocation;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireLocation;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireLocation;",
            ">;"
        }
    .end annotation
.end method

.method public abstract updateLocationRotate(F)V
.end method

.method public abstract updateMyLocation(Landroid/location/Location;)V
.end method

.method public abstract viewport()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
            ">;"
        }
    .end annotation
.end method

.method public abstract viewportChanged()Lio/reactivex/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/k<",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract viewportContains(Lcom/google/android/gms/maps/model/LatLng;)Z
.end method

.method public abstract zoomTo(Landroid/location/Location;Ljava/lang/Float;)V
.end method

.method public abstract zoomTo(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/Point;",
            ">;)V"
        }
    .end annotation
.end method
