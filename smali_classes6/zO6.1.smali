.class public final LzO6;
.super LXY5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResultT:",
        "Ljava/lang/Object;",
        ">",
        "LXY5<",
        "TResultT;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:LRN6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LRN6<",
            "TResultT;>;"
        }
    .end annotation
.end field

.field public c:Z

.field public d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TResultT;"
        }
    .end annotation
.end field

.field public e:Ljava/lang/Exception;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LXY5;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LzO6;->a:Ljava/lang/Object;

    new-instance v0, LRN6;

    invoke-direct {v0}, LRN6;-><init>()V

    iput-object v0, p0, LzO6;->b:LRN6;

    return-void
.end method


# virtual methods
.method public final a(Lkf3;)LXY5;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkf3<",
            "TResultT;>;)",
            "LXY5<",
            "TResultT;>;"
        }
    .end annotation

    sget-object v0, LoZ5;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, LzO6;->b:LRN6;

    new-instance v2, LYK6;

    invoke-direct {v2, v0, p1}, LYK6;-><init>(Ljava/util/concurrent/Executor;Lkf3;)V

    invoke-virtual {v1, v2}, LRN6;->a(LGN6;)V

    invoke-virtual {p0}, LzO6;->n()V

    return-object p0
.end method

.method public final b(Ljava/util/concurrent/Executor;LOg3;)LXY5;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "LOg3;",
            ")",
            "LXY5<",
            "TResultT;>;"
        }
    .end annotation

    iget-object v0, p0, LzO6;->b:LRN6;

    new-instance v1, LVM6;

    invoke-direct {v1, p1, p2}, LVM6;-><init>(Ljava/util/concurrent/Executor;LOg3;)V

    invoke-virtual {v0, v1}, LRN6;->a(LGN6;)V

    invoke-virtual {p0}, LzO6;->n()V

    return-object p0
.end method

.method public final c(Ljava/util/concurrent/Executor;Lnh3;)LXY5;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lnh3<",
            "-TResultT;>;)",
            "LXY5<",
            "TResultT;>;"
        }
    .end annotation

    iget-object v0, p0, LzO6;->b:LRN6;

    new-instance v1, LxN6;

    invoke-direct {v1, p1, p2}, LxN6;-><init>(Ljava/util/concurrent/Executor;Lnh3;)V

    invoke-virtual {v0, v1}, LRN6;->a(LGN6;)V

    invoke-virtual {p0}, LzO6;->n()V

    return-object p0
.end method

.method public final d()Ljava/lang/Exception;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, LzO6;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LzO6;->e:Ljava/lang/Exception;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final e()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResultT;"
        }
    .end annotation

    iget-object v0, p0, LzO6;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LzO6;->l()V

    iget-object v1, p0, LzO6;->e:Ljava/lang/Exception;

    if-nez v1, :cond_0

    iget-object v1, p0, LzO6;->d:Ljava/lang/Object;

    monitor-exit v0

    return-object v1

    :cond_0
    new-instance v2, Lcom/google/android/play/core/tasks/RuntimeExecutionException;

    invoke-direct {v2, v1}, Lcom/google/android/play/core/tasks/RuntimeExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final f()Z
    .locals 2

    iget-object v0, p0, LzO6;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LzO6;->c:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final g()Z
    .locals 3

    iget-object v0, p0, LzO6;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LzO6;->c:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, LzO6;->e:Ljava/lang/Exception;

    if-nez v1, :cond_0

    const/4 v2, 0x1

    :cond_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResultT;)V"
        }
    .end annotation

    iget-object v0, p0, LzO6;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LzO6;->m()V

    const/4 v1, 0x1

    iput-boolean v1, p0, LzO6;->c:Z

    iput-object p1, p0, LzO6;->d:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LzO6;->b:LRN6;

    invoke-virtual {p1, p0}, LRN6;->b(LXY5;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final i(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResultT;)Z"
        }
    .end annotation

    iget-object v0, p0, LzO6;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LzO6;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, LzO6;->c:Z

    iput-object p1, p0, LzO6;->d:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LzO6;->b:LRN6;

    invoke-virtual {p1, p0}, LRN6;->b(LXY5;)V

    return v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final j(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, LzO6;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LzO6;->m()V

    const/4 v1, 0x1

    iput-boolean v1, p0, LzO6;->c:Z

    iput-object p1, p0, LzO6;->e:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LzO6;->b:LRN6;

    invoke-virtual {p1, p0}, LRN6;->b(LXY5;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final k(Ljava/lang/Exception;)Z
    .locals 2

    iget-object v0, p0, LzO6;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LzO6;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, LzO6;->c:Z

    iput-object p1, p0, LzO6;->e:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LzO6;->b:LRN6;

    invoke-virtual {p1, p0}, LRN6;->b(LXY5;)V

    return v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final l()V
    .locals 2

    iget-boolean v0, p0, LzO6;->c:Z

    const-string v1, "Task is not yet complete"

    invoke-static {v0, v1}, LMK6;->c(ZLjava/lang/Object;)V

    return-void
.end method

.method public final m()V
    .locals 2

    iget-boolean v0, p0, LzO6;->c:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Task is already complete"

    invoke-static {v0, v1}, LMK6;->c(ZLjava/lang/Object;)V

    return-void
.end method

.method public final n()V
    .locals 2

    iget-object v0, p0, LzO6;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LzO6;->c:Z

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LzO6;->b:LRN6;

    invoke-virtual {v0, p0}, LRN6;->b(LXY5;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
