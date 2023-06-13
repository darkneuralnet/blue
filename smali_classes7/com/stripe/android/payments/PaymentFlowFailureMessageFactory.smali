.class public final Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u000c\u0010\u0011\u001a\u00020\u0012*\u00020\u0008H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;",
        "",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "create",
        "",
        "intent",
        "Lcom/stripe/android/model/StripeIntent;",
        "outcome",
        "",
        "createForPaymentIntent",
        "paymentIntent",
        "Lcom/stripe/android/model/PaymentIntent;",
        "createForSetupIntent",
        "setupIntent",
        "Lcom/stripe/android/model/SetupIntent;",
        "is3DS2",
        "",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;->context:Landroid/content/Context;

    return-void
.end method

.method private final createForPaymentIntent(Lcom/stripe/android/model/PaymentIntent;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/model/StripeIntent$Status;->RequiresAction:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lcom/stripe/android/model/PaymentMethod$Type;->isVoucher:Z

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    if-eqz v1, :cond_3

    :cond_1
    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentIntent;->getLastPaymentError()Lcom/stripe/android/model/PaymentIntent$Error;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentIntent$Error;->getCode()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    const-string v2, "payment_intent_authentication_failure"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    iget-object p1, p0, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;->context:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/stripe/android/R$string;->stripe_failure_reason_authentication:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentIntent;->getLastPaymentError()Lcom/stripe/android/model/PaymentIntent$Error;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentIntent$Error;->getType()Lcom/stripe/android/model/PaymentIntent$Error$Type;

    move-result-object v0

    goto :goto_1

    :cond_5
    move-object v0, v1

    :goto_1
    sget-object v2, Lcom/stripe/android/model/PaymentIntent$Error$Type;->CardError:Lcom/stripe/android/model/PaymentIntent$Error$Type;

    if-ne v0, v2, :cond_6

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentIntent;->getLastPaymentError()Lcom/stripe/android/model/PaymentIntent$Error;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;->context:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentIntent$Error;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/stripe/android/networking/StripeErrorMappingKt;->mapErrorCodeToLocalizedMessage(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentIntent$Error;->getMessage()Ljava/lang/String;

    move-result-object v1

    :cond_6
    :goto_2
    return-object v1
.end method

.method private final createForSetupIntent(Lcom/stripe/android/model/SetupIntent;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p1}, Lcom/stripe/android/model/SetupIntent;->getLastSetupError()Lcom/stripe/android/model/SetupIntent$Error;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/model/SetupIntent$Error;->getCode()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const-string v2, "setup_intent_authentication_failure"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;->context:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/stripe/android/R$string;->stripe_failure_reason_authentication:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Lcom/stripe/android/model/SetupIntent;->getLastSetupError()Lcom/stripe/android/model/SetupIntent$Error;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/model/SetupIntent$Error;->getType()Lcom/stripe/android/model/SetupIntent$Error$Type;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    sget-object v2, Lcom/stripe/android/model/SetupIntent$Error$Type;->CardError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    if-ne v0, v2, :cond_3

    invoke-virtual {p1}, Lcom/stripe/android/model/SetupIntent;->getLastSetupError()Lcom/stripe/android/model/SetupIntent$Error;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;->context:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/stripe/android/model/SetupIntent$Error;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/stripe/android/networking/StripeErrorMappingKt;->mapErrorCodeToLocalizedMessage(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-virtual {p1}, Lcom/stripe/android/model/SetupIntent$Error;->getMessage()Ljava/lang/String;

    move-result-object v1

    :cond_3
    :goto_2
    return-object v1
.end method

.method private final is3DS2(Lcom/stripe/android/model/StripeIntent;)Z
    .locals 2

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getNextActionData()Lcom/stripe/android/model/StripeIntent$NextActionData;

    move-result-object p1

    instance-of p1, p1, Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method


# virtual methods
.method public final create(Lcom/stripe/android/model/StripeIntent;I)Ljava/lang/String;
    .locals 2

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    iget-object p1, p0, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;->context:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lcom/stripe/android/R$string;->stripe_failure_reason_timed_out:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;->is3DS2(Lcom/stripe/android/model/StripeIntent;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    :cond_1
    move-object p1, v0

    goto :goto_0

    :cond_2
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object p2

    sget-object v1, Lcom/stripe/android/model/StripeIntent$Status;->RequiresPaymentMethod:Lcom/stripe/android/model/StripeIntent$Status;

    if-eq p2, v1, :cond_3

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object p2

    sget-object v1, Lcom/stripe/android/model/StripeIntent$Status;->RequiresAction:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne p2, v1, :cond_1

    :cond_3
    instance-of p2, p1, Lcom/stripe/android/model/PaymentIntent;

    if-eqz p2, :cond_4

    check-cast p1, Lcom/stripe/android/model/PaymentIntent;

    invoke-direct {p0, p1}, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;->createForPaymentIntent(Lcom/stripe/android/model/PaymentIntent;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_4
    instance-of p2, p1, Lcom/stripe/android/model/SetupIntent;

    if-eqz p2, :cond_5

    check-cast p1, Lcom/stripe/android/model/SetupIntent;

    invoke-direct {p0, p1}, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;->createForSetupIntent(Lcom/stripe/android/model/SetupIntent;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
