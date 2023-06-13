.class final Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher$authenticatorRegistry$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LB5;Landroid/content/Context;ZLkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Ljava/util/Set;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;


# direct methods
.method public constructor <init>(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher$authenticatorRegistry$2;->this$0:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher$authenticatorRegistry$2;->this$0:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;

    invoke-static {v0}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->access$getPaymentLauncherComponent$p(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;->getAuthenticatorRegistry()Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher$authenticatorRegistry$2;->invoke()Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;

    move-result-object v0

    return-object v0
.end method
