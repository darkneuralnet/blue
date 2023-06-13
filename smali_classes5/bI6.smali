.class public LbI6;
.super LYu;
.source "SourceFile"


# instance fields
.field public h:LaI6;

.field public i:Landroid/graphics/Paint;

.field public j:Landroid/graphics/Path;

.field public k:Landroid/graphics/RectF;

.field public l:[F

.field public m:Landroid/graphics/Path;

.field public n:Landroid/graphics/RectF;

.field public o:Landroid/graphics/Path;

.field public p:[F

.field public q:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(LFs6;LaI6;LD96;)V
    .locals 0

    invoke-direct {p0, p1, p3, p2}, LYu;-><init>(LFs6;LD96;LXu;)V

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, LbI6;->j:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, LbI6;->k:Landroid/graphics/RectF;

    const/4 p1, 0x2

    new-array p3, p1, [F

    iput-object p3, p0, LbI6;->l:[F

    new-instance p3, Landroid/graphics/Path;

    invoke-direct {p3}, Landroid/graphics/Path;-><init>()V

    iput-object p3, p0, LbI6;->m:Landroid/graphics/Path;

    new-instance p3, Landroid/graphics/RectF;

    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    iput-object p3, p0, LbI6;->n:Landroid/graphics/RectF;

    new-instance p3, Landroid/graphics/Path;

    invoke-direct {p3}, Landroid/graphics/Path;-><init>()V

    iput-object p3, p0, LbI6;->o:Landroid/graphics/Path;

    new-array p1, p1, [F

    iput-object p1, p0, LbI6;->p:[F

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, LbI6;->q:Landroid/graphics/RectF;

    iput-object p2, p0, LbI6;->h:LaI6;

    iget-object p1, p0, Lqx4;->a:LFs6;

    if-eqz p1, :cond_0

    iget-object p1, p0, LYu;->e:Landroid/graphics/Paint;

    const/high16 p2, -0x1000000

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, LYu;->e:Landroid/graphics/Paint;

    const/high16 p2, 0x41200000    # 10.0f

    invoke-static {p2}, LOi6;->e(F)F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, LbI6;->i:Landroid/graphics/Paint;

    const p2, -0x777778

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, LbI6;->i:Landroid/graphics/Paint;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p1, p0, LbI6;->i:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public d(Landroid/graphics/Canvas;F[FF)V
    .locals 5

    iget-object v0, p0, LbI6;->h:LaI6;

    invoke-virtual {v0}, LaI6;->Z()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iget-object v1, p0, LbI6;->h:LaI6;

    invoke-virtual {v1}, LaI6;->a0()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LbI6;->h:LaI6;

    iget v1, v1, LXu;->n:I

    goto :goto_0

    :cond_0
    iget-object v1, p0, LbI6;->h:LaI6;

    iget v1, v1, LXu;->n:I

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ge v0, v1, :cond_1

    iget-object v2, p0, LbI6;->h:LaI6;

    invoke-virtual {v2, v0}, LXu;->n(I)Ljava/lang/String;

    move-result-object v2

    mul-int/lit8 v3, v0, 0x2

    add-int/lit8 v3, v3, 0x1

    aget v3, p3, v3

    add-float/2addr v3, p4

    iget-object v4, p0, LYu;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, p2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public e(Landroid/graphics/Canvas;)V
    .locals 6

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    iget-object v1, p0, LbI6;->n:Landroid/graphics/RectF;

    iget-object v2, p0, Lqx4;->a:LFs6;

    invoke-virtual {v2}, LFs6;->o()Landroid/graphics/RectF;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    iget-object v1, p0, LbI6;->n:Landroid/graphics/RectF;

    iget-object v2, p0, LbI6;->h:LaI6;

    invoke-virtual {v2}, LaI6;->Y()F

    move-result v2

    neg-float v2, v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Landroid/graphics/RectF;->inset(FF)V

    iget-object v1, p0, LbI6;->n:Landroid/graphics/RectF;

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    iget-object v1, p0, LYu;->c:LD96;

    invoke-virtual {v1, v3, v3}, LD96;->e(FF)LOE2;

    move-result-object v1

    iget-object v2, p0, LbI6;->i:Landroid/graphics/Paint;

    iget-object v3, p0, LbI6;->h:LaI6;

    invoke-virtual {v3}, LaI6;->X()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, p0, LbI6;->i:Landroid/graphics/Paint;

    iget-object v3, p0, LbI6;->h:LaI6;

    invoke-virtual {v3}, LaI6;->Y()F

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v2, p0, LbI6;->m:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    iget-object v3, p0, Lqx4;->a:LFs6;

    invoke-virtual {v3}, LFs6;->h()F

    move-result v3

    iget-wide v4, v1, LOE2;->d:D

    double-to-float v4, v4

    invoke-virtual {v2, v3, v4}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v3, p0, Lqx4;->a:LFs6;

    invoke-virtual {v3}, LFs6;->i()F

    move-result v3

    iget-wide v4, v1, LOE2;->d:D

    double-to-float v1, v4

    invoke-virtual {v2, v3, v1}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v1, p0, LbI6;->i:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method

.method public f()Landroid/graphics/RectF;
    .locals 3

    iget-object v0, p0, LbI6;->k:Landroid/graphics/RectF;

    iget-object v1, p0, Lqx4;->a:LFs6;

    invoke-virtual {v1}, LFs6;->o()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    iget-object v0, p0, LbI6;->k:Landroid/graphics/RectF;

    iget-object v1, p0, LYu;->b:LXu;

    invoke-virtual {v1}, LXu;->r()F

    move-result v1

    neg-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/RectF;->inset(FF)V

    iget-object v0, p0, LbI6;->k:Landroid/graphics/RectF;

    return-object v0
.end method

.method public g()[F
    .locals 5

    iget-object v0, p0, LbI6;->l:[F

    array-length v0, v0

    iget-object v1, p0, LbI6;->h:LaI6;

    iget v1, v1, LXu;->n:I

    mul-int/lit8 v2, v1, 0x2

    if-eq v0, v2, :cond_0

    mul-int/lit8 v1, v1, 0x2

    new-array v0, v1, [F

    iput-object v0, p0, LbI6;->l:[F

    :cond_0
    iget-object v0, p0, LbI6;->l:[F

    const/4 v1, 0x0

    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_1

    add-int/lit8 v2, v1, 0x1

    iget-object v3, p0, LbI6;->h:LaI6;

    iget-object v3, v3, LXu;->l:[F

    div-int/lit8 v4, v1, 0x2

    aget v3, v3, v4

    aput v3, v0, v2

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_1
    iget-object v1, p0, LYu;->c:LD96;

    invoke-virtual {v1, v0}, LD96;->k([F)V

    return-object v0
.end method

.method public h(Landroid/graphics/Path;I[F)Landroid/graphics/Path;
    .locals 2

    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->G()F

    move-result v0

    add-int/lit8 p2, p2, 0x1

    aget v1, p3, p2

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->i()F

    move-result v0

    aget p2, p3, p2

    invoke-virtual {p1, v0, p2}, Landroid/graphics/Path;->lineTo(FF)V

    return-object p1
.end method

.method public i(Landroid/graphics/Canvas;)V
    .locals 6

    iget-object v0, p0, LbI6;->h:LaI6;

    invoke-virtual {v0}, LNs0;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LbI6;->h:LaI6;

    invoke-virtual {v0}, LXu;->A()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0}, LbI6;->g()[F

    move-result-object v0

    iget-object v1, p0, LYu;->e:Landroid/graphics/Paint;

    iget-object v2, p0, LbI6;->h:LaI6;

    invoke-virtual {v2}, LNs0;->c()Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object v1, p0, LYu;->e:Landroid/graphics/Paint;

    iget-object v2, p0, LbI6;->h:LaI6;

    invoke-virtual {v2}, LNs0;->b()F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v1, p0, LYu;->e:Landroid/graphics/Paint;

    iget-object v2, p0, LbI6;->h:LaI6;

    invoke-virtual {v2}, LNs0;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, LbI6;->h:LaI6;

    invoke-virtual {v1}, LNs0;->d()F

    move-result v1

    iget-object v2, p0, LYu;->e:Landroid/graphics/Paint;

    const-string v3, "A"

    invoke-static {v2, v3}, LOi6;->a(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40200000    # 2.5f

    div-float/2addr v2, v3

    iget-object v3, p0, LbI6;->h:LaI6;

    invoke-virtual {v3}, LNs0;->e()F

    move-result v3

    add-float/2addr v2, v3

    iget-object v3, p0, LbI6;->h:LaI6;

    invoke-virtual {v3}, LaI6;->P()LaI6$a;

    move-result-object v3

    iget-object v4, p0, LbI6;->h:LaI6;

    invoke-virtual {v4}, LaI6;->Q()LaI6$b;

    move-result-object v4

    sget-object v5, LaI6$a;->b:LaI6$a;

    if-ne v3, v5, :cond_2

    sget-object v3, LaI6$b;->b:LaI6$b;

    if-ne v4, v3, :cond_1

    iget-object v3, p0, LYu;->e:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v3, p0, Lqx4;->a:LFs6;

    invoke-virtual {v3}, LFs6;->G()F

    move-result v3

    goto :goto_1

    :cond_1
    iget-object v3, p0, LYu;->e:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v3, p0, Lqx4;->a:LFs6;

    invoke-virtual {v3}, LFs6;->G()F

    move-result v3

    goto :goto_0

    :cond_2
    sget-object v3, LaI6$b;->b:LaI6$b;

    if-ne v4, v3, :cond_3

    iget-object v3, p0, LYu;->e:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v3, p0, Lqx4;->a:LFs6;

    invoke-virtual {v3}, LFs6;->i()F

    move-result v3

    :goto_0
    add-float/2addr v3, v1

    goto :goto_2

    :cond_3
    iget-object v3, p0, LYu;->e:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v3, p0, Lqx4;->a:LFs6;

    invoke-virtual {v3}, LFs6;->i()F

    move-result v3

    :goto_1
    sub-float/2addr v3, v1

    :goto_2
    invoke-virtual {p0, p1, v3, v0, v2}, LbI6;->d(Landroid/graphics/Canvas;F[FF)V

    :cond_4
    :goto_3
    return-void
.end method

.method public j(Landroid/graphics/Canvas;)V
    .locals 7

    iget-object v0, p0, LbI6;->h:LaI6;

    invoke-virtual {v0}, LNs0;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LbI6;->h:LaI6;

    invoke-virtual {v0}, LXu;->x()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYu;->f:Landroid/graphics/Paint;

    iget-object v1, p0, LbI6;->h:LaI6;

    invoke-virtual {v1}, LXu;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, LYu;->f:Landroid/graphics/Paint;

    iget-object v1, p0, LbI6;->h:LaI6;

    invoke-virtual {v1}, LXu;->m()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, LbI6;->h:LaI6;

    invoke-virtual {v0}, LaI6;->P()LaI6$a;

    move-result-object v0

    sget-object v1, LaI6$a;->b:LaI6$a;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->h()F

    move-result v2

    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->j()F

    move-result v3

    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->h()F

    move-result v4

    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->f()F

    move-result v5

    iget-object v6, p0, LYu;->f:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->i()F

    move-result v2

    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->j()F

    move-result v3

    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->i()F

    move-result v4

    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->f()F

    move-result v5

    iget-object v6, p0, LYu;->f:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public k(Landroid/graphics/Canvas;)V
    .locals 6

    iget-object v0, p0, LbI6;->h:LaI6;

    invoke-virtual {v0}, LNs0;->f()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LbI6;->h:LaI6;

    invoke-virtual {v0}, LXu;->z()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    invoke-virtual {p0}, LbI6;->f()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    invoke-virtual {p0}, LbI6;->g()[F

    move-result-object v1

    iget-object v2, p0, LYu;->d:Landroid/graphics/Paint;

    iget-object v3, p0, LbI6;->h:LaI6;

    invoke-virtual {v3}, LXu;->p()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, p0, LYu;->d:Landroid/graphics/Paint;

    iget-object v3, p0, LbI6;->h:LaI6;

    invoke-virtual {v3}, LXu;->r()F

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v2, p0, LYu;->d:Landroid/graphics/Paint;

    iget-object v3, p0, LbI6;->h:LaI6;

    invoke-virtual {v3}, LXu;->q()Landroid/graphics/DashPathEffect;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    iget-object v2, p0, LbI6;->j:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    const/4 v3, 0x0

    :goto_0
    array-length v4, v1

    if-ge v3, v4, :cond_1

    invoke-virtual {p0, v2, v3, v1}, LbI6;->h(Landroid/graphics/Path;I[F)Landroid/graphics/Path;

    move-result-object v4

    iget-object v5, p0, LYu;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    add-int/lit8 v3, v3, 0x2

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_2
    iget-object v0, p0, LbI6;->h:LaI6;

    invoke-virtual {v0}, LaI6;->b0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1}, LbI6;->e(Landroid/graphics/Canvas;)V

    :cond_3
    return-void
.end method

.method public l(Landroid/graphics/Canvas;)V
    .locals 13

    iget-object v0, p0, LbI6;->h:LaI6;

    invoke-virtual {v0}, LXu;->t()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-gtz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v1, p0, LbI6;->p:[F

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput v3, v1, v2

    const/4 v4, 0x1

    aput v3, v1, v4

    iget-object v5, p0, LbI6;->o:Landroid/graphics/Path;

    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    if-ge v2, v6, :cond_6

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lar2;

    invoke-virtual {v6}, LNs0;->f()Z

    move-result v7

    if-nez v7, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v7

    iget-object v8, p0, LbI6;->q:Landroid/graphics/RectF;

    iget-object v9, p0, Lqx4;->a:LFs6;

    invoke-virtual {v9}, LFs6;->o()Landroid/graphics/RectF;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    iget-object v8, p0, LbI6;->q:Landroid/graphics/RectF;

    invoke-virtual {v6}, Lar2;->o()F

    move-result v9

    neg-float v9, v9

    invoke-virtual {v8, v3, v9}, Landroid/graphics/RectF;->inset(FF)V

    iget-object v8, p0, LbI6;->q:Landroid/graphics/RectF;

    invoke-virtual {p1, v8}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    iget-object v8, p0, LYu;->g:Landroid/graphics/Paint;

    sget-object v9, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v8, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {v6}, Lar2;->n()I

    move-result v9

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v8, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {v6}, Lar2;->o()F

    move-result v9

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v8, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {v6}, Lar2;->j()Landroid/graphics/DashPathEffect;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    invoke-virtual {v6}, Lar2;->m()F

    move-result v8

    aput v8, v1, v4

    iget-object v8, p0, LYu;->c:LD96;

    invoke-virtual {v8, v1}, LD96;->k([F)V

    iget-object v8, p0, Lqx4;->a:LFs6;

    invoke-virtual {v8}, LFs6;->h()F

    move-result v8

    aget v9, v1, v4

    invoke-virtual {v5, v8, v9}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v8, p0, Lqx4;->a:LFs6;

    invoke-virtual {v8}, LFs6;->i()F

    move-result v8

    aget v9, v1, v4

    invoke-virtual {v5, v8, v9}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v8, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v8}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    invoke-virtual {v6}, Lar2;->k()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_5

    const-string v9, ""

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    iget-object v9, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {v6}, Lar2;->p()Landroid/graphics/Paint$Style;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v9, p0, LYu;->g:Landroid/graphics/Paint;

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    iget-object v9, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {v6}, LNs0;->a()I

    move-result v10

    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v9, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {v6}, LNs0;->c()Landroid/graphics/Typeface;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object v9, p0, LYu;->g:Landroid/graphics/Paint;

    const/high16 v10, 0x3f000000    # 0.5f

    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v9, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {v6}, LNs0;->b()F

    move-result v10

    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v9, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-static {v9, v8}, LOi6;->a(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v9

    int-to-float v9, v9

    const/high16 v10, 0x40800000    # 4.0f

    invoke-static {v10}, LOi6;->e(F)F

    move-result v10

    invoke-virtual {v6}, LNs0;->d()F

    move-result v11

    add-float/2addr v10, v11

    invoke-virtual {v6}, Lar2;->o()F

    move-result v11

    add-float/2addr v11, v9

    invoke-virtual {v6}, LNs0;->e()F

    move-result v12

    add-float/2addr v11, v12

    invoke-virtual {v6}, Lar2;->l()Lar2$a;

    move-result-object v6

    sget-object v12, Lar2$a;->d:Lar2$a;

    if-ne v6, v12, :cond_2

    iget-object v6, p0, LYu;->g:Landroid/graphics/Paint;

    sget-object v12, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v6, v12}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v6, p0, Lqx4;->a:LFs6;

    invoke-virtual {v6}, LFs6;->i()F

    move-result v6

    sub-float/2addr v6, v10

    aget v10, v1, v4

    sub-float/2addr v10, v11

    add-float/2addr v10, v9

    iget-object v9, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v8, v6, v10, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_1

    :cond_2
    sget-object v12, Lar2$a;->e:Lar2$a;

    if-ne v6, v12, :cond_3

    iget-object v6, p0, LYu;->g:Landroid/graphics/Paint;

    sget-object v9, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v6, v9}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v6, p0, Lqx4;->a:LFs6;

    invoke-virtual {v6}, LFs6;->i()F

    move-result v6

    sub-float/2addr v6, v10

    aget v9, v1, v4

    add-float/2addr v9, v11

    iget-object v10, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v8, v6, v9, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_1

    :cond_3
    sget-object v12, Lar2$a;->b:Lar2$a;

    if-ne v6, v12, :cond_4

    iget-object v6, p0, LYu;->g:Landroid/graphics/Paint;

    sget-object v12, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v6, v12}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v6, p0, Lqx4;->a:LFs6;

    invoke-virtual {v6}, LFs6;->h()F

    move-result v6

    add-float/2addr v6, v10

    aget v10, v1, v4

    sub-float/2addr v10, v11

    add-float/2addr v10, v9

    iget-object v9, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v8, v6, v10, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_1

    :cond_4
    iget-object v6, p0, LYu;->g:Landroid/graphics/Paint;

    sget-object v9, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v6, v9}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v6, p0, Lqx4;->a:LFs6;

    invoke-virtual {v6}, LFs6;->G()F

    move-result v6

    add-float/2addr v6, v10

    aget v9, v1, v4

    add-float/2addr v9, v11

    iget-object v10, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v8, v6, v9, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_5
    :goto_1
    invoke-virtual {p1, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_6
    :goto_3
    return-void
.end method
