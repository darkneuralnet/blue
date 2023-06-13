.class final Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;-><init>(Lcom/stripe/android/financialconnections/features/reset/ResetState;Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/core/Logger;)V
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"
    }
    d2 = {
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
    c = "com.stripe.android.financialconnections.features.reset.ResetViewModel$1"
    f = "ResetViewModel.kt"
    i = {
        0x1,
        0x2
    }
    l = {
        0x21,
        0x22,
        0x23
    }
    m = "invokeSuspend"
    n = {
        "updatedManifest",
        "updatedManifest"
    }
    s = {
        "L$0",
        "L$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;

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

    new-instance v0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p1, v1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->access$getLinkMoreAccounts$p(Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;)Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;

    move-result-object p1

    iput v3, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;->label:I

    invoke-virtual {p1, p0}, Lcom/stripe/android/financialconnections/domain/LinkMoreAccounts;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->access$getNativeAuthFlowCoordinator$p(Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;)Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;->invoke()LBX2;

    move-result-object v1

    sget-object v3, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$ClearPartnerWebAuth;->INSTANCE:Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$ClearPartnerWebAuth;

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;->L$0:Ljava/lang/Object;

    iput v4, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;->label:I

    invoke-interface {v1, v3, p0}, LBX2;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v1

    new-instance v3, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PaneLoaded;

    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->RESET:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-direct {v3, v5}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$PaneLoaded;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;->label:I

    invoke-interface {v1, v3, p0}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track-gIAlu-s(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6

    return-object v0

    :cond_6
    move-object v0, p1

    :goto_2
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;->access$getGoNext$p(Lcom/stripe/android/financialconnections/features/reset/ResetViewModel;)Lcom/stripe/android/financialconnections/domain/GoNext;

    move-result-object p1

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v4, v1}, Lcom/stripe/android/financialconnections/domain/GoNext;->invoke$default(Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
