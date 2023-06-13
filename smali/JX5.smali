.class public LJX5;
.super LDX5$a;
.source "SourceFile"

# interfaces
.implements LDX5;
.implements LPX5$b;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lvf0;

.field public final c:Landroid/os/Handler;

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:Ljava/util/concurrent/ScheduledExecutorService;

.field public f:LDX5$a;

.field public g:LAa0;

.field public h:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public i:LO80$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public j:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/util/List<",
            "Landroid/view/Surface;",
            ">;>;"
        }
    .end annotation
.end field

.field public k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            ">;"
        }
    .end annotation
.end field

.field public l:Z

.field public m:Z

.field public n:Z


# direct methods
.method public constructor <init>(Lvf0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V
    .locals 1

    invoke-direct {p0}, LDX5$a;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LJX5;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, LJX5;->k:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, LJX5;->l:Z

    iput-boolean v0, p0, LJX5;->m:Z

    iput-boolean v0, p0, LJX5;->n:Z

    iput-object p1, p0, LJX5;->b:Lvf0;

    iput-object p4, p0, LJX5;->c:Landroid/os/Handler;

    iput-object p2, p0, LJX5;->d:Ljava/util/concurrent/Executor;

    iput-object p3, p0, LJX5;->e:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method private synthetic C()V
    .locals 0

    invoke-virtual {p0, p0}, LJX5;->s(LDX5;)V

    return-void
.end method

.method private synthetic D(LDX5;)V
    .locals 1

    iget-object v0, p0, LJX5;->b:Lvf0;

    invoke-virtual {v0, p0}, Lvf0;->h(LDX5;)V

    invoke-virtual {p0, p1}, LJX5;->s(LDX5;)V

    iget-object v0, p0, LJX5;->f:LDX5$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LJX5;->f:LDX5$a;

    invoke-virtual {v0, p1}, LDX5$a;->o(LDX5;)V

    return-void
.end method

.method private synthetic E(LDX5;)V
    .locals 1

    iget-object v0, p0, LJX5;->f:LDX5$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LJX5;->f:LDX5$a;

    invoke-virtual {v0, p1}, LDX5$a;->s(LDX5;)V

    return-void
.end method

.method private synthetic F(Ljava/util/List;Llb0;Ltv5;LO80$a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LJX5;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0, p1}, LJX5;->A(Ljava/util/List;)V

    iget-object p1, p0, LJX5;->i:LO80$a;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v1, "The openCaptureSessionCompleter can only set once!"

    invoke-static {p1, v1}, LHZ3;->j(ZLjava/lang/String;)V

    iput-object p4, p0, LJX5;->i:LO80$a;

    invoke-virtual {p2, p3}, Llb0;->a(Ltv5;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "openCaptureSession[session="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "]"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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

.method private synthetic G(Ljava/util/List;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] getSurface...done"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SyncCaptureSessionBase"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p2

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/DeferrableSurface;

    new-instance p2, Landroidx/camera/core/impl/DeferrableSurface$SurfaceClosedException;

    const-string v0, "Surface closed"

    invoke-direct {p2, v0, p1}, Landroidx/camera/core/impl/DeferrableSurface$SurfaceClosedException;-><init>(Ljava/lang/String;Landroidx/camera/core/impl/DeferrableSurface;)V

    invoke-static {p2}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unable to open capture session without surfaces"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p2}, LIA1;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic u(LJX5;LDX5;)V
    .locals 0

    invoke-direct {p0, p1}, LJX5;->E(LDX5;)V

    return-void
.end method

.method public static synthetic v(LJX5;Ljava/util/List;Llb0;Ltv5;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LJX5;->F(Ljava/util/List;Llb0;Ltv5;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(LJX5;LDX5;)V
    .locals 0

    invoke-direct {p0, p1}, LJX5;->D(LDX5;)V

    return-void
.end method

.method public static synthetic x(LJX5;Ljava/util/List;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    invoke-direct {p0, p1, p2}, LJX5;->G(Ljava/util/List;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(LJX5;)V
    .locals 0

    invoke-direct {p0}, LJX5;->C()V

    return-void
.end method


# virtual methods
.method public A(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/impl/DeferrableSurface$SurfaceClosedException;
        }
    .end annotation

    iget-object v0, p0, LJX5;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LJX5;->H()V

    invoke-static {p1}, Landroidx/camera/core/impl/g;->f(Ljava/util/List;)V

    iput-object p1, p0, LJX5;->k:Ljava/util/List;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public B()Z
    .locals 2

    iget-object v0, p0, LJX5;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LJX5;->h:Lcom/google/common/util/concurrent/ListenableFuture;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public H()V
    .locals 2

    iget-object v0, p0, LJX5;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LJX5;->k:Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-static {v1}, Landroidx/camera/core/impl/g;->e(Ljava/util/List;)V

    const/4 v1, 0x0

    iput-object v1, p0, LJX5;->k:Ljava/util/List;

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

.method public a()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, LJX5;->d:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public b(ILjava/util/List;LDX5$a;)Ltv5;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "LSz3;",
            ">;",
            "LDX5$a;",
            ")",
            "Ltv5;"
        }
    .end annotation

    iput-object p3, p0, LJX5;->f:LDX5$a;

    new-instance p3, Ltv5;

    invoke-virtual {p0}, LJX5;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, LJX5$b;

    invoke-direct {v1, p0}, LJX5$b;-><init>(LJX5;)V

    invoke-direct {p3, p1, p2, v0, v1}, Ltv5;-><init>(ILjava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    return-object p3
.end method

.method public c()LDX5$a;
    .locals 0

    return-object p0
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, LJX5;->g:LAa0;

    const-string v1, "Need to call openCaptureSession before using this API."

    invoke-static {v0, v1}, LHZ3;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LJX5;->b:Lvf0;

    invoke-virtual {v0, p0}, Lvf0;->i(LDX5;)V

    iget-object v0, p0, LJX5;->g:LAa0;

    invoke-virtual {v0}, LAa0;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->close()V

    invoke-virtual {p0}, LJX5;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, LHX5;

    invoke-direct {v1, p0}, LHX5;-><init>(LJX5;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    iget-object v0, p0, LJX5;->g:LAa0;

    const-string v1, "Need to call openCaptureSession before using this API."

    invoke-static {v0, v1}, LHZ3;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LJX5;->g:LAa0;

    invoke-virtual {v0}, LAa0;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->abortCaptures()V

    return-void
.end method

.method public e(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/CaptureRequest;",
            ">;",
            "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    iget-object v0, p0, LJX5;->g:LAa0;

    const-string v1, "Need to call openCaptureSession before using this API."

    invoke-static {v0, v1}, LHZ3;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LJX5;->g:LAa0;

    invoke-virtual {p0}, LJX5;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {v0, p1, v1, p2}, LAa0;->a(Ljava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
.end method

.method public f()LAa0;
    .locals 1

    iget-object v0, p0, LJX5;->g:LAa0;

    invoke-static {v0}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LJX5;->g:LAa0;

    return-object v0
.end method

.method public g()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    iget-object v0, p0, LJX5;->g:LAa0;

    const-string v1, "Need to call openCaptureSession before using this API."

    invoke-static {v0, v1}, LHZ3;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LJX5;->g:LAa0;

    invoke-virtual {v0}, LAa0;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->stopRepeating()V

    return-void
.end method

.method public getDevice()Landroid/hardware/camera2/CameraDevice;
    .locals 1

    iget-object v0, p0, LJX5;->g:LAa0;

    invoke-static {v0}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LJX5;->g:LAa0;

    invoke-virtual {v0}, LAa0;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    move-result-object v0

    return-object v0
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

    const/4 v0, 0x0

    invoke-static {v0}, LIA1;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public i()V
    .locals 0

    invoke-virtual {p0}, LJX5;->H()V

    return-void
.end method

.method public j(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/hardware/camera2/CameraAccessException;
        }
    .end annotation

    iget-object v0, p0, LJX5;->g:LAa0;

    const-string v1, "Need to call openCaptureSession before using this API."

    invoke-static {v0, v1}, LHZ3;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LJX5;->g:LAa0;

    invoke-virtual {p0}, LJX5;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {v0, p1, v1, p2}, LAa0;->b(Landroid/hardware/camera2/CaptureRequest;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
.end method

.method public k(Ljava/util/List;J)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 7
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

    iget-object v0, p0, LJX5;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LJX5;->m:Z

    if-eqz v1, :cond_0

    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string p2, "Opener is disabled"

    invoke-direct {p1, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {p0}, LJX5;->a()Ljava/util/concurrent/Executor;

    move-result-object v5

    iget-object v6, p0, LJX5;->e:Ljava/util/concurrent/ScheduledExecutorService;

    move-object v1, p1

    move-wide v3, p2

    invoke-static/range {v1 .. v6}, Landroidx/camera/core/impl/g;->k(Ljava/util/Collection;ZJLjava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p2

    invoke-static {p2}, LDA1;->a(Lcom/google/common/util/concurrent/ListenableFuture;)LDA1;

    move-result-object p2

    new-instance p3, LEX5;

    invoke-direct {p3, p0, p1}, LEX5;-><init>(LJX5;Ljava/util/List;)V

    invoke-virtual {p0}, LJX5;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, LDA1;->e(Lfp;Ljava/util/concurrent/Executor;)LDA1;

    move-result-object p1

    iput-object p1, p0, LJX5;->j:Lcom/google/common/util/concurrent/ListenableFuture;

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

.method public l(Landroid/hardware/camera2/CameraDevice;Ltv5;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
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

    iget-object v0, p0, LJX5;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LJX5;->m:Z

    if-eqz v1, :cond_0

    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string p2, "Opener is disabled"

    invoke-direct {p1, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_0
    iget-object v1, p0, LJX5;->b:Lvf0;

    invoke-virtual {v1, p0}, Lvf0;->l(LDX5;)V

    iget-object v1, p0, LJX5;->c:Landroid/os/Handler;

    invoke-static {p1, v1}, Llb0;->b(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)Llb0;

    move-result-object p1

    new-instance v1, LFX5;

    invoke-direct {v1, p0, p3, p1, p2}, LFX5;-><init>(LJX5;Ljava/util/List;Llb0;Ltv5;)V

    invoke-static {v1}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    iput-object p1, p0, LJX5;->h:Lcom/google/common/util/concurrent/ListenableFuture;

    new-instance p2, LJX5$a;

    invoke-direct {p2, p0}, LJX5$a;-><init>(LJX5;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p3

    invoke-static {p1, p2, p3}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    iget-object p1, p0, LJX5;->h:Lcom/google/common/util/concurrent/ListenableFuture;

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

.method public m(LDX5;)V
    .locals 1

    iget-object v0, p0, LJX5;->f:LDX5$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LJX5;->f:LDX5$a;

    invoke-virtual {v0, p1}, LDX5$a;->m(LDX5;)V

    return-void
.end method

.method public n(LDX5;)V
    .locals 1

    iget-object v0, p0, LJX5;->f:LDX5$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LJX5;->f:LDX5$a;

    invoke-virtual {v0, p1}, LDX5$a;->n(LDX5;)V

    return-void
.end method

.method public o(LDX5;)V
    .locals 3

    iget-object v0, p0, LJX5;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LJX5;->l:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, LJX5;->l:Z

    iget-object v1, p0, LJX5;->h:Lcom/google/common/util/concurrent/ListenableFuture;

    const-string v2, "Need to call openCaptureSession before using this API."

    invoke-static {v1, v2}, LHZ3;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, LJX5;->h:Lcom/google/common/util/concurrent/ListenableFuture;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, LJX5;->i()V

    if-eqz v1, :cond_1

    new-instance v0, LGX5;

    invoke-direct {v0, p0, p1}, LGX5;-><init>(LJX5;LDX5;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {v1, v0, p1}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

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

.method public p(LDX5;)V
    .locals 1

    iget-object v0, p0, LJX5;->f:LDX5$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, LJX5;->i()V

    iget-object v0, p0, LJX5;->b:Lvf0;

    invoke-virtual {v0, p0}, Lvf0;->j(LDX5;)V

    iget-object v0, p0, LJX5;->f:LDX5$a;

    invoke-virtual {v0, p1}, LDX5$a;->p(LDX5;)V

    return-void
.end method

.method public q(LDX5;)V
    .locals 1

    iget-object v0, p0, LJX5;->f:LDX5$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LJX5;->b:Lvf0;

    invoke-virtual {v0, p0}, Lvf0;->k(LDX5;)V

    iget-object v0, p0, LJX5;->f:LDX5$a;

    invoke-virtual {v0, p1}, LDX5$a;->q(LDX5;)V

    return-void
.end method

.method public r(LDX5;)V
    .locals 1

    iget-object v0, p0, LJX5;->f:LDX5$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LJX5;->f:LDX5$a;

    invoke-virtual {v0, p1}, LDX5$a;->r(LDX5;)V

    return-void
.end method

.method public s(LDX5;)V
    .locals 3

    iget-object v0, p0, LJX5;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LJX5;->n:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, LJX5;->n:Z

    iget-object v1, p0, LJX5;->h:Lcom/google/common/util/concurrent/ListenableFuture;

    const-string v2, "Need to call openCaptureSession before using this API."

    invoke-static {v1, v2}, LHZ3;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, LJX5;->h:Lcom/google/common/util/concurrent/ListenableFuture;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    new-instance v0, LIX5;

    invoke-direct {v0, p0, p1}, LIX5;-><init>(LJX5;LDX5;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {v1, v0, p1}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

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

.method public stop()Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, LJX5;->a:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-boolean v3, p0, LJX5;->m:Z

    if-nez v3, :cond_1

    iget-object v3, p0, LJX5;->j:Lcom/google/common/util/concurrent/ListenableFuture;

    if-eqz v3, :cond_0

    move-object v1, v3

    :cond_0
    iput-boolean v0, p0, LJX5;->m:Z

    :cond_1
    invoke-virtual {p0}, LJX5;->B()Z

    move-result v3

    if-nez v3, :cond_2

    move v3, v0

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_3

    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_3
    return v3

    :catchall_0
    move-exception v3

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v2

    if-eqz v1, :cond_4

    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_4
    throw v2
.end method

.method public t(LDX5;Landroid/view/Surface;)V
    .locals 1

    iget-object v0, p0, LJX5;->f:LDX5$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LJX5;->f:LDX5$a;

    invoke-virtual {v0, p1, p2}, LDX5$a;->t(LDX5;Landroid/view/Surface;)V

    return-void
.end method

.method public z(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 1

    iget-object v0, p0, LJX5;->g:LAa0;

    if-nez v0, :cond_0

    iget-object v0, p0, LJX5;->c:Landroid/os/Handler;

    invoke-static {p1, v0}, LAa0;->d(Landroid/hardware/camera2/CameraCaptureSession;Landroid/os/Handler;)LAa0;

    move-result-object p1

    iput-object p1, p0, LJX5;->g:LAa0;

    :cond_0
    return-void
.end method
