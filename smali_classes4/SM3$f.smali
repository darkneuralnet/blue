.class public final LSM3$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSM3;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/PaymentProvider;Lco/bird/android/model/PaymentAddSource;)Lio/reactivex/c;
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
        "LHM4<",
        "Lco/bird/api/request/SetDefaultProviderBody;",
        ">;+",
        "Ljava/lang/String;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003 \u0004*\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "LHM4;",
        "Lco/bird/api/request/SetDefaultProviderBody;",
        "",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
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
.field public final synthetic g:LSM3;


# direct methods
.method public constructor <init>(LSM3;)V
    .locals 0

    iput-object p1, p0, LSM3$f;->g:LSM3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LSM3$f;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "LHM4<",
            "Lco/bird/api/request/SetDefaultProviderBody;",
            ">;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LHM4;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v1}, LHM4;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v13, :cond_0

    iget-object v1, v0, LSM3$f;->g:LSM3;

    const/4 v2, 0x0

    invoke-static {v1, v2}, LSM3;->access$setDefaultStripePaymentMethodId$p(LSM3;Ljava/lang/String;)V

    iget-object v1, v0, LSM3$f;->g:LSM3;

    invoke-static {v1}, LSM3;->access$getMutableDefaultBirdPayment$p(LSM3;)La94;

    move-result-object v1

    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    sget-object v7, Lco/bird/android/model/constant/PaymentGatewayKind;->BRAINTREE:Lco/bird/android/model/constant/PaymentGatewayKind;

    sget-object v15, Lco/bird/android/model/constant/PaymentMethod;->PAYPAL:Lco/bird/android/model/constant/PaymentMethod;

    new-instance v14, Lco/bird/android/model/BirdPayment;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x5f7

    const/16 v18, 0x0

    move-object v3, v14

    move-object/from16 v19, v14

    move-object/from16 v14, v16

    move/from16 v16, v17

    move-object/from16 v17, v18

    invoke-direct/range {v3 .. v17}, Lco/bird/android/model/BirdPayment;-><init>(Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Card;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/PaymentMethod;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v19

    invoke-virtual {v2, v3}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-virtual {v1, v2}, La94;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v1, v0, LSM3$f;->g:LSM3;

    invoke-static {v1}, LSM3;->access$getMutableDefaultBirdPayment$p(LSM3;)La94;

    move-result-object v1

    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-virtual {v1, v2}, La94;->accept(Ljava/lang/Object;)V

    :goto_0
    iget-object v1, v0, LSM3$f;->g:LSM3;

    invoke-static {v1}, LSM3;->access$getAnalyticsManager$p(LSM3;)LEa;

    move-result-object v1

    new-instance v8, LFP3;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, LFP3;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v8}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    goto :goto_1

    :cond_1
    iget-object v1, v0, LSM3$f;->g:LSM3;

    invoke-static {v1}, LSM3;->access$getAnalyticsManager$p(LSM3;)LEa;

    move-result-object v1

    new-instance v8, LGP3;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, LGP3;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v8}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :goto_1
    return-void
.end method
