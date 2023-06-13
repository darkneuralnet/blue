.class public Lcom/github/mikephil/charting/charts/BubbleChart;
.super Lcom/github/mikephil/charting/charts/BarLineChartBase;
.source "SourceFile"

# interfaces
.implements Lf30;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/github/mikephil/charting/charts/BarLineChartBase<",
        "Le30;",
        ">;",
        "Lf30;"
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

    new-instance v0, Ld30;

    iget-object v1, p0, Lcom/github/mikephil/charting/charts/Chart;->t:Lhi0;

    iget-object v2, p0, Lcom/github/mikephil/charting/charts/Chart;->s:LFs6;

    invoke-direct {v0, p0, v1, v2}, Ld30;-><init>(Lf30;Lhi0;LFs6;)V

    iput-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->q:LRS0;

    return-void
.end method

.method public a()Le30;
    .locals 1

    iget-object v0, p0, Lcom/github/mikephil/charting/charts/Chart;->c:Lii0;

    check-cast v0, Le30;

    return-object v0
.end method
