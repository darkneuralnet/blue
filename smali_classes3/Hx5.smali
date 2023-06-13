.class public final LHx5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field public final b:Lco/bird/android/widget/SilenceableMaterialEditText;

.field public final c:Landroid/widget/LinearLayout;

.field public final d:Landroid/widget/TextView;

.field public final e:Lcom/google/android/gms/maps/MapView;

.field public final f:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

.field public final g:Landroid/widget/Button;

.field public final h:Lcom/google/android/material/progressindicator/LinearProgressIndicator;


# direct methods
.method public constructor <init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lco/bird/android/widget/SilenceableMaterialEditText;Landroid/widget/LinearLayout;Landroid/widget/TextView;Lcom/google/android/gms/maps/MapView;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroid/widget/Button;Lcom/google/android/material/progressindicator/LinearProgressIndicator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHx5;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iput-object p2, p0, LHx5;->b:Lco/bird/android/widget/SilenceableMaterialEditText;

    iput-object p3, p0, LHx5;->c:Landroid/widget/LinearLayout;

    iput-object p4, p0, LHx5;->d:Landroid/widget/TextView;

    iput-object p5, p0, LHx5;->e:Lcom/google/android/gms/maps/MapView;

    iput-object p6, p0, LHx5;->f:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    iput-object p7, p0, LHx5;->g:Landroid/widget/Button;

    iput-object p8, p0, LHx5;->h:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    return-void
.end method

.method public static a(Landroid/view/View;)LHx5;
    .locals 11

    sget v0, LAh4;->addressText:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lco/bird/android/widget/SilenceableMaterialEditText;

    if-eqz v4, :cond_0

    sget v0, LAh4;->dragView:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/LinearLayout;

    if-eqz v5, :cond_0

    sget v0, LAh4;->headsUpText:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/TextView;

    if-eqz v6, :cond_0

    sget v0, LAh4;->mapView:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/google/android/gms/maps/MapView;

    if-eqz v7, :cond_0

    sget v0, LAh4;->myLocationButton:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    if-eqz v8, :cond_0

    sget v0, LAh4;->next:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/widget/Button;

    if-eqz v9, :cond_0

    sget v0, LAh4;->progressBar:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    if-eqz v10, :cond_0

    new-instance v0, LHx5;

    move-object v3, p0

    check-cast v3, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-object v2, v0

    invoke-direct/range {v2 .. v10}, LHx5;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lco/bird/android/widget/SilenceableMaterialEditText;Landroid/widget/LinearLayout;Landroid/widget/TextView;Lcom/google/android/gms/maps/MapView;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroid/widget/Button;Lcom/google/android/material/progressindicator/LinearProgressIndicator;)V

    return-object v0

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

.method public static c(Landroid/view/LayoutInflater;)LHx5;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LHx5;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LHx5;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LHx5;
    .locals 2

    sget v0, Lmj4;->setup_location:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, LHx5;->a(Landroid/view/View;)LHx5;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;
    .locals 1

    iget-object v0, p0, LHx5;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LHx5;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v0

    return-object v0
.end method
