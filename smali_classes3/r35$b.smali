.class public final Lr35$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr35;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lr35$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lrf2;",
        "b",
        "Lrf2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lr35;Landroid/view/View;)V",
        "ride-end-summary_release"
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
        "SMAP\nRideReportAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideReportAdapter.kt\nco/bird/android/feature/rideendsummary/ridereport/adapters/RideReportAdapter$SummaryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,113:1\n18#2:114\n9#3,4:115\n*S KotlinDebug\n*F\n+ 1 RideReportAdapter.kt\nco/bird/android/feature/rideendsummary/ridereport/adapters/RideReportAdapter$SummaryViewHolder\n*L\n54#1:114\n54#1:115,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lrf2;

.field public final synthetic c:Lr35;


# direct methods
.method public constructor <init>(Lr35;Landroid/view/View;)V
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

    iput-object p1, p0, Lr35$b;->c:Lr35;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lrf2;->a(Landroid/view/View;)Lrf2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lr35$b;->b:Lrf2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 5

    iget-object v0, p0, Lr35$b;->c:Lr35;

    invoke-static {v0}, Lr35;->access$getAdapterData(Lr35;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/wire/WireRideDetail;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/wire/WireRideDetail;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideDetail;->getReport()Lco/bird/android/model/wire/WireRideReport;

    move-result-object v0

    const-string v1, "binding.available"

    const-string v2, "binding.pendingTitle"

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideDetail;->getReportStatus()Lco/bird/android/model/constant/RideReportStatus;

    move-result-object v0

    sget-object v3, Lco/bird/android/model/constant/RideReportStatus;->PENDING:Lco/bird/android/model/constant/RideReportStatus;

    if-ne v0, v3, :cond_1

    goto :goto_3

    :cond_1
    iget-object v0, p0, Lr35$b;->b:Lrf2;

    iget-object v0, v0, Lrf2;->i:Landroid/widget/TextView;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, Lr35$b;->b:Lrf2;

    iget-object v0, v0, Lrf2;->b:Landroidx/constraintlayout/widget/Group;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, Lr35$b;->b:Lrf2;

    iget-object v0, v0, Lrf2;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideDetail;->getDistance()Ljava/lang/String;

    move-result-object v1

    const-string v2, "--"

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lr35$b;->b:Lrf2;

    iget-object v0, v0, Lrf2;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v3, Lnl4;->lbs_format:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideDetail;->getReport()Lco/bird/android/model/wire/WireRideReport;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideReport;->getCo2SavedLbs()Ljava/lang/Double;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    move-object v2, p1

    :cond_4
    :goto_2
    const/4 p1, 0x0

    aput-object v2, v4, p1

    invoke-virtual {v1, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    :cond_5
    :goto_3
    iget-object p1, p0, Lr35$b;->b:Lrf2;

    iget-object p1, p1, Lrf2;->i:Landroid/widget/TextView;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->r(Landroid/view/View;)V

    iget-object p1, p0, Lr35$b;->b:Lrf2;

    iget-object p1, p1, Lrf2;->b:Landroidx/constraintlayout/widget/Group;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->l(Landroid/view/View;)V

    :cond_6
    :goto_4
    return-void
.end method
