.class public final Lc90;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public final c:Lr90;

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:Ljava/lang/Object;

.field public f:Lja0$a;

.field public g:LO80$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lr90$c;


# direct methods
.method public constructor <init>(Lr90;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc90;->a:Z

    iput-boolean v0, p0, Lc90;->b:Z

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lc90;->e:Ljava/lang/Object;

    new-instance v0, Lja0$a;

    invoke-direct {v0}, Lja0$a;-><init>()V

    iput-object v0, p0, Lc90;->f:Lja0$a;

    new-instance v0, LZ80;

    invoke-direct {v0, p0}, LZ80;-><init>(Lc90;)V

    iput-object v0, p0, Lc90;->h:Lr90$c;

    iput-object p1, p0, Lc90;->c:Lr90;

    iput-object p2, p0, Lc90;->d:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic a(Lc90;LO80$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lc90;->o(LO80$a;)V

    return-void
.end method

.method public static synthetic b(Lc90;LO80$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lc90;->m(LO80$a;)V

    return-void
.end method

.method public static synthetic c(Lc90;Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-direct {p0, p1}, Lc90;->q(Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p0

    return p0
.end method

.method public static synthetic d(Lc90;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lc90;->p(LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lc90;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lc90;->r(Z)V

    return-void
.end method

.method public static synthetic f(Lc90;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lc90;->n(LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic m(LO80$a;)V
    .locals 0

    invoke-virtual {p0, p1}, Lc90;->u(LO80$a;)V

    return-void
.end method

.method private synthetic n(LO80$a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lc90;->d:Ljava/util/concurrent/Executor;

    new-instance v1, La90;

    invoke-direct {v1, p0, p1}, La90;-><init>(Lc90;LO80$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p1, "addCaptureRequestOptions"

    return-object p1
.end method

.method private synthetic o(LO80$a;)V
    .locals 0

    invoke-virtual {p0, p1}, Lc90;->u(LO80$a;)V

    return-void
.end method

.method private synthetic p(LO80$a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lc90;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Lb90;

    invoke-direct {v1, p0, p1}, Lb90;-><init>(Lc90;LO80$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p1, "clearCaptureRequestOptions"

    return-object p1
.end method

.method private synthetic q(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 2

    iget-object v0, p0, Lc90;->g:LO80$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/hardware/camera2/CaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object p1

    invoke-virtual {p1}, Landroid/hardware/camera2/CaptureRequest;->getTag()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LxY5;

    if-eqz v0, :cond_0

    check-cast p1, LxY5;

    const-string v0, "Camera2CameraControl"

    invoke-virtual {p1, v0}, LxY5;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lc90;->g:LO80$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc90;->g:LO80$a;

    iput-object v1, p0, Lc90;->g:LO80$a;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1, v1}, LO80$a;->c(Ljava/lang/Object;)Z

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private synthetic r(Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lc90;->t(Z)V

    return-void
.end method


# virtual methods
.method public g(Lnf0;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnf0;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lc90;->h(Lnf0;)V

    new-instance p1, LY80;

    invoke-direct {p1, p0}, LY80;-><init>(Lc90;)V

    invoke-static {p1}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    invoke-static {p1}, LIA1;->j(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lnf0;)V
    .locals 5

    iget-object v0, p0, Lc90;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-interface {p1}, Landroidx/camera/core/impl/p;->g()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/f$a;

    iget-object v3, p0, Lc90;->f:Lja0$a;

    invoke-virtual {v3}, Lja0$a;->b()Landroidx/camera/core/impl/l;

    move-result-object v3

    invoke-interface {p1, v2}, Landroidx/camera/core/impl/p;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v2, v4}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

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

.method public i()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lc90;->j()V

    new-instance v0, LX80;

    invoke-direct {v0, p0}, LX80;-><init>(Lc90;)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    invoke-static {v0}, LIA1;->j(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public final j()V
    .locals 2

    iget-object v0, p0, Lc90;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lja0$a;

    invoke-direct {v1}, Lja0$a;-><init>()V

    iput-object v1, p0, Lc90;->f:Lja0$a;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public k()Lja0;
    .locals 4

    iget-object v0, p0, Lc90;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lc90;->g:LO80$a;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lc90;->f:Lja0$a;

    invoke-virtual {v1}, Lja0$a;->b()Landroidx/camera/core/impl/l;

    move-result-object v1

    sget-object v2, Lja0;->L:Landroidx/camera/core/impl/f$a;

    iget-object v3, p0, Lc90;->g:LO80$a;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    :cond_0
    iget-object v1, p0, Lc90;->f:Lja0$a;

    invoke-virtual {v1}, Lja0$a;->a()Lja0;

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

.method public l()Lr90$c;
    .locals 1

    iget-object v0, p0, Lc90;->h:Lr90$c;

    return-object v0
.end method

.method public s(Z)V
    .locals 2

    iget-object v0, p0, Lc90;->d:Ljava/util/concurrent/Executor;

    new-instance v1, LW80;

    invoke-direct {v1, p0, p1}, LW80;-><init>(Lc90;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final t(Z)V
    .locals 2

    iget-boolean v0, p0, Lc90;->a:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lc90;->a:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lc90;->b:Z

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lc90;->v()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lc90;->g:LO80$a;

    if-eqz p1, :cond_2

    new-instance v0, Landroidx/camera/core/CameraControl$OperationCanceledException;

    const-string v1, "The camera control has became inactive."

    invoke-direct {v0, v1}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, LO80$a;->f(Ljava/lang/Throwable;)Z

    const/4 p1, 0x0

    iput-object p1, p0, Lc90;->g:LO80$a;

    :cond_2
    :goto_0
    return-void
.end method

.method public final u(LO80$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc90;->b:Z

    iget-object v0, p0, Lc90;->g:LO80$a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object p1, p0, Lc90;->g:LO80$a;

    iget-boolean p1, p0, Lc90;->a:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lc90;->v()V

    :cond_1
    if-eqz v0, :cond_2

    new-instance p1, Landroidx/camera/core/CameraControl$OperationCanceledException;

    const-string v1, "Camera2CameraControl was updated with new options."

    invoke-direct {p1, v1}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    :cond_2
    return-void
.end method

.method public final v()V
    .locals 1

    iget-object v0, p0, Lc90;->c:Lr90;

    invoke-virtual {v0}, Lr90;->l0()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc90;->b:Z

    return-void
.end method
