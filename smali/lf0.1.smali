.class public Llf0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llf0$b;,
        Llf0$c;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lf74;

.field public c:Landroidx/camera/core/n;

.field public d:Llf0$c;

.field public e:Llf0$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Llf0;->a:Ljava/util/Set;

    const/4 v0, 0x0

    iput-object v0, p0, Llf0;->b:Lf74;

    return-void
.end method

.method public static synthetic a(Llf0;LKX1;)V
    .locals 0

    invoke-direct {p0, p1}, Llf0;->c(LKX1;)V

    return-void
.end method

.method private synthetic c(LKX1;)V
    .locals 3

    const-string v0, "Failed to acquire latest image"

    const/4 v1, 0x2

    :try_start_0
    invoke-interface {p1}, LKX1;->g()Landroidx/camera/core/i;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Llf0;->e(Landroidx/camera/core/i;)V

    goto :goto_0

    :cond_0
    new-instance p1, Landroidx/camera/core/ImageCaptureException;

    const/4 v2, 0x0

    invoke-direct {p1, v1, v0, v2}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Llf0;->i(Landroidx/camera/core/ImageCaptureException;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v2, Landroidx/camera/core/ImageCaptureException;

    invoke-direct {v2, v1, v0, p1}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v2}, Llf0;->i(Landroidx/camera/core/ImageCaptureException;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public b()I
    .locals 2

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Llf0;->c:Landroidx/camera/core/n;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The ImageReader is not initialized."

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    iget-object v0, p0, Llf0;->c:Landroidx/camera/core/n;

    invoke-virtual {v0}, Landroidx/camera/core/n;->j()I

    move-result v0

    return v0
.end method

.method public final d(Landroidx/camera/core/i;)V
    .locals 4

    invoke-interface {p1}, Landroidx/camera/core/i;->i1()LwX1;

    move-result-object v0

    invoke-interface {v0}, LwX1;->b()LxY5;

    move-result-object v0

    iget-object v1, p0, Llf0;->b:Lf74;

    invoke-virtual {v1}, Lf74;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LxY5;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Llf0;->a:Ljava/util/Set;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Received an unexpected stage id"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, LHZ3;->j(ZLjava/lang/String;)V

    iget-object v1, p0, Llf0;->a:Ljava/util/Set;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Llf0;->d:Llf0$c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Llf0$c;->b()Ls91;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls91;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, Llf0;->a:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Llf0;->b:Lf74;

    const/4 v0, 0x0

    iput-object v0, p0, Llf0;->b:Lf74;

    invoke-virtual {p1}, Lf74;->n()V

    :cond_0
    return-void
.end method

.method public e(Landroidx/camera/core/i;)V
    .locals 2

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Llf0;->b:Lf74;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Discarding ImageProxy which was inadvertently acquired: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CaptureNode"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/camera/core/i;->close()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Llf0;->d(Landroidx/camera/core/i;)V

    :goto_0
    return-void
.end method

.method public f(Lf74;)V
    .locals 4

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, Llf0;->b()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const-string v3, "Too many acquire images. Close image to be able to process next."

    invoke-static {v0, v3}, LHZ3;->j(ZLjava/lang/String;)V

    iget-object v0, p0, Llf0;->b:Lf74;

    if-eqz v0, :cond_2

    iget-object v0, p0, Llf0;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :cond_2
    :goto_1
    const-string v0, "The previous request is not complete"

    invoke-static {v1, v0}, LHZ3;->j(ZLjava/lang/String;)V

    iput-object p1, p0, Llf0;->b:Lf74;

    iget-object v0, p0, Llf0;->a:Ljava/util/Set;

    invoke-virtual {p1}, Lf74;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Llf0;->d:Llf0$c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Llf0$c;->c()Ls91;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls91;->accept(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lf74;->a()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v1, Llf0$a;

    invoke-direct {v1, p0, p1}, Llf0$a;-><init>(Llf0;Lf74;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v0, v1, p1}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public g()V
    .locals 2

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Llf0;->e:Llf0$b;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Llf0;->c:Landroidx/camera/core/n;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, Llf0;->h(Llf0$b;Landroidx/camera/core/n;)V

    return-void
.end method

.method public final h(Llf0$b;Landroidx/camera/core/n;)V
    .locals 1

    invoke-virtual {p1}, Llf0$b;->f()Landroidx/camera/core/impl/DeferrableSurface;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->c()V

    invoke-virtual {p1}, Llf0$b;->f()Landroidx/camera/core/impl/DeferrableSurface;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/core/impl/DeferrableSurface;->i()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LuJ6;

    invoke-direct {v0, p2}, LuJ6;-><init>(Landroidx/camera/core/n;)V

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public i(Landroidx/camera/core/ImageCaptureException;)V
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Llf0;->b:Lf74;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lf74;->k(Landroidx/camera/core/ImageCaptureException;)V

    :cond_0
    return-void
.end method

.method public j(Landroidx/camera/core/d$a;)V
    .locals 2

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Llf0;->c:Landroidx/camera/core/n;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The ImageReader is not initialized."

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    iget-object v0, p0, Llf0;->c:Landroidx/camera/core/n;

    invoke-virtual {v0, p1}, Landroidx/camera/core/n;->n(Landroidx/camera/core/d$a;)V

    return-void
.end method

.method public k(Llf0$b;)Llf0$c;
    .locals 5

    iget-object v0, p0, Llf0;->e:Llf0$b;

    if-nez v0, :cond_0

    iget-object v0, p0, Llf0;->c:Landroidx/camera/core/n;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "CaptureNode does not support recreation yet."

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    iput-object p1, p0, Llf0;->e:Llf0$b;

    invoke-virtual {p1}, Llf0$b;->e()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {p1}, Llf0$b;->c()I

    move-result v1

    new-instance v2, Landroidx/camera/core/k;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    const/4 v4, 0x4

    invoke-direct {v2, v3, v0, v1, v4}, Landroidx/camera/core/k;-><init>(IIII)V

    new-instance v0, Landroidx/camera/core/n;

    invoke-direct {v0, v2}, Landroidx/camera/core/n;-><init>(LKX1;)V

    iput-object v0, p0, Llf0;->c:Landroidx/camera/core/n;

    invoke-virtual {v2}, Landroidx/camera/core/k;->n()Lpa0;

    move-result-object v0

    invoke-virtual {p1, v0}, Llf0$b;->h(Lpa0;)V

    invoke-virtual {v2}, Landroidx/camera/core/k;->a()Landroid/view/Surface;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v0}, Llf0$b;->i(Landroid/view/Surface;)V

    new-instance v0, Lif0;

    invoke-direct {v0, p0}, Lif0;-><init>(Llf0;)V

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroidx/camera/core/k;->d(LKX1$a;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1}, Llf0$b;->d()Ls91;

    move-result-object v0

    new-instance v1, Ljf0;

    invoke-direct {v1, p0}, Ljf0;-><init>(Llf0;)V

    invoke-virtual {v0, v1}, Ls91;->a(Lrz0;)V

    invoke-virtual {p1}, Llf0$b;->b()Ls91;

    move-result-object v0

    new-instance v1, Lkf0;

    invoke-direct {v1, p0}, Lkf0;-><init>(Llf0;)V

    invoke-virtual {v0, v1}, Ls91;->a(Lrz0;)V

    invoke-virtual {p1}, Llf0$b;->c()I

    move-result p1

    invoke-static {p1}, Llf0$c;->d(I)Llf0$c;

    move-result-object p1

    iput-object p1, p0, Llf0;->d:Llf0$c;

    return-object p1
.end method
