.class public final Ln6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Lco/bird/android/widget/BlockingEnterLocationView;

.field public final c:Landroidx/constraintlayout/widget/Group;

.field public final d:Landroid/view/View;

.field public final e:Lco/bird/android/widget/OperatorMapFilterButtonView;

.field public final f:Landroid/widget/Button;

.field public final g:Landroid/view/View;

.field public final h:Lco/bird/android/widget/OperatorInfoCard;

.field public final i:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lco/bird/android/widget/BlockingEnterLocationView;Landroidx/constraintlayout/widget/Group;Landroid/view/View;Lco/bird/android/widget/OperatorMapFilterButtonView;Landroid/widget/Button;Landroid/view/View;Lco/bird/android/widget/OperatorInfoCard;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Ln6;->b:Lco/bird/android/widget/BlockingEnterLocationView;

    iput-object p3, p0, Ln6;->c:Landroidx/constraintlayout/widget/Group;

    iput-object p4, p0, Ln6;->d:Landroid/view/View;

    iput-object p5, p0, Ln6;->e:Lco/bird/android/widget/OperatorMapFilterButtonView;

    iput-object p6, p0, Ln6;->f:Landroid/widget/Button;

    iput-object p7, p0, Ln6;->g:Landroid/view/View;

    iput-object p8, p0, Ln6;->h:Lco/bird/android/widget/OperatorInfoCard;

    iput-object p9, p0, Ln6;->i:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method public static a(Landroid/view/View;)Ln6;
    .locals 12

    sget v0, Ldi4;->blockEnterLocationOverlay:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lco/bird/android/widget/BlockingEnterLocationView;

    if-eqz v4, :cond_0

    sget v0, Ldi4;->containerOrderScanGroup:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroidx/constraintlayout/widget/Group;

    if-eqz v5, :cond_0

    sget v0, Ldi4;->divider:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_0

    sget v0, Ldi4;->filters:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lco/bird/android/widget/OperatorMapFilterButtonView;

    if-eqz v7, :cond_0

    sget v0, Ldi4;->footerButton:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/widget/Button;

    if-eqz v8, :cond_0

    sget v0, Ldi4;->footerDivider:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v9

    if-eqz v9, :cond_0

    sget v0, Ldi4;->operatorInfoCard:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lco/bird/android/widget/OperatorInfoCard;

    if-eqz v10, :cond_0

    sget v0, Ldi4;->recyclerView:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v11, :cond_0

    new-instance v0, Ln6;

    move-object v3, p0

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, Ln6;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lco/bird/android/widget/BlockingEnterLocationView;Landroidx/constraintlayout/widget/Group;Landroid/view/View;Lco/bird/android/widget/OperatorMapFilterButtonView;Landroid/widget/Button;Landroid/view/View;Lco/bird/android/widget/OperatorInfoCard;Landroidx/recyclerview/widget/RecyclerView;)V

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

.method public static c(Landroid/view/LayoutInflater;)Ln6;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Ln6;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Ln6;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Ln6;
    .locals 2

    sget v0, LQj4;->activity_transfer_order_landing:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Ln6;->a(Landroid/view/View;)Ln6;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    iget-object v0, p0, Ln6;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Ln6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    return-object v0
.end method
