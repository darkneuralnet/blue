.class public final LxN3$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LxN3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "LxN3$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lco/bird/android/widget/PaymentButton;",
        "b",
        "Lco/bird/android/widget/PaymentButton;",
        "getView",
        "()Lco/bird/android/widget/PaymentButton;",
        "view",
        "LxN3;",
        "c",
        "LxN3;",
        "a",
        "()LxN3;",
        "adapter",
        "<init>",
        "(Lco/bird/android/widget/PaymentButton;LxN3;)V",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/widget/PaymentButton;

.field public final c:LxN3;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/PaymentButton;LxN3;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lw1;-><init>(Landroid/view/View;)V

    iput-object p1, p0, LxN3$a;->b:Lco/bird/android/widget/PaymentButton;

    iput-object p2, p0, LxN3$a;->c:LxN3;

    new-instance p2, LxN3$a$a;

    invoke-direct {p2, p0}, LxN3$a$a;-><init>(LxN3$a;)V

    invoke-static {p1, p2}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public final a()LxN3;
    .locals 1

    iget-object v0, p0, LxN3$a;->c:LxN3;

    return-object v0
.end method

.method public bind(I)V
    .locals 5

    iget-object v0, p0, LxN3$a;->c:LxN3;

    invoke-virtual {v0, p1}, Lct4;->q(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/BirdPayment;

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->isStripeCard()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LxN3$a;->b:Lco/bird/android/widget/PaymentButton;

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->getStripeCard()Lcom/stripe/android/model/Card;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lco/bird/android/widget/PaymentButton;->setStripeCard(Lcom/stripe/android/model/Card;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->isStripePaymentMethod()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LxN3$a;->b:Lco/bird/android/widget/PaymentButton;

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->getStripePaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lco/bird/android/widget/PaymentButton;->setStripePaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->isPaypal()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LxN3$a;->b:Lco/bird/android/widget/PaymentButton;

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->getPaypalEmail()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lco/bird/android/widget/PaymentButton;->setPaypal(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->isAdyen()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, LxN3$a;->b:Lco/bird/android/widget/PaymentButton;

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->isGooglePay()Z

    move-result v1

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->getBrand()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    if-nez v2, :cond_3

    move-object v2, v3

    :cond_3
    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->getLastCardNumbers()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4

    goto :goto_0

    :cond_4
    move-object v3, v4

    :goto_0
    invoke-virtual {v0, v1, v2, v3}, Lco/bird/android/widget/PaymentButton;->setAdyenCard(ZLjava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_1
    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->getDefaultPaymentMethod()Z

    move-result v0

    if-nez v0, :cond_f

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->getId()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LxN3$a;->c:LxN3;

    invoke-static {v1}, LxN3;->access$getDefaultBirdPayment$p(LxN3;)Lco/bird/android/model/BirdPayment;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lco/bird/android/model/BirdPayment;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_6
    move-object v1, v2

    :goto_2
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->isStripeCard()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->getStripeCard()Lcom/stripe/android/model/Card;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/stripe/android/model/Card;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_7
    move-object v0, v2

    :goto_3
    iget-object v1, p0, LxN3$a;->c:LxN3;

    invoke-static {v1}, LxN3;->access$getDefaultBirdPayment$p(LxN3;)Lco/bird/android/model/BirdPayment;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lco/bird/android/model/BirdPayment;->getStripeCard()Lcom/stripe/android/model/Card;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lcom/stripe/android/model/Card;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_8
    move-object v1, v2

    :goto_4
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    :cond_9
    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->isStripePaymentMethod()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->getStripePaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    goto :goto_5

    :cond_a
    move-object v0, v2

    :goto_5
    iget-object v1, p0, LxN3$a;->c:LxN3;

    invoke-static {v1}, LxN3;->access$getDefaultBirdPayment$p(LxN3;)Lco/bird/android/model/BirdPayment;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lco/bird/android/model/BirdPayment;->getStripePaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v1

    if-eqz v1, :cond_b

    iget-object v2, v1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    :cond_b
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    :cond_c
    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->isGooglePay()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_e

    iget-object p1, p0, LxN3$a;->c:LxN3;

    invoke-static {p1}, LxN3;->access$getDefaultBirdPayment$p(LxN3;)Lco/bird/android/model/BirdPayment;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->isGooglePay()Z

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_d

    goto :goto_6

    :cond_d
    move v1, v0

    :goto_6
    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object p1, p0, LxN3$a;->b:Lco/bird/android/widget/PaymentButton;

    invoke-virtual {p1, v0}, Lco/bird/android/widget/PaymentButton;->setEndIcon(I)V

    goto :goto_8

    :cond_f
    :goto_7
    iget-object p1, p0, LxN3$a;->b:Lco/bird/android/widget/PaymentButton;

    sget v0, Lrg4;->ic_check:I

    invoke-virtual {p1, v0}, Lco/bird/android/widget/PaymentButton;->setEndIcon(I)V

    :goto_8
    return-void
.end method
