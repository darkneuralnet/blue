.class public LuH6;
.super LYu;
.source "SourceFile"


# instance fields
.field public h:LtH6;

.field public i:Landroid/graphics/Path;

.field public j:[F

.field public k:Landroid/graphics/RectF;

.field public l:[F

.field public m:Landroid/graphics/RectF;

.field public n:[F

.field public o:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(LFs6;LtH6;LD96;)V
    .locals 0

    invoke-direct {p0, p1, p3, p2}, LYu;-><init>(LFs6;LD96;LXu;)V

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, LuH6;->i:Landroid/graphics/Path;

    const/4 p1, 0x2

    new-array p3, p1, [F

    iput-object p3, p0, LuH6;->j:[F

    new-instance p3, Landroid/graphics/RectF;

    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    iput-object p3, p0, LuH6;->k:Landroid/graphics/RectF;

    new-array p1, p1, [F

    iput-object p1, p0, LuH6;->l:[F

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, LuH6;->m:Landroid/graphics/RectF;

    const/4 p1, 0x4

    new-array p1, p1, [F

    iput-object p1, p0, LuH6;->n:[F

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, LuH6;->o:Landroid/graphics/Path;

    iput-object p2, p0, LuH6;->h:LtH6;

    iget-object p1, p0, LYu;->e:Landroid/graphics/Paint;

    const/high16 p2, -0x1000000

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, LYu;->e:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object p1, p0, LYu;->e:Landroid/graphics/Paint;

    const/high16 p2, 0x41200000    # 10.0f

    invoke-static {p2}, LOi6;->e(F)F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method


# virtual methods
.method public a(FFZ)V
    .locals 2

    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->k()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->v()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p1, p0, LYu;->c:LD96;

    iget-object p2, p0, Lqx4;->a:LFs6;

    invoke-virtual {p2}, LFs6;->h()F

    move-result p2

    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->j()F

    move-result v0

    invoke-virtual {p1, p2, v0}, LD96;->g(FF)LOE2;

    move-result-object p1

    iget-object p2, p0, LYu;->c:LD96;

    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->i()F

    move-result v0

    iget-object v1, p0, Lqx4;->a:LFs6;

    invoke-virtual {v1}, LFs6;->j()F

    move-result v1

    invoke-virtual {p2, v0, v1}, LD96;->g(FF)LOE2;

    move-result-object p2

    if-eqz p3, :cond_0

    iget-wide v0, p2, LOE2;->c:D

    double-to-float p3, v0

    iget-wide v0, p1, LOE2;->c:D

    goto :goto_0

    :cond_0
    iget-wide v0, p1, LOE2;->c:D

    double-to-float p3, v0

    iget-wide v0, p2, LOE2;->c:D

    :goto_0
    double-to-float v0, v0

    invoke-static {p1}, LOE2;->c(LOE2;)V

    invoke-static {p2}, LOE2;->c(LOE2;)V

    move p1, p3

    move p2, v0

    :cond_1
    invoke-virtual {p0, p1, p2}, LuH6;->b(FF)V

    return-void
.end method

.method public b(FF)V
    .locals 0

    invoke-super {p0, p1, p2}, LYu;->b(FF)V

    invoke-virtual {p0}, LuH6;->d()V

    return-void
.end method

.method public d()V
    .locals 5

    iget-object v0, p0, LuH6;->h:LtH6;

    invoke-virtual {v0}, LXu;->u()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LYu;->e:Landroid/graphics/Paint;

    iget-object v2, p0, LuH6;->h:LtH6;

    invoke-virtual {v2}, LNs0;->c()Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object v1, p0, LYu;->e:Landroid/graphics/Paint;

    iget-object v2, p0, LuH6;->h:LtH6;

    invoke-virtual {v2}, LNs0;->b()F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v1, p0, LYu;->e:Landroid/graphics/Paint;

    invoke-static {v1, v0}, LOi6;->b(Landroid/graphics/Paint;Ljava/lang/String;)LZi1;

    move-result-object v0

    iget v1, v0, LZi1;->c:F

    iget-object v2, p0, LYu;->e:Landroid/graphics/Paint;

    const-string v3, "Q"

    invoke-static {v2, v3}, LOi6;->a(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, LuH6;->h:LtH6;

    invoke-virtual {v3}, LtH6;->P()F

    move-result v3

    invoke-static {v1, v2, v3}, LOi6;->t(FFF)LZi1;

    move-result-object v3

    iget-object v4, p0, LuH6;->h:LtH6;

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, v4, LtH6;->J:I

    iget-object v1, p0, LuH6;->h:LtH6;

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iput v2, v1, LtH6;->K:I

    iget-object v1, p0, LuH6;->h:LtH6;

    iget v2, v3, LZi1;->c:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iput v2, v1, LtH6;->L:I

    iget-object v1, p0, LuH6;->h:LtH6;

    iget v2, v3, LZi1;->d:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iput v2, v1, LtH6;->M:I

    invoke-static {v3}, LZi1;->c(LZi1;)V

    invoke-static {v0}, LZi1;->c(LZi1;)V

    return-void
.end method

.method public e(Landroid/graphics/Canvas;FFLandroid/graphics/Path;)V
    .locals 0

    iget-object p3, p0, Lqx4;->a:LFs6;

    invoke-virtual {p3}, LFs6;->f()F

    move-result p3

    invoke-virtual {p4, p2, p3}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object p3, p0, Lqx4;->a:LFs6;

    invoke-virtual {p3}, LFs6;->j()F

    move-result p3

    invoke-virtual {p4, p2, p3}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p2, p0, LYu;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, p4, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {p4}, Landroid/graphics/Path;->reset()V

    return-void
.end method

.method public f(Landroid/graphics/Canvas;Ljava/lang/String;FFLPE2;F)V
    .locals 7

    iget-object v4, p0, LYu;->e:Landroid/graphics/Paint;

    move-object v0, p1

    move-object v1, p2

    move v2, p3

    move v3, p4

    move-object v5, p5

    move v6, p6

    invoke-static/range {v0 .. v6}, LOi6;->g(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/graphics/Paint;LPE2;F)V

    return-void
.end method

.method public g(Landroid/graphics/Canvas;FLPE2;)V
    .locals 11

    iget-object v0, p0, LuH6;->h:LtH6;

    invoke-virtual {v0}, LtH6;->P()F

    move-result v0

    iget-object v1, p0, LuH6;->h:LtH6;

    invoke-virtual {v1}, LXu;->w()Z

    move-result v1

    iget-object v2, p0, LuH6;->h:LtH6;

    iget v2, v2, LXu;->n:I

    mul-int/lit8 v8, v2, 0x2

    new-array v9, v8, [F

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v8, :cond_1

    if-eqz v1, :cond_0

    iget-object v4, p0, LuH6;->h:LtH6;

    iget-object v4, v4, LXu;->m:[F

    div-int/lit8 v5, v3, 0x2

    aget v4, v4, v5

    aput v4, v9, v3

    goto :goto_1

    :cond_0
    iget-object v4, p0, LuH6;->h:LtH6;

    iget-object v4, v4, LXu;->l:[F

    div-int/lit8 v5, v3, 0x2

    aget v4, v4, v5

    aput v4, v9, v3

    :goto_1
    add-int/lit8 v3, v3, 0x2

    goto :goto_0

    :cond_1
    iget-object v1, p0, LYu;->c:LD96;

    invoke-virtual {v1, v9}, LD96;->k([F)V

    move v10, v2

    :goto_2
    if-ge v10, v8, :cond_5

    aget v1, v9, v10

    iget-object v2, p0, Lqx4;->a:LFs6;

    invoke-virtual {v2, v1}, LFs6;->C(F)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, LuH6;->h:LtH6;

    invoke-virtual {v2}, LXu;->v()LJj6;

    move-result-object v2

    iget-object v3, p0, LuH6;->h:LtH6;

    iget-object v4, v3, LXu;->l:[F

    div-int/lit8 v5, v10, 0x2

    aget v4, v4, v5

    invoke-virtual {v2, v4, v3}, LJj6;->a(FLXu;)Ljava/lang/String;

    move-result-object v3

    iget-object v2, p0, LuH6;->h:LtH6;

    invoke-virtual {v2}, LtH6;->R()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, LuH6;->h:LtH6;

    iget v2, v2, LXu;->n:I

    add-int/lit8 v4, v2, -0x1

    const/high16 v6, 0x40000000    # 2.0f

    if-ne v5, v4, :cond_2

    const/4 v4, 0x1

    if-le v2, v4, :cond_2

    iget-object v2, p0, LYu;->e:Landroid/graphics/Paint;

    invoke-static {v2, v3}, LOi6;->d(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v2

    int-to-float v2, v2

    iget-object v4, p0, Lqx4;->a:LFs6;

    invoke-virtual {v4}, LFs6;->H()F

    move-result v4

    mul-float/2addr v4, v6

    cmpl-float v4, v2, v4

    if-lez v4, :cond_3

    add-float v4, v1, v2

    iget-object v5, p0, Lqx4;->a:LFs6;

    invoke-virtual {v5}, LFs6;->m()F

    move-result v5

    cmpl-float v4, v4, v5

    if-lez v4, :cond_3

    div-float/2addr v2, v6

    sub-float/2addr v1, v2

    goto :goto_3

    :cond_2
    if-nez v10, :cond_3

    iget-object v2, p0, LYu;->e:Landroid/graphics/Paint;

    invoke-static {v2, v3}, LOi6;->d(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v6

    add-float/2addr v1, v2

    :cond_3
    :goto_3
    move v4, v1

    move-object v1, p0

    move-object v2, p1

    move v5, p2

    move-object v6, p3

    move v7, v0

    invoke-virtual/range {v1 .. v7}, LuH6;->f(Landroid/graphics/Canvas;Ljava/lang/String;FFLPE2;F)V

    :cond_4
    add-int/lit8 v10, v10, 0x2

    goto :goto_2

    :cond_5
    return-void
.end method

.method public h()Landroid/graphics/RectF;
    .locals 3

    iget-object v0, p0, LuH6;->k:Landroid/graphics/RectF;

    iget-object v1, p0, Lqx4;->a:LFs6;

    invoke-virtual {v1}, LFs6;->o()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    iget-object v0, p0, LuH6;->k:Landroid/graphics/RectF;

    iget-object v1, p0, LYu;->b:LXu;

    invoke-virtual {v1}, LXu;->r()F

    move-result v1

    neg-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/graphics/RectF;->inset(FF)V

    iget-object v0, p0, LuH6;->k:Landroid/graphics/RectF;

    return-object v0
.end method

.method public i(Landroid/graphics/Canvas;)V
    .locals 7

    iget-object v0, p0, LuH6;->h:LtH6;

    invoke-virtual {v0}, LNs0;->f()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, LuH6;->h:LtH6;

    invoke-virtual {v0}, LXu;->A()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, LuH6;->h:LtH6;

    invoke-virtual {v0}, LNs0;->e()F

    move-result v0

    iget-object v1, p0, LYu;->e:Landroid/graphics/Paint;

    iget-object v2, p0, LuH6;->h:LtH6;

    invoke-virtual {v2}, LNs0;->c()Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object v1, p0, LYu;->e:Landroid/graphics/Paint;

    iget-object v2, p0, LuH6;->h:LtH6;

    invoke-virtual {v2}, LNs0;->b()F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v1, p0, LYu;->e:Landroid/graphics/Paint;

    iget-object v2, p0, LuH6;->h:LtH6;

    invoke-virtual {v2}, LNs0;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v1, 0x0

    invoke-static {v1, v1}, LPE2;->c(FF)LPE2;

    move-result-object v2

    iget-object v3, p0, LuH6;->h:LtH6;

    invoke-virtual {v3}, LtH6;->Q()LtH6$a;

    move-result-object v3

    sget-object v4, LtH6$a;->b:LtH6$a;

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v6, 0x3f000000    # 0.5f

    if-ne v3, v4, :cond_1

    iput v6, v2, LPE2;->c:F

    iput v5, v2, LPE2;->d:F

    iget-object v1, p0, Lqx4;->a:LFs6;

    invoke-virtual {v1}, LFs6;->j()F

    move-result v1

    sub-float/2addr v1, v0

    invoke-virtual {p0, p1, v1, v2}, LuH6;->g(Landroid/graphics/Canvas;FLPE2;)V

    goto :goto_0

    :cond_1
    iget-object v3, p0, LuH6;->h:LtH6;

    invoke-virtual {v3}, LtH6;->Q()LtH6$a;

    move-result-object v3

    sget-object v4, LtH6$a;->e:LtH6$a;

    if-ne v3, v4, :cond_2

    iput v6, v2, LPE2;->c:F

    iput v5, v2, LPE2;->d:F

    iget-object v1, p0, Lqx4;->a:LFs6;

    invoke-virtual {v1}, LFs6;->j()F

    move-result v1

    add-float/2addr v1, v0

    iget-object v0, p0, LuH6;->h:LtH6;

    iget v0, v0, LtH6;->M:I

    int-to-float v0, v0

    add-float/2addr v1, v0

    invoke-virtual {p0, p1, v1, v2}, LuH6;->g(Landroid/graphics/Canvas;FLPE2;)V

    goto :goto_0

    :cond_2
    iget-object v3, p0, LuH6;->h:LtH6;

    invoke-virtual {v3}, LtH6;->Q()LtH6$a;

    move-result-object v3

    sget-object v4, LtH6$a;->c:LtH6$a;

    if-ne v3, v4, :cond_3

    iput v6, v2, LPE2;->c:F

    iput v1, v2, LPE2;->d:F

    iget-object v1, p0, Lqx4;->a:LFs6;

    invoke-virtual {v1}, LFs6;->f()F

    move-result v1

    add-float/2addr v1, v0

    invoke-virtual {p0, p1, v1, v2}, LuH6;->g(Landroid/graphics/Canvas;FLPE2;)V

    goto :goto_0

    :cond_3
    iget-object v3, p0, LuH6;->h:LtH6;

    invoke-virtual {v3}, LtH6;->Q()LtH6$a;

    move-result-object v3

    sget-object v4, LtH6$a;->f:LtH6$a;

    if-ne v3, v4, :cond_4

    iput v6, v2, LPE2;->c:F

    iput v1, v2, LPE2;->d:F

    iget-object v1, p0, Lqx4;->a:LFs6;

    invoke-virtual {v1}, LFs6;->f()F

    move-result v1

    sub-float/2addr v1, v0

    iget-object v0, p0, LuH6;->h:LtH6;

    iget v0, v0, LtH6;->M:I

    int-to-float v0, v0

    sub-float/2addr v1, v0

    invoke-virtual {p0, p1, v1, v2}, LuH6;->g(Landroid/graphics/Canvas;FLPE2;)V

    goto :goto_0

    :cond_4
    iput v6, v2, LPE2;->c:F

    iput v5, v2, LPE2;->d:F

    iget-object v3, p0, Lqx4;->a:LFs6;

    invoke-virtual {v3}, LFs6;->j()F

    move-result v3

    sub-float/2addr v3, v0

    invoke-virtual {p0, p1, v3, v2}, LuH6;->g(Landroid/graphics/Canvas;FLPE2;)V

    iput v6, v2, LPE2;->c:F

    iput v1, v2, LPE2;->d:F

    iget-object v1, p0, Lqx4;->a:LFs6;

    invoke-virtual {v1}, LFs6;->f()F

    move-result v1

    add-float/2addr v1, v0

    invoke-virtual {p0, p1, v1, v2}, LuH6;->g(Landroid/graphics/Canvas;FLPE2;)V

    :goto_0
    invoke-static {v2}, LPE2;->f(LPE2;)V

    :cond_5
    :goto_1
    return-void
.end method

.method public j(Landroid/graphics/Canvas;)V
    .locals 7

    iget-object v0, p0, LuH6;->h:LtH6;

    invoke-virtual {v0}, LXu;->x()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LuH6;->h:LtH6;

    invoke-virtual {v0}, LNs0;->f()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, LYu;->f:Landroid/graphics/Paint;

    iget-object v1, p0, LuH6;->h:LtH6;

    invoke-virtual {v1}, LXu;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, LYu;->f:Landroid/graphics/Paint;

    iget-object v1, p0, LuH6;->h:LtH6;

    invoke-virtual {v1}, LXu;->m()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, LYu;->f:Landroid/graphics/Paint;

    iget-object v1, p0, LuH6;->h:LtH6;

    invoke-virtual {v1}, LXu;->l()Landroid/graphics/DashPathEffect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    iget-object v0, p0, LuH6;->h:LtH6;

    invoke-virtual {v0}, LtH6;->Q()LtH6$a;

    move-result-object v0

    sget-object v1, LtH6$a;->b:LtH6$a;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, LuH6;->h:LtH6;

    invoke-virtual {v0}, LtH6;->Q()LtH6$a;

    move-result-object v0

    sget-object v1, LtH6$a;->e:LtH6$a;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, LuH6;->h:LtH6;

    invoke-virtual {v0}, LtH6;->Q()LtH6$a;

    move-result-object v0

    sget-object v1, LtH6$a;->d:LtH6$a;

    if-ne v0, v1, :cond_2

    :cond_1
    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->h()F

    move-result v2

    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->j()F

    move-result v3

    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->i()F

    move-result v4

    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->j()F

    move-result v5

    iget-object v6, p0, LYu;->f:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_2
    iget-object v0, p0, LuH6;->h:LtH6;

    invoke-virtual {v0}, LtH6;->Q()LtH6$a;

    move-result-object v0

    sget-object v1, LtH6$a;->c:LtH6$a;

    if-eq v0, v1, :cond_3

    iget-object v0, p0, LuH6;->h:LtH6;

    invoke-virtual {v0}, LtH6;->Q()LtH6$a;

    move-result-object v0

    sget-object v1, LtH6$a;->f:LtH6$a;

    if-eq v0, v1, :cond_3

    iget-object v0, p0, LuH6;->h:LtH6;

    invoke-virtual {v0}, LtH6;->Q()LtH6$a;

    move-result-object v0

    sget-object v1, LtH6$a;->d:LtH6$a;

    if-ne v0, v1, :cond_4

    :cond_3
    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->h()F

    move-result v2

    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->f()F

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

    :cond_4
    :goto_0
    return-void
.end method

.method public k(Landroid/graphics/Canvas;)V
    .locals 7

    iget-object v0, p0, LuH6;->h:LtH6;

    invoke-virtual {v0}, LXu;->z()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LuH6;->h:LtH6;

    invoke-virtual {v0}, LNs0;->f()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    invoke-virtual {p0}, LuH6;->h()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    iget-object v1, p0, LuH6;->j:[F

    array-length v1, v1

    iget-object v2, p0, LYu;->b:LXu;

    iget v2, v2, LXu;->n:I

    mul-int/lit8 v2, v2, 0x2

    if-eq v1, v2, :cond_1

    iget-object v1, p0, LuH6;->h:LtH6;

    iget v1, v1, LXu;->n:I

    mul-int/lit8 v1, v1, 0x2

    new-array v1, v1, [F

    iput-object v1, p0, LuH6;->j:[F

    :cond_1
    iget-object v1, p0, LuH6;->j:[F

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    array-length v4, v1

    if-ge v3, v4, :cond_2

    iget-object v4, p0, LuH6;->h:LtH6;

    iget-object v4, v4, LXu;->l:[F

    div-int/lit8 v5, v3, 0x2

    aget v6, v4, v5

    aput v6, v1, v3

    add-int/lit8 v6, v3, 0x1

    aget v4, v4, v5

    aput v4, v1, v6

    add-int/lit8 v3, v3, 0x2

    goto :goto_0

    :cond_2
    iget-object v3, p0, LYu;->c:LD96;

    invoke-virtual {v3, v1}, LD96;->k([F)V

    invoke-virtual {p0}, LuH6;->o()V

    iget-object v3, p0, LuH6;->i:Landroid/graphics/Path;

    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    :goto_1
    array-length v4, v1

    if-ge v2, v4, :cond_3

    aget v4, v1, v2

    add-int/lit8 v5, v2, 0x1

    aget v5, v1, v5

    invoke-virtual {p0, p1, v4, v5, v3}, LuH6;->e(Landroid/graphics/Canvas;FFLandroid/graphics/Path;)V

    add-int/lit8 v2, v2, 0x2

    goto :goto_1

    :cond_3
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_4
    :goto_2
    return-void
.end method

.method public l(Landroid/graphics/Canvas;Lar2;[FF)V
    .locals 5

    invoke-virtual {p2}, Lar2;->k()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {p2}, Lar2;->p()Landroid/graphics/Paint$Style;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, LYu;->g:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    iget-object v1, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {p2}, LNs0;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, LYu;->g:Landroid/graphics/Paint;

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v1, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {p2}, LNs0;->b()F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-virtual {p2}, Lar2;->o()F

    move-result v1

    invoke-virtual {p2}, LNs0;->d()F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {p2}, Lar2;->l()Lar2$a;

    move-result-object p2

    sget-object v2, Lar2$a;->d:Lar2$a;

    const/4 v3, 0x0

    if-ne p2, v2, :cond_0

    iget-object p2, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-static {p2, v0}, LOi6;->a(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result p2

    int-to-float p2, p2

    iget-object v2, p0, LYu;->g:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    aget p3, p3, v3

    add-float/2addr p3, v1

    iget-object v1, p0, Lqx4;->a:LFs6;

    invoke-virtual {v1}, LFs6;->j()F

    move-result v1

    add-float/2addr v1, p4

    add-float/2addr v1, p2

    iget-object p2, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p3, v1, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    sget-object v2, Lar2$a;->e:Lar2$a;

    if-ne p2, v2, :cond_1

    iget-object p2, p0, LYu;->g:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    aget p2, p3, v3

    add-float/2addr p2, v1

    iget-object p3, p0, Lqx4;->a:LFs6;

    invoke-virtual {p3}, LFs6;->f()F

    move-result p3

    sub-float/2addr p3, p4

    iget-object p4, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p2, p3, p4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_1
    sget-object v2, Lar2$a;->b:Lar2$a;

    if-ne p2, v2, :cond_2

    iget-object p2, p0, LYu;->g:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object p2, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-static {p2, v0}, LOi6;->a(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result p2

    int-to-float p2, p2

    aget p3, p3, v3

    sub-float/2addr p3, v1

    iget-object v1, p0, Lqx4;->a:LFs6;

    invoke-virtual {v1}, LFs6;->j()F

    move-result v1

    add-float/2addr v1, p4

    add-float/2addr v1, p2

    iget-object p2, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p3, v1, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_2
    iget-object p2, p0, LYu;->g:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    aget p2, p3, v3

    sub-float/2addr p2, v1

    iget-object p3, p0, Lqx4;->a:LFs6;

    invoke-virtual {p3}, LFs6;->f()F

    move-result p3

    sub-float/2addr p3, p4

    iget-object p4, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p2, p3, p4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public m(Landroid/graphics/Canvas;Lar2;[F)V
    .locals 5

    iget-object v0, p0, LuH6;->n:[F

    const/4 v1, 0x0

    aget v2, p3, v1

    aput v2, v0, v1

    iget-object v2, p0, Lqx4;->a:LFs6;

    invoke-virtual {v2}, LFs6;->j()F

    move-result v2

    const/4 v3, 0x1

    aput v2, v0, v3

    iget-object v0, p0, LuH6;->n:[F

    aget p3, p3, v1

    const/4 v2, 0x2

    aput p3, v0, v2

    iget-object p3, p0, Lqx4;->a:LFs6;

    invoke-virtual {p3}, LFs6;->f()F

    move-result p3

    const/4 v4, 0x3

    aput p3, v0, v4

    iget-object p3, p0, LuH6;->o:Landroid/graphics/Path;

    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    iget-object p3, p0, LuH6;->o:Landroid/graphics/Path;

    iget-object v0, p0, LuH6;->n:[F

    aget v1, v0, v1

    aget v0, v0, v3

    invoke-virtual {p3, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object p3, p0, LuH6;->o:Landroid/graphics/Path;

    iget-object v0, p0, LuH6;->n:[F

    aget v1, v0, v2

    aget v0, v0, v4

    invoke-virtual {p3, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p3, p0, LYu;->g:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p3, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {p2}, Lar2;->n()I

    move-result v0

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p3, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {p2}, Lar2;->o()F

    move-result v0

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p3, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {p2}, Lar2;->j()Landroid/graphics/DashPathEffect;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    iget-object p2, p0, LuH6;->o:Landroid/graphics/Path;

    iget-object p3, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public n(Landroid/graphics/Canvas;)V
    .locals 10

    iget-object v0, p0, LuH6;->h:LtH6;

    invoke-virtual {v0}, LXu;->t()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_2

    :cond_0
    iget-object v1, p0, LuH6;->l:[F

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput v3, v1, v2

    const/4 v4, 0x1

    aput v3, v1, v4

    move v5, v2

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_2

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lar2;

    invoke-virtual {v6}, LNs0;->f()Z

    move-result v7

    if-nez v7, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v7

    iget-object v8, p0, LuH6;->m:Landroid/graphics/RectF;

    iget-object v9, p0, Lqx4;->a:LFs6;

    invoke-virtual {v9}, LFs6;->o()Landroid/graphics/RectF;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    iget-object v8, p0, LuH6;->m:Landroid/graphics/RectF;

    invoke-virtual {v6}, Lar2;->o()F

    move-result v9

    neg-float v9, v9

    invoke-virtual {v8, v9, v3}, Landroid/graphics/RectF;->inset(FF)V

    iget-object v8, p0, LuH6;->m:Landroid/graphics/RectF;

    invoke-virtual {p1, v8}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    invoke-virtual {v6}, Lar2;->m()F

    move-result v8

    aput v8, v1, v2

    aput v3, v1, v4

    iget-object v8, p0, LYu;->c:LD96;

    invoke-virtual {v8, v1}, LD96;->k([F)V

    invoke-virtual {p0, p1, v6, v1}, LuH6;->m(Landroid/graphics/Canvas;Lar2;[F)V

    const/high16 v8, 0x40000000    # 2.0f

    invoke-virtual {v6}, LNs0;->e()F

    move-result v9

    add-float/2addr v9, v8

    invoke-virtual {p0, p1, v6, v1, v9}, LuH6;->l(Landroid/graphics/Canvas;Lar2;[FF)V

    invoke-virtual {p1, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-void
.end method

.method public o()V
    .locals 2

    iget-object v0, p0, LYu;->d:Landroid/graphics/Paint;

    iget-object v1, p0, LuH6;->h:LtH6;

    invoke-virtual {v1}, LXu;->p()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, LYu;->d:Landroid/graphics/Paint;

    iget-object v1, p0, LuH6;->h:LtH6;

    invoke-virtual {v1}, LXu;->r()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, LYu;->d:Landroid/graphics/Paint;

    iget-object v1, p0, LuH6;->h:LtH6;

    invoke-virtual {v1}, LXu;->q()Landroid/graphics/DashPathEffect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    return-void
.end method
