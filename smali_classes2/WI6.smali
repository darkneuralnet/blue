.class public interface abstract LWI6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LbI4;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWI6$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u001e\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u00020\tH&J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u00020\tH&J\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0016\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\t2\u0006\u0010\u000f\u001a\u00020\u000eH&\u00a8\u0006\u0016"
    }
    d2 = {
        "LWI6;",
        "LbI4;",
        "",
        "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
        "viewport",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;",
        "filters",
        "Lio/reactivex/c;",
        "Y0",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/persistence/ZonePolygonable;",
        "I",
        "Lco/bird/android/model/persistence/ZoneMarker;",
        "i",
        "",
        "zoneId",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/persistence/ZoneOverlayAnalytics;",
        "f0",
        "S0",
        "Lco/bird/android/model/persistence/ZoneFlightSheetDetails;",
        "k1",
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
.method public abstract I()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/ZonePolygonable;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract S0(Ljava/lang/String;)Lio/reactivex/c;
.end method

.method public abstract Y0(Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;)Lio/reactivex/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
            ">;",
            "Lco/bird/android/model/persistence/nestedstructures/OperatorMapFilterBundle;",
            ")",
            "Lio/reactivex/c;"
        }
    .end annotation
.end method

.method public abstract f0(Ljava/lang/String;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/persistence/ZoneOverlayAnalytics;",
            ">;"
        }
    .end annotation
.end method

.method public abstract i()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/ZoneMarker;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract k1(Ljava/lang/String;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/ZoneFlightSheetDetails;",
            ">;"
        }
    .end annotation
.end method
