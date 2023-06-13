.class final Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;
.super Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LinkPaymentLauncherComponentImpl"
.end annotation


# instance fields
.field private final addressRepository:Lcom/stripe/android/uicore/address/AddressRepository;

.field private analyticsRequestExecutorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            ">;"
        }
    .end annotation
.end field

.field private analyticsRequestFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            ">;"
        }
    .end annotation
.end field

.field private bindIntentConfirmationInterceptorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/IntentConfirmationInterceptor;",
            ">;"
        }
    .end annotation
.end field

.field private bindLinkEventsReporterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
            ">;"
        }
    .end annotation
.end field

.field private final configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

.field private configurationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            ">;"
        }
    .end annotation
.end field

.field private confirmationManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/confirmation/ConfirmationManager;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private contextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private cookieStoreProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/account/CookieStore;",
            ">;"
        }
    .end annotation
.end field

.field private defaultIntentConfirmationInterceptorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/DefaultIntentConfirmationInterceptor;",
            ">;"
        }
    .end annotation
.end field

.field private defaultLinkEventsReporterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;",
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

.field private encryptedStoreProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/account/EncryptedStore;",
            ">;"
        }
    .end annotation
.end field

.field private ioContextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;"
        }
    .end annotation
.end field

.field private linkAccountManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            ">;"
        }
    .end annotation
.end field

.field private linkApiRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/repositories/LinkApiRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

.field private navigatorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/model/Navigator;",
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

.field private provideConsumersApiServiceProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/repository/ConsumersApiService;",
            ">;"
        }
    .end annotation
.end field

.field private provideLocaleProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/Locale;",
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

.field private stripeAccountIdProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private stripePaymentLauncherAssistedFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            ">;"
        }
    .end annotation
.end field

.field private stripePaymentLauncherProvider:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;

.field private stripeRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/networking/StripeRepository;",
            ">;"
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


# direct methods
.method private constructor <init>(Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/injection/CoreCommonModule;",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            "Landroid/content/Context;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Lcom/stripe/android/uicore/address/AddressRepository;",
            "Ljava/lang/Boolean;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;-><init>()V

    iput-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

    iput-object p2, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iput-object p9, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->addressRepository:Lcom/stripe/android/uicore/address/AddressRepository;

    iput-object p3, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->context:Landroid/content/Context;

    invoke-direct/range {p0 .. p13}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->initialize(Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/Set;LCL0;)V
    .locals 0

    invoke-direct/range {p0 .. p13}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V

    return-void
.end method

.method public static bridge synthetic a(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)Lcom/stripe/android/uicore/address/AddressRepository;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->addressRepository:Lcom/stripe/android/uicore/address/AddressRepository;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->bindIntentConfirmationInterceptorProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->bindLinkEventsReporterProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->confirmationManagerProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->context:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->linkAccountManagerProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->navigatorProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic h(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->provideLoggerProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)Lcom/stripe/android/link/ui/verification/VerificationViewModel;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->verificationViewModel()Lcom/stripe/android/link/ui/verification/VerificationViewModel;

    move-result-object p0

    return-object p0
.end method

.method private initialize(Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/injection/CoreCommonModule;",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            "Landroid/content/Context;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Lcom/stripe/android/uicore/address/AddressRepository;",
            "Ljava/lang/Boolean;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    invoke-static {p2}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->configurationProvider:LY94;

    invoke-static/range {p11 .. p11}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->publishableKeyProvider:LY94;

    invoke-static/range {p12 .. p12}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->stripeAccountIdProvider:LY94;

    invoke-static/range {p8 .. p8}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->stripeRepositoryProvider:LY94;

    invoke-static/range {p10 .. p10}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->enableLoggingProvider:LY94;

    move-object v2, p1

    invoke-static {p1, v1}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;->create(Lcom/stripe/android/core/injection/CoreCommonModule;LY94;)Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->provideLoggerProvider:LY94;

    invoke-static {p4}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->ioContextProvider:LY94;

    iget-object v3, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->provideLoggerProvider:LY94;

    invoke-static {v3, v1}, Lcom/stripe/android/link/injection/LinkCommonModule_Companion_ProvideConsumersApiServiceFactory;->create(LY94;LY94;)Lcom/stripe/android/link/injection/LinkCommonModule_Companion_ProvideConsumersApiServiceFactory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->provideConsumersApiServiceProvider:LY94;

    invoke-static {p1}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLocaleFactory;->create(Lcom/stripe/android/core/injection/CoreCommonModule;)Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLocaleFactory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v7

    iput-object v7, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->provideLocaleProvider:LY94;

    iget-object v2, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->publishableKeyProvider:LY94;

    iget-object v3, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->stripeAccountIdProvider:LY94;

    iget-object v4, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->stripeRepositoryProvider:LY94;

    iget-object v5, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->provideConsumersApiServiceProvider:LY94;

    iget-object v6, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->ioContextProvider:LY94;

    invoke-static/range {v2 .. v7}, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;->create(LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->linkApiRepositoryProvider:LY94;

    invoke-static {p3}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->contextProvider:LY94;

    invoke-static {v1}, Lcom/stripe/android/link/account/EncryptedStore_Factory;->create(LY94;)Lcom/stripe/android/link/account/EncryptedStore_Factory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->encryptedStoreProvider:LY94;

    invoke-static {v1}, Lcom/stripe/android/link/account/CookieStore_Factory;->create(LY94;)Lcom/stripe/android/link/account/CookieStore_Factory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->cookieStoreProvider:LY94;

    invoke-static {p7}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->analyticsRequestExecutorProvider:LY94;

    invoke-static {p6}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->analyticsRequestFactoryProvider:LY94;

    iget-object v2, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->analyticsRequestExecutorProvider:LY94;

    iget-object v3, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->ioContextProvider:LY94;

    iget-object v4, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->provideLoggerProvider:LY94;

    invoke-static {v2, v1, v3, v4}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;->create(LY94;LY94;LY94;LY94;)Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->defaultLinkEventsReporterProvider:LY94;

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->bindLinkEventsReporterProvider:LY94;

    iget-object v2, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->configurationProvider:LY94;

    iget-object v3, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->linkApiRepositoryProvider:LY94;

    iget-object v4, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->cookieStoreProvider:LY94;

    invoke-static {v2, v3, v4, v1}, Lcom/stripe/android/link/account/LinkAccountManager_Factory;->create(LY94;LY94;LY94;LY94;)Lcom/stripe/android/link/account/LinkAccountManager_Factory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->linkAccountManagerProvider:LY94;

    invoke-static {}, Lcom/stripe/android/link/model/Navigator_Factory;->create()Lcom/stripe/android/link/model/Navigator_Factory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->navigatorProvider:LY94;

    invoke-static {p5}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->uiContextProvider:LY94;

    invoke-static/range {p13 .. p13}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->productUsageProvider:LY94;

    iget-object v2, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->contextProvider:LY94;

    iget-object v3, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->enableLoggingProvider:LY94;

    iget-object v4, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->ioContextProvider:LY94;

    iget-object v5, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->uiContextProvider:LY94;

    iget-object v6, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->stripeRepositoryProvider:LY94;

    iget-object v7, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->analyticsRequestFactoryProvider:LY94;

    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object p5, v6

    move-object p6, v7

    move-object p7, v1

    invoke-static/range {p1 .. p7}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;->create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->stripePaymentLauncherProvider:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;

    invoke-static {v1}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory_Impl;->create(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->stripePaymentLauncherAssistedFactoryProvider:LY94;

    iget-object v2, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->publishableKeyProvider:LY94;

    iget-object v3, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->stripeAccountIdProvider:LY94;

    invoke-static {v1, v2, v3}, Lcom/stripe/android/link/confirmation/ConfirmationManager_Factory;->create(LY94;LY94;LY94;)Lcom/stripe/android/link/confirmation/ConfirmationManager_Factory;

    move-result-object v1

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->confirmationManagerProvider:LY94;

    iget-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->contextProvider:LY94;

    iget-object v2, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->stripeRepositoryProvider:LY94;

    iget-object v3, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->publishableKeyProvider:LY94;

    iget-object v4, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->stripeAccountIdProvider:LY94;

    invoke-static {v1, v2, v3, v4}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;->create(LY94;LY94;LY94;LY94;)Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->defaultIntentConfirmationInterceptorProvider:LY94;

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->bindIntentConfirmationInterceptorProvider:LY94;

    return-void
.end method

.method private injectFactory(Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;)Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->verificationViewModel()Lcom/stripe/android/link/ui/verification/VerificationViewModel;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel_Factory_MembersInjector;->injectViewModel(Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;Lcom/stripe/android/link/ui/verification/VerificationViewModel;)V

    return-object p1
.end method

.method private injectFactory2(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$Factory;)Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$Factory;
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->inlineSignupViewModel()Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory_MembersInjector;->injectViewModel(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$Factory;Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)V

    return-object p1
.end method

.method private inlineSignupViewModel()Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;
    .locals 5

    new-instance v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->linkAccountManagerProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/account/LinkAccountManager;

    iget-object v3, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->bindLinkEventsReporterProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/link/analytics/LinkEventsReporter;

    iget-object v4, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->provideLoggerProvider:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/core/Logger;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;-><init>(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;)V

    return-object v0
.end method

.method private verificationViewModel()Lcom/stripe/android/link/ui/verification/VerificationViewModel;
    .locals 5

    new-instance v0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->linkAccountManagerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/account/LinkAccountManager;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->bindLinkEventsReporterProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/analytics/LinkEventsReporter;

    iget-object v3, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->navigatorProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/link/model/Navigator;

    iget-object v4, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->provideLoggerProvider:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/core/Logger;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;)V

    return-object v0
.end method


# virtual methods
.method public getConfiguration()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->configuration:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    return-object v0
.end method

.method public getLinkAccountManager()Lcom/stripe/android/link/account/LinkAccountManager;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->linkAccountManagerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/account/LinkAccountManager;

    return-object v0
.end method

.method public getLinkComponentBuilder()Lcom/stripe/android/link/injection/LinkComponent$Builder;
    .locals 3

    new-instance v0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentBuilder;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentBuilder;-><init>(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;LAL0;)V

    return-object v0
.end method

.method public getLinkEventsReporter()Lcom/stripe/android/link/analytics/LinkEventsReporter;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->bindLinkEventsReporterProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/analytics/LinkEventsReporter;

    return-object v0
.end method

.method public inject(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$Factory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->injectFactory2(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$Factory;)Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$Factory;

    return-void
.end method

.method public inject(Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->injectFactory(Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;)Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;

    return-void
.end method
