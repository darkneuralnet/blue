.class public LOX5;
.super LJX5;
.source "SourceFile"


# instance fields
.field public final o:Ljava/lang/Object;

.field public p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            ">;"
        }
    .end annotation
.end field

.field public q:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final r:LPw1;

.field public final s:Lrw6;

.field public final t:LOw1;


# direct methods
.method public constructor <init>(LTe4;LTe4;Lvf0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0, p3, p4, p5, p6}, LJX5;-><init>(Lvf0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V

    new-instance p3, Ljava/lang/Object;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LOX5;->o:Ljava/lang/Object;

    new-instance p3, LPw1;

    invoke-direct {p3, p1, p2}, LPw1;-><init>(LTe4;LTe4;)V

    iput-object p3, p0, LOX5;->r:LPw1;

    new-instance p3, Lrw6;

    invoke-direct {p3, p1}, Lrw6;-><init>(LTe4;)V

    iput-object p3, p0, LOX5;->s:Lrw6;

    new-instance p1, LOw1;

    invoke-direct {p1, p2}, LOw1;-><init>(LTe4;)V

    iput-object p1, p0, LOX5;->t:LOw1;

    return-void
.end method

.method public static synthetic I(LOX5;)V
    .locals 0

    invoke-direct {p0}, LOX5;->N()V

    return-void
.end method

.method public static synthetic J(LOX5;Landroid/hardware/camera2/CameraDevice;Ltv5;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LOX5;->P(Landroid/hardware/camera2/CameraDevice;Ltv5;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(LOX5;LDX5;)V
    .locals 0

    invoke-direct {p0, p1}, LOX5;->O(LDX5;)V

    return-void
.end method

.method public static synthetic L(LOX5;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 0

    invoke-direct {p0, p1, p2}, LOX5;->Q(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p0

    return p0
.end method

.method private synthetic N()V
    .locals 1

    const-string v0, "Session call super.close()"

    invoke-virtual {p0, v0}, LOX5;->M(Ljava/lang/String;)V

    invoke-super {p0}, LJX5;->close()V

    return-void
.end method

.method private synthetic O(LDX5;)V
    .locals 0

    invoke-super {p0, p1}, LJX5;->q(LDX5;)V

    return-void
.end method

.method private synthetic P(Landroid/hardware/camera2/CameraDevice;Ltv5;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    invoke-super {p0, p1, p2, p3}, LJX5;->l(Landroid/hardware/camera2/CameraDevice;Ltv5;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method private synthetic Q(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    invoke-super {p0, p1, p2}, LJX5;->j(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
.end method


# virtual methods
.method public M(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SyncCaptureSessionImpl"

    invoke-static {v0, p1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public close()V
    .locals 3

    const-string v0, "Session call close()"

    invoke-virtual {p0, v0}, LOX5;->M(Ljava/lang/String;)V

    iget-object v0, p0, LOX5;->s:Lrw6;

    invoke-virtual {v0}, Lrw6;->f()V

    iget-object v0, p0, LOX5;->s:Lrw6;

    invoke-virtual {v0}, Lrw6;->c()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v1, LLX5;

    invoke-direct {v1, p0}, LLX5;-><init>(LOX5;)V

    invoke-virtual {p0}, LJX5;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public h()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LOX5;->s:Lrw6;

    invoke-virtual {v0}, Lrw6;->c()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public j(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    iget-object v0, p0, LOX5;->s:Lrw6;

    new-instance v1, LKX5;

    invoke-direct {v1, p0}, LKX5;-><init>(LOX5;)V

    invoke-virtual {v0, p1, p2, v1}, Lrw6;->h(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Lrw6$c;)I

    move-result p1

    return p1
.end method

.method public k(Ljava/util/List;J)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            ">;J)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/util/List<",
            "Landroid/view/Surface;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LOX5;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, LOX5;->p:Ljava/util/List;

    invoke-super {p0, p1, p2, p3}, LJX5;->k(Ljava/util/List;J)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public l(Landroid/hardware/camera2/CameraDevice;Ltv5;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/CameraDevice;",
            "Ltv5;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            ">;)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LOX5;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LOX5;->s:Lrw6;

    iget-object v2, p0, LJX5;->b:Lvf0;

    invoke-virtual {v2}, Lvf0;->e()Ljava/util/List;

    move-result-object v5

    new-instance v6, LMX5;

    invoke-direct {v6, p0}, LMX5;-><init>(LOX5;)V

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v1 .. v6}, Lrw6;->g(Landroid/hardware/camera2/CameraDevice;Ltv5;Ljava/util/List;Ljava/util/List;Lrw6$b;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    iput-object p1, p0, LOX5;->q:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-static {p1}, LIA1;->j(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public o(LDX5;)V
    .locals 3

    iget-object v0, p0, LOX5;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LOX5;->r:LPw1;

    iget-object v2, p0, LOX5;->p:Ljava/util/List;

    invoke-virtual {v1, v2}, LPw1;->a(Ljava/util/List;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "onClosed()"

    invoke-virtual {p0, v0}, LOX5;->M(Ljava/lang/String;)V

    invoke-super {p0, p1}, LJX5;->o(LDX5;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public q(LDX5;)V
    .locals 4

    const-string v0, "Session onConfigured()"

    invoke-virtual {p0, v0}, LOX5;->M(Ljava/lang/String;)V

    iget-object v0, p0, LOX5;->t:LOw1;

    iget-object v1, p0, LJX5;->b:Lvf0;

    invoke-virtual {v1}, Lvf0;->f()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, LJX5;->b:Lvf0;

    invoke-virtual {v2}, Lvf0;->d()Ljava/util/List;

    move-result-object v2

    new-instance v3, LNX5;

    invoke-direct {v3, p0}, LNX5;-><init>(LOX5;)V

    invoke-virtual {v0, p1, v1, v2, v3}, LOw1;->c(LDX5;Ljava/util/List;Ljava/util/List;LOw1$a;)V

    return-void
.end method

.method public stop()Z
    .locals 3

    iget-object v0, p0, LOX5;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LJX5;->B()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LOX5;->r:LPw1;

    iget-object v2, p0, LOX5;->p:Ljava/util/List;

    invoke-virtual {v1, v2}, LPw1;->a(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, LOX5;->q:Lcom/google/common/util/concurrent/ListenableFuture;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_1
    :goto_0
    invoke-super {p0}, LJX5;->stop()Z

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
