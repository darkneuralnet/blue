.class public abstract Lcom/github/mikephil/charting/charts/PieRadarChartBase;
.super Lcom/github/mikephil/charting/charts/Chart;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lii0<",
        "+",
        "LoO1<",
        "+",
        "Lcom/github/mikephil/charting/data/Entry;",
        ">;>;>",
        "Lcom/github/mikephil/charting/charts/Chart<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public F:F

.field public G:F

.field public H:Z

.field public I:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/github/mikephil/charting/charts/Chart;-><init>(Landroid/content/Context;)V

    const/high16 p1, 0x43870000    # 270.0f

    iput p1, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->F:F

    iput p1, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->G:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->H:Z

    const/4 p1, 0x0

    iput p1, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->I:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/github/mikephil/charting/charts/Chart;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 p1, 0x43870000    # 270.0f

    iput p1, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->F:F

    iput p1, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->G:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->H:Z

    const/4 p1, 0x0

    iput p1, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->I:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/github/mikephil/charting/charts/Chart;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p1, 0x43870000    # 270.0f

    iput p1, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->F:F

    iput p1, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->G:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->H:Z

    const/4 p1, 0x0

    iput p1, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->I:F

    return-void
.end method


# virtual methods
.method public O()V
    .locals 1

    invoke-super {p0}, Lcom/github/mikephil/charting/charts/Chart;->O()V

    new-instance v0, LtT3;

    invoke-direct {v0, p0}, LtT3;-><init>(Lcom/github/mikephil/charting/charts/PieRadarChartBase;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->n:Lli0;

    return-void
.end method

.method public T()V
    .locals 2

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->Y()V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->p:Lhq2;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    invoke-virtual {v0, v1}, Lhq2;->a(Lii0;)V

    :cond_1
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->r()V

    return-void
.end method

.method public Y()V
    .locals 0

    return-void
.end method

.method public Z(FF)F
    .locals 5

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->z()LPE2;

    move-result-object v0

    iget v1, v0, LPE2;->c:F

    cmpl-float v2, p1, v1

    if-lez v2, :cond_0

    sub-float/2addr p1, v1

    goto :goto_0

    :cond_0
    sub-float p1, v1, p1

    :goto_0
    iget v1, v0, LPE2;->d:F

    cmpl-float v2, p2, v1

    if-lez v2, :cond_1

    sub-float/2addr p2, v1

    goto :goto_1

    :cond_1
    sub-float p2, v1, p2

    :goto_1
    float-to-double v1, p1

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    float-to-double p1, p2

    invoke-static {p1, p2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    add-double/2addr v1, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    double-to-float p1, p1

    invoke-static {v0}, LPE2;->f(LPE2;)V

    return p1
.end method

.method public a0(FF)F
    .locals 7

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->z()LPE2;

    move-result-object v0

    iget v1, v0, LPE2;->c:F

    sub-float v1, p1, v1

    float-to-double v1, v1

    iget v3, v0, LPE2;->d:F

    sub-float/2addr p2, v3

    float-to-double v3, p2

    mul-double/2addr v1, v1

    mul-double v5, v3, v3

    add-double/2addr v1, v5

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    div-double/2addr v3, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->acos(D)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v1

    double-to-float p2, v1

    iget v1, v0, LPE2;->c:F

    cmpl-float p1, p1, v1

    const/high16 v1, 0x43b40000    # 360.0f

    if-lez p1, :cond_0

    sub-float p2, v1, p2

    :cond_0
    const/high16 p1, 0x42b40000    # 90.0f

    add-float/2addr p2, p1

    cmpl-float p1, p2, v1

    if-lez p1, :cond_1

    sub-float/2addr p2, v1

    :cond_1
    invoke-static {v0}, LPE2;->f(LPE2;)V

    return p2
.end method

.method public b0()F
    .locals 3

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v0}, LFs6;->o()Landroid/graphics/RectF;

    move-result-object v0

    iget v1, v0, Landroid/graphics/RectF;->left:F

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->D()F

    move-result v2

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->left:F

    iget v1, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->F()F

    move-result v2

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->top:F

    iget v1, v0, Landroid/graphics/RectF;->right:F

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->E()F

    move-result v2

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->right:F

    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->C()F

    move-result v2

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    return v0
.end method

.method public abstract c0(F)I
.end method

.method public computeScroll()V
    .locals 2

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->n:Lli0;

    instance-of v1, v0, LtT3;

    if-eqz v1, :cond_0

    check-cast v0, LtT3;

    invoke-virtual {v0}, LtT3;->g()V

    :cond_0
    return-void
.end method

.method public d0(LPE2;FF)LPE2;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, v0}, LPE2;->c(FF)LPE2;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->e0(LPE2;FFLPE2;)V

    return-object v0
.end method

.method public e0(LPE2;FFLPE2;)V
    .locals 6

    iget v0, p1, LPE2;->c:F

    float-to-double v0, v0

    float-to-double v2, p2

    float-to-double p2, p3

    invoke-static {p2, p3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v4, v2

    add-double/2addr v0, v4

    double-to-float v0, v0

    iput v0, p4, LPE2;->c:F

    iget p1, p1, LPE2;->d:F

    float-to-double v0, p1

    invoke-static {p2, p3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide p1

    mul-double/2addr v2, p1

    add-double/2addr v0, v2

    double-to-float p1, v0

    iput p1, p4, LPE2;->d:F

    return-void
.end method

.method public abstract f0()F
.end method

.method public g0()F
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->G:F

    return v0
.end method

.method public abstract h0()F
.end method

.method public i()I
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    invoke-virtual {v0}, Lii0;->g()I

    move-result v0

    return v0
.end method

.method public abstract i0()F
.end method

.method public j0()F
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->F:F

    return v0
.end method

.method public k0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->H:Z

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/Chart;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->n:Lli0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0, p1}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public r()V
    .locals 11

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    const/4 v1, 0x0

    if-eqz v0, :cond_11

    invoke-virtual {v0}, LNs0;->f()Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v0}, Lfq2;->D()Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    iget v0, v0, Lfq2;->x:F

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v2}, LFs6;->m()F

    move-result v2

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v3}, Lfq2;->v()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    sget-object v2, Lcom/github/mikephil/charting/charts/PieRadarChartBase$a;->c:[I

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v3}, Lfq2;->y()Lfq2$e;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v2, v4, :cond_5

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v0}, Lfq2;->A()Lfq2$f;

    move-result-object v0

    sget-object v2, Lfq2$f;->b:Lfq2$f;

    if-eq v0, v2, :cond_1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v0}, Lfq2;->A()Lfq2$f;

    move-result-object v0

    sget-object v2, Lfq2$f;->d:Lfq2$f;

    if-ne v0, v2, :cond_2

    :cond_1
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->i0()F

    move-result v0

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    iget v2, v2, Lfq2;->y:F

    add-float/2addr v2, v0

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v0}, LFs6;->l()F

    move-result v0

    iget-object v5, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v5}, Lfq2;->v()F

    move-result v5

    mul-float/2addr v0, v5

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    sget-object v2, Lcom/github/mikephil/charting/charts/PieRadarChartBase$a;->a:[I

    iget-object v5, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v5}, Lfq2;->A()Lfq2$f;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v2, v2, v5

    if-eq v2, v4, :cond_4

    if-eq v2, v3, :cond_3

    :cond_2
    :goto_0
    move v0, v1

    move v2, v0

    :goto_1
    move v3, v2

    goto/16 :goto_9

    :cond_3
    :goto_2
    move v2, v0

    move v0, v1

    move v3, v0

    goto/16 :goto_9

    :cond_4
    :goto_3
    move v3, v0

    move v0, v1

    move v2, v0

    goto/16 :goto_9

    :cond_5
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v2}, Lfq2;->u()Lfq2$d;

    move-result-object v2

    sget-object v5, Lfq2$d;->b:Lfq2$d;

    if-eq v2, v5, :cond_7

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v2}, Lfq2;->u()Lfq2$d;

    move-result-object v2

    sget-object v5, Lfq2$d;->d:Lfq2$d;

    if-ne v2, v5, :cond_6

    goto :goto_4

    :cond_6
    move v0, v1

    goto/16 :goto_7

    :cond_7
    :goto_4
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v2}, Lfq2;->A()Lfq2$f;

    move-result-object v2

    sget-object v5, Lfq2$f;->c:Lfq2$f;

    if-ne v2, v5, :cond_8

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v2}, LOi6;->e(F)F

    move-result v2

    add-float/2addr v0, v2

    goto :goto_7

    :cond_8
    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v2}, LOi6;->e(F)F

    move-result v2

    add-float/2addr v0, v2

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    iget v5, v2, Lfq2;->y:F

    iget v2, v2, Lfq2;->z:F

    add-float/2addr v5, v2

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->y()LPE2;

    move-result-object v2

    iget-object v6, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v6}, Lfq2;->u()Lfq2$d;

    move-result-object v6

    sget-object v7, Lfq2$d;->d:Lfq2$d;

    const/high16 v8, 0x41700000    # 15.0f

    if-ne v6, v7, :cond_9

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v6

    int-to-float v6, v6

    sub-float/2addr v6, v0

    add-float/2addr v6, v8

    goto :goto_5

    :cond_9
    sub-float v6, v0, v8

    :goto_5
    add-float/2addr v5, v8

    invoke-virtual {p0, v6, v5}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->Z(FF)F

    move-result v7

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->f0()F

    move-result v8

    invoke-virtual {p0, v6, v5}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->a0(FF)F

    move-result v6

    invoke-virtual {p0, v2, v8, v6}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->d0(LPE2;FF)LPE2;

    move-result-object v6

    iget v8, v6, LPE2;->c:F

    iget v9, v6, LPE2;->d:F

    invoke-virtual {p0, v8, v9}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->Z(FF)F

    move-result v8

    const/high16 v9, 0x40a00000    # 5.0f

    invoke-static {v9}, LOi6;->e(F)F

    move-result v9

    iget v10, v2, LPE2;->d:F

    cmpl-float v5, v5, v10

    if-ltz v5, :cond_a

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v5, v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v10

    int-to-float v10, v10

    cmpl-float v5, v5, v10

    if-lez v5, :cond_a

    goto :goto_6

    :cond_a
    cmpg-float v0, v7, v8

    if-gez v0, :cond_b

    sub-float/2addr v8, v7

    add-float/2addr v9, v8

    move v0, v9

    goto :goto_6

    :cond_b
    move v0, v1

    :goto_6
    invoke-static {v2}, LPE2;->f(LPE2;)V

    invoke-static {v6}, LPE2;->f(LPE2;)V

    :goto_7
    sget-object v2, Lcom/github/mikephil/charting/charts/PieRadarChartBase$a;->b:[I

    iget-object v5, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v5}, Lfq2;->u()Lfq2$d;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v2, v2, v5

    if-eq v2, v4, :cond_10

    if-eq v2, v3, :cond_f

    const/4 v0, 0x3

    if-eq v2, v0, :cond_c

    goto :goto_8

    :cond_c
    sget-object v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase$a;->a:[I

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v2}, Lfq2;->A()Lfq2$f;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    if-eq v0, v4, :cond_e

    if-eq v0, v3, :cond_d

    :goto_8
    goto/16 :goto_0

    :cond_d
    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    iget v0, v0, Lfq2;->y:F

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v2}, LFs6;->l()F

    move-result v2

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v3}, Lfq2;->v()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    goto/16 :goto_2

    :cond_e
    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    iget v0, v0, Lfq2;->y:F

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v2}, LFs6;->l()F

    move-result v2

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    invoke-virtual {v3}, Lfq2;->v()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    goto/16 :goto_3

    :cond_f
    move v2, v1

    goto/16 :goto_1

    :cond_10
    move v2, v1

    move v3, v2

    move v1, v0

    move v0, v3

    :goto_9
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->h0()F

    move-result v4

    add-float/2addr v1, v4

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->h0()F

    move-result v4

    add-float/2addr v0, v4

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->h0()F

    move-result v4

    add-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->h0()F

    move-result v4

    add-float/2addr v2, v4

    goto :goto_a

    :cond_11
    move v0, v1

    move v2, v0

    move v3, v2

    :goto_a
    iget v4, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->I:F

    invoke-static {v4}, LOi6;->e(F)F

    move-result v4

    instance-of v5, p0, Lcom/github/mikephil/charting/charts/RadarChart;

    if-eqz v5, :cond_12

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->M()LtH6;

    move-result-object v5

    invoke-virtual {v5}, LNs0;->f()Z

    move-result v6

    if-eqz v6, :cond_12

    invoke-virtual {v5}, LXu;->A()Z

    move-result v6

    if-eqz v6, :cond_12

    iget v5, v5, LtH6;->L:I

    int-to-float v5, v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    move-result v4

    :cond_12
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->F()F

    move-result v5

    add-float/2addr v3, v5

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->E()F

    move-result v5

    add-float/2addr v0, v5

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->C()F

    move-result v5

    add-float/2addr v2, v5

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->D()F

    move-result v5

    add-float/2addr v1, v5

    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-static {v4, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->h0()F

    move-result v5

    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-static {v4, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iget-object v4, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v4, v1, v3, v0, v2}, LFs6;->K(FFFF)V

    iget-boolean v4, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    if-eqz v4, :cond_13

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "offsetLeft: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", offsetTop: "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", offsetRight: "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", offsetBottom: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MPAndroidChart"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_13
    return-void
.end method

.method public setMinOffset(F)V
    .locals 0

    iput p1, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->I:F

    return-void
.end method

.method public setRotationAngle(F)V
    .locals 0

    iput p1, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->G:F

    invoke-static {p1}, LOi6;->q(F)F

    move-result p1

    iput p1, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->F:F

    return-void
.end method

.method public setRotationEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->H:Z

    return-void
.end method
