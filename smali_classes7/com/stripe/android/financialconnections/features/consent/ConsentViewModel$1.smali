.class final Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/domain/AcceptConsent;Lcom/stripe/android/financialconnections/domain/GoNext;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/core/Logger;)V
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
        "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;",
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
        "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;",
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
    c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$1"
    f = "ConsentViewModel.kt"
    i = {
        0x1,
        0x1
    }
    l = {
        0x2e,
        0x32
    }
    m = "invokeSuspend"
    n = {
        "sync",
        "shouldShowMerchantLogos"
    }
    s = {
        "L$0",
        "Z$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

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

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;->Z$0:Z

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    move-result-object p1

    iput v3, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;->label:I

    invoke-virtual {p1, p0}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    move-object v1, p1

    check-cast v1, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object p1

    sget-object v3, Lcom/stripe/android/financialconnections/utils/Experiment;->CONNECTIONS_CONSENT_COMBINED_LOGO:Lcom/stripe/android/financialconnections/utils/Experiment;

    invoke-static {p1, v3}, Lcom/stripe/android/financialconnections/utils/ExperimentsKt;->experimentAssignment(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/utils/Experiment;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "treatment"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;->this$0:Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    invoke-static {v5}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v5

    iput-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;->L$0:Ljava/lang/Object;

    iput-boolean v4, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;->Z$0:Z

    iput v2, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$1;->label:I

    invoke-static {v5, v3, p1, p0}, Lcom/stripe/android/financialconnections/utils/ExperimentsKt;->trackExposure(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/utils/Experiment;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    move v0, v4

    :goto_1
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getText()Lcom/stripe/android/financialconnections/model/TextUpdate;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/TextUpdate;->getConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getVisual()Lcom/stripe/android/financialconnections/model/VisualUpdate;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/VisualUpdate;->getMerchantLogos()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_6

    :cond_5
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    :cond_6
    new-instance v2, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    invoke-direct {v2, p1, v1, v0}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;-><init>(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/util/List;Z)V

    return-object v2
.end method
