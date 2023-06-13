.class final Lcom/uber/autodispose/AutoDisposingSubscriberImpl;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/observers/AutoDisposingSubscriber;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lcom/uber/autodispose/observers/AutoDisposingSubscriber<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "LoT5;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/reactivex/disposables/c;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lcom/uber/autodispose/AtomicThrowable;

.field public final e:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "LoT5;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/concurrent/atomic/AtomicLong;

.field public final g:Lio/reactivex/h;

.field public final h:LhT5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LhT5<",
            "-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/h;LhT5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/h;",
            "LhT5<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->c:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Lcom/uber/autodispose/AtomicThrowable;

    invoke-direct {v0}, Lcom/uber/autodispose/AtomicThrowable;-><init>()V

    iput-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->d:Lcom/uber/autodispose/AtomicThrowable;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->e:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->f:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object p1, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->g:Lio/reactivex/h;

    iput-object p2, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->h:LhT5;

    return-void
.end method


# virtual methods
.method public a(LoT5;)V
    .locals 3

    new-instance v0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl$1;

    invoke-direct {v0, p0}, Lcom/uber/autodispose/AutoDisposingSubscriberImpl$1;-><init>(Lcom/uber/autodispose/AutoDisposingSubscriberImpl;)V

    iget-object v1, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->c:Ljava/util/concurrent/atomic/AtomicReference;

    const-class v2, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;

    invoke-static {v1, v0, v2}, Lcom/uber/autodispose/AutoDisposeEndConsumerHelper;->d(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/disposables/c;Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->h:LhT5;

    invoke-interface {v1, p0}, LhT5;->a(LoT5;)V

    iget-object v1, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->g:Lio/reactivex/h;

    invoke-interface {v1, v0}, Lio/reactivex/h;->g(Lio/reactivex/f;)V

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1, v2}, Lcom/uber/autodispose/AutoDisposeEndConsumerHelper;->c(Ljava/util/concurrent/atomic/AtomicReference;LoT5;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->e:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->f:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, v1, p1}, Lcom/uber/autodispose/AutoSubscriptionHelper;->c(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicLong;LoT5;)Z

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lcom/uber/autodispose/AutoDisposableHelper;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lcom/uber/autodispose/AutoSubscriptionHelper;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public dispose()V
    .locals 0

    invoke-virtual {p0}, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->cancel()V

    return-void
.end method

.method public e()Z
    .locals 2

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/uber/autodispose/AutoSubscriptionHelper;->b:Lcom/uber/autodispose/AutoSubscriptionHelper;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o(J)V
    .locals 2

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->e:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->f:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, v1, p1, p2}, Lcom/uber/autodispose/AutoSubscriptionHelper;->b(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicLong;J)V

    return-void
.end method

.method public onComplete()V
    .locals 2

    invoke-virtual {p0}, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->b:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/uber/autodispose/AutoSubscriptionHelper;->b:Lcom/uber/autodispose/AutoSubscriptionHelper;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lcom/uber/autodispose/AutoDisposableHelper;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->h:LhT5;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->d:Lcom/uber/autodispose/AtomicThrowable;

    invoke-static {v0, p0, v1}, Lcom/uber/autodispose/HalfSerializer;->a(LhT5;Ljava/util/concurrent/atomic/AtomicInteger;Lcom/uber/autodispose/AtomicThrowable;)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    invoke-virtual {p0}, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->b:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/uber/autodispose/AutoSubscriptionHelper;->b:Lcom/uber/autodispose/AutoSubscriptionHelper;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lcom/uber/autodispose/AutoDisposableHelper;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->h:LhT5;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->d:Lcom/uber/autodispose/AtomicThrowable;

    invoke-static {v0, p1, p0, v1}, Lcom/uber/autodispose/HalfSerializer;->c(LhT5;Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Lcom/uber/autodispose/AtomicThrowable;)V

    :cond_0
    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->h:LhT5;

    iget-object v1, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->d:Lcom/uber/autodispose/AtomicThrowable;

    invoke-static {v0, p1, p0, v1}, Lcom/uber/autodispose/HalfSerializer;->e(LhT5;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicInteger;Lcom/uber/autodispose/AtomicThrowable;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->b:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lcom/uber/autodispose/AutoSubscriptionHelper;->b:Lcom/uber/autodispose/AutoSubscriptionHelper;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Lcom/uber/autodispose/AutoDisposableHelper;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    :cond_0
    return-void
.end method

.method public w()LhT5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LhT5<",
            "-TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposingSubscriberImpl;->h:LhT5;

    return-object v0
.end method
