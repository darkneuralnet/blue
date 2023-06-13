.class public final Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;",
        ">;"
    }
.end annotation


# instance fields
.field private final applicationIdProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final configurationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
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
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession_Factory;->repositoryProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession_Factory;->configurationProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession_Factory;->applicationIdProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession_Factory;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession_Factory;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Ljava/lang/String;)Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession_Factory;->repositoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession_Factory;->configurationProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession_Factory;->applicationIdProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession_Factory;->newInstance(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Ljava/lang/String;)Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession_Factory;->get()Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;

    move-result-object v0

    return-object v0
.end method
