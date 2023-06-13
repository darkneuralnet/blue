.class public final Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository_Api_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;",
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
.method public constructor <init>(LY94;LY94;LY94;)V
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
            "Lkotlin/coroutines/CoroutineContext;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository_Api_Factory;->stripeRepositoryProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository_Api_Factory;->lazyPaymentConfigProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository_Api_Factory;->workContextProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;)Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository_Api_Factory;
    .locals 1
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
            "Lkotlin/coroutines/CoroutineContext;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository_Api_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository_Api_Factory;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository_Api_Factory;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/networking/StripeRepository;LY94;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/networking/StripeRepository;",
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;-><init>(Lcom/stripe/android/networking/StripeRepository;LY94;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository_Api_Factory;->stripeRepositoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/networking/StripeRepository;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository_Api_Factory;->lazyPaymentConfigProvider:LY94;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository_Api_Factory;->workContextProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository_Api_Factory;->newInstance(Lcom/stripe/android/networking/StripeRepository;LY94;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository_Api_Factory;->get()Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Api;

    move-result-object v0

    return-object v0
.end method
