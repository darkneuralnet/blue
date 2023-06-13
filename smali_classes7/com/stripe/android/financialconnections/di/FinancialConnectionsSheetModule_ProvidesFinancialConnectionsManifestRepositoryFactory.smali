.class public final Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiOptionsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            ">;"
        }
    .end annotation
.end field

.field private final apiRequestFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
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

.field private final loggerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;"
        }
    .end annotation
.end field

.field private final requestExecutorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            ">;",
            "LY94<",
            "Ljava/util/Locale;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->requestExecutorProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->apiRequestFactoryProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->apiOptionsProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->localeProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->loggerProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            ">;",
            "LY94<",
            "Ljava/util/Locale;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;)",
            "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory;"
        }
    .end annotation

    new-instance v6, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static providesFinancialConnectionsManifestRepository(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Locale;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;
    .locals 6

    sget-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule;->INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule;->providesFinancialConnectionsManifestRepository(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Locale;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->requestExecutorProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->apiRequestFactoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/core/networking/ApiRequest$Factory;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->apiOptionsProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->localeProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Locale;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->loggerProvider:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/core/Logger;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->providesFinancialConnectionsManifestRepository(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Locale;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->get()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    move-result-object v0

    return-object v0
.end method
