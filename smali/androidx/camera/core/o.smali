.class public final Landroidx/camera/core/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/o$h;,
        Landroidx/camera/core/o$i;,
        Landroidx/camera/core/o$g;,
        Landroidx/camera/core/o$f;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Landroid/util/Size;

.field public final c:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LLb0;

.field public final e:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LO80$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LO80$a<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LO80$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final i:LO80$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Landroidx/camera/core/impl/DeferrableSurface;

.field public k:Landroidx/camera/core/o$h;

.field public l:Landroidx/camera/core/o$i;

.field public m:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/util/Size;LLb0;Landroid/util/Range;Ljava/lang/Runnable;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Size;",
            "LLb0;",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/o;->a:Ljava/lang/Object;

    iput-object p1, p0, Landroidx/camera/core/o;->b:Landroid/util/Size;

    iput-object p2, p0, Landroidx/camera/core/o;->d:LLb0;

    iput-object p3, p0, Landroidx/camera/core/o;->c:Landroid/util/Range;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "SurfaceRequest[size: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ", id: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "]"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p3, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    new-instance v1, LcW5;

    invoke-direct {v1, p3, p2}, LcW5;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;)V

    invoke-static {v1}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LO80$a;

    invoke-static {p3}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LO80$a;

    iput-object p3, p0, Landroidx/camera/core/o;->i:LO80$a;

    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    new-instance v3, LdW5;

    invoke-direct {v3, v2, p2}, LdW5;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;)V

    invoke-static {v3}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v3

    iput-object v3, p0, Landroidx/camera/core/o;->g:Lcom/google/common/util/concurrent/ListenableFuture;

    new-instance v4, Landroidx/camera/core/o$a;

    invoke-direct {v4, p0, p3, v1}, Landroidx/camera/core/o$a;-><init>(Landroidx/camera/core/o;LO80$a;Lcom/google/common/util/concurrent/ListenableFuture;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p3

    invoke-static {v3, v4, p3}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LO80$a;

    invoke-static {p3}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LO80$a;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    new-instance v0, LeW5;

    invoke-direct {v0, v1, p2}, LeW5;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/o;->e:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO80$a;

    invoke-static {v1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO80$a;

    iput-object v1, p0, Landroidx/camera/core/o;->f:LO80$a;

    new-instance v1, Landroidx/camera/core/o$b;

    const/16 v2, 0x22

    invoke-direct {v1, p0, p1, v2}, Landroidx/camera/core/o$b;-><init>(Landroidx/camera/core/o;Landroid/util/Size;I)V

    iput-object v1, p0, Landroidx/camera/core/o;->j:Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {v1}, Landroidx/camera/core/impl/DeferrableSurface;->i()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    new-instance v1, Landroidx/camera/core/o$c;

    invoke-direct {v1, p0, p1, p3, p2}, Landroidx/camera/core/o$c;-><init>(Landroidx/camera/core/o;Lcom/google/common/util/concurrent/ListenableFuture;LO80$a;Ljava/lang/String;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p2

    invoke-static {v0, v1, p2}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    new-instance p2, LfW5;

    invoke-direct {p2, p0}, LfW5;-><init>(Landroidx/camera/core/o;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {p0, p1, p4}, Landroidx/camera/core/o;->o(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)LO80$a;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/o;->h:LO80$a;

    return-void
.end method

.method public constructor <init>(Landroid/util/Size;LLb0;Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Landroidx/camera/core/o;-><init>(Landroid/util/Size;LLb0;Landroid/util/Range;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic a(Lrz0;Landroid/view/Surface;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/o;->w(Lrz0;Landroid/view/Surface;)V

    return-void
.end method

.method public static synthetic b(Landroidx/camera/core/o$i;Landroidx/camera/core/o$h;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/o;->y(Landroidx/camera/core/o$i;Landroidx/camera/core/o$h;)V

    return-void
.end method

.method public static synthetic c(Landroidx/camera/core/o;Ljava/util/concurrent/atomic/AtomicReference;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/core/o;->r(Ljava/util/concurrent/atomic/AtomicReference;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lrz0;Landroid/view/Surface;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/o;->x(Lrz0;Landroid/view/Surface;)V

    return-void
.end method

.method public static synthetic e(Landroidx/camera/core/o;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/o;->v()V

    return-void
.end method

.method public static synthetic f(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/camera/core/o;->u(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/camera/core/o;->s(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/camera/core/o;->t(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroidx/camera/core/o$i;Landroidx/camera/core/o$h;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/o;->z(Landroidx/camera/core/o$i;Landroidx/camera/core/o$h;)V

    return-void
.end method

.method private synthetic r(Ljava/util/concurrent/atomic/AtomicReference;LO80$a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "SurfaceRequest-surface-recreation("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic s(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;LO80$a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-cancellation"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;LO80$a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-status"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;LO80$a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-Surface"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private synthetic v()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/o;->e:Lcom/google/common/util/concurrent/ListenableFuture;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void
.end method

.method public static synthetic w(Lrz0;Landroid/view/Surface;)V
    .locals 1

    const/4 v0, 0x3

    invoke-static {v0, p1}, Landroidx/camera/core/o$g;->c(ILandroid/view/Surface;)Landroidx/camera/core/o$g;

    move-result-object p1

    invoke-interface {p0, p1}, Lrz0;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic x(Lrz0;Landroid/view/Surface;)V
    .locals 1

    const/4 v0, 0x4

    invoke-static {v0, p1}, Landroidx/camera/core/o$g;->c(ILandroid/view/Surface;)Landroidx/camera/core/o$g;

    move-result-object p1

    invoke-interface {p0, p1}, Lrz0;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic y(Landroidx/camera/core/o$i;Landroidx/camera/core/o$h;)V
    .locals 0

    invoke-interface {p0, p1}, Landroidx/camera/core/o$i;->a(Landroidx/camera/core/o$h;)V

    return-void
.end method

.method public static synthetic z(Landroidx/camera/core/o$i;Landroidx/camera/core/o$h;)V
    .locals 0

    invoke-interface {p0, p1}, Landroidx/camera/core/o$i;->a(Landroidx/camera/core/o$h;)V

    return-void
.end method


# virtual methods
.method public A(Landroid/view/Surface;Ljava/util/concurrent/Executor;Lrz0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/Surface;",
            "Ljava/util/concurrent/Executor;",
            "Lrz0<",
            "Landroidx/camera/core/o$g;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/o;->f:LO80$a;

    invoke-virtual {v0, p1}, LO80$a;->c(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/camera/core/o;->e:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/o;->e:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    invoke-static {v0}, LHZ3;->i(Z)V

    :try_start_0
    iget-object v0, p0, Landroidx/camera/core/o;->e:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    new-instance v0, LjW5;

    invoke-direct {v0, p3, p1}, LjW5;-><init>(Lrz0;Landroid/view/Surface;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    new-instance v0, LkW5;

    invoke-direct {v0, p3, p1}, LkW5;-><init>(Lrz0;Landroid/view/Surface;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/camera/core/o;->g:Lcom/google/common/util/concurrent/ListenableFuture;

    new-instance v1, Landroidx/camera/core/o$d;

    invoke-direct {v1, p0, p3, p1}, Landroidx/camera/core/o$d;-><init>(Landroidx/camera/core/o;Lrz0;Landroid/view/Surface;)V

    invoke-static {v0, v1, p2}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    :goto_1
    return-void
.end method

.method public B(Ljava/util/concurrent/Executor;Landroidx/camera/core/o$i;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/o;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p2, p0, Landroidx/camera/core/o;->l:Landroidx/camera/core/o$i;

    iput-object p1, p0, Landroidx/camera/core/o;->m:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Landroidx/camera/core/o;->k:Landroidx/camera/core/o$h;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    new-instance v0, LgW5;

    invoke-direct {v0, p2, v1}, LgW5;-><init>(Landroidx/camera/core/o$i;Landroidx/camera/core/o$h;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public C(Landroidx/camera/core/o$h;)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/o;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/o;->k:Landroidx/camera/core/o$h;

    iget-object v1, p0, Landroidx/camera/core/o;->l:Landroidx/camera/core/o$i;

    iget-object v2, p0, Landroidx/camera/core/o;->m:Ljava/util/concurrent/Executor;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    new-instance v0, LhW5;

    invoke-direct {v0, v1, p1}, LhW5;-><init>(Landroidx/camera/core/o$i;Landroidx/camera/core/o$h;)V

    invoke-interface {v2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public D()Z
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/o;->f:LO80$a;

    new-instance v1, Landroidx/camera/core/impl/DeferrableSurface$SurfaceUnavailableException;

    const-string v2, "Surface request will not complete."

    invoke-direct {v1, v2}, Landroidx/camera/core/impl/DeferrableSurface$SurfaceUnavailableException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    move-result v0

    return v0
.end method

.method public j(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "PairedRegistration"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/o;->i:LO80$a;

    invoke-virtual {v0, p2, p1}, LO80$a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public k()LLb0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/o;->d:LLb0;

    return-object v0
.end method

.method public l()Landroidx/camera/core/impl/DeferrableSurface;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/o;->j:Landroidx/camera/core/impl/DeferrableSurface;

    return-object v0
.end method

.method public m()Landroid/util/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/o;->c:Landroid/util/Range;

    return-object v0
.end method

.method public n()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/o;->b:Landroid/util/Size;

    return-object v0
.end method

.method public final o(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)LO80$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/lang/Runnable;",
            ")",
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    new-instance v1, LiW5;

    invoke-direct {v1, p0, v0}, LiW5;-><init>(Landroidx/camera/core/o;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-static {v1}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    new-instance v2, Landroidx/camera/core/o$e;

    invoke-direct {v2, p0, p2}, Landroidx/camera/core/o$e;-><init>(Landroidx/camera/core/o;Ljava/lang/Runnable;)V

    invoke-static {v1, v2, p1}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO80$a;

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO80$a;

    return-object p1
.end method

.method public p()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/o;->D()Z

    iget-object v0, p0, Landroidx/camera/core/o;->h:LO80$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LO80$a;->c(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public q()Z
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/o;->e:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    return v0
.end method
