.class public LUs4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LoB$b;
.implements LDk2;
.implements LhJ3;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/RectF;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:LRD2;

.field public final f:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "*",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "*",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "*",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Luu0;

.field public j:LoB;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoB<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public k:Z


# direct methods
.method public constructor <init>(LRD2;LqB;LYs4;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, LUs4;->a:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, LUs4;->b:Landroid/graphics/RectF;

    new-instance v0, Luu0;

    invoke-direct {v0}, Luu0;-><init>()V

    iput-object v0, p0, LUs4;->i:Luu0;

    const/4 v0, 0x0

    iput-object v0, p0, LUs4;->j:LoB;

    invoke-virtual {p3}, LYs4;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LUs4;->c:Ljava/lang/String;

    invoke-virtual {p3}, LYs4;->f()Z

    move-result v0

    iput-boolean v0, p0, LUs4;->d:Z

    iput-object p1, p0, LUs4;->e:LRD2;

    invoke-virtual {p3}, LYs4;->d()LGe;

    move-result-object p1

    invoke-interface {p1}, LGe;->a()LoB;

    move-result-object p1

    iput-object p1, p0, LUs4;->f:LoB;

    invoke-virtual {p3}, LYs4;->e()LGe;

    move-result-object v0

    invoke-interface {v0}, LGe;->a()LoB;

    move-result-object v0

    iput-object v0, p0, LUs4;->g:LoB;

    invoke-virtual {p3}, LYs4;->b()Lqe;

    move-result-object p3

    invoke-virtual {p3}, Lqe;->a()LoB;

    move-result-object p3

    iput-object p3, p0, LUs4;->h:LoB;

    invoke-virtual {p2, p1}, LqB;->i(LoB;)V

    invoke-virtual {p2, v0}, LqB;->i(LoB;)V

    invoke-virtual {p2, p3}, LqB;->i(LoB;)V

    invoke-virtual {p1, p0}, LoB;->a(LoB$b;)V

    invoke-virtual {v0, p0}, LoB;->a(LoB$b;)V

    invoke-virtual {p3, p0}, LoB;->a(LoB$b;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, LUs4;->k:Z

    iget-object v0, p0, LUs4;->e:LRD2;

    invoke-virtual {v0}, LRD2;->invalidateSelf()V

    return-void
.end method

.method public c(LBk2;ILjava/util/List;LBk2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBk2;",
            "I",
            "Ljava/util/List<",
            "LBk2;",
            ">;",
            "LBk2;",
            ")V"
        }
    .end annotation

    invoke-static {p1, p2, p3, p4, p0}, LrU2;->k(LBk2;ILjava/util/List;LBk2;LDk2;)V

    return-void
.end method

.method public e()V
    .locals 0

    invoke-virtual {p0}, LUs4;->b()V

    return-void
.end method

.method public f(Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LVz0;",
            ">;",
            "Ljava/util/List<",
            "LVz0;",
            ">;)V"
        }
    .end annotation

    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_2

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVz0;

    instance-of v1, v0, Lxa6;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lxa6;

    invoke-virtual {v1}, Lxa6;->j()LAy5$a;

    move-result-object v2

    sget-object v3, LAy5$a;->b:LAy5$a;

    if-ne v2, v3, :cond_0

    iget-object v0, p0, LUs4;->i:Luu0;

    invoke-virtual {v0, v1}, Luu0;->a(Lxa6;)V

    invoke-virtual {v1, p0}, Lxa6;->b(LoB$b;)V

    goto :goto_1

    :cond_0
    instance-of v1, v0, Lfc5;

    if-eqz v1, :cond_1

    check-cast v0, Lfc5;

    invoke-virtual {v0}, Lfc5;->h()LoB;

    move-result-object v0

    iput-object v0, p0, LUs4;->j:LoB;

    :cond_1
    :goto_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LUs4;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getPath()Landroid/graphics/Path;
    .locals 17

    move-object/from16 v0, p0

    iget-boolean v1, v0, LUs4;->k:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, LUs4;->a:Landroid/graphics/Path;

    return-object v1

    :cond_0
    iget-object v1, v0, LUs4;->a:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    iget-boolean v1, v0, LUs4;->d:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iput-boolean v2, v0, LUs4;->k:Z

    iget-object v1, v0, LUs4;->a:Landroid/graphics/Path;

    return-object v1

    :cond_1
    iget-object v1, v0, LUs4;->g:LoB;

    invoke-virtual {v1}, LoB;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget v3, v1, Landroid/graphics/PointF;->x:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    iget v1, v1, Landroid/graphics/PointF;->y:F

    div-float/2addr v1, v4

    iget-object v5, v0, LUs4;->h:LoB;

    const/4 v6, 0x0

    if-nez v5, :cond_2

    move v5, v6

    goto :goto_0

    :cond_2
    check-cast v5, Lou1;

    invoke-virtual {v5}, Lou1;->p()F

    move-result v5

    :goto_0
    cmpl-float v7, v5, v6

    if-nez v7, :cond_3

    iget-object v7, v0, LUs4;->j:LoB;

    if-eqz v7, :cond_3

    invoke-virtual {v7}, LoB;->h()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-static {v3, v1}, Ljava/lang/Math;->min(FF)F

    move-result v7

    invoke-static {v5, v7}, Ljava/lang/Math;->min(FF)F

    move-result v5

    :cond_3
    invoke-static {v3, v1}, Ljava/lang/Math;->min(FF)F

    move-result v7

    cmpl-float v8, v5, v7

    if-lez v8, :cond_4

    move v5, v7

    :cond_4
    iget-object v7, v0, LUs4;->f:LoB;

    invoke-virtual {v7}, LoB;->h()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/graphics/PointF;

    iget-object v8, v0, LUs4;->a:Landroid/graphics/Path;

    iget v9, v7, Landroid/graphics/PointF;->x:F

    add-float/2addr v9, v3

    iget v10, v7, Landroid/graphics/PointF;->y:F

    sub-float/2addr v10, v1

    add-float/2addr v10, v5

    invoke-virtual {v8, v9, v10}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v8, v0, LUs4;->a:Landroid/graphics/Path;

    iget v9, v7, Landroid/graphics/PointF;->x:F

    add-float/2addr v9, v3

    iget v10, v7, Landroid/graphics/PointF;->y:F

    add-float/2addr v10, v1

    sub-float/2addr v10, v5

    invoke-virtual {v8, v9, v10}, Landroid/graphics/Path;->lineTo(FF)V

    cmpl-float v8, v5, v6

    const/4 v9, 0x0

    const/high16 v10, 0x42b40000    # 90.0f

    if-lez v8, :cond_5

    iget-object v11, v0, LUs4;->b:Landroid/graphics/RectF;

    iget v12, v7, Landroid/graphics/PointF;->x:F

    add-float v13, v12, v3

    mul-float v14, v5, v4

    sub-float/2addr v13, v14

    iget v15, v7, Landroid/graphics/PointF;->y:F

    add-float v16, v15, v1

    sub-float v14, v16, v14

    add-float/2addr v12, v3

    add-float/2addr v15, v1

    invoke-virtual {v11, v13, v14, v12, v15}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v11, v0, LUs4;->a:Landroid/graphics/Path;

    iget-object v12, v0, LUs4;->b:Landroid/graphics/RectF;

    invoke-virtual {v11, v12, v6, v10, v9}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    :cond_5
    iget-object v6, v0, LUs4;->a:Landroid/graphics/Path;

    iget v11, v7, Landroid/graphics/PointF;->x:F

    sub-float/2addr v11, v3

    add-float/2addr v11, v5

    iget v12, v7, Landroid/graphics/PointF;->y:F

    add-float/2addr v12, v1

    invoke-virtual {v6, v11, v12}, Landroid/graphics/Path;->lineTo(FF)V

    if-lez v8, :cond_6

    iget-object v6, v0, LUs4;->b:Landroid/graphics/RectF;

    iget v11, v7, Landroid/graphics/PointF;->x:F

    sub-float v12, v11, v3

    iget v13, v7, Landroid/graphics/PointF;->y:F

    add-float v14, v13, v1

    mul-float v15, v5, v4

    sub-float/2addr v14, v15

    sub-float/2addr v11, v3

    add-float/2addr v11, v15

    add-float/2addr v13, v1

    invoke-virtual {v6, v12, v14, v11, v13}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v6, v0, LUs4;->a:Landroid/graphics/Path;

    iget-object v11, v0, LUs4;->b:Landroid/graphics/RectF;

    invoke-virtual {v6, v11, v10, v10, v9}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    :cond_6
    iget-object v6, v0, LUs4;->a:Landroid/graphics/Path;

    iget v11, v7, Landroid/graphics/PointF;->x:F

    sub-float/2addr v11, v3

    iget v12, v7, Landroid/graphics/PointF;->y:F

    sub-float/2addr v12, v1

    add-float/2addr v12, v5

    invoke-virtual {v6, v11, v12}, Landroid/graphics/Path;->lineTo(FF)V

    if-lez v8, :cond_7

    iget-object v6, v0, LUs4;->b:Landroid/graphics/RectF;

    iget v11, v7, Landroid/graphics/PointF;->x:F

    sub-float v12, v11, v3

    iget v13, v7, Landroid/graphics/PointF;->y:F

    sub-float v14, v13, v1

    sub-float/2addr v11, v3

    mul-float v15, v5, v4

    add-float/2addr v11, v15

    sub-float/2addr v13, v1

    add-float/2addr v13, v15

    invoke-virtual {v6, v12, v14, v11, v13}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v6, v0, LUs4;->a:Landroid/graphics/Path;

    iget-object v11, v0, LUs4;->b:Landroid/graphics/RectF;

    const/high16 v12, 0x43340000    # 180.0f

    invoke-virtual {v6, v11, v12, v10, v9}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    :cond_7
    iget-object v6, v0, LUs4;->a:Landroid/graphics/Path;

    iget v11, v7, Landroid/graphics/PointF;->x:F

    add-float/2addr v11, v3

    sub-float/2addr v11, v5

    iget v12, v7, Landroid/graphics/PointF;->y:F

    sub-float/2addr v12, v1

    invoke-virtual {v6, v11, v12}, Landroid/graphics/Path;->lineTo(FF)V

    if-lez v8, :cond_8

    iget-object v6, v0, LUs4;->b:Landroid/graphics/RectF;

    iget v8, v7, Landroid/graphics/PointF;->x:F

    add-float v11, v8, v3

    mul-float/2addr v5, v4

    sub-float/2addr v11, v5

    iget v4, v7, Landroid/graphics/PointF;->y:F

    sub-float v7, v4, v1

    add-float/2addr v8, v3

    sub-float/2addr v4, v1

    add-float/2addr v4, v5

    invoke-virtual {v6, v11, v7, v8, v4}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v1, v0, LUs4;->a:Landroid/graphics/Path;

    iget-object v3, v0, LUs4;->b:Landroid/graphics/RectF;

    const/high16 v4, 0x43870000    # 270.0f

    invoke-virtual {v1, v3, v4, v10, v9}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    :cond_8
    iget-object v1, v0, LUs4;->a:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    iget-object v1, v0, LUs4;->i:Luu0;

    iget-object v3, v0, LUs4;->a:Landroid/graphics/Path;

    invoke-virtual {v1, v3}, Luu0;->b(Landroid/graphics/Path;)V

    iput-boolean v2, v0, LUs4;->k:Z

    iget-object v1, v0, LUs4;->a:Landroid/graphics/Path;

    return-object v1
.end method

.method public h(Ljava/lang/Object;LgE2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "LgE2<",
            "TT;>;)V"
        }
    .end annotation

    sget-object v0, LaE2;->l:Landroid/graphics/PointF;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LUs4;->g:LoB;

    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto :goto_0

    :cond_0
    sget-object v0, LaE2;->n:Landroid/graphics/PointF;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, LUs4;->f:LoB;

    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    goto :goto_0

    :cond_1
    sget-object v0, LaE2;->m:Ljava/lang/Float;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, LUs4;->h:LoB;

    invoke-virtual {p1, p2}, LoB;->n(LgE2;)V

    :cond_2
    :goto_0
    return-void
.end method
