.class public final Lcom/stripe/android/polling/DefaultIntentStatusPoller;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/polling/IntentStatusPoller;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B/\u0008\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008*\u0010+J\u001d\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0015\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\tJ\u0008\u0010\u000e\u001a\u00020\u0004H\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\"\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070%8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006,"
    }
    d2 = {
        "Lcom/stripe/android/polling/DefaultIntentStatusPoller;",
        "Lcom/stripe/android/polling/IntentStatusPoller;",
        "",
        "force",
        "",
        "performPoll",
        "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/model/StripeIntent$Status;",
        "fetchIntentStatus",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "LZC0;",
        "scope",
        "startPolling",
        "forcePoll",
        "stopPolling",
        "Lcom/stripe/android/networking/StripeRepository;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "LY94;",
        "Lcom/stripe/android/PaymentConfiguration;",
        "paymentConfigProvider",
        "LY94;",
        "Lcom/stripe/android/polling/IntentStatusPoller$Config;",
        "config",
        "Lcom/stripe/android/polling/IntentStatusPoller$Config;",
        "LSC0;",
        "dispatcher",
        "LSC0;",
        "",
        "attempts",
        "I",
        "Lzh2;",
        "pollingJob",
        "Lzh2;",
        "LGX2;",
        "_state",
        "LGX2;",
        "LtP5;",
        "state",
        "LtP5;",
        "getState",
        "()LtP5;",
        "<init>",
        "(Lcom/stripe/android/networking/StripeRepository;LY94;Lcom/stripe/android/polling/IntentStatusPoller$Config;LSC0;)V",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final _state:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/model/StripeIntent$Status;",
            ">;"
        }
    .end annotation
.end field

.field private attempts:I

.field private final config:Lcom/stripe/android/polling/IntentStatusPoller$Config;

.field private final dispatcher:LSC0;

.field private final paymentConfigProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private pollingJob:Lzh2;

.field private final state:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/model/StripeIntent$Status;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/networking/StripeRepository;LY94;Lcom/stripe/android/polling/IntentStatusPoller$Config;LSC0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/networking/StripeRepository;",
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "Lcom/stripe/android/polling/IntentStatusPoller$Config;",
            "LSC0;",
            ")V"
        }
    .end annotation

    const-string v0, "stripeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentConfigProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    iput-object p2, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->paymentConfigProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->config:Lcom/stripe/android/polling/IntentStatusPoller$Config;

    iput-object p4, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->dispatcher:LSC0;

    const/4 p1, 0x0

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->_state:LGX2;

    iput-object p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->state:LtP5;

    return-void
.end method

.method public static final synthetic access$fetchIntentStatus(Lcom/stripe/android/polling/DefaultIntentStatusPoller;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->fetchIntentStatus(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$performPoll(Lcom/stripe/android/polling/DefaultIntentStatusPoller;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->performPoll(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final fetchIntentStatus(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/StripeIntent$Status;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;

    iget v1, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;-><init>(Lcom/stripe/android/polling/DefaultIntentStatusPoller;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v5, v0

    iget-object p1, v5, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, v5, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->paymentConfigProvider:LY94;

    invoke-interface {p1}, LY94;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/PaymentConfiguration;

    :try_start_1
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    iget-object v3, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->config:Lcom/stripe/android/polling/IntentStatusPoller$Config;

    invoke-virtual {v3}, Lcom/stripe/android/polling/IntentStatusPoller$Config;->getClientSecret()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/stripe/android/core/networking/ApiRequest$Options;

    new-instance v6, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$paymentIntent$1$1;

    invoke-direct {v6, p1}, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$paymentIntent$1$1;-><init>(Lcom/stripe/android/PaymentConfiguration;)V

    new-instance v7, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$paymentIntent$1$2;

    invoke-direct {v7, p1}, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$paymentIntent$1$2;-><init>(Lcom/stripe/android/PaymentConfiguration;)V

    invoke-direct {v4, v6, v7}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    const/4 p1, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    iput v2, v5, Lcom/stripe/android/polling/DefaultIntentStatusPoller$fetchIntentStatus$1;->label:I

    move-object v2, v3

    move-object v3, v4

    move-object v4, p1

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/networking/StripeRepository;->retrievePaymentIntent$default(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    check-cast p1, Lcom/stripe/android/model/PaymentIntent;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    move-object p1, v1

    :cond_4
    check-cast p1, Lcom/stripe/android/model/PaymentIntent;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v1

    :cond_5
    return-object v1
.end method

.method private final performPoll(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;

    iget v1, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;-><init>(Lcom/stripe/android/polling/DefaultIntentStatusPoller;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v7, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/polling/DefaultIntentStatusPoller;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object p1, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->L$1:Ljava/lang/Object;

    check-cast p1, LGX2;

    iget-object v2, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/polling/DefaultIntentStatusPoller;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    if-nez p1, :cond_5

    iget p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->attempts:I

    iget-object p2, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->config:Lcom/stripe/android/polling/IntentStatusPoller$Config;

    invoke-virtual {p2}, Lcom/stripe/android/polling/IntentStatusPoller$Config;->getMaxAttempts()I

    move-result p2

    if-ge p1, p2, :cond_a

    :cond_5
    iget p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->attempts:I

    add-int/2addr p1, v7

    iput p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->attempts:I

    iget-object p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->_state:LGX2;

    iput-object p0, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->L$1:Ljava/lang/Object;

    iput v7, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->label:I

    invoke-direct {p0, v0}, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->fetchIntentStatus(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    return-object v1

    :cond_6
    move-object v2, p0

    :goto_1
    invoke-interface {p1, p2}, LGX2;->setValue(Ljava/lang/Object;)V

    iget p1, v2, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->attempts:I

    iget-object p2, v2, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->config:Lcom/stripe/android/polling/IntentStatusPoller$Config;

    invoke-virtual {p2}, Lcom/stripe/android/polling/IntentStatusPoller$Config;->getMaxAttempts()I

    move-result p2

    if-ge p1, p2, :cond_7

    move p1, v7

    goto :goto_2

    :cond_7
    move p1, v3

    :goto_2
    if-eqz p1, :cond_a

    iget p1, v2, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->attempts:I

    invoke-static {p1}, Lcom/stripe/android/polling/DefaultIntentStatusPollerKt;->calculateDelay(I)J

    move-result-wide p1

    iput-object v2, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->L$1:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->label:I

    invoke-static {p1, p2, v0}, LrZ0;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    move-object p1, v2

    :goto_3
    iput-object v6, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller$performPoll$1;->label:I

    invoke-static {p1, v3, v0, v7, v6}, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->performPoll$default(Lcom/stripe/android/polling/DefaultIntentStatusPoller;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    return-object v1

    :cond_9
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_a
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public static synthetic performPoll$default(Lcom/stripe/android/polling/DefaultIntentStatusPoller;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->performPoll(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public forcePoll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/StripeIntent$Status;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->fetchIntentStatus(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getState()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/model/StripeIntent$Status;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->state:LtP5;

    return-object v0
.end method

.method public startPolling(LZC0;)V
    .locals 7

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->dispatcher:LSC0;

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/polling/DefaultIntentStatusPoller$startPolling$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/stripe/android/polling/DefaultIntentStatusPoller$startPolling$1;-><init>(Lcom/stripe/android/polling/DefaultIntentStatusPoller;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->pollingJob:Lzh2;

    return-void
.end method

.method public stopPolling()V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->pollingJob:Lzh2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iput-object v1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;->pollingJob:Lzh2;

    return-void
.end method
