.class public final Lcom/stripe/android/link/confirmation/ConfirmationManager_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/link/confirmation/ConfirmationManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final paymentLauncherFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final publishableKeyProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final stripeAccountIdProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            ">;",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager_Factory;->paymentLauncherFactoryProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager_Factory;->publishableKeyProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager_Factory;->stripeAccountIdProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;)Lcom/stripe/android/link/confirmation/ConfirmationManager_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            ">;",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/stripe/android/link/confirmation/ConfirmationManager_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/link/confirmation/ConfirmationManager_Factory;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/link/confirmation/ConfirmationManager_Factory;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/confirmation/ConfirmationManager;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/confirmation/ConfirmationManager;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/link/confirmation/ConfirmationManager;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/link/confirmation/ConfirmationManager;-><init>(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/confirmation/ConfirmationManager;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager_Factory;->paymentLauncherFactoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;

    iget-object v1, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager_Factory;->publishableKeyProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/stripe/android/link/confirmation/ConfirmationManager_Factory;->stripeAccountIdProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/link/confirmation/ConfirmationManager_Factory;->newInstance(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/confirmation/ConfirmationManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/link/confirmation/ConfirmationManager_Factory;->get()Lcom/stripe/android/link/confirmation/ConfirmationManager;

    move-result-object v0

    return-object v0
.end method
