.class public final Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;
.super LRN2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LRN2<",
        "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \u001f2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBI\u0008\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0008\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0003R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;",
        "LRN2;",
        "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;",
        "",
        "logErrors",
        "onEnterDetailsManually",
        "onSelectAnotherBank",
        "Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;",
        "pollAttachPaymentAccount",
        "Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;",
        "getAuthorizationSessionAccounts",
        "Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;",
        "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        "navigationManager",
        "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        "Lcom/stripe/android/financialconnections/domain/GetManifest;",
        "getManifest",
        "Lcom/stripe/android/financialconnections/domain/GetManifest;",
        "Lcom/stripe/android/financialconnections/domain/GoNext;",
        "goNext",
        "Lcom/stripe/android/financialconnections/domain/GoNext;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "initialState",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/core/Logger;)V",
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
.field public static final Companion:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$Companion;


# instance fields
.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final getAuthorizationSessionAccounts:Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;

.field private final getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

.field private final goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

.field private final pollAttachPaymentAccount:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->Companion:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState;Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/core/Logger;)V
    .locals 11

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    const-string v9, "initialState"

    invoke-static {p1, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "pollAttachPaymentAccount"

    invoke-static {p2, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "eventTracker"

    invoke-static {p3, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "getAuthorizationSessionAccounts"

    invoke-static {p4, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "navigationManager"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "getManifest"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "goNext"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "logger"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-direct {p0, p1, v10, v9, v10}, LRN2;-><init>(LAN2;LTN2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->pollAttachPaymentAccount:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    iput-object v3, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iput-object v4, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->getAuthorizationSessionAccounts:Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;

    iput-object v5, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    iput-object v6, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    iput-object v7, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

    iput-object v8, v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->logger:Lcom/stripe/android/core/Logger;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->logErrors()V

    new-instance v1, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;

    invoke-direct {v1, p0, v10}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v4, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object p1, p0

    move-object p2, v1

    move-object p3, v2

    move-object p4, v3

    move-object/from16 p5, v4

    move/from16 p6, v5

    move-object/from16 p7, v6

    invoke-static/range {p1 .. p7}, LRN2;->execute$default(LRN2;Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    new-instance v1, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;

    invoke-direct {v1, p0, v10}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$3;-><init>(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;Lkotlin/coroutines/Continuation;)V

    sget-object v4, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$4;->INSTANCE:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$4;

    move-object p2, v1

    move-object/from16 p5, v4

    invoke-static/range {p1 .. p7}, LRN2;->execute$default(LRN2;Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getGetAuthorizationSessionAccounts$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->getAuthorizationSessionAccounts:Lcom/stripe/android/financialconnections/domain/GetAuthorizationSessionAccounts;

    return-object p0
.end method

.method public static final synthetic access$getGetManifest$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/financialconnections/domain/GetManifest;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    return-object p0
.end method

.method public static final synthetic access$getGoNext$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/financialconnections/domain/GoNext;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getPollAttachPaymentAccount$p(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;)Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->pollAttachPaymentAccount:Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    return-object p0
.end method

.method private final logErrors()V
    .locals 10

    sget-object v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$logErrors$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$logErrors$1;

    new-instance v1, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$logErrors$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$logErrors$2;-><init>(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;Lkotlin/coroutines/Continuation;)V

    new-instance v3, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$logErrors$3;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$logErrors$3;-><init>(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, v0, v1, v3}, LRN2;->onAsync(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lzh2;

    sget-object v5, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$logErrors$4;->INSTANCE:Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$logErrors$4;

    new-instance v6, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$logErrors$5;

    invoke-direct {v6, p0, v2}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$logErrors$5;-><init>(Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v9}, LRN2;->onAsync$default(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method


# virtual methods
.method public final onEnterDetailsManually()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    sget-object v1, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getManualEntry()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/financialconnections/navigation/NavigationManager;->navigate(Lcom/stripe/android/financialconnections/navigation/NavigationCommand;)V

    return-void
.end method

.method public final onSelectAnotherBank()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    sget-object v1, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getReset()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/financialconnections/navigation/NavigationManager;->navigate(Lcom/stripe/android/financialconnections/navigation/NavigationCommand;)V

    return-void
.end method
