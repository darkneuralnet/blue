.class public final Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;",
        ">;"
    }
.end annotation


# instance fields
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
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession_Factory;->financialConnectionsRepositoryProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;",
            ">;)",
            "Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession_Factory;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession_Factory;-><init>(LY94;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession_Factory;->financialConnectionsRepositoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    invoke-static {v0}, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession_Factory;->newInstance(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession_Factory;->get()Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;

    move-result-object v0

    return-object v0
.end method
