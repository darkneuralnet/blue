.class final Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable$ArchLifecycleObserver;
.super Lcom/uber/autodispose/android/internal/MainThreadDisposable;
.source "SourceFile"

# interfaces
.implements LFq2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ArchLifecycleObserver"
.end annotation


# instance fields
.field public final c:Landroidx/lifecycle/f;

.field public final d:Lio/reactivex/D;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/D<",
            "-",
            "Landroidx/lifecycle/f$a;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Landroidx/lifecycle/f$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/lifecycle/f;Lio/reactivex/D;Lio/reactivex/subjects/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/f;",
            "Lio/reactivex/D<",
            "-",
            "Landroidx/lifecycle/f$a;",
            ">;",
            "Lio/reactivex/subjects/a<",
            "Landroidx/lifecycle/f$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/uber/autodispose/android/internal/MainThreadDisposable;-><init>()V

    iput-object p1, p0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable$ArchLifecycleObserver;->c:Landroidx/lifecycle/f;

    iput-object p2, p0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable$ArchLifecycleObserver;->d:Lio/reactivex/D;

    iput-object p3, p0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable$ArchLifecycleObserver;->e:Lio/reactivex/subjects/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable$ArchLifecycleObserver;->c:Landroidx/lifecycle/f;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/f;->d(LFq2;)V

    return-void
.end method

.method public onStateChange(LLifecycleOwner;Landroidx/lifecycle/f$a;)V
    .locals 0
    .annotation runtime Landroidx/lifecycle/l;
        value = .enum Landroidx/lifecycle/f$a;->ON_ANY:Landroidx/lifecycle/f$a;
    .end annotation

    invoke-virtual {p0}, Lcom/uber/autodispose/android/internal/MainThreadDisposable;->e()Z

    move-result p1

    if-nez p1, :cond_2

    sget-object p1, Landroidx/lifecycle/f$a;->ON_CREATE:Landroidx/lifecycle/f$a;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable$ArchLifecycleObserver;->e:Lio/reactivex/subjects/a;

    invoke-virtual {p1}, Lio/reactivex/subjects/a;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eq p1, p2, :cond_1

    :cond_0
    iget-object p1, p0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable$ArchLifecycleObserver;->e:Lio/reactivex/subjects/a;

    invoke-virtual {p1, p2}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    :cond_1
    iget-object p1, p0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable$ArchLifecycleObserver;->d:Lio/reactivex/D;

    invoke-interface {p1, p2}, Lio/reactivex/D;->onNext(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
