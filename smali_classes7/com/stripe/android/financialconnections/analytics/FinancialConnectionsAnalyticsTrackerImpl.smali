.class public final Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J*\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;",
        "stripeNetworkClient",
        "Lcom/stripe/android/core/networking/StripeNetworkClient;",
        "getManifest",
        "Lcom/stripe/android/financialconnections/domain/GetManifest;",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "locale",
        "Ljava/util/Locale;",
        "context",
        "Landroid/content/Context;",
        "(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/core/Logger;Ljava/util/Locale;Landroid/content/Context;)V",
        "requestFactory",
        "Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;",
        "commonParams",
        "",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "track",
        "Lkotlin/Result;",
        "",
        "event",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;",
        "track-gIAlu-s",
        "(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.field public static final CLIENT_ID:Ljava/lang/String; = "mobile-clients-linked-accounts"

.field public static final Companion:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$Companion;

.field public static final ORIGIN:Ljava/lang/String; = "stripe-linked-accounts-android"


# instance fields
.field private final configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

.field private final getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

.field private final locale:Ljava/util/Locale;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final requestFactory:Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;

.field private final stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->Companion:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/financialconnections/domain/GetManifest;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;Lcom/stripe/android/core/Logger;Ljava/util/Locale;Landroid/content/Context;)V
    .locals 8

    const-string v0, "stripeNetworkClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getManifest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->logger:Lcom/stripe/android/core/Logger;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->locale:Ljava/util/Locale;

    new-instance p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;

    const-string v3, "mobile-clients-linked-accounts"

    const-string v4, "stripe-linked-accounts-android"

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, p1

    move-object v2, p6

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->requestFactory:Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;

    return-void
.end method

.method public static final synthetic access$commonParams(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->commonParams(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final commonParams(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;-><init>(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->getManifest:Lcom/stripe/android/financialconnections/domain/GetManifest;

    iput-object p0, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$commonParams$1;->label:I

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/domain/GetManifest;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    const/16 v1, 0xb

    new-array v1, v1, [Lkotlin/Pair;

    iget-object v2, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object v2

    const-string v4, "las_client_secret"

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x0

    aput-object v2, v1, v4

    iget-object v2, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;->getPublishableKey()Ljava/lang/String;

    move-result-object v2

    const-string v4, "key"

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v3

    iget-object v2, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "stripe_account"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v0, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v0

    const-string v2, "navigator_language"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v2, 0x3

    aput-object v0, v1, v2

    const-string v0, "is_webview"

    const-string v2, "false"

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v2, 0x4

    aput-object v0, v1, v2

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getLivemode()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    const-string v2, "livemode"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v2, 0x5

    aput-object v0, v1, v2

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getProduct()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v2, "product"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v2, 0x6

    aput-object v0, v1, v2

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect()Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "is_stripe_direct"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v2, 0x7

    aput-object v0, v1, v2

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getSingleAccount()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    const-string v2, "single_account"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x8

    aput-object v0, v1, v2

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAllowManualEntry()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    const-string v2, "allow_manual_entry"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x9

    aput-object v0, v1, v2

    const-string v0, "account_holder_id"

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAccountholderToken()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/16 v0, 0xa

    aput-object p1, v1, v0

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public track-gIAlu-s(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;-><init>(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;

    iget-object v0, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    iget-object v2, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;

    iget-object v5, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;

    iget-object v6, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;

    :try_start_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v8, p2

    move-object p2, p1

    move-object p1, v5

    move-object v5, v2

    move-object v2, v8

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object v0, v6

    goto/16 :goto_3

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_2
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->getParams()Ljava/util/Map;

    move-result-object p2

    if-nez p2, :cond_4

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    :cond_4
    iput-object p0, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$1:Ljava/lang/Object;

    iput-object p0, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$2:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$3:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->label:I

    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->commonParams(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v2, v1, :cond_5

    return-object v1

    :cond_5
    move-object v5, p0

    move-object v6, v5

    :goto_1
    :try_start_3
    check-cast v2, Ljava/util/Map;

    iget-object v7, v5, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->requestFactory:Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->getEventName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    invoke-virtual {v7, p1, p2, v4}, Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;->createRequest(Ljava/lang/String;Ljava/util/Map;Z)Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    move-result-object p1

    iget-object p2, v5, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    iput-object v6, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$2:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl$track$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/stripe/android/core/networking/StripeNetworkClient;->executeRequest(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne p2, v1, :cond_6

    return-object v1

    :cond_6
    move-object v1, v5

    move-object v0, v6

    :goto_2
    :try_start_4
    iget-object p2, v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->logger:Lcom/stripe/android/core/Logger;

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getEventName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getParams()Ljava/util/Map;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "EVENT: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_4

    :catchall_2
    move-exception p1

    move-object v0, p0

    :goto_3
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_4
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_7

    iget-object v0, v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;->logger:Lcom/stripe/android/core/Logger;

    const-string v1, "Exception while making analytics request"

    invoke-interface {v0, v1, p2}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    return-object p1
.end method
