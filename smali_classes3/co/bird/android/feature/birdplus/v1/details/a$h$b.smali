.class public final Lco/bird/android/feature/birdplus/v1/details/a$h$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/birdplus/v1/details/a$h;->invoke(Lkotlin/Pair;)Lio/reactivex/h;
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
        "Lkotlin/Unit;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/BirdPayment;",
        ">;+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\n\u001a\n \u0002*\u0004\u0018\u00010\u00070\u00072<\u0010\u0006\u001a8\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u00050\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Triple;",
        "",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/BirdPayment;",
        "",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/h;",
        "invoke",
        "(Lkotlin/Triple;)Lio/reactivex/h;",
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
.field public final synthetic g:Lco/bird/android/feature/birdplus/v1/details/a;

.field public final synthetic h:Lco/bird/android/model/persistence/BirdPlusView;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/birdplus/v1/details/a;Lco/bird/android/model/persistence/BirdPlusView;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$b;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    iput-object p2, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$b;->h:Lco/bird/android/model/persistence/BirdPlusView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/Triple;)Lio/reactivex/h;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lkotlin/Unit;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/BirdPayment;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->c()Z

    move-result v1

    const-string v2, ""

    const/4 v3, 0x0

    if-nez v1, :cond_4

    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$b;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {p1}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getNavigator$p(Lco/bird/android/feature/birdplus/v1/details/a;)Le13;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/constant/PurchasePaymentReason;->BIRD_PLUS:Lco/bird/android/model/constant/PurchasePaymentReason;

    const/16 v6, 0x273e

    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$b;->h:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlan()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;->getPriceAmount()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v3

    :goto_0
    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$b;->h:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlan()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;->getPriceAmountTax()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :cond_1
    add-int/2addr p1, v3

    int-to-long v7, p1

    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$b;->h:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlan()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;->getCurrency()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move-object v9, p1

    goto :goto_2

    :cond_3
    :goto_1
    move-object v9, v2

    :goto_2
    sget-object v10, Lco/bird/android/model/PaymentAddSource;->BIRD_PLUS_PURCHASE:Lco/bird/android/model/PaymentAddSource;

    invoke-interface/range {v4 .. v10}, Le13;->A2(Lco/bird/android/model/constant/PurchasePaymentReason;IJLjava/lang/String;Lco/bird/android/model/PaymentAddSource;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    goto/16 :goto_5

    :cond_4
    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/BirdPayment;

    invoke-virtual {v0}, Lco/bird/android/model/BirdPayment;->isGooglePay()Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "googlePayReady"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$b;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    invoke-static {p1}, Lco/bird/android/feature/birdplus/v1/details/a;->access$getGooglePayManager$p(Lco/bird/android/feature/birdplus/v1/details/a;)LiD1;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$b;->h:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlan()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;->getCurrency()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    move-object v2, v0

    :cond_6
    :goto_3
    invoke-static {v2}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$b;->h:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlan()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;->getPriceAmount()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_4

    :cond_7
    move v1, v3

    :goto_4
    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$b;->h:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusView;->getSubscriptionPlan()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;->getPriceAmountTax()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :cond_8
    int-to-long v2, v3

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {p1, v0, v1, v2, v3}, LiD1;->e(Ljava/util/Currency;Ljava/lang/Long;Ljava/lang/Long;Z)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    goto :goto_5

    :cond_9
    iget-object p1, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$b;->g:Lco/bird/android/feature/birdplus/v1/details/a;

    iget-object v0, p0, Lco/bird/android/feature/birdplus/v1/details/a$h$b;->h:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-static {p1, v0}, Lco/bird/android/feature/birdplus/v1/details/a;->access$purchaseBirdPlus(Lco/bird/android/feature/birdplus/v1/details/a;Lco/bird/android/model/persistence/BirdPlusView;)Lio/reactivex/c;

    move-result-object p1

    :goto_5
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/birdplus/v1/details/a$h$b;->invoke(Lkotlin/Triple;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
