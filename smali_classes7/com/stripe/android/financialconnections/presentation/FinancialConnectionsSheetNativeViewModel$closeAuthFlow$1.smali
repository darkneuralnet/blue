.class final Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->closeAuthFlow(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;Ljava/lang/Throwable;)V
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
    c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1"
    f = "FinancialConnectionsSheetNativeViewModel.kt"
    i = {
        0x1,
        0x2
    }
    l = {
        0xeb,
        0xf0,
        0x111
    }
    m = "invokeSuspend"
    n = {
        "session",
        "completeSessionError"
    }
    s = {
        "L$3",
        "L$3"
    }
.end annotation


# instance fields
.field final synthetic $closeAuthFlowError:Ljava/lang/Throwable;

.field final synthetic $earlyTerminationCause:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;",
            "Ljava/lang/Throwable;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->this$0:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->$earlyTerminationCause:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->$closeAuthFlowError:Ljava/lang/Throwable;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->this$0:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->$earlyTerminationCause:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->$closeAuthFlowError:Ljava/lang/Throwable;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    goto/16 :goto_7

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Throwable;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    iget-object v7, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->L$0:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    :goto_0
    move-object v10, v1

    goto/16 :goto_4

    :cond_2
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->this$0:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->$earlyTerminationCause:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;

    :try_start_1
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->access$getCompleteFinancialConnectionsSession$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

    move-result-object p1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Terminate$EarlyTerminationCause;->getValue()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_4
    move-object v1, v4

    :goto_1
    iput v5, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->label:I

    invoke-virtual {p1, v1, p0}, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;->invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_2
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_3
    move-object v7, p1

    iget-object v6, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->this$0:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    iget-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->$closeAuthFlowError:Ljava/lang/Throwable;

    invoke-static {v7}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    move-object v1, v7

    check-cast v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-static {v6}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v8

    new-instance v9, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Complete;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getAccounts()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getData()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v10

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-direct {v9, v4, v10}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Complete;-><init>(Ljava/lang/Throwable;Ljava/lang/Integer;)V

    iput-object v7, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->L$0:Ljava/lang/Object;

    iput-object v6, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->L$1:Ljava/lang/Object;

    iput-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->L$2:Ljava/lang/Object;

    iput-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->L$3:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->label:I

    invoke-interface {v8, v9, p0}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track-gIAlu-s(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_6

    return-object v0

    :cond_6
    move-object v3, p1

    goto :goto_0

    :goto_4
    invoke-static {v10}, Lcom/stripe/android/financialconnections/features/manualentry/CustomManualEntryKt;->isCustomManualEntryError(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;

    new-instance v1, Lcom/stripe/android/financialconnections/exception/CustomManualEntryRequiredError;

    invoke-direct {v1}, Lcom/stripe/android/financialconnections/exception/CustomManualEntryRequiredError;-><init>()V

    invoke-direct {p1, v1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;-><init>(Ljava/lang/Throwable;)V

    new-instance v1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$2$1;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$2$1;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;)V

    invoke-static {v6, v1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->access$setState(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getAccounts()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getData()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v5

    if-nez p1, :cond_a

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/PaymentAccount;

    move-result-object p1

    if-nez p1, :cond_a

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getBankAccountToken$financial_connections_release()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_8

    goto :goto_5

    :cond_8
    if-eqz v3, :cond_9

    new-instance p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$2$3;

    invoke-direct {p1, v3}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$2$3;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v6, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->access$setState(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    :cond_9
    sget-object p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$2$4;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$2$4;

    invoke-static {v6, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->access$setState(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/jvm/functions/Function1;)V

    goto :goto_6

    :cond_a
    :goto_5
    new-instance p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;

    const/4 v9, 0x0

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getParsedToken$financial_connections_release()Lcom/stripe/android/model/Token;

    move-result-object v11

    const/4 v12, 0x1

    const/4 v13, 0x0

    move-object v8, p1

    invoke-direct/range {v8 .. v13}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/model/Token;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$2$2;

    invoke-direct {v1, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$2$2;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;)V

    invoke-static {v6, v1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->access$setState(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/jvm/functions/Function1;)V

    :cond_b
    :goto_6
    iget-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->this$0:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->$closeAuthFlowError:Ljava/lang/Throwable;

    invoke-static {v7}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_d

    invoke-static {p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->access$getLogger$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lcom/stripe/android/core/Logger;

    move-result-object v5

    const-string v6, "Error completing session before closing"

    invoke-interface {v5, v6, v3}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Complete;

    invoke-direct {v6, v3, v4}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Complete;-><init>(Ljava/lang/Throwable;Ljava/lang/Integer;)V

    iput-object v7, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->L$0:Ljava/lang/Object;

    iput-object p1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->L$1:Ljava/lang/Object;

    iput-object v1, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->L$2:Ljava/lang/Object;

    iput-object v3, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->L$3:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1;->label:I

    invoke-interface {v5, v6, p0}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track-gIAlu-s(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_c

    return-object v0

    :cond_c
    move-object v2, p1

    move-object v0, v3

    :goto_7
    new-instance p1, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$3$1;

    invoke-direct {p1, v1, v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1$3$1;-><init>(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    invoke-static {v2, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->access$setState(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lkotlin/jvm/functions/Function1;)V

    :cond_d
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
