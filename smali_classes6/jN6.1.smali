.class public final LjN6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LXY5;

.field public final synthetic c:LxN6;


# direct methods
.method public constructor <init>(LxN6;LXY5;)V
    .locals 0

    iput-object p1, p0, LjN6;->c:LxN6;

    iput-object p2, p0, LjN6;->b:LXY5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LjN6;->c:LxN6;

    invoke-static {v0}, LxN6;->b(LxN6;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LjN6;->c:LxN6;

    invoke-static {v1}, LxN6;->c(LxN6;)Lnh3;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LjN6;->c:LxN6;

    invoke-static {v1}, LxN6;->c(LxN6;)Lnh3;

    move-result-object v1

    iget-object v2, p0, LjN6;->b:LXY5;

    invoke-virtual {v2}, LXY5;->e()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Lnh3;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
