.class final Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;->startChallengeFlow$payments_core_release(Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;Lcom/stripe/android/stripe3ds2/transaction/Transaction;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartChallenge;",
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
        "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartChallenge;",
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
    c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$startChallengeFlow$2"
    f = "Stripe3ds2TransactionViewModel.kt"
    i = {}
    l = {
        0x10b
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $ares:Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;

.field final synthetic $maxTimeout:I

.field final synthetic $sourceId:Ljava/lang/String;

.field final synthetic $transaction:Lcom/stripe/android/stripe3ds2/transaction/Transaction;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;Lcom/stripe/android/stripe3ds2/transaction/Transaction;ILcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;",
            "Lcom/stripe/android/stripe3ds2/transaction/Transaction;",
            "I",
            "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->$ares:Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;

    iput-object p2, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->$transaction:Lcom/stripe/android/stripe3ds2/transaction/Transaction;

    iput p3, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->$maxTimeout:I

    iput-object p4, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;

    iput-object p5, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->$sourceId:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance p1, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->$ares:Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;

    iget-object v2, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->$transaction:Lcom/stripe/android/stripe3ds2/transaction/Transaction;

    iget v3, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->$maxTimeout:I

    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;

    iget-object v5, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->$sourceId:Ljava/lang/String;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;-><init>(Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;Lcom/stripe/android/stripe3ds2/transaction/Transaction;ILcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

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
            "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartChallenge;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    sget-object p1, Lcom/stripe/android/StripePaymentController;->Companion:Lcom/stripe/android/StripePaymentController$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/StripePaymentController$Companion;->getCHALLENGE_DELAY$payments_core_release()J

    move-result-wide v3

    iput v2, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->label:I

    invoke-static {v3, v4, p0}, LrZ0;->a(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->$ares:Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;

    invoke-virtual {p1}, Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;->getAcsSignedContent$payments_core_release()Ljava/lang/String;

    move-result-object v4

    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->$ares:Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;

    invoke-virtual {p1}, Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;->getThreeDSServerTransId$payments_core_release()Ljava/lang/String;

    move-result-object v1

    iget-object p1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->$ares:Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;

    invoke-virtual {p1}, Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;->getAcsTransId$payments_core_release()Ljava/lang/String;

    move-result-object v2

    new-instance p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x14

    const/4 v7, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartChallenge;

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->$transaction:Lcom/stripe/android/stripe3ds2/transaction/Transaction;

    iget v2, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->$maxTimeout:I

    new-instance v3, Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;

    invoke-static {v4}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;->access$getArgs$p(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;)Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v4

    invoke-interface {v4}, Lcom/stripe/android/model/StripeIntent;->getClientSecret()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    const-string v4, ""

    :cond_3
    iget-object v5, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->$sourceId:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;

    invoke-virtual {v6}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;->getThreeDS2RequestOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKey()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$startChallengeFlow$2;->this$0:Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;

    invoke-virtual {v7}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;->getThreeDS2RequestOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getStripeAccount()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/stripe/android/stripe3ds2/transaction/IntentData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, p1, v2, v3}, Lcom/stripe/android/stripe3ds2/transaction/Transaction;->createInitChallengeArgs(Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;ILcom/stripe/android/stripe3ds2/transaction/IntentData;)Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartChallenge;-><init>(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;)V

    return-object v0
.end method
