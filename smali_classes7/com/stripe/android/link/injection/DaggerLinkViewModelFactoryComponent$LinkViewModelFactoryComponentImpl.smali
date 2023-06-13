.class final Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;
.super Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LinkViewModelFactoryComponentImpl"
.end annotation


# instance fields
.field private addressRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/uicore/address/AddressRepository;",
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

.field private defaultAnalyticsRequestExecutorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;",
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

.field private formControllerSubcomponentBuilderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
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

.field private final linkViewModelFactoryComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;

.field private navigatorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/model/Navigator;",
            ">;"
        }
    .end annotation
.end field

.field private paymentAnalyticsRequestFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
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

.field private provideConfigurationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            ">;"
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

.field private provideResourcesProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/res/Resources;",
            ">;"
        }
    .end annotation
.end field

.field private provideUIContextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;"
        }
    .end annotation
.end field

.field private provideWorkContextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
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

.field private signedInViewModelSubcomponentBuilderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/injection/SignedInViewModelSubcomponent$Builder;",
            ">;"
        }
    .end annotation
.end field

.field private final starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

.field private starterArgsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;"
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

.field private stripeApiRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/networking/StripeApiRepository;",
            ">;"
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


# direct methods
.method private constructor <init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lcom/stripe/android/link/LinkActivityContract$Args;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/injection/CoroutineContextModule;",
            "Lcom/stripe/android/core/injection/CoreCommonModule;",
            "Landroid/content/Context;",
            "Ljava/lang/Boolean;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent;-><init>()V

    iput-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->linkViewModelFactoryComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;

    iput-object p8, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    iput-object p3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->context:Landroid/content/Context;

    invoke-direct/range {p0 .. p8}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->initialize(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lcom/stripe/android/link/LinkActivityContract$Args;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lcom/stripe/android/link/LinkActivityContract$Args;LIL0;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lcom/stripe/android/link/LinkActivityContract$Args;)V

    return-void
.end method

.method public static bridge synthetic a(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->addressRepositoryProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->bindIntentConfirmationInterceptorProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->confirmationManagerProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->context:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->formControllerSubcomponentBuilderProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->linkAccountManagerProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;)Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->linkViewModelFactoryComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;

    return-object p0
.end method

.method public static bridge synthetic h(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->navigatorProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideLoggerProvider:LY94;

    return-object p0
.end method

.method private initialize(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lcom/stripe/android/link/LinkActivityContract$Args;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/injection/CoroutineContextModule;",
            "Lcom/stripe/android/core/injection/CoreCommonModule;",
            "Landroid/content/Context;",
            "Ljava/lang/Boolean;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ")V"
        }
    .end annotation

    invoke-static {p8}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p8

    iput-object p8, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->starterArgsProvider:LY94;

    invoke-static {p8}, Lcom/stripe/android/link/injection/LinkActivityContractArgsModule_Companion_ProvideConfigurationFactory;->create(LY94;)Lcom/stripe/android/link/injection/LinkActivityContractArgsModule_Companion_ProvideConfigurationFactory;

    move-result-object p8

    invoke-static {p8}, LV51;->b(LY94;)LY94;

    move-result-object p8

    iput-object p8, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideConfigurationProvider:LY94;

    invoke-static {p5}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p5

    iput-object p5, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->publishableKeyProvider:LY94;

    invoke-static {p6}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p5

    iput-object p5, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->stripeAccountIdProvider:LY94;

    invoke-static {p3}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->contextProvider:LY94;

    invoke-static {p1}, Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;->create(Lcom/stripe/android/core/injection/CoroutineContextModule;)Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;

    move-result-object p3

    invoke-static {p3}, LV51;->b(LY94;)LY94;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideWorkContextProvider:LY94;

    invoke-static {p7}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->productUsageProvider:LY94;

    iget-object p5, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->contextProvider:LY94;

    iget-object p6, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->publishableKeyProvider:LY94;

    invoke-static {p5, p6, p3}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory_Factory;->create(LY94;LY94;LY94;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory_Factory;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->paymentAnalyticsRequestFactoryProvider:LY94;

    invoke-static {p4}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->enableLoggingProvider:LY94;

    invoke-static {p2, p3}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;->create(Lcom/stripe/android/core/injection/CoreCommonModule;LY94;)Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;

    move-result-object p3

    invoke-static {p3}, LV51;->b(LY94;)LY94;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideLoggerProvider:LY94;

    iget-object p4, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideWorkContextProvider:LY94;

    invoke-static {p3, p4}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor_Factory;->create(LY94;LY94;)Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor_Factory;

    move-result-object v5

    iput-object v5, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->defaultAnalyticsRequestExecutorProvider:LY94;

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->contextProvider:LY94;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->publishableKeyProvider:LY94;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideWorkContextProvider:LY94;

    iget-object v3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->productUsageProvider:LY94;

    iget-object v4, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->paymentAnalyticsRequestFactoryProvider:LY94;

    iget-object v6, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideLoggerProvider:LY94;

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/networking/StripeApiRepository_Factory;->create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/networking/StripeApiRepository_Factory;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->stripeApiRepositoryProvider:LY94;

    iget-object p3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideLoggerProvider:LY94;

    iget-object p4, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideWorkContextProvider:LY94;

    invoke-static {p3, p4}, Lcom/stripe/android/link/injection/LinkCommonModule_Companion_ProvideConsumersApiServiceFactory;->create(LY94;LY94;)Lcom/stripe/android/link/injection/LinkCommonModule_Companion_ProvideConsumersApiServiceFactory;

    move-result-object p3

    invoke-static {p3}, LV51;->b(LY94;)LY94;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideConsumersApiServiceProvider:LY94;

    invoke-static {p2}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLocaleFactory;->create(Lcom/stripe/android/core/injection/CoreCommonModule;)Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLocaleFactory;

    move-result-object p2

    invoke-static {p2}, LV51;->b(LY94;)LY94;

    move-result-object p8

    iput-object p8, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideLocaleProvider:LY94;

    iget-object p3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->publishableKeyProvider:LY94;

    iget-object p4, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->stripeAccountIdProvider:LY94;

    iget-object p5, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->stripeApiRepositoryProvider:LY94;

    iget-object p6, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideConsumersApiServiceProvider:LY94;

    iget-object p7, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideWorkContextProvider:LY94;

    invoke-static/range {p3 .. p8}, Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;->create(LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/link/repositories/LinkApiRepository_Factory;

    move-result-object p2

    invoke-static {p2}, LV51;->b(LY94;)LY94;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->linkApiRepositoryProvider:LY94;

    iget-object p2, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->contextProvider:LY94;

    invoke-static {p2}, Lcom/stripe/android/link/account/EncryptedStore_Factory;->create(LY94;)Lcom/stripe/android/link/account/EncryptedStore_Factory;

    move-result-object p2

    invoke-static {p2}, LV51;->b(LY94;)LY94;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->encryptedStoreProvider:LY94;

    invoke-static {p2}, Lcom/stripe/android/link/account/CookieStore_Factory;->create(LY94;)Lcom/stripe/android/link/account/CookieStore_Factory;

    move-result-object p2

    invoke-static {p2}, LV51;->b(LY94;)LY94;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->cookieStoreProvider:LY94;

    iget-object p2, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->defaultAnalyticsRequestExecutorProvider:LY94;

    iget-object p3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->paymentAnalyticsRequestFactoryProvider:LY94;

    iget-object p4, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideWorkContextProvider:LY94;

    iget-object p5, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideLoggerProvider:LY94;

    invoke-static {p2, p3, p4, p5}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;->create(LY94;LY94;LY94;LY94;)Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->defaultLinkEventsReporterProvider:LY94;

    invoke-static {p2}, LV51;->b(LY94;)LY94;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->bindLinkEventsReporterProvider:LY94;

    iget-object p3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideConfigurationProvider:LY94;

    iget-object p4, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->linkApiRepositoryProvider:LY94;

    iget-object p5, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->cookieStoreProvider:LY94;

    invoke-static {p3, p4, p5, p2}, Lcom/stripe/android/link/account/LinkAccountManager_Factory;->create(LY94;LY94;LY94;LY94;)Lcom/stripe/android/link/account/LinkAccountManager_Factory;

    move-result-object p2

    invoke-static {p2}, LV51;->b(LY94;)LY94;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->linkAccountManagerProvider:LY94;

    invoke-static {}, Lcom/stripe/android/link/model/Navigator_Factory;->create()Lcom/stripe/android/link/model/Navigator_Factory;

    move-result-object p2

    invoke-static {p2}, LV51;->b(LY94;)LY94;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->navigatorProvider:LY94;

    invoke-static {p1}, Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideUIContextFactory;->create(Lcom/stripe/android/core/injection/CoroutineContextModule;)Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideUIContextFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p5

    iput-object p5, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideUIContextProvider:LY94;

    iget-object p2, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->contextProvider:LY94;

    iget-object p3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->enableLoggingProvider:LY94;

    iget-object p4, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideWorkContextProvider:LY94;

    iget-object p6, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->stripeApiRepositoryProvider:LY94;

    iget-object p7, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->paymentAnalyticsRequestFactoryProvider:LY94;

    iget-object p8, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->productUsageProvider:LY94;

    invoke-static/range {p2 .. p8}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;->create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->stripePaymentLauncherProvider:Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;

    invoke-static {p1}, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory_Impl;->create(Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher_Factory;)LY94;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->stripePaymentLauncherAssistedFactoryProvider:LY94;

    iget-object p2, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->publishableKeyProvider:LY94;

    iget-object p3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->stripeAccountIdProvider:LY94;

    invoke-static {p1, p2, p3}, Lcom/stripe/android/link/confirmation/ConfirmationManager_Factory;->create(LY94;LY94;LY94;)Lcom/stripe/android/link/confirmation/ConfirmationManager_Factory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->confirmationManagerProvider:LY94;

    new-instance p1, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl$1;

    invoke-direct {p1, p0}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl$1;-><init>(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;)V

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->signedInViewModelSubcomponentBuilderProvider:LY94;

    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->contextProvider:LY94;

    iget-object p2, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->stripeApiRepositoryProvider:LY94;

    iget-object p3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->publishableKeyProvider:LY94;

    iget-object p4, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->stripeAccountIdProvider:LY94;

    invoke-static {p1, p2, p3, p4}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;->create(LY94;LY94;LY94;LY94;)Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->defaultIntentConfirmationInterceptorProvider:LY94;

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->bindIntentConfirmationInterceptorProvider:LY94;

    new-instance p1, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl$2;

    invoke-direct {p1, p0}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl$2;-><init>(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;)V

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->formControllerSubcomponentBuilderProvider:LY94;

    iget-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->contextProvider:LY94;

    invoke-static {p1}, Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule_ProvideResourcesFactory;->create(LY94;)Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule_ProvideResourcesFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideResourcesProvider:LY94;

    iget-object p2, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideWorkContextProvider:LY94;

    invoke-static {p1, p2}, Lcom/stripe/android/uicore/address/AddressRepository_Factory;->create(LY94;LY94;)Lcom/stripe/android/uicore/address/AddressRepository_Factory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->addressRepositoryProvider:LY94;

    return-void
.end method

.method private injectFactory(Lcom/stripe/android/link/LinkActivityViewModel$Factory;)Lcom/stripe/android/link/LinkActivityViewModel$Factory;
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->linkActivityViewModel()Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/stripe/android/link/LinkActivityViewModel_Factory_MembersInjector;->injectViewModel(Lcom/stripe/android/link/LinkActivityViewModel$Factory;Lcom/stripe/android/link/LinkActivityViewModel;)V

    return-object p1
.end method

.method private injectFactory2(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;)Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->signUpViewModel()Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory_MembersInjector;->injectSignUpViewModel(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;Lcom/stripe/android/link/ui/signup/SignUpViewModel;)V

    return-object p1
.end method

.method private injectFactory3(Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;)Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->verificationViewModel()Lcom/stripe/android/link/ui/verification/VerificationViewModel;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel_Factory_MembersInjector;->injectViewModel(Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;Lcom/stripe/android/link/ui/verification/VerificationViewModel;)V

    return-object p1
.end method

.method private injectFactory4(Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;)Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->signedInViewModelSubcomponentBuilderProvider:LY94;

    invoke-static {p1, v0}, Lcom/stripe/android/link/ui/wallet/WalletViewModel_Factory_MembersInjector;->injectSubComponentBuilderProvider(Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;LY94;)V

    return-object p1
.end method

.method private injectFactory5(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;)Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->signedInViewModelSubcomponentBuilderProvider:LY94;

    invoke-static {p1, v0}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory_MembersInjector;->injectSubComponentBuilderProvider(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;LY94;)V

    return-object p1
.end method

.method private injectFactory6(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;)Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->signedInViewModelSubcomponentBuilderProvider:LY94;

    invoke-static {p1, v0}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory_MembersInjector;->injectSubComponentBuilderProvider(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;LY94;)V

    return-object p1
.end method

.method public static bridge synthetic j(Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;)Lcom/stripe/android/link/LinkActivityContract$Args;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    return-object p0
.end method

.method private linkActivityViewModel()Lcom/stripe/android/link/LinkActivityViewModel;
    .locals 5

    new-instance v0, Lcom/stripe/android/link/LinkActivityViewModel;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->linkAccountManagerProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/account/LinkAccountManager;

    iget-object v3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->navigatorProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/link/model/Navigator;

    iget-object v4, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->confirmationManagerProvider:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/link/confirmation/ConfirmationManager;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/link/LinkActivityViewModel;-><init>(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/link/confirmation/ConfirmationManager;)V

    return-object v0
.end method

.method private signUpViewModel()Lcom/stripe/android/link/ui/signup/SignUpViewModel;
    .locals 7

    new-instance v6, Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->linkAccountManagerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/account/LinkAccountManager;

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->bindLinkEventsReporterProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/link/analytics/LinkEventsReporter;

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->navigatorProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/link/model/Navigator;

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideLoggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/core/Logger;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;-><init>(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;)V

    return-object v6
.end method

.method private verificationViewModel()Lcom/stripe/android/link/ui/verification/VerificationViewModel;
    .locals 5

    new-instance v0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->linkAccountManagerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/account/LinkAccountManager;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->bindLinkEventsReporterProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/analytics/LinkEventsReporter;

    iget-object v3, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->navigatorProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/link/model/Navigator;

    iget-object v4, p0, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->provideLoggerProvider:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/core/Logger;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;)V

    return-object v0
.end method


# virtual methods
.method public inject(Lcom/stripe/android/link/LinkActivityViewModel$Factory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->injectFactory(Lcom/stripe/android/link/LinkActivityViewModel$Factory;)Lcom/stripe/android/link/LinkActivityViewModel$Factory;

    return-void
.end method

.method public inject(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->injectFactory6(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;)Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;

    return-void
.end method

.method public inject(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->injectFactory5(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;)Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;

    return-void
.end method

.method public inject(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->injectFactory2(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;)Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;

    return-void
.end method

.method public inject(Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->injectFactory3(Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;)Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;

    return-void
.end method

.method public inject(Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkViewModelFactoryComponent$LinkViewModelFactoryComponentImpl;->injectFactory4(Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;)Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;

    return-void
.end method
