.class public abstract Landroidx/camera/core/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKX1$a;


# instance fields
.field public a:Landroidx/camera/core/e$a;

.field public volatile b:I

.field public volatile c:I

.field public volatile d:I

.field public volatile e:Z

.field public volatile f:Z

.field public g:Ljava/util/concurrent/Executor;

.field public h:Landroidx/camera/core/n;

.field public i:Landroid/media/ImageWriter;

.field public j:Landroid/graphics/Rect;

.field public k:Landroid/graphics/Rect;

.field public l:Landroid/graphics/Matrix;

.field public m:Landroid/graphics/Matrix;

.field public n:Ljava/nio/ByteBuffer;

.field public o:Ljava/nio/ByteBuffer;

.field public p:Ljava/nio/ByteBuffer;

.field public q:Ljava/nio/ByteBuffer;

.field public final r:Ljava/lang/Object;

.field public s:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Landroidx/camera/core/f;->d:I

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroidx/camera/core/f;->j:Landroid/graphics/Rect;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroidx/camera/core/f;->k:Landroid/graphics/Rect;

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Landroidx/camera/core/f;->l:Landroid/graphics/Matrix;

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Landroidx/camera/core/f;->m:Landroid/graphics/Matrix;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Landroidx/camera/core/f;->r:Ljava/lang/Object;

    iput-boolean v0, p0, Landroidx/camera/core/f;->s:Z

    return-void
.end method

.method public static synthetic b(Landroidx/camera/core/f;Ljava/util/concurrent/Executor;Landroidx/camera/core/i;Landroid/graphics/Matrix;Landroidx/camera/core/i;Landroid/graphics/Rect;Landroidx/camera/core/e$a;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p7}, Landroidx/camera/core/f;->n(Ljava/util/concurrent/Executor;Landroidx/camera/core/i;Landroid/graphics/Matrix;Landroidx/camera/core/i;Landroid/graphics/Rect;Landroidx/camera/core/e$a;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/camera/core/f;Landroidx/camera/core/i;Landroid/graphics/Matrix;Landroidx/camera/core/i;Landroid/graphics/Rect;Landroidx/camera/core/e$a;LO80$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Landroidx/camera/core/f;->m(Landroidx/camera/core/i;Landroid/graphics/Matrix;Landroidx/camera/core/i;Landroid/graphics/Rect;Landroidx/camera/core/e$a;LO80$a;)V

    return-void
.end method

.method public static i(IIIII)Landroidx/camera/core/n;
    .locals 1

    const/16 v0, 0x5a

    if-eq p2, v0, :cond_1

    const/16 v0, 0x10e

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x1

    :goto_1
    if-eqz p2, :cond_2

    move v0, p1

    goto :goto_2

    :cond_2
    move v0, p0

    :goto_2
    if-eqz p2, :cond_3

    goto :goto_3

    :cond_3
    move p0, p1

    :goto_3
    new-instance p1, Landroidx/camera/core/n;

    invoke-static {v0, p0, p3, p4}, LMX1;->a(IIII)LKX1;

    move-result-object p0

    invoke-direct {p1, p0}, Landroidx/camera/core/n;-><init>(LKX1;)V

    return-object p1
.end method

.method public static k(IIIII)Landroid/graphics/Matrix;
    .locals 3

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    if-lez p4, :cond_0

    new-instance v1, Landroid/graphics/RectF;

    int-to-float p0, p0

    int-to-float p1, p1

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2, p0, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object p0, Lp96;->a:Landroid/graphics/RectF;

    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v0, v1, p0, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    int-to-float p0, p4

    invoke-virtual {v0, p0}, Landroid/graphics/Matrix;->postRotate(F)Z

    new-instance p0, Landroid/graphics/RectF;

    int-to-float p1, p2

    int-to-float p2, p3

    invoke-direct {p0, v2, v2, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-static {p0}, Lp96;->b(Landroid/graphics/RectF;)Landroid/graphics/Matrix;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    :cond_0
    return-object v0
.end method

.method public static l(Landroid/graphics/Rect;Landroid/graphics/Matrix;)Landroid/graphics/Rect;
    .locals 1

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0, p0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    new-instance p0, Landroid/graphics/Rect;

    invoke-direct {p0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v0, p0}, Landroid/graphics/RectF;->round(Landroid/graphics/Rect;)V

    return-object p0
.end method

.method private synthetic m(Landroidx/camera/core/i;Landroid/graphics/Matrix;Landroidx/camera/core/i;Landroid/graphics/Rect;Landroidx/camera/core/e$a;LO80$a;)V
    .locals 3

    iget-boolean v0, p0, Landroidx/camera/core/f;->s:Z

    if-eqz v0, :cond_2

    invoke-interface {p1}, Landroidx/camera/core/i;->i1()LwX1;

    move-result-object v0

    invoke-interface {v0}, LwX1;->b()LxY5;

    move-result-object v0

    invoke-interface {p1}, Landroidx/camera/core/i;->i1()LwX1;

    move-result-object p1

    invoke-interface {p1}, LwX1;->getTimestamp()J

    move-result-wide v1

    iget-boolean p1, p0, Landroidx/camera/core/f;->e:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget p1, p0, Landroidx/camera/core/f;->b:I

    :goto_0
    invoke-static {v0, v1, v2, p1, p2}, LTY1;->d(LxY5;JILandroid/graphics/Matrix;)LwX1;

    move-result-object p1

    new-instance p2, Lfw5;

    invoke-direct {p2, p3, p1}, Lfw5;-><init>(Landroidx/camera/core/i;LwX1;)V

    invoke-virtual {p4}, Landroid/graphics/Rect;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-interface {p2, p4}, Landroidx/camera/core/i;->setCropRect(Landroid/graphics/Rect;)V

    :cond_1
    invoke-interface {p5, p2}, Landroidx/camera/core/e$a;->d(Landroidx/camera/core/i;)V

    const/4 p1, 0x0

    invoke-virtual {p6, p1}, LO80$a;->c(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance p1, Landroidx/core/os/OperationCanceledException;

    const-string p2, "ImageAnalysis is detached"

    invoke-direct {p1, p2}, Landroidx/core/os/OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p6, p1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    :goto_1
    return-void
.end method

.method private synthetic n(Ljava/util/concurrent/Executor;Landroidx/camera/core/i;Landroid/graphics/Matrix;Landroidx/camera/core/i;Landroid/graphics/Rect;Landroidx/camera/core/e$a;LO80$a;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v8, LCW1;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LCW1;-><init>(Landroidx/camera/core/f;Landroidx/camera/core/i;Landroid/graphics/Matrix;Landroidx/camera/core/i;Landroid/graphics/Rect;Landroidx/camera/core/e$a;LO80$a;)V

    move-object v0, p1

    invoke-interface {p1, v8}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string v0, "analyzeImage"

    return-object v0
.end method


# virtual methods
.method public a(LKX1;)V
    .locals 2

    :try_start_0
    invoke-virtual {p0, p1}, Landroidx/camera/core/f;->d(LKX1;)Landroidx/camera/core/i;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Landroidx/camera/core/f;->o(Landroidx/camera/core/i;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "ImageAnalysisAnalyzer"

    const-string v1, "Failed to acquire image."

    invoke-static {v0, v1, p1}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public abstract d(LKX1;)Landroidx/camera/core/i;
.end method

.method public e(Landroidx/camera/core/i;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/i;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Landroidx/camera/core/f;->e:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, p0, Landroidx/camera/core/f;->b:I

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Landroidx/camera/core/f;->r:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v9, p0, Landroidx/camera/core/f;->g:Ljava/util/concurrent/Executor;

    iget-object v10, p0, Landroidx/camera/core/f;->a:Landroidx/camera/core/e$a;

    iget-boolean v3, p0, Landroidx/camera/core/f;->e:Z

    const/4 v11, 0x1

    if-eqz v3, :cond_1

    iget v3, p0, Landroidx/camera/core/f;->c:I

    if-eq v0, v3, :cond_1

    move v12, v11

    goto :goto_1

    :cond_1
    move v12, v1

    :goto_1
    if-eqz v12, :cond_2

    invoke-virtual {p0, p1, v0}, Landroidx/camera/core/f;->q(Landroidx/camera/core/i;I)V

    :cond_2
    iget-boolean v3, p0, Landroidx/camera/core/f;->e:Z

    if-eqz v3, :cond_3

    invoke-virtual {p0, p1}, Landroidx/camera/core/f;->h(Landroidx/camera/core/i;)V

    :cond_3
    iget-object v3, p0, Landroidx/camera/core/f;->h:Landroidx/camera/core/n;

    iget-object v4, p0, Landroidx/camera/core/f;->i:Landroid/media/ImageWriter;

    iget-object v5, p0, Landroidx/camera/core/f;->n:Ljava/nio/ByteBuffer;

    iget-object v6, p0, Landroidx/camera/core/f;->o:Ljava/nio/ByteBuffer;

    iget-object v7, p0, Landroidx/camera/core/f;->p:Ljava/nio/ByteBuffer;

    iget-object v8, p0, Landroidx/camera/core/f;->q:Ljava/nio/ByteBuffer;

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v10, :cond_a

    if-eqz v9, :cond_a

    iget-boolean v2, p0, Landroidx/camera/core/f;->s:Z

    if-eqz v2, :cond_a

    if-eqz v3, :cond_6

    iget v2, p0, Landroidx/camera/core/f;->d:I

    const/4 v13, 0x2

    if-ne v2, v13, :cond_4

    iget-boolean v2, p0, Landroidx/camera/core/f;->f:Z

    invoke-static {p1, v3, v5, v0, v2}, Landroidx/camera/core/ImageProcessingUtil;->f(Landroidx/camera/core/i;LKX1;Ljava/nio/ByteBuffer;IZ)Landroidx/camera/core/i;

    move-result-object v2

    goto :goto_2

    :cond_4
    iget v2, p0, Landroidx/camera/core/f;->d:I

    if-ne v2, v11, :cond_6

    iget-boolean v2, p0, Landroidx/camera/core/f;->f:Z

    if-eqz v2, :cond_5

    invoke-static {p1}, Landroidx/camera/core/ImageProcessingUtil;->c(Landroidx/camera/core/i;)Z

    :cond_5
    if-eqz v4, :cond_6

    if-eqz v6, :cond_6

    if-eqz v7, :cond_6

    if-eqz v8, :cond_6

    move-object v2, p1

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move v8, v0

    invoke-static/range {v2 .. v8}, Landroidx/camera/core/ImageProcessingUtil;->n(Landroidx/camera/core/i;LKX1;Landroid/media/ImageWriter;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)Landroidx/camera/core/i;

    move-result-object v2

    goto :goto_2

    :cond_6
    const/4 v2, 0x0

    :goto_2
    if-nez v2, :cond_7

    move v1, v11

    :cond_7
    if-eqz v1, :cond_8

    move-object v8, p1

    goto :goto_3

    :cond_8
    move-object v8, v2

    :goto_3
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    iget-object v3, p0, Landroidx/camera/core/f;->r:Ljava/lang/Object;

    monitor-enter v3

    if-eqz v12, :cond_9

    if-nez v1, :cond_9

    :try_start_1
    invoke-interface {p1}, Landroidx/camera/core/i;->getWidth()I

    move-result v1

    invoke-interface {p1}, Landroidx/camera/core/i;->getHeight()I

    move-result v4

    invoke-interface {v8}, Landroidx/camera/core/i;->getWidth()I

    move-result v5

    invoke-interface {v8}, Landroidx/camera/core/i;->getHeight()I

    move-result v6

    invoke-virtual {p0, v1, v4, v5, v6}, Landroidx/camera/core/f;->p(IIII)V

    :cond_9
    iput v0, p0, Landroidx/camera/core/f;->c:I

    iget-object v0, p0, Landroidx/camera/core/f;->k:Landroid/graphics/Rect;

    invoke-virtual {v2, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget-object v0, p0, Landroidx/camera/core/f;->m:Landroid/graphics/Matrix;

    invoke-virtual {v7, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    new-instance v0, LBW1;

    move-object v3, v0

    move-object v4, p0

    move-object v5, v9

    move-object v6, p1

    move-object v9, v2

    invoke-direct/range {v3 .. v10}, LBW1;-><init>(Landroidx/camera/core/f;Ljava/util/concurrent/Executor;Landroidx/camera/core/i;Landroid/graphics/Matrix;Landroidx/camera/core/i;Landroid/graphics/Rect;Landroidx/camera/core/e$a;)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    goto :goto_4

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_a
    new-instance p1, Landroidx/core/os/OperationCanceledException;

    const-string v0, "No analyzer or executor currently set."

    invoke-direct {p1, v0}, Landroidx/core/os/OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    :goto_4
    return-object p1

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/camera/core/f;->s:Z

    return-void
.end method

.method public abstract g()V
.end method

.method public final h(Landroidx/camera/core/i;)V
    .locals 3

    iget v0, p0, Landroidx/camera/core/f;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Landroidx/camera/core/f;->o:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_0

    invoke-interface {p1}, Landroidx/camera/core/i;->getWidth()I

    move-result v0

    invoke-interface {p1}, Landroidx/camera/core/i;->getHeight()I

    move-result v1

    mul-int/2addr v0, v1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/f;->o:Ljava/nio/ByteBuffer;

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/f;->o:Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, p0, Landroidx/camera/core/f;->p:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_1

    invoke-interface {p1}, Landroidx/camera/core/i;->getWidth()I

    move-result v0

    invoke-interface {p1}, Landroidx/camera/core/i;->getHeight()I

    move-result v2

    mul-int/2addr v0, v2

    div-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/f;->p:Ljava/nio/ByteBuffer;

    :cond_1
    iget-object v0, p0, Landroidx/camera/core/f;->p:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, p0, Landroidx/camera/core/f;->q:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_2

    invoke-interface {p1}, Landroidx/camera/core/i;->getWidth()I

    move-result v0

    invoke-interface {p1}, Landroidx/camera/core/i;->getHeight()I

    move-result p1

    mul-int/2addr v0, p1

    div-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/f;->q:Ljava/nio/ByteBuffer;

    :cond_2
    iget-object p1, p0, Landroidx/camera/core/f;->q:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_0

    :cond_3
    iget v0, p0, Landroidx/camera/core/f;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Landroidx/camera/core/f;->n:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_4

    invoke-interface {p1}, Landroidx/camera/core/i;->getWidth()I

    move-result v0

    invoke-interface {p1}, Landroidx/camera/core/i;->getHeight()I

    move-result p1

    mul-int/2addr v0, p1

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/f;->n:Ljava/nio/ByteBuffer;

    :cond_4
    :goto_0
    return-void
.end method

.method public j()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/core/f;->s:Z

    invoke-virtual {p0}, Landroidx/camera/core/f;->g()V

    return-void
.end method

.method public abstract o(Landroidx/camera/core/i;)V
.end method

.method public final p(IIII)V
    .locals 1

    iget v0, p0, Landroidx/camera/core/f;->b:I

    invoke-static {p1, p2, p3, p4, v0}, Landroidx/camera/core/f;->k(IIIII)Landroid/graphics/Matrix;

    move-result-object p1

    iget-object p2, p0, Landroidx/camera/core/f;->j:Landroid/graphics/Rect;

    invoke-static {p2, p1}, Landroidx/camera/core/f;->l(Landroid/graphics/Rect;Landroid/graphics/Matrix;)Landroid/graphics/Rect;

    move-result-object p2

    iput-object p2, p0, Landroidx/camera/core/f;->k:Landroid/graphics/Rect;

    iget-object p2, p0, Landroidx/camera/core/f;->m:Landroid/graphics/Matrix;

    iget-object p3, p0, Landroidx/camera/core/f;->l:Landroid/graphics/Matrix;

    invoke-virtual {p2, p3, p1}, Landroid/graphics/Matrix;->setConcat(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Z

    return-void
.end method

.method public final q(Landroidx/camera/core/i;I)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/f;->h:Landroidx/camera/core/n;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroidx/camera/core/n;->m()V

    invoke-interface {p1}, Landroidx/camera/core/i;->getWidth()I

    move-result v0

    invoke-interface {p1}, Landroidx/camera/core/i;->getHeight()I

    move-result p1

    iget-object v1, p0, Landroidx/camera/core/f;->h:Landroidx/camera/core/n;

    invoke-virtual {v1}, Landroidx/camera/core/n;->b()I

    move-result v1

    iget-object v2, p0, Landroidx/camera/core/f;->h:Landroidx/camera/core/n;

    invoke-virtual {v2}, Landroidx/camera/core/n;->c()I

    move-result v2

    invoke-static {v0, p1, p2, v1, v2}, Landroidx/camera/core/f;->i(IIIII)Landroidx/camera/core/n;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/f;->h:Landroidx/camera/core/n;

    iget p1, p0, Landroidx/camera/core/f;->d:I

    const/4 p2, 0x1

    if-ne p1, p2, :cond_2

    iget-object p1, p0, Landroidx/camera/core/f;->i:Landroid/media/ImageWriter;

    if-eqz p1, :cond_1

    invoke-static {p1}, LDY1;->a(Landroid/media/ImageWriter;)V

    :cond_1
    iget-object p1, p0, Landroidx/camera/core/f;->h:Landroidx/camera/core/n;

    invoke-virtual {p1}, Landroidx/camera/core/n;->a()Landroid/view/Surface;

    move-result-object p1

    iget-object p2, p0, Landroidx/camera/core/f;->h:Landroidx/camera/core/n;

    invoke-virtual {p2}, Landroidx/camera/core/n;->c()I

    move-result p2

    invoke-static {p1, p2}, LDY1;->c(Landroid/view/Surface;I)Landroid/media/ImageWriter;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/f;->i:Landroid/media/ImageWriter;

    :cond_2
    return-void
.end method

.method public r(Ljava/util/concurrent/Executor;Landroidx/camera/core/e$a;)V
    .locals 1

    if-nez p2, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/f;->g()V

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/f;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p2, p0, Landroidx/camera/core/f;->a:Landroidx/camera/core/e$a;

    iput-object p1, p0, Landroidx/camera/core/f;->g:Ljava/util/concurrent/Executor;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public s(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/camera/core/f;->f:Z

    return-void
.end method

.method public t(I)V
    .locals 0

    iput p1, p0, Landroidx/camera/core/f;->d:I

    return-void
.end method

.method public u(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/camera/core/f;->e:Z

    return-void
.end method

.method public v(Landroidx/camera/core/n;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/f;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/f;->h:Landroidx/camera/core/n;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public w(I)V
    .locals 0

    iput p1, p0, Landroidx/camera/core/f;->b:I

    return-void
.end method

.method public x(Landroid/graphics/Matrix;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/f;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/f;->l:Landroid/graphics/Matrix;

    new-instance p1, Landroid/graphics/Matrix;

    iget-object v1, p0, Landroidx/camera/core/f;->l:Landroid/graphics/Matrix;

    invoke-direct {p1, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object p1, p0, Landroidx/camera/core/f;->m:Landroid/graphics/Matrix;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public y(Landroid/graphics/Rect;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/f;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/f;->j:Landroid/graphics/Rect;

    new-instance p1, Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/camera/core/f;->j:Landroid/graphics/Rect;

    invoke-direct {p1, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object p1, p0, Landroidx/camera/core/f;->k:Landroid/graphics/Rect;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
