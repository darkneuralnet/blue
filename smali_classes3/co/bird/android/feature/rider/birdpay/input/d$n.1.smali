.class public final Lco/bird/android/feature/rider/birdpay/input/d$n;
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
        "Lwb4<",
        "+",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "+",
        "Lco/bird/android/model/Balance;",
        "+",
        "Ljava/lang/Integer;",
        "+",
        "LHM4<",
        "LuL3;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\t\u001a\u00020\u00082J\u0010\u0007\u001aF\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "Lwb4;",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "Lco/bird/android/model/Balance;",
        "",
        "LHM4;",
        "LuL3;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "b",
        "(Lwb4;)V"
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

    iput-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$n;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/feature/rider/birdpay/input/d;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/feature/rider/birdpay/input/d$n;->c(Lco/bird/android/feature/rider/birdpay/input/d;)V

    return-void
.end method

.method public static final c(Lco/bird/android/feature/rider/birdpay/input/d;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getNavigator$p(Lco/bird/android/feature/rider/birdpay/input/d;)Le13;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v2}, Le13$a;->goToPayment$default(Le13;Ljava/lang/Integer;ZILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b(Lwb4;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwb4<",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            "Lco/bird/android/model/Balance;",
            "Ljava/lang/Integer;",
            "LHM4<",
            "LuL3;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lwb4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireMerchantSite;

    invoke-virtual {p1}, Lwb4;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/Balance;

    invoke-virtual {p1}, Lwb4;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {p1}, Lwb4;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LHM4;

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LuL3;

    invoke-virtual {p1}, LHM4;->f()Z

    move-result v4

    if-eqz v4, :cond_0

    if-eqz v3, :cond_0

    iget-object v5, p0, Lco/bird/android/feature/rider/birdpay/input/d$n;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    int-to-long v6, v2

    invoke-virtual {v1}, Lco/bird/android/model/Balance;->getBalance()J

    move-result-wide v8

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireMerchantSite;->getMerchant()Lco/bird/android/model/wire/WireMerchantDescription;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantDescription;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireMerchantSite;->getId()Ljava/lang/String;

    move-result-object v11

    iget-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$n;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {p1}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getParameters$p(Lco/bird/android/feature/rider/birdpay/input/d;)Lco/bird/android/feature/rider/birdpay/input/d$a;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/feature/rider/birdpay/input/d$a;->d()Ljava/lang/String;

    move-result-object v12

    invoke-static/range {v5 .. v12}, Lco/bird/android/feature/rider/birdpay/input/d;->access$trackPaymentSuccess(Lco/bird/android/feature/rider/birdpay/input/d;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$n;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {p1}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getPaymentSuccessSubject$p(Lco/bird/android/feature/rider/birdpay/input/d;)LAG;

    move-result-object p1

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    new-instance v2, Lco/bird/android/feature/rider/birdpay/input/d$b;

    invoke-virtual {v3}, LuL3;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireMerchantSite;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, LuL3;->e()J

    move-result-wide v7

    invoke-virtual {v3}, LuL3;->b()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v3}, LuL3;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3}, LuL3;->d()Lorg/joda/time/DateTime;

    move-result-object v11

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/input/d$n;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v0}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getParameters$p(Lco/bird/android/feature/rider/birdpay/input/d;)Lco/bird/android/feature/rider/birdpay/input/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/feature/rider/birdpay/input/d$a;->d()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3}, LuL3;->f()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    move-object v4, v2

    invoke-direct/range {v4 .. v13}, Lco/bird/android/feature/rider/birdpay/input/d$b;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {v1, v2}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-virtual {p1, v0}, LAG;->accept(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    const-string v3, "response"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LNM4;->d(LHM4;)Ltg1;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ltg1;->c()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, Lco/bird/android/feature/rider/birdpay/input/d$n;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    int-to-long v6, v2

    invoke-virtual {v1}, Lco/bird/android/model/Balance;->getBalance()J

    move-result-wide v8

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireMerchantSite;->getMerchant()Lco/bird/android/model/wire/WireMerchantDescription;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireMerchantDescription;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireMerchantSite;->getId()Ljava/lang/String;

    move-result-object v11

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/input/d$n;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {v0}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getParameters$p(Lco/bird/android/feature/rider/birdpay/input/d;)Lco/bird/android/feature/rider/birdpay/input/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/feature/rider/birdpay/input/d$a;->d()Ljava/lang/String;

    move-result-object v12

    move-object v5, v3

    invoke-static/range {v4 .. v12}, Lco/bird/android/feature/rider/birdpay/input/d;->access$trackPaymentError(Lco/bird/android/feature/rider/birdpay/input/d;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, LHM4;->b()I

    move-result p1

    const/16 v0, 0x192

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$n;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    sget v0, Lnl4;->merchant_input_payment_invalid_payment_error:I

    invoke-static {p1, v0}, Lco/bird/android/feature/rider/birdpay/input/d;->access$onPayError(Lco/bird/android/feature/rider/birdpay/input/d;I)V

    iget-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$n;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {p1}, Lco/bird/android/feature/rider/birdpay/input/d;->access$getHandler$p(Lco/bird/android/feature/rider/birdpay/input/d;)Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/input/d$n;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    new-instance v1, LXN;

    invoke-direct {v1, v0}, LXN;-><init>(Lco/bird/android/feature/rider/birdpay/input/d;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lco/bird/android/feature/rider/birdpay/input/d$n;->g:Lco/bird/android/feature/rider/birdpay/input/d;

    invoke-static {p1, v3}, Lco/bird/android/feature/rider/birdpay/input/d;->access$onPayError(Lco/bird/android/feature/rider/birdpay/input/d;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwb4;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/birdpay/input/d$n;->b(Lwb4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
