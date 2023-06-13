.class public abstract LX69;
.super LFb9;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LFb9<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final d:Ljava/util/concurrent/Executor;

.field public final synthetic e:Le79;


# direct methods
.method public constructor <init>(Le79;Ljava/util/concurrent/Executor;)V
    .locals 0

    iput-object p1, p0, LX69;->e:Le79;

    invoke-direct {p0}, LFb9;-><init>()V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, LX69;->d:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, LX69;->e:Le79;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Le79;->T(Le79;LX69;)LX69;

    instance-of v0, p1, Ljava/util/concurrent/ExecutionException;

    if-eqz v0, :cond_0

    iget-object v0, p0, LX69;->e:Le79;

    check-cast p1, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lv39;->x(Ljava/lang/Throwable;)Z

    return-void

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_1

    iget-object p1, p0, LX69;->e:Le79;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lv39;->cancel(Z)Z

    return-void

    :cond_1
    iget-object v0, p0, LX69;->e:Le79;

    invoke-virtual {v0, p1}, Lv39;->x(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, LX69;->e:Le79;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Le79;->T(Le79;LX69;)LX69;

    invoke-virtual {p0, p1}, LX69;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, LX69;->e:Le79;

    invoke-virtual {v0}, Lv39;->isDone()Z

    move-result v0

    return v0
.end method

.method public abstract h(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public final i()V
    .locals 2

    :try_start_0
    iget-object v0, p0, LX69;->d:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, LX69;->e:Le79;

    invoke-virtual {v1, v0}, Lv39;->x(Ljava/lang/Throwable;)Z

    return-void
.end method
