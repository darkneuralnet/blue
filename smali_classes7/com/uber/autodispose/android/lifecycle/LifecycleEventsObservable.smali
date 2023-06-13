.class Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;
.super Lio/reactivex/Observable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable$ArchLifecycleObserver;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/Observable<",
        "Landroidx/lifecycle/f$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Landroidx/lifecycle/f;

.field public final c:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Landroidx/lifecycle/f$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/lifecycle/f;)V
    .locals 1

    invoke-direct {p0}, Lio/reactivex/Observable;-><init>()V

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object v0

    iput-object v0, p0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;->c:Lio/reactivex/subjects/a;

    iput-object p1, p0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;->b:Landroidx/lifecycle/f;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    sget-object v0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable$1;->a:[I

    iget-object v1, p0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;->b:Landroidx/lifecycle/f;

    invoke-virtual {v1}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    sget-object v0, Landroidx/lifecycle/f$a;->ON_DESTROY:Landroidx/lifecycle/f$a;

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/lifecycle/f$a;->ON_RESUME:Landroidx/lifecycle/f$a;

    goto :goto_0

    :cond_1
    sget-object v0, Landroidx/lifecycle/f$a;->ON_START:Landroidx/lifecycle/f$a;

    goto :goto_0

    :cond_2
    sget-object v0, Landroidx/lifecycle/f$a;->ON_CREATE:Landroidx/lifecycle/f$a;

    :goto_0
    iget-object v1, p0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;->c:Lio/reactivex/subjects/a;

    invoke-virtual {v1, v0}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public c()Landroidx/lifecycle/f$a;
    .locals 1

    iget-object v0, p0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;->c:Lio/reactivex/subjects/a;

    invoke-virtual {v0}, Lio/reactivex/subjects/a;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/f$a;

    return-object v0
.end method

.method public subscribeActual(Lio/reactivex/D;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-",
            "Landroidx/lifecycle/f$a;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable$ArchLifecycleObserver;

    iget-object v1, p0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;->b:Landroidx/lifecycle/f;

    iget-object v2, p0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;->c:Lio/reactivex/subjects/a;

    invoke-direct {v0, v1, p1, v2}, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable$ArchLifecycleObserver;-><init>(Landroidx/lifecycle/f;Lio/reactivex/D;Lio/reactivex/subjects/a;)V

    invoke-interface {p1, v0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-static {}, Lcom/uber/autodispose/android/internal/AutoDisposeAndroidUtil;->b()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Lifecycles can only be bound to on the main thread!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;->b:Landroidx/lifecycle/f;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/f;->a(LFq2;)V

    invoke-virtual {v0}, Lcom/uber/autodispose/android/internal/MainThreadDisposable;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;->b:Landroidx/lifecycle/f;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/f;->d(LFq2;)V

    :cond_1
    return-void
.end method
