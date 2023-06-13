.class public final Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsInstitutionsRepositoryFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;",
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
.method public constructor <init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;LY94;LY94;LY94;)V
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
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsInstitutionsRepositoryFactory;->module:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsInstitutionsRepositoryFactory;->requestExecutorProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsInstitutionsRepositoryFactory;->apiRequestFactoryProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsInstitutionsRepositoryFactory;->apiOptionsProvider:LY94;

    return-void
.end method

.method public static create(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsInstitutionsRepositoryFactory;
    .locals 1
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
            ">;)",
            "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsInstitutionsRepositoryFactory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsInstitutionsRepositoryFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsInstitutionsRepositoryFactory;-><init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static providesFinancialConnectionsInstitutionsRepository(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;->providesFinancialConnectionsInstitutionsRepository(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsInstitutionsRepositoryFactory;->module:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsInstitutionsRepositoryFactory;->requestExecutorProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsInstitutionsRepositoryFactory;->apiRequestFactoryProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/core/networking/ApiRequest$Factory;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsInstitutionsRepositoryFactory;->apiOptionsProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-static {v0, v1, v2, v3}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsInstitutionsRepositoryFactory;->providesFinancialConnectionsInstitutionsRepository(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule;Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeModule_ProvidesFinancialConnectionsInstitutionsRepositoryFactory;->get()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;

    move-result-object v0

    return-object v0
.end method
