.class public LdI6;
.super LbI6;
.source "SourceFile"


# instance fields
.field public r:Lcom/github/mikephil/charting/charts/RadarChart;

.field public s:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(LFs6;LaI6;Lcom/github/mikephil/charting/charts/RadarChart;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LbI6;-><init>(LFs6;LaI6;LD96;)V

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, LdI6;->s:Landroid/graphics/Path;

    iput-object p3, p0, LdI6;->r:Lcom/github/mikephil/charting/charts/RadarChart;

    return-void
.end method


# virtual methods
.method public b(FF)V
    .locals 15

    move-object v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    iget-object v3, v0, LYu;->b:LXu;

    invoke-virtual {v3}, LXu;->s()I

    move-result v3

    sub-float v4, v2, v1

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    float-to-double v4, v4

    if-eqz v3, :cond_11

    const-wide/16 v7, 0x0

    cmpg-double v9, v4, v7

    if-lez v9, :cond_11

    invoke-static {v4, v5}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v9

    if-eqz v9, :cond_0

    goto/16 :goto_7

    :cond_0
    int-to-double v9, v3

    div-double v9, v4, v9

    invoke-static {v9, v10}, LOi6;->y(D)F

    move-result v9

    float-to-double v9, v9

    iget-object v11, v0, LYu;->b:LXu;

    invoke-virtual {v11}, LXu;->D()Z

    move-result v11

    if-eqz v11, :cond_1

    iget-object v11, v0, LYu;->b:LXu;

    invoke-virtual {v11}, LXu;->o()F

    move-result v11

    float-to-double v11, v11

    cmpg-double v11, v9, v11

    if-gez v11, :cond_1

    iget-object v9, v0, LYu;->b:LXu;

    invoke-virtual {v9}, LXu;->o()F

    move-result v9

    float-to-double v9, v9

    :cond_1
    invoke-static {v9, v10}, Ljava/lang/Math;->log10(D)D

    move-result-wide v11

    double-to-int v11, v11

    int-to-double v11, v11

    const-wide/high16 v13, 0x4024000000000000L    # 10.0

    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v11

    invoke-static {v11, v12}, LOi6;->y(D)F

    move-result v11

    float-to-double v11, v11

    div-double v6, v9, v11

    double-to-int v6, v6

    const/4 v7, 0x5

    if-le v6, v7, :cond_2

    mul-double/2addr v11, v13

    invoke-static {v11, v12}, Ljava/lang/Math;->floor(D)D

    move-result-wide v9

    :cond_2
    iget-object v6, v0, LYu;->b:LXu;

    invoke-virtual {v6}, LXu;->w()Z

    move-result v6

    iget-object v7, v0, LYu;->b:LXu;

    invoke-virtual {v7}, LXu;->C()Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_4

    double-to-float v2, v4

    add-int/lit8 v4, v3, -0x1

    int-to-float v4, v4

    div-float/2addr v2, v4

    iget-object v4, v0, LYu;->b:LXu;

    iput v3, v4, LXu;->n:I

    iget-object v5, v4, LXu;->l:[F

    array-length v5, v5

    if-ge v5, v3, :cond_3

    new-array v5, v3, [F

    iput-object v5, v4, LXu;->l:[F

    :cond_3
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_d

    iget-object v5, v0, LYu;->b:LXu;

    iget-object v5, v5, LXu;->l:[F

    aput v1, v5, v4

    add-float/2addr v1, v2

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    const-wide/16 v3, 0x0

    cmpl-double v5, v9, v3

    if-nez v5, :cond_5

    const-wide/16 v3, 0x0

    goto :goto_1

    :cond_5
    float-to-double v3, v1

    div-double/2addr v3, v9

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    mul-double/2addr v3, v9

    :goto_1
    if-eqz v6, :cond_6

    sub-double/2addr v3, v9

    :cond_6
    if-nez v5, :cond_7

    const-wide/16 v1, 0x0

    goto :goto_2

    :cond_7
    float-to-double v1, v2

    div-double/2addr v1, v9

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    mul-double/2addr v1, v9

    invoke-static {v1, v2}, LOi6;->w(D)D

    move-result-wide v1

    :goto_2
    if-eqz v5, :cond_8

    move-wide v11, v3

    move v5, v6

    :goto_3
    cmpg-double v7, v11, v1

    if-gtz v7, :cond_9

    add-int/lit8 v5, v5, 0x1

    add-double/2addr v11, v9

    goto :goto_3

    :cond_8
    move v5, v6

    :cond_9
    add-int/lit8 v1, v5, 0x1

    iget-object v2, v0, LYu;->b:LXu;

    iput v1, v2, LXu;->n:I

    iget-object v5, v2, LXu;->l:[F

    array-length v5, v5

    if-ge v5, v1, :cond_a

    new-array v5, v1, [F

    iput-object v5, v2, LXu;->l:[F

    :cond_a
    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_c

    const-wide/16 v11, 0x0

    cmpl-double v5, v3, v11

    if-nez v5, :cond_b

    move-wide v3, v11

    :cond_b
    iget-object v5, v0, LYu;->b:LXu;

    iget-object v5, v5, LXu;->l:[F

    double-to-float v7, v3

    aput v7, v5, v2

    add-double/2addr v3, v9

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_c
    move v3, v1

    :cond_d
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    cmpg-double v1, v9, v1

    if-gez v1, :cond_e

    iget-object v1, v0, LYu;->b:LXu;

    invoke-static {v9, v10}, Ljava/lang/Math;->log10(D)D

    move-result-wide v4

    neg-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v2, v4

    iput v2, v1, LXu;->o:I

    goto :goto_5

    :cond_e
    iget-object v1, v0, LYu;->b:LXu;

    const/4 v2, 0x0

    iput v2, v1, LXu;->o:I

    :goto_5
    if-eqz v6, :cond_10

    iget-object v1, v0, LYu;->b:LXu;

    iget-object v2, v1, LXu;->m:[F

    array-length v2, v2

    if-ge v2, v3, :cond_f

    new-array v2, v3, [F

    iput-object v2, v1, LXu;->m:[F

    :cond_f
    iget-object v1, v1, LXu;->l:[F

    aget v2, v1, v8

    const/4 v4, 0x0

    aget v1, v1, v4

    sub-float/2addr v2, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v2, v1

    const/4 v1, 0x0

    :goto_6
    if-ge v1, v3, :cond_10

    iget-object v4, v0, LYu;->b:LXu;

    iget-object v5, v4, LXu;->m:[F

    iget-object v4, v4, LXu;->l:[F

    aget v4, v4, v1

    add-float/2addr v4, v2

    aput v4, v5, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_10
    iget-object v1, v0, LYu;->b:LXu;

    iget-object v2, v1, LXu;->l:[F

    const/4 v4, 0x0

    aget v4, v2, v4

    iput v4, v1, LXu;->H:F

    sub-int/2addr v3, v8

    aget v2, v2, v3

    iput v2, v1, LXu;->G:F

    sub-float/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    iput v2, v1, LXu;->I:F

    return-void

    :cond_11
    :goto_7
    iget-object v1, v0, LYu;->b:LXu;

    const/4 v2, 0x0

    new-array v3, v2, [F

    iput-object v3, v1, LXu;->l:[F

    new-array v3, v2, [F

    iput-object v3, v1, LXu;->m:[F

    iput v2, v1, LXu;->n:I

    return-void
.end method

.method public i(Landroid/graphics/Canvas;)V
    .locals 9

    iget-object v0, p0, LbI6;->h:LaI6;

    invoke-virtual {v0}, LNs0;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LbI6;->h:LaI6;

    invoke-virtual {v0}, LXu;->A()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, LYu;->e:Landroid/graphics/Paint;

    iget-object v1, p0, LbI6;->h:LaI6;

    invoke-virtual {v1}, LNs0;->c()Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object v0, p0, LYu;->e:Landroid/graphics/Paint;

    iget-object v1, p0, LbI6;->h:LaI6;

    invoke-virtual {v1}, LNs0;->b()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v0, p0, LYu;->e:Landroid/graphics/Paint;

    iget-object v1, p0, LbI6;->h:LaI6;

    invoke-virtual {v1}, LNs0;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, LdI6;->r:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->z()LPE2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v1}, LPE2;->c(FF)LPE2;

    move-result-object v1

    iget-object v2, p0, LdI6;->r:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/RadarChart;->l0()F

    move-result v2

    iget-object v3, p0, LbI6;->h:LaI6;

    invoke-virtual {v3}, LaI6;->Z()Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    iget-object v4, p0, LbI6;->h:LaI6;

    invoke-virtual {v4}, LaI6;->a0()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, LbI6;->h:LaI6;

    iget v4, v4, LXu;->n:I

    goto :goto_0

    :cond_1
    iget-object v4, p0, LbI6;->h:LaI6;

    iget v4, v4, LXu;->n:I

    add-int/lit8 v4, v4, -0x1

    :goto_0
    if-ge v3, v4, :cond_2

    iget-object v5, p0, LbI6;->h:LaI6;

    iget-object v6, v5, LXu;->l:[F

    aget v6, v6, v3

    iget v5, v5, LXu;->H:F

    sub-float/2addr v6, v5

    mul-float/2addr v6, v2

    iget-object v5, p0, LdI6;->r:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v5}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->j0()F

    move-result v5

    invoke-static {v0, v6, v5, v1}, LOi6;->r(LPE2;FFLPE2;)V

    iget-object v5, p0, LbI6;->h:LaI6;

    invoke-virtual {v5, v3}, LXu;->n(I)Ljava/lang/String;

    move-result-object v5

    iget v6, v1, LPE2;->c:F

    const/high16 v7, 0x41200000    # 10.0f

    add-float/2addr v6, v7

    iget v7, v1, LPE2;->d:F

    iget-object v8, p0, LYu;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v6, v7, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v0}, LPE2;->f(LPE2;)V

    invoke-static {v1}, LPE2;->f(LPE2;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public l(Landroid/graphics/Canvas;)V
    .locals 12

    iget-object v0, p0, LbI6;->h:LaI6;

    invoke-virtual {v0}, LXu;->t()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LdI6;->r:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/RadarChart;->n0()F

    move-result v1

    iget-object v2, p0, LdI6;->r:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/RadarChart;->l0()F

    move-result v2

    iget-object v3, p0, LdI6;->r:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/Chart;->z()LPE2;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4, v4}, LPE2;->c(FF)LPE2;

    move-result-object v4

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_4

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lar2;

    invoke-virtual {v7}, LNs0;->f()Z

    move-result v8

    if-nez v8, :cond_1

    goto :goto_3

    :cond_1
    iget-object v8, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {v7}, Lar2;->n()I

    move-result v9

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v8, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {v7}, Lar2;->j()Landroid/graphics/DashPathEffect;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    iget-object v8, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {v7}, Lar2;->o()F

    move-result v9

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {v7}, Lar2;->m()F

    move-result v7

    iget-object v8, p0, LdI6;->r:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v8}, Lcom/github/mikephil/charting/charts/RadarChart;->g()F

    move-result v8

    sub-float/2addr v7, v8

    mul-float/2addr v7, v2

    iget-object v8, p0, LdI6;->s:Landroid/graphics/Path;

    invoke-virtual {v8}, Landroid/graphics/Path;->reset()V

    move v9, v5

    :goto_1
    iget-object v10, p0, LdI6;->r:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v10}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lii0;

    move-result-object v10

    check-cast v10, LPm4;

    invoke-virtual {v10}, Lii0;->k()LoO1;

    move-result-object v10

    check-cast v10, LbP1;

    invoke-interface {v10}, LoO1;->L0()I

    move-result v10

    if-ge v9, v10, :cond_3

    int-to-float v10, v9

    mul-float/2addr v10, v1

    iget-object v11, p0, LdI6;->r:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v11}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->j0()F

    move-result v11

    add-float/2addr v10, v11

    invoke-static {v3, v7, v10, v4}, LOi6;->r(LPE2;FFLPE2;)V

    if-nez v9, :cond_2

    iget v10, v4, LPE2;->c:F

    iget v11, v4, LPE2;->d:F

    invoke-virtual {v8, v10, v11}, Landroid/graphics/Path;->moveTo(FF)V

    goto :goto_2

    :cond_2
    iget v10, v4, LPE2;->c:F

    iget v11, v4, LPE2;->d:F

    invoke-virtual {v8, v10, v11}, Landroid/graphics/Path;->lineTo(FF)V

    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v8}, Landroid/graphics/Path;->close()V

    iget-object v7, p0, LYu;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v8, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    invoke-static {v3}, LPE2;->f(LPE2;)V

    invoke-static {v4}, LPE2;->f(LPE2;)V

    return-void
.end method
