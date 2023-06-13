.class public LPZ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ScheduledExecutorService;


# instance fields
.field public final b:Ljava/util/concurrent/ExecutorService;

.field public final c:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPZ0;->b:Ljava/util/concurrent/ExecutorService;

    iput-object p2, p0, LPZ0;->c:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public static synthetic a(LPZ0;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;LQZ0$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    invoke-direct/range {p0 .. p5}, LPZ0;->o(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;LQZ0$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Runnable;LQZ0$b;)V
    .locals 0

    invoke-static {p0, p1}, LPZ0;->m(Ljava/lang/Runnable;LQZ0$b;)V

    return-void
.end method

.method public static synthetic c(LPZ0;Ljava/lang/Runnable;LQZ0$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LPZ0;->n(Ljava/lang/Runnable;LQZ0$b;)V

    return-void
.end method

.method public static synthetic d(LPZ0;Ljava/util/concurrent/Callable;LQZ0$b;)Ljava/util/concurrent/Future;
    .locals 0

    invoke-direct {p0, p1, p2}, LPZ0;->q(Ljava/util/concurrent/Callable;LQZ0$b;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LPZ0;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;LQZ0$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    invoke-direct/range {p0 .. p7}, LPZ0;->w(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;LQZ0$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LPZ0;Ljava/lang/Runnable;LQZ0$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LPZ0;->u(Ljava/lang/Runnable;LQZ0$b;)V

    return-void
.end method

.method public static synthetic g(LPZ0;Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;LQZ0$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    invoke-direct/range {p0 .. p5}, LPZ0;->r(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;LQZ0$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/Runnable;LQZ0$b;)V
    .locals 0

    invoke-static {p0, p1}, LPZ0;->t(Ljava/lang/Runnable;LQZ0$b;)V

    return-void
.end method

.method public static synthetic i(LPZ0;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;LQZ0$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    invoke-direct/range {p0 .. p7}, LPZ0;->y(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;LQZ0$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/Runnable;LQZ0$b;)V
    .locals 0

    invoke-static {p0, p1}, LPZ0;->z(Ljava/lang/Runnable;LQZ0$b;)V

    return-void
.end method

.method public static synthetic k(LPZ0;Ljava/lang/Runnable;LQZ0$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LPZ0;->x(Ljava/lang/Runnable;LQZ0$b;)V

    return-void
.end method

.method public static synthetic l(Ljava/util/concurrent/Callable;LQZ0$b;)V
    .locals 0

    invoke-static {p0, p1}, LPZ0;->p(Ljava/util/concurrent/Callable;LQZ0$b;)V

    return-void
.end method

.method public static synthetic m(Ljava/lang/Runnable;LQZ0$b;)V
    .locals 0

    :try_start_0
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    const/4 p0, 0x0

    invoke-interface {p1, p0}, LQZ0$b;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-interface {p1, p0}, LQZ0$b;->a(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic n(Ljava/lang/Runnable;LQZ0$b;)V
    .locals 2

    iget-object v0, p0, LPZ0;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, LEZ0;

    invoke-direct {v1, p1, p2}, LEZ0;-><init>(Ljava/lang/Runnable;LQZ0$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic o(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;LQZ0$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 2

    iget-object v0, p0, LPZ0;->c:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, LLZ0;

    invoke-direct {v1, p0, p1, p5}, LLZ0;-><init>(LPZ0;Ljava/lang/Runnable;LQZ0$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic p(Ljava/util/concurrent/Callable;LQZ0$b;)V
    .locals 0

    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, LQZ0$b;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-interface {p1, p0}, LQZ0$b;->a(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic q(Ljava/util/concurrent/Callable;LQZ0$b;)Ljava/util/concurrent/Future;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LPZ0;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, LNZ0;

    invoke-direct {v1, p1, p2}, LNZ0;-><init>(Ljava/util/concurrent/Callable;LQZ0$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method

.method private synthetic r(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;LQZ0$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 2

    iget-object v0, p0, LPZ0;->c:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, LMZ0;

    invoke-direct {v1, p0, p1, p5}, LMZ0;-><init>(LPZ0;Ljava/util/concurrent/Callable;LQZ0$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic t(Ljava/lang/Runnable;LQZ0$b;)V
    .locals 0

    :try_start_0
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    invoke-interface {p1, p0}, LQZ0$b;->a(Ljava/lang/Throwable;)V

    throw p0
.end method

.method private synthetic u(Ljava/lang/Runnable;LQZ0$b;)V
    .locals 2

    iget-object v0, p0, LPZ0;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, LOZ0;

    invoke-direct {v1, p1, p2}, LOZ0;-><init>(Ljava/lang/Runnable;LQZ0$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic w(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;LQZ0$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 7

    iget-object v0, p0, LPZ0;->c:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, LJZ0;

    invoke-direct {v1, p0, p1, p7}, LJZ0;-><init>(LPZ0;Ljava/lang/Runnable;LQZ0$b;)V

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method

.method private synthetic x(Ljava/lang/Runnable;LQZ0$b;)V
    .locals 2

    iget-object v0, p0, LPZ0;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, LFZ0;

    invoke-direct {v1, p1, p2}, LFZ0;-><init>(Ljava/lang/Runnable;LQZ0$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic y(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;LQZ0$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 7

    iget-object v0, p0, LPZ0;->c:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, LKZ0;

    invoke-direct {v1, p0, p1, p7}, LKZ0;-><init>(LPZ0;Ljava/lang/Runnable;LQZ0$b;)V

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic z(Ljava/lang/Runnable;LQZ0$b;)V
    .locals 0

    :try_start_0
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-interface {p1, p0}, LQZ0$b;->a(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    iget-object v0, p0, LPZ0;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1, p2, p3}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    return p1
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, LPZ0;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public invokeAll(Ljava/util/Collection;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/concurrent/Callable<",
            "TT;>;>;)",
            "Ljava/util/List<",
            "Ljava/util/concurrent/Future<",
            "TT;>;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    iget-object v0, p0, LPZ0;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->invokeAll(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public invokeAll(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/concurrent/Callable<",
            "TT;>;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/concurrent/Future<",
            "TT;>;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    iget-object v0, p0, LPZ0;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1, p2, p3, p4}, Ljava/util/concurrent/ExecutorService;->invokeAll(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public invokeAny(Ljava/util/Collection;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/concurrent/Callable<",
            "TT;>;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    iget-object v0, p0, LPZ0;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->invokeAny(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invokeAny(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/concurrent/Callable<",
            "TT;>;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;,
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    iget-object v0, p0, LPZ0;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1, p2, p3, p4}, Ljava/util/concurrent/ExecutorService;->invokeAny(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isShutdown()Z
    .locals 1

    iget-object v0, p0, LPZ0;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    return v0
.end method

.method public isTerminated()Z
    .locals 1

    iget-object v0, p0, LPZ0;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    move-result v0

    return v0
.end method

.method public schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation

    new-instance v0, LQZ0;

    new-instance v7, LGZ0;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, LGZ0;-><init>(LPZ0;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V

    invoke-direct {v0, v7}, LQZ0;-><init>(LQZ0$c;)V

    return-object v0
.end method

.method public schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TV;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Ljava/util/concurrent/ScheduledFuture<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, LQZ0;

    new-instance v7, LDZ0;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, LDZ0;-><init>(LPZ0;Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)V

    invoke-direct {v0, v7}, LQZ0;-><init>(LQZ0$c;)V

    return-object v0
.end method

.method public scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "JJ",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation

    new-instance v0, LQZ0;

    new-instance v9, LIZ0;

    move-object v1, v9

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    move-object/from16 v8, p6

    invoke-direct/range {v1 .. v8}, LIZ0;-><init>(LPZ0;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)V

    invoke-direct {v0, v9}, LQZ0;-><init>(LQZ0$c;)V

    return-object v0
.end method

.method public scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "JJ",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation

    new-instance v0, LQZ0;

    new-instance v9, LHZ0;

    move-object v1, v9

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    move-object/from16 v8, p6

    invoke-direct/range {v1 .. v8}, LHZ0;-><init>(LPZ0;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)V

    invoke-direct {v0, v9}, LQZ0;-><init>(LQZ0$c;)V

    return-object v0
.end method

.method public shutdown()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Shutting down is not allowed."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public shutdownNow()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Shutting down is not allowed."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")",
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, LPZ0;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method

.method public submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Runnable;",
            "TT;)",
            "Ljava/util/concurrent/Future<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LPZ0;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method

.method public submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Ljava/util/concurrent/Future<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LPZ0;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method
