.class public final Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ+\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J)\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;",
        "",
        "paymentSheetLoader",
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;",
        "uiContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "viewModel",
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;",
        "(Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)V",
        "configure",
        "",
        "initializationMode",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;",
        "configuration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "callback",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "dispatchResult",
        "result",
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;",
        "elementsSessionParams",
        "Lcom/stripe/android/model/ElementsSessionParams;",
        "(Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lcom/stripe/android/model/ElementsSessionParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onInitSuccess",
        "state",
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFlowControllerConfigurationHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowControllerConfigurationHandler.kt\ncom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,83:1\n329#2:84\n*S KotlinDebug\n*F\n+ 1 FlowControllerConfigurationHandler.kt\ncom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler\n*L\n47#1:84\n*E\n"
    }
.end annotation


# instance fields
.field private final eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

.field private final paymentSheetLoader:Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;

.field private final uiContext:Lkotlin/coroutines/CoroutineContext;

.field private final viewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)V
    .locals 1
    .param p2    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/UIContext;
        .end annotation
    .end param

    const-string v0, "paymentSheetLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->paymentSheetLoader:Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->uiContext:Lkotlin/coroutines/CoroutineContext;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->viewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    return-void
.end method

.method public static final synthetic access$dispatchResult(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lcom/stripe/android/model/ElementsSessionParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->dispatchResult(Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lcom/stripe/android/model/ElementsSessionParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getViewModel$p(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->viewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    return-object p0
.end method

.method public static final synthetic access$onInitSuccess(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->onInitSuccess(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;)V

    return-void
.end method

.method private final dispatchResult(Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lcom/stripe/android/model/ElementsSessionParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;",
            "Lcom/stripe/android/model/ElementsSessionParams;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->uiContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v7, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p1

    move-object v3, p0

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;-><init>(Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v7, p4}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final onInitSuccess(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getConfig()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onInit(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->viewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getInitialPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->setPaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->viewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->setState(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;)V

    const/4 p1, 0x1

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;->onConfigured(ZLjava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final configure(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;-><init>(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/model/ElementsSessionParams;

    iget-object p2, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;->L$2:Ljava/lang/Object;

    move-object p3, p2

    check-cast p3, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;

    iget-object p2, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;->L$1:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v7, p4

    move-object p4, p1

    move-object p1, p2

    move-object p2, v7

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;->validate$paymentsheet_release()V

    if-eqz p2, :cond_4

    invoke-static {p2}, Lcom/stripe/android/paymentsheet/PaymentSheetConfigurationKtxKt;->validate(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V
    :try_end_0
    .catch Ljava/security/InvalidParameterException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    invoke-static {p1, p2}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt;->toElementsSessionParams(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Lcom/stripe/android/model/ElementsSessionParams;

    move-result-object p4

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->viewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->getPreviousElementsSessionParams()Lcom/stripe/android/model/ElementsSessionParams;

    move-result-object v2

    invoke-static {p4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p3, v5, v6}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;->onConfigured(ZLjava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_5
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->paymentSheetLoader:Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;

    iput-object p0, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;->L$2:Ljava/lang/Object;

    iput-object p4, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;->L$3:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;->label:I

    invoke-interface {v2, p1, p2, v0}, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;->load(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    return-object v1

    :cond_6
    move-object v2, p0

    :goto_1
    check-cast p2, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;

    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v5

    invoke-static {v5}, LKh2;->o(Lkotlin/coroutines/CoroutineContext;)Z

    move-result v5

    if-eqz v5, :cond_8

    iget-object v3, v2, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->viewModel:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    invoke-virtual {v3, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->setInitializationMode(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;)V

    iput-object v6, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;->L$2:Ljava/lang/Object;

    iput-object v6, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;->L$3:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$configure$1;->label:I

    invoke-direct {v2, p2, p3, p4, v0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->dispatchResult(Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lcom/stripe/android/model/ElementsSessionParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_8
    invoke-interface {p3, v3, v6}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;->onConfigured(ZLjava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :catch_0
    move-exception p1

    invoke-interface {p3, v3, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;->onConfigured(ZLjava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
