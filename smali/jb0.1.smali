.class public abstract Ljb0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljb0$c;,
        Ljb0$b;
    }
.end annotation


# instance fields
.field public final A:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public a:Lic0;

.field public b:I

.field public c:Landroidx/camera/core/l;

.field public d:Landroidx/camera/core/h;

.field public e:Ljava/util/concurrent/Executor;

.field public f:Landroidx/camera/core/e$a;

.field public g:Landroidx/camera/core/e;

.field public h:LUo6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LUo6<",
            "LHs4;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lrz0<",
            "Lvp6;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public j:Lzb4;

.field public k:Lna0;

.field public l:Lq64;

.field public m:LEs6;

.field public n:Landroidx/camera/core/l$c;

.field public final o:LTb5;

.field public final p:LTb5$b;

.field public q:Z

.field public r:Z

.field public final s:LGx1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGx1<",
            "LqJ6;",
            ">;"
        }
    .end annotation
.end field

.field public final t:LGx1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGx1<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final u:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final v:LiQ3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LiQ3<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final w:LiQ3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LiQ3<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final x:LiQ3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LiQ3<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final y:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lyb0;",
            ">;"
        }
    .end annotation
.end field

.field public final z:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-static {p1}, Landroidx/camera/lifecycle/b;->h(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v1, Lcb0;

    invoke-direct {v1}, Lcb0;-><init>()V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-static {v0, v1, v2}, LIA1;->o(Lcom/google/common/util/concurrent/ListenableFuture;LxA1;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ljb0;-><init>(Landroid/content/Context;Lcom/google/common/util/concurrent/ListenableFuture;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Lq64;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lic0;->c:Lic0;

    iput-object v0, p0, Ljb0;->a:Lic0;

    const/4 v0, 0x3

    iput v0, p0, Ljb0;->b:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ljb0;->i:Ljava/util/Map;

    const/4 v0, 0x1

    iput-boolean v0, p0, Ljb0;->q:Z

    iput-boolean v0, p0, Ljb0;->r:Z

    new-instance v0, LGx1;

    invoke-direct {v0}, LGx1;-><init>()V

    iput-object v0, p0, Ljb0;->s:LGx1;

    new-instance v0, LGx1;

    invoke-direct {v0}, LGx1;-><init>()V

    iput-object v0, p0, Ljb0;->t:LGx1;

    new-instance v0, LuX2;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, LuX2;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ljb0;->u:LuX2;

    new-instance v0, LiQ3;

    invoke-direct {v0}, LiQ3;-><init>()V

    iput-object v0, p0, Ljb0;->v:LiQ3;

    new-instance v0, LiQ3;

    invoke-direct {v0}, LiQ3;-><init>()V

    iput-object v0, p0, Ljb0;->w:LiQ3;

    new-instance v0, LiQ3;

    invoke-direct {v0}, LiQ3;-><init>()V

    iput-object v0, p0, Ljb0;->x:LiQ3;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ljb0;->y:Ljava/util/Set;

    invoke-static {p1}, Ljb0;->j(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ljb0;->z:Landroid/content/Context;

    new-instance v0, Landroidx/camera/core/l$a;

    invoke-direct {v0}, Landroidx/camera/core/l$a;-><init>()V

    invoke-virtual {v0}, Landroidx/camera/core/l$a;->e()Landroidx/camera/core/l;

    move-result-object v0

    iput-object v0, p0, Ljb0;->c:Landroidx/camera/core/l;

    new-instance v0, Landroidx/camera/core/h$g;

    invoke-direct {v0}, Landroidx/camera/core/h$g;-><init>()V

    invoke-virtual {v0}, Landroidx/camera/core/h$g;->e()Landroidx/camera/core/h;

    move-result-object v0

    iput-object v0, p0, Ljb0;->d:Landroidx/camera/core/h;

    new-instance v0, Landroidx/camera/core/e$c;

    invoke-direct {v0}, Landroidx/camera/core/e$c;-><init>()V

    invoke-virtual {v0}, Landroidx/camera/core/e$c;->e()Landroidx/camera/core/e;

    move-result-object v0

    iput-object v0, p0, Ljb0;->g:Landroidx/camera/core/e;

    invoke-virtual {p0}, Ljb0;->f()LUo6;

    move-result-object v0

    iput-object v0, p0, Ljb0;->h:LUo6;

    new-instance v0, Lgb0;

    invoke-direct {v0, p0}, Lgb0;-><init>(Ljb0;)V

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    invoke-static {p2, v0, v1}, LIA1;->o(Lcom/google/common/util/concurrent/ListenableFuture;LxA1;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p2

    iput-object p2, p0, Ljb0;->A:Lcom/google/common/util/concurrent/ListenableFuture;

    new-instance p2, LTb5;

    invoke-direct {p2, p1}, LTb5;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Ljb0;->o:LTb5;

    new-instance p1, Lhb0;

    invoke-direct {p1, p0}, Lhb0;-><init>(Ljb0;)V

    iput-object p1, p0, Ljb0;->p:LTb5$b;

    return-void
.end method

.method public static synthetic a(Ljb0;I)V
    .locals 0

    invoke-direct {p0, p1}, Ljb0;->w(I)V

    return-void
.end method

.method public static synthetic b(Ljb0;Lic0;)V
    .locals 0

    invoke-direct {p0, p1}, Ljb0;->x(Lic0;)V

    return-void
.end method

.method public static synthetic c(Ljb0;Lq64;)Ljava/lang/Void;
    .locals 0

    invoke-direct {p0, p1}, Ljb0;->v(Lq64;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static i(Lzb4;)LHs4;
    .locals 2

    new-instance v0, LHs4$h;

    invoke-direct {v0}, LHs4$h;-><init>()V

    if-eqz p0, :cond_0

    invoke-static {p0}, LIj1;->b(Lzb4;)LIj1;

    move-result-object v1

    invoke-static {p0, v1}, LRc4;->d(Lzb4;LIj1;)LRc4;

    move-result-object p0

    invoke-virtual {v0, p0}, LHs4$h;->d(LRc4;)LHs4$h;

    :cond_0
    invoke-virtual {v0}, LHs4$h;->b()LHs4;

    move-result-object p0

    return-object p0
.end method

.method public static j(Landroid/content/Context;)Landroid/content/Context;
    .locals 3

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_0

    invoke-static {p0}, Ljb0$b;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {v0, p0}, Ljb0$b;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Context;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method private synthetic v(Lq64;)Ljava/lang/Void;
    .locals 0

    iput-object p1, p0, Ljb0;->l:Lq64;

    invoke-virtual {p0}, Ljb0;->K()V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic w(I)V
    .locals 1

    iget-object v0, p0, Ljb0;->g:Landroidx/camera/core/e;

    invoke-virtual {v0, p1}, Landroidx/camera/core/e;->j0(I)V

    iget-object v0, p0, Ljb0;->d:Landroidx/camera/core/h;

    invoke-virtual {v0, p1}, Landroidx/camera/core/h;->P0(I)V

    iget-object v0, p0, Ljb0;->h:LUo6;

    invoke-virtual {v0, p1}, LUo6;->H0(I)V

    return-void
.end method

.method private synthetic x(Lic0;)V
    .locals 0

    iput-object p1, p0, Ljb0;->a:Lic0;

    return-void
.end method


# virtual methods
.method public A(Lic0;)V
    .locals 4

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Ljb0;->a:Lic0;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Ljb0;->a:Lic0;

    iget-object p1, p0, Ljb0;->l:Lq64;

    if-nez p1, :cond_1

    return-void

    :cond_1
    const/4 v1, 0x4

    new-array v1, v1, [Landroidx/camera/core/p;

    const/4 v2, 0x0

    iget-object v3, p0, Ljb0;->c:Landroidx/camera/core/l;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Ljb0;->d:Landroidx/camera/core/h;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Ljb0;->g:Landroidx/camera/core/e;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-object v3, p0, Ljb0;->h:LUo6;

    aput-object v3, v1, v2

    invoke-interface {p1, v1}, Lq64;->b([Landroidx/camera/core/p;)V

    new-instance p1, Lib0;

    invoke-direct {p1, p0, v0}, Lib0;-><init>(Ljb0;Lic0;)V

    invoke-virtual {p0, p1}, Ljb0;->L(Ljava/lang/Runnable;)V

    return-void
.end method

.method public B(I)V
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Ljb0;->d:Landroidx/camera/core/h;

    invoke-virtual {v0, p1}, Landroidx/camera/core/h;->O0(I)V

    return-void
.end method

.method public C(I)V
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Ljb0;->d:Landroidx/camera/core/h;

    invoke-virtual {v0}, Landroidx/camera/core/h;->o0()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Ljb0;->Q(I)V

    invoke-virtual {p0}, Ljb0;->K()V

    return-void
.end method

.method public D(F)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, Ljb0;->o()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ljb0;->w:LiQ3;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {v0, p1}, LiQ3;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Ljb0;->k:Lna0;

    invoke-interface {v0}, Lna0;->a()Landroidx/camera/core/CameraControl;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/camera/core/CameraControl;->b(F)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public E(Z)V
    .locals 0

    invoke-static {}, LO36;->a()V

    iput-boolean p1, p0, Ljb0;->q:Z

    return-void
.end method

.method public F(Z)V
    .locals 0

    invoke-static {}, LO36;->a()V

    iput-boolean p1, p0, Ljb0;->r:Z

    return-void
.end method

.method public final G(Landroidx/camera/core/impl/k$a;Ljb0$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/k$a<",
            "*>;",
            "Ljb0$c;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public H(F)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, Ljb0;->o()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ljb0;->x:LiQ3;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {v0, p1}, LiQ3;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Ljb0;->k:Lna0;

    invoke-interface {v0}, Lna0;->a()Landroidx/camera/core/CameraControl;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/camera/core/CameraControl;->d(F)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public final I(F)F
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    const/high16 v2, 0x40000000    # 2.0f

    if-lez v1, :cond_0

    sub-float/2addr p1, v0

    mul-float/2addr p1, v2

    add-float/2addr p1, v0

    return p1

    :cond_0
    sub-float p1, v0, p1

    mul-float/2addr p1, v2

    sub-float/2addr v0, p1

    return v0
.end method

.method public abstract J()Lna0;
.end method

.method public K()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljb0;->L(Ljava/lang/Runnable;)V

    return-void
.end method

.method public L(Ljava/lang/Runnable;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ljb0;->J()Lna0;

    move-result-object v0

    iput-object v0, p0, Ljb0;->k:Lna0;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, Ljb0;->o()Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "CameraController"

    const-string v0, "Use cases not attached to camera."

    invoke-static {p1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, Ljb0;->s:LGx1;

    iget-object v0, p0, Ljb0;->k:Lna0;

    invoke-interface {v0}, Lna0;->b()LJb0;

    move-result-object v0

    invoke-interface {v0}, LJb0;->h()Landroidx/lifecycle/LiveData;

    move-result-object v0

    invoke-virtual {p1, v0}, LGx1;->d(Landroidx/lifecycle/LiveData;)V

    iget-object p1, p0, Ljb0;->t:LGx1;

    iget-object v0, p0, Ljb0;->k:Lna0;

    invoke-interface {v0}, Lna0;->b()LJb0;

    move-result-object v0

    invoke-interface {v0}, LJb0;->m()Landroidx/lifecycle/LiveData;

    move-result-object v0

    invoke-virtual {p1, v0}, LGx1;->d(Landroidx/lifecycle/LiveData;)V

    iget-object p1, p0, Ljb0;->v:LiQ3;

    new-instance v0, Ldb0;

    invoke-direct {v0, p0}, Ldb0;-><init>(Ljb0;)V

    invoke-virtual {p1, v0}, LiQ3;->c(LxA1;)V

    iget-object p1, p0, Ljb0;->w:LiQ3;

    new-instance v0, Leb0;

    invoke-direct {v0, p0}, Leb0;-><init>(Ljb0;)V

    invoke-virtual {p1, v0}, LiQ3;->c(LxA1;)V

    iget-object p1, p0, Ljb0;->x:LiQ3;

    new-instance v0, Lfb0;

    invoke-direct {v0, p0}, Lfb0;-><init>(Ljb0;)V

    invoke-virtual {p1, v0}, LiQ3;->c(LxA1;)V

    return-void

    :catch_0
    move-exception v0

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_1
    throw v0
.end method

.method public final M()V
    .locals 3

    iget-object v0, p0, Ljb0;->o:LTb5;

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    iget-object v2, p0, Ljb0;->p:LTb5$b;

    invoke-virtual {v0, v1, v2}, LTb5;->a(Ljava/util/concurrent/Executor;LTb5$b;)Z

    return-void
.end method

.method public final N()V
    .locals 2

    iget-object v0, p0, Ljb0;->o:LTb5;

    iget-object v1, p0, Ljb0;->p:LTb5$b;

    invoke-virtual {v0, v1}, LTb5;->c(LTb5$b;)V

    return-void
.end method

.method public O(Landroidx/camera/core/h$n;Ljava/util/concurrent/Executor;Landroidx/camera/core/h$m;)V
    .locals 2

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, Ljb0;->p()Z

    move-result v0

    const-string v1, "Camera not initialized."

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    invoke-virtual {p0}, Ljb0;->r()Z

    move-result v0

    const-string v1, "ImageCapture disabled."

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    invoke-virtual {p0, p1}, Ljb0;->R(Landroidx/camera/core/h$n;)V

    iget-object v0, p0, Ljb0;->d:Landroidx/camera/core/h;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/camera/core/h;->R0(Landroidx/camera/core/h$n;Ljava/util/concurrent/Executor;Landroidx/camera/core/h$m;)V

    return-void
.end method

.method public P(Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;)V
    .locals 2

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, Ljb0;->p()Z

    move-result v0

    const-string v1, "Camera not initialized."

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    invoke-virtual {p0}, Ljb0;->r()Z

    move-result v0

    const-string v1, "ImageCapture disabled."

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    iget-object v0, p0, Ljb0;->d:Landroidx/camera/core/h;

    invoke-virtual {v0, p1, p2}, Landroidx/camera/core/h;->S0(Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;)V

    return-void
.end method

.method public final Q(I)V
    .locals 4

    invoke-virtual {p0}, Ljb0;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljb0;->l:Lq64;

    const/4 v1, 0x1

    new-array v1, v1, [Landroidx/camera/core/p;

    const/4 v2, 0x0

    iget-object v3, p0, Ljb0;->d:Landroidx/camera/core/h;

    aput-object v3, v1, v2

    invoke-interface {v0, v1}, Lq64;->b([Landroidx/camera/core/p;)V

    :cond_0
    new-instance v0, Landroidx/camera/core/h$g;

    invoke-direct {v0}, Landroidx/camera/core/h$g;-><init>()V

    invoke-virtual {v0, p1}, Landroidx/camera/core/h$g;->h(I)Landroidx/camera/core/h$g;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ljb0;->G(Landroidx/camera/core/impl/k$a;Ljb0$c;)V

    iget-object v0, p0, Ljb0;->e:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, Landroidx/camera/core/h$g;->i(Ljava/util/concurrent/Executor;)Landroidx/camera/core/h$g;

    :cond_1
    invoke-virtual {p1}, Landroidx/camera/core/h$g;->e()Landroidx/camera/core/h;

    move-result-object p1

    iput-object p1, p0, Ljb0;->d:Landroidx/camera/core/h;

    return-void
.end method

.method public R(Landroidx/camera/core/h$n;)V
    .locals 1

    iget-object v0, p0, Ljb0;->a:Lic0;

    invoke-virtual {v0}, Lic0;->d()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/camera/core/h$n;->d()Landroidx/camera/core/h$k;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/h$k;->c()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroidx/camera/core/h$n;->d()Landroidx/camera/core/h$k;

    move-result-object p1

    iget-object v0, p0, Ljb0;->a:Lic0;

    invoke-virtual {v0}, Lic0;->d()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroidx/camera/core/h$k;->e(Z)V

    :cond_1
    return-void
.end method

.method public S(LjA3;)V
    .locals 2

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Ljb0;->f:Landroidx/camera/core/e$a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Landroidx/camera/core/e$a;->a(Landroid/graphics/Matrix;)V

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Landroidx/camera/core/e$a;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Ljb0;->f:Landroidx/camera/core/e$a;

    invoke-virtual {p1}, LjA3;->a()Landroid/graphics/Matrix;

    move-result-object p1

    invoke-interface {v0, p1}, Landroidx/camera/core/e$a;->a(Landroid/graphics/Matrix;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public d(Landroidx/camera/core/l$c;LEs6;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission",
            "WrongConstant"
        }
    .end annotation

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Ljb0;->n:Landroidx/camera/core/l$c;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Ljb0;->n:Landroidx/camera/core/l$c;

    iget-object v0, p0, Ljb0;->c:Landroidx/camera/core/l;

    invoke-virtual {v0, p1}, Landroidx/camera/core/l;->i0(Landroidx/camera/core/l$c;)V

    :cond_0
    iput-object p2, p0, Ljb0;->m:LEs6;

    invoke-virtual {p0}, Ljb0;->M()V

    invoke-virtual {p0}, Ljb0;->K()V

    return-void
.end method

.method public e()V
    .locals 4

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Ljb0;->l:Lq64;

    if-eqz v0, :cond_0

    const/4 v1, 0x4

    new-array v1, v1, [Landroidx/camera/core/p;

    const/4 v2, 0x0

    iget-object v3, p0, Ljb0;->c:Landroidx/camera/core/l;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Ljb0;->d:Landroidx/camera/core/h;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Ljb0;->g:Landroidx/camera/core/e;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-object v3, p0, Ljb0;->h:LUo6;

    aput-object v3, v1, v2

    invoke-interface {v0, v1}, Lq64;->b([Landroidx/camera/core/p;)V

    :cond_0
    iget-object v0, p0, Ljb0;->c:Landroidx/camera/core/l;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/camera/core/l;->i0(Landroidx/camera/core/l$c;)V

    iput-object v1, p0, Ljb0;->k:Lna0;

    iput-object v1, p0, Ljb0;->n:Landroidx/camera/core/l$c;

    iput-object v1, p0, Ljb0;->m:LEs6;

    invoke-virtual {p0}, Ljb0;->N()V

    return-void
.end method

.method public final f()LUo6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LUo6<",
            "LHs4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ljb0;->j:Lzb4;

    invoke-static {v0}, Ljb0;->i(Lzb4;)LHs4;

    move-result-object v0

    invoke-static {v0}, LUo6;->N0(Ltp6;)LUo6;

    move-result-object v0

    return-object v0
.end method

.method public g()LYf6;
    .locals 6

    invoke-virtual {p0}, Ljb0;->p()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "CameraController"

    if-nez v0, :cond_0

    const-string v0, "Camera not initialized."

    invoke-static {v2, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    invoke-virtual {p0}, Ljb0;->s()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "PreviewView not attached to CameraController."

    invoke-static {v2, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_1
    new-instance v0, LYf6$a;

    invoke-direct {v0}, LYf6$a;-><init>()V

    iget-object v1, p0, Ljb0;->c:Landroidx/camera/core/l;

    invoke-virtual {v0, v1}, LYf6$a;->b(Landroidx/camera/core/p;)LYf6$a;

    move-result-object v0

    invoke-virtual {p0}, Ljb0;->r()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ljb0;->d:Landroidx/camera/core/h;

    invoke-virtual {v0, v1}, LYf6$a;->b(Landroidx/camera/core/p;)LYf6$a;

    goto :goto_0

    :cond_2
    iget-object v1, p0, Ljb0;->l:Lq64;

    new-array v4, v3, [Landroidx/camera/core/p;

    iget-object v5, p0, Ljb0;->d:Landroidx/camera/core/h;

    aput-object v5, v4, v2

    invoke-interface {v1, v4}, Lq64;->b([Landroidx/camera/core/p;)V

    :goto_0
    invoke-virtual {p0}, Ljb0;->q()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Ljb0;->g:Landroidx/camera/core/e;

    invoke-virtual {v0, v1}, LYf6$a;->b(Landroidx/camera/core/p;)LYf6$a;

    goto :goto_1

    :cond_3
    iget-object v1, p0, Ljb0;->l:Lq64;

    new-array v4, v3, [Landroidx/camera/core/p;

    iget-object v5, p0, Ljb0;->g:Landroidx/camera/core/e;

    aput-object v5, v4, v2

    invoke-interface {v1, v4}, Lq64;->b([Landroidx/camera/core/p;)V

    :goto_1
    invoke-virtual {p0}, Ljb0;->u()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Ljb0;->h:LUo6;

    invoke-virtual {v0, v1}, LYf6$a;->b(Landroidx/camera/core/p;)LYf6$a;

    goto :goto_2

    :cond_4
    iget-object v1, p0, Ljb0;->l:Lq64;

    new-array v3, v3, [Landroidx/camera/core/p;

    iget-object v4, p0, Ljb0;->h:LUo6;

    aput-object v4, v3, v2

    invoke-interface {v1, v3}, Lq64;->b([Landroidx/camera/core/p;)V

    :goto_2
    iget-object v1, p0, Ljb0;->m:LEs6;

    invoke-virtual {v0, v1}, LYf6$a;->e(LEs6;)LYf6$a;

    iget-object v1, p0, Ljb0;->y:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyb0;

    invoke-virtual {v0, v2}, LYf6$a;->a(Lyb0;)LYf6$a;

    goto :goto_3

    :cond_5
    invoke-virtual {v0}, LYf6$a;->c()LYf6;

    move-result-object v0

    return-object v0
.end method

.method public h(Z)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, Ljb0;->o()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ljb0;->v:LiQ3;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, LiQ3;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Ljb0;->k:Lna0;

    invoke-interface {v0}, Lna0;->a()Landroidx/camera/core/CameraControl;

    move-result-object v0

    invoke-interface {v0, p1}, Landroidx/camera/core/CameraControl;->e(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public k()LJb0;
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Ljb0;->k:Lna0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lna0;->b()LJb0;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public l()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ljb0;->A:Lcom/google/common/util/concurrent/ListenableFuture;

    return-object v0
.end method

.method public m()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "LqJ6;",
            ">;"
        }
    .end annotation

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Ljb0;->s:LGx1;

    return-object v0
.end method

.method public n(Lic0;)Z
    .locals 2

    invoke-static {}, LO36;->a()V

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ljb0;->l:Lq64;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0, p1}, Lq64;->a(Lic0;)Z

    move-result p1
    :try_end_0
    .catch Landroidx/camera/core/CameraInfoUnavailableException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    const-string v0, "CameraController"

    const-string v1, "Failed to check camera availability"

    invoke-static {v0, v1, p1}, LJx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Camera not initialized. Please wait for the initialization future to finish. See #getInitializationFuture()."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final o()Z
    .locals 1

    iget-object v0, p0, Ljb0;->k:Lna0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final p()Z
    .locals 1

    iget-object v0, p0, Ljb0;->l:Lq64;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public q()Z
    .locals 1

    invoke-static {}, LO36;->a()V

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ljb0;->t(I)Z

    move-result v0

    return v0
.end method

.method public r()Z
    .locals 1

    invoke-static {}, LO36;->a()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljb0;->t(I)Z

    move-result v0

    return v0
.end method

.method public final s()Z
    .locals 1

    iget-object v0, p0, Ljb0;->n:Landroidx/camera/core/l$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljb0;->m:LEs6;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final t(I)Z
    .locals 1

    iget v0, p0, Ljb0;->b:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public u()Z
    .locals 1

    invoke-static {}, LO36;->a()V

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Ljb0;->t(I)Z

    move-result v0

    return v0
.end method

.method public y(F)V
    .locals 3

    invoke-virtual {p0}, Ljb0;->o()Z

    move-result v0

    const-string v1, "CameraController"

    if-nez v0, :cond_0

    const-string p1, "Use cases not attached to camera."

    invoke-static {v1, p1}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Ljb0;->q:Z

    if-nez v0, :cond_1

    const-string p1, "Pinch to zoom disabled."

    invoke-static {v1, p1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Pinch to zoom with scale: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljb0;->m()Landroidx/lifecycle/LiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LqJ6;

    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-interface {v0}, LqJ6;->d()F

    move-result v1

    invoke-virtual {p0, p1}, Ljb0;->I(F)F

    move-result p1

    mul-float/2addr v1, p1

    invoke-interface {v0}, LqJ6;->c()F

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-interface {v0}, LqJ6;->a()F

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-virtual {p0, p1}, Ljb0;->H(F)Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method

.method public z(LST2;FF)V
    .locals 3

    invoke-virtual {p0}, Ljb0;->o()Z

    move-result v0

    const-string v1, "CameraController"

    if-nez v0, :cond_0

    const-string p1, "Use cases not attached to camera."

    invoke-static {v1, p1}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Ljb0;->r:Z

    if-nez v0, :cond_1

    const-string p1, "Tap to focus disabled. "

    invoke-static {v1, p1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Tap to focus started: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Ljb0;->u:LuX2;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, LuX2;->postValue(Ljava/lang/Object;)V

    const v0, 0x3e2aaaab

    invoke-virtual {p1, p2, p3, v0}, LST2;->c(FFF)LRT2;

    move-result-object v0

    const/high16 v2, 0x3e800000    # 0.25f

    invoke-virtual {p1, p2, p3, v2}, LST2;->c(FFF)LRT2;

    move-result-object p1

    new-instance p2, LCv1$a;

    invoke-direct {p2, v0, v1}, LCv1$a;-><init>(LRT2;I)V

    const/4 p3, 0x2

    invoke-virtual {p2, p1, p3}, LCv1$a;->a(LRT2;I)LCv1$a;

    move-result-object p1

    invoke-virtual {p1}, LCv1$a;->b()LCv1;

    move-result-object p1

    iget-object p2, p0, Ljb0;->k:Lna0;

    invoke-interface {p2}, Lna0;->a()Landroidx/camera/core/CameraControl;

    move-result-object p2

    invoke-interface {p2, p1}, Landroidx/camera/core/CameraControl;->g(LCv1;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    new-instance p2, Ljb0$a;

    invoke-direct {p2, p0}, Ljb0$a;-><init>(Ljb0;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p3

    invoke-static {p1, p2, p3}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    return-void
.end method
