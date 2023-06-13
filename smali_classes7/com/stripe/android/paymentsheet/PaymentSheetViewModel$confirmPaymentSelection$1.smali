.class final Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->confirmPaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
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
    c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$confirmPaymentSelection$1"
    f = "PaymentSheetViewModel.kt"
    i = {
        0x0
    }
    l = {
        0x1b7
    }
    m = "invokeSuspend"
    n = {
        "stripeIntent"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->$paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

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

    new-instance p1, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->$paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/coroutines/Continuation;)V

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/model/StripeIntent;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getStripeIntent$paymentsheet_release()LtP5;

    move-result-object p1

    invoke-interface {p1}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_8

    check-cast p1, Lcom/stripe/android/model/StripeIntent;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->access$getIntentConfirmationInterceptor$p(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;)Lcom/stripe/android/IntentConfirmationInterceptor;

    move-result-object v1

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getClientSecret()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->$paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->getArgs$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-static {v5}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetailsKt;->toConfirmPaymentIntentShipping(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;

    move-result-object v5

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_0
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->label:I

    invoke-static {v1, v3, v4, v5, p0}, Lcom/stripe/android/paymentsheet/IntentConfirmationInterceptorKtxKt;->intercept(Lcom/stripe/android/IntentConfirmationInterceptor;Ljava/lang/String;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v0, p1

    move-object p1, v1

    :goto_1
    check-cast p1, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep;

    instance-of v1, p1, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$HandleNextAction;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    check-cast p1, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$HandleNextAction;

    invoke-virtual {p1}, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$HandleNextAction;->getClientSecret()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->access$handleNextAction(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)V

    goto :goto_2

    :cond_4
    instance-of v1, p1, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;

    if-eqz v1, :cond_5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    check-cast p1, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;

    invoke-virtual {p1}, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;->getConfirmParams()Lcom/stripe/android/model/ConfirmStripeIntentParams;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->confirmStripeIntent(Lcom/stripe/android/model/ConfirmStripeIntentParams;)V

    goto :goto_2

    :cond_5
    instance-of v1, p1, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;

    if-eqz v1, :cond_6

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    check-cast p1, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;

    invoke-virtual {p1}, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->onError(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    instance-of p1, p1, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Complete;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$confirmPaymentSelection$1;->this$0:Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    sget-object v1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;->INSTANCE:Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;

    invoke-static {p1, v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;->access$processPayment(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    :cond_7
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
