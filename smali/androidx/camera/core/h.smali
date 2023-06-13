.class public final Landroidx/camera/core/h;
.super Landroidx/camera/core/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/h$j;,
        Landroidx/camera/core/h$h;,
        Landroidx/camera/core/h$g;,
        Landroidx/camera/core/h$l;,
        Landroidx/camera/core/h$m;,
        Landroidx/camera/core/h$n;,
        Landroidx/camera/core/h$i;,
        Landroidx/camera/core/h$k;,
        Landroidx/camera/core/h$o;
    }
.end annotation


# static fields
.field public static final G:Landroidx/camera/core/h$h;

.field public static final H:Lci1;


# instance fields
.field public A:Landroidx/camera/core/impl/DeferrableSurface;

.field public B:Landroidx/camera/core/h$j;

.field public final C:Ljava/util/concurrent/Executor;

.field public D:LEX1;

.field public E:LFY5;

.field public final F:LeX1;

.field public n:Z

.field public final o:LKX1$a;

.field public final p:Ljava/util/concurrent/Executor;

.field public final q:I

.field public final r:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final s:I

.field public t:I

.field public u:Landroid/util/Rational;

.field public v:Landroidx/camera/core/impl/d;

.field public w:Z

.field public x:Landroidx/camera/core/impl/q$b;

.field public y:Landroidx/camera/core/n;

.field public z:Lpa0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/camera/core/h$h;

    invoke-direct {v0}, Landroidx/camera/core/h$h;-><init>()V

    sput-object v0, Landroidx/camera/core/h;->G:Landroidx/camera/core/h$h;

    new-instance v0, Lci1;

    invoke-direct {v0}, Lci1;-><init>()V

    sput-object v0, Landroidx/camera/core/h;->H:Lci1;

    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/impl/i;)V
    .locals 3

    invoke-direct {p0, p1}, Landroidx/camera/core/p;-><init>(Landroidx/camera/core/impl/s;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/camera/core/h;->n:Z

    new-instance v0, LPW1;

    invoke-direct {v0}, LPW1;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/h;->o:LKX1$a;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/camera/core/h;->r:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/camera/core/h;->t:I

    iput-object v1, p0, Landroidx/camera/core/h;->u:Landroid/util/Rational;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/core/h;->w:Z

    new-instance v1, Landroidx/camera/core/h$f;

    invoke-direct {v1, p0}, Landroidx/camera/core/h$f;-><init>(Landroidx/camera/core/h;)V

    iput-object v1, p0, Landroidx/camera/core/h;->F:LeX1;

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/i;

    sget-object v2, Landroidx/camera/core/impl/i;->F:Landroidx/camera/core/impl/f$a;

    invoke-interface {v1, v2}, Landroidx/camera/core/impl/p;->e(Landroidx/camera/core/impl/f$a;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Landroidx/camera/core/impl/i;->T()I

    move-result p1

    iput p1, p0, Landroidx/camera/core/h;->q:I

    goto :goto_0

    :cond_0
    iput p1, p0, Landroidx/camera/core/h;->q:I

    :goto_0
    invoke-virtual {v1, v0}, Landroidx/camera/core/impl/i;->V(I)I

    move-result p1

    iput p1, p0, Landroidx/camera/core/h;->s:I

    invoke-static {}, LAc0;->c()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroidx/camera/core/impl/i;->X(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    iput-object p1, p0, Landroidx/camera/core/h;->p:Ljava/util/concurrent/Executor;

    invoke-static {p1}, LAc0;->f(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/h;->C:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private synthetic A0(Ljava/lang/String;Landroidx/camera/core/impl/i;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->w(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_0

    iget-object p4, p0, Landroidx/camera/core/h;->E:LFY5;

    invoke-virtual {p4}, LFY5;->k()V

    const/4 p4, 0x1

    invoke-virtual {p0, p4}, Landroidx/camera/core/h;->j0(Z)V

    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/core/h;->l0(Ljava/lang/String;Landroidx/camera/core/impl/i;LBR5;)Landroidx/camera/core/impl/q$b;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/h;->x:Landroidx/camera/core/impl/q$b;

    invoke-virtual {p1}, Landroidx/camera/core/impl/q$b;->m()Landroidx/camera/core/impl/q;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->S(Landroidx/camera/core/impl/q;)V

    invoke-virtual {p0}, Landroidx/camera/core/p;->C()V

    iget-object p1, p0, Landroidx/camera/core/h;->E:LFY5;

    invoke-virtual {p1}, LFY5;->l()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/h;->i0()V

    :goto_0
    return-void
.end method

.method public static synthetic B0(LKX1;)V
    .locals 3

    const-string v0, "ImageCapture"

    :try_start_0
    invoke-interface {p0}, LKX1;->g()Landroidx/camera/core/i;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Discarding ImageProxy which was inadvertently acquired: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p0, :cond_1

    :try_start_2
    invoke-interface {p0}, Landroidx/camera/core/i;->close()V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catchall_0
    move-exception v1

    if-eqz p0, :cond_0

    :try_start_3
    invoke-interface {p0}, Landroidx/camera/core/i;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw v1
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    const-string v1, "Failed to acquire latest image."

    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_1
    return-void
.end method

.method private synthetic C0(Landroidx/camera/core/h$l;)V
    .locals 4

    new-instance v0, Landroidx/camera/core/ImageCaptureException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Not bound to a valid Camera ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-direct {v0, v3, v1, v2}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p1, v0}, Landroidx/camera/core/h$l;->b(Landroidx/camera/core/ImageCaptureException;)V

    return-void
.end method

.method public static synthetic D0(Landroidx/camera/core/h$l;)V
    .locals 4

    new-instance v0, Landroidx/camera/core/ImageCaptureException;

    const-string v1, "Request is canceled"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Landroidx/camera/core/h$l;->b(Landroidx/camera/core/ImageCaptureException;)V

    return-void
.end method

.method public static synthetic E0(Ljava/util/List;)Ljava/lang/Void;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method private synthetic F0(Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/camera/core/h;->S0(Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;)V

    return-void
.end method

.method private synthetic G0(Landroidx/camera/core/h$n;Ljava/util/concurrent/Executor;Landroidx/camera/core/h$m;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/core/h;->R0(Landroidx/camera/core/h$n;Ljava/util/concurrent/Executor;Landroidx/camera/core/h$m;)V

    return-void
.end method

.method public static synthetic H0(LO80$a;LKX1;)V
    .locals 1

    :try_start_0
    invoke-interface {p1}, LKX1;->g()Landroidx/camera/core/i;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LO80$a;->c(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Landroidx/camera/core/i;->close()V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unable to acquire image"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LO80$a;->f(Ljava/lang/Throwable;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic I0(Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 1

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void
.end method

.method private synthetic J0(Landroidx/camera/core/h$i;LO80$a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/h;->y:Landroidx/camera/core/n;

    new-instance v1, LQW1;

    invoke-direct {v1, p2}, LQW1;-><init>(LO80$a;)V

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/camera/core/n;->d(LKX1$a;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p0}, Landroidx/camera/core/h;->K0()V

    invoke-virtual {p0, p1}, Landroidx/camera/core/h;->y0(Landroidx/camera/core/h$i;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    new-instance v0, Landroidx/camera/core/h$e;

    invoke-direct {v0, p0, p2}, Landroidx/camera/core/h$e;-><init>(Landroidx/camera/core/h;LO80$a;)V

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    invoke-static {p1, v0, v1}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    new-instance v0, LRW1;

    invoke-direct {v0, p1}, LRW1;-><init>(Lcom/google/common/util/concurrent/ListenableFuture;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, LO80$a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    const-string p1, "takePictureInternal"

    return-object p1
.end method

.method public static synthetic U(Landroidx/camera/core/h;Ljava/lang/String;Landroidx/camera/core/impl/i;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/camera/core/h;->A0(Ljava/lang/String;Landroidx/camera/core/impl/i;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V

    return-void
.end method

.method public static synthetic V(Ljava/util/List;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/h;->E0(Ljava/util/List;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic W(Landroidx/camera/core/h$l;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/h;->D0(Landroidx/camera/core/h$l;)V

    return-void
.end method

.method public static synthetic X(Landroidx/camera/core/h;Landroidx/camera/core/h$n;Ljava/util/concurrent/Executor;Landroidx/camera/core/h$m;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/core/h;->G0(Landroidx/camera/core/h$n;Ljava/util/concurrent/Executor;Landroidx/camera/core/h$m;)V

    return-void
.end method

.method public static synthetic Y(Landroidx/camera/core/h;Ljava/lang/String;Landroidx/camera/core/impl/i;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/camera/core/h;->z0(Ljava/lang/String;Landroidx/camera/core/impl/i;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V

    return-void
.end method

.method public static synthetic Z(Landroidx/camera/core/h;Landroidx/camera/core/h$i;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/h;->T0(Landroidx/camera/core/h$i;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Landroidx/camera/core/h;Landroidx/camera/core/h$i;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/core/h;->J0(Landroidx/camera/core/h$i;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b0(Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/h;->I0(Lcom/google/common/util/concurrent/ListenableFuture;)V

    return-void
.end method

.method public static synthetic c0(Landroidx/camera/core/h;Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/core/h;->F0(Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;)V

    return-void
.end method

.method public static synthetic d0(LKX1;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/core/h;->B0(LKX1;)V

    return-void
.end method

.method public static synthetic e0(LO80$a;LKX1;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/h;->H0(LO80$a;LKX1;)V

    return-void
.end method

.method public static synthetic f0(Landroidx/camera/core/h;Landroidx/camera/core/h$l;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/h;->C0(Landroidx/camera/core/h$l;)V

    return-void
.end method

.method public static k0(Landroid/graphics/Rect;Landroid/util/Rational;ILandroid/util/Size;I)Landroid/graphics/Rect;
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {p0, p2, p3, p4}, Landroidx/camera/core/internal/utils/ImageUtil;->b(Landroid/graphics/Rect;ILandroid/util/Size;I)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0

    :cond_0
    if-eqz p1, :cond_2

    rem-int/lit16 p4, p4, 0xb4

    if-eqz p4, :cond_1

    new-instance p0, Landroid/util/Rational;

    invoke-virtual {p1}, Landroid/util/Rational;->getDenominator()I

    move-result p2

    invoke-virtual {p1}, Landroid/util/Rational;->getNumerator()I

    move-result p1

    invoke-direct {p0, p2, p1}, Landroid/util/Rational;-><init>(II)V

    move-object p1, p0

    :cond_1
    invoke-static {p3, p1}, Landroidx/camera/core/internal/utils/ImageUtil;->i(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {p3, p1}, Landroidx/camera/core/internal/utils/ImageUtil;->a(Landroid/util/Size;Landroid/util/Rational;)Landroid/graphics/Rect;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_2
    new-instance p0, Landroid/graphics/Rect;

    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result p1

    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result p2

    const/4 p3, 0x0

    invoke-direct {p0, p3, p3, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p0
.end method

.method public static p0(Ljava/lang/Throwable;)I
    .locals 1

    instance-of v0, p0, LYa0;

    if-eqz v0, :cond_0

    const/4 p0, 0x3

    return p0

    :cond_0
    instance-of v0, p0, Landroidx/camera/core/ImageCaptureException;

    if-eqz v0, :cond_1

    check-cast p0, Landroidx/camera/core/ImageCaptureException;

    invoke-virtual {p0}, Landroidx/camera/core/ImageCaptureException;->a()I

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static v0(Ljava/util/List;I)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "[",
            "Landroid/util/Size;",
            ">;>;I)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method private synthetic z0(Ljava/lang/String;Landroidx/camera/core/impl/i;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V
    .locals 0

    iget-object p4, p0, Landroidx/camera/core/h;->B:Landroidx/camera/core/h$j;

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Landroidx/camera/core/h$j;->c()Ljava/util/List;

    move-result-object p4

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p4

    :goto_0
    invoke-virtual {p0}, Landroidx/camera/core/h;->h0()V

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->w(Ljava/lang/String;)Z

    move-result p5

    if-eqz p5, :cond_2

    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/core/h;->l0(Ljava/lang/String;Landroidx/camera/core/impl/i;LBR5;)Landroidx/camera/core/impl/q$b;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/h;->x:Landroidx/camera/core/impl/q$b;

    iget-object p1, p0, Landroidx/camera/core/h;->B:Landroidx/camera/core/h$j;

    if-eqz p1, :cond_1

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/camera/core/h$i;

    iget-object p3, p0, Landroidx/camera/core/h;->B:Landroidx/camera/core/h$j;

    invoke-virtual {p3, p2}, Landroidx/camera/core/h$j;->d(Landroidx/camera/core/h$i;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Landroidx/camera/core/h;->x:Landroidx/camera/core/impl/q$b;

    invoke-virtual {p1}, Landroidx/camera/core/impl/q$b;->m()Landroidx/camera/core/impl/q;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->S(Landroidx/camera/core/impl/q;)V

    invoke-virtual {p0}, Landroidx/camera/core/p;->C()V

    :cond_2
    return-void
.end method


# virtual methods
.method public F()V
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/i;

    invoke-static {v0}, Landroidx/camera/core/impl/d$a;->j(Landroidx/camera/core/impl/s;)Landroidx/camera/core/impl/d$a;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/camera/core/impl/d$a;->h()Landroidx/camera/core/impl/d;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/core/h;->v:Landroidx/camera/core/impl/d;

    invoke-virtual {v0}, Landroidx/camera/core/impl/i;->a0()Z

    move-result v0

    iput-boolean v0, p0, Landroidx/camera/core/h;->w:Z

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v0

    const-string v1, "Attached camera cannot be null"

    invoke-static {v0, v1}, LHZ3;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public G()V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/h;->V0()V

    return-void
.end method

.method public H(LKb0;Landroidx/camera/core/impl/s$a;)Landroidx/camera/core/impl/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LKb0;",
            "Landroidx/camera/core/impl/s$a<",
            "***>;)",
            "Landroidx/camera/core/impl/s<",
            "*>;"
        }
    .end annotation

    invoke-interface {p1}, LKb0;->k()LTe4;

    move-result-object p1

    const-class v0, LmN5;

    invoke-virtual {p1, v0}, LTe4;->a(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/i;->L:Landroidx/camera/core/impl/f$a;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1, v2}, Landroidx/camera/core/impl/f;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    const-string v0, "ImageCapture"

    if-eqz p1, :cond_0

    const-string p1, "Device quirk suggests software JPEG encoder, but it has been explicitly disabled."

    invoke-static {v0, p1}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, "Requesting software JPEG due to device quirk."

    invoke-static {v0, p1}, LJx2;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object p1

    invoke-interface {p1, v1, v2}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/h;->n0(Landroidx/camera/core/impl/l;)Z

    move-result p1

    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/i;->I:Landroidx/camera/core/impl/f$a;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroidx/camera/core/impl/f;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const/16 v1, 0x100

    const/16 v3, 0x23

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Landroidx/camera/core/h;->x0()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v1, 0x1

    :goto_2
    const-string v2, "Cannot set non-JPEG buffer format with Extensions enabled."

    invoke-static {v1, v2}, LHZ3;->b(ZLjava/lang/Object;)V

    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object v1

    sget-object v2, Landroidx/camera/core/impl/j;->k:Landroidx/camera/core/impl/f$a;

    if-eqz p1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :goto_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    goto :goto_4

    :cond_5
    if-eqz p1, :cond_6

    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object p1

    sget-object v0, Landroidx/camera/core/impl/j;->k:Landroidx/camera/core/impl/f$a;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    goto :goto_4

    :cond_6
    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object p1

    sget-object v0, Landroidx/camera/core/impl/k;->s:Landroidx/camera/core/impl/f$a;

    invoke-interface {p1, v0, v2}, Landroidx/camera/core/impl/f;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_7

    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object p1

    sget-object v0, Landroidx/camera/core/impl/j;->k:Landroidx/camera/core/impl/f$a;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    invoke-static {p1, v1}, Landroidx/camera/core/h;->v0(Ljava/util/List;I)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object p1

    sget-object v0, Landroidx/camera/core/impl/j;->k:Landroidx/camera/core/impl/f$a;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    goto :goto_4

    :cond_8
    invoke-static {p1, v3}, Landroidx/camera/core/h;->v0(Ljava/util/List;I)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object p1

    sget-object v0, Landroidx/camera/core/impl/j;->k:Landroidx/camera/core/impl/f$a;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    :cond_9
    :goto_4
    invoke-interface {p2}, Landroidx/camera/core/impl/s$a;->d()Landroidx/camera/core/impl/s;

    move-result-object p1

    return-object p1
.end method

.method public J()V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/h;->g0()V

    return-void
.end method

.method public K(LBR5;)LBR5;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/p;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/i;

    invoke-virtual {p0, v0, v1, p1}, Landroidx/camera/core/h;->l0(Ljava/lang/String;Landroidx/camera/core/impl/i;LBR5;)Landroidx/camera/core/impl/q$b;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/h;->x:Landroidx/camera/core/impl/q$b;

    invoke-virtual {v0}, Landroidx/camera/core/impl/q$b;->m()Landroidx/camera/core/impl/q;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/core/p;->S(Landroidx/camera/core/impl/q;)V

    invoke-virtual {p0}, Landroidx/camera/core/p;->A()V

    return-object p1
.end method

.method public K0()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/h;->r:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/h;->r:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Landroidx/camera/core/h;->r:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Landroidx/camera/core/h;->q0()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public L()V
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/core/h;->g0()V

    invoke-virtual {p0}, Landroidx/camera/core/h;->h0()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/core/h;->w:Z

    return-void
.end method

.method public final L0(Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;Z)V
    .locals 11

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p3, LYW1;

    invoke-direct {p3, p0, p2}, LYW1;-><init>(Landroidx/camera/core/h;Landroidx/camera/core/h$l;)V

    invoke-interface {p1, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v1, p0, Landroidx/camera/core/h;->B:Landroidx/camera/core/h$j;

    if-nez v1, :cond_1

    new-instance p3, LZW1;

    invoke-direct {p3, p2}, LZW1;-><init>(Landroidx/camera/core/h$l;)V

    invoke-interface {p1, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    new-instance v10, Landroidx/camera/core/h$i;

    invoke-virtual {p0, v0}, Landroidx/camera/core/p;->o(LLb0;)I

    move-result v3

    invoke-virtual {p0, v0, p3}, Landroidx/camera/core/h;->r0(LLb0;Z)I

    move-result v4

    iget-object v5, p0, Landroidx/camera/core/h;->u:Landroid/util/Rational;

    invoke-virtual {p0}, Landroidx/camera/core/p;->v()Landroid/graphics/Rect;

    move-result-object v6

    invoke-virtual {p0}, Landroidx/camera/core/p;->q()Landroid/graphics/Matrix;

    move-result-object v7

    move-object v2, v10

    move-object v8, p1

    move-object v9, p2

    invoke-direct/range {v2 .. v9}, Landroidx/camera/core/h$i;-><init>(IILandroid/util/Rational;Landroid/graphics/Rect;Landroid/graphics/Matrix;Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;)V

    invoke-virtual {v1, v10}, Landroidx/camera/core/h$j;->d(Landroidx/camera/core/h$i;)V

    return-void
.end method

.method public final M0(Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;Landroidx/camera/core/h$m;)V
    .locals 3

    new-instance p1, Landroidx/camera/core/ImageCaptureException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Not bound to a valid Camera ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-direct {p1, v2, v0, v1}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Landroidx/camera/core/h$l;->b(Landroidx/camera/core/ImageCaptureException;)V

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    invoke-interface {p3, p1}, Landroidx/camera/core/h$m;->b(Landroidx/camera/core/ImageCaptureException;)V

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must have either in-memory or on-disk callback."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public N0(Landroid/util/Rational;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/h;->u:Landroid/util/Rational;

    return-void
.end method

.method public O0(I)V
    .locals 3

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid flash mode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/camera/core/h;->r:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iput p1, p0, Landroidx/camera/core/h;->t:I

    invoke-virtual {p0}, Landroidx/camera/core/h;->V0()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public P0(I)V
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/h;->u0()I

    move-result v0

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->P(I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/camera/core/h;->u:Landroid/util/Rational;

    if-eqz v1, :cond_0

    invoke-static {v0}, Lac0;->b(I)I

    move-result v0

    invoke-static {p1}, Lac0;->b(I)I

    move-result p1

    sub-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    iget-object v0, p0, Landroidx/camera/core/h;->u:Landroid/util/Rational;

    invoke-static {p1, v0}, Landroidx/camera/core/internal/utils/ImageUtil;->f(ILandroid/util/Rational;)Landroid/util/Rational;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/h;->u:Landroid/util/Rational;

    :cond_0
    return-void
.end method

.method public Q0(Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d;",
            ">;)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, Landroidx/camera/core/p;->g()Landroidx/camera/core/impl/CameraControlInternal;

    move-result-object v0

    iget v1, p0, Landroidx/camera/core/h;->q:I

    iget v2, p0, Landroidx/camera/core/h;->s:I

    invoke-interface {v0, p1, v1, v2}, Landroidx/camera/core/impl/CameraControlInternal;->c(Ljava/util/List;II)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    new-instance v0, LXW1;

    invoke-direct {v0}, LXW1;-><init>()V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-static {p1, v0, v1}, LIA1;->o(Lcom/google/common/util/concurrent/ListenableFuture;LxA1;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public R0(Landroidx/camera/core/h$n;Ljava/util/concurrent/Executor;Landroidx/camera/core/h$m;)V
    .locals 8

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, LUW1;

    invoke-direct {v1, p0, p1, p2, p3}, LUW1;-><init>(Landroidx/camera/core/h;Landroidx/camera/core/h$n;Ljava/util/concurrent/Executor;Landroidx/camera/core/h$m;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/h;->w0()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0, p3, p1}, Landroidx/camera/core/h;->U0(Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;Landroidx/camera/core/h$m;Landroidx/camera/core/h$n;)V

    return-void

    :cond_1
    new-instance v6, Landroidx/camera/core/h$c;

    invoke-direct {v6, p0, p3}, Landroidx/camera/core/h$c;-><init>(Landroidx/camera/core/h;Landroidx/camera/core/h$m;)V

    invoke-virtual {p0}, Landroidx/camera/core/h;->s0()I

    move-result v4

    new-instance v0, Landroidx/camera/core/h$d;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, Landroidx/camera/core/h$d;-><init>(Landroidx/camera/core/h;Landroidx/camera/core/h$n;ILjava/util/concurrent/Executor;Landroidx/camera/core/j$b;Landroidx/camera/core/h$m;)V

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p0, p1, v0, p2}, Landroidx/camera/core/h;->L0(Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;Z)V

    return-void
.end method

.method public S0(Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;)V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, LWW1;

    invoke-direct {v1, p0, p1, p2}, LWW1;-><init>(Landroidx/camera/core/h;Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/h;->w0()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, v0}, Landroidx/camera/core/h;->U0(Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;Landroidx/camera/core/h$m;Landroidx/camera/core/h$n;)V

    return-void

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Landroidx/camera/core/h;->L0(Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;Z)V

    return-void
.end method

.method public final T0(Landroidx/camera/core/h$i;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/h$i;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/camera/core/i;",
            ">;"
        }
    .end annotation

    new-instance v0, LaX1;

    invoke-direct {v0, p0, p1}, LaX1;-><init>(Landroidx/camera/core/h;Landroidx/camera/core/h$i;)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public final U0(Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;Landroidx/camera/core/h$m;Landroidx/camera/core/h$n;)V
    .locals 13

    move-object v0, p0

    invoke-static {}, LO36;->a()V

    const-string v1, "ImageCapture"

    const-string v2, "takePictureWithNode"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual/range {p0 .. p3}, Landroidx/camera/core/h;->M0(Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;Landroidx/camera/core/h$m;)V

    return-void

    :cond_0
    iget-object v2, v0, Landroidx/camera/core/h;->E:LFY5;

    invoke-virtual {p0}, Landroidx/camera/core/h;->t0()Landroid/graphics/Rect;

    move-result-object v7

    invoke-virtual {p0}, Landroidx/camera/core/p;->q()Landroid/graphics/Matrix;

    move-result-object v8

    invoke-virtual {p0, v1}, Landroidx/camera/core/p;->o(LLb0;)I

    move-result v9

    invoke-virtual {p0}, Landroidx/camera/core/h;->s0()I

    move-result v10

    invoke-virtual {p0}, Landroidx/camera/core/h;->o0()I

    move-result v11

    iget-object v1, v0, Landroidx/camera/core/h;->x:Landroidx/camera/core/impl/q$b;

    invoke-virtual {v1}, Landroidx/camera/core/impl/q$b;->p()Ljava/util/List;

    move-result-object v12

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    invoke-static/range {v3 .. v12}, LJY5;->r(Ljava/util/concurrent/Executor;Landroidx/camera/core/h$l;Landroidx/camera/core/h$m;Landroidx/camera/core/h$n;Landroid/graphics/Rect;Landroid/graphics/Matrix;IIILjava/util/List;)LJY5;

    move-result-object v1

    invoke-virtual {v2, v1}, LFY5;->j(LJY5;)V

    return-void
.end method

.method public final V0()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/h;->r:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/h;->r:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/p;->g()Landroidx/camera/core/impl/CameraControlInternal;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/camera/core/h;->q0()I

    move-result v2

    invoke-interface {v1, v2}, Landroidx/camera/core/impl/CameraControlInternal;->i(I)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public W0()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/h;->r:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/h;->r:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0}, Landroidx/camera/core/h;->q0()I

    move-result v2

    if-eq v1, v2, :cond_1

    invoke-virtual {p0}, Landroidx/camera/core/h;->V0()V

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final g0()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/h;->E:LFY5;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LFY5;->d()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/h;->B:Landroidx/camera/core/h$j;

    if-eqz v0, :cond_1

    new-instance v0, LYa0;

    const-string v1, "Camera is closed."

    invoke-direct {v0, v1}, LYa0;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/camera/core/h;->B:Landroidx/camera/core/h$j;

    invoke-virtual {v1, v0}, Landroidx/camera/core/h$j;->a(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public h0()V
    .locals 4

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, Landroidx/camera/core/h;->w0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/h;->i0()V

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/h;->B:Landroidx/camera/core/h$j;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    new-instance v2, Ljava/util/concurrent/CancellationException;

    const-string v3, "Request is canceled."

    invoke-direct {v2, v3}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroidx/camera/core/h$j;->a(Ljava/lang/Throwable;)V

    iput-object v1, p0, Landroidx/camera/core/h;->B:Landroidx/camera/core/h$j;

    :cond_1
    iget-object v0, p0, Landroidx/camera/core/h;->A:Landroidx/camera/core/impl/DeferrableSurface;

    iput-object v1, p0, Landroidx/camera/core/h;->A:Landroidx/camera/core/impl/DeferrableSurface;

    iput-object v1, p0, Landroidx/camera/core/h;->y:Landroidx/camera/core/n;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->c()V

    :cond_2
    return-void
.end method

.method public final i0()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/camera/core/h;->j0(Z)V

    return-void
.end method

.method public j(ZLVf6;)Landroidx/camera/core/impl/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LVf6;",
            ")",
            "Landroidx/camera/core/impl/s<",
            "*>;"
        }
    .end annotation

    sget-object v0, LVf6$b;->b:LVf6$b;

    invoke-virtual {p0}, Landroidx/camera/core/h;->o0()I

    move-result v1

    invoke-interface {p2, v0, v1}, LVf6;->a(LVf6$b;I)Landroidx/camera/core/impl/f;

    move-result-object p2

    if-eqz p1, :cond_0

    sget-object p1, Landroidx/camera/core/h;->G:Landroidx/camera/core/h$h;

    invoke-virtual {p1}, Landroidx/camera/core/h$h;->a()Landroidx/camera/core/impl/i;

    move-result-object p1

    invoke-static {p2, p1}, Landroidx/camera/core/impl/f;->N(Landroidx/camera/core/impl/f;Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/f;

    move-result-object p2

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p2}, Landroidx/camera/core/h;->u(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/s$a;

    move-result-object p1

    invoke-interface {p1}, Landroidx/camera/core/impl/s$a;->d()Landroidx/camera/core/impl/s;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final j0(Z)V
    .locals 2

    const-string v0, "ImageCapture"

    const-string v1, "clearPipelineWithNode"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Landroidx/camera/core/h;->D:LEX1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LEX1;->a()V

    iput-object v1, p0, Landroidx/camera/core/h;->D:LEX1;

    :cond_0
    if-nez p1, :cond_1

    iget-object p1, p0, Landroidx/camera/core/h;->E:LFY5;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LFY5;->d()V

    iput-object v1, p0, Landroidx/camera/core/h;->E:LFY5;

    :cond_1
    return-void
.end method

.method public l0(Ljava/lang/String;Landroidx/camera/core/impl/i;LBR5;)Landroidx/camera/core/impl/q$b;
    .locals 11

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, Landroidx/camera/core/h;->w0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/core/h;->m0(Ljava/lang/String;Landroidx/camera/core/impl/i;LBR5;)Landroidx/camera/core/impl/q$b;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p3}, LBR5;->c()Landroid/util/Size;

    move-result-object v0

    invoke-static {p2, v0}, Landroidx/camera/core/impl/q$b;->o(Landroidx/camera/core/impl/s;Landroid/util/Size;)Landroidx/camera/core/impl/q$b;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/camera/core/h;->o0()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-virtual {p0}, Landroidx/camera/core/p;->g()Landroidx/camera/core/impl/CameraControlInternal;

    move-result-object v1

    invoke-interface {v1, v0}, Landroidx/camera/core/impl/CameraControlInternal;->a(Landroidx/camera/core/impl/q$b;)V

    :cond_1
    invoke-virtual {p3}, LBR5;->c()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {p2}, Landroidx/camera/core/impl/i;->W()LLX1;

    move-result-object v3

    if-eqz v3, :cond_2

    new-instance v3, Landroidx/camera/core/n;

    invoke-virtual {p2}, Landroidx/camera/core/impl/i;->W()LLX1;

    move-result-object v4

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v5

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v6

    invoke-virtual {p0}, Landroidx/camera/core/p;->l()I

    move-result v7

    const/4 v8, 0x2

    const-wide/16 v9, 0x0

    invoke-interface/range {v4 .. v10}, LLX1;->a(IIIIJ)LKX1;

    move-result-object v1

    invoke-direct {v3, v1}, Landroidx/camera/core/n;-><init>(LKX1;)V

    iput-object v3, p0, Landroidx/camera/core/h;->y:Landroidx/camera/core/n;

    new-instance v1, Landroidx/camera/core/h$a;

    invoke-direct {v1, p0}, Landroidx/camera/core/h$a;-><init>(Landroidx/camera/core/h;)V

    iput-object v1, p0, Landroidx/camera/core/h;->z:Lpa0;

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroidx/camera/core/h;->x0()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {p0}, Landroidx/camera/core/p;->l()I

    move-result v3

    const/16 v4, 0x100

    if-ne v3, v4, :cond_3

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v1

    invoke-static {v3, v1, v4, v2}, LMX1;->a(IIII)LKX1;

    move-result-object v1

    new-instance v3, Landroidx/camera/core/h$b;

    invoke-direct {v3, p0}, Landroidx/camera/core/h$b;-><init>(Landroidx/camera/core/h;)V

    iput-object v3, p0, Landroidx/camera/core/h;->z:Lpa0;

    new-instance v3, Landroidx/camera/core/n;

    invoke-direct {v3, v1}, Landroidx/camera/core/n;-><init>(LKX1;)V

    iput-object v3, p0, Landroidx/camera/core/h;->y:Landroidx/camera/core/n;

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unsupported image format:"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/camera/core/p;->l()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance v3, Landroidx/camera/core/k;

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v4

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroidx/camera/core/p;->l()I

    move-result v5

    invoke-direct {v3, v4, v1, v5, v2}, Landroidx/camera/core/k;-><init>(IIII)V

    invoke-virtual {v3}, Landroidx/camera/core/k;->n()Lpa0;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/core/h;->z:Lpa0;

    new-instance v1, Landroidx/camera/core/n;

    invoke-direct {v1, v3}, Landroidx/camera/core/n;-><init>(LKX1;)V

    iput-object v1, p0, Landroidx/camera/core/h;->y:Landroidx/camera/core/n;

    :goto_0
    iget-object v1, p0, Landroidx/camera/core/h;->B:Landroidx/camera/core/h$j;

    if-eqz v1, :cond_5

    new-instance v3, Ljava/util/concurrent/CancellationException;

    const-string v4, "Request is canceled."

    invoke-direct {v3, v4}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Landroidx/camera/core/h$j;->a(Ljava/lang/Throwable;)V

    :cond_5
    new-instance v1, Landroidx/camera/core/h$j;

    new-instance v3, LSW1;

    invoke-direct {v3, p0}, LSW1;-><init>(Landroidx/camera/core/h;)V

    invoke-direct {v1, v2, v3}, Landroidx/camera/core/h$j;-><init>(ILandroidx/camera/core/h$j$b;)V

    iput-object v1, p0, Landroidx/camera/core/h;->B:Landroidx/camera/core/h$j;

    iget-object v1, p0, Landroidx/camera/core/h;->y:Landroidx/camera/core/n;

    iget-object v2, p0, Landroidx/camera/core/h;->o:LKX1$a;

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroidx/camera/core/n;->d(LKX1$a;Ljava/util/concurrent/Executor;)V

    iget-object v1, p0, Landroidx/camera/core/h;->A:Landroidx/camera/core/impl/DeferrableSurface;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroidx/camera/core/impl/DeferrableSurface;->c()V

    :cond_6
    new-instance v1, LNY1;

    iget-object v2, p0, Landroidx/camera/core/h;->y:Landroidx/camera/core/n;

    invoke-virtual {v2}, Landroidx/camera/core/n;->a()Landroid/view/Surface;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Landroid/util/Size;

    iget-object v4, p0, Landroidx/camera/core/h;->y:Landroidx/camera/core/n;

    invoke-virtual {v4}, Landroidx/camera/core/n;->getWidth()I

    move-result v4

    iget-object v5, p0, Landroidx/camera/core/h;->y:Landroidx/camera/core/n;

    invoke-virtual {v5}, Landroidx/camera/core/n;->getHeight()I

    move-result v5

    invoke-direct {v3, v4, v5}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {p0}, Landroidx/camera/core/p;->l()I

    move-result v4

    invoke-direct {v1, v2, v3, v4}, LNY1;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    iput-object v1, p0, Landroidx/camera/core/h;->A:Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {v1}, Landroidx/camera/core/impl/DeferrableSurface;->i()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/core/h;->y:Landroidx/camera/core/n;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, LuJ6;

    invoke-direct {v3, v2}, LuJ6;-><init>(Landroidx/camera/core/n;)V

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object v1, p0, Landroidx/camera/core/h;->A:Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/q$b;->h(Landroidx/camera/core/impl/DeferrableSurface;)Landroidx/camera/core/impl/q$b;

    new-instance v1, LTW1;

    invoke-direct {v1, p0, p1, p2, p3}, LTW1;-><init>(Landroidx/camera/core/h;Ljava/lang/String;Landroidx/camera/core/impl/i;LBR5;)V

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/q$b;->f(Landroidx/camera/core/impl/q$c;)Landroidx/camera/core/impl/q$b;

    return-object v0
.end method

.method public final m0(Ljava/lang/String;Landroidx/camera/core/impl/i;LBR5;)Landroidx/camera/core/impl/q$b;
    .locals 5

    invoke-static {}, LO36;->a()V

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v3, 0x1

    aput-object p3, v1, v3

    const-string v4, "createPipelineWithNode(cameraId: %s, streamSpec: %s)"

    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "ImageCapture"

    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p3}, LBR5;->c()Landroid/util/Size;

    move-result-object v1

    iget-object v4, p0, Landroidx/camera/core/h;->D:LEX1;

    if-nez v4, :cond_0

    move v2, v3

    :cond_0
    invoke-static {v2}, LHZ3;->i(Z)V

    new-instance v2, LEX1;

    invoke-virtual {p0}, Landroidx/camera/core/p;->k()Lyb0;

    move-result-object v3

    invoke-direct {v2, p2, v1, v3}, LEX1;-><init>(Landroidx/camera/core/impl/i;Landroid/util/Size;Lyb0;)V

    iput-object v2, p0, Landroidx/camera/core/h;->D:LEX1;

    iget-object v1, p0, Landroidx/camera/core/h;->E:LFY5;

    if-nez v1, :cond_1

    new-instance v1, LFY5;

    iget-object v2, p0, Landroidx/camera/core/h;->F:LeX1;

    invoke-direct {v1, v2}, LFY5;-><init>(LeX1;)V

    iput-object v1, p0, Landroidx/camera/core/h;->E:LFY5;

    :cond_1
    iget-object v1, p0, Landroidx/camera/core/h;->E:LFY5;

    iget-object v2, p0, Landroidx/camera/core/h;->D:LEX1;

    invoke-virtual {v1, v2}, LFY5;->m(LEX1;)V

    iget-object v1, p0, Landroidx/camera/core/h;->D:LEX1;

    invoke-virtual {p3}, LBR5;->c()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {v1, v2}, LEX1;->f(Landroid/util/Size;)Landroidx/camera/core/impl/q$b;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/camera/core/h;->o0()I

    move-result v2

    if-ne v2, v0, :cond_2

    invoke-virtual {p0}, Landroidx/camera/core/p;->g()Landroidx/camera/core/impl/CameraControlInternal;

    move-result-object v0

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/CameraControlInternal;->a(Landroidx/camera/core/impl/q$b;)V

    :cond_2
    new-instance v0, LVW1;

    invoke-direct {v0, p0, p1, p2, p3}, LVW1;-><init>(Landroidx/camera/core/h;Ljava/lang/String;Landroidx/camera/core/impl/i;LBR5;)V

    invoke-virtual {v1, v0}, Landroidx/camera/core/impl/q$b;->f(Landroidx/camera/core/impl/q$c;)Landroidx/camera/core/impl/q$b;

    return-object v1
.end method

.method public n0(Landroidx/camera/core/impl/l;)Z
    .locals 7

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v1, Landroidx/camera/core/impl/i;->L:Landroidx/camera/core/impl/f$a;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v1, v2}, Landroidx/camera/core/impl/f;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/camera/core/h;->x0()Z

    move-result v0

    const-string v4, "ImageCapture"

    if-eqz v0, :cond_0

    const-string v0, "Software JPEG cannot be used with Extensions."

    invoke-static {v4, v0}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v3

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    sget-object v5, Landroidx/camera/core/impl/i;->I:Landroidx/camera/core/impl/f$a;

    const/4 v6, 0x0

    invoke-interface {p1, v5, v6}, Landroidx/camera/core/impl/f;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x100

    if-eq v5, v6, :cond_1

    const-string v0, "Software JPEG cannot be used with non-JPEG output buffer format."

    invoke-static {v4, v0}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    if-nez v3, :cond_2

    const-string v0, "Unable to support software JPEG. Disabling."

    invoke-static {v4, v0}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v1, v2}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    :cond_2
    return v3
.end method

.method public o0()I
    .locals 1

    iget v0, p0, Landroidx/camera/core/h;->q:I

    return v0
.end method

.method public q0()I
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/h;->r:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Landroidx/camera/core/h;->t:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/i;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/i;->U(I)I

    move-result v1

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final r0(LLb0;Z)I
    .locals 2

    if-eqz p2, :cond_2

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->o(LLb0;)I

    move-result p1

    invoke-virtual {p0}, Landroidx/camera/core/p;->e()Landroid/util/Size;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroidx/camera/core/p;->v()Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/core/h;->u:Landroid/util/Rational;

    invoke-static {v0, v1, p1, p2, p1}, Landroidx/camera/core/h;->k0(Landroid/graphics/Rect;Landroid/util/Rational;ILandroid/util/Size;I)Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    invoke-static {v0, p2, v1, p1}, Landroidx/camera/core/internal/utils/ImageUtil;->n(IIII)Z

    move-result p1

    if-eqz p1, :cond_1

    iget p1, p0, Landroidx/camera/core/h;->q:I

    if-nez p1, :cond_0

    const/16 p1, 0x64

    goto :goto_0

    :cond_0
    const/16 p1, 0x5f

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/camera/core/h;->s0()I

    move-result p1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroidx/camera/core/h;->s0()I

    move-result p1

    :goto_0
    return p1
.end method

.method public s()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final s0()I
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/i;

    sget-object v1, Landroidx/camera/core/impl/i;->N:Landroidx/camera/core/impl/f$a;

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/p;->e(Landroidx/camera/core/impl/f$a;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/impl/i;->Y()I

    move-result v0

    return v0

    :cond_0
    iget v0, p0, Landroidx/camera/core/h;->q:I

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CaptureMode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/camera/core/h;->q:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " is invalid"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    const/16 v0, 0x5f

    return v0

    :cond_3
    const/16 v0, 0x64

    return v0
.end method

.method public final t0()Landroid/graphics/Rect;
    .locals 5

    invoke-virtual {p0}, Landroidx/camera/core/p;->v()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/camera/core/p;->e()Landroid/util/Size;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/h;->u:Landroid/util/Rational;

    invoke-static {v0}, Landroidx/camera/core/internal/utils/ImageUtil;->h(Landroid/util/Rational;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, LLb0;

    invoke-virtual {p0, v0}, Landroidx/camera/core/p;->o(LLb0;)I

    move-result v0

    new-instance v2, Landroid/util/Rational;

    iget-object v3, p0, Landroidx/camera/core/h;->u:Landroid/util/Rational;

    invoke-virtual {v3}, Landroid/util/Rational;->getDenominator()I

    move-result v3

    iget-object v4, p0, Landroidx/camera/core/h;->u:Landroid/util/Rational;

    invoke-virtual {v4}, Landroid/util/Rational;->getNumerator()I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/util/Rational;-><init>(II)V

    invoke-static {v0}, Lp96;->g(I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Landroidx/camera/core/h;->u:Landroid/util/Rational;

    :goto_0
    invoke-static {v1, v2}, Landroidx/camera/core/internal/utils/ImageUtil;->a(Landroid/util/Size;Landroid/util/Rational;)Landroid/graphics/Rect;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_2
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v2, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImageCapture:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/camera/core/p;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/s$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/f;",
            ")",
            "Landroidx/camera/core/impl/s$a<",
            "***>;"
        }
    .end annotation

    invoke-static {p1}, Landroidx/camera/core/h$g;->f(Landroidx/camera/core/impl/f;)Landroidx/camera/core/h$g;

    move-result-object p1

    return-object p1
.end method

.method public u0()I
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/core/p;->t()I

    move-result v0

    return v0
.end method

.method public final w0()Z
    .locals 4

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/i;

    invoke-virtual {v0}, Landroidx/camera/core/impl/i;->W()LLX1;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/h;->x0()Z

    move-result v1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    const/16 v1, 0x100

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroidx/camera/core/impl/i;->R(Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v0, v1, :cond_2

    return v2

    :cond_2
    iget-boolean v0, p0, Landroidx/camera/core/h;->n:Z

    return v0
.end method

.method public final x0()Z
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v0

    invoke-interface {v0}, LLb0;->l()Landroidx/camera/core/impl/c;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Landroidx/camera/core/impl/c;->Q(Lyv5;)Lyv5;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public y0(Landroidx/camera/core/h$i;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/h$i;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-string v0, "ImageCapture"

    const-string v1, "issueTakePicture"

    invoke-static {v0, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Landroidx/camera/core/impl/d$a;

    invoke-direct {v0}, Landroidx/camera/core/impl/d$a;-><init>()V

    iget-object v1, p0, Landroidx/camera/core/h;->v:Landroidx/camera/core/impl/d;

    invoke-virtual {v1}, Landroidx/camera/core/impl/d;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/d$a;->s(I)V

    iget-object v1, p0, Landroidx/camera/core/h;->v:Landroidx/camera/core/impl/d;

    invoke-virtual {v1}, Landroidx/camera/core/impl/d;->e()Landroidx/camera/core/impl/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/d$a;->e(Landroidx/camera/core/impl/f;)V

    iget-object v1, p0, Landroidx/camera/core/h;->x:Landroidx/camera/core/impl/q$b;

    invoke-virtual {v1}, Landroidx/camera/core/impl/q$b;->p()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/d$a;->a(Ljava/util/Collection;)V

    iget-object v1, p0, Landroidx/camera/core/h;->A:Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/d$a;->f(Landroidx/camera/core/impl/DeferrableSurface;)V

    invoke-virtual {p0}, Landroidx/camera/core/p;->l()I

    move-result v1

    const/16 v2, 0x100

    if-ne v1, v2, :cond_1

    sget-object v1, Landroidx/camera/core/h;->H:Lci1;

    invoke-virtual {v1}, Lci1;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Landroidx/camera/core/impl/d;->i:Landroidx/camera/core/impl/f$a;

    iget v2, p1, Landroidx/camera/core/h$i;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/camera/core/impl/d$a;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    :cond_0
    sget-object v1, Landroidx/camera/core/impl/d;->j:Landroidx/camera/core/impl/f$a;

    iget p1, p1, Landroidx/camera/core/h$i;->b:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroidx/camera/core/impl/d$a;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    :cond_1
    iget-object p1, p0, Landroidx/camera/core/h;->z:Lpa0;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/d$a;->c(Lpa0;)V

    const/4 p1, 0x1

    new-array p1, p1, [Landroidx/camera/core/impl/d;

    const/4 v1, 0x0

    invoke-virtual {v0}, Landroidx/camera/core/impl/d$a;->h()Landroidx/camera/core/impl/d;

    move-result-object v0

    aput-object v0, p1, v1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/h;->Q0(Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
