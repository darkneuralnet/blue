.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final argsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;",
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

.field private final pollerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/polling/IntentStatusPoller;",
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

.field private final timeProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;",
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
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/polling/IntentStatusPoller;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;",
            ">;",
            "LY94<",
            "LSC0;",
            ">;",
            "LY94<",
            "Landroidx/lifecycle/p;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory;->argsProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory;->pollerProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory;->timeProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory;->dispatcherProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory;->savedStateHandleProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/polling/IntentStatusPoller;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;",
            ">;",
            "LY94<",
            "LSC0;",
            ">;",
            "LY94<",
            "Landroidx/lifecycle/p;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory;"
        }
    .end annotation

    new-instance v6, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static newInstance(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;Lcom/stripe/android/polling/IntentStatusPoller;Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;LSC0;Landroidx/lifecycle/p;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;
    .locals 7

    new-instance v6, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;Lcom/stripe/android/polling/IntentStatusPoller;Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;LSC0;Landroidx/lifecycle/p;)V

    return-object v6
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory;->argsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory;->pollerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/polling/IntentStatusPoller;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory;->timeProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory;->dispatcherProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LSC0;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory;->savedStateHandleProvider:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/lifecycle/p;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory;->newInstance(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;Lcom/stripe/android/polling/IntentStatusPoller;Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;LSC0;Landroidx/lifecycle/p;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel_Factory;->get()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;

    move-result-object v0

    return-object v0
.end method
