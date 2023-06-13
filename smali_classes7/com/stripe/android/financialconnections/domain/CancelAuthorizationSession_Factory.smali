.class public final Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;",
        ">;"
    }
.end annotation


# instance fields
.field private final configurationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
            ">;"
        }
    .end annotation
.end field

.field private final coordinatorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;"
        }
    .end annotation
.end field

.field private final repositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
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
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession_Factory;->coordinatorProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession_Factory;->repositoryProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession_Factory;->configurationProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
            ">;)",
            "Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession_Factory;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession_Factory;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;-><init>(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession_Factory;->coordinatorProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession_Factory;->repositoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession_Factory;->configurationProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession_Factory;->newInstance(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession_Factory;->get()Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;

    move-result-object v0

    return-object v0
.end method
