.class public final Landroidx/camera/view/d;
.super Landroidx/camera/view/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/view/d$a;
    }
.end annotation


# instance fields
.field public e:Landroid/view/SurfaceView;

.field public final f:Landroidx/camera/view/d$a;


# direct methods
.method public constructor <init>(Landroid/widget/FrameLayout;Landroidx/camera/view/b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/view/c;-><init>(Landroid/widget/FrameLayout;Landroidx/camera/view/b;)V

    new-instance p1, Landroidx/camera/view/d$a;

    invoke-direct {p1, p0}, Landroidx/camera/view/d$a;-><init>(Landroidx/camera/view/d;)V

    iput-object p1, p0, Landroidx/camera/view/d;->f:Landroidx/camera/view/d$a;

    return-void
.end method

.method public static synthetic i(Landroidx/camera/view/d;Landroidx/camera/core/o;Landroidx/camera/view/c$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/view/d;->k(Landroidx/camera/core/o;Landroidx/camera/view/c$a;)V

    return-void
.end method

.method private synthetic k(Landroidx/camera/core/o;Landroidx/camera/view/c$a;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/view/d;->f:Landroidx/camera/view/d$a;

    invoke-virtual {v0, p1, p2}, Landroidx/camera/view/d$a;->f(Landroidx/camera/core/o;Landroidx/camera/view/c$a;)V

    return-void
.end method

.method public static l(Landroid/view/SurfaceView;Landroid/util/Size;Landroidx/camera/core/o;)Z
    .locals 0

    invoke-virtual {p2}, Landroidx/camera/core/o;->n()Landroid/util/Size;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/camera/view/d;->e:Landroid/view/SurfaceView;

    return-object v0
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public e(Landroidx/camera/core/o;Landroidx/camera/view/c$a;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/view/d;->e:Landroid/view/SurfaceView;

    iget-object v1, p0, Landroidx/camera/view/c;->a:Landroid/util/Size;

    invoke-static {v0, v1, p1}, Landroidx/camera/view/d;->l(Landroid/view/SurfaceView;Landroid/util/Size;Landroidx/camera/core/o;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroidx/camera/core/o;->n()Landroid/util/Size;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/view/c;->a:Landroid/util/Size;

    invoke-virtual {p0}, Landroidx/camera/view/d;->j()V

    :cond_0
    if-eqz p2, :cond_1

    iget-object v0, p0, Landroidx/camera/view/d;->e:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LNA0;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, LoW5;

    invoke-direct {v1, p2}, LoW5;-><init>(Landroidx/camera/view/c$a;)V

    invoke-virtual {p1, v0, v1}, Landroidx/camera/core/o;->j(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V

    :cond_1
    iget-object v0, p0, Landroidx/camera/view/d;->e:Landroid/view/SurfaceView;

    new-instance v1, LpW5;

    invoke-direct {v1, p0, p1, p2}, LpW5;-><init>(Landroidx/camera/view/d;Landroidx/camera/core/o;Landroidx/camera/view/c$a;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public g(Ljava/util/concurrent/Executor;Landroidx/camera/view/PreviewView$e;)V
    .locals 0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "SurfaceView doesn\'t support frame update listener"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, LIA1;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public j()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/view/c;->b:Landroid/widget/FrameLayout;

    invoke-static {v0}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Landroidx/camera/view/c;->a:Landroid/util/Size;

    invoke-static {v0}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Landroid/view/SurfaceView;

    iget-object v1, p0, Landroidx/camera/view/c;->b:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/camera/view/d;->e:Landroid/view/SurfaceView;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v2, p0, Landroidx/camera/view/c;->a:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v2

    iget-object v3, p0, Landroidx/camera/view/c;->a:Landroid/util/Size;

    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Landroidx/camera/view/c;->b:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v0, p0, Landroidx/camera/view/c;->b:Landroid/widget/FrameLayout;

    iget-object v1, p0, Landroidx/camera/view/d;->e:Landroid/view/SurfaceView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/camera/view/d;->e:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/view/d;->f:Landroidx/camera/view/d$a;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    return-void
.end method
