.class public final LGR4$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGR4$a;->a(Ljava/util/List;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/RideSummary;",
        "Lco/bird/android/model/OperatorRideHistoryItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/api/response/RideSummary;",
        "summary",
        "Lco/bird/android/model/OperatorRideHistoryItem;",
        "a",
        "(Lco/bird/api/response/RideSummary;)Lco/bird/android/model/OperatorRideHistoryItem;"
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
        "SMAP\nRideHistoryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideHistoryPresenter.kt\nco/bird/android/app/feature/ridehistory/RideHistoryPresenterImpl$configureOperatorRideHistory$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n288#2,2:106\n*S KotlinDebug\n*F\n+ 1 RideHistoryPresenter.kt\nco/bird/android/app/feature/ridehistory/RideHistoryPresenterImpl$configureOperatorRideHistory$1$1\n*L\n94#1:106,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/OperatorRideHistoryItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/OperatorRideHistoryItem;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LGR4$a$a;->g:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/RideSummary;)Lco/bird/android/model/OperatorRideHistoryItem;
    .locals 4

    const-string v0, "summary"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LGR4$a$a;->g:Ljava/util/List;

    const-string v1, "rideHistoryItems"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lco/bird/android/model/OperatorRideHistoryItem;

    invoke-virtual {v2}, Lco/bird/android/model/OperatorRideHistoryItem;->getRideId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/api/response/RideSummary;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lco/bird/android/model/OperatorRideHistoryItem;

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/RideSummary;

    invoke-virtual {p0, p1}, LGR4$a$a;->a(Lco/bird/api/response/RideSummary;)Lco/bird/android/model/OperatorRideHistoryItem;

    move-result-object p1

    return-object p1
.end method
