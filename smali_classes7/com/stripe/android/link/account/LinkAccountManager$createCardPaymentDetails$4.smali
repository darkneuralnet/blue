.class final Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/account/LinkAccountManager;->createCardPaymentDetails-BWLJW6A(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/String;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Result<",
        "+",
        "Lcom/stripe/android/link/LinkPaymentDetails$New;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"
    }
    d2 = {
        "",
        "clientSecret",
        "Lkotlin/Result;",
        "Lcom/stripe/android/link/LinkPaymentDetails$New;",
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
    c = "com.stripe.android.link.account.LinkAccountManager$createCardPaymentDetails$4"
    f = "LinkAccountManager.kt"
    i = {}
    l = {
        0x10c
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

.field final synthetic $stripeIntent:Lcom/stripe/android/model/StripeIntent;

.field final synthetic $userEmail:Ljava/lang/String;

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/link/account/LinkAccountManager;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->this$0:Lcom/stripe/android/link/account/LinkAccountManager;

    iput-object p2, p0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->$paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    iput-object p3, p0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->$userEmail:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->$stripeIntent:Lcom/stripe/android/model/StripeIntent;

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

    new-instance v6, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;

    iget-object v1, p0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->this$0:Lcom/stripe/android/link/account/LinkAccountManager;

    iget-object v2, p0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->$paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    iget-object v3, p0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->$userEmail:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->$stripeIntent:Lcom/stripe/android/model/StripeIntent;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;-><init>(Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v6, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->L$0:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/link/LinkPaymentDetails$New;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->L$0:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Ljava/lang/String;

    iget-object p1, p0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->this$0:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-static {p1}, Lcom/stripe/android/link/account/LinkAccountManager;->access$getLinkRepository$p(Lcom/stripe/android/link/account/LinkAccountManager;)Lcom/stripe/android/link/repositories/LinkRepository;

    move-result-object v3

    iget-object v4, p0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->$paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    iget-object v5, p0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->$userEmail:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->$stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iget-object p1, p0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->this$0:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAccountManager;->getConsumerPublishableKey()Ljava/lang/String;

    move-result-object v8

    iput v2, p0, Lcom/stripe/android/link/account/LinkAccountManager$createCardPaymentDetails$4;->label:I

    move-object v9, p0

    invoke-interface/range {v3 .. v9}, Lcom/stripe/android/link/repositories/LinkRepository;->createCardPaymentDetails-hUnOzRk(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    return-object p1
.end method
