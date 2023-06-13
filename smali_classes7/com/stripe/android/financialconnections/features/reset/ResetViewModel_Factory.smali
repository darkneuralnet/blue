.class public final Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final eventTrackerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;"
        }
    .end annotation
.end field

.field private final goNextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GoNext;",
            ">;"
        }
    .end annotation
.end field

.field private final initialStateProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/features/reset/ResetState;",
            ">;"
        }
    .end annotation
.end field

.field private final linkMoreAccountsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;",
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

.field private final nativeAuthFlowCoordinatorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/features/reset/ResetState;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GoNext;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;->initialStateProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;->linkMoreAccountsProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;->nativeAuthFlowCoordinatorProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;->eventTrackerProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;->goNextProvider:LY94;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;->loggerProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/features/reset/ResetState;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GoNext;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;)",
            "Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;"
        }
    .end annotation

    new-instance v7, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static newInstance(Lcom/stripe/android/financialconnections/features/reset/ResetState;Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;
    .locals 8

    new-instance v7, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;-><init>(Lcom/stripe/android/financialconnections/features/reset/ResetState;Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/core/Logger;)V

    return-object v7
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;->initialStateProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/financialconnections/features/reset/ResetState;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;->linkMoreAccountsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;->nativeAuthFlowCoordinatorProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;->eventTrackerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;->goNextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/financialconnections/domain/GoNext;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;->loggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/core/Logger;

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;->newInstance(Lcom/stripe/android/financialconnections/features/reset/ResetState;Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel_Factory;->get()Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;

    move-result-object v0

    return-object v0
.end method
