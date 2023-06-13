.class public Lmm5;
.super Lzr2;
.source "SourceFile"


# instance fields
.field public i:Lom5;

.field public j:[F


# direct methods
.method public constructor <init>(Lom5;Lhi0;LFs6;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lzr2;-><init>(Lhi0;LFs6;)V

    const/4 p2, 0x2

    new-array p2, p2, [F

    iput-object p2, p0, Lmm5;->j:[F

    iput-object p1, p0, Lmm5;->i:Lom5;

    return-void
.end method


# virtual methods
.method public b(Landroid/graphics/Canvas;)V
    .locals 3

    iget-object v0, p0, Lmm5;->i:Lom5;

    invoke-interface {v0}, Lom5;->b()Lnm5;

    move-result-object v0

    invoke-virtual {v0}, Lii0;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LeP1;

    invoke-interface {v1}, LoO1;->isVisible()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, p1, v1}, Lmm5;->k(Landroid/graphics/Canvas;LeP1;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method public d(Landroid/graphics/Canvas;[LOM1;)V
    .locals 9

    iget-object v0, p0, Lmm5;->i:Lom5;

    invoke-interface {v0}, Lom5;->b()Lnm5;

    move-result-object v0

    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, p2, v2

    invoke-virtual {v3}, LOM1;->d()I

    move-result v4

    invoke-virtual {v0, v4}, Lii0;->d(I)LoO1;

    move-result-object v4

    check-cast v4, LeP1;

    if-eqz v4, :cond_2

    invoke-interface {v4}, LoO1;->Q()Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, LOM1;->h()F

    move-result v5

    invoke-virtual {v3}, LOM1;->j()F

    move-result v6

    invoke-interface {v4, v5, v6}, LoO1;->p0(FF)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v5

    invoke-virtual {p0, v5, v4}, LAx;->h(Lcom/github/mikephil/charting/data/Entry;LYN1;)Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    iget-object v6, p0, Lmm5;->i:Lom5;

    invoke-interface {v4}, LoO1;->j0()LaI6$a;

    move-result-object v7

    invoke-interface {v6, v7}, Lyx;->d(LaI6$a;)LD96;

    move-result-object v6

    invoke-virtual {v5}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v7

    invoke-virtual {v5}, LAA;->c()F

    move-result v5

    iget-object v8, p0, LRS0;->b:Lhi0;

    invoke-virtual {v8}, Lhi0;->b()F

    move-result v8

    mul-float/2addr v5, v8

    invoke-virtual {v6, v7, v5}, LD96;->e(FF)LOE2;

    move-result-object v5

    iget-wide v6, v5, LOE2;->c:D

    double-to-float v6, v6

    iget-wide v7, v5, LOE2;->d:D

    double-to-float v7, v7

    invoke-virtual {v3, v6, v7}, LOM1;->m(FF)V

    iget-wide v6, v5, LOE2;->c:D

    double-to-float v3, v6

    iget-wide v5, v5, LOE2;->d:D

    double-to-float v5, v5

    invoke-virtual {p0, p1, v3, v5, v4}, Lzr2;->j(Landroid/graphics/Canvas;FFLOO1;)V

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public e(Landroid/graphics/Canvas;)V
    .locals 25

    move-object/from16 v6, p0

    iget-object v0, v6, Lmm5;->i:Lom5;

    invoke-virtual {v6, v0}, LRS0;->g(Lki0;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, v6, Lmm5;->i:Lom5;

    invoke-interface {v0}, Lom5;->b()Lnm5;

    move-result-object v0

    invoke-virtual {v0}, Lii0;->f()Ljava/util/List;

    move-result-object v7

    const/4 v8, 0x0

    move v9, v8

    :goto_0
    iget-object v0, v6, Lmm5;->i:Lom5;

    invoke-interface {v0}, Lom5;->b()Lnm5;

    move-result-object v0

    invoke-virtual {v0}, Lii0;->e()I

    move-result v0

    if-ge v9, v0, :cond_8

    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LeP1;

    invoke-virtual {v6, v5}, LAx;->i(LoO1;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v5}, LoO1;->L0()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto/16 :goto_6

    :cond_0
    invoke-virtual {v6, v5}, LRS0;->a(LoO1;)V

    iget-object v0, v6, LAx;->g:LAx$a;

    iget-object v1, v6, Lmm5;->i:Lom5;

    invoke-virtual {v0, v1, v5}, LAx$a;->a(Lyx;LYN1;)V

    iget-object v0, v6, Lmm5;->i:Lom5;

    invoke-interface {v5}, LoO1;->j0()LaI6$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lyx;->d(LaI6$a;)LD96;

    move-result-object v10

    iget-object v0, v6, LRS0;->b:Lhi0;

    invoke-virtual {v0}, Lhi0;->a()F

    move-result v12

    iget-object v0, v6, LRS0;->b:Lhi0;

    invoke-virtual {v0}, Lhi0;->b()F

    move-result v13

    iget-object v0, v6, LAx;->g:LAx$a;

    iget v14, v0, LAx$a;->a:I

    iget v15, v0, LAx$a;->b:I

    move-object v11, v5

    invoke-virtual/range {v10 .. v15}, LD96;->d(LeP1;FFII)[F

    move-result-object v10

    invoke-interface {v5}, LeP1;->l()F

    move-result v0

    invoke-static {v0}, LOi6;->e(F)F

    move-result v11

    invoke-interface {v5}, LoO1;->b0()LJj6;

    move-result-object v12

    invoke-interface {v5}, LoO1;->M0()LPE2;

    move-result-object v0

    invoke-static {v0}, LPE2;->d(LPE2;)LPE2;

    move-result-object v13

    iget v0, v13, LPE2;->c:F

    invoke-static {v0}, LOi6;->e(F)F

    move-result v0

    iput v0, v13, LPE2;->c:F

    iget v0, v13, LPE2;->d:F

    invoke-static {v0}, LOi6;->e(F)F

    move-result v0

    iput v0, v13, LPE2;->d:F

    move v14, v8

    :goto_1
    array-length v0, v10

    if-ge v14, v0, :cond_6

    iget-object v0, v6, Lqx4;->a:LFs6;

    aget v1, v10, v14

    invoke-virtual {v0, v1}, LFs6;->A(F)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_5

    :cond_1
    iget-object v0, v6, Lqx4;->a:LFs6;

    aget v1, v10, v14

    invoke-virtual {v0, v1}, LFs6;->z(F)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, v6, Lqx4;->a:LFs6;

    add-int/lit8 v15, v14, 0x1

    aget v1, v10, v15

    invoke-virtual {v0, v1}, LFs6;->D(F)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    div-int/lit8 v0, v14, 0x2

    iget-object v1, v6, LAx;->g:LAx$a;

    iget v1, v1, LAx$a;->a:I

    add-int/2addr v1, v0

    invoke-interface {v5, v1}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v4

    invoke-interface {v5}, LoO1;->i0()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v12, v4}, LJj6;->h(Lcom/github/mikephil/charting/data/Entry;)Ljava/lang/String;

    move-result-object v2

    aget v3, v10, v14

    aget v1, v10, v15

    sub-float v16, v1, v11

    iget-object v1, v6, LAx;->g:LAx$a;

    iget v1, v1, LAx$a;->a:I

    add-int/2addr v0, v1

    invoke-interface {v5, v0}, LoO1;->m(I)I

    move-result v17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v18, v4

    move/from16 v4, v16

    move-object/from16 v16, v5

    move/from16 v5, v17

    invoke-virtual/range {v0 .. v5}, Lmm5;->l(Landroid/graphics/Canvas;Ljava/lang/String;FFI)V

    goto :goto_2

    :cond_3
    move-object/from16 v18, v4

    move-object/from16 v16, v5

    :goto_2
    invoke-virtual/range {v18 .. v18}, LAA;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface/range {v16 .. v16}, LoO1;->D()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual/range {v18 .. v18}, LAA;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v20

    aget v0, v10, v14

    iget v1, v13, LPE2;->c:F

    add-float/2addr v0, v1

    float-to-int v0, v0

    aget v1, v10, v15

    iget v2, v13, LPE2;->d:F

    add-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual/range {v20 .. v20}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v23

    invoke-virtual/range {v20 .. v20}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v24

    move-object/from16 v19, p1

    move/from16 v21, v0

    move/from16 v22, v1

    invoke-static/range {v19 .. v24}, LOi6;->f(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;IIII)V

    goto :goto_4

    :cond_4
    :goto_3
    move-object/from16 v16, v5

    :cond_5
    :goto_4
    add-int/lit8 v14, v14, 0x2

    move-object/from16 v5, v16

    goto/16 :goto_1

    :cond_6
    :goto_5
    invoke-static {v13}, LPE2;->f(LPE2;)V

    :cond_7
    :goto_6
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    :cond_8
    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public k(Landroid/graphics/Canvas;LeP1;)V
    .locals 1

    invoke-interface {p2}, LoO1;->L0()I

    move-result p1

    const/4 v0, 0x1

    if-ge p1, v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lmm5;->i:Lom5;

    invoke-interface {p2}, LoO1;->j0()LaI6$a;

    move-result-object v0

    invoke-interface {p1, v0}, Lyx;->d(LaI6$a;)LD96;

    iget-object p1, p0, LRS0;->b:Lhi0;

    invoke-virtual {p1}, Lhi0;->b()F

    invoke-interface {p2}, LeP1;->J()LfP1;

    const-string p1, "MISSING"

    const-string p2, "There\'s no IShapeRenderer specified for ScatterDataSet"

    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public l(Landroid/graphics/Canvas;Ljava/lang/String;FFI)V
    .locals 1

    iget-object v0, p0, LRS0;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p5}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p5, p0, LRS0;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method
