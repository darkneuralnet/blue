.class public final LG5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field public final b:Landroidx/core/widget/NestedScrollView;

.field public final c:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field public final d:Lcom/google/android/gms/maps/MapView;

.field public final e:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

.field public final f:Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;


# direct methods
.method public constructor <init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroidx/core/widget/NestedScrollView;Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/gms/maps/MapView;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG5;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iput-object p2, p0, LG5;->b:Landroidx/core/widget/NestedScrollView;

    iput-object p3, p0, LG5;->c:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iput-object p4, p0, LG5;->d:Lcom/google/android/gms/maps/MapView;

    iput-object p5, p0, LG5;->e:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    iput-object p6, p0, LG5;->f:Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;

    return-void
.end method

.method public static a(Landroid/view/View;)LG5;
    .locals 9

    sget v0, LVg4;->bottom:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroidx/core/widget/NestedScrollView;

    if-eqz v4, :cond_0

    move-object v5, p0

    check-cast v5, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    sget v0, LVg4;->mapView:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/google/android/gms/maps/MapView;

    if-eqz v6, :cond_0

    sget v0, LVg4;->progressBar:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    if-eqz v7, :cond_0

    sget v0, LVg4;->rideSummaryView:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;

    if-eqz v8, :cond_0

    new-instance p0, LG5;

    move-object v2, p0

    move-object v3, v5

    invoke-direct/range {v2 .. v8}, LG5;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroidx/core/widget/NestedScrollView;Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/gms/maps/MapView;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;)V

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static c(Landroid/view/LayoutInflater;)LG5;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LG5;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LG5;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LG5;
    .locals 2

    sget v0, Lcj4;->activity_ride_detail:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, LG5;->a(Landroid/view/View;)LG5;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;
    .locals 1

    iget-object v0, p0, LG5;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LG5;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v0

    return-object v0
.end method
