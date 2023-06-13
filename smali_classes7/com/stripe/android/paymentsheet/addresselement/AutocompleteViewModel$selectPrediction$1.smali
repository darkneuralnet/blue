.class final Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->selectPrediction(Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;)V
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
    c = "com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$selectPrediction$1"
    f = "AutocompleteViewModel.kt"
    i = {}
    l = {
        0x75
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $prediction:Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;",
            "Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;->$prediction:Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;

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

    new-instance p1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;->$prediction:Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    check-cast v1, Lkotlin/Result;

    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    invoke-static {v2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->access$get_loading$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)LGX2;

    move-result-object v2

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v2, v4}, LGX2;->setValue(Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    invoke-static {v2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->access$getPlacesClient$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;->$prediction:Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;

    invoke-virtual {v4}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;->getPlaceId()Ljava/lang/String;

    move-result-object v4

    iput v3, v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;->label:I

    invoke-interface {v2, v4, v0}, Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;->fetchPlace-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    move-object v1, v2

    :goto_0
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-nez v4, :cond_3

    check-cast v1, Lcom/stripe/android/ui/core/elements/autocomplete/model/FetchPlaceResponse;

    invoke-static {v2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->access$get_loading$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)LGX2;

    move-result-object v4

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-interface {v4, v5}, LGX2;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/FetchPlaceResponse;->getPlace()Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;

    move-result-object v1

    invoke-virtual {v2}, Lie;->getApplication()Landroid/app/Application;

    move-result-object v4

    const-string v5, "getApplication()"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lcom/stripe/android/ui/core/elements/autocomplete/model/TransformGoogleToStripeAddressKt;->transformGoogleToStripeAddress(Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;Landroid/content/Context;)Lcom/stripe/android/model/Address;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->getAddressResult()LGX2;

    move-result-object v4

    new-instance v5, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    const/4 v8, 0x0

    new-instance v16, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    invoke-virtual {v1}, Lcom/stripe/android/model/Address;->getCity()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/stripe/android/model/Address;->getCountry()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/stripe/android/model/Address;->getLine1()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/stripe/android/model/Address;->getLine2()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/stripe/android/model/Address;->getPostalCode()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lcom/stripe/android/model/Address;->getState()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v9, v16

    invoke-direct/range {v9 .. v15}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xd

    const/4 v13, 0x0

    move-object v7, v5

    invoke-direct/range {v7 .. v13}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object v1

    invoke-interface {v4, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    invoke-static {v2, v6, v3, v6}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->setResultAndGoBack$default(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ILjava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->access$get_loading$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)LGX2;

    move-result-object v1

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-interface {v1, v5}, LGX2;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->getAddressResult()LGX2;

    move-result-object v1

    invoke-static {v4}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object v4

    invoke-interface {v1, v4}, LGX2;->setValue(Ljava/lang/Object;)V

    invoke-static {v2, v6, v3, v6}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->setResultAndGoBack$default(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ILjava/lang/Object;)V

    :cond_4
    :goto_1
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method
