.class public final Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;


# instance fields
.field private final delegateFactory:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;


# direct methods
.method public constructor <init>(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory_Impl;->delegateFactory:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;

    return-void
.end method

.method public static create(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;",
            ")",
            "LY94<",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory_Impl;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory_Impl;-><init>(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LB5;)Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "LB5<",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
            ">;)",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory_Impl;->delegateFactory:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;

    invoke-virtual {v0, p1, p2, p3}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;->get(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LB5;)Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;

    move-result-object p1

    return-object p1
.end method
