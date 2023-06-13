.class public final Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;
.super LRN2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LRN2<",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u0000 52\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u00015BK\u0008\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010(\u001a\u00020\'\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010.\u001a\u00020-\u0012\u0008\u0008\u0001\u00100\u001a\u00020\r\u0012\u0006\u00102\u001a\u00020\u0002\u00a2\u0006\u0004\u00083\u00104J \u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u000c\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0005J\u0006\u0010\u0018\u001a\u00020\u0007J\u0006\u0010\u0019\u001a\u00020\u0007J\u0006\u0010\u001a\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010(\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0014\u00100\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101\u00a8\u00066"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;",
        "LRN2;",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;",
        "earlyTerminationCause",
        "",
        "closeAuthFlowError",
        "",
        "closeAuthFlow",
        "Landroid/content/Intent;",
        "intent",
        "handleOnNewIntent",
        "onResume",
        "",
        "url",
        "openPartnerAuthFlowInBrowser",
        "onViewEffectLaunched",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "pane",
        "onCloseWithConfirmationClick",
        "onBackClick",
        "onCloseNoConfirmationClick",
        "error",
        "onCloseFromErrorClick",
        "onCloseConfirm",
        "onCloseDismiss",
        "onBackPressed",
        "onPaneLaunched",
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;",
        "activityRetainedComponent",
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;",
        "getActivityRetainedComponent",
        "()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "Lcom/stripe/android/financialconnections/utils/UriUtils;",
        "uriUtils",
        "Lcom/stripe/android/financialconnections/utils/UriUtils;",
        "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;",
        "completeFinancialConnectionsSession",
        "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "applicationId",
        "Ljava/lang/String;",
        "initialState",
        "<init>",
        "(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)V",
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
.field public static final Companion:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;

.field private static final PARAM_ERROR_REASON:Ljava/lang/String; = "error_reason"

.field private static final PARAM_STATUS:Ljava/lang/String; = "status"

.field private static final STATUS_CANCEL:Ljava/lang/String; = "cancel"

.field private static final STATUS_FAILURE:Ljava/lang/String; = "failure"

.field private static final STATUS_SUCCESS:Ljava/lang/String; = "success"


# instance fields
.field private final activityRetainedComponent:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;

.field private final applicationId:Ljava/lang/String;

.field private final completeFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

.field private final uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->Companion:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)V
    .locals 2

    const-string v0, "activityRetainedComponent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAuthFlowCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uriUtils"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completeFinancialConnectionsSession"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationId"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialState"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, p8, v1, v0, v1}, LRN2;-><init>(LAN2;LTN2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->activityRetainedComponent:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->completeFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->logger:Lcom/stripe/android/core/Logger;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->applicationId:Ljava/lang/String;

    sget-object p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$1;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$1;

    invoke-virtual {p0, p1}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object p2

    const/4 p3, 0x0

    const/4 p4, 0x0

    new-instance p5, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$2;

    invoke-direct {p5, p0, v1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$2;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 p6, 0x3

    const/4 p7, 0x0

    invoke-static/range {p2 .. p7}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public static final synthetic access$getApplicationId$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->applicationId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getCompleteFinancialConnectionsSession$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->completeFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getNativeAuthFlowCoordinator$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    return-object p0
.end method

.method public static final synthetic access$getUriUtils$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lcom/stripe/android/financialconnections/utils/UriUtils;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    return-object p0
.end method

.method public static final synthetic access$setState(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-virtual {p0, p1}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final closeAuthFlow(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;Ljava/lang/Throwable;)V
    .locals 6

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, p2, v4}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public static synthetic closeAuthFlow$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;Ljava/lang/Throwable;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->closeAuthFlow(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final getActivityRetainedComponent()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->activityRetainedComponent:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;

    return-object v0
.end method

.method public final handleOnNewIntent(Landroid/content/Intent;)V
    .locals 6

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;

    const/4 v4, 0x0

    invoke-direct {v3, p1, p0, v4}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1;-><init>(Landroid/content/Intent;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final onBackClick(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V
    .locals 7

    const-string v0, "pane"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onBackClick$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onBackClick$1;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final onBackPressed()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v0, v1, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->closeAuthFlow$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-void
.end method

.method public final onCloseConfirm()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v0, v1, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->closeAuthFlow$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-void
.end method

.method public final onCloseDismiss()V
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onCloseDismiss$1;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onCloseDismiss$1;

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onCloseFromErrorClick(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, p1, v1, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->closeAuthFlow$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-void
.end method

.method public final onCloseNoConfirmationClick(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V
    .locals 7

    const-string v0, "pane"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onCloseNoConfirmationClick$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onCloseNoConfirmationClick$1;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    const/4 p1, 0x1

    invoke-static {p0, v0, v0, p1, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->closeAuthFlow$default(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-void
.end method

.method public final onCloseWithConfirmationClick(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V
    .locals 7

    const-string v0, "pane"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onCloseWithConfirmationClick$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onCloseWithConfirmationClick$1;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final onPaneLaunched(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V
    .locals 7

    const-string v0, "pane"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onPaneLaunched$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onPaneLaunched$1;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final onResume()V
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onResume$1;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onResume$1;

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onViewEffectLaunched()V
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onViewEffectLaunched$1;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$onViewEffectLaunched$1;

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final openPartnerAuthFlowInBrowser(Ljava/lang/String;)V
    .locals 1

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$openPartnerAuthFlowInBrowser$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$openPartnerAuthFlowInBrowser$1;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
