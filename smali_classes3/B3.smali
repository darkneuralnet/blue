.class public final LB3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroid/widget/FrameLayout;

.field public final b:Landroid/widget/FrameLayout;

.field public final c:Lcom/google/android/material/progressindicator/LinearProgressIndicator;


# direct methods
.method public constructor <init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Lcom/google/android/material/progressindicator/LinearProgressIndicator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3;->a:Landroid/widget/FrameLayout;

    iput-object p2, p0, LB3;->b:Landroid/widget/FrameLayout;

    iput-object p3, p0, LB3;->c:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    return-void
.end method

.method public static a(Landroid/view/View;)LB3;
    .locals 3

    move-object v0, p0

    check-cast v0, Landroid/widget/FrameLayout;

    sget v1, Lnh4;->progressBar:I

    invoke-static {p0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    if-eqz v2, :cond_0

    new-instance p0, LB3;

    invoke-direct {p0, v0, v0, v2}, LB3;-><init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Lcom/google/android/material/progressindicator/LinearProgressIndicator;)V

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static c(Landroid/view/LayoutInflater;)LB3;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LB3;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LB3;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LB3;
    .locals 2

    sget v0, Laj4;->activity_fleet:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, LB3;->a(Landroid/view/View;)LB3;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, LB3;->a:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LB3;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    return-object v0
.end method
