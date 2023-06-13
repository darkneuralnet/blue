.class public final LVL8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LV98;

.field public final synthetic c:LEM8;


# direct methods
.method public constructor <init>(LEM8;LV98;)V
    .locals 0

    iput-object p1, p0, LVL8;->c:LEM8;

    iput-object p2, p0, LVL8;->b:LV98;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LVL8;->c:LEM8;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LVL8;->c:LEM8;

    const/4 v2, 0x0

    invoke-static {v1, v2}, LEM8;->a(LEM8;Z)V

    iget-object v1, p0, LVL8;->c:LEM8;

    iget-object v1, v1, LEM8;->d:LQM8;

    invoke-virtual {v1}, LQM8;->w()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LVL8;->c:LEM8;

    iget-object v1, v1, LEM8;->d:LQM8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->n()Lec8;

    move-result-object v1

    const-string v2, "Connected to remote service"

    invoke-virtual {v1, v2}, Lec8;->a(Ljava/lang/String;)V

    iget-object v1, p0, LVL8;->c:LEM8;

    iget-object v1, v1, LEM8;->d:LQM8;

    iget-object v2, p0, LVL8;->b:LV98;

    invoke-virtual {v1, v2}, LQM8;->u(LV98;)V

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
