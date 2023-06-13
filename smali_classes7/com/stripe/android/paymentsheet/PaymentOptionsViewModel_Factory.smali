.class public final Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;",
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
            "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;",
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

.field private final eventReporterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
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

.field private final savedStateHandleProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroidx/lifecycle/p;",
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
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;",
            ">;",
            "LY94<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;>;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "LY94<",
            "Landroid/app/Application;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            ">;",
            "LY94<",
            "Landroidx/lifecycle/p;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/LinkHandler;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->argsProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->prefsRepositoryFactoryProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->eventReporterProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->customerRepositoryProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->workContextProvider:LY94;

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->applicationProvider:LY94;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->loggerProvider:LY94;

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->lpmRepositoryProvider:LY94;

    iput-object p9, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->savedStateHandleProvider:LY94;

    iput-object p10, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->linkHandlerProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;",
            ">;",
            "LY94<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;>;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "LY94<",
            "Landroid/app/Application;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            ">;",
            "LY94<",
            "Landroidx/lifecycle/p;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/LinkHandler;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;"
        }
    .end annotation

    new-instance v11, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v11
.end method

.method public static newInstance(Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlin/coroutines/CoroutineContext;Landroid/app/Application;Lcom/stripe/android/core/Logger;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;)Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Landroid/app/Application;",
            "Lcom/stripe/android/core/Logger;",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            "Landroidx/lifecycle/p;",
            "Lcom/stripe/android/paymentsheet/LinkHandler;",
            ")",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;"
        }
    .end annotation

    new-instance v11, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlin/coroutines/CoroutineContext;Landroid/app/Application;Lcom/stripe/android/core/Logger;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;)V

    return-object v11
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;
    .locals 11

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->argsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->prefsRepositoryFactoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->eventReporterProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->customerRepositoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->workContextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lkotlin/coroutines/CoroutineContext;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->applicationProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/app/Application;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->loggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/core/Logger;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->lpmRepositoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->savedStateHandleProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroidx/lifecycle/p;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->linkHandlerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/stripe/android/paymentsheet/LinkHandler;

    invoke-static/range {v1 .. v10}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->newInstance(Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlin/coroutines/CoroutineContext;Landroid/app/Application;Lcom/stripe/android/core/Logger;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;)Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel_Factory;->get()Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;

    move-result-object v0

    return-object v0
.end method
