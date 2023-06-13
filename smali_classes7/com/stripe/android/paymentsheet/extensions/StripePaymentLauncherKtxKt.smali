.class public final Lcom/stripe/android/paymentsheet/extensions/StripePaymentLauncherKtxKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "registerPollingAuthenticator",
        "",
        "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;",
        "unregisterPollingAuthenticator",
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
.method public static final registerPollingAuthenticator(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->getAuthenticatorRegistry()Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;

    move-result-object p0

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingAuthenticator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingAuthenticator;-><init>()V

    const-class v1, Lcom/stripe/android/model/StripeIntent$NextActionData$UpiAwaitNotification;

    invoke-interface {p0, v1, v0}, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;->registerAuthenticator(Ljava/lang/Class;Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;)V

    return-void
.end method

.method public static final unregisterPollingAuthenticator(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->getAuthenticatorRegistry()Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;

    move-result-object p0

    const-class v0, Lcom/stripe/android/model/StripeIntent$NextActionData$UpiAwaitNotification;

    invoke-interface {p0, v0}, Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;->unregisterAuthenticator(Ljava/lang/Class;)V

    return-void
.end method
