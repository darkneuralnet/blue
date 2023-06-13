.class public LFd1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFd1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final b:LZL4;

.field public final synthetic c:LFd1;


# direct methods
.method public constructor <init>(LFd1;LZL4;)V
    .locals 0

    iput-object p1, p0, LFd1$b;->c:LFd1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LFd1$b;->b:LZL4;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, LFd1$b;->b:LZL4;

    invoke-interface {v0}, LZL4;->g()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LFd1$b;->c:LFd1;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, LFd1$b;->c:LFd1;

    iget-object v2, v2, LFd1;->b:LFd1$e;

    iget-object v3, p0, LFd1$b;->b:LZL4;

    invoke-virtual {v2, v3}, LFd1$e;->b(LZL4;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, LFd1$b;->c:LFd1;

    iget-object v2, v2, LFd1;->w:LJd1;

    invoke-virtual {v2}, LJd1;->c()V

    iget-object v2, p0, LFd1$b;->c:LFd1;

    iget-object v3, p0, LFd1$b;->b:LZL4;

    invoke-virtual {v2, v3}, LFd1;->g(LZL4;)V

    iget-object v2, p0, LFd1$b;->c:LFd1;

    iget-object v3, p0, LFd1$b;->b:LZL4;

    invoke-virtual {v2, v3}, LFd1;->r(LZL4;)V

    :cond_0
    iget-object v2, p0, LFd1$b;->c:LFd1;

    invoke-virtual {v2}, LFd1;->i()V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_0
    move-exception v2

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method
