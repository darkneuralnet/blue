.class public final Lcom/stripe/android/ui/core/forms/resources/LpmRepositoryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "payPalRequiresMandate",
        "",
        "Lcom/stripe/android/model/StripeIntent;",
        "payments-ui-core_release"
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
.method public static final synthetic access$payPalRequiresMandate(Lcom/stripe/android/model/StripeIntent;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepositoryKt;->payPalRequiresMandate(Lcom/stripe/android/model/StripeIntent;)Z

    move-result p0

    return p0
.end method

.method private static final payPalRequiresMandate(Lcom/stripe/android/model/StripeIntent;)Z
    .locals 2

    instance-of v0, p0, Lcom/stripe/android/model/PaymentIntent;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    check-cast p0, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentIntent;->getSetupFutureUsage()Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    instance-of p0, p0, Lcom/stripe/android/model/SetupIntent;

    if-eqz p0, :cond_2

    :goto_0
    return v1

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
