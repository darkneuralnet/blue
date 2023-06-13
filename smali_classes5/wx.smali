.class public Lwx;
.super Lli0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lli0<",
        "Lcom/github/mikephil/charting/charts/BarLineChartBase<",
        "+",
        "Lxx<",
        "+",
        "LYN1<",
        "+",
        "Lcom/github/mikephil/charting/data/Entry;",
        ">;>;>;>;"
    }
.end annotation


# instance fields
.field public g:Landroid/graphics/Matrix;

.field public h:Landroid/graphics/Matrix;

.field public i:LPE2;

.field public j:LPE2;

.field public k:F

.field public l:F

.field public m:F

.field public n:LoO1;

.field public o:Landroid/view/VelocityTracker;

.field public p:J

.field public q:LPE2;

.field public r:LPE2;

.field public s:F

.field public t:F


# direct methods
.method public constructor <init>(Lcom/github/mikephil/charting/charts/BarLineChartBase;Landroid/graphics/Matrix;F)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/github/mikephil/charting/charts/BarLineChartBase<",
            "+",
            "Lxx<",
            "+",
            "LYN1<",
            "+",
            "Lcom/github/mikephil/charting/data/Entry;",
            ">;>;>;",
            "Landroid/graphics/Matrix;",
            "F)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lli0;-><init>(Lcom/github/mikephil/charting/charts/Chart;)V

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lwx;->g:Landroid/graphics/Matrix;

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lwx;->h:Landroid/graphics/Matrix;

    const/4 p1, 0x0

    invoke-static {p1, p1}, LPE2;->c(FF)LPE2;

    move-result-object v0

    iput-object v0, p0, Lwx;->i:LPE2;

    invoke-static {p1, p1}, LPE2;->c(FF)LPE2;

    move-result-object v0

    iput-object v0, p0, Lwx;->j:LPE2;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lwx;->k:F

    iput v0, p0, Lwx;->l:F

    iput v0, p0, Lwx;->m:F

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lwx;->p:J

    invoke-static {p1, p1}, LPE2;->c(FF)LPE2;

    move-result-object v0

    iput-object v0, p0, Lwx;->q:LPE2;

    invoke-static {p1, p1}, LPE2;->c(FF)LPE2;

    move-result-object p1

    iput-object p1, p0, Lwx;->r:LPE2;

    iput-object p2, p0, Lwx;->g:Landroid/graphics/Matrix;

    invoke-static {p3}, LOi6;->e(F)F

    move-result p1

    iput p1, p0, Lwx;->s:F

    const/high16 p1, 0x40600000    # 3.5f

    invoke-static {p1}, LOi6;->e(F)F

    move-result p1

    iput p1, p0, Lwx;->t:F

    return-void
.end method

.method public static h(Landroid/view/MotionEvent;)F
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result p0

    sub-float/2addr v0, p0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    return p0
.end method

.method public static i(Landroid/view/MotionEvent;)F
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result p0

    sub-float/2addr v0, p0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    return p0
.end method

.method public static k(LPE2;Landroid/view/MotionEvent;)V
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    add-float/2addr v1, v3

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    add-float/2addr v0, p1

    const/high16 p1, 0x40000000    # 2.0f

    div-float/2addr v1, p1

    iput v1, p0, LPE2;->c:F

    div-float/2addr v0, p1

    iput v0, p0, LPE2;->d:F

    return-void
.end method

.method public static p(Landroid/view/MotionEvent;)F
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    sub-float/2addr v1, v3

    invoke-virtual {p0, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    invoke-virtual {p0, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p0

    sub-float/2addr v0, p0

    mul-float/2addr v1, v1

    mul-float/2addr v0, v0

    add-float/2addr v1, v0

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method


# virtual methods
.method public f()V
    .locals 11

    iget-object v0, p0, Lwx;->r:LPE2;

    iget v1, v0, LPE2;->c:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    iget v0, v0, LPE2;->d:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget-object v3, p0, Lwx;->r:LPE2;

    iget v4, v3, LPE2;->c:F

    iget-object v5, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v5, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v5}, Lcom/github/mikephil/charting/charts/Chart;->B()F

    move-result v5

    mul-float/2addr v4, v5

    iput v4, v3, LPE2;->c:F

    iget-object v3, p0, Lwx;->r:LPE2;

    iget v4, v3, LPE2;->d:F

    iget-object v5, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v5, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v5}, Lcom/github/mikephil/charting/charts/Chart;->B()F

    move-result v5

    mul-float/2addr v4, v5

    iput v4, v3, LPE2;->d:F

    iget-wide v3, p0, Lwx;->p:J

    sub-long v3, v0, v3

    long-to-float v3, v3

    const/high16 v4, 0x447a0000    # 1000.0f

    div-float/2addr v3, v4

    iget-object v4, p0, Lwx;->r:LPE2;

    iget v5, v4, LPE2;->c:F

    mul-float/2addr v5, v3

    iget v4, v4, LPE2;->d:F

    mul-float/2addr v4, v3

    iget-object v3, p0, Lwx;->q:LPE2;

    iget v6, v3, LPE2;->c:F

    add-float v8, v6, v5

    iput v8, v3, LPE2;->c:F

    iget v5, v3, LPE2;->d:F

    add-float v9, v5, v4

    iput v9, v3, LPE2;->d:F

    const/4 v7, 0x2

    const/4 v10, 0x0

    move-wide v3, v0

    move-wide v5, v0

    invoke-static/range {v3 .. v10}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v3

    iget-object v4, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v4, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->m0()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lwx;->q:LPE2;

    iget v4, v4, LPE2;->c:F

    iget-object v5, p0, Lwx;->i:LPE2;

    iget v5, v5, LPE2;->c:F

    sub-float/2addr v4, v5

    goto :goto_0

    :cond_1
    move v4, v2

    :goto_0
    iget-object v5, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v5, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v5}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->n0()Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v2, p0, Lwx;->q:LPE2;

    iget v2, v2, LPE2;->d:F

    iget-object v5, p0, Lwx;->i:LPE2;

    iget v5, v5, LPE2;->d:F

    sub-float/2addr v2, v5

    :cond_2
    invoke-virtual {p0, v3, v4, v2}, Lwx;->l(Landroid/view/MotionEvent;FF)V

    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    iget-object v2, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v2, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->L()LFs6;

    move-result-object v2

    iget-object v3, p0, Lwx;->g:Landroid/graphics/Matrix;

    iget-object v4, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v4, v5}, LFs6;->J(Landroid/graphics/Matrix;Landroid/view/View;Z)Landroid/graphics/Matrix;

    move-result-object v2

    iput-object v2, p0, Lwx;->g:Landroid/graphics/Matrix;

    iput-wide v0, p0, Lwx;->p:J

    iget-object v0, p0, Lwx;->r:LPE2;

    iget v0, v0, LPE2;->c:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3f847ae147ae147bL    # 0.01

    cmpl-double v0, v0, v2

    if-gez v0, :cond_4

    iget-object v0, p0, Lwx;->r:LPE2;

    iget v0, v0, LPE2;->d:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->r()V

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    invoke-virtual {p0}, Lwx;->q()V

    goto :goto_2

    :cond_4
    :goto_1
    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    invoke-static {v0}, LOi6;->x(Landroid/view/View;)V

    :goto_2
    return-void
.end method

.method public g(FF)LPE2;
    .locals 2

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->L()LFs6;

    move-result-object v0

    invoke-virtual {v0}, LFs6;->G()F

    move-result v1

    sub-float/2addr p1, v1

    invoke-virtual {p0}, Lwx;->j()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LFs6;->I()F

    move-result v0

    sub-float/2addr p2, v0

    neg-float p2, p2

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, p2

    invoke-virtual {v0}, LFs6;->F()F

    move-result p2

    sub-float/2addr v1, p2

    neg-float p2, v1

    :goto_0
    invoke-static {p1, p2}, LPE2;->c(FF)LPE2;

    move-result-object p1

    return-object p1
.end method

.method public final j()Z
    .locals 2

    iget-object v0, p0, Lwx;->n:LoO1;

    if-nez v0, :cond_0

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->i0()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lwx;->n:LoO1;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-interface {v0}, LoO1;->j0()LaI6$a;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->p(LaI6$a;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final l(Landroid/view/MotionEvent;FF)V
    .locals 1

    sget-object p1, Lli0$a;->c:Lli0$a;

    iput-object p1, p0, Lli0;->b:Lli0$a;

    iget-object p1, p0, Lwx;->g:Landroid/graphics/Matrix;

    iget-object v0, p0, Lwx;->h:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->K()Lif3;

    invoke-virtual {p0}, Lwx;->j()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    instance-of p1, p1, Lcom/github/mikephil/charting/charts/HorizontalBarChart;

    if-eqz p1, :cond_0

    neg-float p2, p2

    goto :goto_0

    :cond_0
    neg-float p3, p3

    :cond_1
    :goto_0
    iget-object p1, p0, Lwx;->g:Landroid/graphics/Matrix;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    return-void
.end method

.method public final m(Landroid/view/MotionEvent;)V
    .locals 2

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {v0, v1, p1}, Lcom/github/mikephil/charting/charts/Chart;->G(FF)LOM1;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lli0;->d:LOM1;

    invoke-virtual {p1, v0}, LOM1;->a(LOM1;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lli0;->d:LOM1;

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/github/mikephil/charting/charts/Chart;->N(LOM1;Z)V

    :cond_0
    return-void
.end method

.method public final n(Landroid/view/MotionEvent;)V
    .locals 9

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_d

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->K()Lif3;

    invoke-static {p1}, Lwx;->p(Landroid/view/MotionEvent;)F

    move-result v0

    iget v2, p0, Lwx;->t:F

    cmpl-float v2, v0, v2

    if-lez v2, :cond_d

    iget-object v2, p0, Lwx;->j:LPE2;

    iget v3, v2, LPE2;->c:F

    iget v2, v2, LPE2;->d:F

    invoke-virtual {p0, v3, v2}, Lwx;->g(FF)LPE2;

    move-result-object v2

    iget-object v3, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v3, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/Chart;->L()LFs6;

    move-result-object v3

    iget v4, p0, Lli0;->c:I

    const/4 v5, 0x4

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    if-ne v4, v5, :cond_6

    sget-object p1, Lli0$a;->f:Lli0$a;

    iput-object p1, p0, Lli0;->b:Lli0$a;

    iget p1, p0, Lwx;->m:F

    div-float/2addr v0, p1

    cmpg-float p1, v0, v8

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    move v6, v7

    :goto_0
    if-eqz v6, :cond_1

    invoke-virtual {v3}, LFs6;->c()Z

    move-result p1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, LFs6;->a()Z

    move-result p1

    :goto_1
    if-eqz v6, :cond_2

    invoke-virtual {v3}, LFs6;->d()Z

    move-result v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, LFs6;->b()Z

    move-result v1

    :goto_2
    iget-object v3, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v3, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->r0()Z

    move-result v3

    if-eqz v3, :cond_3

    move v3, v0

    goto :goto_3

    :cond_3
    move v3, v8

    :goto_3
    iget-object v4, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v4, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0()Z

    move-result v4

    if-eqz v4, :cond_4

    move v8, v0

    :cond_4
    if-nez v1, :cond_5

    if-eqz p1, :cond_c

    :cond_5
    iget-object p1, p0, Lwx;->g:Landroid/graphics/Matrix;

    iget-object v0, p0, Lwx;->h:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object p1, p0, Lwx;->g:Landroid/graphics/Matrix;

    iget v0, v2, LPE2;->c:F

    iget v1, v2, LPE2;->d:F

    invoke-virtual {p1, v3, v8, v0, v1}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    goto/16 :goto_8

    :cond_6
    if-ne v4, v1, :cond_9

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->r0()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Lli0$a;->d:Lli0$a;

    iput-object v0, p0, Lli0;->b:Lli0$a;

    invoke-static {p1}, Lwx;->h(Landroid/view/MotionEvent;)F

    move-result p1

    iget v0, p0, Lwx;->k:F

    div-float/2addr p1, v0

    cmpg-float v0, p1, v8

    if-gez v0, :cond_7

    goto :goto_4

    :cond_7
    move v6, v7

    :goto_4
    if-eqz v6, :cond_8

    invoke-virtual {v3}, LFs6;->c()Z

    move-result v0

    goto :goto_5

    :cond_8
    invoke-virtual {v3}, LFs6;->a()Z

    move-result v0

    :goto_5
    if-eqz v0, :cond_c

    iget-object v0, p0, Lwx;->g:Landroid/graphics/Matrix;

    iget-object v1, p0, Lwx;->h:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lwx;->g:Landroid/graphics/Matrix;

    iget v1, v2, LPE2;->c:F

    iget v3, v2, LPE2;->d:F

    invoke-virtual {v0, p1, v8, v1, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    goto :goto_8

    :cond_9
    iget v0, p0, Lli0;->c:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_c

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0()Z

    move-result v0

    if-eqz v0, :cond_c

    sget-object v0, Lli0$a;->e:Lli0$a;

    iput-object v0, p0, Lli0;->b:Lli0$a;

    invoke-static {p1}, Lwx;->i(Landroid/view/MotionEvent;)F

    move-result p1

    iget v0, p0, Lwx;->l:F

    div-float/2addr p1, v0

    cmpg-float v0, p1, v8

    if-gez v0, :cond_a

    goto :goto_6

    :cond_a
    move v6, v7

    :goto_6
    if-eqz v6, :cond_b

    invoke-virtual {v3}, LFs6;->d()Z

    move-result v0

    goto :goto_7

    :cond_b
    invoke-virtual {v3}, LFs6;->b()Z

    move-result v0

    :goto_7
    if-eqz v0, :cond_c

    iget-object v0, p0, Lwx;->g:Landroid/graphics/Matrix;

    iget-object v1, p0, Lwx;->h:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lwx;->g:Landroid/graphics/Matrix;

    iget v1, v2, LPE2;->c:F

    iget v3, v2, LPE2;->d:F

    invoke-virtual {v0, v8, p1, v1, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    :cond_c
    :goto_8
    invoke-static {v2}, LPE2;->f(LPE2;)V

    :cond_d
    return-void
.end method

.method public final o(Landroid/view/MotionEvent;)V
    .locals 2

    iget-object v0, p0, Lwx;->h:Landroid/graphics/Matrix;

    iget-object v1, p0, Lwx;->g:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lwx;->i:LPE2;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, LPE2;->c:F

    iget-object v0, p0, Lwx;->i:LPE2;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iput v1, v0, LPE2;->d:F

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {v0, v1, p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->g0(FF)LYN1;

    move-result-object p1

    iput-object p1, p0, Lwx;->n:LoO1;

    return-void
.end method

.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 6

    sget-object v0, Lli0$a;->i:Lli0$a;

    iput-object v0, p0, Lli0;->b:Lli0$a;

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->K()Lif3;

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->k0()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lii0;

    move-result-object v0

    check-cast v0, Lxx;

    invoke-virtual {v0}, Lii0;->g()I

    move-result v0

    if-lez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-virtual {p0, v0, v1}, Lwx;->g(FF)LPE2;

    move-result-object v0

    iget-object v1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    move-object v2, v1

    check-cast v2, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    check-cast v1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->r0()Z

    move-result v1

    const v3, 0x3fb33333    # 1.4f

    const/high16 v4, 0x3f800000    # 1.0f

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    iget-object v5, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v5, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v5}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    iget v4, v0, LPE2;->c:F

    iget v5, v0, LPE2;->d:F

    invoke-virtual {v2, v1, v3, v4, v5}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->v0(FFFF)V

    iget-object v1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->S()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Double-Tap, Zooming In, x: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, LPE2;->c:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", y: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, LPE2;->d:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "BarlineChartTouch"

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    invoke-static {v0}, LPE2;->f(LPE2;)V

    :cond_3
    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onDoubleTap(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    sget-object v0, Lli0$a;->k:Lli0$a;

    iput-object v0, p0, Lli0;->b:Lli0$a;

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->K()Lif3;

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    move-result p1

    return p1
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    sget-object p1, Lli0$a;->j:Lli0$a;

    iput-object p1, p0, Lli0;->b:Lli0$a;

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->K()Lif3;

    return-void
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 3

    sget-object v0, Lli0$a;->h:Lli0$a;

    iput-object v0, p0, Lli0;->b:Lli0$a;

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->K()Lif3;

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->R()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/github/mikephil/charting/charts/Chart;->G(FF)LOM1;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lli0;->c(LOM1;Landroid/view/MotionEvent;)V

    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onSingleTapUp(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 11
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    iget-object p1, p0, Lwx;->o:Landroid/view/VelocityTracker;

    if-nez p1, :cond_0

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object p1

    iput-object p1, p0, Lwx;->o:Landroid/view/VelocityTracker;

    :cond_0
    iget-object p1, p0, Lwx;->o:Landroid/view/VelocityTracker;

    invoke-virtual {p1, p2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x3

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lwx;->o:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v0, p0, Lwx;->o:Landroid/view/VelocityTracker;

    :cond_1
    iget p1, p0, Lli0;->c:I

    if-nez p1, :cond_2

    iget-object p1, p0, Lli0;->e:Landroid/view/GestureDetector;

    invoke-virtual {p1, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    :cond_2
    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->l0()Z

    move-result p1

    const/4 v2, 0x1

    if-nez p1, :cond_3

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->r0()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0()Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    and-int/lit16 p1, p1, 0xff

    if-eqz p1, :cond_1e

    const/4 v3, 0x4

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v6, 0x2

    if-eq p1, v2, :cond_18

    if-eq p1, v6, :cond_c

    if-eq p1, v1, :cond_b

    if-eq p1, v4, :cond_5

    const/4 v0, 0x6

    if-eq p1, v0, :cond_4

    goto/16 :goto_3

    :cond_4
    iget-object p1, p0, Lwx;->o:Landroid/view/VelocityTracker;

    invoke-static {p2, p1}, LOi6;->z(Landroid/view/MotionEvent;Landroid/view/VelocityTracker;)V

    iput v4, p0, Lli0;->c:I

    goto/16 :goto_3

    :cond_5
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result p1

    if-lt p1, v6, :cond_1f

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->t()V

    invoke-virtual {p0, p2}, Lwx;->o(Landroid/view/MotionEvent;)V

    invoke-static {p2}, Lwx;->h(Landroid/view/MotionEvent;)F

    move-result p1

    iput p1, p0, Lwx;->k:F

    invoke-static {p2}, Lwx;->i(Landroid/view/MotionEvent;)F

    move-result p1

    iput p1, p0, Lwx;->l:F

    invoke-static {p2}, Lwx;->p(Landroid/view/MotionEvent;)F

    move-result p1

    iput p1, p0, Lwx;->m:F

    const/high16 v0, 0x41200000    # 10.0f

    cmpl-float p1, p1, v0

    if-lez p1, :cond_a

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->q0()Z

    move-result p1

    if-eqz p1, :cond_6

    iput v3, p0, Lli0;->c:I

    goto :goto_0

    :cond_6
    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->r0()Z

    move-result p1

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0()Z

    move-result v0

    if-eq p1, v0, :cond_8

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->r0()Z

    move-result p1

    if-eqz p1, :cond_7

    move v1, v6

    :cond_7
    iput v1, p0, Lli0;->c:I

    goto :goto_0

    :cond_8
    iget p1, p0, Lwx;->k:F

    iget v0, p0, Lwx;->l:F

    cmpl-float p1, p1, v0

    if-lez p1, :cond_9

    move v1, v6

    :cond_9
    iput v1, p0, Lli0;->c:I

    :cond_a
    :goto_0
    iget-object p1, p0, Lwx;->j:LPE2;

    invoke-static {p1, p2}, Lwx;->k(LPE2;Landroid/view/MotionEvent;)V

    goto/16 :goto_3

    :cond_b
    iput v5, p0, Lli0;->c:I

    invoke-virtual {p0, p2}, Lli0;->b(Landroid/view/MotionEvent;)V

    goto/16 :goto_3

    :cond_c
    iget p1, p0, Lli0;->c:I

    if-ne p1, v2, :cond_f

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->t()V

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->m0()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_d

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget-object v1, p0, Lwx;->i:LPE2;

    iget v1, v1, LPE2;->c:F

    sub-float/2addr p1, v1

    goto :goto_1

    :cond_d
    move p1, v0

    :goto_1
    iget-object v1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->n0()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v1, p0, Lwx;->i:LPE2;

    iget v1, v1, LPE2;->d:F

    sub-float/2addr v0, v1

    :cond_e
    invoke-virtual {p0, p2, p1, v0}, Lwx;->l(Landroid/view/MotionEvent;FF)V

    goto/16 :goto_3

    :cond_f
    if-eq p1, v6, :cond_16

    if-eq p1, v1, :cond_16

    if-ne p1, v3, :cond_10

    goto/16 :goto_2

    :cond_10
    if-nez p1, :cond_1f

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget-object v0, p0, Lwx;->i:LPE2;

    iget v0, v0, LPE2;->c:F

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget-object v3, p0, Lwx;->i:LPE2;

    iget v3, v3, LPE2;->d:F

    invoke-static {p1, v0, v1, v3}, Lli0;->a(FFFF)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget v0, p0, Lwx;->s:F

    cmpl-float p1, p1, v0

    if-lez p1, :cond_1f

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->l0()Z

    move-result p1

    if-eqz p1, :cond_1f

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->o0()Z

    move-result p1

    if-eqz p1, :cond_11

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->h0()Z

    move-result p1

    if-nez p1, :cond_12

    :cond_11
    move v5, v2

    :cond_12
    if-eqz v5, :cond_15

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget-object v0, p0, Lwx;->i:LPE2;

    iget v0, v0, LPE2;->c:F

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    iget-object v0, p0, Lwx;->i:LPE2;

    iget v0, v0, LPE2;->d:F

    sub-float/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->m0()Z

    move-result v0

    if-nez v0, :cond_13

    cmpl-float v0, p2, p1

    if-ltz v0, :cond_1f

    :cond_13
    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->n0()Z

    move-result v0

    if-nez v0, :cond_14

    cmpg-float p1, p2, p1

    if-gtz p1, :cond_1f

    :cond_14
    sget-object p1, Lli0$a;->c:Lli0$a;

    iput-object p1, p0, Lli0;->b:Lli0$a;

    iput v2, p0, Lli0;->c:I

    goto/16 :goto_3

    :cond_15
    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->p0()Z

    move-result p1

    if-eqz p1, :cond_1f

    sget-object p1, Lli0$a;->c:Lli0$a;

    iput-object p1, p0, Lli0;->b:Lli0$a;

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->p0()Z

    move-result p1

    if-eqz p1, :cond_1f

    invoke-virtual {p0, p2}, Lwx;->m(Landroid/view/MotionEvent;)V

    goto/16 :goto_3

    :cond_16
    :goto_2
    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->t()V

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->r0()Z

    move-result p1

    if-nez p1, :cond_17

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0()Z

    move-result p1

    if-eqz p1, :cond_1f

    :cond_17
    invoke-virtual {p0, p2}, Lwx;->n(Landroid/view/MotionEvent;)V

    goto/16 :goto_3

    :cond_18
    iget-object p1, p0, Lwx;->o:Landroid/view/VelocityTracker;

    invoke-virtual {p2, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v7

    invoke-static {}, LOi6;->o()I

    move-result v8

    int-to-float v8, v8

    const/16 v9, 0x3e8

    invoke-virtual {p1, v9, v8}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    invoke-virtual {p1, v7}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v8

    invoke-virtual {p1, v7}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v7

    invoke-static {}, LOi6;->p()I

    move-result v9

    int-to-float v9, v9

    cmpl-float v7, v7, v9

    if-gtz v7, :cond_19

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v7

    invoke-static {}, LOi6;->p()I

    move-result v9

    int-to-float v9, v9

    cmpl-float v7, v7, v9

    if-lez v7, :cond_1a

    :cond_19
    iget v7, p0, Lli0;->c:I

    if-ne v7, v2, :cond_1a

    iget-object v7, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v7, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {v7}, Lcom/github/mikephil/charting/charts/Chart;->P()Z

    move-result v7

    if-eqz v7, :cond_1a

    invoke-virtual {p0}, Lwx;->q()V

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v9

    iput-wide v9, p0, Lwx;->p:J

    iget-object v7, p0, Lwx;->q:LPE2;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v9

    iput v9, v7, LPE2;->c:F

    iget-object v7, p0, Lwx;->q:LPE2;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v9

    iput v9, v7, LPE2;->d:F

    iget-object v7, p0, Lwx;->r:LPE2;

    iput p1, v7, LPE2;->c:F

    iput v8, v7, LPE2;->d:F

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    invoke-static {p1}, LOi6;->x(Landroid/view/View;)V

    :cond_1a
    iget p1, p0, Lli0;->c:I

    if-eq p1, v6, :cond_1b

    if-eq p1, v1, :cond_1b

    if-eq p1, v3, :cond_1b

    if-ne p1, v4, :cond_1c

    :cond_1b
    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->r()V

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    :cond_1c
    iput v5, p0, Lli0;->c:I

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->w()V

    iget-object p1, p0, Lwx;->o:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_1d

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v0, p0, Lwx;->o:Landroid/view/VelocityTracker;

    :cond_1d
    invoke-virtual {p0, p2}, Lli0;->b(Landroid/view/MotionEvent;)V

    goto :goto_3

    :cond_1e
    invoke-virtual {p0, p2}, Lli0;->e(Landroid/view/MotionEvent;)V

    invoke-virtual {p0}, Lwx;->q()V

    invoke-virtual {p0, p2}, Lwx;->o(Landroid/view/MotionEvent;)V

    :cond_1f
    :goto_3
    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/BarLineChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->L()LFs6;

    move-result-object p1

    iget-object p2, p0, Lwx;->g:Landroid/graphics/Matrix;

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    invoke-virtual {p1, p2, v0, v2}, LFs6;->J(Landroid/graphics/Matrix;Landroid/view/View;Z)Landroid/graphics/Matrix;

    move-result-object p1

    iput-object p1, p0, Lwx;->g:Landroid/graphics/Matrix;

    return v2
.end method

.method public q()V
    .locals 2

    iget-object v0, p0, Lwx;->r:LPE2;

    const/4 v1, 0x0

    iput v1, v0, LPE2;->c:F

    iput v1, v0, LPE2;->d:F

    return-void
.end method
