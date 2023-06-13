.class final Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->dispatchResult(Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lcom/stripe/android/model/ElementsSessionParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.stripe.android.paymentsheet.flowcontroller.FlowControllerConfigurationHandler$dispatchResult$2"
    f = "FlowControllerConfigurationHandler.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $callback:Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;

.field final synthetic $elementsSessionParams:Lcom/stripe/android/model/ElementsSessionParams;

.field final synthetic $result:Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;",
            "Lcom/stripe/android/model/ElementsSessionParams;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->$result:Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->this$0:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->$elementsSessionParams:Lcom/stripe/android/model/ElementsSessionParams;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->$callback:Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance p1, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->$result:Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->this$0:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->$elementsSessionParams:Lcom/stripe/android/model/ElementsSessionParams;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->$callback:Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;-><init>(Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/model/ElementsSessionParams;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->label:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->$result:Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;

    instance-of v0, p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Success;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->this$0:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->access$getViewModel$p(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->$elementsSessionParams:Lcom/stripe/android/model/ElementsSessionParams;

    invoke-virtual {p1, v0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->setPreviousElementsSessionParams(Lcom/stripe/android/model/ElementsSessionParams;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->this$0:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->$result:Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;

    check-cast v0, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Success;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Success;->getState()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->$callback:Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;

    invoke-static {p1, v0, v1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;->access$onInitSuccess(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Failure;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$dispatchResult$2;->$callback:Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;

    check-cast p1, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Failure;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Failure;->getThrowable()Ljava/lang/Throwable;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;->onConfigured(ZLjava/lang/Throwable;)V

    :cond_1
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
