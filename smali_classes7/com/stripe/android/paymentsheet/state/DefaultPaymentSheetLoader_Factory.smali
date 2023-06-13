.class public final Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;",
        ">;"
    }
.end annotation


# instance fields
.field private final accountStatusProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final appNameProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/String;",
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

.field private final googlePayRepositoryFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
            "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
            ">;>;"
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

.field private final prefsRepositoryFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;>;"
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
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ljava/lang/String;",
            ">;",
            "LY94<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;>;",
            "LY94<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
            "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
            ">;>;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->appNameProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->prefsRepositoryFactoryProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->googlePayRepositoryFactoryProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->elementsSessionRepositoryProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->stripeIntentValidatorProvider:LY94;

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->customerRepositoryProvider:LY94;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->lpmRepositoryProvider:LY94;

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->loggerProvider:LY94;

    iput-object p9, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->eventReporterProvider:LY94;

    iput-object p10, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->workContextProvider:LY94;

    iput-object p11, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->accountStatusProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ljava/lang/String;",
            ">;",
            "LY94<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;>;",
            "LY94<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
            "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
            ">;>;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;"
        }
    .end annotation

    new-instance v12, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;

    move-object v0, v12

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v11}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v12
.end method

.method public static newInstance(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;)Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;",
            "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;",
            ">;",
            "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
            "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            "Lcom/stripe/android/core/Logger;",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;",
            ")",
            "Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;"
        }
    .end annotation

    new-instance v12, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;

    move-object v0, v12

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v11}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;)V

    return-object v12
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;
    .locals 12

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->appNameProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->prefsRepositoryFactoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->googlePayRepositoryFactoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->elementsSessionRepositoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->stripeIntentValidatorProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->customerRepositoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->lpmRepositoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->loggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/core/Logger;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->eventReporterProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->workContextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lkotlin/coroutines/CoroutineContext;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->accountStatusProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;

    invoke-static/range {v1 .. v11}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->newInstance(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;)Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader_Factory;->get()Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;

    move-result-object v0

    return-object v0
.end method
