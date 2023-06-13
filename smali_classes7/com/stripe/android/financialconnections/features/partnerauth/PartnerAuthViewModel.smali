.class public final Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;
.super LRN2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$WhenMappings;,
        Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LRN2<",
        "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 =2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=Bs\u0008\u0007\u0012\u0006\u0010\r\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0008\u0008\u0001\u0010#\u001a\u00020\u0011\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010:\u001a\u00020\u0002\u00a2\u0006\u0004\u0008;\u0010<J\u0008\u0010\u0004\u001a\u00020\u0003H\u0002J\u0008\u0010\u0005\u001a\u00020\u0003H\u0002J\u0013\u0010\u0006\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0008H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\u000c\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\u0007J\u0013\u0010\r\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u0003J\u0006\u0010\u000f\u001a\u00020\u0003J\u0014\u0010\u0013\u001a\u00020\u00032\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010J\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011J\u0006\u0010\u0017\u001a\u00020\u0003R\u0014\u0010\r\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010#\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006>"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;",
        "LRN2;",
        "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;",
        "",
        "observePayload",
        "logErrors",
        "launchAuthInBrowser",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "error",
        "onAuthFailed",
        "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onAuthCancelled",
        "completeAuthorizationSession",
        "onLaunchAuthClick",
        "onSelectAnotherBank",
        "Ldp;",
        "",
        "webStatus",
        "onWebAuthFlowFinished",
        "onEnterDetailsManuallyClick",
        "uri",
        "onClickableTextClick",
        "onViewEffectLaunched",
        "Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;",
        "Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;",
        "Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;",
        "createAuthorizationSession",
        "Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;",
        "Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;",
        "cancelAuthorizationSession",
        "Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "applicationId",
        "Ljava/lang/String;",
        "Lcom/stripe/android/financialconnections/utils/UriUtils;",
        "uriUtils",
        "Lcom/stripe/android/financialconnections/utils/UriUtils;",
        "Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;",
        "postAuthSessionEvent",
        "Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;",
        "Lcom/stripe/android/financialconnections/domain/GetManifest;",
        "getManifest",
        "Lcom/stripe/android/financialconnections/domain/GetManifest;",
        "Lcom/stripe/android/financialconnections/domain/GoNext;",
        "goNext",
        "Lcom/stripe/android/financialconnections/domain/GoNext;",
        "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        "navigationManager",
        "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;",
        "pollAuthorizationSessionOAuthResults",
        "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "initialState",
        "<init>",
        "(Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;)V",
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
        "SMAP\nPartnerAuthViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartnerAuthViewModel.kt\ncom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,290:1\n1#2:291\n1282#3,2:292\n*S KotlinDebug\n*F\n+ 1 PartnerAuthViewModel.kt\ncom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel\n*L\n253#1:292,2\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Companion;


# instance fields
.field private final applicationId:Ljava/lang/String;

.field private final cancelAuthorizationSession:Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;

.field private final completeAuthorizationSession:Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;

.field private final createAuthorizationSession:Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

.field private final goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

.field private final pollAuthorizationSessionOAuthResults:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;

.field private final postAuthSessionEvent:Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;

.field private final uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->Companion:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;)V
    .locals 2

    const-string v0, "completeAuthorizationSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createAuthorizationSession"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancelAuthorizationSession"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uriUtils"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "postAuthSessionEvent"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getManifest"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goNext"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollAuthorizationSessionOAuthResults"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialState"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, p13, v1, v0, v1}, LRN2;-><init>(LAN2;LTN2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->completeAuthorizationSession:Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->createAuthorizationSession:Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->cancelAuthorizationSession:Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->applicationId:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->postAuthSessionEvent:Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    iput-object p9, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

    iput-object p10, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    iput-object p11, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->pollAuthorizationSessionOAuthResults:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;

    iput-object p12, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logErrors()V

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->observePayload()V

    new-instance p2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$1;

    invoke-direct {p2, p0, v1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 p3, 0x0

    const/4 p4, 0x0

    sget-object p5, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$2;

    const/4 p6, 0x3

    const/4 p7, 0x0

    move-object p1, p0

    invoke-static/range {p1 .. p7}, LRN2;->execute$default(LRN2;Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public static final synthetic access$completeAuthorizationSession(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->completeAuthorizationSession(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCreateAuthorizationSession$p(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->createAuthorizationSession:Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getGetManifest$p(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)Lcom/stripe/android/financialconnections/domain/GetManifest;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getPostAuthSessionEvent$p(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->postAuthSessionEvent:Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;

    return-object p0
.end method

.method public static final synthetic access$getUriUtils$p(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;)Lcom/stripe/android/financialconnections/utils/UriUtils;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    return-object p0
.end method

.method public static final synthetic access$launchAuthInBrowser(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->launchAuthInBrowser(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$onAuthCancelled(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->onAuthCancelled(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$onAuthFailed(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->onAuthFailed(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setState(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-virtual {p0, p1}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final completeAuthorizationSession(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->label:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x1

    const/4 v6, 0x2

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v5, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v4, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v11, v4

    move-object v4, v2

    move-object v2, v11

    goto/16 :goto_3

    :catchall_1
    move-exception p1

    move-object v0, v4

    goto/16 :goto_6

    :cond_3
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v5, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object p1, v2

    move-object v2, v5

    goto :goto_2

    :catchall_2
    move-exception p1

    move-object v0, v5

    goto/16 :goto_6

    :cond_4
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception p1

    move-object v0, v2

    goto/16 :goto_6

    :cond_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_4
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$2$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$2$1;

    invoke-virtual {p0, p1}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    iput-object p0, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->label:I

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/domain/GetManifest;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    move-object v2, p0

    :goto_1
    :try_start_5
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object p1

    if-eqz p1, :cond_b

    iget-object v5, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->postAuthSessionEvent:Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Success;

    new-instance v10, Ljava/util/Date;

    invoke-direct {v10}, Ljava/util/Date;-><init>()V

    invoke-direct {v9, v10}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Success;-><init>(Ljava/util/Date;)V

    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$1:Ljava/lang/Object;

    iput v6, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->label:I

    invoke-virtual {v5, v8, v9, v0}, Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;->invoke-0E7RQCE(Ljava/lang/String;Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_7

    return-object v1

    :cond_7
    :goto_2
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->isOAuth()Z

    move-result v5

    if-eqz v5, :cond_a

    iget-object v5, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v8, "Web AuthFlow completed! waiting for oauth results"

    invoke-interface {v5, v8}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    iget-object v5, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->pollAuthorizationSessionOAuthResults:Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;

    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->label:I

    invoke-virtual {v5, p1, v0}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;->invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_8

    return-object v1

    :cond_8
    move-object v11, v4

    move-object v4, p1

    move-object p1, v11

    :goto_3
    check-cast p1, Lcom/stripe/android/financialconnections/model/MixedOAuthParams;

    iget-object v5, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v8, "OAuth results received! completing session"

    invoke-interface {v5, v8}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    iget-object v5, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->completeAuthorizationSession:Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/MixedOAuthParams;->getPublicToken()Ljava/lang/String;

    move-result-object p1

    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$1;->label:I

    invoke-virtual {v5, v4, p1, v0}, Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;->invoke(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    if-ne p1, v1, :cond_9

    return-object v1

    :cond_9
    move-object v0, v2

    :goto_4
    :try_start_6
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v2, "Session authorized!"

    invoke-interface {v1, v2}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p1

    invoke-static {v1, p1, v7, v6, v7}, Lcom/stripe/android/financialconnections/domain/GoNext;->invoke$default(Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_5

    :cond_a
    :try_start_7
    iget-object p1, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->ACCOUNT_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-static {p1, v0, v7, v6, v7}, Lcom/stripe/android/financialconnections/domain/GoNext;->invoke$default(Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    move-object v0, v2

    :goto_5
    :try_start_8
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_7

    :cond_b
    :try_start_9
    const-string p1, "Required value was null."

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :catchall_4
    move-exception p1

    move-object v0, p0

    :goto_6
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_7
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_c

    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v2, "failed authorizing session"

    invoke-interface {v1, v2, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$3$1;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$completeAuthorizationSession$3$1;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    :cond_c
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final launchAuthInBrowser(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    iget-object v0, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    iput-object p0, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$1;->label:I

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/domain/GetManifest;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    :try_start_2
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_3

    :cond_5
    const-string p1, "Required value was null."

    new-instance v4, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v4, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_1
    move-exception p1

    move-object v2, p0

    :goto_2
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_3
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    move-object v4, p1

    check-cast v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getUrl()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_6

    iget-object v4, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->applicationId:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "stripe-auth://native-redirect/"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "/"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, ""

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt;->replaceFirst$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6

    new-instance v5, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$3$1$1;

    invoke-direct {v5, v4}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$3$1$1;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    :cond_6
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_8

    iget-object v5, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    new-instance v6, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Error;

    sget-object v7, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->PARTNER_AUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-direct {v6, v7, v4}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Error;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/Throwable;)V

    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$1;->L$1:Ljava/lang/Object;

    iput-object v4, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$1;->label:I

    invoke-interface {v5, v6, v0}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track-gIAlu-s(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    move-object v0, v2

    move-object v1, v4

    :goto_4
    iget-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v2, "failed retrieving active session from cache"

    invoke-interface {p1, v2, v1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$4$1;

    invoke-direct {p1, v1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$launchAuthInBrowser$4$1;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, p1}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    :cond_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final logErrors()V
    .locals 4

    sget-object v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$logErrors$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$logErrors$1;

    new-instance v1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$logErrors$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$logErrors$2;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    new-instance v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$logErrors$3;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$logErrors$3;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, v0, v1, v3}, LRN2;->onAsync(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lzh2;

    return-void
.end method

.method private final observePayload()V
    .locals 6

    sget-object v1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$observePayload$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$observePayload$1;

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$observePayload$2;

    const/4 v0, 0x0

    invoke-direct {v3, p0, v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$observePayload$2;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LRN2;->onAsync$default(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method private final onAuthCancelled(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->label:I

    const-string v3, "Required value was null."

    const/4 v4, 0x2

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v0, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    :pswitch_1
    iget-object v0, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception p1

    goto/16 :goto_8

    :pswitch_2
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto/16 :goto_4

    :pswitch_3
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto/16 :goto_3

    :pswitch_4
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v6, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-object v9, v6

    move-object v6, v2

    move-object v2, v9

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object v0, v6

    goto/16 :goto_8

    :pswitch_5
    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p1

    move-object v0, v2

    goto/16 :goto_8

    :pswitch_6
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_6
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v2, "Auth cancelled, cancelling AuthSession"

    invoke-interface {p1, v2}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    sget-object p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$2$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$2$1;

    invoke-virtual {p0, p1}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    iput-object p0, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->label:I

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/domain/GetManifest;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    if-ne p1, v1, :cond_1

    return-object v1

    :cond_1
    move-object v2, p0

    :goto_1
    :try_start_7
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object p1

    if-eqz p1, :cond_9

    iget-object v6, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->cancelAuthorizationSession:Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v7

    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->label:I

    invoke-virtual {v6, v7, v0}, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;->invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_2

    return-object v1

    :cond_2
    move-object v9, v6

    move-object v6, p1

    move-object p1, v9

    :goto_2
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->isOAuth()Z

    move-result v7

    if-eqz v7, :cond_7

    iget-object p1, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v7, "Creating a new session for this OAuth institution"

    invoke-interface {p1, v7}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    iget-object p1, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->postAuthSessionEvent:Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;

    new-instance v8, Ljava/util/Date;

    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    invoke-direct {v7, v8}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;-><init>(Ljava/util/Date;)V

    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$1:Ljava/lang/Object;

    const/4 v8, 0x3

    iput v8, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->label:I

    invoke-virtual {p1, v6, v7, v0}, Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;->invoke-0E7RQCE(Ljava/lang/String;Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_3
    iget-object p1, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x4

    iput v6, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->label:I

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/domain/GetManifest;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_4
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    iget-object v6, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->createAuthorizationSession:Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v7

    if-eqz v7, :cond_6

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAllowManualEntry()Z

    move-result p1

    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    const/4 v3, 0x5

    iput v3, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->label:I

    invoke-virtual {v6, v7, p1, v0}, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object v0, v2

    :goto_5
    :try_start_8
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p1

    invoke-static {v1, p1, v5, v4, v5}, Lcom/stripe/android/financialconnections/domain/GoNext;->invoke$default(Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_7

    :cond_6
    :try_start_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    iget-object v3, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->postAuthSessionEvent:Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Cancel;

    new-instance v8, Ljava/util/Date;

    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    invoke-direct {v7, v8}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Cancel;-><init>(Ljava/util/Date;)V

    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->L$1:Ljava/lang/Object;

    const/4 v8, 0x6

    iput v8, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$1;->label:I

    invoke-virtual {v3, v6, v7, v0}, Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;->invoke-0E7RQCE(Ljava/lang/String;Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    if-ne v0, v1, :cond_8

    return-object v1

    :cond_8
    move-object v1, p1

    move-object v0, v2

    :goto_6
    :try_start_a
    iget-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v1

    invoke-static {p1, v1, v5, v4, v5}, Lcom/stripe/android/financialconnections/domain/GoNext;->invoke$default(Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object p1

    :goto_7
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    goto :goto_9

    :cond_9
    :try_start_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :catchall_3
    move-exception p1

    move-object v0, p0

    :goto_8
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_9
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_a

    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v2, "failed cancelling session after cancelled web flow"

    invoke-interface {v1, v2, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$3$1;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthCancelled$3$1;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    :cond_a
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final onAuthFailed(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->label:I

    const-string v3, "Auth failed, cancelling AuthSession"

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    iget-object v0, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Throwable;

    iget-object v3, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object v0, v3

    goto/16 :goto_4

    :cond_3
    iget-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    :try_start_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p1

    move-object v0, v2

    goto/16 :goto_4

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_3
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    invoke-interface {p2, v3}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    iput-object p0, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$1:Ljava/lang/Object;

    iput v6, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->label:I

    invoke-virtual {p2, v0}, Lcom/stripe/android/financialconnections/domain/GetManifest;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    move-object v2, p0

    :goto_1
    :try_start_4
    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object p2

    iget-object v6, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    invoke-interface {v6, v3, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz p2, :cond_8

    iget-object v3, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->postAuthSessionEvent:Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;

    new-instance v8, Ljava/util/Date;

    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    invoke-direct {v7, v8, p1}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;-><init>(Ljava/util/Date;Ljava/lang/Throwable;)V

    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$2:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->label:I

    invoke-virtual {v3, v6, v7, v0}, Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;->invoke-0E7RQCE(Ljava/lang/String;Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-ne v3, v1, :cond_6

    return-object v1

    :cond_6
    move-object v3, v2

    move-object v2, p1

    move-object p1, p2

    :goto_2
    :try_start_5
    iget-object p2, v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->cancelAuthorizationSession:Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getId()Ljava/lang/String;

    move-result-object p1

    iput-object v3, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$1:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->L$2:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$1;->label:I

    invoke-virtual {p2, p1, v0}, Lcom/stripe/android/financialconnections/domain/CancelAuthorizationSession;->invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    move-object p1, v2

    move-object v0, v3

    goto :goto_3

    :cond_8
    :try_start_6
    iget-object p2, v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v0, "Could not find AuthSession to cancel."

    invoke-interface {p2, v0}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    move-object v0, v2

    :goto_3
    :try_start_7
    new-instance p2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$2$1;

    invoke-direct {p2, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onAuthFailed$2$1;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, p2}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_5

    :catchall_3
    move-exception p1

    move-object v0, p0

    :goto_4
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_5
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_9

    iget-object p2, v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v0, "failed cancelling session after failed web flow"

    invoke-interface {p2, v0, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method


# virtual methods
.method public final onClickableTextClick(Ljava/lang/String;)V
    .locals 7

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onClickableTextClick$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onClickableTextClick$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-static {p1}, Landroid/webkit/URLUtil;->isNetworkUrl(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onClickableTextClick$2;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onClickableTextClick$2;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    goto :goto_3

    :cond_0
    invoke-static {}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ClickableText;->values()[Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ClickableText;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    iget-object v5, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ClickableText;->getValue()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, p1}, Lcom/stripe/android/financialconnections/utils/UriUtils;->compareSchemeAuthorityAndPath(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    move-object v4, v0

    :goto_1
    const/4 v1, -0x1

    if-nez v4, :cond_3

    move v2, v1

    goto :goto_2

    :cond_3
    sget-object v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    :goto_2
    if-eq v2, v1, :cond_5

    const/4 p1, 0x1

    if-eq v2, p1, :cond_4

    goto :goto_3

    :cond_4
    sget-object p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onClickableTextClick$3;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onClickableTextClick$3;

    invoke-virtual {p0, p1}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    goto :goto_3

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unrecognized clickable text: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x2

    invoke-static {v1, p1, v0, v2, v0}, Lcom/stripe/android/core/Logger$DefaultImpls;->error$default(Lcom/stripe/android/core/Logger;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :goto_3
    return-void
.end method

.method public final onEnterDetailsManuallyClick()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    sget-object v1, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getManualEntry()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/financialconnections/navigation/NavigationManager;->navigate(Lcom/stripe/android/financialconnections/navigation/NavigationCommand;)V

    return-void
.end method

.method public final onLaunchAuthClick()V
    .locals 6

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onLaunchAuthClick$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onLaunchAuthClick$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final onSelectAnotherBank()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    sget-object v1, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getReset()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/financialconnections/navigation/NavigationManager;->navigate(Lcom/stripe/android/financialconnections/navigation/NavigationCommand;)V

    return-void
.end method

.method public final onViewEffectLaunched()V
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onViewEffectLaunched$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onViewEffectLaunched$1;

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onWebAuthFlowFinished(Ldp;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "webStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->logger:Lcom/stripe/android/core/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Web AuthFlow status received "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;

    const/4 v0, 0x0

    invoke-direct {v5, p1, p0, v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$onWebAuthFlowFinished$1;-><init>(Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method
