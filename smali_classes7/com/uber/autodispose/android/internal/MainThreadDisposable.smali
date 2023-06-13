.class public abstract Lcom/uber/autodispose/android/internal/MainThreadDisposable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/disposables/c;


# instance fields
.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/uber/autodispose/android/internal/MainThreadDisposable;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public final dispose()V
    .locals 3

    iget-object v0, p0, Lcom/uber/autodispose/android/internal/MainThreadDisposable;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/uber/autodispose/android/internal/AutoDisposeAndroidUtil;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/uber/autodispose/android/internal/MainThreadDisposable;->a()V

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    new-instance v1, LYG2;

    invoke-direct {v1, p0}, LYG2;-><init>(Lcom/uber/autodispose/android/internal/MainThreadDisposable;)V

    invoke-virtual {v0, v1}, Lio/reactivex/E;->d(Ljava/lang/Runnable;)Lio/reactivex/disposables/c;

    :cond_1
    :goto_0
    return-void
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lcom/uber/autodispose/android/internal/MainThreadDisposable;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method
