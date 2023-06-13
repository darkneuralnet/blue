.class public final Lcom/stripe/android/financialconnections/domain/AcceptConsent_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/domain/AcceptConsent;",
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
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/AcceptConsent_Factory;->repositoryProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/AcceptConsent_Factory;->configurationProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;)Lcom/stripe/android/financialconnections/domain/AcceptConsent_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
            ">;)",
            "Lcom/stripe/android/financialconnections/domain/AcceptConsent_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/financialconnections/domain/AcceptConsent_Factory;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/domain/AcceptConsent_Factory;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)Lcom/stripe/android/financialconnections/domain/AcceptConsent;
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/domain/AcceptConsent;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/domain/AcceptConsent;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/domain/AcceptConsent;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/AcceptConsent_Factory;->repositoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/AcceptConsent_Factory;->configurationProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    invoke-static {v0, v1}, Lcom/stripe/android/financialconnections/domain/AcceptConsent_Factory;->newInstance(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)Lcom/stripe/android/financialconnections/domain/AcceptConsent;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/domain/AcceptConsent_Factory;->get()Lcom/stripe/android/financialconnections/domain/AcceptConsent;

    move-result-object v0

    return-object v0
.end method
