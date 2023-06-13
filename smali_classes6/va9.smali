.class public final Lva9;
.super LJa9;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Iterable;)Lha9;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+",
            "LMb9<",
            "+TV;>;>;)",
            "Lha9<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lha9;

    invoke-static {p0}, LZP8;->x(Ljava/lang/Iterable;)LZP8;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0, v1}, Lha9;-><init>(ZLZP8;LT99;)V

    return-object v0
.end method

.method public static b(Ljava/lang/Iterable;)Lha9;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+",
            "LMb9<",
            "+TV;>;>;)",
            "Lha9<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lha9;

    invoke-static {p0}, LZP8;->x(Ljava/lang/Iterable;)LZP8;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v2, p0, v1}, Lha9;-><init>(ZLZP8;LT99;)V

    return-object v0
.end method

.method public static c(LMb9;Ljava/lang/Class;Lk69;Ljava/util/concurrent/Executor;)LMb9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            "X:",
            "Ljava/lang/Throwable;",
            ">(",
            "LMb9<",
            "+TV;>;",
            "Ljava/lang/Class<",
            "TX;>;",
            "Lk69<",
            "-TX;+TV;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "LMb9<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, LP29;

    invoke-direct {v0, p0, p1, p2}, LP29;-><init>(LMb9;Ljava/lang/Class;Lk69;)V

    invoke-static {p3, v0}, LHc9;->d(Ljava/util/concurrent/Executor;Lv39;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p0, v0, p1}, LMb9;->o(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static d()LMb9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">()",
            "LMb9<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, LQa9;

    invoke-direct {v0}, LQa9;-><init>()V

    return-object v0
.end method

.method public static e(Ljava/lang/Throwable;)LMb9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Throwable;",
            ")",
            "LMb9<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, LXa9;

    invoke-direct {v0, p0}, LXa9;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static f(Ljava/lang/Object;)LMb9;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(TV;)",
            "LMb9<",
            "TV;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    sget-object p0, Leb9;->c:LMb9;

    return-object p0

    :cond_0
    new-instance v0, Leb9;

    invoke-direct {v0, p0}, Leb9;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static g()LMb9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LMb9<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    sget-object v0, Leb9;->c:LMb9;

    return-object v0
.end method

.method public static h(LMb9;)LMb9;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "LMb9<",
            "TV;>;)",
            "LMb9<",
            "TV;>;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Loa9;

    invoke-direct {v0, p0}, Loa9;-><init>(LMb9;)V

    sget-object v1, Ll79;->b:Ll79;

    invoke-interface {p0, v0, v1}, LMb9;->o(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static i(Lc69;Ljava/util/concurrent/Executor;)LMb9;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<O:",
            "Ljava/lang/Object;",
            ">(",
            "Lc69<",
            "TO;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "LMb9<",
            "TO;>;"
        }
    .end annotation

    new-instance p1, Lke9;

    invoke-direct {p1, p0}, Lke9;-><init>(Lc69;)V

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-object p1
.end method

.method public static j(LMb9;LYH8;Ljava/util/concurrent/Executor;)LMb9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "LMb9<",
            "TI;>;",
            "LYH8<",
            "-TI;+TO;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "LMb9<",
            "TO;>;"
        }
    .end annotation

    sget v0, Lf49;->k:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, LW39;

    invoke-direct {v0, p0, p1}, LW39;-><init>(LMb9;LYH8;)V

    invoke-static {p2, v0}, LHc9;->d(Ljava/util/concurrent/Executor;Lv39;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p0, v0, p1}, LMb9;->o(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static k(LMb9;Lk69;Ljava/util/concurrent/Executor;)LMb9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "LMb9<",
            "TI;>;",
            "Lk69<",
            "-TI;+TO;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "LMb9<",
            "TO;>;"
        }
    .end annotation

    sget v0, Lf49;->k:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, LN39;

    invoke-direct {v0, p0, p1}, LN39;-><init>(LMb9;Lk69;)V

    invoke-static {p2, v0}, LHc9;->d(Ljava/util/concurrent/Executor;Lv39;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p0, v0, p1}, LMb9;->o(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static l(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Future<",
            "TV;>;)TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    :goto_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    return-object p0

    :catchall_0
    move-exception p0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :goto_1
    throw p0

    :catch_0
    move v1, v2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v1

    const-string p0, "Future was expected to be done: %s"

    invoke-static {p0, v2}, LeM8;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static m(LMb9;LM99;Ljava/util/concurrent/Executor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "LMb9<",
            "TV;>;",
            "LM99<",
            "-TV;>;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Laa9;

    invoke-direct {v0, p0, p1}, Laa9;-><init>(Ljava/util/concurrent/Future;LM99;)V

    invoke-interface {p0, v0, p2}, LMb9;->o(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method
