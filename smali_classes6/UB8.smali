.class public final LUB8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Ljava/io/Closeable;


# instance fields
.field public b:LPC8;

.field public c:LPC8;

.field public final d:Z

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(LPC8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUB8;->b:LPC8;

    iput-object p1, p0, LUB8;->c:LPC8;

    invoke-static {}, LQ48;->b()Z

    move-result p1

    iput-boolean p1, p0, LUB8;->d:Z

    return-void
.end method


# virtual methods
.method public final a(LMb9;)LMb9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            "T::",
            "LMb9<",
            "TV;>;>(TT;)TT;"
        }
    .end annotation

    iget-boolean v0, p0, LUB8;->e:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LUB8;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LUB8;->f:Z

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-interface {p1, p0, v0}, LMb9;->o(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Signal is already attached to future"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LUB8;->e:Z

    iget-boolean v0, p0, LUB8;->d:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LUB8;->f:Z

    if-nez v0, :cond_0

    invoke-static {}, LQ48;->b()Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LUB8;->b:LPC8;

    return-void
.end method

.method public final close()V
    .locals 3

    iget-object v0, p0, LUB8;->c:LPC8;

    const/4 v1, 0x0

    iput-object v1, p0, LUB8;->c:LPC8;

    :try_start_0
    iget-boolean v1, p0, LUB8;->f:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, LUB8;->e:Z

    if-nez v1, :cond_1

    invoke-virtual {p0}, LUB8;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-static {v0}, LFE8;->f(LPC8;)V

    return-void

    :cond_1
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Span was already closed!"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v1

    invoke-static {v0}, LFE8;->f(LPC8;)V

    throw v1
.end method

.method public final run()V
    .locals 2

    iget-boolean v0, p0, LUB8;->e:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LUB8;->f:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LUB8;->b()V

    return-void

    :cond_1
    :goto_0
    sget-object v0, LIB8;->b:LIB8;

    invoke-static {}, LQ48;->a()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
