.class final Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->load(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;",
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
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;",
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
    c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader$load$2"
    f = "PaymentSheetLoader.kt"
    i = {
        0x0,
        0x1
    }
    l = {
        0x48,
        0x4b,
        0x51
    }
    m = "invokeSuspend"
    n = {
        "$this$withContext",
        "isGooglePayReady"
    }
    s = {
        "L$0",
        "Z$0"
    }
.end annotation


# instance fields
.field final synthetic $initializationMode:Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;

.field final synthetic $paymentSheetConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

.field private synthetic L$0:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->$paymentSheetConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->$initializationMode:Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->$paymentSheetConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->$initializationMode:Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->Z$0:Z

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->L$0:Ljava/lang/Object;

    check-cast v1, LZC0;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->L$0:Ljava/lang/Object;

    check-cast p1, LZC0;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->$paymentSheetConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->L$0:Ljava/lang/Object;

    iput v4, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->label:I

    invoke-static {v1, v6, p0}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->access$isGooglePayReady(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->$initializationMode:Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->$paymentSheetConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    :try_start_1
    sget-object v7, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iput-object v5, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->L$0:Ljava/lang/Object;

    iput-boolean v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->Z$0:Z

    iput v3, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->label:I

    invoke-static {p1, v4, v6, p0}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->access$retrieveElementsSession(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    check-cast p1, Lcom/stripe/android/model/StripeIntent;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_2
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_3
    move v10, v1

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;

    iget-object v9, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->$paymentSheetConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_8

    move-object v7, p1

    check-cast v7, Lcom/stripe/android/model/StripeIntent;

    if-eqz v9, :cond_6

    invoke-virtual {v9}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getCustomer()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object p1

    move-object v8, p1

    goto :goto_4

    :cond_6
    move-object v8, v5

    :goto_4
    iput-object v5, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$load$2;->label:I

    move-object v11, p0

    invoke-static/range {v6 .. v11}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->access$create(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_5
    check-cast p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;

    goto :goto_6

    :cond_8
    invoke-static {v6}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->access$getLogger$p(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;)Lcom/stripe/android/core/Logger;

    move-result-object p1

    const-string v0, "Failure initializing FlowController"

    invoke-interface {p1, v0, v1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Failure;

    invoke-direct {p1, v1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Failure;-><init>(Ljava/lang/Throwable;)V

    :goto_6
    return-object p1
.end method
