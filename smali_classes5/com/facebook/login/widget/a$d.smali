.class public Lcom/facebook/login/widget/a$d;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/login/widget/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public b:Landroid/widget/ImageView;

.field public c:Landroid/widget/ImageView;

.field public d:Landroid/view/View;

.field public e:Landroid/widget/ImageView;

.field public final synthetic f:Lcom/facebook/login/widget/a;


# direct methods
.method public constructor <init>(Lcom/facebook/login/widget/a;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/login/widget/a$d;->f:Lcom/facebook/login/widget/a;

    invoke-direct {p0, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/facebook/login/widget/a$d;->e()V

    return-void
.end method

.method public static synthetic a(Lcom/facebook/login/widget/a$d;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/facebook/login/widget/a$d;->d:Landroid/view/View;

    return-object p0
.end method

.method public static synthetic b(Lcom/facebook/login/widget/a$d;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/facebook/login/widget/a$d;->c:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static synthetic c(Lcom/facebook/login/widget/a$d;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/facebook/login/widget/a$d;->b:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static synthetic d(Lcom/facebook/login/widget/a$d;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/facebook/login/widget/a$d;->e:Landroid/widget/ImageView;

    return-object p0
.end method


# virtual methods
.method public final e()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Luk4;->com_facebook_tooltip_bubble:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    sget v0, LIi4;->com_facebook_tooltip_bubble_view_top_pointer:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/login/widget/a$d;->b:Landroid/widget/ImageView;

    sget v0, LIi4;->com_facebook_tooltip_bubble_view_bottom_pointer:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/login/widget/a$d;->c:Landroid/widget/ImageView;

    sget v0, LIi4;->com_facebook_body_frame:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/login/widget/a$d;->d:Landroid/view/View;

    sget v0, LIi4;->com_facebook_button_xout:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/login/widget/a$d;->e:Landroid/widget/ImageView;

    return-void
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/login/widget/a$d;->b:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/facebook/login/widget/a$d;->c:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/login/widget/a$d;->b:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/facebook/login/widget/a$d;->c:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method
