.class public final LBK8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzq;

.field public final synthetic c:Z

.field public final synthetic d:Lcom/google/android/gms/measurement/internal/zzac;

.field public final synthetic e:Lcom/google/android/gms/measurement/internal/zzac;

.field public final synthetic f:LQM8;


# direct methods
.method public constructor <init>(LQM8;ZLcom/google/android/gms/measurement/internal/zzq;ZLcom/google/android/gms/measurement/internal/zzac;Lcom/google/android/gms/measurement/internal/zzac;)V
    .locals 0

    iput-object p1, p0, LBK8;->f:LQM8;

    iput-object p3, p0, LBK8;->b:Lcom/google/android/gms/measurement/internal/zzq;

    iput-boolean p4, p0, LBK8;->c:Z

    iput-object p5, p0, LBK8;->d:Lcom/google/android/gms/measurement/internal/zzac;

    iput-object p6, p0, LBK8;->e:Lcom/google/android/gms/measurement/internal/zzac;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LBK8;->f:LQM8;

    invoke-static {v0}, LQM8;->H(LQM8;)LV98;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->o()Lec8;

    move-result-object v0

    const-string v1, "Discarding data. Failed to send conditional user property to service"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, LBK8;->b:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LBK8;->f:LQM8;

    iget-boolean v2, p0, LBK8;->c:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v2, p0, LBK8;->d:Lcom/google/android/gms/measurement/internal/zzac;

    :goto_0
    iget-object v3, p0, LBK8;->b:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-virtual {v0, v1, v2, v3}, LQM8;->o(LV98;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/measurement/internal/zzq;)V

    iget-object v0, p0, LBK8;->f:LQM8;

    invoke-static {v0}, LQM8;->N(LQM8;)V

    return-void
.end method
