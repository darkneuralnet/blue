.class public final LnI8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzq;

.field public final synthetic c:LhS7;

.field public final synthetic d:LQM8;


# direct methods
.method public constructor <init>(LQM8;Lcom/google/android/gms/measurement/internal/zzq;LhS7;)V
    .locals 0

    iput-object p1, p0, LnI8;->d:LQM8;

    iput-object p2, p0, LnI8;->b:Lcom/google/android/gms/measurement/internal/zzq;

    iput-object p3, p0, LnI8;->c:LhS7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const-string v0, "Failed to get app instance id"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, LnI8;->d:LQM8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->F()LIh8;

    move-result-object v2

    invoke-virtual {v2}, LIh8;->n()LXm7;

    move-result-object v2

    sget-object v3, Lcm7;->d:Lcm7;

    invoke-virtual {v2, v3}, LXm7;->i(Lcm7;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, LnI8;->d:LQM8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->u()Lec8;

    move-result-object v2

    const-string v3, "Analytics storage consent denied; will not get app instance id"

    invoke-virtual {v2, v3}, Lec8;->a(Ljava/lang/String;)V

    iget-object v2, p0, LnI8;->d:LQM8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->I()LRC8;

    move-result-object v2

    invoke-virtual {v2, v1}, LRC8;->B(Ljava/lang/String;)V

    iget-object v2, p0, LnI8;->d:LQM8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->F()LIh8;

    move-result-object v2

    iget-object v2, v2, LIh8;->g:Lsh8;

    invoke-virtual {v2, v1}, Lsh8;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LnI8;->d:LQM8;

    iget-object v0, v0, Lns8;->a:LPn8;

    :goto_0
    invoke-virtual {v0}, LPn8;->N()LOW8;

    move-result-object v0

    iget-object v2, p0, LnI8;->c:LhS7;

    invoke-virtual {v0, v2, v1}, LOW8;->K(LhS7;Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_1
    iget-object v2, p0, LnI8;->d:LQM8;

    invoke-static {v2}, LQM8;->H(LQM8;)LV98;

    move-result-object v3

    if-nez v3, :cond_1

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    invoke-virtual {v2, v0}, Lec8;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, LnI8;->d:LQM8;

    iget-object v0, v0, Lns8;->a:LPn8;

    goto :goto_0

    :cond_1
    :try_start_2
    iget-object v2, p0, LnI8;->b:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, LnI8;->b:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-interface {v3, v2}, LV98;->d4(Lcom/google/android/gms/measurement/internal/zzq;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, p0, LnI8;->d:LQM8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->I()LRC8;

    move-result-object v2

    invoke-virtual {v2, v1}, LRC8;->B(Ljava/lang/String;)V

    iget-object v2, p0, LnI8;->d:LQM8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->F()LIh8;

    move-result-object v2

    iget-object v2, v2, LIh8;->g:Lsh8;

    invoke-virtual {v2, v1}, Lsh8;->b(Ljava/lang/String;)V

    :cond_2
    iget-object v2, p0, LnI8;->d:LQM8;

    invoke-static {v2}, LQM8;->N(LQM8;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, LnI8;->d:LQM8;

    iget-object v0, v0, Lns8;->a:LPn8;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v2

    :try_start_3
    iget-object v3, p0, LnI8;->d:LQM8;

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->a()LFc8;

    move-result-object v3

    invoke-virtual {v3}, LFc8;->o()Lec8;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v0, p0, LnI8;->d:LQM8;

    iget-object v0, v0, Lns8;->a:LPn8;

    goto :goto_0

    :goto_1
    iget-object v2, p0, LnI8;->d:LQM8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->N()LOW8;

    move-result-object v2

    iget-object v3, p0, LnI8;->c:LhS7;

    invoke-virtual {v2, v3, v1}, LOW8;->K(LhS7;Ljava/lang/String;)V

    throw v0
.end method
