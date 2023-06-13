.class public Lcom/github/mikephil/charting/charts/HorizontalBarChart;
.super Lcom/github/mikephil/charting/charts/BarChart;
.source "SourceFile"


# instance fields
.field public N0:Landroid/graphics/RectF;

.field public O0:[F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/github/mikephil/charting/charts/BarChart;-><init>(Landroid/content/Context;)V

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/HorizontalBarChart;->N0:Landroid/graphics/RectF;

    const/4 p1, 0x2

    new-array p1, p1, [F

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/HorizontalBarChart;->O0:[F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/github/mikephil/charting/charts/BarChart;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/HorizontalBarChart;->N0:Landroid/graphics/RectF;

    const/4 p1, 0x2

    new-array p1, p1, [F

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/HorizontalBarChart;->O0:[F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/github/mikephil/charting/charts/BarChart;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/HorizontalBarChart;->N0:Landroid/graphics/RectF;

    const/4 p1, 0x2

    new-array p1, p1, [F

    iput-object p1, p0, Lcom/github/mikephil/charting/charts/HorizontalBarChart;->O0:[F

    return-void
.end method


# virtual methods
.method public G(FF)LOM1;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    if-nez v0, :cond_1

    iget-boolean p1, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    if-eqz p1, :cond_0

    const-string p1, "MPAndroidChart"

    const-string p2, "Can\'t select by touch. No data set."

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->H()LuO1;

    move-result-object v0

    invoke-interface {v0, p2, p1}, LuO1;->a(FF)LOM1;

    move-result-object p1

    return-object p1
.end method

.method public J(LOM1;)[F
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [F

    invoke-virtual {p1}, LOM1;->f()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const/4 v1, 0x1

    invoke-virtual {p1}, LOM1;->e()F

    move-result p1

    aput p1, v0, v1

    return-object v0
.end method

.method public O()V
    .locals 4

    new-instance v0, LdN1;

    invoke-direct {v0}, LdN1;-><init>()V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-super {p0}, Lcom/github/mikephil/charting/charts/BarChart;->O()V

    new-instance v0, LE96;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-direct {v0, v1}, LE96;-><init>(LFs6;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->w0:LD96;

    new-instance v0, LE96;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-direct {v0, v1}, LE96;-><init>(LFs6;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->x0:LD96;

    new-instance v0, LaN1;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->t:Lhi0;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-direct {v0, p0, v1, v2}, LaN1;-><init>(Ltx;Lhi0;LFs6;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    new-instance v0, LbN1;

    invoke-direct {v0, p0}, LbN1;-><init>(Ltx;)V

    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/Chart;->setHighlighter(Lji0;)V

    new-instance v0, LcI6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->w0:LD96;

    invoke-direct {v0, v1, v2, v3}, LcI6;-><init>(LFs6;LaI6;LD96;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->u0:LbI6;

    new-instance v0, LcI6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->x0:LD96;

    invoke-direct {v0, v1, v2, v3}, LcI6;-><init>(LFs6;LaI6;LD96;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->v0:LbI6;

    new-instance v0, LvH6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->w0:LD96;

    invoke-direct {v0, v1, v2, v3, p0}, LvH6;-><init>(LFs6;LtH6;LD96;Lcom/github/mikephil/charting/charts/BarChart;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->y0:LuH6;

    return-void
.end method

.method public c()F
    .locals 4

    sget-object v0, LaI6$a;->b:LaI6$a;

    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->d(LaI6$a;)LD96;

    move-result-object v0

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v1}, LFs6;->h()F

    move-result v1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v2}, LFs6;->f()F

    move-result v2

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->G0:LOE2;

    invoke-virtual {v0, v1, v2, v3}, LD96;->h(FFLOE2;)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v0, v0, LXu;->H:F

    float-to-double v0, v0

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->G0:LOE2;

    iget-wide v2, v2, LOE2;->d:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public o()F
    .locals 4

    sget-object v0, LaI6$a;->b:LaI6$a;

    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->d(LaI6$a;)LD96;

    move-result-object v0

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v1}, LFs6;->h()F

    move-result v1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v2}, LFs6;->j()F

    move-result v2

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->H0:LOE2;

    invoke-virtual {v0, v1, v2, v3}, LD96;->h(FFLOE2;)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v0, v0, LXu;->G:F

    float-to-double v0, v0

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->H0:LOE2;

    iget-wide v2, v2, LOE2;->d:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public r()V
    .locals 9

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/HorizontalBarChart;->N0:Landroid/graphics/RectF;

    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->a0(Landroid/graphics/RectF;)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/HorizontalBarChart;->N0:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    const/4 v2, 0x0

    add-float/2addr v1, v2

    iget v3, v0, Landroid/graphics/RectF;->top:F

    add-float/2addr v3, v2

    iget v4, v0, Landroid/graphics/RectF;->right:F

    add-float/2addr v4, v2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v0, v2

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    invoke-virtual {v2}, LaI6;->d0()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    iget-object v5, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->u0:LbI6;

    invoke-virtual {v5}, LYu;->c()Landroid/graphics/Paint;

    move-result-object v5

    invoke-virtual {v2, v5}, LaI6;->T(Landroid/graphics/Paint;)F

    move-result v2

    add-float/2addr v3, v2

    :cond_0
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    invoke-virtual {v2}, LaI6;->d0()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    iget-object v5, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->v0:LbI6;

    invoke-virtual {v5}, LYu;->c()Landroid/graphics/Paint;

    move-result-object v5

    invoke-virtual {v2, v5}, LaI6;->T(Landroid/graphics/Paint;)F

    move-result v2

    add-float/2addr v0, v2

    :cond_1
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v5, v2, LtH6;->L:I

    int-to-float v5, v5

    invoke-virtual {v2}, LNs0;->f()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-virtual {v2}, LtH6;->Q()LtH6$a;

    move-result-object v2

    sget-object v6, LtH6$a;->c:LtH6$a;

    if-ne v2, v6, :cond_2

    add-float/2addr v1, v5

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-virtual {v2}, LtH6;->Q()LtH6$a;

    move-result-object v2

    sget-object v6, LtH6$a;->b:LtH6$a;

    if-ne v2, v6, :cond_3

    :goto_0
    add-float/2addr v4, v5

    goto :goto_1

    :cond_3
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    invoke-virtual {v2}, LtH6;->Q()LtH6$a;

    move-result-object v2

    sget-object v6, LtH6$a;->d:LtH6$a;

    if-ne v2, v6, :cond_4

    add-float/2addr v1, v5

    goto :goto_0

    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->F()F

    move-result v2

    add-float/2addr v3, v2

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->E()F

    move-result v2

    add-float/2addr v4, v2

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->C()F

    move-result v2

    add-float/2addr v0, v2

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->D()F

    move-result v2

    add-float/2addr v1, v2

    iget v2, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->q0:F

    invoke-static {v2}, LOi6;->e(F)F

    move-result v2

    iget-object v5, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    move-result v6

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v7

    invoke-static {v2, v4}, Ljava/lang/Math;->max(FF)F

    move-result v8

    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-virtual {v5, v6, v7, v8, v2}, LFs6;->K(FFFF)V

    iget-boolean v2, p0, Lcom/github/mikephil/charting/charts/Chart;->b:Z

    if-eqz v2, :cond_5

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "offsetLeft: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", offsetTop: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", offsetRight: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", offsetBottom: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MPAndroidChart"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Content: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {v2}, LFs6;->o()Landroid/graphics/RectF;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/RectF;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0()V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/HorizontalBarChart;->u0()V

    return-void
.end method

.method public setVisibleXRange(FF)V
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v0, v0, LXu;->I:F

    div-float p1, v0, p1

    div-float/2addr v0, p2

    iget-object p2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {p2, p1, v0}, LFs6;->R(FF)V

    return-void
.end method

.method public setVisibleXRangeMaximum(F)V
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v0, v0, LXu;->I:F

    div-float/2addr v0, p1

    iget-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {p1, v0}, LFs6;->T(F)V

    return-void
.end method

.method public setVisibleXRangeMinimum(F)V
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v0, v0, LXu;->I:F

    div-float/2addr v0, p1

    iget-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {p1, v0}, LFs6;->P(F)V

    return-void
.end method

.method public setVisibleYRange(FFLaI6$a;)V
    .locals 1

    invoke-virtual {p0, p3}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->e0(LaI6$a;)F

    move-result v0

    div-float/2addr v0, p1

    invoke-virtual {p0, p3}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->e0(LaI6$a;)F

    move-result p1

    div-float/2addr p1, p2

    iget-object p2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {p2, v0, p1}, LFs6;->Q(FF)V

    return-void
.end method

.method public setVisibleYRangeMaximum(FLaI6$a;)V
    .locals 0

    invoke-virtual {p0, p2}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->e0(LaI6$a;)F

    move-result p2

    div-float/2addr p2, p1

    iget-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {p1, p2}, LFs6;->S(F)V

    return-void
.end method

.method public setVisibleYRangeMinimum(FLaI6$a;)V
    .locals 0

    invoke-virtual {p0, p2}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->e0(LaI6$a;)F

    move-result p2

    div-float/2addr p2, p1

    iget-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-virtual {p1, p2}, LFs6;->O(F)V

    return-void
.end method

.method public u0()V
    .locals 5

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->x0:LD96;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    iget v2, v1, LXu;->H:F

    iget v1, v1, LXu;->I:F

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v4, v3, LXu;->I:F

    iget v3, v3, LXu;->H:F

    invoke-virtual {v0, v2, v1, v4, v3}, LD96;->m(FFFF)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->w0:LD96;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    iget v2, v1, LXu;->H:F

    iget v1, v1, LXu;->I:F

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget v4, v3, LXu;->I:F

    iget v3, v3, LXu;->H:F

    invoke-virtual {v0, v2, v1, v4, v3}, LD96;->m(FFFF)V

    return-void
.end method
