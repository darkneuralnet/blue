.class final Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->observeAsyncs()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
        "it",
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
    c = "com.stripe.android.financialconnections.features.success.SuccessViewModel$observeAsyncs$6"
    f = "SuccessViewModel.kt"
    i = {
        0x0
    }
    l = {
        0x56,
        0x5c
    }
    m = "invokeSuspend"
    n = {
        "it"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;->this$0:Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance v0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;->this$0:Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;

    invoke-direct {v0, v1, p2}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;-><init>(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;->invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;->L$0:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;->this$0:Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object p1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getAccounts()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getData()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    new-instance v6, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Complete;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v6, v2, v5}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Complete;-><init>(Ljava/lang/Throwable;Ljava/lang/Integer;)V

    iput-object v1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;->L$0:Ljava/lang/Object;

    iput v4, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;->label:I

    invoke-interface {p1, v6, p0}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track-gIAlu-s(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    move-object v6, v1

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;->this$0:Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;->access$getNativeAuthFlowCoordinator$p(Lcom/stripe/android/financialconnections/features/success/SuccessViewModel;)Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;->invoke()LBX2;

    move-result-object p1

    new-instance v1, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Finish;

    new-instance v10, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;

    const/4 v5, 0x0

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getParsedToken$financial_connections_release()Lcom/stripe/android/model/Token;

    move-result-object v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/model/Token;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v10}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Finish;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V

    iput-object v2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$observeAsyncs$6;->label:I

    invoke-interface {p1, v1, p0}, LBX2;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
