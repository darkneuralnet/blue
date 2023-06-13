.class public final Lp4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/core/widget/NestedScrollView;

.field public final b:LT33;

.field public final c:LU33;


# direct methods
.method public constructor <init>(Landroidx/core/widget/NestedScrollView;LT33;LU33;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp4;->a:Landroidx/core/widget/NestedScrollView;

    iput-object p2, p0, Lp4;->b:LT33;

    iput-object p3, p0, Lp4;->c:LU33;

    return-void
.end method

.method public static a(Landroid/view/View;)Lp4;
    .locals 3

    sget v0, LCh4;->details:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, LT33;->a(Landroid/view/View;)LT33;

    move-result-object v0

    sget v1, LCh4;->vehicles:I

    invoke-static {p0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v2}, LU33;->a(Landroid/view/View;)LU33;

    move-result-object v1

    new-instance v2, Lp4;

    check-cast p0, Landroidx/core/widget/NestedScrollView;

    invoke-direct {v2, p0, v0, v1}, Lp4;-><init>(Landroidx/core/widget/NestedScrollView;LT33;LU33;)V

    return-object v2

    :cond_0
    move v0, v1

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

.method public static c(Landroid/view/LayoutInflater;)Lp4;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lp4;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lp4;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lp4;
    .locals 2

    sget v0, Lpj4;->activity_nest_inventory_details:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Lp4;->a(Landroid/view/View;)Lp4;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/core/widget/NestedScrollView;
    .locals 1

    iget-object v0, p0, Lp4;->a:Landroidx/core/widget/NestedScrollView;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lp4;->b()Landroidx/core/widget/NestedScrollView;

    move-result-object v0

    return-object v0
.end method
