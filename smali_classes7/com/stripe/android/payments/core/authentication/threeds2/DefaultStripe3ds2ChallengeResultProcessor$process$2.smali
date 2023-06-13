.class final Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->process(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "LZC0;",
        "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
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
    c = "com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor$process$2"
    f = "Stripe3ds2ChallengeResultProcessor.kt"
    i = {
        0x0
    }
    l = {
        0x5f
    }
    m = "invokeSuspend"
    n = {
        "requestOptions"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;


# direct methods
.method public constructor <init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;",
            "Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    iput-object p2, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance p1, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;-><init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;Lkotlin/coroutines/Continuation;)V

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
            "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    instance-of v1, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Succeeded;

    if-eqz v1, :cond_2

    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {p1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v1

    sget-object v3, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeCompleted:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    check-cast v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Succeeded;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Succeeded;->getUiTypeCode()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->create3ds2Challenge$payments_core_release(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    goto/16 :goto_0

    :cond_2
    instance-of v1, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Failed;

    if-eqz v1, :cond_3

    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {p1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v1

    sget-object v3, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeCompleted:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    check-cast v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Failed;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Failed;->getUiTypeCode()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->create3ds2Challenge$payments_core_release(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    goto/16 :goto_0

    :cond_3
    instance-of v1, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Canceled;

    if-eqz v1, :cond_4

    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {p1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v1

    sget-object v3, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeCanceled:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    check-cast v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Canceled;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Canceled;->getUiTypeCode()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->create3ds2Challenge$payments_core_release(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    goto :goto_0

    :cond_4
    instance-of v1, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$ProtocolError;

    if-eqz v1, :cond_5

    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {p1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeErrored:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x1e

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    goto :goto_0

    :cond_5
    instance-of v1, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;

    if-eqz v1, :cond_6

    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {p1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeErrored:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x1e

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    goto :goto_0

    :cond_6
    instance-of p1, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {p1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v1

    sget-object v3, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeTimedOut:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    check-cast v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;->getUiTypeCode()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->create3ds2Challenge$payments_core_release(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    :cond_7
    :goto_0
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {p1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v1

    sget-object v3, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengePresented:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;->getInitialUiType()Lcom/stripe/android/stripe3ds2/transactions/UiType;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transactions/UiType;->getCode()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_8
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_9

    const-string v4, ""

    :cond_9
    invoke-virtual {v1, v3, v4}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->create3ds2Challenge$payments_core_release(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    new-instance p1, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;->getIntentData()Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transaction/IntentData;->getPublishableKey()Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;->getIntentData()Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/transaction/IntentData;->getAccountId()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v3, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;

    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    const/4 v6, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->label:I

    move-object v5, p1

    move-object v7, p0

    invoke-static/range {v3 .. v9}, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;->complete3ds2Auth$default(Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lcom/stripe/android/core/networking/ApiRequest$Options;ILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_a

    return-object v0

    :cond_a
    move-object v0, p1

    move-object p1, v1

    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v1, 0x2

    if-eqz p1, :cond_11

    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    instance-of v3, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Succeeded;

    if-eqz v3, :cond_b

    goto :goto_4

    :cond_b
    instance-of v2, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Failed;

    if-eqz v2, :cond_c

    goto :goto_3

    :cond_c
    instance-of v2, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Canceled;

    if-eqz v2, :cond_d

    const/4 v2, 0x3

    goto :goto_4

    :cond_d
    instance-of v2, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$ProtocolError;

    if-eqz v2, :cond_e

    goto :goto_3

    :cond_e
    instance-of v2, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;

    if-eqz v2, :cond_f

    goto :goto_3

    :cond_f
    instance-of p1, p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;

    if-eqz p1, :cond_10

    const/4 v2, 0x4

    goto :goto_4

    :cond_10
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_11
    :goto_3
    move v2, v1

    :goto_4
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$process$2;->$challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;->getIntentData()Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transaction/IntentData;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getStripeAccount()Ljava/lang/String;

    move-result-object v7

    new-instance p1, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0x3c

    const/4 v9, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method
