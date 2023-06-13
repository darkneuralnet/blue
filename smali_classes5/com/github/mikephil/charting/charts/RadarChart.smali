.class public Lcom/github/mikephil/charting/charts/RadarChart;
.super Lcom/github/mikephil/charting/charts/PieRadarChartBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/github/mikephil/charting/charts/PieRadarChartBase<",
        "LPm4;",
        ">;"
    }
.end annotation


# instance fields
.field public J:F

.field public K:F

.field public P:I

.field public Q:I

.field public R:I

.field public S:Z

.field public T:I

.field public U:LaI6;

.field public W:LdI6;

.field public p0:LwH6;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;-><init>(Landroid/content/Context;)V

    const/high16 p1, 0x40200000    # 2.5f

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->J:F

    const/high16 p1, 0x3fc00000    # 1.5f

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->K:F

    const/16 p1, 0x7a

    invoke-static {p1, p1, p1}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    iput v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->P:I

    invoke-static {p1, p1, p1}, Landroid/graphics/Color;->rgb(III)I

    move-result p1

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->Q:I

    const/16 p1, 0x96

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->R:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->S:Z

    const/4 p1, 0x0

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->T:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 p1, 0x40200000    # 2.5f

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->J:F

    const/high16 p1, 0x3fc00000    # 1.5f

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->K:F

    const/16 p1, 0x7a

    invoke-static {p1, p1, p1}, Landroid/graphics/Color;->rgb(III)I

    move-result p2

    iput p2, p0, Lcom/github/mikephil/charting/charts/RadarChart;->P:I

    invoke-static {p1, p1, p1}, Landroid/graphics/Color;->rgb(III)I

    move-result p1

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->Q:I

    const/16 p1, 0x96

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->R:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->S:Z

    const/4 p1, 0x0

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->T:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p1, 0x40200000    # 2.5f

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->J:F

    const/high16 p1, 0x3fc00000    # 1.5f

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->K:F

    const/16 p1, 0x7a

    invoke-static {p1, p1, p1}, Landroid/graphics/Color;->rgb(III)I

    move-result p2

    iput p2, p0, Lcom/github/mikephil/charting/charts/RadarChart;->P:I

    invoke-static {p1, p1, p1}, Landroid/graphics/Color;->rgb(III)I

    move-result p1

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->Q:I

    const/16 p1, 0x96

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->R:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->S:Z

    const/4 p1, 0x0

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->T:I

    return-void
.end method


# virtual methods
.method public O()V
    .locals 3

    invoke-super {p0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->O()V

    new-instance v0, LaI6;

    sget-object v1, LaI6$a;->b:LaI6$a;

    invoke-direct {v0, v1}, LaI6;-><init>(LaI6$a;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->U:LaI6;

    const/high16 v0, 0x3fc00000    # 1.5f

    invoke-static {v0}, LOi6;->e(F)F

    move-result v0

    iput v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->J:F

    const/high16 v0, 0x3f400000    # 0.75f

    invoke-static {v0}, LOi6;->e(F)F

    move-result v0

    iput v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->K:F

    new-instance v0, LOm4;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->t:Lhi0;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-direct {v0, p0, v1, v2}, LOm4;-><init>(Lcom/github/mikephil/charting/charts/RadarChart;Lhi0;LFs6;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    new-instance v0, LdI6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/RadarChart;->U:LaI6;

    invoke-direct {v0, v1, v2, p0}, LdI6;-><init>(LFs6;LaI6;Lcom/github/mikephil/charting/charts/RadarChart;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->W:LdI6;

    new-instance v0, LwH6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-direct {v0, v1, v2, p0}, LwH6;-><init>(LFs6;LtH6;Lcom/github/mikephil/charting/charts/RadarChart;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->p0:LwH6;

    new-instance v0, LQm4;

    invoke-direct {v0, p0}, LQm4;-><init>(Lcom/github/mikephil/charting/charts/RadarChart;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->r:LuO1;

    return-void
.end method

.method public T()V
    .locals 4

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/RadarChart;->Y()V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->W:LdI6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->U:LaI6;

    iget v2, v1, LXu;->H:F

    iget v3, v1, LXu;->G:F

    invoke-virtual {v1}, LaI6;->c0()Z

    move-result v1

    invoke-virtual {v0, v2, v3, v1}, LYu;->a(FFZ)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->p0:LwH6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v2, v1, LXu;->H:F

    iget v1, v1, LXu;->G:F

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, LuH6;->a(FFZ)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->m:Lfq2;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lfq2;->E()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->p:Lhq2;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    invoke-virtual {v0, v1}, Lhq2;->a(Lii0;)V

    :cond_1
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->r()V

    return-void
.end method

.method public Y()V
    .locals 4

    invoke-super {p0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->Y()V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->U:LaI6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v1, LPm4;

    sget-object v2, LaI6$a;->b:LaI6$a;

    invoke-virtual {v1, v2}, Lii0;->q(LaI6$a;)F

    move-result v1

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v3, LPm4;

    invoke-virtual {v3, v2}, Lii0;->o(LaI6$a;)F

    move-result v2

    invoke-virtual {v0, v1, v2}, LaI6;->j(FF)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v1, LPm4;

    invoke-virtual {v1}, Lii0;->k()LoO1;

    move-result-object v1

    check-cast v1, LbP1;

    invoke-interface {v1}, LoO1;->L0()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, LXu;->j(FF)V

    return-void
.end method

.method public c0(F)I
    .locals 7

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->j0()F

    move-result v0

    sub-float/2addr p1, v0

    invoke-static {p1}, LOi6;->q(F)F

    move-result p1

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/RadarChart;->n0()F

    move-result v0

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v1, LPm4;

    invoke-virtual {v1}, Lii0;->k()LoO1;

    move-result-object v1

    check-cast v1, LbP1;

    invoke-interface {v1}, LoO1;->L0()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    add-int/lit8 v4, v3, 0x1

    int-to-float v5, v4

    mul-float/2addr v5, v0

    const/high16 v6, 0x40000000    # 2.0f

    div-float v6, v0, v6

    sub-float/2addr v5, v6

    cmpl-float v5, v5, p1

    if-lez v5, :cond_0

    move v2, v3

    goto :goto_1

    :cond_0
    move v3, v4

    goto :goto_0

    :cond_1
    :goto_1
    return v2
.end method

.method public f0()F
    .locals 3

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v0}, LFs6;->o()Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    div-float/2addr v0, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    return v0
.end method

.method public g()F
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->U:LaI6;

    iget v0, v0, LXu;->H:F

    return v0
.end method

.method public h0()F
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-virtual {v0}, LNs0;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-virtual {v0}, LXu;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v0, v0, LtH6;->L:I

    int-to-float v0, v0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x41200000    # 10.0f

    invoke-static {v0}, LOi6;->e(F)F

    move-result v0

    :goto_0
    return v0
.end method

.method public i0()F
    .locals 2

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->p:Lhq2;

    invoke-virtual {v0}, Lhq2;->d()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    return v0
.end method

.method public l0()F
    .locals 3

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v0}, LFs6;->o()Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    div-float/2addr v0, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->U:LaI6;

    iget v1, v1, LXu;->I:F

    div-float/2addr v0, v1

    return v0
.end method

.method public m0()I
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->T:I

    return v0
.end method

.method public n0()F
    .locals 2

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v0, LPm4;

    invoke-virtual {v0}, Lii0;->k()LoO1;

    move-result-object v0

    check-cast v0, LbP1;

    invoke-interface {v0}, LoO1;->L0()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x43b40000    # 360.0f

    div-float/2addr v1, v0

    return v1
.end method

.method public o0()I
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->R:I

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    invoke-super {p0, p1}, Lcom/github/mikephil/charting/charts/Chart;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-virtual {v0}, LNs0;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->p0:LwH6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v2, v1, LXu;->H:F

    iget v1, v1, LXu;->G:F

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, LuH6;->a(FFZ)V

    :cond_1
    iget-object v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->p0:LwH6;

    invoke-virtual {v0, p1}, LwH6;->i(Landroid/graphics/Canvas;)V

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->S:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    invoke-virtual {v0, p1}, LRS0;->c(Landroid/graphics/Canvas;)V

    :cond_2
    iget-object v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->U:LaI6;

    invoke-virtual {v0}, LNs0;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->U:LaI6;

    invoke-virtual {v0}, LXu;->B()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->W:LdI6;

    invoke-virtual {v0, p1}, LdI6;->l(Landroid/graphics/Canvas;)V

    :cond_3
    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    invoke-virtual {v0, p1}, LRS0;->b(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->X()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->z:[LOM1;

    invoke-virtual {v0, p1, v1}, LRS0;->d(Landroid/graphics/Canvas;[LOM1;)V

    :cond_4
    iget-object v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->U:LaI6;

    invoke-virtual {v0}, LNs0;->f()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->U:LaI6;

    invoke-virtual {v0}, LXu;->B()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->W:LdI6;

    invoke-virtual {v0, p1}, LdI6;->l(Landroid/graphics/Canvas;)V

    :cond_5
    iget-object v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->W:LdI6;

    invoke-virtual {v0, p1}, LdI6;->i(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    invoke-virtual {v0, p1}, LRS0;->e(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->p:Lhq2;

    invoke-virtual {v0, p1}, Lhq2;->e(Landroid/graphics/Canvas;)V

    invoke-virtual {p0, p1}, Lcom/github/mikephil/charting/charts/Chart;->u(Landroid/graphics/Canvas;)V

    invoke-virtual {p0, p1}, Lcom/github/mikephil/charting/charts/Chart;->v(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public p0()I
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->P:I

    return v0
.end method

.method public q0()I
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->Q:I

    return v0
.end method

.method public r0()F
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->J:F

    return v0
.end method

.method public s0()F
    .locals 1

    iget v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->K:F

    return v0
.end method

.method public setDrawWeb(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->S:Z

    return-void
.end method

.method public setSkipWebLineCount(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->T:I

    return-void
.end method

.method public setWebAlpha(I)V
    .locals 0

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->R:I

    return-void
.end method

.method public setWebColor(I)V
    .locals 0

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->P:I

    return-void
.end method

.method public setWebColorInner(I)V
    .locals 0

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->Q:I

    return-void
.end method

.method public setWebLineWidth(F)V
    .locals 0

    invoke-static {p1}, LOi6;->e(F)F

    move-result p1

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->J:F

    return-void
.end method

.method public setWebLineWidthInner(F)V
    .locals 0

    invoke-static {p1}, LOi6;->e(F)F

    move-result p1

    iput p1, p0, Lcom/github/mikephil/charting/charts/RadarChart;->K:F

    return-void
.end method

.method public t0()LaI6;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->U:LaI6;

    return-object v0
.end method

.method public u0()F
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/RadarChart;->U:LaI6;

    iget v0, v0, LXu;->I:F

    return v0
.end method
