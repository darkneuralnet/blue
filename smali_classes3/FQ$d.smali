.class public final LFQ$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFQ;->s(LGQ;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Laf6;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Laf6;",
        "kotlin.jvm.PlatformType",
        "ui",
        "",
        "a",
        "(Laf6;)V"
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
        "SMAP\nBirdPlusLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusLandingPresenter.kt\nco/bird/android/feature/birdplus/v1/list/BirdPlusLandingPresenter$consume$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1774#2,4:58\n1774#2,4:62\n1774#2,4:66\n*S KotlinDebug\n*F\n+ 1 BirdPlusLandingPresenter.kt\nco/bird/android/feature/birdplus/v1/list/BirdPlusLandingPresenter$consume$4\n*L\n38#1:58,4\n39#1:62,4\n40#1:66,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LFQ;


# direct methods
.method public constructor <init>(LFQ;)V
    .locals 0

    iput-object p1, p0, LFQ$d;->g:LFQ;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Laf6;)V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, LFQ$d;->g:LFQ;

    invoke-static {v1}, LFQ;->access$getAnalyticsManager$p(LFQ;)LEa;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v2, "randomUUID().toString()"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Laf6;->b()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    instance-of v7, v2, Ljava/util/Collection;

    const/4 v8, 0x0

    if-eqz v7, :cond_0

    move-object v7, v2

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_0

    move v7, v8

    goto :goto_1

    :cond_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v7, v8

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v9}, Lco/bird/android/model/persistence/BirdPlusView;->isActive()Z

    move-result v9

    if-eqz v9, :cond_1

    add-int/lit8 v7, v7, 0x1

    if-gez v7, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_0

    :cond_2
    :goto_1
    int-to-long v9, v7

    invoke-virtual/range {p1 .. p1}, Laf6;->b()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    instance-of v7, v2, Ljava/util/Collection;

    if-eqz v7, :cond_3

    move-object v7, v2

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_3

    move v7, v8

    goto :goto_3

    :cond_3
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v7, v8

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v11}, Lco/bird/android/model/persistence/BirdPlusView;->isIneligible()Z

    move-result v11

    if-eqz v11, :cond_4

    add-int/lit8 v7, v7, 0x1

    if-gez v7, :cond_4

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_2

    :cond_5
    :goto_3
    int-to-long v11, v7

    invoke-virtual/range {p1 .. p1}, Laf6;->b()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    instance-of v7, v2, Ljava/util/Collection;

    if-eqz v7, :cond_6

    move-object v7, v2

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v7}, Lco/bird/android/model/persistence/BirdPlusView;->isAvailable()Z

    move-result v7

    if-eqz v7, :cond_7

    add-int/lit8 v8, v8, 0x1

    if-gez v8, :cond_7

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_4

    :cond_8
    :goto_5
    int-to-long v13, v8

    const/4 v15, 0x7

    const/16 v16, 0x0

    new-instance v7, LHQ;

    move-object v2, v7

    move-object/from16 v17, v7

    move-wide v7, v9

    move-wide v9, v11

    move-wide v11, v13

    move v13, v15

    move-object/from16 v14, v16

    invoke-direct/range {v2 .. v14}, LHQ;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;JJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v17

    invoke-interface {v1, v2}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Laf6;

    invoke-virtual {p0, p1}, LFQ$d;->a(Laf6;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
