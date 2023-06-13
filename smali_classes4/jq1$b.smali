.class public final Ljq1$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljq1;->u(Ljava/lang/String;Lco/bird/android/model/persistence/FleetReportPeriod;Lco/bird/android/model/constant/FleetReportPage;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireFleetReport;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireFleetReport;",
        "report",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/WireFleetReport;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFleetReportRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportRepositoryImpl.kt\nco/bird/android/repository/fleetreport/FleetReportRepositoryImpl$fetchFleetReport$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,70:1\n1549#2:71\n1620#2,3:72\n37#3,2:75\n*S KotlinDebug\n*F\n+ 1 FleetReportRepositoryImpl.kt\nco/bird/android/repository/fleetreport/FleetReportRepositoryImpl$fetchFleetReport$3\n*L\n42#1:71\n42#1:72,3\n42#1:75,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Ljq1;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lco/bird/android/model/constant/FleetReportPage;


# direct methods
.method public constructor <init>(Ljq1;Ljava/lang/String;Lco/bird/android/model/constant/FleetReportPage;)V
    .locals 0

    iput-object p1, p0, Ljq1$b;->g:Ljq1;

    iput-object p2, p0, Ljq1$b;->h:Ljava/lang/String;

    iput-object p3, p0, Ljq1$b;->i:Lco/bird/android/model/constant/FleetReportPage;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireFleetReport;)Lio/reactivex/h;
    .locals 8

    const-string v0, "report"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    new-array v0, v0, [Lio/reactivex/c;

    iget-object v1, p0, Ljq1$b;->g:Ljq1;

    invoke-static {v1}, Ljq1;->access$getFleetReportDao$p(Ljq1;)Lzp1;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Lco/bird/android/model/persistence/FleetReport;

    iget-object v4, p0, Ljq1$b;->h:Ljava/lang/String;

    iget-object v5, p0, Ljq1$b;->i:Lco/bird/android/model/constant/FleetReportPage;

    invoke-static {p1, v4, v5}, Lwp1;->a(Lco/bird/android/model/wire/WireFleetReport;Ljava/lang/String;Lco/bird/android/model/constant/FleetReportPage;)Lco/bird/android/model/persistence/FleetReport;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v3}, Lzp1;->c([Lco/bird/android/model/persistence/FleetReport;)Lio/reactivex/c;

    move-result-object v1

    aput-object v1, v0, v5

    iget-object v1, p0, Ljq1$b;->g:Ljq1;

    invoke-static {v1}, Ljq1;->access$getFleetReportPeriodDao$p(Ljq1;)LNp1;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireFleetReport;->getPeriodOptions()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v3, p0, Ljq1$b;->h:Ljava/lang/String;

    iget-object v4, p0, Ljq1$b;->i:Lco/bird/android/model/constant/FleetReportPage;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {p1, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/model/wire/WireFleetReportPeriod;

    invoke-static {v7, v3, v4}, Lwp1;->b(Lco/bird/android/model/wire/WireFleetReportPeriod;Ljava/lang/String;Lco/bird/android/model/constant/FleetReportPage;)Lco/bird/android/model/persistence/FleetReportPeriod;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-array p1, v5, [Lco/bird/android/model/persistence/FleetReportPeriod;

    invoke-interface {v6, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lco/bird/android/model/persistence/FleetReportPeriod;

    array-length v3, p1

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lco/bird/android/model/persistence/FleetReportPeriod;

    invoke-virtual {v1, p1}, LNp1;->b([Lco/bird/android/model/persistence/FleetReportPeriod;)Lio/reactivex/c;

    move-result-object p1

    aput-object p1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/c;->L(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireFleetReport;

    invoke-virtual {p0, p1}, Ljq1$b;->a(Lco/bird/android/model/wire/WireFleetReport;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
