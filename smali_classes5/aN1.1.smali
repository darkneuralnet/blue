.class public LaN1;
.super Lrx;
.source "SourceFile"


# instance fields
.field public n:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Ltx;Lhi0;LFs6;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lrx;-><init>(Ltx;Lhi0;LFs6;)V

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, LaN1;->n:Landroid/graphics/RectF;

    iget-object p1, p0, LRS0;->f:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    return-void
.end method


# virtual methods
.method public e(Landroid/graphics/Canvas;)V
    .locals 40

    move-object/from16 v6, p0

    iget-object v0, v6, Lrx;->h:Ltx;

    invoke-virtual {v6, v0}, LaN1;->g(Lki0;)Z

    move-result v0

    if-eqz v0, :cond_2a

    iget-object v0, v6, Lrx;->h:Ltx;

    invoke-interface {v0}, Ltx;->q()Lsx;

    move-result-object v0

    invoke-virtual {v0}, Lii0;->f()Ljava/util/List;

    move-result-object v7

    const/high16 v0, 0x40a00000    # 5.0f

    invoke-static {v0}, LOi6;->e(F)F

    move-result v8

    iget-object v0, v6, Lrx;->h:Ltx;

    invoke-interface {v0}, Ltx;->e()Z

    move-result v9

    const/4 v11, 0x0

    :goto_0
    iget-object v0, v6, Lrx;->h:Ltx;

    invoke-interface {v0}, Ltx;->q()Lsx;

    move-result-object v0

    invoke-virtual {v0}, Lii0;->e()I

    move-result v0

    if-ge v11, v0, :cond_2a

    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, LXN1;

    invoke-virtual {v6, v12}, LAx;->i(LoO1;)Z

    move-result v0

    if-nez v0, :cond_0

    move-object/from16 v20, v7

    move/from16 v23, v11

    goto/16 :goto_1d

    :cond_0
    iget-object v0, v6, Lrx;->h:Ltx;

    invoke-interface {v12}, LoO1;->j0()LaI6$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lyx;->p(LaI6$a;)Z

    move-result v13

    invoke-virtual {v6, v12}, LRS0;->a(LoO1;)V

    iget-object v0, v6, LRS0;->f:Landroid/graphics/Paint;

    const-string v1, "10"

    invoke-static {v0, v1}, LOi6;->a(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v14, 0x40000000    # 2.0f

    div-float v15, v0, v14

    invoke-interface {v12}, LoO1;->b0()LJj6;

    move-result-object v5

    iget-object v0, v6, Lrx;->j:[Lqx;

    aget-object v4, v0, v11

    iget-object v0, v6, LRS0;->b:Lhi0;

    invoke-virtual {v0}, Lhi0;->b()F

    move-result v16

    invoke-interface {v12}, LoO1;->M0()LPE2;

    move-result-object v0

    invoke-static {v0}, LPE2;->d(LPE2;)LPE2;

    move-result-object v3

    iget v0, v3, LPE2;->c:F

    invoke-static {v0}, LOi6;->e(F)F

    move-result v0

    iput v0, v3, LPE2;->c:F

    iget v0, v3, LPE2;->d:F

    invoke-static {v0}, LOi6;->e(F)F

    move-result v0

    iput v0, v3, LPE2;->d:F

    invoke-interface {v12}, LXN1;->M()Z

    move-result v0

    const/16 v17, 0x0

    if-nez v0, :cond_c

    const/4 v2, 0x0

    :goto_1
    int-to-float v0, v2

    iget-object v1, v4, Li0;->b:[F

    array-length v1, v1

    int-to-float v1, v1

    iget-object v10, v6, LRS0;->b:Lhi0;

    invoke-virtual {v10}, Lhi0;->a()F

    move-result v10

    mul-float/2addr v1, v10

    cmpg-float v0, v0, v1

    if-gez v0, :cond_b

    iget-object v0, v4, Li0;->b:[F

    add-int/lit8 v1, v2, 0x1

    aget v10, v0, v1

    add-int/lit8 v16, v2, 0x3

    aget v0, v0, v16

    add-float/2addr v0, v10

    div-float v16, v0, v14

    iget-object v0, v6, Lqx4;->a:LFs6;

    invoke-virtual {v0, v10}, LFs6;->B(F)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_9

    :cond_1
    iget-object v0, v6, Lqx4;->a:LFs6;

    iget-object v10, v4, Li0;->b:[F

    aget v10, v10, v2

    invoke-virtual {v0, v10}, LFs6;->C(F)Z

    move-result v0

    if-nez v0, :cond_2

    :goto_2
    move/from16 v25, v2

    move-object v14, v4

    move-object/from16 v20, v7

    move/from16 v23, v11

    move-object v7, v3

    move-object v11, v5

    goto/16 :goto_8

    :cond_2
    iget-object v0, v6, Lqx4;->a:LFs6;

    iget-object v10, v4, Li0;->b:[F

    aget v1, v10, v1

    invoke-virtual {v0, v1}, LFs6;->y(F)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    div-int/lit8 v0, v2, 0x4

    invoke-interface {v12, v0}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/github/mikephil/charting/data/BarEntry;

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/BarEntry;->c()F

    move-result v18

    invoke-virtual {v5, v10}, LJj6;->b(Lcom/github/mikephil/charting/data/BarEntry;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v6, LRS0;->f:Landroid/graphics/Paint;

    invoke-static {v0, v1}, LOi6;->d(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    if-eqz v9, :cond_4

    move v14, v8

    goto :goto_3

    :cond_4
    add-float v14, v0, v8

    neg-float v14, v14

    :goto_3
    move-object/from16 v20, v1

    if-eqz v9, :cond_5

    add-float v1, v0, v8

    neg-float v1, v1

    goto :goto_4

    :cond_5
    move v1, v8

    :goto_4
    if-eqz v13, :cond_6

    neg-float v14, v14

    sub-float/2addr v14, v0

    neg-float v1, v1

    sub-float/2addr v1, v0

    :cond_6
    move/from16 v21, v14

    move v14, v1

    invoke-interface {v12}, LoO1;->i0()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, v4, Li0;->b:[F

    add-int/lit8 v1, v2, 0x2

    aget v0, v0, v1

    cmpl-float v1, v18, v17

    if-ltz v1, :cond_7

    move/from16 v1, v21

    goto :goto_5

    :cond_7
    move v1, v14

    :goto_5
    add-float v22, v0, v1

    add-float v23, v16, v15

    div-int/lit8 v0, v2, 0x2

    invoke-interface {v12, v0}, LoO1;->m(I)I

    move-result v24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v25, v2

    move-object/from16 v2, v20

    move-object/from16 v20, v7

    move-object v7, v3

    move/from16 v3, v22

    move/from16 v22, v14

    move-object v14, v4

    move/from16 v4, v23

    move/from16 v23, v11

    move-object v11, v5

    move/from16 v5, v24

    invoke-virtual/range {v0 .. v5}, LaN1;->k(Landroid/graphics/Canvas;Ljava/lang/String;FFI)V

    goto :goto_6

    :cond_8
    move/from16 v25, v2

    move-object/from16 v20, v7

    move/from16 v23, v11

    move/from16 v22, v14

    move-object v7, v3

    move-object v14, v4

    move-object v11, v5

    :goto_6
    invoke-virtual {v10}, LAA;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-interface {v12}, LoO1;->D()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v10}, LAA;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v27

    iget-object v0, v14, Li0;->b:[F

    add-int/lit8 v2, v25, 0x2

    aget v0, v0, v2

    cmpl-float v1, v18, v17

    if-ltz v1, :cond_9

    goto :goto_7

    :cond_9
    move/from16 v21, v22

    :goto_7
    add-float v0, v0, v21

    iget v1, v7, LPE2;->c:F

    add-float/2addr v0, v1

    iget v1, v7, LPE2;->d:F

    add-float v1, v16, v1

    float-to-int v0, v0

    float-to-int v1, v1

    invoke-virtual/range {v27 .. v27}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v30

    invoke-virtual/range {v27 .. v27}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v31

    move-object/from16 v26, p1

    move/from16 v28, v0

    move/from16 v29, v1

    invoke-static/range {v26 .. v31}, LOi6;->f(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;IIII)V

    :cond_a
    :goto_8
    add-int/lit8 v2, v25, 0x4

    move-object v3, v7

    move-object v5, v11

    move-object v4, v14

    move-object/from16 v7, v20

    move/from16 v11, v23

    const/high16 v14, 0x40000000    # 2.0f

    goto/16 :goto_1

    :cond_b
    :goto_9
    move-object/from16 v20, v7

    move/from16 v23, v11

    move-object v7, v3

    goto/16 :goto_1c

    :cond_c
    move-object v14, v4

    move-object/from16 v20, v7

    move/from16 v23, v11

    move-object v7, v3

    move-object v11, v5

    iget-object v0, v6, Lrx;->h:Ltx;

    invoke-interface {v12}, LoO1;->j0()LaI6$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lyx;->d(LaI6$a;)LD96;

    move-result-object v10

    const/4 v5, 0x0

    const/16 v18, 0x0

    :goto_a
    int-to-float v0, v5

    invoke-interface {v12}, LoO1;->L0()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, v6, LRS0;->b:Lhi0;

    invoke-virtual {v2}, Lhi0;->a()F

    move-result v2

    mul-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_29

    invoke-interface {v12, v5}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/github/mikephil/charting/data/BarEntry;

    invoke-interface {v12, v5}, LoO1;->m(I)I

    move-result v21

    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/BarEntry;->k()[F

    move-result-object v3

    if-nez v3, :cond_16

    iget-object v0, v6, Lqx4;->a:LFs6;

    iget-object v1, v14, Li0;->b:[F

    add-int/lit8 v22, v18, 0x1

    aget v1, v1, v22

    invoke-virtual {v0, v1}, LFs6;->B(F)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_1c

    :cond_d
    iget-object v0, v6, Lqx4;->a:LFs6;

    iget-object v1, v14, Li0;->b:[F

    aget v1, v1, v18

    invoke-virtual {v0, v1}, LFs6;->C(F)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_a

    :cond_e
    iget-object v0, v6, Lqx4;->a:LFs6;

    iget-object v1, v14, Li0;->b:[F

    aget v1, v1, v22

    invoke-virtual {v0, v1}, LFs6;->y(F)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_a

    :cond_f
    invoke-virtual {v11, v4}, LJj6;->b(Lcom/github/mikephil/charting/data/BarEntry;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, v6, LRS0;->f:Landroid/graphics/Paint;

    invoke-static {v0, v2}, LOi6;->d(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    if-eqz v9, :cond_10

    move v1, v8

    goto :goto_b

    :cond_10
    add-float v1, v0, v8

    neg-float v1, v1

    :goto_b
    move-object/from16 v24, v3

    if-eqz v9, :cond_11

    add-float v3, v0, v8

    neg-float v3, v3

    goto :goto_c

    :cond_11
    move v3, v8

    :goto_c
    if-eqz v13, :cond_12

    neg-float v1, v1

    sub-float/2addr v1, v0

    neg-float v3, v3

    sub-float/2addr v3, v0

    :cond_12
    move/from16 v25, v1

    move/from16 v26, v3

    invoke-interface {v12}, LoO1;->i0()Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, v14, Li0;->b:[F

    add-int/lit8 v1, v18, 0x2

    aget v0, v0, v1

    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/BarEntry;->c()F

    move-result v1

    cmpl-float v1, v1, v17

    if-ltz v1, :cond_13

    move/from16 v1, v25

    goto :goto_d

    :cond_13
    move/from16 v1, v26

    :goto_d
    add-float v3, v0, v1

    iget-object v0, v14, Li0;->b:[F

    aget v0, v0, v22

    add-float v27, v0, v15

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v28, v15

    move-object/from16 v15, v24

    move-object/from16 v24, v4

    move/from16 v4, v27

    move/from16 v27, v5

    move/from16 v5, v21

    invoke-virtual/range {v0 .. v5}, LaN1;->k(Landroid/graphics/Canvas;Ljava/lang/String;FFI)V

    goto :goto_e

    :cond_14
    move/from16 v27, v5

    move/from16 v28, v15

    move-object/from16 v15, v24

    move-object/from16 v24, v4

    :goto_e
    invoke-virtual/range {v24 .. v24}, LAA;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_27

    invoke-interface {v12}, LoO1;->D()Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-virtual/range {v24 .. v24}, LAA;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v30

    iget-object v0, v14, Li0;->b:[F

    add-int/lit8 v1, v18, 0x2

    aget v0, v0, v1

    invoke-virtual/range {v24 .. v24}, Lcom/github/mikephil/charting/data/BarEntry;->c()F

    move-result v1

    cmpl-float v1, v1, v17

    if-ltz v1, :cond_15

    goto :goto_f

    :cond_15
    move/from16 v25, v26

    :goto_f
    add-float v0, v0, v25

    iget-object v1, v14, Li0;->b:[F

    aget v1, v1, v22

    iget v2, v7, LPE2;->c:F

    add-float/2addr v0, v2

    iget v2, v7, LPE2;->d:F

    add-float/2addr v1, v2

    float-to-int v0, v0

    float-to-int v1, v1

    invoke-virtual/range {v30 .. v30}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v33

    invoke-virtual/range {v30 .. v30}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v34

    move-object/from16 v29, p1

    move/from16 v31, v0

    move/from16 v32, v1

    invoke-static/range {v29 .. v34}, LOi6;->f(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;IIII)V

    goto/16 :goto_19

    :cond_16
    move-object/from16 v24, v4

    move/from16 v27, v5

    move/from16 v28, v15

    move-object v15, v3

    array-length v0, v15

    mul-int/lit8 v5, v0, 0x2

    new-array v4, v5, [F

    invoke-virtual/range {v24 .. v24}, Lcom/github/mikephil/charting/data/BarEntry;->h()F

    move-result v0

    neg-float v0, v0

    move/from16 v22, v0

    move/from16 v25, v17

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_10
    if-ge v0, v5, :cond_1a

    aget v2, v15, v1

    cmpl-float v3, v2, v17

    if-nez v3, :cond_18

    cmpl-float v26, v25, v17

    if-eqz v26, :cond_17

    cmpl-float v26, v22, v17

    if-nez v26, :cond_18

    :cond_17
    move/from16 v39, v22

    move/from16 v22, v2

    move/from16 v2, v39

    goto :goto_11

    :cond_18
    if-ltz v3, :cond_19

    add-float v25, v25, v2

    move/from16 v2, v22

    move/from16 v22, v25

    goto :goto_11

    :cond_19
    sub-float v2, v22, v2

    :goto_11
    mul-float v22, v22, v16

    aput v22, v4, v0

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v1, v1, 0x1

    move/from16 v22, v2

    goto :goto_10

    :cond_1a
    invoke-virtual {v10, v4}, LD96;->k([F)V

    const/4 v3, 0x0

    :goto_12
    if-ge v3, v5, :cond_27

    div-int/lit8 v0, v3, 0x2

    aget v0, v15, v0

    move-object/from16 v2, v24

    invoke-virtual {v11, v0, v2}, LJj6;->c(FLcom/github/mikephil/charting/data/BarEntry;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v6, LRS0;->f:Landroid/graphics/Paint;

    invoke-static {v2, v1}, LOi6;->d(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v2

    int-to-float v2, v2

    move-object/from16 v26, v1

    if-eqz v9, :cond_1b

    move v1, v8

    goto :goto_13

    :cond_1b
    add-float v1, v2, v8

    neg-float v1, v1

    :goto_13
    move/from16 v29, v5

    if-eqz v9, :cond_1c

    add-float v5, v2, v8

    neg-float v5, v5

    goto :goto_14

    :cond_1c
    move v5, v8

    :goto_14
    if-eqz v13, :cond_1d

    neg-float v1, v1

    sub-float/2addr v1, v2

    neg-float v5, v5

    sub-float/2addr v5, v2

    :cond_1d
    cmpl-float v2, v0, v17

    if-nez v2, :cond_1e

    cmpl-float v2, v22, v17

    if-nez v2, :cond_1e

    cmpl-float v2, v25, v17

    if-gtz v2, :cond_1f

    :cond_1e
    cmpg-float v0, v0, v17

    if-gez v0, :cond_20

    :cond_1f
    const/4 v0, 0x1

    goto :goto_15

    :cond_20
    const/4 v0, 0x0

    :goto_15
    aget v2, v4, v3

    if-eqz v0, :cond_21

    move v1, v5

    :cond_21
    add-float v5, v2, v1

    iget-object v0, v14, Li0;->b:[F

    add-int/lit8 v1, v18, 0x1

    aget v1, v0, v1

    add-int/lit8 v2, v18, 0x3

    aget v0, v0, v2

    add-float/2addr v1, v0

    const/high16 v19, 0x40000000    # 2.0f

    div-float v2, v1, v19

    iget-object v0, v6, Lqx4;->a:LFs6;

    invoke-virtual {v0, v2}, LFs6;->B(F)Z

    move-result v0

    if-nez v0, :cond_22

    goto/16 :goto_1a

    :cond_22
    iget-object v0, v6, Lqx4;->a:LFs6;

    invoke-virtual {v0, v5}, LFs6;->C(F)Z

    move-result v0

    if-nez v0, :cond_23

    :goto_16
    move/from16 v26, v3

    move-object/from16 v32, v4

    goto :goto_18

    :cond_23
    iget-object v0, v6, Lqx4;->a:LFs6;

    invoke-virtual {v0, v2}, LFs6;->y(F)Z

    move-result v0

    if-nez v0, :cond_24

    goto :goto_16

    :cond_24
    invoke-interface {v12}, LoO1;->i0()Z

    move-result v0

    if-eqz v0, :cond_25

    add-float v30, v2, v28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v31, v2

    move-object/from16 v2, v26

    move/from16 v26, v3

    move v3, v5

    move-object/from16 v32, v4

    move/from16 v4, v30

    move/from16 v30, v5

    move/from16 v5, v21

    invoke-virtual/range {v0 .. v5}, LaN1;->k(Landroid/graphics/Canvas;Ljava/lang/String;FFI)V

    goto :goto_17

    :cond_25
    move/from16 v31, v2

    move/from16 v26, v3

    move-object/from16 v32, v4

    move/from16 v30, v5

    :goto_17
    invoke-virtual/range {v24 .. v24}, LAA;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_26

    invoke-interface {v12}, LoO1;->D()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-virtual/range {v24 .. v24}, LAA;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v34

    iget v0, v7, LPE2;->c:F

    add-float v5, v30, v0

    float-to-int v0, v5

    iget v1, v7, LPE2;->d:F

    add-float v2, v31, v1

    float-to-int v1, v2

    invoke-virtual/range {v34 .. v34}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v37

    invoke-virtual/range {v34 .. v34}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v38

    move-object/from16 v33, p1

    move/from16 v35, v0

    move/from16 v36, v1

    invoke-static/range {v33 .. v38}, LOi6;->f(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;IIII)V

    :cond_26
    :goto_18
    add-int/lit8 v3, v26, 0x2

    move/from16 v5, v29

    move-object/from16 v4, v32

    goto/16 :goto_12

    :cond_27
    :goto_19
    const/high16 v19, 0x40000000    # 2.0f

    :goto_1a
    if-nez v15, :cond_28

    add-int/lit8 v18, v18, 0x4

    goto :goto_1b

    :cond_28
    array-length v0, v15

    mul-int/lit8 v0, v0, 0x4

    add-int v18, v18, v0

    :goto_1b
    add-int/lit8 v5, v27, 0x1

    move/from16 v15, v28

    goto/16 :goto_a

    :cond_29
    :goto_1c
    invoke-static {v7}, LPE2;->f(LPE2;)V

    :goto_1d
    add-int/lit8 v11, v23, 0x1

    move-object/from16 v7, v20

    goto/16 :goto_0

    :cond_2a
    return-void
.end method

.method public f()V
    .locals 7

    iget-object v0, p0, Lrx;->h:Ltx;

    invoke-interface {v0}, Ltx;->q()Lsx;

    move-result-object v0

    invoke-virtual {v0}, Lii0;->e()I

    move-result v1

    new-array v1, v1, [LZM1;

    iput-object v1, p0, Lrx;->j:[Lqx;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lrx;->j:[Lqx;

    array-length v2, v2

    if-ge v1, v2, :cond_1

    invoke-virtual {v0, v1}, Lii0;->d(I)LoO1;

    move-result-object v2

    check-cast v2, LXN1;

    iget-object v3, p0, Lrx;->j:[Lqx;

    new-instance v4, LZM1;

    invoke-interface {v2}, LoO1;->L0()I

    move-result v5

    mul-int/lit8 v5, v5, 0x4

    invoke-interface {v2}, LXN1;->M()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v2}, LXN1;->n()I

    move-result v6

    goto :goto_1

    :cond_0
    const/4 v6, 0x1

    :goto_1
    mul-int/2addr v5, v6

    invoke-virtual {v0}, Lii0;->e()I

    move-result v6

    invoke-interface {v2}, LXN1;->M()Z

    move-result v2

    invoke-direct {v4, v5, v6, v2}, LZM1;-><init>(IIZ)V

    aput-object v4, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public g(Lki0;)Z
    .locals 2

    invoke-interface {p1}, Lki0;->getData()Lii0;

    move-result-object v0

    invoke-virtual {v0}, Lii0;->g()I

    move-result v0

    int-to-float v0, v0

    invoke-interface {p1}, Lki0;->i()I

    move-result p1

    int-to-float p1, p1

    iget-object v1, p0, Lqx4;->a:LFs6;

    invoke-virtual {v1}, LFs6;->r()F

    move-result v1

    mul-float/2addr p1, v1

    cmpg-float p1, v0, p1

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public j(Landroid/graphics/Canvas;LXN1;I)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    iget-object v3, v0, Lrx;->h:Ltx;

    invoke-interface/range {p2 .. p2}, LoO1;->j0()LaI6$a;

    move-result-object v4

    invoke-interface {v3, v4}, Lyx;->d(LaI6$a;)LD96;

    move-result-object v3

    iget-object v4, v0, Lrx;->l:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, LXN1;->X()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v4, v0, Lrx;->l:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, LXN1;->E()F

    move-result v5

    invoke-static {v5}, LOi6;->e(F)F

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-interface/range {p2 .. p2}, LXN1;->E()F

    move-result v4

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-lez v4, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    iget-object v7, v0, LRS0;->b:Lhi0;

    invoke-virtual {v7}, Lhi0;->a()F

    move-result v7

    iget-object v8, v0, LRS0;->b:Lhi0;

    invoke-virtual {v8}, Lhi0;->b()F

    move-result v8

    iget-object v9, v0, Lrx;->h:Ltx;

    invoke-interface {v9}, Ltx;->m()Z

    move-result v9

    if-eqz v9, :cond_3

    iget-object v9, v0, Lrx;->k:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, LXN1;->B0()I

    move-result v10

    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v9, v0, Lrx;->h:Ltx;

    invoke-interface {v9}, Ltx;->q()Lsx;

    move-result-object v9

    invoke-virtual {v9}, Lsx;->s()F

    move-result v9

    const/high16 v10, 0x40000000    # 2.0f

    div-float/2addr v9, v10

    invoke-interface/range {p2 .. p2}, LoO1;->L0()I

    move-result v10

    int-to-float v10, v10

    mul-float/2addr v10, v7

    float-to-double v10, v10

    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-int v10, v10

    invoke-interface/range {p2 .. p2}, LoO1;->L0()I

    move-result v11

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v10

    move v11, v5

    :goto_1
    if-ge v11, v10, :cond_3

    invoke-interface {v1, v11}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v12

    check-cast v12, Lcom/github/mikephil/charting/data/BarEntry;

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v12

    iget-object v13, v0, LaN1;->n:Landroid/graphics/RectF;

    sub-float v14, v12, v9

    iput v14, v13, Landroid/graphics/RectF;->top:F

    add-float/2addr v12, v9

    iput v12, v13, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v3, v13}, LD96;->p(Landroid/graphics/RectF;)V

    iget-object v12, v0, Lqx4;->a:LFs6;

    iget-object v13, v0, LaN1;->n:Landroid/graphics/RectF;

    iget v13, v13, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v12, v13}, LFs6;->B(F)Z

    move-result v12

    if-nez v12, :cond_1

    move-object/from16 v15, p1

    goto :goto_2

    :cond_1
    iget-object v12, v0, Lqx4;->a:LFs6;

    iget-object v13, v0, LaN1;->n:Landroid/graphics/RectF;

    iget v13, v13, Landroid/graphics/RectF;->top:F

    invoke-virtual {v12, v13}, LFs6;->y(F)Z

    move-result v12

    if-nez v12, :cond_2

    goto :goto_3

    :cond_2
    iget-object v12, v0, LaN1;->n:Landroid/graphics/RectF;

    iget-object v13, v0, Lqx4;->a:LFs6;

    invoke-virtual {v13}, LFs6;->h()F

    move-result v13

    iput v13, v12, Landroid/graphics/RectF;->left:F

    iget-object v12, v0, LaN1;->n:Landroid/graphics/RectF;

    iget-object v13, v0, Lqx4;->a:LFs6;

    invoke-virtual {v13}, LFs6;->i()F

    move-result v13

    iput v13, v12, Landroid/graphics/RectF;->right:F

    iget-object v12, v0, LaN1;->n:Landroid/graphics/RectF;

    iget-object v13, v0, Lrx;->k:Landroid/graphics/Paint;

    move-object/from16 v15, p1

    invoke-virtual {v15, v12, v13}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :goto_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_3
    :goto_3
    move-object/from16 v15, p1

    iget-object v9, v0, Lrx;->j:[Lqx;

    aget-object v9, v9, v2

    invoke-virtual {v9, v7, v8}, Li0;->b(FF)V

    invoke-virtual {v9, v2}, Lqx;->g(I)V

    iget-object v2, v0, Lrx;->h:Ltx;

    invoke-interface/range {p2 .. p2}, LoO1;->j0()LaI6$a;

    move-result-object v7

    invoke-interface {v2, v7}, Lyx;->p(LaI6$a;)Z

    move-result v2

    invoke-virtual {v9, v2}, Lqx;->h(Z)V

    iget-object v2, v0, Lrx;->h:Ltx;

    invoke-interface {v2}, Ltx;->q()Lsx;

    move-result-object v2

    invoke-virtual {v2}, Lsx;->s()F

    move-result v2

    invoke-virtual {v9, v2}, Lqx;->f(F)V

    invoke-virtual {v9, v1}, Lqx;->e(LXN1;)V

    iget-object v2, v9, Li0;->b:[F

    invoke-virtual {v3, v2}, LD96;->k([F)V

    invoke-interface/range {p2 .. p2}, LoO1;->g0()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v6, :cond_4

    goto :goto_4

    :cond_4
    move v6, v5

    :goto_4
    if-eqz v6, :cond_5

    iget-object v2, v0, LRS0;->c:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, LoO1;->getColor()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    :cond_5
    :goto_5
    invoke-virtual {v9}, Li0;->c()I

    move-result v2

    if-ge v5, v2, :cond_a

    iget-object v2, v0, Lqx4;->a:LFs6;

    iget-object v3, v9, Li0;->b:[F

    add-int/lit8 v7, v5, 0x3

    aget v3, v3, v7

    invoke-virtual {v2, v3}, LFs6;->B(F)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_7

    :cond_6
    iget-object v2, v0, Lqx4;->a:LFs6;

    iget-object v3, v9, Li0;->b:[F

    add-int/lit8 v8, v5, 0x1

    aget v3, v3, v8

    invoke-virtual {v2, v3}, LFs6;->y(F)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_6

    :cond_7
    if-nez v6, :cond_8

    iget-object v2, v0, LRS0;->c:Landroid/graphics/Paint;

    div-int/lit8 v3, v5, 0x4

    invoke-interface {v1, v3}, LoO1;->A0(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    :cond_8
    iget-object v2, v9, Li0;->b:[F

    aget v3, v2, v5

    aget v16, v2, v8

    add-int/lit8 v10, v5, 0x2

    aget v17, v2, v10

    aget v18, v2, v7

    iget-object v2, v0, LRS0;->c:Landroid/graphics/Paint;

    move-object/from16 v14, p1

    move v15, v3

    move-object/from16 v19, v2

    invoke-virtual/range {v14 .. v19}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    if-eqz v4, :cond_9

    iget-object v2, v9, Li0;->b:[F

    aget v15, v2, v5

    aget v16, v2, v8

    aget v17, v2, v10

    aget v18, v2, v7

    iget-object v2, v0, Lrx;->l:Landroid/graphics/Paint;

    move-object/from16 v14, p1

    move-object/from16 v19, v2

    invoke-virtual/range {v14 .. v19}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_9
    :goto_6
    add-int/lit8 v5, v5, 0x4

    move-object/from16 v15, p1

    goto :goto_5

    :cond_a
    :goto_7
    return-void
.end method

.method public k(Landroid/graphics/Canvas;Ljava/lang/String;FFI)V
    .locals 1

    iget-object v0, p0, LRS0;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p5}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p5, p0, LRS0;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public l(FFFFLD96;)V
    .locals 1

    sub-float v0, p1, p4

    add-float/2addr p1, p4

    iget-object p4, p0, Lrx;->i:Landroid/graphics/RectF;

    invoke-virtual {p4, p2, v0, p3, p1}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object p1, p0, Lrx;->i:Landroid/graphics/RectF;

    iget-object p2, p0, LRS0;->b:Lhi0;

    invoke-virtual {p2}, Lhi0;->b()F

    move-result p2

    invoke-virtual {p5, p1, p2}, LD96;->o(Landroid/graphics/RectF;F)V

    return-void
.end method

.method public m(LOM1;Landroid/graphics/RectF;)V
    .locals 1

    invoke-virtual {p2}, Landroid/graphics/RectF;->centerY()F

    move-result v0

    iget p2, p2, Landroid/graphics/RectF;->right:F

    invoke-virtual {p1, v0, p2}, LOM1;->m(FF)V

    return-void
.end method
