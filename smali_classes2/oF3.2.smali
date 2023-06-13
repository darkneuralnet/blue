.class public interface abstract LoF3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LoF3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H&J\"\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&JF\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H&J&\u0010\u001c\u001a\u00020\u00182\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u00052\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005H&R\u001c\u0010!\u001a\u00020\u00038&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R\u001e\u0010\'\u001a\u0004\u0018\u00010\"8&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&R&\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030)0(8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010+R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030)8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010.R \u00105\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020201008&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00083\u00104\u00a8\u00066"
    }
    d2 = {
        "LoF3;",
        "",
        "Lio/reactivex/Observable;",
        "LFH3;",
        "i",
        "",
        "rideId",
        "Landroid/location/Location;",
        "location",
        "Lco/bird/android/model/ParkingLocationSource;",
        "parkingLocationSource",
        "c",
        "LFU4;",
        "rideParkingDelegate",
        "Lf13;",
        "navigatorDelegate",
        "Lco/bird/android/model/wire/WireRide;",
        "ride",
        "",
        "shouldEndRide",
        "skipEndRideTutorialStep",
        "skipThirdPartyLocationDetermination",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "",
        "e",
        "lastVisitedStep",
        "reason",
        "b",
        "j",
        "()LFH3;",
        "setCurrentParkingStatus",
        "(LFH3;)V",
        "currentParkingStatus",
        "LbF0;",
        "g",
        "()LbF0;",
        "setCurrentParkingNest",
        "(LbF0;)V",
        "currentParkingNest",
        "LZ84;",
        "",
        "f",
        "()LZ84;",
        "parkingStatusByRideId",
        "a",
        "()Ljava/util/Map;",
        "parkingStatusByBirdId",
        "Lkotlin/collections/ArrayDeque;",
        "Lco/bird/android/buava/Optional;",
        "LA5;",
        "d",
        "()Lkotlin/collections/ArrayDeque;",
        "activityResultStack",
        "core-interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract a()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LFH3;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Lco/bird/android/model/wire/WireRide;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract c(Ljava/lang/String;Landroid/location/Location;Lco/bird/android/model/ParkingLocationSource;)LFH3;
.end method

.method public abstract d()Lkotlin/collections/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/collections/ArrayDeque<",
            "Lco/bird/android/buava/Optional<",
            "LA5;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract e(LFU4;Lf13;Lco/bird/android/model/wire/WireRide;ZZZLcom/uber/autodispose/ScopeProvider;)V
.end method

.method public abstract f()LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LFH3;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract g()LbF0;
.end method

.method public abstract i()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LFH3;",
            ">;"
        }
    .end annotation
.end method

.method public abstract j()LFH3;
.end method
