.class public Led4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/D;
.implements Lio/reactivex/functions/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lio/reactivex/D<",
        "TT;>;",
        "Lio/reactivex/functions/f;"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final c:Lio/reactivex/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/y<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final d:Ldd4;


# direct methods
.method public constructor <init>(Lio/reactivex/y;Ldd4;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "TT;>;",
            "Ldd4;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Led4;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Led4;->c:Lio/reactivex/y;

    iput-object p2, p0, Led4;->d:Ldd4;

    invoke-interface {p1, p0}, Lio/reactivex/y;->a(Lio/reactivex/functions/f;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized cancel()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Led4;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public onComplete()V
    .locals 1

    iget-object v0, p0, Led4;->d:Ldd4;

    invoke-interface {v0}, Ldd4;->release()V

    iget-object v0, p0, Led4;->c:Lio/reactivex/y;

    invoke-interface {v0}, Lio/reactivex/j;->onComplete()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Led4;->d:Ldd4;

    invoke-interface {v0}, Ldd4;->release()V

    iget-object v0, p0, Led4;->c:Lio/reactivex/y;

    invoke-interface {v0, p1}, Lio/reactivex/y;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Led4;->c:Lio/reactivex/y;

    invoke-interface {v0, p1}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 0

    return-void
.end method
