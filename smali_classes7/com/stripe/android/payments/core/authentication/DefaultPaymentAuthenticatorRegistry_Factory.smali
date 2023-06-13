.class public final Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;",
        ">;"
    }
.end annotation


# instance fields
.field private final noOpIntentAuthenticatorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentAuthenticatorsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private final sourceAuthenticatorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;",
            ">;"
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
            "Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;",
            ">;",
            "LY94<",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry_Factory;->noOpIntentAuthenticatorProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry_Factory;->sourceAuthenticatorProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry_Factory;->paymentAuthenticatorsProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;)Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;",
            ">;",
            "LY94<",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;>;)",
            "Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry_Factory;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry_Factory;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;Ljava/util/Map;)Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;",
            "Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/stripe/android/model/StripeIntent$NextActionData;",
            ">;",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;)",
            "Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;-><init>(Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;Ljava/util/Map;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry_Factory;->noOpIntentAuthenticatorProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry_Factory;->sourceAuthenticatorProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;

    iget-object v2, p0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry_Factory;->paymentAuthenticatorsProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry_Factory;->newInstance(Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;Ljava/util/Map;)Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry_Factory;->get()Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;

    move-result-object v0

    return-object v0
.end method
