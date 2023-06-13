.class public LLY0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUV5;
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLY0$a;
    }
.end annotation


# instance fields
.field public final a:LSh3;

.field public final b:Landroid/os/HandlerThread;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Landroid/os/Handler;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final f:[F

.field public final g:[F

.field public final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "LPV5;",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field public i:I


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, LOx5;->a:LOx5;

    invoke-direct {p0, v0}, LLY0;-><init>(LOx5;)V

    return-void
.end method

.method public constructor <init>(LOx5;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, LLY0;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/16 v0, 0x10

    new-array v2, v0, [F

    iput-object v2, p0, LLY0;->f:[F

    new-array v0, v0, [F

    iput-object v0, p0, LLY0;->g:[F

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LLY0;->h:Ljava/util/Map;

    iput v1, p0, LLY0;->i:I

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "GL Thread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LLY0;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, LLY0;->d:Landroid/os/Handler;

    invoke-static {v1}, LAc0;->e(Landroid/os/Handler;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, LLY0;->c:Ljava/util/concurrent/Executor;

    new-instance v0, LSh3;

    invoke-direct {v0}, LSh3;-><init>()V

    iput-object v0, p0, LLY0;->a:LSh3;

    :try_start_0
    invoke-virtual {p0, p1}, LLY0;->k(LOx5;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p0}, LLY0;->release()V

    throw p1
.end method

.method public static synthetic c(LLY0;LPV5;)V
    .locals 0

    invoke-direct {p0, p1}, LLY0;->q(LPV5;)V

    return-void
.end method

.method public static synthetic d(LLY0;LOx5;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LLY0;->m(LOx5;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LLY0;Landroidx/camera/core/o;)V
    .locals 0

    invoke-direct {p0, p1}, LLY0;->o(Landroidx/camera/core/o;)V

    return-void
.end method

.method public static synthetic f(LLY0;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;Landroidx/camera/core/o$g;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LLY0;->n(Landroid/graphics/SurfaceTexture;Landroid/view/Surface;Landroidx/camera/core/o$g;)V

    return-void
.end method

.method public static synthetic g(LLY0;LPV5;LPV5$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LLY0;->p(LPV5;LPV5$a;)V

    return-void
.end method

.method public static synthetic h(LLY0;)V
    .locals 0

    invoke-virtual {p0}, LLY0;->j()V

    return-void
.end method

.method public static synthetic i(LLY0;LOx5;LO80$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LLY0;->l(LOx5;LO80$a;)V

    return-void
.end method

.method private synthetic l(LOx5;LO80$a;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, LLY0;->a:LSh3;

    invoke-virtual {v0, p1}, LSh3;->r(LOx5;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, LO80$a;->c(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p2, p1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method

.method private synthetic m(LOx5;LO80$a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LLY0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, LHY0;

    invoke-direct {v1, p0, p1, p2}, LHY0;-><init>(LLY0;LOx5;LO80$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p1, "Init GlRenderer"

    return-object p1
.end method

.method private synthetic n(Landroid/graphics/SurfaceTexture;Landroid/view/Surface;Landroidx/camera/core/o$g;)V
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->release()V

    invoke-virtual {p2}, Landroid/view/Surface;->release()V

    iget p1, p0, LLY0;->i:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, LLY0;->i:I

    invoke-virtual {p0}, LLY0;->j()V

    return-void
.end method

.method private synthetic o(Landroidx/camera/core/o;)V
    .locals 4

    iget v0, p0, LLY0;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LLY0;->i:I

    new-instance v0, Landroid/graphics/SurfaceTexture;

    iget-object v1, p0, LLY0;->a:LSh3;

    invoke-virtual {v1}, LSh3;->q()I

    move-result v1

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    invoke-virtual {p1}, Landroidx/camera/core/o;->n()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroidx/camera/core/o;->n()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iget-object v2, p0, LLY0;->c:Ljava/util/concurrent/Executor;

    new-instance v3, LJY0;

    invoke-direct {v3, p0, v0, v1}, LJY0;-><init>(LLY0;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V

    invoke-virtual {p1, v1, v2, v3}, Landroidx/camera/core/o;->A(Landroid/view/Surface;Ljava/util/concurrent/Executor;Lrz0;)V

    iget-object p1, p0, LLY0;->d:Landroid/os/Handler;

    invoke-virtual {v0, p0, p1}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;Landroid/os/Handler;)V

    return-void
.end method

.method private synthetic p(LPV5;LPV5$a;)V
    .locals 0

    invoke-interface {p1}, LPV5;->close()V

    iget-object p2, p0, LLY0;->h:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/Surface;

    if-eqz p1, :cond_0

    iget-object p2, p0, LLY0;->a:LSh3;

    invoke-virtual {p2, p1}, LSh3;->C(Landroid/view/Surface;)V

    :cond_0
    return-void
.end method

.method private synthetic q(LPV5;)V
    .locals 2

    iget-object v0, p0, LLY0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, LIY0;

    invoke-direct {v1, p0, p1}, LIY0;-><init>(LLY0;LPV5;)V

    invoke-interface {p1, v0, v1}, LPV5;->a(Ljava/util/concurrent/Executor;Lrz0;)Landroid/view/Surface;

    move-result-object v0

    iget-object v1, p0, LLY0;->a:LSh3;

    invoke-virtual {v1, v0}, LSh3;->x(Landroid/view/Surface;)V

    iget-object v1, p0, LLY0;->h:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(LPV5;)V
    .locals 2

    iget-object v0, p0, LLY0;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LPV5;->close()V

    return-void

    :cond_0
    iget-object v0, p0, LLY0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, LDY0;

    invoke-direct {v1, p0, p1}, LDY0;-><init>(LLY0;LPV5;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Landroidx/camera/core/o;)V
    .locals 2

    iget-object v0, p0, LLY0;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/camera/core/o;->D()Z

    return-void

    :cond_0
    iget-object v0, p0, LLY0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, LEY0;

    invoke-direct {v1, p0, p1}, LEY0;-><init>(LLY0;Landroidx/camera/core/o;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final j()V
    .locals 2

    iget-object v0, p0, LLY0;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, LLY0;->i:I

    if-nez v0, :cond_1

    iget-object v0, p0, LLY0;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LPV5;

    invoke-interface {v1}, LPV5;->close()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LLY0;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, LLY0;->a:LSh3;

    invoke-virtual {v0}, LSh3;->y()V

    iget-object v0, p0, LLY0;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    :cond_1
    return-void
.end method

.method public final k(LOx5;)V
    .locals 2

    new-instance v0, LFY0;

    invoke-direct {v0, p0, p1}, LFY0;-><init>(LLY0;LOx5;)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    instance-of v0, p1, Ljava/util/concurrent/ExecutionException;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    :cond_0
    instance-of v0, p1, Ljava/lang/RuntimeException;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/RuntimeException;

    throw p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Failed to create DefaultSurfaceProcessor"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 6

    iget-object v0, p0, LLY0;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    iget-object v0, p0, LLY0;->f:[F

    invoke-virtual {p1, v0}, Landroid/graphics/SurfaceTexture;->getTransformMatrix([F)V

    iget-object v0, p0, LLY0;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/Surface;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LPV5;

    invoke-interface {v1}, LPV5;->getFormat()I

    move-result v3

    const/16 v4, 0x22

    if-ne v3, v4, :cond_1

    iget-object v3, p0, LLY0;->g:[F

    iget-object v4, p0, LLY0;->f:[F

    invoke-interface {v1, v3, v4}, LPV5;->b([F[F)V

    iget-object v1, p0, LLY0;->a:LSh3;

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->getTimestamp()J

    move-result-wide v3

    iget-object v5, p0, LLY0;->g:[F

    invoke-virtual {v1, v3, v4, v5, v2}, LSh3;->B(J[FLandroid/view/Surface;)V

    goto :goto_0

    :cond_1
    invoke-interface {v1}, LPV5;->getFormat()I

    move-result v2

    const/16 v3, 0x100

    if-ne v2, v3, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unsupported format: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, LPV5;->getFormat()I

    move-result v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, LHZ3;->j(ZLjava/lang/String;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public release()V
    .locals 2

    iget-object v0, p0, LLY0;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LLY0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, LGY0;

    invoke-direct {v1, p0}, LGY0;-><init>(LLY0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
