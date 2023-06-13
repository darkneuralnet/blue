.class public LFp6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Landroid/view/WindowManager;

.field public final c:Landroid/view/WindowManager$LayoutParams;

.field public final d:Landroid/widget/FrameLayout;

.field public final e:Landroid/view/ViewGroup$LayoutParams;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LFp6;->a:Landroid/view/View;

    const-string p2, "window"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/WindowManager;

    iput-object p2, p0, LFp6;->b:Landroid/view/WindowManager;

    invoke-static {}, LFp6;->d()Landroid/view/WindowManager$LayoutParams;

    move-result-object p2

    iput-object p2, p0, LFp6;->c:Landroid/view/WindowManager$LayoutParams;

    new-instance p2, Landroid/widget/FrameLayout;

    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, LFp6;->d:Landroid/widget/FrameLayout;

    invoke-static {}, LFp6;->c()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iput-object p1, p0, LFp6;->e:Landroid/view/ViewGroup$LayoutParams;

    return-void
.end method

.method public static synthetic a(LFp6;)V
    .locals 0

    invoke-direct {p0}, LFp6;->e()V

    return-void
.end method

.method public static c()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public static d()Landroid/view/WindowManager$LayoutParams;
    .locals 7

    new-instance v6, Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    const/16 v3, 0x3e8

    const v4, 0x1000218

    const/4 v5, -0x3

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    const-string v0, "ViewRenderableWindow"

    invoke-virtual {v6, v0}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    return-object v6
.end method

.method private synthetic e()V
    .locals 3

    iget-object v0, p0, LFp6;->d:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, LFp6;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LFp6;->b:Landroid/view/WindowManager;

    iget-object v1, p0, LFp6;->d:Landroid/widget/FrameLayout;

    iget-object v2, p0, LFp6;->c:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, LFp6;->d:Landroid/widget/FrameLayout;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LFp6;->e:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v1, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, LFp6;->d:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LFp6;->b:Landroid/view/WindowManager;

    iget-object v1, p0, LFp6;->d:Landroid/widget/FrameLayout;

    invoke-interface {v0, v1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, LFp6;->a:Landroid/view/View;

    new-instance v1, LEp6;

    invoke-direct {v1, p0}, LEp6;-><init>(LFp6;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public h(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, LFp6;->d:Landroid/widget/FrameLayout;

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method
