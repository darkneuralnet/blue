.class public final Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/link/repositories/LinkApiRepository;",
        ">;"
    }
.end annotation


# instance fields
.field private final consumersApiServiceProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/repository/ConsumersApiService;",
            ">;"
        }
    .end annotation
.end field

.field private final localeProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/Locale;",
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
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Lcom/stripe/android/networking/StripeRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/repository/ConsumersApiService;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "LY94<",
            "Ljava/util/Locale;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;->publishableKeyProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;->stripeAccountIdProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;->stripeRepositoryProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;->consumersApiServiceProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;->workContextProvider:LY94;

    iput-object p6, p0, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;->localeProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Lcom/stripe/android/networking/StripeRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/repository/ConsumersApiService;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "LY94<",
            "Ljava/util/Locale;",
            ">;)",
            "Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;"
        }
    .end annotation

    new-instance v7, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static newInstance(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/repository/ConsumersApiService;Lkotlin/coroutines/CoroutineContext;Ljava/util/Locale;)Lcom/stripe/android/link/repositories/LinkApiRepository;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Lcom/stripe/android/repository/ConsumersApiService;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Locale;",
            ")",
            "Lcom/stripe/android/link/repositories/LinkApiRepository;"
        }
    .end annotation

    new-instance v7, Lcom/stripe/android/link/repositories/LinkApiRepository;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/link/repositories/LinkApiRepository;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/repository/ConsumersApiService;Lkotlin/coroutines/CoroutineContext;Ljava/util/Locale;)V

    return-object v7
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/repositories/LinkApiRepository;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;->publishableKeyProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/functions/Function0;

    iget-object v0, p0, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;->stripeAccountIdProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function0;

    iget-object v0, p0, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;->stripeRepositoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/networking/StripeRepository;

    iget-object v0, p0, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;->consumersApiServiceProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/repository/ConsumersApiService;

    iget-object v0, p0, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;->workContextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lkotlin/coroutines/CoroutineContext;

    iget-object v0, p0, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;->localeProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Locale;

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;->newInstance(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/repository/ConsumersApiService;Lkotlin/coroutines/CoroutineContext;Ljava/util/Locale;)Lcom/stripe/android/link/repositories/LinkApiRepository;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;->get()Lcom/stripe/android/link/repositories/LinkApiRepository;

    move-result-object v0

    return-object v0
.end method
