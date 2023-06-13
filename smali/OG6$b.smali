.class public LOG6$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LOG6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final b:LOG6;

.field public final c:LTC6;


# direct methods
.method public constructor <init>(LOG6;LTC6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOG6$b;->b:LOG6;

    iput-object p2, p0, LOG6$b;->c:LTC6;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, LOG6$b;->b:LOG6;

    iget-object v0, v0, LOG6;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LOG6$b;->b:LOG6;

    iget-object v1, v1, LOG6;->b:Ljava/util/Map;

    iget-object v2, p0, LOG6$b;->c:LTC6;

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LOG6$b;

    if-eqz v1, :cond_0

    iget-object v1, p0, LOG6$b;->b:LOG6;

    iget-object v1, v1, LOG6;->c:Ljava/util/Map;

    iget-object v2, p0, LOG6$b;->c:LTC6;

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LOG6$a;

    if-eqz v1, :cond_1

    iget-object v2, p0, LOG6$b;->c:LTC6;

    invoke-interface {v1, v2}, LOG6$a;->b(LTC6;)V

    goto :goto_0

    :cond_0
    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v1

    const-string v2, "WrkTimerRunnable"

    const-string v3, "Timer with %s is already marked as complete."

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, LOG6$b;->c:LTC6;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
