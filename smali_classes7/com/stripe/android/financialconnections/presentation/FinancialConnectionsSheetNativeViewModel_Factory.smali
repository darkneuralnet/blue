.class public final Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final activityRetainedComponentProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;",
            ">;"
        }
    .end annotation
.end field

.field private final applicationIdProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

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
            "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;",
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

.field private final uriUtilsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/utils/UriUtils;",
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
            "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/utils/UriUtils;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;->activityRetainedComponentProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;->nativeAuthFlowCoordinatorProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;->uriUtilsProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;->completeFinancialConnectionsSessionProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;->eventTrackerProvider:LY94;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;->loggerProvider:LY94;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;->applicationIdProvider:LY94;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;->initialStateProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/utils/UriUtils;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;",
            ">;)",
            "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;"
        }
    .end annotation

    new-instance v9, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v9
.end method

.method public static newInstance(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;
    .locals 10

    new-instance v9, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;-><init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)V

    return-object v9
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;->activityRetainedComponentProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;->nativeAuthFlowCoordinatorProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;->uriUtilsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/financialconnections/utils/UriUtils;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;->completeFinancialConnectionsSessionProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;->eventTrackerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;->loggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/core/Logger;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;->applicationIdProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;->initialStateProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;->newInstance(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel_Factory;->get()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object v0

    return-object v0
.end method
