.class public interface abstract Lvp1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001JH\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\'\u00a8\u0006\u000c"
    }
    d2 = {
        "Lvp1;",
        "",
        "",
        "fleetId",
        "startDate",
        "endDate",
        "granularity",
        "Lco/bird/android/model/constant/FleetReportPage;",
        "page",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/wire/WireFleetReport;",
        "a",
        "co.bird.android.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/FleetReportPage;)Lio/reactivex/F;
    .param p1    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "fleet_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "start_date"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "end_date"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime LXc4;
            value = "granularity"
        .end annotation
    .end param
    .param p5    # Lco/bird/android/model/constant/FleetReportPage;
        .annotation runtime LXc4;
            value = "page"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "fleet-report"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/FleetReportPage;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireFleetReport;",
            ">;"
        }
    .end annotation
.end method
