.class public final LU56;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lr90;

.field public final b:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Z

.field public final d:Ljava/util/concurrent/Executor;

.field public e:Z

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


# direct methods
.method public constructor <init>(Lr90;LWa0;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU56;->a:Lr90;

    iput-object p3, p0, LU56;->d:Ljava/util/concurrent/Executor;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p3, LM90;

    invoke-direct {p3, p2}, LM90;-><init>(LWa0;)V

    invoke-static {p3}, Loo1;->a(LXa0;)Z

    move-result p2

    iput-boolean p2, p0, LU56;->c:Z

    new-instance p2, LuX2;

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p2, p3}, LuX2;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, LU56;->b:LuX2;

    new-instance p2, LS56;

    invoke-direct {p2, p0}, LS56;-><init>(LU56;)V

    invoke-virtual {p1, p2}, Lr90;->v(Lr90$c;)V

    return-void
.end method

.method public static synthetic a(LU56;LO80$a;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, LU56;->g(LO80$a;Z)V

    return-void
.end method

.method public static synthetic b(LU56;Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-direct {p0, p1}, LU56;->i(Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(LU56;ZLO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LU56;->h(ZLO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic g(LO80$a;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LU56;->e(LO80$a;Z)V

    return-void
.end method

.method private synthetic h(ZLO80$a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LU56;->d:Ljava/util/concurrent/Executor;

    new-instance v1, LT56;

    invoke-direct {v1, p0, p2, p1}, LT56;-><init>(LU56;LO80$a;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "enableTorch: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private synthetic i(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 2

    iget-object v0, p0, LU56;->f:LO80$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/hardware/camera2/CaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object p1

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CaptureRequest;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    iget-boolean v0, p0, LU56;->g:Z

    if-ne p1, v0, :cond_1

    iget-object p1, p0, LU56;->f:LO80$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LO80$a;->c(Ljava/lang/Object;)Z

    iput-object v0, p0, LU56;->f:LO80$a;

    :cond_1
    return v1
.end method


# virtual methods
.method public d(Z)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, LU56;->c:Z

    if-nez v0, :cond_0

    const-string p1, "TorchControl"

    const-string v0, "Unable to enableTorch due to there is no flash unit."

    invoke-static {p1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No flash unit"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, LU56;->b:LuX2;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, LU56;->k(LuX2;Ljava/lang/Object;)V

    new-instance v0, LR56;

    invoke-direct {v0, p0, p1}, LR56;-><init>(LU56;Z)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public e(LO80$a;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;Z)V"
        }
    .end annotation

    iget-boolean v0, p0, LU56;->c:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "No flash unit"

    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LO80$a;->f(Ljava/lang/Throwable;)Z

    :cond_0
    return-void

    :cond_1
    iget-boolean v0, p0, LU56;->e:Z

    if-nez v0, :cond_3

    iget-object p2, p0, LU56;->b:LuX2;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p2, v0}, LU56;->k(LuX2;Ljava/lang/Object;)V

    if-eqz p1, :cond_2

    new-instance p2, Landroidx/camera/core/CameraControl$OperationCanceledException;

    const-string v0, "Camera is not active."

    invoke-direct {p2, v0}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LO80$a;->f(Ljava/lang/Throwable;)Z

    :cond_2
    return-void

    :cond_3
    iput-boolean p2, p0, LU56;->g:Z

    iget-object v0, p0, LU56;->a:Lr90;

    invoke-virtual {v0, p2}, Lr90;->y(Z)V

    iget-object v0, p0, LU56;->b:LuX2;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, v0, p2}, LU56;->k(LuX2;Ljava/lang/Object;)V

    iget-object p2, p0, LU56;->f:LO80$a;

    if-eqz p2, :cond_4

    new-instance v0, Landroidx/camera/core/CameraControl$OperationCanceledException;

    const-string v1, "There is a new enableTorch being set"

    invoke-direct {v0, v1}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, LO80$a;->f(Ljava/lang/Throwable;)Z

    :cond_4
    iput-object p1, p0, LU56;->f:LO80$a;

    return-void
.end method

.method public f()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LU56;->b:LuX2;

    return-object v0
.end method

.method public j(Z)V
    .locals 2

    iget-boolean v0, p0, LU56;->e:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, LU56;->e:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, LU56;->g:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    iput-boolean p1, p0, LU56;->g:Z

    iget-object v0, p0, LU56;->a:Lr90;

    invoke-virtual {v0, p1}, Lr90;->y(Z)V

    iget-object v0, p0, LU56;->b:LuX2;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, LU56;->k(LuX2;Ljava/lang/Object;)V

    :cond_1
    iget-object p1, p0, LU56;->f:LO80$a;

    if-eqz p1, :cond_2

    new-instance v0, Landroidx/camera/core/CameraControl$OperationCanceledException;

    const-string v1, "Camera is not active."

    invoke-direct {v0, v1}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, LO80$a;->f(Ljava/lang/Throwable;)Z

    const/4 p1, 0x0

    iput-object p1, p0, LU56;->f:LO80$a;

    :cond_2
    return-void
.end method

.method public final k(LuX2;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LuX2<",
            "TT;>;TT;)V"
        }
    .end annotation

    invoke-static {}, LO36;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2}, LuX2;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, LuX2;->postValue(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
