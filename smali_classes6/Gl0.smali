.class public LGl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LcD1$c;
.implements LcD1$l;
.implements LcD1$h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LGl0$a;,
        LGl0$b;,
        LGl0$d;,
        LGl0$c;,
        LGl0$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "LEl0;",
        ">",
        "Ljava/lang/Object;",
        "LcD1$c;",
        "LcD1$l;",
        "LcD1$h;"
    }
.end annotation


# instance fields
.field public final a:LlM2;

.field public final b:LlM2$a;

.field public final c:LlM2$a;

.field public d:LF9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF9<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/concurrent/locks/ReadWriteLock;

.field public f:LHl0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LHl0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public g:LcD1;

.field public h:Lcom/google/android/gms/maps/model/CameraPosition;

.field public i:LGl0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGl0<",
            "TT;>.a;"
        }
    .end annotation
.end field

.field public final j:Ljava/util/concurrent/locks/ReadWriteLock;

.field public k:LGl0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGl0$d<",
            "TT;>;"
        }
    .end annotation
.end field

.field public l:LGl0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGl0$b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;LcD1;)V
    .locals 1

    new-instance v0, LlM2;

    invoke-direct {v0, p2}, LlM2;-><init>(LcD1;)V

    invoke-direct {p0, p1, p2, v0}, LGl0;-><init>(Landroid/content/Context;LcD1;LlM2;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LcD1;LlM2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, LGl0;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    iput-object p2, p0, LGl0;->g:LcD1;

    iput-object p3, p0, LGl0;->a:LlM2;

    invoke-virtual {p3}, LlM2;->e()LlM2$a;

    move-result-object v0

    iput-object v0, p0, LGl0;->c:LlM2$a;

    invoke-virtual {p3}, LlM2;->e()LlM2$a;

    move-result-object p3

    iput-object p3, p0, LGl0;->b:LlM2$a;

    new-instance p3, LEW0;

    invoke-direct {p3, p1, p2, p0}, LEW0;-><init>(Landroid/content/Context;LcD1;LGl0;)V

    iput-object p3, p0, LGl0;->f:LHl0;

    new-instance p1, LZY3;

    new-instance p2, LY83;

    invoke-direct {p2}, LY83;-><init>()V

    invoke-direct {p1, p2}, LZY3;-><init>(LF9;)V

    iput-object p1, p0, LGl0;->d:LF9;

    new-instance p1, LGl0$a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, LGl0$a;-><init>(LGl0;LFl0;)V

    iput-object p1, p0, LGl0;->i:LGl0$a;

    iget-object p1, p0, LGl0;->f:LHl0;

    invoke-interface {p1}, LHl0;->onAdd()V

    return-void
.end method

.method public static bridge synthetic d(LGl0;)LF9;
    .locals 0

    iget-object p0, p0, LGl0;->d:LF9;

    return-object p0
.end method

.method public static bridge synthetic e(LGl0;)Ljava/util/concurrent/locks/ReadWriteLock;
    .locals 0

    iget-object p0, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    return-object p0
.end method

.method public static bridge synthetic f(LGl0;)LHl0;
    .locals 0

    iget-object p0, p0, LGl0;->f:LHl0;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, LGl0;->f:LHl0;

    instance-of v1, v0, LcD1$c;

    if-eqz v1, :cond_0

    check-cast v0, LcD1$c;

    invoke-interface {v0}, LcD1$c;->a()V

    :cond_0
    iget-object v0, p0, LGl0;->g:LcD1;

    invoke-virtual {v0}, LcD1;->i()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    iget-object v1, p0, LGl0;->h:Lcom/google/android/gms/maps/model/CameraPosition;

    if-eqz v1, :cond_1

    iget v1, v1, Lcom/google/android/gms/maps/model/CameraPosition;->c:F

    iget v0, v0, Lcom/google/android/gms/maps/model/CameraPosition;->c:F

    cmpl-float v0, v1, v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, LGl0;->g:LcD1;

    invoke-virtual {v0}, LcD1;->i()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    iput-object v0, p0, LGl0;->h:Lcom/google/android/gms/maps/model/CameraPosition;

    invoke-virtual {p0}, LGl0;->j()V

    return-void
.end method

.method public b(LfM2;)V
    .locals 1

    invoke-virtual {p0}, LGl0;->n()LlM2;

    move-result-object v0

    invoke-virtual {v0, p1}, LlM2;->b(LfM2;)V

    return-void
.end method

.method public c(LfM2;)Z
    .locals 1

    invoke-virtual {p0}, LGl0;->n()LlM2;

    move-result-object v0

    invoke-virtual {v0, p1}, LlM2;->c(LfM2;)Z

    move-result p1

    return p1
.end method

.method public g(LEl0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, LGl0;->d:LF9;

    invoke-interface {v0, p1}, LF9;->c(LEl0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public h(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, LGl0;->d:LF9;

    invoke-interface {v0, p1}, LF9;->d(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public i()V
    .locals 2

    iget-object v0, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, LGl0;->d:LF9;

    invoke-interface {v0}, LF9;->clearItems()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public j()V
    .locals 5

    iget-object v0, p0, LGl0;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, LGl0;->i:LGl0$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    new-instance v0, LGl0$a;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, LGl0$a;-><init>(LGl0;LFl0;)V

    iput-object v0, p0, LGl0;->i:LGl0$a;

    sget-object v2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v1, v1, [Ljava/lang/Float;

    iget-object v3, p0, LGl0;->g:LcD1;

    invoke-virtual {v3}, LcD1;->i()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v3

    iget v3, v3, Lcom/google/android/gms/maps/model/CameraPosition;->c:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    invoke-virtual {v0, v2, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LGl0;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, LGl0;->j:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public k()LF9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LF9<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LGl0;->d:LF9;

    return-object v0
.end method

.method public l()LlM2$a;
    .locals 1

    iget-object v0, p0, LGl0;->c:LlM2$a;

    return-object v0
.end method

.method public m()LlM2$a;
    .locals 1

    iget-object v0, p0, LGl0;->b:LlM2$a;

    return-object v0
.end method

.method public n()LlM2;
    .locals 1

    iget-object v0, p0, LGl0;->a:LlM2;

    return-object v0
.end method

.method public o()V
    .locals 2

    iget-object v0, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, LGl0;->d:LF9;

    invoke-interface {v0}, LF9;->b()Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, LGl0;->d:LF9;

    invoke-interface {v1}, LF9;->clearItems()V

    iget-object v1, p0, LGl0;->d:LF9;

    invoke-interface {v1, v0}, LF9;->d(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public p(LEl0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, LGl0;->d:LF9;

    invoke-interface {v0, p1}, LF9;->e(LEl0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public q(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEl0;

    iget-object v1, p0, LGl0;->d:LF9;

    invoke-interface {v1, v0}, LF9;->e(LEl0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public r(LGl0$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGl0$b<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LGl0;->l:LGl0$b;

    iget-object v0, p0, LGl0;->f:LHl0;

    invoke-interface {v0, p1}, LHl0;->setOnClusterClickListener(LGl0$b;)V

    return-void
.end method

.method public s(LGl0$d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGl0$d<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LGl0;->k:LGl0$d;

    iget-object v0, p0, LGl0;->f:LHl0;

    invoke-interface {v0, p1}, LHl0;->setOnClusterItemClickListener(LGl0$d;)V

    return-void
.end method

.method public t(LHl0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHl0<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LGl0;->f:LHl0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LHl0;->setOnClusterClickListener(LGl0$b;)V

    iget-object v0, p0, LGl0;->f:LHl0;

    invoke-interface {v0, v1}, LHl0;->setOnClusterItemClickListener(LGl0$d;)V

    iget-object v0, p0, LGl0;->c:LlM2$a;

    invoke-virtual {v0}, LlM2$a;->f()V

    iget-object v0, p0, LGl0;->b:LlM2$a;

    invoke-virtual {v0}, LlM2$a;->f()V

    iget-object v0, p0, LGl0;->f:LHl0;

    invoke-interface {v0}, LHl0;->onRemove()V

    iput-object p1, p0, LGl0;->f:LHl0;

    invoke-interface {p1}, LHl0;->onAdd()V

    iget-object p1, p0, LGl0;->f:LHl0;

    iget-object v0, p0, LGl0;->l:LGl0$b;

    invoke-interface {p1, v0}, LHl0;->setOnClusterClickListener(LGl0$b;)V

    iget-object p1, p0, LGl0;->f:LHl0;

    invoke-interface {p1, v1}, LHl0;->setOnClusterInfoWindowClickListener(LGl0$c;)V

    iget-object p1, p0, LGl0;->f:LHl0;

    iget-object v0, p0, LGl0;->k:LGl0$d;

    invoke-interface {p1, v0}, LHl0;->setOnClusterItemClickListener(LGl0$d;)V

    iget-object p1, p0, LGl0;->f:LHl0;

    invoke-interface {p1, v1}, LHl0;->setOnClusterItemInfoWindowClickListener(LGl0$e;)V

    invoke-virtual {p0}, LGl0;->j()V

    return-void
.end method

.method public u(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEl0;

    iget-object v1, p0, LGl0;->d:LF9;

    invoke-interface {v1, v0}, LF9;->g(LEl0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LGl0;->e:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method
