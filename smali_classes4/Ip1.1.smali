.class public final LIp1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHp1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\"\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J$\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\r0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "LIp1;",
        "LHp1;",
        "",
        "fleetId",
        "Lco/bird/android/model/persistence/FleetReportPeriod;",
        "period",
        "Lco/bird/android/model/constant/FleetReportPage;",
        "page",
        "Lio/reactivex/c;",
        "u",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/persistence/FleetReport;",
        "k0",
        "",
        "l0",
        "Lhq1;",
        "a",
        "Lhq1;",
        "repo",
        "<init>",
        "(Lhq1;)V",
        "co.bird.android.manager.fleet-report"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lhq1;


# direct methods
.method public constructor <init>(Lhq1;)V
    .locals 1

    const-string v0, "repo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIp1;->a:Lhq1;

    return-void
.end method


# virtual methods
.method public k0(Ljava/lang/String;Lco/bird/android/model/persistence/FleetReportPeriod;Lco/bird/android/model/constant/FleetReportPage;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/persistence/FleetReportPeriod;",
            "Lco/bird/android/model/constant/FleetReportPage;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/FleetReport;",
            ">;"
        }
    .end annotation

    const-string v0, "fleetId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "period"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIp1;->a:Lhq1;

    invoke-interface {v0, p1, p2, p3}, Lhq1;->k0(Ljava/lang/String;Lco/bird/android/model/persistence/FleetReportPeriod;Lco/bird/android/model/constant/FleetReportPage;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "repo.streamFleetReport(\n\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public l0(Ljava/lang/String;Lco/bird/android/model/constant/FleetReportPage;)Lio/reactivex/Observable;
    .locals 1
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

    const-string v0, "fleetId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "page"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIp1;->a:Lhq1;

    invoke-interface {v0, p1, p2}, Lhq1;->x1(Ljava/lang/String;Lco/bird/android/model/constant/FleetReportPage;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "repo.streamFleetReportPe\u2026scribeOn(Schedulers.io())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public u(Ljava/lang/String;Lco/bird/android/model/persistence/FleetReportPeriod;Lco/bird/android/model/constant/FleetReportPage;)Lio/reactivex/c;
    .locals 1

    const-string v0, "fleetId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "page"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIp1;->a:Lhq1;

    invoke-interface {v0, p1, p2, p3}, Lhq1;->u(Ljava/lang/String;Lco/bird/android/model/persistence/FleetReportPeriod;Lco/bird/android/model/constant/FleetReportPage;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "repo.fetchFleetReport(\n \u2026scribeOn(Schedulers.io())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
