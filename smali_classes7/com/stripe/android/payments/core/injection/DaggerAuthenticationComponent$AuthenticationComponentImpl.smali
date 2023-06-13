.class final Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/payments/core/injection/AuthenticationComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AuthenticationComponentImpl"
.end annotation


# instance fields
.field private final analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

.field private analyticsRequestExecutorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            ">;"
        }
    .end annotation
.end field

.field private final analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

.field private analyticsRequestFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final authenticationComponentImpl:Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;

.field private contextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private defaultPaymentAuthenticatorRegistryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;",
            ">;"
        }
    .end annotation
.end field

.field private defaultStripe3ds2ChallengeResultProcessorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;",
            ">;"
        }
    .end annotation
.end field

.field private enableLoggingProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private injectorKeyProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private intentAuthenticatorMapMapOfClassOfAndPaymentAuthenticatorOfStripeIntentProvider:LY94;
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

.field private final isInstantApp:Ljava/lang/Boolean;

.field private isInstantAppProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private noOpIntentAuthenticatorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;",
            ">;"
        }
    .end annotation
.end field

.field private oxxoAuthenticatorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/OxxoAuthenticator;",
            ">;"
        }
    .end annotation
.end field

.field private productUsageProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private provideDefaultReturnUrlProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/DefaultReturnUrl;",
            ">;"
        }
    .end annotation
.end field

.field private provideLoggerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;"
        }
    .end annotation
.end field

.field private provideMessageVersionRegistryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;",
            ">;"
        }
    .end annotation
.end field

.field private providePaymentAuthConfigProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/PaymentAuthConfig;",
            ">;"
        }
    .end annotation
.end field

.field private providePaymentBrowserAuthStarterFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/PaymentBrowserAuthStarter;",
            ">;>;"
        }
    .end annotation
.end field

.field private providePaymentRelayStarterFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/PaymentRelayStarter;",
            ">;>;"
        }
    .end annotation
.end field

.field private provideStripeThreeDs2ServiceProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;",
            ">;"
        }
    .end annotation
.end field

.field private provideWeChatAuthenticator$payments_core_releaseProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;>;"
        }
    .end annotation
.end field

.field private publishableKeyProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private retryDelaySupplierProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/networking/RetryDelaySupplier;",
            ">;"
        }
    .end annotation
.end field

.field private sourceAuthenticatorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;",
            ">;"
        }
    .end annotation
.end field

.field private stripe3DS2AuthenticatorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;

.field private stripeRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/networking/StripeRepository;",
            ">;"
        }
    .end annotation
.end field

.field private threeDs1IntentReturnUrlMapProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private uiContextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;"
        }
    .end annotation
.end field

.field private unsupportedAuthenticatorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/UnsupportedAuthenticator;",
            ">;"
        }
    .end annotation
.end field

.field private webIntentAuthenticatorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;",
            ">;"
        }
    .end annotation
.end field

.field private final workContext:Lkotlin/coroutines/CoroutineContext;

.field private workContextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Ljava/lang/Boolean;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Ljava/lang/Boolean;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;",
            "Lcom/stripe/android/core/injection/CoreCommonModule;",
            "Landroid/content/Context;",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Ljava/lang/Boolean;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->authenticationComponentImpl:Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;

    iput-object p4, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    iput-object p5, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iput-object p6, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iput-object p8, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->workContext:Lkotlin/coroutines/CoroutineContext;

    iput-object p14, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->isInstantApp:Ljava/lang/Boolean;

    invoke-direct/range {p0 .. p14}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->initialize(Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Ljava/lang/Boolean;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Ljava/lang/Boolean;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Ljava/lang/Boolean;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Ljava/lang/Boolean;LEG0;)V
    .locals 0

    invoke-direct/range {p0 .. p14}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;-><init>(Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Ljava/lang/Boolean;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static bridge synthetic a(Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->defaultStripe3ds2ChallengeResultProcessorProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->isInstantApp:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->provideMessageVersionRegistryProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->provideStripeThreeDs2ServiceProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;)Lcom/stripe/android/networking/StripeRepository;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    return-object p0
.end method

.method public static bridge synthetic h(Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;)Lkotlin/coroutines/CoroutineContext;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-object p0
.end method

.method private initialize(Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Ljava/lang/Boolean;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Ljava/lang/Boolean;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;",
            "Lcom/stripe/android/core/injection/CoreCommonModule;",
            "Landroid/content/Context;",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Ljava/lang/Boolean;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    new-instance v1, LyZ0;

    invoke-direct {v1}, LyZ0;-><init>()V

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->defaultPaymentAuthenticatorRegistryProvider:LY94;

    invoke-static {v1}, Lcom/stripe/android/payments/core/injection/AuthenticationModule_Companion_ProvidePaymentRelayStarterFactoryFactory;->create(LY94;)Lcom/stripe/android/payments/core/injection/AuthenticationModule_Companion_ProvidePaymentRelayStarterFactoryFactory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->providePaymentRelayStarterFactoryProvider:LY94;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator_Factory;->create(LY94;)Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator_Factory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->noOpIntentAuthenticatorProvider:LY94;

    invoke-static {p3}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->contextProvider:LY94;

    invoke-static {v1}, Lcom/stripe/android/payments/core/injection/AuthenticationModule_Companion_ProvideDefaultReturnUrlFactory;->create(LY94;)Lcom/stripe/android/payments/core/injection/AuthenticationModule_Companion_ProvideDefaultReturnUrlFactory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->provideDefaultReturnUrlProvider:LY94;

    iget-object v2, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->defaultPaymentAuthenticatorRegistryProvider:LY94;

    invoke-static {v2, v1}, Lcom/stripe/android/payments/core/injection/AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;->create(LY94;LY94;)Lcom/stripe/android/payments/core/injection/AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->providePaymentBrowserAuthStarterFactoryProvider:LY94;

    invoke-static/range {p5 .. p5}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->analyticsRequestExecutorProvider:LY94;

    invoke-static/range {p6 .. p6}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->analyticsRequestFactoryProvider:LY94;

    invoke-static/range {p7 .. p7}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->enableLoggingProvider:LY94;

    invoke-static/range {p9 .. p9}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->uiContextProvider:LY94;

    invoke-static/range {p12 .. p12}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->publishableKeyProvider:LY94;

    invoke-static/range {p14 .. p14}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v9

    iput-object v9, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->isInstantAppProvider:LY94;

    iget-object v2, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->providePaymentBrowserAuthStarterFactoryProvider:LY94;

    iget-object v3, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->providePaymentRelayStarterFactoryProvider:LY94;

    iget-object v4, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->analyticsRequestExecutorProvider:LY94;

    iget-object v5, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->analyticsRequestFactoryProvider:LY94;

    iget-object v6, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->enableLoggingProvider:LY94;

    iget-object v7, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->uiContextProvider:LY94;

    iget-object v8, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->publishableKeyProvider:LY94;

    invoke-static/range {v2 .. v9}, Lcom/stripe/android/payments/core/authentication/SourceAuthenticator_Factory;->create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/payments/core/authentication/SourceAuthenticator_Factory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->sourceAuthenticatorProvider:LY94;

    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->providePaymentRelayStarterFactoryProvider:LY94;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/UnsupportedAuthenticator_Factory;->create(LY94;)Lcom/stripe/android/payments/core/authentication/UnsupportedAuthenticator_Factory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->unsupportedAuthenticatorProvider:LY94;

    move-object v2, p1

    invoke-static {p1, v1}, Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory;->create(Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;LY94;)Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->provideWeChatAuthenticator$payments_core_releaseProvider:LY94;

    invoke-static/range {p10 .. p10}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v7

    iput-object v7, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->threeDs1IntentReturnUrlMapProvider:LY94;

    iget-object v2, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->providePaymentBrowserAuthStarterFactoryProvider:LY94;

    iget-object v3, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->analyticsRequestExecutorProvider:LY94;

    iget-object v4, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->analyticsRequestFactoryProvider:LY94;

    iget-object v5, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->enableLoggingProvider:LY94;

    iget-object v6, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->uiContextProvider:LY94;

    iget-object v8, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->publishableKeyProvider:LY94;

    iget-object v9, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->isInstantAppProvider:LY94;

    iget-object v10, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->provideDefaultReturnUrlProvider:LY94;

    invoke-static/range {v2 .. v10}, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->webIntentAuthenticatorProvider:LY94;

    iget-object v2, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->noOpIntentAuthenticatorProvider:LY94;

    invoke-static {v1, v2}, Lcom/stripe/android/payments/core/authentication/OxxoAuthenticator_Factory;->create(LY94;LY94;)Lcom/stripe/android/payments/core/authentication/OxxoAuthenticator_Factory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->oxxoAuthenticatorProvider:LY94;

    invoke-static {}, Lcom/stripe/android/payments/core/injection/Stripe3DSAuthenticatorModule_Companion_ProvidePaymentAuthConfigFactory;->create()Lcom/stripe/android/payments/core/injection/Stripe3DSAuthenticatorModule_Companion_ProvidePaymentAuthConfigFactory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->providePaymentAuthConfigProvider:LY94;

    invoke-static/range {p11 .. p11}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->injectorKeyProvider:LY94;

    invoke-static/range {p13 .. p13}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->productUsageProvider:LY94;

    iget-object v2, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->providePaymentAuthConfigProvider:LY94;

    iget-object v3, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->enableLoggingProvider:LY94;

    iget-object v4, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->injectorKeyProvider:LY94;

    iget-object v5, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->publishableKeyProvider:LY94;

    invoke-static {v2, v3, v4, v5, v1}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;->create(LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator_Factory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->stripe3DS2AuthenticatorProvider:LY94;

    const/4 v1, 0x7

    invoke-static {v1}, LqK2;->b(I)LqK2$b;

    move-result-object v1

    const-class v2, Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;

    iget-object v3, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->provideWeChatAuthenticator$payments_core_releaseProvider:LY94;

    invoke-virtual {v1, v2, v3}, LqK2$b;->c(Ljava/lang/Object;LY94;)LqK2$b;

    move-result-object v1

    const-class v2, Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS1;

    iget-object v3, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->webIntentAuthenticatorProvider:LY94;

    invoke-virtual {v1, v2, v3}, LqK2$b;->c(Ljava/lang/Object;LY94;)LqK2$b;

    move-result-object v1

    const-class v2, Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;

    iget-object v3, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->webIntentAuthenticatorProvider:LY94;

    invoke-virtual {v1, v2, v3}, LqK2$b;->c(Ljava/lang/Object;LY94;)LqK2$b;

    move-result-object v1

    const-class v2, Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;

    iget-object v3, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->webIntentAuthenticatorProvider:LY94;

    invoke-virtual {v1, v2, v3}, LqK2$b;->c(Ljava/lang/Object;LY94;)LqK2$b;

    move-result-object v1

    const-class v2, Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;

    iget-object v3, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->oxxoAuthenticatorProvider:LY94;

    invoke-virtual {v1, v2, v3}, LqK2$b;->c(Ljava/lang/Object;LY94;)LqK2$b;

    move-result-object v1

    const-class v2, Lcom/stripe/android/model/StripeIntent$NextActionData$CashAppRedirect;

    iget-object v3, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->webIntentAuthenticatorProvider:LY94;

    invoke-virtual {v1, v2, v3}, LqK2$b;->c(Ljava/lang/Object;LY94;)LqK2$b;

    move-result-object v1

    const-class v2, Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;

    iget-object v3, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->stripe3DS2AuthenticatorProvider:LY94;

    invoke-virtual {v1, v2, v3}, LqK2$b;->c(Ljava/lang/Object;LY94;)LqK2$b;

    move-result-object v1

    invoke-virtual {v1}, LqK2$b;->b()LqK2;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->intentAuthenticatorMapMapOfClassOfAndPaymentAuthenticatorOfStripeIntentProvider:LY94;

    iget-object v2, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->defaultPaymentAuthenticatorRegistryProvider:LY94;

    iget-object v3, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->noOpIntentAuthenticatorProvider:LY94;

    iget-object v4, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->sourceAuthenticatorProvider:LY94;

    invoke-static {v3, v4, v1}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry_Factory;->create(LY94;LY94;LY94;)Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry_Factory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    invoke-static {v2, v1}, LyZ0;->a(LY94;LY94;)V

    invoke-static/range {p8 .. p8}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->workContextProvider:LY94;

    iget-object v2, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->contextProvider:LY94;

    iget-object v3, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->enableLoggingProvider:LY94;

    invoke-static {v2, v3, v1}, Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory;->create(LY94;LY94;LY94;)Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->provideStripeThreeDs2ServiceProvider:LY94;

    invoke-static {}, Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory;->create()Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->provideMessageVersionRegistryProvider:LY94;

    invoke-static {p4}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->stripeRepositoryProvider:LY94;

    invoke-static {}, Lcom/stripe/android/core/networking/RetryDelaySupplier_Factory;->create()Lcom/stripe/android/core/networking/RetryDelaySupplier_Factory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->retryDelaySupplierProvider:LY94;

    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->enableLoggingProvider:LY94;

    move-object v2, p2

    invoke-static {p2, v1}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;->create(Lcom/stripe/android/core/injection/CoreCommonModule;LY94;)Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->provideLoggerProvider:LY94;

    iget-object v2, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->stripeRepositoryProvider:LY94;

    iget-object v3, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->analyticsRequestExecutorProvider:LY94;

    iget-object v4, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->analyticsRequestFactoryProvider:LY94;

    iget-object v5, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->retryDelaySupplierProvider:LY94;

    iget-object v6, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->workContextProvider:LY94;

    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object/from16 p5, v1

    move-object/from16 p6, v6

    invoke-static/range {p1 .. p6}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor_Factory;->create(LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor_Factory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->defaultStripe3ds2ChallengeResultProcessorProvider:LY94;

    return-void
.end method

.method private injectStripe3ds2TransactionViewModelFactory(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory;)Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory;
    .locals 3

    new-instance v0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Stripe3ds2TransactionViewModelSubcomponentBuilder;

    iget-object v1, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->authenticationComponentImpl:Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$Stripe3ds2TransactionViewModelSubcomponentBuilder;-><init>(Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;LGG0;)V

    invoke-static {p1, v0}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory_MembersInjector;->injectSubComponentBuilder(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory;Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelSubcomponent$Builder;)V

    return-object p1
.end method


# virtual methods
.method public getRegistry()Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->defaultPaymentAuthenticatorRegistryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;

    return-object v0
.end method

.method public inject(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerAuthenticationComponent$AuthenticationComponentImpl;->injectStripe3ds2TransactionViewModelFactory(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory;)Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory;

    return-void
.end method
