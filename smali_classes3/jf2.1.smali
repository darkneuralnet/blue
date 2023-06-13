.class public final Ljf2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;

.field public final b:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljf2;->a:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;

    iput-object p2, p0, Ljf2;->b:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;

    return-void
.end method

.method public static a(Landroid/view/View;)Ljf2;
    .locals 1

    if-eqz p0, :cond_0

    check-cast p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;

    new-instance v0, Ljf2;

    invoke-direct {v0, p0, p0}, Ljf2;-><init>(Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "rootView"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public b()Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;
    .locals 1

    iget-object v0, p0, Ljf2;->a:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Ljf2;->b()Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportPanelView;

    move-result-object v0

    return-object v0
.end method
