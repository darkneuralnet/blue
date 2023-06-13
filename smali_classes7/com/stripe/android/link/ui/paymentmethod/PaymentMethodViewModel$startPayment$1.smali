.class final Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->startPayment(Ljava/util/Map;)V
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
    c = "com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$startPayment$1"
    f = "PaymentMethodViewModel.kt"
    i = {}
    l = {
        0x7c,
        0x81
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;->this$0:Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;

    iput-object p2, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;->$paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

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

    new-instance p1, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;->this$0:Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;

    iget-object v1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;->$paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;-><init>(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;->this$0:Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;

    invoke-static {p1}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->access$getLinkAccountManager$p(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;->$paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    iget-object v4, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;->this$0:Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->getLinkAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;->this$0:Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;

    invoke-virtual {v5}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->getArgs()Lcom/stripe/android/link/LinkActivityContract$Args;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/link/LinkActivityContract$Args;->getStripeIntent$link_release()Lcom/stripe/android/model/StripeIntent;

    move-result-object v5

    iput v3, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;->label:I

    invoke-virtual {p1, v1, v4, v5, p0}, Lcom/stripe/android/link/account/LinkAccountManager;->createCardPaymentDetails-BWLJW6A(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;->this$0:Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_4

    check-cast p1, Lcom/stripe/android/link/LinkPaymentDetails$New;

    iput v2, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;->label:I

    invoke-static {v1, p1, p0}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->access$completePayment(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;Lcom/stripe/android/link/LinkPaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_4
    invoke-static {v1, v3}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->access$onError(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;Ljava/lang/Throwable;)V

    :cond_5
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
