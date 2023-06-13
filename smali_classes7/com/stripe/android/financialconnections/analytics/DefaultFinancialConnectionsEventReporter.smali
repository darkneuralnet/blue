.class public final Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B!\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;",
        "analyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "analyticsRequestFactory",
        "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/networking/AnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;)V",
        "fireEvent",
        "",
        "event",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;",
        "onPresented",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
        "onResult",
        "financialConnectionsSheetResult",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;",
        "Companion",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Companion;

.field public static final PARAM_CLIENT_SECRET:Ljava/lang/String; = "las_client_secret"

.field public static final PARAM_SESSION_RESULT:Ljava/lang/String; = "session_result"


# instance fields
.field private final analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

.field private final analyticsRequestFactory:Lcom/stripe/android/core/networking/AnalyticsRequestFactory;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->Companion:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/networking/AnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1
    .param p3    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->analyticsRequestFactory:Lcom/stripe/android/core/networking/AnalyticsRequestFactory;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method

.method public static final synthetic access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->analyticsRequestExecutor:Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    return-object p0
.end method

.method public static final synthetic access$getAnalyticsRequestFactory$p(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;)Lcom/stripe/android/core/networking/AnalyticsRequestFactory;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->analyticsRequestFactory:Lcom/stripe/android/core/networking/AnalyticsRequestFactory;

    return-object p0
.end method

.method private final fireEvent(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, LaD0;->a(Lkotlin/coroutines/CoroutineContext;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;-><init>(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method


# virtual methods
.method public onPresented(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V
    .locals 3

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    sget-object v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;->SheetPresented:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    const-string v2, "las_client_secret"

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;-><init>(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;Ljava/util/Map;)V

    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->fireEvent(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    return-void
.end method

.method public onResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V
    .locals 7

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "financialConnectionsSheetResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;

    const-string v1, "session_result"

    const/4 v2, 0x1

    const-string v3, "las_client_secret"

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eqz v0, :cond_0

    new-instance p2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;->SheetClosed:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    new-array v5, v5, [Lkotlin/Pair;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v5, v4

    const-string p1, "completed"

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v5, v2

    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {p2, v0, p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;-><init>(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;Ljava/util/Map;)V

    goto :goto_0

    :cond_0
    instance-of v0, p2, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Canceled;

    if-eqz v0, :cond_1

    new-instance p2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;->SheetClosed:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    new-array v5, v5, [Lkotlin/Pair;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v5, v4

    const-string p1, "cancelled"

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v5, v2

    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {p2, v0, p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;-><init>(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;Ljava/util/Map;)V

    goto :goto_0

    :cond_1
    instance-of v0, p2, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    sget-object v6, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;->SheetFailed:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    new-array v5, v5, [Lkotlin/Pair;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v5, v4

    const-string p1, "failure"

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v5, v2

    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    check-cast p2, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p2

    invoke-static {p2}, Lcom/stripe/android/financialconnections/analytics/AnalyticsMappersKt;->toEventParams(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p2}, Lcom/stripe/android/financialconnections/utils/CollectionsKt;->filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, v6, p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;-><init>(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;Ljava/util/Map;)V

    move-object p2, v0

    :goto_0
    invoke-direct {p0, p2}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->fireEvent(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
