.class public final Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;",
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
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->requestExecutorProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->apiOptionsProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->apiRequestFactoryProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
            ">;)",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/networking/ApiRequest$Factory;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;-><init>(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/networking/ApiRequest$Factory;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->requestExecutorProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->apiOptionsProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->apiRequestFactoryProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/core/networking/ApiRequest$Factory;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->newInstance(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/networking/ApiRequest$Factory;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl_Factory;->get()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;

    move-result-object v0

    return-object v0
.end method
