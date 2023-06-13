.class public final Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final applicationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private final argsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final customerRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final elementsSessionRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
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

.field private final intentConfirmationInterceptorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/IntentConfirmationInterceptor;",
            ">;"
        }
    .end annotation
.end field

.field private final linkHandlerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/LinkHandler;",
            ">;"
        }
    .end annotation
.end field

.field private final loggerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;"
        }
    .end annotation
.end field

.field private final lpmRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentConfigProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
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

.field private final paymentSheetLoaderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;",
            ">;"
        }
    .end annotation
.end field

.field private final prefsRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final savedStateHandleProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroidx/lifecycle/p;",
            ">;"
        }
    .end annotation
.end field

.field private final stripeIntentValidatorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;",
            ">;"
        }
    .end annotation
.end field

.field private final workContextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/app/Application;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "LY94<",
            "Landroidx/lifecycle/p;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/LinkHandler;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/IntentConfirmationInterceptor;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->applicationProvider:LY94;

    move-object v1, p2

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->argsProvider:LY94;

    move-object v1, p3

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->eventReporterProvider:LY94;

    move-object v1, p4

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->paymentConfigProvider:LY94;

    move-object v1, p5

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->elementsSessionRepositoryProvider:LY94;

    move-object v1, p6

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->stripeIntentValidatorProvider:LY94;

    move-object v1, p7

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->paymentSheetLoaderProvider:LY94;

    move-object v1, p8

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->customerRepositoryProvider:LY94;

    move-object v1, p9

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->prefsRepositoryProvider:LY94;

    move-object v1, p10

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->lpmRepositoryProvider:LY94;

    move-object v1, p11

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->paymentLauncherFactoryProvider:LY94;

    move-object v1, p12

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->googlePayPaymentMethodLauncherFactoryProvider:LY94;

    move-object v1, p13

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->loggerProvider:LY94;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->workContextProvider:LY94;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->savedStateHandleProvider:LY94;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->linkHandlerProvider:LY94;

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->intentConfirmationInterceptorProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/app/Application;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "LY94<",
            "Landroidx/lifecycle/p;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/LinkHandler;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/IntentConfirmationInterceptor;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;"
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

    new-instance v18, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;

    move-object/from16 v0, v18

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v18
.end method

.method public static newInstance(Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Ldagger/Lazy;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/PrefsRepository;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/IntentConfirmationInterceptor;)Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            "Ldagger/Lazy<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;",
            "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;",
            "Lcom/stripe/android/core/Logger;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Landroidx/lifecycle/p;",
            "Lcom/stripe/android/paymentsheet/LinkHandler;",
            "Lcom/stripe/android/IntentConfirmationInterceptor;",
            ")",
            "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;"
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

    new-instance v18, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    move-object/from16 v0, v18

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;-><init>(Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Ldagger/Lazy;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/PrefsRepository;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/IntentConfirmationInterceptor;)V

    return-object v18
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->applicationProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/app/Application;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->argsProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->eventReporterProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->paymentConfigProvider:LY94;

    invoke-static {v1}, LV51;->a(LY94;)Ldagger/Lazy;

    move-result-object v5

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->elementsSessionRepositoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->stripeIntentValidatorProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->paymentSheetLoaderProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->customerRepositoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->prefsRepositoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/stripe/android/paymentsheet/PrefsRepository;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->lpmRepositoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->paymentLauncherFactoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->googlePayPaymentMethodLauncherFactoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->loggerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lcom/stripe/android/core/Logger;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->workContextProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Lkotlin/coroutines/CoroutineContext;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->savedStateHandleProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Landroidx/lifecycle/p;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->linkHandlerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Lcom/stripe/android/paymentsheet/LinkHandler;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->intentConfirmationInterceptorProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v18, v1

    check-cast v18, Lcom/stripe/android/IntentConfirmationInterceptor;

    invoke-static/range {v2 .. v18}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->newInstance(Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Ldagger/Lazy;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/PrefsRepository;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/IntentConfirmationInterceptor;)Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel_Factory;->get()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;

    move-result-object v0

    return-object v0
.end method
