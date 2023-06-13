.class public LfJ4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LfJ4$a;,
        LfJ4$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LmI4<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/PriorityBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/PriorityBlockingQueue<",
            "LmI4<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/concurrent/PriorityBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/PriorityBlockingQueue<",
            "LmI4<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final e:LY70;

.field public final f:Lu73;

.field public final g:LIM4;

.field public final h:[LC73;

.field public i:Ld80;

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LfJ4$b;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LfJ4$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY70;Lu73;)V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, LfJ4;-><init>(LY70;Lu73;I)V

    return-void
.end method

.method public constructor <init>(LY70;Lu73;I)V
    .locals 3

    new-instance v0, LGh1;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v0, v1}, LGh1;-><init>(Landroid/os/Handler;)V

    invoke-direct {p0, p1, p2, p3, v0}, LfJ4;-><init>(LY70;Lu73;ILIM4;)V

    return-void
.end method

.method public constructor <init>(LY70;Lu73;ILIM4;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, LfJ4;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LfJ4;->b:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object v0, p0, LfJ4;->c:Ljava/util/concurrent/PriorityBlockingQueue;

    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object v0, p0, LfJ4;->d:Ljava/util/concurrent/PriorityBlockingQueue;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LfJ4;->j:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LfJ4;->k:Ljava/util/List;

    iput-object p1, p0, LfJ4;->e:LY70;

    iput-object p2, p0, LfJ4;->f:Lu73;

    new-array p1, p3, [LC73;

    iput-object p1, p0, LfJ4;->h:[LC73;

    iput-object p4, p0, LfJ4;->g:LIM4;

    return-void
.end method


# virtual methods
.method public a(LmI4;)LmI4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LmI4<",
            "TT;>;)",
            "LmI4<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p1, p0}, LmI4;->setRequestQueue(LfJ4;)LmI4;

    iget-object v0, p0, LfJ4;->b:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LfJ4;->b:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, LfJ4;->d()I

    move-result v0

    invoke-virtual {p1, v0}, LmI4;->setSequence(I)LmI4;

    const-string v0, "add-to-queue"

    invoke-virtual {p1, v0}, LmI4;->addMarker(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LfJ4;->e(LmI4;I)V

    invoke-virtual {p0, p1}, LfJ4;->b(LmI4;)V

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public b(LmI4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LmI4<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, LmI4;->shouldCache()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, LfJ4;->f(LmI4;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LfJ4;->c:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public c(LmI4;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LmI4<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LfJ4;->b:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LfJ4;->b:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v1, p0, LfJ4;->j:Ljava/util/List;

    monitor-enter v1

    :try_start_1
    iget-object v0, p0, LfJ4;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LfJ4$b;

    invoke-interface {v2, p1}, LfJ4$b;->a(LmI4;)V

    goto :goto_0

    :cond_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, LfJ4;->e(LmI4;I)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, LfJ4;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    return v0
.end method

.method public e(LmI4;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LmI4<",
            "*>;I)V"
        }
    .end annotation

    iget-object v0, p0, LfJ4;->k:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LfJ4;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LfJ4$a;

    invoke-interface {v2, p1, p2}, LfJ4$a;->a(LmI4;I)V

    goto :goto_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public f(LmI4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LmI4<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LfJ4;->d:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g()V
    .locals 6

    invoke-virtual {p0}, LfJ4;->h()V

    new-instance v0, Ld80;

    iget-object v1, p0, LfJ4;->c:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v2, p0, LfJ4;->d:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v3, p0, LfJ4;->e:LY70;

    iget-object v4, p0, LfJ4;->g:LIM4;

    invoke-direct {v0, v1, v2, v3, v4}, Ld80;-><init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;LY70;LIM4;)V

    iput-object v0, p0, LfJ4;->i:Ld80;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LfJ4;->h:[LC73;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    new-instance v1, LC73;

    iget-object v2, p0, LfJ4;->d:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v3, p0, LfJ4;->f:Lu73;

    iget-object v4, p0, LfJ4;->e:LY70;

    iget-object v5, p0, LfJ4;->g:LIM4;

    invoke-direct {v1, v2, v3, v4, v5}, LC73;-><init>(Ljava/util/concurrent/BlockingQueue;Lu73;LY70;LIM4;)V

    iget-object v2, p0, LfJ4;->h:[LC73;

    aput-object v1, v2, v0

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h()V
    .locals 4

    iget-object v0, p0, LfJ4;->i:Ld80;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ld80;->d()V

    :cond_0
    iget-object v0, p0, LfJ4;->h:[LC73;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    if-eqz v3, :cond_1

    invoke-virtual {v3}, LC73;->e()V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
