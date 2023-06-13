.class public final Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;
.super LRN2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LRN2<",
        "Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \u00152\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B1\u0008\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0008\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010\u0005\u001a\u00020\u0003R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;",
        "LRN2;",
        "Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;",
        "",
        "logErrors",
        "onSubmit",
        "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;",
        "completeFinancialConnectionsSession",
        "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "nativeAuthFlowCoordinator",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "initialState",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/core/Logger;)V",
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
.field public static final Companion:Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$Companion;


# instance fields
.field private final completeFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;->Companion:Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessState;Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/core/Logger;)V
    .locals 8

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completeFinancialConnectionsSession"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeAuthFlowCoordinator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0, v1}, LRN2;-><init>(LAN2;LTN2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;->completeFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;->nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;->logger:Lcom/stripe/android/core/Logger;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;->logErrors()V

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$1;

    invoke-direct {v5, p0, v1}, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public static final synthetic access$getCompleteFinancialConnectionsSession$p(Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;)Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;->completeFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getNativeAuthFlowCoordinator$p(Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;)Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;->nativeAuthFlowCoordinator:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    return-object p0
.end method

.method private final logErrors()V
    .locals 4

    sget-object v0, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$logErrors$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$logErrors$1;

    new-instance v1, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$logErrors$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$logErrors$2;-><init>(Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;Lkotlin/coroutines/Continuation;)V

    new-instance v3, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$logErrors$3;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$logErrors$3;-><init>(Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, v0, v1, v3}, LRN2;->onAsync(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lzh2;

    return-void
.end method


# virtual methods
.method public final onSubmit()V
    .locals 14

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$onSubmit$1;

    const/4 v6, 0x0

    invoke-direct {v3, p0, v6}, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$onSubmit$1;-><init>(Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    new-instance v8, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$onSubmit$2;

    invoke-direct {v8, p0, v6}, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$onSubmit$2;-><init>(Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    sget-object v11, Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$onSubmit$3;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$onSubmit$3;

    const/4 v12, 0x3

    const/4 v13, 0x0

    move-object v7, p0

    invoke-static/range {v7 .. v13}, LRN2;->execute$default(LRN2;Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method
