.class public final Lcom/stripe/android/paymentsheet/PaymentSheetViewModelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0000\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "isProcessingPayment",
        "",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;)Z",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$isProcessingPayment(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModelKt;->isProcessingPayment(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;)Z

    move-result p0

    return p0
.end method

.method private static final isProcessingPayment(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;)Z
    .locals 1

    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$PaymentIntent;

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$SetupIntent;

    if-eqz v0, :cond_1

    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$DeferredIntent;

    if-eqz v0, :cond_2

    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$DeferredIntent;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$DeferredIntent;->getIntentConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;->getMode()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;

    move-result-object p0

    instance-of p0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;

    :goto_0
    return p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
