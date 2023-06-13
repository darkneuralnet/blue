.class public final LGR4$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGR4;->h(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/OperatorRideHistoryItem;",
        ">;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/model/OperatorRideHistoryItem;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Lco/bird/android/model/OperatorRideHistoryItem;",
        "rideHistoryItems",
        "Lio/reactivex/B;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Lio/reactivex/B;"
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
        "SMAP\nRideHistoryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideHistoryPresenter.kt\nco/bird/android/app/feature/ridehistory/RideHistoryPresenterImpl$configureOperatorRideHistory$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n1549#2:106\n1620#2,3:107\n*S KotlinDebug\n*F\n+ 1 RideHistoryPresenter.kt\nco/bird/android/app/feature/ridehistory/RideHistoryPresenterImpl$configureOperatorRideHistory$1\n*L\n81#1:106\n81#1:107,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LGR4;


# direct methods
.method public constructor <init>(LGR4;)V
    .locals 0

    iput-object p1, p0, LGR4$a;->g:LGR4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lio/reactivex/B;
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/OperatorRideHistoryItem;",
            ">;)",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/model/OperatorRideHistoryItem;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "rideHistoryItems"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/OperatorRideHistoryItem;

    new-instance v5, Lco/bird/api/response/RideSummary;

    new-instance v7, Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v4}, Lco/bird/android/model/OperatorRideHistoryItem;->getRideId()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_0

    const-string v6, ""

    :cond_0
    move-object/from16 v36, v6

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-virtual {v4}, Lco/bird/android/model/OperatorRideHistoryItem;->getCompletedAt()Lorg/joda/time/DateTime;

    move-result-object v17

    const/16 v18, 0x0

    invoke-virtual {v4}, Lco/bird/android/model/OperatorRideHistoryItem;->getCanceledAt()Lorg/joda/time/DateTime;

    move-result-object v19

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const v34, 0x3fff5fe

    const/16 v35, 0x0

    move-object v6, v7

    move-object v4, v7

    move-object/from16 v7, v36

    invoke-direct/range {v6 .. v35}, Lco/bird/android/model/wire/WireRide;-><init>(Ljava/lang/String;DLjava/lang/String;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;ILjava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZLjava/lang/Boolean;Lco/bird/android/model/constant/RideType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Lco/bird/android/model/wire/WireRideDetail;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x0

    invoke-direct {v5, v4, v6}, Lco/bird/api/response/RideSummary;-><init>(Lco/bird/android/model/wire/WireRide;Lco/bird/android/model/wire/WireRideTransaction;)V

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    iget-object v3, v0, LGR4$a;->g:LGR4;

    invoke-static {v3}, LGR4;->access$getUi$p(LGR4;)LRR4;

    move-result-object v3

    invoke-interface {v3, v2}, LRR4;->N1(Ljava/util/List;)V

    iget-object v2, v0, LGR4$a;->g:LGR4;

    invoke-static {v2}, LGR4;->access$getUi$p(LGR4;)LRR4;

    move-result-object v2

    invoke-interface {v2}, LRR4;->Vj()Lio/reactivex/Observable;

    move-result-object v2

    new-instance v3, LGR4$a$a;

    invoke-direct {v3, v1}, LGR4$a$a;-><init>(Ljava/util/List;)V

    invoke-static {v2, v3}, LYf5;->T(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LGR4$a;->a(Ljava/util/List;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
