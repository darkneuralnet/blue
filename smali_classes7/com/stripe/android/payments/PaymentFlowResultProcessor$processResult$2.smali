.class final Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/payments/PaymentFlowResultProcessor;->processResult(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "-TS;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00028\u0001\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000\"\u0010\u0008\u0001\u0010\u0003 \u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u0002*\u00020\u0004H\u008a@"
    }
    d2 = {
        "Lcom/stripe/android/model/StripeIntent;",
        "T",
        "Lcom/stripe/android/StripeIntentResult;",
        "S",
        "LZC0;",
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
    c = "com.stripe.android.payments.PaymentFlowResultProcessor$processResult$2"
    f = "PaymentFlowResultProcessor.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x2
    }
    l = {
        0x37,
        0x47,
        0x5f
    }
    m = "invokeSuspend"
    n = {
        "result",
        "requestOptions",
        "result",
        "result"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPaymentFlowResultProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentFlowResultProcessor.kt\ncom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,414:1\n1#2:415\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $unvalidatedResult:Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/payments/PaymentFlowResultProcessor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/payments/PaymentFlowResultProcessor<",
            "TT;TS;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
            "Lcom/stripe/android/payments/PaymentFlowResultProcessor<",
            "TT;+TS;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->$unvalidatedResult:Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    iput-object p2, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->this$0:Lcom/stripe/android/payments/PaymentFlowResultProcessor;

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

    new-instance p1, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;

    iget-object v0, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->$unvalidatedResult:Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    iget-object v1, p0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->this$0:Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;-><init>(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-TS;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->label:I

    const-string v3, "Required value was null."

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v1, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    iget-object v2, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/payments/PaymentFlowResult$Validated;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto/16 :goto_5

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v1, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    iget-object v2, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/payments/PaymentFlowResult$Validated;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto/16 :goto_1

    :cond_2
    iget-object v2, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v7, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/payments/PaymentFlowResult$Validated;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v13, v2

    move-object v2, v7

    move-object/from16 v7, p1

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->$unvalidatedResult:Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;

    invoke-virtual {v2}, Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;->validate$payments_core_release()Lcom/stripe/android/payments/PaymentFlowResult$Validated;

    move-result-object v2

    new-instance v13, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v7, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->this$0:Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    invoke-static {v7}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->access$getPublishableKeyProvider$p(Lcom/stripe/android/payments/PaymentFlowResultProcessor;)LY94;

    move-result-object v7

    invoke-interface {v7}, LY94;->get()Ljava/lang/Object;

    move-result-object v7

    const-string v8, "publishableKeyProvider.get()"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v2}, Lcom/stripe/android/payments/PaymentFlowResult$Validated;->getStripeAccountId$payments_core_release()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v13

    invoke-direct/range {v7 .. v12}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v7, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->this$0:Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    invoke-virtual {v2}, Lcom/stripe/android/payments/PaymentFlowResult$Validated;->getClientSecret()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->Companion:Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;

    invoke-virtual {v9}, Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;->getEXPAND_PAYMENT_METHOD()Ljava/util/List;

    move-result-object v9

    iput-object v2, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->L$0:Ljava/lang/Object;

    iput-object v13, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->L$1:Ljava/lang/Object;

    iput v6, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->label:I

    invoke-virtual {v7, v8, v13, v9, v0}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->retrieveStripeIntent(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_4

    return-object v1

    :cond_4
    :goto_0
    if-eqz v7, :cond_12

    iget-object v8, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->this$0:Lcom/stripe/android/payments/PaymentFlowResultProcessor;

    check-cast v7, Lcom/stripe/android/model/StripeIntent;

    invoke-interface {v7}, Lcom/stripe/android/model/StripeIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v9

    sget-object v10, Lcom/stripe/android/model/StripeIntent$Status;->Succeeded:Lcom/stripe/android/model/StripeIntent$Status;

    if-eq v9, v10, :cond_11

    invoke-interface {v7}, Lcom/stripe/android/model/StripeIntent;->getStatus()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v9

    sget-object v10, Lcom/stripe/android/model/StripeIntent$Status;->RequiresCapture:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne v9, v10, :cond_5

    goto/16 :goto_6

    :cond_5
    invoke-virtual {v2}, Lcom/stripe/android/payments/PaymentFlowResult$Validated;->getFlowOutcome$payments_core_release()I

    move-result v6

    invoke-static {v8, v7, v6}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->access$shouldRefreshIntent(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lcom/stripe/android/model/StripeIntent;I)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {v2}, Lcom/stripe/android/payments/PaymentFlowResult$Validated;->getClientSecret()Ljava/lang/String;

    move-result-object v3

    iput-object v2, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->L$1:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->label:I

    invoke-static {v8, v7, v3, v13, v0}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->access$refreshStripeIntentUntilTerminalState(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_6

    return-object v1

    :cond_6
    move-object v1, v8

    :goto_1
    check-cast v3, Lcom/stripe/android/model/StripeIntent;

    invoke-virtual {v2}, Lcom/stripe/android/payments/PaymentFlowResult$Validated;->getFlowOutcome$payments_core_release()I

    move-result v4

    invoke-static {v1, v3, v4}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->access$determineFlowOutcome(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lcom/stripe/android/model/StripeIntent;I)I

    move-result v4

    invoke-static {v1}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->access$getFailureMessageFactory$p(Lcom/stripe/android/payments/PaymentFlowResultProcessor;)Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;

    move-result-object v5

    invoke-virtual {v2}, Lcom/stripe/android/payments/PaymentFlowResult$Validated;->getFlowOutcome$payments_core_release()I

    move-result v2

    invoke-virtual {v5, v3, v2}, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;->create(Lcom/stripe/android/model/StripeIntent;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v4, v2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->createStripeIntentResult(Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;)Lcom/stripe/android/StripeIntentResult;

    move-result-object v1

    goto/16 :goto_7

    :cond_7
    invoke-virtual {v2}, Lcom/stripe/android/payments/PaymentFlowResult$Validated;->getCanCancelSource$payments_core_release()Z

    move-result v5

    invoke-static {v8, v7, v5}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->access$shouldCancelIntentSource(Lcom/stripe/android/payments/PaymentFlowResultProcessor;Lcom/stripe/android/model/StripeIntent;Z)Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-virtual {v2}, Lcom/stripe/android/payments/PaymentFlowResult$Validated;->getSourceId$payments_core_release()Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    if-nez v5, :cond_8

    move-object v5, v6

    :cond_8
    invoke-static {v8}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->access$getLogger$p(Lcom/stripe/android/payments/PaymentFlowResultProcessor;)Lcom/stripe/android/core/Logger;

    move-result-object v9

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Canceling source \'"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "\' for \'"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "\'"

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v10}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    invoke-interface {v7}, Lcom/stripe/android/model/StripeIntent;->getNextActionData()Lcom/stripe/android/model/StripeIntent$NextActionData;

    move-result-object v9

    instance-of v10, v9, Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;

    if-eqz v10, :cond_9

    check-cast v9, Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;

    goto :goto_2

    :cond_9
    const/4 v9, 0x0

    :goto_2
    if-eqz v9, :cond_b

    invoke-virtual {v9}, Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;->getThreeDS2IntentId()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_a

    goto :goto_3

    :cond_a
    move-object v6, v10

    goto :goto_4

    :cond_b
    :goto_3
    invoke-interface {v7}, Lcom/stripe/android/model/StripeIntent;->getId()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_c

    goto :goto_4

    :cond_c
    move-object v6, v7

    :goto_4
    if-eqz v9, :cond_d

    invoke-virtual {v9}, Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;->getPublishableKey()Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_d

    new-instance v13, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x6

    const/16 v19, 0x0

    move-object v14, v13

    invoke-direct/range {v14 .. v19}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_d
    iput-object v2, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/payments/PaymentFlowResultProcessor$processResult$2;->label:I

    invoke-virtual {v8, v6, v13, v5, v0}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->cancelStripeIntentSource(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_e

    return-object v1

    :cond_e
    move-object v1, v8

    :goto_5
    if-eqz v4, :cond_f

    check-cast v4, Lcom/stripe/android/model/StripeIntent;

    invoke-virtual {v2}, Lcom/stripe/android/payments/PaymentFlowResult$Validated;->getFlowOutcome$payments_core_release()I

    move-result v3

    invoke-static {v1}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->access$getFailureMessageFactory$p(Lcom/stripe/android/payments/PaymentFlowResultProcessor;)Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;

    move-result-object v5

    invoke-virtual {v2}, Lcom/stripe/android/payments/PaymentFlowResult$Validated;->getFlowOutcome$payments_core_release()I

    move-result v2

    invoke-virtual {v5, v4, v2}, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;->create(Lcom/stripe/android/model/StripeIntent;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v4, v3, v2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->createStripeIntentResult(Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;)Lcom/stripe/android/StripeIntentResult;

    move-result-object v1

    goto :goto_7

    :cond_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    invoke-virtual {v2}, Lcom/stripe/android/payments/PaymentFlowResult$Validated;->getFlowOutcome$payments_core_release()I

    move-result v1

    invoke-static {v8}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->access$getFailureMessageFactory$p(Lcom/stripe/android/payments/PaymentFlowResultProcessor;)Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;

    move-result-object v3

    invoke-virtual {v2}, Lcom/stripe/android/payments/PaymentFlowResult$Validated;->getFlowOutcome$payments_core_release()I

    move-result v2

    invoke-virtual {v3, v7, v2}, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;->create(Lcom/stripe/android/model/StripeIntent;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v7, v1, v2}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->createStripeIntentResult(Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;)Lcom/stripe/android/StripeIntentResult;

    move-result-object v1

    goto :goto_7

    :cond_11
    :goto_6
    invoke-static {v8}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->access$getFailureMessageFactory$p(Lcom/stripe/android/payments/PaymentFlowResultProcessor;)Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/payments/PaymentFlowResult$Validated;->getFlowOutcome$payments_core_release()I

    move-result v2

    invoke-virtual {v1, v7, v2}, Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;->create(Lcom/stripe/android/model/StripeIntent;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v7, v6, v1}, Lcom/stripe/android/payments/PaymentFlowResultProcessor;->createStripeIntentResult(Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;)Lcom/stripe/android/StripeIntentResult;

    move-result-object v1

    :goto_7
    return-object v1

    :cond_12
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
