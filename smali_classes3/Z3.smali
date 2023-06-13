.class public final LZ3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Lco/bird/android/widget/BlockingEnterLocationView;

.field public final c:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final d:Lco/bird/android/widget/OperatorInfoCard;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lco/bird/android/widget/BlockingEnterLocationView;Landroidx/constraintlayout/widget/ConstraintLayout;Lco/bird/android/widget/OperatorInfoCard;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ3;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, LZ3;->b:Lco/bird/android/widget/BlockingEnterLocationView;

    iput-object p3, p0, LZ3;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p4, p0, LZ3;->d:Lco/bird/android/widget/OperatorInfoCard;

    return-void
.end method

.method public static a(Landroid/view/View;)LZ3;
    .locals 4

    sget v0, Lai4;->blockEnterLocationOverlay:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lco/bird/android/widget/BlockingEnterLocationView;

    if-eqz v1, :cond_1

    move-object v0, p0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    sget v2, Lai4;->operatorInfoCard:I

    invoke-static {p0, v2}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lco/bird/android/widget/OperatorInfoCard;

    if-eqz v3, :cond_0

    new-instance p0, LZ3;

    invoke-direct {p0, v0, v1, v0, v3}, LZ3;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lco/bird/android/widget/BlockingEnterLocationView;Landroidx/constraintlayout/widget/ConstraintLayout;Lco/bird/android/widget/OperatorInfoCard;)V

    return-object p0

    :cond_0
    move v0, v2

    :cond_1
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

.method public static c(Landroid/view/LayoutInflater;)LZ3;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LZ3;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LZ3;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LZ3;
    .locals 2

    sget v0, LNj4;->activity_inventory_scan_proxy:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, LZ3;->a(Landroid/view/View;)LZ3;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    iget-object v0, p0, LZ3;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LZ3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    return-object v0
.end method
