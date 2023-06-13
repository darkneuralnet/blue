.class public Lr90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/CameraControlInternal;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr90$a;,
        Lr90$b;,
        Lr90$c;
    }
.end annotation


# instance fields
.field public final b:Lr90$b;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Ljava/lang/Object;

.field public final e:LWa0;

.field public final f:Landroidx/camera/core/impl/CameraControlInternal$b;

.field public final g:Landroidx/camera/core/impl/q$b;

.field public final h:LLv1;

.field public final i:LoJ6;

.field public final j:LU56;

.field public final k:LBi1;

.field public l:LsJ6;

.field public final m:Lc90;

.field public final n:LP90;

.field public o:I

.field public volatile p:Z

.field public volatile q:I

.field public final r:Ln8;

.field public final s:LRq;

.field public final t:Ljava/util/concurrent/atomic/AtomicLong;

.field public volatile u:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public v:I

.field public w:J

.field public final x:Lr90$a;


# direct methods
.method public constructor <init>(LWa0;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/CameraControlInternal$b;LTe4;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lr90;->d:Ljava/lang/Object;

    new-instance v0, Landroidx/camera/core/impl/q$b;

    invoke-direct {v0}, Landroidx/camera/core/impl/q$b;-><init>()V

    iput-object v0, p0, Lr90;->g:Landroidx/camera/core/impl/q$b;

    const/4 v1, 0x0

    iput v1, p0, Lr90;->o:I

    iput-boolean v1, p0, Lr90;->p:Z

    const/4 v1, 0x2

    iput v1, p0, Lr90;->q:I

    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v1, p0, Lr90;->t:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v1, 0x0

    invoke-static {v1}, LIA1;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    iput-object v1, p0, Lr90;->u:Lcom/google/common/util/concurrent/ListenableFuture;

    const/4 v1, 0x1

    iput v1, p0, Lr90;->v:I

    iput-wide v2, p0, Lr90;->w:J

    new-instance v1, Lr90$a;

    invoke-direct {v1}, Lr90$a;-><init>()V

    iput-object v1, p0, Lr90;->x:Lr90$a;

    iput-object p1, p0, Lr90;->e:LWa0;

    iput-object p4, p0, Lr90;->f:Landroidx/camera/core/impl/CameraControlInternal$b;

    iput-object p3, p0, Lr90;->c:Ljava/util/concurrent/Executor;

    new-instance p4, Lr90$b;

    invoke-direct {p4, p3}, Lr90$b;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object p4, p0, Lr90;->b:Lr90$b;

    iget v2, p0, Lr90;->v:I

    invoke-virtual {v0, v2}, Landroidx/camera/core/impl/q$b;->u(I)Landroidx/camera/core/impl/q$b;

    invoke-static {p4}, Lcf0;->d(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Lcf0;

    move-result-object p4

    invoke-virtual {v0, p4}, Landroidx/camera/core/impl/q$b;->i(Lpa0;)Landroidx/camera/core/impl/q$b;

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/q$b;->i(Lpa0;)Landroidx/camera/core/impl/q$b;

    new-instance p4, LBi1;

    invoke-direct {p4, p0, p1, p3}, LBi1;-><init>(Lr90;LWa0;Ljava/util/concurrent/Executor;)V

    iput-object p4, p0, Lr90;->k:LBi1;

    new-instance p4, LLv1;

    invoke-direct {p4, p0, p2, p3, p5}, LLv1;-><init>(Lr90;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;LTe4;)V

    iput-object p4, p0, Lr90;->h:LLv1;

    new-instance p2, LoJ6;

    invoke-direct {p2, p0, p1, p3}, LoJ6;-><init>(Lr90;LWa0;Ljava/util/concurrent/Executor;)V

    iput-object p2, p0, Lr90;->i:LoJ6;

    new-instance p2, LU56;

    invoke-direct {p2, p0, p1, p3}, LU56;-><init>(Lr90;LWa0;Ljava/util/concurrent/Executor;)V

    iput-object p2, p0, Lr90;->j:LU56;

    new-instance p2, LwJ6;

    invoke-direct {p2, p1}, LwJ6;-><init>(LWa0;)V

    iput-object p2, p0, Lr90;->l:LsJ6;

    new-instance p2, Ln8;

    invoke-direct {p2, p5}, Ln8;-><init>(LTe4;)V

    iput-object p2, p0, Lr90;->r:Ln8;

    new-instance p2, LRq;

    invoke-direct {p2, p5}, LRq;-><init>(LTe4;)V

    iput-object p2, p0, Lr90;->s:LRq;

    new-instance p2, Lc90;

    invoke-direct {p2, p0, p3}, Lc90;-><init>(Lr90;Ljava/util/concurrent/Executor;)V

    iput-object p2, p0, Lr90;->m:Lc90;

    new-instance p2, LP90;

    invoke-direct {p2, p0, p1, p5, p3}, LP90;-><init>(Lr90;LWa0;LTe4;Ljava/util/concurrent/Executor;)V

    iput-object p2, p0, Lr90;->n:LP90;

    new-instance p1, Lj90;

    invoke-direct {p1, p0}, Lj90;-><init>(Lr90;)V

    invoke-interface {p3, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static R(Landroid/hardware/camera2/TotalCaptureResult;J)Z
    .locals 4

    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object p0

    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureRequest;->getTag()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, LxY5;

    if-eqz v0, :cond_2

    check-cast p0, LxY5;

    const-string v0, "CameraControlSessionUpdateId"

    invoke-virtual {p0, v0}, LxY5;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    if-nez p0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p0, v2, p1

    if-ltz p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method public static synthetic T()V
    .locals 0

    return-void
.end method

.method private synthetic U(Ljava/util/concurrent/Executor;Lpa0;)V
    .locals 1

    iget-object v0, p0, Lr90;->x:Lr90$a;

    invoke-virtual {v0, p1, p2}, Lr90$a;->g(Ljava/util/concurrent/Executor;Lpa0;)V

    return-void
.end method

.method public static synthetic V()V
    .locals 0

    return-void
.end method

.method private synthetic W()V
    .locals 1

    iget-object v0, p0, Lr90;->m:Lc90;

    invoke-virtual {v0}, Lc90;->l()Lr90$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lr90;->v(Lr90$c;)V

    return-void
.end method

.method private synthetic X(Lpa0;)V
    .locals 1

    iget-object v0, p0, Lr90;->x:Lr90$a;

    invoke-virtual {v0, p1}, Lr90$a;->k(Lpa0;)V

    return-void
.end method

.method private synthetic Y(Ljava/util/List;IIILjava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object p5, p0, Lr90;->n:LP90;

    invoke-virtual {p5, p1, p2, p3, p4}, LP90;->e(Ljava/util/List;III)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method private synthetic Z(LO80$a;)V
    .locals 2

    invoke-virtual {p0}, Lr90;->n0()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lr90;->o0(J)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    invoke-static {v0, p1}, LIA1;->k(Lcom/google/common/util/concurrent/ListenableFuture;LO80$a;)V

    return-void
.end method

.method private synthetic a0(LO80$a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lr90;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Ll90;

    invoke-direct {v1, p0, p1}, Ll90;-><init>(Lr90;LO80$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p1, "updateSessionConfigAsync"

    return-object p1
.end method

.method public static synthetic b0(JLO80$a;Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-static {p3, p0, p1}, Lr90;->R(Landroid/hardware/camera2/TotalCaptureResult;J)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    invoke-virtual {p2, p0}, LO80$a;->c(Ljava/lang/Object;)Z

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private synthetic c0(JLO80$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, Le90;

    invoke-direct {v0, p1, p2, p3}, Le90;-><init>(JLO80$a;)V

    invoke-virtual {p0, v0}, Lr90;->v(Lr90$c;)V

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "waitForSessionUpdateId:"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic l(Lr90;LO80$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lr90;->Z(LO80$a;)V

    return-void
.end method

.method public static synthetic m(Lr90;Lpa0;)V
    .locals 0

    invoke-direct {p0, p1}, Lr90;->X(Lpa0;)V

    return-void
.end method

.method public static synthetic n(Lr90;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lr90;->a0(LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(JLO80$a;Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lr90;->b0(JLO80$a;Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p0

    return p0
.end method

.method public static synthetic p(Lr90;)V
    .locals 0

    invoke-direct {p0}, Lr90;->W()V

    return-void
.end method

.method public static synthetic q(Lr90;Ljava/util/concurrent/Executor;Lpa0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lr90;->U(Ljava/util/concurrent/Executor;Lpa0;)V

    return-void
.end method

.method public static synthetic r(Lr90;Ljava/util/List;IIILjava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lr90;->Y(Ljava/util/List;IIILjava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lr90;JLO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lr90;->c0(JLO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t()V
    .locals 0

    invoke-static {}, Lr90;->V()V

    return-void
.end method

.method public static synthetic u()V
    .locals 0

    invoke-static {}, Lr90;->T()V

    return-void
.end method


# virtual methods
.method public A()I
    .locals 1

    iget v0, p0, Lr90;->q:I

    return v0
.end method

.method public B()LLv1;
    .locals 1

    iget-object v0, p0, Lr90;->h:LLv1;

    return-object v0
.end method

.method public C()I
    .locals 2

    iget-object v0, p0, Lr90;->e:LWa0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    return v0
.end method

.method public D()I
    .locals 2

    iget-object v0, p0, Lr90;->e:LWa0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AF:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    return v0
.end method

.method public E()I
    .locals 2

    iget-object v0, p0, Lr90;->e:LWa0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AWB:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    return v0
.end method

.method public F()Landroidx/camera/core/impl/q;
    .locals 3

    iget-object v0, p0, Lr90;->g:Landroidx/camera/core/impl/q$b;

    iget v1, p0, Lr90;->v:I

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/q$b;->u(I)Landroidx/camera/core/impl/q$b;

    iget-object v0, p0, Lr90;->g:Landroidx/camera/core/impl/q$b;

    invoke-virtual {p0}, Lr90;->G()Landroidx/camera/core/impl/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/q$b;->s(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/q$b;

    iget-object v0, p0, Lr90;->m:Lc90;

    invoke-virtual {v0}, Lc90;->k()Lja0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lja0;->U(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lr90;->g:Landroidx/camera/core/impl/q$b;

    const-string v2, "Camera2CameraControl"

    invoke-virtual {v1, v2, v0}, Landroidx/camera/core/impl/q$b;->l(Ljava/lang/String;Ljava/lang/Object;)Landroidx/camera/core/impl/q$b;

    :cond_0
    iget-object v0, p0, Lr90;->g:Landroidx/camera/core/impl/q$b;

    iget-wide v1, p0, Lr90;->w:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "CameraControlSessionUpdateId"

    invoke-virtual {v0, v2, v1}, Landroidx/camera/core/impl/q$b;->l(Ljava/lang/String;Ljava/lang/Object;)Landroidx/camera/core/impl/q$b;

    iget-object v0, p0, Lr90;->g:Landroidx/camera/core/impl/q$b;

    invoke-virtual {v0}, Landroidx/camera/core/impl/q$b;->m()Landroidx/camera/core/impl/q;

    move-result-object v0

    return-object v0
.end method

.method public G()Landroidx/camera/core/impl/f;
    .locals 7

    new-instance v0, Lja0$a;

    invoke-direct {v0}, Lja0$a;-><init>()V

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    iget-object v1, p0, Lr90;->h:LLv1;

    invoke-virtual {v1, v0}, LLv1;->i(Lja0$a;)V

    iget-object v1, p0, Lr90;->r:Ln8;

    invoke-virtual {v1, v0}, Ln8;->a(Lja0$a;)V

    iget-object v1, p0, Lr90;->i:LoJ6;

    invoke-virtual {v1, v0}, LoJ6;->e(Lja0$a;)V

    iget-boolean v1, p0, Lr90;->p:Z

    const/4 v3, 0x2

    if-eqz v1, :cond_0

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    goto :goto_0

    :cond_0
    iget v1, p0, Lr90;->q:I

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_1
    const/4 v1, 0x3

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lr90;->s:LRq;

    invoke-virtual {v1, v3}, LRq;->a(I)I

    move-result v1

    :goto_1
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p0, v1}, Lr90;->H(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p0, v2}, Lr90;->J(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    iget-object v1, p0, Lr90;->k:LBi1;

    invoke-virtual {v1, v0}, LBi1;->c(Lja0$a;)V

    iget-object v1, p0, Lr90;->m:Lc90;

    invoke-virtual {v1}, Lc90;->k()Lja0;

    move-result-object v1

    invoke-interface {v1}, Landroidx/camera/core/impl/f;->g()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/f$a;

    invoke-virtual {v0}, Lja0$a;->b()Landroidx/camera/core/impl/l;

    move-result-object v4

    sget-object v5, Landroidx/camera/core/impl/f$c;->b:Landroidx/camera/core/impl/f$c;

    invoke-interface {v1, v3}, Landroidx/camera/core/impl/f;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4, v3, v5, v6}, Landroidx/camera/core/impl/l;->n(Landroidx/camera/core/impl/f$a;Landroidx/camera/core/impl/f$c;Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Lja0$a;->a()Lja0;

    move-result-object v0

    return-object v0
.end method

.method public H(I)I
    .locals 3

    iget-object v0, p0, Lr90;->e:LWa0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1, v0}, Lr90;->Q(I[I)Z

    move-result v2

    if-eqz v2, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lr90;->Q(I[I)Z

    move-result v0

    if-eqz v0, :cond_2

    return p1

    :cond_2
    return v1
.end method

.method public I(I)I
    .locals 3

    iget-object v0, p0, Lr90;->e:LWa0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AF_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1, v0}, Lr90;->Q(I[I)Z

    move-result v2

    if-eqz v2, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x4

    invoke-virtual {p0, p1, v0}, Lr90;->Q(I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    return p1

    :cond_2
    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lr90;->Q(I[I)Z

    move-result v0

    if-eqz v0, :cond_3

    return p1

    :cond_3
    return v1
.end method

.method public final J(I)I
    .locals 3

    iget-object v0, p0, Lr90;->e:LWa0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AWB_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1, v0}, Lr90;->Q(I[I)Z

    move-result v2

    if-eqz v2, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lr90;->Q(I[I)Z

    move-result v0

    if-eqz v0, :cond_2

    return p1

    :cond_2
    return v1
.end method

.method public K()LU56;
    .locals 1

    iget-object v0, p0, Lr90;->j:LU56;

    return-object v0
.end method

.method public L()I
    .locals 2

    iget-object v0, p0, Lr90;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lr90;->o:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public M()LoJ6;
    .locals 1

    iget-object v0, p0, Lr90;->i:LoJ6;

    return-object v0
.end method

.method public N()LsJ6;
    .locals 1

    iget-object v0, p0, Lr90;->l:LsJ6;

    return-object v0
.end method

.method public O()V
    .locals 2

    iget-object v0, p0, Lr90;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lr90;->o:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lr90;->o:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final P()Z
    .locals 1

    invoke-virtual {p0}, Lr90;->L()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final Q(I[I)Z
    .locals 4

    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget v3, p2, v2

    if-ne p1, v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public S()Z
    .locals 1

    iget-boolean v0, p0, Lr90;->p:Z

    return v0
.end method

.method public a(Landroidx/camera/core/impl/q$b;)V
    .locals 1

    iget-object v0, p0, Lr90;->l:LsJ6;

    invoke-interface {v0, p1}, LsJ6;->a(Landroidx/camera/core/impl/q$b;)V

    return-void
.end method

.method public b(F)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lr90;->P()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Landroidx/camera/core/CameraControl$OperationCanceledException;

    const-string v0, "Camera is not active."

    invoke-direct {p1, v0}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lr90;->i:LoJ6;

    invoke-virtual {v0, p1}, LoJ6;->q(F)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    invoke-static {p1}, LIA1;->j(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/util/List;II)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d;",
            ">;II)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lr90;->P()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Camera2CameraControlImp"

    const-string p2, "Camera is not active."

    invoke-static {p1, p2}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Landroidx/camera/core/CameraControl$OperationCanceledException;

    invoke-direct {p1, p2}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lr90;->A()I

    move-result v4

    iget-object v0, p0, Lr90;->u:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-static {v0}, LIA1;->j(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    invoke-static {v0}, LDA1;->a(Lcom/google/common/util/concurrent/ListenableFuture;)LDA1;

    move-result-object v6

    new-instance v7, Li90;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Li90;-><init>(Lr90;Ljava/util/List;III)V

    iget-object p1, p0, Lr90;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {v6, v7, p1}, LDA1;->e(Lfp;Ljava/util/concurrent/Executor;)LDA1;

    move-result-object p1

    return-object p1
.end method

.method public d(F)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lr90;->P()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Landroidx/camera/core/CameraControl$OperationCanceledException;

    const-string v0, "Camera is not active."

    invoke-direct {p1, v0}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lr90;->i:LoJ6;

    invoke-virtual {v0, p1}, LoJ6;->r(F)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    invoke-static {p1}, LIA1;->j(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public d0(Lr90$c;)V
    .locals 1

    iget-object v0, p0, Lr90;->b:Lr90$b;

    invoke-virtual {v0, p1}, Lr90$b;->d(Lr90$c;)V

    return-void
.end method

.method public e(Z)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lr90;->P()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Landroidx/camera/core/CameraControl$OperationCanceledException;

    const-string v0, "Camera is not active."

    invoke-direct {p1, v0}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lr90;->j:LU56;

    invoke-virtual {v0, p1}, LU56;->d(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    invoke-static {p1}, LIA1;->j(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public e0(Lpa0;)V
    .locals 2

    iget-object v0, p0, Lr90;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Ld90;

    invoke-direct {v1, p0, p1}, Ld90;-><init>(Lr90;Lpa0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public f(Landroidx/camera/core/impl/f;)V
    .locals 2

    iget-object v0, p0, Lr90;->m:Lc90;

    invoke-static {p1}, Lnf0$a;->e(Landroidx/camera/core/impl/f;)Lnf0$a;

    move-result-object p1

    invoke-virtual {p1}, Lnf0$a;->c()Lnf0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc90;->g(Lnf0;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    new-instance v0, Lk90;

    invoke-direct {v0}, Lk90;-><init>()V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public f0()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lr90;->i0(I)V

    return-void
.end method

.method public g(LCv1;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LCv1;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "LMv1;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lr90;->P()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Landroidx/camera/core/CameraControl$OperationCanceledException;

    const-string v0, "Camera is not active."

    invoke-direct {p1, v0}, Landroidx/camera/core/CameraControl$OperationCanceledException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lr90;->h:LLv1;

    invoke-virtual {v0, p1}, LLv1;->N(LCv1;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    invoke-static {p1}, LIA1;->j(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public g0(Z)V
    .locals 1

    iget-object v0, p0, Lr90;->h:LLv1;

    invoke-virtual {v0, p1}, LLv1;->J(Z)V

    iget-object v0, p0, Lr90;->i:LoJ6;

    invoke-virtual {v0, p1}, LoJ6;->p(Z)V

    iget-object v0, p0, Lr90;->j:LU56;

    invoke-virtual {v0, p1}, LU56;->j(Z)V

    iget-object v0, p0, Lr90;->k:LBi1;

    invoke-virtual {v0, p1}, LBi1;->b(Z)V

    iget-object v0, p0, Lr90;->m:Lc90;

    invoke-virtual {v0, p1}, Lc90;->s(Z)V

    return-void
.end method

.method public h()Landroid/graphics/Rect;
    .locals 2

    iget-object v0, p0, Lr90;->e:LWa0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_ACTIVE_ARRAY_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    invoke-static {v0}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    return-object v0
.end method

.method public h0(Landroid/util/Rational;)V
    .locals 1

    iget-object v0, p0, Lr90;->h:LLv1;

    invoke-virtual {v0, p1}, LLv1;->K(Landroid/util/Rational;)V

    return-void
.end method

.method public i(I)V
    .locals 2

    invoke-virtual {p0}, Lr90;->P()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Camera2CameraControlImp"

    const-string v0, "Camera is not active."

    invoke-static {p1, v0}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iput p1, p0, Lr90;->q:I

    iget-object p1, p0, Lr90;->l:LsJ6;

    iget v0, p0, Lr90;->q:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    iget v0, p0, Lr90;->q:I

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    invoke-interface {p1, v1}, LsJ6;->c(Z)V

    invoke-virtual {p0}, Lr90;->m0()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    iput-object p1, p0, Lr90;->u:Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method

.method public i0(I)V
    .locals 1

    iput p1, p0, Lr90;->v:I

    iget-object v0, p0, Lr90;->h:LLv1;

    invoke-virtual {v0, p1}, LLv1;->L(I)V

    iget-object p1, p0, Lr90;->n:LP90;

    iget v0, p0, Lr90;->v:I

    invoke-virtual {p1, v0}, LP90;->d(I)V

    return-void
.end method

.method public j()Landroidx/camera/core/impl/f;
    .locals 1

    iget-object v0, p0, Lr90;->m:Lc90;

    invoke-virtual {v0}, Lc90;->k()Lja0;

    move-result-object v0

    return-object v0
.end method

.method public j0(Z)V
    .locals 1

    iget-object v0, p0, Lr90;->l:LsJ6;

    invoke-interface {v0, p1}, LsJ6;->d(Z)V

    return-void
.end method

.method public k()V
    .locals 3

    iget-object v0, p0, Lr90;->m:Lc90;

    invoke-virtual {v0}, Lc90;->i()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v1, Lg90;

    invoke-direct {v1}, Lg90;-><init>()V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public k0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lr90;->f:Landroidx/camera/core/impl/CameraControlInternal$b;

    invoke-interface {v0, p1}, Landroidx/camera/core/impl/CameraControlInternal$b;->a(Ljava/util/List;)V

    return-void
.end method

.method public l0()V
    .locals 2

    iget-object v0, p0, Lr90;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lm90;

    invoke-direct {v1, p0}, Lm90;-><init>(Lr90;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public m0()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lf90;

    invoke-direct {v0, p0}, Lf90;-><init>(Lr90;)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    invoke-static {v0}, LIA1;->j(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public n0()J
    .locals 2

    iget-object v0, p0, Lr90;->t:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, Lr90;->w:J

    iget-object v0, p0, Lr90;->f:Landroidx/camera/core/impl/CameraControlInternal$b;

    invoke-interface {v0}, Landroidx/camera/core/impl/CameraControlInternal$b;->b()V

    iget-wide v0, p0, Lr90;->w:J

    return-wide v0
.end method

.method public final o0(J)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ln90;

    invoke-direct {v0, p0, p1, p2}, Ln90;-><init>(Lr90;J)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public v(Lr90$c;)V
    .locals 1

    iget-object v0, p0, Lr90;->b:Lr90$b;

    invoke-virtual {v0, p1}, Lr90$b;->b(Lr90$c;)V

    return-void
.end method

.method public w(Ljava/util/concurrent/Executor;Lpa0;)V
    .locals 2

    iget-object v0, p0, Lr90;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lh90;

    invoke-direct {v1, p0, p1, p2}, Lh90;-><init>(Lr90;Ljava/util/concurrent/Executor;Lpa0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public x()V
    .locals 3

    iget-object v0, p0, Lr90;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lr90;->o:I

    if-eqz v1, :cond_0

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lr90;->o:I

    monitor-exit v0

    return-void

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Decrementing use count occurs more times than incrementing"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public y(Z)V
    .locals 3

    iput-boolean p1, p0, Lr90;->p:Z

    if-nez p1, :cond_0

    new-instance p1, Landroidx/camera/core/impl/d$a;

    invoke-direct {p1}, Landroidx/camera/core/impl/d$a;-><init>()V

    iget v0, p0, Lr90;->v:I

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/d$a;->s(I)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/d$a;->t(Z)V

    new-instance v1, Lja0$a;

    invoke-direct {v1}, Lja0$a;-><init>()V

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p0, v0}, Lr90;->H(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    invoke-virtual {v1}, Lja0$a;->a()Lja0;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/d$a;->e(Landroidx/camera/core/impl/f;)V

    invoke-virtual {p1}, Landroidx/camera/core/impl/d$a;->h()Landroidx/camera/core/impl/d;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lr90;->k0(Ljava/util/List;)V

    :cond_0
    invoke-virtual {p0}, Lr90;->n0()J

    return-void
.end method

.method public z()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lr90;->i:LoJ6;

    invoke-virtual {v0}, LoJ6;->g()Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method
