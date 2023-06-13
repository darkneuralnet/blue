.class public final LX64;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsf0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX64$e;,
        LX64$f;
    }
.end annotation


# static fields
.field public static q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            ">;"
        }
    .end annotation
.end field

.field public static r:I


# instance fields
.field public final a:Lyv5;

.field public final b:LJ90;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Ljava/util/concurrent/ScheduledExecutorService;

.field public final e:Lrf0;

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            ">;"
        }
    .end annotation
.end field

.field public g:Landroidx/camera/core/impl/q;

.field public h:Lka0;

.field public i:Landroidx/camera/core/impl/q;

.field public j:LX64$e;

.field public volatile k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d;",
            ">;"
        }
    .end annotation
.end field

.field public volatile l:Z

.field public final m:LX64$f;

.field public n:Lnf0;

.field public o:Lnf0;

.field public p:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, LX64;->q:Ljava/util/List;

    const/4 v0, 0x0

    sput v0, LX64;->r:I

    return-void
.end method

.method public constructor <init>(Lyv5;LJ90;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LX64;->f:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, LX64;->k:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, LX64;->l:Z

    new-instance v1, Lnf0$a;

    invoke-direct {v1}, Lnf0$a;-><init>()V

    invoke-virtual {v1}, Lnf0$a;->c()Lnf0;

    move-result-object v1

    iput-object v1, p0, LX64;->n:Lnf0;

    new-instance v1, Lnf0$a;

    invoke-direct {v1}, Lnf0$a;-><init>()V

    invoke-virtual {v1}, Lnf0$a;->c()Lnf0;

    move-result-object v1

    iput-object v1, p0, LX64;->o:Lnf0;

    iput v0, p0, LX64;->p:I

    new-instance v0, Lrf0;

    invoke-direct {v0}, Lrf0;-><init>()V

    iput-object v0, p0, LX64;->e:Lrf0;

    iput-object p1, p0, LX64;->a:Lyv5;

    iput-object p2, p0, LX64;->b:LJ90;

    iput-object p3, p0, LX64;->c:Ljava/util/concurrent/Executor;

    iput-object p4, p0, LX64;->d:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object p1, LX64$e;->b:LX64$e;

    iput-object p1, p0, LX64;->j:LX64$e;

    new-instance p1, LX64$f;

    invoke-direct {p1}, LX64$f;-><init>()V

    iput-object p1, p0, LX64;->m:LX64$f;

    sget p1, LX64;->r:I

    add-int/lit8 p2, p1, 0x1

    sput p2, LX64;->r:I

    iput p1, p0, LX64;->p:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "New ProcessingCaptureSession (id="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, LX64;->p:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ProcessingCaptureSession"

    invoke-static {p2, p1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic i(LX64;Landroidx/camera/core/impl/q;Landroid/hardware/camera2/CameraDevice;LPX5;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LX64;->t(Landroidx/camera/core/impl/q;Landroid/hardware/camera2/CameraDevice;LPX5;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(LX64;)V
    .locals 0

    invoke-direct {p0}, LX64;->r()V

    return-void
.end method

.method public static synthetic k(Landroidx/camera/core/impl/DeferrableSurface;)V
    .locals 0

    invoke-static {p0}, LX64;->s(Landroidx/camera/core/impl/DeferrableSurface;)V

    return-void
.end method

.method public static synthetic l(LX64;)V
    .locals 0

    invoke-direct {p0}, LX64;->v()V

    return-void
.end method

.method public static synthetic m(LX64;Ljava/lang/Void;)Ljava/lang/Void;
    .locals 0

    invoke-direct {p0, p1}, LX64;->u(Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static n(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/d;

    invoke-virtual {v0}, Landroidx/camera/core/impl/d;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpa0;

    invoke-virtual {v1}, Lpa0;->a()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static o(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            ">;)",
            "Ljava/util/List<",
            "Lzv5;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/DeferrableSurface;

    instance-of v2, v1, Lzv5;

    const-string v3, "Surface must be SessionProcessorSurface"

    invoke-static {v2, v3}, LHZ3;->b(ZLjava/lang/Object;)V

    check-cast v1, Lzv5;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private synthetic r()V
    .locals 1

    iget-object v0, p0, LX64;->f:Ljava/util/List;

    invoke-static {v0}, Landroidx/camera/core/impl/g;->e(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic s(Landroidx/camera/core/impl/DeferrableSurface;)V
    .locals 1

    sget-object v0, LX64;->q:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private synthetic t(Landroidx/camera/core/impl/q;Landroid/hardware/camera2/CameraDevice;LPX5;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "-- getSurfaces done, start init (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LX64;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ProcessingCaptureSession"

    invoke-static {v2, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LX64;->j:LX64$e;

    sget-object v3, LX64$e;->f:LX64$e;

    if-ne v0, v3, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "SessionProcessorCaptureSession is closed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->k()Ljava/util/List;

    move-result-object p1

    invoke-interface {p4, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p2

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/DeferrableSurface;

    new-instance p2, Landroidx/camera/core/impl/DeferrableSurface$SurfaceClosedException;

    const-string p3, "Surface closed"

    invoke-direct {p2, p3, p1}, Landroidx/camera/core/impl/DeferrableSurface$SurfaceClosedException;-><init>(Ljava/lang/String;Landroidx/camera/core/impl/DeferrableSurface;)V

    invoke-static {p2}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_1
    :try_start_0
    iget-object p4, p0, LX64;->f:Ljava/util/List;

    invoke-static {p4}, Landroidx/camera/core/impl/g;->f(Ljava/util/List;)V
    :try_end_0
    .catch Landroidx/camera/core/impl/DeferrableSurface$SurfaceClosedException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p4, 0x0

    move v5, p4

    move-object v3, v0

    move-object v4, v3

    :goto_0
    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->k()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_5

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->k()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {v6}, Landroidx/camera/core/impl/DeferrableSurface;->e()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Landroidx/camera/core/l;

    invoke-static {v7, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v6}, Landroidx/camera/core/impl/DeferrableSurface;->h()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Surface;

    new-instance v7, Landroid/util/Size;

    invoke-virtual {v6}, Landroidx/camera/core/impl/DeferrableSurface;->f()Landroid/util/Size;

    move-result-object v8

    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    move-result v8

    invoke-virtual {v6}, Landroidx/camera/core/impl/DeferrableSurface;->f()Landroid/util/Size;

    move-result-object v9

    invoke-virtual {v9}, Landroid/util/Size;->getHeight()I

    move-result v9

    invoke-direct {v7, v8, v9}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {v6}, Landroidx/camera/core/impl/DeferrableSurface;->g()I

    move-result v6

    invoke-static {v0, v7, v6}, LiA3;->a(Landroid/view/Surface;Landroid/util/Size;I)LiA3;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-virtual {v6}, Landroidx/camera/core/impl/DeferrableSurface;->e()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Landroidx/camera/core/h;

    invoke-static {v7, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v6}, Landroidx/camera/core/impl/DeferrableSurface;->h()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/Surface;

    new-instance v7, Landroid/util/Size;

    invoke-virtual {v6}, Landroidx/camera/core/impl/DeferrableSurface;->f()Landroid/util/Size;

    move-result-object v8

    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    move-result v8

    invoke-virtual {v6}, Landroidx/camera/core/impl/DeferrableSurface;->f()Landroid/util/Size;

    move-result-object v9

    invoke-virtual {v9}, Landroid/util/Size;->getHeight()I

    move-result v9

    invoke-direct {v7, v8, v9}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {v6}, Landroidx/camera/core/impl/DeferrableSurface;->g()I

    move-result v6

    invoke-static {v3, v7, v6}, LiA3;->a(Landroid/view/Surface;Landroid/util/Size;I)LiA3;

    move-result-object v3

    goto :goto_1

    :cond_3
    invoke-virtual {v6}, Landroidx/camera/core/impl/DeferrableSurface;->e()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Landroidx/camera/core/e;

    invoke-static {v7, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v6}, Landroidx/camera/core/impl/DeferrableSurface;->h()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/Surface;

    new-instance v7, Landroid/util/Size;

    invoke-virtual {v6}, Landroidx/camera/core/impl/DeferrableSurface;->f()Landroid/util/Size;

    move-result-object v8

    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    move-result v8

    invoke-virtual {v6}, Landroidx/camera/core/impl/DeferrableSurface;->f()Landroid/util/Size;

    move-result-object v9

    invoke-virtual {v9}, Landroid/util/Size;->getHeight()I

    move-result v9

    invoke-direct {v7, v8, v9}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {v6}, Landroidx/camera/core/impl/DeferrableSurface;->g()I

    move-result v6

    invoke-static {v4, v7, v6}, LiA3;->a(Landroid/view/Surface;Landroid/util/Size;I)LiA3;

    move-result-object v4

    :cond_4
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_5
    sget-object v5, LX64$e;->c:LX64$e;

    iput-object v5, p0, LX64;->j:LX64$e;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "== initSession (id="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, LX64;->p:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, LX64;->a:Lyv5;

    iget-object v2, p0, LX64;->b:LJ90;

    invoke-interface {v1, v2, v0, v3, v4}, Lyv5;->h(LJb0;LiA3;LiA3;LiA3;)Landroidx/camera/core/impl/q;

    move-result-object v0

    iput-object v0, p0, LX64;->i:Landroidx/camera/core/impl/q;

    invoke-virtual {v0}, Landroidx/camera/core/impl/q;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {p4}, Landroidx/camera/core/impl/DeferrableSurface;->i()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p4

    new-instance v0, LV64;

    invoke-direct {v0, p0}, LV64;-><init>(LX64;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-interface {p4, v0, v1}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object p4, p0, LX64;->i:Landroidx/camera/core/impl/q;

    invoke-virtual {p4}, Landroidx/camera/core/impl/q;->k()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/DeferrableSurface;

    sget-object v1, LX64;->q:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->i()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    new-instance v2, LW64;

    invoke-direct {v2, v0}, LW64;-><init>(Landroidx/camera/core/impl/DeferrableSurface;)V

    iget-object v0, p0, LX64;->c:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v2, v0}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_2

    :cond_6
    new-instance p4, Landroidx/camera/core/impl/q$g;

    invoke-direct {p4}, Landroidx/camera/core/impl/q$g;-><init>()V

    invoke-virtual {p4, p1}, Landroidx/camera/core/impl/q$g;->a(Landroidx/camera/core/impl/q;)V

    invoke-virtual {p4}, Landroidx/camera/core/impl/q$g;->c()V

    iget-object p1, p0, LX64;->i:Landroidx/camera/core/impl/q;

    invoke-virtual {p4, p1}, Landroidx/camera/core/impl/q$g;->a(Landroidx/camera/core/impl/q;)V

    invoke-virtual {p4}, Landroidx/camera/core/impl/q$g;->e()Z

    move-result p1

    const-string v0, "Cannot transform the SessionConfig"

    invoke-static {p1, v0}, LHZ3;->b(ZLjava/lang/Object;)V

    invoke-virtual {p4}, Landroidx/camera/core/impl/q$g;->b()Landroidx/camera/core/impl/q;

    move-result-object p1

    iget-object p4, p0, LX64;->e:Lrf0;

    invoke-static {p2}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {p4, p1, p2, p3}, Lrf0;->a(Landroidx/camera/core/impl/q;Landroid/hardware/camera2/CameraDevice;LPX5;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    new-instance p2, LX64$a;

    invoke-direct {p2, p0}, LX64$a;-><init>(LX64;)V

    iget-object p3, p0, LX64;->c:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, p3}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {p1}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method private synthetic u(Ljava/lang/Void;)Ljava/lang/Void;
    .locals 0

    iget-object p1, p0, LX64;->e:Lrf0;

    invoke-virtual {p0, p1}, LX64;->w(Lrf0;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic v()V
    .locals 1

    iget-object v0, p0, LX64;->a:Lyv5;

    invoke-interface {v0}, Lyv5;->e()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/impl/q;Landroid/hardware/camera2/CameraDevice;LPX5;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/q;",
            "Landroid/hardware/camera2/CameraDevice;",
            "LPX5;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LX64;->j:LX64$e;

    sget-object v1, LX64$e;->b:LX64$e;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid state state:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LX64;->j:LX64$e;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LHZ3;->b(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v2

    const-string v1, "SessionConfig contains no surfaces"

    invoke-static {v0, v1}, LHZ3;->b(ZLjava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "open (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LX64;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->k()Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, LX64;->f:Ljava/util/List;

    const/4 v3, 0x0

    const-wide/16 v4, 0x1388

    iget-object v6, p0, LX64;->c:Ljava/util/concurrent/Executor;

    iget-object v7, p0, LX64;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static/range {v2 .. v7}, Landroidx/camera/core/impl/g;->k(Ljava/util/Collection;ZJLjava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    invoke-static {v0}, LDA1;->a(Lcom/google/common/util/concurrent/ListenableFuture;)LDA1;

    move-result-object v0

    new-instance v1, LT64;

    invoke-direct {v1, p0, p1, p2, p3}, LT64;-><init>(LX64;Landroidx/camera/core/impl/q;Landroid/hardware/camera2/CameraDevice;LPX5;)V

    iget-object p1, p0, LX64;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, p1}, LDA1;->e(Lfp;Ljava/util/concurrent/Executor;)LDA1;

    move-result-object p1

    new-instance p2, LU64;

    invoke-direct {p2, p0}, LU64;-><init>(LX64;)V

    iget-object p3, p0, LX64;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, p2, p3}, LDA1;->d(LxA1;Ljava/util/concurrent/Executor;)LDA1;

    move-result-object p1

    return-object p1
.end method

.method public b(Z)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "release (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LX64;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") mProcessorState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LX64;->j:LX64$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LX64;->e:Lrf0;

    invoke-virtual {v0, p1}, Lrf0;->b(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    sget-object v0, LX64$d;->a:[I

    iget-object v1, p0, LX64;->j:LX64$e;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LS64;

    invoke-direct {v0, p0}, LS64;-><init>(LX64;)V

    iget-object v1, p0, LX64;->c:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0, v1}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :goto_0
    sget-object v0, LX64$e;->f:LX64$e;

    iput-object v0, p0, LX64;->j:LX64$e;

    return-object p1
.end method

.method public c()Landroidx/camera/core/impl/q;
    .locals 1

    iget-object v0, p0, LX64;->g:Landroidx/camera/core/impl/q;

    return-object v0
.end method

.method public close()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "close (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LX64;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LX64;->j:LX64$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LX64;->j:LX64$e;

    sget-object v1, LX64$e;->d:LX64$e;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LX64;->a:Lyv5;

    invoke-interface {v0}, Lyv5;->d()V

    iget-object v0, p0, LX64;->h:Lka0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lka0;->a()V

    :cond_0
    sget-object v0, LX64$e;->e:LX64$e;

    iput-object v0, p0, LX64;->j:LX64$e;

    :cond_1
    iget-object v0, p0, LX64;->e:Lrf0;

    invoke-virtual {v0}, Lrf0;->close()V

    return-void
.end method

.method public d(Landroidx/camera/core/impl/q;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setSessionConfig (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LX64;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, LX64;->g:Landroidx/camera/core/impl/q;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LX64;->h:Lka0;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lka0;->b(Landroidx/camera/core/impl/q;)V

    :cond_1
    iget-object v0, p0, LX64;->j:LX64$e;

    sget-object v1, LX64$e;->d:LX64$e;

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->d()Landroidx/camera/core/impl/f;

    move-result-object p1

    invoke-static {p1}, Lnf0$a;->e(Landroidx/camera/core/impl/f;)Lnf0$a;

    move-result-object p1

    invoke-virtual {p1}, Lnf0$a;->c()Lnf0;

    move-result-object p1

    iput-object p1, p0, LX64;->n:Lnf0;

    iget-object v0, p0, LX64;->o:Lnf0;

    invoke-virtual {p0, p1, v0}, LX64;->x(Lnf0;Lnf0;)V

    iget-object p1, p0, LX64;->a:Lyv5;

    iget-object v0, p0, LX64;->m:LX64$f;

    invoke-interface {p1, v0}, Lyv5;->a(Lyv5$a;)I

    :cond_2
    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "issueCaptureRequests (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LX64;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") + state ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LX64;->j:LX64$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, LX64$d;->a:[I

    iget-object v2, p0, LX64;->j:LX64$e;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_4

    const/4 v3, 0x3

    if-eq v0, v3, :cond_2

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    const/4 v2, 0x5

    if-eq v0, v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Run issueCaptureRequests in wrong state, state = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LX64;->j:LX64$e;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, LX64;->n(Ljava/util/List;)V

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/d;

    invoke-virtual {v0}, Landroidx/camera/core/impl/d;->h()I

    move-result v1

    if-ne v1, v2, :cond_3

    invoke-virtual {p0, v0}, LX64;->p(Landroidx/camera/core/impl/d;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v0}, LX64;->q(Landroidx/camera/core/impl/d;)V

    goto :goto_0

    :cond_4
    iput-object p1, p0, LX64;->k:Ljava/util/List;

    :cond_5
    :goto_1
    return-void
.end method

.method public f()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cancelIssuedCaptureRequests (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LX64;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LX64;->k:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, LX64;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/d;

    invoke-virtual {v1}, Landroidx/camera/core/impl/d;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpa0;

    invoke-virtual {v2}, Lpa0;->a()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, LX64;->k:Ljava/util/List;

    :cond_2
    return-void
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LX64;->k:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, LX64;->k:Ljava/util/List;

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public h(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public p(Landroidx/camera/core/impl/d;)V
    .locals 4

    invoke-virtual {p1}, Landroidx/camera/core/impl/d;->e()Landroidx/camera/core/impl/f;

    move-result-object v0

    invoke-static {v0}, Lnf0$a;->e(Landroidx/camera/core/impl/f;)Lnf0$a;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/camera/core/impl/d;->e()Landroidx/camera/core/impl/f;

    move-result-object v1

    sget-object v2, Landroidx/camera/core/impl/d;->i:Landroidx/camera/core/impl/f$a;

    invoke-interface {v1, v2}, Landroidx/camera/core/impl/f;->e(Landroidx/camera/core/impl/f$a;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->JPEG_ORIENTATION:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1}, Landroidx/camera/core/impl/d;->e()Landroidx/camera/core/impl/f;

    move-result-object v3

    invoke-interface {v3, v2}, Landroidx/camera/core/impl/f;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v0, v1, v2}, Lnf0$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lnf0$a;

    :cond_0
    invoke-virtual {p1}, Landroidx/camera/core/impl/d;->e()Landroidx/camera/core/impl/f;

    move-result-object v1

    sget-object v2, Landroidx/camera/core/impl/d;->j:Landroidx/camera/core/impl/f$a;

    invoke-interface {v1, v2}, Landroidx/camera/core/impl/f;->e(Landroidx/camera/core/impl/f$a;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->JPEG_QUALITY:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1}, Landroidx/camera/core/impl/d;->e()Landroidx/camera/core/impl/f;

    move-result-object v3

    invoke-interface {v3, v2}, Landroidx/camera/core/impl/f;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->byteValue()B

    move-result v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lnf0$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lnf0$a;

    :cond_1
    invoke-virtual {v0}, Lnf0$a;->c()Lnf0;

    move-result-object v0

    iput-object v0, p0, LX64;->o:Lnf0;

    iget-object v1, p0, LX64;->n:Lnf0;

    invoke-virtual {p0, v1, v0}, LX64;->x(Lnf0;Lnf0;)V

    iget-object v0, p0, LX64;->a:Lyv5;

    new-instance v1, LX64$c;

    invoke-direct {v1, p0, p1}, LX64$c;-><init>(LX64;Landroidx/camera/core/impl/d;)V

    invoke-interface {v0, v1}, Lyv5;->g(Lyv5$a;)I

    return-void
.end method

.method public q(Landroidx/camera/core/impl/d;)V
    .locals 6

    const-string v0, "ProcessingCaptureSession"

    const-string v1, "issueTriggerRequest"

    invoke-static {v0, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/camera/core/impl/d;->e()Landroidx/camera/core/impl/f;

    move-result-object v0

    invoke-static {v0}, Lnf0$a;->e(Landroidx/camera/core/impl/f;)Lnf0$a;

    move-result-object v0

    invoke-virtual {v0}, Lnf0$a;->c()Lnf0;

    move-result-object v0

    invoke-interface {v0}, Landroidx/camera/core/impl/p;->g()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/f$a;

    invoke-virtual {v2}, Landroidx/camera/core/impl/f$a;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/camera2/CaptureRequest$Key;

    sget-object v5, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v2, v5}, Landroid/hardware/camera2/CaptureRequest$Key;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    sget-object v5, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v2, v5}, Landroid/hardware/camera2/CaptureRequest$Key;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    move v1, v3

    goto :goto_0

    :cond_2
    move v1, v4

    :goto_0
    if-nez v1, :cond_3

    new-array v0, v3, [Landroidx/camera/core/impl/d;

    aput-object p1, v0, v4

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LX64;->n(Ljava/util/List;)V

    return-void

    :cond_3
    iget-object v1, p0, LX64;->a:Lyv5;

    new-instance v2, LX64$b;

    invoke-direct {v2, p0, p1}, LX64$b;-><init>(LX64;Landroidx/camera/core/impl/d;)V

    invoke-interface {v1, v0, v2}, Lyv5;->c(Landroidx/camera/core/impl/f;Lyv5$a;)I

    return-void
.end method

.method public w(Lrf0;)V
    .locals 3

    iget-object v0, p0, LX64;->j:LX64$e;

    sget-object v1, LX64$e;->c:LX64$e;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid state state:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LX64;->j:LX64$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LHZ3;->b(ZLjava/lang/Object;)V

    new-instance v0, Lka0;

    iget-object v1, p0, LX64;->i:Landroidx/camera/core/impl/q;

    invoke-virtual {v1}, Landroidx/camera/core/impl/q;->k()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, LX64;->o(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lka0;-><init>(Lrf0;Ljava/util/List;)V

    iput-object v0, p0, LX64;->h:Lka0;

    iget-object p1, p0, LX64;->a:Lyv5;

    invoke-interface {p1, v0}, Lyv5;->b(LcJ4;)V

    sget-object p1, LX64$e;->d:LX64$e;

    iput-object p1, p0, LX64;->j:LX64$e;

    iget-object p1, p0, LX64;->g:Landroidx/camera/core/impl/q;

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, LX64;->d(Landroidx/camera/core/impl/q;)V

    :cond_1
    iget-object p1, p0, LX64;->k:Ljava/util/List;

    if-eqz p1, :cond_2

    iget-object p1, p0, LX64;->k:Ljava/util/List;

    invoke-virtual {p0, p1}, LX64;->e(Ljava/util/List;)V

    const/4 p1, 0x0

    iput-object p1, p0, LX64;->k:Ljava/util/List;

    :cond_2
    return-void
.end method

.method public final x(Lnf0;Lnf0;)V
    .locals 1

    new-instance v0, Lja0$a;

    invoke-direct {v0}, Lja0$a;-><init>()V

    invoke-virtual {v0, p1}, Lja0$a;->c(Landroidx/camera/core/impl/f;)Lja0$a;

    invoke-virtual {v0, p2}, Lja0$a;->c(Landroidx/camera/core/impl/f;)Lja0$a;

    iget-object p1, p0, LX64;->a:Lyv5;

    invoke-virtual {v0}, Lja0$a;->a()Lja0;

    move-result-object p2

    invoke-interface {p1, p2}, Lyv5;->f(Landroidx/camera/core/impl/f;)V

    return-void
.end method
