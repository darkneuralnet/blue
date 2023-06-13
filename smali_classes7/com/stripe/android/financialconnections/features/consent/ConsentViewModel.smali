.class public final Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;
.super LRN2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$WhenMappings;,
        Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LRN2<",
        "Lcom/stripe/android/financialconnections/features/consent/ConsentState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \"2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BI\u0008\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008 \u0010!J\u0008\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010\u0005\u001a\u00020\u0003J\u000e\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0003R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006#"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;",
        "LRN2;",
        "Lcom/stripe/android/financialconnections/features/consent/ConsentState;",
        "",
        "logErrors",
        "onContinueClick",
        "",
        "uri",
        "onClickableTextClick",
        "onViewEffectLaunched",
        "Lcom/stripe/android/financialconnections/domain/AcceptConsent;",
        "acceptConsent",
        "Lcom/stripe/android/financialconnections/domain/AcceptConsent;",
        "Lcom/stripe/android/financialconnections/domain/GoNext;",
        "goNext",
        "Lcom/stripe/android/financialconnections/domain/GoNext;",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
        "getOrFetchSync",
        "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;",
        "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        "navigationManager",
        "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "eventTracker",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "Lcom/stripe/android/financialconnections/utils/UriUtils;",
        "uriUtils",
        "Lcom/stripe/android/financialconnections/utils/UriUtils;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "initialState",
        "<init>",
        "(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/domain/AcceptConsent;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/core/Logger;)V",
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
        "SMAP\nConsentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentViewModel.kt\ncom/stripe/android/financialconnections/features/consent/ConsentViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,141:1\n1282#2,2:142\n*S KotlinDebug\n*F\n+ 1 ConsentViewModel.kt\ncom/stripe/android/financialconnections/features/consent/ConsentViewModel\n*L\n92#1:142,2\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion;


# instance fields
.field private final acceptConsent:Lcom/stripe/android/financialconnections/domain/AcceptConsent;

.field private final eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

.field private final getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

.field private final goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

.field private final uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->Companion:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/domain/AcceptConsent;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/core/Logger;)V
    .locals 2

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acceptConsent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goNext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getOrFetchSync"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTracker"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uriUtils"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0, v1}, LRN2;-><init>(LAN2;LTN2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->acceptConsent:Lcom/stripe/android/financialconnections/domain/AcceptConsent;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->logger:Lcom/stripe/android/core/Logger;

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->logErrors()V

    new-instance p2, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;

    invoke-direct {p2, p0, v1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 p3, 0x0

    const/4 p4, 0x0

    sget-object p5, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$2;

    const/4 p6, 0x3

    const/4 p7, 0x0

    move-object p1, p0

    invoke-static/range {p1 .. p7}, LRN2;->execute$default(LRN2;Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public static final synthetic access$getAcceptConsent$p(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;)Lcom/stripe/android/financialconnections/domain/AcceptConsent;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->acceptConsent:Lcom/stripe/android/financialconnections/domain/AcceptConsent;

    return-object p0
.end method

.method public static final synthetic access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->eventTracker:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    return-object p0
.end method

.method public static final synthetic access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->getOrFetchSync:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    return-object p0
.end method

.method public static final synthetic access$getGoNext$p(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;)Lcom/stripe/android/financialconnections/domain/GoNext;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->goNext:Lcom/stripe/android/financialconnections/domain/GoNext;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;)Lcom/stripe/android/core/Logger;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getUriUtils$p(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;)Lcom/stripe/android/financialconnections/utils/UriUtils;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    return-object p0
.end method

.method private final logErrors()V
    .locals 10

    sget-object v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$1;

    new-instance v1, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$2;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    new-instance v3, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$3;

    invoke-direct {v3, p0, v2}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$3;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, v0, v1, v3}, LRN2;->onAsync(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lzh2;

    sget-object v5, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$4;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$4;

    new-instance v6, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$5;

    invoke-direct {v6, p0, v2}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$logErrors$5;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v9}, LRN2;->onAsync$default(LRN2;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method


# virtual methods
.method public final onClickableTextClick(Ljava/lang/String;)V
    .locals 8

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LRN2;->getViewModelScope()LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$1;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-static {p1}, Landroid/webkit/URLUtil;->isNetworkUrl(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$2;

    invoke-direct {v0, p1, v1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$2;-><init>(Ljava/lang/String;Ljava/util/Date;)V

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_3

    :cond_0
    invoke-static {}, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->values()[Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    iget-object v6, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->uriUtils:Lcom/stripe/android/financialconnections/utils/UriUtils;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;->getValue()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7, p1}, Lcom/stripe/android/financialconnections/utils/UriUtils;->compareSchemeAuthorityAndPath(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    move-object v5, v0

    :goto_1
    const/4 v2, -0x1

    if-nez v5, :cond_3

    move v3, v2

    goto :goto_2

    :cond_3
    sget-object v3, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    :goto_2
    const/4 v4, 0x2

    if-eq v3, v2, :cond_7

    const/4 p1, 0x1

    if-eq v3, p1, :cond_6

    if-eq v3, v4, :cond_5

    const/4 p1, 0x3

    if-eq v3, p1, :cond_4

    goto :goto_3

    :cond_4
    new-instance p1, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$4;

    invoke-direct {p1, v1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$4;-><init>(Ljava/util/Date;)V

    invoke-virtual {p0, p1}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    sget-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->getManualEntry()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/navigation/NavigationManager;->navigate(Lcom/stripe/android/financialconnections/navigation/NavigationCommand;)V

    goto :goto_3

    :cond_6
    new-instance p1, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$3;

    invoke-direct {p1, v1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onClickableTextClick$3;-><init>(Ljava/util/Date;)V

    invoke-virtual {p0, p1}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    goto :goto_3

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->logger:Lcom/stripe/android/core/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unrecognized clickable text: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v0, v4, v0}, Lcom/stripe/android/core/Logger$DefaultImpls;->error$default(Lcom/stripe/android/core/Logger;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :goto_3
    return-void
.end method

.method public final onContinueClick()V
    .locals 7

    new-instance v1, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onContinueClick$1;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onContinueClick$1;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v4, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onContinueClick$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onContinueClick$2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, LRN2;->execute$default(LRN2;Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final onViewEffectLaunched()V
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onViewEffectLaunched$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$onViewEffectLaunched$1;

    invoke-virtual {p0, v0}, LRN2;->setState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
