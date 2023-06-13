.class public final LPl5$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPl5;->C()Lio/reactivex/Observable;
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
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        "+",
        "LTk5;",
        ">;>;",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/ScanlessRideItem;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a\u0016\u0012\u0004\u0012\u00020\u0007 \u0004*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u00052X\u0010\u0006\u001aT\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001 \u0004*(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u00050\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/wire/WireBird;",
        "LTk5;",
        "kotlin.jvm.PlatformType",
        "",
        "list",
        "Lco/bird/android/model/ScanlessRideItem;",
        "a",
        "(Ljava/util/List;)Ljava/util/List;"
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
        "SMAP\nScanlessRideManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanlessRideManagerImpl.kt\nco/bird/android/manager/ride/ScanlessRideManagerImpl$scanBleObservable$7\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1963#2,14:344\n1603#2,9:358\n1855#2:367\n1856#2:370\n1612#2:371\n1054#2:372\n1#3:368\n1#3:369\n*S KotlinDebug\n*F\n+ 1 ScanlessRideManagerImpl.kt\nco/bird/android/manager/ride/ScanlessRideManagerImpl$scanBleObservable$7\n*L\n273#1:344,14\n276#1:358,9\n276#1:367\n276#1:370\n276#1:371\n288#1:372\n276#1:369\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LPl5;


# direct methods
.method public constructor <init>(LPl5;)V
    .locals 0

    iput-object p1, p0, LPl5$q;->g:LPl5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireBird;",
            "LTk5;",
            ">;>;)",
            "Ljava/util/List<",
            "Lco/bird/android/model/ScanlessRideItem;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "list"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    move-object v3, v4

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    move-object v5, v3

    check-cast v5, Lkotlin/Pair;

    invoke-virtual {v5}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LTk5;

    invoke-virtual {v5}, LTk5;->b()I

    move-result v5

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lkotlin/Pair;

    invoke-virtual {v7}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LTk5;

    invoke-virtual {v7}, LTk5;->b()I

    move-result v7

    if-ge v5, v7, :cond_3

    move-object v3, v6

    move v5, v7

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_2

    :goto_0
    check-cast v3, Lkotlin/Pair;

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LTk5;

    if-eqz v2, :cond_d

    invoke-virtual {v2}, LTk5;->b()I

    move-result v2

    iget-object v3, v0, LPl5$q;->g:LPl5;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlin/Pair;

    invoke-virtual {v6}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v6}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LTk5;

    invoke-virtual {v6}, LTk5;->b()I

    move-result v8

    sub-int/2addr v8, v2

    invoke-static {v3, v7, v8}, LPl5;->access$scanlessRideScore(LPl5;Lco/bird/android/model/wire/WireBird;I)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v9

    const-wide/16 v11, 0x0

    cmpl-double v9, v9, v11

    if-lez v9, :cond_5

    const/4 v9, 0x1

    goto :goto_2

    :cond_5
    const/4 v9, 0x0

    :goto_2
    if-eqz v9, :cond_6

    goto :goto_3

    :cond_6
    move-object v8, v4

    :goto_3
    if-eqz v8, :cond_7

    invoke-virtual {v8}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v8

    new-instance v10, Lco/bird/android/model/ScanlessRideItem;

    invoke-direct {v10, v7, v6, v8, v9}, Lco/bird/android/model/ScanlessRideItem;-><init>(Lco/bird/android/model/wire/WireBird;LTk5;D)V

    goto :goto_4

    :cond_7
    move-object v10, v4

    :goto_4
    if-eqz v10, :cond_4

    invoke-interface {v5, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    new-instance v1, LPl5$q$a;

    invoke-direct {v1}, LPl5$q$a;-><init>()V

    invoke-static {v5, v1}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    iget-object v2, v0, LPl5$q;->g:LPl5;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/ScanlessRideItem;

    invoke-static {v2}, LPl5;->access$getAnalyticsManager$p(LPl5;)LEa;

    move-result-object v2

    new-instance v15, LQe4;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v9

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Lco/bird/android/model/ScanlessRideItem;->getScore()D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    move-object v10, v5

    goto :goto_5

    :cond_9
    move-object v10, v4

    :goto_5
    if-eqz v3, :cond_a

    invoke-virtual {v3}, Lco/bird/android/model/ScanlessRideItem;->getScanResult()LTk5;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-virtual {v5}, LTk5;->b()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object v11, v5

    goto :goto_6

    :cond_a
    move-object v11, v4

    :goto_6
    if-eqz v3, :cond_b

    invoke-virtual {v3}, Lco/bird/android/model/ScanlessRideItem;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v5

    if-eqz v5, :cond_b

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireBird;->getBatteryLevel()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object v12, v5

    goto :goto_7

    :cond_b
    move-object v12, v4

    :goto_7
    if-eqz v3, :cond_c

    invoke-virtual {v3}, Lco/bird/android/model/ScanlessRideItem;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v4

    :cond_c
    move-object v13, v4

    const/4 v14, 0x7

    const/4 v3, 0x0

    move-object v5, v15

    move-object v4, v15

    move-object v15, v3

    invoke-direct/range {v5 .. v15}, LQe4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v4}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-object v1

    :cond_d
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LPl5$q;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
