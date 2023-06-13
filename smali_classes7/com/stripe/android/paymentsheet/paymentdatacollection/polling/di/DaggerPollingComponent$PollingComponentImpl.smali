.class final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PollingComponentImpl"
.end annotation


# instance fields
.field private final application:Landroid/app/Application;

.field private applicationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private final config:Lcom/stripe/android/polling/IntentStatusPoller$Config;

.field private final ioDispatcher:LSC0;

.field private final pollingComponentImpl:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;

.field private pollingViewModelSubcomponentBuilderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelSubcomponent$Builder;",
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

.field private providePaymentConfigurationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
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

.field private providesAppContextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/app/Application;Lcom/stripe/android/polling/IntentStatusPoller$Config;LSC0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->pollingComponentImpl:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->application:Landroid/app/Application;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->config:Lcom/stripe/android/polling/IntentStatusPoller$Config;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->ioDispatcher:LSC0;

    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->initialize(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/app/Application;Lcom/stripe/android/polling/IntentStatusPoller$Config;LSC0;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/app/Application;Lcom/stripe/android/polling/IntentStatusPoller$Config;LSC0;Ljava/lang/String;LZN0;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/app/Application;Lcom/stripe/android/polling/IntentStatusPoller$Config;LSC0;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic a(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;)LSC0;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->ioDispatcher:LSC0;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->pollingComponentImpl:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;)Lcom/stripe/android/polling/DefaultIntentStatusPoller;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->defaultIntentStatusPoller()Lcom/stripe/android/polling/DefaultIntentStatusPoller;

    move-result-object p0

    return-object p0
.end method

.method private context()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->application:Landroid/app/Application;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidesAppContextFactory;->providesAppContext(Landroid/app/Application;)Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method private defaultAnalyticsRequestExecutor()Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;
    .locals 3

    new-instance v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->provideLoggerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/core/Logger;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->provideWorkContextProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;-><init>(Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method

.method private defaultIntentStatusPoller()Lcom/stripe/android/polling/DefaultIntentStatusPoller;
    .locals 5

    new-instance v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->stripeApiRepository()Lcom/stripe/android/networking/StripeApiRepository;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->providePaymentConfigurationProvider:LY94;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->config:Lcom/stripe/android/polling/IntentStatusPoller$Config;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->ioDispatcher:LSC0;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/polling/DefaultIntentStatusPoller;-><init>(Lcom/stripe/android/networking/StripeRepository;LY94;Lcom/stripe/android/polling/IntentStatusPoller$Config;LSC0;)V

    return-object v0
.end method

.method private initialize(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/app/Application;Lcom/stripe/android/polling/IntentStatusPoller$Config;LSC0;Ljava/lang/String;)V
    .locals 0

    new-instance p4, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl$1;

    invoke-direct {p4, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl$1;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;)V

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->pollingViewModelSubcomponentBuilderProvider:LY94;

    invoke-static {p1}, Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;->create(Lcom/stripe/android/core/injection/CoroutineContextModule;)Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->provideWorkContextProvider:LY94;

    invoke-static {}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidesEnableLoggingFactory;->create()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidesEnableLoggingFactory;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;->create(Lcom/stripe/android/core/injection/CoreCommonModule;LY94;)Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->provideLoggerProvider:LY94;

    invoke-static {p3}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->applicationProvider:LY94;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidesAppContextFactory;->create(LY94;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidesAppContextFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->providesAppContextProvider:LY94;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidePaymentConfigurationFactory;->create(LY94;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidePaymentConfigurationFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->providePaymentConfigurationProvider:LY94;

    return-void
.end method

.method private injectFactory(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->pollingViewModelSubcomponentBuilderProvider:LY94;

    invoke-static {p1, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory_MembersInjector;->injectSubcomponentBuilderProvider(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;LY94;)V

    return-object p1
.end method

.method private namedFunction0OfString()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->context()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidePublishableKeyFactory;->providePublishableKey(Landroid/content/Context;)Lkotlin/jvm/functions/Function0;

    move-result-object v0

    return-object v0
.end method

.method private paymentAnalyticsRequestFactory()Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;
    .locals 4

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->context()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->namedFunction0OfString()Lkotlin/jvm/functions/Function0;

    move-result-object v2

    invoke-static {}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidesProductUsageFactory;->providesProductUsage()Ljava/util/Set;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V

    return-object v0
.end method

.method private stripeApiRepository()Lcom/stripe/android/networking/StripeApiRepository;
    .locals 9

    new-instance v8, Lcom/stripe/android/networking/StripeApiRepository;

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->context()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->namedFunction0OfString()Lkotlin/jvm/functions/Function0;

    move-result-object v2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->provideWorkContextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lkotlin/coroutines/CoroutineContext;

    invoke-static {}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelModule_Companion_ProvidesProductUsageFactory;->providesProductUsage()Ljava/util/Set;

    move-result-object v4

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->paymentAnalyticsRequestFactory()Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v5

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->defaultAnalyticsRequestExecutor()Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    move-result-object v6

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->provideLoggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/core/Logger;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/Logger;)V

    return-object v8
.end method


# virtual methods
.method public inject(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/DaggerPollingComponent$PollingComponentImpl;->injectFactory(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;

    return-void
.end method
