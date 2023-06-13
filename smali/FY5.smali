.class public LFY5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/d$a;
.implements LJY5$a;


# instance fields
.field public final a:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "LJY5;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LeX1;

.field public c:LEX1;

.field public d:LqJ4;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LqJ4;",
            ">;"
        }
    .end annotation
.end field

.field public f:Z


# direct methods
.method public constructor <init>(LeX1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, LFY5;->a:Ljava/util/Deque;

    const/4 v0, 0x0

    iput-boolean v0, p0, LFY5;->f:Z

    invoke-static {}, LO36;->a()V

    iput-object p1, p0, LFY5;->b:LeX1;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LFY5;->e:Ljava/util/List;

    return-void
.end method

.method public static synthetic b(LFY5;LqJ4;)V
    .locals 0

    invoke-direct {p0, p1}, LFY5;->i(LqJ4;)V

    return-void
.end method

.method public static synthetic c(LFY5;)V
    .locals 0

    invoke-direct {p0}, LFY5;->h()V

    return-void
.end method

.method private synthetic h()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LFY5;->d:LqJ4;

    invoke-virtual {p0}, LFY5;->g()V

    return-void
.end method

.method private synthetic i(LqJ4;)V
    .locals 1

    iget-object v0, p0, LFY5;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public a(LJY5;)V
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, LFY5;->a:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->addFirst(Ljava/lang/Object;)V

    return-void
.end method

.method public d()V
    .locals 4

    invoke-static {}, LO36;->a()V

    new-instance v0, Landroidx/camera/core/ImageCaptureException;

    const-string v1, "Camera is closed."

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v0, v3, v1, v2}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    iget-object v1, p0, LFY5;->a:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJY5;

    invoke-virtual {v2, v0}, LJY5;->s(Landroidx/camera/core/ImageCaptureException;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, LFY5;->a:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, LFY5;->e:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LqJ4;

    invoke-virtual {v2, v0}, LqJ4;->j(Landroidx/camera/core/ImageCaptureException;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, LFY5;->d:LqJ4;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f(Landroidx/camera/core/i;)V
    .locals 1

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    new-instance v0, LEY5;

    invoke-direct {v0, p0}, LEY5;-><init>(LFY5;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public g()V
    .locals 4

    invoke-static {}, LO36;->a()V

    const-string v0, "Issue the next TakePictureRequest."

    const-string v1, "TakePictureManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, LFY5;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "There is already a request in-flight."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-boolean v0, p0, LFY5;->f:Z

    if-eqz v0, :cond_1

    const-string v0, "The class is paused."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    iget-object v0, p0, LFY5;->c:LEX1;

    invoke-virtual {v0}, LEX1;->h()I

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Too many acquire images. Close image to be able to process next."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    iget-object v0, p0, LFY5;->a:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJY5;

    if-nez v0, :cond_3

    const-string v0, "No new request."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    new-instance v1, LqJ4;

    invoke-direct {v1, v0, p0}, LqJ4;-><init>(LJY5;LJY5$a;)V

    invoke-virtual {p0, v1}, LFY5;->o(LqJ4;)V

    iget-object v2, p0, LFY5;->c:LEX1;

    invoke-virtual {v1}, LqJ4;->m()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v3

    invoke-virtual {v2, v0, v1, v3}, LEX1;->e(LJY5;LBY5;Lcom/google/common/util/concurrent/ListenableFuture;)LsE3;

    move-result-object v0

    iget-object v2, v0, LsE3;->a:Ljava/lang/Object;

    check-cast v2, Lgc0;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, LsE3;->b:Ljava/lang/Object;

    check-cast v0, Lf74;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, LFY5;->c:LEX1;

    invoke-virtual {v3, v0}, LEX1;->k(Lf74;)V

    invoke-virtual {p0, v2}, LFY5;->n(Lgc0;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    invoke-virtual {v1, v0}, LqJ4;->s(Lcom/google/common/util/concurrent/ListenableFuture;)V

    return-void
.end method

.method public j(LJY5;)V
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, LFY5;->a:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->offer(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LFY5;->g()V

    return-void
.end method

.method public k()V
    .locals 1

    invoke-static {}, LO36;->a()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LFY5;->f:Z

    iget-object v0, p0, LFY5;->d:LqJ4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LqJ4;->k()V

    :cond_0
    return-void
.end method

.method public l()V
    .locals 1

    invoke-static {}, LO36;->a()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LFY5;->f:Z

    invoke-virtual {p0}, LFY5;->g()V

    return-void
.end method

.method public m(LEX1;)V
    .locals 0

    invoke-static {}, LO36;->a()V

    iput-object p1, p0, LFY5;->c:LEX1;

    invoke-virtual {p1, p0}, LEX1;->j(Landroidx/camera/core/d$a;)V

    return-void
.end method

.method public final n(Lgc0;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc0;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, LFY5;->b:LeX1;

    invoke-interface {v0}, LeX1;->a()V

    iget-object v0, p0, LFY5;->b:LeX1;

    invoke-virtual {p1}, Lgc0;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, LeX1;->c(Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v1, LFY5$a;

    invoke-direct {v1, p0, p1}, LFY5$a;-><init>(LFY5;Lgc0;)V

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    invoke-static {v0, v1, p1}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public final o(LqJ4;)V
    .locals 3

    invoke-virtual {p0}, LFY5;->e()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, LHZ3;->i(Z)V

    iput-object p1, p0, LFY5;->d:LqJ4;

    invoke-virtual {p1}, LqJ4;->m()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v1, LCY5;

    invoke-direct {v1, p0}, LCY5;-><init>(LFY5;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, LFY5;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, LqJ4;->n()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v1, LDY5;

    invoke-direct {v1, p0, p1}, LDY5;-><init>(LFY5;LqJ4;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method
