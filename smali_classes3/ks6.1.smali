.class public final Lks6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Lco/bird/android/widget/NestBadgeView;

.field public final c:Landroidx/recyclerview/widget/RecyclerView;

.field public final d:Lco/bird/android/widget/NestMarkerPin;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lco/bird/android/widget/NestBadgeView;Landroidx/recyclerview/widget/RecyclerView;Lco/bird/android/widget/NestMarkerPin;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lks6;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lks6;->b:Lco/bird/android/widget/NestBadgeView;

    iput-object p3, p0, Lks6;->c:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p4, p0, Lks6;->d:Lco/bird/android/widget/NestMarkerPin;

    return-void
.end method

.method public static a(Landroid/view/View;)Lks6;
    .locals 4

    sget v0, LAh4;->badge:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lco/bird/android/widget/NestBadgeView;

    if-eqz v1, :cond_0

    sget v0, LAh4;->container:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v2, :cond_0

    sget v0, LAh4;->pin:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lco/bird/android/widget/NestMarkerPin;

    if-eqz v3, :cond_0

    new-instance v0, Lks6;

    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-direct {v0, p0, v1, v2, v3}, Lks6;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lco/bird/android/widget/NestBadgeView;Landroidx/recyclerview/widget/RecyclerView;Lco/bird/android/widget/NestMarkerPin;)V

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

.method public static c(Landroid/view/LayoutInflater;)Lks6;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lks6;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lks6;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lks6;
    .locals 2

    sget v0, Lmj4;->view_operator_nest_marker_expanded:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Lks6;->a(Landroid/view/View;)Lks6;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    iget-object v0, p0, Lks6;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lks6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    return-object v0
.end method
