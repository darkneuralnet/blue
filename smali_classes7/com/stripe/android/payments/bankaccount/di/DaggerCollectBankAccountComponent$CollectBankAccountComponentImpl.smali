.class final Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CollectBankAccountComponentImpl"
.end annotation


# instance fields
.field private final application:Landroid/app/Application;

.field private final collectBankAccountComponentImpl:Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;

.field private final configuration:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

.field private provideLoggerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
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

.field private final savedStateHandle:Landroidx/lifecycle/p;

.field private final viewEffect:LBX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LBX2<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/app/Application;LBX2;Landroidx/lifecycle/p;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/injection/CoroutineContextModule;",
            "Lcom/stripe/android/core/injection/CoreCommonModule;",
            "Landroid/app/Application;",
            "LBX2<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;",
            "Landroidx/lifecycle/p;",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->collectBankAccountComponentImpl:Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;

    iput-object p6, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->configuration:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    iput-object p4, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->viewEffect:LBX2;

    iput-object p3, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->application:Landroid/app/Application;

    iput-object p5, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->savedStateHandle:Landroidx/lifecycle/p;

    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->initialize(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/app/Application;LBX2;Landroidx/lifecycle/p;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/app/Application;LBX2;Landroidx/lifecycle/p;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;LNH0;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/app/Application;LBX2;Landroidx/lifecycle/p;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;)V

    return-void
.end method

.method private attachFinancialConnectionsSession()Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;
    .locals 2

    new-instance v0, Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->stripeApiRepository()Lcom/stripe/android/networking/StripeApiRepository;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;-><init>(Lcom/stripe/android/networking/StripeRepository;)V

    return-object v0
.end method

.method private context()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->application:Landroid/app/Application;

    invoke-static {v0}, Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesAppContextFactory;->providesAppContext(Landroid/app/Application;)Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method private createFinancialConnectionsSession()Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;
    .locals 2

    new-instance v0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->stripeApiRepository()Lcom/stripe/android/networking/StripeApiRepository;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;-><init>(Lcom/stripe/android/networking/StripeRepository;)V

    return-object v0
.end method

.method private defaultAnalyticsRequestExecutor()Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;
    .locals 3

    new-instance v0, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->provideLoggerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/core/Logger;

    iget-object v2, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->provideWorkContextProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;-><init>(Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method

.method private initialize(Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/app/Application;LBX2;Landroidx/lifecycle/p;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/injection/CoroutineContextModule;",
            "Lcom/stripe/android/core/injection/CoreCommonModule;",
            "Landroid/app/Application;",
            "LBX2<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;",
            "Landroidx/lifecycle/p;",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
            ")V"
        }
    .end annotation

    invoke-static {p1}, Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;->create(Lcom/stripe/android/core/injection/CoroutineContextModule;)Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->provideWorkContextProvider:LY94;

    invoke-static {}, Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesEnableLoggingFactory;->create()Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesEnableLoggingFactory;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;->create(Lcom/stripe/android/core/injection/CoreCommonModule;LY94;)Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->provideLoggerProvider:LY94;

    return-void
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

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->configuration:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    invoke-static {v0}, Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidePublishableKeyFactory;->providePublishableKey(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;)Lkotlin/jvm/functions/Function0;

    move-result-object v0

    return-object v0
.end method

.method private paymentAnalyticsRequestFactory()Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;
    .locals 4

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->context()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->namedFunction0OfString()Lkotlin/jvm/functions/Function0;

    move-result-object v2

    invoke-static {}, Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesProductUsageFactory;->providesProductUsage()Ljava/util/Set;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V

    return-object v0
.end method

.method private retrieveStripeIntent()Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;
    .locals 2

    new-instance v0, Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->stripeApiRepository()Lcom/stripe/android/networking/StripeApiRepository;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;-><init>(Lcom/stripe/android/networking/StripeRepository;)V

    return-object v0
.end method

.method private stripeApiRepository()Lcom/stripe/android/networking/StripeApiRepository;
    .locals 9

    new-instance v8, Lcom/stripe/android/networking/StripeApiRepository;

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->context()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->namedFunction0OfString()Lkotlin/jvm/functions/Function0;

    move-result-object v2

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->provideWorkContextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lkotlin/coroutines/CoroutineContext;

    invoke-static {}, Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountModule_ProvidesProductUsageFactory;->providesProductUsage()Ljava/util/Set;

    move-result-object v4

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->paymentAnalyticsRequestFactory()Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v5

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->defaultAnalyticsRequestExecutor()Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;

    move-result-object v6

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->provideLoggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/core/Logger;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/networking/StripeApiRepository;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/Logger;)V

    return-object v8
.end method


# virtual methods
.method public getViewModel()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;
    .locals 9

    new-instance v8, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->configuration:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    iget-object v2, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->viewEffect:LBX2;

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->createFinancialConnectionsSession()Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    move-result-object v3

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->attachFinancialConnectionsSession()Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;

    move-result-object v4

    invoke-direct {p0}, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->retrieveStripeIntent()Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;

    move-result-object v5

    iget-object v6, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->savedStateHandle:Landroidx/lifecycle/p;

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/di/DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl;->provideLoggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/core/Logger;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;-><init>(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;LBX2;Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;Landroidx/lifecycle/p;Lcom/stripe/android/core/Logger;)V

    return-object v8
.end method

.method public inject(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Factory;)V
    .locals 0

    return-void
.end method
