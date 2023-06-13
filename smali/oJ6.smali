.class public final LoJ6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LoJ6$b;
    }
.end annotation


# instance fields
.field public final a:Lr90;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:LrJ6;

.field public final d:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "LqJ6;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LoJ6$b;

.field public f:Z

.field public g:Lr90$c;


# direct methods
.method public constructor <init>(Lr90;LWa0;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LoJ6;->f:Z

    new-instance v0, LoJ6$a;

    invoke-direct {v0, p0}, LoJ6$a;-><init>(LoJ6;)V

    iput-object v0, p0, LoJ6;->g:Lr90$c;

    iput-object p1, p0, LoJ6;->a:Lr90;

    iput-object p3, p0, LoJ6;->b:Ljava/util/concurrent/Executor;

    invoke-static {p2}, LoJ6;->f(LWa0;)LoJ6$b;

    move-result-object p2

    iput-object p2, p0, LoJ6;->e:LoJ6$b;

    new-instance p3, LrJ6;

    invoke-interface {p2}, LoJ6$b;->d()F

    move-result v0

    invoke-interface {p2}, LoJ6$b;->b()F

    move-result p2

    invoke-direct {p3, v0, p2}, LrJ6;-><init>(FF)V

    iput-object p3, p0, LoJ6;->c:LrJ6;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p3, p2}, LrJ6;->h(F)V

    new-instance p2, LuX2;

    invoke-static {p3}, LgZ1;->e(LqJ6;)LqJ6;

    move-result-object p3

    invoke-direct {p2, p3}, LuX2;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, LoJ6;->d:LuX2;

    iget-object p2, p0, LoJ6;->g:Lr90$c;

    invoke-virtual {p1, p2}, Lr90;->v(Lr90$c;)V

    return-void
.end method

.method public static synthetic a(LoJ6;LO80$a;LqJ6;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LoJ6;->n(LO80$a;LqJ6;)V

    return-void
.end method

.method public static synthetic b(LoJ6;LqJ6;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LoJ6;->o(LqJ6;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LoJ6;LqJ6;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LoJ6;->m(LqJ6;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LoJ6;LO80$a;LqJ6;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LoJ6;->l(LO80$a;LqJ6;)V

    return-void
.end method

.method public static f(LWa0;)LoJ6$b;
    .locals 1

    invoke-static {p0}, LoJ6;->k(LWa0;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LCd;

    invoke-direct {v0, p0}, LCd;-><init>(LWa0;)V

    return-object v0

    :cond_0
    new-instance v0, LOE0;

    invoke-direct {v0, p0}, LOE0;-><init>(LWa0;)V

    return-object v0
.end method

.method public static h(LWa0;)LqJ6;
    .locals 2

    invoke-static {p0}, LoJ6;->f(LWa0;)LoJ6$b;

    move-result-object p0

    new-instance v0, LrJ6;

    invoke-interface {p0}, LoJ6$b;->d()F

    move-result v1

    invoke-interface {p0}, LoJ6$b;->b()F

    move-result p0

    invoke-direct {v0, v1, p0}, LrJ6;-><init>(FF)V

    const/high16 p0, 0x3f800000    # 1.0f

    invoke-virtual {v0, p0}, LrJ6;->h(F)V

    invoke-static {v0}, LgZ1;->e(LqJ6;)LqJ6;

    move-result-object p0

    return-object p0
.end method

.method public static i(LWa0;)Landroid/util/Range;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWa0;",
            ")",
            "Landroid/util/Range<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    :try_start_0
    invoke-static {}, LAd;->a()Landroid/hardware/camera2/CameraCharacteristics$Key;

    move-result-object v0

    invoke-virtual {p0, v0}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/util/Range;
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string v0, "ZoomControl"

    const-string v1, "AssertionError, fail to get camera characteristic."

    invoke-static {v0, v1, p0}, LJx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static k(LWa0;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LoJ6;->i(LWa0;)Landroid/util/Range;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private synthetic l(LO80$a;LqJ6;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LoJ6;->s(LO80$a;LqJ6;)V

    return-void
.end method

.method private synthetic m(LqJ6;LO80$a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LoJ6;->b:Ljava/util/concurrent/Executor;

    new-instance v1, LmJ6;

    invoke-direct {v1, p0, p2, p1}, LmJ6;-><init>(LoJ6;LO80$a;LqJ6;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p1, "setLinearZoom"

    return-object p1
.end method

.method private synthetic n(LO80$a;LqJ6;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LoJ6;->s(LO80$a;LqJ6;)V

    return-void
.end method

.method private synthetic o(LqJ6;LO80$a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LoJ6;->b:Ljava/util/concurrent/Executor;

    new-instance v1, LnJ6;

    invoke-direct {v1, p0, p2, p1}, LnJ6;-><init>(LoJ6;LO80$a;LqJ6;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p1, "setZoomRatio"

    return-object p1
.end method


# virtual methods
.method public e(Lja0$a;)V
    .locals 1

    iget-object v0, p0, LoJ6;->e:LoJ6$b;

    invoke-interface {v0, p1}, LoJ6$b;->e(Lja0$a;)V

    return-void
.end method

.method public g()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, LoJ6;->e:LoJ6$b;

    invoke-interface {v0}, LoJ6$b;->g()Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method

.method public j()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "LqJ6;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LoJ6;->d:LuX2;

    return-object v0
.end method

.method public p(Z)V
    .locals 2

    iget-boolean v0, p0, LoJ6;->f:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, LoJ6;->f:Z

    if-nez p1, :cond_1

    iget-object p1, p0, LoJ6;->c:LrJ6;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, LoJ6;->c:LrJ6;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, LrJ6;->h(F)V

    iget-object v0, p0, LoJ6;->c:LrJ6;

    invoke-static {v0}, LgZ1;->e(LqJ6;)LqJ6;

    move-result-object v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, LoJ6;->t(LqJ6;)V

    iget-object p1, p0, LoJ6;->e:LoJ6$b;

    invoke-interface {p1}, LoJ6$b;->f()V

    iget-object p1, p0, LoJ6;->a:Lr90;

    invoke-virtual {p1}, Lr90;->n0()J

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public q(F)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LoJ6;->c:LrJ6;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LoJ6;->c:LrJ6;

    invoke-virtual {v1, p1}, LrJ6;->g(F)V

    iget-object p1, p0, LoJ6;->c:LrJ6;

    invoke-static {p1}, LgZ1;->e(LqJ6;)LqJ6;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p0, p1}, LoJ6;->t(LqJ6;)V

    new-instance v0, LlJ6;

    invoke-direct {v0, p0, p1}, LlJ6;-><init>(LoJ6;LqJ6;)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-static {p1}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public r(F)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LoJ6;->c:LrJ6;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LoJ6;->c:LrJ6;

    invoke-virtual {v1, p1}, LrJ6;->h(F)V

    iget-object p1, p0, LoJ6;->c:LrJ6;

    invoke-static {p1}, LgZ1;->e(LqJ6;)LqJ6;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p0, p1}, LoJ6;->t(LqJ6;)V

    new-instance v0, LkJ6;

    invoke-direct {v0, p0, p1}, LkJ6;-><init>(LoJ6;LqJ6;)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-static {p1}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final s(LO80$a;LqJ6;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;",
            "LqJ6;",
            ")V"
        }
    .end annotation

    iget-boolean v0, p0, LoJ6;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LoJ6;->c:LrJ6;

    monitor-enter v0

    :try_start_0
    iget-object p2, p0, LoJ6;->c:LrJ6;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p2, v1}, LrJ6;->h(F)V

    iget-object p2, p0, LoJ6;->c:LrJ6;

    invoke-static {p2}, LgZ1;->e(LqJ6;)LqJ6;

    move-result-object p2

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, p2}, LoJ6;->t(LqJ6;)V

    new-instance p2, Landroidx/camera/core/CameraControl$OperationCanceledException;

    const-string v0, "Camera is not active."

    invoke-direct {p2, v0}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LO80$a;->f(Ljava/lang/Throwable;)Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    invoke-virtual {p0, p2}, LoJ6;->t(LqJ6;)V

    iget-object v0, p0, LoJ6;->e:LoJ6$b;

    invoke-interface {p2}, LqJ6;->d()F

    move-result p2

    invoke-interface {v0, p2, p1}, LoJ6$b;->c(FLO80$a;)V

    iget-object p1, p0, LoJ6;->a:Lr90;

    invoke-virtual {p1}, Lr90;->n0()J

    return-void
.end method

.method public final t(LqJ6;)V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LoJ6;->d:LuX2;

    invoke-virtual {v0, p1}, LuX2;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LoJ6;->d:LuX2;

    invoke-virtual {v0, p1}, LuX2;->postValue(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
