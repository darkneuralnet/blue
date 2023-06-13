.class public LMV5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMV5$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Landroid/graphics/Matrix;

.field public final c:Z

.field public final d:Landroid/graphics/Rect;

.field public final e:Z

.field public final f:I

.field public final g:LBR5;

.field public h:I

.field public i:LSV5;

.field public j:Z

.field public k:Landroidx/camera/core/o;

.field public l:LMV5$a;

.field public final m:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public n:Z


# direct methods
.method public constructor <init>(IILBR5;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IZ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LMV5;->j:Z

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, LMV5;->m:Ljava/util/Set;

    iput-boolean v0, p0, LMV5;->n:Z

    iput p1, p0, LMV5;->f:I

    iput p2, p0, LMV5;->a:I

    iput-object p3, p0, LMV5;->g:LBR5;

    iput-object p4, p0, LMV5;->b:Landroid/graphics/Matrix;

    iput-boolean p5, p0, LMV5;->c:Z

    iput-object p6, p0, LMV5;->d:Landroid/graphics/Rect;

    iput p7, p0, LMV5;->h:I

    iput-boolean p8, p0, LMV5;->e:Z

    new-instance p1, LMV5$a;

    invoke-virtual {p3}, LBR5;->c()Landroid/util/Size;

    move-result-object p3

    invoke-direct {p1, p3, p2}, LMV5$a;-><init>(Landroid/util/Size;I)V

    iput-object p1, p0, LMV5;->l:LMV5$a;

    return-void
.end method

.method private synthetic A(I)V
    .locals 1

    iget v0, p0, LMV5;->h:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, LMV5;->h:I

    invoke-virtual {p0}, LMV5;->B()V

    return-void
.end method

.method public static synthetic a(LMV5;I)V
    .locals 0

    invoke-direct {p0, p1}, LMV5;->A(I)V

    return-void
.end method

.method public static synthetic b(LMV5;LMV5$a;ILandroid/util/Size;Landroid/graphics/Rect;IZLLb0;Landroid/view/Surface;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    invoke-direct/range {p0 .. p8}, LMV5;->x(LMV5$a;ILandroid/util/Size;Landroid/graphics/Rect;IZLLb0;Landroid/view/Surface;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LMV5;)V
    .locals 0

    invoke-direct {p0}, LMV5;->z()V

    return-void
.end method

.method public static synthetic d(LMV5;)V
    .locals 0

    invoke-direct {p0}, LMV5;->y()V

    return-void
.end method

.method private synthetic x(LMV5$a;ILandroid/util/Size;Landroid/graphics/Rect;IZLLb0;Landroid/view/Surface;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object v1, p0

    invoke-static/range {p8 .. p8}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-virtual {p1}, Landroidx/camera/core/impl/DeferrableSurface;->j()V
    :try_end_0
    .catch Landroidx/camera/core/impl/DeferrableSurface$SurfaceClosedException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v0, LSV5;

    invoke-virtual {p0}, LMV5;->u()I

    move-result v4

    iget-object v2, v1, LMV5;->g:LBR5;

    invoke-virtual {v2}, LBR5;->c()Landroid/util/Size;

    move-result-object v6

    move-object v2, v0

    move-object/from16 v3, p8

    move v5, p2

    move-object v7, p3

    move-object/from16 v8, p4

    move/from16 v9, p5

    move/from16 v10, p6

    move-object/from16 v11, p7

    invoke-direct/range {v2 .. v11}, LSV5;-><init>(Landroid/view/Surface;IILandroid/util/Size;Landroid/util/Size;Landroid/graphics/Rect;IZLLb0;)V

    invoke-virtual {v0}, LSV5;->g()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v2

    new-instance v3, LJV5;

    move-object v4, p1

    invoke-direct {v3, p1}, LJV5;-><init>(LMV5$a;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iput-object v0, v1, LMV5;->i:LSV5;

    invoke-static {v0}, LIA1;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    move-object v2, v0

    invoke-static {v2}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method private synthetic y()V
    .locals 1

    iget-boolean v0, p0, LMV5;->n:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, LMV5;->w()V

    :cond_0
    return-void
.end method

.method private synthetic z()V
    .locals 2

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, LHV5;

    invoke-direct {v1, p0}, LHV5;-><init>(LMV5;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public final B()V
    .locals 5

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, LMV5;->k:Landroidx/camera/core/o;

    if-eqz v0, :cond_0

    iget-object v1, p0, LMV5;->d:Landroid/graphics/Rect;

    iget v2, p0, LMV5;->h:I

    const/4 v3, -0x1

    invoke-virtual {p0}, LMV5;->v()Z

    move-result v4

    invoke-static {v1, v2, v3, v4}, Landroidx/camera/core/o$h;->e(Landroid/graphics/Rect;IIZ)Landroidx/camera/core/o$h;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/o;->C(Landroidx/camera/core/o$h;)V

    :cond_0
    return-void
.end method

.method public C(Landroidx/camera/core/impl/DeferrableSurface;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/impl/DeferrableSurface$SurfaceClosedException;
        }
    .end annotation

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, LMV5;->g()V

    iget-object v0, p0, LMV5;->l:LMV5$a;

    invoke-virtual {v0, p1}, LMV5$a;->s(Landroidx/camera/core/impl/DeferrableSurface;)Z

    return-void
.end method

.method public D(I)V
    .locals 1

    new-instance v0, LGV5;

    invoke-direct {v0, p0, p1}, LGV5;-><init>(LMV5;I)V

    invoke-static {v0}, LO36;->d(Ljava/lang/Runnable;)V

    return-void
.end method

.method public e(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, LMV5;->g()V

    iget-object v0, p0, LMV5;->m:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final f()V
    .locals 3

    iget-boolean v0, p0, LMV5;->j:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "Consumer can only be linked once."

    invoke-static {v0, v2}, LHZ3;->j(ZLjava/lang/String;)V

    iput-boolean v1, p0, LMV5;->j:Z

    return-void
.end method

.method public final g()V
    .locals 2

    iget-boolean v0, p0, LMV5;->n:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Edge is already closed."

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    return-void
.end method

.method public final h()V
    .locals 1

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, LMV5;->m()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LMV5;->n:Z

    return-void
.end method

.method public i(Landroid/util/Size;ILandroid/graphics/Rect;IZLLb0;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Size;",
            "I",
            "Landroid/graphics/Rect;",
            "IZ",
            "LLb0;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "LPV5;",
            ">;"
        }
    .end annotation

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, LMV5;->g()V

    invoke-virtual {p0}, LMV5;->f()V

    move-object v9, p0

    iget-object v2, v9, LMV5;->l:LMV5$a;

    invoke-virtual {v2}, Landroidx/camera/core/impl/DeferrableSurface;->h()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v10

    new-instance v11, LIV5;

    move-object v0, v11

    move-object v1, p0

    move v3, p2

    move-object v4, p1

    move-object v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v8, p6

    invoke-direct/range {v0 .. v8}, LIV5;-><init>(LMV5;LMV5$a;ILandroid/util/Size;Landroid/graphics/Rect;IZLLb0;)V

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-static {v10, v11, v0}, LIA1;->p(Lcom/google/common/util/concurrent/ListenableFuture;Lfp;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public j(LLb0;)Landroidx/camera/core/o;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LMV5;->k(LLb0;Landroid/util/Range;)Landroidx/camera/core/o;

    move-result-object p1

    return-object p1
.end method

.method public k(LLb0;Landroid/util/Range;)Landroidx/camera/core/o;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLb0;",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroidx/camera/core/o;"
        }
    .end annotation

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, LMV5;->g()V

    new-instance v0, Landroidx/camera/core/o;

    iget-object v1, p0, LMV5;->g:LBR5;

    invoke-virtual {v1}, LBR5;->c()Landroid/util/Size;

    move-result-object v1

    new-instance v2, LEV5;

    invoke-direct {v2, p0}, LEV5;-><init>(LMV5;)V

    invoke-direct {v0, v1, p1, p2, v2}, Landroidx/camera/core/o;-><init>(Landroid/util/Size;LLb0;Landroid/util/Range;Ljava/lang/Runnable;)V

    :try_start_0
    invoke-virtual {v0}, Landroidx/camera/core/o;->l()Landroidx/camera/core/impl/DeferrableSurface;

    move-result-object p1

    iget-object p2, p0, LMV5;->l:LMV5$a;

    invoke-virtual {p2, p1}, LMV5$a;->s(Landroidx/camera/core/impl/DeferrableSurface;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, LMV5;->l:LMV5$a;

    invoke-virtual {p2}, Landroidx/camera/core/impl/DeferrableSurface;->i()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p2

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LFV5;

    invoke-direct {v1, p1}, LFV5;-><init>(Landroidx/camera/core/impl/DeferrableSurface;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {p2, v1, p1}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catch Landroidx/camera/core/impl/DeferrableSurface$SurfaceClosedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    iput-object v0, p0, LMV5;->k:Landroidx/camera/core/o;

    invoke-virtual {p0}, LMV5;->B()V

    return-object v0

    :catch_0
    move-exception p1

    invoke-virtual {v0}, Landroidx/camera/core/o;->D()Z

    throw p1

    :catch_1
    move-exception p1

    new-instance p2, Ljava/lang/AssertionError;

    const-string v0, "Surface is somehow already closed"

    invoke-direct {p2, v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final l()V
    .locals 0

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, LMV5;->g()V

    invoke-virtual {p0}, LMV5;->m()V

    return-void
.end method

.method public final m()V
    .locals 1

    iget-object v0, p0, LMV5;->l:LMV5$a;

    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->c()V

    iget-object v0, p0, LMV5;->i:LSV5;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LSV5;->j()V

    const/4 v0, 0x0

    iput-object v0, p0, LMV5;->i:LSV5;

    :cond_0
    return-void
.end method

.method public n()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, LMV5;->d:Landroid/graphics/Rect;

    return-object v0
.end method

.method public o()Landroidx/camera/core/impl/DeferrableSurface;
    .locals 1

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, LMV5;->g()V

    invoke-virtual {p0}, LMV5;->f()V

    iget-object v0, p0, LMV5;->l:LMV5$a;

    return-object v0
.end method

.method public p()I
    .locals 1

    iget v0, p0, LMV5;->a:I

    return v0
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, LMV5;->e:Z

    return v0
.end method

.method public r()I
    .locals 1

    iget v0, p0, LMV5;->h:I

    return v0
.end method

.method public s()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, LMV5;->b:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public t()LBR5;
    .locals 1

    iget-object v0, p0, LMV5;->g:LBR5;

    return-object v0
.end method

.method public u()I
    .locals 1

    iget v0, p0, LMV5;->f:I

    return v0
.end method

.method public v()Z
    .locals 1

    iget-boolean v0, p0, LMV5;->c:Z

    return v0
.end method

.method public w()V
    .locals 3

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, LMV5;->g()V

    iget-object v0, p0, LMV5;->l:LMV5$a;

    invoke-virtual {v0}, LMV5$a;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LMV5;->m()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LMV5;->j:Z

    new-instance v0, LMV5$a;

    iget-object v1, p0, LMV5;->g:LBR5;

    invoke-virtual {v1}, LBR5;->c()Landroid/util/Size;

    move-result-object v1

    iget v2, p0, LMV5;->a:I

    invoke-direct {v0, v1, v2}, LMV5$a;-><init>(Landroid/util/Size;I)V

    iput-object v0, p0, LMV5;->l:LMV5$a;

    iget-object v0, p0, LMV5;->m:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_1
    return-void
.end method
