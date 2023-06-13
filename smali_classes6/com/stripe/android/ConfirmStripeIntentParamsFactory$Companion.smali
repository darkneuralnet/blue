.class public final Lcom/stripe/android/ConfirmStripeIntentParamsFactory$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ConfirmStripeIntentParamsFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/ConfirmStripeIntentParamsFactory$Companion;",
        "",
        "()V",
        "createFactory",
        "Lcom/stripe/android/ConfirmStripeIntentParamsFactory;",
        "Lcom/stripe/android/model/ConfirmStripeIntentParams;",
        "clientSecret",
        "",
        "shipping",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/ConfirmStripeIntentParamsFactory$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFactory(Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/ConfirmStripeIntentParamsFactory;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
            ")",
            "Lcom/stripe/android/ConfirmStripeIntentParamsFactory<",
            "Lcom/stripe/android/model/ConfirmStripeIntentParams;",
            ">;"
        }
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/model/PaymentIntent$ClientSecret;->Companion:Lcom/stripe/android/model/PaymentIntent$ClientSecret$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/model/PaymentIntent$ClientSecret$Companion;->isMatch(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/stripe/android/ConfirmPaymentIntentParamsFactory;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/ConfirmPaymentIntentParamsFactory;-><init>(Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)V

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/stripe/android/model/SetupIntent$ClientSecret;->Companion:Lcom/stripe/android/model/SetupIntent$ClientSecret$Companion;

    invoke-virtual {p2, p1}, Lcom/stripe/android/model/SetupIntent$ClientSecret$Companion;->isMatch(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance v0, Lcom/stripe/android/ConfirmSetupIntentParamsFactory;

    invoke-direct {v0, p1}, Lcom/stripe/android/ConfirmSetupIntentParamsFactory;-><init>(Ljava/lang/String;)V

    :goto_0
    return-object v0

    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Encountered an invalid client secret \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\""

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
