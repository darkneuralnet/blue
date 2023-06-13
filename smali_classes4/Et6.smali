.class public final LEt6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Landroid/widget/Space;

.field public final c:Lco/bird/android/widget/BannerView;

.field public final d:Lco/bird/android/widget/PillDropdownButton;

.field public final e:Lg56;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/widget/Space;Lco/bird/android/widget/BannerView;Lco/bird/android/widget/PillDropdownButton;Lg56;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEt6;->a:Landroid/view/View;

    iput-object p2, p0, LEt6;->b:Landroid/widget/Space;

    iput-object p3, p0, LEt6;->c:Lco/bird/android/widget/BannerView;

    iput-object p4, p0, LEt6;->d:Lco/bird/android/widget/PillDropdownButton;

    iput-object p5, p0, LEt6;->e:Lg56;

    return-void
.end method

.method public static a(Landroid/view/View;)LEt6;
    .locals 8

    sget v0, Lzi4;->bannerPlaceholder:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/Space;

    if-eqz v4, :cond_0

    sget v0, Lzi4;->bannerView:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lco/bird/android/widget/BannerView;

    if-eqz v5, :cond_0

    sget v0, Lzi4;->profileDropdown:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lco/bird/android/widget/PillDropdownButton;

    if-eqz v6, :cond_0

    sget v0, Lzi4;->toastMessage:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lg56;->a(Landroid/view/View;)Lg56;

    move-result-object v7

    new-instance v0, LEt6;

    move-object v2, v0

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, LEt6;-><init>(Landroid/view/View;Landroid/widget/Space;Lco/bird/android/widget/BannerView;Lco/bird/android/widget/PillDropdownButton;Lg56;)V

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

.method public static b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)LEt6;
    .locals 1

    if-eqz p1, :cond_0

    sget v0, Lmk4;->view_single_banner_flight:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-static {p1}, LEt6;->a(Landroid/view/View;)LEt6;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "parent"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LEt6;->a:Landroid/view/View;

    return-object v0
.end method
