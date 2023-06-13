.class public final Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;",
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

.field private final cancelAuthorizationSessionProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;",
            ">;"
        }
    .end annotation
.end field

.field private final completeAuthorizationSessionProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;",
            ">;"
        }
    .end annotation
.end field

.field private final createAuthorizationSessionProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;",
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

.field private final getManifestProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GetManifest;",
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
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;",
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

.field private final pollAuthorizationSessionOAuthResultsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;",
            ">;"
        }
    .end annotation
.end field

.field private final postAuthSessionEventProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;",
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
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/utils/UriUtils;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GetManifest;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GoNext;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->completeAuthorizationSessionProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->createAuthorizationSessionProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->cancelAuthorizationSessionProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->eventTrackerProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->applicationIdProvider:LY94;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->uriUtilsProvider:LY94;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->postAuthSessionEventProvider:LY94;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->getManifestProvider:LY94;

    iput-object p9, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->goNextProvider:LY94;

    iput-object p10, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->navigationManagerProvider:LY94;

    iput-object p11, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->pollAuthorizationSessionOAuthResultsProvider:LY94;

    iput-object p12, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->loggerProvider:LY94;

    iput-object p13, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->initialStateProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/utils/UriUtils;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GetManifest;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/GoNext;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;",
            ">;)",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;"
        }
    .end annotation

    new-instance v14, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;

    move-object v0, v14

    move-object v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v0 .. v13}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v14
.end method

.method public static newInstance(Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;
    .locals 15

    new-instance v14, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    move-object v0, v14

    move-object v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v0 .. v13}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;-><init>(Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;)V

    return-object v14
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;
    .locals 14

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->completeAuthorizationSessionProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->createAuthorizationSessionProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->cancelAuthorizationSessionProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->eventTrackerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->applicationIdProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->uriUtilsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/financialconnections/utils/UriUtils;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->postAuthSessionEventProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->getManifestProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/financialconnections/domain/GetManifest;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->goNextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/stripe/android/financialconnections/domain/GoNext;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->navigationManagerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->pollAuthorizationSessionOAuthResultsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->loggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/stripe/android/core/Logger;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->initialStateProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;

    invoke-static/range {v1 .. v13}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->newInstance(Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel_Factory;->get()Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    move-result-object v0

    return-object v0
.end method
