.class public final Lg5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Landroid/view/View;

.field public final c:Lco/bird/android/widget/BlockingEnterLocationView;

.field public final d:Landroid/widget/TextView;

.field public final e:Lco/bird/android/widget/OperatorInfoCard;

.field public final f:Landroid/widget/TextView;

.field public final g:Landroid/widget/Button;

.field public final h:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Lco/bird/android/widget/BlockingEnterLocationView;Landroid/widget/TextView;Lco/bird/android/widget/OperatorInfoCard;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lg5;->b:Landroid/view/View;

    iput-object p3, p0, Lg5;->c:Lco/bird/android/widget/BlockingEnterLocationView;

    iput-object p4, p0, Lg5;->d:Landroid/widget/TextView;

    iput-object p5, p0, Lg5;->e:Lco/bird/android/widget/OperatorInfoCard;

    iput-object p6, p0, Lg5;->f:Landroid/widget/TextView;

    iput-object p7, p0, Lg5;->g:Landroid/widget/Button;

    iput-object p8, p0, Lg5;->h:Landroid/widget/ImageView;

    return-void
.end method

.method public static a(Landroid/view/View;)Lg5;
    .locals 10

    sget v0, Lai4;->background:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    sget v0, Lai4;->blockEnterLocationOverlay:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lco/bird/android/widget/BlockingEnterLocationView;

    if-eqz v4, :cond_0

    sget v0, Lai4;->idBirdText:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_0

    sget v0, Lai4;->operatorInfoCard:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lco/bird/android/widget/OperatorInfoCard;

    if-eqz v6, :cond_0

    sget v0, Lai4;->scanBirdText:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_0

    sget v0, Lai4;->scanButton:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/widget/Button;

    if-eqz v8, :cond_0

    sget v0, Lai4;->scan_icon:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/widget/ImageView;

    if-eqz v9, :cond_0

    new-instance v0, Lg5;

    move-object v2, p0

    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lg5;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Lco/bird/android/widget/BlockingEnterLocationView;Landroid/widget/TextView;Lco/bird/android/widget/OperatorInfoCard;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/ImageView;)V

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

.method public static c(Landroid/view/LayoutInflater;)Lg5;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lg5;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lg5;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lg5;
    .locals 2

    sget v0, LNj4;->activity_repair_logger_scan:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Lg5;->a(Landroid/view/View;)Lg5;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    iget-object v0, p0, Lg5;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lg5;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    return-object v0
.end method
