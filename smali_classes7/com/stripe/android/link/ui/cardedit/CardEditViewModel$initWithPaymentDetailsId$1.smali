.class final Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->initWithPaymentDetailsId(Ljava/lang/String;)V
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
    c = "com.stripe.android.link.ui.cardedit.CardEditViewModel$initWithPaymentDetailsId$1"
    f = "CardEditViewModel.kt"
    i = {}
    l = {
        0x3e
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCardEditViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardEditViewModel.kt\ncom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n800#2,11:176\n288#2,2:187\n*S KotlinDebug\n*F\n+ 1 CardEditViewModel.kt\ncom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1\n*L\n64#1:176,11\n65#1:187,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $paymentDetailsId:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;->this$0:Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;

    iput-object p2, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;->$paymentDetailsId:Ljava/lang/String;

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

    new-instance p1, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;->this$0:Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;

    iget-object v1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;->$paymentDetailsId:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;-><init>(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;->label:I

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

    iget-object p1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;->this$0:Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;

    invoke-static {p1}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->access$getLinkAccountManager$p(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object p1

    iput v2, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;->label:I

    invoke-virtual {p1, p0}, Lcom/stripe/android/link/account/LinkAccountManager;->listPaymentDetails-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;->this$0:Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;

    iget-object v1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;->$paymentDetailsId:Ljava/lang/String;

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_8

    check-cast p1, Lcom/stripe/android/model/ConsumerPaymentDetails;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails;->getPaymentDetails()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v5, :cond_3

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    invoke-virtual {v5}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_2

    :cond_6
    move-object v2, v4

    :goto_2
    check-cast v2, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v2, :cond_7

    invoke-virtual {v0, v2}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->setPaymentDetails(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->getFormController()LGX2;

    move-result-object p1

    invoke-static {v0}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->access$getFormControllerProvider$p(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;)LY94;

    move-result-object v5

    invoke-interface {v5}, LY94;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    invoke-static {}, Lcom/stripe/android/ui/core/forms/LinkCardFormKt;->getLinkCardForm()Lcom/stripe/android/ui/core/elements/LayoutSpec;

    move-result-object v6

    invoke-interface {v5, v6}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->formSpec(Lcom/stripe/android/ui/core/elements/LayoutSpec;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object v5

    invoke-static {v0, v2}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->access$buildInitialFormValues(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;Lcom/stripe/android/model/ConsumerPaymentDetails$Card;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v5, v2}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->initialValues(Ljava/util/Map;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object v2

    sget-object v5, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v5}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardNumber()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-interface {v2, v5}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->viewOnlyFields(Ljava/util/Set;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object v2

    invoke-static {v0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v5

    invoke-interface {v2, v5}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->viewModelScope(LZC0;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object v2

    invoke-static {v0}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->access$getArgs$p(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;)Lcom/stripe/android/link/LinkActivityContract$Args;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/link/LinkActivityContract$Args;->getStripeIntent$link_release()Lcom/stripe/android/model/StripeIntent;

    move-result-object v5

    invoke-interface {v2, v5}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->stripeIntent(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object v2

    invoke-interface {v2, v4}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->shippingValues(Ljava/util/Map;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object v2

    invoke-static {v0}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->access$getArgs$p(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;)Lcom/stripe/android/link/LinkActivityContract$Args;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/link/LinkActivityContract$Args;->getMerchantName$link_release()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->merchantName(Ljava/lang/String;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object v2

    invoke-interface {v2}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->build()Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent;

    move-result-object v2

    invoke-interface {v2}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent;->getFormController()Lcom/stripe/android/ui/core/FormController;

    move-result-object v2

    invoke-interface {p1, v2}, LGX2;->setValue(Ljava/lang/Object;)V

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_7
    if-nez v4, :cond_9

    new-instance p1, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Failure;

    new-instance v2, Lcom/stripe/android/link/ui/ErrorMessage$Raw;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Payment details "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " not found."

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/stripe/android/link/ui/ErrorMessage$Raw;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v2}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Failure;-><init>(Lcom/stripe/android/link/ui/ErrorMessage;)V

    invoke-virtual {v0, p1, v3}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->dismiss(Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;Z)V

    goto :goto_3

    :cond_8
    new-instance p1, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Failure;

    invoke-static {v2}, Lcom/stripe/android/link/ui/ErrorMessageKt;->getErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/link/ui/ErrorMessage;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Failure;-><init>(Lcom/stripe/android/link/ui/ErrorMessage;)V

    invoke-virtual {v0, p1, v3}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->dismiss(Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;Z)V

    :cond_9
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
