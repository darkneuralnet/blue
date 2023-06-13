.class public final LvJ8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzaw;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:LhS7;

.field public final synthetic e:LQM8;


# direct methods
.method public constructor <init>(LQM8;Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;LhS7;)V
    .locals 0

    iput-object p1, p0, LvJ8;->e:LQM8;

    iput-object p2, p0, LvJ8;->b:Lcom/google/android/gms/measurement/internal/zzaw;

    iput-object p3, p0, LvJ8;->c:Ljava/lang/String;

    iput-object p4, p0, LvJ8;->d:LhS7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, LvJ8;->e:LQM8;

    invoke-static {v1}, LQM8;->H(LQM8;)LV98;

    move-result-object v2

    if-nez v2, :cond_0

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->o()Lec8;

    move-result-object v1

    const-string v2, "Discarding data. Failed to send event to service to bundle"

    invoke-virtual {v1, v2}, Lec8;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LvJ8;->e:LQM8;

    iget-object v1, v1, Lns8;->a:LPn8;

    :goto_0
    invoke-virtual {v1}, LPn8;->N()LOW8;

    move-result-object v1

    iget-object v2, p0, LvJ8;->d:LhS7;

    invoke-virtual {v1, v2, v0}, LOW8;->H(LhS7;[B)V

    return-void

    :cond_0
    :try_start_1
    iget-object v1, p0, LvJ8;->b:Lcom/google/android/gms/measurement/internal/zzaw;

    iget-object v3, p0, LvJ8;->c:Ljava/lang/String;

    invoke-interface {v2, v1, v3}, LV98;->X3(Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)[B

    move-result-object v0

    iget-object v1, p0, LvJ8;->e:LQM8;

    invoke-static {v1}, LQM8;->N(LQM8;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v1, p0, LvJ8;->e:LQM8;

    iget-object v1, v1, Lns8;->a:LPn8;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_2
    iget-object v2, p0, LvJ8;->e:LQM8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->o()Lec8;

    move-result-object v2

    const-string v3, "Failed to send event to the service to bundle"

    invoke-virtual {v2, v3, v1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v1, p0, LvJ8;->e:LQM8;

    iget-object v1, v1, Lns8;->a:LPn8;

    goto :goto_0

    :goto_1
    iget-object v2, p0, LvJ8;->e:LQM8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->N()LOW8;

    move-result-object v2

    iget-object v3, p0, LvJ8;->d:LhS7;

    invoke-virtual {v2, v3, v0}, LOW8;->H(LhS7;[B)V

    throw v1
.end method
