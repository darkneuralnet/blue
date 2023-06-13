.class final Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->onSubmit()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
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
    c = "com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel$onSubmit$1"
    f = "ManualEntryViewModel.kt"
    i = {
        0x1,
        0x2
    }
    l = {
        0x7d,
        0x7e,
        0x7f
    }
    m = "invokeSuspend"
    n = {
        "state",
        "state"
    }
    s = {
        "L$0",
        "L$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->this$0:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->this$0:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;-><init>(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->this$0:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

    iput v4, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->label:I

    invoke-virtual {p1, p0}, LRN2;->awaitState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    check-cast p1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->this$0:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->access$getGetManifest$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/financialconnections/domain/GetManifest;

    move-result-object v1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->label:I

    invoke-virtual {v1, p0}, Lcom/stripe/android/financialconnections/domain/GetManifest;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    return-object v0

    :cond_5
    move-object v8, v1

    move-object v1, p1

    move-object p1, v8

    :goto_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->this$0:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

    invoke-static {v3}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->access$getPollAttachPaymentAccount$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;

    move-result-object v3

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAllowManualEntry()Z

    move-result p1

    new-instance v4, Lcom/stripe/android/financialconnections/model/PaymentAccountParams$BankAccount;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->getRouting()Ljava/lang/String;

    move-result-object v5

    const-string v6, "Required value was null."

    if-eqz v5, :cond_9

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->getAccount()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_8

    invoke-direct {v4, v5, v7}, Lcom/stripe/android/financialconnections/model/PaymentAccountParams$BankAccount;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->label:I

    const/4 v2, 0x0

    invoke-virtual {v3, p1, v2, v4, p0}, Lcom/stripe/android/financialconnections/domain/PollAttachPaymentAccount;->invoke(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    move-object v0, v1

    :goto_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$onSubmit$1;->this$0:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;

    move-object v2, p1

    check-cast v2, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;->access$getGoNext$p(Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel;)Lcom/stripe/android/financialconnections/domain/GoNext;

    move-result-object v1

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;->getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v3

    if-nez v3, :cond_7

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->MANUAL_ENTRY_SUCCESS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    :cond_7
    sget-object v4, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$ManualEntrySuccess;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections$ManualEntrySuccess;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;->getMicrodepositVerificationMethod()Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;

    move-result-object v2

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;->getAccount()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x4

    invoke-static {v0, v5}, Lkotlin/text/StringsKt;->takeLast(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v2, v0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$ManualEntrySuccess;->argMap(Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Lcom/stripe/android/financialconnections/domain/GoNext;->invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;)Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    return-object p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
