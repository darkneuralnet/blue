.class public final Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;
.super Landroidx/cardview/widget/CardView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aB\u0019\u0008\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u0019\u0010\u001dB!\u0008\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008\u0019\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0008\u0010\u0006\u001a\u00020\u0004H\u0002J\u0008\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0002J\u0010\u0010\u000c\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000bH\u0002J\u0008\u0010\u000e\u001a\u00020\rH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006!"
    }
    d2 = {
        "Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;",
        "Landroidx/cardview/widget/CardView;",
        "Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;",
        "panel",
        "",
        "w",
        "r",
        "s",
        "Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChart;",
        "chart",
        "u",
        "Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;",
        "v",
        "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;",
        "t",
        "Lbr6;",
        "k",
        "Lbr6;",
        "binding",
        "Landroid/view/View;",
        "l",
        "Landroid/view/View;",
        "chartView",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "co.bird.android.feature.fleet-status"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFleetReportPanelView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportPanelView.kt\nco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n1#2:127\n1549#3:128\n1620#3,3:129\n*S KotlinDebug\n*F\n+ 1 FleetReportPanelView.kt\nco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView\n*L\n102#1:128\n102#1:129,3\n*E\n"
    }
.end annotation


# instance fields
.field public final k:Lbr6;

.field public l:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lbr6;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lbr6;

    move-result-object p1

    const-string v0, "inflate(context.layoutInflater, this)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attrs"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lbr6;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lbr6;

    move-result-object p1

    const-string p2, "inflate(context.layoutInflater, this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attrs"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lbr6;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lbr6;

    move-result-object p1

    const-string p2, "inflate(context.layoutInflater, this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    return-void
.end method


# virtual methods
.method public final r()V
    .locals 3

    new-instance v0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->t()Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v1, v1, Lbr6;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v2, "binding.constraintLayout"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->l:Landroid/view/View;

    return-void
.end method

.method public final s()V
    .locals 3

    new-instance v0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportLineChartView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportLineChartView;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->t()Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v1, v1, Lbr6;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v2, "binding.constraintLayout"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->l:Landroid/view/View;

    return-void
.end method

.method public final t()Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;
    .locals 3

    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    sget v1, Lnh4;->legend:I

    iput v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->j:I

    sget v1, Lnh4;->constraintLayout:I

    iput v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->l:I

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v2

    float-to-int v2, v2

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-static {v1}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->x:I

    const-string v1, "H,309:236"

    iput-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->I:Ljava/lang/String;

    return-object v0
.end method

.method public final u(Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChart;)V
    .locals 3

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->l:Landroid/view/View;

    instance-of v1, v0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView;->C0(Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChart;)V

    :cond_1
    iget-object p1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object p1, p1, Lbr6;->g:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView;

    const-string v0, "binding.legend"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v1, v1, v0, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

.method public final v(Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;)V
    .locals 8

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->l:Landroid/view/View;

    instance-of v1, v0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportLineChartView;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportLineChartView;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart;->x0(Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;)V

    :cond_1
    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v0, v0, Lbr6;->g:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView;

    const-string v1, "binding.legend"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x2

    invoke-static {v0, v4, v3, v5, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;->getLines()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChartLine;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChartLine;->getStroke()Lco/bird/android/model/constant/LineStroke;

    move-result-object v3

    sget-object v6, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v6, v3

    if-eq v3, v4, :cond_4

    if-eq v3, v5, :cond_3

    const/4 v6, 0x3

    if-ne v3, v6, :cond_2

    sget-object v3, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;->b:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;

    goto :goto_2

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    sget-object v3, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;->c:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;

    goto :goto_2

    :cond_4
    sget-object v3, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;->b:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;

    :goto_2
    new-instance v6, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChartLine;->getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v7

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChartLine;->getLabel()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v6, v7, v2, v3}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;-><init>(ILjava/lang/String;Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;)V

    invoke-interface {v0, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object p1, p1, Lbr6;->g:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView;->setEntries(Ljava/util/List;)V

    return-void
.end method

.method public final w(Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;)V
    .locals 4

    const-string v0, "panel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v0, v0, Lbr6;->k:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v0, v0, Lbr6;->k:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;->getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v0, v0, Lbr6;->l:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;->getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v0, v0, Lbr6;->l:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "context"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;->getTargetValue()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v2, v2, Lbr6;->i:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v0, v0, Lbr6;->j:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lnl4;->target:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v0, v0, Lbr6;->i:Landroid/widget/TextView;

    const-string v2, "binding.targetValue"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v0, v0, Lbr6;->h:Landroid/widget/ImageView;

    const-string v2, "binding.targetIcon"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v0, v0, Lbr6;->j:Landroid/widget/TextView;

    const-string v2, "binding.targetValueMessage"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v0, v0, Lbr6;->e:Landroid/view/View;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;->getActualValue()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v1, v1, Lbr6;->b:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_2
    if-nez v1, :cond_3

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v0, v0, Lbr6;->b:Landroid/widget/TextView;

    const-string v1, "binding.actualValue"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v0, v0, Lbr6;->c:Landroid/widget/TextView;

    const-string v1, "binding.actualValueMessage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    :cond_3
    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;->getActualValueMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v1, v1, Lbr6;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;->getTargetValue()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;->getActualValue()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v0, v0, Lbr6;->e:Landroid/view/View;

    const-string v1, "binding.divider"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    :cond_5
    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;->getChart()Lco/bird/android/model/persistence/nestedstructures/FleetReportChart;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChart;

    if-eqz v0, :cond_6

    iget-object v1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->l:Landroid/view/View;

    instance-of v2, v1, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView;

    if-nez v2, :cond_6

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v0, v0, Lbr6;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-virtual {p0}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->r()V

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChart;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->u(Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChart;)V

    goto :goto_1

    :cond_6
    instance-of v1, p1, Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;

    if-eqz v1, :cond_7

    iget-object v2, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->l:Landroid/view/View;

    instance-of v3, v2, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportLineChartView;

    if-nez v3, :cond_7

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->k:Lbr6;

    iget-object v0, v0, Lbr6;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-virtual {p0}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->s()V

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->v(Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;)V

    goto :goto_1

    :cond_7
    if-eqz v0, :cond_8

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChart;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->u(Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChart;)V

    goto :goto_1

    :cond_8
    if-eqz v1, :cond_9

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->v(Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;)V

    :cond_9
    :goto_1
    return-void
.end method
