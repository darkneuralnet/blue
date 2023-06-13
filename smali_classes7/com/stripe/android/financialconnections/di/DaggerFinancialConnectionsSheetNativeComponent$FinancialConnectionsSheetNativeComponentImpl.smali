.class final Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FinancialConnectionsSheetNativeComponentImpl"
.end annotation


# instance fields
.field private applicationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private final configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

.field private configurationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
            ">;"
        }
    .end annotation
.end field

.field private financialConnectionsRepositoryImplProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;",
            ">;"
        }
    .end annotation
.end field

.field private financialConnectionsRequestExecutorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
            ">;"
        }
    .end annotation
.end field

.field private final financialConnectionsSheetNativeComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;

.field private getManifestProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GetManifest;",
            ">;"
        }
    .end annotation
.end field

.field private final initialState:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

.field private initialSyncResponseProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
            ">;"
        }
    .end annotation
.end field

.field private nativeAuthFlowCoordinatorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;"
        }
    .end annotation
.end field

.field private provideConnectionsRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;",
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

.field private provideStripeNetworkClientProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/networking/StripeNetworkClient;",
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

.field private providesAnalyticsTrackerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;"
        }
    .end annotation
.end field

.field private providesApiOptions$financial_connections_releaseProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            ">;"
        }
    .end annotation
.end field

.field private providesApiRequestFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
            ">;"
        }
    .end annotation
.end field

.field private providesApplicationIdProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private providesEnableLoggingProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private providesFinancialConnectionsAccountsRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;",
            ">;"
        }
    .end annotation
.end field

.field private providesFinancialConnectionsInstitutionsRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;",
            ">;"
        }
    .end annotation
.end field

.field private providesFinancialConnectionsManifestRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
            ">;"
        }
    .end annotation
.end field

.field private providesImageLoaderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            ">;"
        }
    .end annotation
.end field

.field private providesJson$financial_connections_releaseProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbi2;",
            ">;"
        }
    .end annotation
.end field

.field private providesNavigationManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
            ">;"
        }
    .end annotation
.end field

.field private providesPublishableKeyProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private providesStripeAccountIdProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Landroid/app/Application;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->financialConnectionsSheetNativeComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->initialState:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    invoke-direct/range {p0 .. p7}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->initialize(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Landroid/app/Application;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Landroid/app/Application;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;LWI0;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;-><init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Landroid/app/Application;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V

    return-void
.end method

.method public static bridge synthetic a(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->nativeAuthFlowCoordinatorProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideConnectionsRepositoryProvider:LY94;

    return-object p0
.end method

.method private completeFinancialConnectionsSession()Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;
    .locals 4

    new-instance v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideConnectionsRepositoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->fetchPaginatedAccountsForSession()Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V

    return-object v0
.end method

.method public static bridge synthetic d(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideLocaleProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideLoggerProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesAnalyticsTrackerProvider:LY94;

    return-object p0
.end method

.method private fetchPaginatedAccountsForSession()Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideConnectionsRepositoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)V

    return-object v0
.end method

.method public static bridge synthetic g(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesApplicationIdProvider:LY94;

    return-object p0
.end method

.method private getManifest()Lcom/stripe/android/financialconnections/domain/GetManifest;
    .locals 4

    new-instance v0, Lcom/stripe/android/financialconnections/domain/GetManifest;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesFinancialConnectionsManifestRepositoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesApplicationIdProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/financialconnections/domain/GetManifest;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Ljava/lang/String;)V

    return-object v0
.end method

.method public static bridge synthetic h(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesFinancialConnectionsAccountsRepositoryProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesFinancialConnectionsInstitutionsRepositoryProvider:LY94;

    return-object p0
.end method

.method private initialize(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Landroid/app/Application;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V
    .locals 7

    invoke-static {p1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesNavigationManagerFactory;->create(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesNavigationManagerFactory;

    move-result-object p6

    invoke-static {p6}, LV51;->b(LY94;)LY94;

    move-result-object p6

    iput-object p6, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesNavigationManagerProvider:LY94;

    invoke-static {}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule_ProvidesEnableLoggingFactory;->create()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule_ProvidesEnableLoggingFactory;

    move-result-object p6

    invoke-static {p6}, LV51;->b(LY94;)LY94;

    move-result-object p6

    iput-object p6, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesEnableLoggingProvider:LY94;

    invoke-static {p2, p6}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;->create(Lcom/stripe/android/core/injection/CoreCommonModule;LY94;)Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLoggerFactory;

    move-result-object p6

    invoke-static {p6}, LV51;->b(LY94;)LY94;

    move-result-object p6

    iput-object p6, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideLoggerProvider:LY94;

    invoke-static {p5}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p5

    iput-object p5, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->applicationProvider:LY94;

    invoke-static {p1, p5}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesImageLoaderFactory;->create(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;LY94;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesImageLoaderFactory;

    move-result-object p5

    invoke-static {p5}, LV51;->b(LY94;)LY94;

    move-result-object p5

    iput-object p5, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesImageLoaderProvider:LY94;

    invoke-static {}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator_Factory;->create()Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator_Factory;

    move-result-object p5

    invoke-static {p5}, LV51;->b(LY94;)LY94;

    move-result-object p5

    iput-object p5, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->nativeAuthFlowCoordinatorProvider:LY94;

    invoke-static {p3}, Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;->create(Lcom/stripe/android/core/injection/CoroutineContextModule;)Lcom/stripe/android/core/injection/CoroutineContextModule_ProvideWorkContextFactory;

    move-result-object p3

    invoke-static {p3}, LV51;->b(LY94;)LY94;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideWorkContextProvider:LY94;

    iget-object p5, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideLoggerProvider:LY94;

    invoke-static {p3, p5}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvideStripeNetworkClientFactory;->create(LY94;LY94;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvideStripeNetworkClientFactory;

    move-result-object p3

    invoke-static {p3}, LV51;->b(LY94;)LY94;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideStripeNetworkClientProvider:LY94;

    invoke-static {}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesJson$financial_connections_releaseFactory;->create()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesJson$financial_connections_releaseFactory;

    move-result-object p3

    invoke-static {p3}, LV51;->b(LY94;)LY94;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesJson$financial_connections_releaseProvider:LY94;

    iget-object p5, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideStripeNetworkClientProvider:LY94;

    invoke-static {p5, p3}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;->create(LY94;LY94;)Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor_Factory;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->financialConnectionsRequestExecutorProvider:LY94;

    invoke-static {p7}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->configurationProvider:LY94;

    invoke-static {p3}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule_ProvidesPublishableKeyFactory;->create(LY94;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule_ProvidesPublishableKeyFactory;

    move-result-object p3

    invoke-static {p3}, LV51;->b(LY94;)LY94;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesPublishableKeyProvider:LY94;

    iget-object p3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->configurationProvider:LY94;

    invoke-static {p3}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule_ProvidesStripeAccountIdFactory;->create(LY94;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule_ProvidesStripeAccountIdFactory;

    move-result-object p3

    invoke-static {p3}, LV51;->b(LY94;)LY94;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesStripeAccountIdProvider:LY94;

    iget-object p5, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesPublishableKeyProvider:LY94;

    invoke-static {p5, p3}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesApiOptions$financial_connections_releaseFactory;->create(LY94;LY94;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesApiOptions$financial_connections_releaseFactory;

    move-result-object p3

    invoke-static {p3}, LV51;->b(LY94;)LY94;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesApiOptions$financial_connections_releaseProvider:LY94;

    invoke-static {}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesApiRequestFactoryFactory;->create()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesApiRequestFactoryFactory;

    move-result-object p3

    invoke-static {p3}, LV51;->b(LY94;)LY94;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesApiRequestFactoryProvider:LY94;

    iget-object p5, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->financialConnectionsRequestExecutorProvider:LY94;

    iget-object p6, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesApiOptions$financial_connections_releaseProvider:LY94;

    invoke-static {p5, p6, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->create(LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->financialConnectionsRepositoryImplProvider:LY94;

    invoke-static {p3}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvideConnectionsRepositoryFactory;->create(LY94;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvideConnectionsRepositoryFactory;

    move-result-object p3

    invoke-static {p3}, LV51;->b(LY94;)LY94;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideConnectionsRepositoryProvider:LY94;

    invoke-static {p2}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLocaleFactory;->create(Lcom/stripe/android/core/injection/CoreCommonModule;)Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLocaleFactory;

    move-result-object p2

    invoke-static {p2}, LV51;->b(LY94;)LY94;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideLocaleProvider:LY94;

    invoke-static {p4}, Ld52;->b(Ljava/lang/Object;)Lsj1;

    move-result-object v6

    iput-object v6, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->initialSyncResponseProvider:LY94;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->financialConnectionsRequestExecutorProvider:LY94;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesApiRequestFactoryProvider:LY94;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesApiOptions$financial_connections_releaseProvider:LY94;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideLocaleProvider:LY94;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideLoggerProvider:LY94;

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->create(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;

    move-result-object p2

    invoke-static {p2}, LV51;->b(LY94;)LY94;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesFinancialConnectionsManifestRepositoryProvider:LY94;

    iget-object p2, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->applicationProvider:LY94;

    invoke-static {p2}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule_ProvidesApplicationIdFactory;->create(LY94;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule_ProvidesApplicationIdFactory;

    move-result-object p2

    invoke-static {p2}, LV51;->b(LY94;)LY94;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesApplicationIdProvider:LY94;

    iget-object p3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesFinancialConnectionsManifestRepositoryProvider:LY94;

    iget-object p4, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->configurationProvider:LY94;

    invoke-static {p3, p4, p2}, Lcom/stripe/android/financialconnections/domain/GetManifest_Factory;->create(LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/domain/GetManifest_Factory;

    move-result-object v2

    iput-object v2, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->getManifestProvider:LY94;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->applicationProvider:LY94;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideLoggerProvider:LY94;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideLocaleProvider:LY94;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->configurationProvider:LY94;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideStripeNetworkClientProvider:LY94;

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;->create(LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetSharedModule_ProvidesAnalyticsTrackerFactory;

    move-result-object p2

    invoke-static {p2}, LV51;->b(LY94;)LY94;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesAnalyticsTrackerProvider:LY94;

    iget-object p2, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->financialConnectionsRequestExecutorProvider:LY94;

    iget-object p3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesApiRequestFactoryProvider:LY94;

    iget-object p4, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesApiOptions$financial_connections_releaseProvider:LY94;

    invoke-static {p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsInstitutionsRepositoryFactory;->create(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsInstitutionsRepositoryFactory;

    move-result-object p2

    invoke-static {p2}, LV51;->b(LY94;)LY94;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesFinancialConnectionsInstitutionsRepositoryProvider:LY94;

    iget-object p2, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->financialConnectionsRequestExecutorProvider:LY94;

    iget-object p3, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesApiOptions$financial_connections_releaseProvider:LY94;

    iget-object p4, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesApiRequestFactoryProvider:LY94;

    iget-object p5, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideLoggerProvider:LY94;

    invoke-static {p1, p2, p3, p4, p5}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsAccountsRepositoryFactory;->create(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;LY94;LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsAccountsRepositoryFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesFinancialConnectionsAccountsRepositoryProvider:LY94;

    return-void
.end method

.method private injectFinancialConnectionsSheetNativeActivity(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;)Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesNavigationManagerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    invoke-static {p1, v0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity_MembersInjector;->injectNavigationManager(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;Lcom/stripe/android/financialconnections/navigation/NavigationManager;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideLoggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/core/Logger;

    invoke-static {p1, v0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity_MembersInjector;->injectLogger(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;Lcom/stripe/android/core/Logger;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesImageLoaderProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/image/StripeImageLoader;

    invoke-static {p1, v0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity_MembersInjector;->injectImageLoader(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;Lcom/stripe/android/uicore/image/StripeImageLoader;)V

    return-object p1
.end method

.method public static bridge synthetic j(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesFinancialConnectionsManifestRepositoryProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic k(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesNavigationManagerProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic l(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;)Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->completeFinancialConnectionsSession()Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic m(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;)Lcom/stripe/android/financialconnections/domain/GetManifest;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->getManifest()Lcom/stripe/android/financialconnections/domain/GetManifest;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic n(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;)Lcom/stripe/android/financialconnections/utils/UriUtils;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->uriUtils()Lcom/stripe/android/financialconnections/utils/UriUtils;

    move-result-object p0

    return-object p0
.end method

.method private uriUtils()Lcom/stripe/android/financialconnections/utils/UriUtils;
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/utils/UriUtils;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideLoggerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/core/Logger;

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/utils/UriUtils;-><init>(Lcom/stripe/android/core/Logger;)V

    return-object v0
.end method


# virtual methods
.method public getAccountPickerBuilder()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerSubcomponent$Builder;
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$AccountPickerSubcomponentBuilder;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->financialConnectionsSheetNativeComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$AccountPickerSubcomponentBuilder;-><init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;LPI0;)V

    return-object v0
.end method

.method public getAttachPaymentSubcomponent()Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentSubcomponent$Builder;
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$AttachPaymentSubcomponentBuilder;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->financialConnectionsSheetNativeComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$AttachPaymentSubcomponentBuilder;-><init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;LRI0;)V

    return-object v0
.end method

.method public getConsentBuilder()Lcom/stripe/android/financialconnections/features/consent/ConsentSubcomponent$Builder;
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ConsentSubcomponentBuilder;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->financialConnectionsSheetNativeComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ConsentSubcomponentBuilder;-><init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;LUI0;)V

    return-object v0
.end method

.method public getInstitutionPickerBuilder()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerSubcomponent$Builder;
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$InstitutionPickerSubcomponentBuilder;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->financialConnectionsSheetNativeComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$InstitutionPickerSubcomponentBuilder;-><init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;LXI0;)V

    return-object v0
.end method

.method public getManualEntryBuilder()Lcom/stripe/android/financialconnections/features/manualentry/ManualEntrySubcomponent$Builder;
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySubcomponentBuilder;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->financialConnectionsSheetNativeComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySubcomponentBuilder;-><init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;LZI0;)V

    return-object v0
.end method

.method public getManualEntrySuccessBuilder()Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessSubcomponent$Builder;
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySuccessSubcomponentBuilder;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->financialConnectionsSheetNativeComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ManualEntrySuccessSubcomponentBuilder;-><init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;LbJ0;)V

    return-object v0
.end method

.method public getPartnerAuthSubcomponent()Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthSubcomponent$Builder;
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$PartnerAuthSubcomponentBuilder;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->financialConnectionsSheetNativeComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$PartnerAuthSubcomponentBuilder;-><init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;LdJ0;)V

    return-object v0
.end method

.method public getResetSubcomponent()Lcom/stripe/android/financialconnections/features/reset/ResetSubcomponent$Builder;
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ResetSubcomponentBuilder;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->financialConnectionsSheetNativeComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$ResetSubcomponentBuilder;-><init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;LfJ0;)V

    return-object v0
.end method

.method public getSuccessSubcomponent()Lcom/stripe/android/financialconnections/features/success/SuccessSubcomponent$Builder;
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$SuccessSubcomponentBuilder;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->financialConnectionsSheetNativeComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$SuccessSubcomponentBuilder;-><init>(Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;LhJ0;)V

    return-object v0
.end method

.method public getViewModel()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;
    .locals 10

    new-instance v9, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->nativeAuthFlowCoordinatorProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->uriUtils()Lcom/stripe/android/financialconnections/utils/UriUtils;

    move-result-object v3

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->completeFinancialConnectionsSession()Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

    move-result-object v4

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesAnalyticsTrackerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->provideLoggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/core/Logger;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->providesApplicationIdProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    iget-object v8, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->initialState:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    move-object v0, v9

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;-><init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)V

    return-object v9
.end method

.method public inject(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;->injectFinancialConnectionsSheetNativeActivity(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;)Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;

    return-void
.end method
