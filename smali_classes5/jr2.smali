.class public Ljr2;
.super Lxr2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljr2$b;
    }
.end annotation


# instance fields
.field public i:Llr2;

.field public j:Landroid/graphics/Paint;

.field public k:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public l:Landroid/graphics/Canvas;

.field public m:Landroid/graphics/Bitmap$Config;

.field public n:Landroid/graphics/Path;

.field public o:Landroid/graphics/Path;

.field public p:[F

.field public q:Landroid/graphics/Path;

.field public r:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "LoO1;",
            "Ljr2$b;",
            ">;"
        }
    .end annotation
.end field

.field public s:[F


# direct methods
.method public constructor <init>(Llr2;Lhi0;LFs6;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lxr2;-><init>(Lhi0;LFs6;)V

    sget-object p2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object p2, p0, Ljr2;->m:Landroid/graphics/Bitmap$Config;

    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    iput-object p2, p0, Ljr2;->n:Landroid/graphics/Path;

    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    iput-object p2, p0, Ljr2;->o:Landroid/graphics/Path;

    const/4 p2, 0x4

    new-array p2, p2, [F

    iput-object p2, p0, Ljr2;->p:[F

    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    iput-object p2, p0, Ljr2;->q:Landroid/graphics/Path;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Ljr2;->r:Ljava/util/HashMap;

    const/4 p2, 0x2

    new-array p2, p2, [F

    iput-object p2, p0, Ljr2;->s:[F

    iput-object p1, p0, Ljr2;->i:Llr2;

    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Ljr2;->j:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Ljr2;->j:Landroid/graphics/Paint;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

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

    iget-object v2, p0, Ljr2;->k:Ljava/lang/ref/WeakReference;

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
    if-lez v0, :cond_5

    if-lez v1, :cond_5

    iget-object v2, p0, Ljr2;->m:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ljr2;->k:Ljava/lang/ref/WeakReference;

    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Ljr2;->l:Landroid/graphics/Canvas;

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/graphics/Bitmap;->eraseColor(I)V

    iget-object v0, p0, Ljr2;->i:Llr2;

    invoke-interface {v0}, Llr2;->k()Lkr2;

    move-result-object v0

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

    check-cast v1, LMO1;

    invoke-interface {v1}, LoO1;->isVisible()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p0, p1, v1}, Ljr2;->q(Landroid/graphics/Canvas;LMO1;)V

    goto :goto_1

    :cond_4
    iget-object v0, p0, LRS0;->c:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {p1, v2, v1, v1, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_5
    return-void
.end method

.method public c(Landroid/graphics/Canvas;)V
    .locals 0

    invoke-virtual {p0, p1}, Ljr2;->n(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public d(Landroid/graphics/Canvas;[LOM1;)V
    .locals 9

    iget-object v0, p0, Ljr2;->i:Llr2;

    invoke-interface {v0}, Llr2;->k()Lkr2;

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

    check-cast v4, LMO1;

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
    iget-object v6, p0, Ljr2;->i:Llr2;

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
    .locals 26

    move-object/from16 v6, p0

    iget-object v0, v6, Ljr2;->i:Llr2;

    invoke-virtual {v6, v0}, LRS0;->g(Lki0;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, v6, Ljr2;->i:Llr2;

    invoke-interface {v0}, Llr2;->k()Lkr2;

    move-result-object v0

    invoke-virtual {v0}, Lii0;->f()Ljava/util/List;

    move-result-object v7

    const/4 v8, 0x0

    move v9, v8

    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_9

    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LMO1;

    invoke-virtual {v6, v5}, LAx;->i(LoO1;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v5}, LoO1;->L0()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto/16 :goto_6

    :cond_0
    invoke-virtual {v6, v5}, LRS0;->a(LoO1;)V

    iget-object v0, v6, Ljr2;->i:Llr2;

    invoke-interface {v5}, LoO1;->j0()LaI6$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lyx;->d(LaI6$a;)LD96;

    move-result-object v10

    invoke-interface {v5}, LMO1;->w0()F

    move-result v0

    const/high16 v1, 0x3fe00000    # 1.75f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-interface {v5}, LMO1;->P()Z

    move-result v1

    if-nez v1, :cond_1

    div-int/lit8 v0, v0, 0x2

    :cond_1
    move v4, v0

    iget-object v0, v6, LAx;->g:LAx$a;

    iget-object v1, v6, Ljr2;->i:Llr2;

    invoke-virtual {v0, v1, v5}, LAx$a;->a(Lyx;LYN1;)V

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

    invoke-virtual/range {v10 .. v15}, LD96;->c(LMO1;FFII)[F

    move-result-object v10

    invoke-interface {v5}, LoO1;->b0()LJj6;

    move-result-object v11

    invoke-interface {v5}, LoO1;->M0()LPE2;

    move-result-object v0

    invoke-static {v0}, LPE2;->d(LPE2;)LPE2;

    move-result-object v12

    iget v0, v12, LPE2;->c:F

    invoke-static {v0}, LOi6;->e(F)F

    move-result v0

    iput v0, v12, LPE2;->c:F

    iget v0, v12, LPE2;->d:F

    invoke-static {v0}, LOi6;->e(F)F

    move-result v0

    iput v0, v12, LPE2;->d:F

    move v13, v8

    :goto_1
    array-length v0, v10

    if-ge v13, v0, :cond_7

    aget v14, v10, v13

    add-int/lit8 v0, v13, 0x1

    aget v15, v10, v0

    iget-object v0, v6, Lqx4;->a:LFs6;

    invoke-virtual {v0, v14}, LFs6;->A(F)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_5

    :cond_2
    iget-object v0, v6, Lqx4;->a:LFs6;

    invoke-virtual {v0, v14}, LFs6;->z(F)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, v6, Lqx4;->a:LFs6;

    invoke-virtual {v0, v15}, LFs6;->D(F)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    div-int/lit8 v0, v13, 0x2

    iget-object v1, v6, LAx;->g:LAx$a;

    iget v1, v1, LAx$a;->a:I

    add-int/2addr v1, v0

    invoke-interface {v5, v1}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v3

    invoke-interface {v5}, LoO1;->i0()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v11, v3}, LJj6;->h(Lcom/github/mikephil/charting/data/Entry;)Ljava/lang/String;

    move-result-object v2

    int-to-float v1, v4

    sub-float v16, v15, v1

    invoke-interface {v5, v0}, LoO1;->m(I)I

    move-result v17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v18, v3

    move v3, v14

    move/from16 v19, v4

    move/from16 v4, v16

    move-object/from16 v16, v5

    move/from16 v5, v17

    invoke-virtual/range {v0 .. v5}, Ljr2;->u(Landroid/graphics/Canvas;Ljava/lang/String;FFI)V

    goto :goto_2

    :cond_4
    move-object/from16 v18, v3

    move/from16 v19, v4

    move-object/from16 v16, v5

    :goto_2
    invoke-virtual/range {v18 .. v18}, LAA;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-interface/range {v16 .. v16}, LoO1;->D()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual/range {v18 .. v18}, LAA;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v21

    iget v0, v12, LPE2;->c:F

    add-float/2addr v14, v0

    float-to-int v0, v14

    iget v1, v12, LPE2;->d:F

    add-float/2addr v15, v1

    float-to-int v1, v15

    invoke-virtual/range {v21 .. v21}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v24

    invoke-virtual/range {v21 .. v21}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v25

    move-object/from16 v20, p1

    move/from16 v22, v0

    move/from16 v23, v1

    invoke-static/range {v20 .. v25}, LOi6;->f(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;IIII)V

    goto :goto_4

    :cond_5
    :goto_3
    move/from16 v19, v4

    move-object/from16 v16, v5

    :cond_6
    :goto_4
    add-int/lit8 v13, v13, 0x2

    move-object/from16 v5, v16

    move/from16 v4, v19

    goto/16 :goto_1

    :cond_7
    :goto_5
    invoke-static {v12}, LPE2;->f(LPE2;)V

    :cond_8
    :goto_6
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    :cond_9
    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public n(Landroid/graphics/Canvas;)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, LRS0;->c:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, v0, LRS0;->b:Lhi0;

    invoke-virtual {v1}, Lhi0;->b()F

    move-result v1

    iget-object v2, v0, Ljr2;->s:[F

    const/4 v3, 0x0

    const/4 v4, 0x0

    aput v4, v2, v3

    const/4 v5, 0x1

    aput v4, v2, v5

    iget-object v2, v0, Ljr2;->i:Llr2;

    invoke-interface {v2}, Llr2;->k()Lkr2;

    move-result-object v2

    invoke-virtual {v2}, Lii0;->f()Ljava/util/List;

    move-result-object v2

    move v6, v3

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_a

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LMO1;

    invoke-interface {v7}, LoO1;->isVisible()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v7}, LMO1;->P()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v7}, LoO1;->L0()I

    move-result v8

    if-nez v8, :cond_0

    goto/16 :goto_7

    :cond_0
    iget-object v8, v0, Ljr2;->j:Landroid/graphics/Paint;

    invoke-interface {v7}, LMO1;->e()I

    move-result v9

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v8, v0, Ljr2;->i:Llr2;

    invoke-interface {v7}, LoO1;->j0()LaI6$a;

    move-result-object v9

    invoke-interface {v8, v9}, Lyx;->d(LaI6$a;)LD96;

    move-result-object v8

    iget-object v9, v0, LAx;->g:LAx$a;

    iget-object v10, v0, Ljr2;->i:Llr2;

    invoke-virtual {v9, v10, v7}, LAx$a;->a(Lyx;LYN1;)V

    invoke-interface {v7}, LMO1;->w0()F

    move-result v9

    invoke-interface {v7}, LMO1;->R()F

    move-result v10

    invoke-interface {v7}, LMO1;->P0()Z

    move-result v11

    if-eqz v11, :cond_1

    cmpg-float v11, v10, v9

    if-gez v11, :cond_1

    cmpl-float v10, v10, v4

    if-lez v10, :cond_1

    move v10, v5

    goto :goto_1

    :cond_1
    move v10, v3

    :goto_1
    if-eqz v10, :cond_2

    invoke-interface {v7}, LMO1;->e()I

    move-result v11

    const v12, 0x112233

    if-ne v11, v12, :cond_2

    move v11, v5

    goto :goto_2

    :cond_2
    move v11, v3

    :goto_2
    iget-object v12, v0, Ljr2;->r:Ljava/util/HashMap;

    invoke-virtual {v12, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    const/4 v13, 0x0

    if-eqz v12, :cond_3

    iget-object v12, v0, Ljr2;->r:Ljava/util/HashMap;

    invoke-virtual {v12, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljr2$b;

    goto :goto_3

    :cond_3
    new-instance v12, Ljr2$b;

    invoke-direct {v12, v0, v13}, Ljr2$b;-><init>(Ljr2;Ljr2$a;)V

    iget-object v14, v0, Ljr2;->r:Ljava/util/HashMap;

    invoke-virtual {v14, v7, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    invoke-virtual {v12, v7}, Ljr2$b;->c(LMO1;)Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-virtual {v12, v7, v10, v11}, Ljr2$b;->a(LMO1;ZZ)V

    :cond_4
    iget-object v10, v0, LAx;->g:LAx$a;

    iget v11, v10, LAx$a;->c:I

    iget v10, v10, LAx$a;->a:I

    add-int/2addr v11, v10

    :goto_4
    if-gt v10, v11, :cond_9

    invoke-interface {v7, v10}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v14

    if-nez v14, :cond_5

    goto :goto_7

    :cond_5
    iget-object v15, v0, Ljr2;->s:[F

    invoke-virtual {v14}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v16

    aput v16, v15, v3

    iget-object v15, v0, Ljr2;->s:[F

    invoke-virtual {v14}, LAA;->c()F

    move-result v14

    mul-float/2addr v14, v1

    aput v14, v15, v5

    iget-object v14, v0, Ljr2;->s:[F

    invoke-virtual {v8, v14}, LD96;->k([F)V

    iget-object v14, v0, Lqx4;->a:LFs6;

    iget-object v15, v0, Ljr2;->s:[F

    aget v15, v15, v3

    invoke-virtual {v14, v15}, LFs6;->A(F)Z

    move-result v14

    if-nez v14, :cond_6

    goto :goto_7

    :cond_6
    iget-object v14, v0, Lqx4;->a:LFs6;

    iget-object v15, v0, Ljr2;->s:[F

    aget v15, v15, v3

    invoke-virtual {v14, v15}, LFs6;->z(F)Z

    move-result v14

    if-eqz v14, :cond_8

    iget-object v14, v0, Lqx4;->a:LFs6;

    iget-object v15, v0, Ljr2;->s:[F

    aget v15, v15, v5

    invoke-virtual {v14, v15}, LFs6;->D(F)Z

    move-result v14

    if-nez v14, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v12, v10}, Ljr2$b;->b(I)Landroid/graphics/Bitmap;

    move-result-object v14

    if-eqz v14, :cond_8

    iget-object v15, v0, Ljr2;->s:[F

    aget v16, v15, v3

    sub-float v3, v16, v9

    aget v15, v15, v5

    sub-float/2addr v15, v9

    move-object/from16 v4, p1

    invoke-virtual {v4, v14, v3, v15, v13}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v4, p1

    :goto_6
    add-int/lit8 v10, v10, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_4

    :cond_9
    :goto_7
    move-object/from16 v4, p1

    add-int/lit8 v6, v6, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto/16 :goto_0

    :cond_a
    return-void
.end method

.method public o(LMO1;)V
    .locals 22

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    iget-object v0, v6, LRS0;->b:Lhi0;

    invoke-virtual {v0}, Lhi0;->b()F

    move-result v0

    iget-object v1, v6, Ljr2;->i:Llr2;

    invoke-interface/range {p1 .. p1}, LoO1;->j0()LaI6$a;

    move-result-object v2

    invoke-interface {v1, v2}, Lyx;->d(LaI6$a;)LD96;

    move-result-object v8

    iget-object v1, v6, LAx;->g:LAx$a;

    iget-object v2, v6, Ljr2;->i:Llr2;

    invoke-virtual {v1, v2, v7}, LAx$a;->a(Lyx;LYN1;)V

    invoke-interface/range {p1 .. p1}, LMO1;->a0()F

    move-result v1

    iget-object v2, v6, Ljr2;->n:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    iget-object v2, v6, LAx;->g:LAx$a;

    iget v3, v2, LAx$a;->c:I

    const/4 v4, 0x1

    if-lt v3, v4, :cond_3

    iget v2, v2, LAx$a;->a:I

    add-int/2addr v2, v4

    add-int/lit8 v3, v2, -0x2

    const/4 v5, 0x0

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-interface {v7, v3}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v3

    sub-int/2addr v2, v4

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-interface {v7, v2}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    iget-object v5, v6, Ljr2;->n:Landroid/graphics/Path;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v9

    invoke-virtual {v2}, LAA;->c()F

    move-result v10

    mul-float/2addr v10, v0

    invoke-virtual {v5, v9, v10}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v5, v6, LAx;->g:LAx$a;

    iget v5, v5, LAx$a;->a:I

    add-int/2addr v5, v4

    const/4 v4, -0x1

    move v9, v5

    move v5, v4

    move-object v4, v2

    :goto_0
    iget-object v10, v6, LAx;->g:LAx$a;

    iget v11, v10, LAx$a;->c:I

    iget v10, v10, LAx$a;->a:I

    add-int/2addr v11, v10

    if-gt v9, v11, :cond_3

    if-ne v5, v9, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v7, v9}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v2

    :goto_1
    add-int/lit8 v5, v9, 0x1

    invoke-interface/range {p1 .. p1}, LoO1;->L0()I

    move-result v10

    if-ge v5, v10, :cond_2

    move v9, v5

    :cond_2
    invoke-interface {v7, v9}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v10

    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v11

    invoke-virtual {v3}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v12

    sub-float/2addr v11, v12

    mul-float/2addr v11, v1

    invoke-virtual {v2}, LAA;->c()F

    move-result v12

    invoke-virtual {v3}, LAA;->c()F

    move-result v3

    sub-float/2addr v12, v3

    mul-float/2addr v12, v1

    invoke-virtual {v10}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v3

    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v13

    sub-float/2addr v3, v13

    mul-float/2addr v3, v1

    invoke-virtual {v10}, LAA;->c()F

    move-result v13

    invoke-virtual {v4}, LAA;->c()F

    move-result v14

    sub-float/2addr v13, v14

    mul-float/2addr v13, v1

    iget-object v14, v6, Ljr2;->n:Landroid/graphics/Path;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v15

    add-float/2addr v15, v11

    invoke-virtual {v4}, LAA;->c()F

    move-result v11

    add-float/2addr v11, v12

    mul-float v16, v11, v0

    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v11

    sub-float v17, v11, v3

    invoke-virtual {v2}, LAA;->c()F

    move-result v3

    sub-float/2addr v3, v13

    mul-float v18, v3, v0

    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v19

    invoke-virtual {v2}, LAA;->c()F

    move-result v3

    mul-float v20, v3, v0

    invoke-virtual/range {v14 .. v20}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    move-object v3, v4

    move-object v4, v2

    move-object v2, v10

    move/from16 v21, v9

    move v9, v5

    move/from16 v5, v21

    goto :goto_0

    :cond_3
    invoke-interface/range {p1 .. p1}, LNO1;->x0()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, v6, Ljr2;->o:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v0, v6, Ljr2;->o:Landroid/graphics/Path;

    iget-object v1, v6, Ljr2;->n:Landroid/graphics/Path;

    invoke-virtual {v0, v1}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    iget-object v1, v6, Ljr2;->l:Landroid/graphics/Canvas;

    iget-object v3, v6, Ljr2;->o:Landroid/graphics/Path;

    iget-object v5, v6, LAx;->g:LAx$a;

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object v4, v8

    invoke-virtual/range {v0 .. v5}, Ljr2;->p(Landroid/graphics/Canvas;LMO1;Landroid/graphics/Path;LD96;LAx$a;)V

    :cond_4
    iget-object v0, v6, LRS0;->c:Landroid/graphics/Paint;

    invoke-interface/range {p1 .. p1}, LoO1;->getColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, v6, LRS0;->c:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, v6, Ljr2;->n:Landroid/graphics/Path;

    invoke-virtual {v8, v0}, LD96;->i(Landroid/graphics/Path;)V

    iget-object v0, v6, Ljr2;->l:Landroid/graphics/Canvas;

    iget-object v1, v6, Ljr2;->n:Landroid/graphics/Path;

    iget-object v2, v6, LRS0;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object v0, v6, LRS0;->c:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    return-void
.end method

.method public p(Landroid/graphics/Canvas;LMO1;Landroid/graphics/Path;LD96;LAx$a;)V
    .locals 3

    invoke-interface {p2}, LMO1;->B()LrO1;

    move-result-object v0

    iget-object v1, p0, Ljr2;->i:Llr2;

    invoke-interface {v0, p2, v1}, LrO1;->a(LMO1;Llr2;)F

    move-result v0

    iget v1, p5, LAx$a;->a:I

    iget v2, p5, LAx$a;->c:I

    add-int/2addr v1, v2

    invoke-interface {p2, v1}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v1

    invoke-virtual {p3, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    iget p5, p5, LAx$a;->a:I

    invoke-interface {p2, p5}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object p5

    invoke-virtual {p5}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result p5

    invoke-virtual {p3, p5, v0}, Landroid/graphics/Path;->lineTo(FF)V

    invoke-virtual {p3}, Landroid/graphics/Path;->close()V

    invoke-virtual {p4, p3}, LD96;->i(Landroid/graphics/Path;)V

    invoke-interface {p2}, LNO1;->f()Landroid/graphics/drawable/Drawable;

    move-result-object p4

    if-eqz p4, :cond_0

    invoke-virtual {p0, p1, p3, p4}, Lxr2;->m(Landroid/graphics/Canvas;Landroid/graphics/Path;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LNO1;->y()I

    move-result p4

    invoke-interface {p2}, LNO1;->T()I

    move-result p2

    invoke-virtual {p0, p1, p3, p4, p2}, Lxr2;->l(Landroid/graphics/Canvas;Landroid/graphics/Path;II)V

    :goto_0
    return-void
.end method

.method public q(Landroid/graphics/Canvas;LMO1;)V
    .locals 2

    invoke-interface {p2}, LoO1;->L0()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LRS0;->c:Landroid/graphics/Paint;

    invoke-interface {p2}, LNO1;->W()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, LRS0;->c:Landroid/graphics/Paint;

    invoke-interface {p2}, LMO1;->F()Landroid/graphics/DashPathEffect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    sget-object v0, Ljr2$a;->a:[I

    invoke-interface {p2}, LMO1;->z0()Lmr2$a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    invoke-virtual {p0, p1, p2}, Ljr2;->s(Landroid/graphics/Canvas;LMO1;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p2}, Ljr2;->r(LMO1;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p2}, Ljr2;->o(LMO1;)V

    :goto_0
    iget-object p1, p0, LRS0;->c:Landroid/graphics/Paint;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    return-void
.end method

.method public r(LMO1;)V
    .locals 14

    iget-object v0, p0, LRS0;->b:Lhi0;

    invoke-virtual {v0}, Lhi0;->b()F

    move-result v0

    iget-object v1, p0, Ljr2;->i:Llr2;

    invoke-interface {p1}, LoO1;->j0()LaI6$a;

    move-result-object v2

    invoke-interface {v1, v2}, Lyx;->d(LaI6$a;)LD96;

    move-result-object v1

    iget-object v2, p0, LAx;->g:LAx$a;

    iget-object v3, p0, Ljr2;->i:Llr2;

    invoke-virtual {v2, v3, p1}, LAx$a;->a(Lyx;LYN1;)V

    iget-object v2, p0, Ljr2;->n:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    iget-object v2, p0, LAx;->g:LAx$a;

    iget v3, v2, LAx$a;->c:I

    const/4 v4, 0x1

    if-lt v3, v4, :cond_0

    iget v2, v2, LAx$a;->a:I

    invoke-interface {p1, v2}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v2

    iget-object v3, p0, Ljr2;->n:Landroid/graphics/Path;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v5

    invoke-virtual {v2}, LAA;->c()F

    move-result v6

    mul-float/2addr v6, v0

    invoke-virtual {v3, v5, v6}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v3, p0, LAx;->g:LAx$a;

    iget v3, v3, LAx$a;->a:I

    add-int/2addr v3, v4

    :goto_0
    iget-object v4, p0, LAx;->g:LAx$a;

    iget v5, v4, LAx$a;->c:I

    iget v4, v4, LAx$a;->a:I

    add-int/2addr v5, v4

    if-gt v3, v5, :cond_0

    invoke-interface {p1, v3}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v4

    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v5

    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v6

    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v7

    sub-float/2addr v6, v7

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    add-float v10, v5, v6

    iget-object v7, p0, Ljr2;->n:Landroid/graphics/Path;

    invoke-virtual {v2}, LAA;->c()F

    move-result v2

    mul-float v9, v2, v0

    invoke-virtual {v4}, LAA;->c()F

    move-result v2

    mul-float v11, v2, v0

    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v12

    invoke-virtual {v4}, LAA;->c()F

    move-result v2

    mul-float v13, v2, v0

    move v8, v10

    invoke-virtual/range {v7 .. v13}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    add-int/lit8 v3, v3, 0x1

    move-object v2, v4

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LNO1;->x0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ljr2;->o:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Ljr2;->o:Landroid/graphics/Path;

    iget-object v2, p0, Ljr2;->n:Landroid/graphics/Path;

    invoke-virtual {v0, v2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    iget-object v4, p0, Ljr2;->l:Landroid/graphics/Canvas;

    iget-object v6, p0, Ljr2;->o:Landroid/graphics/Path;

    iget-object v8, p0, LAx;->g:LAx$a;

    move-object v3, p0

    move-object v5, p1

    move-object v7, v1

    invoke-virtual/range {v3 .. v8}, Ljr2;->p(Landroid/graphics/Canvas;LMO1;Landroid/graphics/Path;LD96;LAx$a;)V

    :cond_1
    iget-object v0, p0, LRS0;->c:Landroid/graphics/Paint;

    invoke-interface {p1}, LoO1;->getColor()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, LRS0;->c:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Ljr2;->n:Landroid/graphics/Path;

    invoke-virtual {v1, p1}, LD96;->i(Landroid/graphics/Path;)V

    iget-object p1, p0, Ljr2;->l:Landroid/graphics/Canvas;

    iget-object v0, p0, Ljr2;->n:Landroid/graphics/Path;

    iget-object v1, p0, LRS0;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object p1, p0, LRS0;->c:Landroid/graphics/Paint;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    return-void
.end method

.method public s(Landroid/graphics/Canvas;LMO1;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-interface/range {p2 .. p2}, LoO1;->L0()I

    move-result v2

    invoke-interface/range {p2 .. p2}, LMO1;->z0()Lmr2$a;

    move-result-object v3

    sget-object v4, Lmr2$a;->c:Lmr2$a;

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v3, v4, :cond_0

    move v3, v6

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    const/4 v4, 0x4

    const/4 v7, 0x2

    if-eqz v3, :cond_1

    move v8, v4

    goto :goto_1

    :cond_1
    move v8, v7

    :goto_1
    iget-object v9, v0, Ljr2;->i:Llr2;

    invoke-interface/range {p2 .. p2}, LoO1;->j0()LaI6$a;

    move-result-object v10

    invoke-interface {v9, v10}, Lyx;->d(LaI6$a;)LD96;

    move-result-object v9

    iget-object v10, v0, LRS0;->b:Lhi0;

    invoke-virtual {v10}, Lhi0;->b()F

    move-result v10

    iget-object v11, v0, LRS0;->c:Landroid/graphics/Paint;

    sget-object v12, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v11, v12}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-interface/range {p2 .. p2}, LMO1;->c()Z

    move-result v11

    if-eqz v11, :cond_2

    iget-object v11, v0, Ljr2;->l:Landroid/graphics/Canvas;

    goto :goto_2

    :cond_2
    move-object/from16 v11, p1

    :goto_2
    iget-object v12, v0, LAx;->g:LAx$a;

    iget-object v13, v0, Ljr2;->i:Llr2;

    invoke-virtual {v12, v13, v1}, LAx$a;->a(Lyx;LYN1;)V

    invoke-interface/range {p2 .. p2}, LNO1;->x0()Z

    move-result v12

    if-eqz v12, :cond_3

    if-lez v2, :cond_3

    iget-object v12, v0, LAx;->g:LAx$a;

    move-object/from16 v13, p1

    invoke-virtual {v0, v13, v1, v9, v12}, Ljr2;->t(Landroid/graphics/Canvas;LMO1;LD96;LAx$a;)V

    :cond_3
    invoke-interface/range {p2 .. p2}, LoO1;->g0()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    if-le v12, v6, :cond_c

    iget-object v2, v0, Ljr2;->p:[F

    array-length v2, v2

    mul-int/lit8 v12, v8, 0x2

    if-gt v2, v12, :cond_4

    mul-int/2addr v8, v4

    new-array v2, v8, [F

    iput-object v2, v0, Ljr2;->p:[F

    :cond_4
    iget-object v2, v0, LAx;->g:LAx$a;

    iget v2, v2, LAx$a;->a:I

    :goto_3
    iget-object v8, v0, LAx;->g:LAx$a;

    iget v13, v8, LAx$a;->c:I

    iget v8, v8, LAx$a;->a:I

    add-int/2addr v13, v8

    if-gt v2, v13, :cond_13

    invoke-interface {v1, v2}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v8

    if-nez v8, :cond_5

    goto/16 :goto_5

    :cond_5
    iget-object v13, v0, Ljr2;->p:[F

    invoke-virtual {v8}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v14

    aput v14, v13, v5

    iget-object v13, v0, Ljr2;->p:[F

    invoke-virtual {v8}, LAA;->c()F

    move-result v8

    mul-float/2addr v8, v10

    aput v8, v13, v6

    iget-object v8, v0, LAx;->g:LAx$a;

    iget v8, v8, LAx$a;->b:I

    const/4 v13, 0x3

    if-ge v2, v8, :cond_8

    add-int/lit8 v8, v2, 0x1

    invoke-interface {v1, v8}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v8

    if-nez v8, :cond_6

    goto/16 :goto_9

    :cond_6
    if-eqz v3, :cond_7

    iget-object v14, v0, Ljr2;->p:[F

    invoke-virtual {v8}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v15

    aput v15, v14, v7

    iget-object v14, v0, Ljr2;->p:[F

    aget v15, v14, v6

    aput v15, v14, v13

    aget v16, v14, v7

    aput v16, v14, v4

    const/16 v16, 0x5

    aput v15, v14, v16

    const/4 v15, 0x6

    invoke-virtual {v8}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v16

    aput v16, v14, v15

    iget-object v14, v0, Ljr2;->p:[F

    invoke-virtual {v8}, LAA;->c()F

    move-result v8

    mul-float/2addr v8, v10

    const/4 v15, 0x7

    aput v8, v14, v15

    goto :goto_4

    :cond_7
    iget-object v14, v0, Ljr2;->p:[F

    invoke-virtual {v8}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v15

    aput v15, v14, v7

    iget-object v14, v0, Ljr2;->p:[F

    invoke-virtual {v8}, LAA;->c()F

    move-result v8

    mul-float/2addr v8, v10

    aput v8, v14, v13

    goto :goto_4

    :cond_8
    iget-object v8, v0, Ljr2;->p:[F

    aget v14, v8, v5

    aput v14, v8, v7

    aget v14, v8, v6

    aput v14, v8, v13

    :goto_4
    iget-object v8, v0, Ljr2;->p:[F

    invoke-virtual {v9, v8}, LD96;->k([F)V

    iget-object v8, v0, Lqx4;->a:LFs6;

    iget-object v14, v0, Ljr2;->p:[F

    aget v14, v14, v5

    invoke-virtual {v8, v14}, LFs6;->A(F)Z

    move-result v8

    if-nez v8, :cond_9

    goto/16 :goto_9

    :cond_9
    iget-object v8, v0, Lqx4;->a:LFs6;

    iget-object v14, v0, Ljr2;->p:[F

    aget v14, v14, v7

    invoke-virtual {v8, v14}, LFs6;->z(F)Z

    move-result v8

    if-eqz v8, :cond_b

    iget-object v8, v0, Lqx4;->a:LFs6;

    iget-object v14, v0, Ljr2;->p:[F

    aget v14, v14, v6

    invoke-virtual {v8, v14}, LFs6;->B(F)Z

    move-result v8

    if-nez v8, :cond_a

    iget-object v8, v0, Lqx4;->a:LFs6;

    iget-object v14, v0, Ljr2;->p:[F

    aget v13, v14, v13

    invoke-virtual {v8, v13}, LFs6;->y(F)Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_5

    :cond_a
    iget-object v8, v0, LRS0;->c:Landroid/graphics/Paint;

    invoke-interface {v1, v2}, LoO1;->A0(I)I

    move-result v13

    invoke-virtual {v8, v13}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v8, v0, Ljr2;->p:[F

    iget-object v13, v0, LRS0;->c:Landroid/graphics/Paint;

    invoke-virtual {v11, v8, v5, v12, v13}, Landroid/graphics/Canvas;->drawLines([FIILandroid/graphics/Paint;)V

    :cond_b
    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_3

    :cond_c
    iget-object v12, v0, Ljr2;->p:[F

    array-length v12, v12

    mul-int/2addr v2, v8

    invoke-static {v2, v8}, Ljava/lang/Math;->max(II)I

    move-result v13

    mul-int/2addr v13, v7

    if-ge v12, v13, :cond_d

    invoke-static {v2, v8}, Ljava/lang/Math;->max(II)I

    move-result v2

    mul-int/2addr v2, v4

    new-array v2, v2, [F

    iput-object v2, v0, Ljr2;->p:[F

    :cond_d
    iget-object v2, v0, LAx;->g:LAx$a;

    iget v2, v2, LAx$a;->a:I

    invoke-interface {v1, v2}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v2

    if-eqz v2, :cond_13

    iget-object v2, v0, LAx;->g:LAx$a;

    iget v2, v2, LAx$a;->a:I

    move v4, v5

    :goto_6
    iget-object v12, v0, LAx;->g:LAx$a;

    iget v13, v12, LAx$a;->c:I

    iget v12, v12, LAx$a;->a:I

    add-int/2addr v13, v12

    if-gt v2, v13, :cond_12

    if-nez v2, :cond_e

    move v12, v5

    goto :goto_7

    :cond_e
    add-int/lit8 v12, v2, -0x1

    :goto_7
    invoke-interface {v1, v12}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v12

    invoke-interface {v1, v2}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v13

    if-eqz v12, :cond_11

    if-nez v13, :cond_f

    goto :goto_8

    :cond_f
    iget-object v14, v0, Ljr2;->p:[F

    add-int/lit8 v15, v4, 0x1

    invoke-virtual {v12}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v16

    aput v16, v14, v4

    iget-object v4, v0, Ljr2;->p:[F

    add-int/lit8 v14, v15, 0x1

    invoke-virtual {v12}, LAA;->c()F

    move-result v16

    mul-float v16, v16, v10

    aput v16, v4, v15

    if-eqz v3, :cond_10

    iget-object v4, v0, Ljr2;->p:[F

    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v16

    aput v16, v4, v14

    iget-object v4, v0, Ljr2;->p:[F

    add-int/lit8 v14, v15, 0x1

    invoke-virtual {v12}, LAA;->c()F

    move-result v16

    mul-float v16, v16, v10

    aput v16, v4, v15

    iget-object v4, v0, Ljr2;->p:[F

    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v16

    aput v16, v4, v14

    iget-object v4, v0, Ljr2;->p:[F

    add-int/lit8 v14, v15, 0x1

    invoke-virtual {v12}, LAA;->c()F

    move-result v12

    mul-float/2addr v12, v10

    aput v12, v4, v15

    :cond_10
    iget-object v4, v0, Ljr2;->p:[F

    add-int/lit8 v12, v14, 0x1

    invoke-virtual {v13}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v15

    aput v15, v4, v14

    iget-object v4, v0, Ljr2;->p:[F

    add-int/lit8 v14, v12, 0x1

    invoke-virtual {v13}, LAA;->c()F

    move-result v13

    mul-float/2addr v13, v10

    aput v13, v4, v12

    move v4, v14

    :cond_11
    :goto_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_12
    if-lez v4, :cond_13

    iget-object v2, v0, Ljr2;->p:[F

    invoke-virtual {v9, v2}, LD96;->k([F)V

    iget-object v2, v0, LAx;->g:LAx$a;

    iget v2, v2, LAx$a;->c:I

    add-int/2addr v2, v6

    mul-int/2addr v2, v8

    invoke-static {v2, v8}, Ljava/lang/Math;->max(II)I

    move-result v2

    mul-int/2addr v2, v7

    iget-object v3, v0, LRS0;->c:Landroid/graphics/Paint;

    invoke-interface/range {p2 .. p2}, LoO1;->getColor()I

    move-result v1

    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, v0, Ljr2;->p:[F

    iget-object v3, v0, LRS0;->c:Landroid/graphics/Paint;

    invoke-virtual {v11, v1, v5, v2, v3}, Landroid/graphics/Canvas;->drawLines([FIILandroid/graphics/Paint;)V

    :cond_13
    :goto_9
    iget-object v1, v0, LRS0;->c:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    return-void
.end method

.method public t(Landroid/graphics/Canvas;LMO1;LD96;LAx$a;)V
    .locals 7

    iget-object v0, p0, Ljr2;->q:Landroid/graphics/Path;

    iget v1, p4, LAx$a;->a:I

    iget p4, p4, LAx$a;->c:I

    add-int/2addr p4, v1

    const/4 v2, 0x0

    :cond_0
    mul-int/lit16 v3, v2, 0x80

    add-int/2addr v3, v1

    add-int/lit16 v4, v3, 0x80

    if-le v4, p4, :cond_1

    move v4, p4

    :cond_1
    if-gt v3, v4, :cond_3

    invoke-virtual {p0, p2, v3, v4, v0}, Ljr2;->v(LMO1;IILandroid/graphics/Path;)V

    invoke-virtual {p3, v0}, LD96;->i(Landroid/graphics/Path;)V

    invoke-interface {p2}, LNO1;->f()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {p0, p1, v0, v5}, Lxr2;->m(Landroid/graphics/Canvas;Landroid/graphics/Path;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_2
    invoke-interface {p2}, LNO1;->y()I

    move-result v5

    invoke-interface {p2}, LNO1;->T()I

    move-result v6

    invoke-virtual {p0, p1, v0, v5, v6}, Lxr2;->l(Landroid/graphics/Canvas;Landroid/graphics/Path;II)V

    :cond_3
    :goto_0
    add-int/lit8 v2, v2, 0x1

    if-le v3, v4, :cond_0

    return-void
.end method

.method public u(Landroid/graphics/Canvas;Ljava/lang/String;FFI)V
    .locals 1

    iget-object v0, p0, LRS0;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, p5}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p5, p0, LRS0;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final v(LMO1;IILandroid/graphics/Path;)V
    .locals 7

    invoke-interface {p1}, LMO1;->B()LrO1;

    move-result-object v0

    iget-object v1, p0, Ljr2;->i:Llr2;

    invoke-interface {v0, p1, v1}, LrO1;->a(LMO1;Llr2;)F

    move-result v0

    iget-object v1, p0, LRS0;->b:Lhi0;

    invoke-virtual {v1}, Lhi0;->b()F

    move-result v1

    invoke-interface {p1}, LMO1;->z0()Lmr2$a;

    move-result-object v2

    sget-object v3, Lmr2$a;->c:Lmr2$a;

    const/4 v4, 0x1

    if-ne v2, v3, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p4}, Landroid/graphics/Path;->reset()V

    invoke-interface {p1, p2}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v3

    invoke-virtual {v3}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v5

    invoke-virtual {p4, v5, v0}, Landroid/graphics/Path;->moveTo(FF)V

    invoke-virtual {v3}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v5

    invoke-virtual {v3}, LAA;->c()F

    move-result v6

    mul-float/2addr v6, v1

    invoke-virtual {p4, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/2addr p2, v4

    const/4 v4, 0x0

    :goto_1
    if-gt p2, p3, :cond_2

    invoke-interface {p1, p2}, LoO1;->h(I)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v4

    if-eqz v2, :cond_1

    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v5

    invoke-virtual {v3}, LAA;->c()F

    move-result v3

    mul-float/2addr v3, v1

    invoke-virtual {p4, v5, v3}, Landroid/graphics/Path;->lineTo(FF)V

    :cond_1
    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result v3

    invoke-virtual {v4}, LAA;->c()F

    move-result v5

    mul-float/2addr v5, v1

    invoke-virtual {p4, v3, v5}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 p2, p2, 0x1

    move-object v3, v4

    goto :goto_1

    :cond_2
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/Entry;->g()F

    move-result p1

    invoke-virtual {p4, p1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    :cond_3
    invoke-virtual {p4}, Landroid/graphics/Path;->close()V

    return-void
.end method

.method public w()V
    .locals 2

    iget-object v0, p0, Ljr2;->l:Landroid/graphics/Canvas;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    iput-object v1, p0, Ljr2;->l:Landroid/graphics/Canvas;

    :cond_0
    iget-object v0, p0, Ljr2;->k:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1
    iget-object v0, p0, Ljr2;->k:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    iput-object v1, p0, Ljr2;->k:Ljava/lang/ref/WeakReference;

    :cond_2
    return-void
.end method
