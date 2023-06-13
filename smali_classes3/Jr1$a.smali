.class public final LJr1$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJr1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LJr1$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LRb2;",
        "b",
        "LRb2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LJr1;Landroid/view/View;)V",
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
        "SMAP\nFleetsOverviewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetsOverviewAdapter.kt\nco/bird/android/feature/fleetstatus/common/fleets/adapters/FleetsOverviewAdapter$SummaryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n18#2:88\n9#3,4:89\n1549#4:93\n1620#4,3:94\n*S KotlinDebug\n*F\n+ 1 FleetsOverviewAdapter.kt\nco/bird/android/feature/fleetstatus/common/fleets/adapters/FleetsOverviewAdapter$SummaryViewHolder\n*L\n54#1:88\n54#1:89,4\n67#1:93\n67#1:94,3\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LRb2;

.field public final synthetic c:LJr1;


# direct methods
.method public constructor <init>(LJr1;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LJr1$a;->c:LJr1;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LRb2;->a(Landroid/view/View;)LRb2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LJr1$a;->b:LRb2;

    invoke-virtual {p2}, LRb2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LJr1$a$a;

    invoke-direct {v0, p0, p1}, LJr1$a$a;-><init>(LJr1$a;LJr1;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 14

    iget-object v0, p0, LJr1$a;->c:LJr1;

    invoke-static {v0}, LJr1;->access$getAdapterData(LJr1;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/FleetStatusSummary;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/FleetStatusSummary;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetStatusSummary;->getChart()Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, LJr1$a;->b:LRb2;

    iget-object v1, v1, LRb2;->d:Lco/bird/android/widget/PieChart;

    const-string v2, "bind$lambda$2$lambda$1"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ltu6;->r(Landroid/view/View;)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->getFromDegrees()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Lco/bird/android/widget/PieChart;->setStartDegrees(F)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->getFillStrategy()Lco/bird/android/model/constant/ChartFillStrategy;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/constant/ChartFillStrategy;->FILL_CLOCKWISE:Lco/bird/android/model/constant/ChartFillStrategy;

    if-ne v2, v3, :cond_1

    sget-object v2, Lco/bird/android/widget/PieChart$c;->b:Lco/bird/android/widget/PieChart$c;

    goto :goto_1

    :cond_1
    sget-object v2, Lco/bird/android/widget/PieChart$c;->c:Lco/bird/android/widget/PieChart$c;

    :goto_1
    invoke-virtual {v1, v2}, Lco/bird/android/widget/PieChart;->setDirection(Lco/bird/android/widget/PieChart$c;)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->getSections()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChartSection;

    new-instance v13, Lco/bird/android/widget/PieChart$b;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChartSection;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChartSection;->getPosition()I

    move-result v6

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChartSection;->getFillDegrees()I

    move-result v4

    int-to-float v7, v4

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChartSection;->getFillColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v8

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChartSection;->getFillHeight()F

    move-result v9

    const/4 v10, 0x0

    const/16 v11, 0x20

    const/4 v12, 0x0

    move-object v4, v13

    invoke-direct/range {v4 .. v12}, Lco/bird/android/widget/PieChart$b;-><init>(Ljava/lang/String;IFIFLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-virtual {v1, v2}, Lco/bird/android/widget/PieChart;->setData(Ljava/util/List;)V

    goto :goto_3

    :cond_3
    iget-object v0, p0, LJr1$a;->b:LRb2;

    iget-object v0, v0, LRb2;->d:Lco/bird/android/widget/PieChart;

    const-string v1, "binding.pieChart"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    :goto_3
    iget-object v0, p0, LJr1$a;->b:LRb2;

    iget-object v0, v0, LRb2;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetStatusSummary;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LJr1$a;->b:LRb2;

    iget-object v0, v0, LRb2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/FleetStatusSummary;->getDescription()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    return-void
.end method
