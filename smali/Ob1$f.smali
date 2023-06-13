.class public LOb1$f;
.super Landroid/media/MediaCodec$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LOb1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final a:Lxp6;

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:J

.field public f:J

.field public g:Z

.field public h:Z

.field public i:Z

.field public final synthetic j:LOb1;


# direct methods
.method public constructor <init>(LOb1;)V
    .locals 3

    iput-object p1, p0, LOb1$f;->j:LOb1;

    invoke-direct {p0}, Landroid/media/MediaCodec$Callback;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LOb1$f;->b:Z

    iput-boolean v0, p0, LOb1$f;->c:Z

    iput-boolean v0, p0, LOb1$f;->d:Z

    const-wide/16 v1, 0x0

    iput-wide v1, p0, LOb1$f;->e:J

    iput-wide v1, p0, LOb1$f;->f:J

    iput-boolean v0, p0, LOb1$f;->g:Z

    iput-boolean v0, p0, LOb1$f;->h:Z

    iput-boolean v0, p0, LOb1$f;->i:Z

    iget-boolean v0, p1, LOb1;->c:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const-class v0, Luc0;

    invoke-static {v0}, LQ21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p1, LOb1;->p:Lr46;

    :goto_0
    new-instance v0, Lxp6;

    iget-object p1, p1, LOb1;->q:Ln46;

    invoke-direct {v0, p1, v1}, Lxp6;-><init>(Ln46;Lr46;)V

    iput-object v0, p0, LOb1$f;->a:Lxp6;

    goto :goto_1

    :cond_1
    iput-object v1, p0, LOb1$f;->a:Lxp6;

    :goto_1
    return-void
.end method

.method public static synthetic a(LOb1$f;Landroid/media/MediaFormat;)V
    .locals 0

    invoke-direct {p0, p1}, LOb1$f;->r(Landroid/media/MediaFormat;)V

    return-void
.end method

.method public static synthetic b(LOb1$f;Ljava/util/concurrent/Executor;Lsb1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LOb1$f;->n(Ljava/util/concurrent/Executor;Lsb1;)V

    return-void
.end method

.method public static synthetic c(LOb1$f;I)V
    .locals 0

    invoke-direct {p0, p1}, LOb1$f;->m(I)V

    return-void
.end method

.method public static synthetic d(LOb1$f;Landroid/media/MediaCodec$CodecException;)V
    .locals 0

    invoke-direct {p0, p1}, LOb1$f;->l(Landroid/media/MediaCodec$CodecException;)V

    return-void
.end method

.method public static synthetic e(Lsb1;Lib1;)V
    .locals 0

    invoke-static {p0, p1}, LOb1$f;->s(Lsb1;Lib1;)V

    return-void
.end method

.method public static synthetic f(LOb1$f;Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LOb1$f;->o(Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;I)V

    return-void
.end method

.method public static synthetic g(Landroid/media/MediaFormat;)Landroid/media/MediaFormat;
    .locals 0

    invoke-static {p0}, LOb1$f;->p(Landroid/media/MediaFormat;)Landroid/media/MediaFormat;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lsb1;Landroid/media/MediaFormat;)V
    .locals 0

    invoke-static {p0, p1}, LOb1$f;->q(Lsb1;Landroid/media/MediaFormat;)V

    return-void
.end method

.method private synthetic l(Landroid/media/MediaCodec$CodecException;)V
    .locals 2

    sget-object v0, LOb1$b;->a:[I

    iget-object v1, p0, LOb1$f;->j:LOb1;

    iget-object v1, v1, LOb1;->t:LOb1$e;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LOb1$f;->j:LOb1;

    iget-object v1, v1, LOb1;->t:LOb1$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, LOb1$f;->j:LOb1;

    invoke-virtual {v0, p1}, LOb1;->C(Landroid/media/MediaCodec$CodecException;)V

    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private synthetic m(I)V
    .locals 2

    iget-boolean v0, p0, LOb1$f;->i:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, LOb1$f;->j:LOb1;

    iget-object p1, p1, LOb1;->a:Ljava/lang/String;

    const-string v0, "Receives input frame after codec is reset."

    invoke-static {p1, v0}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v0, LOb1$b;->a:[I

    iget-object v1, p0, LOb1$f;->j:LOb1;

    iget-object v1, v1, LOb1;->t:LOb1$e;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LOb1$f;->j:LOb1;

    iget-object v1, v1, LOb1;->t:LOb1$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-object v0, v0, LOb1;->k:Ljava/util/Queue;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    iget-object p1, p0, LOb1$f;->j:LOb1;

    invoke-virtual {p1}, LOb1;->W()V

    :pswitch_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private synthetic n(Ljava/util/concurrent/Executor;Lsb1;)V
    .locals 2

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-object v0, v0, LOb1;->t:LOb1$e;

    sget-object v1, LOb1$e;->i:LOb1$e;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lfc1;

    invoke-direct {v0, p2}, Lfc1;-><init>(Lsb1;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, LOb1$f;->j:LOb1;

    iget-object p2, p2, LOb1;->a:Ljava/lang/String;

    const-string v0, "Unable to post to the supplied executor."

    invoke-static {p2, v0, p1}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic o(Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;I)V
    .locals 6

    iget-boolean v0, p0, LOb1$f;->i:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, LOb1$f;->j:LOb1;

    iget-object p1, p1, LOb1;->a:Ljava/lang/String;

    const-string p2, "Receives frame after codec is reset."

    invoke-static {p1, p2}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v0, LOb1$b;->a:[I

    iget-object v1, p0, LOb1$f;->j:LOb1;

    iget-object v1, v1, LOb1;->t:LOb1$e;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unknown state: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, LOb1$f;->j:LOb1;

    iget-object p3, p3, LOb1;->t:LOb1$e;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-object v0, v0, LOb1;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LOb1$f;->j:LOb1;

    iget-object v2, v1, LOb1;->r:Lsb1;

    iget-object v1, v1, LOb1;->s:Ljava/util/concurrent/Executor;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v0, p0, LOb1$f;->b:Z

    const/4 v3, 0x1

    if-nez v0, :cond_1

    iput-boolean v3, p0, LOb1$f;->b:Z

    :try_start_1
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lbc1;

    invoke-direct {v0, v2}, Lbc1;-><init>(Lsb1;)V

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v4, p0, LOb1$f;->j:LOb1;

    iget-object v4, v4, LOb1;->a:Ljava/lang/String;

    const-string v5, "Unable to post to the supplied executor."

    invoke-static {v4, v5, v0}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, LOb1$f;->i(Landroid/media/MediaCodec$BufferInfo;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, LOb1$f;->c:Z

    if-nez v0, :cond_2

    iput-boolean v3, p0, LOb1$f;->c:Z

    :cond_2
    invoke-virtual {p0, p1}, LOb1$f;->t(Landroid/media/MediaCodec$BufferInfo;)Landroid/media/MediaCodec$BufferInfo;

    move-result-object v0

    iget-wide v4, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iput-wide v4, p0, LOb1$f;->f:J

    :try_start_2
    new-instance v4, Lib1;

    invoke-direct {v4, p2, p3, v0}, Lib1;-><init>(Landroid/media/MediaCodec;ILandroid/media/MediaCodec$BufferInfo;)V

    invoke-virtual {p0, v4, v2, v1}, LOb1$f;->u(Lib1;Lsb1;Ljava/util/concurrent/Executor;)V
    :try_end_2
    .catch Landroid/media/MediaCodec$CodecException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    iget-object p2, p0, LOb1$f;->j:LOb1;

    invoke-virtual {p2, p1}, LOb1;->C(Landroid/media/MediaCodec$CodecException;)V

    return-void

    :cond_3
    const/16 p2, -0x270f

    if-eq p3, p2, :cond_4

    :try_start_3
    iget-object p2, p0, LOb1$f;->j:LOb1;

    iget-object p2, p2, LOb1;->e:Landroid/media/MediaCodec;

    const/4 v0, 0x0

    invoke-virtual {p2, p3, v0}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V
    :try_end_3
    .catch Landroid/media/MediaCodec$CodecException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    :catch_2
    move-exception p1

    iget-object p2, p0, LOb1$f;->j:LOb1;

    invoke-virtual {p2, p1}, LOb1;->C(Landroid/media/MediaCodec$CodecException;)V

    return-void

    :cond_4
    :goto_1
    iget-boolean p2, p0, LOb1$f;->d:Z

    if-nez p2, :cond_5

    invoke-virtual {p0, p1}, LOb1$f;->j(Landroid/media/MediaCodec$BufferInfo;)Z

    move-result p1

    if-eqz p1, :cond_5

    iput-boolean v3, p0, LOb1$f;->d:Z

    iget-object p1, p0, LOb1$f;->j:LOb1;

    new-instance p2, Lcc1;

    invoke-direct {p2, p0, v1, v2}, Lcc1;-><init>(LOb1$f;Ljava/util/concurrent/Executor;Lsb1;)V

    invoke-virtual {p1, p2}, LOb1;->g0(Ljava/lang/Runnable;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1

    :cond_5
    :goto_2
    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static synthetic p(Landroid/media/MediaFormat;)Landroid/media/MediaFormat;
    .locals 0

    return-object p0
.end method

.method public static synthetic q(Lsb1;Landroid/media/MediaFormat;)V
    .locals 1

    new-instance v0, Lec1;

    invoke-direct {v0, p1}, Lec1;-><init>(Landroid/media/MediaFormat;)V

    invoke-interface {p0, v0}, Lsb1;->f(LRz3;)V

    return-void
.end method

.method private synthetic r(Landroid/media/MediaFormat;)V
    .locals 3

    iget-boolean v0, p0, LOb1$f;->i:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, LOb1$f;->j:LOb1;

    iget-object p1, p1, LOb1;->a:Ljava/lang/String;

    const-string v0, "Receives onOutputFormatChanged after codec is reset."

    invoke-static {p1, v0}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v0, LOb1$b;->a:[I

    iget-object v1, p0, LOb1$f;->j:LOb1;

    iget-object v1, v1, LOb1;->t:LOb1$e;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LOb1$f;->j:LOb1;

    iget-object v1, v1, LOb1;->t:LOb1$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-object v0, v0, LOb1;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LOb1$f;->j:LOb1;

    iget-object v2, v1, LOb1;->r:Lsb1;

    iget-object v1, v1, LOb1;->s:Ljava/util/concurrent/Executor;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v0, Lac1;

    invoke-direct {v0, v2, p1}, Lac1;-><init>(Lsb1;Landroid/media/MediaFormat;)V

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-object v0, v0, LOb1;->a:Ljava/lang/String;

    const-string v1, "Unable to post to the supplied executor."

    invoke-static {v0, v1, p1}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :goto_0
    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static synthetic s(Lsb1;Lib1;)V
    .locals 0

    invoke-interface {p0, p1}, Lsb1;->a(Lgb1;)V

    return-void
.end method


# virtual methods
.method public final i(Landroid/media/MediaCodec$BufferInfo;)Z
    .locals 7

    iget-boolean v0, p0, LOb1$f;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object p1, p0, LOb1$f;->j:LOb1;

    iget-object p1, p1, LOb1;->a:Ljava/lang/String;

    const-string v0, "Drop buffer by already reach end of stream."

    invoke-static {p1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    iget v0, p1, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-gtz v0, :cond_1

    iget-object p1, p0, LOb1$f;->j:LOb1;

    iget-object p1, p1, LOb1;->a:Ljava/lang/String;

    const-string v0, "Drop buffer by invalid buffer size."

    invoke-static {p1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_1
    iget v0, p1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    iget-object p1, p0, LOb1$f;->j:LOb1;

    iget-object p1, p1, LOb1;->a:Ljava/lang/String;

    const-string v0, "Drop buffer by codec config."

    invoke-static {p1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_2
    iget-object v0, p0, LOb1$f;->a:Lxp6;

    if-eqz v0, :cond_3

    iget-wide v2, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v0, v2, v3}, Lxp6;->b(J)J

    move-result-wide v2

    iput-wide v2, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    :cond_3
    iget-wide v2, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-wide v4, p0, LOb1$f;->e:J

    cmp-long v0, v2, v4

    if-gtz v0, :cond_4

    iget-object p1, p0, LOb1$f;->j:LOb1;

    iget-object p1, p1, LOb1;->a:Ljava/lang/String;

    const-string v0, "Drop buffer by out of order buffer from MediaCodec."

    invoke-static {p1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_4
    iput-wide v2, p0, LOb1$f;->e:J

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-object v0, v0, LOb1;->u:Landroid/util/Range;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_7

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-object v0, v0, LOb1;->a:Ljava/lang/String;

    const-string v3, "Drop buffer by not in start-stop range."

    invoke-static {v0, v3}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-boolean v3, v0, LOb1;->w:Z

    if-eqz v3, :cond_6

    iget-wide v3, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-object v0, v0, LOb1;->u:Landroid/util/Range;

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-ltz v0, :cond_6

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-object v0, v0, LOb1;->y:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_5

    invoke-interface {v0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_5
    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-wide v2, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, v0, LOb1;->x:Ljava/lang/Long;

    iget-object p1, p0, LOb1$f;->j:LOb1;

    invoke-virtual {p1}, LOb1;->d0()V

    iget-object p1, p0, LOb1$f;->j:LOb1;

    iput-boolean v1, p1, LOb1;->w:Z

    :cond_6
    return v1

    :cond_7
    invoke-virtual {p0, p1}, LOb1$f;->w(Landroid/media/MediaCodec$BufferInfo;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object p1, p0, LOb1$f;->j:LOb1;

    iget-object p1, p1, LOb1;->a:Ljava/lang/String;

    const-string v0, "Drop buffer by pause."

    invoke-static {p1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_8
    iget-object v0, p0, LOb1$f;->j:LOb1;

    invoke-virtual {v0, p1}, LOb1;->A(Landroid/media/MediaCodec$BufferInfo;)J

    move-result-wide v3

    iget-wide v5, p0, LOb1$f;->f:J

    cmp-long v0, v3, v5

    if-gtz v0, :cond_a

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-object v0, v0, LOb1;->a:Ljava/lang/String;

    const-string v3, "Drop buffer by adjusted time is less than the last sent time."

    invoke-static {v0, v3}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-boolean v0, v0, LOb1;->c:Z

    if-eqz v0, :cond_9

    invoke-static {p1}, LOb1;->G(Landroid/media/MediaCodec$BufferInfo;)Z

    move-result p1

    if-eqz p1, :cond_9

    iput-boolean v2, p0, LOb1$f;->h:Z

    :cond_9
    return v1

    :cond_a
    iget-boolean v0, p0, LOb1$f;->c:Z

    if-nez v0, :cond_b

    iget-boolean v0, p0, LOb1$f;->h:Z

    if-nez v0, :cond_b

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-boolean v0, v0, LOb1;->c:Z

    if-eqz v0, :cond_b

    iput-boolean v2, p0, LOb1$f;->h:Z

    :cond_b
    iget-boolean v0, p0, LOb1$f;->h:Z

    if-eqz v0, :cond_d

    invoke-static {p1}, LOb1;->G(Landroid/media/MediaCodec$BufferInfo;)Z

    move-result p1

    if-nez p1, :cond_c

    iget-object p1, p0, LOb1$f;->j:LOb1;

    iget-object p1, p1, LOb1;->a:Ljava/lang/String;

    const-string v0, "Drop buffer by not a key frame."

    invoke-static {p1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, LOb1$f;->j:LOb1;

    invoke-virtual {p1}, LOb1;->Z()V

    return v1

    :cond_c
    iput-boolean v1, p0, LOb1$f;->h:Z

    :cond_d
    return v2
.end method

.method public final j(Landroid/media/MediaCodec$BufferInfo;)Z
    .locals 1

    invoke-static {p1}, LOb1;->E(Landroid/media/MediaCodec$BufferInfo;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, LOb1$f;->k(Landroid/media/MediaCodec$BufferInfo;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final k(Landroid/media/MediaCodec$BufferInfo;)Z
    .locals 5

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-boolean v1, v0, LOb1;->C:Z

    if-eqz v1, :cond_0

    iget-wide v1, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-object p1, v0, LOb1;->u:Landroid/util/Range;

    invoke-virtual {p1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long p1, v1, v3

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onError(Landroid/media/MediaCodec;Landroid/media/MediaCodec$CodecException;)V
    .locals 1

    iget-object p1, p0, LOb1$f;->j:LOb1;

    iget-object p1, p1, LOb1;->h:Ljava/util/concurrent/Executor;

    new-instance v0, LVb1;

    invoke-direct {v0, p0, p2}, LVb1;-><init>(LOb1$f;Landroid/media/MediaCodec$CodecException;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onInputBufferAvailable(Landroid/media/MediaCodec;I)V
    .locals 1

    iget-object p1, p0, LOb1$f;->j:LOb1;

    iget-object p1, p1, LOb1;->h:Ljava/util/concurrent/Executor;

    new-instance v0, LYb1;

    invoke-direct {v0, p0, p2}, LYb1;-><init>(LOb1$f;I)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onOutputBufferAvailable(Landroid/media/MediaCodec;ILandroid/media/MediaCodec$BufferInfo;)V
    .locals 2

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-object v0, v0, LOb1;->h:Ljava/util/concurrent/Executor;

    new-instance v1, LXb1;

    invoke-direct {v1, p0, p3, p1, p2}, LXb1;-><init>(LOb1$f;Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onOutputFormatChanged(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V
    .locals 1

    iget-object p1, p0, LOb1$f;->j:LOb1;

    iget-object p1, p1, LOb1;->h:Ljava/util/concurrent/Executor;

    new-instance v0, LZb1;

    invoke-direct {v0, p0, p2}, LZb1;-><init>(LOb1$f;Landroid/media/MediaFormat;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final t(Landroid/media/MediaCodec$BufferInfo;)Landroid/media/MediaCodec$BufferInfo;
    .locals 7

    iget-object v0, p0, LOb1$f;->j:LOb1;

    invoke-virtual {v0, p1}, LOb1;->A(Landroid/media/MediaCodec$BufferInfo;)J

    move-result-wide v4

    iget-wide v0, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    cmp-long v0, v0, v4

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    iget-wide v0, p0, LOb1$f;->f:J

    cmp-long v0, v4, v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LHZ3;->i(Z)V

    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iget v2, p1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v3, p1, Landroid/media/MediaCodec$BufferInfo;->size:I

    iget v6, p1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    move-object v1, v0

    invoke-virtual/range {v1 .. v6}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    return-object v0
.end method

.method public final u(Lib1;Lsb1;Ljava/util/concurrent/Executor;)V
    .locals 3

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-object v0, v0, LOb1;->n:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lib1;->b()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v1, LOb1$f$a;

    invoke-direct {v1, p0, p1}, LOb1$f$a;-><init>(LOb1$f;Lib1;)V

    iget-object v2, p0, LOb1$f;->j:LOb1;

    iget-object v2, v2, LOb1;->h:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    :try_start_0
    new-instance v0, LWb1;

    invoke-direct {v0, p2, p1}, LWb1;-><init>(Lsb1;Lib1;)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    iget-object p3, p0, LOb1$f;->j:LOb1;

    iget-object p3, p3, LOb1;->a:Ljava/lang/String;

    const-string v0, "Unable to post to the supplied executor."

    invoke-static {p3, v0, p2}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Lib1;->close()V

    :goto_0
    return-void
.end method

.method public v()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LOb1$f;->i:Z

    return-void
.end method

.method public final w(Landroid/media/MediaCodec$BufferInfo;)Z
    .locals 6

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-wide v1, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v0, v1, v2}, LOb1;->h0(J)V

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-wide v1, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v0, v1, v2}, LOb1;->F(J)Z

    move-result v0

    iget-boolean v1, p0, LOb1$f;->g:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_5

    if-eqz v0, :cond_5

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-object v0, v0, LOb1;->a:Ljava/lang/String;

    const-string v1, "Switch to pause state"

    invoke-static {v0, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v3, p0, LOb1$f;->g:Z

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-object v4, v0, LOb1;->b:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-object v1, v0, LOb1;->s:Ljava/util/concurrent/Executor;

    iget-object v0, v0, LOb1;->r:Lsb1;

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Ldc1;

    invoke-direct {v4, v0}, Ldc1;-><init>(Lsb1;)V

    invoke-interface {v1, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-object v1, v0, LOb1;->t:LOb1$e;

    sget-object v4, LOb1$e;->d:LOb1$e;

    if-ne v1, v4, :cond_3

    iget-boolean v0, v0, LOb1;->c:Z

    if-nez v0, :cond_0

    const-class v0, Lzp;

    invoke-static {v0}, LQ21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-boolean v0, v0, LOb1;->c:Z

    if-eqz v0, :cond_1

    const-class v0, Lsp6;

    invoke-static {v0}, LQ21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-object v0, v0, LOb1;->f:Llb1$a;

    instance-of v1, v0, LOb1$d;

    if-eqz v1, :cond_2

    check-cast v0, LOb1$d;

    invoke-virtual {v0, v2}, LOb1$d;->q(Z)V

    :cond_2
    iget-object v0, p0, LOb1$f;->j:LOb1;

    invoke-virtual {v0, v3}, LOb1;->b0(Z)V

    :cond_3
    :goto_0
    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-wide v4, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, v0, LOb1;->x:Ljava/lang/Long;

    iget-object p1, p0, LOb1$f;->j:LOb1;

    iget-boolean v0, p1, LOb1;->w:Z

    if-eqz v0, :cond_6

    iget-object p1, p1, LOb1;->y:Ljava/util/concurrent/Future;

    if-eqz p1, :cond_4

    invoke-interface {p1, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_4
    iget-object p1, p0, LOb1$f;->j:LOb1;

    invoke-virtual {p1}, LOb1;->d0()V

    iget-object p1, p0, LOb1$f;->j:LOb1;

    iput-boolean v2, p1, LOb1;->w:Z

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_5
    if-eqz v1, :cond_6

    if-nez v0, :cond_6

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-object v0, v0, LOb1;->a:Ljava/lang/String;

    const-string v1, "Switch to resume state"

    invoke-static {v0, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v2, p0, LOb1$f;->g:Z

    iget-object v0, p0, LOb1$f;->j:LOb1;

    iget-boolean v0, v0, LOb1;->c:Z

    if-eqz v0, :cond_6

    invoke-static {p1}, LOb1;->G(Landroid/media/MediaCodec$BufferInfo;)Z

    move-result p1

    if-nez p1, :cond_6

    iput-boolean v3, p0, LOb1$f;->h:Z

    :cond_6
    :goto_1
    iget-boolean p1, p0, LOb1$f;->g:Z

    return p1
.end method
