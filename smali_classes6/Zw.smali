.class public final LZw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroid/widget/FrameLayout;

.field public final b:Landroid/widget/FrameLayout;

.field public final c:Landroidx/appcompat/widget/AppCompatImageView;

.field public final d:Lcom/skydoves/balloon/radius/RadiusLayout;

.field public final e:Landroid/widget/FrameLayout;

.field public final f:Lcom/skydoves/balloon/vectortext/VectorTextView;

.field public final g:Landroid/widget/FrameLayout;


# direct methods
.method public constructor <init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroidx/appcompat/widget/AppCompatImageView;Lcom/skydoves/balloon/radius/RadiusLayout;Landroid/widget/FrameLayout;Lcom/skydoves/balloon/vectortext/VectorTextView;Landroid/widget/FrameLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZw;->a:Landroid/widget/FrameLayout;

    iput-object p2, p0, LZw;->b:Landroid/widget/FrameLayout;

    iput-object p3, p0, LZw;->c:Landroidx/appcompat/widget/AppCompatImageView;

    iput-object p4, p0, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    iput-object p5, p0, LZw;->e:Landroid/widget/FrameLayout;

    iput-object p6, p0, LZw;->f:Lcom/skydoves/balloon/vectortext/VectorTextView;

    iput-object p7, p0, LZw;->g:Landroid/widget/FrameLayout;

    return-void
.end method

.method public static a(Landroid/view/View;)LZw;
    .locals 8

    move-object v2, p0

    check-cast v2, Landroid/widget/FrameLayout;

    sget v0, LLi4;->balloon_arrow:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroidx/appcompat/widget/AppCompatImageView;

    if-eqz v3, :cond_0

    sget v0, LLi4;->balloon_card:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/skydoves/balloon/radius/RadiusLayout;

    if-eqz v4, :cond_0

    sget v0, LLi4;->balloon_content:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/FrameLayout;

    if-eqz v5, :cond_0

    sget v0, LLi4;->balloon_text:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/skydoves/balloon/vectortext/VectorTextView;

    if-eqz v6, :cond_0

    sget v0, LLi4;->balloon_wrapper:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/FrameLayout;

    if-eqz v7, :cond_0

    new-instance p0, LZw;

    move-object v0, p0

    move-object v1, v2

    invoke-direct/range {v0 .. v7}, LZw;-><init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroidx/appcompat/widget/AppCompatImageView;Lcom/skydoves/balloon/radius/RadiusLayout;Landroid/widget/FrameLayout;Lcom/skydoves/balloon/vectortext/VectorTextView;Landroid/widget/FrameLayout;)V

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

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LZw;
    .locals 2

    sget v0, Lxk4;->balloon_layout_body:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, LZw;->a(Landroid/view/View;)LZw;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, LZw;->a:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LZw;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    return-object v0
.end method
