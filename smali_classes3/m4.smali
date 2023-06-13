.class public final Lm4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/drawerlayout/widget/DrawerLayout;

.field public final b:Landroid/widget/TextView;

.field public final c:Landroidx/appcompat/widget/SwitchCompat;

.field public final d:Landroidx/drawerlayout/widget/DrawerLayout;

.field public final e:Landroid/widget/TextView;

.field public final f:Landroid/widget/Button;

.field public final g:Landroidx/appcompat/widget/SwitchCompat;

.field public final h:Lcom/guness/widget/NavigationView;

.field public final i:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method public constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout;Landroid/widget/TextView;Landroidx/appcompat/widget/SwitchCompat;Landroidx/drawerlayout/widget/DrawerLayout;Landroid/widget/TextView;Landroid/widget/Button;Landroidx/appcompat/widget/SwitchCompat;Lcom/guness/widget/NavigationView;Landroidx/appcompat/widget/Toolbar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm4;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    iput-object p2, p0, Lm4;->b:Landroid/widget/TextView;

    iput-object p3, p0, Lm4;->c:Landroidx/appcompat/widget/SwitchCompat;

    iput-object p4, p0, Lm4;->d:Landroidx/drawerlayout/widget/DrawerLayout;

    iput-object p5, p0, Lm4;->e:Landroid/widget/TextView;

    iput-object p6, p0, Lm4;->f:Landroid/widget/Button;

    iput-object p7, p0, Lm4;->g:Landroidx/appcompat/widget/SwitchCompat;

    iput-object p8, p0, Lm4;->h:Lcom/guness/widget/NavigationView;

    iput-object p9, p0, Lm4;->i:Landroidx/appcompat/widget/Toolbar;

    return-void
.end method

.method public static a(Landroid/view/View;)Lm4;
    .locals 12

    sget v0, LBh4;->addressLabel:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_0

    sget v0, LBh4;->autoUpdateLocationSwitch:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroidx/appcompat/widget/SwitchCompat;

    if-eqz v5, :cond_0

    move-object v6, p0

    check-cast v6, Landroidx/drawerlayout/widget/DrawerLayout;

    sget v0, LBh4;->merchantAddress:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_0

    sget v0, LBh4;->merchantEditAddress:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/widget/Button;

    if-eqz v8, :cond_0

    sget v0, LBh4;->merchantOpenSwitch:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroidx/appcompat/widget/SwitchCompat;

    if-eqz v9, :cond_0

    sget v0, LBh4;->navigationView:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/guness/widget/NavigationView;

    if-eqz v10, :cond_0

    sget v0, LBh4;->toolbar:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Landroidx/appcompat/widget/Toolbar;

    if-eqz v11, :cond_0

    new-instance p0, Lm4;

    move-object v2, p0

    move-object v3, v6

    invoke-direct/range {v2 .. v11}, Lm4;-><init>(Landroidx/drawerlayout/widget/DrawerLayout;Landroid/widget/TextView;Landroidx/appcompat/widget/SwitchCompat;Landroidx/drawerlayout/widget/DrawerLayout;Landroid/widget/TextView;Landroid/widget/Button;Landroidx/appcompat/widget/SwitchCompat;Lcom/guness/widget/NavigationView;Landroidx/appcompat/widget/Toolbar;)V

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

.method public static c(Landroid/view/LayoutInflater;)Lm4;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lm4;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lm4;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lm4;
    .locals 2

    sget v0, Loj4;->activity_merchant_location:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Lm4;->a(Landroid/view/View;)Lm4;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/drawerlayout/widget/DrawerLayout;
    .locals 1

    iget-object v0, p0, Lm4;->a:Landroidx/drawerlayout/widget/DrawerLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lm4;->b()Landroidx/drawerlayout/widget/DrawerLayout;

    move-result-object v0

    return-object v0
.end method
