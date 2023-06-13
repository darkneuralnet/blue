.class public final LtC3$N;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LtC3;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        "+",
        "Lco/bird/api/response/WireBirdActionPairResponse;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/api/response/WireBirdActionPairResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00020\u0002 \u0005*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/Bird;",
        "Lco/bird/api/response/WireBirdActionPairResponse;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "e",
        "(Lkotlin/Pair;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LtC3;


# direct methods
.method public constructor <init>(LtC3;)V
    .locals 0

    iput-object p1, p0, LtC3$N;->g:LtC3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LtC3$N;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/api/response/WireBirdActionPairResponse;
    .locals 0

    invoke-static {p0, p1}, LtC3$N;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/api/response/WireBirdActionPairResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/api/response/WireBirdActionPairResponse;
    .locals 0

    invoke-static {p0, p1}, LtC3$N;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/api/response/WireBirdActionPairResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LtC3$N;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/api/response/WireBirdActionPairResponse;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/api/response/WireBirdActionPairResponse;

    return-object p0
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/api/response/WireBirdActionPairResponse;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/api/response/WireBirdActionPairResponse;

    return-object p0
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method


# virtual methods
.method public final e(Lkotlin/Pair;)Lio/reactivex/K;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/Bird;",
            "Lco/bird/api/response/WireBirdActionPairResponse;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/api/response/WireBirdActionPairResponse;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "<name for destructuring parameter 0>"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/Bird;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/api/response/WireBirdActionPairResponse;

    invoke-virtual {v2}, Lco/bird/api/response/WireBirdActionPairResponse;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    invoke-virtual {v2}, Lco/bird/api/response/WireBirdActionPairResponse;->getTimeRemainingSeconds()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2}, Lco/bird/api/response/WireBirdActionPairResponse;->getRequiredPartKinds()Ljava/util/List;

    move-result-object v5

    if-eqz v3, :cond_0

    iget-object v1, v0, LtC3$N;->g:LtC3;

    invoke-virtual {v1}, LtC3;->W0()LUC3;

    move-result-object v3

    sget-object v4, LuE3;->d:LuE3;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    new-instance v3, LtC3$N$a;

    invoke-direct {v3, v2}, LtC3$N$a;-><init>(Lco/bird/api/response/WireBirdActionPairResponse;)V

    new-instance v2, LFC3;

    invoke-direct {v2, v3}, LFC3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v2}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v1

    new-instance v2, LtC3$N$b;

    iget-object v3, v0, LtC3$N;->g:LtC3;

    invoke-direct {v2, v3}, LtC3$N$b;-><init>(LtC3;)V

    new-instance v3, LGC3;

    invoke-direct {v3, v2}, LGC3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v1

    goto/16 :goto_0

    :cond_0
    const/4 v3, 0x0

    if-eqz v4, :cond_1

    iget-object v1, v0, LtC3$N;->g:LtC3;

    invoke-virtual {v1}, LtC3;->P0()Ldd3;

    move-result-object v5

    iget-object v1, v0, LtC3$N;->g:LtC3;

    invoke-virtual {v1}, LtC3;->W0()LUC3;

    move-result-object v1

    sget v6, Lnl4;->app_name:I

    new-array v7, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v6, v7}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    iget-object v1, v0, LtC3$N;->g:LtC3;

    invoke-virtual {v1}, LtC3;->W0()LUC3;

    move-result-object v1

    sget v7, Lnl4;->pairing_completed_push_content:I

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v7, v3}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const v8, 0x1e25b

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v1

    mul-int/lit16 v1, v1, 0x3e8

    int-to-long v9, v1

    invoke-interface/range {v5 .. v10}, Ldd3;->f(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IJ)V

    iget-object v1, v0, LtC3$N;->g:LtC3;

    invoke-virtual {v1}, LtC3;->W0()LUC3;

    move-result-object v3

    sget-object v4, LvE3;->d:LvE3;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    new-instance v3, LtC3$N$c;

    invoke-direct {v3, v2}, LtC3$N$c;-><init>(Lco/bird/api/response/WireBirdActionPairResponse;)V

    new-instance v2, LHC3;

    invoke-direct {v2, v3}, LHC3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v2}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v1

    goto/16 :goto_0

    :cond_1
    if-eqz v5, :cond_3

    const-string v4, "initialBird"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LBT;->a(Lco/bird/android/model/persistence/Bird;)Ljava/util/Map;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-static {v5, v4}, Lkotlin/collections/SetsKt;->minus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v4

    invoke-virtual {v1}, Lco/bird/android/model/persistence/Bird;->getModel()Ljava/lang/String;

    move-result-object v1

    const-string v5, "rb1"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lco/bird/android/model/constant/PartKind;->CHASSIS:Lco/bird/android/model/constant/PartKind;

    invoke-interface {v4, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, LtC3$N;->g:LtC3;

    invoke-virtual {v1}, LtC3;->W0()LUC3;

    move-result-object v4

    iget-object v1, v0, LtC3$N;->g:LtC3;

    invoke-virtual {v1}, LtC3;->W0()LUC3;

    move-result-object v1

    sget v5, Lnl4;->pairing_in_progress_title:I

    new-array v6, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v5, v6}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    iget-object v1, v0, LtC3$N;->g:LtC3;

    invoke-virtual {v1}, LtC3;->W0()LUC3;

    move-result-object v1

    sget v6, Lnl4;->pairing_hje_chassis_instruction:I

    new-array v7, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v6, v7}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, ""

    const-string v8, ""

    const/4 v9, 0x0

    iget-object v1, v0, LtC3$N;->g:LtC3;

    invoke-virtual {v1}, LtC3;->W0()LUC3;

    move-result-object v1

    sget v10, Lnl4;->general_done:I

    new-array v11, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v10, v11}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    iget-object v1, v0, LtC3$N;->g:LtC3;

    invoke-virtual {v1}, LtC3;->W0()LUC3;

    move-result-object v1

    sget v11, Lnl4;->dialog_id_tools_confirm_cancel:I

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v11, v3}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/16 v15, 0x10

    const/16 v16, 0x0

    invoke-static/range {v4 .. v16}, LH31$a;->dialogWithInput$default(LH31;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    new-instance v3, LtC3$N$d;

    iget-object v4, v0, LtC3$N;->g:LtC3;

    invoke-direct {v3, v4, v2}, LtC3$N$d;-><init>(LtC3;Lco/bird/api/response/WireBirdActionPairResponse;)V

    new-instance v2, LIC3;

    invoke-direct {v2, v3}, LIC3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v2}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-static {v2}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    goto :goto_0

    :cond_3
    invoke-static {v2}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v1

    :goto_0
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LtC3$N;->e(Lkotlin/Pair;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
