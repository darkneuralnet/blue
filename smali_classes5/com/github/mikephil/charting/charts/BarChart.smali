.class public Lcom/github/mikephil/charting/charts/BarChart;
.super Lcom/github/mikephil/charting/charts/BarLineChartBase;
.source "SourceFile"

# interfaces
.implements Ltx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/github/mikephil/charting/charts/BarLineChartBase<",
        "Lsx;",
        ">;",
        "Ltx;"
    }
.end annotation


# instance fields
.field public J0:Z

.field public K0:Z

.field public L0:Z

.field public M0:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarChart;->J0:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarChart;->K0:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarChart;->L0:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarChart;->M0:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/github/mikephil/charting/charts/BarLineChartBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarChart;->J0:Z

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/BarChart;->K0:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarChart;->L0:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarChart;->M0:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/github/mikephil/charting/charts/BarLineChartBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarChart;->J0:Z

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/github/mikephil/charting/charts/BarChart;->K0:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarChart;->L0:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarChart;->M0:Z

    return-void
.end method


# virtual methods
.method public G(FF)LOM1;
    .locals 8

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    if-nez v0, :cond_0

    const-string p1, "MPAndroidChart"

    const-string p2, "Can\'t select by touch. No data set."

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->H()LuO1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LuO1;->a(FF)LOM1;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarChart;->f()Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p2, LOM1;

    invoke-virtual {p1}, LOM1;->h()F

    move-result v1

    invoke-virtual {p1}, LOM1;->j()F

    move-result v2

    invoke-virtual {p1}, LOM1;->i()F

    move-result v3

    invoke-virtual {p1}, LOM1;->k()F

    move-result v4

    invoke-virtual {p1}, LOM1;->d()I

    move-result v5

    const/4 v6, -0x1

    invoke-virtual {p1}, LOM1;->b()LaI6$a;

    move-result-object v7

    move-object v0, p2

    invoke-direct/range {v0 .. v7}, LOM1;-><init>(FFFFIILaI6$a;)V

    return-object p2

    :cond_2
    :goto_0
    return-object p1
.end method

.method public O()V
    .locals 3

    invoke-super {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->O()V

    new-instance v0, Lrx;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->t:Lhi0;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-direct {v0, p0, v1, v2}, Lrx;-><init>(Ltx;Lhi0;LFs6;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    new-instance v0, Lvx;

    invoke-direct {v0, p0}, Lvx;-><init>(Ltx;)V

    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/Chart;->setHighlighter(Lji0;)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->M()LtH6;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, LXu;->N(F)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->M()LtH6;

    move-result-object v0

    invoke-virtual {v0, v1}, LXu;->M(F)V

    return-void
.end method

.method public Z()V
    .locals 5

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarChart;->M0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v1, Lsx;

    invoke-virtual {v1}, Lii0;->m()F

    move-result v1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v2, Lsx;

    invoke-virtual {v2}, Lsx;->s()F

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v2, Lsx;

    invoke-virtual {v2}, Lii0;->l()F

    move-result v2

    iget-object v4, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v4, Lsx;

    invoke-virtual {v4}, Lsx;->s()F

    move-result v4

    div-float/2addr v4, v3

    add-float/2addr v2, v4

    invoke-virtual {v0, v1, v2}, LXu;->j(FF)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->j:LtH6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v1, Lsx;

    invoke-virtual {v1}, Lii0;->m()F

    move-result v1

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v2, Lsx;

    invoke-virtual {v2}, Lii0;->l()F

    move-result v2

    invoke-virtual {v0, v1, v2}, LXu;->j(FF)V

    :goto_0
    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->s0:LaI6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v1, Lsx;

    sget-object v2, LaI6$a;->b:LaI6$a;

    invoke-virtual {v1, v2}, Lii0;->q(LaI6$a;)F

    move-result v1

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v3, Lsx;

    invoke-virtual {v3, v2}, Lii0;->o(LaI6$a;)F

    move-result v2

    invoke-virtual {v0, v1, v2}, LaI6;->j(FF)V

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/BarLineChartBase;->t0:LaI6;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v1, Lsx;

    sget-object v2, LaI6$a;->c:LaI6$a;

    invoke-virtual {v1, v2}, Lii0;->q(LaI6$a;)F

    move-result v1

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v3, Lsx;

    invoke-virtual {v3, v2}, Lii0;->o(LaI6$a;)F

    move-result v2

    invoke-virtual {v0, v1, v2}, LaI6;->j(FF)V

    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarChart;->K0:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarChart;->J0:Z

    return v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/BarChart;->L0:Z

    return v0
.end method

.method public q()Lsx;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v0, Lsx;

    return-object v0
.end method

.method public setDrawBarShadow(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarChart;->L0:Z

    return-void
.end method

.method public setDrawValueAboveBar(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarChart;->K0:Z

    return-void
.end method

.method public setFitBars(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarChart;->M0:Z

    return-void
.end method

.method public setHighlightFullBarEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/BarChart;->J0:Z

    return-void
.end method
