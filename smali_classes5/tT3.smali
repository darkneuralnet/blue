.class public LtT3;
.super Lli0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LtT3$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lli0<",
        "Lcom/github/mikephil/charting/charts/PieRadarChartBase<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public g:LPE2;

.field public h:F

.field public i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LtT3$a;",
            ">;"
        }
    .end annotation
.end field

.field public j:J

.field public k:F


# direct methods
.method public constructor <init>(Lcom/github/mikephil/charting/charts/PieRadarChartBase;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/github/mikephil/charting/charts/PieRadarChartBase<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lli0;-><init>(Lcom/github/mikephil/charting/charts/Chart;)V

    const/4 p1, 0x0

    invoke-static {p1, p1}, LPE2;->c(FF)LPE2;

    move-result-object v0

    iput-object v0, p0, LtT3;->g:LPE2;

    iput p1, p0, LtT3;->h:F

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LtT3;->i:Ljava/util/ArrayList;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LtT3;->j:J

    iput p1, p0, LtT3;->k:F

    return-void
.end method


# virtual methods
.method public final f()F
    .locals 12

    iget-object v0, p0, LtT3;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LtT3;->i:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LtT3$a;

    iget-object v3, p0, LtT3;->i:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LtT3$a;

    iget-object v4, p0, LtT3;->i:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v5

    move-object v6, v0

    :goto_0
    if-ltz v4, :cond_2

    iget-object v6, p0, LtT3;->i:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LtT3$a;

    iget v7, v6, LtT3$a;->b:F

    iget v8, v3, LtT3$a;->b:F

    cmpl-float v7, v7, v8

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    iget-wide v7, v3, LtT3$a;->a:J

    iget-wide v9, v0, LtT3$a;->a:J

    sub-long/2addr v7, v9

    long-to-float v4, v7

    const/high16 v7, 0x447a0000    # 1000.0f

    div-float/2addr v4, v7

    cmpl-float v1, v4, v1

    if-nez v1, :cond_3

    const v4, 0x3dcccccd    # 0.1f

    :cond_3
    iget v1, v3, LtT3$a;->b:F

    iget v6, v6, LtT3$a;->b:F

    cmpl-float v7, v1, v6

    if-ltz v7, :cond_4

    move v2, v5

    :cond_4
    sub-float/2addr v1, v6

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-double v5, v1

    const-wide v7, 0x4070e00000000000L    # 270.0

    cmpl-double v1, v5, v7

    if-lez v1, :cond_5

    xor-int/lit8 v2, v2, 0x1

    :cond_5
    iget v1, v3, LtT3$a;->b:F

    iget v5, v0, LtT3$a;->b:F

    sub-float v6, v1, v5

    float-to-double v6, v6

    const-wide v8, 0x4066800000000000L    # 180.0

    cmpl-double v6, v6, v8

    const-wide v10, 0x4076800000000000L    # 360.0

    if-lez v6, :cond_6

    float-to-double v5, v5

    add-double/2addr v5, v10

    double-to-float v1, v5

    iput v1, v0, LtT3$a;->b:F

    goto :goto_2

    :cond_6
    sub-float/2addr v5, v1

    float-to-double v5, v5

    cmpl-double v5, v5, v8

    if-lez v5, :cond_7

    float-to-double v5, v1

    add-double/2addr v5, v10

    double-to-float v1, v5

    iput v1, v3, LtT3$a;->b:F

    :cond_7
    :goto_2
    iget v1, v3, LtT3$a;->b:F

    iget v0, v0, LtT3$a;->b:F

    sub-float/2addr v1, v0

    div-float/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    if-nez v2, :cond_8

    neg-float v0, v0

    :cond_8
    return v0
.end method

.method public g()V
    .locals 6

    iget v0, p0, LtT3;->k:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget v2, p0, LtT3;->k:F

    iget-object v3, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v3, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/Chart;->B()F

    move-result v3

    mul-float/2addr v2, v3

    iput v2, p0, LtT3;->k:F

    iget-wide v2, p0, LtT3;->j:J

    sub-long v2, v0, v2

    long-to-float v2, v2

    const/high16 v3, 0x447a0000    # 1000.0f

    div-float/2addr v2, v3

    iget-object v3, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    move-object v4, v3

    check-cast v4, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    check-cast v3, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->j0()F

    move-result v3

    iget v5, p0, LtT3;->k:F

    mul-float/2addr v5, v2

    add-float/2addr v3, v5

    invoke-virtual {v4, v3}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->setRotationAngle(F)V

    iput-wide v0, p0, LtT3;->j:J

    iget v0, p0, LtT3;->k:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3f50624dd2f1a9fcL    # 0.001

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_1

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    invoke-static {v0}, LOi6;->x(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LtT3;->k()V

    :goto_0
    return-void
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, LtT3;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final i(FF)V
    .locals 7

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, LtT3;->i:Ljava/util/ArrayList;

    new-instance v3, LtT3$a;

    iget-object v4, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v4, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v4, p1, p2}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->a0(FF)F

    move-result p1

    invoke-direct {v3, p0, v0, v1, p1}, LtT3$a;-><init>(LtT3;JF)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, LtT3;->i:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    :goto_0
    add-int/lit8 p2, p1, -0x2

    if-lez p2, :cond_0

    iget-object p2, p0, LtT3;->i:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LtT3$a;

    iget-wide v3, p2, LtT3$a;->a:J

    sub-long v3, v0, v3

    const-wide/16 v5, 0x3e8

    cmp-long p2, v3, v5

    if-lez p2, :cond_0

    iget-object p2, p0, LtT3;->i:Ljava/util/ArrayList;

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public j(FF)V
    .locals 1

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0, p1, p2}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->a0(FF)F

    move-result p1

    iget-object p2, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p2, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {p2}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->g0()F

    move-result p2

    sub-float/2addr p1, p2

    iput p1, p0, LtT3;->h:F

    return-void
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LtT3;->k:F

    return-void
.end method

.method public l(FF)V
    .locals 2

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    move-object v1, v0

    check-cast v1, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0, p1, p2}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->a0(FF)F

    move-result p1

    iget p2, p0, LtT3;->h:F

    sub-float/2addr p1, p2

    invoke-virtual {v1, p1}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->setRotationAngle(F)V

    return-void
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    sget-object p1, Lli0$a;->j:Lli0$a;

    iput-object p1, p0, Lli0;->b:Lli0$a;

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->K()Lif3;

    return-void
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 3

    sget-object v0, Lli0$a;->h:Lli0$a;

    iput-object v0, p0, Lli0;->b:Lli0$a;

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->K()Lif3;

    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->R()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v0, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/github/mikephil/charting/charts/Chart;->G(FF)LOM1;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lli0;->c(LOM1;Landroid/view/MotionEvent;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    iget-object p1, p0, Lli0;->e:Landroid/view/GestureDetector;

    invoke-virtual {p1, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    return v0

    :cond_0
    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->k0()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-eqz v2, :cond_7

    if-eq v2, v0, :cond_5

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object v2, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v2, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->P()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, p1, v1}, LtT3;->i(FF)V

    :cond_2
    iget v2, p0, Lli0;->c:I

    const/4 v3, 0x6

    if-nez v2, :cond_3

    iget-object v2, p0, LtT3;->g:LPE2;

    iget v4, v2, LPE2;->c:F

    iget v2, v2, LPE2;->d:F

    invoke-static {p1, v4, v1, v2}, Lli0;->a(FFFF)F

    move-result v2

    const/high16 v4, 0x41000000    # 8.0f

    invoke-static {v4}, LOi6;->e(F)F

    move-result v4

    cmpl-float v2, v2, v4

    if-lez v2, :cond_3

    sget-object p1, Lli0$a;->g:Lli0$a;

    iput-object p1, p0, Lli0;->b:Lli0$a;

    iput v3, p0, Lli0;->c:I

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->t()V

    goto :goto_0

    :cond_3
    iget v2, p0, Lli0;->c:I

    if-ne v2, v3, :cond_4

    invoke-virtual {p0, p1, v1}, LtT3;->l(FF)V

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_4
    :goto_0
    invoke-virtual {p0, p2}, Lli0;->b(Landroid/view/MotionEvent;)V

    goto :goto_1

    :cond_5
    iget-object v2, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast v2, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->P()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p0}, LtT3;->k()V

    invoke-virtual {p0, p1, v1}, LtT3;->i(FF)V

    invoke-virtual {p0}, LtT3;->f()F

    move-result p1

    iput p1, p0, LtT3;->k:F

    const/4 v1, 0x0

    cmpl-float p1, p1, v1

    if-eqz p1, :cond_6

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, LtT3;->j:J

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    invoke-static {p1}, LOi6;->x(Landroid/view/View;)V

    :cond_6
    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p1, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->w()V

    const/4 p1, 0x0

    iput p1, p0, Lli0;->c:I

    invoke-virtual {p0, p2}, Lli0;->b(Landroid/view/MotionEvent;)V

    goto :goto_1

    :cond_7
    invoke-virtual {p0, p2}, Lli0;->e(Landroid/view/MotionEvent;)V

    invoke-virtual {p0}, LtT3;->k()V

    invoke-virtual {p0}, LtT3;->h()V

    iget-object p2, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    check-cast p2, Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {p2}, Lcom/github/mikephil/charting/charts/Chart;->P()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-virtual {p0, p1, v1}, LtT3;->i(FF)V

    :cond_8
    invoke-virtual {p0, p1, v1}, LtT3;->j(FF)V

    iget-object p2, p0, LtT3;->g:LPE2;

    iput p1, p2, LPE2;->c:F

    iput v1, p2, LPE2;->d:F

    :cond_9
    :goto_1
    return v0
.end method
