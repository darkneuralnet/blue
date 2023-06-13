.class final Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->updateCard(Ljava/util/Map;)V
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
    c = "com.stripe.android.link.ui.cardedit.CardEditViewModel$updateCard$1"
    f = "CardEditViewModel.kt"
    i = {}
    l = {
        0x74
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCardEditViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardEditViewModel.kt\ncom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;->this$0:Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;

    iput-object p2, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;->$paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

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

    new-instance p1, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;->this$0:Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;

    iget-object v1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;->$paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;-><init>(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;->this$0:Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->getPaymentDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;->this$0:Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->getSetAsDefault()LtP5;

    move-result-object v1

    invoke-interface {v1}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    iget-object v4, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;->this$0:Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;

    move-object v5, v1

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->isDefault()Z

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->isDefault()Z

    move-result v4

    if-ne v5, v4, :cond_2

    goto :goto_0

    :cond_2
    move v4, v2

    goto :goto_1

    :cond_3
    :goto_0
    move v4, v3

    :goto_1
    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    :goto_2
    check-cast v1, Ljava/lang/Boolean;

    iget-object v4, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;->$paymentMethodCreateParams:Lcom/stripe/android/model/PaymentMethodCreateParams;

    new-instance v5, Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;

    invoke-direct {v5, p1, v1, v4}, Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/model/PaymentMethodCreateParams;)V

    iget-object p1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;->this$0:Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;

    invoke-static {p1}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->access$getLinkAccountManager$p(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object p1

    iput v3, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;->label:I

    invoke-virtual {p1, v5, p0}, Lcom/stripe/android/link/account/LinkAccountManager;->updatePaymentDetails-gIAlu-s(Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_3
    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;->this$0:Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_6

    check-cast p1, Lcom/stripe/android/model/ConsumerPaymentDetails;

    invoke-static {v0}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->access$get_isProcessing$p(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;)LGX2;

    move-result-object p1

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    new-instance p1, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Success;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->getPaymentDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Success;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1, v2}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->dismiss(Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;Z)V

    goto :goto_4

    :cond_6
    invoke-static {v0, v1}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->access$onError(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;Ljava/lang/Throwable;)V

    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
