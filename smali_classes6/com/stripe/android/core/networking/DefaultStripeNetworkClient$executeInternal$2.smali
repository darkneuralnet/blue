.class final Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->executeInternal$stripe_core_release(ILjava/lang/Iterable;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LZC0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/stripe/android/core/networking/StripeResponse<",
        "TBodyType;>;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\u0008\u0000\u0010\u0000*\u00020\u0001H\u008a@"
    }
    d2 = {
        "BodyType",
        "LZC0;",
        "Lcom/stripe/android/core/networking/StripeResponse;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.core.networking.DefaultStripeNetworkClient$executeInternal$2"
    f = "DefaultStripeNetworkClient.kt"
    i = {}
    l = {
        0x32,
        0x38
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $remainingRetries:I

.field final synthetic $requester:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "TBodyType;>;>;"
        }
    .end annotation
.end field

.field final synthetic $retryResponseCodes:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;Ljava/lang/Iterable;ILcom/stripe/android/core/networking/DefaultStripeNetworkClient;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "TBodyType;>;>;",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;I",
            "Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->$requester:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->$retryResponseCodes:Ljava/lang/Iterable;

    iput p3, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->$remainingRetries:I

    iput-object p4, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->this$0:Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;

    iget-object v1, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->$requester:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->$retryResponseCodes:Ljava/lang/Iterable;

    iget v3, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->$remainingRetries:I

    iget-object v4, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->this$0:Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;-><init>(Lkotlin/jvm/functions/Function0;Ljava/lang/Iterable;ILcom/stripe/android/core/networking/DefaultStripeNetworkClient;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "TBodyType;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->$requester:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/networking/StripeResponse;

    iget-object v1, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->$retryResponseCodes:Ljava/lang/Iterable;

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeResponse;->getCode()I

    move-result v4

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget v1, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->$remainingRetries:I

    if-lez v1, :cond_5

    iget-object v1, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->this$0:Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;

    invoke-static {v1}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->access$getLogger$p(Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;)Lcom/stripe/android/core/Logger;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeResponse;->getCode()I

    move-result p1

    iget v4, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->$remainingRetries:I

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Request failed with code "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". Retrying up to "

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " more time(s)."

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/stripe/android/core/Logger;->info(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->this$0:Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;

    invoke-static {p1}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->access$getRetryDelaySupplier$p(Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;)Lcom/stripe/android/core/networking/RetryDelaySupplier;

    move-result-object p1

    const/4 v1, 0x3

    iget v4, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->$remainingRetries:I

    invoke-virtual {p1, v1, v4}, Lcom/stripe/android/core/networking/RetryDelaySupplier;->getDelayMillis(II)J

    move-result-wide v4

    iput v3, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->label:I

    invoke-static {v4, v5, p0}, LrZ0;->a(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->this$0:Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;

    iget v1, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->$remainingRetries:I

    sub-int/2addr v1, v3

    iget-object v3, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->$retryResponseCodes:Ljava/lang/Iterable;

    iget-object v4, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->$requester:Lkotlin/jvm/functions/Function0;

    iput v2, p0, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$executeInternal$2;->label:I

    invoke-virtual {p1, v1, v3, v4, p0}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;->executeInternal$stripe_core_release(ILjava/lang/Iterable;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    check-cast p1, Lcom/stripe/android/core/networking/StripeResponse;

    :cond_5
    return-object p1
.end method
