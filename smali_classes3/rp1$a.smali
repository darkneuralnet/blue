.class public final Lrp1$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrp1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "Lrp1$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Ljf2;",
        "b",
        "Ljf2;",
        "binding",
        "",
        "c",
        "Ljava/lang/String;",
        "info",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lrp1;Landroid/view/View;)V",
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
        "SMAP\nFleetReportAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportAdapter.kt\nco/bird/android/feature/fleetstatus/kpi/core/adapter/FleetReportAdapter$ReportChartViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,104:1\n18#2:105\n9#3,4:106\n*S KotlinDebug\n*F\n+ 1 FleetReportAdapter.kt\nco/bird/android/feature/fleetstatus/kpi/core/adapter/FleetReportAdapter$ReportChartViewHolder\n*L\n97#1:105\n97#1:106,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Ljf2;

.field public c:Ljava/lang/String;

.field public final synthetic d:Lrp1;


# direct methods
.method public constructor <init>(Lrp1;Landroid/view/View;)V
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

    iput-object p1, p0, Lrp1$a;->d:Lrp1;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Ljf2;->a(Landroid/view/View;)Ljf2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lrp1$a;->b:Ljf2;

    invoke-virtual {p2}, Ljf2;->b()Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrp1$a$a;

    invoke-direct {v0, p0, p1}, Lrp1$a$a;-><init>(Lrp1$a;Lrp1;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic a(Lrp1$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lrp1$a;->c:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public bind(I)V
    .locals 1

    iget-object v0, p0, Lrp1$a;->d:Lrp1;

    invoke-static {v0}, Lrp1;->access$getAdapterData(Lrp1;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;->getInfo()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lrp1$a;->c:Ljava/lang/String;

    iget-object v0, p0, Lrp1$a;->b:Ljf2;

    invoke-virtual {v0}, Ljf2;->b()Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;

    move-result-object v0

    invoke-virtual {v0, p1}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;->w(Lco/bird/android/model/persistence/nestedstructures/FleetReportPanel;)V

    :cond_1
    return-void
.end method
