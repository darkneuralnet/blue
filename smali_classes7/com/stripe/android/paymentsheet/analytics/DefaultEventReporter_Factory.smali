.class public final Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;",
        ">;"
    }
.end annotation


# instance fields
.field private final analyticsRequestExecutorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            ">;"
        }
    .end annotation
.end field

.field private final eventTimeProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final modeProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentAnalyticsRequestFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
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
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;->modeProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;->analyticsRequestExecutorProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;->paymentAnalyticsRequestFactoryProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;->eventTimeProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;->workContextProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;"
        }
    .end annotation

    new-instance v6, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static newInstance(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;
    .locals 7

    new-instance v6, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;Lkotlin/coroutines/CoroutineContext;)V

    return-object v6
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;->modeProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;->analyticsRequestExecutorProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;->paymentAnalyticsRequestFactoryProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;->eventTimeProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;->workContextProvider:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;->newInstance(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter_Factory;->get()Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;

    move-result-object v0

    return-object v0
.end method
