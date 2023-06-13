.class public Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart;
.super Lcom/github/mikephil/charting/charts/LineChart;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$a;,
        Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0013\u0008\u0016\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014B\u001d\u0008\u0016\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0013\u0010\u0017B%\u0008\u0016\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0013\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017R\u001c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001c"
    }
    d2 = {
        "Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart;",
        "Lcom/github/mikephil/charting/charts/LineChart;",
        "Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;",
        "chart",
        "",
        "x0",
        "",
        "Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChartLine;",
        "J0",
        "Ljava/util/List;",
        "values",
        "",
        "K0",
        "Lkotlin/Lazy;",
        "w0",
        "()I",
        "xAxisTextColor",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "defStyle",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "L0",
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
        "SMAP\nTargetLineChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetLineChart.kt\nco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1179#2,2:120\n1253#2,4:122\n1963#2,14:126\n1549#2:140\n1620#2,2:141\n1569#2,11:143\n1864#2,2:154\n1866#2:157\n1580#2:158\n1622#2:159\n1#3:156\n*S KotlinDebug\n*F\n+ 1 TargetLineChart.kt\nco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart\n*L\n49#1:120,2\n49#1:122,4\n56#1:126,14\n60#1:140\n60#1:141,2\n61#1:143,11\n61#1:154,2\n61#1:157\n61#1:158\n60#1:159\n61#1:156\n*E\n"
    }
.end annotation


# static fields
.field public static final L0:Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$a;


# instance fields
.field public J0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChartLine;",
            ">;"
        }
    .end annotation
.end field

.field public final K0:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart;->L0:Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/github/mikephil/charting/charts/LineChart;-><init>(Landroid/content/Context;)V

    new-instance p1, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$d;

    invoke-direct {p1, p0}, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$d;-><init>(Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart;->K0:Lkotlin/Lazy;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/github/mikephil/charting/charts/LineChart;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$d;

    invoke-direct {p1, p0}, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$d;-><init>(Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart;->K0:Lkotlin/Lazy;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/github/mikephil/charting/charts/LineChart;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$d;

    invoke-direct {p1, p0}, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$d;-><init>(Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart;->K0:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public final w0()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart;->K0:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public x0(Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;)V
    .locals 14

    const-string v0, "chart"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->s()V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;->getLines()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart;->J0:Ljava/util/List;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;->getXAxisLabels()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->M()LtH6;

    move-result-object v1

    new-instance v2, Ls12;

    check-cast v0, Ljava/util/Collection;

    invoke-direct {v2, v0}, Ls12;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v2}, LXu;->O(LJj6;)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->M()LtH6;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart;->w0()I

    move-result v1

    invoke-virtual {v0, v1}, LNs0;->h(I)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;->getYAxis()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/persistence/nestedstructures/FleetReportChartAxis;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/FleetReportChartAxis;->getValue()D

    move-result-wide v4

    double-to-float v4, v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/FleetReportChartAxis;->getLabel()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->d0()LaI6;

    move-result-object v0

    new-instance v2, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$c;

    invoke-direct {v2, v3}, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$c;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, v2}, LXu;->O(LJj6;)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->d0()LaI6;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, LXu;->G(F)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->d0()LaI6;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;->getYAxis()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_1

    move-object v5, v6

    goto :goto_1

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_1

    :cond_2
    move-object v7, v5

    check-cast v7, Lco/bird/android/model/persistence/nestedstructures/FleetReportChartAxis;

    invoke-virtual {v7}, Lco/bird/android/model/persistence/nestedstructures/FleetReportChartAxis;->getValue()D

    move-result-wide v7

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lco/bird/android/model/persistence/nestedstructures/FleetReportChartAxis;

    invoke-virtual {v10}, Lco/bird/android/model/persistence/nestedstructures/FleetReportChartAxis;->getValue()D

    move-result-wide v10

    invoke-static {v7, v8, v10, v11}, Ljava/lang/Double;->compare(DD)I

    move-result v12

    if-gez v12, :cond_4

    move-object v5, v9

    move-wide v7, v10

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_3

    :goto_1
    check-cast v5, Lco/bird/android/model/persistence/nestedstructures/FleetReportChartAxis;

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/FleetReportChartAxis;->getValue()D

    move-result-wide v4

    double-to-float v4, v4

    goto :goto_2

    :cond_5
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    :goto_2
    invoke-virtual {v0, v4}, LXu;->F(F)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->d0()LaI6;

    move-result-object v0

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v4}, LXu;->L(IZ)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;->getLines()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChartLine;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChartLine;->getValues()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v8, v3

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v10, v8, 0x1

    if-gez v8, :cond_6

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_6
    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v11

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChartLine;->getNullValueIndexes()Ljava/util/List;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v9, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    move-object v9, v6

    goto :goto_5

    :cond_7
    new-instance v9, Lcom/github/mikephil/charting/data/Entry;

    int-to-float v8, v8

    double-to-float v11, v11

    invoke-direct {v9, v8, v11, v6}, Lcom/github/mikephil/charting/data/Entry;-><init>(FFLandroid/graphics/drawable/Drawable;)V

    :goto_5
    if-eqz v9, :cond_8

    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_8
    move v8, v10

    goto :goto_4

    :cond_9
    new-instance v5, Lmr2;

    const-string v8, ""

    invoke-direct {v5, v7, v8}, Lmr2;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChartLine;->getColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v7

    invoke-virtual {v7}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v7

    invoke-virtual {v5, v7}, LyA;->R0(I)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v7

    invoke-virtual {v5, v7}, Lwr2;->Z0(F)V

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChartLine;->getStroke()Lco/bird/android/model/constant/LineStroke;

    move-result-object v1

    sget-object v7, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v7, v1

    if-eq v1, v4, :cond_b

    const/4 v7, 0x2

    if-eq v1, v7, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v5}, Lmr2;->a1()V

    goto :goto_6

    :cond_b
    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v1

    invoke-virtual {v5, v7, v1, v2}, Lmr2;->b1(FFF)V

    :goto_6
    invoke-virtual {v5, v3}, LyA;->S0(Z)V

    invoke-virtual {v5, v3}, Lmr2;->d1(Z)V

    sget-object v1, Lmr2$a;->d:Lmr2$a;

    invoke-virtual {v5, v1}, Lmr2;->e1(Lmr2$a;)V

    const v1, 0x3dcccccd    # 0.1f

    invoke-virtual {v5, v1}, Lmr2;->c1(F)V

    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_c
    new-instance p1, Lkr2;

    invoke-direct {p1, v0}, Lkr2;-><init>(Ljava/util/List;)V

    invoke-virtual {p0, p1}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lii0;)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->d0()LaI6;

    move-result-object p1

    invoke-virtual {p1, v3}, LXu;->J(Z)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->M()LtH6;

    move-result-object p1

    const/high16 v0, -0x40800000    # -1.0f

    invoke-virtual {p1, v0}, LXu;->G(F)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->M()LtH6;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart;->J0:Ljava/util/List;

    if-nez v0, :cond_d

    const-string v0, "values"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_7

    :cond_d
    move-object v6, v0

    :goto_7
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40e00000    # 7.0f

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-virtual {p1, v0}, LXu;->F(F)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->M()LtH6;

    move-result-object p1

    sget-object v0, LtH6$a;->c:LtH6$a;

    invoke-virtual {p1, v0}, LtH6;->S(LtH6$a;)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->M()LtH6;

    move-result-object p1

    invoke-virtual {p1, v3}, LXu;->H(Z)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->d0()LaI6;

    move-result-object p1

    invoke-virtual {p1, v3}, LXu;->H(Z)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->f0()LaI6;

    move-result-object p1

    invoke-virtual {p1, v3}, LXu;->H(Z)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->f0()LaI6;

    move-result-object p1

    invoke-virtual {p1, v3}, LaI6;->e0(Z)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->f0()LaI6;

    move-result-object p1

    invoke-virtual {p1, v3}, LXu;->I(Z)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->A()Lx01;

    move-result-object p1

    invoke-virtual {p1, v3}, LNs0;->g(Z)V

    invoke-virtual {p0}, Lcom/github/mikephil/charting/charts/Chart;->I()Lfq2;

    move-result-object p1

    invoke-virtual {p1, v3}, LNs0;->g(Z)V

    invoke-virtual {p0, v3}, Lcom/github/mikephil/charting/charts/Chart;->setTouchEnabled(Z)V

    return-void
.end method
