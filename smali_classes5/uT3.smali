.class public abstract LuT3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LuO1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/github/mikephil/charting/charts/PieRadarChartBase;",
        ">",
        "Ljava/lang/Object;",
        "LuO1;"
    }
.end annotation


# instance fields
.field public a:Lcom/github/mikephil/charting/charts/PieRadarChartBase;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LOM1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/github/mikephil/charting/charts/PieRadarChartBase;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LuT3;->b:Ljava/util/List;

    iput-object p1, p0, LuT3;->a:Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    return-void
.end method


# virtual methods
.method public a(FF)LOM1;
    .locals 4

    iget-object v0, p0, LuT3;->a:Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0, p1, p2}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->Z(FF)F

    move-result v0

    iget-object v1, p0, LuT3;->a:Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->f0()F

    move-result v1

    cmpl-float v0, v0, v1

    const/4 v1, 0x0

    if-lez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, LuT3;->a:Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v0, p1, p2}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->a0(FF)F

    move-result v0

    iget-object v2, p0, LuT3;->a:Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    instance-of v3, v2, Lcom/github/mikephil/charting/charts/PieChart;

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->x()Lhi0;

    move-result-object v2

    invoke-virtual {v2}, Lhi0;->b()F

    move-result v2

    div-float/2addr v0, v2

    :cond_1
    iget-object v2, p0, LuT3;->a:Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v2, v0}, Lcom/github/mikephil/charting/charts/PieRadarChartBase;->c0(F)I

    move-result v0

    if-ltz v0, :cond_3

    iget-object v2, p0, LuT3;->a:Lcom/github/mikephil/charting/charts/PieRadarChartBase;

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lii0;

    move-result-object v2

    invoke-virtual {v2}, Lii0;->k()LoO1;

    move-result-object v2

    invoke-interface {v2}, LoO1;->L0()I

    move-result v2

    if-lt v0, v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0, p1, p2}, LuT3;->b(IFF)LOM1;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    return-object v1
.end method

.method public abstract b(IFF)LOM1;
.end method
