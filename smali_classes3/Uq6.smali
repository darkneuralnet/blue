.class public final LUq6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroid/widget/FrameLayout;

.field public final b:Landroid/widget/FrameLayout;

.field public final c:LDt6;


# direct methods
.method public constructor <init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;LDt6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUq6;->a:Landroid/widget/FrameLayout;

    iput-object p2, p0, LUq6;->b:Landroid/widget/FrameLayout;

    iput-object p3, p0, LUq6;->c:LDt6;

    return-void
.end method

.method public static a(Landroid/view/View;)LUq6;
    .locals 3

    move-object v0, p0

    check-cast v0, Landroid/widget/FrameLayout;

    sget v1, Lvi4;->sideMenuBanner:I

    invoke-static {p0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v2}, LDt6;->a(Landroid/view/View;)LDt6;

    move-result-object p0

    new-instance v1, LUq6;

    invoke-direct {v1, v0, v0, p0}, LUq6;-><init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;LDt6;)V

    return-object v1

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


# virtual methods
.method public b()Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, LUq6;->a:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LUq6;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    return-object v0
.end method
