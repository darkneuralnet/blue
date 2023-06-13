.class public interface abstract LT00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LbI4;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001J>\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00082\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0008H&J\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\tH&J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u00080\u0013H&J\u0016\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00102\u0006\u0010\u0016\u001a\u00020\tH&J\u0016\u0010\u001a\u001a\u00020\r2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H&J\u0016\u0010\u001b\u001a\u00020\r2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H&J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH&\u00a8\u0006\u001d"
    }
    d2 = {
        "LT00;",
        "LbI4;",
        "Landroid/location/Location;",
        "location",
        "",
        "radius",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;",
        "filters",
        "",
        "",
        "bypassFilterBountyIds",
        "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
        "viewport",
        "Lio/reactivex/c;",
        "a1",
        "bountyId",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/persistence/BountyFlightSheetDetails;",
        "X",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/persistence/BountyMapMarker;",
        "v0",
        "surplusId",
        "",
        "Z",
        "bountyIds",
        "o1",
        "b1",
        "I1",
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
.method public abstract I1(Ljava/lang/String;)Lio/reactivex/c;
.end method

.method public abstract X(Ljava/lang/String;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/persistence/BountyFlightSheetDetails;",
            ">;"
        }
    .end annotation
.end method

.method public abstract Z(Ljava/lang/String;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract a1(Landroid/location/Location;DLco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;Ljava/util/List;Ljava/util/List;)Lio/reactivex/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Location;",
            "D",
            "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation
.end method

.method public abstract b1(Ljava/util/List;)Lio/reactivex/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation
.end method

.method public abstract o1(Ljava/util/List;)Lio/reactivex/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation
.end method

.method public abstract v0()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/BountyMapMarker;",
            ">;>;"
        }
    .end annotation
.end method
