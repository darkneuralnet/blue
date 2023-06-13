.class public final Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;",
        ">;"
    }
.end annotation


# instance fields
.field private final eventReporterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentSheetLoaderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;",
            ">;"
        }
    .end annotation
.end field

.field private final uiContextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;"
        }
    .end annotation
.end field

.field private final viewModelProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler_Factory;->paymentSheetLoaderProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler_Factory;->uiContextProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler_Factory;->eventReporterProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler_Factory;->viewModelProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler_Factory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler_Factory;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;-><init>(Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler_Factory;->paymentSheetLoaderProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler_Factory;->uiContextProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler_Factory;->eventReporterProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler_Factory;->viewModelProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    invoke-static {v0, v1, v2, v3}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler_Factory;->newInstance(Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler_Factory;->get()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;

    move-result-object v0

    return-object v0
.end method
