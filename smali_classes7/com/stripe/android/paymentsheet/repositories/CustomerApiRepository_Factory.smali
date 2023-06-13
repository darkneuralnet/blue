.class public final Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;",
        ">;"
    }
.end annotation


# instance fields
.field private final lazyPaymentConfigProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final loggerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;"
        }
    .end annotation
.end field

.field private final productUsageTokensProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final stripeRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/networking/StripeRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final workContextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;"
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
            "Lcom/stripe/android/networking/StripeRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "LY94<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;->stripeRepositoryProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;->lazyPaymentConfigProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;->loggerProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;->workContextProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;->productUsageTokensProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/networking/StripeRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "LY94<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;"
        }
    .end annotation

    new-instance v6, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static newInstance(Lcom/stripe/android/networking/StripeRepository;LY94;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;)Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/networking/StripeRepository;",
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;"
        }
    .end annotation

    new-instance v6, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;-><init>(Lcom/stripe/android/networking/StripeRepository;LY94;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;)V

    return-object v6
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;->stripeRepositoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/networking/StripeRepository;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;->lazyPaymentConfigProvider:LY94;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;->loggerProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/core/Logger;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;->workContextProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/coroutines/CoroutineContext;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;->productUsageTokensProvider:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;->newInstance(Lcom/stripe/android/networking/StripeRepository;LY94;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;)Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository_Factory;->get()Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;

    move-result-object v0

    return-object v0
.end method
