.class public final Lco/bird/android/feature/rider/birdpay/input/d$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/birdpay/input/d;->V()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "+",
        "Lco/bird/android/model/Balance;",
        "+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "Lco/bird/android/model/Balance;",
        "",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "b",
        "(Lkotlin/Triple;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/rider/birdpay/input/d;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/rider/birdpay/input/d;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$g;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/feature/rider/birdpay/input/d;Lco/bird/android/model/Balance;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/birdpay/input/d$g;->c(Lco/bird/android/feature/rider/birdpay/input/d;Lco/bird/android/model/Balance;)V

    return-void
.end method

.method public static final c(Lco/bird/android/feature/rider/birdpay/input/d;Lco/bird/android/model/Balance;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$userBalance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getNavigator$p(Lco/bird/android/feature/rider/birdpay/input/d;)Le13;

    move-result-object v0

    invoke-static {p0}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getReactiveConfig$p(Lco/bird/android/feature/rider/birdpay/input/d;)LTq4;

    move-result-object v1

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v1

    invoke-static {p0}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getPaymentMethodManager$p(Lco/bird/android/feature/rider/birdpay/input/d;)LzN3;

    move-result-object p0

    invoke-interface {p0}, LzN3;->a()LZ84;

    move-result-object p0

    invoke-virtual {p0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/buava/Optional;

    invoke-virtual {p0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/BirdPayment;

    sget-object v2, LBI4;->b:LBI4;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-interface {v0, v1, p1, p0, v2}, Le13;->R0(Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/Balance;Lco/bird/android/model/BirdPayment;I)V

    return-void
.end method


# virtual methods
.method public final b(Lkotlin/Triple;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            "Lco/bird/android/model/Balance;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireMerchantSite;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/Balance;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$g;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    sget v1, Lnl4;->merchant_input_payment_low_balance:I

    invoke-static {p1, v1}, Lco/bird/android/feature/rider/birdpay/input/d;->access$onPayError(Lco/bird/android/feature/rider/birdpay/input/d;I)V

    iget-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$g;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {p1}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getHandler$p(Lco/bird/android/feature/rider/birdpay/input/d;)Landroid/os/Handler;

    move-result-object p1

    iget-object v1, p0, Lco/bird/android/feature/rider/birdpay/input/d$g;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    new-instance v2, LVN;

    invoke-direct {v2, v1, v0}, LVN;-><init>(Lco/bird/android/feature/rider/birdpay/input/d;Lco/bird/android/model/Balance;)V

    const-wide/16 v0, 0x7d0

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$g;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {p1}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getUi$p(Lco/bird/android/feature/rider/birdpay/input/d;)LbO;

    move-result-object p1

    invoke-interface {p1}, LbO;->Uh()V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/birdpay/input/d$g;->b(Lkotlin/Triple;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
