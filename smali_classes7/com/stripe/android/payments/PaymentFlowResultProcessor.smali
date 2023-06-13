.class public abstract Lcom/stripe/android/payments/PaymentFlowResultProcessor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/PaymentFlowResultProcessor$WhenMappings;,
        Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/stripe/android/model/StripeIntent;",
        "S:",
        "Lcom/stripe/android/StripeIntentResult<",
        "+TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u0000 C*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0010\u0008\u0001\u0010\u0004 \u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0005:\u0001CBA\u0008\u0004\u0012\u0006\u0010@\u001a\u00020?\u0012\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00120+\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00107\u001a\u000206\u0012\u0008\u0008\u0002\u0010:\u001a\u000209\u00a2\u0006\u0004\u0008A\u0010BJ\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\u0018\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002J+\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002J\u001b\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ3\u0010 \u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u001eH\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010!J3\u0010\"\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u001eH\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\"\u0010!J-\u0010%\u001a\u0004\u0018\u00018\u00002\u0006\u0010#\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0012H\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008%\u0010&J)\u0010)\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\'\u001a\u00020\n2\u0008\u0010(\u001a\u0004\u0018\u00010\u0012H$\u00a2\u0006\u0004\u0008)\u0010*R\u001a\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00120+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u001a\u0010/\u001a\u00020.8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>\u0082\u0001\u0002DE\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006F"
    }
    d2 = {
        "Lcom/stripe/android/payments/PaymentFlowResultProcessor;",
        "Lcom/stripe/android/model/StripeIntent;",
        "T",
        "Lcom/stripe/android/StripeIntentResult;",
        "S",
        "",
        "stripeIntent",
        "",
        "shouldCancelSource",
        "shouldCancelIntentSource",
        "",
        "flowOutcome",
        "shouldRefreshIntent",
        "intent",
        "originalFlowOutcome",
        "determineFlowOutcome",
        "shouldCallRefreshIntent",
        "originalIntent",
        "",
        "clientSecret",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "requestOptions",
        "refreshStripeIntentUntilTerminalState",
        "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "shouldRetry",
        "shouldThrowException",
        "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
        "unvalidatedResult",
        "processResult",
        "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "expandFields",
        "retrieveStripeIntent",
        "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "refreshStripeIntent",
        "stripeIntentId",
        "sourceId",
        "cancelStripeIntentSource",
        "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "outcomeFromFlow",
        "failureMessage",
        "createStripeIntentResult",
        "(Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;)Lcom/stripe/android/StripeIntentResult;",
        "LY94;",
        "publishableKeyProvider",
        "LY94;",
        "Lcom/stripe/android/networking/StripeRepository;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "getStripeRepository",
        "()Lcom/stripe/android/networking/StripeRepository;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "Lkotlin/coroutines/CoroutineContext;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "Lcom/stripe/android/core/networking/RetryDelaySupplier;",
        "retryDelaySupplier",
        "Lcom/stripe/android/core/networking/RetryDelaySupplier;",
        "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;",
        "failureMessageFactory",
        "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;LY94;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/RetryDelaySupplier;)V",
        "Companion",
        "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;",
        "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;",
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
.field public static final Companion:Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;

.field private static final EXPAND_PAYMENT_METHOD:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final MAX_RETRIES:I = 0x3


# instance fields
.field private final failureMessageFactory:Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final publishableKeyProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final retryDelaySupplier:Lcom/stripe/android/core/networking/RetryDelaySupplier;

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->Companion:Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;

    const-string v0, "payment_method"

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->EXPAND_PAYMENT_METHOD:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;LY94;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/RetryDelaySupplier;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "LY94<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lcom/stripe/android/core/networking/RetryDelaySupplier;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->publishableKeyProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    iput-object p4, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->logger:Lcom/stripe/android/core/Logger;

    iput-object p5, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->workContext:Lkotlin/coroutines/CoroutineContext;

    iput-object p6, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->retryDelaySupplier:Lcom/stripe/android/core/networking/RetryDelaySupplier;

    new-instance p2, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;

    invoke-direct {p2, p1}, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->failureMessageFactory:Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;LY94;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p7, 0x20

    if-eqz v0, :cond_0

    new-instance v0, Lcom/stripe/android/core/networking/RetryDelaySupplier;

    invoke-direct {v0}, Lcom/stripe/android/core/networking/RetryDelaySupplier;-><init>()V

    move-object v7, v0

    goto :goto_0

    :cond_0
    move-object v7, p6

    :goto_0
    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;-><init>(Landroid/content/Context;LY94;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/RetryDelaySupplier;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;LY94;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/RetryDelaySupplier;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;-><init>(Landroid/content/Context;LY94;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/RetryDelaySupplier;)V

    return-void
.end method

.method public static final synthetic access$determineFlowOutcome(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lcom/stripe/android/model/StripeIntent;I)I
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->determineFlowOutcome(Lcom/stripe/android/model/StripeIntent;I)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$getEXPAND_PAYMENT_METHOD$cp()Ljava/util/List;
    .locals 1

    sget-object v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->EXPAND_PAYMENT_METHOD:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getFailureMessageFactory$p(Lcom/stripe/android/payments/PaymentFlowResultProcessor;)Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->failureMessageFactory:Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/stripe/android/payments/PaymentFlowResultProcessor;)Lcom/stripe/android/core/Logger;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->logger:Lcom/stripe/android/core/Logger;

    return-object p0
.end method

.method public static final synthetic access$getPublishableKeyProvider$p(Lcom/stripe/android/payments/PaymentFlowResultProcessor;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->publishableKeyProvider:LY94;

    return-object p0
.end method

.method public static final synthetic access$refreshStripeIntentUntilTerminalState(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->refreshStripeIntentUntilTerminalState(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$shouldCancelIntentSource(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lcom/stripe/android/model/StripeIntent;Z)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->shouldCancelIntentSource(Lcom/stripe/android/model/StripeIntent;Z)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$shouldRefreshIntent(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lcom/stripe/android/model/StripeIntent;I)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->shouldRefreshIntent(Lcom/stripe/android/model/StripeIntent;I)Z

    move-result p0

    return p0
.end method

.method private final determineFlowOutcome(Lcom/stripe/android/model/StripeIntent;I)I
    .locals 2

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    goto :goto_1

    :cond_1
    move p2, v0

    :goto_1
    return p2
.end method

.method private final refreshStripeIntentUntilTerminalState(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/StripeIntent;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/core/exception/MaxRetryReachedException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    instance-of v5, v4, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;

    if-eqz v5, :cond_0

    move-object v5, v4

    check-cast v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;

    iget v6, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->label:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;

    invoke-direct {v5, v0, v4}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;-><init>(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v4, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v6

    iget v7, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->label:I

    const-string v8, "Required value was null."

    const/4 v9, 0x5

    const/4 v10, 0x4

    const/4 v11, 0x2

    const/4 v12, 0x3

    const/4 v13, 0x1

    if-eqz v7, :cond_6

    if-eq v7, v13, :cond_5

    if-eq v7, v11, :cond_4

    if-eq v7, v12, :cond_3

    if-eq v7, v10, :cond_2

    if-ne v7, v9, :cond_1

    iget v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->I$0:I

    iget-object v2, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v3, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v7, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/model/StripeIntent;

    iget-object v11, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->I$0:I

    iget-object v2, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v3, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v7, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/model/StripeIntent;

    iget-object v11, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    iget v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->I$0:I

    iget-object v2, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v3, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v7, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/model/StripeIntent;

    iget-object v11, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_4
    iget v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->I$0:I

    iget-object v2, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v3, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v7, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/model/StripeIntent;

    iget-object v11, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v16, v4

    move v4, v1

    move-object v1, v7

    move-object/from16 v7, v16

    move-object/from16 v17, v3

    move-object v3, v2

    move-object/from16 v2, v17

    goto :goto_2

    :cond_5
    iget v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->I$0:I

    iget-object v2, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v3, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v7, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/model/StripeIntent;

    iget-object v11, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v16, v4

    move v4, v1

    move-object v1, v7

    move-object/from16 v7, v16

    move-object/from16 v17, v3

    move-object v3, v2

    move-object/from16 v2, v17

    goto :goto_1

    :cond_6
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-direct/range {p0 .. p1}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->shouldCallRefreshIntent(Lcom/stripe/android/model/StripeIntent;)Z

    move-result v4

    if-eqz v4, :cond_8

    sget-object v4, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->EXPAND_PAYMENT_METHOD:Ljava/util/List;

    iput-object v0, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$0:Ljava/lang/Object;

    iput-object v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$1:Ljava/lang/Object;

    iput-object v2, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$2:Ljava/lang/Object;

    iput-object v3, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$3:Ljava/lang/Object;

    iput v12, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->I$0:I

    iput v13, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->label:I

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->refreshStripeIntent(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v6, :cond_7

    return-object v6

    :cond_7
    move-object v11, v0

    move-object v7, v4

    move v4, v12

    :goto_1
    check-cast v7, Lcom/stripe/android/model/StripeIntent;

    goto :goto_3

    :cond_8
    sget-object v4, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->EXPAND_PAYMENT_METHOD:Ljava/util/List;

    iput-object v0, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$0:Ljava/lang/Object;

    iput-object v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$1:Ljava/lang/Object;

    iput-object v2, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$2:Ljava/lang/Object;

    iput-object v3, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$3:Ljava/lang/Object;

    iput v12, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->I$0:I

    iput v11, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->label:I

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->retrieveStripeIntent(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v6, :cond_9

    return-object v6

    :cond_9
    move-object v11, v0

    move-object v7, v4

    move v4, v12

    :goto_2
    check-cast v7, Lcom/stripe/android/model/StripeIntent;

    :goto_3
    if-eqz v7, :cond_11

    :goto_4
    invoke-direct {v11, v7}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->shouldRetry(Lcom/stripe/android/model/StripeIntent;)Z

    move-result v14

    if-eqz v14, :cond_f

    if-le v4, v13, :cond_f

    iget-object v7, v11, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->retryDelaySupplier:Lcom/stripe/android/core/networking/RetryDelaySupplier;

    invoke-virtual {v7, v12, v4}, Lcom/stripe/android/core/networking/RetryDelaySupplier;->getDelayMillis(II)J

    move-result-wide v14

    iput-object v11, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$0:Ljava/lang/Object;

    iput-object v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$1:Ljava/lang/Object;

    iput-object v2, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$2:Ljava/lang/Object;

    iput-object v3, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$3:Ljava/lang/Object;

    iput v4, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->I$0:I

    iput v12, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->label:I

    invoke-static {v14, v15, v5}, LrZ0;->a(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v6, :cond_a

    return-object v6

    :cond_a
    move-object v7, v1

    move v1, v4

    move-object/from16 v16, v3

    move-object v3, v2

    move-object/from16 v2, v16

    :goto_5
    invoke-direct {v11, v7}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->shouldCallRefreshIntent(Lcom/stripe/android/model/StripeIntent;)Z

    move-result v4

    if-eqz v4, :cond_c

    sget-object v4, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->EXPAND_PAYMENT_METHOD:Ljava/util/List;

    iput-object v11, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$0:Ljava/lang/Object;

    iput-object v7, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$1:Ljava/lang/Object;

    iput-object v3, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$2:Ljava/lang/Object;

    iput-object v2, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$3:Ljava/lang/Object;

    iput v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->I$0:I

    iput v10, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->label:I

    invoke-virtual {v11, v3, v2, v4, v5}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->refreshStripeIntent(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v6, :cond_b

    return-object v6

    :cond_b
    :goto_6
    check-cast v4, Lcom/stripe/android/model/StripeIntent;

    :goto_7
    move-object/from16 v16, v3

    move-object v3, v2

    move-object/from16 v2, v16

    goto :goto_9

    :cond_c
    sget-object v4, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->EXPAND_PAYMENT_METHOD:Ljava/util/List;

    iput-object v11, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$0:Ljava/lang/Object;

    iput-object v7, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$1:Ljava/lang/Object;

    iput-object v3, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$2:Ljava/lang/Object;

    iput-object v2, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->L$3:Ljava/lang/Object;

    iput v1, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->I$0:I

    iput v9, v5, Lcom/stripe/android/payments/PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;->label:I

    invoke-virtual {v11, v3, v2, v4, v5}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->retrieveStripeIntent(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v6, :cond_d

    return-object v6

    :cond_d
    :goto_8
    check-cast v4, Lcom/stripe/android/model/StripeIntent;

    goto :goto_7

    :goto_9
    if-eqz v4, :cond_e

    add-int/lit8 v1, v1, -0x1

    move-object/from16 v16, v4

    move v4, v1

    move-object v1, v7

    move-object/from16 v7, v16

    goto :goto_4

    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    invoke-direct {v11, v7}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->shouldThrowException(Lcom/stripe/android/model/StripeIntent;)Z

    move-result v1

    if-nez v1, :cond_10

    return-object v7

    :cond_10
    new-instance v1, Lcom/stripe/android/core/exception/MaxRetryReachedException;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v13, v2}, Lcom/stripe/android/core/exception/MaxRetryReachedException;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1

    :cond_11
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private final shouldCallRefreshIntent(Lcom/stripe/android/model/StripeIntent;)Z
    .locals 3

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    sget-object v2, Lcom/stripe/android/model/PaymentMethod$Type;->WeChatPay:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eq v0, v2, :cond_3

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v1, p1, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    :cond_1
    sget-object p1, Lcom/stripe/android/model/PaymentMethod$Type;->Upi:Lcom/stripe/android/model/PaymentMethod$Type;

    if-ne v1, p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p1, 0x1

    :goto_2
    return p1
.end method

.method private final shouldCancelIntentSource(Lcom/stripe/android/model/StripeIntent;Z)Z
    .locals 0

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->requiresAction()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final shouldRefreshIntent(Lcom/stripe/android/model/StripeIntent;I)Z
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    invoke-static {p1}, Lcom/stripe/android/model/StripeIntentKtxKt;->shouldRefresh(Lcom/stripe/android/model/StripeIntent;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    const/4 v3, 0x0

    const/4 v4, 0x3

    if-ne p2, v4, :cond_2

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v5

    sget-object v6, Lcom/stripe/android/model/StripeIntent$Status;->Processing:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne v5, v6, :cond_2

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v5

    if-eqz v5, :cond_1

    iget-object v5, v5, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    goto :goto_1

    :cond_1
    move-object v5, v3

    :goto_1
    sget-object v6, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    if-ne v5, v6, :cond_2

    move v5, v1

    goto :goto_2

    :cond_2
    move v5, v0

    :goto_2
    if-ne p2, v4, :cond_4

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object p2

    sget-object v4, Lcom/stripe/android/model/StripeIntent$Status;->RequiresAction:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne p2, v4, :cond_4

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-object v3, p2, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    :cond_3
    sget-object p2, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    if-ne v3, p2, :cond_4

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getNextActionType()Lcom/stripe/android/model/StripeIntent$NextActionType;

    move-result-object p1

    sget-object p2, Lcom/stripe/android/model/StripeIntent$NextActionType;->UseStripeSdk:Lcom/stripe/android/model/StripeIntent$NextActionType;

    if-ne p1, p2, :cond_4

    move p1, v1

    goto :goto_3

    :cond_4
    move p1, v0

    :goto_3
    if-nez v2, :cond_5

    if-nez v5, :cond_5

    if-eqz p1, :cond_6

    :cond_5
    move v0, v1

    :cond_6
    return v0
.end method

.method private final shouldRetry(Lcom/stripe/android/model/StripeIntent;)Z
    .locals 5

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->requiresAction()Z

    move-result v0

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/model/StripeIntent$Status;->Processing:Lcom/stripe/android/model/StripeIntent$Status;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_1

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    if-ne p1, v1, :cond_1

    move p1, v3

    goto :goto_1

    :cond_1
    move p1, v4

    :goto_1
    if-nez v0, :cond_3

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move v3, v4

    :cond_3
    :goto_2
    return v3
.end method

.method private final shouldThrowException(Lcom/stripe/android/model/StripeIntent;)Z
    .locals 1

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->requiresAction()Z

    move-result v0

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getNextActionData()Lcom/stripe/android/model/StripeIntent$NextActionData;

    move-result-object p1

    instance-of p1, p1, Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public abstract cancelStripeIntentSource(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract createStripeIntentResult(Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;)Lcom/stripe/android/StripeIntentResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I",
            "Ljava/lang/String;",
            ")TS;"
        }
    .end annotation
.end method

.method public final getStripeRepository()Lcom/stripe/android/networking/StripeRepository;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    return-object v0
.end method

.method public final processResult(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
            "Lkotlin/coroutines/Continuation<",
            "-TS;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;-><init>(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, p2}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract refreshStripeIntent(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract retrieveStripeIntent(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
