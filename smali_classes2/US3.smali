.class public final LUS3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroid/widget/RelativeLayout;

.field public final b:Landroid/widget/Button;

.field public final c:Landroid/widget/LinearLayout;

.field public final d:Landroid/widget/RelativeLayout;

.field public final e:Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;

.field public final f:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

.field public final g:Landroid/widget/Button;

.field public final h:Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;


# direct methods
.method public constructor <init>(Landroid/widget/RelativeLayout;Landroid/widget/Button;Landroid/widget/LinearLayout;Landroid/widget/RelativeLayout;Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/Button;Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUS3;->a:Landroid/widget/RelativeLayout;

    iput-object p2, p0, LUS3;->b:Landroid/widget/Button;

    iput-object p3, p0, LUS3;->c:Landroid/widget/LinearLayout;

    iput-object p4, p0, LUS3;->d:Landroid/widget/RelativeLayout;

    iput-object p5, p0, LUS3;->e:Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;

    iput-object p6, p0, LUS3;->f:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    iput-object p7, p0, LUS3;->g:Landroid/widget/Button;

    iput-object p8, p0, LUS3;->h:Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;

    return-void
.end method

.method public static a(Landroid/view/View;)LUS3;
    .locals 11

    sget v0, LVg4;->button:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/Button;

    if-eqz v4, :cond_0

    sget v0, LVg4;->buttonContainer:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/LinearLayout;

    if-eqz v5, :cond_0

    move-object v6, p0

    check-cast v6, Landroid/widget/RelativeLayout;

    sget v0, LVg4;->pageIndicator:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;

    if-eqz v7, :cond_0

    sget v0, LVg4;->progressBar:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    if-eqz v8, :cond_0

    sget v0, LVg4;->secondaryButton:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/widget/Button;

    if-eqz v9, :cond_0

    sget v0, LVg4;->viewPager:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;

    if-eqz v10, :cond_0

    new-instance p0, LUS3;

    move-object v2, p0

    move-object v3, v6

    invoke-direct/range {v2 .. v10}, LUS3;-><init>(Landroid/widget/RelativeLayout;Landroid/widget/Button;Landroid/widget/LinearLayout;Landroid/widget/RelativeLayout;Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/Button;Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;)V

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

.method public static c(Landroid/view/LayoutInflater;)LUS3;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LUS3;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LUS3;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LUS3;
    .locals 2

    sget v0, Lcj4;->physical_lock_tutorial:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, LUS3;->a(Landroid/view/View;)LUS3;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, LUS3;->a:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LUS3;->b()Landroid/widget/RelativeLayout;

    move-result-object v0

    return-object v0
.end method
