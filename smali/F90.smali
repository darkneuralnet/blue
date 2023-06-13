.class public final LF90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLb0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF90$g;,
        LF90$h;,
        LF90$f;,
        LF90$d;,
        LF90$e;,
        LF90$i;
    }
.end annotation


# instance fields
.field public A:Landroidx/camera/core/impl/c;

.field public final B:Ljava/lang/Object;

.field public C:Lyv5;

.field public D:Z

.field public final E:Li51;

.field public final F:LWa0;

.field public final b:Landroidx/camera/core/impl/r;

.field public final c:LRb0;

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:Ljava/util/concurrent/ScheduledExecutorService;

.field public volatile f:LF90$g;

.field public final g:LUs2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LUs2<",
            "LLb0$a;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lkc0;

.field public final i:Lr90;

.field public final j:LF90$h;

.field public final k:LJ90;

.field public l:Landroid/hardware/camera2/CameraDevice;

.field public m:I

.field public n:Lsf0;

.field public final o:Ljava/util/concurrent/atomic/AtomicInteger;

.field public p:LO80$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lsf0;",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end field

.field public final r:LF90$d;

.field public final s:LF90$e;

.field public final t:Lkb0;

.field public final u:Lnc0;

.field public final v:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lrf0;",
            ">;"
        }
    .end annotation
.end field

.field public w:LVT2;

.field public final x:Lvf0;

.field public final y:LPX5$a;

.field public final z:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LRb0;Ljava/lang/String;LJ90;Lkb0;Lnc0;Ljava/util/concurrent/Executor;Landroid/os/Handler;Li51;)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/CameraUnavailableException;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    sget-object v5, LF90$g;->b:LF90$g;

    iput-object v5, v1, LF90;->f:LF90$g;

    new-instance v5, LUs2;

    invoke-direct {v5}, LUs2;-><init>()V

    iput-object v5, v1, LF90;->g:LUs2;

    const/4 v6, 0x0

    iput v6, v1, LF90;->m:I

    new-instance v7, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v7, v6}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v7, v1, LF90;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v7, v1, LF90;->q:Ljava/util/Map;

    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    iput-object v7, v1, LF90;->v:Ljava/util/Set;

    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    iput-object v7, v1, LF90;->z:Ljava/util/Set;

    invoke-static {}, Lbb0;->a()Landroidx/camera/core/impl/c;

    move-result-object v7

    iput-object v7, v1, LF90;->A:Landroidx/camera/core/impl/c;

    new-instance v7, Ljava/lang/Object;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    iput-object v7, v1, LF90;->B:Ljava/lang/Object;

    iput-boolean v6, v1, LF90;->D:Z

    iput-object v0, v1, LF90;->c:LRb0;

    move-object/from16 v6, p4

    iput-object v6, v1, LF90;->t:Lkb0;

    iput-object v4, v1, LF90;->u:Lnc0;

    invoke-static/range {p7 .. p7}, LAc0;->e(Landroid/os/Handler;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v12

    iput-object v12, v1, LF90;->e:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static/range {p6 .. p6}, LAc0;->f(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v13

    iput-object v13, v1, LF90;->d:Ljava/util/concurrent/Executor;

    new-instance v6, LF90$h;

    invoke-direct {v6, v1, v13, v12}, LF90$h;-><init>(LF90;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object v6, v1, LF90;->j:LF90$h;

    new-instance v6, Landroidx/camera/core/impl/r;

    invoke-direct {v6, v2}, Landroidx/camera/core/impl/r;-><init>(Ljava/lang/String;)V

    iput-object v6, v1, LF90;->b:Landroidx/camera/core/impl/r;

    sget-object v6, LLb0$a;->h:LLb0$a;

    invoke-virtual {v5, v6}, LUs2;->l(Ljava/lang/Object;)V

    new-instance v5, Lkc0;

    invoke-direct {v5, v4}, Lkc0;-><init>(Lnc0;)V

    iput-object v5, v1, LF90;->h:Lkc0;

    new-instance v14, Lvf0;

    invoke-direct {v14, v13}, Lvf0;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v14, v1, LF90;->x:Lvf0;

    move-object/from16 v6, p8

    iput-object v6, v1, LF90;->E:Li51;

    invoke-virtual/range {p0 .. p0}, LF90;->Z()Lsf0;

    move-result-object v6

    iput-object v6, v1, LF90;->n:Lsf0;

    :try_start_0
    invoke-virtual/range {p1 .. p2}, LRb0;->c(Ljava/lang/String;)LWa0;

    move-result-object v7

    iput-object v7, v1, LF90;->F:LWa0;

    new-instance v15, Lr90;

    new-instance v10, LF90$f;

    invoke-direct {v10, v1}, LF90$f;-><init>(LF90;)V

    invoke-virtual/range {p3 .. p3}, LJ90;->k()LTe4;

    move-result-object v11

    move-object v6, v15

    move-object v8, v12

    move-object v9, v13

    invoke-direct/range {v6 .. v11}, Lr90;-><init>(LWa0;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/CameraControlInternal$b;LTe4;)V

    iput-object v15, v1, LF90;->i:Lr90;

    iput-object v3, v1, LF90;->k:LJ90;

    invoke-virtual {v3, v15}, LJ90;->u(Lr90;)V

    invoke-virtual {v5}, Lkc0;->a()Landroidx/lifecycle/LiveData;

    move-result-object v5

    invoke-virtual {v3, v5}, LJ90;->x(Landroidx/lifecycle/LiveData;)V
    :try_end_0
    .catch Landroidx/camera/camera2/internal/compat/CameraAccessExceptionCompat; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v5, LPX5$a;

    invoke-virtual/range {p3 .. p3}, LJ90;->k()LTe4;

    move-result-object v11

    invoke-static {}, LS21;->b()LTe4;

    move-result-object v3

    move-object v6, v5

    move-object v7, v13

    move-object v8, v12

    move-object/from16 v9, p7

    move-object v10, v14

    move-object v12, v3

    invoke-direct/range {v6 .. v12}, LPX5$a;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;Lvf0;LTe4;LTe4;)V

    iput-object v5, v1, LF90;->y:LPX5$a;

    new-instance v3, LF90$d;

    invoke-direct {v3, v1, v2}, LF90$d;-><init>(LF90;Ljava/lang/String;)V

    iput-object v3, v1, LF90;->r:LF90$d;

    new-instance v2, LF90$e;

    invoke-direct {v2, v1}, LF90$e;-><init>(LF90;)V

    iput-object v2, v1, LF90;->s:LF90$e;

    invoke-virtual {v4, v1, v13, v2, v3}, Lnc0;->g(Lna0;Ljava/util/concurrent/Executor;Lnc0$b;Lnc0$c;)V

    invoke-virtual {v0, v13, v3}, LRb0;->g(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lpc0;->a(Landroidx/camera/camera2/internal/compat/CameraAccessExceptionCompat;)Landroidx/camera/core/CameraUnavailableException;

    move-result-object v0

    throw v0
.end method

.method public static L(I)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const-string p0, "UNKNOWN ERROR"

    return-object p0

    :cond_0
    const-string p0, "ERROR_CAMERA_SERVICE"

    return-object p0

    :cond_1
    const-string p0, "ERROR_CAMERA_DEVICE"

    return-object p0

    :cond_2
    const-string p0, "ERROR_CAMERA_DISABLED"

    return-object p0

    :cond_3
    const-string p0, "ERROR_MAX_CAMERAS_IN_USE"

    return-object p0

    :cond_4
    const-string p0, "ERROR_CAMERA_IN_USE"

    return-object p0

    :cond_5
    const-string p0, "ERROR_NONE"

    return-object p0
.end method

.method public static M(Landroidx/camera/core/p;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/camera/core/p;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private synthetic P(Ljava/util/List;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0, p1}, LF90;->p0(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LF90;->i:Lr90;

    invoke-virtual {p1}, Lr90;->x()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LF90;->i:Lr90;

    invoke-virtual {v0}, Lr90;->x()V

    throw p1
.end method

.method public static synthetic Q(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    invoke-virtual {p0}, Landroid/view/Surface;->release()V

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->release()V

    return-void
.end method

.method private synthetic R(Lrf0;Landroidx/camera/core/impl/DeferrableSurface;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LF90;->g0(Lrf0;Landroidx/camera/core/impl/DeferrableSurface;Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic S(Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1}, LF90;->q0(Ljava/util/Collection;)V

    return-void
.end method

.method private synthetic T(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Use case "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ACTIVE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LF90;->H(Ljava/lang/String;)V

    iget-object v0, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/camera/core/impl/r;->q(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V

    iget-object v0, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/camera/core/impl/r;->u(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V

    invoke-virtual {p0}, LF90;->t0()V

    return-void
.end method

.method private synthetic U(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Use case "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " INACTIVE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LF90;->H(Ljava/lang/String;)V

    iget-object v0, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/r;->t(Ljava/lang/String;)V

    invoke-virtual {p0}, LF90;->t0()V

    return-void
.end method

.method private synthetic V(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Use case "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " RESET"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LF90;->H(Ljava/lang/String;)V

    iget-object v0, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/camera/core/impl/r;->u(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LF90;->j0(Z)V

    invoke-virtual {p0}, LF90;->t0()V

    iget-object p1, p0, LF90;->f:LF90$g;

    sget-object p2, LF90$g;->e:LF90$g;

    if-ne p1, p2, :cond_0

    invoke-virtual {p0}, LF90;->d0()V

    :cond_0
    return-void
.end method

.method private synthetic W(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Use case "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " UPDATED"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LF90;->H(Ljava/lang/String;)V

    iget-object v0, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/camera/core/impl/r;->u(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V

    invoke-virtual {p0}, LF90;->t0()V

    return-void
.end method

.method public static synthetic X(Landroidx/camera/core/impl/q$c;Landroidx/camera/core/impl/q;)V
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/q$f;->b:Landroidx/camera/core/impl/q$f;

    invoke-interface {p0, p1, v0}, Landroidx/camera/core/impl/q$c;->a(Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V

    return-void
.end method

.method private synthetic Y(Z)V
    .locals 1

    iput-boolean p1, p0, LF90;->D:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, LF90;->f:LF90$g;

    sget-object v0, LF90$g;->c:LF90$g;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LF90;->r0(Z)V

    :cond_0
    return-void
.end method

.method public static synthetic m(LF90;Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LF90;->W(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V

    return-void
.end method

.method public static synthetic r(LF90;Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LF90;->V(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V

    return-void
.end method

.method public static synthetic s(LF90;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, LF90;->U(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic t(LF90;Lrf0;Landroidx/camera/core/impl/DeferrableSurface;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LF90;->R(Lrf0;Landroidx/camera/core/impl/DeferrableSurface;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic u(LF90;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, LF90;->P(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic v(Landroidx/camera/core/impl/q$c;Landroidx/camera/core/impl/q;)V
    .locals 0

    invoke-static {p0, p1}, LF90;->X(Landroidx/camera/core/impl/q$c;Landroidx/camera/core/impl/q;)V

    return-void
.end method

.method public static synthetic w(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    invoke-static {p0, p1}, LF90;->Q(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V

    return-void
.end method

.method public static synthetic x(LF90;Z)V
    .locals 0

    invoke-direct {p0, p1}, LF90;->Y(Z)V

    return-void
.end method

.method public static synthetic y(LF90;Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LF90;->T(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V

    return-void
.end method

.method public static synthetic z(LF90;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, LF90;->S(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 4

    iget-object v0, p0, LF90;->w:LVT2;

    if-eqz v0, :cond_0

    iget-object v0, p0, LF90;->b:Landroidx/camera/core/impl/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LF90;->w:LVT2;

    invoke-virtual {v2}, LVT2;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LF90;->w:LVT2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LF90;->w:LVT2;

    invoke-virtual {v2}, LVT2;->e()Landroidx/camera/core/impl/q;

    move-result-object v2

    iget-object v3, p0, LF90;->w:LVT2;

    invoke-virtual {v3}, LVT2;->f()Landroidx/camera/core/impl/s;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroidx/camera/core/impl/r;->r(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V

    iget-object v0, p0, LF90;->b:Landroidx/camera/core/impl/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LF90;->w:LVT2;

    invoke-virtual {v2}, LVT2;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LF90;->w:LVT2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LF90;->w:LVT2;

    invoke-virtual {v2}, LVT2;->e()Landroidx/camera/core/impl/q;

    move-result-object v2

    iget-object v3, p0, LF90;->w:LVT2;

    invoke-virtual {v3}, LVT2;->f()Landroidx/camera/core/impl/s;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroidx/camera/core/impl/r;->q(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V

    :cond_0
    return-void
.end method

.method public final B()V
    .locals 4

    iget-object v0, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {v0}, Landroidx/camera/core/impl/r;->f()Landroidx/camera/core/impl/q$g;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/q$g;->b()Landroidx/camera/core/impl/q;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/q;->h()Landroidx/camera/core/impl/d;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/camera/core/impl/d;->f()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0}, Landroidx/camera/core/impl/q;->k()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v0}, Landroidx/camera/core/impl/q;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v1}, Landroidx/camera/core/impl/d;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LF90;->w:LVT2;

    if-nez v0, :cond_0

    new-instance v0, LVT2;

    iget-object v1, p0, LF90;->k:LJ90;

    invoke-virtual {v1}, LJ90;->q()LWa0;

    move-result-object v1

    iget-object v2, p0, LF90;->E:Li51;

    invoke-direct {v0, v1, v2}, LVT2;-><init>(LWa0;Li51;)V

    iput-object v0, p0, LF90;->w:LVT2;

    :cond_0
    invoke-virtual {p0}, LF90;->A()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    if-ne v3, v0, :cond_2

    if-ne v2, v0, :cond_2

    invoke-virtual {p0}, LF90;->i0()V

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    if-lt v2, v0, :cond_3

    invoke-virtual {p0}, LF90;->i0()V

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", CaptureConfig Surfaces: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Camera2CameraImpl"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public final C(Landroidx/camera/core/impl/d$a;)Z
    .locals 5

    invoke-virtual {p1}, Landroidx/camera/core/impl/d$a;->m()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "Camera2CameraImpl"

    if-nez v0, :cond_0

    const-string p1, "The capture config builder already has surface inside."

    invoke-static {v2, p1}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    iget-object v0, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {v0}, Landroidx/camera/core/impl/r;->e()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/q;

    invoke-virtual {v3}, Landroidx/camera/core/impl/q;->h()Landroidx/camera/core/impl/d;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/camera/core/impl/d;->f()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {p1, v4}, Landroidx/camera/core/impl/d$a;->f(Landroidx/camera/core/impl/DeferrableSurface;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroidx/camera/core/impl/d$a;->m()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "Unable to find a repeating surface to attach to CaptureConfig"

    invoke-static {v2, p1}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public D(Z)V
    .locals 3

    iget-object v0, p0, LF90;->f:LF90$g;

    sget-object v1, LF90$g;->g:LF90$g;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, LF90;->f:LF90$g;

    sget-object v1, LF90$g;->i:LF90$g;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, LF90;->f:LF90$g;

    sget-object v1, LF90$g;->h:LF90$g;

    if-ne v0, v1, :cond_0

    iget v0, p0, LF90;->m:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LF90;->f:LF90$g;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " (error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LF90;->m:I

    invoke-static {v2}, LF90;->L(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_2

    invoke-virtual {p0}, LF90;->N()Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, LF90;->m:I

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, LF90;->F(Z)V

    goto :goto_2

    :cond_2
    invoke-virtual {p0, p1}, LF90;->j0(Z)V

    :goto_2
    iget-object p1, p0, LF90;->n:Lsf0;

    invoke-interface {p1}, Lsf0;->f()V

    return-void
.end method

.method public final E()V
    .locals 3

    const-string v0, "Closing camera."

    invoke-virtual {p0, v0}, LF90;->H(Ljava/lang/String;)V

    sget-object v0, LF90$c;->a:[I

    iget-object v1, p0, LF90;->f:LF90$g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "close() ignored due to being in state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LF90;->f:LF90$g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LF90;->H(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LF90;->j:LF90$h;

    invoke-virtual {v0}, LF90$h;->a()Z

    move-result v0

    sget-object v1, LF90$g;->g:LF90$g;

    invoke-virtual {p0, v1}, LF90;->k0(LF90$g;)V

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LF90;->O()Z

    move-result v0

    invoke-static {v0}, LHZ3;->i(Z)V

    invoke-virtual {p0}, LF90;->K()V

    goto :goto_0

    :cond_1
    sget-object v0, LF90$g;->g:LF90$g;

    invoke-virtual {p0, v0}, LF90;->k0(LF90$g;)V

    invoke-virtual {p0, v2}, LF90;->D(Z)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LF90;->l:Landroid/hardware/camera2/CameraDevice;

    if-nez v0, :cond_3

    const/4 v2, 0x1

    :cond_3
    invoke-static {v2}, LHZ3;->i(Z)V

    sget-object v0, LF90$g;->b:LF90$g;

    invoke-virtual {p0, v0}, LF90;->k0(LF90$g;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public final F(Z)V
    .locals 5

    new-instance v0, Lrf0;

    invoke-direct {v0}, Lrf0;-><init>()V

    iget-object v1, p0, LF90;->v:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1}, LF90;->j0(Z)V

    new-instance p1, Landroid/graphics/SurfaceTexture;

    const/4 v1, 0x0

    invoke-direct {p1, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    const/16 v1, 0x280

    const/16 v2, 0x1e0

    invoke-virtual {p1, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    new-instance v2, LC90;

    invoke-direct {v2, v1, p1}, LC90;-><init>(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V

    new-instance p1, Landroidx/camera/core/impl/q$b;

    invoke-direct {p1}, Landroidx/camera/core/impl/q$b;-><init>()V

    new-instance v3, LNY1;

    invoke-direct {v3, v1}, LNY1;-><init>(Landroid/view/Surface;)V

    invoke-virtual {p1, v3}, Landroidx/camera/core/impl/q$b;->h(Landroidx/camera/core/impl/DeferrableSurface;)Landroidx/camera/core/impl/q$b;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroidx/camera/core/impl/q$b;->u(I)Landroidx/camera/core/impl/q$b;

    const-string v1, "Start configAndClose."

    invoke-virtual {p0, v1}, LF90;->H(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/camera/core/impl/q$b;->m()Landroidx/camera/core/impl/q;

    move-result-object p1

    iget-object v1, p0, LF90;->l:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/camera2/CameraDevice;

    iget-object v4, p0, LF90;->y:LPX5$a;

    invoke-virtual {v4}, LPX5$a;->a()LPX5;

    move-result-object v4

    invoke-virtual {v0, p1, v1, v4}, Lrf0;->a(Landroidx/camera/core/impl/q;Landroid/hardware/camera2/CameraDevice;LPX5;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    new-instance v1, LD90;

    invoke-direct {v1, p0, v0, v3, v2}, LD90;-><init>(LF90;Lrf0;Landroidx/camera/core/impl/DeferrableSurface;Ljava/lang/Runnable;)V

    iget-object v0, p0, LF90;->d:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v1, v0}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final G()Landroid/hardware/camera2/CameraDevice$StateCallback;
    .locals 2

    iget-object v0, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {v0}, Landroidx/camera/core/impl/r;->f()Landroidx/camera/core/impl/q$g;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/q$g;->b()Landroidx/camera/core/impl/q;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/q;->b()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, LF90;->x:Lvf0;

    invoke-virtual {v0}, Lvf0;->c()Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LF90;->j:LF90$h;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Lwb0;->a(Ljava/util/List;)Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object v0

    return-object v0
.end method

.method public H(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LF90;->I(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final I(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0}, LF90;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string p1, "{%s} %s"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Camera2CameraImpl"

    invoke-static {v0, p1, p2}, LJx2;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public J(Landroidx/camera/core/impl/DeferrableSurface;)Landroidx/camera/core/impl/q;
    .locals 3

    iget-object v0, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {v0}, Landroidx/camera/core/impl/r;->g()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/q;

    invoke-virtual {v1}, Landroidx/camera/core/impl/q;->k()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public K()V
    .locals 3

    iget-object v0, p0, LF90;->f:LF90$g;

    sget-object v1, LF90$g;->i:LF90$g;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, LF90;->f:LF90$g;

    sget-object v1, LF90$g;->g:LF90$g;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, LHZ3;->i(Z)V

    iget-object v0, p0, LF90;->q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    invoke-static {v0}, LHZ3;->i(Z)V

    const/4 v0, 0x0

    iput-object v0, p0, LF90;->l:Landroid/hardware/camera2/CameraDevice;

    iget-object v1, p0, LF90;->f:LF90$g;

    sget-object v2, LF90$g;->g:LF90$g;

    if-ne v1, v2, :cond_2

    sget-object v0, LF90$g;->b:LF90$g;

    invoke-virtual {p0, v0}, LF90;->k0(LF90$g;)V

    goto :goto_2

    :cond_2
    iget-object v1, p0, LF90;->c:LRb0;

    iget-object v2, p0, LF90;->r:LF90$d;

    invoke-virtual {v1, v2}, LRb0;->h(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    sget-object v1, LF90$g;->j:LF90$g;

    invoke-virtual {p0, v1}, LF90;->k0(LF90$g;)V

    iget-object v1, p0, LF90;->p:LO80$a;

    if-eqz v1, :cond_3

    invoke-virtual {v1, v0}, LO80$a;->c(Ljava/lang/Object;)Z

    iput-object v0, p0, LF90;->p:LO80$a;

    :cond_3
    :goto_2
    return-void
.end method

.method public final N()Z
    .locals 2

    invoke-virtual {p0}, LF90;->d()LKb0;

    move-result-object v0

    check-cast v0, LJ90;

    invoke-virtual {v0}, LJ90;->s()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public O()Z
    .locals 1

    iget-object v0, p0, LF90;->q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LF90;->v:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final Z()Lsf0;
    .locals 6

    iget-object v0, p0, LF90;->B:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LF90;->C:Lyv5;

    if-nez v1, :cond_0

    new-instance v1, Lrf0;

    invoke-direct {v1}, Lrf0;-><init>()V

    monitor-exit v0

    return-object v1

    :cond_0
    new-instance v1, LX64;

    iget-object v2, p0, LF90;->C:Lyv5;

    iget-object v3, p0, LF90;->k:LJ90;

    iget-object v4, p0, LF90;->d:Ljava/util/concurrent/Executor;

    iget-object v5, p0, LF90;->e:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v1, v2, v3, v4, v5}, LX64;-><init>(Lyv5;LJ90;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final a0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/p;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/p;

    invoke-static {v0}, LF90;->M(Landroidx/camera/core/p;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LF90;->z:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, LF90;->z:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Landroidx/camera/core/p;->I()V

    invoke-virtual {v0}, Landroidx/camera/core/p;->G()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final b0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/p;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/p;

    invoke-static {v0}, LF90;->M(Landroidx/camera/core/p;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LF90;->z:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/camera/core/p;->J()V

    iget-object v0, p0, LF90;->z:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c(Landroidx/camera/core/p;)V
    .locals 4

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LF90;->M(Landroidx/camera/core/p;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/camera/core/p;->r()Landroidx/camera/core/impl/q;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object p1

    iget-object v2, p0, LF90;->d:Ljava/util/concurrent/Executor;

    new-instance v3, Lz90;

    invoke-direct {v3, p0, v0, v1, p1}, Lz90;-><init>(LF90;Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c0(Z)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "Unable to open camera due to "

    if-nez p1, :cond_0

    iget-object p1, p0, LF90;->j:LF90$h;

    invoke-virtual {p1}, LF90$h;->d()V

    :cond_0
    iget-object p1, p0, LF90;->j:LF90$h;

    invoke-virtual {p1}, LF90$h;->a()Z

    const-string p1, "Opening camera."

    invoke-virtual {p0, p1}, LF90;->H(Ljava/lang/String;)V

    sget-object p1, LF90$g;->d:LF90$g;

    invoke-virtual {p0, p1}, LF90;->k0(LF90$g;)V

    :try_start_0
    iget-object p1, p0, LF90;->c:LRb0;

    iget-object v1, p0, LF90;->k:LJ90;

    invoke-virtual {v1}, LJ90;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LF90;->d:Ljava/util/concurrent/Executor;

    invoke-virtual {p0}, LF90;->G()Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object v3

    invoke-virtual {p1, v1, v2, v3}, LRb0;->f(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V
    :try_end_0
    .catch Landroidx/camera/camera2/internal/compat/CameraAccessExceptionCompat; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LF90;->H(Ljava/lang/String;)V

    sget-object p1, LF90$g;->h:LF90$g;

    invoke-virtual {p0, p1}, LF90;->k0(LF90$g;)V

    iget-object p1, p0, LF90;->j:LF90$h;

    invoke-virtual {p1}, LF90$h;->e()V

    goto :goto_0

    :catch_1
    move-exception p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LF90;->H(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/compat/CameraAccessExceptionCompat;->d()I

    move-result v0

    const/16 v1, 0x2711

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, LF90$g;->b:LF90$g;

    const/4 v1, 0x7

    invoke-static {v1, p1}, Ljc0$a;->b(ILjava/lang/Throwable;)Ljc0$a;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, LF90;->l0(LF90$g;Ljc0$a;)V

    :goto_0
    return-void
.end method

.method public d()LKb0;
    .locals 1

    iget-object v0, p0, LF90;->k:LJ90;

    return-object v0
.end method

.method public d0()V
    .locals 6

    iget-object v0, p0, LF90;->f:LF90$g;

    sget-object v1, LF90$g;->e:LF90$g;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, LHZ3;->i(Z)V

    iget-object v0, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {v0}, Landroidx/camera/core/impl/r;->f()Landroidx/camera/core/impl/q$g;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/q$g;->e()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v0, "Unable to create capture session due to conflicting configurations"

    invoke-virtual {p0, v0}, LF90;->H(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v1, p0, LF90;->u:Lnc0;

    iget-object v3, p0, LF90;->l:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v3}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, LF90;->t:Lkb0;

    iget-object v5, p0, LF90;->l:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v5}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Lkb0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lnc0;->i(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to create capture session in camera operating mode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LF90;->t:Lkb0;

    invoke-interface {v1}, Lkb0;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LF90;->H(Ljava/lang/String;)V

    return-void

    :cond_2
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-object v3, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {v3}, Landroidx/camera/core/impl/r;->g()Ljava/util/Collection;

    move-result-object v3

    iget-object v4, p0, LF90;->F:LWa0;

    invoke-static {v3, v1, v4, v2}, LDR5;->b(Ljava/util/Collection;Ljava/util/Map;LWa0;Z)V

    iget-object v2, p0, LF90;->n:Lsf0;

    invoke-interface {v2, v1}, Lsf0;->h(Ljava/util/Map;)V

    iget-object v1, p0, LF90;->n:Lsf0;

    invoke-virtual {v0}, Landroidx/camera/core/impl/q$g;->b()Landroidx/camera/core/impl/q;

    move-result-object v0

    iget-object v2, p0, LF90;->l:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v2}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/camera2/CameraDevice;

    iget-object v3, p0, LF90;->y:LPX5$a;

    invoke-virtual {v3}, LPX5$a;->a()LPX5;

    move-result-object v3

    invoke-interface {v1, v0, v2, v3}, Lsf0;->a(Landroidx/camera/core/impl/q;Landroid/hardware/camera2/CameraDevice;LPX5;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v1, LF90$b;

    invoke-direct {v1, p0}, LF90$b;-><init>(LF90;)V

    iget-object v2, p0, LF90;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final e0()V
    .locals 4

    sget-object v0, LF90$c;->a:[I

    iget-object v1, p0, LF90;->f:LF90$g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x3

    if-eq v0, v3, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "open() ignored due to being in state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LF90;->f:LF90$g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LF90;->H(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object v0, LF90$g;->h:LF90$g;

    invoke-virtual {p0, v0}, LF90;->k0(LF90$g;)V

    invoke-virtual {p0}, LF90;->O()Z

    move-result v0

    if-nez v0, :cond_3

    iget v0, p0, LF90;->m:I

    if-nez v0, :cond_3

    iget-object v0, p0, LF90;->l:Landroid/hardware/camera2/CameraDevice;

    if-eqz v0, :cond_1

    move v1, v2

    :cond_1
    const-string v0, "Camera Device should be open if session close is not complete"

    invoke-static {v1, v0}, LHZ3;->j(ZLjava/lang/String;)V

    sget-object v0, LF90$g;->e:LF90$g;

    invoke-virtual {p0, v0}, LF90;->k0(LF90$g;)V

    invoke-virtual {p0}, LF90;->d0()V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v1}, LF90;->r0(Z)V

    :cond_3
    :goto_0
    return-void
.end method

.method public f(Landroidx/camera/core/impl/c;)V
    .locals 1

    if-nez p1, :cond_0

    invoke-static {}, Lbb0;->a()Landroidx/camera/core/impl/c;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroidx/camera/core/impl/c;->Q(Lyv5;)Lyv5;

    move-result-object v0

    iput-object p1, p0, LF90;->A:Landroidx/camera/core/impl/c;

    iget-object p1, p0, LF90;->B:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iput-object v0, p0, LF90;->C:Lyv5;

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public f0(Landroidx/camera/core/impl/q;)V
    .locals 4

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/q$c;

    new-instance v2, Ljava/lang/Throwable;

    invoke-direct {v2}, Ljava/lang/Throwable;-><init>()V

    const-string v3, "Posting surface closed"

    invoke-virtual {p0, v3, v2}, LF90;->I(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v2, Ly90;

    invoke-direct {v2, v1, p1}, Ly90;-><init>(Landroidx/camera/core/impl/q$c;Landroidx/camera/core/impl/q;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public g(Landroidx/camera/core/p;)V
    .locals 4

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LF90;->M(Landroidx/camera/core/p;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/camera/core/p;->r()Landroidx/camera/core/impl/q;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object p1

    iget-object v2, p0, LF90;->d:Ljava/util/concurrent/Executor;

    new-instance v3, Lx90;

    invoke-direct {v3, p0, v0, v1, p1}, Lx90;-><init>(LF90;Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public g0(Lrf0;Landroidx/camera/core/impl/DeferrableSurface;Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, LF90;->v:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LF90;->h0(Lsf0;Z)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    invoke-virtual {p2}, Landroidx/camera/core/impl/DeferrableSurface;->c()V

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/common/util/concurrent/ListenableFuture;

    aput-object p1, v1, v0

    const/4 p1, 0x1

    invoke-virtual {p2}, Landroidx/camera/core/impl/DeferrableSurface;->i()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p2

    aput-object p2, v1, p1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LIA1;->n(Ljava/util/Collection;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p2

    invoke-interface {p1, p3, p2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public h(Landroidx/camera/core/p;)V
    .locals 4

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LF90;->M(Landroidx/camera/core/p;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/camera/core/p;->r()Landroidx/camera/core/impl/q;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object p1

    iget-object v2, p0, LF90;->d:Ljava/util/concurrent/Executor;

    new-instance v3, LE90;

    invoke-direct {v3, p0, v0, v1, p1}, LE90;-><init>(LF90;Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public h0(Lsf0;Z)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsf0;",
            "Z)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Lsf0;->close()V

    invoke-interface {p1, p2}, Lsf0;->b(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Releasing session in state "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LF90;->f:LF90$g;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LF90;->H(Ljava/lang/String;)V

    iget-object v0, p0, LF90;->q:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LF90$a;

    invoke-direct {v0, p0, p1}, LF90$a;-><init>(LF90;Lsf0;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {p2, v0, p1}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    return-object p2
.end method

.method public i(Landroidx/camera/core/p;)V
    .locals 2

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LF90;->M(Landroidx/camera/core/p;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, LF90;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Lv90;

    invoke-direct {v1, p0, p1}, Lv90;-><init>(LF90;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final i0()V
    .locals 3

    iget-object v0, p0, LF90;->w:LVT2;

    if-eqz v0, :cond_0

    iget-object v0, p0, LF90;->b:Landroidx/camera/core/impl/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LF90;->w:LVT2;

    invoke-virtual {v2}, LVT2;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LF90;->w:LVT2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/r;->s(Ljava/lang/String;)V

    iget-object v0, p0, LF90;->b:Landroidx/camera/core/impl/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, LF90;->w:LVT2;

    invoke-virtual {v2}, LVT2;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LF90;->w:LVT2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/r;->t(Ljava/lang/String;)V

    iget-object v0, p0, LF90;->w:LVT2;

    invoke-virtual {v0}, LVT2;->b()V

    const/4 v0, 0x0

    iput-object v0, p0, LF90;->w:LVT2;

    :cond_0
    return-void
.end method

.method public j()LZd3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZd3<",
            "LLb0$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LF90;->g:LUs2;

    return-object v0
.end method

.method public j0(Z)V
    .locals 4

    iget-object v0, p0, LF90;->n:Lsf0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LHZ3;->i(Z)V

    const-string v0, "Resetting Capture Session"

    invoke-virtual {p0, v0}, LF90;->H(Ljava/lang/String;)V

    iget-object v0, p0, LF90;->n:Lsf0;

    invoke-interface {v0}, Lsf0;->c()Landroidx/camera/core/impl/q;

    move-result-object v1

    invoke-interface {v0}, Lsf0;->g()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, LF90;->Z()Lsf0;

    move-result-object v3

    iput-object v3, p0, LF90;->n:Lsf0;

    invoke-interface {v3, v1}, Lsf0;->d(Landroidx/camera/core/impl/q;)V

    iget-object v1, p0, LF90;->n:Lsf0;

    invoke-interface {v1, v2}, Lsf0;->e(Ljava/util/List;)V

    invoke-virtual {p0, v0, p1}, LF90;->h0(Lsf0;Z)Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method

.method public k()Landroidx/camera/core/impl/CameraControlInternal;
    .locals 1

    iget-object v0, p0, LF90;->i:Lr90;

    return-object v0
.end method

.method public k0(LF90$g;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LF90;->l0(LF90$g;Ljc0$a;)V

    return-void
.end method

.method public l()Landroidx/camera/core/impl/c;
    .locals 1

    iget-object v0, p0, LF90;->A:Landroidx/camera/core/impl/c;

    return-object v0
.end method

.method public l0(LF90$g;Ljc0$a;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, LF90;->m0(LF90$g;Ljc0$a;Z)V

    return-void
.end method

.method public m0(LF90$g;Ljc0$a;Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Transitioning camera internal state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LF90;->f:LF90$g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " --> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LF90;->H(Ljava/lang/String;)V

    iput-object p1, p0, LF90;->f:LF90$g;

    sget-object v0, LF90$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown state: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_0
    sget-object p1, LLb0$a;->j:LLb0$a;

    goto :goto_0

    :pswitch_1
    sget-object p1, LLb0$a;->i:LLb0$a;

    goto :goto_0

    :pswitch_2
    sget-object p1, LLb0$a;->d:LLb0$a;

    goto :goto_0

    :pswitch_3
    sget-object p1, LLb0$a;->f:LLb0$a;

    goto :goto_0

    :pswitch_4
    sget-object p1, LLb0$a;->e:LLb0$a;

    goto :goto_0

    :pswitch_5
    sget-object p1, LLb0$a;->g:LLb0$a;

    goto :goto_0

    :pswitch_6
    sget-object p1, LLb0$a;->c:LLb0$a;

    goto :goto_0

    :pswitch_7
    sget-object p1, LLb0$a;->h:LLb0$a;

    :goto_0
    iget-object v0, p0, LF90;->u:Lnc0;

    invoke-virtual {v0, p0, p1, p3}, Lnc0;->e(Lna0;LLb0$a;Z)V

    iget-object p3, p0, LF90;->g:LUs2;

    invoke-virtual {p3, p1}, LUs2;->l(Ljava/lang/Object;)V

    iget-object p3, p0, LF90;->h:Lkc0;

    invoke-virtual {p3, p1, p2}, Lkc0;->c(LLb0$a;Ljc0$a;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public n(Z)V
    .locals 2

    iget-object v0, p0, LF90;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Lw90;

    invoke-direct {v1, p0, p1}, Lw90;-><init>(LF90;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public n0(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/d;

    invoke-static {v1}, Landroidx/camera/core/impl/d$a;->k(Landroidx/camera/core/impl/d;)Landroidx/camera/core/impl/d$a;

    move-result-object v2

    invoke-virtual {v1}, Landroidx/camera/core/impl/d;->h()I

    move-result v3

    const/4 v4, 0x5

    if-ne v3, v4, :cond_0

    invoke-virtual {v1}, Landroidx/camera/core/impl/d;->c()Lxa0;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Landroidx/camera/core/impl/d;->c()Lxa0;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/camera/core/impl/d$a;->p(Lxa0;)V

    :cond_0
    invoke-virtual {v1}, Landroidx/camera/core/impl/d;->f()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Landroidx/camera/core/impl/d;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v2}, LF90;->C(Landroidx/camera/core/impl/d$a;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Landroidx/camera/core/impl/d$a;->h()Landroidx/camera/core/impl/d;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const-string p1, "Issue capture request"

    invoke-virtual {p0, p1}, LF90;->H(Ljava/lang/String;)V

    iget-object p1, p0, LF90;->n:Lsf0;

    invoke-interface {p1, v0}, Lsf0;->e(Ljava/util/List;)V

    return-void
.end method

.method public o(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LF90;->i:Lr90;

    invoke-virtual {p1}, Lr90;->O()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, p1}, LF90;->a0(Ljava/util/List;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, LF90;->o0(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :try_start_0
    iget-object v0, p0, LF90;->d:Ljava/util/concurrent/Executor;

    new-instance v1, LB90;

    invoke-direct {v1, p0, p1}, LB90;-><init>(LF90;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Unable to attach use cases."

    invoke-virtual {p0, v0, p1}, LF90;->I(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, LF90;->i:Lr90;

    invoke-virtual {p1}, Lr90;->x()V

    :goto_0
    return-void
.end method

.method public final o0(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;)",
            "Ljava/util/Collection<",
            "LF90$i;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/p;

    invoke-static {v1}, LF90$i;->b(Landroidx/camera/core/p;)LF90$i;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public p(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/p;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, LF90;->o0(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v1}, LF90;->b0(Ljava/util/List;)V

    iget-object v0, p0, LF90;->d:Ljava/util/concurrent/Executor;

    new-instance v1, LA90;

    invoke-direct {v1, p0, p1}, LA90;-><init>(LF90;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final p0(Ljava/util/Collection;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LF90$i;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {v0}, Landroidx/camera/core/impl/r;->g()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LF90$i;

    iget-object v4, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {v3}, LF90$i;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroidx/camera/core/impl/r;->l(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v4, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {v3}, LF90$i;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, LF90$i;->c()Landroidx/camera/core/impl/q;

    move-result-object v6

    invoke-virtual {v3}, LF90$i;->e()Landroidx/camera/core/impl/s;

    move-result-object v7

    invoke-virtual {v4, v5, v6, v7}, Landroidx/camera/core/impl/r;->r(Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V

    invoke-virtual {v3}, LF90$i;->f()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, LF90$i;->g()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Landroidx/camera/core/l;

    if-ne v4, v5, :cond_0

    invoke-virtual {v3}, LF90$i;->d()Landroid/util/Size;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance v2, Landroid/util/Rational;

    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v4

    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v3

    invoke-direct {v2, v4, v3}, Landroid/util/Rational;-><init>(II)V

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Use cases ["

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-static {v3, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] now ATTACHED"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LF90;->H(Ljava/lang/String;)V

    if-eqz v0, :cond_3

    iget-object p1, p0, LF90;->i:Lr90;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lr90;->g0(Z)V

    iget-object p1, p0, LF90;->i:Lr90;

    invoke-virtual {p1}, Lr90;->O()V

    :cond_3
    invoke-virtual {p0}, LF90;->B()V

    invoke-virtual {p0}, LF90;->u0()V

    invoke-virtual {p0}, LF90;->t0()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LF90;->j0(Z)V

    iget-object p1, p0, LF90;->f:LF90$g;

    sget-object v0, LF90$g;->e:LF90$g;

    if-ne p1, v0, :cond_4

    invoke-virtual {p0}, LF90;->d0()V

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, LF90;->e0()V

    :goto_1
    if-eqz v2, :cond_5

    iget-object p1, p0, LF90;->i:Lr90;

    invoke-virtual {p1, v2}, Lr90;->h0(Landroid/util/Rational;)V

    :cond_5
    return-void
.end method

.method public final q0(Ljava/util/Collection;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LF90$i;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LF90$i;

    iget-object v4, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {v3}, LF90$i;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroidx/camera/core/impl/r;->l(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {v3}, LF90$i;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroidx/camera/core/impl/r;->p(Ljava/lang/String;)V

    invoke-virtual {v3}, LF90$i;->f()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, LF90$i;->g()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Landroidx/camera/core/l;

    if-ne v3, v4, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Use cases ["

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-static {v3, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "] now DETACHED for camera"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LF90;->H(Ljava/lang/String;)V

    if-eqz v2, :cond_3

    iget-object p1, p0, LF90;->i:Lr90;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lr90;->h0(Landroid/util/Rational;)V

    :cond_3
    invoke-virtual {p0}, LF90;->B()V

    iget-object p1, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {p1}, Landroidx/camera/core/impl/r;->h()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, LF90;->i:Lr90;

    invoke-virtual {p1, v1}, Lr90;->j0(Z)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, LF90;->u0()V

    :goto_1
    iget-object p1, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {p1}, Landroidx/camera/core/impl/r;->g()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, LF90;->i:Lr90;

    invoke-virtual {p1}, Lr90;->x()V

    invoke-virtual {p0, v1}, LF90;->j0(Z)V

    iget-object p1, p0, LF90;->i:Lr90;

    invoke-virtual {p1, v1}, Lr90;->g0(Z)V

    invoke-virtual {p0}, LF90;->Z()Lsf0;

    move-result-object p1

    iput-object p1, p0, LF90;->n:Lsf0;

    invoke-virtual {p0}, LF90;->E()V

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, LF90;->t0()V

    invoke-virtual {p0, v1}, LF90;->j0(Z)V

    iget-object p1, p0, LF90;->f:LF90$g;

    sget-object v0, LF90$g;->e:LF90$g;

    if-ne p1, v0, :cond_6

    invoke-virtual {p0}, LF90;->d0()V

    :cond_6
    :goto_2
    return-void
.end method

.method public r0(Z)V
    .locals 1

    const-string v0, "Attempting to force open the camera."

    invoke-virtual {p0, v0}, LF90;->H(Ljava/lang/String;)V

    iget-object v0, p0, LF90;->u:Lnc0;

    invoke-virtual {v0, p0}, Lnc0;->h(Lna0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "No cameras available. Waiting for available camera before opening camera."

    invoke-virtual {p0, p1}, LF90;->H(Ljava/lang/String;)V

    sget-object p1, LF90$g;->c:LF90$g;

    invoke-virtual {p0, p1}, LF90;->k0(LF90$g;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LF90;->c0(Z)V

    return-void
.end method

.method public s0(Z)V
    .locals 1

    const-string v0, "Attempting to open the camera."

    invoke-virtual {p0, v0}, LF90;->H(Ljava/lang/String;)V

    iget-object v0, p0, LF90;->r:LF90$d;

    invoke-virtual {v0}, LF90$d;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LF90;->u:Lnc0;

    invoke-virtual {v0, p0}, Lnc0;->h(Lna0;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string p1, "No cameras available. Waiting for available camera before opening camera."

    invoke-virtual {p0, p1}, LF90;->H(Ljava/lang/String;)V

    sget-object p1, LF90$g;->c:LF90$g;

    invoke-virtual {p0, p1}, LF90;->k0(LF90$g;)V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, LF90;->c0(Z)V

    return-void
.end method

.method public t0()V
    .locals 3

    iget-object v0, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {v0}, Landroidx/camera/core/impl/r;->d()Landroidx/camera/core/impl/q$g;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/q$g;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/impl/q$g;->b()Landroidx/camera/core/impl/q;

    move-result-object v1

    iget-object v2, p0, LF90;->i:Lr90;

    invoke-virtual {v1}, Landroidx/camera/core/impl/q;->l()I

    move-result v1

    invoke-virtual {v2, v1}, Lr90;->i0(I)V

    iget-object v1, p0, LF90;->i:Lr90;

    invoke-virtual {v1}, Lr90;->F()Landroidx/camera/core/impl/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/q$g;->a(Landroidx/camera/core/impl/q;)V

    invoke-virtual {v0}, Landroidx/camera/core/impl/q$g;->b()Landroidx/camera/core/impl/q;

    move-result-object v0

    iget-object v1, p0, LF90;->n:Lsf0;

    invoke-interface {v1, v0}, Lsf0;->d(Landroidx/camera/core/impl/q;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LF90;->i:Lr90;

    invoke-virtual {v0}, Lr90;->f0()V

    iget-object v0, p0, LF90;->n:Lsf0;

    iget-object v1, p0, LF90;->i:Lr90;

    invoke-virtual {v1}, Lr90;->F()Landroidx/camera/core/impl/q;

    move-result-object v1

    invoke-interface {v0, v1}, Lsf0;->d(Landroidx/camera/core/impl/q;)V

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, LF90;->k:LJ90;

    invoke-virtual {v2}, LJ90;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "Camera@%x[id=%s]"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u0()V
    .locals 4

    iget-object v0, p0, LF90;->b:Landroidx/camera/core/impl/r;

    invoke-virtual {v0}, Landroidx/camera/core/impl/r;->h()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/s;

    invoke-interface {v3, v1}, Landroidx/camera/core/impl/s;->K(Z)Z

    move-result v3

    or-int/2addr v2, v3

    goto :goto_0

    :cond_0
    iget-object v0, p0, LF90;->i:Lr90;

    invoke-virtual {v0, v2}, Lr90;->j0(Z)V

    return-void
.end method
