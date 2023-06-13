.class final Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/IssuingCardPinService;->fireUpdatePinRequest(Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;)V
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "LZC0;",
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
    c = "com.stripe.android.IssuingCardPinService$fireUpdatePinRequest$1"
    f = "IssuingCardPinService.kt"
    i = {}
    l = {
        0xea,
        0xf6,
        0xfb
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $ephemeralKey:Lcom/stripe/android/EphemeralKey;

.field final synthetic $listener:Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;

.field final synthetic $operation:Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/IssuingCardPinService;


# direct methods
.method public constructor <init>(Lcom/stripe/android/IssuingCardPinService;Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/IssuingCardPinService;",
            "Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;",
            "Lcom/stripe/android/EphemeralKey;",
            "Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->this$0:Lcom/stripe/android/IssuingCardPinService;

    iput-object p2, p0, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->$operation:Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;

    iput-object p3, p0, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->$ephemeralKey:Lcom/stripe/android/EphemeralKey;

    iput-object p4, p0, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->$listener:Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance v6, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;

    iget-object v1, p0, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->this$0:Lcom/stripe/android/IssuingCardPinService;

    iget-object v2, p0, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->$operation:Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;

    iget-object v3, p0, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->$ephemeralKey:Lcom/stripe/android/EphemeralKey;

    iget-object v4, p0, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->$listener:Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;-><init>(Lcom/stripe/android/IssuingCardPinService;Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v6, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->L$0:Ljava/lang/Object;

    return-object v6
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v8, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v9

    iget v0, v8, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->label:I

    const/4 v10, 0x3

    const/4 v11, 0x2

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v11, :cond_1

    if-ne v0, v10, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v0, v8, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->L$0:Ljava/lang/Object;

    check-cast v0, LZC0;

    iget-object v0, v8, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->this$0:Lcom/stripe/android/IssuingCardPinService;

    iget-object v2, v8, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->$operation:Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;

    iget-object v3, v8, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->$ephemeralKey:Lcom/stripe/android/EphemeralKey;

    :try_start_1
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lcom/stripe/android/IssuingCardPinService;->access$getStripeRepository$p(Lcom/stripe/android/IssuingCardPinService;)Lcom/stripe/android/networking/StripeRepository;

    move-result-object v4

    invoke-virtual {v2}, Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;->getCardId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;->getNewPin()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;->getVerificationId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;->getUserOneTimeCode()Ljava/lang/String;

    move-result-object v12

    new-instance v19, Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-virtual {v3}, Lcom/stripe/android/EphemeralKey;->getSecret()Ljava/lang/String;

    move-result-object v14

    invoke-static {v0}, Lcom/stripe/android/IssuingCardPinService;->access$getStripeAccountId$p(Lcom/stripe/android/IssuingCardPinService;)Ljava/lang/String;

    move-result-object v15

    const/16 v16, 0x0

    const/16 v17, 0x4

    const/16 v18, 0x0

    move-object/from16 v13, v19

    invoke-direct/range {v13 .. v18}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput v1, v8, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->label:I

    move-object v1, v4

    move-object v2, v5

    move-object v3, v6

    move-object v4, v7

    move-object v5, v12

    move-object/from16 v6, v19

    move-object/from16 v7, p0

    invoke-virtual/range {v1 .. v7}, Lcom/stripe/android/networking/StripeRepository;->updateIssuingCardPin$payments_core_release(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_4

    return-object v9

    :cond_4
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    iget-object v1, v8, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->$listener:Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;

    iget-object v2, v8, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->this$0:Lcom/stripe/android/IssuingCardPinService;

    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_5

    check-cast v0, Lkotlin/Unit;

    invoke-static {}, LT41;->c()LpG2;

    move-result-object v0

    new-instance v2, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1$2$1;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1$2$1;-><init>(Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;Lkotlin/coroutines/Continuation;)V

    iput v11, v8, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->label:I

    invoke-static {v0, v2, v8}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    return-object v9

    :cond_5
    iput v10, v8, Lcom/stripe/android/IssuingCardPinService$fireUpdatePinRequest$1;->label:I

    invoke-static {v2, v3, v1, v8}, Lcom/stripe/android/IssuingCardPinService;->access$onUpdatePinError(Lcom/stripe/android/IssuingCardPinService;Ljava/lang/Throwable;Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    return-object v9

    :cond_6
    :goto_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
