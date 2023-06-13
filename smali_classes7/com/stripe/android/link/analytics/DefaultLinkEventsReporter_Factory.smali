.class public final Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;",
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

.field private final loggerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
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
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;->analyticsRequestExecutorProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;->paymentAnalyticsRequestFactoryProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;->workContextProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;->loggerProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;)Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;)",
            "Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;
    .locals 1

    new-instance v0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;-><init>(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;->analyticsRequestExecutorProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iget-object v1, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;->paymentAnalyticsRequestFactoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iget-object v2, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;->workContextProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    iget-object v3, p0, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;->loggerProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/core/Logger;

    invoke-static {v0, v1, v2, v3}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;->newInstance(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter_Factory;->get()Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;

    move-result-object v0

    return-object v0
.end method
