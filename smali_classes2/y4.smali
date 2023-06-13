.class public final Ly4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/drawerlayout/widget/DrawerLayout;

.field public final b:Lcom/google/android/material/appbar/AppBarLayout;

.field public final c:Lco/bird/android/widget/PermissionStatusView;

.field public final d:Lco/bird/android/widget/PermissionStatusView;

.field public final e:Landroidx/drawerlayout/widget/DrawerLayout;

.field public final f:Lco/bird/android/widget/PermissionStatusView;

.field public final g:Landroidx/constraintlayout/widget/Guideline;

.field public final h:Lcom/google/android/material/navigation/NavigationView;

.field public final i:Lco/bird/android/widget/PermissionStatusView;

.field public final j:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final k:Landroid/widget/TextView;

.field public final l:Landroid/widget/TextView;

.field public final m:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method public constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout;Lcom/google/android/material/appbar/AppBarLayout;Lco/bird/android/widget/PermissionStatusView;Lco/bird/android/widget/PermissionStatusView;Landroidx/drawerlayout/widget/DrawerLayout;Lco/bird/android/widget/PermissionStatusView;Landroidx/constraintlayout/widget/Guideline;Lcom/google/android/material/navigation/NavigationView;Lco/bird/android/widget/PermissionStatusView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/appcompat/widget/Toolbar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    iput-object p2, p0, Ly4;->b:Lcom/google/android/material/appbar/AppBarLayout;

    iput-object p3, p0, Ly4;->c:Lco/bird/android/widget/PermissionStatusView;

    iput-object p4, p0, Ly4;->d:Lco/bird/android/widget/PermissionStatusView;

    iput-object p5, p0, Ly4;->e:Landroidx/drawerlayout/widget/DrawerLayout;

    iput-object p6, p0, Ly4;->f:Lco/bird/android/widget/PermissionStatusView;

    iput-object p7, p0, Ly4;->g:Landroidx/constraintlayout/widget/Guideline;

    iput-object p8, p0, Ly4;->h:Lcom/google/android/material/navigation/NavigationView;

    iput-object p9, p0, Ly4;->i:Lco/bird/android/widget/PermissionStatusView;

    iput-object p10, p0, Ly4;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p11, p0, Ly4;->k:Landroid/widget/TextView;

    iput-object p12, p0, Ly4;->l:Landroid/widget/TextView;

    iput-object p13, p0, Ly4;->m:Landroidx/appcompat/widget/Toolbar;

    return-void
.end method

.method public static a(Landroid/view/View;)Ly4;
    .locals 17

    move-object/from16 v0, p0

    sget v1, LVg4;->appBar:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/google/android/material/appbar/AppBarLayout;

    if-eqz v5, :cond_0

    sget v1, LVg4;->bluetoothPermissionStatus:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lco/bird/android/widget/PermissionStatusView;

    if-eqz v6, :cond_0

    sget v1, LVg4;->cameraPermissionStatus:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lco/bird/android/widget/PermissionStatusView;

    if-eqz v7, :cond_0

    move-object v8, v0

    check-cast v8, Landroidx/drawerlayout/widget/DrawerLayout;

    sget v1, LVg4;->locationPermissionStatus:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lco/bird/android/widget/PermissionStatusView;

    if-eqz v9, :cond_0

    sget v1, LVg4;->middle_guideline:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v10, :cond_0

    sget v1, LVg4;->navigationView:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lcom/google/android/material/navigation/NavigationView;

    if-eqz v11, :cond_0

    sget v1, LVg4;->notificationPermissionStatus:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lco/bird/android/widget/PermissionStatusView;

    if-eqz v12, :cond_0

    sget v1, LVg4;->permissionRequiredContentContainer:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v13, :cond_0

    sget v1, LVg4;->permissionRequiredHeader:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/widget/TextView;

    if-eqz v14, :cond_0

    sget v1, LVg4;->permissionRequiredSubheader:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroid/widget/TextView;

    if-eqz v15, :cond_0

    sget v1, LVg4;->toolbar:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroidx/appcompat/widget/Toolbar;

    if-eqz v16, :cond_0

    new-instance v0, Ly4;

    move-object v3, v0

    move-object v4, v8

    invoke-direct/range {v3 .. v16}, Ly4;-><init>(Landroidx/drawerlayout/widget/DrawerLayout;Lcom/google/android/material/appbar/AppBarLayout;Lco/bird/android/widget/PermissionStatusView;Lco/bird/android/widget/PermissionStatusView;Landroidx/drawerlayout/widget/DrawerLayout;Lco/bird/android/widget/PermissionStatusView;Landroidx/constraintlayout/widget/Guideline;Lcom/google/android/material/navigation/NavigationView;Lco/bird/android/widget/PermissionStatusView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/appcompat/widget/Toolbar;)V

    return-object v0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static c(Landroid/view/LayoutInflater;)Ly4;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Ly4;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Ly4;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Ly4;
    .locals 2

    sget v0, Lcj4;->activity_operator_permissions_required:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Ly4;->a(Landroid/view/View;)Ly4;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/drawerlayout/widget/DrawerLayout;
    .locals 1

    iget-object v0, p0, Ly4;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Ly4;->b()Landroidx/drawerlayout/widget/DrawerLayout;

    move-result-object v0

    return-object v0
.end method
