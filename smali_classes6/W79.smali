.class public final LW79;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "LO79;",
        ">;",
        "Ljava/util/concurrent/Executor;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public b:Ll89;

.field public c:Ljava/util/concurrent/Executor;

.field public d:Ljava/lang/Runnable;

.field public e:Ljava/lang/Thread;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Ll89;Lt79;)V
    .locals 0

    sget-object p3, LO79;->b:LO79;

    invoke-direct {p0, p3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LW79;->c:Ljava/util/concurrent/Executor;

    iput-object p2, p0, LW79;->b:Ll89;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 4

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LO79;->c:LO79;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iput-object v2, p0, LW79;->c:Ljava/util/concurrent/Executor;

    iput-object v2, p0, LW79;->b:Ll89;

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, LW79;->e:Ljava/lang/Thread;

    :try_start_0
    iget-object v0, p0, LW79;->b:Ll89;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Ll89;->a(Ll89;)Ld89;

    move-result-object v0

    iget-object v1, v0, Ld89;->a:Ljava/lang/Thread;

    iget-object v3, p0, LW79;->e:Ljava/lang/Thread;

    if-ne v1, v3, :cond_2

    iput-object v2, p0, LW79;->b:Ll89;

    iget-object v1, v0, Ld89;->b:Ljava/lang/Runnable;

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, LyK8;->i(Z)V

    iput-object p1, v0, Ld89;->b:Ljava/lang/Runnable;

    iget-object p1, p0, LW79;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, Ld89;->c:Ljava/util/concurrent/Executor;

    iput-object v2, p0, LW79;->c:Ljava/util/concurrent/Executor;

    goto :goto_1

    :cond_2
    iget-object v0, p0, LW79;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v2, p0, LW79;->c:Ljava/util/concurrent/Executor;

    iput-object p1, p0, LW79;->d:Ljava/lang/Runnable;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    iput-object v2, p0, LW79;->e:Ljava/lang/Thread;

    return-void

    :catchall_0
    move-exception p1

    iput-object v2, p0, LW79;->e:Ljava/lang/Thread;

    throw p1
.end method

.method public final run()V
    .locals 7

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, LW79;->e:Ljava/lang/Thread;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    iget-object v0, p0, LW79;->d:Ljava/lang/Runnable;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v2, p0, LW79;->d:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    new-instance v1, Ld89;

    invoke-direct {v1, v2}, Ld89;-><init>(Lt79;)V

    iput-object v0, v1, Ld89;->a:Ljava/lang/Thread;

    iget-object v0, p0, LW79;->b:Ll89;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1}, Ll89;->b(Ll89;Ld89;)Ld89;

    iput-object v2, p0, LW79;->b:Ll89;

    :try_start_0
    iget-object v0, p0, LW79;->d:Ljava/lang/Runnable;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v2, p0, LW79;->d:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :goto_0
    iget-object v0, v1, Ld89;->b:Ljava/lang/Runnable;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    move v5, v3

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    iget-object v6, v1, Ld89;->c:Ljava/util/concurrent/Executor;

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    move v3, v4

    :goto_2
    and-int/2addr v3, v5

    if-eqz v3, :cond_3

    iput-object v2, v1, Ld89;->b:Ljava/lang/Runnable;

    iput-object v2, v1, Ld89;->c:Ljava/util/concurrent/Executor;

    invoke-interface {v6, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_3
    iput-object v2, v1, Ld89;->a:Ljava/lang/Thread;

    return-void

    :catchall_0
    move-exception v0

    iput-object v2, v1, Ld89;->a:Ljava/lang/Thread;

    throw v0
.end method
