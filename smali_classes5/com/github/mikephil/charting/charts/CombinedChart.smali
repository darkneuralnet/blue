.class public Lcom/github/mikephil/charting/charts/CombinedChart;
.super Lcom/github/mikephil/charting/charts/BarLineChartBase;
.source "SourceFile"

# interfaces
.implements LUm0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/mikephil/charting/charts/CombinedChart$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/github/mikephil/charting/charts/BarLineChartBase<",
        "LTm0;",
        ">;",
        "LUm0;"
    }
.end annotation


# instance fields
.field public J0:Z

.field public K0:Z

.field public L0:Z

.field public M0:[Lcom/github/mikephil/charting/charts/CombinedChart$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/CombinedChart;->J0:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/CombinedChart;->K0:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/CombinedChart;->L0:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/github/mikephil/charting/charts/BarLineChartBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/CombinedChart;->J0:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/CombinedChart;->K0:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/CombinedChart;->L0:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/github/mikephil/charting/charts/BarLineChartBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/CombinedChart;->J0:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/CombinedChart;->K0:Z

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/CombinedChart;->L0:Z

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

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/CombinedChart;->f()Z

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
    .locals 4

    invoke-super {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->O()V

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/github/mikephil/charting/charts/CombinedChart$a;

    const/4 v1, 0x0

    sget-object v2, Lcom/github/mikephil/charting/charts/CombinedChart$a;->b:Lcom/github/mikephil/charting/charts/CombinedChart$a;

    aput-object v2, v0, v1

    sget-object v1, Lcom/github/mikephil/charting/charts/CombinedChart$a;->c:Lcom/github/mikephil/charting/charts/CombinedChart$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    sget-object v3, Lcom/github/mikephil/charting/charts/CombinedChart$a;->d:Lcom/github/mikephil/charting/charts/CombinedChart$a;

    aput-object v3, v0, v1

    const/4 v1, 0x3

    sget-object v3, Lcom/github/mikephil/charting/charts/CombinedChart$a;->e:Lcom/github/mikephil/charting/charts/CombinedChart$a;

    aput-object v3, v0, v1

    const/4 v1, 0x4

    sget-object v3, Lcom/github/mikephil/charting/charts/CombinedChart$a;->f:Lcom/github/mikephil/charting/charts/CombinedChart$a;

    aput-object v3, v0, v1

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/CombinedChart;->M0:[Lcom/github/mikephil/charting/charts/CombinedChart$a;

    new-instance v0, LVm0;

    invoke-direct {v0, p0, p0}, LVm0;-><init>(LUm0;Ltx;)V

    invoke-virtual {p0, v0}, Lcom/github/mikephil/charting/charts/Chart;->setHighlighter(Lji0;)V

    invoke-virtual {p0, v2}, Lcom/github/mikephil/charting/charts/CombinedChart;->setHighlightFullBarEnabled(Z)V

    new-instance v0, LSm0;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->t:Lhi0;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-direct {v0, p0, v1, v2}, LSm0;-><init>(Lcom/github/mikephil/charting/charts/CombinedChart;Lhi0;LFs6;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    return-void
.end method

.method public a()Le30;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    check-cast v0, LTm0;

    invoke-virtual {v0}, LTm0;->u()Le30;

    move-result-object v0

    return-object v0
.end method

.method public b()Lnm5;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    check-cast v0, LTm0;

    invoke-virtual {v0}, LTm0;->z()Lnm5;

    move-result-object v0

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/CombinedChart;->J0:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/CombinedChart;->K0:Z

    return v0
.end method

.method public k()Lkr2;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    check-cast v0, LTm0;

    invoke-virtual {v0}, LTm0;->y()Lkr2;

    move-result-object v0

    return-object v0
.end method

.method public l()LTm0;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v0, LTm0;

    return-object v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lcom/github/mikephil/charting/charts/CombinedChart;->L0:Z

    return v0
.end method

.method public n()Lfd0;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    check-cast v0, LTm0;

    invoke-virtual {v0}, LTm0;->v()Lfd0;

    move-result-object v0

    return-object v0
.end method

.method public q()Lsx;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    check-cast v0, LTm0;

    invoke-virtual {v0}, LTm0;->t()Lsx;

    move-result-object v0

    return-object v0
.end method

.method public setData(LTm0;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lii0;)V

    new-instance p1, LVm0;

    invoke-direct {p1, p0, p0}, LVm0;-><init>(LUm0;Ltx;)V

    invoke-virtual {p0, p1}, Lcom/github/mikephil/charting/charts/Chart;->setHighlighter(Lji0;)V

    iget-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    check-cast p1, LSm0;

    invoke-virtual {p1}, LSm0;->h()V

    iget-object p1, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    invoke-virtual {p1}, LRS0;->f()V

    return-void
.end method

.method public bridge synthetic setData(Lii0;)V
    .locals 0

    check-cast p1, LTm0;

    invoke-virtual {p0, p1}, Lcom/github/mikephil/charting/charts/CombinedChart;->setData(LTm0;)V

    return-void
.end method

.method public setDrawBarShadow(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/CombinedChart;->L0:Z

    return-void
.end method

.method public setDrawOrder([Lcom/github/mikephil/charting/charts/CombinedChart$a;)V
    .locals 1

    if-eqz p1, :cond_1

    array-length v0, p1

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lcom/github/mikephil/charting/charts/CombinedChart;->M0:[Lcom/github/mikephil/charting/charts/CombinedChart$a;

    :cond_1
    :goto_0
    return-void
.end method

.method public setDrawValueAboveBar(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/CombinedChart;->J0:Z

    return-void
.end method

.method public setHighlightFullBarEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/github/mikephil/charting/charts/CombinedChart;->K0:Z

    return-void
.end method

.method public v(Landroid/graphics/Canvas;)V
    .locals 9

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->C:LRO1;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->Q()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->X()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->z:[LOM1;

    array-length v3, v2

    if-ge v1, v3, :cond_4

    aget-object v2, v2, v1

    iget-object v3, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v3, LTm0;

    invoke-virtual {v3, v2}, LTm0;->x(LOM1;)LYN1;

    move-result-object v3

    iget-object v4, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v4, LTm0;

    invoke-virtual {v4, v2}, LTm0;->h(LOM1;)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v3, v4}, LoO1;->b(Lcom/github/mikephil/charting/data/Entry;)I

    move-result v5

    int-to-float v5, v5

    invoke-interface {v3}, LoO1;->L0()I

    move-result v3

    int-to-float v3, v3

    iget-object v6, p0, Lcom/github/mikephil/charting/charts/Chart;->t:Lhi0;

    invoke-virtual {v6}, Lhi0;->a()F

    move-result v6

    mul-float/2addr v3, v6

    cmpl-float v3, v5, v3

    if-lez v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v2}, Lcom/github/mikephil/charting/charts/Chart;->J(LOM1;)[F

    move-result-object v3

    iget-object v5, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    aget v6, v3, v0

    const/4 v7, 0x1

    aget v8, v3, v7

    invoke-virtual {v5, v6, v8}, LFs6;->x(FF)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_1

    :cond_3
    iget-object v5, p0, Lcom/github/mikephil/charting/charts/Chart;->C:LRO1;

    invoke-interface {v5, v4, v2}, LRO1;->b(Lcom/github/mikephil/charting/data/Entry;LOM1;)V

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->C:LRO1;

    aget v4, v3, v0

    aget v3, v3, v7

    invoke-interface {v2, p1, v4, v3}, LRO1;->a(Landroid/graphics/Canvas;FF)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    return-void
.end method

.method public w0()[Lcom/github/mikephil/charting/charts/CombinedChart$a;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/CombinedChart;->M0:[Lcom/github/mikephil/charting/charts/CombinedChart$a;

    return-object v0
.end method
