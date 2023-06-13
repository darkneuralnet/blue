.class public final Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;",
        ">;"
    }
.end annotation


# instance fields
.field private final fetchPaginatedAccountsForSessionProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;",
            ">;"
        }
    .end annotation
.end field

.field private final financialConnectionsRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession_Factory;->fetchPaginatedAccountsForSessionProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession_Factory;->financialConnectionsRepositoryProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;)Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;",
            ">;)",
            "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession_Factory;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession_Factory;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;-><init>(Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession_Factory;->fetchPaginatedAccountsForSessionProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession_Factory;->financialConnectionsRepositoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    invoke-static {v0, v1}, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession_Factory;->newInstance(Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession_Factory;->get()Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;

    move-result-object v0

    return-object v0
.end method
