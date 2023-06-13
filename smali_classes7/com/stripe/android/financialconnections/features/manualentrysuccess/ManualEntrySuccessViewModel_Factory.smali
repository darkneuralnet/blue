.class public final Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final completeFinancialConnectionsSessionProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;",
            ">;"
        }
    .end annotation
.end field

.field private final eventTrackerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;"
        }
    .end annotation
.end field

.field private final initialStateProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;",
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
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel_Factory;->initialStateProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel_Factory;->completeFinancialConnectionsSessionProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel_Factory;->eventTrackerProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel_Factory;->nativeAuthFlowCoordinatorProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel_Factory;->loggerProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel_Factory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;)",
            "Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel_Factory;"
        }
    .end annotation

    new-instance v6, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel_Factory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static newInstance(Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;
    .locals 7

    new-instance v6, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;-><init>(Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/core/Logger;)V

    return-object v6
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel_Factory;->initialStateProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel_Factory;->completeFinancialConnectionsSessionProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel_Factory;->eventTrackerProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel_Factory;->nativeAuthFlowCoordinatorProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel_Factory;->loggerProvider:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/core/Logger;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel_Factory;->newInstance(Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel_Factory;->get()Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;

    move-result-object v0

    return-object v0
.end method
