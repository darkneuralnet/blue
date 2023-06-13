.class final Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

.field private analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

.field private context:Landroid/content/Context;

.field private enableLogging:Ljava/lang/Boolean;

.field private injectorKey:Ljava/lang/String;

.field private isInstantApp:Ljava/lang/Boolean;

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

.field private stripeRepository:Lcom/stripe/android/networking/StripeRepository;

.field private threeDs1IntentReturnUrlMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private uiContext:Lkotlin/coroutines/CoroutineContext;

.field private workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LFG0;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic analyticsRequestExecutor(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->analyticsRequestExecutor(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public analyticsRequestExecutor(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    return-object p0
.end method

.method public bridge synthetic analyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->analyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public analyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    return-object p0
.end method

.method public build()Lcom/stripe/android/payments/core/injection/AuthenticationComponent;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->context:Landroid/content/Context;

    const-class v2, Landroid/content/Context;

    invoke-static {v1, v2}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    const-class v2, Lcom/stripe/android/networking/StripeRepository;

    invoke-static {v1, v2}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    const-class v2, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    invoke-static {v1, v2}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    const-class v2, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    invoke-static {v1, v2}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->enableLogging:Ljava/lang/Boolean;

    const-class v2, Ljava/lang/Boolean;

    invoke-static {v1, v2}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->workContext:Lkotlin/coroutines/CoroutineContext;

    const-class v3, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v1, v3}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->uiContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v1, v3}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->threeDs1IntentReturnUrlMap:Ljava/util/Map;

    const-class v3, Ljava/util/Map;

    invoke-static {v1, v3}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->injectorKey:Ljava/lang/String;

    const-class v3, Ljava/lang/String;

    invoke-static {v1, v3}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    const-class v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v1, v3}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->productUsage:Ljava/util/Set;

    const-class v3, Ljava/util/Set;

    invoke-static {v1, v3}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->isInstantApp:Ljava/lang/Boolean;

    invoke-static {v1, v2}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v1, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;

    new-instance v4, Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;

    invoke-direct {v4}, Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;-><init>()V

    new-instance v5, Lcom/stripe/android/core/injection/CoreCommonModule;

    invoke-direct {v5}, Lcom/stripe/android/core/injection/CoreCommonModule;-><init>()V

    iget-object v6, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->context:Landroid/content/Context;

    iget-object v7, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    iget-object v8, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iget-object v9, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iget-object v10, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->enableLogging:Ljava/lang/Boolean;

    iget-object v11, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->workContext:Lkotlin/coroutines/CoroutineContext;

    iget-object v12, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->uiContext:Lkotlin/coroutines/CoroutineContext;

    iget-object v13, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->threeDs1IntentReturnUrlMap:Ljava/util/Map;

    iget-object v14, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->injectorKey:Ljava/lang/String;

    iget-object v15, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    iget-object v2, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->productUsage:Ljava/util/Set;

    iget-object v3, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->isInstantApp:Ljava/lang/Boolean;

    const/16 v18, 0x0

    move-object/from16 v17, v3

    move-object v3, v1

    move-object/from16 v16, v2

    invoke-direct/range {v3 .. v18}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;-><init>(Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Ljava/lang/Boolean;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Ljava/lang/Boolean;LEG0;)V

    return-object v1
.end method

.method public bridge synthetic context(Landroid/content/Context;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->context(Landroid/content/Context;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public context(Landroid/content/Context;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->context:Landroid/content/Context;

    return-object p0
.end method

.method public bridge synthetic enableLogging(Z)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->enableLogging(Z)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public enableLogging(Z)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->enableLogging:Ljava/lang/Boolean;

    return-object p0
.end method

.method public bridge synthetic injectorKey(Ljava/lang/String;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->injectorKey(Ljava/lang/String;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public injectorKey(Ljava/lang/String;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->injectorKey:Ljava/lang/String;

    return-object p0
.end method

.method public bridge synthetic isInstantApp(Z)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->isInstantApp(Z)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public isInstantApp(Z)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->isInstantApp:Ljava/lang/Boolean;

    return-object p0
.end method

.method public bridge synthetic productUsage(Ljava/util/Set;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->productUsage(Ljava/util/Set;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public productUsage(Ljava/util/Set;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;"
        }
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->productUsage:Ljava/util/Set;

    return-object p0
.end method

.method public bridge synthetic publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;"
        }
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function0;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public bridge synthetic stripeRepository(Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->stripeRepository(Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public stripeRepository(Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/networking/StripeRepository;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    return-object p0
.end method

.method public bridge synthetic threeDs1IntentReturnUrlMap(Ljava/util/Map;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->threeDs1IntentReturnUrlMap(Ljava/util/Map;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public threeDs1IntentReturnUrlMap(Ljava/util/Map;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;"
        }
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->threeDs1IntentReturnUrlMap:Ljava/util/Map;

    return-object p0
.end method

.method public bridge synthetic uiContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->uiContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public uiContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->uiContext:Lkotlin/coroutines/CoroutineContext;

    return-object p0
.end method

.method public bridge synthetic workContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/AuthenticationComponent$Builder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->workContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public workContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Builder;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-object p0
.end method
