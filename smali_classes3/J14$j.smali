.class public final LJ14$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ14;->F(LK14;)V
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
        "Lkotlin/Pair<",
        "+",
        "Lkotlin/Unit;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/BirdPayment;",
        ">;>;+",
        "LS04;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\t\u001a\u00020\u00012\u0087\u0001\u0010\u0006\u001a\u0082\u0001\u0012,\u0012*\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*@\u0012,\u0012*\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/BirdPayment;",
        "LS04;",
        "<name for destructuring parameter 0>",
        "invoke",
        "(Lkotlin/Pair;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LJ14;

.field public final synthetic h:LK14;


# direct methods
.method public constructor <init>(LJ14;LK14;)V
    .locals 0

    iput-object p1, p0, LJ14$j;->g:LJ14;

    iput-object p2, p0, LJ14$j;->h:LK14;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LJ14$j;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lkotlin/Pair<",
            "Lkotlin/Unit;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/BirdPayment;",
            ">;>;",
            "LS04;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Pair;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LS04;

    iget-object v3, v0, LJ14$j;->g:LJ14;

    new-instance v4, LIt2;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, LIt2;-><init>(Z)V

    invoke-virtual {v3, v4}, Lf1;->h(Ljava/lang/Object;)V

    invoke-virtual {v2}, LS04;->b()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    iget-object v4, v0, LJ14$j;->g:LJ14;

    invoke-static {v4}, LJ14;->access$getAnalyticsManager$p(LJ14;)LEa;

    move-result-object v4

    new-instance v15, Lr04;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    iget-object v6, v0, LJ14$j;->g:LJ14;

    invoke-static {v6}, LJ14;->access$getContextForAnalytics$p(LJ14;)Ljava/lang/String;

    move-result-object v10

    iget-object v6, v0, LJ14$j;->g:LJ14;

    invoke-static {v6}, LJ14;->access$getReactiveConfig$p(LJ14;)LTq4;

    move-result-object v6

    invoke-virtual {v6}, LTq4;->f8()LZ84;

    move-result-object v6

    invoke-virtual {v6}, LZ84;->a()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v6}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v6

    invoke-virtual {v6}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object v11

    iget-object v6, v0, LJ14$j;->g:LJ14;

    invoke-static {v6}, LJ14;->access$getLatestPreloadOptionsAvailable$p(LJ14;)Li04;

    move-result-object v6

    const/4 v14, 0x1

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Li04;->e()Z

    move-result v6

    if-ne v6, v14, :cond_0

    move v12, v14

    goto :goto_0

    :cond_0
    move v12, v5

    :goto_0
    iget-object v6, v0, LJ14$j;->g:LJ14;

    invoke-static {v6}, LJ14;->access$getLatestPreloadOptionsAvailable$p(LJ14;)Li04;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Li04;->d()Z

    move-result v6

    if-ne v6, v14, :cond_1

    move v13, v14

    goto :goto_1

    :cond_1
    move v13, v5

    :goto_1
    if-nez v3, :cond_2

    move/from16 v16, v14

    goto :goto_2

    :cond_2
    move/from16 v16, v5

    :goto_2
    iget-object v6, v0, LJ14$j;->g:LJ14;

    invoke-static {v6}, LJ14;->access$getLatestPreloadOptionsAvailable$p(LJ14;)Li04;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Li04;->f()Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    :cond_3
    const/4 v6, 0x0

    :goto_3
    move-object/from16 v17, v6

    const/16 v18, 0x0

    iget-object v6, v0, LJ14$j;->g:LJ14;

    invoke-static {v6}, LJ14;->access$getPreference$p(LJ14;)Lgl;

    move-result-object v6

    invoke-virtual {v6}, Lgl;->m0()Ljava/lang/Boolean;

    move-result-object v19

    const/16 v20, 0x407

    const/16 v21, 0x0

    move-object v6, v15

    move/from16 v22, v14

    move/from16 v14, v16

    move-object v5, v15

    move-object/from16 v15, v17

    move-object/from16 v16, v3

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move/from16 v19, v20

    move-object/from16 v20, v21

    invoke-direct/range {v6 .. v20}, Lr04;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v4, v5}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    if-nez v3, :cond_4

    iget-object v1, v0, LJ14$j;->g:LJ14;

    invoke-static {v1}, LJ14;->access$getPreference$p(LJ14;)Lgl;

    move-result-object v1

    invoke-virtual {v1}, Lgl;->z2()V

    iget-object v1, v0, LJ14$j;->g:LJ14;

    invoke-static {v1}, LJ14;->access$getPreference$p(LJ14;)Lgl;

    move-result-object v1

    invoke-virtual {v1}, Lgl;->n()V

    iget-object v1, v0, LJ14$j;->g:LJ14;

    invoke-static {v1}, LJ14;->access$getPreference$p(LJ14;)Lgl;

    move-result-object v1

    invoke-virtual {v1}, Lgl;->m()V

    iget-object v1, v0, LJ14$j;->g:LJ14;

    invoke-static {v1}, LJ14;->access$getNavigator$p(LJ14;)Le13;

    move-result-object v1

    const/4 v2, -0x1

    invoke-interface {v1, v2}, Le13;->b1(I)V

    goto/16 :goto_7

    :cond_4
    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v1, v0, LJ14$j;->h:LK14;

    sget v4, Lnl4;->preload_amount_titlecased:I

    invoke-interface {v1, v4}, LK14;->u5(I)Ljava/lang/String;

    move-result-object v1

    iget-object v4, v0, LJ14$j;->h:LK14;

    new-instance v5, LU84;

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v3, 0x2

    new-array v3, v3, [Lkotlin/Pair;

    const-string v6, "key_option_id_selected"

    invoke-virtual {v2}, LS04;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v6, 0x0

    aput-object v2, v3, v6

    iget-object v2, v0, LJ14$j;->h:LK14;

    invoke-interface {v2}, LK14;->U7()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_4

    :cond_5
    move v2, v6

    :goto_4
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v6, "key_auto_reload_toggled"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v3, v22

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {v5, v1, v2}, LU84;-><init>(Ljava/util/List;Ljava/util/Map;)V

    invoke-interface {v4, v5}, Lrx4;->render(Ljava/lang/Object;)V

    goto :goto_7

    :cond_6
    const/4 v6, 0x0

    iget-object v1, v0, LJ14$j;->h:LK14;

    invoke-interface {v1}, LK14;->U7()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v0, LJ14$j;->g:LJ14;

    invoke-static {v1}, LJ14;->access$getPaymentMethodManager$p(LJ14;)LzN3;

    move-result-object v1

    invoke-interface {v1}, LzN3;->c()Ljava/util/Set;

    move-result-object v1

    goto :goto_5

    :cond_7
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v1

    :goto_5
    iget-object v2, v0, LJ14$j;->h:LK14;

    new-instance v3, LS84;

    iget-object v4, v0, LJ14$j;->g:LJ14;

    invoke-interface {v2}, LK14;->U7()Ljava/lang/Boolean;

    move-result-object v5

    if-eqz v5, :cond_8

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    goto :goto_6

    :cond_8
    move v5, v6

    :goto_6
    invoke-direct {v3, v4, v1, v5}, LS84;-><init>(LZg3;Ljava/util/Set;Z)V

    invoke-interface {v2, v3}, Lrx4;->render(Ljava/lang/Object;)V

    :goto_7
    return-void
.end method
