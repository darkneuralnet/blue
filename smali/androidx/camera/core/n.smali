.class public Landroidx/camera/core/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKX1;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:I

.field public c:Z

.field public final d:LKX1;

.field public final e:Landroid/view/Surface;

.field public f:Landroidx/camera/core/d$a;

.field public final g:Landroidx/camera/core/d$a;


# direct methods
.method public constructor <init>(LKX1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/n;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/camera/core/n;->b:I

    iput-boolean v0, p0, Landroidx/camera/core/n;->c:Z

    new-instance v0, Ldh5;

    invoke-direct {v0, p0}, Ldh5;-><init>(Landroidx/camera/core/n;)V

    iput-object v0, p0, Landroidx/camera/core/n;->g:Landroidx/camera/core/d$a;

    iput-object p1, p0, Landroidx/camera/core/n;->d:LKX1;

    invoke-interface {p1}, LKX1;->a()Landroid/view/Surface;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/n;->e:Landroid/view/Surface;

    return-void
.end method

.method public static synthetic f(Landroidx/camera/core/n;LKX1$a;LKX1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/core/n;->l(LKX1$a;LKX1;)V

    return-void
.end method

.method public static synthetic i(Landroidx/camera/core/n;Landroidx/camera/core/i;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/n;->k(Landroidx/camera/core/i;)V

    return-void
.end method

.method private synthetic k(Landroidx/camera/core/i;)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Landroidx/camera/core/n;->b:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Landroidx/camera/core/n;->b:I

    iget-boolean v2, p0, Landroidx/camera/core/n;->c:Z

    if-eqz v2, :cond_0

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/n;->close()V

    :cond_0
    iget-object v1, p0, Landroidx/camera/core/n;->f:Landroidx/camera/core/d$a;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    invoke-interface {v1, p1}, Landroidx/camera/core/d$a;->f(Landroidx/camera/core/i;)V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private synthetic l(LKX1$a;LKX1;)V
    .locals 0

    invoke-interface {p1, p0}, LKX1$a;->a(LKX1;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/view/Surface;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/n;->d:LKX1;

    invoke-interface {v1}, LKX1;->a()Landroid/view/Surface;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public b()I
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/n;->d:LKX1;

    invoke-interface {v1}, LKX1;->b()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public c()I
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/n;->d:LKX1;

    invoke-interface {v1}, LKX1;->c()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/n;->e:Landroid/view/Surface;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    :cond_0
    iget-object v1, p0, Landroidx/camera/core/n;->d:LKX1;

    invoke-interface {v1}, LKX1;->close()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public d(LKX1$a;Ljava/util/concurrent/Executor;)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/n;->d:LKX1;

    new-instance v2, Leh5;

    invoke-direct {v2, p0, p1}, Leh5;-><init>(Landroidx/camera/core/n;LKX1$a;)V

    invoke-interface {v1, v2, p2}, LKX1;->d(LKX1$a;Ljava/util/concurrent/Executor;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public e()Landroidx/camera/core/i;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/n;->d:LKX1;

    invoke-interface {v1}, LKX1;->e()Landroidx/camera/core/i;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroidx/camera/core/n;->o(Landroidx/camera/core/i;)Landroidx/camera/core/i;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public g()Landroidx/camera/core/i;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/n;->d:LKX1;

    invoke-interface {v1}, LKX1;->g()Landroidx/camera/core/i;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroidx/camera/core/n;->o(Landroidx/camera/core/i;)Landroidx/camera/core/i;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getHeight()I
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/n;->d:LKX1;

    invoke-interface {v1}, LKX1;->getHeight()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getWidth()I
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/n;->d:LKX1;

    invoke-interface {v1}, LKX1;->getWidth()I

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public h()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/n;->d:LKX1;

    invoke-interface {v1}, LKX1;->h()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public j()I
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/n;->d:LKX1;

    invoke-interface {v1}, LKX1;->c()I

    move-result v1

    iget v2, p0, Landroidx/camera/core/n;->b:I

    sub-int/2addr v1, v2

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public m()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/n;->a:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Landroidx/camera/core/n;->c:Z

    iget-object v1, p0, Landroidx/camera/core/n;->d:LKX1;

    invoke-interface {v1}, LKX1;->h()V

    iget v1, p0, Landroidx/camera/core/n;->b:I

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/n;->close()V

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

.method public n(Landroidx/camera/core/d$a;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/n;->f:Landroidx/camera/core/d$a;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final o(Landroidx/camera/core/i;)Landroidx/camera/core/i;
    .locals 1

    if-eqz p1, :cond_0

    iget v0, p0, Landroidx/camera/core/n;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/camera/core/n;->b:I

    new-instance v0, LjB5;

    invoke-direct {v0, p1}, LjB5;-><init>(Landroidx/camera/core/i;)V

    iget-object p1, p0, Landroidx/camera/core/n;->g:Landroidx/camera/core/d$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/d;->a(Landroidx/camera/core/d$a;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
