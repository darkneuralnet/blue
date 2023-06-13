.class public LYV5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYV5$b;,
        LYV5$c;,
        LYV5$d;
    }
.end annotation


# instance fields
.field public final a:LUV5;

.field public final b:LLb0;

.field public c:LYV5$c;

.field public d:LYV5$b;


# direct methods
.method public constructor <init>(LLb0;LUV5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYV5;->b:LLb0;

    iput-object p2, p0, LYV5;->a:LUV5;

    return-void
.end method

.method public static synthetic a(Ljava/util/Map;Landroidx/camera/core/o$h;)V
    .locals 0

    invoke-static {p0, p1}, LYV5;->g(Ljava/util/Map;Landroidx/camera/core/o$h;)V

    return-void
.end method

.method public static synthetic b(LYV5;LMV5;Ljava/util/Map$Entry;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LYV5;->f(LMV5;Ljava/util/Map$Entry;)V

    return-void
.end method

.method public static synthetic c(LYV5;)V
    .locals 0

    invoke-direct {p0}, LYV5;->e()V

    return-void
.end method

.method private synthetic e()V
    .locals 2

    iget-object v0, p0, LYV5;->c:LYV5$c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LMV5;

    invoke-virtual {v1}, LMV5;->h()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private synthetic f(LMV5;Ljava/util/Map$Entry;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LYV5;->d(LMV5;Ljava/util/Map$Entry;)V

    return-void
.end method

.method public static synthetic g(Ljava/util/Map;Landroidx/camera/core/o$h;)V
    .locals 3

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p1}, Landroidx/camera/core/o$h;->b()I

    move-result v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYV5$d;

    invoke-virtual {v2}, LYV5$d;->d()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYV5$d;

    invoke-virtual {v2}, LYV5$d;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    neg-int v1, v1

    :cond_0
    invoke-static {v1}, Lp96;->s(I)I

    move-result v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LMV5;

    invoke-virtual {v0, v1}, LMV5;->D(I)V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final d(LMV5;Ljava/util/Map$Entry;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMV5;",
            "Ljava/util/Map$Entry<",
            "LYV5$d;",
            "LMV5;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LMV5;

    invoke-virtual {p1}, LMV5;->t()LBR5;

    move-result-object p1

    invoke-virtual {p1}, LBR5;->c()Landroid/util/Size;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYV5$d;

    invoke-virtual {p1}, LYV5$d;->b()I

    move-result v3

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYV5$d;

    invoke-virtual {p1}, LYV5$d;->a()Landroid/graphics/Rect;

    move-result-object v4

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYV5$d;

    invoke-virtual {p1}, LYV5$d;->d()I

    move-result v5

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYV5$d;

    invoke-virtual {p1}, LYV5$d;->c()Z

    move-result v6

    iget-object v7, p0, LYV5;->b:LLb0;

    invoke-virtual/range {v1 .. v7}, LMV5;->i(Landroid/util/Size;ILandroid/graphics/Rect;IZLLb0;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    new-instance p2, LYV5$a;

    invoke-direct {p2, p0}, LYV5$a;-><init>(LYV5;)V

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-static {p1, p2, v0}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public h()V
    .locals 2

    iget-object v0, p0, LYV5;->a:LUV5;

    invoke-interface {v0}, LUV5;->release()V

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, LXV5;

    invoke-direct {v1, p0}, LXV5;-><init>(LYV5;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final i(LMV5;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMV5;",
            "Ljava/util/Map<",
            "LYV5$d;",
            "LMV5;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1, v0}, LYV5;->d(LMV5;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LMV5;

    new-instance v2, LWV5;

    invoke-direct {v2, p0, p1, v0}, LWV5;-><init>(LYV5;LMV5;Ljava/util/Map$Entry;)V

    invoke-virtual {v1, v2}, LMV5;->e(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final j(LMV5;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMV5;",
            "Ljava/util/Map<",
            "LYV5$d;",
            "LMV5;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LYV5;->b:LLb0;

    invoke-virtual {p1, v0}, LMV5;->j(LLb0;)Landroidx/camera/core/o;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LYV5;->k(Landroidx/camera/core/o;Ljava/util/Map;)V

    :try_start_0
    iget-object p2, p0, LYV5;->a:LUV5;

    invoke-interface {p2, p1}, LTV5;->b(Landroidx/camera/core/o;)V
    :try_end_0
    .catch Landroidx/camera/core/ProcessingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "SurfaceProcessorNode"

    const-string v0, "Failed to send SurfaceRequest to SurfaceProcessor."

    invoke-static {p2, v0, p1}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public k(Landroidx/camera/core/o;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/o;",
            "Ljava/util/Map<",
            "LYV5$d;",
            "LMV5;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, LVV5;

    invoke-direct {v1, p2}, LVV5;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1, v0, v1}, Landroidx/camera/core/o;->B(Ljava/util/concurrent/Executor;Landroidx/camera/core/o$i;)V

    return-void
.end method

.method public l(LYV5$b;)LYV5$c;
    .locals 4

    invoke-static {}, LO36;->a()V

    iput-object p1, p0, LYV5;->d:LYV5$b;

    new-instance v0, LYV5$c;

    invoke-direct {v0}, LYV5$c;-><init>()V

    iput-object v0, p0, LYV5;->c:LYV5$c;

    invoke-virtual {p1}, LYV5$b;->b()LMV5;

    move-result-object v0

    invoke-virtual {p1}, LYV5$b;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYV5$d;

    iget-object v2, p0, LYV5;->c:LYV5$c;

    invoke-virtual {p0, v0, v1}, LYV5;->m(LMV5;LYV5$d;)LMV5;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object p1, p0, LYV5;->c:LYV5$c;

    invoke-virtual {p0, v0, p1}, LYV5;->j(LMV5;Ljava/util/Map;)V

    iget-object p1, p0, LYV5;->c:LYV5$c;

    invoke-virtual {p0, v0, p1}, LYV5;->i(LMV5;Ljava/util/Map;)V

    iget-object p1, p0, LYV5;->c:LYV5$c;

    return-object p1
.end method

.method public final m(LMV5;LYV5$d;)LMV5;
    .locals 12

    invoke-virtual {p2}, LYV5$d;->a()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p2}, LYV5$d;->d()I

    move-result v1

    invoke-virtual {p2}, LYV5$d;->c()Z

    move-result v2

    new-instance v7, Landroid/graphics/Matrix;

    invoke-virtual {p1}, LMV5;->s()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-direct {v7, v3}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    invoke-virtual {p1}, LMV5;->t()LBR5;

    move-result-object v3

    invoke-virtual {v3}, LBR5;->c()Landroid/util/Size;

    move-result-object v3

    invoke-static {v3}, Lp96;->p(Landroid/util/Size;)Landroid/graphics/RectF;

    move-result-object v3

    invoke-virtual {p2}, LYV5$d;->e()Landroid/util/Size;

    move-result-object v4

    invoke-static {v4}, Lp96;->p(Landroid/util/Size;)Landroid/graphics/RectF;

    move-result-object v4

    invoke-static {v3, v4, v1, v2}, Lp96;->d(Landroid/graphics/RectF;Landroid/graphics/RectF;IZ)Landroid/graphics/Matrix;

    move-result-object v3

    invoke-virtual {v7, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    invoke-static {v0, v1}, Lp96;->e(Landroid/graphics/Rect;I)Landroid/util/Size;

    move-result-object v0

    invoke-virtual {p2}, LYV5$d;->e()Landroid/util/Size;

    move-result-object v3

    invoke-static {v0, v3}, Lp96;->h(Landroid/util/Size;Landroid/util/Size;)Z

    move-result v0

    invoke-static {v0}, LHZ3;->a(Z)V

    invoke-virtual {p2}, LYV5$d;->e()Landroid/util/Size;

    move-result-object v0

    invoke-static {v0}, LBR5;->a(Landroid/util/Size;)LBR5$a;

    move-result-object v0

    invoke-virtual {p1}, LMV5;->t()LBR5;

    move-result-object v3

    invoke-virtual {v3}, LBR5;->b()Landroid/util/Range;

    move-result-object v3

    invoke-virtual {v0, v3}, LBR5$a;->b(Landroid/util/Range;)LBR5$a;

    move-result-object v0

    invoke-virtual {v0}, LBR5$a;->a()LBR5;

    move-result-object v6

    new-instance v0, LMV5;

    invoke-virtual {p2}, LYV5$d;->f()I

    move-result v4

    invoke-virtual {p2}, LYV5$d;->b()I

    move-result v5

    const/4 v8, 0x0

    invoke-virtual {p2}, LYV5$d;->e()Landroid/util/Size;

    move-result-object p2

    invoke-static {p2}, Lp96;->n(Landroid/util/Size;)Landroid/graphics/Rect;

    move-result-object v9

    invoke-virtual {p1}, LMV5;->r()I

    move-result p2

    sub-int v10, p2, v1

    invoke-virtual {p1}, LMV5;->q()Z

    move-result p1

    if-eq p1, v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move v11, p1

    move-object v3, v0

    invoke-direct/range {v3 .. v11}, LMV5;-><init>(IILBR5;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IZ)V

    return-object v0
.end method
