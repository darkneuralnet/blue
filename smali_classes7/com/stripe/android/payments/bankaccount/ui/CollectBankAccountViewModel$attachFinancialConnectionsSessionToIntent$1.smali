.class final Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->attachFinancialConnectionsSessionToIntent(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V
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
    c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1"
    f = "CollectBankAccountViewModel.kt"
    i = {}
    l = {
        0x89,
        0x8f,
        0xa0,
        0xa2
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCollectBankAccountViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectBankAccountViewModel.kt\ncom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1#2:194\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $financialConnectionsSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    iput-object p2, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->$financialConnectionsSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

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

    new-instance p1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->$financialConnectionsSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->label:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->L$0:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_0

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-static {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->access$getArgs$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    move-result-object p1

    instance-of v1, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;

    if-eqz v1, :cond_4

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-static {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->access$getAttachFinancialConnectionsSession$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;

    move-result-object v6

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-static {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->access$getArgs$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getPublishableKey()Ljava/lang/String;

    move-result-object v7

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-static {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->access$getArgs$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getStripeAccountId()Ljava/lang/String;

    move-result-object v10

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-static {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->access$getArgs$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getClientSecret()Ljava/lang/String;

    move-result-object v9

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->$financialConnectionsSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getId()Ljava/lang/String;

    move-result-object v8

    iput v5, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->label:I

    move-object v11, p0

    invoke-virtual/range {v6 .. v11}, Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;->forPaymentIntent-yxL6bBk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_4
    instance-of p1, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-static {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->access$getAttachFinancialConnectionsSession$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;

    move-result-object v5

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-static {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->access$getArgs$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getPublishableKey()Ljava/lang/String;

    move-result-object v6

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-static {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->access$getArgs$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getStripeAccountId()Ljava/lang/String;

    move-result-object v9

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-static {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->access$getArgs$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getClientSecret()Ljava/lang/String;

    move-result-object v8

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->$financialConnectionsSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getId()Ljava/lang/String;

    move-result-object v7

    iput v4, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->label:I

    move-object v10, p0

    invoke-virtual/range {v5 .. v10}, Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;->forSetupIntent-yxL6bBk(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->$financialConnectionsSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    :try_start_0
    check-cast p1, Lcom/stripe/android/model/StripeIntent;

    new-instance v4, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Completed;

    new-instance v5, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;

    invoke-direct {v5, p1, v1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V

    invoke-direct {v4, v5}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Completed;-><init>(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;)V

    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    :cond_6
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    move-object v1, p1

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    move-object v4, v1

    check-cast v4, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Completed;

    invoke-static {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->access$getLogger$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/core/Logger;

    move-result-object v5

    const-string v6, "Bank account session attached to  intent!!"

    invoke-interface {v5, v6}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->label:I

    invoke-static {p1, v4, p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->access$finishWithResult(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_2
    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_8

    iput-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$attachFinancialConnectionsSessionToIntent$1;->label:I

    invoke-static {p1, v3, p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->access$finishWithError(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
