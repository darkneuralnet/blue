.class public LOb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llb1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LOb1$f;,
        LOb1$d;,
        LOb1$g;,
        LOb1$e;,
        LOb1$c;
    }
.end annotation


# static fields
.field public static final E:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public final D:Lxb1;

.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/Object;

.field public final c:Z

.field public final d:Landroid/media/MediaFormat;

.field public final e:Landroid/media/MediaCodec;

.field public final f:Llb1$a;

.field public final g:Lhc1;

.field public final h:Ljava/util/concurrent/Executor;

.field public final i:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final j:LO80$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LO80$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "LO80$a<",
            "LO22;",
            ">;>;"
        }
    .end annotation
.end field

.field public final m:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LO22;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lib1;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Landroid/util/Range<",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation
.end field

.field public final p:Lr46;

.field public final q:Ln46;

.field public r:Lsb1;

.field public s:Ljava/util/concurrent/Executor;

.field public t:LOb1$e;

.field public u:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public v:J

.field public w:Z

.field public x:Ljava/lang/Long;

.field public y:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field public z:LOb1$f;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0, v0}, Landroid/util/Range;->create(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;

    move-result-object v0

    sput-object v0, LOb1;->E:Landroid/util/Range;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lub1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/video/internal/encoder/InvalidConfigException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LOb1;->b:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, LOb1;->k:Ljava/util/Queue;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, LOb1;->l:Ljava/util/Queue;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LOb1;->m:Ljava/util/Set;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LOb1;->n:Ljava/util/Set;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, LOb1;->o:Ljava/util/Deque;

    new-instance v0, LlY5;

    invoke-direct {v0}, LlY5;-><init>()V

    iput-object v0, p0, LOb1;->q:Ln46;

    sget-object v0, Lsb1;->a:Lsb1;

    iput-object v0, p0, LOb1;->r:Lsb1;

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, LOb1;->s:Ljava/util/concurrent/Executor;

    sget-object v0, LOb1;->E:Landroid/util/Range;

    iput-object v0, p0, LOb1;->u:Landroid/util/Range;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LOb1;->v:J

    const/4 v0, 0x0

    iput-boolean v0, p0, LOb1;->w:Z

    const/4 v1, 0x0

    iput-object v1, p0, LOb1;->x:Ljava/lang/Long;

    iput-object v1, p0, LOb1;->y:Ljava/util/concurrent/Future;

    iput-object v1, p0, LOb1;->z:LOb1$f;

    iput-boolean v0, p0, LOb1;->A:Z

    iput-boolean v0, p0, LOb1;->B:Z

    iput-boolean v0, p0, LOb1;->C:Z

    new-instance v1, Lxb1;

    invoke-direct {v1}, Lxb1;-><init>()V

    iput-object v1, p0, LOb1;->D:Lxb1;

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LAc0;->f(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    iput-object p1, p0, LOb1;->h:Ljava/util/concurrent/Executor;

    instance-of p1, p2, Lyp;

    if-eqz p1, :cond_0

    const-string p1, "AudioEncoder"

    iput-object p1, p0, LOb1;->a:Ljava/lang/String;

    iput-boolean v0, p0, LOb1;->c:Z

    new-instance p1, LOb1$d;

    invoke-direct {p1, p0}, LOb1$d;-><init>(LOb1;)V

    iput-object p1, p0, LOb1;->f:Llb1$a;

    goto :goto_0

    :cond_0
    instance-of p1, p2, Ldp6;

    if-eqz p1, :cond_2

    const-string p1, "VideoEncoder"

    iput-object p1, p0, LOb1;->a:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, LOb1;->c:Z

    new-instance p1, LOb1$g;

    invoke-direct {p1, p0}, LOb1$g;-><init>(LOb1;)V

    iput-object p1, p0, LOb1;->f:Llb1$a;

    :goto_0
    invoke-interface {p2}, Lub1;->b()Lr46;

    move-result-object p1

    iput-object p1, p0, LOb1;->p:Lr46;

    iget-object v0, p0, LOb1;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mInputTimebase = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2}, Lub1;->c()Landroid/media/MediaFormat;

    move-result-object p1

    iput-object p1, p0, LOb1;->d:Landroid/media/MediaFormat;

    iget-object v0, p0, LOb1;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mMediaFormat = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lxb1;->a(Landroid/media/MediaFormat;)Landroid/media/MediaCodec;

    move-result-object v0

    iput-object v0, p0, LOb1;->e:Landroid/media/MediaCodec;

    iget-object v1, p0, LOb1;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Selected encoder: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, LJx2;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v1, p0, LOb1;->c:Z

    invoke-virtual {v0}, Landroid/media/MediaCodec;->getCodecInfo()Landroid/media/MediaCodecInfo;

    move-result-object v0

    invoke-interface {p2}, Lub1;->a()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, v0, p2}, LOb1;->y(ZLandroid/media/MediaCodecInfo;Ljava/lang/String;)Lhc1;

    move-result-object p2

    iput-object p2, p0, LOb1;->g:Lhc1;

    iget-boolean v0, p0, LOb1;->c:Z

    if-eqz v0, :cond_1

    check-cast p2, Lhp6;

    invoke-virtual {p0, p2, p1}, LOb1;->x(Lhp6;Landroid/media/MediaFormat;)V

    :cond_1
    :try_start_0
    invoke-virtual {p0}, LOb1;->a0()V
    :try_end_0
    .catch Landroid/media/MediaCodec$CodecException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance p2, LAb1;

    invoke-direct {p2, p1}, LAb1;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-static {p2}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p2

    invoke-static {p2}, LIA1;->j(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p2

    iput-object p2, p0, LOb1;->i:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO80$a;

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO80$a;

    iput-object p1, p0, LOb1;->j:LO80$a;

    sget-object p1, LOb1$e;->b:LOb1$e;

    invoke-virtual {p0, p1}, LOb1;->c0(LOb1$e;)V

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Landroidx/camera/video/internal/encoder/InvalidConfigException;

    invoke-direct {p2, p1}, Landroidx/camera/video/internal/encoder/InvalidConfigException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    new-instance p1, Landroidx/camera/video/internal/encoder/InvalidConfigException;

    const-string p2, "Unknown encoder config type"

    invoke-direct {p1, p2}, Landroidx/camera/video/internal/encoder/InvalidConfigException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static E(Landroid/media/MediaCodec$BufferInfo;)Z
    .locals 0

    iget p0, p0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 p0, p0, 0x4

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static G(Landroid/media/MediaCodec$BufferInfo;)Z
    .locals 1

    iget p0, p0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/4 v0, 0x1

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static synthetic H(Ljava/util/concurrent/atomic/AtomicReference;LO80$a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    const-string p0, "acquireInputBuffer"

    return-object p0
.end method

.method private synthetic I(LO80$a;)V
    .locals 1

    iget-object v0, p0, LOb1;->l:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private synthetic J(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LOb1;->X(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private synthetic K(LQ22;)V
    .locals 1

    iget-object v0, p0, LOb1;->m:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic L(Ljava/util/concurrent/atomic/AtomicReference;LO80$a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    const-string p0, "mReleasedFuture"

    return-object p0
.end method

.method public static synthetic M(Lsb1;ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    new-instance v0, Landroidx/camera/video/internal/encoder/EncodeException;

    invoke-direct {v0, p1, p2, p3}, Landroidx/camera/video/internal/encoder/EncodeException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p0, v0}, Lsb1;->d(Landroidx/camera/video/internal/encoder/EncodeException;)V

    return-void
.end method

.method private synthetic N(J)V
    .locals 3

    sget-object v0, LOb1$b;->a:[I

    iget-object v1, p0, LOb1;->t:LOb1$e;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LOb1;->t:LOb1$e;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Encoder is released"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    sget-object p1, LOb1$e;->g:LOb1$e;

    invoke-virtual {p0, p1}, LOb1;->c0(LOb1$e;)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, LOb1;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Pause on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, LhV0;->j(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LOb1;->o:Ljava/util/Deque;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-wide v1, 0x7fffffffffffffffL

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Range;->create(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Deque;->addLast(Ljava/lang/Object;)V

    sget-object p1, LOb1$e;->d:LOb1$e;

    invoke-virtual {p0, p1}, LOb1;->c0(LOb1$e;)V

    :goto_0
    :pswitch_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method private synthetic O()V
    .locals 3

    sget-object v0, LOb1$b;->a:[I

    iget-object v1, p0, LOb1;->t:LOb1$e;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LOb1;->t:LOb1$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object v0, LOb1$e;->h:LOb1$e;

    invoke-virtual {p0, v0}, LOb1;->c0(LOb1$e;)V

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, LOb1;->Y()V

    :goto_0
    :pswitch_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private synthetic P()V
    .locals 2

    sget-object v0, LOb1$b;->a:[I

    iget-object v1, p0, LOb1;->t:LOb1$e;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Encoder is released"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, LOb1;->Z()V

    :goto_0
    return-void
.end method

.method private synthetic Q()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LOb1;->B:Z

    iget-boolean v0, p0, LOb1;->A:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LOb1;->e:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    invoke-virtual {p0}, LOb1;->a0()V

    :cond_0
    return-void
.end method

.method private synthetic R(J)V
    .locals 7

    sget-object v0, LOb1$b;->a:[I

    iget-object v1, p0, LOb1;->t:LOb1$e;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const-wide v1, 0x7fffffffffffffffL

    const/4 v3, 0x0

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LOb1;->t:LOb1$e;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Encoder is released"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    sget-object p1, LOb1$e;->f:LOb1$e;

    invoke-virtual {p0, p1}, LOb1;->c0(LOb1$e;)V

    goto/16 :goto_2

    :pswitch_2
    iput-object v3, p0, LOb1;->x:Ljava/lang/Long;

    iget-object v0, p0, LOb1;->o:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->removeLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Range;

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v1, v5, v1

    if-nez v1, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    const-string v2, "There should be a \"pause\" before \"resume\""

    invoke-static {v1, v2}, LHZ3;->j(ZLjava/lang/String;)V

    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, LOb1;->o:Ljava/util/Deque;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Range;->create(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Deque;->addLast(Ljava/lang/Object;)V

    iget-object v2, p0, LOb1;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Resume on "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, LhV0;->j(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\nPaused duration = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-long/2addr p1, v0

    invoke-static {p1, p2}, LhV0;->j(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean p1, p0, LOb1;->c:Z

    if-nez p1, :cond_1

    const-class p1, Lzp;

    invoke-static {p1}, LQ21;->a(Ljava/lang/Class;)LSe4;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    iget-boolean p1, p0, LOb1;->c:Z

    if-eqz p1, :cond_2

    const-class p1, Lsp6;

    invoke-static {p1}, LQ21;->a(Ljava/lang/Class;)LSe4;

    move-result-object p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v3}, LOb1;->b0(Z)V

    iget-object p1, p0, LOb1;->f:Llb1$a;

    instance-of p2, p1, LOb1$d;

    if-eqz p2, :cond_3

    check-cast p1, LOb1$d;

    invoke-virtual {p1, v4}, LOb1$d;->q(Z)V

    :cond_3
    :goto_1
    iget-boolean p1, p0, LOb1;->c:Z

    if-eqz p1, :cond_4

    invoke-virtual {p0}, LOb1;->Z()V

    :cond_4
    sget-object p1, LOb1$e;->c:LOb1$e;

    invoke-virtual {p0, p1}, LOb1;->c0(LOb1$e;)V

    goto :goto_2

    :pswitch_3
    iput-object v3, p0, LOb1;->x:Ljava/lang/Long;

    iget-object v0, p0, LOb1;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Start on "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, LhV0;->j(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-boolean v0, p0, LOb1;->A:Z

    if-eqz v0, :cond_5

    invoke-virtual {p0}, LOb1;->a0()V

    :cond_5
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Range;->create(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;

    move-result-object p1

    iput-object p1, p0, LOb1;->u:Landroid/util/Range;

    iget-object p1, p0, LOb1;->e:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->start()V
    :try_end_0
    .catch Landroid/media/MediaCodec$CodecException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p1, p0, LOb1;->f:Llb1$a;

    instance-of p2, p1, LOb1$d;

    if-eqz p2, :cond_6

    check-cast p1, LOb1$d;

    invoke-virtual {p1, v4}, LOb1$d;->q(Z)V

    :cond_6
    sget-object p1, LOb1$e;->c:LOb1$e;

    invoke-virtual {p0, p1}, LOb1;->c0(LOb1$e;)V

    :goto_2
    :pswitch_4
    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, LOb1;->C(Landroid/media/MediaCodec$CodecException;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_4
        :pswitch_0
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method private synthetic S()V
    .locals 2

    iget-boolean v0, p0, LOb1;->w:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LOb1;->a:Ljava/lang/String;

    const-string v1, "The data didn\'t reach the expected timestamp before timeout, stop the codec."

    invoke-static {v0, v1}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, LOb1;->x:Ljava/lang/Long;

    invoke-virtual {p0}, LOb1;->d0()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LOb1;->w:Z

    :cond_0
    return-void
.end method

.method private synthetic T()V
    .locals 2

    iget-object v0, p0, LOb1;->h:Ljava/util/concurrent/Executor;

    new-instance v1, LDb1;

    invoke-direct {v1, p0}, LDb1;-><init>(LOb1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic U(JJ)V
    .locals 5

    sget-object v0, LOb1$b;->a:[I

    iget-object v1, p0, LOb1;->t:LOb1$e;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unknown state: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, LOb1;->t:LOb1$e;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Encoder is released"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    sget-object p1, LOb1$e;->b:LOb1$e;

    invoke-virtual {p0, p1}, LOb1;->c0(LOb1$e;)V

    goto/16 :goto_1

    :pswitch_2
    iget-object v0, p0, LOb1;->t:LOb1$e;

    sget-object v1, LOb1$e;->e:LOb1$e;

    invoke-virtual {p0, v1}, LOb1;->c0(LOb1$e;)V

    iget-object v1, p0, LOb1;->u:Landroid/util/Range;

    invoke-virtual {v1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-wide v3, 0x7fffffffffffffffL

    cmp-long v3, v1, v3

    if-eqz v3, :cond_4

    const-wide/16 v3, -0x1

    cmp-long v3, p1, v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    cmp-long v3, p1, v1

    if-gez v3, :cond_1

    iget-object p1, p0, LOb1;->a:Ljava/lang/String;

    const-string p2, "The expected stop time is less than the start time. Use current time as stop time."

    invoke-static {p1, p2}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    move-wide p1, p3

    :cond_1
    cmp-long p3, p1, v1

    if-ltz p3, :cond_3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p4

    invoke-static {p3, p4}, Landroid/util/Range;->create(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;

    move-result-object p3

    iput-object p3, p0, LOb1;->u:Landroid/util/Range;

    iget-object p3, p0, LOb1;->a:Ljava/lang/String;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Stop on "

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, LhV0;->j(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, LOb1$e;->d:LOb1$e;

    if-ne v0, p1, :cond_2

    iget-object p1, p0, LOb1;->x:Ljava/lang/Long;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, LOb1;->d0()V

    goto :goto_1

    :cond_2
    const/4 p1, 0x1

    iput-boolean p1, p0, LOb1;->w:Z

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    new-instance p2, LMb1;

    invoke-direct {p2, p0}, LMb1;-><init>(LOb1;)V

    const-wide/16 p3, 0x3e8

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, p2, p3, p4, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, LOb1;->y:Ljava/util/concurrent/Future;

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "The start time should be before the stop time."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "There should be a \"start\" before \"stop\""

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :goto_1
    :pswitch_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method private synthetic V(Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, LOb1;->t:LOb1$e;

    sget-object v1, LOb1$e;->i:LOb1$e;

    if-eq v0, v1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LOb1;->a:Ljava/lang/String;

    const-string v0, "encoded data and input buffers are returned"

    invoke-static {p1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, LOb1;->f:Llb1$a;

    instance-of p1, p1, LOb1$g;

    if-eqz p1, :cond_1

    iget-boolean p1, p0, LOb1;->B:Z

    if-nez p1, :cond_1

    iget-object p1, p0, LOb1;->e:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->flush()V

    const/4 p1, 0x1

    iput-boolean p1, p0, LOb1;->A:Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, LOb1;->e:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->stop()V

    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :cond_3
    invoke-virtual {p0}, LOb1;->D()V

    return-void
.end method

.method public static synthetic g(LOb1;JJ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LOb1;->U(JJ)V

    return-void
.end method

.method public static synthetic h(LOb1;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, LOb1;->R(J)V

    return-void
.end method

.method public static synthetic i(LOb1;)V
    .locals 0

    invoke-direct {p0}, LOb1;->S()V

    return-void
.end method

.method public static synthetic j(LOb1;LQ22;)V
    .locals 0

    invoke-direct {p0, p1}, LOb1;->K(LQ22;)V

    return-void
.end method

.method public static synthetic k(LOb1;LO80$a;)V
    .locals 0

    invoke-direct {p0, p1}, LOb1;->I(LO80$a;)V

    return-void
.end method

.method public static synthetic l(Lsb1;ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LOb1;->M(Lsb1;ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic m(Ljava/util/concurrent/atomic/AtomicReference;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LOb1;->L(Ljava/util/concurrent/atomic/AtomicReference;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(LOb1;Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LOb1;->V(Ljava/util/List;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic o(LOb1;ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LOb1;->J(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic p(LOb1;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, LOb1;->N(J)V

    return-void
.end method

.method public static synthetic q(LOb1;)V
    .locals 0

    invoke-direct {p0}, LOb1;->T()V

    return-void
.end method

.method public static synthetic r(LOb1;)V
    .locals 0

    invoke-direct {p0}, LOb1;->O()V

    return-void
.end method

.method public static synthetic s(LOb1;)V
    .locals 0

    invoke-direct {p0}, LOb1;->P()V

    return-void
.end method

.method public static synthetic t(LOb1;)V
    .locals 0

    invoke-virtual {p0}, LOb1;->e0()V

    return-void
.end method

.method public static synthetic u(LOb1;)V
    .locals 0

    invoke-direct {p0}, LOb1;->Q()V

    return-void
.end method

.method public static synthetic v(Ljava/util/concurrent/atomic/AtomicReference;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LOb1;->H(Ljava/util/concurrent/atomic/AtomicReference;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static y(ZLandroid/media/MediaCodecInfo;Ljava/lang/String;)Lhc1;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/video/internal/encoder/InvalidConfigException;
        }
    .end annotation

    if-eqz p0, :cond_0

    new-instance p0, Lip6;

    invoke-direct {p0, p1, p2}, Lip6;-><init>(Landroid/media/MediaCodecInfo;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p0, LAp;

    invoke-direct {p0, p1, p2}, LAp;-><init>(Landroid/media/MediaCodecInfo;Ljava/lang/String;)V

    :goto_0
    return-object p0
.end method


# virtual methods
.method public A(Landroid/media/MediaCodec$BufferInfo;)J
    .locals 4

    iget-wide v0, p0, LOb1;->v:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    iget-wide v2, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    sub-long/2addr v2, v0

    goto :goto_0

    :cond_0
    iget-wide v2, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    :goto_0
    return-wide v2
.end method

.method public B(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    sget-object v0, LOb1$b;->a:[I

    iget-object v1, p0, LOb1;->t:LOb1$e;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, LOb1;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Get more than one error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "("

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p3}, LJx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :pswitch_1
    sget-object v0, LOb1$e;->i:LOb1$e;

    invoke-virtual {p0, v0}, LOb1;->c0(LOb1$e;)V

    new-instance v0, Lzb1;

    invoke-direct {v0, p0, p1, p2, p3}, Lzb1;-><init>(LOb1;ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, LOb1;->g0(Ljava/lang/Runnable;)V

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0, p1, p2, p3}, LOb1;->X(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, LOb1;->a0()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public C(Landroid/media/MediaCodec$CodecException;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0, p1}, LOb1;->B(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public D()V
    .locals 2

    iget-object v0, p0, LOb1;->t:LOb1$e;

    sget-object v1, LOb1$e;->h:LOb1$e;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LOb1;->Y()V

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, LOb1;->A:Z

    if-nez v1, :cond_1

    invoke-virtual {p0}, LOb1;->a0()V

    :cond_1
    sget-object v1, LOb1$e;->b:LOb1$e;

    invoke-virtual {p0, v1}, LOb1;->c0(LOb1$e;)V

    sget-object v1, LOb1$e;->f:LOb1$e;

    if-eq v0, v1, :cond_2

    sget-object v1, LOb1$e;->g:LOb1$e;

    if-ne v0, v1, :cond_3

    :cond_2
    invoke-virtual {p0}, LOb1;->start()V

    sget-object v1, LOb1$e;->g:LOb1$e;

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, LOb1;->pause()V

    :cond_3
    :goto_0
    return-void
.end method

.method public F(J)Z
    .locals 5

    iget-object v0, p0, LOb1;->o:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Range;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-virtual {v1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v1, p1, v3

    if-gez v1, :cond_0

    :cond_2
    return v2
.end method

.method public W()V
    .locals 4

    :goto_0
    iget-object v0, p0, LOb1;->l:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LOb1;->k:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LOb1;->l:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO80$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, LOb1;->k:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :try_start_0
    new-instance v2, LQ22;

    iget-object v3, p0, LOb1;->e:Landroid/media/MediaCodec;

    invoke-direct {v2, v3, v1}, LQ22;-><init>(Landroid/media/MediaCodec;I)V
    :try_end_0
    .catch Landroid/media/MediaCodec$CodecException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0, v2}, LO80$a;->c(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LOb1;->m:Ljava/util/Set;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, LQ22;->c()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v1, LLb1;

    invoke-direct {v1, p0, v2}, LLb1;-><init>(LOb1;LQ22;)V

    iget-object v2, p0, LOb1;->h:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, LQ22;->f()Z

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, LOb1;->C(Landroid/media/MediaCodec$CodecException;)V

    :cond_1
    return-void
.end method

.method public X(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, LOb1;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LOb1;->r:Lsb1;

    iget-object v2, p0, LOb1;->s:Ljava/util/concurrent/Executor;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v0, LEb1;

    invoke-direct {v0, v1, p1, p2, p3}, LEb1;-><init>(Lsb1;ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, LOb1;->a:Ljava/lang/String;

    const-string p3, "Unable to post to the supplied executor."

    invoke-static {p2, p3, p1}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final Y()V
    .locals 2

    iget-boolean v0, p0, LOb1;->A:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LOb1;->e:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LOb1;->A:Z

    :cond_0
    iget-object v0, p0, LOb1;->e:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    iget-object v0, p0, LOb1;->f:Llb1$a;

    instance-of v1, v0, LOb1$g;

    if-eqz v1, :cond_1

    check-cast v0, LOb1$g;

    invoke-virtual {v0}, LOb1$g;->e()V

    :cond_1
    sget-object v0, LOb1$e;->j:LOb1$e;

    invoke-virtual {p0, v0}, LOb1;->c0(LOb1$e;)V

    iget-object v0, p0, LOb1;->j:LO80$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LO80$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public Z()V
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "request-sync"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, LOb1;->e:Landroid/media/MediaCodec;

    invoke-virtual {v1, v0}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    return-void
.end method

.method public a()Lhc1;
    .locals 1

    iget-object v0, p0, LOb1;->g:Lhc1;

    return-object v0
.end method

.method public final a0()V
    .locals 4

    sget-object v0, LOb1;->E:Landroid/util/Range;

    iput-object v0, p0, LOb1;->u:Landroid/util/Range;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LOb1;->v:J

    iget-object v0, p0, LOb1;->o:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    iget-object v0, p0, LOb1;->k:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    iget-object v0, p0, LOb1;->l:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO80$a;

    invoke-virtual {v1}, LO80$a;->d()Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, LOb1;->l:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    iget-object v0, p0, LOb1;->e:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->reset()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LOb1;->A:Z

    iput-boolean v0, p0, LOb1;->B:Z

    iput-boolean v0, p0, LOb1;->C:Z

    iput-boolean v0, p0, LOb1;->w:Z

    iget-object v0, p0, LOb1;->y:Ljava/util/concurrent/Future;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    iput-object v2, p0, LOb1;->y:Ljava/util/concurrent/Future;

    :cond_1
    iget-object v0, p0, LOb1;->z:LOb1$f;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LOb1$f;->v()V

    :cond_2
    new-instance v0, LOb1$f;

    invoke-direct {v0, p0}, LOb1$f;-><init>(LOb1;)V

    iput-object v0, p0, LOb1;->z:LOb1$f;

    iget-object v3, p0, LOb1;->e:Landroid/media/MediaCodec;

    invoke-virtual {v3, v0}, Landroid/media/MediaCodec;->setCallback(Landroid/media/MediaCodec$Callback;)V

    iget-object v0, p0, LOb1;->e:Landroid/media/MediaCodec;

    iget-object v3, p0, LOb1;->d:Landroid/media/MediaFormat;

    invoke-virtual {v0, v3, v2, v2, v1}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    iget-object v0, p0, LOb1;->f:Llb1$a;

    instance-of v1, v0, LOb1$g;

    if-eqz v1, :cond_3

    check-cast v0, LOb1$g;

    invoke-virtual {v0}, LOb1$g;->f()V

    :cond_3
    return-void
.end method

.method public b(Lsb1;Ljava/util/concurrent/Executor;)V
    .locals 1

    iget-object v0, p0, LOb1;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, LOb1;->r:Lsb1;

    iput-object p2, p0, LOb1;->s:Ljava/util/concurrent/Executor;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b0(Z)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "drop-input-frames"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object p1, p0, LOb1;->e:Landroid/media/MediaCodec;

    invoke-virtual {p1, v0}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    return-void
.end method

.method public c()Llb1$a;
    .locals 1

    iget-object v0, p0, LOb1;->f:Llb1$a;

    return-object v0
.end method

.method public final c0(LOb1$e;)V
    .locals 3

    iget-object v0, p0, LOb1;->t:LOb1$e;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LOb1;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Transitioning encoder internal state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LOb1;->t:LOb1$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " --> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, LOb1;->t:LOb1$e;

    return-void
.end method

.method public d()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LOb1;->i:Lcom/google/common/util/concurrent/ListenableFuture;

    return-object v0
.end method

.method public d0()V
    .locals 3

    iget-object v0, p0, LOb1;->f:Llb1$a;

    instance-of v1, v0, LOb1$d;

    if-eqz v1, :cond_1

    check-cast v0, LOb1$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LOb1$d;->q(Z)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LOb1;->m:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO22;

    invoke-interface {v2}, LO22;->c()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, LIA1;->n(Ljava/util/Collection;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v1, LBb1;

    invoke-direct {v1, p0}, LBb1;-><init>(LOb1;)V

    iget-object v2, p0, LOb1;->h:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_1

    :cond_1
    instance-of v0, v0, LOb1$g;

    if-eqz v0, :cond_2

    :try_start_0
    iget-object v0, p0, LOb1;->e:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->signalEndOfInputStream()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LOb1;->C:Z
    :try_end_0
    .catch Landroid/media/MediaCodec$CodecException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, LOb1;->C(Landroid/media/MediaCodec$CodecException;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, LOb1;->h:Ljava/util/concurrent/Executor;

    new-instance v1, LGb1;

    invoke-direct {v1, p0}, LGb1;-><init>(LOb1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e0()V
    .locals 3

    invoke-virtual {p0}, LOb1;->w()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v1, LOb1$a;

    invoke-direct {v1, p0}, LOb1$a;-><init>(LOb1;)V

    iget-object v2, p0, LOb1;->h:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public f()I
    .locals 2

    iget-object v0, p0, LOb1;->d:Landroid/media/MediaFormat;

    const-string v1, "bitrate"

    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LOb1;->d:Landroid/media/MediaFormat;

    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f0()V
    .locals 2

    iget-object v0, p0, LOb1;->h:Ljava/util/concurrent/Executor;

    new-instance v1, LHb1;

    invoke-direct {v1, p0}, LHb1;-><init>(LOb1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public g0(Ljava/lang/Runnable;)V
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LOb1;->n:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lib1;

    invoke-virtual {v2}, Lib1;->b()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v1, p0, LOb1;->m:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO22;

    invoke-interface {v2}, LO22;->c()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, LOb1;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Waiting for resources to return. encoded data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LOb1;->n:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", input buffers = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LOb1;->m:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-static {v0}, LIA1;->n(Ljava/util/Collection;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    new-instance v2, LCb1;

    invoke-direct {v2, p0, v0, p1}, LCb1;-><init>(LOb1;Ljava/util/List;Ljava/lang/Runnable;)V

    iget-object p1, p0, LOb1;->h:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v2, p1}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public h0(J)V
    .locals 7

    :goto_0
    iget-object v0, p0, LOb1;->o:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LOb1;->o:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Range;

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    cmp-long v1, p1, v1

    if-lez v1, :cond_0

    iget-object v1, p0, LOb1;->o:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->removeFirst()Ljava/lang/Object;

    iget-wide v1, p0, LOb1;->v:J

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    sub-long/2addr v3, v5

    add-long/2addr v1, v3

    iput-wide v1, p0, LOb1;->v:J

    iget-object v0, p0, LOb1;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Total paused duration = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, LOb1;->v:J

    invoke-static {v2, v3}, LhV0;->j(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public pause()V
    .locals 4

    invoke-virtual {p0}, LOb1;->z()J

    move-result-wide v0

    iget-object v2, p0, LOb1;->h:Ljava/util/concurrent/Executor;

    new-instance v3, LKb1;

    invoke-direct {v3, p0, v0, v1}, LKb1;-><init>(LOb1;J)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public release()V
    .locals 2

    iget-object v0, p0, LOb1;->h:Ljava/util/concurrent/Executor;

    new-instance v1, LIb1;

    invoke-direct {v1, p0}, LIb1;-><init>(LOb1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public start()V
    .locals 4

    invoke-virtual {p0}, LOb1;->z()J

    move-result-wide v0

    iget-object v2, p0, LOb1;->h:Ljava/util/concurrent/Executor;

    new-instance v3, LNb1;

    invoke-direct {v3, p0, v0, v1}, LNb1;-><init>(LOb1;J)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public stop(J)V
    .locals 8

    invoke-virtual {p0}, LOb1;->z()J

    move-result-wide v4

    iget-object v6, p0, LOb1;->h:Ljava/util/concurrent/Executor;

    new-instance v7, LJb1;

    move-object v0, v7

    move-object v1, p0

    move-wide v2, p1

    invoke-direct/range {v0 .. v5}, LJb1;-><init>(LOb1;JJ)V

    invoke-interface {v6, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public w()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "LO22;",
            ">;"
        }
    .end annotation

    sget-object v0, LOb1$b;->a:[I

    iget-object v1, p0, LOb1;->t:LOb1$e;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LOb1;->t:LOb1$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Encoder is released."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0

    :pswitch_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Encoder is in error state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0

    :pswitch_2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v1, Lyb1;

    invoke-direct {v1, v0}, Lyb1;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-static {v1}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO80$a;

    invoke-static {v0}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO80$a;

    iget-object v2, p0, LOb1;->l:Ljava/util/Queue;

    invoke-interface {v2, v0}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    new-instance v2, LFb1;

    invoke-direct {v2, p0, v0}, LFb1;-><init>(LOb1;LO80$a;)V

    iget-object v3, p0, LOb1;->h:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v2, v3}, LO80$a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p0}, LOb1;->W()V

    return-object v1

    :pswitch_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Encoder is not started yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, LIA1;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final x(Lhp6;Landroid/media/MediaFormat;)V
    .locals 3

    iget-boolean v0, p0, LOb1;->c:Z

    invoke-static {v0}, LHZ3;->i(Z)V

    const-string v0, "bitrate"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1}, Lhp6;->b()Landroid/util/Range;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq v1, p1, :cond_0

    invoke-virtual {p2, v0, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget-object p2, p0, LOb1;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updated bitrate from "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public z()J
    .locals 2

    iget-object v0, p0, LOb1;->q:Ln46;

    invoke-interface {v0}, Ln46;->b()J

    move-result-wide v0

    return-wide v0
.end method
