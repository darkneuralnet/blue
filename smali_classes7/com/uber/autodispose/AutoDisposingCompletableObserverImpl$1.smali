.class Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl$1;
.super Lio/reactivex/observers/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl;->onSubscribe(Lio/reactivex/disposables/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl;


# direct methods
.method public constructor <init>(Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl$1;->c:Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl;

    invoke-direct {p0}, Lio/reactivex/observers/c;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 2

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl$1;->c:Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl;

    iget-object v0, v0, Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl;->c:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/uber/autodispose/AutoDisposableHelper;->b:Lcom/uber/autodispose/AutoDisposableHelper;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl$1;->c:Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl;

    iget-object v0, v0, Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lcom/uber/autodispose/AutoDisposableHelper;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl$1;->c:Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl;

    iget-object v0, v0, Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl;->c:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/uber/autodispose/AutoDisposableHelper;->b:Lcom/uber/autodispose/AutoDisposableHelper;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl$1;->c:Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl;

    invoke-virtual {v0, p1}, Lcom/uber/autodispose/AutoDisposingCompletableObserverImpl;->onError(Ljava/lang/Throwable;)V

    return-void
.end method