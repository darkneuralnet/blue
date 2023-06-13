.class final Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/utils/ErrorsKt;->retryOnException(IJJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ln74<",
        "-TT;>;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"
    }
    d2 = {
        "T",
        "Ln74;",
        "",
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
    c = "com.stripe.android.financialconnections.utils.ErrorsKt$retryOnException$2"
    f = "Errors.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3
    }
    l = {
        0x18,
        0x19,
        0x21,
        0x1e
    }
    m = "invokeSuspend"
    n = {
        "$this$channelFlow",
        "remainingTimes",
        "$this$channelFlow",
        "remainingTimes",
        "$this$channelFlow",
        "remainingTimes",
        "$this$channelFlow",
        "remainingTimes",
        "exception"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nErrors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Errors.kt\ncom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $block:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $delayMilliseconds:J

.field final synthetic $initialDelay:J

.field final synthetic $retryCondition:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/Throwable;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $times:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(IJJLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Throwable;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->$times:I

    iput-wide p2, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->$initialDelay:J

    iput-wide p4, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->$delayMilliseconds:J

    iput-object p6, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->$block:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->$retryCondition:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 10
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

    new-instance v9, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;

    iget v1, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->$times:I

    iget-wide v2, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->$initialDelay:J

    iget-wide v4, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->$delayMilliseconds:J

    iget-object v6, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->$block:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->$retryCondition:Lkotlin/jvm/functions/Function2;

    move-object v0, v9

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;-><init>(IJJLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v9, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$0:Ljava/lang/Object;

    return-object v9
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln74;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->invoke(Ln74;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ln74;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln74<",
            "-TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->label:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$1:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v7, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$0:Ljava/lang/Object;

    check-cast v7, Ln74;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v9, v1

    move-object v1, v0

    move-object v0, p0

    goto/16 :goto_7

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$1:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$0:Ljava/lang/Object;

    check-cast v6, Ln74;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v7, v6

    move-object v6, v1

    move-object v1, v0

    move-object v0, p0

    goto/16 :goto_6

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$1:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$0:Ljava/lang/Object;

    check-cast v6, Ln74;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v7, v6

    move-object v6, v1

    move-object v1, v0

    move-object v0, p0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    move-object v7, v6

    move-object v6, v1

    move-object v1, v0

    move-object v0, p0

    goto/16 :goto_4

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$1:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$0:Ljava/lang/Object;

    check-cast v6, Ln74;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p1, p0

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$0:Ljava/lang/Object;

    check-cast p1, Ln74;

    new-instance v1, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    iget v6, p0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->$times:I

    sub-int/2addr v6, v5

    iput v6, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    move-object v6, p0

    :goto_0
    invoke-interface {p1}, Lys5;->A()Z

    move-result v7

    if-nez v7, :cond_d

    iget v7, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget v8, v6, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->$times:I

    sub-int/2addr v8, v5

    if-ne v7, v8, :cond_5

    iget-wide v7, v6, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->$initialDelay:J

    goto :goto_1

    :cond_5
    iget-wide v7, v6, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->$delayMilliseconds:J

    :goto_1
    iput-object p1, v6, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$0:Ljava/lang/Object;

    iput-object v1, v6, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$1:Ljava/lang/Object;

    const/4 v9, 0x0

    iput-object v9, v6, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$2:Ljava/lang/Object;

    iput v5, v6, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->label:I

    invoke-static {v7, v8, v6}, LrZ0;->a(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_6

    return-object v0

    :cond_6
    move-object v10, v6

    move-object v6, p1

    move-object p1, v10

    :goto_2
    iget-object v7, p1, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->$block:Lkotlin/jvm/functions/Function1;

    :try_start_1
    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iput-object v6, p1, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$0:Ljava/lang/Object;

    iput-object v1, p1, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$1:Ljava/lang/Object;

    iput v4, p1, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->label:I

    invoke-interface {v7, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-ne v7, v0, :cond_7

    return-object v0

    :cond_7
    move-object v10, v0

    move-object v0, p1

    move-object p1, v7

    move-object v7, v6

    move-object v6, v1

    move-object v1, v10

    :goto_3
    :try_start_2
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception p1

    goto :goto_4

    :catchall_2
    move-exception v7

    move-object v10, v0

    move-object v0, p1

    move-object p1, v7

    move-object v7, v6

    move-object v6, v1

    move-object v1, v10

    :goto_4
    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_5
    iget-object v8, v0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->$retryCondition:Lkotlin/jvm/functions/Function2;

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v9

    if-nez v9, :cond_9

    iput-object v7, v0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->label:I

    invoke-interface {v7, p1, v0}, Lys5;->M(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_6
    move-object p1, v7

    move-object v10, v6

    move-object v6, v0

    move-object v0, v1

    move-object v1, v10

    goto :goto_8

    :cond_9
    iget p1, v6, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-eqz p1, :cond_c

    iput-object v7, v0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$1:Ljava/lang/Object;

    iput-object v9, v0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->L$2:Ljava/lang/Object;

    iput v2, v0, Lcom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2;->label:I

    invoke-interface {v8, v9, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    return-object v1

    :cond_a
    :goto_7
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_b

    goto :goto_6

    :goto_8
    iget v7, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/lit8 v7, v7, -0x1

    iput v7, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    goto/16 :goto_0

    :cond_b
    throw v9

    :cond_c
    new-instance p1, Ljava/util/concurrent/TimeoutException;

    const-string v0, "reached max number of retries"

    invoke-direct {p1, v0}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
