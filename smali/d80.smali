.class public Ld80;
.super Ljava/lang/Thread;
.source "SourceFile"


# static fields
.field public static final h:Z


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

.field public final c:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "LmI4<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final d:LY70;

.field public final e:LIM4;

.field public volatile f:Z

.field public final g:Ltw6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-boolean v0, LNu6;->b:Z

    sput-boolean v0, Ld80;->h:Z

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;LY70;LIM4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/BlockingQueue<",
            "LmI4<",
            "*>;>;",
            "Ljava/util/concurrent/BlockingQueue<",
            "LmI4<",
            "*>;>;",
            "LY70;",
            "LIM4;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld80;->f:Z

    iput-object p1, p0, Ld80;->b:Ljava/util/concurrent/BlockingQueue;

    iput-object p2, p0, Ld80;->c:Ljava/util/concurrent/BlockingQueue;

    iput-object p3, p0, Ld80;->d:LY70;

    iput-object p4, p0, Ld80;->e:LIM4;

    new-instance p1, Ltw6;

    invoke-direct {p1, p0, p2, p4}, Ltw6;-><init>(Ld80;Ljava/util/concurrent/BlockingQueue;LIM4;)V

    iput-object p1, p0, Ld80;->g:Ltw6;

    return-void
.end method

.method public static synthetic a(Ld80;)Ljava/util/concurrent/BlockingQueue;
    .locals 0

    iget-object p0, p0, Ld80;->c:Ljava/util/concurrent/BlockingQueue;

    return-object p0
.end method

.method private b()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    iget-object v0, p0, Ld80;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LmI4;

    invoke-virtual {p0, v0}, Ld80;->c(LmI4;)V

    return-void
.end method


# virtual methods
.method public c(LmI4;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LmI4<",
            "*>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    const-string v0, "cache-queue-take"

    invoke-virtual {p1, v0}, LmI4;->addMarker(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LmI4;->sendEvent(I)V

    const/4 v1, 0x2

    :try_start_0
    invoke-virtual {p1}, LmI4;->isCanceled()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v0, "cache-discard-canceled"

    invoke-virtual {p1, v0}, LmI4;->finish(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v1}, LmI4;->sendEvent(I)V

    return-void

    :cond_0
    :try_start_1
    iget-object v2, p0, Ld80;->d:LY70;

    invoke-virtual {p1}, LmI4;->getCacheKey()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, LY70;->get(Ljava/lang/String;)LY70$a;

    move-result-object v2

    if-nez v2, :cond_2

    const-string v0, "cache-miss"

    invoke-virtual {p1, v0}, LmI4;->addMarker(Ljava/lang/String;)V

    iget-object v0, p0, Ld80;->g:Ltw6;

    invoke-virtual {v0, p1}, Ltw6;->c(LmI4;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ld80;->c:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    invoke-virtual {p1, v1}, LmI4;->sendEvent(I)V

    return-void

    :cond_2
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, LY70$a;->b(J)Z

    move-result v5

    if-eqz v5, :cond_4

    const-string v0, "cache-hit-expired"

    invoke-virtual {p1, v0}, LmI4;->addMarker(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, LmI4;->setCacheEntry(LY70$a;)LmI4;

    iget-object v0, p0, Ld80;->g:Ltw6;

    invoke-virtual {v0, p1}, Ltw6;->c(LmI4;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Ld80;->c:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3
    invoke-virtual {p1, v1}, LmI4;->sendEvent(I)V

    return-void

    :cond_4
    :try_start_3
    const-string v5, "cache-hit"

    invoke-virtual {p1, v5}, LmI4;->addMarker(Ljava/lang/String;)V

    new-instance v5, LO73;

    iget-object v6, v2, LY70$a;->a:[B

    iget-object v7, v2, LY70$a;->g:Ljava/util/Map;

    invoke-direct {v5, v6, v7}, LO73;-><init>([BLjava/util/Map;)V

    invoke-virtual {p1, v5}, LmI4;->parseNetworkResponse(LO73;)LEM4;

    move-result-object v5

    const-string v6, "cache-hit-parsed"

    invoke-virtual {p1, v6}, LmI4;->addMarker(Ljava/lang/String;)V

    invoke-virtual {v5}, LEM4;->b()Z

    move-result v6

    if-nez v6, :cond_6

    const-string v2, "cache-parsing-failed"

    invoke-virtual {p1, v2}, LmI4;->addMarker(Ljava/lang/String;)V

    iget-object v2, p0, Ld80;->d:LY70;

    invoke-virtual {p1}, LmI4;->getCacheKey()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v0}, LY70;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LmI4;->setCacheEntry(LY70$a;)LmI4;

    iget-object v0, p0, Ld80;->g:Ltw6;

    invoke-virtual {v0, p1}, Ltw6;->c(LmI4;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Ld80;->c:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_5
    invoke-virtual {p1, v1}, LmI4;->sendEvent(I)V

    return-void

    :cond_6
    :try_start_4
    invoke-virtual {v2, v3, v4}, LY70$a;->c(J)Z

    move-result v3

    if-nez v3, :cond_7

    iget-object v0, p0, Ld80;->e:LIM4;

    invoke-interface {v0, p1, v5}, LIM4;->a(LmI4;LEM4;)V

    goto :goto_0

    :cond_7
    const-string v3, "cache-hit-refresh-needed"

    invoke-virtual {p1, v3}, LmI4;->addMarker(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, LmI4;->setCacheEntry(LY70$a;)LmI4;

    iput-boolean v0, v5, LEM4;->d:Z

    iget-object v0, p0, Ld80;->g:Ltw6;

    invoke-virtual {v0, p1}, Ltw6;->c(LmI4;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Ld80;->e:LIM4;

    new-instance v2, Ld80$a;

    invoke-direct {v2, p0, p1}, Ld80$a;-><init>(Ld80;LmI4;)V

    invoke-interface {v0, p1, v5, v2}, LIM4;->c(LmI4;LEM4;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_8
    iget-object v0, p0, Ld80;->e:LIM4;

    invoke-interface {v0, p1, v5}, LIM4;->a(LmI4;LEM4;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_0
    invoke-virtual {p1, v1}, LmI4;->sendEvent(I)V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1, v1}, LmI4;->sendEvent(I)V

    throw v0
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld80;->f:Z

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public run()V
    .locals 3

    sget-boolean v0, Ld80;->h:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "start new dispatcher"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, LNu6;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    iget-object v0, p0, Ld80;->d:LY70;

    invoke-interface {v0}, LY70;->c()V

    :goto_0
    :try_start_0
    invoke-direct {p0}, Ld80;->b()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-boolean v0, p0, Ld80;->f:Z

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void

    :cond_1
    const-string v0, "Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, LNu6;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
