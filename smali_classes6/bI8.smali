.class public final LbI8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Lcom/google/android/gms/measurement/internal/zzq;

.field public final synthetic d:LQM8;


# direct methods
.method public constructor <init>(LQM8;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 0

    iput-object p1, p0, LbI8;->d:LQM8;

    iput-object p2, p0, LbI8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, LbI8;->c:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LbI8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LbI8;->d:LQM8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->F()LIh8;

    move-result-object v1

    invoke-virtual {v1}, LIh8;->n()LXm7;

    move-result-object v1

    sget-object v2, Lcm7;->d:Lcm7;

    invoke-virtual {v1, v2}, LXm7;->i(Lcm7;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LbI8;->d:LQM8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->u()Lec8;

    move-result-object v1

    const-string v2, "Analytics storage consent denied; will not get app instance id"

    invoke-virtual {v1, v2}, Lec8;->a(Ljava/lang/String;)V

    iget-object v1, p0, LbI8;->d:LQM8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->I()LRC8;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, LRC8;->B(Ljava/lang/String;)V

    iget-object v1, p0, LbI8;->d:LQM8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->F()LIh8;

    move-result-object v1

    iget-object v1, v1, LIh8;->g:Lsh8;

    invoke-virtual {v1, v2}, Lsh8;->b(Ljava/lang/String;)V

    iget-object v1, p0, LbI8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, LbI8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :cond_0
    :try_start_2
    iget-object v1, p0, LbI8;->d:LQM8;

    invoke-static {v1}, LQM8;->H(LQM8;)LV98;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->o()Lec8;

    move-result-object v1

    const-string v2, "Failed to get app instance id"

    invoke-virtual {v1, v2}, Lec8;->a(Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v1, p0, LbI8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-void

    :cond_1
    :try_start_4
    iget-object v1, p0, LbI8;->c:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, LbI8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, LbI8;->c:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-interface {v2, v3}, LV98;->d4(Lcom/google/android/gms/measurement/internal/zzq;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v1, p0, LbI8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v2, p0, LbI8;->d:LQM8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->I()LRC8;

    move-result-object v2

    invoke-virtual {v2, v1}, LRC8;->B(Ljava/lang/String;)V

    iget-object v2, p0, LbI8;->d:LQM8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->F()LIh8;

    move-result-object v2

    iget-object v2, v2, LIh8;->g:Lsh8;

    invoke-virtual {v2, v1}, Lsh8;->b(Ljava/lang/String;)V

    :cond_2
    iget-object v1, p0, LbI8;->d:LQM8;

    invoke-static {v1}, LQM8;->N(LQM8;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v1, p0, LbI8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v1

    :try_start_6
    iget-object v2, p0, LbI8;->d:LQM8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    const-string v3, "Failed to get app instance id"

    invoke-virtual {v2, v3, v1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    iget-object v1, p0, LbI8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    goto :goto_0

    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    iget-object v2, p0, LbI8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    throw v1
.end method
