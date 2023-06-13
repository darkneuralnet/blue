.class public Lln4$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lln4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final k:Lad;

.field public static final l:J


# instance fields
.field public final a:Lal0;

.field public final b:Z

.field public c:Lcom/google/firebase/perf/util/Timer;

.field public d:Lkn4;

.field public e:J

.field public f:D

.field public g:Lkn4;

.field public h:Lkn4;

.field public i:J

.field public j:J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lad;->e()Lad;

    move-result-object v0

    sput-object v0, Lln4$a;->k:Lad;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    move-result-wide v0

    sput-wide v0, Lln4$a;->l:J

    return-void
.end method

.method public constructor <init>(Lkn4;JLal0;LBv0;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lln4$a;->a:Lal0;

    iput-wide p2, p0, Lln4$a;->e:J

    iput-object p1, p0, Lln4$a;->d:Lkn4;

    long-to-double p1, p2

    iput-wide p1, p0, Lln4$a;->f:D

    invoke-virtual {p4}, Lal0;->a()Lcom/google/firebase/perf/util/Timer;

    move-result-object p1

    iput-object p1, p0, Lln4$a;->c:Lcom/google/firebase/perf/util/Timer;

    invoke-virtual {p0, p5, p6, p7}, Lln4$a;->g(LBv0;Ljava/lang/String;Z)V

    iput-boolean p7, p0, Lln4$a;->b:Z

    return-void
.end method

.method public static c(LBv0;Ljava/lang/String;)J
    .locals 1

    const-string v0, "Trace"

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, LBv0;->E()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-virtual {p0}, LBv0;->q()J

    move-result-wide p0

    return-wide p0
.end method

.method public static d(LBv0;Ljava/lang/String;)J
    .locals 1

    const-string v0, "Trace"

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, LBv0;->t()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-virtual {p0}, LBv0;->t()J

    move-result-wide p0

    return-wide p0
.end method

.method public static e(LBv0;Ljava/lang/String;)J
    .locals 1

    const-string v0, "Trace"

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, LBv0;->F()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-virtual {p0}, LBv0;->r()J

    move-result-wide p0

    return-wide p0
.end method

.method public static f(LBv0;Ljava/lang/String;)J
    .locals 1

    const-string v0, "Trace"

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, LBv0;->t()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-virtual {p0}, LBv0;->t()J

    move-result-wide p0

    return-wide p0
.end method


# virtual methods
.method public declared-synchronized a(Z)V
    .locals 2

    monitor-enter p0

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lln4$a;->g:Lkn4;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lln4$a;->h:Lkn4;

    :goto_0
    iput-object v0, p0, Lln4$a;->d:Lkn4;

    if-eqz p1, :cond_1

    iget-wide v0, p0, Lln4$a;->i:J

    goto :goto_1

    :cond_1
    iget-wide v0, p0, Lln4$a;->j:J

    :goto_1
    iput-wide v0, p0, Lln4$a;->e:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(LkQ3;)Z
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lln4$a;->a:Lal0;

    invoke-virtual {p1}, Lal0;->a()Lcom/google/firebase/perf/util/Timer;

    move-result-object p1

    iget-object v0, p0, Lln4$a;->c:Lcom/google/firebase/perf/util/Timer;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/util/Timer;->d(Lcom/google/firebase/perf/util/Timer;)J

    move-result-wide v0

    long-to-double v0, v0

    iget-object v2, p0, Lln4$a;->d:Lkn4;

    invoke-virtual {v2}, Lkn4;->a()D

    move-result-wide v2

    mul-double/2addr v0, v2

    sget-wide v2, Lln4$a;->l:J

    long-to-double v2, v2

    div-double/2addr v0, v2

    const-wide/16 v2, 0x0

    cmpl-double v2, v0, v2

    if-lez v2, :cond_0

    iget-wide v2, p0, Lln4$a;->f:D

    add-double/2addr v2, v0

    iget-wide v0, p0, Lln4$a;->e:J

    long-to-double v0, v0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lln4$a;->f:D

    iput-object p1, p0, Lln4$a;->c:Lcom/google/firebase/perf/util/Timer;

    :cond_0
    iget-wide v0, p0, Lln4$a;->f:D

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpl-double p1, v0, v2

    if-ltz p1, :cond_1

    sub-double/2addr v0, v2

    iput-wide v0, p0, Lln4$a;->f:D
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :cond_1
    :try_start_1
    iget-boolean p1, p0, Lln4$a;->b:Z

    if-eqz p1, :cond_2

    sget-object p1, Lln4$a;->k:Lad;

    const-string v0, "Exceeded log rate limit, dropping the log."

    invoke-virtual {p1, v0}, Lad;->j(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final g(LBv0;Ljava/lang/String;Z)V
    .locals 16

    move-object/from16 v0, p0

    invoke-static/range {p1 .. p2}, Lln4$a;->f(LBv0;Ljava/lang/String;)J

    move-result-wide v4

    invoke-static/range {p1 .. p2}, Lln4$a;->e(LBv0;Ljava/lang/String;)J

    move-result-wide v7

    new-instance v9, Lkn4;

    sget-object v15, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v1, v9

    move-wide v2, v7

    move-object v6, v15

    invoke-direct/range {v1 .. v6}, Lkn4;-><init>(JJLjava/util/concurrent/TimeUnit;)V

    iput-object v9, v0, Lln4$a;->g:Lkn4;

    iput-wide v7, v0, Lln4$a;->i:J

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x3

    if-eqz p3, :cond_0

    sget-object v5, Lln4$a;->k:Lad;

    new-array v6, v4, [Ljava/lang/Object;

    aput-object p2, v6, v3

    aput-object v9, v6, v2

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    aput-object v7, v6, v1

    const-string v7, "Foreground %s logging rate:%f, burst capacity:%d"

    invoke-virtual {v5, v7, v6}, Lad;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    invoke-static/range {p1 .. p2}, Lln4$a;->d(LBv0;Ljava/lang/String;)J

    move-result-wide v13

    invoke-static/range {p1 .. p2}, Lln4$a;->c(LBv0;Ljava/lang/String;)J

    move-result-wide v5

    new-instance v7, Lkn4;

    move-object v10, v7

    move-wide v11, v5

    invoke-direct/range {v10 .. v15}, Lkn4;-><init>(JJLjava/util/concurrent/TimeUnit;)V

    iput-object v7, v0, Lln4$a;->h:Lkn4;

    iput-wide v5, v0, Lln4$a;->j:J

    if-eqz p3, :cond_1

    sget-object v8, Lln4$a;->k:Lad;

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p2, v4, v3

    aput-object v7, v4, v2

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v4, v1

    const-string v1, "Background %s logging rate:%f, capacity:%d"

    invoke-virtual {v8, v1, v4}, Lad;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
