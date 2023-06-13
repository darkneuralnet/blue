.class public interface abstract LpU4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LpU4$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0006\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0008\u0010\u0006\u001a\u00020\u0004H&J\u0016\u0010\u0008\u001a\u00020\u00042\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\tH&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&J\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011H&J\u0008\u0010\u0014\u001a\u00020\u0004H&J\u0008\u0010\u0015\u001a\u00020\u0004H&R \u0010\u001a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00170\u00168&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00170\u00168&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0019R\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00168&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00168&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u0019R\u001e\u0010%\u001a\u0004\u0018\u00010 8&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\u001e\u0010+\u001a\u0004\u0018\u00010&8&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*\u00a8\u0006,"
    }
    d2 = {
        "LpU4;",
        "",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "",
        "k",
        "b",
        "",
        "m",
        "Lco/bird/android/model/RideMapState;",
        "rideMapState",
        "c",
        "expectedRideMapState",
        "o",
        "Lco/bird/android/model/RideUpdateState;",
        "rideUpdateState",
        "j",
        "",
        "focused",
        "a",
        "e",
        "reset",
        "LZ84;",
        "Lco/bird/android/buava/Optional;",
        "g",
        "()LZ84;",
        "currentBird",
        "i",
        "focusedBird",
        "l",
        "f",
        "rideStatusUpdating",
        "Landroid/location/Location;",
        "p",
        "()Landroid/location/Location;",
        "d",
        "(Landroid/location/Location;)V",
        "riderMapLocation",
        "",
        "h",
        "()Ljava/lang/Double;",
        "n",
        "(Ljava/lang/Double;)V",
        "riderMapRadius",
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
.method public abstract a(Lco/bird/android/model/wire/WireBird;Z)V
.end method

.method public abstract b()V
.end method

.method public abstract c(Lco/bird/android/model/RideMapState;)V
.end method

.method public abstract d(Landroid/location/Location;)V
.end method

.method public abstract e()V
.end method

.method public abstract f()LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/model/RideUpdateState;",
            ">;"
        }
    .end annotation
.end method

.method public abstract g()LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract h()Ljava/lang/Double;
.end method

.method public abstract i()LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract j(Lco/bird/android/model/RideUpdateState;)V
.end method

.method public abstract k(Lco/bird/android/model/wire/WireBird;)V
.end method

.method public abstract l()LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/model/RideMapState;",
            ">;"
        }
    .end annotation
.end method

.method public abstract m(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract n(Ljava/lang/Double;)V
.end method

.method public abstract o(Lco/bird/android/model/RideMapState;)V
.end method

.method public abstract p()Landroid/location/Location;
.end method

.method public abstract reset()V
.end method
