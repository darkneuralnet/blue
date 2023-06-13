.class public interface abstract Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterManager$DefaultImpls;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H&\u00a2\u0006\u0002\u0010\u0008J\u0016\u0010\u0003\u001a\u00020\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\nH&J\u0008\u0010\u000b\u001a\u00020\u0004H&J\u0008\u0010\u000c\u001a\u00020\u0004H&J\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000eJ\u0008\u0010\u0010\u001a\u00020\u0011H&J\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&\u00a2\u0006\u0002\u0010\u0015J\u0008\u0010\u0016\u001a\u00020\u0004H&J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000eJ\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000eJ\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u001a\u001a\u00020\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\nH&J!\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH&\u00a2\u0006\u0002\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001d2\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010!J\"\u0010\"\u001a\u00020\u00042\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040$H&J\u001c\u0010%\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040&H&J\u0008\u0010\'\u001a\u00020\u0004H&\u00a8\u0006("
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterManager;",
        "T",
        "",
        "add",
        "",
        "marker",
        "selected",
        "",
        "(Ljava/lang/Object;Z)V",
        "markers",
        "",
        "animateMarkers",
        "clear",
        "closeInfoWindow",
        "(Ljava/lang/Object;)V",
        "deselect",
        "mapMode",
        "Lco/bird/android/model/constant/MapMode;",
        "move",
        "latLng",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "(Ljava/lang/Object;Lcom/google/android/gms/maps/model/LatLng;)V",
        "reload",
        "remove",
        "reset",
        "select",
        "set",
        "setInRide",
        "state",
        "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;",
        "(Ljava/lang/Object;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V",
        "setMapMarkerState",
        "mapMarkerState",
        "(Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;Ljava/lang/Object;)V",
        "setOnClusterItemClickListener",
        "listener",
        "Lkotlin/Function2;",
        "setOnMarkerInfoItemClick",
        "Lkotlin/Function1;",
        "showInfoWindow",
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
.method public abstract add(Ljava/lang/Object;Z)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)V"
        }
    .end annotation
.end method

.method public abstract add(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;)V"
        }
    .end annotation
.end method

.method public abstract animateMarkers()V
.end method

.method public abstract clear()V
.end method

.method public abstract closeInfoWindow(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public abstract deselect(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public abstract mapMode()Lco/bird/android/model/constant/MapMode;
.end method

.method public abstract move(Ljava/lang/Object;Lcom/google/android/gms/maps/model/LatLng;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ")V"
        }
    .end annotation
.end method

.method public abstract reload()V
.end method

.method public abstract remove(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public abstract reset(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public abstract select(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public abstract set(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;)V"
        }
    .end annotation
.end method

.method public abstract setInRide(Ljava/lang/Object;Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;",
            ")V"
        }
    .end annotation
.end method

.method public abstract setMapMarkerState(Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;",
            "TT;)V"
        }
    .end annotation
.end method

.method public abstract setOnClusterItemClickListener(Lkotlin/jvm/functions/Function2;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setOnMarkerInfoItemClick(Lkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract showInfoWindow()V
.end method
