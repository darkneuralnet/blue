.class public final Lxy8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:LOx8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LOx8<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/atomic/AtomicLong;

.field public final c:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lly8<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "LMb9<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:LMd9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LMd9<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc69;Ljava/util/concurrent/Executor;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc69<",
            "TT;>;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const/high16 v1, -0x80000000

    invoke-static {v1, v1}, Lxy8;->i(II)J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lxy8;->b:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lxy8;->c:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lxy8;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {v0}, LHc9;->c(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lxy8;->e:Ljava/util/concurrent/Executor;

    invoke-static {}, LMd9;->D()LMd9;

    move-result-object v0

    iput-object v0, p0, Lxy8;->f:LMd9;

    new-instance v1, LOx8;

    invoke-direct {v1, p1, p2}, LOx8;-><init>(Lc69;Ljava/util/concurrent/Executor;)V

    iput-object v1, p0, Lxy8;->a:LOx8;

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lv39;->o(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static synthetic a(Lxy8;)LOx8;
    .locals 0

    iget-object p0, p0, Lxy8;->a:LOx8;

    return-object p0
.end method

.method public static synthetic e(Lxy8;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, Lxy8;->c:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method public static synthetic g(Lxy8;)Z
    .locals 6

    :cond_0
    iget-object v0, p0, Lxy8;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    long-to-int v2, v0

    const/16 v3, 0x20

    ushr-long v3, v0, v3

    long-to-int v3, v3

    const/high16 v4, -0x80000000

    if-eq v2, v4, :cond_3

    const v4, -0x7fffffff

    if-ne v2, v4, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_2

    add-int/lit8 v3, v3, 0x1

    :cond_2
    iget-object v5, p0, Lxy8;->b:Ljava/util/concurrent/atomic/AtomicLong;

    add-int/lit8 v2, v2, -0x1

    invoke-static {v3, v2}, Lxy8;->i(II)J

    move-result-wide v2

    invoke-virtual {v5, v0, v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return v4

    :cond_3
    new-instance p0, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x21

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Refcount is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0
.end method

.method public static i(II)J
    .locals 4

    int-to-long v0, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    int-to-long p0, p1

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method


# virtual methods
.method public final b()LMb9;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LMb9<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lxy8;->f:LMd9;

    invoke-virtual {v0}, Lv39;->isDone()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Lxy8;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    long-to-int v2, v2

    iget-object v3, p0, Lxy8;->b:Ljava/util/concurrent/atomic/AtomicLong;

    long-to-int v4, v0

    add-int/lit8 v4, v4, 0x1

    invoke-static {v2, v4}, Lxy8;->i(II)J

    move-result-wide v4

    invoke-virtual {v3, v0, v1, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LMd9;->D()LMd9;

    move-result-object v0

    iget-object v1, p0, Lxy8;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LMb9;

    if-nez v1, :cond_1

    new-instance v1, LGw8;

    invoke-direct {v1, p0, v2}, LGw8;-><init>(Lxy8;I)V

    invoke-static {v1}, LKD8;->b(Lc69;)Lc69;

    move-result-object v1

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-static {v1, v3}, Lva9;->i(Lc69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object v1

    goto :goto_0

    :cond_1
    new-instance v3, LTw8;

    invoke-direct {v3, p0, v2}, LTw8;-><init>(Lxy8;I)V

    invoke-static {v3}, LKD8;->c(Lk69;)Lk69;

    move-result-object v3

    iget-object v4, p0, Lxy8;->e:Ljava/util/concurrent/Executor;

    const-class v5, Ljava/lang/Throwable;

    invoke-static {v1, v5, v3, v4}, Lva9;->c(LMb9;Ljava/lang/Class;Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, LMd9;->g(LMb9;)Z

    new-instance v1, LZx8;

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, LZx8;-><init>(Lxy8;ILCx8;)V

    new-instance v2, Lqx8;

    invoke-direct {v2, p0, v0, v1}, Lqx8;-><init>(Lxy8;LMd9;LZx8;)V

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lv39;->o(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v1

    :cond_2
    iget-object v0, p0, Lxy8;->f:LMd9;

    return-object v0
.end method

.method public final synthetic c(I)LMb9;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lxy8;->j(I)LMb9;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic d(ILjava/lang/Throwable;)LMb9;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lxy8;->j(I)LMb9;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic f(LMd9;LZx8;)V
    .locals 1

    :try_start_0
    invoke-static {p1}, Lva9;->l(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lxy8;->f:LMd9;

    invoke-virtual {v0, p1}, LMd9;->w(Ljava/lang/Object;)Z

    iget-object p1, p0, Lxy8;->f:LMd9;

    invoke-virtual {p2, p1}, LZx8;->g(LMb9;)Z

    return-void

    :catchall_0
    invoke-virtual {p2, p1}, LZx8;->g(LMb9;)Z

    return-void
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Lxy8;->f:LMd9;

    invoke-virtual {v0}, Lv39;->isDone()Z

    move-result v0

    return v0
.end method

.method public final j(I)LMb9;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "LMb9<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lxy8;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const/16 v2, 0x20

    ushr-long/2addr v0, v2

    long-to-int v0, v0

    if-le v0, p1, :cond_0

    invoke-static {}, Lva9;->d()LMb9;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lly8;

    invoke-direct {v0, p1}, Lly8;-><init>(I)V

    :cond_1
    iget-object v1, p0, Lxy8;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lly8;

    if-eqz v1, :cond_3

    invoke-static {v1}, Lly8;->D(Lly8;)I

    move-result v3

    if-gt v3, p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, Lva9;->d()LMb9;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    iget-object v3, p0, Lxy8;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v3, v1, v0}, Li24;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lxy8;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v3

    ushr-long v1, v3, v2

    long-to-int v1, v1

    if-le v1, p1, :cond_4

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lv39;->cancel(Z)Z

    iget-object p1, p0, Lxy8;->c:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Li24;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v0

    :cond_4
    iget-object p1, p0, Lxy8;->a:LOx8;

    invoke-static {p1}, LOx8;->a(LOx8;)Lc69;

    move-result-object p1

    iget-object v1, p0, Lxy8;->a:LOx8;

    invoke-static {v1}, LOx8;->b(LOx8;)Ljava/util/concurrent/Executor;

    move-result-object v1

    if-eqz p1, :cond_6

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    invoke-static {p1}, LKD8;->b(Lc69;)Lc69;

    move-result-object p1

    invoke-static {p1, v1}, Lva9;->i(Lc69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object p1

    invoke-virtual {v0, p1}, Lly8;->g(LMb9;)Z

    goto :goto_2

    :cond_6
    :goto_1
    iget-object p1, p0, Lxy8;->f:LMd9;

    invoke-virtual {v0, p1}, Lly8;->g(LMb9;)Z

    :goto_2
    return-object v0
.end method
