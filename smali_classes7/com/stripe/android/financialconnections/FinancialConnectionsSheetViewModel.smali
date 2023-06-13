.class public final Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;
.super LRN2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LRN2<",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 E2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001EBK\u0008\u0007\u0012\u0008\u0008\u0001\u0010-\u001a\u00020\u000c\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010\t\u001a\u000202\u0012\u0006\u0010\n\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010B\u001a\u00020\u0002\u00a2\u0006\u0004\u0008C\u0010DJ\u0008\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000cH\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001a\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u00022\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000fH\u0002J\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u000f*\u00020\u000cH\u0002J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u000f\u0010\u001c\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u000f\u0010 \u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u001f\u0010\u001bJ\u0017\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!H\u0000\u00a2\u0006\u0004\u0008#\u0010$J\u0019\u0010*\u001a\u00020\u00032\u0008\u0010\'\u001a\u0004\u0018\u00010&H\u0000\u00a2\u0006\u0004\u0008(\u0010)J\u000f\u0010,\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008+\u0010\u001bR\u0014\u0010-\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0014\u0010\t\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u00103R\u0014\u0010\n\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010A\u00a8\u0006F"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;",
        "LRN2;",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;",
        "",
        "fetchManifest",
        "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
        "sync",
        "openAuthFlow",
        "state",
        "fetchFinancialConnectionsSession",
        "fetchFinancialConnectionsSessionForToken",
        "onUserCancel",
        "",
        "unwrappedUriString",
        "onStartApp2App",
        "Landroid/net/Uri;",
        "receivedUrl",
        "onFinishApp2App",
        "onFlowSuccess",
        "onFlowCancelled",
        "url",
        "onSuccessFromLinkFlow",
        "toUriOrNull",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;",
        "result",
        "finishWithResult",
        "onActivityRecreated$financial_connections_release",
        "()V",
        "onActivityRecreated",
        "onResume$financial_connections_release",
        "onResume",
        "onBrowserActivityResult$financial_connections_release",
        "onBrowserActivityResult",
        "Landroidx/activity/result/ActivityResult;",
        "activityResult",
        "onNativeAuthFlowResult$financial_connections_release",
        "(Landroidx/activity/result/ActivityResult;)V",
        "onNativeAuthFlowResult",
        "Landroid/content/Intent;",
        "intent",
        "handleOnNewIntent$financial_connections_release",
        "(Landroid/content/Intent;)V",
        "handleOnNewIntent",
        "onViewEffectLaunched$financial_connections_release",
        "onViewEffectLaunched",
        "applicationId",
        "Ljava/lang/String;",
        "Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;",
        "synchronizeFinancialConnectionsSession",
        "Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;",
        "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;",
        "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;",
        "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;",
        "Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;",
        "eventReporter",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;",
        "nativeRouter",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;",
        "LSX2;",
        "mutex",
        "LSX2;",
        "initialState",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFinancialConnectionsSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetViewModel.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel\n+ 2 Intent.kt\ncom/stripe/android/financialconnections/utils/IntentKt\n*L\n1#1,448:1\n8#2,7:449\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsSheetViewModel.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel\n*L\n216#1:449,7\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$Companion;

.field public static final MAX_ACCOUNTS:I = 0x64

.field public static final QUERY_PARAM_LINKED_ACCOUNT:Ljava/lang/String; = "linked_account"


# instance fields
.field private final applicationId:Ljava/lang/String;

.field private final eventReporter:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;

.field private final fetchFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;

.field private final fetchFinancialConnectionsSessionForToken:Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final mutex:LSX2;

.field private final nativeRouter:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;

.field private final synchronizeFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->Companion:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V
    .locals 2

    const-string v0, "applicationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "synchronizeFinancialConnectionsSession"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fetchFinancialConnectionsSession"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fetchFinancialConnectionsSessionForToken"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeRouter"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialState"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, p8, v1, v0, v1}, LRN2;-><init>(LAN2;LTN2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->applicationId:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->synchronizeFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->fetchFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->fetchFinancialConnectionsSessionForToken:Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->logger:Lcom/stripe/android/core/Logger;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->eventReporter:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->nativeRouter:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {p1, p2, v1}, LUX2;->b(ZILjava/lang/Object;)LSX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->mutex:LSX2;

    invoke-virtual {p8}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getInitialArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->isValid$financial_connections_release()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p8}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getInitialArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    move-result-object p1

    invoke-interface {p6, p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;->onPresented(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V

    invoke-virtual {p8}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->fetchManifest()V

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Invalid configuration provided when instantiating activity"

    invoke-direct {p2, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;-><init>(Ljava/lang/Throwable;)V

    new-instance p2, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$1;

    invoke-direct {p2, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$1;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;)V

    invoke-virtual {p0, p2}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static final synthetic access$finishWithResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->finishWithResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V

    return-void
.end method

.method public static final synthetic access$getApplicationId$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->applicationId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getFetchFinancialConnectionsSession$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->fetchFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;

    return-object p0
.end method

.method public static final synthetic access$getFetchFinancialConnectionsSessionForToken$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->fetchFinancialConnectionsSessionForToken:Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;

    return-object p0
.end method

.method public static final synthetic access$getMutex$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)LSX2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->mutex:LSX2;

    return-object p0
.end method

.method public static final synthetic access$getNativeRouter$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->nativeRouter:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;

    return-object p0
.end method

.method public static final synthetic access$getSynchronizeFinancialConnectionsSession$p(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->synchronizeFinancialConnectionsSession:Lcom/stripe/android/financialconnections/domain/SynchronizeFinancialConnectionsSession;

    return-object p0
.end method

.method public static final synthetic access$onFinishApp2App(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onFinishApp2App(Landroid/net/Uri;)V

    return-void
.end method

.method public static final synthetic access$onFlowCancelled(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onFlowCancelled(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V

    return-void
.end method

.method public static final synthetic access$onFlowSuccess(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onFlowSuccess(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Landroid/net/Uri;)V

    return-void
.end method

.method public static final synthetic access$onStartApp2App(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onStartApp2App(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$openAuthFlow(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->openAuthFlow(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V

    return-void
.end method

.method public static final synthetic access$setState(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-virtual {p0, p1}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$toUriOrNull(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Ljava/lang/String;)Landroid/net/Uri;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->toUriOrNull(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$withState(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-virtual {p0, p1}, LRN2;->withState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final fetchFinancialConnectionsSession(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V
    .locals 6

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSession$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSession$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method private final fetchFinancialConnectionsSessionForToken(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V
    .locals 6

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSessionForToken$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSessionForToken$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method private final fetchManifest()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$fetchManifest$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$fetchManifest$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)V

    invoke-virtual {p0, v0}, LRN2;->withState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final finishWithResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->eventReporter:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getInitialArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;->onResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V

    new-instance p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$finishWithResult$1;

    invoke-direct {p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$finishWithResult$1;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V

    invoke-virtual {p0, p1}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final onFinishApp2App(Landroid/net/Uri;)V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onFinishApp2App$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onFinishApp2App$1;-><init>(Landroid/net/Uri;)V

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final onFlowCancelled(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onFlowCancelled$1;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onFlowCancelled$1;

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onUserCancel(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V

    return-void
.end method

.method private final onFlowSuccess(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Landroid/net/Uri;)V
    .locals 2

    if-nez p2, :cond_0

    new-instance p2, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Intent url received from web flow is null"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {p2, v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;-><init>(Ljava/lang/Throwable;)V

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->finishWithResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onFlowSuccess$1;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onFlowSuccess$1;

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;->getInitialArgs()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    move-result-object v0

    instance-of v1, v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;

    if-eqz v1, :cond_1

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->fetchFinancialConnectionsSession(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;

    if-eqz v1, :cond_2

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->fetchFinancialConnectionsSessionForToken(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V

    goto :goto_0

    :cond_2
    instance-of p1, v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForLink;

    if-eqz p1, :cond_3

    invoke-direct {p0, p2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->onSuccessFromLinkFlow(Landroid/net/Uri;)V

    :cond_3
    :goto_0
    return-void
.end method

.method private final onStartApp2App(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onStartApp2App$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onStartApp2App$1;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final onSuccessFromLinkFlow(Landroid/net/Uri;)V
    .locals 2

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    const-string v0, "linked_account"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "Required value was null."

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    new-instance v1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onSuccessFromLinkFlow$2$1;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onSuccessFromLinkFlow$2$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, LRN2;->withState(Lkotlin/jvm/functions/Function1;)V

    :cond_1
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v1, "Could not retrieve linked account from success url"

    invoke-interface {v0, v1, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onSuccessFromLinkFlow$3$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onSuccessFromLinkFlow$3$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, LRN2;->withState(Lkotlin/jvm/functions/Function1;)V

    :cond_2
    return-void
.end method

.method private final onUserCancel(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)V
    .locals 6

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onUserCancel$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onUserCancel$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method private final openAuthFlow(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V
    .locals 8

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->nativeRouter:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowRouter;->nativeAuthFlowEnabled(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z

    move-result v1

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$openAuthFlow$1;

    const/4 v6, 0x0

    invoke-direct {v5, p0, p1, v6}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$openAuthFlow$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getHostedAuthUrl()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$openAuthFlow$2;

    invoke-direct {p1, p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$openAuthFlow$2;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)V

    invoke-virtual {p0, p1}, LRN2;->withState(Lkotlin/jvm/functions/Function1;)V

    goto :goto_1

    :cond_0
    if-eqz v1, :cond_1

    sget-object v2, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;->NONE:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;

    goto :goto_0

    :cond_1
    sget-object v2, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;->ON_EXTERNAL_ACTIVITY:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;

    :goto_0
    new-instance v3, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$openAuthFlow$3;

    invoke-direct {v3, v0, v2, v1, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$openAuthFlow$3;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState$AuthFlowStatus;ZLcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V

    invoke-virtual {p0, v3}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    :goto_1
    return-void
.end method

.method private final toUriOrNull(Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->clearQuery()Landroid/net/Uri$Builder;

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v2, "Could not parse web flow url"

    invoke-interface {v1, v2, v0}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    :cond_1
    check-cast p1, Landroid/net/Uri;

    return-object p1
.end method


# virtual methods
.method public final handleOnNewIntent$financial_connections_release(Landroid/content/Intent;)V
    .locals 6

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$handleOnNewIntent$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Landroid/content/Intent;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final onActivityRecreated$financial_connections_release()V
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onActivityRecreated$1;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onActivityRecreated$1;

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onBrowserActivityResult$financial_connections_release()V
    .locals 6

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onBrowserActivityResult$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onBrowserActivityResult$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final onNativeAuthFlowResult$financial_connections_release(Landroidx/activity/result/ActivityResult;)V
    .locals 5

    const-string v0, "activityResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->a()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    const-string v4, "result"

    if-lt v2, v3, :cond_0

    const-class v1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    invoke-static {v0, v4, v1}, Ljm1;->a(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v4}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    instance-of v2, v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    move-object v0, v1

    check-cast v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    :goto_1
    move-object v1, v0

    check-cast v1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    :cond_2
    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->b()I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_3

    if-eqz v1, :cond_3

    new-instance p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onNativeAuthFlowResult$1;

    invoke-direct {p1, p0, v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onNativeAuthFlowResult$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V

    invoke-virtual {p0, p1}, LRN2;->withState(Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    :cond_3
    new-instance p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onNativeAuthFlowResult$2;

    invoke-direct {p1, p0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onNativeAuthFlowResult$2;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;)V

    invoke-virtual {p0, p1}, LRN2;->withState(Lkotlin/jvm/functions/Function1;)V

    :goto_2
    return-void
.end method

.method public final onResume$financial_connections_release()V
    .locals 6

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onResume$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onResume$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final onViewEffectLaunched$financial_connections_release()V
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onViewEffectLaunched$1;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onViewEffectLaunched$1;

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
