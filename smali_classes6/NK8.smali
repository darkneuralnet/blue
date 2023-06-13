.class public final LNK8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/google/android/gms/measurement/internal/zzq;

.field public final synthetic f:LQM8;


# direct methods
.method public constructor <init>(LQM8;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 0

    iput-object p1, p0, LNK8;->f:LQM8;

    iput-object p2, p0, LNK8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, LNK8;->c:Ljava/lang/String;

    iput-object p5, p0, LNK8;->d:Ljava/lang/String;

    iput-object p6, p0, LNK8;->e:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, LNK8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, LNK8;->f:LQM8;

    invoke-static {v2}, LQM8;->H(LQM8;)LV98;

    move-result-object v3

    if-nez v3, :cond_0

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    const-string v3, "(legacy) Failed to get conditional properties; not connected to service"

    iget-object v4, p0, LNK8;->c:Ljava/lang/String;

    iget-object v5, p0, LNK8;->d:Ljava/lang/String;

    invoke-virtual {v2, v3, v1, v4, v5}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, p0, LNK8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, LNK8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :cond_0
    :try_start_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, LNK8;->e:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, LNK8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v4, p0, LNK8;->c:Ljava/lang/String;

    iget-object v5, p0, LNK8;->d:Ljava/lang/String;

    iget-object v6, p0, LNK8;->e:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-interface {v3, v4, v5, v6}, LV98;->t4(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzq;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v2, p0, LNK8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v4, p0, LNK8;->c:Ljava/lang/String;

    iget-object v5, p0, LNK8;->d:Ljava/lang/String;

    invoke-interface {v3, v1, v4, v5}, LV98;->Q0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :goto_0
    iget-object v2, p0, LNK8;->f:LQM8;

    invoke-static {v2}, LQM8;->N(LQM8;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v1, p0, LNK8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_3

    :catch_0
    move-exception v2

    :try_start_4
    iget-object v3, p0, LNK8;->f:LQM8;

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->o()Lec8;

    move-result-object v3

    const-string v4, "(legacy) Failed to get conditional properties; remote exception"

    iget-object v5, p0, LNK8;->c:Ljava/lang/String;

    invoke-virtual {v3, v4, v1, v5, v2}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, LNK8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v1, p0, LNK8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    goto :goto_1

    :goto_2
    monitor-exit v0

    return-void

    :goto_3
    iget-object v2, p0, LNK8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1
.end method
