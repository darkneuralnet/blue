.class public interface abstract Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
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
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H&J\u001d\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0008J\u0016\u0010\t\u001a\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006H&J(\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00060\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00060\rH&J\u0014\u0010\u000f\u001a\u00020\n2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012H&J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0014J \u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00060\r2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012H&\u00a8\u0006\u0016"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;",
        "T",
        "",
        "clear",
        "",
        "heldItem",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
        "marker",
        "(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
        "holdIfNotReady",
        "",
        "item",
        "holdNonReadyItems",
        "",
        "items",
        "ready",
        "overrideId",
        "",
        "Lco/bird/android/coreinterface/manager/MarkerOverrideId;",
        "removeHeldItem",
        "(Ljava/lang/Object;)V",
        "setReadyAndReleaseItemsFor",
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
.method public abstract clear()V
.end method

.method public abstract heldItem(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract holdIfNotReady(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "TT;>;)Z"
        }
    .end annotation
.end method

.method public abstract holdNonReadyItems(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "TT;>;>;)",
            "Ljava/util/List<",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "TT;>;>;"
        }
    .end annotation
.end method

.method public abstract ready(Ljava/lang/String;)Z
.end method

.method public abstract removeHeldItem(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public abstract setReadyAndReleaseItemsFor(Ljava/lang/String;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "TT;>;>;"
        }
    .end annotation
.end method
