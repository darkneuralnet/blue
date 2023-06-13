.class public final Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView;
.super Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$a;,
        Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0011\u0008\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rB\u0019\u0008\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u000c\u0010\u0010B!\u0008\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u000c\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\t\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\u0001H\u0002\u00a8\u0006\u0016"
    }
    d2 = {
        "Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView;",
        "Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;",
        "Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChart;",
        "chart",
        "",
        "C0",
        "",
        "Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartLine;",
        "barChart",
        "B0",
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
        "T0",
        "a",
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
        "SMAP\nFleetReportBarChartView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportBarChartView.kt\nco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1855#2:83\n1856#2:85\n1#3:84\n*S KotlinDebug\n*F\n+ 1 FleetReportBarChartView.kt\nco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView\n*L\n37#1:83\n37#1:85\n*E\n"
    }
.end annotation


# static fields
.field public static final T0:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView;->T0:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final B0(Ljava/util/List;Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartLine;",
            ">;",
            "Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartLine;

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartLine;->getFillDirection()Lco/bird/android/model/constant/TargetDirection;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    new-instance v2, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    sget v6, LJg4;->report_chart_line_fill:I

    invoke-static {v5, v6}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartLine;->getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v6

    invoke-virtual {v6}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v6

    invoke-static {v6, v3}, LJm0;->p(II)I

    move-result v6

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartLine;->getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v7

    const/16 v8, 0x36

    invoke-static {v7, v8}, LJm0;->p(II)I

    move-result v7

    invoke-virtual {v5}, Landroid/graphics/drawable/GradientDrawable;->mutate()Landroid/graphics/drawable/Drawable;

    sget-object v8, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v8, v0

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eq v0, v9, :cond_1

    if-eq v0, v8, :cond_0

    move-object v0, v1

    goto :goto_1

    :cond_0
    new-array v0, v8, [I

    aput v7, v0, v3

    aput v6, v0, v9

    goto :goto_1

    :cond_1
    new-array v0, v8, [I

    aput v6, v0, v3

    aput v7, v0, v9

    :goto_1
    invoke-virtual {v5, v0}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    invoke-virtual {v2, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    move-object v5, v2

    goto :goto_2

    :cond_2
    move-object v5, v1

    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v2, Laj4;->view_line_target_mark:I

    invoke-virtual {v0, v2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartLine;->getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v7, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$c;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView$c;-><init>(Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView;Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChartLine;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v0, v7}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto/16 :goto_0

    :cond_3
    return-void
.end method

.method public final C0(Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChart;)V
    .locals 1

    const-string v0, "chart"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChart;->getValues()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;->z0(Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChart;Ljava/util/List;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportBarChart;->getLines()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1, p0}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportBarChartView;->B0(Ljava/util/List;Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;)V

    return-void
.end method
