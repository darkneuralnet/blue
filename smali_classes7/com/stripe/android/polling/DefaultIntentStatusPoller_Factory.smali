.class public final Lcom/stripe/android/polling/DefaultIntentStatusPoller_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/polling/DefaultIntentStatusPoller;",
        ">;"
    }
.end annotation


# instance fields
.field private final configProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/polling/IntentStatusPoller$Config;",
            ">;"
        }
    .end annotation
.end field

.field private final dispatcherProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LSC0;",
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

.field private final stripeRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/networking/StripeRepository;",
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
            "Lcom/stripe/android/networking/StripeRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/polling/IntentStatusPoller$Config;",
            ">;",
            "LY94<",
            "LSC0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller_Factory;->stripeRepositoryProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller_Factory;->paymentConfigProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller_Factory;->configProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller_Factory;->dispatcherProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;)Lcom/stripe/android/polling/DefaultIntentStatusPoller_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/networking/StripeRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/polling/IntentStatusPoller$Config;",
            ">;",
            "LY94<",
            "LSC0;",
            ">;)",
            "Lcom/stripe/android/polling/DefaultIntentStatusPoller_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller_Factory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/polling/DefaultIntentStatusPoller_Factory;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/networking/StripeRepository;LY94;Lcom/stripe/android/polling/IntentStatusPoller$Config;LSC0;)Lcom/stripe/android/polling/DefaultIntentStatusPoller;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/networking/StripeRepository;",
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "Lcom/stripe/android/polling/IntentStatusPoller$Config;",
            "LSC0;",
            ")",
            "Lcom/stripe/android/polling/DefaultIntentStatusPoller;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/polling/DefaultIntentStatusPoller;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/polling/DefaultIntentStatusPoller;-><init>(Lcom/stripe/android/networking/StripeRepository;LY94;Lcom/stripe/android/polling/IntentStatusPoller$Config;LSC0;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/polling/DefaultIntentStatusPoller;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller_Factory;->stripeRepositoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/networking/StripeRepository;

    iget-object v1, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller_Factory;->paymentConfigProvider:LY94;

    iget-object v2, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller_Factory;->configProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/polling/IntentStatusPoller$Config;

    iget-object v3, p0, Lcom/stripe/android/polling/DefaultIntentStatusPoller_Factory;->dispatcherProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LSC0;

    invoke-static {v0, v1, v2, v3}, Lcom/stripe/android/polling/DefaultIntentStatusPoller_Factory;->newInstance(Lcom/stripe/android/networking/StripeRepository;LY94;Lcom/stripe/android/polling/IntentStatusPoller$Config;LSC0;)Lcom/stripe/android/polling/DefaultIntentStatusPoller;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/polling/DefaultIntentStatusPoller_Factory;->get()Lcom/stripe/android/polling/DefaultIntentStatusPoller;

    move-result-object v0

    return-object v0
.end method
