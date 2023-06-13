.class public final LHs4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltp6;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LHs4$j;,
        LHs4$i;,
        LHs4$g;,
        LHs4$h;
    }
.end annotation


# static fields
.field public static final c0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LHs4$j;",
            ">;"
        }
    .end annotation
.end field

.field public static final d0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LHs4$j;",
            ">;"
        }
    .end annotation
.end field

.field public static final e0:LRc4;

.field public static final f0:Lwp6;

.field public static final g0:LFP2;

.field public static final h0:Ljava/lang/Exception;

.field public static final i0:Lwb1;

.field public static final j0:Ljava/util/concurrent/Executor;


# instance fields
.field public final A:LHX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LHX2<",
            "LFP2;",
            ">;"
        }
    .end annotation
.end field

.field public B:Llb1;

.field public C:LRz3;

.field public D:Llb1;

.field public E:LRz3;

.field public F:LHs4$g;

.field public G:Landroid/net/Uri;

.field public H:J

.field public I:J

.field public J:J

.field public K:I

.field public L:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public M:J

.field public N:J

.field public O:J

.field public P:J

.field public Q:J

.field public R:I

.field public S:Ljava/lang/Throwable;

.field public T:Lgb1;

.field public final U:Lmb5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmb5<",
            "Lgb1;",
            ">;"
        }
    .end annotation
.end field

.field public V:Ljava/lang/Throwable;

.field public W:Z

.field public X:Ltp6$a;

.field public Y:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field public Z:Z

.field public final a:LHX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LHX2<",
            "LuR5;",
            ">;"
        }
    .end annotation
.end field

.field public a0:Lrp6;

.field public final b:Ljava/util/concurrent/Executor;

.field public b0:Lrp6;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:Lwb1;

.field public final f:Lwb1;

.field public final g:Ljava/lang/Object;

.field public final h:Z

.field public i:LHs4$j;

.field public j:LHs4$j;

.field public k:I

.field public l:LHs4$i;

.field public m:LHs4$i;

.field public n:J

.field public o:LHs4$i;

.field public p:Z

.field public q:Landroidx/camera/core/o$h;

.field public r:Lyp6;

.field public final s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end field

.field public t:Ljava/lang/Integer;

.field public u:Ljava/lang/Integer;

.field public v:Landroidx/camera/core/o;

.field public w:Lr46;

.field public x:Landroid/view/Surface;

.field public y:Landroid/view/Surface;

.field public z:Landroid/media/MediaMuxer;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    sget-object v0, LHs4$j;->c:LHs4$j;

    sget-object v1, LHs4$j;->d:LHs4$j;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LHs4;->c0:Ljava/util/Set;

    sget-object v0, LHs4$j;->b:LHs4$j;

    sget-object v1, LHs4$j;->e:LHs4$j;

    sget-object v2, LHs4$j;->i:LHs4$j;

    sget-object v3, LHs4$j;->h:LHs4$j;

    sget-object v4, LHs4$j;->j:LHs4$j;

    invoke-static {v0, v1, v2, v3, v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LHs4;->d0:Ljava/util/Set;

    const/4 v0, 0x3

    new-array v0, v0, [Lzb4;

    sget-object v1, Lzb4;->c:Lzb4;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v2, 0x1

    sget-object v3, Lzb4;->b:Lzb4;

    aput-object v3, v0, v2

    const/4 v2, 0x2

    sget-object v3, Lzb4;->a:Lzb4;

    aput-object v3, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v1}, LIj1;->a(Lzb4;)LIj1;

    move-result-object v1

    invoke-static {v0, v1}, LRc4;->e(Ljava/util/List;LIj1;)LRc4;

    move-result-object v0

    sput-object v0, LHs4;->e0:LRc4;

    invoke-static {}, Lwp6;->a()Lwp6$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lwp6$a;->e(LRc4;)Lwp6$a;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lwp6$a;->b(I)Lwp6$a;

    move-result-object v0

    invoke-virtual {v0}, Lwp6$a;->a()Lwp6;

    move-result-object v0

    sput-object v0, LHs4;->f0:Lwp6;

    invoke-static {}, LFP2;->a()LFP2$a;

    move-result-object v2

    invoke-virtual {v2, v1}, LFP2$a;->e(I)LFP2$a;

    move-result-object v1

    invoke-virtual {v1, v0}, LFP2$a;->f(Lwp6;)LFP2$a;

    move-result-object v0

    invoke-virtual {v0}, LFP2$a;->a()LFP2;

    move-result-object v0

    sput-object v0, LHs4;->g0:LFP2;

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "The video frame producer became inactive before any data was received."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    sput-object v0, LHs4;->h0:Ljava/lang/Exception;

    new-instance v0, Lys4;

    invoke-direct {v0}, Lys4;-><init>()V

    sput-object v0, LHs4;->i0:Lwb1;

    invoke-static {}, LAc0;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {v0}, LAc0;->f(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v0

    sput-object v0, LHs4;->j0:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;LFP2;Lwb1;Lwb1;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LHs4;->g:Ljava/lang/Object;

    const-class v0, Ljc1;

    invoke-static {v0}, LQ21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, LHs4;->h:Z

    sget-object v0, LHs4$j;->b:LHs4$j;

    iput-object v0, p0, LHs4;->i:LHs4$j;

    const/4 v0, 0x0

    iput-object v0, p0, LHs4;->j:LHs4$j;

    iput v2, p0, LHs4;->k:I

    iput-object v0, p0, LHs4;->l:LHs4$i;

    iput-object v0, p0, LHs4;->m:LHs4$i;

    const-wide/16 v3, 0x0

    iput-wide v3, p0, LHs4;->n:J

    iput-object v0, p0, LHs4;->o:LHs4$i;

    iput-boolean v2, p0, LHs4;->p:Z

    iput-object v0, p0, LHs4;->q:Landroidx/camera/core/o$h;

    iput-object v0, p0, LHs4;->r:Lyp6;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, LHs4;->s:Ljava/util/List;

    iput-object v0, p0, LHs4;->t:Ljava/lang/Integer;

    iput-object v0, p0, LHs4;->u:Ljava/lang/Integer;

    iput-object v0, p0, LHs4;->x:Landroid/view/Surface;

    iput-object v0, p0, LHs4;->y:Landroid/view/Surface;

    iput-object v0, p0, LHs4;->z:Landroid/media/MediaMuxer;

    iput-object v0, p0, LHs4;->B:Llb1;

    iput-object v0, p0, LHs4;->C:LRz3;

    iput-object v0, p0, LHs4;->D:Llb1;

    iput-object v0, p0, LHs4;->E:LRz3;

    sget-object v5, LHs4$g;->b:LHs4$g;

    iput-object v5, p0, LHs4;->F:LHs4$g;

    sget-object v5, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object v5, p0, LHs4;->G:Landroid/net/Uri;

    iput-wide v3, p0, LHs4;->H:J

    iput-wide v3, p0, LHs4;->I:J

    const-wide v5, 0x7fffffffffffffffL

    iput-wide v5, p0, LHs4;->J:J

    iput v2, p0, LHs4;->K:I

    iput-object v0, p0, LHs4;->L:Landroid/util/Range;

    iput-wide v5, p0, LHs4;->M:J

    iput-wide v5, p0, LHs4;->N:J

    iput-wide v5, p0, LHs4;->O:J

    iput-wide v3, p0, LHs4;->P:J

    iput-wide v3, p0, LHs4;->Q:J

    iput v1, p0, LHs4;->R:I

    iput-object v0, p0, LHs4;->S:Ljava/lang/Throwable;

    iput-object v0, p0, LHs4;->T:Lgb1;

    new-instance v1, Lwo;

    const/16 v3, 0x3c

    invoke-direct {v1, v3}, Lwo;-><init>(I)V

    iput-object v1, p0, LHs4;->U:Lmb5;

    iput-object v0, p0, LHs4;->V:Ljava/lang/Throwable;

    iput-boolean v2, p0, LHs4;->W:Z

    sget-object v1, Ltp6$a;->d:Ltp6$a;

    iput-object v1, p0, LHs4;->X:Ltp6$a;

    iput-object v0, p0, LHs4;->Y:Ljava/util/concurrent/ScheduledFuture;

    iput-boolean v2, p0, LHs4;->Z:Z

    iput-object v0, p0, LHs4;->b0:Lrp6;

    iput-object p1, p0, LHs4;->b:Ljava/util/concurrent/Executor;

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, LAc0;->c()Ljava/util/concurrent/Executor;

    move-result-object p1

    :goto_1
    iput-object p1, p0, LHs4;->c:Ljava/util/concurrent/Executor;

    invoke-static {p1}, LAc0;->f(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, LHs4;->d:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, p2}, LHs4;->r(LFP2;)LFP2;

    move-result-object p2

    invoke-static {p2}, LHX2;->h(Ljava/lang/Object;)LHX2;

    move-result-object p2

    iput-object p2, p0, LHs4;->A:LHX2;

    iget p2, p0, LHs4;->k:I

    iget-object v1, p0, LHs4;->i:LHs4$j;

    invoke-virtual {p0, v1}, LHs4;->A(LHs4$j;)LuR5$a;

    move-result-object v1

    invoke-static {p2, v1}, LuR5;->c(ILuR5$a;)LuR5;

    move-result-object p2

    invoke-static {p2}, LHX2;->h(Ljava/lang/Object;)LHX2;

    move-result-object p2

    iput-object p2, p0, LHs4;->a:LHX2;

    iput-object p3, p0, LHs4;->e:Lwb1;

    iput-object p4, p0, LHs4;->f:Lwb1;

    new-instance p2, Lrp6;

    invoke-direct {p2, p3, v0, p1}, Lrp6;-><init>(Lwb1;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    iput-object p2, p0, LHs4;->a0:Lrp6;

    return-void
.end method

.method public static synthetic D(Lwp6$a;)V
    .locals 1

    sget-object v0, LHs4;->f0:Lwp6;

    invoke-virtual {v0}, Lwp6;->b()I

    move-result v0

    invoke-virtual {p0, v0}, Lwp6$a;->b(I)Lwp6$a;

    return-void
.end method

.method private synthetic E(Landroidx/camera/core/o$h;)V
    .locals 0

    iput-object p1, p0, LHs4;->q:Landroidx/camera/core/o$h;

    return-void
.end method

.method private synthetic F(LHs4$i;LO80$a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LHs4;->B:Llb1;

    new-instance v1, LHs4$c;

    invoke-direct {v1, p0, p2, p1}, LHs4$c;-><init>(LHs4;LO80$a;LHs4$i;)V

    iget-object p1, p0, LHs4;->d:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1, p1}, Llb1;->b(Lsb1;Ljava/util/concurrent/Executor;)V

    const-string p1, "videoEncodingFuture"

    return-object p1
.end method

.method private synthetic G(LO80$a;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, LHs4;->V:Ljava/lang/Throwable;

    if-nez v0, :cond_1

    instance-of v0, p2, Landroidx/camera/video/internal/encoder/EncodeException;

    if-eqz v0, :cond_0

    sget-object v0, LHs4$g;->f:LHs4$g;

    invoke-virtual {p0, v0}, LHs4;->d0(LHs4$g;)V

    goto :goto_0

    :cond_0
    sget-object v0, LHs4$g;->g:LHs4$g;

    invoke-virtual {p0, v0}, LHs4;->d0(LHs4$g;)V

    :goto_0
    iput-object p2, p0, LHs4;->V:Ljava/lang/Throwable;

    invoke-virtual {p0}, LHs4;->q0()V

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LO80$a;->c(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method private synthetic H(LHs4$i;LO80$a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance p1, Lxs4;

    invoke-direct {p1, p0, p2}, Lxs4;-><init>(LHs4;LO80$a;)V

    new-instance p2, LHs4$d;

    invoke-direct {p2, p0, p1}, LHs4$d;-><init>(LHs4;Lrz0;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private synthetic I(Ltp6$a;)V
    .locals 0

    invoke-virtual {p0, p1}, LHs4;->V(Ltp6$a;)V

    return-void
.end method

.method private synthetic J(Landroidx/camera/core/o;Lr46;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LHs4;->W(Landroidx/camera/core/o;Lr46;)V

    return-void
.end method

.method private synthetic K(Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, LHs4;->G:Landroid/net/Uri;

    return-void
.end method

.method private synthetic L(Landroidx/camera/core/o;Lr46;)V
    .locals 4

    invoke-virtual {p1}, Landroidx/camera/core/o;->q()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LHs4;->a0:Lrp6;

    invoke-virtual {v0, p1}, Lrp6;->n(Landroidx/camera/core/o;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lrp6;

    iget-object v1, p0, LHs4;->e:Lwb1;

    iget-object v2, p0, LHs4;->d:Ljava/util/concurrent/Executor;

    iget-object v3, p0, LHs4;->c:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2, v3}, Lrp6;-><init>(Lwb1;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    iget-object v1, p0, LHs4;->A:LHX2;

    invoke-virtual {p0, v1}, LHs4;->x(LGP5;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LFP2;

    iget-object v2, p0, LHs4;->r:Lyp6;

    invoke-virtual {v0, p1, p2, v1, v2}, Lrp6;->i(Landroidx/camera/core/o;Lr46;LFP2;Lyp6;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    iput-object v0, p0, LHs4;->a0:Lrp6;

    new-instance p2, LHs4$a;

    invoke-direct {p2, p0, v0}, LHs4$a;-><init>(LHs4;Lrp6;)V

    iget-object v0, p0, LHs4;->d:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, v0}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Ignore the SurfaceRequest "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " isServiced: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroidx/camera/core/o;->q()Z

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, " VideoEncoderSession: "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LHs4;->a0:Lrp6;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Recorder"

    invoke-static {p2, p1}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic M(Llb1;)V
    .locals 2

    const-string v0, "Recorder"

    const-string v1, "The source didn\'t become non-streaming before timeout. Waited 1000ms"

    invoke-static {v0, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-class v0, LtT0;

    invoke-static {v0}, LQ21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LHs4;->P(Llb1;)V

    :cond_0
    return-void
.end method

.method private synthetic N(Llb1;)V
    .locals 2

    iget-object v0, p0, LHs4;->d:Ljava/util/concurrent/Executor;

    new-instance v1, LFs4;

    invoke-direct {v1, p1}, LFs4;-><init>(Llb1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static P(Llb1;)V
    .locals 1

    instance-of v0, p0, LOb1;

    if-eqz v0, :cond_0

    check-cast p0, LOb1;

    invoke-virtual {p0}, LOb1;->f0()V

    :cond_0
    return-void
.end method

.method public static synthetic f(LHs4;Landroidx/camera/core/o;Lr46;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LHs4;->J(Landroidx/camera/core/o;Lr46;)V

    return-void
.end method

.method public static synthetic g(LHs4;Llb1;)V
    .locals 0

    invoke-direct {p0, p1}, LHs4;->N(Llb1;)V

    return-void
.end method

.method public static synthetic h(Llb1;)V
    .locals 0

    invoke-static {p0}, LHs4;->M(Llb1;)V

    return-void
.end method

.method public static synthetic i(LHs4;LHs4$i;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LHs4;->F(LHs4$i;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lwp6$a;)V
    .locals 0

    invoke-static {p0}, LHs4;->D(Lwp6$a;)V

    return-void
.end method

.method public static synthetic k(LHs4;Ltp6$a;)V
    .locals 0

    invoke-direct {p0, p1}, LHs4;->I(Ltp6$a;)V

    return-void
.end method

.method public static synthetic l(LHs4;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0, p1}, LHs4;->K(Landroid/net/Uri;)V

    return-void
.end method

.method public static synthetic m(LHs4;Landroidx/camera/core/o;Lr46;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LHs4;->L(Landroidx/camera/core/o;Lr46;)V

    return-void
.end method

.method public static synthetic n(LHs4;LO80$a;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LHs4;->G(LO80$a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic o(LHs4;LHs4$i;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LHs4;->H(LHs4$i;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static o0(Lyp6;I)I
    .locals 3

    if-eqz p0, :cond_4

    invoke-interface {p0}, Llc1;->a()I

    move-result p0

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq p0, v2, :cond_2

    if-eq p0, v1, :cond_1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    return v0

    :cond_2
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p1, 0x1a

    if-ge p0, p1, :cond_3

    return v0

    :cond_3
    return v1

    :cond_4
    :goto_0
    return p1
.end method

.method public static synthetic p(LHs4;Landroidx/camera/core/o$h;)V
    .locals 0

    invoke-direct {p0, p1}, LHs4;->E(Landroidx/camera/core/o$h;)V

    return-void
.end method


# virtual methods
.method public final A(LHs4$j;)LuR5$a;
    .locals 2

    const-class v0, LtT0;

    invoke-static {v0}, LQ21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    check-cast v0, LtT0;

    sget-object v1, LHs4$j;->f:LHs4$j;

    if-eq p1, v1, :cond_1

    sget-object v1, LHs4$j;->h:LHs4$j;

    if-ne p1, v1, :cond_0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, LuR5$a;->c:LuR5$a;

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p1, LuR5$a;->b:LuR5$a;

    :goto_1
    return-object p1
.end method

.method public B()Z
    .locals 2

    iget-object v0, p0, LHs4;->F:LHs4$g;

    sget-object v1, LHs4$g;->e:LHs4$g;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public C()Z
    .locals 1

    iget-object v0, p0, LHs4;->A:LHX2;

    invoke-virtual {p0, v0}, LHs4;->x(LGP5;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFP2;

    invoke-virtual {v0}, LFP2;->b()LFp;

    move-result-object v0

    invoke-virtual {v0}, LFp;->c()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final O(LHs4$j;)LHs4$i;
    .locals 2

    sget-object v0, LHs4$j;->d:LHs4$j;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    sget-object v0, LHs4$j;->c:LHs4$j;

    if-ne p1, v0, :cond_4

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, LHs4;->l:LHs4$i;

    if-nez v0, :cond_3

    iget-object v0, p0, LHs4;->m:LHs4$i;

    if-eqz v0, :cond_2

    iput-object v0, p0, LHs4;->l:LHs4$i;

    const/4 v1, 0x0

    iput-object v1, p0, LHs4;->m:LHs4$i;

    if-eqz p1, :cond_1

    sget-object p1, LHs4$j;->g:LHs4$j;

    invoke-virtual {p0, p1}, LHs4;->f0(LHs4$j;)V

    goto :goto_1

    :cond_1
    sget-object p1, LHs4$j;->f:LHs4$j;

    invoke-virtual {p0, p1}, LHs4;->f0(LHs4$j;)V

    :goto_1
    return-object v0

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Pending recording should exist when in a PENDING state."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Cannot make pending recording active because another recording is already active."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "makePendingRecordingActiveLocked() can only be called from a pending state."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public Q()V
    .locals 6

    iget-object v0, p0, LHs4;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LHs4$f;->a:[I

    iget-object v2, p0, LHs4;->i:LHs4$j;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const-string v1, "Recorder"

    const-string v4, "onConfigured() was invoked when the Recorder had encountered error"

    invoke-static {v1, v4}, LJx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_1
    sget-object v1, LHs4$j;->e:LHs4$j;

    invoke-virtual {p0, v1}, LHs4;->f0(LHs4$j;)V

    goto :goto_1

    :pswitch_2
    iget-boolean v1, p0, LHs4;->h:Z

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    const-string v2, "Unexpectedly invoke onConfigured() in a STOPPING state when it\'s not waiting for a new surface."

    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :pswitch_3
    move v1, v3

    goto :goto_0

    :pswitch_4
    const/4 v1, 0x1

    :goto_0
    iget-object v4, p0, LHs4;->l:LHs4$i;

    if-eqz v4, :cond_1

    move-object v4, v2

    move v5, v3

    goto :goto_2

    :cond_1
    iget-object v4, p0, LHs4;->X:Ltp6$a;

    sget-object v5, Ltp6$a;->d:Ltp6$a;

    if-ne v4, v5, :cond_2

    iget-object v3, p0, LHs4;->m:LHs4$i;

    iput-object v2, p0, LHs4;->m:LHs4$i;

    invoke-virtual {p0}, LHs4;->b0()V

    sget-object v4, LHs4;->h0:Ljava/lang/Exception;

    const/4 v5, 0x4

    goto :goto_3

    :cond_2
    iget-object v4, p0, LHs4;->i:LHs4$j;

    invoke-virtual {p0, v4}, LHs4;->O(LHs4$j;)LHs4$i;

    move-result-object v4

    move v5, v3

    move-object v3, v2

    move-object v2, v4

    move-object v4, v3

    goto :goto_3

    :pswitch_5
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Incorrectly invoke onConfigured() in state "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LHs4;->i:LHs4$j;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :goto_1
    move-object v4, v2

    move v1, v3

    move v5, v1

    :goto_2
    move-object v3, v4

    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    invoke-virtual {p0, v2, v1}, LHs4;->m0(LHs4$i;Z)V

    goto :goto_4

    :cond_3
    if-eqz v3, :cond_4

    invoke-virtual {p0, v3, v5, v4}, LHs4;->u(LHs4$i;ILjava/lang/Throwable;)V

    :cond_4
    :goto_4
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_5
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_5
    .end packed-switch
.end method

.method public R(Ljava/lang/Throwable;)V
    .locals 4

    iget-object v0, p0, LHs4;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LHs4$f;->a:[I

    iget-object v2, p0, LHs4;->i:LHs4$j;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    iget-object v1, p0, LHs4;->m:LHs4$i;

    iput-object v2, p0, LHs4;->m:LHs4$i;

    move-object v2, v1

    :pswitch_2
    const/4 v1, -0x1

    invoke-virtual {p0, v1}, LHs4;->g0(I)V

    sget-object v1, LHs4$j;->j:LHs4$j;

    invoke-virtual {p0, v1}, LHs4;->f0(LHs4$j;)V

    goto :goto_0

    :pswitch_3
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Encountered encoder setup error while in unexpected state "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LHs4;->i:LHs4$j;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    const/4 v0, 0x7

    invoke-virtual {p0, v2, v0, p1}, LHs4;->u(LHs4$i;ILjava/lang/Throwable;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public S(LHs4$i;ILjava/lang/Throwable;)V
    .locals 9

    iget-object v0, p0, LHs4;->o:LHs4$i;

    if-ne p1, v0, :cond_2

    iget-object v0, p0, LHs4;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LHs4$f;->a:[I

    iget-object v2, p0, LHs4;->i:LHs4$j;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "In-progress recording error occurred while in unexpected state: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, LHs4;->i:LHs4$j;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_1
    sget-object v1, LHs4$j;->h:LHs4$j;

    invoke-virtual {p0, v1}, LHs4;->f0(LHs4$j;)V

    const/4 v1, 0x1

    move v2, v1

    :pswitch_2
    iget-object v1, p0, LHs4;->l:LHs4$i;

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Internal error occurred for recording but it is not the active recording."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    const-wide/16 v5, -0x1

    move-object v3, p0

    move-object v4, p1

    move v7, p2

    move-object v8, p3

    invoke-virtual/range {v3 .. v8}, LHs4;->n0(LHs4$i;JILjava/lang/Throwable;)V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Internal error occurred on recording that is not the current in-progress recording."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final T(LHs4$i;)V
    .locals 7

    iget-object v0, p0, LHs4;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LHs4;->l:LHs4$i;

    if-ne v1, p1, :cond_c

    const/4 p1, 0x0

    iput-object p1, p0, LHs4;->l:LHs4$i;

    sget-object v1, LHs4$f;->a:[I

    iget-object v2, p0, LHs4;->i:LHs4$j;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/16 v2, 0x9

    if-eq v1, v2, :cond_b

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_4

    :pswitch_0
    move-object v4, p1

    move v1, v3

    move v5, v1

    move v6, v5

    move v3, v2

    :goto_0
    move-object v2, v4

    goto/16 :goto_5

    :pswitch_1
    move v1, v3

    goto :goto_1

    :pswitch_2
    move v1, v2

    :goto_1
    iget-object v4, p0, LHs4;->X:Ltp6$a;

    sget-object v5, Ltp6$a;->d:Ltp6$a;

    if-ne v4, v5, :cond_0

    iget-object v2, p0, LHs4;->m:LHs4$i;

    iput-object p1, p0, LHs4;->m:LHs4$i;

    sget-object v4, LHs4$j;->b:LHs4$j;

    invoke-virtual {p0, v4}, LHs4;->f0(LHs4$j;)V

    sget-object v4, LHs4;->h0:Ljava/lang/Exception;

    const/4 v5, 0x4

    move v6, v1

    move v1, v3

    goto/16 :goto_5

    :cond_0
    iget-boolean v4, p0, LHs4;->h:Z

    if-eqz v4, :cond_2

    iput-object p1, p0, LHs4;->y:Landroid/view/Surface;

    iget-object v4, p0, LHs4;->v:Landroidx/camera/core/o;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroidx/camera/core/o;->q()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    move v2, v3

    :goto_2
    sget-object v4, LHs4$j;->b:LHs4$j;

    invoke-virtual {p0, v4}, LHs4;->r0(LHs4$j;)V

    move-object v4, p1

    move v6, v1

    move v1, v2

    move v5, v3

    goto :goto_0

    :cond_2
    iget-object v2, p0, LHs4;->B:Llb1;

    if-eqz v2, :cond_3

    iget-object v2, p0, LHs4;->i:LHs4$j;

    invoke-virtual {p0, v2}, LHs4;->O(LHs4$j;)LHs4$i;

    move-result-object v2

    move-object v4, p1

    move v6, v1

    move v1, v3

    move v5, v1

    move-object p1, v2

    goto :goto_0

    :cond_3
    move-object v2, p1

    move-object v4, v2

    move v6, v1

    move v1, v3

    move v5, v1

    goto :goto_5

    :pswitch_3
    iget-boolean v1, p0, LHs4;->h:Z

    if-eqz v1, :cond_5

    iput-object p1, p0, LHs4;->y:Landroid/view/Surface;

    iget-object v1, p0, LHs4;->v:Landroidx/camera/core/o;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroidx/camera/core/o;->q()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    move v2, v3

    :goto_3
    sget-object v1, LHs4$j;->b:LHs4$j;

    invoke-virtual {p0, v1}, LHs4;->f0(LHs4$j;)V

    move-object v4, p1

    move v1, v2

    move v5, v3

    move v6, v5

    goto :goto_0

    :cond_5
    sget-object v1, LHs4$j;->e:LHs4$j;

    invoke-virtual {p0, v1}, LHs4;->f0(LHs4$j;)V

    :goto_4
    move-object v2, p1

    move-object v4, v2

    move v1, v3

    move v5, v1

    move v6, v5

    :goto_5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_6

    iget-object p1, p0, LHs4;->v:Landroidx/camera/core/o;

    iget-object v0, p0, LHs4;->w:Lr46;

    invoke-virtual {p0, p1, v0}, LHs4;->s(Landroidx/camera/core/o;Lr46;)V

    goto :goto_6

    :cond_6
    if-eqz v3, :cond_7

    invoke-virtual {p0}, LHs4;->a0()V

    goto :goto_6

    :cond_7
    if-eqz p1, :cond_9

    iget-boolean v0, p0, LHs4;->h:Z

    if-nez v0, :cond_8

    invoke-virtual {p0, p1, v6}, LHs4;->m0(LHs4$i;Z)V

    goto :goto_6

    :cond_8
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Attempt to start a pending recording while the Recorder is waiting for a new surface request."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_9
    if-eqz v2, :cond_a

    invoke-virtual {p0, v2, v5, v4}, LHs4;->u(LHs4$i;ILjava/lang/Throwable;)V

    :cond_a
    :goto_6
    return-void

    :cond_b
    :try_start_1
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected state on finalize of recording: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LHs4;->i:LHs4$j;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/AssertionError;

    const-string v1, "Active recording did not match finalized recording on finalize."

    invoke-direct {p1, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public final U()V
    .locals 3

    iget-object v0, p0, LHs4;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LHs4$f;->a:[I

    iget-object v2, p0, LHs4;->i:LHs4$j;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    sget-object v1, LHs4$j;->b:LHs4$j;

    invoke-virtual {p0, v1}, LHs4;->r0(LHs4$j;)V

    goto :goto_0

    :pswitch_2
    sget-object v1, LHs4$j;->b:LHs4$j;

    invoke-virtual {p0, v1}, LHs4;->f0(LHs4$j;)V

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    iput-boolean v0, p0, LHs4;->Z:Z

    iget-object v0, p0, LHs4;->v:Landroidx/camera/core/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/o;->q()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LHs4;->v:Landroidx/camera/core/o;

    iget-object v1, p0, LHs4;->w:Lr46;

    invoke-virtual {p0, v0, v1}, LHs4;->s(Landroidx/camera/core/o;Lr46;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public V(Ltp6$a;)V
    .locals 3

    iget-object v0, p0, LHs4;->X:Ltp6$a;

    iput-object p1, p0, LHs4;->X:Ltp6$a;

    const-string v1, "Recorder"

    if-eq v0, p1, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Video source has transitioned to state: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Ltp6$a;->d:Ltp6$a;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, LHs4;->y:Landroid/view/Surface;

    const/4 v0, 0x0

    const/4 v1, 0x4

    if-nez p1, :cond_0

    invoke-virtual {p0, v1, v0}, LHs4;->Z(ILjava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, LHs4;->Z:Z

    iget-object p1, p0, LHs4;->o:LHs4$i;

    if-eqz p1, :cond_2

    invoke-virtual {p0, p1, v1, v0}, LHs4;->S(LHs4$i;ILjava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    sget-object v0, Ltp6$a;->c:Ltp6$a;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, LHs4;->Y:Ljava/util/concurrent/ScheduledFuture;

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LHs4;->B:Llb1;

    if-eqz p1, :cond_2

    invoke-static {p1}, LHs4;->P(Llb1;)V

    :cond_2
    :goto_0
    return-void

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Video source transitions to the same state: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final W(Landroidx/camera/core/o;Lr46;)V
    .locals 1

    iget-object v0, p0, LHs4;->v:Landroidx/camera/core/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/o;->q()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LHs4;->v:Landroidx/camera/core/o;

    invoke-virtual {v0}, Landroidx/camera/core/o;->D()Z

    :cond_0
    iput-object p1, p0, LHs4;->v:Landroidx/camera/core/o;

    iput-object p2, p0, LHs4;->w:Lr46;

    invoke-virtual {p0, p1, p2}, LHs4;->s(Landroidx/camera/core/o;Lr46;)V

    return-void
.end method

.method public X(Lrp6;)V
    .locals 2

    invoke-virtual {p1}, Lrp6;->m()Llb1;

    move-result-object v0

    iput-object v0, p0, LHs4;->B:Llb1;

    invoke-interface {v0}, Llb1;->a()Lhc1;

    move-result-object v0

    check-cast v0, Lhp6;

    invoke-interface {v0}, Lhp6;->b()Landroid/util/Range;

    move-result-object v0

    iput-object v0, p0, LHs4;->L:Landroid/util/Range;

    iget-object v0, p0, LHs4;->B:Llb1;

    invoke-interface {v0}, Llb1;->f()I

    move-result v0

    iput v0, p0, LHs4;->K:I

    invoke-virtual {p1}, Lrp6;->k()Landroid/view/Surface;

    move-result-object v0

    iput-object v0, p0, LHs4;->y:Landroid/view/Surface;

    invoke-virtual {p0, v0}, LHs4;->e0(Landroid/view/Surface;)V

    iget-object v0, p0, LHs4;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Lws4;

    invoke-direct {v1, p0}, Lws4;-><init>(LHs4;)V

    invoke-virtual {p1, v0, v1}, Lrp6;->v(Ljava/util/concurrent/Executor;Llb1$b$a;)V

    invoke-virtual {p1}, Lrp6;->l()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v1, LHs4$b;

    invoke-direct {v1, p0, p1}, LHs4$b;-><init>(LHs4;Lrp6;)V

    iget-object p1, p0, LHs4;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final Y(LHs4$i;)V
    .locals 2

    iget-object v0, p0, LHs4;->o:LHs4$i;

    if-ne v0, p1, :cond_1

    iget-boolean p1, p0, LHs4;->p:Z

    if-nez p1, :cond_1

    invoke-virtual {p0}, LHs4;->B()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LHs4;->D:Llb1;

    invoke-interface {p1}, Llb1;->pause()V

    :cond_0
    iget-object p1, p0, LHs4;->B:Llb1;

    invoke-interface {p1}, Llb1;->pause()V

    iget-object p1, p0, LHs4;->o:LHs4$i;

    invoke-virtual {p1}, LHs4$i;->i()LdA3;

    move-result-object v0

    invoke-virtual {p0}, LHs4;->w()LNs4;

    move-result-object v1

    invoke-static {v0, v1}, Lvp6;->d(LdA3;LNs4;)Lvp6$b;

    move-result-object v0

    invoke-virtual {p1, v0}, LHs4$i;->q(Lvp6;)V

    :cond_1
    return-void
.end method

.method public Z(ILjava/lang/Throwable;)V
    .locals 11

    iget-object v0, p0, LHs4;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LHs4$f;->a:[I

    iget-object v2, p0, LHs4;->i:LHs4$j;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    move v2, v3

    goto :goto_1

    :pswitch_1
    move v2, v3

    goto :goto_0

    :pswitch_2
    sget-object v1, LHs4$j;->i:LHs4$j;

    invoke-virtual {p0, v1}, LHs4;->r0(LHs4$j;)V

    goto :goto_1

    :pswitch_3
    iget-object v1, p0, LHs4;->l:LHs4$i;

    iget-object v4, p0, LHs4;->o:LHs4$i;

    if-ne v1, v4, :cond_0

    :goto_0
    sget-object v1, LHs4$j;->i:LHs4$j;

    invoke-virtual {p0, v1}, LHs4;->f0(LHs4$j;)V

    move v10, v3

    move v3, v2

    move v2, v10

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "In-progress recording does not match the active recording. Unable to reset encoder."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :goto_1
    :pswitch_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    invoke-virtual {p0}, LHs4;->a0()V

    goto :goto_2

    :cond_1
    if-eqz v3, :cond_2

    iget-object v5, p0, LHs4;->o:LHs4$i;

    const-wide/16 v6, -0x1

    move-object v4, p0

    move v8, p1

    move-object v9, p2

    invoke-virtual/range {v4 .. v9}, LHs4;->n0(LHs4$i;JILjava/lang/Throwable;)V

    :cond_2
    :goto_2
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public a(Landroidx/camera/core/o;)V
    .locals 1

    sget-object v0, Lr46;->b:Lr46;

    invoke-virtual {p0, p1, v0}, LHs4;->e(Landroidx/camera/core/o;Lr46;)V

    return-void
.end method

.method public final a0()V
    .locals 2

    iget-object v0, p0, LHs4;->D:Llb1;

    if-eqz v0, :cond_0

    const-string v0, "Recorder"

    const-string v1, "Releasing audio encoder."

    invoke-static {v0, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LHs4;->D:Llb1;

    invoke-interface {v0}, Llb1;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, LHs4;->D:Llb1;

    iput-object v0, p0, LHs4;->E:LRz3;

    :cond_0
    invoke-virtual {p0}, LHs4;->p0()V

    sget-object v0, LHs4$g;->b:LHs4$g;

    invoke-virtual {p0, v0}, LHs4;->d0(LHs4$g;)V

    invoke-virtual {p0}, LHs4;->U()V

    return-void
.end method

.method public b()LZd3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZd3<",
            "LFP2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LHs4;->A:LHX2;

    return-object v0
.end method

.method public final b0()V
    .locals 3

    sget-object v0, LHs4;->c0:Ljava/util/Set;

    iget-object v1, p0, LHs4;->i:LHs4$j;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LHs4;->j:LHs4$j;

    invoke-virtual {p0, v0}, LHs4;->f0(LHs4$j;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot restore non-pending state when in state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LHs4;->i:LHs4$j;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public c()LZd3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZd3<",
            "LuR5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LHs4;->a:LHX2;

    return-object v0
.end method

.method public final c0()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Try to safely release video encoder: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LHs4;->B:Llb1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Recorder"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LHs4;->a0:Lrp6;

    invoke-virtual {v0}, Lrp6;->w()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0
.end method

.method public d(Ltp6$a;)V
    .locals 2

    iget-object v0, p0, LHs4;->d:Ljava/util/concurrent/Executor;

    new-instance v1, LAs4;

    invoke-direct {v1, p0, p1}, LAs4;-><init>(LHs4;Ltp6$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d0(LHs4$g;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Transitioning audio state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LHs4;->F:LHs4$g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " --> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Recorder"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, LHs4;->F:LHs4$g;

    return-void
.end method

.method public e(Landroidx/camera/core/o;Lr46;)V
    .locals 4

    iget-object v0, p0, LHs4;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "Recorder"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Surface is requested in state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LHs4;->i:LHs4$j;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", Current surface: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, LHs4;->k:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, LHs4;->i:LHs4$j;

    sget-object v2, LHs4$j;->j:LHs4$j;

    if-ne v1, v2, :cond_0

    sget-object v1, LHs4$j;->b:LHs4$j;

    invoke-virtual {p0, v1}, LHs4;->f0(LHs4$j;)V

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LHs4;->d:Ljava/util/concurrent/Executor;

    new-instance v1, LBs4;

    invoke-direct {v1, p0, p1, p2}, LBs4;-><init>(LHs4;Landroidx/camera/core/o;Lr46;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public e0(Landroid/view/Surface;)V
    .locals 1

    iget-object v0, p0, LHs4;->x:Landroid/view/Surface;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, LHs4;->x:Landroid/view/Surface;

    iget-object v0, p0, LHs4;->g:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, LHs4;->g0(I)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public f0(LHs4$j;)V
    .locals 3

    iget-object v0, p0, LHs4;->i:LHs4$j;

    if-eq v0, p1, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Transitioning Recorder internal state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LHs4;->i:LHs4$j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " --> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Recorder"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, LHs4;->c0:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v1, p0, LHs4;->i:LHs4$j;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, LHs4;->d0:Ljava/util/Set;

    iget-object v1, p0, LHs4;->i:LHs4$j;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LHs4;->i:LHs4$j;

    iput-object v0, p0, LHs4;->j:LHs4$j;

    invoke-virtual {p0, v0}, LHs4;->A(LHs4$j;)LuR5$a;

    move-result-object v2

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid state transition. Should not be transitioning to a PENDING state from state "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LHs4;->i:LHs4$j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    iget-object v0, p0, LHs4;->j:LHs4$j;

    if-eqz v0, :cond_2

    iput-object v2, p0, LHs4;->j:LHs4$j;

    :cond_2
    :goto_0
    iput-object p1, p0, LHs4;->i:LHs4$j;

    if-nez v2, :cond_3

    invoke-virtual {p0, p1}, LHs4;->A(LHs4$j;)LuR5$a;

    move-result-object v2

    :cond_3
    iget-object p1, p0, LHs4;->a:LHX2;

    iget v0, p0, LHs4;->k:I

    invoke-static {v0, v2}, LuR5;->c(ILuR5$a;)LuR5;

    move-result-object v0

    invoke-virtual {p1, v0}, LHX2;->g(Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Attempted to transition to state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", but Recorder is already in state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final g0(I)V
    .locals 2

    iget v0, p0, LHs4;->k:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Transitioning streamId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LHs4;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " --> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Recorder"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput p1, p0, LHs4;->k:I

    iget-object v0, p0, LHs4;->a:LHX2;

    iget-object v1, p0, LHs4;->i:LHs4$j;

    invoke-virtual {p0, v1}, LHs4;->A(LHs4$j;)LuR5$a;

    move-result-object v1

    invoke-static {p1, v1}, LuR5;->c(ILuR5$a;)LuR5;

    move-result-object p1

    invoke-virtual {v0, p1}, LHX2;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public h0(LHs4$i;)V
    .locals 9

    iget-object v0, p0, LHs4;->z:Landroid/media/MediaMuxer;

    if-nez v0, :cond_b

    invoke-virtual {p0}, LHs4;->B()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LHs4;->U:Lmb5;

    invoke-interface {v0}, Lmb5;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Audio is enabled but no audio sample is ready. Cannot start media muxer."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, LHs4;->T:Lgb1;

    if-eqz v0, :cond_a

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, LHs4;->T:Lgb1;

    invoke-interface {v0}, Lgb1;->q0()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, LHs4;->v(J)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0}, Lgb1;->size()J

    move-result-wide v3

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lgb1;

    invoke-interface {v6}, Lgb1;->size()J

    move-result-wide v6

    add-long/2addr v3, v6

    goto :goto_1

    :cond_2
    iget-wide v5, p0, LHs4;->P:J

    const-wide/16 v7, 0x0

    cmp-long v7, v5, v7

    if-eqz v7, :cond_3

    cmp-long v5, v3, v5

    if-lez v5, :cond_3

    const-string v2, "Recorder"

    const-string v5, "Initial data exceeds file size limit %d > %d"

    const/4 v6, 0x2

    new-array v7, v6, [Ljava/lang/Object;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v7, v4

    iget-wide v3, p0, LHs4;->P:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v7, v4

    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v6, v1}, LHs4;->S(LHs4$i;ILjava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lgb1;->close()V

    return-void

    :cond_3
    const/4 v1, 0x5

    :try_start_1
    iget-object v3, p0, LHs4;->A:LHX2;

    invoke-virtual {p0, v3}, LHs4;->x(LGP5;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LFP2;

    invoke-virtual {v3}, LFP2;->c()I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_4

    iget-object v3, p0, LHs4;->r:Lyp6;

    sget-object v4, LHs4;->g0:LFP2;

    invoke-virtual {v4}, LFP2;->c()I

    move-result v4

    invoke-static {v4}, LFP2;->g(I)I

    move-result v4

    invoke-static {v3, v4}, LHs4;->o0(Lyp6;I)I

    move-result v3

    goto :goto_2

    :cond_4
    invoke-virtual {v3}, LFP2;->c()I

    move-result v3

    invoke-static {v3}, LFP2;->g(I)I

    move-result v3

    :goto_2
    new-instance v4, Lus4;

    invoke-direct {v4, p0}, Lus4;-><init>(LHs4;)V

    invoke-virtual {p1, v3, v4}, LHs4$i;->p(ILrz0;)Landroid/media/MediaMuxer;

    move-result-object v3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v4, p0, LHs4;->q:Landroidx/camera/core/o$h;

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Landroidx/camera/core/o$h;->b()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/media/MediaMuxer;->setOrientationHint(I)V

    :cond_5
    invoke-virtual {p1}, LHs4$i;->i()LdA3;

    move-result-object v4

    invoke-virtual {v4}, LdA3;->c()Landroid/location/Location;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v4, :cond_6

    :try_start_3
    invoke-virtual {v4}, Landroid/location/Location;->getLatitude()D

    move-result-wide v5

    invoke-virtual {v4}, Landroid/location/Location;->getLongitude()D

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, LgD0;->a(DD)Landroid/util/Pair;

    move-result-object v4

    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Double;

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    double-to-float v5, v5

    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Double;

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    double-to-float v4, v6

    invoke-virtual {v3, v5, v4}, Landroid/media/MediaMuxer;->setLocation(FF)V
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_3

    :catch_0
    move-exception v2

    :try_start_4
    invoke-virtual {v3}, Landroid/media/MediaMuxer;->release()V

    invoke-virtual {p0, p1, v1, v2}, LHs4;->S(LHs4$i;ILjava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-interface {v0}, Lgb1;->close()V

    return-void

    :cond_6
    :goto_3
    :try_start_5
    iget-object v1, p0, LHs4;->C:LRz3;

    invoke-interface {v1}, LRz3;->a()Landroid/media/MediaFormat;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, LHs4;->u:Ljava/lang/Integer;

    invoke-virtual {p0}, LHs4;->B()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, LHs4;->E:LRz3;

    invoke-interface {v1}, LRz3;->a()Landroid/media/MediaFormat;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, LHs4;->t:Ljava/lang/Integer;

    :cond_7
    invoke-virtual {v3}, Landroid/media/MediaMuxer;->start()V

    iput-object v3, p0, LHs4;->z:Landroid/media/MediaMuxer;

    invoke-virtual {p0, v0, p1}, LHs4;->t0(Lgb1;LHs4$i;)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgb1;

    invoke-virtual {p0, v2, p1}, LHs4;->s0(Lgb1;LHs4$i;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_4

    :cond_8
    invoke-interface {v0}, Lgb1;->close()V

    return-void

    :catch_1
    move-exception v2

    :try_start_6
    invoke-virtual {p0, p1, v1, v2}, LHs4;->S(LHs4$i;ILjava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-interface {v0}, Lgb1;->close()V

    return-void

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_9

    :try_start_7
    invoke-interface {v0}, Lgb1;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_9
    :goto_5
    throw p1

    :cond_a
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Media muxer cannot be started without an encoded video frame."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Unable to set up media muxer when one already exists."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final i0(LHs4$i;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/video/internal/audio/AudioSourceAccessException;,
            Landroidx/camera/video/internal/encoder/InvalidConfigException;
        }
    .end annotation

    iget-object v0, p0, LHs4;->A:LHX2;

    invoke-virtual {p0, v0}, LHs4;->x(LGP5;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFP2;

    iget-object v1, p0, LHs4;->r:Lyp6;

    invoke-static {v0, v1}, Lxp;->c(LFP2;Lyp6;)LmU2;

    move-result-object v1

    sget-object v2, Lr46;->b:Lr46;

    invoke-virtual {v0}, LFP2;->b()LFp;

    move-result-object v0

    invoke-static {v1, v0}, Lxp;->d(LmU2;LFp;)LBp;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LHs4;->j0(LHs4$i;LBp;)LEp;

    const/4 p1, 0x0

    throw p1
.end method

.method public final j0(LHs4$i;LBp;)LEp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/video/internal/audio/AudioSourceAccessException;
        }
    .end annotation

    sget-object v0, LHs4;->j0:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, p2, v0}, LHs4$i;->n(LBp;Ljava/util/concurrent/Executor;)LEp;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final k0(Landroidx/camera/core/o;Lr46;)V
    .locals 2

    invoke-virtual {p0}, LHs4;->c0()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v1, LEs4;

    invoke-direct {v1, p0, p1, p2}, LEs4;-><init>(LHs4;Landroidx/camera/core/o;Lr46;)V

    iget-object p1, p0, LHs4;->d:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1, p1}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final l0(LHs4$i;)V
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    iget-object v0, p0, LHs4;->o:LHs4$i;

    if-nez v0, :cond_7

    invoke-virtual {p1}, LHs4$i;->i()LdA3;

    move-result-object v0

    invoke-virtual {v0}, LdA3;->b()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const-string v1, "Recorder"

    if-lez v0, :cond_0

    invoke-virtual {p1}, LHs4$i;->i()LdA3;

    move-result-object v0

    invoke-virtual {v0}, LdA3;->b()J

    move-result-wide v4

    long-to-double v4, v4

    const-wide v6, 0x3fee666666666666L    # 0.95

    mul-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    iput-wide v4, p0, LHs4;->P:J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "File size limit in bytes: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, LHs4;->P:J

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iput-wide v2, p0, LHs4;->P:J

    :goto_0
    invoke-virtual {p1}, LHs4$i;->i()LdA3;

    move-result-object v0

    invoke-virtual {v0}, LdA3;->a()J

    move-result-wide v4

    cmp-long v0, v4, v2

    if-lez v0, :cond_1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1}, LHs4$i;->i()LdA3;

    move-result-object v2

    invoke-virtual {v2}, LdA3;->a()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    iput-wide v2, p0, LHs4;->Q:J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Duration limit in nanoseconds: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, LHs4;->Q:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iput-wide v2, p0, LHs4;->Q:J

    :goto_1
    iput-object p1, p0, LHs4;->o:LHs4$i;

    sget-object v0, LHs4$f;->b:[I

    iget-object v2, p0, LHs4;->F:LHs4$g;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_0

    goto :goto_5

    :pswitch_0
    invoke-virtual {p1}, LHs4$i;->k()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, LHs4;->C()Z

    move-result v0

    if-eqz v0, :cond_3

    :try_start_0
    invoke-virtual {p0, p1}, LHs4;->i0(LHs4$i;)V

    sget-object v0, LHs4$g;->e:LHs4$g;

    invoke-virtual {p0, v0}, LHs4;->d0(LHs4$g;)V
    :try_end_0
    .catch Landroidx/camera/video/internal/audio/AudioSourceAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroidx/camera/video/internal/encoder/InvalidConfigException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    :goto_2
    const-string v2, "Unable to create audio resource with error: "

    invoke-static {v1, v2, v0}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    instance-of v1, v0, Landroidx/camera/video/internal/encoder/InvalidConfigException;

    if-eqz v1, :cond_2

    sget-object v1, LHs4$g;->f:LHs4$g;

    goto :goto_3

    :cond_2
    sget-object v1, LHs4$g;->g:LHs4$g;

    :goto_3
    invoke-virtual {p0, v1}, LHs4;->d0(LHs4$g;)V

    iput-object v0, p0, LHs4;->V:Ljava/lang/Throwable;

    goto :goto_5

    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "The Recorder doesn\'t support recording with audio"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_1
    invoke-virtual {p1}, LHs4$i;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, LHs4$g;->e:LHs4$g;

    goto :goto_4

    :cond_4
    sget-object v0, LHs4$g;->d:LHs4$g;

    :goto_4
    invoke-virtual {p0, v0}, LHs4;->d0(LHs4$g;)V

    goto :goto_5

    :pswitch_2
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Incorrectly invoke startInternal in audio state "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LHs4;->F:LHs4$g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_5
    :goto_5
    invoke-virtual {p0, p1}, LHs4;->y(LHs4$i;)V

    invoke-virtual {p0}, LHs4;->B()Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, LHs4;->B:Llb1;

    invoke-interface {p1}, Llb1;->start()V

    iget-object p1, p0, LHs4;->o:LHs4$i;

    invoke-virtual {p1}, LHs4$i;->i()LdA3;

    move-result-object v0

    invoke-virtual {p0}, LHs4;->w()LNs4;

    move-result-object v1

    invoke-static {v0, v1}, Lvp6;->e(LdA3;LNs4;)Lvp6$c;

    move-result-object v0

    invoke-virtual {p1, v0}, LHs4$i;->q(Lvp6;)V

    return-void

    :cond_6
    const/4 p1, 0x0

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Attempted to start a new recording while another was in progress."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final m0(LHs4$i;Z)V
    .locals 0

    invoke-virtual {p0, p1}, LHs4;->l0(LHs4$i;)V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, LHs4;->Y(LHs4$i;)V

    :cond_0
    return-void
.end method

.method public n0(LHs4$i;JILjava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, LHs4;->o:LHs4$i;

    if-ne v0, p1, :cond_3

    iget-boolean p1, p0, LHs4;->p:Z

    if-nez p1, :cond_3

    const/4 p1, 0x1

    iput-boolean p1, p0, LHs4;->p:Z

    iput p4, p0, LHs4;->R:I

    iput-object p5, p0, LHs4;->S:Ljava/lang/Throwable;

    invoke-virtual {p0}, LHs4;->B()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LHs4;->q()V

    iget-object p1, p0, LHs4;->D:Llb1;

    invoke-interface {p1, p2, p3}, Llb1;->stop(J)V

    :cond_0
    iget-object p1, p0, LHs4;->T:Lgb1;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lgb1;->close()V

    const/4 p1, 0x0

    iput-object p1, p0, LHs4;->T:Lgb1;

    :cond_1
    iget-object p1, p0, LHs4;->X:Ltp6$a;

    sget-object p4, Ltp6$a;->c:Ltp6$a;

    if-eq p1, p4, :cond_2

    iget-object p1, p0, LHs4;->B:Llb1;

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p4

    new-instance p5, LDs4;

    invoke-direct {p5, p0, p1}, LDs4;-><init>(LHs4;Llb1;)V

    const-wide/16 v0, 0x3e8

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p4, p5, v0, v1, p1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, LHs4;->Y:Ljava/util/concurrent/ScheduledFuture;

    goto :goto_0

    :cond_2
    iget-object p1, p0, LHs4;->B:Llb1;

    invoke-static {p1}, LHs4;->P(Llb1;)V

    :goto_0
    iget-object p1, p0, LHs4;->B:Llb1;

    invoke-interface {p1, p2, p3}, Llb1;->stop(J)V

    :cond_3
    return-void
.end method

.method public final p0()V
    .locals 2

    iget-object v0, p0, LHs4;->b0:Lrp6;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lrp6;->m()Llb1;

    move-result-object v0

    iget-object v1, p0, LHs4;->B:Llb1;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LHZ3;->i(Z)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Releasing video encoder: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LHs4;->B:Llb1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Recorder"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LHs4;->b0:Lrp6;

    invoke-virtual {v0}, Lrp6;->x()V

    const/4 v0, 0x0

    iput-object v0, p0, LHs4;->b0:Lrp6;

    iput-object v0, p0, LHs4;->B:Llb1;

    iput-object v0, p0, LHs4;->C:LRz3;

    invoke-virtual {p0, v0}, LHs4;->e0(Landroid/view/Surface;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LHs4;->c0()Lcom/google/common/util/concurrent/ListenableFuture;

    :goto_1
    return-void
.end method

.method public final q()V
    .locals 1

    :goto_0
    iget-object v0, p0, LHs4;->U:Lmb5;

    invoke-interface {v0}, Lmb5;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LHs4;->U:Lmb5;

    invoke-interface {v0}, Lmb5;->a()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public q0()V
    .locals 3

    iget-object v0, p0, LHs4;->o:LHs4$i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LHs4$i;->i()LdA3;

    move-result-object v1

    invoke-virtual {p0}, LHs4;->w()LNs4;

    move-result-object v2

    invoke-static {v1, v2}, Lvp6;->f(LdA3;LNs4;)Lvp6$d;

    move-result-object v1

    invoke-virtual {v0, v1}, LHs4$i;->q(Lvp6;)V

    :cond_0
    return-void
.end method

.method public final r(LFP2;)LFP2;
    .locals 2

    invoke-virtual {p1}, LFP2;->i()LFP2$a;

    move-result-object v0

    invoke-virtual {p1}, LFP2;->d()Lwp6;

    move-result-object p1

    invoke-virtual {p1}, Lwp6;->b()I

    move-result p1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    new-instance p1, Lzs4;

    invoke-direct {p1}, Lzs4;-><init>()V

    invoke-virtual {v0, p1}, LFP2$a;->b(Lrz0;)LFP2$a;

    :cond_0
    invoke-virtual {v0}, LFP2$a;->a()LFP2;

    move-result-object p1

    return-object p1
.end method

.method public final r0(LHs4$j;)V
    .locals 3

    sget-object v0, LHs4;->c0:Ljava/util/Set;

    iget-object v1, p0, LHs4;->i:LHs4$j;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LHs4;->d0:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LHs4;->j:LHs4$j;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, LHs4;->j:LHs4$j;

    iget-object v0, p0, LHs4;->a:LHX2;

    iget v1, p0, LHs4;->k:I

    invoke-virtual {p0, p1}, LHs4;->A(LHs4$j;)LuR5$a;

    move-result-object p1

    invoke-static {v1, p1}, LuR5;->c(ILuR5$a;)LuR5;

    move-result-object p1

    invoke-virtual {v0, p1}, LHX2;->g(Ljava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid state transition. State is not a valid non-pending state while in a pending state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Can only updated non-pending state from a pending state, but state is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LHs4;->i:LHs4$j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final s(Landroidx/camera/core/o;Lr46;)V
    .locals 6

    invoke-virtual {p1}, Landroidx/camera/core/o;->q()Z

    move-result v0

    const-string v1, "Recorder"

    if-eqz v0, :cond_0

    const-string p1, "Ignore the SurfaceRequest since it is already served."

    invoke-static {v1, p1}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, LHs4;->d:Ljava/util/concurrent/Executor;

    new-instance v2, LCs4;

    invoke-direct {v2, p0}, LCs4;-><init>(LHs4;)V

    invoke-virtual {p1, v0, v2}, Landroidx/camera/core/o;->B(Ljava/util/concurrent/Executor;Landroidx/camera/core/o$i;)V

    invoke-virtual {p1}, Landroidx/camera/core/o;->n()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/camera/core/o;->k()LLb0;

    move-result-object v2

    invoke-interface {v2}, LLb0;->b()LJb0;

    move-result-object v2

    invoke-static {v2}, LMo6;->d(LJb0;)LMo6;

    move-result-object v2

    invoke-virtual {v2, v0}, LMo6;->c(Landroid/util/Size;)Lzb4;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Using supported quality of "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " for surface size "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lzb4;->g:Lzb4;

    if-eq v3, v0, :cond_2

    invoke-virtual {v2, v3}, LMo6;->f(Lzb4;)Lyp6;

    move-result-object v0

    iput-object v0, p0, LHs4;->r:Lyp6;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Camera advertised available quality but did not produce EncoderProfiles  for advertised quality."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_2
    :goto_0
    invoke-virtual {p0, p1, p2}, LHs4;->k0(Landroidx/camera/core/o;Lr46;)V

    return-void
.end method

.method public s0(Lgb1;LHs4$i;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    iget-wide v2, v0, LHs4;->H:J

    invoke-interface/range {p1 .. p1}, Lgb1;->size()J

    move-result-wide v4

    add-long/2addr v2, v4

    iget-wide v4, v0, LHs4;->P:J

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    const/4 v9, 0x0

    const-string v10, "Recorder"

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x2

    if-eqz v8, :cond_0

    cmp-long v4, v2, v4

    if-lez v4, :cond_0

    new-array v4, v13, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v4, v12

    iget-wide v2, v0, LHs4;->P:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v4, v11

    const-string v2, "Reach file size limit %d > %d"

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v10, v2}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v13, v9}, LHs4;->S(LHs4$i;ILjava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-interface/range {p1 .. p1}, Lgb1;->q0()J

    move-result-wide v4

    iget-wide v14, v0, LHs4;->M:J

    const-wide v16, 0x7fffffffffffffffL

    cmp-long v8, v14, v16

    if-nez v8, :cond_1

    iput-wide v4, v0, LHs4;->M:J

    new-array v1, v13, [Ljava/lang/Object;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v1, v12

    iget-wide v6, v0, LHs4;->M:J

    invoke-static {v6, v7}, LhV0;->j(J)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v1, v11

    const-string v6, "First audio time: %d (%s)"

    invoke-static {v6, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    move-object/from16 v18, v10

    iget-wide v9, v0, LHs4;->J:J

    invoke-static {v9, v10, v14, v15}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    sub-long v9, v4, v9

    invoke-virtual {v8, v9, v10}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v9

    iget-wide v14, v0, LHs4;->O:J

    cmp-long v14, v14, v16

    if-eqz v14, :cond_2

    move v14, v11

    goto :goto_0

    :cond_2
    move v14, v12

    :goto_0
    const-string v15, "There should be a previous data for adjusting the duration."

    invoke-static {v14, v15}, LHZ3;->j(ZLjava/lang/String;)V

    iget-wide v14, v0, LHs4;->O:J

    sub-long v14, v4, v14

    invoke-virtual {v8, v14, v15}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v14

    add-long/2addr v9, v14

    iget-wide v14, v0, LHs4;->Q:J

    cmp-long v6, v14, v6

    if-eqz v6, :cond_3

    cmp-long v6, v9, v14

    if-lez v6, :cond_3

    new-array v2, v13, [Ljava/lang/Object;

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v12

    iget-wide v3, v0, LHs4;->Q:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v11

    const-string v3, "Audio data reaches duration limit %d > %d"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, v18

    invoke-static {v3, v2}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x9

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, LHs4;->S(LHs4$i;ILjava/lang/Throwable;)V

    return-void

    :cond_3
    :goto_1
    iget-object v1, v0, LHs4;->z:Landroid/media/MediaMuxer;

    iget-object v6, v0, LHs4;->t:Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-interface/range {p1 .. p1}, Lgb1;->j2()Ljava/nio/ByteBuffer;

    move-result-object v7

    invoke-interface/range {p1 .. p1}, Lgb1;->U()Landroid/media/MediaCodec$BufferInfo;

    move-result-object v8

    invoke-virtual {v1, v6, v7, v8}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    iput-wide v2, v0, LHs4;->H:J

    iput-wide v4, v0, LHs4;->O:J

    return-void
.end method

.method public t(ILjava/lang/Throwable;)V
    .locals 6

    iget-object v0, p0, LHs4;->o:LHs4$i;

    if-eqz v0, :cond_7

    iget-object v0, p0, LHs4;->z:Landroid/media/MediaMuxer;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {v0}, Landroid/media/MediaMuxer;->stop()V

    iget-object v0, p0, LHs4;->z:Landroid/media/MediaMuxer;

    invoke-virtual {v0}, Landroid/media/MediaMuxer;->release()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MediaMuxer failed to stop or release with error: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "Recorder"

    invoke-static {v3, v0}, LJx2;->c(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_0

    move p1, v1

    :cond_0
    :goto_0
    iput-object v2, p0, LHs4;->z:Landroid/media/MediaMuxer;

    goto :goto_1

    :cond_1
    if-nez p1, :cond_2

    const/16 p1, 0x8

    :cond_2
    :goto_1
    iget-object v0, p0, LHs4;->o:LHs4$i;

    iget-object v3, p0, LHs4;->G:Landroid/net/Uri;

    invoke-virtual {v0, v3}, LHs4$i;->c(Landroid/net/Uri;)V

    iget-object v0, p0, LHs4;->o:LHs4$i;

    invoke-virtual {v0}, LHs4$i;->i()LdA3;

    move-result-object v0

    invoke-virtual {p0}, LHs4;->w()LNs4;

    move-result-object v3

    iget-object v4, p0, LHs4;->G:Landroid/net/Uri;

    invoke-static {v4}, LfA3;->b(Landroid/net/Uri;)LfA3;

    move-result-object v4

    iget-object v5, p0, LHs4;->o:LHs4$i;

    if-nez p1, :cond_3

    invoke-static {v0, v3, v4}, Lvp6;->a(LdA3;LNs4;LfA3;)Lvp6$a;

    move-result-object p1

    goto :goto_2

    :cond_3
    invoke-static {v0, v3, v4, p1, p2}, Lvp6;->b(LdA3;LNs4;LfA3;ILjava/lang/Throwable;)Lvp6$a;

    move-result-object p1

    :goto_2
    invoke-virtual {v5, p1}, LHs4$i;->q(Lvp6;)V

    iget-object p1, p0, LHs4;->o:LHs4$i;

    iput-object v2, p0, LHs4;->o:LHs4$i;

    const/4 p2, 0x0

    iput-boolean p2, p0, LHs4;->p:Z

    iput-object v2, p0, LHs4;->t:Ljava/lang/Integer;

    iput-object v2, p0, LHs4;->u:Ljava/lang/Integer;

    iget-object p2, p0, LHs4;->s:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->clear()V

    sget-object p2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object p2, p0, LHs4;->G:Landroid/net/Uri;

    const-wide/16 v3, 0x0

    iput-wide v3, p0, LHs4;->H:J

    iput-wide v3, p0, LHs4;->I:J

    const-wide v3, 0x7fffffffffffffffL

    iput-wide v3, p0, LHs4;->J:J

    iput-wide v3, p0, LHs4;->M:J

    iput-wide v3, p0, LHs4;->N:J

    iput-wide v3, p0, LHs4;->O:J

    iput v1, p0, LHs4;->R:I

    iput-object v2, p0, LHs4;->S:Ljava/lang/Throwable;

    iput-object v2, p0, LHs4;->V:Ljava/lang/Throwable;

    invoke-virtual {p0}, LHs4;->q()V

    sget-object p2, LHs4$f;->b:[I

    iget-object v0, p0, LHs4;->F:LHs4$g;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p2, p2, v0

    if-eq p2, v1, :cond_6

    const/4 v0, 0x2

    if-eq p2, v0, :cond_6

    const/4 v0, 0x3

    if-eq p2, v0, :cond_5

    const/4 v0, 0x4

    if-eq p2, v0, :cond_5

    const/4 v0, 0x5

    if-eq p2, v0, :cond_4

    goto :goto_3

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Incorrectly finalize recording when audio state is IDLING"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_5
    sget-object p1, LHs4$g;->c:LHs4$g;

    invoke-virtual {p0, p1}, LHs4;->d0(LHs4$g;)V

    throw v2

    :cond_6
    sget-object p2, LHs4$g;->b:LHs4$g;

    invoke-virtual {p0, p2}, LHs4;->d0(LHs4$g;)V

    :goto_3
    invoke-virtual {p0, p1}, LHs4;->T(LHs4$i;)V

    return-void

    :cond_7
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Attempted to finalize in-progress recording, but no recording is in progress."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public t0(Lgb1;LHs4$i;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    iget-object v2, v0, LHs4;->u:Ljava/lang/Integer;

    if-eqz v2, :cond_4

    iget-wide v2, v0, LHs4;->H:J

    invoke-interface/range {p1 .. p1}, Lgb1;->size()J

    move-result-wide v4

    add-long/2addr v2, v4

    iget-wide v4, v0, LHs4;->P:J

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    const/4 v9, 0x0

    const-string v10, "Recorder"

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x2

    if-eqz v8, :cond_0

    cmp-long v4, v2, v4

    if-lez v4, :cond_0

    new-array v4, v13, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v4, v12

    iget-wide v2, v0, LHs4;->P:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v4, v11

    const-string v2, "Reach file size limit %d > %d"

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v10, v2}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v13, v9}, LHs4;->S(LHs4$i;ILjava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-interface/range {p1 .. p1}, Lgb1;->q0()J

    move-result-wide v4

    iget-wide v14, v0, LHs4;->J:J

    const-wide v16, 0x7fffffffffffffffL

    cmp-long v8, v14, v16

    if-nez v8, :cond_1

    iput-wide v4, v0, LHs4;->J:J

    new-array v1, v13, [Ljava/lang/Object;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v1, v12

    iget-wide v8, v0, LHs4;->J:J

    invoke-static {v8, v9}, LhV0;->j(J)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v1, v11

    const-string v8, "First video time: %d (%s)"

    invoke-static {v8, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    move-object/from16 v18, v10

    iget-wide v9, v0, LHs4;->M:J

    invoke-static {v14, v15, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    sub-long v9, v4, v9

    invoke-virtual {v8, v9, v10}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v9

    iget-wide v14, v0, LHs4;->N:J

    cmp-long v14, v14, v16

    if-eqz v14, :cond_2

    move v14, v11

    goto :goto_0

    :cond_2
    move v14, v12

    :goto_0
    const-string v15, "There should be a previous data for adjusting the duration."

    invoke-static {v14, v15}, LHZ3;->j(ZLjava/lang/String;)V

    iget-wide v14, v0, LHs4;->N:J

    sub-long v14, v4, v14

    invoke-virtual {v8, v14, v15}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v14

    add-long/2addr v14, v9

    iget-wide v11, v0, LHs4;->Q:J

    cmp-long v6, v11, v6

    if-eqz v6, :cond_3

    cmp-long v6, v14, v11

    if-lez v6, :cond_3

    new-array v2, v13, [Ljava/lang/Object;

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-wide v3, v0, LHs4;->Q:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, "Video data reaches duration limit %d > %d"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, v18

    invoke-static {v3, v2}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x9

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, LHs4;->S(LHs4$i;ILjava/lang/Throwable;)V

    return-void

    :cond_3
    move-wide v6, v9

    :goto_1
    iget-object v1, v0, LHs4;->z:Landroid/media/MediaMuxer;

    iget-object v8, v0, LHs4;->u:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-interface/range {p1 .. p1}, Lgb1;->j2()Ljava/nio/ByteBuffer;

    move-result-object v9

    invoke-interface/range {p1 .. p1}, Lgb1;->U()Landroid/media/MediaCodec$BufferInfo;

    move-result-object v10

    invoke-virtual {v1, v8, v9, v10}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    iput-wide v2, v0, LHs4;->H:J

    iput-wide v6, v0, LHs4;->I:J

    iput-wide v4, v0, LHs4;->N:J

    invoke-virtual/range {p0 .. p0}, LHs4;->q0()V

    return-void

    :cond_4
    new-instance v1, Ljava/lang/AssertionError;

    const-string v2, "Video data comes before the track is added to MediaMuxer."

    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public final u(LHs4$i;ILjava/lang/Throwable;)V
    .locals 4

    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {p1, v0}, LHs4$i;->c(Landroid/net/Uri;)V

    invoke-virtual {p1}, LHs4$i;->i()LdA3;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v2, p0, LHs4;->V:Ljava/lang/Throwable;

    invoke-static {v1, v2}, LGp;->c(ILjava/lang/Throwable;)LGp;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v2, v3, v1}, LNs4;->d(JJLGp;)LNs4;

    move-result-object v1

    sget-object v2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-static {v2}, LfA3;->b(Landroid/net/Uri;)LfA3;

    move-result-object v2

    invoke-static {v0, v1, v2, p2, p3}, Lvp6;->b(LdA3;LNs4;LfA3;ILjava/lang/Throwable;)Lvp6$a;

    move-result-object p2

    invoke-virtual {p1, p2}, LHs4$i;->q(Lvp6;)V

    return-void
.end method

.method public final v(J)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lgb1;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    :goto_0
    iget-object v1, p0, LHs4;->U:Lmb5;

    invoke-interface {v1}, Lmb5;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, LHs4;->U:Lmb5;

    invoke-interface {v1}, Lmb5;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgb1;

    invoke-interface {v1}, Lgb1;->q0()J

    move-result-wide v2

    cmp-long v2, v2, p1

    if-ltz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public w()LNs4;
    .locals 6

    iget-wide v0, p0, LHs4;->I:J

    iget-wide v2, p0, LHs4;->H:J

    iget-object v4, p0, LHs4;->F:LHs4$g;

    invoke-virtual {p0, v4}, LHs4;->z(LHs4$g;)I

    move-result v4

    iget-object v5, p0, LHs4;->V:Ljava/lang/Throwable;

    invoke-static {v4, v5}, LGp;->c(ILjava/lang/Throwable;)LGp;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, LNs4;->d(JJLGp;)LNs4;

    move-result-object v0

    return-object v0
.end method

.method public x(LGP5;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LGP5<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p1}, LGP5;->d()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final y(LHs4$i;)V
    .locals 2

    iget-object v0, p0, LHs4;->s:Ljava/util/List;

    new-instance v1, LGs4;

    invoke-direct {v1, p0, p1}, LGs4;-><init>(LHs4;LHs4$i;)V

    invoke-static {v1}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LHs4;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LHs4;->s:Ljava/util/List;

    new-instance v1, Lvs4;

    invoke-direct {v1, p0, p1}, Lvs4;-><init>(LHs4;LHs4$i;)V

    invoke-static {v1}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object p1, p0, LHs4;->s:Ljava/util/List;

    invoke-static {p1}, LIA1;->c(Ljava/util/Collection;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    new-instance v0, LHs4$e;

    invoke-direct {v0, p0}, LHs4$e;-><init>(LHs4;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-static {p1, v0, v1}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final z(LHs4$g;)I
    .locals 5

    sget-object v0, LHs4$f;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_5

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-eq v0, v4, :cond_4

    if-eq v0, v1, :cond_2

    if-eq v0, v3, :cond_1

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid internal audio state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    :goto_0
    return v2

    :cond_2
    iget-boolean p1, p0, LHs4;->W:Z

    if-eqz p1, :cond_3

    return v4

    :cond_3
    const/4 p1, 0x0

    return p1

    :cond_4
    return v3

    :cond_5
    return v1
.end method
