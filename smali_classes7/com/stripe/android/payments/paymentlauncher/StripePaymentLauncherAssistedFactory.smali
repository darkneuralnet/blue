.class public interface abstract Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008g\u0018\u00002\u00020\u0001J8\u0010\n\u001a\u00020\t2\u000e\u0008\u0001\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0010\u0008\u0001\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H&\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
        "",
        "Lkotlin/Function0;",
        "",
        "publishableKey",
        "stripeAccountId",
        "LB5;",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
        "hostActivityLauncher",
        "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;",
        "create",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract create(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LB5;)Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;
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
.end method
