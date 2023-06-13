.class public final Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;",
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

.field private final eventReporterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;",
            ">;"
        }
    .end annotation
.end field

.field private final fetchFinancialConnectionsSessionForTokenProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;",
            ">;"
        }
    .end annotation
.end field

.field private final fetchFinancialConnectionsSessionProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;",
            ">;"
        }
    .end annotation
.end field

.field private final initialStateProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;",
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

.field private final nativeRouterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;",
            ">;"
        }
    .end annotation
.end field

.field private final synchronizeFinancialConnectionsSessionProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ljava/lang/String;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->applicationIdProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->synchronizeFinancialConnectionsSessionProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->fetchFinancialConnectionsSessionProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->fetchFinancialConnectionsSessionForTokenProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->loggerProvider:LY94;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->eventReporterProvider:LY94;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->nativeRouterProvider:LY94;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->initialStateProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ljava/lang/String;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;",
            ">;)",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;"
        }
    .end annotation

    new-instance v9, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v9
.end method

.method public static newInstance(Ljava/lang/String;Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;
    .locals 10

    new-instance v9, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V

    return-object v9
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->applicationIdProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->synchronizeFinancialConnectionsSessionProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->fetchFinancialConnectionsSessionProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->fetchFinancialConnectionsSessionForTokenProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->loggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/core/Logger;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->eventReporterProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->nativeRouterProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->initialStateProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->newInstance(Ljava/lang/String;Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel_Factory;->get()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;

    move-result-object v0

    return-object v0
.end method
