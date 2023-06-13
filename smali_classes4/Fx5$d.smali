.class public final LFx5$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFx5;->x(Lcom/google/android/gms/wallet/PaymentData;Lco/bird/android/model/PaymentAddSource;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/model/PaymentMethod;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/stripe/android/model/PaymentMethod;",
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
        "SMAP\nSetupIntentManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetupIntentManagerImpl.kt\nco/bird/android/manager/stripe/SetupIntentManagerImpl$createGooglePayPaymentMethod$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n1#2:266\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LFx5;

.field public final synthetic h:Lco/bird/android/model/PaymentAddSource;


# direct methods
.method public constructor <init>(LFx5;Lco/bird/android/model/PaymentAddSource;)V
    .locals 0

    iput-object p1, p0, LFx5$d;->g:LFx5;

    iput-object p2, p0, LFx5$d;->h:Lco/bird/android/model/PaymentAddSource;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/model/PaymentMethod;

    invoke-virtual {p0, p1}, LFx5$d;->invoke(Lcom/stripe/android/model/PaymentMethod;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, LFx5$d;->g:LFx5;

    invoke-static {v1}, LFx5;->access$getUserManager$p(LFx5;)Llh6;

    move-result-object v1

    invoke-interface {v1}, Llh6;->K()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/Balance;

    iget-object v2, v0, LFx5$d;->g:LFx5;

    invoke-static {v2}, LFx5;->access$getAnalyticsManager$p(LFx5;)LEa;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v3, v0, LFx5$d;->g:LFx5;

    invoke-static {v3}, LFx5;->access$getPreference$p(LFx5;)Lgl;

    move-result-object v3

    invoke-virtual {v3}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object v3

    invoke-static {v3}, Lco/bird/android/model/UserKt;->isInRegistration(Lco/bird/android/model/User;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    iget-object v3, v0, LFx5$d;->h:Lco/bird/android/model/PaymentAddSource;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    move-object v9, v3

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    :goto_0
    const-string v10, "stripe"

    const-string v11, "google_pay"

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lco/bird/android/model/Balance;->getAutoPayActive()Ljava/lang/Boolean;

    move-result-object v3

    move-object v12, v3

    goto :goto_1

    :cond_1
    const/4 v12, 0x0

    :goto_1
    iget-object v3, v0, LFx5$d;->g:LFx5;

    invoke-static {v3}, LFx5;->access$getReactiveConfig$p(LFx5;)LTq4;

    move-result-object v3

    invoke-virtual {v3}, LTq4;->f8()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/RideConfig;->getAutoPayPlans()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_6

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Lco/bird/android/model/wire/configs/AutoPayPlanConfig;

    const/4 v15, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {v14}, Lco/bird/android/model/wire/configs/AutoPayPlanConfig;->getRefillAmount()I

    move-result v14

    invoke-virtual {v1}, Lco/bird/android/model/Balance;->getAutoPayRefillAmount()Ljava/lang/Integer;

    move-result-object v16

    if-nez v16, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v14, v8, :cond_4

    const/4 v15, 0x1

    :cond_4
    :goto_2
    if-eqz v15, :cond_2

    goto :goto_3

    :cond_5
    const/4 v13, 0x0

    :goto_3
    check-cast v13, Lco/bird/android/model/wire/configs/AutoPayPlanConfig;

    if-eqz v13, :cond_6

    invoke-virtual {v13}, Lco/bird/android/model/wire/configs/AutoPayPlanConfig;->getId()Ljava/lang/String;

    move-result-object v3

    move-object v13, v3

    goto :goto_4

    :cond_6
    const/4 v13, 0x0

    :goto_4
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lco/bird/android/model/Balance;->getAutoPayRefillAmount()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-long v14, v3

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    move-object v14, v3

    goto :goto_5

    :cond_7
    const/4 v14, 0x0

    :goto_5
    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lco/bird/android/model/Balance;->getCurrency()Ljava/lang/String;

    move-result-object v3

    move-object v15, v3

    goto :goto_6

    :cond_8
    const/4 v15, 0x0

    :goto_6
    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lco/bird/android/model/Balance;->getAutoPayIncentiveAmount()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move-object/from16 v20, v7

    int-to-long v6, v1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_7

    :cond_9
    move-object/from16 v20, v7

    const/4 v1, 0x0

    :goto_7
    iget-object v3, v0, LFx5$d;->g:LFx5;

    invoke-static {v3}, LFx5;->access$getReactiveConfig$p(LFx5;)LTq4;

    move-result-object v3

    invoke-virtual {v3}, LTq4;->f8()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/Config;->getPaymentConfig()Lco/bird/android/model/wire/configs/PaymentConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/PaymentConfig;->getDeviceVerificationMethod()Lco/bird/android/model/constant/DeviceVerificationMethod;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    iget-object v3, v0, LFx5$d;->g:LFx5;

    invoke-static {v3}, LFx5;->access$getBirdDeviceCheckManager$p(LFx5;)LfL;

    move-result-object v3

    invoke-interface {v3}, LfL;->c()Ljava/lang/Double;

    move-result-object v17

    const/16 v18, 0x7

    const/16 v19, 0x0

    new-instance v7, LtN3;

    move-object v3, v7

    const/4 v6, 0x0

    move-object v8, v7

    move-object/from16 v7, v20

    move-object/from16 v21, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move-object v15, v1

    invoke-direct/range {v3 .. v19}, LtN3;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v21

    invoke-interface {v2, v1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method
