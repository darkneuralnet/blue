.class final Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

.field private context:Landroid/content/Context;

.field private enableLogging:Ljava/lang/Boolean;

.field private ioContext:Lkotlin/coroutines/CoroutineContext;

.field private productUsage:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private publishableKeyProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private stripeRepository:Lcom/stripe/android/networking/StripeRepository;

.field private uiContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LyN0;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public analyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    return-object p0
.end method

.method public bridge synthetic analyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->analyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public build()Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;
    .locals 15

    iget-object v0, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->context:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->enableLogging:Ljava/lang/Boolean;

    const-class v1, Ljava/lang/Boolean;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->ioContext:Lkotlin/coroutines/CoroutineContext;

    const-class v1, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->uiContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    const-class v1, Lcom/stripe/android/networking/StripeRepository;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    const-class v1, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    const-class v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->productUsage:Ljava/util/Set;

    const-class v1, Ljava/util/Set;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$PaymentLauncherComponentImpl;

    new-instance v3, Lcom/stripe/android/payments/core/injection/PaymentLauncherModule;

    invoke-direct {v3}, Lcom/stripe/android/payments/core/injection/PaymentLauncherModule;-><init>()V

    new-instance v4, Lcom/stripe/android/core/injection/CoreCommonModule;

    invoke-direct {v4}, Lcom/stripe/android/core/injection/CoreCommonModule;-><init>()V

    iget-object v5, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->context:Landroid/content/Context;

    iget-object v6, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->enableLogging:Ljava/lang/Boolean;

    iget-object v7, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->ioContext:Lkotlin/coroutines/CoroutineContext;

    iget-object v8, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->uiContext:Lkotlin/coroutines/CoroutineContext;

    iget-object v9, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    iget-object v10, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iget-object v11, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    iget-object v12, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    iget-object v13, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->productUsage:Ljava/util/Set;

    const/4 v14, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v14}, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$PaymentLauncherComponentImpl;-><init>(Lcom/stripe/android/payments/core/injection/PaymentLauncherModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Ljava/lang/Boolean;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/Set;LzN0;)V

    return-object v0
.end method

.method public context(Landroid/content/Context;)Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->context:Landroid/content/Context;

    return-object p0
.end method

.method public bridge synthetic context(Landroid/content/Context;)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->context(Landroid/content/Context;)Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public enableLogging(Z)Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->enableLogging:Ljava/lang/Boolean;

    return-object p0
.end method

.method public bridge synthetic enableLogging(Z)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->enableLogging(Z)Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public ioContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->ioContext:Lkotlin/coroutines/CoroutineContext;

    return-object p0
.end method

.method public bridge synthetic ioContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->ioContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public productUsage(Ljava/util/Set;)Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;"
        }
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->productUsage:Ljava/util/Set;

    return-object p0
.end method

.method public bridge synthetic productUsage(Ljava/util/Set;)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->productUsage(Ljava/util/Set;)Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;"
        }
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function0;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public bridge synthetic publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;"
        }
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function0;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public bridge synthetic stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public stripeRepository(Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/networking/StripeRepository;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    return-object p0
.end method

.method public bridge synthetic stripeRepository(Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->stripeRepository(Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public uiContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->uiContext:Lkotlin/coroutines/CoroutineContext;

    return-object p0
.end method

.method public bridge synthetic uiContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;->uiContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/DaggerPaymentLauncherComponent$Builder;

    move-result-object p1

    return-object p1
.end method
