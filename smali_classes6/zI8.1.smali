.class public final LzI8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzq;

.field public final synthetic c:LQM8;


# direct methods
.method public constructor <init>(LQM8;Lcom/google/android/gms/measurement/internal/zzq;)V
    .locals 0

    iput-object p1, p0, LzI8;->c:LQM8;

    iput-object p2, p0, LzI8;->b:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LzI8;->c:LQM8;

    invoke-static {v0}, LQM8;->H(LQM8;)LV98;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->o()Lec8;

    move-result-object v0

    const-string v1, "Discarding data. Failed to send app launch"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, LzI8;->b:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LzI8;->b:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-interface {v1, v0}, LV98;->a0(Lcom/google/android/gms/measurement/internal/zzq;)V

    iget-object v0, p0, LzI8;->c:LQM8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->B()LOa8;

    move-result-object v0

    invoke-virtual {v0}, LOa8;->q()Z

    iget-object v0, p0, LzI8;->c:LQM8;

    iget-object v2, p0, LzI8;->b:Lcom/google/android/gms/measurement/internal/zzq;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, LQM8;->o(LV98;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/measurement/internal/zzq;)V

    iget-object v0, p0, LzI8;->c:LQM8;

    invoke-static {v0}, LQM8;->N(LQM8;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, LzI8;->c:LQM8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->o()Lec8;

    move-result-object v1

    const-string v2, "Failed to send app launch to the service"

    invoke-virtual {v1, v2, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
