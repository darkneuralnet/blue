.class public final Lio/reactivex/internal/operators/observable/e0;
.super Lio/reactivex/Observable;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/Observable<",
        "TT;>;",
        "Ljava/util/concurrent/Callable<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/reactivex/Observable;-><init>()V

    iput-object p1, p0, Lio/reactivex/internal/operators/observable/e0;->b:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/internal/operators/observable/e0;->b:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The callable returned a null value"

    invoke-static {v0, v1}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public subscribeActual(Lio/reactivex/D;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/D<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lio/reactivex/internal/observers/l;

    invoke-direct {v0, p1}, Lio/reactivex/internal/observers/l;-><init>(Lio/reactivex/D;)V

    invoke-interface {p1, v0}, Lio/reactivex/D;->onSubscribe(Lio/reactivex/disposables/c;)V

    invoke-virtual {v0}, Lio/reactivex/internal/observers/l;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v1, p0, Lio/reactivex/internal/operators/observable/e0;->b:Ljava/util/concurrent/Callable;

    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Callable returned null"

    invoke-static {v1, v2}, Lio/reactivex/internal/functions/b;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, p1}, Lio/reactivex/internal/observers/l;->c(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lio/reactivex/exceptions/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Lio/reactivex/internal/observers/l;->e()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Lio/reactivex/D;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lio/reactivex/plugins/a;->u(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
