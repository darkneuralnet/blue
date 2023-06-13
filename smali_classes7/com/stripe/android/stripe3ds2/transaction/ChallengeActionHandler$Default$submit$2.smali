.class final Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;->submit(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;",
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
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default$submit$2"
    f = "ChallengeActionHandler.kt"
    i = {}
    l = {
        0x48
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $action:Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;


# direct methods
.method public constructor <init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;",
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;->this$0:Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;->$action:Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;

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

    new-instance p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;->this$0:Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;->$action:Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;-><init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;Lkotlin/coroutines/Continuation;)V

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
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto/16 :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance v2, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    iget-object v4, v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;->this$0:Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;

    invoke-static {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;->access$getCreqData$p(Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;->getMessageVersion()Ljava/lang/String;

    move-result-object v5

    iget-object v4, v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;->this$0:Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;

    invoke-static {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;->access$getCreqData$p(Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;->getThreeDsServerTransId()Ljava/lang/String;

    move-result-object v6

    iget-object v4, v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;->this$0:Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;

    invoke-static {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;->access$getCreqData$p(Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;->getAcsTransId()Ljava/lang/String;

    move-result-object v7

    iget-object v4, v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;->this$0:Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;

    invoke-static {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;->access$getCreqData$p(Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;->getSdkTransId()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    iget-object v4, v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;->this$0:Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;

    invoke-static {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;->access$getCreqData$p(Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;->getMessageExtensions()Ljava/util/List;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x370

    const/16 v16, 0x0

    move-object v4, v2

    invoke-direct/range {v4 .. v16}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v4, v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;->$action:Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;

    instance-of v5, v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$NativeForm;

    if-eqz v5, :cond_2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    check-cast v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$NativeForm;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$NativeForm;->getUserEntry$3ds2sdk_release()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x3ef

    const/16 v16, 0x0

    move-object v4, v2

    invoke-static/range {v4 .. v16}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;->copy$default(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    move-result-object v2

    goto/16 :goto_0

    :cond_2
    instance-of v5, v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$HtmlForm;

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    check-cast v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$HtmlForm;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$HtmlForm;->getUserEntry$3ds2sdk_release()Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x3bf

    const/16 v16, 0x0

    move-object v4, v2

    invoke-static/range {v4 .. v16}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;->copy$default(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    move-result-object v2

    goto :goto_0

    :cond_3
    instance-of v5, v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Oob;

    if-eqz v5, :cond_4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v13

    const/4 v14, 0x0

    const/16 v15, 0x2ff

    const/16 v16, 0x0

    move-object v4, v2

    invoke-static/range {v4 .. v16}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;->copy$default(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    move-result-object v2

    goto :goto_0

    :cond_4
    instance-of v5, v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Resend;

    if-eqz v5, :cond_5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v14

    const/16 v15, 0x1ff

    const/16 v16, 0x0

    move-object v4, v2

    invoke-static/range {v4 .. v16}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;->copy$default(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    move-result-object v2

    goto :goto_0

    :cond_5
    instance-of v4, v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction$Cancel;

    if-eqz v4, :cond_7

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v10, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->UserSelected:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x3df

    const/16 v16, 0x0

    move-object v4, v2

    invoke-static/range {v4 .. v16}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;->copy$default(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    move-result-object v2

    :goto_0
    iget-object v4, v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;->this$0:Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;

    iput v3, v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$submit$2;->label:I

    invoke-static {v4, v2, v0}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;->access$executeChallengeRequest(Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    return-object v1

    :cond_6
    :goto_1
    return-object v2

    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
