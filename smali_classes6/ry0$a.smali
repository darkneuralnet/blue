.class public Lry0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lry0;-><init>(Ljava/lang/String;Lw41;Ljava/util/concurrent/ExecutorService;Lio/reactivex/E;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/E;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lry0;


# direct methods
.method public constructor <init>(Lry0;Lio/reactivex/E;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lry0$a;->d:Lry0;

    iput-object p2, p0, Lry0$a;->b:Lio/reactivex/E;

    iput-object p3, p0, Lry0$a;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    :goto_0
    iget-object v0, p0, Lry0$a;->d:Lry0;

    iget-boolean v0, v0, Lry0;->g:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lry0$a;->d:Lry0;

    iget-object v0, v0, Lry0;->e:Ldi3;

    invoke-virtual {v0}, Ldi3;->d()LYi1;

    move-result-object v0

    iget-object v2, v0, LYi1;->c:LYh3;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v2}, LOx2;->s(LYh3;)V

    invoke-static {v2}, LOx2;->q(LYh3;)V

    new-instance v5, Lfd4;

    invoke-direct {v5}, Lfd4;-><init>()V

    iget-object v6, p0, Lry0$a;->b:Lio/reactivex/E;

    invoke-virtual {v0, v5, v6}, LYi1;->b(Lfd4;Lio/reactivex/E;)V

    invoke-virtual {v5}, Lfd4;->a()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v2, v3, v4, v5, v6}, LOx2;->n(LYh3;JJ)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v2, p0, Lry0$a;->d:Lry0;

    monitor-enter v2

    :try_start_1
    iget-object v3, p0, Lry0$a;->d:Lry0;

    iget-boolean v3, v3, Lry0;->g:Z

    if-nez v3, :cond_0

    monitor-exit v2

    goto :goto_1

    :cond_0
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v2, "Error while processing connection operation queue"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Lye5;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_1
    :goto_1
    iget-object v0, p0, Lry0$a;->d:Lry0;

    invoke-virtual {v0}, Lry0;->d()V

    const-string v0, "Terminated (%s)"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lry0$a;->c:Ljava/lang/String;

    invoke-static {v3}, LOx2;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-static {v0, v2}, Lye5;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
