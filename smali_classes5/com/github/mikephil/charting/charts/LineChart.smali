.class public Lcom/github/mikephil/charting/charts/LineChart;
.super Lcom/github/mikephil/charting/charts/BarLineChartBase;
.source "SourceFile"

# interfaces
.implements Llr2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/github/mikephil/charting/charts/BarLineChartBase<",
        "Lkr2;",
        ">;",
        "Llr2;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/github/mikephil/charting/charts/BarLineChartBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/github/mikephil/charting/charts/BarLineChartBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public O()V
    .locals 3

    invoke-super {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->O()V

    new-instance v0, Ljr2;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->t:Lhi0;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-direct {v0, p0, v1, v2}, Ljr2;-><init>(Llr2;Lhi0;LFs6;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    return-void
.end method

.method public k()Lkr2;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v0, Lkr2;

    return-object v0
.end method

.method public onDetachedFromWindow()V
    .locals 2

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    if-eqz v0, :cond_0

    instance-of v1, v0, Ljr2;

    if-eqz v1, :cond_0

    check-cast v0, Ljr2;

    invoke-virtual {v0}, Ljr2;->w()V

    :cond_0
    invoke-super {p0}, Lcom/github/mikephil/charting/charts/Chart;->onDetachedFromWindow()V

    return-void
.end method
