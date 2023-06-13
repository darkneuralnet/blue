.class public final Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;",
        ">;"
    }
.end annotation


# instance fields
.field private final activityResultCallerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lu5;",
            ">;"
        }
    .end annotation
.end field

.field private final configurationHandlerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;",
            ">;"
        }
    .end annotation
.end field

.field private final enableLoggingProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final eventReporterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;"
        }
    .end annotation
.end field

.field private final googlePayPaymentMethodLauncherFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final injectorKeyProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final intentConfirmationInterceptorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/IntentConfirmationInterceptor;",
            ">;"
        }
    .end annotation
.end field

.field private final lazyPaymentConfigurationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final lifecycleOwnerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LLifecycleOwner;",
            ">;"
        }
    .end annotation
.end field

.field private final lifecycleScopeProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LZC0;",
            ">;"
        }
    .end annotation
.end field

.field private final linkLauncherProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/LinkPaymentLauncher;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentLauncherFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentOptionCallbackProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentOptionFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentResultCallbackProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final productUsageProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final statusBarColorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;>;"
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
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LZC0;",
            ">;",
            "LY94<",
            "LLifecycleOwner;",
            ">;",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;>;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;",
            ">;",
            "LY94<",
            "Lu5;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "LY94<",
            "Ljava/lang/Boolean;",
            ">;",
            "LY94<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/LinkPaymentLauncher;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/IntentConfirmationInterceptor;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->lifecycleScopeProvider:LY94;

    move-object v1, p2

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->lifecycleOwnerProvider:LY94;

    move-object v1, p3

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->statusBarColorProvider:LY94;

    move-object v1, p4

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->paymentOptionFactoryProvider:LY94;

    move-object v1, p5

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->paymentOptionCallbackProvider:LY94;

    move-object v1, p6

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->paymentResultCallbackProvider:LY94;

    move-object v1, p7

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->activityResultCallerProvider:LY94;

    move-object v1, p8

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->injectorKeyProvider:LY94;

    move-object v1, p9

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->eventReporterProvider:LY94;

    move-object v1, p10

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->viewModelProvider:LY94;

    move-object v1, p11

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->paymentLauncherFactoryProvider:LY94;

    move-object v1, p12

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->lazyPaymentConfigurationProvider:LY94;

    move-object v1, p13

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->enableLoggingProvider:LY94;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->productUsageProvider:LY94;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->googlePayPaymentMethodLauncherFactoryProvider:LY94;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->linkLauncherProvider:LY94;

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->configurationHandlerProvider:LY94;

    move-object/from16 v1, p18

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->intentConfirmationInterceptorProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LZC0;",
            ">;",
            "LY94<",
            "LLifecycleOwner;",
            ">;",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;>;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;",
            ">;",
            "LY94<",
            "Lu5;",
            ">;",
            "LY94<",
            "Ljava/lang/String;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "LY94<",
            "Ljava/lang/Boolean;",
            ">;",
            "LY94<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/LinkPaymentLauncher;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/IntentConfirmationInterceptor;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    new-instance v19, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;

    move-object/from16 v0, v19

    invoke-direct/range {v0 .. v18}, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v19
.end method

.method public static newInstance(LZC0;LLifecycleOwner;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lu5;Ljava/lang/String;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;LY94;ZLjava/util/Set;Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/IntentConfirmationInterceptor;)Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "LLifecycleOwner;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;",
            "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;",
            "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;",
            "Lu5;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;",
            "Lcom/stripe/android/link/LinkPaymentLauncher;",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;",
            "Lcom/stripe/android/IntentConfirmationInterceptor;",
            ")",
            "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    new-instance v19, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;

    move-object/from16 v0, v19

    invoke-direct/range {v0 .. v18}, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;-><init>(LZC0;LLifecycleOwner;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lu5;Ljava/lang/String;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;LY94;ZLjava/util/Set;Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/IntentConfirmationInterceptor;)V

    return-object v19
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->lifecycleScopeProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LZC0;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->lifecycleOwnerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LLifecycleOwner;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->statusBarColorProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lkotlin/jvm/functions/Function0;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->paymentOptionFactoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->paymentOptionCallbackProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/stripe/android/paymentsheet/PaymentOptionCallback;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->paymentResultCallbackProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->activityResultCallerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lu5;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->injectorKeyProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Ljava/lang/String;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->eventReporterProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->viewModelProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->paymentLauncherFactoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;

    iget-object v13, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->lazyPaymentConfigurationProvider:LY94;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->enableLoggingProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->productUsageProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Ljava/util/Set;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->googlePayPaymentMethodLauncherFactoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->linkLauncherProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Lcom/stripe/android/link/LinkPaymentLauncher;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->configurationHandlerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v18, v1

    check-cast v18, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->intentConfirmationInterceptorProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v19, v1

    check-cast v19, Lcom/stripe/android/IntentConfirmationInterceptor;

    invoke-static/range {v2 .. v19}, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->newInstance(LZC0;LLifecycleOwner;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lu5;Ljava/lang/String;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;LY94;ZLjava/util/Set;Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/IntentConfirmationInterceptor;)Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController_Factory;->get()Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;

    move-result-object v0

    return-object v0
.end method
