.class public final LoP3$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoP3;->b(Landroid/content/Intent;)V
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
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/PaymentInfo;",
        ">;+",
        "LqY0;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/BirdPayment;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\t\u001a\u00020\u00082Z\u0010\u0007\u001aV\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005 \u0004**\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/PaymentInfo;",
        "LqY0;",
        "kotlin.jvm.PlatformType",
        "",
        "Lco/bird/android/model/BirdPayment;",
        "<name for destructuring parameter 0>",
        "",
        "a",
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
.field public final synthetic g:LoP3;


# direct methods
.method public constructor <init>(LoP3;)V
    .locals 0

    iput-object p1, p0, LoP3$n;->g:LoP3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/PaymentInfo;",
            ">;",
            "LqY0;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/BirdPayment;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LqY0;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/PaymentInfo;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/PaymentInfo;->getPaymentMethod()Lco/bird/android/model/BirdPayment;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const/4 v3, 0x1

    if-eqz v0, :cond_1

    iget-object p1, p0, LoP3$n;->g:LoP3;

    invoke-static {p1}, LoP3;->access$getUi$p(LoP3;)LCP3;

    move-result-object p1

    invoke-interface {p1, v0}, LCP3;->L2(Lco/bird/android/model/BirdPayment;)V

    goto :goto_1

    :cond_1
    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v3

    if-eqz p1, :cond_2

    iget-object p1, p0, LoP3$n;->g:LoP3;

    invoke-static {p1}, LoP3;->access$getUi$p(LoP3;)LCP3;

    move-result-object p1

    invoke-interface {p1}, LCP3;->aa()V

    goto :goto_1

    :cond_2
    iget-object p1, p0, LoP3$n;->g:LoP3;

    invoke-static {p1}, LoP3;->access$getUi$p(LoP3;)LCP3;

    move-result-object p1

    invoke-interface {p1, v2}, LCP3;->L2(Lco/bird/android/model/BirdPayment;)V

    :goto_1
    iget-object p1, p0, LoP3$n;->g:LoP3;

    invoke-static {p1}, LoP3;->access$getUi$p(LoP3;)LCP3;

    move-result-object p1

    invoke-virtual {v1}, LqY0;->a()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lco/bird/android/model/BirdPayment;->isGooglePay()Z

    move-result v1

    goto :goto_2

    :cond_3
    move v1, v2

    :goto_2
    if-nez v1, :cond_4

    move v1, v3

    goto :goto_3

    :cond_4
    move v1, v2

    :goto_3
    invoke-interface {p1, v1}, LCP3;->y(Z)V

    iget-object p1, p0, LoP3$n;->g:LoP3;

    invoke-static {p1}, LoP3;->access$getUi$p(LoP3;)LCP3;

    move-result-object p1

    iget-object v1, p0, LoP3$n;->g:LoP3;

    invoke-static {v1}, LoP3;->access$getReactiveConfig$p(LoP3;)LTq4;

    move-result-object v1

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getPaymentConfig()Lco/bird/android/model/wire/configs/PaymentConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/PaymentConfig;->getEnablePaypal()Z

    move-result v1

    if-eqz v1, :cond_6

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lco/bird/android/model/BirdPayment;->isPaypal()Z

    move-result v0

    if-ne v0, v3, :cond_5

    move v0, v3

    goto :goto_4

    :cond_5
    move v0, v2

    :goto_4
    if-nez v0, :cond_6

    goto :goto_5

    :cond_6
    move v3, v2

    :goto_5
    invoke-interface {p1, v3}, LCP3;->S(Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LoP3$n;->a(Lkotlin/Triple;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
