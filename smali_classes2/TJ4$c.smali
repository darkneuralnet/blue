.class public final LTJ4$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTJ4;->I()Lio/reactivex/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "error",
        "",
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


# instance fields
.field public final synthetic g:LTJ4;


# direct methods
.method public constructor <init>(LTJ4;)V
    .locals 0

    iput-object p1, p0, LTJ4$c;->g:LTJ4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LTJ4$c;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "checkRequirementsInternal() threw error: "

    invoke-static {v1, v4, v3}, Lg46;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, v0, LTJ4$c;->g:LTJ4;

    invoke-static {v3}, LTJ4;->access$getRideMapStateManager$p(LTJ4;)LpU4;

    move-result-object v3

    sget-object v4, Lco/bird/android/model/RideMapState;->SCANNED:Lco/bird/android/model/RideMapState;

    invoke-interface {v3, v4}, LpU4;->o(Lco/bird/android/model/RideMapState;)V

    iget-object v3, v0, LTJ4$c;->g:LTJ4;

    const-string v4, "error"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v1}, LTJ4;->access$onRideError(LTJ4;Ljava/lang/Throwable;)V

    iget-object v3, v0, LTJ4$c;->g:LTJ4;

    invoke-static {v3}, LTJ4;->access$getRequirementManager$p(LTJ4;)LJ35;

    move-result-object v3

    invoke-interface {v3}, LJ35;->g()LJ35$a;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, LJ35$a;->c()Lco/bird/android/model/constant/RideRequirementReason;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    sget-object v5, Lco/bird/android/model/constant/RideRequirementReason;->RIDE:Lco/bird/android/model/constant/RideRequirementReason;

    if-ne v3, v5, :cond_f

    iget-object v3, v0, LTJ4$c;->g:LTJ4;

    invoke-static {v3}, LTJ4;->access$getReactiveConfig$p(LTJ4;)LTq4;

    move-result-object v3

    invoke-virtual {v3}, LTq4;->f8()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v3

    iget-object v5, v0, LTJ4$c;->g:LTJ4;

    invoke-static {v5}, LTJ4;->access$getRequirementManager$p(LTJ4;)LJ35;

    move-result-object v6

    invoke-interface {v6}, LJ35;->g()LJ35$a;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v6}, LJ35$a;->b()Lco/bird/android/model/wire/WireBird;

    move-result-object v6

    goto :goto_1

    :cond_1
    move-object v6, v4

    :goto_1
    invoke-static {v5}, LTJ4;->access$getAnalyticsManager$p(LTJ4;)LEa;

    move-result-object v7

    new-instance v15, LV55;

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v6, :cond_2

    invoke-static {v5}, LTJ4;->access$getReactiveConfig$p(LTJ4;)LTq4;

    move-result-object v8

    invoke-static {v8, v6}, LUq4;->c(LTq4;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v8

    invoke-static {v6, v8}, Lco/bird/android/model/wire/WireBirdKt;->canTreatAsBluetooth(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/configs/Config;)Z

    move-result v8

    move v12, v8

    goto :goto_2

    :cond_2
    move v12, v2

    :goto_2
    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lco/bird/android/model/wire/WireBird;->getCellular()Z

    move-result v8

    move v13, v8

    goto :goto_3

    :cond_3
    move v13, v2

    :goto_3
    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lco/bird/android/model/wire/WireBird;->getPrivateBird()Lco/bird/android/model/wire/WirePrivateBird;

    move-result-object v8

    goto :goto_4

    :cond_4
    move-object v8, v4

    :goto_4
    if-eqz v8, :cond_5

    const/4 v2, 0x1

    :cond_5
    move v14, v2

    const-string v2, ""

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_6

    goto :goto_5

    :cond_6
    move-object/from16 v16, v8

    goto :goto_6

    :cond_7
    :goto_5
    move-object/from16 v16, v2

    :goto_6
    if-eqz v6, :cond_9

    invoke-virtual {v6}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_8

    goto :goto_7

    :cond_8
    move-object v2, v8

    :cond_9
    :goto_7
    if-eqz v6, :cond_a

    invoke-virtual {v6}, Lco/bird/android/model/wire/WireBird;->getPartnerId()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v17, v6

    goto :goto_8

    :cond_a
    move-object/from16 v17, v4

    :goto_8
    invoke-static/range {p1 .. p1}, LQ36;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/RideConfig;->getBasePrice()J

    move-result-wide v19

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/RideConfig;->getMinutePrice()J

    move-result-wide v21

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/RideConfig;->getMinimumRidePrice()J

    move-result-wide v23

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/RideConfig;->getIncludedMinutes()I

    move-result v6

    move/from16 v26, v12

    int-to-long v11, v6

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/RideConfig;->getAdditionalFees()Lco/bird/android/model/wire/configs/AdditionalFeesConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/AdditionalFeesConfig;->getApplyTax()Z

    move-result v27

    invoke-static {v5}, LTJ4;->access$getUserManager$p(LTJ4;)Llh6;

    move-result-object v3

    invoke-interface {v3}, Llh6;->K()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/buava/Optional;

    invoke-virtual {v3}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/Balance;

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Lco/bird/android/model/Balance;->getBalance()J

    move-result-wide v28

    invoke-static/range {v28 .. v29}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object/from16 v28, v3

    goto :goto_9

    :cond_b
    move-object/from16 v28, v4

    :goto_9
    invoke-static {v5}, LTJ4;->access$getPaymentMethodManager$p(LTJ4;)LzN3;

    move-result-object v3

    invoke-interface {v3}, LzN3;->a()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/buava/Optional;

    invoke-virtual {v3}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/BirdPayment;

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Lco/bird/android/model/BirdPayment;->vendor()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v29, v3

    goto :goto_a

    :cond_c
    move-object/from16 v29, v4

    :goto_a
    invoke-static {v5}, LTJ4;->access$getPaymentMethodManager$p(LTJ4;)LzN3;

    move-result-object v3

    invoke-interface {v3}, LzN3;->a()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/buava/Optional;

    invoke-virtual {v3}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/BirdPayment;

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Lco/bird/android/model/BirdPayment;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v30, v3

    goto :goto_b

    :cond_d
    move-object/from16 v30, v4

    :goto_b
    invoke-static {v5}, LTJ4;->access$getUserManager$p(LTJ4;)Llh6;

    move-result-object v3

    invoke-interface {v3}, Llh6;->K()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/buava/Optional;

    invoke-virtual {v3}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/Balance;

    if-eqz v3, :cond_e

    invoke-virtual {v3}, Lco/bird/android/model/Balance;->getAutoPayActive()Ljava/lang/Boolean;

    move-result-object v4

    :cond_e
    move-object/from16 v31, v4

    invoke-static/range {p1 .. p1}, LQ36;->b(Ljava/lang/Throwable;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v32

    const-string v33, "ride_requirements"

    const/16 v34, 0x0

    const/16 v35, 0x0

    const v36, 0x600007

    const/16 v37, 0x0

    move-object v8, v15

    move-wide v3, v11

    const/4 v1, 0x0

    move-object v11, v1

    move/from16 v12, v26

    move-object v1, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v2

    move-wide/from16 v25, v3

    invoke-direct/range {v8 .. v37}, LV55;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v7, v1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_f
    return-void
.end method
