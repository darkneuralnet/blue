.class public final Ljq1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhq1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljq1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0011B!\u0008\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\"\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J$\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\r0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0008\u0010\u000f\u001a\u00020\u0008H\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001f"
    }
    d2 = {
        "Ljq1;",
        "Lhq1;",
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
        "x1",
        "clear",
        "Lvp1;",
        "a",
        "Lvp1;",
        "fleetReportClient",
        "Lzp1;",
        "b",
        "Lzp1;",
        "fleetReportDao",
        "LNp1;",
        "c",
        "LNp1;",
        "fleetReportPeriodDao",
        "<init>",
        "(Lvp1;Lzp1;LNp1;)V",
        "d",
        "co.bird.android.repository.fleet-report"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFleetReportRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportRepositoryImpl.kt\nco/bird/android/repository/fleetreport/FleetReportRepositoryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"
    }
.end annotation


# static fields
.field public static final d:Ljq1$a;

.field public static final e:Lorg/joda/time/format/DateTimeFormatter;


# instance fields
.field public final a:Lvp1;

.field public final b:Lzp1;

.field public final c:LNp1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljq1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljq1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ljq1;->d:Ljq1$a;

    invoke-static {}, Lorg/joda/time/format/ISODateTimeFormat;->dateTime()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Ljq1;->e:Lorg/joda/time/format/DateTimeFormatter;

    return-void
.end method

.method public constructor <init>(Lvp1;Lzp1;LNp1;)V
    .locals 1

    const-string v0, "fleetReportClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fleetReportDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fleetReportPeriodDao"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljq1;->a:Lvp1;

    iput-object p2, p0, Ljq1;->b:Lzp1;

    iput-object p3, p0, Ljq1;->c:LNp1;

    return-void
.end method

.method public static synthetic J1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Ljq1;->K1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final K1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final synthetic access$getFleetReportDao$p(Ljq1;)Lzp1;
    .locals 0

    iget-object p0, p0, Ljq1;->b:Lzp1;

    return-object p0
.end method

.method public static final synthetic access$getFleetReportPeriodDao$p(Ljq1;)LNp1;
    .locals 0

    iget-object p0, p0, Ljq1;->c:LNp1;

    return-object p0
.end method


# virtual methods
.method public clear()Lio/reactivex/c;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lio/reactivex/c;

    iget-object v1, p0, Ljq1;->b:Lzp1;

    invoke-virtual {v1}, Lzp1;->a()Lio/reactivex/c;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Ljq1;->c:LNp1;

    invoke-virtual {v1}, LNp1;->a()Lio/reactivex/c;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lio/reactivex/c;->L(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "merge(listOf(\n      flee\u2026PeriodDao.clear(),\n    ))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

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

    iget-object v0, p0, Ljq1;->b:Lzp1;

    invoke-virtual {v0, p1, p2, p3}, Lzp1;->b(Ljava/lang/String;Lco/bird/android/model/persistence/FleetReportPeriod;Lco/bird/android/model/constant/FleetReportPage;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public u(Ljava/lang/String;Lco/bird/android/model/persistence/FleetReportPeriod;Lco/bird/android/model/constant/FleetReportPage;)Lio/reactivex/c;
    .locals 7

    const-string v0, "fleetId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "page"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Ljq1;->a:Lvp1;

    const-string v0, "isoDateFormatter"

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetReportPeriod;->getStartDate()Lorg/joda/time/DateTime;

    move-result-object v3

    if-eqz v3, :cond_0

    sget-object v4, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-virtual {v3, v4}, Lorg/joda/time/DateTime;->withZone(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object v3

    if-eqz v3, :cond_0

    sget-object v4, Ljq1;->e:Lorg/joda/time/format/DateTimeFormatter;

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetReportPeriod;->getEndDate()Lorg/joda/time/DateTime;

    move-result-object v4

    if-eqz v4, :cond_1

    sget-object v5, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-virtual {v4, v5}, Lorg/joda/time/DateTime;->withZone(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object v4

    if-eqz v4, :cond_1

    sget-object v5, Ljq1;->e:Lorg/joda/time/format/DateTimeFormatter;

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, v2

    :goto_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetReportPeriod;->getGranularity()Ljava/lang/String;

    move-result-object p2

    move-object v5, p2

    goto :goto_2

    :cond_2
    move-object v5, v2

    :goto_2
    move-object v2, p1

    move-object v6, p3

    invoke-interface/range {v1 .. v6}, Lvp1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/FleetReportPage;)Lio/reactivex/F;

    move-result-object p2

    new-instance v0, Ljq1$b;

    invoke-direct {v0, p0, p1, p3}, Ljq1$b;-><init>(Ljq1;Ljava/lang/String;Lco/bird/android/model/constant/FleetReportPage;)V

    new-instance p1, Liq1;

    invoke-direct {p1, v0}, Liq1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "override fun fetchFleetR\u2026))\n        ))\n      }\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public x1(Ljava/lang/String;Lco/bird/android/model/constant/FleetReportPage;)Lio/reactivex/Observable;
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

    iget-object v0, p0, Ljq1;->c:LNp1;

    invoke-virtual {v0, p1, p2}, LNp1;->c(Ljava/lang/String;Lco/bird/android/model/constant/FleetReportPage;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
