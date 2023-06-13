.class public final Lcom/stripe/android/DefaultFraudDetectionDataRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/FraudDetectionDataRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0019\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B%\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\rJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0008\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/DefaultFraudDetectionDataRepository;",
        "Lcom/stripe/android/FraudDetectionDataRepository;",
        "context",
        "Landroid/content/Context;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V",
        "localStore",
        "Lcom/stripe/android/FraudDetectionDataStore;",
        "fraudDetectionDataRequestFactory",
        "Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;",
        "stripeNetworkClient",
        "Lcom/stripe/android/core/networking/StripeNetworkClient;",
        "(Lcom/stripe/android/FraudDetectionDataStore;Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;Lcom/stripe/android/core/networking/StripeNetworkClient;Lkotlin/coroutines/CoroutineContext;)V",
        "cachedFraudDetectionData",
        "Lcom/stripe/android/networking/FraudDetectionData;",
        "getCached",
        "getLatest",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "refresh",
        "",
        "save",
        "fraudDetectionData",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private cachedFraudDetectionData:Lcom/stripe/android/networking/FraudDetectionData;

.field private final fraudDetectionDataRequestFactory:Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;

.field private final localStore:Lcom/stripe/android/FraudDetectionDataStore;

.field private final stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/stripe/android/DefaultFraudDetectionDataRepository;-><init>(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V
    .locals 10
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/DefaultFraudDetectionDataStore;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/DefaultFraudDetectionDataStore;-><init>(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V

    new-instance v1, Lcom/stripe/android/networking/DefaultFraudDetectionDataRequestFactory;

    invoke-direct {v1, p1}, Lcom/stripe/android/networking/DefaultFraudDetectionDataRequestFactory;-><init>(Landroid/content/Context;)V

    new-instance p1, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x1e

    const/4 v9, 0x0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;-><init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/stripe/android/DefaultFraudDetectionDataRepository;-><init>(Lcom/stripe/android/FraudDetectionDataStore;Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;Lcom/stripe/android/core/networking/StripeNetworkClient;Lkotlin/coroutines/CoroutineContext;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, LT41;->b()LSC0;

    move-result-object p2

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/DefaultFraudDetectionDataRepository;-><init>(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/FraudDetectionDataStore;Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;Lcom/stripe/android/core/networking/StripeNetworkClient;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1

    const-string v0, "localStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fraudDetectionDataRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeNetworkClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository;->localStore:Lcom/stripe/android/FraudDetectionDataStore;

    iput-object p2, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository;->fraudDetectionDataRequestFactory:Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;

    iput-object p3, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    iput-object p4, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method

.method public static final synthetic access$getCachedFraudDetectionData$p(Lcom/stripe/android/DefaultFraudDetectionDataRepository;)Lcom/stripe/android/networking/FraudDetectionData;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository;->cachedFraudDetectionData:Lcom/stripe/android/networking/FraudDetectionData;

    return-object p0
.end method

.method public static final synthetic access$getFraudDetectionDataRequestFactory$p(Lcom/stripe/android/DefaultFraudDetectionDataRepository;)Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository;->fraudDetectionDataRequestFactory:Lcom/stripe/android/networking/FraudDetectionDataRequestFactory;

    return-object p0
.end method

.method public static final synthetic access$getLocalStore$p(Lcom/stripe/android/DefaultFraudDetectionDataRepository;)Lcom/stripe/android/FraudDetectionDataStore;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository;->localStore:Lcom/stripe/android/FraudDetectionDataStore;

    return-object p0
.end method

.method public static final synthetic access$getStripeNetworkClient$p(Lcom/stripe/android/DefaultFraudDetectionDataRepository;)Lcom/stripe/android/core/networking/StripeNetworkClient;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository;->stripeNetworkClient:Lcom/stripe/android/core/networking/StripeNetworkClient;

    return-object p0
.end method


# virtual methods
.method public getCached()Lcom/stripe/android/networking/FraudDetectionData;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository;->cachedFraudDetectionData:Lcom/stripe/android/networking/FraudDetectionData;

    sget-object v1, Lcom/stripe/android/Stripe;->Companion:Lcom/stripe/android/Stripe$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/Stripe$Companion;->getAdvancedFraudSignalsEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getLatest(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/networking/FraudDetectionData;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/stripe/android/DefaultFraudDetectionDataRepository$getLatest$2;-><init>(Lcom/stripe/android/DefaultFraudDetectionDataRepository;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, p1}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public refresh()V
    .locals 7

    sget-object v0, Lcom/stripe/android/Stripe;->Companion:Lcom/stripe/android/Stripe$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/Stripe$Companion;->getAdvancedFraudSignalsEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, LaD0;->a(Lkotlin/coroutines/CoroutineContext;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/DefaultFraudDetectionDataRepository$refresh$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/stripe/android/DefaultFraudDetectionDataRepository$refresh$1;-><init>(Lcom/stripe/android/DefaultFraudDetectionDataRepository;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :cond_0
    return-void
.end method

.method public save(Lcom/stripe/android/networking/FraudDetectionData;)V
    .locals 1

    const-string v0, "fraudDetectionData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository;->cachedFraudDetectionData:Lcom/stripe/android/networking/FraudDetectionData;

    iget-object v0, p0, Lcom/stripe/android/DefaultFraudDetectionDataRepository;->localStore:Lcom/stripe/android/FraudDetectionDataStore;

    invoke-interface {v0, p1}, Lcom/stripe/android/FraudDetectionDataStore;->save(Lcom/stripe/android/networking/FraudDetectionData;)V

    return-void
.end method
