.class public Landroidx/camera/view/PreviewView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/l$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/view/PreviewView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/camera/view/PreviewView;


# direct methods
.method public constructor <init>(Landroidx/camera/view/PreviewView;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Landroidx/camera/view/PreviewView$a;Landroidx/camera/view/a;LLb0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/view/PreviewView$a;->g(Landroidx/camera/view/a;LLb0;)V

    return-void
.end method

.method public static synthetic c(Landroidx/camera/view/PreviewView$a;LLb0;Landroidx/camera/core/o;Landroidx/camera/core/o$h;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/view/PreviewView$a;->f(LLb0;Landroidx/camera/core/o;Landroidx/camera/core/o$h;)V

    return-void
.end method

.method public static synthetic d(Landroidx/camera/view/PreviewView$a;Landroidx/camera/core/o;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/view/PreviewView$a;->e(Landroidx/camera/core/o;)V

    return-void
.end method

.method private synthetic e(Landroidx/camera/core/o;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v0, v0, Landroidx/camera/view/PreviewView;->p:Landroidx/camera/core/l$c;

    invoke-interface {v0, p1}, Landroidx/camera/core/l$c;->a(Landroidx/camera/core/o;)V

    return-void
.end method

.method private synthetic f(LLb0;Landroidx/camera/core/o;Landroidx/camera/core/o$h;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Preview transformation info updated. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PreviewView"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, LLb0;->d()LKb0;

    move-result-object p1

    invoke-interface {p1}, LJb0;->b()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v2, 0x1

    if-nez p1, :cond_0

    const-string p1, "The lens facing is null, probably an external."

    invoke-static {v1, p1}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    move p1, v2

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move p1, v0

    :goto_1
    iget-object v1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v1, v1, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    invoke-virtual {p2}, Landroidx/camera/core/o;->n()Landroid/util/Size;

    move-result-object p2

    invoke-virtual {v1, p3, p2, p1}, Landroidx/camera/view/b;->p(Landroidx/camera/core/o$h;Landroid/util/Size;Z)V

    invoke-virtual {p3}, Landroidx/camera/core/o$h;->c()I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_3

    iget-object p1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object p2, p1, Landroidx/camera/view/PreviewView;->c:Landroidx/camera/view/c;

    if-eqz p2, :cond_2

    instance-of p2, p2, Landroidx/camera/view/d;

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    iput-boolean v0, p1, Landroidx/camera/view/PreviewView;->e:Z

    goto :goto_3

    :cond_3
    :goto_2
    iget-object p1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iput-boolean v2, p1, Landroidx/camera/view/PreviewView;->e:Z

    :goto_3
    iget-object p1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    invoke-virtual {p1}, Landroidx/camera/view/PreviewView;->l()V

    return-void
.end method

.method private synthetic g(Landroidx/camera/view/a;LLb0;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v0, v0, Landroidx/camera/view/PreviewView;->g:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Li24;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Landroidx/camera/view/PreviewView$h;->b:Landroidx/camera/view/PreviewView$h;

    invoke-virtual {p1, v0}, Landroidx/camera/view/a;->l(Landroidx/camera/view/PreviewView$h;)V

    :cond_0
    invoke-virtual {p1}, Landroidx/camera/view/a;->f()V

    invoke-interface {p2}, LLb0;->j()LZd3;

    move-result-object p2

    invoke-interface {p2, p1}, LZd3;->b(LZd3$a;)V

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/o;)V
    .locals 5

    invoke-static {}, LO36;->c()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LNA0;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lj24;

    invoke-direct {v1, p0, p1}, Lj24;-><init>(Landroidx/camera/view/PreviewView$a;Landroidx/camera/core/o;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    const-string v0, "PreviewView"

    const-string v1, "Surface requested by Preview."

    invoke-static {v0, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/camera/core/o;->k()LLb0;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    invoke-interface {v0}, LLb0;->d()LKb0;

    move-result-object v2

    iput-object v2, v1, Landroidx/camera/view/PreviewView;->l:LKb0;

    iget-object v1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LNA0;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lk24;

    invoke-direct {v2, p0, v0, p1}, Lk24;-><init>(Landroidx/camera/view/PreviewView$a;LLb0;Landroidx/camera/core/o;)V

    invoke-virtual {p1, v1, v2}, Landroidx/camera/core/o;->B(Ljava/util/concurrent/Executor;Landroidx/camera/core/o$i;)V

    iget-object v1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v2, v1, Landroidx/camera/view/PreviewView;->c:Landroidx/camera/view/c;

    iget-object v1, v1, Landroidx/camera/view/PreviewView;->b:Landroidx/camera/view/PreviewView$d;

    invoke-static {v2, p1, v1}, Landroidx/camera/view/PreviewView;->m(Landroidx/camera/view/c;Landroidx/camera/core/o;Landroidx/camera/view/PreviewView$d;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v2, v1, Landroidx/camera/view/PreviewView;->b:Landroidx/camera/view/PreviewView$d;

    invoke-static {p1, v2}, Landroidx/camera/view/PreviewView;->n(Landroidx/camera/core/o;Landroidx/camera/view/PreviewView$d;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Landroidx/camera/view/e;

    iget-object v3, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v4, v3, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    invoke-direct {v2, v3, v4}, Landroidx/camera/view/e;-><init>(Landroid/widget/FrameLayout;Landroidx/camera/view/b;)V

    goto :goto_0

    :cond_1
    new-instance v2, Landroidx/camera/view/d;

    iget-object v3, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v4, v3, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    invoke-direct {v2, v3, v4}, Landroidx/camera/view/d;-><init>(Landroid/widget/FrameLayout;Landroidx/camera/view/b;)V

    :goto_0
    iput-object v2, v1, Landroidx/camera/view/PreviewView;->c:Landroidx/camera/view/c;

    :cond_2
    new-instance v1, Landroidx/camera/view/a;

    invoke-interface {v0}, LLb0;->d()LKb0;

    move-result-object v2

    iget-object v3, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v4, v3, Landroidx/camera/view/PreviewView;->f:LuX2;

    iget-object v3, v3, Landroidx/camera/view/PreviewView;->c:Landroidx/camera/view/c;

    invoke-direct {v1, v2, v4, v3}, Landroidx/camera/view/a;-><init>(LKb0;LuX2;Landroidx/camera/view/c;)V

    iget-object v2, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v2, v2, Landroidx/camera/view/PreviewView;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-interface {v0}, LLb0;->j()LZd3;

    move-result-object v2

    iget-object v3, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, LNA0;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-interface {v2, v3, v1}, LZd3;->c(Ljava/util/concurrent/Executor;LZd3$a;)V

    iget-object v2, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v2, v2, Landroidx/camera/view/PreviewView;->c:Landroidx/camera/view/c;

    new-instance v3, Ll24;

    invoke-direct {v3, p0, v1, v0}, Ll24;-><init>(Landroidx/camera/view/PreviewView$a;Landroidx/camera/view/a;LLb0;)V

    invoke-virtual {v2, p1, v3}, Landroidx/camera/view/c;->e(Landroidx/camera/core/o;Landroidx/camera/view/c$a;)V

    iget-object p1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
