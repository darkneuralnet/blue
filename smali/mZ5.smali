.class public interface abstract LmZ5;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1

    invoke-interface {p0}, LmZ5;->c()LRs5;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public abstract b()Ljava/util/concurrent/Executor;
.end method

.method public abstract c()LRs5;
.end method
