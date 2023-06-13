.class public final Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView;->B0(Ljava/util/List;Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "co/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$c",
        "Landroid/view/ViewTreeObserver$OnPreDrawListener;",
        "",
        "onPreDraw",
        "co.bird.android.feature.fleet-status"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView;

.field public final synthetic c:Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;

.field public final synthetic d:Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartLine;

.field public final synthetic e:Landroid/view/View;

.field public final synthetic f:Landroid/view/View;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView;Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartLine;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$c;->b:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView;

    iput-object p2, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$c;->c:Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;

    iput-object p3, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$c;->d:Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartLine;

    iput-object p4, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$c;->e:Landroid/view/View;

    iput-object p5, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$c;->f:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 6

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$c;->b:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$c;->c:Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;

    iget-object v1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$c;->d:Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartLine;

    invoke-virtual {v0, v1}, Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;->A0(Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartLine;)Lkotlin/Pair;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$c;->e:Landroid/view/View;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->left:I

    iget v4, v2, Landroid/graphics/Rect;->top:I

    iget v5, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v1, v3, v4, v5, v2}, Landroid/view/View;->layout(IIII)V

    invoke-static {v1}, Ltu6;->r(Landroid/view/View;)V

    :cond_0
    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    iget-object v1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$c;->f:Landroid/view/View;

    iget v2, v0, Landroid/graphics/Rect;->left:I

    iget v3, v0, Landroid/graphics/Rect;->top:I

    iget v4, v0, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v1, v2, v3, v4, v0}, Landroid/view/View;->layout(IIII)V

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$c;->f:Landroid/view/View;

    const-string v1, "targetMarkView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    const/4 v0, 0x1

    return v0
.end method
