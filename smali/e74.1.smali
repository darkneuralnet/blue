.class public Le74;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le74$a;,
        Le74$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ls62;

.field public c:LZh3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZh3<",
            "Le74$b;",
            "LMD3<",
            "Landroidx/camera/core/i;",
            ">;>;"
        }
    .end annotation
.end field

.field public d:LZh3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZh3<",
            "LxW1$a;",
            "LMD3<",
            "[B>;>;"
        }
    .end annotation
.end field

.field public e:LZh3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZh3<",
            "LKT$a;",
            "LMD3<",
            "[B>;>;"
        }
    .end annotation
.end field

.field public f:LZh3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZh3<",
            "LXh2$a;",
            "Landroidx/camera/core/h$o;",
            ">;"
        }
    .end annotation
.end field

.field public g:LZh3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZh3<",
            "LMD3<",
            "[B>;",
            "LMD3<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation
.end field

.field public h:LZh3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZh3<",
            "LMD3<",
            "Landroidx/camera/core/i;",
            ">;",
            "Landroidx/camera/core/i;",
            ">;"
        }
    .end annotation
.end field

.field public i:LZh3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZh3<",
            "LMD3<",
            "[B>;",
            "LMD3<",
            "Landroidx/camera/core/i;",
            ">;>;"
        }
    .end annotation
.end field

.field public j:LZh3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZh3<",
            "LMD3<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "LMD3<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ls62;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, LhE2;

    invoke-static {v0}, LP21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {p1}, LAc0;->f(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    iput-object p1, p0, Le74;->a:Ljava/util/concurrent/Executor;

    goto :goto_1

    :cond_1
    iput-object p1, p0, Le74;->a:Ljava/util/concurrent/Executor;

    :goto_1
    iput-object p2, p0, Le74;->b:Ls62;

    return-void
.end method

.method public static synthetic a(Le74;Le74$b;)V
    .locals 0

    invoke-direct {p0, p1}, Le74;->j(Le74$b;)V

    return-void
.end method

.method public static synthetic b(Le74;Le74$b;)V
    .locals 0

    invoke-direct {p0, p1}, Le74;->k(Le74$b;)V

    return-void
.end method

.method public static synthetic c(Lf74;Landroidx/camera/core/h$o;)V
    .locals 0

    invoke-static {p0, p1}, Le74;->h(Lf74;Landroidx/camera/core/h$o;)V

    return-void
.end method

.method public static synthetic d(Lf74;Landroidx/camera/core/i;)V
    .locals 0

    invoke-static {p0, p1}, Le74;->g(Lf74;Landroidx/camera/core/i;)V

    return-void
.end method

.method public static synthetic e(Lf74;Landroidx/camera/core/ImageCaptureException;)V
    .locals 0

    invoke-static {p0, p1}, Le74;->i(Lf74;Landroidx/camera/core/ImageCaptureException;)V

    return-void
.end method

.method public static synthetic g(Lf74;Landroidx/camera/core/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf74;->m(Landroidx/camera/core/i;)V

    return-void
.end method

.method public static synthetic h(Lf74;Landroidx/camera/core/h$o;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf74;->l(Landroidx/camera/core/h$o;)V

    return-void
.end method

.method public static synthetic i(Lf74;Landroidx/camera/core/ImageCaptureException;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf74;->o(Landroidx/camera/core/ImageCaptureException;)V

    return-void
.end method

.method private synthetic j(Le74$b;)V
    .locals 0

    invoke-virtual {p0, p1}, Le74;->m(Le74$b;)V

    return-void
.end method

.method private synthetic k(Le74$b;)V
    .locals 2

    invoke-virtual {p1}, Le74$b;->b()Lf74;

    move-result-object v0

    invoke-virtual {v0}, Lf74;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Le74;->a:Ljava/util/concurrent/Executor;

    new-instance v1, La74;

    invoke-direct {v1, p0, p1}, La74;-><init>(Le74;Le74$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static p(Lf74;Landroidx/camera/core/ImageCaptureException;)V
    .locals 2

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Ld74;

    invoke-direct {v1, p0, p1}, Ld74;-><init>(Lf74;Landroidx/camera/core/ImageCaptureException;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public final f(LMD3;I)LMD3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMD3<",
            "[B>;I)",
            "LMD3<",
            "[B>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/ImageCaptureException;
        }
    .end annotation

    invoke-virtual {p1}, LMD3;->e()I

    move-result v0

    const/16 v1, 0x100

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LHZ3;->i(Z)V

    iget-object v0, p0, Le74;->g:LZh3;

    invoke-interface {v0, p1}, LZh3;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LMD3;

    iget-object v0, p0, Le74;->j:LZh3;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, LZh3;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LMD3;

    :cond_1
    iget-object v0, p0, Le74;->e:LZh3;

    invoke-static {p1, p2}, LKT$a;->c(LMD3;I)LKT$a;

    move-result-object p1

    invoke-interface {v0, p1}, LZh3;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LMD3;

    return-object p1
.end method

.method public l(Le74$b;)Landroidx/camera/core/i;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/ImageCaptureException;
        }
    .end annotation

    invoke-virtual {p1}, Le74$b;->b()Lf74;

    move-result-object v0

    iget-object v1, p0, Le74;->c:LZh3;

    invoke-interface {v1, p1}, LZh3;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LMD3;

    invoke-virtual {p1}, LMD3;->e()I

    move-result v1

    const/16 v2, 0x23

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Le74;->j:LZh3;

    if-eqz v1, :cond_2

    :cond_0
    iget-object v1, p0, Le74;->d:LZh3;

    invoke-virtual {v0}, Lf74;->c()I

    move-result v2

    invoke-static {p1, v2}, LxW1$a;->c(LMD3;I)LxW1$a;

    move-result-object p1

    invoke-interface {v1, p1}, LZh3;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LMD3;

    iget-object v1, p0, Le74;->j:LZh3;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lf74;->c()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Le74;->f(LMD3;I)LMD3;

    move-result-object p1

    :cond_1
    iget-object v0, p0, Le74;->i:LZh3;

    invoke-interface {v0, p1}, LZh3;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LMD3;

    :cond_2
    iget-object v0, p0, Le74;->h:LZh3;

    invoke-interface {v0, p1}, LZh3;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/i;

    return-object p1
.end method

.method public m(Le74$b;)V
    .locals 4

    invoke-virtual {p1}, Le74$b;->b()Lf74;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1}, Le74$b;->b()Lf74;

    move-result-object v2

    invoke-virtual {v2}, Lf74;->j()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, p1}, Le74;->l(Le74$b;)Landroidx/camera/core/i;

    move-result-object p1

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    new-instance v3, Lb74;

    invoke-direct {v3, v0, p1}, Lb74;-><init>(Lf74;Landroidx/camera/core/i;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Le74;->n(Le74$b;)Landroidx/camera/core/h$o;

    move-result-object p1

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    new-instance v3, Lc74;

    invoke-direct {v3, v0, p1}, Lc74;-><init>(Lf74;Landroidx/camera/core/h$o;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Landroidx/camera/core/ImageCaptureException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v2, Landroidx/camera/core/ImageCaptureException;

    const-string v3, "Processing failed."

    invoke-direct {v2, v1, v3, p1}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0, v2}, Le74;->p(Lf74;Landroidx/camera/core/ImageCaptureException;)V

    goto :goto_0

    :catch_1
    move-exception p1

    new-instance v2, Landroidx/camera/core/ImageCaptureException;

    const-string v3, "Processing failed due to low memory."

    invoke-direct {v2, v1, v3, p1}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0, v2}, Le74;->p(Lf74;Landroidx/camera/core/ImageCaptureException;)V

    goto :goto_0

    :catch_2
    move-exception p1

    invoke-static {v0, p1}, Le74;->p(Lf74;Landroidx/camera/core/ImageCaptureException;)V

    :goto_0
    return-void
.end method

.method public n(Le74$b;)Landroidx/camera/core/h$o;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/ImageCaptureException;
        }
    .end annotation

    invoke-virtual {p1}, Le74$b;->b()Lf74;

    move-result-object v0

    iget-object v1, p0, Le74;->c:LZh3;

    invoke-interface {v1, p1}, LZh3;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LMD3;

    iget-object v1, p0, Le74;->d:LZh3;

    invoke-virtual {v0}, Lf74;->c()I

    move-result v2

    invoke-static {p1, v2}, LxW1$a;->c(LMD3;I)LxW1$a;

    move-result-object p1

    invoke-interface {v1, p1}, LZh3;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LMD3;

    invoke-virtual {p1}, LMD3;->i()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Le74;->j:LZh3;

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual {v0}, Lf74;->c()I

    move-result v1

    invoke-virtual {p0, p1, v1}, Le74;->f(LMD3;I)LMD3;

    move-result-object p1

    :cond_1
    iget-object v1, p0, Le74;->f:LZh3;

    invoke-virtual {v0}, Lf74;->d()Landroidx/camera/core/h$n;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, v0}, LXh2$a;->c(LMD3;Landroidx/camera/core/h$n;)LXh2$a;

    move-result-object p1

    invoke-interface {v1, p1}, LZh3;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/h$o;

    return-object p1
.end method

.method public o()V
    .locals 0

    return-void
.end method

.method public q(Le74$a;)Ljava/lang/Void;
    .locals 2

    invoke-virtual {p1}, Le74$a;->a()Ls91;

    move-result-object v0

    new-instance v1, LZ64;

    invoke-direct {v1, p0}, LZ64;-><init>(Le74;)V

    invoke-virtual {v0, v1}, Ls91;->a(Lrz0;)V

    new-instance v0, LY64;

    invoke-direct {v0}, LY64;-><init>()V

    iput-object v0, p0, Le74;->c:LZh3;

    new-instance v0, LxW1;

    invoke-direct {v0}, LxW1;-><init>()V

    iput-object v0, p0, Le74;->d:LZh3;

    new-instance v0, LWh2;

    invoke-direct {v0}, LWh2;-><init>()V

    iput-object v0, p0, Le74;->g:LZh3;

    new-instance v0, LKT;

    invoke-direct {v0}, LKT;-><init>()V

    iput-object v0, p0, Le74;->e:LZh3;

    new-instance v0, LXh2;

    invoke-direct {v0}, LXh2;-><init>()V

    iput-object v0, p0, Le74;->f:LZh3;

    new-instance v0, Lai2;

    invoke-direct {v0}, Lai2;-><init>()V

    iput-object v0, p0, Le74;->h:LZh3;

    invoke-virtual {p1}, Le74$a;->b()I

    move-result p1

    const/16 v0, 0x23

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Le74;->b:Ls62;

    if-eqz p1, :cond_1

    :cond_0
    new-instance p1, LYh2;

    invoke-direct {p1}, LYh2;-><init>()V

    iput-object p1, p0, Le74;->i:LZh3;

    :cond_1
    iget-object p1, p0, Le74;->b:Ls62;

    if-eqz p1, :cond_2

    new-instance v0, LUT;

    invoke-direct {v0, p1}, LUT;-><init>(Ls62;)V

    iput-object v0, p0, Le74;->j:LZh3;

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
