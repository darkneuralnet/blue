.class public final LJ14$p;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ14;->U()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Lco/bird/api/request/BraintreeTokenResponse;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/api/request/BraintreeTokenResponse;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(LHM4;)V"
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


# direct methods
.method public constructor <init>(LJ14;)V
    .locals 0

    iput-object p1, p0, LJ14$p;->g:LJ14;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/api/request/BraintreeTokenResponse;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, LHM4;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual/range {p1 .. p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/api/request/BraintreeTokenResponse;

    if-eqz v1, :cond_6

    iget-object v2, v0, LJ14$p;->g:LJ14;

    new-instance v3, LyE0;

    invoke-virtual {v1}, Lco/bird/api/request/BraintreeTokenResponse;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, LyE0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lf1;->h(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    iget-object v1, v0, LJ14$p;->g:LJ14;

    invoke-static {v1}, LJ14;->access$getAnalyticsManager$p(LJ14;)LEa;

    move-result-object v1

    new-instance v14, Ls04;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v2, v0, LJ14$p;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getContextForAnalytics$p(LJ14;)Ljava/lang/String;

    move-result-object v6

    iget-object v2, v0, LJ14$p;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getReactiveConfig$p(LJ14;)LTq4;

    move-result-object v2

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object v7

    iget-object v2, v0, LJ14$p;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getLatestPreloadOptionsAvailable$p(LJ14;)Li04;

    move-result-object v2

    const/4 v8, 0x1

    const/4 v13, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Li04;->e()Z

    move-result v2

    if-ne v2, v8, :cond_1

    move v9, v8

    goto :goto_0

    :cond_1
    move v9, v13

    :goto_0
    iget-object v2, v0, LJ14$p;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getLatestPreloadOptionsAvailable$p(LJ14;)Li04;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Li04;->d()Z

    move-result v2

    if-ne v2, v8, :cond_2

    move v10, v8

    goto :goto_1

    :cond_2
    move v10, v13

    :goto_1
    iget-object v2, v0, LJ14$p;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getLatestPreloadOptionsAvailable$p(LJ14;)Li04;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Li04;->f()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    const-string v11, "_included_pay_per_ride"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual/range {p1 .. p1}, LHM4;->e()Lokhttp3/ResponseBody;

    move-result-object v2

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "Braintree / Paypal token error: "

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, LHM4;->b()I

    move-result v2

    move/from16 v19, v9

    int-to-long v8, v2

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v20

    iget-object v2, v0, LJ14$p;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getLatestPreloadOptionsAvailable$p(LJ14;)Li04;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Li04;->f()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v21, v2

    goto :goto_3

    :cond_4
    const/16 v21, 0x0

    :goto_3
    iget-object v2, v0, LJ14$p;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getCurrentOptionModelSelected$p(LJ14;)Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LS04;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, LS04;->b()Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v22, v2

    goto :goto_4

    :cond_5
    const/16 v22, 0x0

    :goto_4
    const/4 v15, 0x0

    iget-object v2, v0, LJ14$p;->g:LJ14;

    invoke-static {v2}, LJ14;->access$getPreference$p(LJ14;)Lgl;

    move-result-object v2

    invoke-virtual {v2}, Lgl;->m0()Ljava/lang/Boolean;

    move-result-object v16

    const/16 v17, 0x1007

    const/16 v18, 0x0

    move-object v2, v14

    move/from16 v8, v19

    move v9, v10

    move v10, v11

    move-object v11, v12

    move-object/from16 v12, v20

    move-object/from16 v13, v21

    move-object v0, v14

    move-object/from16 v14, v22

    invoke-direct/range {v2 .. v18}, Ls04;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v0}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    move-object/from16 v0, p0

    iget-object v1, v0, LJ14$p;->g:LJ14;

    new-instance v2, LIt2;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, LIt2;-><init>(Z)V

    invoke-virtual {v1, v2}, Lf1;->h(Ljava/lang/Object;)V

    iget-object v1, v0, LJ14$p;->g:LJ14;

    new-instance v2, Lqg1;

    sget v3, Lnl4;->error_generic_body:I

    invoke-direct {v2, v3}, Lqg1;-><init>(I)V

    invoke-virtual {v1, v2}, Lf1;->h(Ljava/lang/Object;)V

    :cond_6
    :goto_5
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LJ14$p;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
