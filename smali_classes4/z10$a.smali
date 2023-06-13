.class public final Lz10$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz10;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/PaymentProvider;Lco/bird/android/model/PaymentAddSource;)Lio/reactivex/F;
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
        "Lco/bird/api/request/BirdCustomer;",
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
        "Lco/bird/api/request/BirdCustomer;",
        "kotlin.jvm.PlatformType",
        "it",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBrainTreeManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrainTreeManagerImpl.kt\nco/bird/android/manager/braintree/BrainTreeManagerImpl$createBraintreeCustomerAndSetDefault$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lz10;

.field public final synthetic h:Lco/bird/android/model/PaymentAddSource;


# direct methods
.method public constructor <init>(Lz10;Lco/bird/android/model/PaymentAddSource;)V
    .locals 0

    iput-object p1, p0, Lz10$a;->g:Lz10;

    iput-object p2, p0, Lz10$a;->h:Lco/bird/android/model/PaymentAddSource;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/api/request/BirdCustomer;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lz10$a;->g:Lz10;

    invoke-static {v1}, Lz10;->access$getUserManager$p(Lz10;)Llh6;

    move-result-object v1

    invoke-interface {v1}, Llh6;->K()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/Balance;

    iget-object v2, v0, Lz10$a;->g:Lz10;

    invoke-static {v2}, Lz10;->access$getAnalyticsManager$p(Lz10;)LEa;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v3, v0, Lz10$a;->g:Lz10;

    invoke-static {v3}, Lz10;->access$getPreference$p(Lz10;)Lgl;

    move-result-object v3

    invoke-virtual {v3}, Lgl;->B0()Lco/bird/android/model/User;

    move-result-object v3

    invoke-static {v3}, Lco/bird/android/model/UserKt;->isInRegistration(Lco/bird/android/model/User;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    iget-object v3, v0, Lz10$a;->h:Lco/bird/android/model/PaymentAddSource;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    move-object v9, v3

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    :goto_0
    const-string v10, "paypal"

    const-string v11, "paypal"

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lco/bird/android/model/Balance;->getAutoPayActive()Ljava/lang/Boolean;

    move-result-object v3

    move-object v12, v3

    goto :goto_1

    :cond_1
    const/4 v12, 0x0

    :goto_1
    iget-object v3, v0, Lz10$a;->g:Lz10;

    invoke-static {v3}, Lz10;->access$getReactiveConfig$p(Lz10;)LTq4;

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
    iget-object v3, v0, Lz10$a;->g:Lz10;

    invoke-static {v3}, Lz10;->access$getReactiveConfig$p(Lz10;)LTq4;

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

    iget-object v3, v0, Lz10$a;->g:Lz10;

    invoke-static {v3}, Lz10;->access$getBirdDeviceCheckManager$p(Lz10;)LfL;

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

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, Lz10$a;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
