.class final Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->attachFinancialAccountToIntent(Lcom/stripe/android/paymentsheet/model/ClientSecret;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1"
    f = "USBankAccountFormViewModel.kt"
    i = {}
    l = {
        0x14d,
        0x159
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nUSBankAccountFormViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 USBankAccountFormViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,508:1\n230#2,5:509\n*S KotlinDebug\n*F\n+ 1 USBankAccountFormViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1\n*L\n394#1:509,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $bankName:Ljava/lang/String;

.field final synthetic $clientSecret:Lcom/stripe/android/paymentsheet/model/ClientSecret;

.field final synthetic $intentId:Ljava/lang/String;

.field final synthetic $last4:Ljava/lang/String;

.field final synthetic $linkAccountId:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/model/ClientSecret;",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$clientSecret:Lcom/stripe/android/paymentsheet/model/ClientSecret;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$intentId:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$linkAccountId:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$last4:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$bankName:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$clientSecret:Lcom/stripe/android/paymentsheet/model/ClientSecret;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$intentId:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$linkAccountId:Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$last4:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$bankName:Ljava/lang/String;

    move-object v0, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;-><init>(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v7, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v8

    iget v0, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->label:I

    const/4 v1, 0x2

    const/4 v9, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v9, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v0, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$clientSecret:Lcom/stripe/android/paymentsheet/model/ClientSecret;

    instance-of v2, v0, Lcom/stripe/android/paymentsheet/model/PaymentIntentClientSecret;

    if-eqz v2, :cond_3

    iget-object v0, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->access$getStripeRepository$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)Lcom/stripe/android/networking/StripeRepository;

    move-result-object v0

    iget-object v1, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$clientSecret:Lcom/stripe/android/paymentsheet/model/ClientSecret;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/model/ClientSecret;->getValue()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$intentId:Ljava/lang/String;

    iget-object v3, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$linkAccountId:Ljava/lang/String;

    new-instance v4, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v5, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    invoke-static {v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->access$getLazyPaymentConfig$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)LY94;

    move-result-object v5

    invoke-interface {v5}, LY94;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v5}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v11

    iget-object v5, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    invoke-static {v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->access$getLazyPaymentConfig$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)LY94;

    move-result-object v5

    invoke-interface {v5}, LY94;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v5}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v14, 0x4

    const/4 v15, 0x0

    move-object v10, v4

    invoke-direct/range {v10 .. v15}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    iput v9, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->label:I

    move-object/from16 v6, p0

    invoke-virtual/range {v0 .. v6}, Lcom/stripe/android/networking/StripeRepository;->attachFinancialConnectionsSessionToPaymentIntent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_4

    return-object v8

    :cond_3
    instance-of v0, v0, Lcom/stripe/android/paymentsheet/model/SetupIntentClientSecret;

    if-eqz v0, :cond_4

    iget-object v0, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->access$getStripeRepository$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)Lcom/stripe/android/networking/StripeRepository;

    move-result-object v0

    iget-object v2, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$clientSecret:Lcom/stripe/android/paymentsheet/model/ClientSecret;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/model/ClientSecret;->getValue()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$intentId:Ljava/lang/String;

    iget-object v4, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$linkAccountId:Ljava/lang/String;

    new-instance v5, Lcom/stripe/android/core/networking/ApiRequest$Options;

    iget-object v6, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    invoke-static {v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->access$getLazyPaymentConfig$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)LY94;

    move-result-object v6

    invoke-interface {v6}, LY94;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v6}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v11

    iget-object v6, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    invoke-static {v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->access$getLazyPaymentConfig$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)LY94;

    move-result-object v6

    invoke-interface {v6}, LY94;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v6}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v14, 0x4

    const/4 v15, 0x0

    move-object v10, v5

    invoke-direct/range {v10 .. v15}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v6

    iput v1, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->label:I

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object/from16 v6, p0

    invoke-virtual/range {v0 .. v6}, Lcom/stripe/android/networking/StripeRepository;->attachFinancialConnectionsSessionToSetupIntent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_4

    return-object v8

    :cond_4
    :goto_1
    iget-object v0, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->access$getApplication$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)Landroid/app/Application;

    move-result-object v0

    sget v1, Lcom/stripe/android/paymentsheet/R$string;->paymentsheet_payment_method_item_card_number:I

    new-array v2, v9, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$last4:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    sget-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/TransformToBankIcon;->Companion:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/TransformToBankIcon$Companion;

    iget-object v1, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$bankName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/TransformToBankIcon$Companion;->invoke(Ljava/lang/String;)I

    move-result v10

    sget-object v0, Lcom/stripe/android/model/PaymentMethodCreateParams;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;

    new-instance v1, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;

    iget-object v2, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$linkAccountId:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;-><init>(Ljava/lang/String;)V

    iget-object v2, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->getName()LtP5;

    move-result-object v2

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ljava/lang/String;

    iget-object v2, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->getEmail()LtP5;

    move-result-object v2

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Ljava/lang/String;

    new-instance v2, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x9

    const/16 v17, 0x0

    move-object v11, v2

    invoke-direct/range {v11 .. v17}, Lcom/stripe/android/model/PaymentMethod$BillingDetails;-><init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;->create$default(Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v15

    iget-object v0, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->access$getArgs$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getShowCheckbox()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->getSaveForFutureUse()LtP5;

    move-result-object v0

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;->RequestReuse:Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    goto :goto_2

    :cond_5
    sget-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;->RequestNoReuse:Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    goto :goto_2

    :cond_6
    sget-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;->NoRequest:Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    :goto_2
    move-object/from16 v16, v0

    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    const-string v1, "getString(\n             \u2026                        )"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$bankName:Ljava/lang/String;

    iget-object v12, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$last4:Ljava/lang/String;

    iget-object v13, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$linkAccountId:Ljava/lang/String;

    iget-object v14, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$intentId:Ljava/lang/String;

    move-object v8, v0

    invoke-direct/range {v8 .. v16}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)V

    iget-object v1, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->access$getArgs$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->isCompleteFlow()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    iget-object v2, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$clientSecret:Lcom/stripe/android/paymentsheet/model/ClientSecret;

    invoke-static {v1, v2, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->access$confirm(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V

    goto :goto_3

    :cond_7
    iget-object v1, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->access$get_currentScreenState$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)LGX2;

    move-result-object v1

    iget-object v2, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$bankName:Ljava/lang/String;

    iget-object v3, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->$last4:Ljava/lang/String;

    :cond_8
    invoke-interface {v1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;

    instance-of v6, v5, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;

    if-eqz v6, :cond_9

    move-object v8, v5

    check-cast v8, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1cf

    const/16 v19, 0x0

    move-object v13, v2

    move-object v14, v3

    invoke-static/range {v8 .. v19}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;->copy$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;

    move-result-object v5

    :cond_9
    invoke-interface {v1, v4, v5}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    iget-object v1, v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->access$getArgs$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getOnUpdateSelectionAndFinish()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method
