.class final Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->fireEvent(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V
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
    c = "com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter$fireEvent$1"
    f = "DefaultFinancialConnectionsEventReporter.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $event:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;",
            "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;->this$0:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;->$event:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

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

    new-instance p1, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;->this$0:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;->$event:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;-><init>(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;->this$0:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;->this$0:Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;

    invoke-static {v0}, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;->access$getAnalyticsRequestFactory$p(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;)Lcom/stripe/android/core/networking/AnalyticsRequestFactory;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$fireEvent$1;->$event:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;->getAdditionalParams()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/stripe/android/core/networking/AnalyticsRequestFactory;->createRequest(Lcom/stripe/android/core/networking/AnalyticsEvent;Ljava/util/Map;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method