.class public final Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;",
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

.field private final defaultReturnUrlProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/DefaultReturnUrl;",
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

.field private final isInstantAppProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/Boolean;",
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

.field private final paymentBrowserAuthStarterFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/PaymentBrowserAuthStarter;",
            ">;>;"
        }
    .end annotation
.end field

.field private final publishableKeyProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final threeDs1IntentReturnUrlMapProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
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


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/PaymentBrowserAuthStarter;",
            ">;>;",
            "LY94<",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            ">;",
            "LY94<",
            "Ljava/lang/Boolean;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "LY94<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Ljava/lang/Boolean;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/payments/DefaultReturnUrl;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->paymentBrowserAuthStarterFactoryProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->analyticsRequestExecutorProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->paymentAnalyticsRequestFactoryProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->enableLoggingProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->uiContextProvider:LY94;

    iput-object p6, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->threeDs1IntentReturnUrlMapProvider:LY94;

    iput-object p7, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->publishableKeyProvider:LY94;

    iput-object p8, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->isInstantAppProvider:LY94;

    iput-object p9, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->defaultReturnUrlProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/PaymentBrowserAuthStarter;",
            ">;>;",
            "LY94<",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            ">;",
            "LY94<",
            "Ljava/lang/Boolean;",
            ">;",
            "LY94<",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;",
            "LY94<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Ljava/lang/Boolean;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/payments/DefaultReturnUrl;",
            ">;)",
            "Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;"
        }
    .end annotation

    new-instance v10, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v10
.end method

.method public static newInstance(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;ZLkotlin/coroutines/CoroutineContext;Ljava/util/Map;Lkotlin/jvm/functions/Function0;ZLcom/stripe/android/payments/DefaultReturnUrl;)Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/PaymentBrowserAuthStarter;",
            ">;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Z",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/stripe/android/payments/DefaultReturnUrl;",
            ")",
            "Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;"
        }
    .end annotation

    new-instance v10, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;-><init>(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;ZLkotlin/coroutines/CoroutineContext;Ljava/util/Map;Lkotlin/jvm/functions/Function0;ZLcom/stripe/android/payments/DefaultReturnUrl;)V

    return-object v10
.end method


# virtual methods
.method public get()Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;
    .locals 10

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->paymentBrowserAuthStarterFactoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->analyticsRequestExecutorProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->paymentAnalyticsRequestFactoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->enableLoggingProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->uiContextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lkotlin/coroutines/CoroutineContext;

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->threeDs1IntentReturnUrlMapProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map;

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->publishableKeyProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function0;

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->isInstantAppProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    iget-object v0, p0, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->defaultReturnUrlProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/stripe/android/payments/DefaultReturnUrl;

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->newInstance(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;ZLkotlin/coroutines/CoroutineContext;Ljava/util/Map;Lkotlin/jvm/functions/Function0;ZLcom/stripe/android/payments/DefaultReturnUrl;)Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator_Factory;->get()Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;

    move-result-object v0

    return-object v0
.end method
