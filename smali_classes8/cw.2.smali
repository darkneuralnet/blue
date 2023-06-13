.class public final Lcw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements LJY3;


# instance fields
.field public final b:LfQ3;

.field public final c:LBg1;

.field public volatile d:Z


# direct methods
.method public constructor <init>(LBg1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcw;->c:LBg1;

    new-instance p1, LfQ3;

    invoke-direct {p1}, LfQ3;-><init>()V

    iput-object p1, p0, Lcw;->b:LfQ3;

    return-void
.end method


# virtual methods
.method public a(LpT5;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1, p2}, LeQ3;->a(LpT5;Ljava/lang/Object;)LeQ3;

    move-result-object p1

    monitor-enter p0

    :try_start_0
    iget-object p2, p0, Lcw;->b:LfQ3;

    invoke-virtual {p2, p1}, LfQ3;->a(LeQ3;)V

    iget-boolean p1, p0, Lcw;->d:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcw;->d:Z

    iget-object p1, p0, Lcw;->c:LBg1;

    invoke-virtual {p1}, LBg1;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public run()V
    .locals 6

    :goto_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcw;->b:LfQ3;

    const/16 v2, 0x3e8

    invoke-virtual {v1, v2}, LfQ3;->c(I)LeQ3;

    move-result-object v1

    if-nez v1, :cond_1

    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lcw;->b:LfQ3;

    invoke-virtual {v1}, LfQ3;->b()LeQ3;

    move-result-object v1

    if-nez v1, :cond_0

    iput-boolean v0, p0, Lcw;->d:Z

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-boolean v0, p0, Lcw;->d:Z

    return-void

    :cond_0
    :try_start_2
    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception v1

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v1

    :cond_1
    :goto_1
    iget-object v2, p0, Lcw;->c:LBg1;

    invoke-virtual {v2, v1}, LBg1;->g(LeQ3;)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v1

    :try_start_4
    iget-object v2, p0, Lcw;->c:LBg1;

    invoke-virtual {v2}, LBg1;->e()Lyx2;

    move-result-object v2

    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " was interruppted"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4, v1}, Lyx2;->b(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    iput-boolean v0, p0, Lcw;->d:Z

    return-void

    :goto_2
    iput-boolean v0, p0, Lcw;->d:Z

    throw v1
.end method
