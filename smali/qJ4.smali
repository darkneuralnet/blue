.class public LqJ4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBY5;


# instance fields
.field public final a:LJY5;

.field public final b:LJY5$a;

.field public final c:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public e:LO80$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public f:LO80$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public g:Z

.field public h:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LJY5;LJY5$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LqJ4;->g:Z

    iput-object p1, p0, LqJ4;->a:LJY5;

    iput-object p2, p0, LqJ4;->b:LJY5$a;

    new-instance p1, LoJ4;

    invoke-direct {p1, p0}, LoJ4;-><init>(LqJ4;)V

    invoke-static {p1}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    iput-object p1, p0, LqJ4;->c:Lcom/google/common/util/concurrent/ListenableFuture;

    new-instance p1, LpJ4;

    invoke-direct {p1, p0}, LpJ4;-><init>(LqJ4;)V

    invoke-static {p1}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    iput-object p1, p0, LqJ4;->d:Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method

.method public static synthetic g(LqJ4;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LqJ4;->p(LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(LqJ4;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LqJ4;->o(LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic o(LO80$a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iput-object p1, p0, LqJ4;->e:LO80$a;

    const-string p1, "CaptureCompleteFuture"

    return-object p1
.end method

.method private synthetic p(LO80$a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iput-object p1, p0, LqJ4;->f:LO80$a;

    const-string p1, "RequestCompleteFuture"

    return-object p1
.end method


# virtual methods
.method public a(Landroidx/camera/core/ImageCaptureException;)V
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-boolean v0, p0, LqJ4;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LqJ4;->l()V

    invoke-virtual {p0}, LqJ4;->q()V

    invoke-virtual {p0, p1}, LqJ4;->r(Landroidx/camera/core/ImageCaptureException;)V

    return-void
.end method

.method public b(Landroidx/camera/core/i;)V
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-boolean v0, p0, LqJ4;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LqJ4;->l()V

    invoke-virtual {p0}, LqJ4;->q()V

    iget-object v0, p0, LqJ4;->a:LJY5;

    invoke-virtual {v0, p1}, LJY5;->u(Landroidx/camera/core/i;)V

    return-void
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, LqJ4;->g:Z

    return v0
.end method

.method public d()V
    .locals 2

    invoke-static {}, LO36;->a()V

    iget-boolean v0, p0, LqJ4;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LqJ4;->e:LO80$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LO80$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public e(Landroidx/camera/core/h$o;)V
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-boolean v0, p0, LqJ4;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LqJ4;->l()V

    invoke-virtual {p0}, LqJ4;->q()V

    iget-object v0, p0, LqJ4;->a:LJY5;

    invoke-virtual {v0, p1}, LJY5;->t(Landroidx/camera/core/h$o;)V

    return-void
.end method

.method public f(Landroidx/camera/core/ImageCaptureException;)V
    .locals 2

    invoke-static {}, LO36;->a()V

    iget-boolean v0, p0, LqJ4;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LqJ4;->a:LJY5;

    invoke-virtual {v0}, LJY5;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LqJ4;->b:LJY5$a;

    iget-object v1, p0, LqJ4;->a:LJY5;

    invoke-interface {v0, v1}, LJY5$a;->a(LJY5;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, LqJ4;->r(Landroidx/camera/core/ImageCaptureException;)V

    :goto_0
    invoke-virtual {p0}, LqJ4;->q()V

    iget-object v0, p0, LqJ4;->e:LO80$a;

    invoke-virtual {v0, p1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final i(Landroidx/camera/core/ImageCaptureException;)V
    .locals 2

    invoke-static {}, LO36;->a()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LqJ4;->g:Z

    iget-object v1, p0, LqJ4;->h:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    iget-object v0, p0, LqJ4;->e:LO80$a;

    invoke-virtual {v0, p1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    iget-object p1, p0, LqJ4;->f:LO80$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LO80$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public j(Landroidx/camera/core/ImageCaptureException;)V
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, LqJ4;->d:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LqJ4;->i(Landroidx/camera/core/ImageCaptureException;)V

    invoke-virtual {p0, p1}, LqJ4;->r(Landroidx/camera/core/ImageCaptureException;)V

    return-void
.end method

.method public k()V
    .locals 4

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, LqJ4;->d:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroidx/camera/core/ImageCaptureException;

    const-string v1, "The request is aborted silently and retried."

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v0, v3, v1, v2}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, LqJ4;->i(Landroidx/camera/core/ImageCaptureException;)V

    iget-object v0, p0, LqJ4;->b:LJY5$a;

    iget-object v1, p0, LqJ4;->a:LJY5;

    invoke-interface {v0, v1}, LJY5$a;->a(LJY5;)V

    return-void
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, LqJ4;->c:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    const-string v1, "onImageCaptured() must be called before onFinalResult()"

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    return-void
.end method

.method public m()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, LqJ4;->c:Lcom/google/common/util/concurrent/ListenableFuture;

    return-object v0
.end method

.method public n()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, LqJ4;->d:Lcom/google/common/util/concurrent/ListenableFuture;

    return-object v0
.end method

.method public final q()V
    .locals 2

    iget-object v0, p0, LqJ4;->d:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "The callback can only complete once."

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    iget-object v0, p0, LqJ4;->f:LO80$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LO80$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public final r(Landroidx/camera/core/ImageCaptureException;)V
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, LqJ4;->a:LJY5;

    invoke-virtual {v0, p1}, LJY5;->s(Landroidx/camera/core/ImageCaptureException;)V

    return-void
.end method

.method public s(Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, LqJ4;->h:Lcom/google/common/util/concurrent/ListenableFuture;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "CaptureRequestFuture can only be set once."

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    iput-object p1, p0, LqJ4;->h:Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method
