.class public final Lcom/stripe/android/financialconnections/domain/SearchInstitutions_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/domain/SearchInstitutions;",
        ">;"
    }
.end annotation


# instance fields
.field private final repositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;",
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
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/SearchInstitutions_Factory;->repositoryProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lcom/stripe/android/financialconnections/domain/SearchInstitutions_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;",
            ">;)",
            "Lcom/stripe/android/financialconnections/domain/SearchInstitutions_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/financialconnections/domain/SearchInstitutions_Factory;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/domain/SearchInstitutions_Factory;-><init>(LY94;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;)Lcom/stripe/android/financialconnections/domain/SearchInstitutions;
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/domain/SearchInstitutions;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/domain/SearchInstitutions;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/domain/SearchInstitutions;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/SearchInstitutions_Factory;->repositoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;

    invoke-static {v0}, Lcom/stripe/android/financialconnections/domain/SearchInstitutions_Factory;->newInstance(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;)Lcom/stripe/android/financialconnections/domain/SearchInstitutions;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/domain/SearchInstitutions_Factory;->get()Lcom/stripe/android/financialconnections/domain/SearchInstitutions;

    move-result-object v0

    return-object v0
.end method
