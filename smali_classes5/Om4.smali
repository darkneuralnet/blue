.class public LOm4;
.super Lxr2;
.source "SourceFile"


# instance fields
.field public i:Lcom/github/mikephil/charting/charts/RadarChart;

.field public j:Landroid/graphics/Paint;

.field public k:Landroid/graphics/Paint;

.field public l:Landroid/graphics/Path;

.field public m:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Lcom/github/mikephil/charting/charts/RadarChart;Lhi0;LFs6;)V
    .locals 2

    invoke-direct {p0, p2, p3}, Lxr2;-><init>(Lhi0;LFs6;)V

    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    iput-object p2, p0, LOm4;->l:Landroid/graphics/Path;

    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    iput-object p2, p0, LOm4;->m:Landroid/graphics/Path;

    iput-object p1, p0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, LRS0;->d:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, LRS0;->d:Landroid/graphics/Paint;

    const/high16 p3, 0x40000000    # 2.0f

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p1, p0, LRS0;->d:Landroid/graphics/Paint;

    const/16 p3, 0xbb

    const/16 v0, 0x73

    const/16 v1, 0xff

    invoke-static {v1, p3, v0}, Landroid/graphics/Color;->rgb(III)I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, LOm4;->j:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, LOm4;->k:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method public b(Landroid/graphics/Canvas;)V
    .locals 4

    iget-object v0, p0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lii0;

    move-result-object v0

    check-cast v0, LPm4;

    invoke-virtual {v0}, Lii0;->k()LoO1;

    move-result-object v1

    check-cast v1, LbP1;

    invoke-interface {v1}, LoO1;->L0()I

    move-result v1

    invoke-virtual {v0}, Lii0;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LbP1;

    invoke-interface {v2}, LoO1;->isVisible()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, p1, v2, v1}, LOm4;->n(Landroid/graphics/Canvas;LbP1;I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c(Landroid/graphics/Canvas;)V
    .locals 0

    invoke-virtual {p0, p1}, LOm4;->q(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public d(Landroid/graphics/Canvas;[LOM1;)V
    .locals 19

    move-object/from16 v8, p0

    move-object/from16 v9, p2

    iget-object v0, v8, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/RadarChart;->n0()F

    move-result v10

    iget-object v0, v8, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/RadarChart;->l0()F

    move-result v11

    iget-object v0, v8, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->z()LPE2;

    move-result-object v12

    const/4 v0, 0x0

    invoke-static {v0, v0}, LPE2;->c(FF)LPE2;

    move-result-object v13

    iget-object v0, v8, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lii0;

    move-result-object v0

    move-object v14, v0

    check-cast v14, LPm4;

    array-length v15, v9

    const/4 v7, 0x0

    move v6, v7

    :goto_0
    if-ge v6, v15, :cond_5

    aget-object v0, v9, v6

    invoke-virtual {v0}, LOM1;->d()I

    move-result v1

    invoke-virtual {v14, v1}, Lii0;->d(I)LoO1;

    move-result-object v1

    check-cast v1, LbP1;

    if-eqz v1, :cond_4

    invoke-interface {v1}, LoO1;->Q()Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v0}, LOM1;->h()F

    move-result v2

    float-to-int v2, v2

    invoke-interface {v1, v2}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v2

    check-cast v2, Lcom/github/mikephil/charting/data/RadarEntry;

    invoke-virtual {v8, v2, v1}, LAx;->h(Lcom/github/mikephil/charting/data/Entry;LYN1;)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_1

    :cond_1
    invoke-virtual {v2}, LAA;->c()F

    move-result v2

    iget-object v3, v8, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/RadarChart;->g()F

    move-result v3

    sub-float/2addr v2, v3

    mul-float/2addr v2, v11

    iget-object v3, v8, LRS0;->b:Lhi0;

    invoke-virtual {v3}, Lhi0;->b()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-virtual {v0}, LOM1;->h()F

    move-result v3

    mul-float/2addr v3, v10

    iget-object v4, v8, LRS0;->b:Lhi0;

    invoke-virtual {v4}, Lhi0;->a()F

    move-result v4

    mul-float/2addr v3, v4

    iget-object v4, v8, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->j0()F

    move-result v4

    add-float/2addr v3, v4

    invoke-static {v12, v2, v3, v13}, LOi6;->r(LPE2;FFLPE2;)V

    iget v2, v13, LPE2;->c:F

    iget v3, v13, LPE2;->d:F

    invoke-virtual {v0, v2, v3}, LOM1;->m(FF)V

    iget v0, v13, LPE2;->c:F

    iget v2, v13, LPE2;->d:F

    move-object/from16 v5, p1

    invoke-virtual {v8, v5, v0, v2, v1}, Lzr2;->j(Landroid/graphics/Canvas;FFLOO1;)V

    invoke-interface {v1}, LbP1;->q0()Z

    move-result v0

    if-eqz v0, :cond_4

    iget v0, v13, LPE2;->c:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_4

    iget v0, v13, LPE2;->d:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-interface {v1}, LbP1;->V()I

    move-result v0

    const v2, 0x112233

    if-ne v0, v2, :cond_2

    invoke-interface {v1, v7}, LoO1;->A0(I)I

    move-result v0

    :cond_2
    invoke-interface {v1}, LbP1;->z()I

    move-result v2

    const/16 v3, 0xff

    if-ge v2, v3, :cond_3

    invoke-interface {v1}, LbP1;->z()I

    move-result v2

    invoke-static {v0, v2}, LIm0;->a(II)I

    move-result v0

    :cond_3
    move/from16 v16, v0

    invoke-interface {v1}, LbP1;->n0()F

    move-result v3

    invoke-interface {v1}, LbP1;->Z()F

    move-result v4

    invoke-interface {v1}, LbP1;->a()I

    move-result v17

    invoke-interface {v1}, LbP1;->k0()F

    move-result v18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v13

    move/from16 v5, v17

    move/from16 v17, v6

    move/from16 v6, v16

    move/from16 v16, v7

    move/from16 v7, v18

    invoke-virtual/range {v0 .. v7}, LOm4;->o(Landroid/graphics/Canvas;LPE2;FFIIF)V

    goto :goto_2

    :cond_4
    :goto_1
    move/from16 v17, v6

    move/from16 v16, v7

    :goto_2
    add-int/lit8 v6, v17, 0x1

    move/from16 v7, v16

    goto/16 :goto_0

    :cond_5
    invoke-static {v12}, LPE2;->f(LPE2;)V

    invoke-static {v13}, LPE2;->f(LPE2;)V

    return-void
.end method

.method public e(Landroid/graphics/Canvas;)V
    .locals 29

    move-object/from16 v6, p0

    iget-object v0, v6, LRS0;->b:Lhi0;

    invoke-virtual {v0}, Lhi0;->a()F

    move-result v7

    iget-object v0, v6, LRS0;->b:Lhi0;

    invoke-virtual {v0}, Lhi0;->b()F

    move-result v8

    iget-object v0, v6, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/RadarChart;->n0()F

    move-result v9

    iget-object v0, v6, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/RadarChart;->l0()F

    move-result v10

    iget-object v0, v6, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->z()LPE2;

    move-result-object v11

    const/4 v0, 0x0

    invoke-static {v0, v0}, LPE2;->c(FF)LPE2;

    move-result-object v12

    invoke-static {v0, v0}, LPE2;->c(FF)LPE2;

    move-result-object v13

    const/high16 v0, 0x40a00000    # 5.0f

    invoke-static {v0}, LOi6;->e(F)F

    move-result v14

    const/4 v5, 0x0

    :goto_0
    iget-object v0, v6, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lii0;

    move-result-object v0

    check-cast v0, LPm4;

    invoke-virtual {v0}, Lii0;->e()I

    move-result v0

    if-ge v5, v0, :cond_4

    iget-object v0, v6, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lii0;

    move-result-object v0

    check-cast v0, LPm4;

    invoke-virtual {v0, v5}, Lii0;->d(I)LoO1;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LbP1;

    invoke-virtual {v6, v4}, LAx;->i(LoO1;)Z

    move-result v0

    if-nez v0, :cond_0

    move/from16 v19, v5

    move/from16 v22, v7

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v6, v4}, LRS0;->a(LoO1;)V

    invoke-interface {v4}, LoO1;->b0()LJj6;

    move-result-object v3

    invoke-interface {v4}, LoO1;->M0()LPE2;

    move-result-object v0

    invoke-static {v0}, LPE2;->d(LPE2;)LPE2;

    move-result-object v2

    iget v0, v2, LPE2;->c:F

    invoke-static {v0}, LOi6;->e(F)F

    move-result v0

    iput v0, v2, LPE2;->c:F

    iget v0, v2, LPE2;->d:F

    invoke-static {v0}, LOi6;->e(F)F

    move-result v0

    iput v0, v2, LPE2;->d:F

    const/4 v1, 0x0

    :goto_1
    invoke-interface {v4}, LoO1;->L0()I

    move-result v0

    if-ge v1, v0, :cond_3

    invoke-interface {v4, v1}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/data/RadarEntry;

    invoke-virtual {v0}, LAA;->c()F

    move-result v16

    iget-object v15, v6, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v15}, Lcom/github/mikephil/charting/charts/RadarChart;->g()F

    move-result v15

    sub-float v16, v16, v15

    mul-float v16, v16, v10

    mul-float v15, v16, v8

    move-object/from16 v16, v2

    int-to-float v2, v1

    mul-float/2addr v2, v9

    mul-float v17, v2, v7

    iget-object v2, v6, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->j0()F

    move-result v2

    add-float v2, v17, v2

    invoke-static {v11, v15, v2, v12}, LOi6;->r(LPE2;FFLPE2;)V

    invoke-interface {v4}, LoO1;->i0()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v3, v0}, LJj6;->i(Lcom/github/mikephil/charting/data/RadarEntry;)Ljava/lang/String;

    move-result-object v2

    iget v15, v12, LPE2;->c:F

    move-object/from16 v18, v0

    iget v0, v12, LPE2;->d:F

    sub-float v19, v0, v14

    invoke-interface {v4, v1}, LoO1;->m(I)I

    move-result v20

    move-object/from16 v0, p0

    move/from16 v21, v1

    move-object/from16 v1, p1

    move/from16 v22, v7

    move-object/from16 v7, v16

    move-object/from16 v16, v3

    move v3, v15

    move-object v15, v4

    move/from16 v4, v19

    move/from16 v19, v5

    move/from16 v5, v20

    invoke-virtual/range {v0 .. v5}, LOm4;->p(Landroid/graphics/Canvas;Ljava/lang/String;FFI)V

    goto :goto_2

    :cond_1
    move-object/from16 v18, v0

    move/from16 v21, v1

    move-object v15, v4

    move/from16 v19, v5

    move/from16 v22, v7

    move-object/from16 v7, v16

    move-object/from16 v16, v3

    :goto_2
    invoke-virtual/range {v18 .. v18}, LAA;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v15}, LoO1;->D()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual/range {v18 .. v18}, LAA;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v24

    invoke-virtual/range {v18 .. v18}, LAA;->c()F

    move-result v0

    mul-float/2addr v0, v10

    mul-float/2addr v0, v8

    iget v1, v7, LPE2;->d:F

    add-float/2addr v0, v1

    iget-object v1, v6, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->j0()F

    move-result v1

    add-float v1, v17, v1

    invoke-static {v11, v0, v1, v13}, LOi6;->r(LPE2;FFLPE2;)V

    iget v0, v13, LPE2;->d:F

    iget v1, v7, LPE2;->c:F

    add-float/2addr v0, v1

    iput v0, v13, LPE2;->d:F

    iget v1, v13, LPE2;->c:F

    float-to-int v1, v1

    float-to-int v0, v0

    invoke-virtual/range {v24 .. v24}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v27

    invoke-virtual/range {v24 .. v24}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v28

    move-object/from16 v23, p1

    move/from16 v25, v1

    move/from16 v26, v0

    invoke-static/range {v23 .. v28}, LOi6;->f(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;IIII)V

    :cond_2
    add-int/lit8 v1, v21, 0x1

    move-object v2, v7

    move-object v4, v15

    move-object/from16 v3, v16

    move/from16 v5, v19

    move/from16 v7, v22

    goto/16 :goto_1

    :cond_3
    move/from16 v19, v5

    move/from16 v22, v7

    move-object v7, v2

    invoke-static {v7}, LPE2;->f(LPE2;)V

    :goto_3
    add-int/lit8 v5, v19, 0x1

    move/from16 v7, v22

    goto/16 :goto_0

    :cond_4
    invoke-static {v11}, LPE2;->f(LPE2;)V

    invoke-static {v12}, LPE2;->f(LPE2;)V

    invoke-static {v13}, LPE2;->f(LPE2;)V

    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public n(Landroid/graphics/Canvas;LbP1;I)V
    .locals 12

    iget-object v0, p0, LRS0;->b:Lhi0;

    invoke-virtual {v0}, Lhi0;->a()F

    move-result v0

    iget-object v1, p0, LRS0;->b:Lhi0;

    invoke-virtual {v1}, Lhi0;->b()F

    move-result v1

    iget-object v2, p0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/RadarChart;->n0()F

    move-result v2

    iget-object v3, p0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/RadarChart;->l0()F

    move-result v3

    iget-object v4, p0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/Chart;->z()LPE2;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v5, v5}, LPE2;->c(FF)LPE2;

    move-result-object v5

    iget-object v6, p0, LOm4;->l:Landroid/graphics/Path;

    invoke-virtual {v6}, Landroid/graphics/Path;->reset()V

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    invoke-interface {p2}, LoO1;->L0()I

    move-result v9

    if-ge v7, v9, :cond_2

    iget-object v9, p0, LRS0;->c:Landroid/graphics/Paint;

    invoke-interface {p2, v7}, LoO1;->A0(I)I

    move-result v10

    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setColor(I)V

    invoke-interface {p2, v7}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v9

    check-cast v9, Lcom/github/mikephil/charting/data/RadarEntry;

    invoke-virtual {v9}, LAA;->c()F

    move-result v9

    iget-object v10, p0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v10}, Lcom/github/mikephil/charting/charts/RadarChart;->g()F

    move-result v10

    sub-float/2addr v9, v10

    mul-float/2addr v9, v3

    mul-float/2addr v9, v1

    int-to-float v10, v7

    mul-float/2addr v10, v2

    mul-float/2addr v10, v0

    iget-object v11, p0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v11}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->j0()F

    move-result v11

    add-float/2addr v10, v11

    invoke-static {v4, v9, v10, v5}, LOi6;->r(LPE2;FFLPE2;)V

    iget v9, v5, LPE2;->c:F

    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_1

    :cond_0
    if-nez v8, :cond_1

    iget v8, v5, LPE2;->c:F

    iget v9, v5, LPE2;->d:F

    invoke-virtual {v6, v8, v9}, Landroid/graphics/Path;->moveTo(FF)V

    const/4 v8, 0x1

    goto :goto_1

    :cond_1
    iget v9, v5, LPE2;->c:F

    iget v10, v5, LPE2;->d:F

    invoke-virtual {v6, v9, v10}, Landroid/graphics/Path;->lineTo(FF)V

    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {p2}, LoO1;->L0()I

    move-result v0

    if-le v0, p3, :cond_3

    iget p3, v4, LPE2;->c:F

    iget v0, v4, LPE2;->d:F

    invoke-virtual {v6, p3, v0}, Landroid/graphics/Path;->lineTo(FF)V

    :cond_3
    invoke-virtual {v6}, Landroid/graphics/Path;->close()V

    invoke-interface {p2}, LNO1;->x0()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p2}, LNO1;->f()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    if-eqz p3, :cond_4

    invoke-virtual {p0, p1, v6, p3}, Lxr2;->m(Landroid/graphics/Canvas;Landroid/graphics/Path;Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    :cond_4
    invoke-interface {p2}, LNO1;->y()I

    move-result p3

    invoke-interface {p2}, LNO1;->T()I

    move-result v0

    invoke-virtual {p0, p1, v6, p3, v0}, Lxr2;->l(Landroid/graphics/Canvas;Landroid/graphics/Path;II)V

    :cond_5
    :goto_2
    iget-object p3, p0, LRS0;->c:Landroid/graphics/Paint;

    invoke-interface {p2}, LNO1;->W()F

    move-result v0

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p3, p0, LRS0;->c:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-interface {p2}, LNO1;->x0()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-interface {p2}, LNO1;->T()I

    move-result p2

    const/16 p3, 0xff

    if-ge p2, p3, :cond_7

    :cond_6
    iget-object p2, p0, LRS0;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v6, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_7
    invoke-static {v4}, LPE2;->f(LPE2;)V

    invoke-static {v5}, LPE2;->f(LPE2;)V

    return-void
.end method

.method public o(Landroid/graphics/Canvas;LPE2;FFIIF)V
    .locals 5

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-static {p4}, LOi6;->e(F)F

    move-result p4

    invoke-static {p3}, LOi6;->e(F)F

    move-result p3

    const v0, 0x112233

    if-eq p5, v0, :cond_1

    iget-object v1, p0, LOm4;->m:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    iget v2, p2, LPE2;->c:F

    iget v3, p2, LPE2;->d:F

    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v1, v2, v3, p4, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    const/4 v2, 0x0

    cmpl-float v2, p3, v2

    if-lez v2, :cond_0

    iget v2, p2, LPE2;->c:F

    iget v3, p2, LPE2;->d:F

    sget-object v4, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    invoke-virtual {v1, v2, v3, p3, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    :cond_0
    iget-object p3, p0, LOm4;->k:Landroid/graphics/Paint;

    invoke-virtual {p3, p5}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p3, p0, LOm4;->k:Landroid/graphics/Paint;

    sget-object p5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, p5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p3, p0, LOm4;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_1
    if-eq p6, v0, :cond_2

    iget-object p3, p0, LOm4;->k:Landroid/graphics/Paint;

    invoke-virtual {p3, p6}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p3, p0, LOm4;->k:Landroid/graphics/Paint;

    sget-object p5, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, p5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p3, p0, LOm4;->k:Landroid/graphics/Paint;

    invoke-static {p7}, LOi6;->e(F)F

    move-result p5

    invoke-virtual {p3, p5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget p3, p2, LPE2;->c:F

    iget p2, p2, LPE2;->d:F

    iget-object p5, p0, LOm4;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, p3, p2, p4, p5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public p(Landroid/graphics/Canvas;Ljava/lang/String;FFI)V
    .locals 1

    iget-object v0, p0, LRS0;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p5}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p5, p0, LRS0;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public q(Landroid/graphics/Canvas;)V
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/RadarChart;->n0()F

    move-result v1

    iget-object v2, v0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/RadarChart;->l0()F

    move-result v2

    iget-object v3, v0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->j0()F

    move-result v3

    iget-object v4, v0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/Chart;->z()LPE2;

    move-result-object v4

    iget-object v5, v0, LOm4;->j:Landroid/graphics/Paint;

    iget-object v6, v0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v6}, Lcom/github/mikephil/charting/charts/RadarChart;->r0()F

    move-result v6

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v5, v0, LOm4;->j:Landroid/graphics/Paint;

    iget-object v6, v0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v6}, Lcom/github/mikephil/charting/charts/RadarChart;->p0()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v5, v0, LOm4;->j:Landroid/graphics/Paint;

    iget-object v6, v0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v6}, Lcom/github/mikephil/charting/charts/RadarChart;->o0()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v5, v0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v5}, Lcom/github/mikephil/charting/charts/RadarChart;->m0()I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    iget-object v6, v0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v6}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lii0;

    move-result-object v6

    check-cast v6, LPm4;

    invoke-virtual {v6}, Lii0;->k()LoO1;

    move-result-object v6

    check-cast v6, LbP1;

    invoke-interface {v6}, LoO1;->L0()I

    move-result v6

    const/4 v7, 0x0

    invoke-static {v7, v7}, LPE2;->c(FF)LPE2;

    move-result-object v8

    const/4 v9, 0x0

    move v10, v9

    :goto_0
    if-ge v10, v6, :cond_0

    iget-object v11, v0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v11}, Lcom/github/mikephil/charting/charts/RadarChart;->u0()F

    move-result v11

    mul-float/2addr v11, v2

    int-to-float v12, v10

    mul-float/2addr v12, v1

    add-float/2addr v12, v3

    invoke-static {v4, v11, v12, v8}, LOi6;->r(LPE2;FFLPE2;)V

    iget v14, v4, LPE2;->c:F

    iget v15, v4, LPE2;->d:F

    iget v11, v8, LPE2;->c:F

    iget v12, v8, LPE2;->d:F

    iget-object v13, v0, LOm4;->j:Landroid/graphics/Paint;

    move-object/from16 v18, v13

    move-object/from16 v13, p1

    move/from16 v16, v11

    move/from16 v17, v12

    invoke-virtual/range {v13 .. v18}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/2addr v10, v5

    goto :goto_0

    :cond_0
    invoke-static {v8}, LPE2;->f(LPE2;)V

    iget-object v5, v0, LOm4;->j:Landroid/graphics/Paint;

    iget-object v6, v0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v6}, Lcom/github/mikephil/charting/charts/RadarChart;->s0()F

    move-result v6

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v5, v0, LOm4;->j:Landroid/graphics/Paint;

    iget-object v6, v0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v6}, Lcom/github/mikephil/charting/charts/RadarChart;->q0()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v5, v0, LOm4;->j:Landroid/graphics/Paint;

    iget-object v6, v0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v6}, Lcom/github/mikephil/charting/charts/RadarChart;->o0()I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v5, v0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v5}, Lcom/github/mikephil/charting/charts/RadarChart;->t0()LaI6;

    move-result-object v5

    iget v5, v5, LXu;->n:I

    invoke-static {v7, v7}, LPE2;->c(FF)LPE2;

    move-result-object v6

    invoke-static {v7, v7}, LPE2;->c(FF)LPE2;

    move-result-object v7

    move v8, v9

    :goto_1
    if-ge v8, v5, :cond_2

    move v10, v9

    :goto_2
    iget-object v11, v0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v11}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lii0;

    move-result-object v11

    check-cast v11, LPm4;

    invoke-virtual {v11}, Lii0;->g()I

    move-result v11

    if-ge v10, v11, :cond_1

    iget-object v11, v0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v11}, Lcom/github/mikephil/charting/charts/RadarChart;->t0()LaI6;

    move-result-object v11

    iget-object v11, v11, LXu;->l:[F

    aget v11, v11, v8

    iget-object v12, v0, LOm4;->i:Lcom/github/mikephil/charting/charts/RadarChart;

    invoke-virtual {v12}, Lcom/github/mikephil/charting/charts/RadarChart;->g()F

    move-result v12

    sub-float/2addr v11, v12

    mul-float/2addr v11, v2

    int-to-float v12, v10

    mul-float/2addr v12, v1

    add-float/2addr v12, v3

    invoke-static {v4, v11, v12, v6}, LOi6;->r(LPE2;FFLPE2;)V

    add-int/lit8 v10, v10, 0x1

    int-to-float v12, v10

    mul-float/2addr v12, v1

    add-float/2addr v12, v3

    invoke-static {v4, v11, v12, v7}, LOi6;->r(LPE2;FFLPE2;)V

    iget v14, v6, LPE2;->c:F

    iget v15, v6, LPE2;->d:F

    iget v11, v7, LPE2;->c:F

    iget v12, v7, LPE2;->d:F

    iget-object v13, v0, LOm4;->j:Landroid/graphics/Paint;

    move-object/from16 v18, v13

    move-object/from16 v13, p1

    move/from16 v16, v11

    move/from16 v17, v12

    invoke-virtual/range {v13 .. v18}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_2

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    invoke-static {v6}, LPE2;->f(LPE2;)V

    invoke-static {v7}, LPE2;->f(LPE2;)V

    return-void
.end method
