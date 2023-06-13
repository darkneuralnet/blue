.class public final LaX0;
.super LLg1;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u00c0\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\u0008\u0002\u00a2\u0006\u0004\u0008,\u0010 J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014J\u0008\u0010\u000c\u001a\u00020\u0005H\u0016J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00072\n\u0010\u000e\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0008\u0010\u0013\u001a\u00020\u0005H\u0016J\u0008\u0010\u0014\u001a\u00020\u0005H\u0002J\u0008\u0010\u0016\u001a\u00020\u0015H\u0002J\u0008\u0010\u0018\u001a\u00020\u0017H\u0002J\u0008\u0010\u0019\u001a\u00020\u0005H\u0002R\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u0012\u0004\u0008\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010&\u001a\u00020\u00158TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%R\u0014\u0010)\u001a\u00020\u00178BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(R\u0014\u0010+\u001a\u00020\u00178BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010(\u00a8\u0006-"
    }
    d2 = {
        "LaX0;",
        "LLg1;",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "task",
        "",
        "o0",
        "",
        "now",
        "LLg1$c;",
        "delayedTask",
        "j0",
        "shutdown",
        "timeMillis",
        "block",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "Lo51;",
        "t",
        "run",
        "J0",
        "Ljava/lang/Thread;",
        "D0",
        "",
        "I0",
        "C0",
        "i",
        "J",
        "KEEP_ALIVE_NANOS",
        "_thread",
        "Ljava/lang/Thread;",
        "get_thread$annotations",
        "()V",
        "",
        "debugStatus",
        "I",
        "i0",
        "()Ljava/lang/Thread;",
        "thread",
        "E0",
        "()Z",
        "isShutDown",
        "H0",
        "isShutdownRequested",
        "<init>",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field private static volatile _thread:Ljava/lang/Thread;

.field private static volatile debugStatus:I

.field public static final h:LaX0;

.field public static final i:J


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LaX0;

    invoke-direct {v0}, LaX0;-><init>()V

    sput-object v0, LaX0;->h:LaX0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LKg1;->X(LKg1;ZILjava/lang/Object;)V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3e8

    :try_start_0
    const-string v3, "kotlinx.coroutines.DefaultExecutor.keepAlive"

    invoke-static {v3, v1, v2}, Ljava/lang/Long;->getLong(Ljava/lang/String;J)Ljava/lang/Long;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, LaX0;->i:J

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LLg1;-><init>()V

    return-void
.end method


# virtual methods
.method public final declared-synchronized C0()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, LaX0;->H0()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x3

    :try_start_1
    sput v0, LaX0;->debugStatus:I

    invoke-virtual {p0}, LLg1;->u0()V

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized D0()Ljava/lang/Thread;
    .locals 2

    monitor-enter p0

    :try_start_0
    sget-object v0, LaX0;->_thread:Ljava/lang/Thread;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/Thread;

    const-string v1, "kotlinx.coroutines.DefaultExecutor"

    invoke-direct {v0, p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    sput-object v0, LaX0;->_thread:Ljava/lang/Thread;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final E0()Z
    .locals 2

    sget v0, LaX0;->debugStatus:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final H0()Z
    .locals 2

    sget v0, LaX0;->debugStatus:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final declared-synchronized I0()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, LaX0;->H0()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    sput v0, LaX0;->debugStatus:I

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final J0()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/RejectedExecutionException;

    const-string v1, "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"

    invoke-direct {v0, v1}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i0()Ljava/lang/Thread;
    .locals 1

    sget-object v0, LaX0;->_thread:Ljava/lang/Thread;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LaX0;->D0()Ljava/lang/Thread;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public j0(JLLg1$c;)V
    .locals 0

    invoke-virtual {p0}, LaX0;->J0()V

    return-void
.end method

.method public o0(Ljava/lang/Runnable;)V
    .locals 1

    invoke-virtual {p0}, LaX0;->E0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LaX0;->J0()V

    :cond_0
    invoke-super {p0, p1}, LLg1;->o0(Ljava/lang/Runnable;)V

    return-void
.end method

.method public run()V
    .locals 12

    sget-object v0, Lx36;->a:Lx36;

    invoke-virtual {v0, p0}, Lx36;->d(LKg1;)V

    invoke-static {}, Lt1;->a()Ls1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ls1;->c()V

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, LaX0;->I0()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_3

    sput-object v0, LaX0;->_thread:Ljava/lang/Thread;

    invoke-virtual {p0}, LaX0;->C0()V

    invoke-static {}, Lt1;->a()Ls1;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ls1;->g()V

    :cond_1
    invoke-virtual {p0}, LLg1;->r0()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, LaX0;->i0()Ljava/lang/Thread;

    :cond_2
    return-void

    :cond_3
    const-wide v1, 0x7fffffffffffffffL

    move-wide v3, v1

    :cond_4
    :goto_0
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    invoke-virtual {p0}, LLg1;->c0()J

    move-result-wide v5

    cmp-long v7, v5, v1

    const-wide/16 v8, 0x0

    if-nez v7, :cond_a

    invoke-static {}, Lt1;->a()Ls1;

    move-result-object v7

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Ls1;->a()J

    move-result-wide v10

    goto :goto_1

    :cond_5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v10

    :goto_1
    cmp-long v7, v3, v1

    if-nez v7, :cond_6

    sget-wide v3, LaX0;->i:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-long/2addr v3, v10

    :cond_6
    sub-long v10, v3, v10

    cmp-long v7, v10, v8

    if-gtz v7, :cond_9

    sput-object v0, LaX0;->_thread:Ljava/lang/Thread;

    invoke-virtual {p0}, LaX0;->C0()V

    invoke-static {}, Lt1;->a()Ls1;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ls1;->g()V

    :cond_7
    invoke-virtual {p0}, LLg1;->r0()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p0}, LaX0;->i0()Ljava/lang/Thread;

    :cond_8
    return-void

    :cond_9
    :try_start_2
    invoke-static {v5, v6, v10, v11}, Lkotlin/ranges/RangesKt;->coerceAtMost(JJ)J

    move-result-wide v5

    goto :goto_2

    :cond_a
    move-wide v3, v1

    :goto_2
    cmp-long v7, v5, v8

    if-lez v7, :cond_4

    invoke-virtual {p0}, LaX0;->H0()Z

    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v7, :cond_d

    sput-object v0, LaX0;->_thread:Ljava/lang/Thread;

    invoke-virtual {p0}, LaX0;->C0()V

    invoke-static {}, Lt1;->a()Ls1;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ls1;->g()V

    :cond_b
    invoke-virtual {p0}, LLg1;->r0()Z

    move-result v0

    if-nez v0, :cond_c

    invoke-virtual {p0}, LaX0;->i0()Ljava/lang/Thread;

    :cond_c
    return-void

    :cond_d
    :try_start_3
    invoke-static {}, Lt1;->a()Ls1;

    move-result-object v7

    if-eqz v7, :cond_e

    invoke-virtual {v7, p0, v5, v6}, Ls1;->b(Ljava/lang/Object;J)V

    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_3

    :cond_e
    move-object v7, v0

    :goto_3
    if-nez v7, :cond_4

    invoke-static {p0, v5, v6}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    sput-object v0, LaX0;->_thread:Ljava/lang/Thread;

    invoke-virtual {p0}, LaX0;->C0()V

    invoke-static {}, Lt1;->a()Ls1;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Ls1;->g()V

    :cond_f
    invoke-virtual {p0}, LLg1;->r0()Z

    move-result v0

    if-nez v0, :cond_10

    invoke-virtual {p0}, LaX0;->i0()Ljava/lang/Thread;

    :cond_10
    throw v1
.end method

.method public shutdown()V
    .locals 1

    const/4 v0, 0x4

    sput v0, LaX0;->debugStatus:I

    invoke-super {p0}, LLg1;->shutdown()V

    return-void
.end method

.method public t(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lo51;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LLg1;->y0(JLjava/lang/Runnable;)Lo51;

    move-result-object p1

    return-object p1
.end method
