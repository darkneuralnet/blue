.class public final Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;
.super LRN2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LRN2<",
        "Lcom/stripe/android/financialconnections/features/success/SuccessState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000  2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BI\u0008\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0008\u0010\u0004\u001a\u00020\u0003H\u0002J\u0008\u0010\u0005\u001a\u00020\u0003H\u0002J\u0006\u0010\u0006\u001a\u00020\u0003J\u0006\u0010\u0007\u001a\u00020\u0003J\u0006\u0010\u0008\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0003R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;",
        "LRN2;",
        "Lcom/stripe/android/financialconnections/features/success/SuccessState;",
        "",
        "observeAsyncs",
        "completeSession",
        "onDoneClick",
        "onLinkAnotherAccountClick",
        "onLearnMoreAboutDataAccessClick",
        "onDisconnectLinkClick",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        "navigationManager",
        "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;",
        "completeFinancialConnectionsSession",
        "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "initialState",
        "Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;",
        "getAuthorizationSessionAccounts",
        "Lcom/stripe/android/financialconnections/domain/GetManifest;",
        "getManifest",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/success/SuccessState;Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V",
        "Companion",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$Companion;


# instance fields
.field private final completeFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

.field private final navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->Companion:Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/success/SuccessState;Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;)V
    .locals 2

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getAuthorizationSessionAccounts"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getManifest"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completeFinancialConnectionsSession"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAuthFlowCoordinator"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0, v1}, LRN2;-><init>(LAN2;LTN2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->logger:Lcom/stripe/android/core/Logger;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->completeFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->observeAsyncs()V

    new-instance p4, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;

    invoke-direct {p4, p3, p2, v1}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$1;-><init>(Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;Lkotlin/coroutines/Continuation;)V

    const/4 p3, 0x0

    const/4 p5, 0x0

    sget-object p6, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$2;

    const/4 p7, 0x3

    const/4 p8, 0x0

    move-object p1, p0

    move-object p2, p4

    move-object p4, p5

    move-object p5, p6

    move p6, p7

    move-object p7, p8

    invoke-static/range {p1 .. p7}, LRN2;->execute$default(LRN2;Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public static final synthetic access$completeSession(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->completeSession()V

    return-void
.end method

.method public static final synthetic access$getCompleteFinancialConnectionsSession$p(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;)Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->completeFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getNativeAuthFlowCoordinator$p(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;)Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    return-object p0
.end method

.method private final completeSession()V
    .locals 7

    new-instance v1, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$completeSession$1;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$completeSession$1;-><init>(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v4, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$completeSession$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$completeSession$2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, LRN2;->execute$default(LRN2;Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method private final observeAsyncs()V
    .locals 4

    sget-object v0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$1;

    new-instance v1, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$2;-><init>(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/coroutines/Continuation;)V

    new-instance v3, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$3;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$3;-><init>(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, v0, v1, v3}, LRN2;->onAsync(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lzh2;

    sget-object v0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$4;->INSTANCE:Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$4;

    new-instance v1, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$5;

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$5;-><init>(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/coroutines/Continuation;)V

    new-instance v3, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;-><init>(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, v0, v1, v3}, LRN2;->onAsync(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lzh2;

    return-void
.end method


# virtual methods
.method public final onDisconnectLinkClick()V
    .locals 6

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$onDisconnectLinkClick$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$onDisconnectLinkClick$1;-><init>(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final onDoneClick()V
    .locals 6

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$onDoneClick$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$onDoneClick$1;-><init>(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->completeSession()V

    return-void
.end method

.method public final onLearnMoreAboutDataAccessClick()V
    .locals 6

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$onLearnMoreAboutDataAccessClick$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$onLearnMoreAboutDataAccessClick$1;-><init>(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final onLinkAnotherAccountClick()V
    .locals 6

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$onLinkAnotherAccountClick$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$onLinkAnotherAccountClick$1;-><init>(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    sget-object v1, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getReset()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/financialconnections/navigation/NavigationManager;->navigate(Lcom/stripe/android/financialconnections/navigation/NavigationCommand;)V

    return-void
.end method
