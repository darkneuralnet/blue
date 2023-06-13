.class public final LtW4$s;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LtW4;->S(LxW4;)V
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
        "Lco/bird/android/model/persistence/RidePassView;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "ridePassViewList",
        "",
        "Lco/bird/android/model/persistence/RidePassView;",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRidePassV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV2Presenter.kt\nco/bird/android/feature/ridepass/v2/list/RidePassV2Presenter$consume$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1747#2,3:245\n1855#2,2:248\n1774#2,4:250\n1774#2,4:254\n*S KotlinDebug\n*F\n+ 1 RidePassV2Presenter.kt\nco/bird/android/feature/ridepass/v2/list/RidePassV2Presenter$consume$2\n*L\n61#1:245,3\n62#1:248,2\n66#1:250,4\n67#1:254,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LtW4;


# direct methods
.method public constructor <init>(LtW4;)V
    .locals 0

    iput-object p1, p0, LtW4$s;->g:LtW4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LtW4$s;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, LtW4$s;->g:LtW4;

    const/4 v3, 0x0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {v2, v4}, LtW4;->q0(Lco/bird/android/model/persistence/RidePassView;)V

    iget-object v2, v0, LtW4$s;->g:LtW4;

    const-string v4, "ridePassViewList"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    instance-of v4, v1, Ljava/util/Collection;

    if-eqz v4, :cond_1

    move-object v5, v1

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    :cond_0
    move v5, v3

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {v6}, Lco/bird/android/model/persistence/RidePassView;->isActive()Z

    move-result v6

    if-eqz v6, :cond_2

    const/4 v5, 0x1

    :goto_0
    new-instance v6, LoA5;

    invoke-direct {v6, v5}, LoA5;-><init>(Z)V

    invoke-virtual {v2, v6}, Lf1;->h(Ljava/lang/Object;)V

    iget-object v2, v0, LtW4$s;->g:LtW4;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/persistence/RidePassView;

    invoke-static {v2}, LtW4;->access$getAnalyticsManager$p(LtW4;)LEa;

    move-result-object v7

    new-instance v15, LBV4;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual {v6}, Lco/bird/android/model/persistence/RidePassView;->getLinkCode()Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/16 v16, 0x77

    const/16 v17, 0x0

    move-object v8, v15

    move-object v3, v15

    move-object v15, v6

    invoke-direct/range {v8 .. v17}, LBV4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v7, v3}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    const/4 v3, 0x0

    goto :goto_1

    :cond_3
    iget-object v2, v0, LtW4$s;->g:LtW4;

    invoke-static {v2}, LtW4;->access$getAnalyticsManager$p(LtW4;)LEa;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v4, :cond_4

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v5, 0x0

    goto :goto_3

    :cond_4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v5, 0x0

    :cond_5
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {v9}, Lco/bird/android/model/persistence/RidePassView;->isActive()Z

    move-result v9

    if-eqz v9, :cond_5

    add-int/lit8 v5, v5, 0x1

    if-gez v5, :cond_5

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_2

    :cond_6
    :goto_3
    int-to-long v9, v5

    if-eqz v4, :cond_7

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_7

    const/4 v3, 0x0

    goto :goto_5

    :cond_7
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    :cond_8
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {v4}, Lco/bird/android/model/persistence/RidePassView;->isIneligible()Z

    move-result v4

    if-eqz v4, :cond_8

    add-int/lit8 v3, v3, 0x1

    if-gez v3, :cond_8

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_4

    :cond_9
    :goto_5
    int-to-long v11, v3

    const/4 v13, 0x7

    const/4 v14, 0x0

    new-instance v1, LeV4;

    move-object v5, v1

    invoke-direct/range {v5 .. v14}, LeV4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method
