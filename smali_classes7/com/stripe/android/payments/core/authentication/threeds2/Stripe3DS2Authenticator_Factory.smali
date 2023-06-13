.class public final Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;",
        ">;"
    }
.end annotation


# instance fields
.field private final configProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/PaymentAuthConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final enableLoggingProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final injectorKeyProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final productUsageProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
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


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/PaymentAuthConfig;",
            ">;",
            "LY94<",
            "Ljava/lang/Boolean;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;->configProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;->enableLoggingProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;->injectorKeyProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;->publishableKeyProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;->productUsageProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/PaymentAuthConfig;",
            ">;",
            "LY94<",
            "Ljava/lang/Boolean;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;"
        }
    .end annotation

    new-instance v6, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static newInstance(Lcom/stripe/android/PaymentAuthConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/PaymentAuthConfig;",
            "Z",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;"
        }
    .end annotation

    new-instance v6, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;

    move-object v0, v6

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;-><init>(Lcom/stripe/android/PaymentAuthConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V

    return-object v6
.end method


# virtual methods
.method public get()Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;->configProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/PaymentAuthConfig;

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;->enableLoggingProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v2, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;->injectorKeyProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;->publishableKeyProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;->productUsageProvider:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;->newInstance(Lcom/stripe/android/PaymentAuthConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;->get()Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;

    move-result-object v0

    return-object v0
.end method
