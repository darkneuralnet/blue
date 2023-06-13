.class public LpT3;
.super LRS0;
.source "SourceFile"


# instance fields
.field public g:Lcom/github/mikephil/charting/charts/PieChart;

.field public h:Landroid/graphics/Paint;

.field public i:Landroid/graphics/Paint;

.field public j:Landroid/graphics/Paint;

.field public k:Landroid/text/TextPaint;

.field public l:Landroid/graphics/Paint;

.field public m:Landroid/text/StaticLayout;

.field public n:Ljava/lang/CharSequence;

.field public o:Landroid/graphics/RectF;

.field public p:[Landroid/graphics/RectF;

.field public q:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public r:Landroid/graphics/Canvas;

.field public s:Landroid/graphics/Path;

.field public t:Landroid/graphics/RectF;

.field public u:Landroid/graphics/Path;

.field public v:Landroid/graphics/Path;

.field public w:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Lcom/github/mikephil/charting/charts/PieChart;Lhi0;LFs6;)V
    .locals 2

    invoke-direct {p0, p2, p3}, LRS0;-><init>(Lhi0;LFs6;)V

    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, LpT3;->o:Landroid/graphics/RectF;

    const/4 p2, 0x3

    new-array p2, p2, [Landroid/graphics/RectF;

    new-instance p3, Landroid/graphics/RectF;

    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    const/4 v0, 0x0

    aput-object p3, p2, v0

    new-instance p3, Landroid/graphics/RectF;

    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    const/4 v0, 0x1

    aput-object p3, p2, v0

    new-instance p3, Landroid/graphics/RectF;

    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    const/4 v1, 0x2

    aput-object p3, p2, v1

    iput-object p2, p0, LpT3;->p:[Landroid/graphics/RectF;

    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    iput-object p2, p0, LpT3;->s:Landroid/graphics/Path;

    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, LpT3;->t:Landroid/graphics/RectF;

    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    iput-object p2, p0, LpT3;->u:Landroid/graphics/Path;

    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    iput-object p2, p0, LpT3;->v:Landroid/graphics/Path;

    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, LpT3;->w:Landroid/graphics/RectF;

    iput-object p1, p0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, LpT3;->h:Landroid/graphics/Paint;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, LpT3;->h:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, LpT3;->i:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, LpT3;->i:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, LpT3;->i:Landroid/graphics/Paint;

    const/16 p3, 0x69

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setAlpha(I)V

    new-instance p1, Landroid/text/TextPaint;

    invoke-direct {p1, v0}, Landroid/text/TextPaint;-><init>(I)V

    iput-object p1, p0, LpT3;->k:Landroid/text/TextPaint;

    const/high16 p3, -0x1000000

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, LpT3;->k:Landroid/text/TextPaint;

    const/high16 p3, 0x41400000    # 12.0f

    invoke-static {p3}, LOi6;->e(F)F

    move-result p3

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object p1, p0, LRS0;->f:Landroid/graphics/Paint;

    const/high16 p3, 0x41500000    # 13.0f

    invoke-static {p3}, LOi6;->e(F)F

    move-result v1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object p1, p0, LRS0;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, LRS0;->f:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, LpT3;->l:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, LpT3;->l:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object p1, p0, LpT3;->l:Landroid/graphics/Paint;

    invoke-static {p3}, LOi6;->e(F)F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, LpT3;->j:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void
.end method


# virtual methods
.method public b(Landroid/graphics/Canvas;)V
    .locals 4

    iget-object v0, p0, Lqx4;->a:LFs6;

    invoke-virtual {v0}, LFs6;->m()F

    move-result v0

    float-to-int v0, v0

    iget-object v1, p0, Lqx4;->a:LFs6;

    invoke-virtual {v1}, LFs6;->l()F

    move-result v1

    float-to-int v1, v1

    iget-object v2, p0, LpT3;->q:Ljava/lang/ref/WeakReference;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    if-ne v3, v0, :cond_1

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    if-eq v3, v1, :cond_2

    :cond_1
    if-lez v0, :cond_4

    if-lez v1, :cond_4

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LpT3;->q:Ljava/lang/ref/WeakReference;

    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, LpT3;->r:Landroid/graphics/Canvas;

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/graphics/Bitmap;->eraseColor(I)V

    iget-object v0, p0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lii0;

    move-result-object v0

    check-cast v0, LqT3;

    invoke-virtual {v0}, Lii0;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LXO1;

    invoke-interface {v1}, LoO1;->isVisible()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, LoO1;->L0()I

    move-result v2

    if-lez v2, :cond_3

    invoke-virtual {p0, p1, v1}, LpT3;->j(Landroid/graphics/Canvas;LXO1;)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method public c(Landroid/graphics/Canvas;)V
    .locals 3

    invoke-virtual {p0, p1}, LpT3;->l(Landroid/graphics/Canvas;)V

    iget-object v0, p0, LpT3;->q:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {p0, p1}, LpT3;->i(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public d(Landroid/graphics/Canvas;[LOM1;)V
    .locals 34

    move-object/from16 v8, p0

    move-object/from16 v9, p2

    iget-object v0, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->y0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->A0()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v12, 0x1

    goto :goto_0

    :cond_0
    const/4 v12, 0x0

    :goto_0
    if-eqz v12, :cond_1

    iget-object v0, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->z0()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, v8, LRS0;->b:Lhi0;

    invoke-virtual {v0}, Lhi0;->a()F

    move-result v13

    iget-object v0, v8, LRS0;->b:Lhi0;

    invoke-virtual {v0}, Lhi0;->b()F

    move-result v14

    iget-object v0, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->j0()F

    move-result v15

    iget-object v0, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->t0()[F

    move-result-object v7

    iget-object v0, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->n0()[F

    move-result-object v16

    iget-object v0, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->o0()LPE2;

    move-result-object v6

    iget-object v0, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->f0()F

    move-result v17

    const/4 v5, 0x0

    if-eqz v12, :cond_2

    iget-object v0, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->u0()F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    mul-float v0, v0, v17

    move v4, v0

    goto :goto_1

    :cond_2
    move v4, v5

    :goto_1
    iget-object v3, v8, LpT3;->w:Landroid/graphics/RectF;

    invoke-virtual {v3, v5, v5, v5, v5}, Landroid/graphics/RectF;->set(FFFF)V

    const/4 v2, 0x0

    :goto_2
    array-length v0, v9

    if-ge v2, v0, :cond_1b

    aget-object v0, v9, v2

    invoke-virtual {v0}, LOM1;->h()F

    move-result v0

    float-to-int v0, v0

    array-length v1, v7

    if-lt v0, v1, :cond_3

    goto/16 :goto_10

    :cond_3
    iget-object v1, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lii0;

    move-result-object v1

    check-cast v1, LqT3;

    aget-object v18, v9, v2

    invoke-virtual/range {v18 .. v18}, LOM1;->d()I

    move-result v10

    invoke-virtual {v1, v10}, LqT3;->t(I)LXO1;

    move-result-object v1

    if-eqz v1, :cond_1a

    invoke-interface {v1}, LoO1;->Q()Z

    move-result v10

    if-nez v10, :cond_4

    goto/16 :goto_10

    :cond_4
    invoke-interface {v1}, LoO1;->L0()I

    move-result v10

    const/4 v5, 0x0

    const/4 v11, 0x0

    :goto_3
    if-ge v5, v10, :cond_6

    invoke-interface {v1, v5}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v19

    check-cast v19, Lcom/github/mikephil/charting/data/PieEntry;

    invoke-virtual/range {v19 .. v19}, LAA;->c()F

    move-result v19

    invoke-static/range {v19 .. v19}, Ljava/lang/Math;->abs(F)F

    move-result v19

    sget v20, LOi6;->e:F

    cmpl-float v19, v19, v20

    if-lez v19, :cond_5

    add-int/lit8 v11, v11, 0x1

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_6
    if-nez v0, :cond_7

    const/4 v5, 0x1

    const/4 v10, 0x0

    goto :goto_4

    :cond_7
    add-int/lit8 v5, v0, -0x1

    aget v5, v16, v5

    mul-float/2addr v5, v13

    move v10, v5

    const/4 v5, 0x1

    :goto_4
    if-gt v11, v5, :cond_8

    const/16 v19, 0x0

    goto :goto_5

    :cond_8
    invoke-interface {v1}, LXO1;->m0()F

    move-result v5

    move/from16 v19, v5

    :goto_5
    aget v20, v7, v0

    invoke-interface {v1}, LXO1;->s()F

    move-result v5

    move/from16 v21, v2

    add-float v2, v17, v5

    move/from16 v22, v4

    iget-object v4, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/PieChart;->s0()Landroid/graphics/RectF;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    neg-float v4, v5

    invoke-virtual {v3, v4, v4}, Landroid/graphics/RectF;->inset(FF)V

    const/4 v4, 0x0

    cmpl-float v5, v19, v4

    if-lez v5, :cond_9

    const/high16 v4, 0x43340000    # 180.0f

    cmpg-float v4, v20, v4

    if-gtz v4, :cond_9

    const/16 v23, 0x1

    goto :goto_6

    :cond_9
    const/16 v23, 0x0

    :goto_6
    iget-object v4, v8, LRS0;->c:Landroid/graphics/Paint;

    invoke-interface {v1, v0}, LoO1;->A0(I)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    const v24, 0x3c8efa35

    const/4 v0, 0x1

    if-ne v11, v0, :cond_a

    const/4 v4, 0x0

    goto :goto_7

    :cond_a
    mul-float v1, v17, v24

    div-float v4, v19, v1

    :goto_7
    if-ne v11, v0, :cond_b

    const/4 v0, 0x0

    goto :goto_8

    :cond_b
    mul-float v0, v2, v24

    div-float v0, v19, v0

    :goto_8
    const/high16 v25, 0x40000000    # 2.0f

    div-float v1, v4, v25

    add-float/2addr v1, v10

    mul-float/2addr v1, v14

    add-float v26, v15, v1

    sub-float v1, v20, v4

    mul-float v4, v1, v14

    const/4 v5, 0x0

    cmpg-float v1, v4, v5

    if-gez v1, :cond_c

    move/from16 v18, v5

    goto :goto_9

    :cond_c
    move/from16 v18, v4

    :goto_9
    div-float v1, v0, v25

    add-float/2addr v1, v10

    mul-float/2addr v1, v14

    add-float/2addr v1, v15

    sub-float v0, v20, v0

    mul-float v4, v0, v14

    cmpg-float v0, v4, v5

    if-gez v0, :cond_d

    move v4, v5

    :cond_d
    iget-object v0, v8, LpT3;->s:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    const/high16 v27, 0x43b40000    # 360.0f

    cmpl-float v28, v18, v27

    if-ltz v28, :cond_e

    rem-float v0, v18, v27

    sget v29, LOi6;->e:F

    cmpg-float v0, v0, v29

    if-gtz v0, :cond_e

    iget-object v0, v8, LpT3;->s:Landroid/graphics/Path;

    iget v1, v6, LPE2;->c:F

    iget v4, v6, LPE2;->d:F

    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v4, v2, v5}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    move-object/from16 v30, v7

    move/from16 v31, v10

    move/from16 v33, v11

    move/from16 v32, v12

    goto :goto_a

    :cond_e
    iget-object v0, v8, LpT3;->s:Landroid/graphics/Path;

    iget v5, v6, LPE2;->c:F

    move-object/from16 v30, v7

    mul-float v7, v1, v24

    move/from16 v31, v10

    float-to-double v9, v7

    move/from16 v33, v11

    move/from16 v32, v12

    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    move-result-wide v11

    double-to-float v7, v11

    mul-float/2addr v7, v2

    add-float/2addr v5, v7

    iget v7, v6, LPE2;->d:F

    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v9

    double-to-float v9, v9

    mul-float/2addr v2, v9

    add-float/2addr v7, v2

    invoke-virtual {v0, v5, v7}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v0, v8, LpT3;->s:Landroid/graphics/Path;

    invoke-virtual {v0, v3, v1, v4}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    :goto_a
    if-eqz v23, :cond_f

    mul-float v4, v20, v14

    iget v0, v6, LPE2;->c:F

    mul-float v1, v26, v24

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v9

    double-to-float v5, v9

    mul-float v5, v5, v17

    add-float/2addr v5, v0

    iget v0, v6, LPE2;->d:F

    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float v1, v1, v17

    add-float v7, v0, v1

    move-object/from16 v0, p0

    move-object v1, v6

    move/from16 v10, v21

    move/from16 v2, v17

    move-object v9, v3

    move v3, v4

    move/from16 v11, v22

    move v4, v5

    const/4 v12, 0x0

    move v5, v7

    move-object v7, v6

    move/from16 v6, v26

    move-object v12, v7

    move-object/from16 v21, v30

    move/from16 v7, v18

    invoke-virtual/range {v0 .. v7}, LpT3;->h(LPE2;FFFFFF)F

    move-result v5

    goto :goto_b

    :cond_f
    move-object v9, v3

    move-object v12, v6

    move/from16 v10, v21

    move/from16 v11, v22

    move-object/from16 v21, v30

    const/4 v5, 0x0

    :goto_b
    iget-object v0, v8, LpT3;->t:Landroid/graphics/RectF;

    iget v1, v12, LPE2;->c:F

    sub-float v2, v1, v11

    iget v3, v12, LPE2;->d:F

    sub-float v4, v3, v11

    add-float/2addr v1, v11

    add-float/2addr v3, v11

    invoke-virtual {v0, v2, v4, v1, v3}, Landroid/graphics/RectF;->set(FFFF)V

    if-eqz v32, :cond_17

    const/4 v0, 0x0

    cmpl-float v1, v11, v0

    if-gtz v1, :cond_10

    if-eqz v23, :cond_17

    :cond_10
    if-eqz v23, :cond_12

    cmpg-float v1, v5, v0

    if-gez v1, :cond_11

    neg-float v5, v5

    :cond_11
    invoke-static {v11, v5}, Ljava/lang/Math;->max(FF)F

    move-result v4

    goto :goto_c

    :cond_12
    move v4, v11

    :goto_c
    move/from16 v1, v33

    const/4 v2, 0x1

    if-eq v1, v2, :cond_14

    cmpl-float v1, v4, v0

    if-nez v1, :cond_13

    goto :goto_d

    :cond_13
    mul-float v0, v4, v24

    div-float v5, v19, v0

    goto :goto_e

    :cond_14
    :goto_d
    const/4 v5, 0x0

    :goto_e
    div-float v0, v5, v25

    add-float v0, v31, v0

    mul-float/2addr v0, v14

    add-float/2addr v0, v15

    sub-float v20, v20, v5

    mul-float v5, v20, v14

    const/4 v1, 0x0

    cmpg-float v3, v5, v1

    if-gez v3, :cond_15

    move v5, v1

    :cond_15
    add-float/2addr v0, v5

    if-ltz v28, :cond_16

    rem-float v18, v18, v27

    sget v3, LOi6;->e:F

    cmpg-float v3, v18, v3

    if-gtz v3, :cond_16

    iget-object v0, v8, LpT3;->s:Landroid/graphics/Path;

    iget v3, v12, LPE2;->c:F

    iget v5, v12, LPE2;->d:F

    sget-object v6, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v3, v5, v4, v6}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    move v7, v13

    move/from16 v19, v14

    goto :goto_f

    :cond_16
    iget-object v3, v8, LpT3;->s:Landroid/graphics/Path;

    iget v6, v12, LPE2;->c:F

    mul-float v7, v0, v24

    float-to-double v1, v7

    move v7, v13

    move/from16 v19, v14

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v13

    double-to-float v13, v13

    mul-float/2addr v13, v4

    add-float/2addr v6, v13

    iget v13, v12, LPE2;->d:F

    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v4, v1

    add-float/2addr v13, v4

    invoke-virtual {v3, v6, v13}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v1, v8, LpT3;->s:Landroid/graphics/Path;

    iget-object v2, v8, LpT3;->t:Landroid/graphics/RectF;

    neg-float v3, v5

    invoke-virtual {v1, v2, v0, v3}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    goto :goto_f

    :cond_17
    move v7, v13

    move/from16 v19, v14

    rem-float v0, v18, v27

    sget v1, LOi6;->e:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_19

    if-eqz v23, :cond_18

    div-float v18, v18, v25

    add-float v26, v26, v18

    iget v0, v12, LPE2;->c:F

    mul-float v1, v26, v24

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    double-to-float v3, v3

    mul-float/2addr v3, v5

    add-float/2addr v0, v3

    iget v3, v12, LPE2;->d:F

    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v5, v1

    add-float/2addr v3, v5

    iget-object v1, v8, LpT3;->s:Landroid/graphics/Path;

    invoke-virtual {v1, v0, v3}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_f

    :cond_18
    iget-object v0, v8, LpT3;->s:Landroid/graphics/Path;

    iget v1, v12, LPE2;->c:F

    iget v2, v12, LPE2;->d:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    :cond_19
    :goto_f
    iget-object v0, v8, LpT3;->s:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    iget-object v0, v8, LpT3;->r:Landroid/graphics/Canvas;

    iget-object v1, v8, LpT3;->s:Landroid/graphics/Path;

    iget-object v2, v8, LRS0;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_11

    :cond_1a
    :goto_10
    move v10, v2

    move-object v9, v3

    move v11, v4

    move-object/from16 v21, v7

    move/from16 v32, v12

    move v7, v13

    move/from16 v19, v14

    move-object v12, v6

    :goto_11
    add-int/lit8 v2, v10, 0x1

    move v13, v7

    move-object v3, v9

    move v4, v11

    move-object v6, v12

    move/from16 v14, v19

    move-object/from16 v7, v21

    move/from16 v12, v32

    const/4 v5, 0x0

    move-object/from16 v9, p2

    goto/16 :goto_2

    :cond_1b
    move-object v12, v6

    invoke-static {v12}, LPE2;->f(LPE2;)V

    return-void
.end method

.method public e(Landroid/graphics/Canvas;)V
    .locals 53

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    iget-object v0, v6, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->o0()LPE2;

    move-result-object v8

    iget-object v0, v6, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->f0()F

    move-result v9

    iget-object v0, v6, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->j0()F

    move-result v0

    iget-object v1, v6, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/PieChart;->t0()[F

    move-result-object v10

    iget-object v1, v6, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/PieChart;->n0()[F

    move-result-object v11

    iget-object v1, v6, LRS0;->b:Lhi0;

    invoke-virtual {v1}, Lhi0;->a()F

    move-result v12

    iget-object v1, v6, LRS0;->b:Lhi0;

    invoke-virtual {v1}, Lhi0;->b()F

    move-result v13

    iget-object v1, v6, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/PieChart;->u0()F

    move-result v1

    mul-float/2addr v1, v9

    const/high16 v14, 0x42c80000    # 100.0f

    div-float/2addr v1, v14

    sub-float v1, v9, v1

    const/high16 v15, 0x40000000    # 2.0f

    div-float/2addr v1, v15

    iget-object v2, v6, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/PieChart;->u0()F

    move-result v2

    div-float v16, v2, v14

    const/high16 v2, 0x41200000    # 10.0f

    div-float v2, v9, v2

    const v3, 0x40666666    # 3.6f

    mul-float/2addr v2, v3

    iget-object v3, v6, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/PieChart;->y0()Z

    move-result v3

    if-eqz v3, :cond_0

    mul-float v2, v9, v16

    sub-float v2, v9, v2

    div-float/2addr v2, v15

    iget-object v3, v6, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/PieChart;->A0()Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, v6, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/PieChart;->z0()Z

    move-result v3

    if-eqz v3, :cond_0

    float-to-double v3, v0

    const/high16 v0, 0x43b40000    # 360.0f

    mul-float/2addr v1, v0

    float-to-double v0, v1

    const-wide v17, 0x401921fb54442d18L    # 6.283185307179586

    float-to-double v14, v9

    mul-double v14, v14, v17

    div-double/2addr v0, v14

    add-double/2addr v3, v0

    double-to-float v0, v3

    :cond_0
    move v14, v0

    sub-float v15, v9, v2

    iget-object v0, v6, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lii0;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, LqT3;

    invoke-virtual/range {v17 .. v17}, Lii0;->f()Ljava/util/List;

    move-result-object v5

    invoke-virtual/range {v17 .. v17}, LqT3;->u()F

    move-result v18

    iget-object v0, v6, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->x0()Z

    move-result v21

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    const/high16 v0, 0x40a00000    # 5.0f

    invoke-static {v0}, LOi6;->e(F)F

    move-result v22

    const/16 v23, 0x0

    move/from16 v0, v23

    move v4, v0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v1

    if-ge v4, v1, :cond_1d

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LXO1;

    invoke-interface {v3}, LoO1;->i0()Z

    move-result v24

    if-nez v24, :cond_1

    if-nez v21, :cond_1

    move/from16 v26, v4

    move-object/from16 v33, v5

    move/from16 v29, v9

    move-object/from16 v34, v10

    move-object/from16 v36, v11

    move/from16 v37, v12

    move/from16 v38, v13

    move/from16 v40, v14

    const/high16 v10, 0x40000000    # 2.0f

    const/high16 v19, 0x42c80000    # 100.0f

    move-object v9, v7

    move-object v13, v8

    goto/16 :goto_13

    :cond_1
    invoke-interface {v3}, LXO1;->H()LrT3;

    move-result-object v2

    invoke-interface {v3}, LXO1;->F0()LrT3;

    move-result-object v1

    invoke-virtual {v6, v3}, LRS0;->a(LoO1;)V

    move/from16 v25, v0

    iget-object v0, v6, LRS0;->f:Landroid/graphics/Paint;

    move/from16 v26, v4

    const-string v4, "Q"

    invoke-static {v0, v4}, LOi6;->a(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v4, 0x40800000    # 4.0f

    invoke-static {v4}, LOi6;->e(F)F

    move-result v4

    add-float v27, v0, v4

    invoke-interface {v3}, LoO1;->b0()LJj6;

    move-result-object v4

    invoke-interface {v3}, LoO1;->L0()I

    move-result v0

    move-object/from16 v28, v5

    iget-object v5, v6, LpT3;->j:Landroid/graphics/Paint;

    invoke-interface {v3}, LXO1;->y0()I

    move-result v7

    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v5, v6, LpT3;->j:Landroid/graphics/Paint;

    invoke-interface {v3}, LXO1;->d0()F

    move-result v7

    invoke-static {v7}, LOi6;->e(F)F

    move-result v7

    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {v6, v3}, LpT3;->r(LXO1;)F

    move-result v7

    invoke-interface {v3}, LoO1;->M0()LPE2;

    move-result-object v5

    invoke-static {v5}, LPE2;->d(LPE2;)LPE2;

    move-result-object v5

    move-object/from16 v29, v8

    iget v8, v5, LPE2;->c:F

    invoke-static {v8}, LOi6;->e(F)F

    move-result v8

    iput v8, v5, LPE2;->c:F

    iget v8, v5, LPE2;->d:F

    invoke-static {v8}, LOi6;->e(F)F

    move-result v8

    iput v8, v5, LPE2;->d:F

    move/from16 v8, v23

    :goto_1
    if-ge v8, v0, :cond_1c

    invoke-interface {v3, v8}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v30

    move-object/from16 v31, v5

    move-object/from16 v5, v30

    check-cast v5, Lcom/github/mikephil/charting/data/PieEntry;

    if-nez v25, :cond_2

    const/16 v30, 0x0

    goto :goto_2

    :cond_2
    add-int/lit8 v30, v25, -0x1

    aget v30, v11, v30

    mul-float v30, v30, v12

    :goto_2
    aget v32, v10, v25

    const v33, 0x3c8efa35

    mul-float v34, v15, v33

    div-float v34, v7, v34

    const/high16 v20, 0x40000000    # 2.0f

    div-float v34, v34, v20

    sub-float v32, v32, v34

    div-float v32, v32, v20

    add-float v30, v30, v32

    mul-float v30, v30, v13

    move/from16 v32, v0

    add-float v0, v14, v30

    move/from16 v30, v7

    iget-object v7, v6, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v7}, Lcom/github/mikephil/charting/charts/PieChart;->B0()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v5}, LAA;->c()F

    move-result v7

    div-float v7, v7, v18

    const/high16 v19, 0x42c80000    # 100.0f

    mul-float v7, v7, v19

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, LAA;->c()F

    move-result v7

    :goto_3
    invoke-virtual {v4, v7, v5}, LJj6;->g(FLcom/github/mikephil/charting/data/PieEntry;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v34, v10

    invoke-virtual {v5}, Lcom/github/mikephil/charting/data/PieEntry;->h()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v35, v4

    mul-float v4, v0, v33

    move-object/from16 v33, v5

    float-to-double v4, v4

    move-object/from16 v36, v11

    move/from16 v37, v12

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v11

    double-to-float v11, v11

    move/from16 v38, v13

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v12

    double-to-float v12, v12

    if-eqz v21, :cond_4

    sget-object v13, LrT3;->c:LrT3;

    if-ne v2, v13, :cond_4

    const/4 v13, 0x1

    goto :goto_4

    :cond_4
    move/from16 v13, v23

    :goto_4
    move/from16 v40, v14

    if-eqz v24, :cond_5

    sget-object v14, LrT3;->c:LrT3;

    if-ne v1, v14, :cond_5

    const/4 v14, 0x1

    goto :goto_5

    :cond_5
    move/from16 v14, v23

    :goto_5
    move-object/from16 v41, v10

    if-eqz v21, :cond_6

    sget-object v10, LrT3;->b:LrT3;

    if-ne v2, v10, :cond_6

    const/4 v10, 0x1

    goto :goto_6

    :cond_6
    move/from16 v10, v23

    :goto_6
    move-object/from16 v42, v2

    if-eqz v24, :cond_7

    sget-object v2, LrT3;->b:LrT3;

    if-ne v1, v2, :cond_7

    const/16 v39, 0x1

    goto :goto_7

    :cond_7
    move/from16 v39, v23

    :goto_7
    if-nez v13, :cond_9

    if-eqz v14, :cond_8

    goto :goto_8

    :cond_8
    move-object/from16 v45, v1

    move/from16 v44, v12

    move-object/from16 v50, v29

    move-object/from16 v51, v31

    move-object/from16 v48, v35

    move-object/from16 v14, v41

    const/high16 v19, 0x42c80000    # 100.0f

    move-object v12, v3

    move/from16 v29, v9

    move-object/from16 v9, p1

    move-object/from16 v52, v33

    move-object/from16 v33, v28

    move-object/from16 v28, v52

    goto/16 :goto_e

    :cond_9
    :goto_8
    invoke-interface {v3}, LXO1;->e0()F

    move-result v2

    invoke-interface {v3}, LXO1;->o()F

    move-result v43

    invoke-interface {v3}, LXO1;->L()F

    move-result v44

    const/high16 v19, 0x42c80000    # 100.0f

    div-float v44, v44, v19

    move-object/from16 v45, v1

    iget-object v1, v6, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/PieChart;->y0()Z

    move-result v1

    if-eqz v1, :cond_a

    mul-float v1, v9, v16

    sub-float v46, v9, v1

    mul-float v46, v46, v44

    add-float v46, v46, v1

    goto :goto_9

    :cond_a
    mul-float v46, v9, v44

    :goto_9
    invoke-interface {v3}, LXO1;->G0()Z

    move-result v1

    if-eqz v1, :cond_b

    mul-float v43, v43, v15

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    double-to-float v1, v4

    mul-float v43, v43, v1

    goto :goto_a

    :cond_b
    mul-float v43, v43, v15

    :goto_a
    mul-float v1, v46, v11

    move-object/from16 v5, v29

    iget v4, v5, LPE2;->c:F

    add-float/2addr v1, v4

    mul-float v46, v46, v12

    move/from16 v29, v9

    iget v9, v5, LPE2;->d:F

    add-float v44, v46, v9

    const/high16 v46, 0x3f800000    # 1.0f

    add-float v2, v2, v46

    mul-float/2addr v2, v15

    mul-float v46, v2, v11

    add-float v46, v46, v4

    mul-float/2addr v2, v12

    add-float/2addr v9, v2

    move-object/from16 v47, v5

    float-to-double v4, v0

    const-wide v48, 0x4076800000000000L    # 360.0

    rem-double v4, v4, v48

    const-wide v48, 0x4056800000000000L    # 90.0

    cmpl-double v0, v4, v48

    if-ltz v0, :cond_d

    const-wide v48, 0x4070e00000000000L    # 270.0

    cmpg-double v0, v4, v48

    if-gtz v0, :cond_d

    sub-float v0, v46, v43

    iget-object v2, v6, LRS0;->f:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    if-eqz v13, :cond_c

    iget-object v2, v6, LpT3;->l:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    :cond_c
    sub-float v2, v0, v22

    move/from16 v43, v0

    move v5, v2

    goto :goto_b

    :cond_d
    add-float v43, v46, v43

    iget-object v0, v6, LRS0;->f:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    if-eqz v13, :cond_e

    iget-object v0, v6, LpT3;->l:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    :cond_e
    add-float v0, v43, v22

    move v5, v0

    :goto_b
    invoke-interface {v3}, LXO1;->y0()I

    move-result v0

    const v2, 0x112233

    if-eq v0, v2, :cond_10

    invoke-interface {v3}, LXO1;->H0()Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, v6, LpT3;->j:Landroid/graphics/Paint;

    invoke-interface {v3, v8}, LoO1;->A0(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    :cond_f
    iget-object v4, v6, LpT3;->j:Landroid/graphics/Paint;

    move-object/from16 v0, p1

    move/from16 v2, v44

    move/from16 v44, v12

    move-object v12, v3

    move/from16 v3, v46

    move-object/from16 v48, v35

    move-object/from16 v35, v4

    move v4, v9

    move-object/from16 v51, v31

    move-object/from16 v50, v47

    move/from16 v31, v5

    move-object/from16 v52, v33

    move-object/from16 v33, v28

    move-object/from16 v28, v52

    move-object/from16 v5, v35

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v5, v6, LpT3;->j:Landroid/graphics/Paint;

    move/from16 v1, v46

    move v2, v9

    move/from16 v3, v43

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_c

    :cond_10
    move/from16 v44, v12

    move-object/from16 v51, v31

    move-object/from16 v48, v35

    move-object/from16 v50, v47

    move-object v12, v3

    move/from16 v31, v5

    move-object/from16 v52, v33

    move-object/from16 v33, v28

    move-object/from16 v28, v52

    :goto_c
    if-eqz v13, :cond_12

    if-eqz v14, :cond_12

    invoke-interface {v12, v8}, LoO1;->m(I)I

    move-result v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v7

    move/from16 v3, v31

    move v4, v9

    invoke-virtual/range {v0 .. v5}, LpT3;->m(Landroid/graphics/Canvas;Ljava/lang/String;FFI)V

    invoke-virtual/range {v17 .. v17}, Lii0;->g()I

    move-result v0

    if-ge v8, v0, :cond_11

    if-eqz v41, :cond_11

    add-float v9, v9, v27

    move-object/from16 v5, p1

    move/from16 v3, v31

    move-object/from16 v4, v41

    invoke-virtual {v6, v5, v4, v3, v9}, LpT3;->k(Landroid/graphics/Canvas;Ljava/lang/String;FF)V

    goto :goto_d

    :cond_11
    move-object/from16 v9, p1

    move-object/from16 v14, v41

    goto :goto_e

    :cond_12
    move-object/from16 v5, p1

    move/from16 v3, v31

    move-object/from16 v4, v41

    if-eqz v13, :cond_13

    invoke-virtual/range {v17 .. v17}, Lii0;->g()I

    move-result v0

    if-ge v8, v0, :cond_14

    if-eqz v4, :cond_14

    const/high16 v0, 0x40000000    # 2.0f

    div-float v1, v27, v0

    add-float/2addr v9, v1

    invoke-virtual {v6, v5, v4, v3, v9}, LpT3;->k(Landroid/graphics/Canvas;Ljava/lang/String;FF)V

    goto :goto_d

    :cond_13
    const/high16 v0, 0x40000000    # 2.0f

    if-eqz v14, :cond_14

    div-float v1, v27, v0

    add-float/2addr v9, v1

    invoke-interface {v12, v8}, LoO1;->m(I)I

    move-result v13

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v7

    move-object v14, v4

    move v4, v9

    move-object v9, v5

    move v5, v13

    invoke-virtual/range {v0 .. v5}, LpT3;->m(Landroid/graphics/Canvas;Ljava/lang/String;FFI)V

    goto :goto_e

    :cond_14
    :goto_d
    move-object v14, v4

    move-object v9, v5

    :goto_e
    if-nez v10, :cond_17

    if-eqz v39, :cond_15

    goto :goto_10

    :cond_15
    move-object/from16 v13, v50

    :cond_16
    :goto_f
    const/high16 v10, 0x40000000    # 2.0f

    goto/16 :goto_11

    :cond_17
    :goto_10
    mul-float v0, v15, v11

    move-object/from16 v13, v50

    iget v1, v13, LPE2;->c:F

    add-float v5, v0, v1

    mul-float v0, v15, v44

    iget v1, v13, LPE2;->d:F

    add-float v31, v0, v1

    iget-object v0, v6, LRS0;->f:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    if-eqz v10, :cond_18

    if-eqz v39, :cond_18

    invoke-interface {v12, v8}, LoO1;->m(I)I

    move-result v10

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v7

    move v3, v5

    move/from16 v4, v31

    move v7, v5

    move v5, v10

    invoke-virtual/range {v0 .. v5}, LpT3;->m(Landroid/graphics/Canvas;Ljava/lang/String;FFI)V

    invoke-virtual/range {v17 .. v17}, Lii0;->g()I

    move-result v0

    if-ge v8, v0, :cond_16

    if-eqz v14, :cond_16

    add-float v0, v31, v27

    invoke-virtual {v6, v9, v14, v7, v0}, LpT3;->k(Landroid/graphics/Canvas;Ljava/lang/String;FF)V

    goto :goto_f

    :cond_18
    move v3, v5

    if-eqz v10, :cond_19

    invoke-virtual/range {v17 .. v17}, Lii0;->g()I

    move-result v0

    if-ge v8, v0, :cond_16

    if-eqz v14, :cond_16

    const/high16 v10, 0x40000000    # 2.0f

    div-float v0, v27, v10

    add-float v0, v31, v0

    invoke-virtual {v6, v9, v14, v3, v0}, LpT3;->k(Landroid/graphics/Canvas;Ljava/lang/String;FF)V

    goto :goto_11

    :cond_19
    const/high16 v10, 0x40000000    # 2.0f

    if-eqz v39, :cond_1a

    div-float v0, v27, v10

    add-float v4, v31, v0

    invoke-interface {v12, v8}, LoO1;->m(I)I

    move-result v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v7

    invoke-virtual/range {v0 .. v5}, LpT3;->m(Landroid/graphics/Canvas;Ljava/lang/String;FFI)V

    :cond_1a
    :goto_11
    invoke-virtual/range {v28 .. v28}, LAA;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-interface {v12}, LoO1;->D()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual/range {v28 .. v28}, LAA;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    move-object/from16 v7, v51

    iget v0, v7, LPE2;->d:F

    add-float v2, v15, v0

    mul-float/2addr v2, v11

    iget v3, v13, LPE2;->c:F

    add-float/2addr v2, v3

    add-float/2addr v0, v15

    mul-float v0, v0, v44

    iget v3, v13, LPE2;->d:F

    add-float/2addr v0, v3

    iget v3, v7, LPE2;->c:F

    add-float/2addr v0, v3

    float-to-int v2, v2

    float-to-int v3, v0

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v5}, LOi6;->f(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;IIII)V

    goto :goto_12

    :cond_1b
    move-object/from16 v7, v51

    :goto_12
    add-int/lit8 v25, v25, 0x1

    add-int/lit8 v8, v8, 0x1

    move-object v5, v7

    move-object v3, v12

    move/from16 v9, v29

    move/from16 v7, v30

    move/from16 v0, v32

    move-object/from16 v28, v33

    move-object/from16 v10, v34

    move-object/from16 v11, v36

    move/from16 v12, v37

    move/from16 v14, v40

    move-object/from16 v2, v42

    move-object/from16 v1, v45

    move-object/from16 v4, v48

    move-object/from16 v29, v13

    move/from16 v13, v38

    goto/16 :goto_1

    :cond_1c
    move-object v7, v5

    move-object/from16 v34, v10

    move-object/from16 v36, v11

    move/from16 v37, v12

    move/from16 v38, v13

    move/from16 v40, v14

    move-object/from16 v33, v28

    move-object/from16 v13, v29

    const/high16 v10, 0x40000000    # 2.0f

    const/high16 v19, 0x42c80000    # 100.0f

    move/from16 v29, v9

    move-object/from16 v9, p1

    invoke-static {v7}, LPE2;->f(LPE2;)V

    move/from16 v0, v25

    :goto_13
    add-int/lit8 v4, v26, 0x1

    move-object v7, v9

    move-object v8, v13

    move/from16 v9, v29

    move-object/from16 v5, v33

    move-object/from16 v10, v34

    move-object/from16 v11, v36

    move/from16 v12, v37

    move/from16 v13, v38

    move/from16 v14, v40

    goto/16 :goto_0

    :cond_1d
    move-object v9, v7

    move-object v13, v8

    invoke-static {v13}, LPE2;->f(LPE2;)V

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public h(LPE2;FFFFFF)F
    .locals 15

    move-object/from16 v0, p1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v2, p7, v1

    add-float v2, p6, v2

    iget v3, v0, LPE2;->c:F

    add-float v4, p6, p7

    const v5, 0x3c8efa35

    mul-float/2addr v4, v5

    float-to-double v6, v4

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    double-to-float v4, v8

    mul-float v4, v4, p2

    add-float/2addr v3, v4

    iget v4, v0, LPE2;->d:F

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    double-to-float v6, v6

    mul-float v6, v6, p2

    add-float/2addr v4, v6

    iget v6, v0, LPE2;->c:F

    mul-float/2addr v2, v5

    float-to-double v7, v2

    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    move-result-wide v9

    double-to-float v2, v9

    mul-float v2, v2, p2

    add-float/2addr v6, v2

    iget v0, v0, LPE2;->d:F

    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    move-result-wide v7

    double-to-float v2, v7

    mul-float v2, v2, p2

    add-float/2addr v0, v2

    sub-float v2, v3, p4

    float-to-double v7, v2

    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v7

    sub-float v2, v4, p5

    float-to-double v11, v2

    invoke-static {v11, v12, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v11

    add-double/2addr v7, v11

    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v7

    div-double/2addr v7, v9

    const-wide v11, 0x4066800000000000L    # 180.0

    move/from16 v2, p3

    float-to-double v13, v2

    sub-double/2addr v11, v13

    div-double/2addr v11, v9

    const-wide v13, 0x3f91df46a2529d39L    # 0.017453292519943295

    mul-double/2addr v11, v13

    invoke-static {v11, v12}, Ljava/lang/Math;->tan(D)D

    move-result-wide v11

    mul-double/2addr v7, v11

    double-to-float v2, v7

    sub-float v2, p2, v2

    float-to-double v7, v2

    add-float v3, v3, p4

    div-float/2addr v3, v1

    sub-float/2addr v6, v3

    float-to-double v2, v6

    invoke-static {v2, v3, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    add-float v4, v4, p5

    div-float/2addr v4, v1

    sub-float/2addr v0, v4

    float-to-double v0, v0

    invoke-static {v0, v1, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    add-double/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    sub-double/2addr v7, v0

    double-to-float v0, v7

    return v0
.end method

.method public i(Landroid/graphics/Canvas;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/PieChart;->p0()Ljava/lang/CharSequence;

    move-result-object v4

    iget-object v2, v0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/PieChart;->w0()Z

    move-result v2

    if-eqz v2, :cond_4

    if-eqz v4, :cond_4

    iget-object v2, v0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/PieChart;->o0()LPE2;

    move-result-object v2

    iget-object v3, v0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/PieChart;->q0()LPE2;

    move-result-object v13

    iget v3, v2, LPE2;->c:F

    iget v5, v13, LPE2;->c:F

    add-float/2addr v3, v5

    iget v5, v2, LPE2;->d:F

    iget v6, v13, LPE2;->d:F

    add-float/2addr v5, v6

    iget-object v6, v0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v6}, Lcom/github/mikephil/charting/charts/PieChart;->y0()Z

    move-result v6

    const/high16 v7, 0x42c80000    # 100.0f

    if-eqz v6, :cond_0

    iget-object v6, v0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v6}, Lcom/github/mikephil/charting/charts/PieChart;->A0()Z

    move-result v6

    if-nez v6, :cond_0

    iget-object v6, v0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v6}, Lcom/github/mikephil/charting/charts/PieChart;->f0()F

    move-result v6

    iget-object v8, v0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v8}, Lcom/github/mikephil/charting/charts/PieChart;->u0()F

    move-result v8

    div-float/2addr v8, v7

    mul-float/2addr v6, v8

    goto :goto_0

    :cond_0
    iget-object v6, v0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v6}, Lcom/github/mikephil/charting/charts/PieChart;->f0()F

    move-result v6

    :goto_0
    iget-object v8, v0, LpT3;->p:[Landroid/graphics/RectF;

    const/4 v9, 0x0

    aget-object v14, v8, v9

    sub-float v9, v3, v6

    iput v9, v14, Landroid/graphics/RectF;->left:F

    sub-float v9, v5, v6

    iput v9, v14, Landroid/graphics/RectF;->top:F

    add-float/2addr v3, v6

    iput v3, v14, Landroid/graphics/RectF;->right:F

    add-float/2addr v5, v6

    iput v5, v14, Landroid/graphics/RectF;->bottom:F

    const/4 v3, 0x1

    aget-object v15, v8, v3

    invoke-virtual {v15, v14}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    iget-object v3, v0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/PieChart;->r0()F

    move-result v3

    div-float/2addr v3, v7

    float-to-double v5, v3

    const-wide/16 v7, 0x0

    cmpl-double v5, v5, v7

    const/high16 v16, 0x40000000    # 2.0f

    if-lez v5, :cond_1

    invoke-virtual {v15}, Landroid/graphics/RectF;->width()F

    move-result v5

    invoke-virtual {v15}, Landroid/graphics/RectF;->width()F

    move-result v6

    mul-float/2addr v6, v3

    sub-float/2addr v5, v6

    div-float v5, v5, v16

    invoke-virtual {v15}, Landroid/graphics/RectF;->height()F

    move-result v6

    invoke-virtual {v15}, Landroid/graphics/RectF;->height()F

    move-result v7

    mul-float/2addr v7, v3

    sub-float/2addr v6, v7

    div-float v6, v6, v16

    invoke-virtual {v15, v5, v6}, Landroid/graphics/RectF;->inset(FF)V

    :cond_1
    iget-object v3, v0, LpT3;->n:Ljava/lang/CharSequence;

    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, v0, LpT3;->o:Landroid/graphics/RectF;

    invoke-virtual {v15, v3}, Landroid/graphics/RectF;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v18, v13

    goto :goto_2

    :cond_3
    :goto_1
    iget-object v3, v0, LpT3;->o:Landroid/graphics/RectF;

    invoke-virtual {v3, v15}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    iput-object v4, v0, LpT3;->n:Ljava/lang/CharSequence;

    iget-object v3, v0, LpT3;->o:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    new-instance v12, Landroid/text/StaticLayout;

    const/4 v5, 0x0

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v6

    iget-object v7, v0, LpT3;->k:Landroid/text/TextPaint;

    float-to-double v8, v3

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->max(DD)D

    move-result-wide v8

    double-to-int v8, v8

    sget-object v9, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v11, 0x0

    const/16 v17, 0x0

    move-object v3, v12

    move-object/from16 v18, v13

    move-object v13, v12

    move/from16 v12, v17

    invoke-direct/range {v3 .. v12}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    iput-object v13, v0, LpT3;->m:Landroid/text/StaticLayout;

    :goto_2
    iget-object v3, v0, LpT3;->m:Landroid/text/StaticLayout;

    invoke-virtual {v3}, Landroid/text/Layout;->getHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    iget-object v4, v0, LpT3;->v:Landroid/graphics/Path;

    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v4, v14, v5}, Landroid/graphics/Path;->addOval(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    invoke-virtual {v1, v4}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    iget v4, v15, Landroid/graphics/RectF;->left:F

    iget v5, v15, Landroid/graphics/RectF;->top:F

    invoke-virtual {v15}, Landroid/graphics/RectF;->height()F

    move-result v6

    sub-float/2addr v6, v3

    div-float v6, v6, v16

    add-float/2addr v5, v6

    invoke-virtual {v1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v3, v0, LpT3;->m:Landroid/text/StaticLayout;

    invoke-virtual {v3, v1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    invoke-static {v2}, LPE2;->f(LPE2;)V

    invoke-static/range {v18 .. v18}, LPE2;->f(LPE2;)V

    :cond_4
    return-void
.end method

.method public j(Landroid/graphics/Canvas;LXO1;)V
    .locals 36

    move-object/from16 v8, p0

    move-object/from16 v9, p2

    iget-object v0, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->j0()F

    move-result v10

    iget-object v0, v8, LRS0;->b:Lhi0;

    invoke-virtual {v0}, Lhi0;->a()F

    move-result v11

    iget-object v0, v8, LRS0;->b:Lhi0;

    invoke-virtual {v0}, Lhi0;->b()F

    move-result v12

    iget-object v0, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->s0()Landroid/graphics/RectF;

    move-result-object v13

    invoke-interface/range {p2 .. p2}, LoO1;->L0()I

    move-result v14

    iget-object v0, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->t0()[F

    move-result-object v15

    iget-object v0, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->o0()LPE2;

    move-result-object v7

    iget-object v0, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->f0()F

    move-result v6

    iget-object v0, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->y0()Z

    move-result v0

    const/16 v16, 0x0

    const/4 v5, 0x1

    if-eqz v0, :cond_0

    iget-object v0, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->A0()Z

    move-result v0

    if-nez v0, :cond_0

    move/from16 v17, v5

    goto :goto_0

    :cond_0
    move/from16 v17, v16

    :goto_0
    const/high16 v0, 0x42c80000    # 100.0f

    const/16 v18, 0x0

    if-eqz v17, :cond_1

    iget-object v1, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/PieChart;->u0()F

    move-result v1

    div-float/2addr v1, v0

    mul-float/2addr v1, v6

    move v4, v1

    goto :goto_1

    :cond_1
    move/from16 v4, v18

    :goto_1
    iget-object v1, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/PieChart;->u0()F

    move-result v1

    mul-float/2addr v1, v6

    div-float/2addr v1, v0

    sub-float v0, v6, v1

    const/high16 v19, 0x40000000    # 2.0f

    div-float v20, v0, v19

    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    if-eqz v17, :cond_2

    iget-object v0, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->z0()Z

    move-result v0

    if-eqz v0, :cond_2

    move/from16 v21, v5

    goto :goto_2

    :cond_2
    move/from16 v21, v16

    :goto_2
    move/from16 v0, v16

    move v2, v0

    :goto_3
    if-ge v0, v14, :cond_4

    invoke-interface {v9, v0}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v1

    check-cast v1, Lcom/github/mikephil/charting/data/PieEntry;

    invoke-virtual {v1}, LAA;->c()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    sget v22, LOi6;->e:F

    cmpl-float v1, v1, v22

    if-lez v1, :cond_3

    add-int/lit8 v2, v2, 0x1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_4
    if-gt v2, v5, :cond_5

    move/from16 v22, v18

    goto :goto_4

    :cond_5
    invoke-virtual {v8, v9}, LpT3;->r(LXO1;)F

    move-result v0

    move/from16 v22, v0

    :goto_4
    move/from16 v1, v16

    move/from16 v23, v18

    :goto_5
    if-ge v1, v14, :cond_1a

    aget v24, v15, v1

    invoke-interface {v9, v1}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    invoke-virtual {v0}, LAA;->c()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    sget v25, LOi6;->e:F

    cmpl-float v0, v0, v25

    if-gtz v0, :cond_6

    :goto_6
    mul-float v24, v24, v11

    add-float v23, v23, v24

    move/from16 v31, v1

    move/from16 v26, v6

    move/from16 v32, v10

    move/from16 v33, v11

    move-object/from16 v30, v13

    move/from16 v27, v14

    move-object/from16 v34, v15

    move v15, v2

    move-object v11, v3

    move v10, v4

    move-object v13, v7

    goto/16 :goto_15

    :cond_6
    iget-object v0, v8, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/PieChart;->C0(I)Z

    move-result v0

    if-eqz v0, :cond_7

    if-nez v21, :cond_7

    goto :goto_6

    :cond_7
    cmpl-float v0, v22, v18

    const/high16 v5, 0x43340000    # 180.0f

    if-lez v0, :cond_8

    cmpg-float v0, v24, v5

    if-gtz v0, :cond_8

    const/4 v0, 0x1

    goto :goto_7

    :cond_8
    move/from16 v0, v16

    :goto_7
    iget-object v5, v8, LRS0;->c:Landroid/graphics/Paint;

    move/from16 v27, v14

    invoke-interface {v9, v1}, LoO1;->A0(I)I

    move-result v14

    invoke-virtual {v5, v14}, Landroid/graphics/Paint;->setColor(I)V

    const v14, 0x3c8efa35

    const/4 v5, 0x1

    if-ne v2, v5, :cond_9

    move/from16 v28, v18

    goto :goto_8

    :cond_9
    mul-float v28, v6, v14

    div-float v28, v22, v28

    :goto_8
    div-float v29, v28, v19

    add-float v29, v23, v29

    mul-float v29, v29, v12

    add-float v14, v10, v29

    sub-float v28, v24, v28

    mul-float v28, v28, v12

    cmpg-float v29, v28, v18

    if-gez v29, :cond_a

    move/from16 v9, v18

    goto :goto_9

    :cond_a
    move/from16 v9, v28

    :goto_9
    iget-object v5, v8, LpT3;->s:Landroid/graphics/Path;

    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    if-eqz v21, :cond_b

    iget v5, v7, LPE2;->c:F

    sub-float v29, v6, v20

    move/from16 v31, v1

    const v30, 0x3c8efa35

    mul-float v1, v14, v30

    move/from16 v30, v2

    float-to-double v1, v1

    move/from16 v32, v10

    move/from16 v33, v11

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v10

    double-to-float v10, v10

    mul-float v10, v10, v29

    add-float/2addr v5, v10

    iget v10, v7, LPE2;->d:F

    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float v29, v29, v1

    add-float v10, v10, v29

    sub-float v1, v5, v20

    sub-float v2, v10, v20

    add-float v5, v5, v20

    add-float v10, v10, v20

    invoke-virtual {v3, v1, v2, v5, v10}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_a

    :cond_b
    move/from16 v31, v1

    move/from16 v30, v2

    move/from16 v32, v10

    move/from16 v33, v11

    :goto_a
    iget v1, v7, LPE2;->c:F

    const v2, 0x3c8efa35

    mul-float v5, v14, v2

    float-to-double v10, v5

    move/from16 v29, v4

    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    double-to-float v2, v4

    mul-float/2addr v2, v6

    add-float v4, v1, v2

    iget v1, v7, LPE2;->d:F

    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    double-to-float v2, v10

    mul-float/2addr v2, v6

    add-float v5, v1, v2

    const/high16 v10, 0x43b40000    # 360.0f

    cmpl-float v11, v9, v10

    if-ltz v11, :cond_c

    rem-float v1, v9, v10

    cmpg-float v1, v1, v25

    if-gtz v1, :cond_c

    iget-object v1, v8, LpT3;->s:Landroid/graphics/Path;

    iget v2, v7, LPE2;->c:F

    iget v10, v7, LPE2;->d:F

    move-object/from16 v34, v15

    sget-object v15, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v1, v2, v10, v6, v15}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    const/high16 v10, 0x43340000    # 180.0f

    goto :goto_c

    :cond_c
    move-object/from16 v34, v15

    if-eqz v21, :cond_d

    iget-object v1, v8, LpT3;->s:Landroid/graphics/Path;

    const/high16 v10, 0x43340000    # 180.0f

    add-float v2, v14, v10

    const/high16 v15, -0x3ccc0000    # -180.0f

    invoke-virtual {v1, v3, v2, v15}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    goto :goto_b

    :cond_d
    const/high16 v10, 0x43340000    # 180.0f

    :goto_b
    iget-object v1, v8, LpT3;->s:Landroid/graphics/Path;

    invoke-virtual {v1, v13, v14, v9}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    :goto_c
    iget-object v1, v8, LpT3;->t:Landroid/graphics/RectF;

    iget v2, v7, LPE2;->c:F

    sub-float v15, v2, v29

    iget v10, v7, LPE2;->d:F

    move-object/from16 v35, v3

    sub-float v3, v10, v29

    add-float v2, v2, v29

    add-float v10, v10, v29

    invoke-virtual {v1, v15, v3, v2, v10}, Landroid/graphics/RectF;->set(FFFF)V

    if-eqz v17, :cond_17

    cmpl-float v1, v29, v18

    if-gtz v1, :cond_f

    if-eqz v0, :cond_e

    goto :goto_d

    :cond_e
    move/from16 v26, v6

    move/from16 v10, v29

    move/from16 v15, v30

    move-object/from16 v11, v35

    const/high16 v1, 0x43b40000    # 360.0f

    move-object/from16 v30, v13

    move-object v13, v7

    goto/16 :goto_13

    :cond_f
    :goto_d
    if-eqz v0, :cond_11

    mul-float v3, v24, v12

    move-object/from16 v0, p0

    move/from16 v10, v31

    move-object v1, v7

    move/from16 v15, v30

    move v2, v6

    move-object/from16 v30, v13

    move-object/from16 v13, v35

    move/from16 v10, v29

    const/4 v13, 0x1

    move/from16 v26, v6

    move v6, v14

    move-object v14, v7

    move v7, v9

    invoke-virtual/range {v0 .. v7}, LpT3;->h(LPE2;FFFFFF)F

    move-result v0

    cmpg-float v1, v0, v18

    if-gez v1, :cond_10

    neg-float v0, v0

    :cond_10
    invoke-static {v10, v0}, Ljava/lang/Math;->max(FF)F

    move-result v4

    goto :goto_e

    :cond_11
    move/from16 v26, v6

    move-object v14, v7

    move/from16 v10, v29

    move/from16 v15, v30

    move-object/from16 v30, v13

    const/4 v13, 0x1

    move v4, v10

    :goto_e
    if-eq v15, v13, :cond_13

    cmpl-float v0, v4, v18

    if-nez v0, :cond_12

    goto :goto_f

    :cond_12
    const v0, 0x3c8efa35

    mul-float v1, v4, v0

    div-float v0, v22, v1

    goto :goto_10

    :cond_13
    :goto_f
    move/from16 v0, v18

    :goto_10
    div-float v1, v0, v19

    add-float v1, v23, v1

    mul-float/2addr v1, v12

    add-float v1, v32, v1

    sub-float v0, v24, v0

    mul-float/2addr v0, v12

    cmpg-float v2, v0, v18

    if-gez v2, :cond_14

    move/from16 v0, v18

    :cond_14
    add-float/2addr v1, v0

    if-ltz v11, :cond_15

    const/high16 v2, 0x43b40000    # 360.0f

    rem-float/2addr v9, v2

    cmpg-float v2, v9, v25

    if-gtz v2, :cond_15

    iget-object v0, v8, LpT3;->s:Landroid/graphics/Path;

    iget v1, v14, LPE2;->c:F

    iget v2, v14, LPE2;->d:F

    sget-object v3, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v2, v4, v3}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    move-object v5, v14

    move-object/from16 v11, v35

    goto :goto_12

    :cond_15
    if-eqz v21, :cond_16

    iget v2, v14, LPE2;->c:F

    sub-float v6, v26, v20

    const v3, 0x3c8efa35

    mul-float/2addr v3, v1

    float-to-double v3, v3

    move-object v5, v14

    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v13

    double-to-float v7, v13

    mul-float/2addr v7, v6

    add-float/2addr v2, v7

    iget v7, v5, LPE2;->d:F

    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    double-to-float v3, v3

    mul-float/2addr v6, v3

    add-float/2addr v7, v6

    sub-float v3, v2, v20

    sub-float v4, v7, v20

    add-float v2, v2, v20

    add-float v7, v7, v20

    move-object/from16 v11, v35

    invoke-virtual {v11, v3, v4, v2, v7}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v2, v8, LpT3;->s:Landroid/graphics/Path;

    const/high16 v3, 0x43340000    # 180.0f

    invoke-virtual {v2, v11, v1, v3}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    goto :goto_11

    :cond_16
    move-object v5, v14

    move-object/from16 v11, v35

    iget-object v2, v8, LpT3;->s:Landroid/graphics/Path;

    iget v3, v5, LPE2;->c:F

    const v6, 0x3c8efa35

    mul-float v14, v1, v6

    float-to-double v6, v14

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v13

    double-to-float v9, v13

    mul-float/2addr v9, v4

    add-float/2addr v3, v9

    iget v9, v5, LPE2;->d:F

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    double-to-float v6, v6

    mul-float/2addr v4, v6

    add-float/2addr v9, v4

    invoke-virtual {v2, v3, v9}, Landroid/graphics/Path;->lineTo(FF)V

    :goto_11
    iget-object v2, v8, LpT3;->s:Landroid/graphics/Path;

    iget-object v3, v8, LpT3;->t:Landroid/graphics/RectF;

    neg-float v0, v0

    invoke-virtual {v2, v3, v1, v0}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    :goto_12
    move-object v13, v5

    goto :goto_14

    :cond_17
    move/from16 v26, v6

    move/from16 v10, v29

    move/from16 v15, v30

    move-object/from16 v11, v35

    move-object/from16 v30, v13

    move-object v13, v7

    const/high16 v1, 0x43b40000    # 360.0f

    :goto_13
    rem-float v1, v9, v1

    cmpl-float v1, v1, v25

    if-lez v1, :cond_19

    if-eqz v0, :cond_18

    div-float v0, v9, v19

    add-float v25, v14, v0

    mul-float v3, v24, v12

    move-object/from16 v0, p0

    move-object v1, v13

    move/from16 v2, v26

    move v6, v14

    move v7, v9

    invoke-virtual/range {v0 .. v7}, LpT3;->h(LPE2;FFFFFF)F

    move-result v0

    iget v1, v13, LPE2;->c:F

    const v2, 0x3c8efa35

    mul-float v2, v2, v25

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    double-to-float v4, v4

    mul-float/2addr v4, v0

    add-float/2addr v1, v4

    iget v4, v13, LPE2;->d:F

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v0, v2

    add-float/2addr v4, v0

    iget-object v0, v8, LpT3;->s:Landroid/graphics/Path;

    invoke-virtual {v0, v1, v4}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_14

    :cond_18
    iget-object v0, v8, LpT3;->s:Landroid/graphics/Path;

    iget v1, v13, LPE2;->c:F

    iget v2, v13, LPE2;->d:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    :cond_19
    :goto_14
    iget-object v0, v8, LpT3;->s:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    iget-object v0, v8, LpT3;->r:Landroid/graphics/Canvas;

    iget-object v1, v8, LpT3;->s:Landroid/graphics/Path;

    iget-object v2, v8, LRS0;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    mul-float v24, v24, v33

    add-float v23, v23, v24

    :goto_15
    add-int/lit8 v1, v31, 0x1

    move-object/from16 v9, p2

    move v4, v10

    move-object v3, v11

    move-object v7, v13

    move v2, v15

    move/from16 v6, v26

    move/from16 v14, v27

    move-object/from16 v13, v30

    move/from16 v10, v32

    move/from16 v11, v33

    move-object/from16 v15, v34

    const/4 v5, 0x1

    goto/16 :goto_5

    :cond_1a
    move-object v13, v7

    invoke-static {v13}, LPE2;->f(LPE2;)V

    return-void
.end method

.method public k(Landroid/graphics/Canvas;Ljava/lang/String;FF)V
    .locals 1

    iget-object v0, p0, LpT3;->l:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, p4, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public l(Landroid/graphics/Canvas;)V
    .locals 7

    iget-object p1, p0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/PieChart;->y0()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LpT3;->r:Landroid/graphics/Canvas;

    if-eqz p1, :cond_2

    iget-object p1, p0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/PieChart;->f0()F

    move-result p1

    iget-object v0, p0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/PieChart;->u0()F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    mul-float/2addr v0, p1

    iget-object v2, p0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/PieChart;->o0()LPE2;

    move-result-object v2

    iget-object v3, p0, LpT3;->h:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getColor()I

    move-result v3

    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    if-lez v3, :cond_0

    iget-object v3, p0, LpT3;->r:Landroid/graphics/Canvas;

    iget v4, v2, LPE2;->c:F

    iget v5, v2, LPE2;->d:F

    iget-object v6, p0, LpT3;->h:Landroid/graphics/Paint;

    invoke-virtual {v3, v4, v5, v0, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_0
    iget-object v3, p0, LpT3;->i:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getColor()I

    move-result v3

    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    if-lez v3, :cond_1

    iget-object v3, p0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/PieChart;->v0()F

    move-result v3

    iget-object v4, p0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/PieChart;->u0()F

    move-result v4

    cmpl-float v3, v3, v4

    if-lez v3, :cond_1

    iget-object v3, p0, LpT3;->i:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getAlpha()I

    move-result v3

    iget-object v4, p0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/PieChart;->v0()F

    move-result v4

    div-float/2addr v4, v1

    mul-float/2addr p1, v4

    iget-object v1, p0, LpT3;->i:Landroid/graphics/Paint;

    int-to-float v4, v3

    iget-object v5, p0, LRS0;->b:Lhi0;

    invoke-virtual {v5}, Lhi0;->a()F

    move-result v5

    mul-float/2addr v4, v5

    iget-object v5, p0, LRS0;->b:Lhi0;

    invoke-virtual {v5}, Lhi0;->b()F

    move-result v5

    mul-float/2addr v4, v5

    float-to-int v4, v4

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v1, p0, LpT3;->u:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    iget-object v1, p0, LpT3;->u:Landroid/graphics/Path;

    iget v4, v2, LPE2;->c:F

    iget v5, v2, LPE2;->d:F

    sget-object v6, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v1, v4, v5, p1, v6}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    iget-object p1, p0, LpT3;->u:Landroid/graphics/Path;

    iget v1, v2, LPE2;->c:F

    iget v4, v2, LPE2;->d:F

    sget-object v5, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    invoke-virtual {p1, v1, v4, v0, v5}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    iget-object p1, p0, LpT3;->r:Landroid/graphics/Canvas;

    iget-object v0, p0, LpT3;->u:Landroid/graphics/Path;

    iget-object v1, p0, LpT3;->i:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object p1, p0, LpT3;->i:Landroid/graphics/Paint;

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    :cond_1
    invoke-static {v2}, LPE2;->f(LPE2;)V

    :cond_2
    return-void
.end method

.method public m(Landroid/graphics/Canvas;Ljava/lang/String;FFI)V
    .locals 1

    iget-object v0, p0, LRS0;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p5}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p5, p0, LRS0;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public n()Landroid/text/TextPaint;
    .locals 1

    iget-object v0, p0, LpT3;->k:Landroid/text/TextPaint;

    return-object v0
.end method

.method public o()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, LpT3;->l:Landroid/graphics/Paint;

    return-object v0
.end method

.method public p()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, LpT3;->h:Landroid/graphics/Paint;

    return-object v0
.end method

.method public q()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, LpT3;->i:Landroid/graphics/Paint;

    return-object v0
.end method

.method public r(LXO1;)F
    .locals 3

    invoke-interface {p1}, LXO1;->g()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, LXO1;->m0()F

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1}, LXO1;->m0()F

    move-result v0

    iget-object v1, p0, Lqx4;->a:LFs6;

    invoke-virtual {v1}, LFs6;->s()F

    move-result v1

    div-float/2addr v0, v1

    invoke-interface {p1}, LoO1;->Y()F

    move-result v1

    iget-object v2, p0, LpT3;->g:Lcom/github/mikephil/charting/charts/PieChart;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lii0;

    move-result-object v2

    check-cast v2, LqT3;

    invoke-virtual {v2}, LqT3;->u()F

    move-result v2

    div-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-interface {p1}, LXO1;->m0()F

    move-result p1

    :goto_0
    return p1
.end method

.method public s()V
    .locals 2

    iget-object v0, p0, LpT3;->r:Landroid/graphics/Canvas;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    iput-object v1, p0, LpT3;->r:Landroid/graphics/Canvas;

    :cond_0
    iget-object v0, p0, LpT3;->q:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1
    iget-object v0, p0, LpT3;->q:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    iput-object v1, p0, LpT3;->q:Ljava/lang/ref/WeakReference;

    :cond_2
    return-void
.end method
