.class public final LCZ5;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;)LXY5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            ">(TResultT;)",
            "LXY5<",
            "TResultT;>;"
        }
    .end annotation

    new-instance v0, LzO6;

    invoke-direct {v0}, LzO6;-><init>()V

    invoke-virtual {v0, p0}, LzO6;->h(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static b(LXY5;)Ljava/lang/Object;
    .locals 2
    .param p0    # LXY5;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            ">(",
            "LXY5<",
            "TResultT;>;)TResultT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    const-string v0, "Task must not be null"

    invoke-static {p0, v0}, LMK6;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, LXY5;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LCZ5;->d(LXY5;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LEO6;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LEO6;-><init>([B)V

    invoke-static {p0, v0}, LCZ5;->e(LXY5;LEO6;)V

    invoke-virtual {v0}, LEO6;->a()V

    invoke-static {p0}, LCZ5;->d(LXY5;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/Exception;)LXY5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Exception;",
            ")",
            "LXY5<",
            "TResultT;>;"
        }
    .end annotation

    new-instance v0, LzO6;

    invoke-direct {v0}, LzO6;-><init>()V

    invoke-virtual {v0, p0}, LzO6;->j(Ljava/lang/Exception;)V

    return-object v0
.end method

.method public static d(LXY5;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            ">(",
            "LXY5<",
            "TResultT;>;)TResultT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    invoke-virtual {p0}, LXY5;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LXY5;->e()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p0}, LXY5;->d()Ljava/lang/Exception;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static e(LXY5;LEO6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXY5<",
            "*>;",
            "LEO6;",
            ")V"
        }
    .end annotation

    sget-object v0, LoZ5;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, LXY5;->c(Ljava/util/concurrent/Executor;Lnh3;)LXY5;

    invoke-virtual {p0, v0, p1}, LXY5;->b(Ljava/util/concurrent/Executor;LOg3;)LXY5;

    return-void
.end method
