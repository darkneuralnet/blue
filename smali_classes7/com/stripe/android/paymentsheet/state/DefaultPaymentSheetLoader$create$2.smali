.class final Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->create(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Success;",
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
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Success;",
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
    c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader$create$2"
    f = "PaymentSheetLoader.kt"
    i = {
        0x0,
        0x0,
        0x1
    }
    l = {
        0x9a,
        0x9b,
        0x9d
    }
    m = "invokeSuspend"
    n = {
        "savedSelection",
        "linkState",
        "linkState"
    }
    s = {
        "L$0",
        "L$1",
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

.field final synthetic $customerConfig:Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

.field final synthetic $isGooglePayReady:Z

.field final synthetic $stripeIntent:Lcom/stripe/android/model/StripeIntent;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$customerConfig:Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    iput-boolean p5, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$isGooglePayReady:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance v7, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$customerConfig:Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$isGooglePayReady:Z

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLkotlin/coroutines/Continuation;)V

    iput-object p1, v7, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$0:Ljava/lang/Object;

    return-object v7
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Success;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-boolean v1, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->Z$0:Z

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$3:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/paymentsheet/model/SavedSelection;

    iget-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/model/StripeIntent;

    iget-object v5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v6, p1

    move v12, v1

    move-object v11, v2

    move-object v10, v3

    move-object v9, v4

    move-object v8, v5

    goto/16 :goto_3

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$3:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$2:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/model/StripeIntent;

    iget-object v5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$1:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$0:Ljava/lang/Object;

    check-cast v6, LhZ0;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, v2

    move-object v2, v4

    move-object/from16 v4, p1

    goto/16 :goto_2

    :cond_2
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$3:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/model/StripeIntent;

    iget-object v5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$2:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$1:Ljava/lang/Object;

    check-cast v6, LhZ0;

    iget-object v7, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$0:Ljava/lang/Object;

    check-cast v7, LhZ0;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto/16 :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$0:Ljava/lang/Object;

    check-cast v2, LZC0;

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;

    invoke-static {v6}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;->access$getPrefsRepositoryFactory$p(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;)Lkotlin/jvm/functions/Function1;

    move-result-object v6

    iget-object v7, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$customerConfig:Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    invoke-interface {v6, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v12, v6

    check-cast v12, Lcom/stripe/android/paymentsheet/PrefsRepository;

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-interface {v6}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v6

    sget-object v7, Lcom/stripe/android/model/PaymentMethod$Type;->Link:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v7, v7, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-interface {v6, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-interface {v6}, Lcom/stripe/android/model/StripeIntent;->getLinkFundingSources()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    sget-object v7, Lcom/stripe/android/link/LinkPaymentLauncher;->Companion:Lcom/stripe/android/link/LinkPaymentLauncher$Companion;

    invoke-virtual {v7}, Lcom/stripe/android/link/LinkPaymentLauncher$Companion;->getSupportedFundingSources()Ljava/util/Set;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->intersect(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    xor-int/2addr v6, v5

    if-eqz v6, :cond_4

    move v14, v5

    goto :goto_0

    :cond_4
    const/4 v6, 0x0

    move v14, v6

    :goto_0
    const/4 v7, 0x0

    const/4 v8, 0x0

    new-instance v9, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2$paymentMethods$1;

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$customerConfig:Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    iget-object v10, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;

    iget-object v11, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iget-object v13, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    const/16 v20, 0x0

    move-object v15, v9

    move-object/from16 v16, v6

    move-object/from16 v17, v10

    move-object/from16 v18, v11

    move-object/from16 v19, v13

    invoke-direct/range {v15 .. v20}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2$paymentMethods$1;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    move-object v6, v2

    invoke-static/range {v6 .. v11}, LX30;->b(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LhZ0;

    move-result-object v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    new-instance v18, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2$savedSelection$1;

    iget-object v8, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;

    iget-boolean v10, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$isGooglePayReady:Z

    const/4 v13, 0x0

    move-object/from16 v7, v18

    move-object v9, v12

    move v11, v14

    move-object v12, v15

    invoke-direct/range {v7 .. v13}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2$savedSelection$1;-><init>(Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/paymentsheet/PrefsRepository;ZZLhZ0;Lkotlin/coroutines/Continuation;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    move-object v6, v2

    move-object/from16 v7, v16

    move-object/from16 v8, v17

    move-object/from16 v9, v18

    invoke-static/range {v6 .. v11}, LX30;->b(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LhZ0;

    move-result-object v12

    const/4 v7, 0x0

    const/4 v8, 0x0

    new-instance v9, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2$linkState$1;

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->this$0:Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;

    iget-object v10, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    iget-object v11, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$stripeIntent:Lcom/stripe/android/model/StripeIntent;

    const/16 v18, 0x0

    move-object v13, v9

    move-object v3, v15

    move-object v15, v6

    move-object/from16 v16, v10

    move-object/from16 v17, v11

    invoke-direct/range {v13 .. v18}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2$linkState$1;-><init>(ZLcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    move-object v6, v2

    invoke-static/range {v6 .. v11}, LX30;->b(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LhZ0;

    move-result-object v2

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    iget-object v7, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iput-object v12, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$3:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->label:I

    invoke-interface {v3, v0}, LhZ0;->k(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_5

    return-object v1

    :cond_5
    move-object v5, v6

    move-object v6, v2

    move-object v2, v7

    move-object v7, v12

    :goto_1
    check-cast v3, Ljava/util/List;

    iput-object v6, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$2:Ljava/lang/Object;

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$3:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->label:I

    invoke-interface {v7, v0}, LhZ0;->k(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    check-cast v4, Lcom/stripe/android/paymentsheet/model/SavedSelection;

    iget-boolean v7, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->$isGooglePayReady:Z

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$1:Ljava/lang/Object;

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->L$3:Ljava/lang/Object;

    iput-boolean v7, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->Z$0:Z

    const/4 v8, 0x3

    iput v8, v0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader$create$2;->label:I

    invoke-interface {v6, v0}, LhZ0;->k(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_7

    return-object v1

    :cond_7
    move-object v9, v2

    move-object v10, v3

    move-object v11, v4

    move-object v8, v5

    move v12, v7

    :goto_3
    move-object v13, v6

    check-cast v13, Lcom/stripe/android/paymentsheet/state/LinkState;

    const/4 v14, 0x0

    new-instance v1, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    move-object v7, v1

    invoke-direct/range {v7 .. v14}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/model/StripeIntent;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;ZLcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V

    new-instance v2, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Success;

    invoke-direct {v2, v1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Success;-><init>(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;)V

    return-object v2
.end method
