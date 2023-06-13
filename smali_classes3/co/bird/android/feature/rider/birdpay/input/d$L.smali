.class public final Lco/bird/android/feature/rider/birdpay/input/d$L;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/birdpay/input/d;->a()V
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
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        ">;+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/wire/WireCoupon;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012v\u0010\u0002\u001ar\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0006*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004 \u0006*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0006*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/wire/WireCoupon;",
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
.field public final synthetic g:Lco/bird/android/feature/rider/birdpay/input/d;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/rider/birdpay/input/d;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$L;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/birdpay/input/d$L;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireCoupon;",
            ">;>;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->c()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireMerchantSite;

    iget-object v3, v0, Lco/bird/android/feature/rider/birdpay/input/d$L;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v3}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getParameters$p(Lco/bird/android/feature/rider/birdpay/input/d;)Lco/bird/android/feature/rider/birdpay/input/d$a;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/feature/rider/birdpay/input/d$a;->b()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "scanner"

    goto :goto_0

    :cond_0
    const-string v3, "merchant_scanner"

    :goto_0
    move-object v8, v3

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->c()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireCoupon;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireCoupon;->getMaxAmount()I

    move-result v2

    int-to-long v2, v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    move-object v13, v2

    iget-object v2, v0, Lco/bird/android/feature/rider/birdpay/input/d$L;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v2}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getAnalyticsManager$p(Lco/bird/android/feature/rider/birdpay/input/d;)LEa;

    move-result-object v2

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireMerchantSite;->getMerchant()Lco/bird/android/model/wire/WireMerchantDescription;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireMerchantDescription;->getId()Ljava/lang/String;

    move-result-object v10

    iget-object v3, v0, Lco/bird/android/feature/rider/birdpay/input/d$L;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v3}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getParameters$p(Lco/bird/android/feature/rider/birdpay/input/d;)Lco/bird/android/feature/rider/birdpay/input/d$a;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/feature/rider/birdpay/input/d$a;->c()Ljava/lang/String;

    move-result-object v11

    iget-object v3, v0, Lco/bird/android/feature/rider/birdpay/input/d$L;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v3}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getParameters$p(Lco/bird/android/feature/rider/birdpay/input/d;)Lco/bird/android/feature/rider/birdpay/input/d$a;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/feature/rider/birdpay/input/d$a;->d()Ljava/lang/String;

    move-result-object v12

    iget-object v3, v0, Lco/bird/android/feature/rider/birdpay/input/d$L;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v3}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getReactiveConfig$p(Lco/bird/android/feature/rider/birdpay/input/d;)LTq4;

    move-result-object v3

    invoke-virtual {v3}, LTq4;->f8()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/Config;->getBirdPayConfig()Lco/bird/android/model/wire/configs/BirdPayConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/BirdPayConfig;->getEnablePaymentPassthrough()Z

    move-result v3

    iget-object v4, v0, Lco/bird/android/feature/rider/birdpay/input/d$L;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v4}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getMerchantCurrency$p(Lco/bird/android/feature/rider/birdpay/input/d;)Ljava/util/Currency;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/Currency;->toString()Ljava/lang/String;

    move-result-object v14

    new-instance v15, LsO;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    const/4 v3, 0x7

    const/16 v16, 0x0

    move-object v4, v15

    move-object/from16 v17, v15

    move v15, v3

    invoke-direct/range {v4 .. v16}, LsO;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v17

    invoke-interface {v2, v3}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object v2, v0, Lco/bird/android/feature/rider/birdpay/input/d$L;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v2}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getUi$p(Lco/bird/android/feature/rider/birdpay/input/d;)LbO;

    move-result-object v2

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireMerchantSite;->getMerchant()Lco/bird/android/model/wire/WireMerchantDescription;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireMerchantDescription;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, LbO;->C2(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    iget-object v1, v0, Lco/bird/android/feature/rider/birdpay/input/d$L;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v1}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getNavigator$p(Lco/bird/android/feature/rider/birdpay/input/d;)Le13;

    move-result-object v1

    invoke-interface {v1}, Le13;->close()V

    :goto_2
    return-void
.end method
