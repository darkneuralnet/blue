.class public final LZK8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/google/android/gms/measurement/internal/zzq;

.field public final synthetic e:LhS7;

.field public final synthetic f:LQM8;


# direct methods
.method public constructor <init>(LQM8;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzq;LhS7;)V
    .locals 0

    iput-object p1, p0, LZK8;->f:LQM8;

    iput-object p2, p0, LZK8;->b:Ljava/lang/String;

    iput-object p3, p0, LZK8;->c:Ljava/lang/String;

    iput-object p4, p0, LZK8;->d:Lcom/google/android/gms/measurement/internal/zzq;

    iput-object p5, p0, LZK8;->e:LhS7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    iget-object v1, p0, LZK8;->f:LQM8;

    invoke-static {v1}, LQM8;->H(LQM8;)LV98;

    move-result-object v2

    if-nez v2, :cond_0

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->o()Lec8;

    move-result-object v1

    const-string v2, "Failed to get conditional properties; not connected to service"

    iget-object v3, p0, LZK8;->b:Ljava/lang/String;

    iget-object v4, p0, LZK8;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v4}, Lec8;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LZK8;->f:LQM8;

    iget-object v1, v1, Lns8;->a:LPn8;

    :goto_0
    invoke-virtual {v1}, LPn8;->N()LOW8;

    move-result-object v1

    iget-object v2, p0, LZK8;->e:LhS7;

    invoke-virtual {v1, v2, v0}, LOW8;->F(LhS7;Ljava/util/ArrayList;)V

    return-void

    :cond_0
    :try_start_1
    iget-object v1, p0, LZK8;->d:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, LZK8;->b:Ljava/lang/String;

    iget-object v3, p0, LZK8;->c:Ljava/lang/String;

    iget-object v4, p0, LZK8;->d:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-interface {v2, v1, v3, v4}, LV98;->t4(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzq;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, LOW8;->s(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, LZK8;->f:LQM8;

    invoke-static {v1}, LQM8;->N(LQM8;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v1, p0, LZK8;->f:LQM8;

    iget-object v1, v1, Lns8;->a:LPn8;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_2
    iget-object v2, p0, LZK8;->f:LQM8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    const-string v3, "Failed to get conditional properties; remote exception"

    iget-object v4, p0, LZK8;->b:Ljava/lang/String;

    iget-object v5, p0, LZK8;->c:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v5, v1}, Lec8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v1, p0, LZK8;->f:LQM8;

    iget-object v1, v1, Lns8;->a:LPn8;

    goto :goto_0

    :goto_1
    iget-object v2, p0, LZK8;->f:LQM8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->N()LOW8;

    move-result-object v2

    iget-object v3, p0, LZK8;->e:LhS7;

    invoke-virtual {v2, v3, v0}, LOW8;->F(LhS7;Ljava/util/ArrayList;)V

    throw v1
.end method
