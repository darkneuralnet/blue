.class public LFd1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LrV0$b;
.implements Luj1$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFd1$c;,
        LFd1$d;,
        LFd1$e;,
        LFd1$b;,
        LFd1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LrV0$b<",
        "TR;>;",
        "Luj1$f;"
    }
.end annotation


# static fields
.field public static final A:LFd1$c;


# instance fields
.field public final b:LFd1$e;

.field public final c:LLP5;

.field public final d:LJd1$a;

.field public final e:LgY3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LgY3<",
            "LFd1<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final f:LFd1$c;

.field public final g:LGd1;

.field public final h:LKC1;

.field public final i:LKC1;

.field public final j:LKC1;

.field public final k:LKC1;

.field public final l:Ljava/util/concurrent/atomic/AtomicInteger;

.field public m:Lak2;

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:LVL4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LVL4<",
            "*>;"
        }
    .end annotation
.end field

.field public s:LZS0;

.field public t:Z

.field public u:Lcom/bumptech/glide/load/engine/GlideException;

.field public v:Z

.field public w:LJd1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LJd1<",
            "*>;"
        }
    .end annotation
.end field

.field public x:LrV0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LrV0<",
            "TR;>;"
        }
    .end annotation
.end field

.field public volatile y:Z

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LFd1$c;

    invoke-direct {v0}, LFd1$c;-><init>()V

    sput-object v0, LFd1;->A:LFd1$c;

    return-void
.end method

.method public constructor <init>(LKC1;LKC1;LKC1;LKC1;LGd1;LJd1$a;LgY3;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LKC1;",
            "LKC1;",
            "LKC1;",
            "LKC1;",
            "LGd1;",
            "LJd1$a;",
            "LgY3<",
            "LFd1<",
            "*>;>;)V"
        }
    .end annotation

    sget-object v8, LFd1;->A:LFd1$c;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v8}, LFd1;-><init>(LKC1;LKC1;LKC1;LKC1;LGd1;LJd1$a;LgY3;LFd1$c;)V

    return-void
.end method

.method public constructor <init>(LKC1;LKC1;LKC1;LKC1;LGd1;LJd1$a;LgY3;LFd1$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LKC1;",
            "LKC1;",
            "LKC1;",
            "LKC1;",
            "LGd1;",
            "LJd1$a;",
            "LgY3<",
            "LFd1<",
            "*>;>;",
            "LFd1$c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LFd1$e;

    invoke-direct {v0}, LFd1$e;-><init>()V

    iput-object v0, p0, LFd1;->b:LFd1$e;

    invoke-static {}, LLP5;->a()LLP5;

    move-result-object v0

    iput-object v0, p0, LFd1;->c:LLP5;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, LFd1;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, LFd1;->h:LKC1;

    iput-object p2, p0, LFd1;->i:LKC1;

    iput-object p3, p0, LFd1;->j:LKC1;

    iput-object p4, p0, LFd1;->k:LKC1;

    iput-object p5, p0, LFd1;->g:LGd1;

    iput-object p6, p0, LFd1;->d:LJd1$a;

    iput-object p7, p0, LFd1;->e:LgY3;

    iput-object p8, p0, LFd1;->f:LFd1$c;

    return-void
.end method


# virtual methods
.method public declared-synchronized a(LZL4;Ljava/util/concurrent/Executor;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LFd1;->c:LLP5;

    invoke-virtual {v0}, LLP5;->c()V

    iget-object v0, p0, LFd1;->b:LFd1$e;

    invoke-virtual {v0, p1, p2}, LFd1$e;->a(LZL4;Ljava/util/concurrent/Executor;)V

    iget-boolean v0, p0, LFd1;->t:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, LFd1;->k(I)V

    new-instance v0, LFd1$b;

    invoke-direct {v0, p0, p1}, LFd1$b;-><init>(LFd1;LZL4;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, LFd1;->v:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1}, LFd1;->k(I)V

    new-instance v0, LFd1$a;

    invoke-direct {v0, p0, p1}, LFd1$a;-><init>(LFd1;LZL4;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_1
    iget-boolean p1, p0, LFd1;->y:Z

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    const-string p1, "Cannot add callbacks to a cancelled EngineJob"

    invoke-static {v1, p1}, LzZ3;->a(ZLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public b(Lcom/bumptech/glide/load/engine/GlideException;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, LFd1;->u:Lcom/bumptech/glide/load/engine/GlideException;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, LFd1;->n()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public c(LVL4;LZS0;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVL4<",
            "TR;>;",
            "LZS0;",
            "Z)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, LFd1;->r:LVL4;

    iput-object p2, p0, LFd1;->s:LZS0;

    iput-boolean p3, p0, LFd1;->z:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, LFd1;->o()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public d(LrV0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LrV0<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p0}, LFd1;->j()LKC1;

    move-result-object v0

    invoke-virtual {v0, p1}, LKC1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public e()LLP5;
    .locals 1

    iget-object v0, p0, LFd1;->c:LLP5;

    return-object v0
.end method

.method public f(LZL4;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, LFd1;->u:Lcom/bumptech/glide/load/engine/GlideException;

    invoke-interface {p1, v0}, LZL4;->b(Lcom/bumptech/glide/load/engine/GlideException;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance v0, LJ80;

    invoke-direct {v0, p1}, LJ80;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public g(LZL4;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, LFd1;->w:LJd1;

    iget-object v1, p0, LFd1;->s:LZS0;

    iget-boolean v2, p0, LFd1;->z:Z

    invoke-interface {p1, v0, v1, v2}, LZL4;->c(LVL4;LZS0;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance v0, LJ80;

    invoke-direct {v0, p1}, LJ80;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public h()V
    .locals 2

    invoke-virtual {p0}, LFd1;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LFd1;->y:Z

    iget-object v0, p0, LFd1;->x:LrV0;

    invoke-virtual {v0}, LrV0;->b()V

    iget-object v0, p0, LFd1;->g:LGd1;

    iget-object v1, p0, LFd1;->m:Lak2;

    invoke-interface {v0, p0, v1}, LGd1;->b(LFd1;Lak2;)V

    return-void
.end method

.method public i()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LFd1;->c:LLP5;

    invoke-virtual {v0}, LLP5;->c()V

    invoke-virtual {p0}, LFd1;->m()Z

    move-result v0

    const-string v1, "Not yet complete!"

    invoke-static {v0, v1}, LzZ3;->a(ZLjava/lang/String;)V

    iget-object v0, p0, LFd1;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Can\'t decrement below 0"

    invoke-static {v1, v2}, LzZ3;->a(ZLjava/lang/String;)V

    if-nez v0, :cond_1

    iget-object v0, p0, LFd1;->w:LJd1;

    invoke-virtual {p0}, LFd1;->q()V

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LJd1;->g()V

    :cond_2
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final j()LKC1;
    .locals 1

    iget-boolean v0, p0, LFd1;->o:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LFd1;->j:LKC1;

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, LFd1;->p:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LFd1;->k:LKC1;

    goto :goto_0

    :cond_1
    iget-object v0, p0, LFd1;->i:LKC1;

    :goto_0
    return-object v0
.end method

.method public declared-synchronized k(I)V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, LFd1;->m()Z

    move-result v0

    const-string v1, "Not yet complete!"

    invoke-static {v0, v1}, LzZ3;->a(ZLjava/lang/String;)V

    iget-object v0, p0, LFd1;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndAdd(I)I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LFd1;->w:LJd1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LJd1;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized l(Lak2;ZZZZ)LFd1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lak2;",
            "ZZZZ)",
            "LFd1<",
            "TR;>;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, LFd1;->m:Lak2;

    iput-boolean p2, p0, LFd1;->n:Z

    iput-boolean p3, p0, LFd1;->o:Z

    iput-boolean p4, p0, LFd1;->p:Z

    iput-boolean p5, p0, LFd1;->q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, LFd1;->v:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LFd1;->t:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LFd1;->y:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public n()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LFd1;->c:LLP5;

    invoke-virtual {v0}, LLP5;->c()V

    iget-boolean v0, p0, LFd1;->y:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LFd1;->q()V

    monitor-exit p0

    return-void

    :cond_0
    iget-object v0, p0, LFd1;->b:LFd1$e;

    invoke-virtual {v0}, LFd1$e;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-boolean v0, p0, LFd1;->v:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, LFd1;->v:Z

    iget-object v1, p0, LFd1;->m:Lak2;

    iget-object v2, p0, LFd1;->b:LFd1$e;

    invoke-virtual {v2}, LFd1$e;->c()LFd1$e;

    move-result-object v2

    invoke-virtual {v2}, LFd1$e;->size()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {p0, v3}, LFd1;->k(I)V

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LFd1;->g:LGd1;

    const/4 v3, 0x0

    invoke-interface {v0, p0, v1, v3}, LGd1;->c(LFd1;Lak2;LJd1;)V

    invoke-virtual {v2}, LFd1$e;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LFd1$d;

    iget-object v2, v1, LFd1$d;->b:Ljava/util/concurrent/Executor;

    new-instance v3, LFd1$a;

    iget-object v1, v1, LFd1$d;->a:LZL4;

    invoke-direct {v3, p0, v1}, LFd1$a;-><init>(LFd1;LZL4;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LFd1;->i()V

    return-void

    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already failed once"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Received an exception without any callbacks to notify"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public o()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LFd1;->c:LLP5;

    invoke-virtual {v0}, LLP5;->c()V

    iget-boolean v0, p0, LFd1;->y:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LFd1;->r:LVL4;

    invoke-interface {v0}, LVL4;->b()V

    invoke-virtual {p0}, LFd1;->q()V

    monitor-exit p0

    return-void

    :cond_0
    iget-object v0, p0, LFd1;->b:LFd1$e;

    invoke-virtual {v0}, LFd1$e;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-boolean v0, p0, LFd1;->t:Z

    if-nez v0, :cond_2

    iget-object v0, p0, LFd1;->f:LFd1$c;

    iget-object v1, p0, LFd1;->r:LVL4;

    iget-boolean v2, p0, LFd1;->n:Z

    iget-object v3, p0, LFd1;->m:Lak2;

    iget-object v4, p0, LFd1;->d:LJd1$a;

    invoke-virtual {v0, v1, v2, v3, v4}, LFd1$c;->a(LVL4;ZLak2;LJd1$a;)LJd1;

    move-result-object v0

    iput-object v0, p0, LFd1;->w:LJd1;

    const/4 v0, 0x1

    iput-boolean v0, p0, LFd1;->t:Z

    iget-object v1, p0, LFd1;->b:LFd1$e;

    invoke-virtual {v1}, LFd1$e;->c()LFd1$e;

    move-result-object v1

    invoke-virtual {v1}, LFd1$e;->size()I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p0, v2}, LFd1;->k(I)V

    iget-object v0, p0, LFd1;->m:Lak2;

    iget-object v2, p0, LFd1;->w:LJd1;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v3, p0, LFd1;->g:LGd1;

    invoke-interface {v3, p0, v0, v2}, LGd1;->c(LFd1;Lak2;LJd1;)V

    invoke-virtual {v1}, LFd1$e;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LFd1$d;

    iget-object v2, v1, LFd1$d;->b:Ljava/util/concurrent/Executor;

    new-instance v3, LFd1$b;

    iget-object v1, v1, LFd1$d;->a:LZL4;

    invoke-direct {v3, p0, v1}, LFd1$b;-><init>(LFd1;LZL4;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LFd1;->i()V

    return-void

    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already have resource"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Received a resource without any callbacks to notify"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public p()Z
    .locals 1

    iget-boolean v0, p0, LFd1;->q:Z

    return v0
.end method

.method public final declared-synchronized q()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LFd1;->m:Lak2;

    if-eqz v0, :cond_0

    iget-object v0, p0, LFd1;->b:LFd1$e;

    invoke-virtual {v0}, LFd1$e;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, LFd1;->m:Lak2;

    iput-object v0, p0, LFd1;->w:LJd1;

    iput-object v0, p0, LFd1;->r:LVL4;

    const/4 v1, 0x0

    iput-boolean v1, p0, LFd1;->v:Z

    iput-boolean v1, p0, LFd1;->y:Z

    iput-boolean v1, p0, LFd1;->t:Z

    iput-boolean v1, p0, LFd1;->z:Z

    iget-object v2, p0, LFd1;->x:LrV0;

    invoke-virtual {v2, v1}, LrV0;->w(Z)V

    iput-object v0, p0, LFd1;->x:LrV0;

    iput-object v0, p0, LFd1;->u:Lcom/bumptech/glide/load/engine/GlideException;

    iput-object v0, p0, LFd1;->s:LZS0;

    iget-object v0, p0, LFd1;->e:LgY3;

    invoke-interface {v0, p0}, LgY3;->b(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized r(LZL4;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LFd1;->c:LLP5;

    invoke-virtual {v0}, LLP5;->c()V

    iget-object v0, p0, LFd1;->b:LFd1$e;

    invoke-virtual {v0, p1}, LFd1$e;->f(LZL4;)V

    iget-object p1, p0, LFd1;->b:LFd1$e;

    invoke-virtual {p1}, LFd1$e;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, LFd1;->h()V

    iget-boolean p1, p0, LFd1;->t:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, LFd1;->v:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-eqz p1, :cond_2

    iget-object p1, p0, LFd1;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, LFd1;->q()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized s(LrV0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LrV0<",
            "TR;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, LFd1;->x:LrV0;

    invoke-virtual {p1}, LrV0;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LFd1;->h:LKC1;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LFd1;->j()LKC1;

    move-result-object v0

    :goto_0
    invoke-virtual {v0, p1}, LKC1;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
