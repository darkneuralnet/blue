.class public final Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;
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

.field private final initialSynchronizeSessionResponseProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
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

.field private final module:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;

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
.method public constructor <init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;",
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
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->module:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->requestExecutorProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->apiRequestFactoryProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->apiOptionsProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->localeProvider:LY94;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->loggerProvider:LY94;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->initialSynchronizeSessionResponseProvider:LY94;

    return-void
.end method

.method public static create(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;",
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
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
            ">;)",
            "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;"
        }
    .end annotation

    new-instance v8, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;-><init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static providesFinancialConnectionsManifestRepository(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Locale;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;
    .locals 0

    invoke-virtual/range {p0 .. p6}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;->providesFinancialConnectionsManifestRepository(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Locale;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->module:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->requestExecutorProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->apiRequestFactoryProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/core/networking/ApiRequest$Factory;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->apiOptionsProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->localeProvider:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Locale;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->loggerProvider:LY94;

    invoke-interface {v5}, LY94;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/core/Logger;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->initialSynchronizeSessionResponseProvider:LY94;

    invoke-interface {v6}, LY94;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->providesFinancialConnectionsManifestRepository(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Locale;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsManifestRepositoryFactory;->get()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    move-result-object v0

    return-object v0
.end method
