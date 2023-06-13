.class public final Lq4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroid/widget/FrameLayout;

.field public final b:Lcom/github/chrisbanes/photoview/PhotoView;

.field public final c:Lcom/google/android/material/progressindicator/CircularProgressIndicator;


# direct methods
.method public constructor <init>(Landroid/widget/FrameLayout;Lcom/github/chrisbanes/photoview/PhotoView;Lcom/google/android/material/progressindicator/CircularProgressIndicator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq4;->a:Landroid/widget/FrameLayout;

    iput-object p2, p0, Lq4;->b:Lcom/github/chrisbanes/photoview/PhotoView;

    iput-object p3, p0, Lq4;->c:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    return-void
.end method

.method public static a(Landroid/view/View;)Lq4;
    .locals 3

    sget v0, LVg4;->photoView:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/github/chrisbanes/photoview/PhotoView;

    if-eqz v1, :cond_0

    sget v0, LVg4;->progressBar:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    if-eqz v2, :cond_0

    new-instance v0, Lq4;

    check-cast p0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0, v1, v2}, Lq4;-><init>(Landroid/widget/FrameLayout;Lcom/github/chrisbanes/photoview/PhotoView;Lcom/google/android/material/progressindicator/CircularProgressIndicator;)V

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

.method public static c(Landroid/view/LayoutInflater;)Lq4;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lq4;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lq4;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lq4;
    .locals 2

    sget v0, Lcj4;->activity_nest_photo:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Lq4;->a(Landroid/view/View;)Lq4;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, Lq4;->a:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lq4;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    return-object v0
.end method
