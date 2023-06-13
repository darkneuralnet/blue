.class public final Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final acceptConsentProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/AcceptConsent;",
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

.field private final getOrFetchSyncProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
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
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState;",
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

.field private final navigationManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
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
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/AcceptConsent;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GoNext;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/utils/UriUtils;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;->initialStateProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;->acceptConsentProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;->goNextProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;->getOrFetchSyncProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;->navigationManagerProvider:LY94;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;->eventTrackerProvider:LY94;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;->uriUtilsProvider:LY94;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;->loggerProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/AcceptConsent;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GoNext;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/utils/UriUtils;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;)",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;"
        }
    .end annotation

    new-instance v9, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v9
.end method

.method public static newInstance(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/domain/AcceptConsent;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;
    .locals 10

    new-instance v9, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/domain/AcceptConsent;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/core/Logger;)V

    return-object v9
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;->initialStateProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;->acceptConsentProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/financialconnections/domain/AcceptConsent;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;->goNextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/financialconnections/domain/GoNext;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;->getOrFetchSyncProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;->navigationManagerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;->eventTrackerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;->uriUtilsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/financialconnections/utils/UriUtils;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;->loggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/core/Logger;

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;->newInstance(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/domain/AcceptConsent;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel_Factory;->get()Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    move-result-object v0

    return-object v0
.end method
