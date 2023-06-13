.class final Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->onConnectionsResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V
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
    c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$onConnectionsResult$1"
    f = "CollectBankAccountViewModel.kt"
    i = {}
    l = {
        0x61,
        0x63
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $result:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;->$result:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;

    iput-object p2, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

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

    new-instance p1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;->$result:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;->$result:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;

    instance-of v1, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult$Canceled;

    if-eqz v1, :cond_3

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    sget-object v1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Cancelled;->INSTANCE:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Cancelled;

    iput v3, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;->label:I

    invoke-static {p1, v1, p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->access$finishWithResult(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_3
    instance-of v1, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult$Failed;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    iput v2, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;->label:I

    invoke-static {v1, p1, p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->access$finishWithError(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_4
    instance-of p1, p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult$Completed;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    invoke-static {p1}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->access$getArgs$p(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getAttachToIntent()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;->$result:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;

    check-cast v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult$Completed;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult$Completed;->getFinancialConnectionsSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->access$attachFinancialConnectionsSessionToIntent(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;->this$0:Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$onConnectionsResult$1;->$result:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;

    check-cast v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult$Completed;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult$Completed;->getFinancialConnectionsSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;->access$finishWithFinancialConnectionsSession(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V

    :cond_6
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
