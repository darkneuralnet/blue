.class public LC73;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field public final b:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "LmI4<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final c:Lu73;

.field public final d:LY70;

.field public final e:LIM4;

.field public volatile f:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Lu73;LY70;LIM4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/BlockingQueue<",
            "LmI4<",
            "*>;>;",
            "Lu73;",
            "LY70;",
            "LIM4;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LC73;->f:Z

    iput-object p1, p0, LC73;->b:Ljava/util/concurrent/BlockingQueue;

    iput-object p2, p0, LC73;->c:Lu73;

    iput-object p3, p0, LC73;->d:LY70;

    iput-object p4, p0, LC73;->e:LIM4;

    return-void
.end method

.method private c()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    iget-object v0, p0, LC73;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LmI4;

    invoke-virtual {p0, v0}, LC73;->d(LmI4;)V

    return-void
.end method


# virtual methods
.method public final a(LmI4;)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LmI4<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p1}, LmI4;->getTrafficStatsTag()I

    move-result p1

    invoke-static {p1}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    return-void
.end method

.method public final b(LmI4;Lcom/android/volley/VolleyError;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LmI4<",
            "*>;",
            "Lcom/android/volley/VolleyError;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1, p2}, LmI4;->parseNetworkError(Lcom/android/volley/VolleyError;)Lcom/android/volley/VolleyError;

    move-result-object p2

    iget-object v0, p0, LC73;->e:LIM4;

    invoke-interface {v0, p1, p2}, LIM4;->b(LmI4;Lcom/android/volley/VolleyError;)V

    return-void
.end method

.method public d(LmI4;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LmI4<",
            "*>;)V"
        }
    .end annotation

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const/4 v2, 0x3

    invoke-virtual {p1, v2}, LmI4;->sendEvent(I)V

    const/4 v2, 0x4

    :try_start_0
    const-string v3, "network-queue-take"

    invoke-virtual {p1, v3}, LmI4;->addMarker(Ljava/lang/String;)V

    invoke-virtual {p1}, LmI4;->isCanceled()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "network-discard-cancelled"

    invoke-virtual {p1, v3}, LmI4;->finish(Ljava/lang/String;)V

    invoke-virtual {p1}, LmI4;->notifyListenerResponseNotUsable()V
    :try_end_0
    .catch Lcom/android/volley/VolleyError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v2}, LmI4;->sendEvent(I)V

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, LC73;->a(LmI4;)V

    iget-object v3, p0, LC73;->c:Lu73;

    invoke-interface {v3, p1}, Lu73;->a(LmI4;)LO73;

    move-result-object v3

    const-string v4, "network-http-complete"

    invoke-virtual {p1, v4}, LmI4;->addMarker(Ljava/lang/String;)V

    iget-boolean v4, v3, LO73;->e:Z

    if-eqz v4, :cond_1

    invoke-virtual {p1}, LmI4;->hasHadResponseDelivered()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v3, "not-modified"

    invoke-virtual {p1, v3}, LmI4;->finish(Ljava/lang/String;)V

    invoke-virtual {p1}, LmI4;->notifyListenerResponseNotUsable()V
    :try_end_1
    .catch Lcom/android/volley/VolleyError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1, v2}, LmI4;->sendEvent(I)V

    return-void

    :cond_1
    :try_start_2
    invoke-virtual {p1, v3}, LmI4;->parseNetworkResponse(LO73;)LEM4;

    move-result-object v3

    const-string v4, "network-parse-complete"

    invoke-virtual {p1, v4}, LmI4;->addMarker(Ljava/lang/String;)V

    invoke-virtual {p1}, LmI4;->shouldCache()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, v3, LEM4;->b:LY70$a;

    if-eqz v4, :cond_2

    iget-object v4, p0, LC73;->d:LY70;

    invoke-virtual {p1}, LmI4;->getCacheKey()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v3, LEM4;->b:LY70$a;

    invoke-interface {v4, v5, v6}, LY70;->e(Ljava/lang/String;LY70$a;)V

    const-string v4, "network-cache-written"

    invoke-virtual {p1, v4}, LmI4;->addMarker(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p1}, LmI4;->markDelivered()V

    iget-object v4, p0, LC73;->e:LIM4;

    invoke-interface {v4, p1, v3}, LIM4;->a(LmI4;LEM4;)V

    invoke-virtual {p1, v3}, LmI4;->notifyListenerResponseReceived(LEM4;)V
    :try_end_2
    .catch Lcom/android/volley/VolleyError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v3

    :try_start_3
    const-string v4, "Unhandled exception %s"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-static {v3, v4, v5}, LNu6;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v4, Lcom/android/volley/VolleyError;

    invoke-direct {v4, v3}, Lcom/android/volley/VolleyError;-><init>(Ljava/lang/Throwable;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    sub-long/2addr v5, v0

    invoke-virtual {v4, v5, v6}, Lcom/android/volley/VolleyError;->a(J)V

    iget-object v0, p0, LC73;->e:LIM4;

    invoke-interface {v0, p1, v4}, LIM4;->b(LmI4;Lcom/android/volley/VolleyError;)V

    invoke-virtual {p1}, LmI4;->notifyListenerResponseNotUsable()V

    goto :goto_0

    :catch_1
    move-exception v3

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    sub-long/2addr v4, v0

    invoke-virtual {v3, v4, v5}, Lcom/android/volley/VolleyError;->a(J)V

    invoke-virtual {p0, p1, v3}, LC73;->b(LmI4;Lcom/android/volley/VolleyError;)V

    invoke-virtual {p1}, LmI4;->notifyListenerResponseNotUsable()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    invoke-virtual {p1, v2}, LmI4;->sendEvent(I)V

    return-void

    :goto_1
    invoke-virtual {p1, v2}, LmI4;->sendEvent(I)V

    throw v0
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LC73;->f:Z

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public run()V
    .locals 2

    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    :goto_0
    :try_start_0
    invoke-direct {p0}, LC73;->c()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-boolean v0, p0, LC73;->f:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it"

    invoke-static {v1, v0}, LNu6;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
