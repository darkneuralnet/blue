.class public final Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/networking/StripeNetworkClient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B9\u0008\u0007\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJI\u0010\r\u001a\u0008\u0012\u0004\u0012\u0002H\u000f0\u000e\"\u0004\u0008\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00122\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u000f0\u000e0\u0014H\u0081@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\'\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J,\u0010\"\u001a\u0008\u0012\u0004\u0012\u0002H\u000f0\u000e\"\u0004\u0008\u0000\u0010\u000f2\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u0002H\u000f0$2\u0008\u0010%\u001a\u0004\u0018\u00010\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;",
        "Lcom/stripe/android/core/networking/StripeNetworkClient;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "connectionFactory",
        "Lcom/stripe/android/core/networking/ConnectionFactory;",
        "retryDelaySupplier",
        "Lcom/stripe/android/core/networking/RetryDelaySupplier;",
        "maxRetries",
        "",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;)V",
        "executeInternal",
        "Lcom/stripe/android/core/networking/StripeResponse;",
        "BodyType",
        "remainingRetries",
        "retryResponseCodes",
        "",
        "requester",
        "Lkotlin/Function0;",
        "executeInternal$stripe_core_release",
        "(ILjava/lang/Iterable;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "executeRequest",
        "",
        "request",
        "Lcom/stripe/android/core/networking/StripeRequest;",
        "(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "executeRequestForFile",
        "Ljava/io/File;",
        "outputFile",
        "(Lcom/stripe/android/core/networking/StripeRequest;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "makeRequest",
        "makeRequestForFile",
        "parseResponse",
        "connection",
        "Lcom/stripe/android/core/networking/StripeConnection;",
        "baseUrl",
        "Companion",
        "stripe-core_release"
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
.field private static final Companion:Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$Companion;

.field private static final DEFAULT_MAX_RETRIES:I = 0x3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final connectionFactory:Lcom/stripe/android/core/networking/ConnectionFactory;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final maxRetries:I

.field private final retryDelaySupplier:Lcom/stripe/android/core/networking/RetryDelaySupplier;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->Companion:Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 8
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;-><init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;)V
    .locals 9
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "workContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x1e

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;-><init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;)V
    .locals 9
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "workContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x1c

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;-><init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;)V
    .locals 9
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "workContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retryDelaySupplier"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;-><init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;I)V
    .locals 9
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "workContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retryDelaySupplier"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;-><init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "workContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retryDelaySupplier"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->workContext:Lkotlin/coroutines/CoroutineContext;

    iput-object p2, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->connectionFactory:Lcom/stripe/android/core/networking/ConnectionFactory;

    iput-object p3, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->retryDelaySupplier:Lcom/stripe/android/core/networking/RetryDelaySupplier;

    iput p4, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->maxRetries:I

    iput-object p5, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->logger:Lcom/stripe/android/core/Logger;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    invoke-static {}, LT41;->b()LSC0;

    move-result-object p1

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    sget-object p2, Lcom/stripe/android/core/networking/ConnectionFactory$Default;->INSTANCE:Lcom/stripe/android/core/networking/ConnectionFactory$Default;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    new-instance p3, Lcom/stripe/android/core/networking/RetryDelaySupplier;

    invoke-direct {p3}, Lcom/stripe/android/core/networking/RetryDelaySupplier;-><init>()V

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    const/4 p4, 0x3

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    sget-object p2, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    invoke-virtual {p2}, Lcom/stripe/android/core/Logger$Companion;->noop()Lcom/stripe/android/core/Logger;

    move-result-object p5

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move p6, v1

    move-object p7, v2

    invoke-direct/range {p2 .. p7}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;-><init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;)V

    return-void
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;)Lcom/stripe/android/core/Logger;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getRetryDelaySupplier$p(Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;)Lcom/stripe/android/core/networking/RetryDelaySupplier;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->retryDelaySupplier:Lcom/stripe/android/core/networking/RetryDelaySupplier;

    return-object p0
.end method

.method public static final synthetic access$makeRequest(Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;Lcom/stripe/android/core/networking/StripeRequest;)Lcom/stripe/android/core/networking/StripeResponse;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->makeRequest(Lcom/stripe/android/core/networking/StripeRequest;)Lcom/stripe/android/core/networking/StripeResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$makeRequestForFile(Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;Lcom/stripe/android/core/networking/StripeRequest;Ljava/io/File;)Lcom/stripe/android/core/networking/StripeResponse;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->makeRequestForFile(Lcom/stripe/android/core/networking/StripeRequest;Ljava/io/File;)Lcom/stripe/android/core/networking/StripeResponse;

    move-result-object p0

    return-object p0
.end method

.method private final makeRequest(Lcom/stripe/android/core/networking/StripeRequest;)Lcom/stripe/android/core/networking/StripeResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/StripeRequest;",
            ")",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->connectionFactory:Lcom/stripe/android/core/networking/ConnectionFactory;

    invoke-interface {v0, p1}, Lcom/stripe/android/core/networking/ConnectionFactory;->create(Lcom/stripe/android/core/networking/StripeRequest;)Lcom/stripe/android/core/networking/StripeConnection;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeRequest;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->parseResponse(Lcom/stripe/android/core/networking/StripeConnection;Ljava/lang/String;)Lcom/stripe/android/core/networking/StripeResponse;

    move-result-object p1

    return-object p1
.end method

.method private final makeRequestForFile(Lcom/stripe/android/core/networking/StripeRequest;Ljava/io/File;)Lcom/stripe/android/core/networking/StripeResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/StripeRequest;",
            "Ljava/io/File;",
            ")",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->connectionFactory:Lcom/stripe/android/core/networking/ConnectionFactory;

    invoke-interface {v0, p1, p2}, Lcom/stripe/android/core/networking/ConnectionFactory;->createForFile(Lcom/stripe/android/core/networking/StripeRequest;Ljava/io/File;)Lcom/stripe/android/core/networking/StripeConnection;

    move-result-object p2

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeRequest;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->parseResponse(Lcom/stripe/android/core/networking/StripeConnection;Ljava/lang/String;)Lcom/stripe/android/core/networking/StripeResponse;

    move-result-object p1

    return-object p1
.end method

.method private final parseResponse(Lcom/stripe/android/core/networking/StripeConnection;Ljava/lang/String;)Lcom/stripe/android/core/networking/StripeResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<BodyType:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/stripe/android/core/networking/StripeConnection<",
            "TBodyType;>;",
            "Ljava/lang/String;",
            ")",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "TBodyType;>;"
        }
    .end annotation

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-interface {p1}, Lcom/stripe/android/core/networking/StripeConnection;->getResponse()Lcom/stripe/android/core/networking/StripeResponse;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->logger:Lcom/stripe/android/core/Logger;

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeResponse;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/stripe/android/core/Logger;->info(Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    check-cast p1, Lcom/stripe/android/core/networking/StripeResponse;

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->logger:Lcom/stripe/android/core/Logger;

    const-string v1, "Exception while making Stripe API request"

    invoke-interface {p1, v1, v0}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    instance-of p1, v0, Ljava/io/IOException;

    if-eqz p1, :cond_1

    sget-object p1, Lcom/stripe/android/core/exception/APIConnectionException;->Companion:Lcom/stripe/android/core/exception/APIConnectionException$Companion;

    check-cast v0, Ljava/io/IOException;

    invoke-virtual {p1, v0, p2}, Lcom/stripe/android/core/exception/APIConnectionException$Companion;->create(Ljava/io/IOException;Ljava/lang/String;)Lcom/stripe/android/core/exception/APIConnectionException;

    move-result-object v0

    :cond_1
    throw v0
.end method


# virtual methods
.method public final executeInternal$stripe_core_release(ILjava/lang/Iterable;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<BodyType:",
            "Ljava/lang/Object;",
            ">(I",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "TBodyType;>;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "TBodyType;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v7, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p3

    move-object v3, p2

    move v4, p1

    move-object v5, p0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;-><init>(Lkotlin/jvm/functions/Function0;Ljava/lang/Iterable;ILcom/stripe/android/core/networking/DefaultStripeNetworkClient;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v7, p4}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public executeRequest(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/StripeRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget v0, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->maxRetries:I

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeRequest;->getRetryResponseCodes()Ljava/lang/Iterable;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeRequest$2;

    invoke-direct {v2, p0, p1}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeRequest$2;-><init>(Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;Lcom/stripe/android/core/networking/StripeRequest;)V

    invoke-virtual {p0, v0, v1, v2, p2}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->executeInternal$stripe_core_release(ILjava/lang/Iterable;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public executeRequestForFile(Lcom/stripe/android/core/networking/StripeRequest;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/StripeRequest;",
            "Ljava/io/File;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/io/File;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget v0, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->maxRetries:I

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeRequest;->getRetryResponseCodes()Ljava/lang/Iterable;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeRequestForFile$2;

    invoke-direct {v2, p0, p1, p2}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeRequestForFile$2;-><init>(Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;Lcom/stripe/android/core/networking/StripeRequest;Ljava/io/File;)V

    invoke-virtual {p0, v0, v1, v2, p3}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->executeInternal$stripe_core_release(ILjava/lang/Iterable;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
