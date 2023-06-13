.class public abstract Lwq1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\'J\u001c\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\'J#\u0010\u000c\u001a\u00020\u000b2\u0012\u0010\n\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\'\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\'J\u0008\u0010\u0011\u001a\u00020\u000bH\'\u00a8\u0006\u0014"
    }
    d2 = {
        "Lwq1;",
        "",
        "",
        "fleetId",
        "Lio/reactivex/Observable;",
        "",
        "Lco/bird/android/model/persistence/FleetStatus;",
        "b",
        "c",
        "",
        "fleetStatuses",
        "Lio/reactivex/c;",
        "d",
        "([Lco/bird/android/model/persistence/FleetStatus;)Lio/reactivex/c;",
        "Lorg/joda/time/DateTime;",
        "createdAt",
        "e",
        "a",
        "<init>",
        "()V",
        "co.bird.android.lib.persistence.fleet-status.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lio/reactivex/c;
.end method

.method public abstract b(Ljava/lang/String;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/FleetStatus;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/FleetStatus;",
            ">;>;"
        }
    .end annotation
.end method

.method public varargs abstract d([Lco/bird/android/model/persistence/FleetStatus;)Lio/reactivex/c;
.end method

.method public abstract e(Ljava/lang/String;Lorg/joda/time/DateTime;)Lio/reactivex/c;
.end method
