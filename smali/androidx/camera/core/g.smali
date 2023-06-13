.class public final Landroidx/camera/core/g;
.super Landroidx/camera/core/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/g$b;
    }
.end annotation


# instance fields
.field public final t:Ljava/util/concurrent/Executor;

.field public final u:Ljava/lang/Object;

.field public v:Landroidx/camera/core/i;

.field public w:Landroidx/camera/core/g$b;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Landroidx/camera/core/f;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/g;->u:Ljava/lang/Object;

    iput-object p1, p0, Landroidx/camera/core/g;->t:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public d(LKX1;)Landroidx/camera/core/i;
    .locals 0

    invoke-interface {p1}, LKX1;->g()Landroidx/camera/core/i;

    move-result-object p1

    return-object p1
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/g;->u:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/g;->v:Landroidx/camera/core/i;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroidx/camera/core/i;->close()V

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/camera/core/g;->v:Landroidx/camera/core/i;

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public o(Landroidx/camera/core/i;)V
    .locals 5

    iget-object v0, p0, Landroidx/camera/core/g;->u:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/core/f;->s:Z

    if-nez v1, :cond_0

    invoke-interface {p1}, Landroidx/camera/core/i;->close()V

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Landroidx/camera/core/g;->w:Landroidx/camera/core/g$b;

    if-eqz v1, :cond_3

    invoke-interface {p1}, Landroidx/camera/core/i;->i1()LwX1;

    move-result-object v1

    invoke-interface {v1}, LwX1;->getTimestamp()J

    move-result-wide v1

    iget-object v3, p0, Landroidx/camera/core/g;->w:Landroidx/camera/core/g$b;

    invoke-virtual {v3}, Landroidx/camera/core/d;->i1()LwX1;

    move-result-object v3

    invoke-interface {v3}, LwX1;->getTimestamp()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-gtz v1, :cond_1

    invoke-interface {p1}, Landroidx/camera/core/i;->close()V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Landroidx/camera/core/g;->v:Landroidx/camera/core/i;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroidx/camera/core/i;->close()V

    :cond_2
    iput-object p1, p0, Landroidx/camera/core/g;->v:Landroidx/camera/core/i;

    :goto_0
    monitor-exit v0

    return-void

    :cond_3
    new-instance v1, Landroidx/camera/core/g$b;

    invoke-direct {v1, p1, p0}, Landroidx/camera/core/g$b;-><init>(Landroidx/camera/core/i;Landroidx/camera/core/g;)V

    iput-object v1, p0, Landroidx/camera/core/g;->w:Landroidx/camera/core/g$b;

    invoke-virtual {p0, v1}, Landroidx/camera/core/f;->e(Landroidx/camera/core/i;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    new-instance v2, Landroidx/camera/core/g$a;

    invoke-direct {v2, p0, v1}, Landroidx/camera/core/g$a;-><init>(Landroidx/camera/core/g;Landroidx/camera/core/g$b;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-static {p1, v2, v1}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public z()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/g;->u:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Landroidx/camera/core/g;->w:Landroidx/camera/core/g$b;

    iget-object v2, p0, Landroidx/camera/core/g;->v:Landroidx/camera/core/i;

    if-eqz v2, :cond_0

    iput-object v1, p0, Landroidx/camera/core/g;->v:Landroidx/camera/core/i;

    invoke-virtual {p0, v2}, Landroidx/camera/core/g;->o(Landroidx/camera/core/i;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
