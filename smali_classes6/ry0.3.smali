.class public Lry0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqy0;
.implements Lyy0;


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Lw41;

.field public d:Lio/reactivex/observers/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/observers/d<",
            "Lcom/polidea/rxandroidble2/exceptions/BleException;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ldi3;

.field public final f:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field public volatile g:Z

.field public h:Lcom/polidea/rxandroidble2/exceptions/BleException;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lw41;Ljava/util/concurrent/ExecutorService;Lio/reactivex/E;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ldi3;

    invoke-direct {v0}, Ldi3;-><init>()V

    iput-object v0, p0, Lry0;->e:Ldi3;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lry0;->g:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lry0;->h:Lcom/polidea/rxandroidble2/exceptions/BleException;

    iput-object p1, p0, Lry0;->b:Ljava/lang/String;

    iput-object p2, p0, Lry0;->c:Lw41;

    new-instance p2, Lry0$a;

    invoke-direct {p2, p0, p4, p1}, Lry0$a;-><init>(Lry0;Lio/reactivex/E;Ljava/lang/String;)V

    invoke-interface {p3, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    iput-object p1, p0, Lry0;->f:Ljava/util/concurrent/Future;

    return-void
.end method


# virtual methods
.method public declared-synchronized a(LYh3;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYh3<",
            "TT;>;)",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lry0;->g:Z

    if-nez v0, :cond_0

    iget-object p1, p0, Lry0;->h:Lcom/polidea/rxandroidble2/exceptions/BleException;

    invoke-static {p1}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    :try_start_1
    new-instance v0, Lry0$b;

    invoke-direct {v0, p0, p1}, Lry0$b;-><init>(Lry0;LYh3;)V

    invoke-static {v0}, Lio/reactivex/Observable;->create(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lry0;->d:Lio/reactivex/observers/d;

    invoke-virtual {v0}, Lio/reactivex/observers/d;->dispose()V

    const/4 v0, 0x0

    iput-object v0, p0, Lry0;->d:Lio/reactivex/observers/d;

    new-instance v0, Lcom/polidea/rxandroidble2/exceptions/BleDisconnectedException;

    iget-object v1, p0, Lry0;->b:Ljava/lang/String;

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Lcom/polidea/rxandroidble2/exceptions/BleDisconnectedException;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p0, v0}, Lry0;->e(Lcom/polidea/rxandroidble2/exceptions/BleException;)V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lry0;->c:Lw41;

    invoke-interface {v0}, Lw41;->a()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lry0$c;

    invoke-direct {v1, p0}, Lry0$c;-><init>(Lry0;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->subscribeWith(Lio/reactivex/D;)Lio/reactivex/D;

    move-result-object v0

    check-cast v0, Lio/reactivex/observers/d;

    iput-object v0, p0, Lry0;->d:Lio/reactivex/observers/d;

    return-void
.end method

.method public declared-synchronized d()V
    .locals 2

    monitor-enter p0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lry0;->e:Ldi3;

    invoke-virtual {v0}, Ldi3;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lry0;->e:Ldi3;

    invoke-virtual {v0}, Ldi3;->e()LYi1;

    move-result-object v0

    iget-object v0, v0, LYi1;->d:Lio/reactivex/y;

    iget-object v1, p0, Lry0;->h:Lcom/polidea/rxandroidble2/exceptions/BleException;

    invoke-interface {v0, v1}, Lio/reactivex/y;->c(Ljava/lang/Throwable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized e(Lcom/polidea/rxandroidble2/exceptions/BleException;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lry0;->h:Lcom/polidea/rxandroidble2/exceptions/BleException;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    const-string v0, "Connection operations queue to be terminated (%s)"

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lry0;->b:Ljava/lang/String;

    invoke-static {v3}, LOx2;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1, v0, v2}, Lye5;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v4, p0, Lry0;->g:Z

    iput-object p1, p0, Lry0;->h:Lcom/polidea/rxandroidble2/exceptions/BleException;

    iget-object p1, p0, Lry0;->f:Ljava/util/concurrent/Future;

    invoke-interface {p1, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
