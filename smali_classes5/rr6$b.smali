.class public Lrr6$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrr6;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/util/TimerTask;

.field public final synthetic c:Lrr6;


# direct methods
.method public constructor <init>(Lrr6;Ljava/util/TimerTask;)V
    .locals 0

    iput-object p1, p0, Lrr6$b;->c:Lrr6;

    iput-object p2, p0, Lrr6$b;->b:Ljava/util/TimerTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lrr6$b;->c:Lrr6;

    invoke-static {v0}, Lrr6;->e(Lrr6;)Ljava/util/Timer;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lrr6$b;->c:Lrr6;

    invoke-static {v0}, Lrr6;->e(Lrr6;)Ljava/util/Timer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :cond_1
    iget-object v0, p0, Lrr6$b;->c:Lrr6;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lrr6;->h(Lrr6;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lrr6$b;->c:Lrr6;

    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    invoke-static {v0, v1}, Lrr6;->f(Lrr6;Ljava/util/Timer;)Ljava/util/Timer;

    iget-object v0, p0, Lrr6$b;->c:Lrr6;

    invoke-static {v0}, Lrr6;->e(Lrr6;)Ljava/util/Timer;

    move-result-object v1

    iget-object v2, p0, Lrr6$b;->b:Ljava/util/TimerTask;

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x3e8

    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;JJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_1
    invoke-static {}, Lrr6;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Error scheduling indexing job"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    return-void

    :goto_1
    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
