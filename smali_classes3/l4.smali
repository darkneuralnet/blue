.class public final Ll4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/drawerlayout/widget/DrawerLayout;

.field public final b:Landroid/widget/Button;

.field public final c:Landroidx/cardview/widget/CardView;

.field public final d:Landroid/widget/TextView;

.field public final e:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field public final f:Landroidx/drawerlayout/widget/DrawerLayout;

.field public final g:Landroid/widget/TextView;

.field public final h:Landroidx/recyclerview/widget/RecyclerView;

.field public final i:Lcom/guness/widget/NavigationView;

.field public final j:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

.field public final k:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method public constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout;Landroid/widget/Button;Landroidx/cardview/widget/CardView;Landroid/widget/TextView;Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroidx/drawerlayout/widget/DrawerLayout;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Lcom/guness/widget/NavigationView;Lcom/google/android/material/progressindicator/CircularProgressIndicator;Landroidx/appcompat/widget/Toolbar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll4;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    iput-object p2, p0, Ll4;->b:Landroid/widget/Button;

    iput-object p3, p0, Ll4;->c:Landroidx/cardview/widget/CardView;

    iput-object p4, p0, Ll4;->d:Landroid/widget/TextView;

    iput-object p5, p0, Ll4;->e:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iput-object p6, p0, Ll4;->f:Landroidx/drawerlayout/widget/DrawerLayout;

    iput-object p7, p0, Ll4;->g:Landroid/widget/TextView;

    iput-object p8, p0, Ll4;->h:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p9, p0, Ll4;->i:Lcom/guness/widget/NavigationView;

    iput-object p10, p0, Ll4;->j:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    iput-object p11, p0, Ll4;->k:Landroidx/appcompat/widget/Toolbar;

    return-void
.end method

.method public static a(Landroid/view/View;)Ll4;
    .locals 14

    sget v0, LBh4;->agreementActionButton:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/Button;

    if-eqz v4, :cond_0

    sget v0, LBh4;->agreementContainer:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroidx/cardview/widget/CardView;

    if-eqz v5, :cond_0

    sget v0, LBh4;->agreementHeaderTextView:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/TextView;

    if-eqz v6, :cond_0

    sget v0, LBh4;->container:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    if-eqz v7, :cond_0

    move-object v8, p0

    check-cast v8, Landroidx/drawerlayout/widget/DrawerLayout;

    sget v0, LBh4;->emptyMerchantHistory:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/widget/TextView;

    if-eqz v9, :cond_0

    sget v0, LBh4;->historyRecyclerView:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v10, :cond_0

    sget v0, LBh4;->navigationView:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/guness/widget/NavigationView;

    if-eqz v11, :cond_0

    sget v0, LBh4;->progressBar:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    if-eqz v12, :cond_0

    sget v0, LBh4;->toolbar:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Landroidx/appcompat/widget/Toolbar;

    if-eqz v13, :cond_0

    new-instance p0, Ll4;

    move-object v2, p0

    move-object v3, v8

    invoke-direct/range {v2 .. v13}, Ll4;-><init>(Landroidx/drawerlayout/widget/DrawerLayout;Landroid/widget/Button;Landroidx/cardview/widget/CardView;Landroid/widget/TextView;Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroidx/drawerlayout/widget/DrawerLayout;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Lcom/guness/widget/NavigationView;Lcom/google/android/material/progressindicator/CircularProgressIndicator;Landroidx/appcompat/widget/Toolbar;)V

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

.method public static c(Landroid/view/LayoutInflater;)Ll4;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Ll4;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Ll4;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Ll4;
    .locals 2

    sget v0, Loj4;->activity_merchant_history:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Ll4;->a(Landroid/view/View;)Ll4;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/drawerlayout/widget/DrawerLayout;
    .locals 1

    iget-object v0, p0, Ll4;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Ll4;->b()Landroidx/drawerlayout/widget/DrawerLayout;

    move-result-object v0

    return-object v0
.end method
