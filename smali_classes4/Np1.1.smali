.class public abstract LNp1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J$\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\'J#\u0010\r\u001a\u00020\u000c2\u0012\u0010\u000b\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00080\n\"\u00020\u0008H\'\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0008\u0010\u000f\u001a\u00020\u000cH\'\u00a8\u0006\u0012"
    }
    d2 = {
        "LNp1;",
        "",
        "",
        "fleetId",
        "Lco/bird/android/model/constant/FleetReportPage;",
        "page",
        "Lio/reactivex/Observable;",
        "",
        "Lco/bird/android/model/persistence/FleetReportPeriod;",
        "c",
        "",
        "period",
        "Lio/reactivex/c;",
        "b",
        "([Lco/bird/android/model/persistence/FleetReportPeriod;)Lio/reactivex/c;",
        "a",
        "<init>",
        "()V",
        "co.bird.android.lib.persistence.fleet-report.api"
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

.method public varargs abstract b([Lco/bird/android/model/persistence/FleetReportPeriod;)Lio/reactivex/c;
.end method

.method public abstract c(Ljava/lang/String;Lco/bird/android/model/constant/FleetReportPage;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/FleetReportPage;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/FleetReportPeriod;",
            ">;>;"
        }
    .end annotation
.end method
