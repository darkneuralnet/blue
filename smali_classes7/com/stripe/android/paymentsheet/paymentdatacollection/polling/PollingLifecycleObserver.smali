.class final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingLifecycleObserver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVX0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingLifecycleObserver;",
        "LVX0;",
        "LLifecycleOwner;",
        "owner",
        "",
        "onStart",
        "onStop",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;",
        "viewModel",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;)V",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final viewModel:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;)V
    .locals 1

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingLifecycleObserver;->viewModel:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;

    return-void
.end method


# virtual methods
.method public bridge synthetic onCreate(LLifecycleOwner;)V
    .locals 0

    invoke-super {p0, p1}, LVX0;->onCreate(LLifecycleOwner;)V

    return-void
.end method

.method public bridge synthetic onDestroy(LLifecycleOwner;)V
    .locals 0

    invoke-super {p0, p1}, LVX0;->onDestroy(LLifecycleOwner;)V

    return-void
.end method

.method public bridge synthetic onPause(LLifecycleOwner;)V
    .locals 0

    invoke-super {p0, p1}, LVX0;->onPause(LLifecycleOwner;)V

    return-void
.end method

.method public bridge synthetic onResume(LLifecycleOwner;)V
    .locals 0

    invoke-super {p0, p1}, LVX0;->onResume(LLifecycleOwner;)V

    return-void
.end method

.method public onStart(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onStart(LLifecycleOwner;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingLifecycleObserver;->viewModel:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->resumePolling()V

    return-void
.end method

.method public onStop(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingLifecycleObserver;->viewModel:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->pausePolling()V

    invoke-super {p0, p1}, LVX0;->onStop(LLifecycleOwner;)V

    return-void
.end method
