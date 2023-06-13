.class public final LSV5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPV5;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Landroid/view/Surface;

.field public final c:I

.field public final d:I

.field public final e:Landroid/util/Size;

.field public final f:Landroid/util/Size;

.field public final g:Landroid/graphics/Rect;

.field public final h:I

.field public final i:Z

.field public final j:[F

.field public final k:[F

.field public l:Lrz0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrz0<",
            "LPV5$a;",
            ">;"
        }
    .end annotation
.end field

.field public m:Ljava/util/concurrent/Executor;

.field public n:Z

.field public o:Z

.field public final p:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public q:LO80$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/Surface;IILandroid/util/Size;Landroid/util/Size;Landroid/graphics/Rect;IZLLb0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LSV5;->a:Ljava/lang/Object;

    const/16 v0, 0x10

    new-array v1, v0, [F

    iput-object v1, p0, LSV5;->j:[F

    new-array v0, v0, [F

    iput-object v0, p0, LSV5;->k:[F

    const/4 v0, 0x0

    iput-boolean v0, p0, LSV5;->n:Z

    iput-boolean v0, p0, LSV5;->o:Z

    iput-object p1, p0, LSV5;->b:Landroid/view/Surface;

    iput p2, p0, LSV5;->c:I

    iput p3, p0, LSV5;->d:I

    iput-object p4, p0, LSV5;->e:Landroid/util/Size;

    iput-object p5, p0, LSV5;->f:Landroid/util/Size;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, p6}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object p1, p0, LSV5;->g:Landroid/graphics/Rect;

    iput-boolean p8, p0, LSV5;->i:Z

    iput p7, p0, LSV5;->h:I

    invoke-virtual {p0, p9}, LSV5;->e(LLb0;)V

    new-instance p1, LQV5;

    invoke-direct {p1, p0}, LQV5;-><init>(LSV5;)V

    invoke-static {p1}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    iput-object p1, p0, LSV5;->p:Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method

.method public static synthetic c(LSV5;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    invoke-direct {p0, p1}, LSV5;->i(Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method

.method public static synthetic d(LSV5;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LSV5;->h(LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic h(LO80$a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iput-object p1, p0, LSV5;->q:LO80$a;

    const-string p1, "SurfaceOutputImpl close future complete"

    return-object p1
.end method

.method private synthetic i(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lrz0;

    const/4 v0, 0x0

    invoke-static {v0, p0}, LPV5$a;->c(ILPV5;)LPV5$a;

    move-result-object v0

    invoke-interface {p1, v0}, Lrz0;->accept(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/Executor;Lrz0;)Landroid/view/Surface;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lrz0<",
            "LPV5$a;",
            ">;)",
            "Landroid/view/Surface;"
        }
    .end annotation

    iget-object v0, p0, LSV5;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, LSV5;->m:Ljava/util/concurrent/Executor;

    iput-object p2, p0, LSV5;->l:Lrz0;

    iget-boolean p1, p0, LSV5;->n:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LSV5;->j()V

    :cond_0
    iget-object p1, p0, LSV5;->b:Landroid/view/Surface;

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public b([F[F)V
    .locals 6

    const/4 v1, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, LSV5;->j:[F

    const/4 v5, 0x0

    move-object v0, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    return-void
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, LSV5;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LSV5;->o:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, LSV5;->o:Z

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LSV5;->q:LO80$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LO80$a;->c(Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final e(LLb0;)V
    .locals 14

    iget-object v0, p0, LSV5;->j:[F

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    iget-object v0, p0, LSV5;->j:[F

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v0, v1, v2, v3, v2}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    iget-object v0, p0, LSV5;->j:[F

    const/high16 v4, -0x40800000    # -1.0f

    invoke-static {v0, v1, v3, v4, v3}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    iget-object v0, p0, LSV5;->j:[F

    iget v5, p0, LSV5;->h:I

    int-to-float v5, v5

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-static {v0, v5, v6, v6}, LmN2;->c([FFFF)V

    iget-boolean v0, p0, LSV5;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LSV5;->j:[F

    invoke-static {v0, v1, v3, v2, v2}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    iget-object v0, p0, LSV5;->j:[F

    invoke-static {v0, v1, v4, v3, v3}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    :cond_0
    iget-object v0, p0, LSV5;->f:Landroid/util/Size;

    iget v4, p0, LSV5;->h:I

    invoke-static {v0, v4}, Lp96;->m(Landroid/util/Size;I)Landroid/util/Size;

    move-result-object v0

    iget-object v4, p0, LSV5;->f:Landroid/util/Size;

    invoke-static {v4}, Lp96;->p(Landroid/util/Size;)Landroid/graphics/RectF;

    move-result-object v4

    invoke-static {v0}, Lp96;->p(Landroid/util/Size;)Landroid/graphics/RectF;

    move-result-object v5

    iget v6, p0, LSV5;->h:I

    iget-boolean v7, p0, LSV5;->i:Z

    invoke-static {v4, v5, v6, v7}, Lp96;->d(Landroid/graphics/RectF;Landroid/graphics/RectF;IZ)Landroid/graphics/Matrix;

    move-result-object v4

    new-instance v5, Landroid/graphics/RectF;

    iget-object v6, p0, LSV5;->g:Landroid/graphics/Rect;

    invoke-direct {v5, v6}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {v4, v5}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget v4, v5, Landroid/graphics/RectF;->left:F

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v4, v6

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v7

    sub-float/2addr v6, v7

    iget v7, v5, Landroid/graphics/RectF;->top:F

    sub-float/2addr v6, v7

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v6, v7

    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v7

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v7, v8

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v5

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v5, v0

    iget-object v0, p0, LSV5;->j:[F

    invoke-static {v0, v1, v4, v6, v2}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    iget-object v0, p0, LSV5;->j:[F

    invoke-static {v0, v1, v7, v5, v3}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    invoke-virtual {p0, p1}, LSV5;->f(LLb0;)V

    iget-object v12, p0, LSV5;->j:[F

    const/4 v9, 0x0

    iget-object v10, p0, LSV5;->k:[F

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object v8, v12

    invoke-static/range {v8 .. v13}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    return-void
.end method

.method public final f(LLb0;)V
    .locals 7

    iget-object v0, p0, LSV5;->k:[F

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    iget-object v0, p0, LSV5;->k:[F

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v0, v1, v2, v3, v2}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    iget-object v0, p0, LSV5;->k:[F

    const/high16 v4, -0x40800000    # -1.0f

    invoke-static {v0, v1, v3, v4, v3}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    invoke-interface {p1}, LLb0;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LSV5;->k:[F

    invoke-interface {p1}, LLb0;->b()LJb0;

    move-result-object v5

    invoke-interface {v5}, LJb0;->i()I

    move-result v5

    int-to-float v5, v5

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-static {v0, v5, v6, v6}, LmN2;->c([FFFF)V

    invoke-interface {p1}, LLb0;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LSV5;->k:[F

    invoke-static {p1, v1, v3, v2, v2}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    iget-object p1, p0, LSV5;->k:[F

    invoke-static {p1, v1, v4, v3, v3}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    :cond_0
    iget-object p1, p0, LSV5;->k:[F

    invoke-static {p1, v1, p1, v1}, Landroid/opengl/Matrix;->invertM([FI[FI)Z

    return-void
.end method

.method public g()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LSV5;->p:Lcom/google/common/util/concurrent/ListenableFuture;

    return-object v0
.end method

.method public getFormat()I
    .locals 1

    iget v0, p0, LSV5;->d:I

    return v0
.end method

.method public j()V
    .locals 4

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iget-object v1, p0, LSV5;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, LSV5;->m:Ljava/util/concurrent/Executor;

    if-eqz v2, :cond_1

    iget-object v2, p0, LSV5;->l:Lrz0;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v3, p0, LSV5;->o:Z

    if-nez v3, :cond_2

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v2, p0, LSV5;->m:Ljava/util/concurrent/Executor;

    const/4 v3, 0x0

    iput-boolean v3, p0, LSV5;->n:Z

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    iput-boolean v2, p0, LSV5;->n:Z

    :cond_2
    const/4 v2, 0x0

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    :try_start_1
    new-instance v1, LRV5;

    invoke-direct {v1, p0, v0}, LRV5;-><init>(LSV5;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-interface {v2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v1, "SurfaceOutputImpl"

    const-string v2, "Processor executor closed. Close request not posted."

    invoke-static {v1, v2, v0}, LJx2;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method
